package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ rn c;

    public /* synthetic */ a1(long j10, rn rnVar) {
        this.a = 1;
        this.b = j10;
        this.c = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mc.a0(this.c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.b)), R.raw.stars_topup).k(true);
                break;
            case 1:
                this.c.presentFragment(new ProfileActivity(com.google.android.recaptcha.internal.a.h(this.b, "user_id"), null));
                break;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.b, r1, true, this.c.classGuid);
                break;
            case 3:
                this.c.getMessagesController().loadFullChat(this.b, 0, true);
                break;
            case 4:
                rn rnVar = this.c;
                LongSparseIntArray longSparseIntArray = rnVar.I5;
                long j10 = this.b;
                longSparseIntArray.put(j10, 0);
                d21 d21Var = rnVar.N1;
                if (d21Var != null) {
                    d21Var.setAllTopicsHidden(false);
                }
                if (j10 == rnVar.Z3) {
                    rnVar.w0.O(false);
                    break;
                }
                break;
            case 5:
                rn rnVar2 = this.c;
                rnVar2.getClass();
                rnVar2.presentFragment(rn.R9(this.b));
                break;
            case 6:
                rn rnVar3 = this.c;
                rnVar3.getClass();
                rnVar3.presentFragment(ProfileActivity.m4(this.b));
                break;
            default:
                rn rnVar4 = this.c;
                ec v = mc.v(rnVar4.getParentActivity(), rnVar4, null, 1, this.b, 1, rnVar4.getThemedColor(g6.Fi), rnVar4.getThemedColor(g6.Hi), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
        }
    }

    public /* synthetic */ a1(rn rnVar, long j10, int i10) {
        this.a = i10;
        this.c = rnVar;
        this.b = j10;
    }
}
