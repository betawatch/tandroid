package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((l8) this.b).T.setBufferedProgress(f7 / 1000.0f);
                break;
            case 1:
                tc tcVar = (tc) this.b;
                tcVar.o = (int) f7;
                tcVar.l();
                break;
            case 2:
                if (Math.abs(f7) > ((xb) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                yi yiVar = (yi) ((ji) this.b).d;
                qi qiVar = yiVar.C0;
                if (qiVar == yiVar.m0 || qiVar == yiVar.n0 || (yiVar.F && yiVar.w1 != null)) {
                    yiVar.e2(1);
                }
                yiVar.C0.l(yiVar.o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
                viewGroup.invalidate();
                break;
            case 4:
                gl glVar = (gl) this.b;
                glVar.j0 = f7;
                glVar.k0();
                break;
            default:
                ((cd0) this.b).z();
                break;
        }
    }
}
