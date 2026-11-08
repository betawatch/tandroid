package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.w60;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p90;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m(z zVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, long j3) {
        this.d = zVar;
        this.e = twoStepVerificationActivity;
        this.c = z9;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new o((z) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.b));
                break;
            case 1:
                b70 b70Var = (b70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    qp.s1(b70Var.a).O3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new w60(b70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.b, 0));
                }
                org.telegram.messenger.g0.h3(new vn(b70Var, tL_error, this.c, tL_messages_importChatInvite, 5));
                break;
            default:
                org.telegram.messenger.g0.h3(new o((p90) this.d, tLObject, this.b, (String) this.e, this.c, tL_error));
                break;
        }
    }

    public /* synthetic */ m(b70 b70Var, long j3, boolean z9, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = b70Var;
        this.b = j3;
        this.c = z9;
        this.e = tL_messages_importChatInvite;
    }

    public /* synthetic */ m(p90 p90Var, long j3, String str, boolean z9) {
        this.d = p90Var;
        this.b = j3;
        this.e = str;
        this.c = z9;
    }
}
