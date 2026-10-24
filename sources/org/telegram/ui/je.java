package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ long c;

    public /* synthetic */ je(long j10, sn snVar) {
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
                LongSparseIntArray longSparseIntArray = snVar.Y5;
                long j10 = this.c;
                longSparseIntArray.put(j10, 0);
                org.telegram.ui.Components.w31 w31Var = snVar.d2;
                if (w31Var != null) {
                    w31Var.setAllTopicsHidden(false);
                }
                if (j10 == snVar.p4) {
                    snVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                sn snVar2 = this.b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(snVar2.getParentActivity(), snVar2, null, 1, this.c, 1, snVar2.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), snVar2.getThemedColor(org.telegram.ui.ActionBar.k6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 4:
                sn snVar3 = this.b;
                snVar3.getClass();
                snVar3.presentFragment(sn.W9(this.c));
                break;
            case 5:
                sn snVar4 = this.b;
                snVar4.getClass();
                snVar4.presentFragment(ProfileActivity.o4(this.c));
                break;
            case 6:
                org.telegram.ui.Components.xc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(si.o0.e(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ je(sn snVar, long j10, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = j10;
    }
}
