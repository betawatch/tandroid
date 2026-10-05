package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ku implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ku(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.c;
                Long l4 = (Long) obj;
                AndroidUtilities.cancelRunOnUIThread((ju) this.d);
                dataSettingsActivity.V = dataSettingsActivity.V || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.X = l4.longValue();
                dataSettingsActivity.W = false;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    break;
                }
                break;
            case 1:
                rx rxVar = (rx) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                uy uyVar = rxVar.b;
                Boolean bool = uyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    uyVar.getMessagesController().addUserToChat(this.b, uyVar.getMessagesController().getUser(Long.valueOf(uyVar.H)), 0, null, uyVar, false, runnable, new nf(6, runnable));
                    break;
                } else {
                    runnable.run();
                    break;
                }
            case 2:
                ProfileActivity.k0((ProfileActivity) this.c, (Context) this.d, this.b, (TL_payments.connectedBotStarRef) obj);
                break;
            default:
                yh.y3 y3Var = (yh.y3) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(y3Var, tL_premium_boostsStatus, j3, messagesController, 10));
                    break;
                } else {
                    y3Var.j0.setLoading(false);
                    y3Var.r2(true);
                    break;
                }
                break;
        }
    }
}
