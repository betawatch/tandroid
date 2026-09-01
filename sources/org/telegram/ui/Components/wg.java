package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;

    public /* synthetic */ wg(mi miVar, int i10) {
        this.a = i10;
        this.b = miVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G1;
        switch (this.a) {
            case 0:
                mi miVar = this.b;
                fu fuVar = miVar.Z ? miVar.M0 : miVar.B0;
                miVar.M1(fuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fuVar.getText().toString().trim()));
                break;
            case 1:
                mi miVar2 = this.b;
                cf cfVar = miVar2.e0;
                long k10 = cfVar != null ? cfVar.k() : 0L;
                vh vhVar = miVar2.F0;
                miVar2.K0 = k10;
                vhVar.setEffect(k10);
                ei eiVar = miVar2.v0;
                if (eiVar == miVar2.g0 || eiVar == miVar2.n0) {
                    G1 = miVar2.G1(0, false, 0, miVar2.s1(), k10);
                } else {
                    if (!eiVar.H(0, false, 0, miVar2.s1(), k10)) {
                        miVar2.dismiss();
                    }
                    G1 = false;
                }
                cf cfVar2 = miVar2.e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    miVar2.e0 = null;
                    break;
                }
                break;
            case 2:
                this.b.F1();
                break;
            default:
                mi.w(this.b);
                break;
        }
    }
}
