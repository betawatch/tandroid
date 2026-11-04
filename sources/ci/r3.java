package ci;

import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.nm;
import org.telegram.messenger.qm;
import org.telegram.messenger.so;
import org.telegram.messenger.ul;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ cs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ r3(l6 l6Var, sf.b bVar, org.telegram.ui.ActionBar.s1 s1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, CharSequence charSequence) {
        this.c = l6Var;
        this.d = bVar;
        this.e = s1Var;
        this.f = tL_starGiftUnique;
        this.b = j10;
        this.g = charSequence;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new w3((l6) this.c, (sf.b) this.d, (org.telegram.ui.ActionBar.s1) this.e, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.b, (CharSequence) this.g));
                break;
            case 1:
                hp hpVar = (hp) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f;
                so soVar = (so) this.g;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new ul(hpVar, tL_error, d2Var, tL_messages_editChatAdmin, 3));
                    if (soVar != null) {
                        org.telegram.messenger.g0.h3(new qm(soVar, tL_error, 0));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.i3(new nm(hpVar, this.b, runnable, 1), 1000L);
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new w3((uw) this.c, (org.telegram.ui.ActionBar.s1) this.e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f, this.b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
        }
    }

    public /* synthetic */ r3(hp hpVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, so soVar) {
        this.c = hpVar;
        this.b = j10;
        this.d = runnable;
        this.e = d2Var;
        this.f = tL_messages_editChatAdmin;
        this.g = soVar;
    }

    public /* synthetic */ r3(uw uwVar, org.telegram.ui.ActionBar.s1 s1Var, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = uwVar;
        this.e = s1Var;
        this.d = user;
        this.f = chat;
        this.b = j10;
        this.g = tL_messages_checkHistoryImportPeer;
    }
}
