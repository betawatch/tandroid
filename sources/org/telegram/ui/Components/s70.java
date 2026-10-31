package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s70(u70 u70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = u70Var;
        this.b = j10;
        this.c = z10;
        this.e = tL_messages_importChatInvite;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                u70 u70Var = (u70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    org.telegram.messenger.vp.r1(u70Var.a).L3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.i0.g3(new n70(u70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.b, 0));
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.kp(u70Var, tL_error, this.c, tL_messages_importChatInvite, 3));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new hf((org.telegram.ui.ua0) this.d, tLObject, this.b, (String) this.e, this.c, tL_error));
                break;
            default:
                org.telegram.messenger.i0.g3(new hf((rh.i) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.c, this.b));
                break;
        }
    }

    public /* synthetic */ s70(org.telegram.ui.ua0 ua0Var, long j10, String str, boolean z10) {
        this.d = ua0Var;
        this.b = j10;
        this.e = str;
        this.c = z10;
    }

    public /* synthetic */ s70(rh.i iVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.d = iVar;
        this.e = twoStepVerificationActivity;
        this.c = z10;
        this.b = j10;
    }
}
