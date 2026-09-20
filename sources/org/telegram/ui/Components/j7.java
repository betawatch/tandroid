package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((i8) this.b).T.setBufferedProgress(f7 / 1000.0f);
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
                ((kc0) this.b).z();
                break;
        }
    }
}
