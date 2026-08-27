package gh;

import hh.x9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.t70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class p5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p5(qa qaVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = qaVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                x5.V((x5) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (hh.k4) obj, (we.d) obj2);
                break;
            case 1:
                x9.Q((x9) this.c, (n41) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                t70.m((t70) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ p5(t70 t70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = t70Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
