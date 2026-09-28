package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                VoIPService.lambda$callFailed$113(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$createGroupInstance$67(tLObject, tL_error);
                break;
        }
    }
}
