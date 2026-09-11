package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;

    public /* synthetic */ hh(vi viVar, int i10) {
        this.a = i10;
        this.b = viVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean G1;
        switch (this.a) {
            case 0:
                vi viVar = this.b;
                hu huVar = viVar.c0 ? viVar.P0 : viVar.E0;
                viVar.M1(huVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(huVar.getText().toString().trim()));
                break;
            case 1:
                vi viVar2 = this.b;
                nf nfVar = viVar2.h0;
                long k10 = nfVar != null ? nfVar.k() : 0L;
                fi fiVar = viVar2.I0;
                viVar2.N0 = k10;
                fiVar.setEffect(k10);
                ni niVar = viVar2.y0;
                if (niVar == viVar2.j0 || niVar == viVar2.q0) {
                    G1 = viVar2.G1(0, false, 0, viVar2.s1(), k10);
                } else {
                    if (!niVar.I(0, false, 0, viVar2.s1(), k10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                }
                nf nfVar2 = viVar2.h0;
                if (nfVar2 != null) {
                    nfVar2.h(!G1);
                    viVar2.h0 = null;
                    break;
                }
                break;
            case 2:
                this.b.F1();
                break;
            default:
                vi.w(this.b);
                break;
        }
    }
}
