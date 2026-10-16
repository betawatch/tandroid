package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((m8) this.b).T.setBufferedProgress(f7 / 1000.0f);
                break;
            case 1:
                sc scVar = (sc) this.b;
                scVar.o = (int) f7;
                scVar.l();
                break;
            case 2:
                if (Math.abs(f7) > ((wb) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                vi viVar = (vi) ((gi) this.b).d;
                ni niVar = viVar.C0;
                if (niVar == viVar.m0 || niVar == viVar.n0 || (viVar.F && viVar.w1 != null)) {
                    viVar.e2(1);
                }
                viVar.C0.l(viVar.o2);
                viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                viewGroup.invalidate();
                break;
            case 4:
                cl clVar = (cl) this.b;
                clVar.j0 = f7;
                clVar.k0();
                break;
            default:
                ((cd0) this.b).z();
                break;
        }
    }
}
