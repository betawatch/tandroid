package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements o1.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((g8) this.b).P.setBufferedProgress(f9 / 1000.0f);
                break;
            case 1:
                mc mcVar = (mc) this.b;
                mcVar.o = (int) f9;
                mcVar.l();
                break;
            case 2:
                if (Math.abs(f9) > ((rb) this.b).getWidth()) {
                    iVar.c();
                    break;
                }
                break;
            case 3:
                ni niVar = (ni) ((jh.l3) this.b).d;
                fi fiVar = niVar.v0;
                if (fiVar == niVar.i0 || fiVar == niVar.j0 || (niVar.B && niVar.p1 != null)) {
                    niVar.a2(1);
                }
                niVar.v0.k(niVar.h2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) niVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((yb0) this.b).z();
                break;
        }
    }
}
