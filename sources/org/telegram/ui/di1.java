package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ di1(ui1 ui1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = ui1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ui1 ui1Var = this.b;
                AndroidUtilities.runOnUIThread(new ei1(ui1Var, 8));
                int i10 = ui1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                ui1 ui1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new ei1(ui1Var2, 10));
                int i11 = ui1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
