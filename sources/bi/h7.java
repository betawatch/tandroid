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
import org.telegram.ui.Components.xu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa0;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h7(Object obj, int i10, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u8 u8Var = (u8) this.d;
                LongSparseIntArray longSparseIntArray = u8Var.f;
                long j3 = this.c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.b;
                int max = Math.max(i10, i11);
                u8Var.f.put(j3, max);
                u8Var.k.i(max, j3);
                TL_stories.PeerStories y3 = u8Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(u8Var.g, u8Var.J);
                    NotificationCenter.getInstance(u8Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
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
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.c, this.b);
                break;
            case 5:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.c, this.b);
                break;
            case 6:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.c, this.b);
                    break;
                }
                break;
            case 7:
                xu0.n((xu0) this.d, this.c, this.b);
                break;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    co R9 = co.R9(l4.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new aa0(R9, this.c, chat, 1), 250L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ h7(Object obj, long j3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j3;
        this.b = i10;
    }
}
