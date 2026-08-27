package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((b8) this.b).P.setBufferedProgress(f10 / 1000.0f);
                break;
            case 1:
                ec ecVar = (ec) this.b;
                ecVar.o = (int) f10;
                ecVar.l();
                break;
            case 2:
                if (Math.abs(f10) > ((jb) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                gi giVar = (gi) ((hh.l3) this.b).d;
                yh yhVar = giVar.v0;
                if (yhVar == giVar.i0 || yhVar == giVar.j0 || (giVar.B && giVar.p1 != null)) {
                    giVar.a2(1);
                }
                giVar.v0.k(giVar.h2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) giVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((nb0) this.b).z();
                break;
        }
    }
}
