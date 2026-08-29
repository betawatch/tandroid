package eg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ tn c;

    public /* synthetic */ z0(long j10, tn tnVar) {
        this.a = 1;
        this.b = j10;
        this.c = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tc.a0(this.c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.b)), R.raw.stars_topup).k(true);
                break;
            case 1:
                this.c.presentFragment(new ProfileActivity(j7.l1.g(this.b, "user_id"), null));
                break;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.b, r1, true, this.c.classGuid);
                break;
            case 3:
                this.c.getMessagesController().loadFullChat(this.b, 0, true);
                break;
            case 4:
                tn tnVar = this.c;
                LongSparseIntArray longSparseIntArray = tnVar.I5;
                long j10 = this.b;
                longSparseIntArray.put(j10, 0);
                m21 m21Var = tnVar.N1;
                if (m21Var != null) {
                    m21Var.setAllTopicsHidden(false);
                }
                if (j10 == tnVar.Z3) {
                    tnVar.w0.O(false);
                    break;
                }
                break;
            case 5:
                tn tnVar2 = this.c;
                tnVar2.getClass();
                tnVar2.presentFragment(tn.R9(this.b));
                break;
            case 6:
                tn tnVar3 = this.c;
                tnVar3.getClass();
                tnVar3.presentFragment(ProfileActivity.m4(this.b));
                break;
            default:
                tn tnVar4 = this.c;
                mc v = tc.v(tnVar4.getParentActivity(), tnVar4, null, 1, this.b, 1, tnVar4.getThemedColor(g6.Fi), tnVar4.getThemedColor(g6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
        }
    }

    public /* synthetic */ z0(tn tnVar, long j10, int i10) {
        this.a = i10;
        this.c = tnVar;
        this.b = j10;
    }
}
