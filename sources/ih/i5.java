package ih;

import jh.s9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xa;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class i5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i5(xa xaVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = xaVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                q5.V((q5) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (jh.j4) obj, (ye.c) obj2);
                break;
            case 1:
                s9.Q((s9) this.c, (w41) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                c80.m((c80) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ i5(c80 c80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = c80Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
