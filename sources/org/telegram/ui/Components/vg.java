package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    public /* synthetic */ vg(ki kiVar, int i7) {
        this.a = i7;
        this.b = kiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean u12;
        ci ciVar;
        im imVar;
        switch (this.a) {
            case 0:
                ki kiVar = this.b;
                rt rtVar = kiVar.X1 ? kiVar.N2 : kiVar.C2;
                kiVar.B1(rtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(rtVar.getText().toString().trim()));
                break;
            case 1:
                ki kiVar2 = this.b;
                kiVar2.A0 = null;
                kiVar2.B0 = 0;
                kiVar2.L();
                break;
            case 2:
                ki kiVar3 = this.b;
                ue ueVar = kiVar3.c2;
                long k10 = ueVar != null ? ueVar.k() : 0L;
                sh shVar = kiVar3.G2;
                kiVar3.L2 = k10;
                shVar.setEffect(k10);
                ci ciVar2 = kiVar3.w2;
                if (ciVar2 == kiVar3.e2 || ciVar2 == kiVar3.l2) {
                    u12 = kiVar3.u1(false, 0, 0, k10, kiVar3.f1());
                } else {
                    if (!ciVar2.M(false, 0, 0, k10, kiVar3.f1())) {
                        kiVar3.dismiss();
                    }
                    u12 = false;
                }
                ue ueVar2 = kiVar3.c2;
                if (ueVar2 != null) {
                    ueVar2.h(!u12);
                    kiVar3.c2 = null;
                    break;
                }
                break;
            case 3:
                ki kiVar4 = this.b;
                kiVar4.a(true);
                org.telegram.ui.ActionBar.e2 e2Var = kiVar4.a2;
                if (e2Var != null) {
                    e2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.t1();
                break;
            default:
                ki kiVar5 = this.b;
                kiVar5.r3 = null;
                ci ciVar3 = kiVar5.w2;
                if (ciVar3 != kiVar5.e2 && (ciVar = kiVar5.x2) != (imVar = kiVar5.l2) && ciVar3 != ciVar && ciVar3 != imVar) {
                    kiVar5.b.removeView(ciVar3);
                }
                kiVar5.w2.setVisibility(8);
                kiVar5.w2.t();
                kiVar5.x2.J();
                kiVar5.w2 = kiVar5.x2;
                kiVar5.x2 = null;
                int[] iArr = kiVar5.Z3;
                iArr[0] = iArr[1];
                kiVar5.v1(kiVar5.X1, false);
                kiVar5.L1();
                break;
        }
    }
}
