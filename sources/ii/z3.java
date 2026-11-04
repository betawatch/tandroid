package ii;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.e7;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.zb0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z3(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                c4 c4Var = (c4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (gVar == c4Var.H) {
                    c4Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = c4Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = c4Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = c4Var.s;
                        c4Var.s = true;
                        c4Var.setOffsetY(f12);
                        c4Var.h = -1.0f;
                        c4Var.s = z11;
                    }
                    c4Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 1:
                fb fbVar = (fb) this.b;
                vf vfVar = (vf) this.c;
                fbVar.setInOutOffset(0.0f);
                if (!z10) {
                    vfVar.run();
                    break;
                }
                break;
            case 2:
                bi biVar = (bi) this.b;
                e7 e7Var = (e7) this.c;
                AnimatorSet animatorSet = biVar.A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    e7Var.run();
                    break;
                }
                break;
            case 3:
                ci.h4 h4Var = (ci.h4) this.b;
                ng ngVar = (ng) this.c;
                bi biVar2 = (bi) h4Var.d;
                biVar2.u2.setTranslationY(0.0f);
                biVar2.u2.m(biVar2.g4);
                biVar2.Y0.g();
                biVar2.b.invalidate();
                ngVar.run();
                biVar2.P1(0);
                break;
            default:
                zb0 zb0Var = (zb0) this.b;
                la0 la0Var = (la0) this.c;
                LinkedList linkedList = zb0Var.V;
                zb0Var.U = null;
                la0Var.D = null;
                la0Var.y();
                if (!z10) {
                    la0Var.h = 1.0f;
                    la0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        zb0Var.W.poll();
                        break;
                    }
                }
                break;
        }
    }
}
