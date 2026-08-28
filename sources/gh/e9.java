package gh;

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
import org.telegram.ui.Components.eu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e9(Object obj, int i9, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = i9;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Long l10 = (Long) this.d;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    qn R9 = qn.R9(l10.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.c).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new f9(R9, this.b, chat, 0), 250L);
                        break;
                    }
                }
                break;
            case 1:
                ih.v6 v6Var = (ih.v6) this.d;
                LongSparseIntArray longSparseIntArray = v6Var.f;
                long j10 = this.b;
                int i9 = longSparseIntArray.get(j10, 0);
                int i10 = this.c;
                int max = Math.max(i9, i10);
                v6Var.f.put(j10, max);
                v6Var.k.i(max, j10);
                TL_stories.PeerStories y10 = v6Var.y(j10);
                if (y10 != null && i10 > y10.max_read_id) {
                    y10.max_read_id = i10;
                    Collections.sort(v6Var.g, v6Var.J);
                    NotificationCenter.getInstance(v6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 2:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.c, this.b);
                break;
            case 3:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.c, this.b);
                break;
            case 4:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.b, this.c);
                break;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.b, this.c);
                break;
            case 6:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.b, this.c);
                break;
            case 7:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Ld;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.b, this.c);
                    break;
                }
                break;
            default:
                eu0.n((eu0) this.d, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ e9(Object obj, long j10, int i9, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = i9;
    }
}
