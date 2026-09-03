package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w21;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ xn c;

    public /* synthetic */ y0(long j10, xn xnVar) {
        this.a = 1;
        this.b = j10;
        this.c = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qc.a0(this.c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.b)), R.raw.stars_topup).k(true);
                break;
            case 1:
                this.c.presentFragment(new ProfileActivity(l.d.g(this.b, "user_id"), null));
                break;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.b, r1, true, this.c.classGuid);
                break;
            case 3:
                this.c.getMessagesController().loadFullChat(this.b, 0, true);
                break;
            case 4:
                xn xnVar = this.c;
                LongSparseIntArray longSparseIntArray = xnVar.J5;
                long j10 = this.b;
                longSparseIntArray.put(j10, 0);
                w21 w21Var = xnVar.O1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j10 == xnVar.a4) {
                    xnVar.x0.O(false);
                    break;
                }
                break;
            case 5:
                xn xnVar2 = this.c;
                xnVar2.getClass();
                xnVar2.presentFragment(xn.R9(this.b));
                break;
            case 6:
                xn xnVar3 = this.c;
                xnVar3.getClass();
                xnVar3.presentFragment(ProfileActivity.m4(this.b));
                break;
            default:
                xn xnVar4 = this.c;
                ic v = qc.v(xnVar4.getParentActivity(), xnVar4, null, 1, this.b, 1, xnVar4.getThemedColor(k6.Fi), xnVar4.getThemedColor(k6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
        }
    }

    public /* synthetic */ y0(xn xnVar, long j10, int i10) {
        this.a = i10;
        this.c = xnVar;
        this.b = j10;
    }
}
