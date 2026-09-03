package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w21;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ zn c;

    public /* synthetic */ y0(long j10, zn znVar) {
        this.a = 1;
        this.b = j10;
        this.c = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qc.a0(this.c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.b)), R.raw.stars_topup).k(true);
                break;
            case 1:
                this.c.presentFragment(new ProfileActivity(kf.k0.g(this.b, "user_id"), null));
                break;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.b, r1, true, this.c.classGuid);
                break;
            case 3:
                this.c.getMessagesController().loadFullChat(this.b, 0, true);
                break;
            case 4:
                zn znVar = this.c;
                LongSparseIntArray longSparseIntArray = znVar.J5;
                long j10 = this.b;
                longSparseIntArray.put(j10, 0);
                w21 w21Var = znVar.O1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j10 == znVar.a4) {
                    znVar.x0.O(false);
                    break;
                }
                break;
            case 5:
                zn znVar2 = this.c;
                znVar2.getClass();
                znVar2.presentFragment(zn.R9(this.b));
                break;
            case 6:
                zn znVar3 = this.c;
                znVar3.getClass();
                znVar3.presentFragment(ProfileActivity.m4(this.b));
                break;
            default:
                zn znVar4 = this.c;
                ic v = qc.v(znVar4.getParentActivity(), znVar4, null, 1, this.b, 1, znVar4.getThemedColor(j6.Fi), znVar4.getThemedColor(j6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
        }
    }

    public /* synthetic */ y0(zn znVar, long j10, int i10) {
        this.a = i10;
        this.c = znVar;
        this.b = j10;
    }
}
