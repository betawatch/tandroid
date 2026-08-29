package nh;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ t9(gb gbVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = gbVar;
        this.c = z10;
        this.f = storyItem;
        this.b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                gb gbVar = (gb) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.c;
                long j10 = this.b;
                if (!z10) {
                    lh.d1.S = new lh.d1(gbVar.b, gbVar.c, storyItem, j10, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                bb bbVar = gbVar.B;
                if (bbVar != null) {
                    bbVar.f(false);
                }
                gbVar.B = null;
                gbVar.F = 0;
                RectF rectF = gbVar.D;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                gbVar.C = AndroidUtilities.dp(8.0f);
                gbVar.q(true);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().G(gbVar.b, storyItem, null);
                NotificationCenter.getInstance(gbVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.id));
                break;
            default:
                fy fyVar = (fy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.b;
                boolean z11 = this.c;
                if (chat != null) {
                    fyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        fyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    } else {
                        fyVar.getMessagesController().deleteParticipantFromChat(-j11, fyVar.getMessagesController().getUser(Long.valueOf(fyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    fyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    if (user != null && user.bot && this.d) {
                        fyVar.getMessagesController().blockPeer(user.id);
                    }
                }
                fyVar.getMessagesController().checkIfFolderEmpty(fyVar.R2);
                break;
        }
    }

    public /* synthetic */ t9(fy fyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = fyVar;
        this.f = chat;
        this.b = j10;
        this.c = z10;
        this.h = user;
        this.d = z11;
    }
}
