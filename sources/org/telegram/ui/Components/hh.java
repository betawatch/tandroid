package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        boolean J1;
        switch (this.a) {
            case 0:
                vi viVar = this.b;
                vu vuVar = viVar.c0 ? viVar.S0 : viVar.H0;
                viVar.Q1(vuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(vuVar.getText().toString().trim()));
                break;
            case 1:
                vi.v(this.b);
                break;
            case 2:
                vi viVar2 = this.b;
                of ofVar = viVar2.h0;
                long k10 = ofVar != null ? ofVar.k() : 0L;
                fi fiVar = viVar2.L0;
                viVar2.Q0 = k10;
                fiVar.setEffect(k10);
                ni niVar = viVar2.B0;
                if (niVar == viVar2.j0 || niVar == viVar2.q0) {
                    J1 = viVar2.J1(0, false, 0, viVar2.u1(), k10);
                } else {
                    if (!niVar.K(0, false, 0, viVar2.u1(), k10)) {
                        viVar2.dismiss();
                    }
                    J1 = false;
                }
                of ofVar2 = viVar2.h0;
                if (ofVar2 != null) {
                    ofVar2.h(!J1);
                    viVar2.h0 = null;
                    break;
                }
                break;
            case 3:
                this.b.I1();
                break;
            default:
                vi.z(this.b);
                break;
        }
    }
}
