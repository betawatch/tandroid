package bi;

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
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ea0;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class m7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m7(Object obj, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x8 x8Var = (x8) this.d;
                LongSparseIntArray longSparseIntArray = x8Var.f;
                long j10 = this.c;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.b;
                int max = Math.max(i10, i11);
                x8Var.f.put(j10, max);
                x8Var.k.i(max, j10);
                TL_stories.PeerStories y3 = x8Var.y(j10);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(x8Var.g, x8Var.J);
                    NotificationCenter.getInstance(x8Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 1:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.b, this.c);
                break;
            case 2:
                ((MediaController) this.d).lambda$prepareResumedRecording$24(this.b, this.c);
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
                xv0.n((xv0) this.d, this.c, this.b);
                break;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    fo W9 = fo.W9(l4.longValue());
                    U.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new ea0(W9, this.c, chat, 1), 250L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ m7(Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j10;
        this.b = i10;
    }
}
