package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ iw(py pyVar, TLRPC.Chat chat, long j10, boolean z4, TLRPC.User user, boolean z10) {
        this.e = pyVar;
        this.f = chat;
        this.c = j10;
        this.b = z4;
        this.h = user;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLObject tLObject = this.h;
        TLObject tLObject2 = this.f;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.e;
        switch (i10) {
            case 0:
                py pyVar = (py) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.c;
                boolean z4 = this.b;
                if (chat != null) {
                    pyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        pyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    } else {
                        pyVar.getMessagesController().deleteParticipantFromChat(-j10, pyVar.getMessagesController().getUser(Long.valueOf(pyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z4, z4);
                    }
                } else {
                    pyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    if (user != null && user.bot && this.d) {
                        pyVar.getMessagesController().blockPeer(user.id);
                    }
                }
                pyVar.getMessagesController().checkIfFolderEmpty(pyVar.S2);
                break;
            default:
                qh.ba baVar = (qh.ba) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.b;
                long j11 = this.c;
                if (!z10) {
                    oh.e1.T = new oh.e1(baVar.b, baVar.c, storyItem, j11, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                qh.w9 w9Var = baVar.C;
                if (w9Var != null) {
                    w9Var.f(false);
                }
                baVar.C = null;
                baVar.G = 0;
                RectF rectF = baVar.E;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                baVar.D = AndroidUtilities.dp(8.0f);
                baVar.q(true);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                storyItem.dialogId = j11;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().G(baVar.b, storyItem, null);
                NotificationCenter.getInstance(baVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.id));
                break;
        }
    }

    public /* synthetic */ iw(qh.ba baVar, boolean z4, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.e = baVar;
        this.b = z4;
        this.f = storyItem;
        this.c = j10;
        this.h = inputGroupCall;
        this.d = z10;
    }
}
