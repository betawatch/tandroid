package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi b;

    public /* synthetic */ mg(bi biVar, int i10) {
        this.a = i10;
        this.b = biVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean t12;
        uh uhVar;
        jm jmVar;
        switch (this.a) {
            case 0:
                bi biVar = this.b;
                wt wtVar = biVar.T1 ? biVar.J2 : biVar.y2;
                biVar.A1(wtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(wtVar.getText().toString().trim()));
                break;
            case 1:
                bi biVar2 = this.b;
                biVar2.z0 = null;
                biVar2.A0 = 0;
                biVar2.L();
                break;
            case 2:
                bi biVar3 = this.b;
                pe peVar = biVar3.Y1;
                long j10 = peVar != null ? peVar.j() : 0L;
                ih ihVar = biVar3.C2;
                biVar3.H2 = j10;
                ihVar.setEffect(j10);
                uh uhVar2 = biVar3.s2;
                if (uhVar2 == biVar3.a2 || uhVar2 == biVar3.h2) {
                    t12 = biVar3.t1(false, 0, 0, j10, biVar3.e1());
                } else {
                    if (!uhVar2.J(false, 0, 0, j10, biVar3.e1())) {
                        biVar3.dismiss();
                    }
                    t12 = false;
                }
                pe peVar2 = biVar3.Y1;
                if (peVar2 != null) {
                    peVar2.g(!t12);
                    biVar3.Y1 = null;
                    break;
                }
                break;
            case 3:
                bi biVar4 = this.b;
                biVar4.a(true);
                org.telegram.ui.ActionBar.k2 k2Var = biVar4.W1;
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.s1();
                break;
            default:
                bi biVar5 = this.b;
                biVar5.n3 = null;
                uh uhVar3 = biVar5.s2;
                if (uhVar3 != biVar5.a2 && (uhVar = biVar5.t2) != (jmVar = biVar5.h2) && uhVar3 != uhVar && uhVar3 != jmVar) {
                    biVar5.b.removeView(uhVar3);
                }
                biVar5.s2.setVisibility(8);
                biVar5.s2.s();
                biVar5.t2.H();
                biVar5.s2 = biVar5.t2;
                biVar5.t2 = null;
                int[] iArr = biVar5.V3;
                iArr[0] = iArr[1];
                biVar5.u1(biVar5.T1, false);
                biVar5.K1();
                break;
        }
    }
}
