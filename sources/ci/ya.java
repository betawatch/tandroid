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
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ya implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ ya(oc ocVar, boolean z10, TL_stories.StoryItem storyItem, long j3, TLRPC.InputGroupCall inputGroupCall, boolean z11) {
        this.e = ocVar;
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
                oc ocVar = (oc) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.c;
                long j3 = this.b;
                if (!z10) {
                    ai.d2.W = new ai.d2(ocVar.b, ocVar.c, storyItem, j3, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                jc jcVar = ocVar.F;
                if (jcVar != null) {
                    jcVar.f(false);
                }
                ocVar.F = null;
                ocVar.J = 0;
                RectF rectF = ocVar.H;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                ocVar.G = AndroidUtilities.dp(8.0f);
                ocVar.q(true);
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                storyItem.dialogId = j3;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().F(ocVar.b, storyItem, null);
                NotificationCenter.getInstance(ocVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.id));
                break;
            default:
                wy wyVar = (wy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.b;
                boolean z11 = this.c;
                if (chat != null) {
                    wyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        wyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    } else {
                        wyVar.getMessagesController().deleteParticipantFromChat(-j10, wyVar.getMessagesController().getUser(Long.valueOf(wyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z11, z11);
                    }
                } else {
                    wyVar.getMessagesController().deleteDialog(j10, 0, z11);
                    if (user != null && user.bot && this.d) {
                        wyVar.getMessagesController().blockPeer(user.id);
                    }
                }
                wyVar.getMessagesController().checkIfFolderEmpty(wyVar.V2);
                break;
        }
    }

    public /* synthetic */ ya(wy wyVar, TLRPC.Chat chat, long j3, boolean z10, TLRPC.User user, boolean z11) {
        this.e = wyVar;
        this.f = chat;
        this.b = j3;
        this.c = z10;
        this.h = user;
        this.d = z11;
    }
}
