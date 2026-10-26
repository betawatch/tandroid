package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class lc implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lc(org.telegram.ui.Components.bb bbVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = bbVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                nc.Q((nc) this.c, (t61) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            case 1:
                c90.m((c90) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                zh.g4.V((zh.g4) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (d6) obj, (qf.c) obj2);
                break;
        }
    }

    public /* synthetic */ lc(c90 c90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 1;
        this.c = c90Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
