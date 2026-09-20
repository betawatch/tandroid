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
import org.telegram.ui.Components.jv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aa0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7(Object obj, int i10, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l9 l9Var = (l9) this.d;
                LongSparseIntArray longSparseIntArray = l9Var.f;
                long j3 = this.c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.b;
                int max = Math.max(i10, i11);
                l9Var.f.put(j3, max);
                l9Var.k.i(max, j3);
                TL_stories.PeerStories y3 = l9Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(l9Var.g, l9Var.J);
                    NotificationCenter.getInstance(l9Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
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
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.u1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.c, this.b);
                    break;
                }
                break;
            case 7:
                jv0.n((jv0) this.d, this.c, this.b);
                break;
            default:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    zn R9 = zn.R9(l4.longValue());
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

    public /* synthetic */ y7(Object obj, long j3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j3;
        this.b = i10;
    }
}
