package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;

    public /* synthetic */ hh(wi wiVar, int i10) {
        this.a = i10;
        this.b = wiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G1;
        switch (this.a) {
            case 0:
                wi wiVar = this.b;
                ku kuVar = wiVar.c0 ? wiVar.P0 : wiVar.E0;
                wiVar.M1(kuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(kuVar.getText().toString().trim()));
                break;
            case 1:
                wi wiVar2 = this.b;
                nf nfVar = wiVar2.h0;
                long k10 = nfVar != null ? nfVar.k() : 0L;
                gi giVar = wiVar2.I0;
                wiVar2.N0 = k10;
                giVar.setEffect(k10);
                oi oiVar = wiVar2.y0;
                if (oiVar == wiVar2.j0 || oiVar == wiVar2.q0) {
                    G1 = wiVar2.G1(0, false, 0, wiVar2.s1(), k10);
                } else {
                    if (!oiVar.I(0, false, 0, wiVar2.s1(), k10)) {
                        wiVar2.dismiss();
                    }
                    G1 = false;
                }
                nf nfVar2 = wiVar2.h0;
                if (nfVar2 != null) {
                    nfVar2.h(!G1);
                    wiVar2.h0 = null;
                    break;
                }
                break;
            case 2:
                this.b.F1();
                break;
            default:
                wi.w(this.b);
                break;
        }
    }
}
