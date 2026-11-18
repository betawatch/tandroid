package bi;

import android.animation.ValueAnimator;
import hi.v9;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.lr;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o8(Object obj, int i7) {
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
                z8 z8Var = (z8) obj2;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.g3(new n8(z8Var, c10 == true ? 1 : 0));
                    break;
                }
                break;
            case 1:
                q10 q10Var = (q10) obj2;
                int i11 = ((f5.f) obj).a;
                boolean z10 = i11 == 0;
                String j3 = z10 ? null : org.telegram.messenger.r1.j(i11);
                org.telegram.messenger.a8.b("StarsController.buy onResult " + z10 + " " + j3);
                org.telegram.messenger.g0.g3(new di.p6(q10Var, z10, j3, i10));
                break;
            case 2:
                hi.l5.Y((v9) obj2, (Integer) obj);
                break;
            case 3:
                ((jg.m) obj2).S.T4(((Float) obj).floatValue());
                break;
            case 4:
                ki.t2 t2Var = (ki.t2) obj2;
                Float f10 = (Float) obj;
                t2Var.F.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(lr.f);
                    duration.addUpdateListener(new ki.s1(t2Var, 1));
                    duration.addListener(new ai.j0(t2Var, 29));
                    duration.start();
                    break;
                }
                break;
            case 5:
                ki.t3 t3Var = (ki.t3) obj2;
                Float f11 = (Float) obj;
                t3Var.J.setLoadProgressAnimated(f11.floatValue());
                if (f11.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(lr.f);
                    duration2.addUpdateListener(new ki.l3(t3Var, c11 == true ? 1 : 0));
                    duration2.addListener(new ki.n3(t3Var, 0));
                    duration2.start();
                    t3Var.Q();
                    break;
                }
                break;
            default:
                androidx.activity.n nVar = (androidx.activity.n) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (nVar.a) {
                    case 1:
                        v9 v9Var = (v9) nVar.d;
                        v9Var.F0(false);
                        sg.k0 k0Var = (sg.k0) nVar.c;
                        k0Var.h(intValue, true);
                        k0Var.g();
                        v9Var.setNewColor(intValue);
                        hi.s4 s4Var = v9Var.g1;
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
                        tg.d0 d0Var = vp0Var.q1;
                        d0Var.setSelectedColorIndex(k0Var2.d());
                        d0Var.getAdapter().f();
                        break;
                }
        }
    }
}
