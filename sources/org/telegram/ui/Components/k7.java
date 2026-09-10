package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((j8) this.b).T.setBufferedProgress(f7 / 1000.0f);
                break;
            case 1:
                pc pcVar = (pc) this.b;
                pcVar.o = (int) f7;
                pcVar.l();
                break;
            case 2:
                if (Math.abs(f7) > ((tb) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                yi yiVar = (yi) ((ji) this.b).d;
                qi qiVar = yiVar.z0;
                if (qiVar == yiVar.m0 || qiVar == yiVar.n0 || (yiVar.F && yiVar.t1 != null)) {
                    yiVar.a2(1);
                }
                yiVar.z0.k(yiVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) yiVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((lc0) this.b).z();
                break;
        }
    }
}
