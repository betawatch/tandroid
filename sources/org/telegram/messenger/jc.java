package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class jc implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.b = messagesController;
        this.e = eVar;
        this.f = b2VarArr;
        this.g = n2Var;
        this.c = zArr;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$openByUserName$455((nf.e) this.e, (org.telegram.ui.ActionBar.b2[]) this.f, (org.telegram.ui.ActionBar.n2) this.g, (boolean[]) this.c, this.d, (Long) obj);
                break;
            case 1:
                this.b.lambda$openApp$500((boolean[]) this.c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f, this.d, (c3) this.g, (TL_bots.BotInfo) obj);
                break;
            default:
                this.b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f, this.d, (TLRPC.Chat) this.g, (Runnable) this.c, (TLRPC.TL_messages_invitedUsers) obj);
                break;
        }
    }

    public /* synthetic */ jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f = iArr;
        this.d = i10;
        this.g = chat;
        this.c = runnable;
    }

    public /* synthetic */ jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.b = messagesController;
        this.c = zArr;
        this.e = botInfoArr;
        this.f = user;
        this.d = i10;
        this.g = c3Var;
    }
}
