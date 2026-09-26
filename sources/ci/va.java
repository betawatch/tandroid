package ci;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class va implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ va(lc lcVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = lcVar;
        this.c = z10;
        this.f = storyItem;
        this.b = j3;
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
                lc lcVar = (lc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.c;
                long j3 = this.b;
                if (!z10) {
                    ai.d2.W = new ai.d2(lcVar.b, lcVar.c, storyItem, j3, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                gc gcVar = lcVar.F;
                if (gcVar != null) {
                    gcVar.f(false);
                }
                lcVar.F = null;
                lcVar.J = 0;
                RectF rectF = lcVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                lcVar.G = AndroidUtilities.dp(8.0f);
                lcVar.q(true);
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(lcVar.b, storyItem, null);
                NotificationCenter.getInstance(lcVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.id));
                break;
            default:
                qy qyVar = (qy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.b;
                boolean z11 = this.c;
                if (chat != null) {
                    qyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        qyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        qyVar.getMessagesController().deleteParticipantFromChat(-j10, qyVar.getMessagesController().getUser(Long.valueOf(qyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    qyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        qyVar.getMessagesController().blockPeer(user.id);
                    }
                }
                qyVar.getMessagesController().checkIfFolderEmpty(qyVar.V2);
                break;
        }
    }

    public /* synthetic */ va(qy qyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = qyVar;
        this.f = chat;
        this.b = j3;
        this.c = z10;
        this.h = user;
        this.d = z11;
    }
}
