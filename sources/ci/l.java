package ci;

import org.telegram.messenger.hp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.m90;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(v vVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.d = vVar;
        this.e = twoStepVerificationActivity;
        this.c = z10;
        this.b = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new n((v) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.b));
                break;
            case 1:
                x60 x60Var = (x60) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    hp.s1(x60Var.a).O3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new r60(x60Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.b, 0));
                }
                org.telegram.messenger.g0.h3(new rn(x60Var, tL_error, this.c, tL_messages_importChatInvite, 5));
                break;
            default:
                org.telegram.messenger.g0.h3(new n((m90) this.d, tLObject, this.b, (String) this.e, this.c, tL_error));
                break;
        }
    }

    public /* synthetic */ l(x60 x60Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = x60Var;
        this.b = j10;
        this.c = z10;
        this.e = tL_messages_importChatInvite;
    }

    public /* synthetic */ l(m90 m90Var, long j10, String str, boolean z10) {
        this.d = m90Var;
        this.b = j10;
        this.e = str;
        this.c = z10;
    }
}
