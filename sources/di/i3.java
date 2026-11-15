package di;

import org.telegram.messenger.bm;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.um;
import org.telegram.messenger.xm;
import org.telegram.messenger.yo;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i3 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ is c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i3(c6 c6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.c = c6Var;
        this.d = bVar;
        this.e = t1Var;
        this.f = tL_starGiftUnique;
        this.b = j3;
        this.g = charSequence;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new n3((c6) this.c, (vf.b) this.d, (org.telegram.ui.ActionBar.t1) this.e, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.b, (CharSequence) this.g));
                break;
            case 1:
                np npVar = (np) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f;
                yo yoVar = (yo) this.g;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new bm(npVar, tL_error, e2Var, tL_messages_editChatAdmin, 3));
                    if (yoVar != null) {
                        org.telegram.messenger.g0.h3(new xm(yoVar, tL_error, 0));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.i3(new um(npVar, this.b, runnable, 1), 1000L);
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new n3((yw) this.c, (org.telegram.ui.ActionBar.t1) this.e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f, this.b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
        }
    }

    public /* synthetic */ i3(np npVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, yo yoVar) {
        this.c = npVar;
        this.b = j3;
        this.d = runnable;
        this.e = e2Var;
        this.f = tL_messages_editChatAdmin;
        this.g = yoVar;
    }

    public /* synthetic */ i3(yw ywVar, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = ywVar;
        this.e = t1Var;
        this.d = user;
        this.f = chat;
        this.b = j3;
        this.g = tL_messages_checkHistoryImportPeer;
    }
}
