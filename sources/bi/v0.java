package bi;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                x0 x0Var = (x0) this.b;
                a3.f fVar = (a3.f) this.c;
                x0Var.b(0.0f);
                fVar.run();
                break;
            case 1:
                ki.s3 s3Var = (ki.s3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (gVar == s3Var.H) {
                    s3Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = s3Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = s3Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = s3Var.s;
                        s3Var.s = true;
                        s3Var.setOffsetY(f12);
                        s3Var.h = -1.0f;
                        s3Var.s = z11;
                    }
                    s3Var.n = -2.1474836E9f;
                    break;
                }
                break;
            case 2:
                lb lbVar = (lb) this.b;
                lg lgVar = (lg) this.c;
                lbVar.setInOutOffset(0.0f);
                if (!z10) {
                    lgVar.run();
                    break;
                }
                break;
            case 3:
                si siVar = (si) this.b;
                org.telegram.ui.Components.k7 k7Var = (org.telegram.ui.Components.k7) this.c;
                AnimatorSet animatorSet = siVar.A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    k7Var.run();
                    break;
                }
                break;
            case 4:
                di.a4 a4Var = (di.a4) this.b;
                eh ehVar = (eh) this.c;
                si siVar2 = (si) a4Var.d;
                siVar2.x2.setTranslationY(0.0f);
                siVar2.x2.m(siVar2.j4);
                siVar2.Y0.g();
                siVar2.b.invalidate();
                ehVar.run();
                siVar2.Q1(0);
                break;
            default:
                pc0 pc0Var = (pc0) this.b;
                bb0 bb0Var = (bb0) this.c;
                LinkedList linkedList = pc0Var.V;
                pc0Var.U = null;
                bb0Var.D = null;
                bb0Var.y();
                if (!z10) {
                    bb0Var.h = 1.0f;
                    bb0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        pc0Var.W.poll();
                        break;
                    }
                }
                break;
        }
    }
}
