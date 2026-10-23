package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class uc implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uc(org.telegram.ui.Components.bb bbVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = bbVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wc.Q((wc) this.c, (m61) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            case 1:
                b90.m((b90) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                yh.f4.V((yh.f4) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (i6) obj, (pf.c) obj2);
                break;
        }
    }

    public /* synthetic */ uc(b90 b90Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 1;
        this.c = b90Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
