package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ long c;

    public /* synthetic */ me(long j3, bo boVar) {
        this.a = 7;
        this.c = j3;
        this.b = boVar;
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
                bo boVar = this.b;
                LongSparseIntArray longSparseIntArray = boVar.M5;
                long j3 = this.c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.y21 y21Var = boVar.R1;
                if (y21Var != null) {
                    y21Var.setAllTopicsHidden(false);
                }
                if (j3 == boVar.d4) {
                    boVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                bo boVar2 = this.b;
                boVar2.getClass();
                boVar2.presentFragment(bo.R9(this.c));
                break;
            case 4:
                bo boVar3 = this.b;
                boVar3.getClass();
                boVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                bo boVar4 = this.b;
                org.telegram.ui.Components.oc v = org.telegram.ui.Components.vc.v(boVar4.getParentActivity(), boVar4, null, 1, this.c, 1, boVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), boVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.vc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(w.f.e(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ me(bo boVar, long j3, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = j3;
    }
}
