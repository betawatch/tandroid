package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ax;
import org.telegram.ui.ef;
import org.telegram.ui.ey;
import org.telegram.ui.yt;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c2(Object obj, Object obj2, long j10, int i10) {
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
                h7 h7Var = (h7) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j10 = this.b;
                    boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new t2(h7Var, tL_premium_boostsStatus, j10, messagesController, 0));
                    break;
                } else {
                    h7Var.k0.setLoading(false);
                    h7Var.V2(true);
                    break;
                }
            case 1:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((yt) this.d);
                dataSettingsActivity.V = dataSettingsActivity.V || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.X = l4.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.o0(i10);
                    break;
                }
                break;
            case 2:
                ax axVar = (ax) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.e2) this.d).r(150L);
                ey eyVar = axVar.b;
                Boolean bool = eyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    eyVar.getMessagesController().addUserToChat(this.b, eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H)), 0, null, eyVar, false, runnable, new ef(6, runnable));
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
