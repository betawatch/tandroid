package org.telegram.ui.Components;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        boolean N1;
        switch (this.a) {
            case 0:
                ti tiVar = this.b;
                qu quVar = tiVar.c0 ? tiVar.S0 : tiVar.H0;
                tiVar.U1(quVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(quVar.getText().toString().trim()));
                break;
            case 1:
                ti.u(this.b);
                break;
            case 2:
                ti tiVar2 = this.b;
                mf mfVar = tiVar2.h0;
                long j10 = mfVar != null ? mfVar.j() : 0L;
                ei eiVar = tiVar2.L0;
                tiVar2.Q0 = j10;
                eiVar.setEffect(j10);
                li liVar = tiVar2.B0;
                if (liVar == tiVar2.j0 || liVar == tiVar2.q0) {
                    N1 = tiVar2.N1(0, false, 0, tiVar2.x1(), j10);
                } else {
                    if (!liVar.K(0, false, 0, tiVar2.x1(), j10)) {
                        tiVar2.dismiss();
                    }
                    N1 = false;
                }
                mf mfVar2 = tiVar2.h0;
                if (mfVar2 != null) {
                    mfVar2.g(!N1);
                    tiVar2.h0 = null;
                    break;
                }
                break;
            case 3:
                this.b.M1();
                break;
            default:
                ti.y(this.b);
                break;
        }
    }
}
