package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ru ruVar = tiVar.c0 ? tiVar.S0 : tiVar.H0;
                tiVar.U1(ruVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ruVar.getText().toString().trim()));
                break;
            case 1:
                ti.w(this.b);
                break;
            case 2:
                ti tiVar2 = this.b;
                mf mfVar = tiVar2.h0;
                long j10 = mfVar != null ? mfVar.j() : 0L;
                bi biVar = tiVar2.L0;
                tiVar2.Q0 = j10;
                biVar.setEffect(j10);
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
                ti tiVar3 = this.b;
                tiVar3.dismiss(true);
                org.telegram.ui.ActionBar.r2 r2Var = tiVar3.f0;
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.M1();
                break;
            default:
                ti.y(this.b);
                break;
        }
    }
}
