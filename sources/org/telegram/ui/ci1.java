package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ ci1(ti1 ti1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = ti1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ti1 ti1Var = this.b;
                AndroidUtilities.runOnUIThread(new di1(ti1Var, 8));
                int i10 = ti1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                ti1 ti1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new di1(ti1Var2, 10));
                int i11 = ti1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
