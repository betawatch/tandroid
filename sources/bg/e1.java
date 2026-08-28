package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ qn c;

    public /* synthetic */ e1(long j10, qn qnVar) {
        this.a = 1;
        this.b = j10;
        this.c = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oc.a0(this.c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.b)), R.raw.stars_topup).k(true);
                break;
            case 1:
                this.c.presentFragment(new ProfileActivity(e2.c.g(this.b, "user_id"), null));
                break;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.b, r1, true, this.c.classGuid);
                break;
            case 3:
                this.c.getMessagesController().loadFullChat(this.b, 0, true);
                break;
            case 4:
                qn qnVar = this.c;
                LongSparseIntArray longSparseIntArray = qnVar.I5;
                long j10 = this.b;
                longSparseIntArray.put(j10, 0);
                b21 b21Var = qnVar.N1;
                if (b21Var != null) {
                    b21Var.setAllTopicsHidden(false);
                }
                if (j10 == qnVar.Z3) {
                    qnVar.w0.O(false);
                    break;
                }
                break;
            case 5:
                qn qnVar2 = this.c;
                qnVar2.getClass();
                qnVar2.presentFragment(qn.R9(this.b));
                break;
            case 6:
                qn qnVar3 = this.c;
                qnVar3.getClass();
                qnVar3.presentFragment(ProfileActivity.m4(this.b));
                break;
            default:
                qn qnVar4 = this.c;
                gc v = oc.v(qnVar4.getParentActivity(), qnVar4, null, 1, this.b, 1, qnVar4.getThemedColor(f6.Fi), qnVar4.getThemedColor(f6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
        }
    }

    public /* synthetic */ e1(qn qnVar, long j10, int i9) {
        this.a = i9;
        this.c = qnVar;
        this.b = j10;
    }
}
