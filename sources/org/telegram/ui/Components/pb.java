package org.telegram.ui.Components;

import android.view.ViewGroup;
import java.util.LinkedList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pb(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                rb rbVar = (rb) this.b;
                ig igVar = (ig) this.c;
                rbVar.setInOutOffset(0.0f);
                if (!z10) {
                    igVar.run();
                    break;
                }
                break;
            case 1:
                ni.r((ni) this.b, (g) this.c);
                break;
            case 2:
                jh.l3 l3Var = (jh.l3) this.b;
                zg zgVar = (zg) this.c;
                ni niVar = (ni) l3Var.d;
                niVar.v0.setTranslationY(0.0f);
                niVar.v0.k(niVar.h2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                viewGroup.invalidate();
                zgVar.run();
                niVar.a2(0);
                break;
            case 3:
                nd0 nd0Var = (nd0) this.b;
                yb0 yb0Var = (yb0) this.c;
                LinkedList linkedList = nd0Var.I;
                nd0Var.H = null;
                yb0Var.D = null;
                yb0Var.z();
                if (!z10) {
                    yb0Var.h = 1.0f;
                    yb0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        nd0Var.J.poll();
                        break;
                    }
                }
                break;
            default:
                ph.m3 m3Var = (ph.m3) this.b;
                Runnable runnable = (Runnable) this.c;
                if (iVar == m3Var.C) {
                    m3Var.C = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = m3Var.A;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f11 = m3Var.h;
                    if (f11 != -1.0f) {
                        boolean z11 = m3Var.s;
                        m3Var.s = true;
                        m3Var.setOffsetY(f11);
                        m3Var.h = -1.0f;
                        m3Var.s = z11;
                    }
                    m3Var.n = -2.14748365E9f;
                    break;
                }
                break;
        }
    }
}
