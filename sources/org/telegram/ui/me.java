package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ long c;

    public /* synthetic */ me(long j3, eo eoVar) {
        this.a = 7;
        this.c = j3;
        this.b = eoVar;
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
                eo eoVar = this.b;
                LongSparseIntArray longSparseIntArray = eoVar.M5;
                long j3 = this.c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.k31 k31Var = eoVar.R1;
                if (k31Var != null) {
                    k31Var.setAllTopicsHidden(false);
                }
                if (j3 == eoVar.d4) {
                    eoVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                eo eoVar2 = this.b;
                eoVar2.getClass();
                eoVar2.presentFragment(eo.R9(this.c));
                break;
            case 4:
                eo eoVar3 = this.b;
                eoVar3.getClass();
                eoVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                eo eoVar4 = this.b;
                org.telegram.ui.Components.pc v = org.telegram.ui.Components.wc.v(eoVar4.getParentActivity(), eoVar4, null, 1, this.c, 1, eoVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), eoVar4.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.wc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(w.f.e(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ me(eo eoVar, long j3, int i10) {
        this.a = i10;
        this.b = eoVar;
        this.c = j3;
    }
}
