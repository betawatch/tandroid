package kh;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ ia(wb wbVar, boolean z10, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = wbVar;
        this.c = z10;
        this.f = storyItem;
        this.b = j10;
        this.h = inputGroupCall;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i9) {
            case 0:
                wb wbVar = (wb) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.c;
                long j10 = this.b;
                if (!z10) {
                    ih.f1.S = new ih.f1(wbVar.b, wbVar.c, storyItem, j10, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                rb rbVar = wbVar.B;
                if (rbVar != null) {
                    rbVar.f(false);
                }
                wbVar.B = null;
                wbVar.F = 0;
                RectF rectF = wbVar.D;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                wbVar.C = AndroidUtilities.dp(8.0f);
                wbVar.q(true);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                storyItem.dialogId = j10;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(wbVar.b, storyItem, null);
                NotificationCenter.getInstance(wbVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.id));
                break;
            default:
                dy dyVar = (dy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j11 = this.b;
                boolean z11 = this.c;
                if (chat != null) {
                    dyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        dyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    } else {
                        dyVar.getMessagesController().deleteParticipantFromChat(-j11, dyVar.getMessagesController().getUser(Long.valueOf(dyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    dyVar.getMessagesController().deleteDialog(j11, 0, z11);
                    if (user != null && user.bot && this.d) {
                        dyVar.getMessagesController().blockPeer(user.id);
                    }
                }
                dyVar.getMessagesController().checkIfFolderEmpty(dyVar.R2);
                break;
        }
    }

    public /* synthetic */ ia(dy dyVar, TLRPC.Chat chat, long j10, boolean z10, TLRPC.User user, boolean z11) {
        this.e = dyVar;
        this.f = chat;
        this.b = j10;
        this.c = z10;
        this.h = user;
        this.d = z11;
    }
}
