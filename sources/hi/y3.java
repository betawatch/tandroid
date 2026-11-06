package hi;

import android.animation.AnimatorSet;
import bi.y4;
import java.util.LinkedList;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.xf;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y3 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.b;
                Runnable runnable = (Runnable) this.c;
                if (gVar == b4Var.G) {
                    b4Var.G = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = b4Var.E;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = b4Var.h;
                    if (f12 != -1.0f) {
                        boolean z10 = b4Var.s;
                        b4Var.s = true;
                        b4Var.setOffsetY(f12);
                        b4Var.h = -1.0f;
                        b4Var.s = z10;
                    }
                    b4Var.n = -2.14748365E9f;
                    break;
                }
                break;
            case 1:
                gb gbVar = (gb) this.b;
                xf xfVar = (xf) this.c;
                gbVar.setInOutOffset(0.0f);
                if (!z9) {
                    xfVar.run();
                    break;
                }
                break;
            case 2:
                di diVar = (di) this.b;
                ng ngVar = (ng) this.c;
                AnimatorSet animatorSet = diVar.z0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    ngVar.run();
                    break;
                }
                break;
            case 3:
                y4 y4Var = (y4) this.b;
                qg qgVar = (qg) this.c;
                di diVar2 = (di) y4Var.d;
                diVar2.t2.setTranslationY(0.0f);
                diVar2.t2.m(diVar2.f4);
                diVar2.X0.g();
                diVar2.b.invalidate();
                qgVar.run();
                diVar2.P1(0);
                break;
            default:
                ec0 ec0Var = (ec0) this.b;
                qa0 qa0Var = (qa0) this.c;
                LinkedList linkedList = ec0Var.U;
                ec0Var.T = null;
                qa0Var.D = null;
                qa0Var.y();
                if (!z9) {
                    qa0Var.h = 1.0f;
                    qa0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        ec0Var.V.poll();
                        break;
                    }
                }
                break;
        }
    }
}
