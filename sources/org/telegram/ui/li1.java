package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class li1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ li1(cj1 cj1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = cj1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                cj1 cj1Var = this.b;
                AndroidUtilities.runOnUIThread(new mi1(cj1Var, 8));
                int i10 = cj1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                cj1 cj1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new mi1(cj1Var2, 10));
                int i11 = cj1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
