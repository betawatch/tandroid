package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    public /* synthetic */ gh(ti tiVar, int i10) {
        this.a = i10;
        this.b = tiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean J1;
        switch (this.a) {
            case 0:
                ti tiVar = this.b;
                qu quVar = tiVar.c0 ? tiVar.S0 : tiVar.H0;
                tiVar.Q1(quVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(quVar.getText().toString().trim()));
                break;
            case 1:
                ti.v(this.b);
                break;
            case 2:
                ti tiVar2 = this.b;
                mf mfVar = tiVar2.h0;
                long k10 = mfVar != null ? mfVar.k() : 0L;
                ei eiVar = tiVar2.L0;
                tiVar2.Q0 = k10;
                eiVar.setEffect(k10);
                li liVar = tiVar2.B0;
                if (liVar == tiVar2.j0 || liVar == tiVar2.q0) {
                    J1 = tiVar2.J1(0, false, 0, tiVar2.u1(), k10);
                } else {
                    if (!liVar.K(0, false, 0, tiVar2.u1(), k10)) {
                        tiVar2.dismiss();
                    }
                    J1 = false;
                }
                mf mfVar2 = tiVar2.h0;
                if (mfVar2 != null) {
                    mfVar2.h(!J1);
                    tiVar2.h0 = null;
                    break;
                }
                break;
            case 3:
                this.b.I1();
                break;
            default:
                ti.z(this.b);
                break;
        }
    }
}
