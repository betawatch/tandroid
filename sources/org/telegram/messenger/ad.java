package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class ad implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Runnable g;

    public /* synthetic */ ad(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.c = i10;
        this.f = chat;
        this.g = runnable;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f, this.c, (c3) this.g, (TL_bots.BotInfo) obj);
                break;
            default:
                this.b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.e, this.c, (TLRPC.Chat) this.f, this.g, (TLRPC.TL_messages_invitedUsers) obj);
                break;
        }
    }

    public /* synthetic */ ad(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.b = messagesController;
        this.d = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.c = i10;
        this.g = c3Var;
    }
}
