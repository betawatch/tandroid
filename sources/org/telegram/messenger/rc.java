package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class rc implements Utilities.Callback {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.d = i10;
        this.g = chat;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$openByUserName$460((qf.c) this.e, (org.telegram.ui.ActionBar.e2[]) this.f, (org.telegram.ui.ActionBar.r2) this.g, (boolean[]) this.c, this.d, (Long) obj);
                break;
            case 1:
                this.b.lambda$openApp$505((boolean[]) this.c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f, this.d, (i3) this.g, (TL_bots.BotInfo) obj);
                break;
            default:
                this.b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f, this.d, (TLRPC.Chat) this.g, (Runnable) this.c, (TLRPC.TL_messages_invitedUsers) obj);
                break;
        }
    }

    public /* synthetic */ rc(MessagesController messagesController, qf.c cVar, org.telegram.ui.ActionBar.e2[] e2VarArr, org.telegram.ui.ActionBar.r2 r2Var, boolean[] zArr, int i10) {
        this.b = messagesController;
        this.e = cVar;
        this.f = e2VarArr;
        this.g = r2Var;
        this.c = zArr;
        this.d = i10;
    }

    public /* synthetic */ rc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, i3 i3Var) {
        this.b = messagesController;
        this.c = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.d = i10;
        this.g = i3Var;
    }
}
