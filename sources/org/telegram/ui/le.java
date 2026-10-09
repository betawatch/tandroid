package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ long c;

    public /* synthetic */ le(long j3, zn znVar) {
        this.a = 7;
        this.c = j3;
        this.b = znVar;
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
                zn znVar = this.b;
                LongSparseIntArray longSparseIntArray = znVar.M5;
                long j3 = this.c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.c41 c41Var = znVar.R1;
                if (c41Var != null) {
                    c41Var.setAllTopicsHidden(false);
                }
                if (j3 == znVar.d4) {
                    znVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                zn znVar2 = this.b;
                znVar2.getClass();
                znVar2.presentFragment(zn.W9(this.c));
                break;
            case 4:
                zn znVar3 = this.b;
                znVar3.getClass();
                znVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                zn znVar4 = this.b;
                org.telegram.ui.Components.tc v = org.telegram.ui.Components.ad.v(znVar4.getParentActivity(), znVar4, null, 1, this.c, 1, znVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), znVar4.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.ad.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(sc.v.f(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ le(zn znVar, long j3, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = j3;
    }
}
