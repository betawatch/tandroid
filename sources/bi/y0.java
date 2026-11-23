package bi;

import android.animation.AnimatorSet;
import java.util.LinkedList;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.za0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                kb kbVar = (kb) this.b;
                ng ngVar = (ng) this.c;
                kbVar.setInOutOffset(0.0f);
                if (!z10) {
                    ngVar.run();
                    break;
                }
                break;
            case 3:
                ti tiVar = (ti) this.b;
                fa faVar = (fa) this.c;
                AnimatorSet animatorSet = tiVar.A0;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    faVar.run();
                    break;
                }
                break;
            case 4:
                di.a4 a4Var = (di.a4) this.b;
                fh fhVar = (fh) this.c;
                ti tiVar2 = (ti) a4Var.d;
                tiVar2.x2.setTranslationY(0.0f);
                tiVar2.x2.m(tiVar2.j4);
                tiVar2.Y0.g();
                tiVar2.b.invalidate();
                fhVar.run();
                tiVar2.Q1(0);
                break;
            default:
                oc0 oc0Var = (oc0) this.b;
                za0 za0Var = (za0) this.c;
                LinkedList linkedList = oc0Var.V;
                oc0Var.U = null;
                za0Var.D = null;
                za0Var.y();
                if (!z10) {
                    za0Var.h = 1.0f;
                    za0Var.y();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        oc0Var.W.poll();
                        break;
                    }
                }
                break;
        }
    }
}
