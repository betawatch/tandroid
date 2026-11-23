package bi;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                a3.f fVar = (a3.f) this.c;
                b1Var.b(0.0f);
                fVar.run();
                break;
            case 1:
                ki.r3 r3Var = (ki.r3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (gVar == r3Var.H) {
                    r3Var.H = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = r3Var.F;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = r3Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = r3Var.s;
                        r3Var.s = true;
                        r3Var.setOffsetY(f12);
                        r3Var.h = -1.0f;
                        r3Var.s = z11;
                    }
                    r3Var.n = -2.1474836E9f;
                    break;
                }
                break;
            case 2:
                lb lbVar = (lb) this.b;
                og ogVar = (og) this.c;
                lbVar.setInOutOffset(0.0f);
                if (!z10) {
                    ogVar.run();
                    break;
                }
                break;
            case 3:
                ui uiVar = (ui) this.b;
                org.telegram.ui.Components.g gVar2 = (org.telegram.ui.Components.g) this.c;
                AnimatorSet animatorSet = uiVar.A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    gVar2.run();
                    break;
                }
                break;
            case 4:
                di.a4 a4Var = (di.a4) this.b;
                gh ghVar = (gh) this.c;
                ui uiVar2 = (ui) a4Var.d;
                uiVar2.x2.setTranslationY(0.0f);
                uiVar2.x2.m(uiVar2.j4);
                uiVar2.Y0.g();
                uiVar2.b.invalidate();
                ghVar.run();
                uiVar2.Q1(0);
                break;
            default:
                qc0 qc0Var = (qc0) this.b;
                cb0 cb0Var = (cb0) this.c;
                LinkedList linkedList = qc0Var.V;
                qc0Var.U = null;
                cb0Var.D = null;
                cb0Var.y();
                if (!z10) {
                    cb0Var.h = 1.0f;
                    cb0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        qc0Var.W.poll();
                        break;
                    }
                }
                break;
        }
    }
}
