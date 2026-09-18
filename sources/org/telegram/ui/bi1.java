package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ si1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ bi1(si1 si1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = si1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                si1 si1Var = this.b;
                AndroidUtilities.runOnUIThread(new ci1(si1Var, 8));
                int i10 = si1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                si1 si1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new ci1(si1Var2, 10));
                int i11 = si1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
