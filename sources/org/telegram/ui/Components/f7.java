package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((c8) this.b).Q.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                ic icVar = (ic) this.b;
                icVar.o = (int) f10;
                icVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((nb) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                li liVar = (li) ((lh.k3) this.b).d;
                di diVar = liVar.w0;
                if (diVar == liVar.j0 || diVar == liVar.k0 || (liVar.C && liVar.q1 != null)) {
                    liVar.a2(1);
                }
                liVar.w0.k(liVar.i2);
                viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((ec0) this.b).z();
                break;
        }
    }
}
