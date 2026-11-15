package bi;

import android.animation.ValueAnimator;
import hi.u9;
import org.telegram.messenger.a8;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.er;
import org.telegram.ui.tp0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i7 = this.a;
        int i10 = 0;
        char c10 = 1;
        char c11 = 1;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                u6 u6Var = (u6) obj2;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.h3(new h6(u6Var, c10 == true ? 1 : 0));
                    break;
                }
                break;
            case 1:
                s10 s10Var = (s10) obj2;
                int i11 = ((f5.f) obj).a;
                boolean z10 = i11 == 0;
                String j3 = z10 ? null : org.telegram.messenger.r1.j(i11);
                a8.b("StarsController.buy onResult " + z10 + " " + j3);
                org.telegram.messenger.g0.h3(new di.m6(s10Var, z10, j3, i10));
                break;
            case 2:
                hi.m5.Y((u9) obj2, (Integer) obj);
                break;
            case 3:
                ((jg.m) obj2).S.L4(((Float) obj).floatValue());
                break;
            case 4:
                ki.x2 x2Var = (ki.x2) obj2;
                Float f10 = (Float) obj;
                x2Var.F.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(er.f);
                    duration.addUpdateListener(new ki.w1(x2Var, 1));
                    duration.addListener(new ai.j0(x2Var, 29));
                    duration.start();
                    break;
                }
                break;
            case 5:
                ki.y3 y3Var = (ki.y3) obj2;
                Float f11 = (Float) obj;
                y3Var.J.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(er.f);
                    duration2.addUpdateListener(new ki.q3(y3Var, c11 == true ? 1 : 0));
                    duration2.addListener(new ki.s3(y3Var, 0));
                    duration2.start();
                    y3Var.Q();
                    break;
                }
                break;
            default:
                androidx.activity.n nVar = (androidx.activity.n) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (nVar.a) {
                    case 1:
                        u9 u9Var = (u9) nVar.d;
                        u9Var.F0(false);
                        sg.k0 k0Var = (sg.k0) nVar.c;
                        k0Var.h(intValue, true);
                        k0Var.g();
                        u9Var.setNewColor(intValue);
                        hi.u4 u4Var = u9Var.g1;
                        u4Var.setSelectedColorIndex(k0Var.d());
                        u4Var.getAdapter().f();
                        break;
                    default:
                        tp0 tp0Var = (tp0) nVar.d;
                        tp0Var.w0(false);
                        sg.k0 k0Var2 = tp0Var.F1;
                        k0Var2.h(intValue, true);
                        k0Var2.g();
                        tp0Var.setNewColor(intValue);
                        tg.d0 d0Var = tp0Var.q1;
                        d0Var.setSelectedColorIndex(k0Var2.d());
                        d0Var.getAdapter().f();
                        break;
                }
        }
    }
}
