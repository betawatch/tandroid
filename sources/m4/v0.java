package m4;

import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ks;
import v7.q8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements e2.j, g1, n2.l, d9.k, z1, rw0, Utilities.Callback2Return, ih.h, zl0, fw0, gw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ v0(int i10) {
        this.a = i10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.a) {
            case 0:
                m1Var.stop();
                break;
            case 1:
                m1Var.c0();
                break;
            case 2:
                m1Var.G();
                break;
            case 3:
            default:
                m1Var.u();
                break;
            case 4:
                m1Var.b();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.n0.u(e9.s.x(qVar.Y.b, new t0.a(6)));
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        ks ksVar = (ks) obj;
        switch (this.a) {
            case 25:
                ksVar.b = f7;
                if (ksVar.getParent() != null) {
                    ((View) ksVar.getParent()).invalidate();
                    break;
                }
                break;
            case 26:
            default:
                ksVar.d = f7;
                if (ksVar.getParent() != null) {
                    ((View) ksVar.getParent()).invalidate();
                    break;
                }
                break;
            case 27:
                ksVar.c = f7;
                if (ksVar.getParent() != null) {
                    ((View) ksVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // m4.g1
    public Object c(e0 e0Var, v vVar, int i10) {
        switch (this.a) {
            case 3:
                e0Var.getClass();
                throw new ClassCastException();
            case 4:
            case 6:
            default:
                pb.a aVar = e0Var.e;
                e0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
            case 5:
                e0Var.getClass();
                throw new ClassCastException();
            case 7:
                e0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override // ih.h
    public void f(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(a2 a2Var, int i10) {
        switch (this.a) {
            case 15:
                a2Var.dismiss();
                break;
            case 19:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        ks ksVar = (ks) obj;
        switch (this.a) {
            case 24:
                return ksVar.b;
            case 25:
            default:
                return ksVar.d;
            case 26:
                return ksVar.c;
        }
    }

    @Override // org.telegram.ui.Components.rw0
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

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 18:
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

    public /* synthetic */ v0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ v0(String str, q qVar, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }

    @Override // n2.l
    public void release() {
    }
}
