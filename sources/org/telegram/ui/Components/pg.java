package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci b;

    public /* synthetic */ pg(ci ciVar, int i7) {
        this.a = i7;
        this.b = ciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean u12;
        uh uhVar;
        am amVar;
        switch (this.a) {
            case 0:
                ci ciVar = this.b;
                kt ktVar = ciVar.W1 ? ciVar.M2 : ciVar.B2;
                ciVar.B1(ktVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ktVar.getText().toString().trim()));
                break;
            case 1:
                ci ciVar2 = this.b;
                ciVar2.z0 = null;
                ciVar2.A0 = 0;
                ciVar2.K();
                break;
            case 2:
                ci ciVar3 = this.b;
                te teVar = ciVar3.b2;
                long j3 = teVar != null ? teVar.j() : 0L;
                kh khVar = ciVar3.F2;
                ciVar3.K2 = j3;
                khVar.setEffect(j3);
                uh uhVar2 = ciVar3.v2;
                if (uhVar2 == ciVar3.d2 || uhVar2 == ciVar3.k2) {
                    u12 = ciVar3.u1(false, 0, 0, j3, ciVar3.f1());
                } else {
                    if (!uhVar2.L(false, 0, 0, j3, ciVar3.f1())) {
                        ciVar3.dismiss();
                    }
                    u12 = false;
                }
                te teVar2 = ciVar3.b2;
                if (teVar2 != null) {
                    teVar2.g(!u12);
                    ciVar3.b2 = null;
                    break;
                }
                break;
            case 3:
                ci ciVar4 = this.b;
                ciVar4.a(true);
                org.telegram.ui.ActionBar.f2 f2Var = ciVar4.Z1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.t1();
                break;
            default:
                ci ciVar5 = this.b;
                ciVar5.q3 = null;
                uh uhVar3 = ciVar5.v2;
                if (uhVar3 != ciVar5.d2 && (uhVar = ciVar5.w2) != (amVar = ciVar5.k2) && uhVar3 != uhVar && uhVar3 != amVar) {
                    ciVar5.b.removeView(uhVar3);
                }
                ciVar5.v2.setVisibility(8);
                ciVar5.v2.t();
                ciVar5.w2.I();
                ciVar5.v2 = ciVar5.w2;
                ciVar5.w2 = null;
                int[] iArr = ciVar5.Y3;
                iArr[0] = iArr[1];
                ciVar5.v1(ciVar5.W1, false);
                ciVar5.L1();
                break;
        }
    }
}
