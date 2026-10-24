package ai;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dx;
import org.telegram.ui.ey;
import org.telegram.ui.gf;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f2(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new x2(l7Var, tL_premium_boostsStatus, j10, messagesController, 0));
                    break;
                } else {
                    l7Var.k0.setLoading(false);
                    l7Var.V2(true);
                    break;
                }
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((zt) this.d);
                dataSettingsActivity.W = dataSettingsActivity.W || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    break;
                }
                break;
            case 2:
                dx dxVar = (dx) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.c2) this.d).r(150L);
                ey eyVar = dxVar.b;
                Boolean bool = eyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    eyVar.getMessagesController().addUserToChat(this.b, eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H)), 0, null, eyVar, false, runnable, new gf(8, runnable));
                    break;
                } else {
                    runnable.run();
                    break;
                }
            default:
                ProfileActivity.Z((ProfileActivity) this.c, (Context) this.d, this.b, (TL_payments.connectedBotStarRef) obj);
                break;
        }
    }
}
