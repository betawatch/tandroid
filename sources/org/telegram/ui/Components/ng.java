package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    public /* synthetic */ ng(bi biVar, int i3) {
        this.a = i3;
        this.b = biVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean u12;
        th thVar;
        am amVar;
        switch (this.a) {
            case 0:
                bi biVar = this.b;
                jt jtVar = biVar.U1 ? biVar.K2 : biVar.z2;
                biVar.B1(jtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(jtVar.getText().toString().trim()));
                break;
            case 1:
                bi biVar2 = this.b;
                biVar2.A0 = null;
                biVar2.B0 = 0;
                biVar2.K();
                break;
            case 2:
                bi biVar3 = this.b;
                se seVar = biVar3.Z1;
                long j10 = seVar != null ? seVar.j() : 0L;
                ih ihVar = biVar3.D2;
                biVar3.I2 = j10;
                ihVar.setEffect(j10);
                th thVar2 = biVar3.t2;
                if (thVar2 == biVar3.b2 || thVar2 == biVar3.i2) {
                    u12 = biVar3.u1(false, 0, 0, j10, biVar3.f1());
                } else {
                    if (!thVar2.L(false, 0, 0, j10, biVar3.f1())) {
                        biVar3.dismiss();
                    }
                    u12 = false;
                }
                se seVar2 = biVar3.Z1;
                if (seVar2 != null) {
                    seVar2.g(!u12);
                    biVar3.Z1 = null;
                    break;
                }
                break;
            case 3:
                bi biVar4 = this.b;
                biVar4.a(true);
                org.telegram.ui.ActionBar.d2 d2Var = biVar4.X1;
                if (d2Var != null) {
                    d2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.t1();
                break;
            default:
                bi biVar5 = this.b;
                biVar5.o3 = null;
                th thVar3 = biVar5.t2;
                if (thVar3 != biVar5.b2 && (thVar = biVar5.u2) != (amVar = biVar5.i2) && thVar3 != thVar && thVar3 != amVar) {
                    biVar5.b.removeView(thVar3);
                }
                biVar5.t2.setVisibility(8);
                biVar5.t2.t();
                biVar5.u2.I();
                biVar5.t2 = biVar5.u2;
                biVar5.u2 = null;
                int[] iArr = biVar5.W3;
                iArr[0] = iArr[1];
                biVar5.v1(biVar5.U1, false);
                biVar5.L1();
                break;
        }
    }
}
