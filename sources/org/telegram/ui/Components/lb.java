package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.LinkedList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lb(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                nb nbVar = (nb) this.b;
                fg fgVar = (fg) this.c;
                nbVar.setInOutOffset(0.0f);
                if (!z4) {
                    fgVar.run();
                    break;
                }
                break;
            case 1:
                li.r((li) this.b, (lh.p6) this.c);
                break;
            case 2:
                lh.k3 k3Var = (lh.k3) this.b;
                wg wgVar = (wg) this.c;
                li liVar = (li) k3Var.d;
                liVar.w0.setTranslationY(0.0f);
                liVar.w0.k(liVar.i2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                viewGroup.invalidate();
                wgVar.run();
                liVar.a2(0);
                break;
            case 3:
                vd0 vd0Var = (vd0) this.b;
                dc0 dc0Var = (dc0) this.c;
                LinkedList linkedList = vd0Var.J;
                vd0Var.I = null;
                dc0Var.D = null;
                dc0Var.z();
                if (!z4) {
                    dc0Var.h = 1.0f;
                    dc0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        vd0Var.K.poll();
                        break;
                    }
                }
                break;
            default:
                rh.n3 n3Var = (rh.n3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == n3Var.D) {
                    n3Var.D = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = n3Var.B;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = n3Var.h;
                    if (f12 != -1.0f) {
                        boolean z10 = n3Var.s;
                        n3Var.s = true;
                        n3Var.setOffsetY(f12);
                        n3Var.h = -1.0f;
                        n3Var.s = z10;
                    }
                    n3Var.n = -2.14748365E9f;
                    break;
                }
                break;
        }
    }
}
