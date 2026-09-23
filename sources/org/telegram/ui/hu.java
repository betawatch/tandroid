package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hu(Object obj, Object obj2, long j3, int i10) {
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
                AndroidUtilities.cancelRunOnUIThread((gu) this.d);
                dataSettingsActivity.W = dataSettingsActivity.W || System.currentTimeMillis() - this.b > 120;
                dataSettingsActivity.Y = l4.longValue();
                dataSettingsActivity.X = false;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.n0(i10);
                    break;
                }
                break;
            case 1:
                qx qxVar = (qx) this.c;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) this.d).q(150L);
                ry ryVar = qxVar.b;
                Boolean bool = ryVar.G.bot_participant;
                if (bool != null && bool.booleanValue()) {
                    ryVar.getMessagesController().addUserToChat(this.b, ryVar.getMessagesController().getUser(Long.valueOf(ryVar.H)), 0, null, ryVar, false, runnable, new lf(8, runnable));
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
