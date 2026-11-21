package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;

    public /* synthetic */ gh(ui uiVar, int i7) {
        this.a = i7;
        this.b = uiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean v12;
        mi miVar;
        rm rmVar;
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                yt ytVar = uiVar.X1 ? uiVar.N2 : uiVar.C2;
                uiVar.C1(ytVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ytVar.getText().toString().trim()));
                break;
            case 1:
                ui uiVar2 = this.b;
                uiVar2.A0 = null;
                uiVar2.B0 = 0;
                uiVar2.L();
                break;
            case 2:
                ui uiVar3 = this.b;
                df dfVar = uiVar3.c2;
                long k10 = dfVar != null ? dfVar.k() : 0L;
                ci ciVar = uiVar3.G2;
                uiVar3.L2 = k10;
                ciVar.setEffect(k10);
                mi miVar2 = uiVar3.w2;
                if (miVar2 == uiVar3.e2 || miVar2 == uiVar3.l2) {
                    v12 = uiVar3.v1(false, 0, 0, k10, uiVar3.g1());
                } else {
                    if (!miVar2.M(false, 0, 0, k10, uiVar3.g1())) {
                        uiVar3.dismiss();
                    }
                    v12 = false;
                }
                df dfVar2 = uiVar3.c2;
                if (dfVar2 != null) {
                    dfVar2.h(!v12);
                    uiVar3.c2 = null;
                    break;
                }
                break;
            case 3:
                ui uiVar4 = this.b;
                uiVar4.a(true);
                org.telegram.ui.ActionBar.g2 g2Var = uiVar4.a2;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                this.b.u1();
                break;
            default:
                ui uiVar5 = this.b;
                uiVar5.r3 = null;
                mi miVar3 = uiVar5.w2;
                if (miVar3 != uiVar5.e2 && (miVar = uiVar5.x2) != (rmVar = uiVar5.l2) && miVar3 != miVar && miVar3 != rmVar) {
                    uiVar5.b.removeView(miVar3);
                }
                uiVar5.w2.setVisibility(8);
                uiVar5.w2.t();
                uiVar5.x2.J();
                uiVar5.w2 = uiVar5.x2;
                uiVar5.x2 = null;
                int[] iArr = uiVar5.Z3;
                iArr[0] = iArr[1];
                uiVar5.w1(uiVar5.X1, false);
                uiVar5.M1();
                break;
        }
    }
}
