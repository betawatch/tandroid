package di;

import org.telegram.messenger.an;
import org.telegram.messenger.gs;
import org.telegram.messenger.np;
import org.telegram.messenger.sm;
import org.telegram.messenger.ul;
import org.telegram.messenger.yo;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ gs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k3(f6 f6Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.c = f6Var;
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
                org.telegram.messenger.g0.g3(new m3((f6) this.c, (vf.b) this.d, (org.telegram.ui.ActionBar.t1) this.e, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.b, (CharSequence) this.g));
                break;
            case 1:
                np npVar = (np) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f;
                yo yoVar = (yo) this.g;
                if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new ul(npVar, tL_error, g2Var, tL_messages_editChatAdmin, 3));
                    if (yoVar != null) {
                        org.telegram.messenger.g0.g3(new an(yoVar, tL_error, 0));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.h3(new sm(npVar, this.b, runnable, 1), 1000L);
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new m3((cx) this.c, (org.telegram.ui.ActionBar.t1) this.e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f, this.b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
        }
    }

    public /* synthetic */ k3(np npVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, yo yoVar) {
        this.c = npVar;
        this.b = j3;
        this.d = runnable;
        this.e = g2Var;
        this.f = tL_messages_editChatAdmin;
        this.g = yoVar;
    }

    public /* synthetic */ k3(cx cxVar, org.telegram.ui.ActionBar.t1 t1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = cxVar;
        this.e = t1Var;
        this.d = user;
        this.f = chat;
        this.b = j3;
        this.g = tL_messages_checkHistoryImportPeer;
    }
}
