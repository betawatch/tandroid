package bi;

import di.ab;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e8(sa saVar, Object obj, long j3, int i7) {
        this.a = i7;
        this.c = saVar;
        this.d = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.a) {
            case 0:
                i8 i8Var = (i8) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                di.f5 f5Var = (di.f5) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                di.y8.x(i8Var.a, f5Var.a).h(f5Var.b, tL_starGiftUnique, this.b, null, true, new h0(i8Var, bVar, tL_starGiftUnique, 2));
                break;
            case 1:
                ab.e1((ab) this.c, (o41) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                r70 r70Var = (r70) this.c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    np.u1(r70Var.a).V3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.g3(new m70(r70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.g3(new q20(r70Var, tL_error, updates, tL_messages_importChatInvite, 1));
                break;
        }
    }

    public /* synthetic */ e8(r70 r70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = r70Var;
        this.b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
