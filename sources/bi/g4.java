package bi;

import org.telegram.messenger.an;
import org.telegram.messenger.bp;
import org.telegram.messenger.em;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.xm;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g4 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ ls c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g4(k7 k7Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, CharSequence charSequence) {
        this.c = k7Var;
        this.d = bVar;
        this.e = u1Var;
        this.f = tL_starGiftUnique;
        this.b = j3;
        this.g = charSequence;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new m4((k7) this.c, (vf.b) this.d, (org.telegram.ui.ActionBar.u1) this.e, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.b, (CharSequence) this.g));
                break;
            case 1:
                qp qpVar = (qp) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f;
                bp bpVar = (bp) this.g;
                if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new em(qpVar, tL_error, f2Var, tL_messages_editChatAdmin, 3));
                    if (bpVar != null) {
                        org.telegram.messenger.g0.h3(new an(bpVar, tL_error, 0));
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.i3(new xm(qpVar, this.b, runnable, 1), 1000L);
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new m4((ww) this.c, (org.telegram.ui.ActionBar.u1) this.e, tLObject, (TLRPC.User) this.d, (TLRPC.Chat) this.f, this.b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
        }
    }

    public /* synthetic */ g4(qp qpVar, long j3, Runnable runnable, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, bp bpVar) {
        this.c = qpVar;
        this.b = j3;
        this.d = runnable;
        this.e = f2Var;
        this.f = tL_messages_editChatAdmin;
        this.g = bpVar;
    }

    public /* synthetic */ g4(ww wwVar, org.telegram.ui.ActionBar.u1 u1Var, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.c = wwVar;
        this.e = u1Var;
        this.d = user;
        this.f = chat;
        this.b = j3;
        this.g = tL_messages_checkHistoryImportPeer;
    }
}
