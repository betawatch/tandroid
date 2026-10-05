package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ long c;

    public /* synthetic */ gg(long j3, yn ynVar) {
        this.a = 7;
        this.c = j3;
        this.b = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().loadFullChat(this.c, 0, true);
                break;
            case 1:
                yn ynVar = this.b;
                LongSparseIntArray longSparseIntArray = ynVar.K5;
                long j3 = this.c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.w31 w31Var = ynVar.P1;
                if (w31Var != null) {
                    w31Var.setAllTopicsHidden(false);
                }
                if (j3 == ynVar.b4) {
                    ynVar.y0.O(false);
                    break;
                }
                break;
            case 2:
                yn ynVar2 = this.b;
                ynVar2.getClass();
                ynVar2.presentFragment(yn.Q9(this.c));
                break;
            case 3:
                yn ynVar3 = this.b;
                ynVar3.getClass();
                ynVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 4:
                yn ynVar4 = this.b;
                org.telegram.ui.Components.rc v = org.telegram.ui.Components.yc.v(ynVar4.getParentActivity(), ynVar4, null, 1, this.c, 1, ynVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), ynVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 5:
                r0.getMediaDataController().loadBotInfo(this.c, r1, true, this.b.classGuid);
                break;
            case 6:
                org.telegram.ui.Components.yc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(sa.e.f(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ gg(yn ynVar, long j3, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = j3;
    }
}
