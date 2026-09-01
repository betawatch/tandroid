package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ lh1(ci1 ci1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = ci1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ci1 ci1Var = this.b;
                AndroidUtilities.runOnUIThread(new mh1(ci1Var, 8));
                int i10 = ci1Var.I;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                ci1 ci1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new mh1(ci1Var2, 10));
                int i11 = ci1Var2.I;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
