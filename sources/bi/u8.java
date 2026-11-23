package bi;

import android.animation.ValueAnimator;
import hi.pa;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u8(Object obj, int i7) {
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
                f9 f9Var = (f9) obj2;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.g3(new t8(f9Var, c10 == true ? 1 : 0));
                    break;
                }
                break;
            case 1:
                p10 p10Var = (p10) obj2;
                int i11 = ((f5.f) obj).a;
                boolean z10 = i11 == 0;
                String j3 = z10 ? null : org.telegram.messenger.r1.j(i11);
                org.telegram.messenger.a8.b("StarsController.buy onResult " + z10 + " " + j3);
                org.telegram.messenger.g0.g3(new di.p6(p10Var, z10, j3, i10));
                break;
            case 2:
                hi.v5.X((pa) obj2, (Integer) obj);
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
                    duration.setInterpolator(kr.f);
                    duration.addUpdateListener(new ki.r1(t2Var, 1));
                    duration.addListener(new ai.g0(t2Var, 29));
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
                    duration2.setInterpolator(kr.f);
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
                        pa paVar = (pa) nVar.d;
                        paVar.I0(false);
                        sg.j0 j0Var = (sg.j0) nVar.c;
                        j0Var.h(intValue, true);
                        j0Var.g();
                        paVar.setNewColor(intValue);
                        hi.d5 d5Var = paVar.g1;
                        d5Var.setSelectedColorIndex(j0Var.d());
                        d5Var.getAdapter().f();
                        break;
                    default:
                        vp0 vp0Var = (vp0) nVar.d;
                        vp0Var.z0(false);
                        sg.j0 j0Var2 = vp0Var.F1;
                        j0Var2.h(intValue, true);
                        j0Var2.g();
                        vp0Var.setNewColor(intValue);
                        tg.i0 i0Var = vp0Var.q1;
                        i0Var.setSelectedColorIndex(j0Var2.d());
                        i0Var.getAdapter().f();
                        break;
                }
        }
    }
}
