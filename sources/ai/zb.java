package ai;

import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zb(Object obj, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = i10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    sn W9 = sn.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.c).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new ac(W9, this.b, chat, 0), 250L);
                        break;
                    }
                }
                break;
            case 1:
                ci.h7 h7Var = (ci.h7) this.d;
                LongSparseIntArray longSparseIntArray = h7Var.f;
                long j10 = this.b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.c;
                int max = Math.max(i10, i11);
                h7Var.f.put(j10, max);
                h7Var.k.i(max, j10);
                TL_stories.PeerStories y3 = h7Var.y(j10);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(h7Var.g, h7Var.J);
                    NotificationCenter.getInstance(h7Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.c, this.b);
                break;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$24(this.c, this.b);
                break;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.b, this.c);
                break;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$423(this.b, this.c);
                break;
            case 6:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.b, this.c);
                break;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.b, this.c);
                    break;
                }
                break;
            default:
                sv0.n((sv0) this.d, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ zb(Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = j10;
        this.c = i10;
    }
}
