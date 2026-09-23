package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ long c;

    public /* synthetic */ ke(long j3, xn xnVar) {
        this.a = 7;
        this.c = j3;
        this.b = xnVar;
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
                xn xnVar = this.b;
                LongSparseIntArray longSparseIntArray = xnVar.M5;
                long j3 = this.c;
                longSparseIntArray.put(j3, 0);
                org.telegram.ui.Components.w21 w21Var = xnVar.R1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j3 == xnVar.d4) {
                    xnVar.A0.O(false);
                    break;
                }
                break;
            case 3:
                xn xnVar2 = this.b;
                xnVar2.getClass();
                xnVar2.presentFragment(xn.R9(this.c));
                break;
            case 4:
                xn xnVar3 = this.b;
                xnVar3.getClass();
                xnVar3.presentFragment(ProfileActivity.m4(this.c));
                break;
            case 5:
                xn xnVar4 = this.b;
                org.telegram.ui.Components.qc v = org.telegram.ui.Components.xc.v(xnVar4.getParentActivity(), xnVar4, null, 1, this.c, 1, xnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Fi), xnVar4.getThemedColor(org.telegram.ui.ActionBar.h6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 6:
                org.telegram.ui.Components.xc.a0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
            default:
                this.b.presentFragment(new ProfileActivity(w.c.e(this.c, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ ke(xn xnVar, long j3, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = j3;
    }
}
