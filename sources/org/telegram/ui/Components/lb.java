package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.LinkedList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                wd0 wd0Var = (wd0) this.b;
                ec0 ec0Var = (ec0) this.c;
                LinkedList linkedList = wd0Var.J;
                wd0Var.I = null;
                ec0Var.D = null;
                ec0Var.z();
                if (!z4) {
                    ec0Var.h = 1.0f;
                    ec0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        wd0Var.K.poll();
                        break;
                    }
                }
                break;
            default:
                rh.m3 m3Var = (rh.m3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (hVar == m3Var.D) {
                    m3Var.D = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = m3Var.B;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = m3Var.h;
                    if (f12 != -1.0f) {
                        boolean z10 = m3Var.s;
                        m3Var.s = true;
                        m3Var.setOffsetY(f12);
                        m3Var.h = -1.0f;
                        m3Var.s = z10;
                    }
                    m3Var.n = -2.14748365E9f;
                    break;
                }
                break;
        }
    }
}
