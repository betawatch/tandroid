package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;

    public /* synthetic */ eh(si siVar, int i7) {
        this.a = i7;
        this.b = siVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean v12;
        ki kiVar;
        pm pmVar;
        switch (this.a) {
            case 0:
                si siVar = this.b;
                wt wtVar = siVar.X1 ? siVar.N2 : siVar.C2;
                siVar.C1(wtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(wtVar.getText().toString().trim()));
                break;
            case 1:
                si siVar2 = this.b;
                siVar2.A0 = null;
                siVar2.B0 = 0;
                siVar2.L();
                break;
            case 2:
                si siVar3 = this.b;
                df dfVar = siVar3.c2;
                long k10 = dfVar != null ? dfVar.k() : 0L;
                ai aiVar = siVar3.G2;
                siVar3.L2 = k10;
                aiVar.setEffect(k10);
                ki kiVar2 = siVar3.w2;
                if (kiVar2 == siVar3.e2 || kiVar2 == siVar3.l2) {
                    v12 = siVar3.v1(false, 0, 0, k10, siVar3.g1());
                } else {
                    if (!kiVar2.M(false, 0, 0, k10, siVar3.g1())) {
                        siVar3.dismiss();
                    }
                    v12 = false;
                }
                df dfVar2 = siVar3.c2;
                if (dfVar2 != null) {
                    dfVar2.h(!v12);
                    siVar3.c2 = null;
                    break;
                }
                break;
            case 3:
                si siVar4 = this.b;
                siVar4.a(true);
                org.telegram.ui.ActionBar.h2 h2Var = siVar4.a2;
                if (h2Var != null) {
                    h2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.u1();
                break;
            default:
                si siVar5 = this.b;
                siVar5.r3 = null;
                ki kiVar3 = siVar5.w2;
                if (kiVar3 != siVar5.e2 && (kiVar = siVar5.x2) != (pmVar = siVar5.l2) && kiVar3 != kiVar && kiVar3 != pmVar) {
                    siVar5.b.removeView(kiVar3);
                }
                siVar5.w2.setVisibility(8);
                siVar5.w2.t();
                siVar5.x2.J();
                siVar5.w2 = siVar5.x2;
                siVar5.x2 = null;
                int[] iArr = siVar5.Z3;
                iArr[0] = iArr[1];
                siVar5.w1(siVar5.X1, false);
                siVar5.M1();
                break;
        }
    }
}
