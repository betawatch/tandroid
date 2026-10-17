package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class sc implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sc(org.telegram.ui.Components.bb bbVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = bbVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                uc.R((uc) this.c, (f61) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            case 1:
                a90.n((a90) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                yh.g4.W((yh.g4) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (h6) obj, (pf.c) obj2);
                break;
        }
    }

    public /* synthetic */ sc(a90 a90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 1;
        this.c = a90Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
