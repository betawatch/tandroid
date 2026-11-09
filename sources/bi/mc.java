package bi;

import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mc(org.telegram.ui.Components.na naVar, Object obj, long j3, int i7) {
        this.a = i7;
        this.c = naVar;
        this.d = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.a) {
            case 0:
                oc.d1((oc) this.c, (y31) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            case 1:
                c70 c70Var = (c70) this.c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    qp.s1(c70Var.a).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new x60(c70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6(c70Var, tL_error, updates, tL_messages_importChatInvite, 24));
                break;
            default:
                zh.l3 l3Var = (zh.l3) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                h6 h6Var = (h6) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                ea.x(l3Var.a, h6Var.a).h(h6Var.b, tL_starGiftUnique, this.b, null, true, new t0(l3Var, bVar, tL_starGiftUnique, 8));
                break;
        }
    }

    public /* synthetic */ mc(c70 c70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 1;
        this.c = c70Var;
        this.b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
