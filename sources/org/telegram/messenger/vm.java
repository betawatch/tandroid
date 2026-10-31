package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class vm implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ us c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vm(vp vpVar, long j10, Runnable runnable, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin, gp gpVar) {
        this.a = 0;
        this.c = vpVar;
        this.b = j10;
        this.d = runnable;
        this.e = k2Var;
        this.f = tL_messages_editChatAdmin;
        this.g = gpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.c;
                Runnable runnable = (Runnable) this.d;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.e;
                TLRPC.TL_messages_editChatAdmin tL_messages_editChatAdmin = (TLRPC.TL_messages_editChatAdmin) this.f;
                gp gpVar = (gp) this.g;
                if (tL_error != null) {
                    i0.g3(new ul(vpVar, tL_error, k2Var, tL_messages_editChatAdmin, 3));
                    if (gpVar != null) {
                        i0.g3(new en(gpVar, tL_error, 1));
                        break;
                    }
                } else {
                    i0.h3(new bn(vpVar, this.b, runnable, 2), 1000L);
                    break;
                }
                break;
            case 1:
                i0.g3(new e10((org.telegram.ui.ay) this.c, (org.telegram.ui.ActionBar.x1) this.d, tLObject, (TLRPC.User) this.e, (TLRPC.Chat) this.f, this.b, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.g));
                break;
            default:
                i0.g3(new e10((rh.e4) this.c, (gf.e) this.d, (org.telegram.ui.ActionBar.x1) this.e, tLObject, (TL_stars.TL_starGiftUnique) this.f, tL_error, this.b, (CharSequence) this.g));
                break;
        }
    }

    public /* synthetic */ vm(us usVar, Object obj, Object obj2, TLObject tLObject, long j10, Object obj3, int i10) {
        this.a = i10;
        this.c = usVar;
        this.d = obj;
        this.e = obj2;
        this.f = tLObject;
        this.b = j10;
        this.g = obj3;
    }
}
