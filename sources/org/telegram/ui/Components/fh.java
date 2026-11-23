package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    public /* synthetic */ fh(ti tiVar, int i7) {
        this.a = i7;
        this.b = tiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean v12;
        li liVar;
        pm pmVar;
        switch (this.a) {
            case 0:
                ti tiVar = this.b;
                wt wtVar = tiVar.X1 ? tiVar.N2 : tiVar.C2;
                tiVar.C1(wtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(wtVar.getText().toString().trim()));
                break;
            case 1:
                ti tiVar2 = this.b;
                tiVar2.A0 = null;
                tiVar2.B0 = 0;
                tiVar2.L();
                break;
            case 2:
                ti tiVar3 = this.b;
                ef efVar = tiVar3.c2;
                long k10 = efVar != null ? efVar.k() : 0L;
                bi biVar = tiVar3.G2;
                tiVar3.L2 = k10;
                biVar.setEffect(k10);
                li liVar2 = tiVar3.w2;
                if (liVar2 == tiVar3.e2 || liVar2 == tiVar3.l2) {
                    v12 = tiVar3.v1(false, 0, 0, k10, tiVar3.g1());
                } else {
                    if (!liVar2.M(false, 0, 0, k10, tiVar3.g1())) {
                        tiVar3.dismiss();
                    }
                    v12 = false;
                }
                ef efVar2 = tiVar3.c2;
                if (efVar2 != null) {
                    efVar2.h(!v12);
                    tiVar3.c2 = null;
                    break;
                }
                break;
            case 3:
                ti tiVar4 = this.b;
                tiVar4.a(true);
                org.telegram.ui.ActionBar.g2 g2Var = tiVar4.a2;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.u1();
                break;
            default:
                ti tiVar5 = this.b;
                tiVar5.r3 = null;
                li liVar3 = tiVar5.w2;
                if (liVar3 != tiVar5.e2 && (liVar = tiVar5.x2) != (pmVar = tiVar5.l2) && liVar3 != liVar && liVar3 != pmVar) {
                    tiVar5.b.removeView(liVar3);
                }
                tiVar5.w2.setVisibility(8);
                tiVar5.w2.t();
                tiVar5.x2.I();
                tiVar5.w2 = tiVar5.x2;
                tiVar5.x2 = null;
                int[] iArr = tiVar5.Z3;
                iArr[0] = iArr[1];
                tiVar5.w1(tiVar5.X1, false);
                tiVar5.M1();
                break;
        }
    }
}
