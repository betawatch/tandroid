package mh;

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
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a9(Object obj, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = i10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Long l10 = (Long) this.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    xn R9 = xn.R9(l10.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.c).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new b9(R9, this.b, chat, 0), 250L);
                        break;
                    }
                }
                break;
            case 1:
                oh.t6 t6Var = (oh.t6) this.d;
                LongSparseIntArray longSparseIntArray = t6Var.f;
                long j10 = this.b;
                int i10 = longSparseIntArray.get(j10, 0);
                int i11 = this.c;
                int max = Math.max(i10, i11);
                t6Var.f.put(j10, max);
                t6Var.k.i(max, j10);
                TL_stories.PeerStories y10 = t6Var.y(j10);
                if (y10 != null && i11 > y10.max_read_id) {
                    y10.max_read_id = i11;
                    Collections.sort(t6Var.g, t6Var.J);
                    NotificationCenter.getInstance(t6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
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
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Md;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.b, this.c);
                    break;
                }
                break;
            default:
                zu0.n((zu0) this.d, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ a9(Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = j10;
        this.c = i10;
    }
}
