package bi;

import android.animation.ValueAnimator;
import hi.u9;
import org.telegram.messenger.r10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r8(Object obj, int i7) {
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
                c9 c9Var = (c9) obj2;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.g3(new q8(c9Var, c10 == true ? 1 : 0));
                    break;
                }
                break;
            case 1:
                r10 r10Var = (r10) obj2;
                int i11 = ((f5.f) obj).a;
                boolean z10 = i11 == 0;
                String j3 = z10 ? null : org.telegram.messenger.r1.j(i11);
                org.telegram.messenger.a8.b("StarsController.buy onResult " + z10 + " " + j3);
                org.telegram.messenger.g0.g3(new di.p6(r10Var, z10, j3, i10));
                break;
            case 2:
                hi.k5.Y((u9) obj2, (Integer) obj);
                break;
            case 3:
                ((jg.m) obj2).S.T4(((Float) obj).floatValue());
                break;
            case 4:
                ki.s2 s2Var = (ki.s2) obj2;
                Float f10 = (Float) obj;
                s2Var.F.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(nr.f);
                    duration.addUpdateListener(new ki.r1(s2Var, 1));
                    duration.addListener(new ai.k0(s2Var, 29));
                    duration.start();
                    break;
                }
                break;
            case 5:
                ki.s3 s3Var = (ki.s3) obj2;
                Float f11 = (Float) obj;
                s3Var.J.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(nr.f);
                    duration2.addUpdateListener(new ki.k3(s3Var, c11 == true ? 1 : 0));
                    duration2.addListener(new ki.m3(s3Var, 0));
                    duration2.start();
                    s3Var.Q();
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
                        hi.s4 s4Var = u9Var.g1;
                        s4Var.setSelectedColorIndex(k0Var.d());
                        s4Var.getAdapter().f();
                        break;
                    default:
                        vp0 vp0Var = (vp0) nVar.d;
                        vp0Var.w0(false);
                        sg.k0 k0Var2 = vp0Var.F1;
                        k0Var2.h(intValue, true);
                        k0Var2.g();
                        vp0Var.setNewColor(intValue);
                        tg.e0 e0Var = vp0Var.q1;
                        e0Var.setSelectedColorIndex(k0Var2.d());
                        e0Var.getAdapter().f();
                        break;
                }
        }
    }
}
