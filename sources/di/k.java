package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.z60;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.q90;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.e = twoStepVerificationActivity;
        this.c = z10;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new l((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.b));
                break;
            case 1:
                e70 e70Var = (e70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    np.s1(e70Var.a).O3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new z60(e70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.b, 0));
                }
                org.telegram.messenger.g0.h3(new wn(e70Var, tL_error, this.c, tL_messages_importChatInvite, 5));
                break;
            default:
                org.telegram.messenger.g0.h3(new l((q90) this.d, tLObject, this.b, (String) this.e, this.c, tL_error));
                break;
        }
    }

    public /* synthetic */ k(e70 e70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = e70Var;
        this.b = j3;
        this.c = z10;
        this.e = tL_messages_importChatInvite;
    }

    public /* synthetic */ k(q90 q90Var, long j3, String str, boolean z10) {
        this.d = q90Var;
        this.b = j3;
        this.e = str;
        this.c = z10;
    }
}
