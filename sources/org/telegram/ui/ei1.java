package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ ei1(wi1 wi1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = wi1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wi1 wi1Var = this.b;
                AndroidUtilities.runOnUIThread(new fi1(wi1Var, 8));
                int i10 = wi1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                wi1 wi1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new fi1(wi1Var2, 10));
                int i11 = wi1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
