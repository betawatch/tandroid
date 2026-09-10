package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi1 b;
    public final /* synthetic */ VoIPService c;

    public /* synthetic */ ii1(zi1 zi1Var, VoIPService voIPService, int i10) {
        this.a = i10;
        this.b = zi1Var;
        this.c = voIPService;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zi1 zi1Var = this.b;
                AndroidUtilities.runOnUIThread(new ji1(zi1Var, 8));
                int i10 = zi1Var.L;
                if (i10 > 0) {
                    this.c.sendCallRating(i10);
                    break;
                }
                break;
            default:
                zi1 zi1Var2 = this.b;
                AndroidUtilities.runOnUIThread(new ji1(zi1Var2, 10));
                int i11 = zi1Var2.L;
                if (i11 > 0) {
                    this.c.sendCallRating(i11);
                    break;
                }
                break;
        }
    }
}
