package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class jc implements Utilities.Callback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.b = messagesController;
        this.e = eVar;
        this.f = a2VarArr;
        this.g = m2Var;
        this.c = zArr;
        this.d = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$openByUserName$455((nf.e) this.e, (org.telegram.ui.ActionBar.a2[]) this.f, (org.telegram.ui.ActionBar.m2) this.g, (boolean[]) this.c, this.d, (Long) obj);
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
