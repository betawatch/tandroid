package lh;

import mh.t9;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i5 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i5(sa saVar, Object obj, long j10, int i10) {
        this.a = i10;
        this.c = saVar;
        this.d = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                q5.V((q5) this.c, (TL_stars.TL_starGiftUnique) this.d, this.b, (mh.i4) obj, (af.f) obj2);
                break;
            case 1:
                t9.Q((t9) this.c, (j51) this.d, this.b, (Boolean) obj, (String) obj2);
                break;
            default:
                j80.m((j80) this.c, this.b, (TLRPC.TL_messages_importChatInvite) this.d, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }

    public /* synthetic */ i5(j80 j80Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.a = 2;
        this.c = j80Var;
        this.b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
