package kh;

import lh.t9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h5(sa saVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = saVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                p5.V((p5) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (lh.i4) obj, (ze.c) obj2);
                break;
            case 1:
                t9.Q((t9) this.c, (i51) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                i80.m((i80) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ h5(i80 i80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = i80Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
