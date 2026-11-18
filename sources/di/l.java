package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.r90;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.e = twoStepVerificationActivity;
        this.c = z10;
        this.b = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new m((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.b));
                break;
            case 1:
                p70 p70Var = (p70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    mp.u1(p70Var.a).V3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.g3(new k70(p70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.b, 0));
                }
                org.telegram.messenger.g0.g3(new yn(p70Var, tL_error, this.c, tL_messages_importChatInvite, 5));
                break;
            default:
                org.telegram.messenger.g0.g3(new m((r90) this.d, tLObject, this.b, (String) this.e, this.c, tL_error));
                break;
        }
    }

    public /* synthetic */ l(p70 p70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = p70Var;
        this.b = j3;
        this.c = z10;
        this.e = tL_messages_importChatInvite;
    }

    public /* synthetic */ l(r90 r90Var, long j3, String str, boolean z10) {
        this.d = r90Var;
        this.b = j3;
        this.e = str;
        this.c = z10;
    }
}
