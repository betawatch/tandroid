package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;

    public /* synthetic */ jh(yi yiVar, int i10) {
        this.a = i10;
        this.b = yiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean J1;
        switch (this.a) {
            case 0:
                yi yiVar = this.b;
                zu zuVar = yiVar.c0 ? yiVar.S0 : yiVar.H0;
                yiVar.Q1(zuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(zuVar.getText().toString().trim()));
                break;
            case 1:
                yi.v(this.b);
                break;
            case 2:
                yi yiVar2 = this.b;
                pf pfVar = yiVar2.h0;
                long k10 = pfVar != null ? pfVar.k() : 0L;
                ii iiVar = yiVar2.L0;
                yiVar2.Q0 = k10;
                iiVar.setEffect(k10);
                qi qiVar = yiVar2.B0;
                if (qiVar == yiVar2.j0 || qiVar == yiVar2.q0) {
                    J1 = yiVar2.J1(0, false, 0, yiVar2.u1(), k10);
                } else {
                    if (!qiVar.K(0, false, 0, yiVar2.u1(), k10)) {
                        yiVar2.dismiss();
                    }
                    J1 = false;
                }
                pf pfVar2 = yiVar2.h0;
                if (pfVar2 != null) {
                    pfVar2.h(!J1);
                    yiVar2.h0 = null;
                    break;
                }
                break;
            case 3:
                this.b.I1();
                break;
            default:
                yi.z(this.b);
                break;
        }
    }
}
