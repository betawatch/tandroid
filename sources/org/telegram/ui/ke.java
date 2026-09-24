package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ long c;

    public /* synthetic */ ke(long j3, wn wnVar) {
        this.a = 7;
        this.c = j3;
        this.b = wnVar;
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
                wn wnVar = this.b;
                LongSparseIntArray longSparseIntArray = wnVar.M5;
                long j3 = this.c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.k31 k31Var = wnVar.R1;
                if (k31Var != null) {
                    k31Var.setAllTopicsHidden(false);
                }
                if (j3 == wnVar.d4) {
                    wnVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                wn wnVar2 = this.b;
                wnVar2.getClass();
                wnVar2.presentFragment(wn.R9(this.c));
                break;
            case 4:
                wn wnVar3 = this.b;
                wnVar3.getClass();
                wnVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                wn wnVar4 = this.b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.yc.v(wnVar4.getParentActivity(), wnVar4, null, 1, this.c, 1, wnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), wnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.yc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(v7.j.e(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ ke(wn wnVar, long j3, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = j3;
    }
}
