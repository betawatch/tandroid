package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ TLObject h;

    public /* synthetic */ jw(qy qyVar, TLRPC.Chat chat, long j10, boolean z4, TLRPC.User user, boolean z10) {
        this.e = qyVar;
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
                qy qyVar = (qy) notificationCenterDelegate;
                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                TLRPC.User user = (TLRPC.User) tLObject;
                long j10 = this.c;
                boolean z4 = this.b;
                if (chat != null) {
                    qyVar.getClass();
                    if (ChatObject.isNotInChat(chat)) {
                        qyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    } else {
                        qyVar.getMessagesController().deleteParticipantFromChat(-j10, qyVar.getMessagesController().getUser(Long.valueOf(qyVar.getUserConfig().getClientUserId())), (TLRPC.Chat) null, z4, z4);
                    }
                } else {
                    qyVar.getMessagesController().deleteDialog(j10, 0, z4);
                    if (user != null && user.bot && this.d) {
                        qyVar.getMessagesController().blockPeer(user.id);
                    }
                }
                qyVar.getMessagesController().checkIfFolderEmpty(qyVar.S2);
                break;
            default:
                ph.da daVar = (ph.da) notificationCenterDelegate;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject2;
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject;
                boolean z10 = this.b;
                long j11 = this.c;
                if (!z10) {
                    nh.e1.T = new nh.e1(daVar.b, daVar.c, storyItem, j11, storyItem.id, z10, inputGroupCall, true, this.d);
                }
                ph.y9 y9Var = daVar.C;
                if (y9Var != null) {
                    y9Var.f(false);
                }
                daVar.C = null;
                daVar.G = 0;
                RectF rectF = daVar.E;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                daVar.D = AndroidUtilities.dp(8.0f);
                daVar.q(true);
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                storyItem.dialogId = j11;
                storyItem.justUploaded = true;
                U.getOrCreateStoryViewer().G(daVar.b, storyItem, null);
                NotificationCenter.getInstance(daVar.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.id));
                break;
        }
    }

    public /* synthetic */ jw(ph.da daVar, boolean z4, TL_stories.StoryItem storyItem, long j10, TLRPC.InputGroupCall inputGroupCall, boolean z10) {
        this.e = daVar;
        this.b = z4;
        this.f = storyItem;
        this.c = j10;
        this.h = inputGroupCall;
        this.d = z10;
    }
}
