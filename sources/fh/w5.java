package fh;

import gh.y9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w5(sa saVar, Object obj, long j10, int i9) {
        this.a = i9;
        this.c = saVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                f6.U((f6) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (gh.m4) obj, (ve.d) obj2);
                break;
            case 1:
                y9.P((y9) this.c, (l41) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                p70.m((p70) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ w5(p70 p70Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = p70Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
