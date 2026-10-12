package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ mi1(dj1 dj1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = dj1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                dj1 dj1Var = this.b;
                AndroidUtilities.runOnUIThread(new ni1(dj1Var, 8));
                int i10 = dj1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                dj1 dj1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new ni1(dj1Var2, 10));
                int i11 = dj1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
