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
import org.telegram.ui.Components.bw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.z90;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b8(Object obj, int i10, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m9 m9Var = (m9) this.d;
                LongSparseIntArray longSparseIntArray = m9Var.f;
                long j3 = this.c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.b;
                int max = Math.max(i10, i11);
                m9Var.f.put(j3, max);
                m9Var.k.i(max, j3);
                TL_stories.PeerStories y3 = m9Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(m9Var.g, m9Var.J);
                    NotificationCenter.getInstance(m9Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.b, this.c);
                break;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.b, this.c);
                break;
            case 3:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.c, this.b);
                break;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$423(this.c, this.b);
                break;
            case 5:
                SendMessagesHelper.lambda$finishGroup$120((AccountInstance) this.d, this.c, this.b);
                break;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.c, this.b);
                    break;
                }
                break;
            case 7:
                bw0.n((bw0) this.d, this.c, this.b);
                break;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    zn W9 = zn.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new z90(W9, this.c, chat, 1), 250L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b8(Object obj, long j3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j3;
        this.b = i10;
    }
}
