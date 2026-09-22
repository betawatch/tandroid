package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((h8) this.b).T.setBufferedProgress(f7 / 1000.0f);
                break;
            case 1:
                oc ocVar = (oc) this.b;
                ocVar.o = (int) f7;
                ocVar.l();
                break;
            case 2:
                if (Math.abs(f7) > ((sb) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                vi viVar = (vi) ((gi) this.b).d;
                ni niVar = viVar.z0;
                if (niVar == viVar.m0 || niVar == viVar.n0 || (viVar.F && viVar.t1 != null)) {
                    viVar.a2(1);
                }
                viVar.z0.k(viVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) viVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((cc0) this.b).z();
                break;
        }
    }
}
