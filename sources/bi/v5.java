package bi;

import di.u8;
import di.wa;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v5(ja jaVar, Object obj, long j3, int i7) {
        this.a = i7;
        this.c = jaVar;
        this.d = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.a) {
            case 0:
                z5 z5Var = (z5) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                di.c5 c5Var = (di.c5) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                u8.x(z5Var.a, c5Var.a).h(c5Var.b, tL_starGiftUnique, this.b, null, true, new h0(z5Var, bVar, tL_starGiftUnique, 1));
                break;
            case 1:
                wa.d1((wa) this.c, (b41) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                e70 e70Var = (e70) this.c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    np.s1(e70Var.a).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new z60(e70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.l5((Object) e70Var, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 28));
                break;
        }
    }

    public /* synthetic */ v5(e70 e70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = e70Var;
        this.b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
