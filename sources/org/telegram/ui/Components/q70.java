package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q70 implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q70(ha haVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = haVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.a) {
            case 0:
                u70 u70Var = (u70) this.c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.vp.r1(u70Var.a).L3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.i0.g3(new n70(u70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((Object) u70Var, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 14));
                break;
            case 1:
                ph.q3 q3Var = (ph.q3) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                rh.d3 d3Var = (rh.d3) obj;
                gf.e eVar = (gf.e) obj2;
                eVar.d();
                rh.e6.x(q3Var.a, d3Var.a).h(d3Var.b, tL_starGiftUnique, this.b, null, true, new org.telegram.tgnet.e(q3Var, eVar, tL_starGiftUnique, 6));
                break;
            default:
                rh.t7.d1((rh.t7) this.c, (a51) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
        }
    }

    public /* synthetic */ q70(u70 u70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 0;
        this.c = u70Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
