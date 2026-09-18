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
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.gs;
import v7.l8;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements e1, d1, n2.m, d9.e, g2.g, a2, ew0, Utilities.Callback2Return, hh.i, jl0, sv0, tv0 {
    public final /* synthetic */ int a;

    public /* synthetic */ r0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 e(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // m4.d1
    public void a(j1 j1Var, r rVar, List list) {
        switch (this.a) {
            case 1:
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
        return e9.i0.v(e9.q.w(qVar.Y.b, new s9.b(12)));
    }

    @Override // org.telegram.ui.Components.tv0
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 27:
                gsVar.b = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
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
            case 16:
                b2Var.dismiss();
                break;
            case 21:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public float get(Object obj) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 26:
                return gsVar.b;
            default:
                return gsVar.c;
        }
    }

    @Override // org.telegram.ui.Components.ew0
    public void h(int i10) {
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

    @Override // m4.e1
    public Object i(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 0:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new p1(-6));
            case 1:
            case 2:
            default:
                na.d dVar2 = a0Var.e;
                a0Var.s(rVar);
                dVar2.getClass();
                return l8.b(new p1(-6));
            case 3:
                a0Var.getClass();
                throw new ClassCastException();
            case 4:
                a0Var.getClass();
                throw new ClassCastException();
            case 5:
                a0Var.getClass();
                throw new ClassCastException();
            case 6:
                a0Var.getClass();
                throw new ClassCastException();
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
            case 19:
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

    public /* synthetic */ r0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ r0(String str, int i10, int i11, n nVar) {
        this.a = 3;
    }

    public /* synthetic */ r0(String str, int i10, Object obj) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.ew0
    public /* synthetic */ void n() {
    }

    @Override // n2.m
    public void release() {
    }
}
