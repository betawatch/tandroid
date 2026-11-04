package ai;

import ci.e9;
import ci.hb;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d6(ma maVar, Object obj, long j10, int i3) {
        this.a = i3;
        this.c = maVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.a) {
            case 0:
                h6 h6Var = (h6) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                ci.l5 l5Var = (ci.l5) obj;
                sf.b bVar = (sf.b) obj2;
                bVar.d();
                e9.x(h6Var.a, l5Var.a).h(l5Var.b, tL_starGiftUnique, this.b, null, true, new n0(h6Var, bVar, tL_starGiftUnique, 1));
                break;
            case 1:
                hb.d1((hb) this.c, (r31) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                x60 x60Var = (x60) this.c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    hp.s1(x60Var.a).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new r60(x60Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new v60(x60Var, tL_error, updates, tL_messages_importChatInvite, 0));
                break;
        }
    }

    public /* synthetic */ d6(x60 x60Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = x60Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
