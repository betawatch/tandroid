package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gu(Object obj, Object obj2, long j3, int i10) {
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
                AndroidUtilities.cancelRunOnUIThread((fu) this.d);
                dataSettingsActivity.W = dataSettingsActivity.W || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    break;
                }
                break;
            case 1:
                px pxVar = (px) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.a2) this.d).q(150L);
                qy qyVar = pxVar.b;
                Boolean bool = qyVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    qyVar.getMessagesController().addUserToChat(this.b, qyVar.getMessagesController().getUser(Long.valueOf(qyVar.H)), 0, null, qyVar, false, runnable, new kf(8, runnable));
                    break;
                } else {
                    runnable.run();
                    break;
                }
            case 2:
                ProfileActivity.k0((ProfileActivity) this.c, (Context) this.d, this.b, (TL_payments.connectedBotStarRef) obj);
                break;
            default:
                yh.x3 x3Var = (yh.x3) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < messagesController.channelEmojiStatusLevelMin) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j3 = this.b;
                    boostsController.userCanBoostChannel(j3, tL_premium_boostsStatus, new ai.l(x3Var, tL_premium_boostsStatus, j3, messagesController, 10));
                    break;
                } else {
                    x3Var.j0.setLoading(false);
                    x3Var.r2(true);
                    break;
                }
                break;
        }
    }
}
