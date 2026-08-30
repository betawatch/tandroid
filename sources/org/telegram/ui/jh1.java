package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ jh1(ai1 ai1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = ai1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ai1 ai1Var = this.b;
                AndroidUtilities.runOnUIThread(new kh1(ai1Var, 8));
                int i10 = ai1Var.I;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                ai1 ai1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new kh1(ai1Var2, 10));
                int i11 = ai1Var2.I;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
