package m4;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.gs;
import v7.m8;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements e1, d1, n2.m, d9.e, g2.g, a2, dw0, Utilities.Callback2Return, hh.i, il0, rv0, sv0 {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 e(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // m4.d1
    public void a(j1 j1Var, r rVar, List list) {
        switch (this.a) {
            case 3:
                j1Var.v0(list);
                break;
            default:
                j1Var.v0(list);
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.b, new s0.b(18)));
    }

    @Override // org.telegram.ui.Components.sv0
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        gsVar.b = f7;
        if (gsVar.getParent() != null) {
            ((View) gsVar.getParent()).invalidate();
        }
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.Components.dw0
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

    @Override // org.telegram.ui.Components.rv0
    public float get(Object obj) {
        return ((gs) obj).b;
    }

    @Override // m4.e1
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 0:
                return a0Var.n(rVar);
            case 1:
                a0Var.getClass();
                throw new ClassCastException();
            case 2:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return m8.b(new p1(-6));
            case 3:
            case 4:
            default:
                na.d dVar2 = a0Var.e;
                a0Var.s(rVar);
                dVar2.getClass();
                return m8.b(new p1(-6));
            case 5:
                a0Var.getClass();
                throw new ClassCastException();
            case 6:
                a0Var.getClass();
                throw new ClassCastException();
            case 7:
                a0Var.getClass();
                throw new ClassCastException();
            case 8:
                a0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override // hh.i
    public void i(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(b2 b2Var, int i10) {
        switch (this.a) {
            case 18:
                b2Var.dismiss();
                break;
            case 23:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 21:
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

    public /* synthetic */ q0(int i10, Object obj, Object obj2) {
        this.a = i10;
    }

    public /* synthetic */ q0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ q0(String str, int i10, int i11, n nVar) {
        this.a = 5;
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void n() {
    }

    @Override // n2.m
    public void release() {
    }
}
