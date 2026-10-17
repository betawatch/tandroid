package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ long c;

    public /* synthetic */ le(long j10, sn snVar) {
        this.a = 7;
        this.c = j10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r0.getMediaDataController().loadBotInfo(this.c, r1, true, this.b.classGuid);
                break;
            case 1:
                this.b.getMessagesController().loadFullChat(this.c, 0, true);
                break;
            case 2:
                sn snVar = this.b;
                LongSparseIntArray longSparseIntArray = snVar.M5;
                long j10 = this.c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.q31 q31Var = snVar.R1;
                if (q31Var != null) {
                    q31Var.setAllTopicsHidden(false);
                }
                if (j10 == snVar.d4) {
                    snVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                sn snVar2 = this.b;
                snVar2.getClass();
                snVar2.presentFragment(sn.W9(this.c));
                break;
            case 4:
                sn snVar3 = this.b;
                snVar3.getClass();
                snVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                sn snVar4 = this.b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(snVar4.getParentActivity(), snVar4, null, 1, this.c, 1, snVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), snVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.xc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(z7.g5.a(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ le(sn snVar, long j10, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = j10;
    }
}
