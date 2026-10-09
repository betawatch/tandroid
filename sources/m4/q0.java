package m4;

import android.graphics.RectF;
import android.view.View;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.vw0;
import v7.j8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements e2.h, a1, z0, n2.l, d9.e, a2, vw0, Utilities.Callback2Return, hh.h, dm0 {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int i10) {
        this.a = i10;
    }

    @Override // m4.z0
    public void a(f1 f1Var, r rVar, List list) {
        switch (this.a) {
            case 3:
                f1Var.v0(list);
                break;
            default:
                f1Var.v0(list);
                break;
        }
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((f1) obj).F0();
                break;
            case 1:
                ((f1) obj).E0();
                break;
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            default:
                ((n2.j) obj).a();
                break;
            case 4:
                ((f1) obj).L();
                break;
            case 7:
                ((f1) obj).stop();
                break;
            case 9:
                ((f1) obj).b();
                break;
            case 10:
                ((f1) obj).H();
                break;
            case 12:
                ((f1) obj).v();
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.b, new s0.b(17)));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 22:
                b2Var.dismiss();
                break;
            case 26:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vw0
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

    @Override // m4.a1
    public Object h(b0 b0Var, r rVar, int i10) {
        switch (this.a) {
            case 2:
                na.d dVar = b0Var.e;
                b0Var.s(rVar);
                dVar.getClass();
                return j8.b(new l1(-6));
            case 6:
                b0Var.getClass();
                throw new ClassCastException();
            case 8:
                b0Var.getClass();
                throw new ClassCastException();
            case 11:
                b0Var.getClass();
                throw new ClassCastException();
            case 13:
                b0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = b0Var.e;
                b0Var.s(rVar);
                dVar2.getClass();
                return j8.b(new l1(-6));
        }
    }

    @Override // hh.h
    public void j(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return LocaleController.formatPluralString("MaximumReactionsValue", num.intValue(), new Object[0]);
        }
        return "" + num;
    }

    public /* synthetic */ q0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ q0(String str, int i10, int i11, n nVar) {
        this.a = 6;
    }

    public /* synthetic */ q0(String str, int i10, Object obj) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.vw0
    public /* synthetic */ void l() {
    }

    @Override // n2.l
    public void release() {
    }
}
