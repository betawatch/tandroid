package ig;

import android.animation.ValueAnimator;
import org.telegram.messenger.f8;
import org.telegram.messenger.k20;
import org.telegram.messenger.u1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.cr0;
import org.telegram.ui.zj0;
import ph.g4;
import ph.w3;
import vh.b4;
import vh.n3;
import vh.s7;
import xh.c3;
import xh.j3;
import xh.m2;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        int i10 = this.a;
        int i11 = 1;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                androidx.activity.o oVar = (androidx.activity.o) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (oVar.a) {
                    case 3:
                        cr0 cr0Var = (cr0) oVar.d;
                        cr0Var.v0(false);
                        s0 s0Var = cr0Var.E1;
                        s0Var.h(intValue, true);
                        s0Var.g();
                        cr0Var.setNewColor(intValue);
                        jg.m0 m0Var = cr0Var.p1;
                        m0Var.setSelectedColorIndex(s0Var.d());
                        m0Var.getAdapter().f();
                        break;
                    default:
                        s7 s7Var = (s7) oVar.d;
                        s7Var.F0(false);
                        s0 s0Var2 = (s0) oVar.c;
                        s0Var2.h(intValue, true);
                        s0Var2.g();
                        s7Var.setNewColor(intValue);
                        n3 n3Var = s7Var.f1;
                        n3Var.setSelectedColorIndex(s0Var2.d());
                        n3Var.getAdapter().f();
                        break;
                }
            case 1:
                g4 g4Var = (g4) obj2;
                if (((c5.g) obj).a == 0) {
                    org.telegram.messenger.i0.g3(new w3(g4Var, i11));
                    break;
                }
                break;
            case 2:
                k20 k20Var = (k20) obj2;
                int i12 = ((c5.g) obj).a;
                boolean z10 = i12 == 0;
                String j10 = z10 ? null : u1.j(i12);
                f8.b("StarsController.buy onResult " + z10 + " " + j10);
                org.telegram.messenger.i0.g3(new zj0(k20Var, z10, j10, 14));
                break;
            case 3:
                b4.Y((s7) obj2, (Integer) obj);
                break;
            case 4:
                m2 m2Var = (m2) obj2;
                Float f7 = (Float) obj;
                m2Var.E.setLoadProgressAnimated(f7.floatValue());
                if (f7.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(gr.f);
                    duration.addUpdateListener(new xh.p1(m2Var, 1));
                    duration.addListener(new sg.r(m2Var, 24));
                    duration.start();
                    break;
                }
                break;
            case 5:
                j3 j3Var = (j3) obj2;
                Float f10 = (Float) obj;
                j3Var.I.setLoadProgressAnimated(f10.floatValue());
                if (f10.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(gr.f);
                    duration2.addUpdateListener(new c3(j3Var, 1));
                    duration2.addListener(new sg.r(j3Var, 25));
                    duration2.start();
                    j3Var.O();
                    break;
                }
                break;
            default:
                ((zf.m) obj2).R.L4(((Float) obj).floatValue());
                break;
        }
    }
}
