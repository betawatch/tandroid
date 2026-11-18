package bi;

import di.ab;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b8(sa saVar, Object obj, long j3, int i7) {
        this.a = i7;
        this.c = saVar;
        this.d = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.a) {
            case 0:
                f8 f8Var = (f8) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                di.f5 f5Var = (di.f5) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                di.x8.x(f8Var.a, f5Var.a).h(f5Var.b, tL_starGiftUnique, this.b, null, true, new h0(f8Var, bVar, tL_starGiftUnique, 2));
                break;
            case 1:
                ab.e1((ab) this.c, (l41) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                p70 p70Var = (p70) this.c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    mp.u1(p70Var.a).V3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.g3(new k70(p70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.g3(new n20(p70Var, tL_error, updates, tL_messages_importChatInvite, 1));
                break;
        }
    }

    public /* synthetic */ b8(p70 p70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = p70Var;
        this.b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
