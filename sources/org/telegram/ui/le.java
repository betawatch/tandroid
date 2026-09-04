package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ long c;

    public /* synthetic */ le(long j3, co coVar) {
        this.a = 7;
        this.c = j3;
        this.b = coVar;
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
                co coVar = this.b;
                LongSparseIntArray longSparseIntArray = coVar.M5;
                long j3 = this.c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.w21 w21Var = coVar.R1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j3 == coVar.d4) {
                    coVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                co coVar2 = this.b;
                coVar2.getClass();
                coVar2.presentFragment(co.R9(this.c));
                break;
            case 4:
                co coVar3 = this.b;
                coVar3.getClass();
                coVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                co coVar4 = this.b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.yc.v(coVar4.getParentActivity(), coVar4, null, 1, this.c, 1, coVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), coVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.yc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(w.f.e(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ le(co coVar, long j3, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = j3;
    }
}
