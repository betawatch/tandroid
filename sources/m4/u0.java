package m4;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.gs;
import v7.l8;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements f1, n2.l, d9.e, g2.g, a2, sv0, Utilities.Callback2Return, hh.i, yk0, gv0, hv0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 d(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.b, new t0.a(9)));
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 24:
                gsVar.b = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 25:
            default:
                gsVar.d = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 26:
                gsVar.c = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 13:
                b2Var.dismiss();
                break;
            case 18:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 23:
                return gsVar.b;
            case 24:
            case 26:
            default:
                return gsVar.e;
            case 25:
                return gsVar.c;
            case 27:
                return gsVar.d;
        }
    }

    @Override // m4.f1
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 0:
                a0Var.getClass();
                throw new ClassCastException();
            case 1:
                a0Var.getClass();
                throw new ClassCastException();
            case 2:
                a0Var.getClass();
                throw new ClassCastException();
            case 3:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new q1(-6));
        }
    }

    @Override // hh.i
    public void j(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 16:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    public /* synthetic */ u0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ u0(String str, int i10, int i11, n nVar) {
        this.a = 0;
    }

    public /* synthetic */ u0(String str, n nVar, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
    }

    @Override // n2.l
    public void release() {
    }
}
