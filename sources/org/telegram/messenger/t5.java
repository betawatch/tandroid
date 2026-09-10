package org.telegram.messenger;

import java.util.Collections;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.z90;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t5(Object obj, int i10, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((LocationController) this.d).lambda$setProximityLocation$12(this.b, this.c);
                break;
            case 1:
                ((MediaController) this.d).lambda$prepareResumedRecording$23(this.b, this.c);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$deletePeer$159(this.c, this.b);
                break;
            case 3:
                ((MessagesController) this.d).lambda$processUpdateArray$420(this.c, this.b);
                break;
            case 4:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.d, this.c, this.b);
                break;
            case 5:
                BotForumHelper.BotDraftAnimationsPool botDraftAnimationsPool = ((org.telegram.ui.Cells.t1) this.d).Pd;
                if (botDraftAnimationsPool != null) {
                    botDraftAnimationsPool.removeAnimator(this.c, this.b);
                    break;
                }
                break;
            case 6:
                iv0.n((iv0) this.d, this.c, this.b);
                break;
            case 7:
                Long l4 = (Long) this.d;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    eo R9 = eo.R9(l4.longValue());
                    U.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(this.b).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new z90(R9, this.c, chat, 1), 250L);
                        break;
                    }
                }
                break;
            default:
                zh.i5 i5Var = (zh.i5) this.d;
                LongSparseIntArray longSparseIntArray = i5Var.f;
                long j3 = this.c;
                int i10 = longSparseIntArray.get(j3, 0);
                int i11 = this.b;
                int max = Math.max(i10, i11);
                i5Var.f.put(j3, max);
                i5Var.k.i(max, j3);
                TL_stories.PeerStories y3 = i5Var.y(j3);
                if (y3 != null && i11 > y3.max_read_id) {
                    y3.max_read_id = i11;
                    Collections.sort(i5Var.g, i5Var.J);
                    NotificationCenter.getInstance(i5Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t5(Object obj, long j3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j3;
        this.b = i10;
    }
}
