package m4;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.is;
import v7.l8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements e1, f1, n2.l, d9.e, g2.g, b2, tv0, Utilities.Callback2Return, hh.i, zk0, hv0, iv0 {
    public final /* synthetic */ int a;

    public /* synthetic */ u0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 e(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // m4.e1
    public void a(k1 k1Var, r rVar, List list) {
        k1Var.v0(list);
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.b, new t0.a(10)));
    }

    @Override // org.telegram.ui.Components.iv0
    public void b(Object obj, float f7) {
        is isVar = (is) obj;
        switch (this.a) {
            case 25:
                isVar.b = f7;
                if (isVar.getParent() != null) {
                    ((View) isVar.getParent()).invalidate();
                    break;
                }
                break;
            case 26:
            default:
                isVar.d = f7;
                if (isVar.getParent() != null) {
                    ((View) isVar.getParent()).invalidate();
                    break;
                }
                break;
            case 27:
                isVar.c = f7;
                if (isVar.getParent() != null) {
                    ((View) isVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i10) {
        switch (this.a) {
            case 14:
                c2Var.dismiss();
                break;
            case 19:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
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

    @Override // org.telegram.ui.Components.hv0
    public float get(Object obj) {
        is isVar = (is) obj;
        switch (this.a) {
            case 24:
                return isVar.b;
            case 25:
            default:
                return isVar.d;
            case 26:
                return isVar.c;
        }
    }

    @Override // m4.f1
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 1:
                a0Var.getClass();
                throw new ClassCastException();
            case 2:
                a0Var.getClass();
                throw new ClassCastException();
            case 3:
                a0Var.getClass();
                throw new ClassCastException();
            case 4:
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
            case 17:
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
        this.a = 1;
    }

    public /* synthetic */ u0(String str, n nVar, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void l() {
    }

    @Override // n2.l
    public void release() {
    }
}
