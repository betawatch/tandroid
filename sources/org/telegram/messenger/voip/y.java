package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i3) {
        this.a = i3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                VoIPService.lambda$callFailed$114(tLObject, tL_error);
                break;
            default:
                VoIPService.lambda$createGroupInstance$67(tLObject, tL_error);
                break;
        }
    }
}
