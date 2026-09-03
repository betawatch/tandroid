package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                mi miVar = (mi) ((mh.k3) this.b).d;
                ei eiVar = miVar.w0;
                if (eiVar == miVar.j0 || eiVar == miVar.k0 || (miVar.C && miVar.q1 != null)) {
                    miVar.a2(1);
                }
                miVar.w0.k(miVar.i2);
                viewGroup = ((org.telegram.ui.ActionBar.h3) miVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((fc0) this.b).z();
                break;
        }
    }
}
