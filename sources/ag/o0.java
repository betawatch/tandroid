package ag;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ long c;

    public /* synthetic */ o0(long j10, wn wnVar) {
        this.a = 0;
        this.c = j10;
        this.b = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new ProfileActivity(a1.g.h(this.c, "user_id"), null));
                break;
            case 1:
                r0.getMediaDataController().loadBotInfo(this.c, r1, true, this.b.classGuid);
                break;
            case 2:
                this.b.getMessagesController().loadFullChat(this.c, 0, true);
                break;
            case 3:
                wn wnVar = this.b;
                LongSparseIntArray longSparseIntArray = wnVar.c6;
                long j10 = this.c;
                longSparseIntArray.put(j10, 0);
                f41 f41Var = wnVar.d2;
                if (f41Var != null) {
                    f41Var.setAllTopicsHidden(false);
                }
                if (j10 == wnVar.p4) {
                    wnVar.A0.O(false);
                    break;
                }
                break;
            case 4:
                wn wnVar2 = this.b;
                wnVar2.getClass();
                wnVar2.presentFragment(wn.ea(this.c));
                break;
            case 5:
                wn wnVar3 = this.b;
                wnVar3.getClass();
                wnVar3.presentFragment(ProfileActivity.t4(this.c));
                break;
            case 6:
                wn wnVar4 = this.b;
                qc v = wc.v(wnVar4.getParentActivity(), wnVar4, null, 1, this.c, 1, wnVar4.getThemedColor(y6.Fi), wnVar4.getThemedColor(y6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            default:
                wc.b0(this.b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.c)), R.raw.stars_topup).k(true);
                break;
        }
    }

    public /* synthetic */ o0(wn wnVar, long j10, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = j10;
    }
}
