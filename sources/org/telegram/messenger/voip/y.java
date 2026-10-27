package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ y(int i10) {
        this.a = i10;
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
