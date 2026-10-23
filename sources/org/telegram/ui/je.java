package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ long c;

    public /* synthetic */ je(long j10, qn qnVar) {
        this.a = 7;
        this.c = j10;
        this.b = qnVar;
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
                qn qnVar = this.b;
                LongSparseIntArray longSparseIntArray = qnVar.M5;
                long j10 = this.c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.s31 s31Var = qnVar.R1;
                if (s31Var != null) {
                    s31Var.setAllTopicsHidden(false);
                }
                if (j10 == qnVar.d4) {
                    qnVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                qn qnVar2 = this.b;
                qnVar2.getClass();
                qnVar2.presentFragment(qn.W9(this.c));
                break;
            case 4:
                qn qnVar3 = this.b;
                qnVar3.getClass();
                qnVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                qn qnVar4 = this.b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(qnVar4.getParentActivity(), qnVar4, null, 1, this.c, 1, qnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), qnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.xc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(zf.d0.b(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ je(qn qnVar, long j10, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = j10;
    }
}
