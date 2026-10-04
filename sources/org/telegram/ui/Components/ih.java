package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi b;

    public /* synthetic */ ih(xi xiVar, int i10) {
        this.a = i10;
        this.b = xiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean D1;
        switch (this.a) {
            case 0:
                xi xiVar = this.b;
                mu muVar = xiVar.c0 ? xiVar.P0 : xiVar.E0;
                xiVar.J1(muVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(muVar.getText().toString().trim()));
                break;
            case 1:
                xi xiVar2 = this.b;
                of ofVar = xiVar2.h0;
                long k10 = ofVar != null ? ofVar.k() : 0L;
                ei eiVar = xiVar2.I0;
                xiVar2.N0 = k10;
                eiVar.setEffect(k10);
                pi piVar = xiVar2.y0;
                if (piVar == xiVar2.j0 || piVar == xiVar2.q0) {
                    D1 = xiVar2.D1(0, false, 0, xiVar2.p1(), k10);
                } else {
                    if (!piVar.G(0, false, 0, xiVar2.p1(), k10)) {
                        xiVar2.dismiss();
                    }
                    D1 = false;
                }
                of ofVar2 = xiVar2.h0;
                if (ofVar2 != null) {
                    ofVar2.h(!D1);
                    xiVar2.h0 = null;
                    break;
                }
                break;
            case 2:
                this.b.C1();
                break;
            default:
                xi.n(this.b);
                break;
        }
    }
}
