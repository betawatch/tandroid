package bi;

import di.ab;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.xz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h8(ra raVar, Object obj, long j3, int i7) {
        this.a = i7;
        this.c = raVar;
        this.d = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.a) {
            case 0:
                l8 l8Var = (l8) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                di.f5 f5Var = (di.f5) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                di.y8.x(l8Var.a, f5Var.a).h(f5Var.b, tL_starGiftUnique, this.b, null, true, new h0(l8Var, bVar, tL_starGiftUnique, 2));
                break;
            case 1:
                ab.e1((ab) this.c, (n41) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                o70 o70Var = (o70) this.c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    mp.u1(o70Var.a).V3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.g3(new j70(o70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.g3(new xz(o70Var, tL_error, updates, tL_messages_importChatInvite, 2));
                break;
        }
    }

    public /* synthetic */ h8(o70 o70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = o70Var;
        this.b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
