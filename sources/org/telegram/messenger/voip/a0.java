package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ a0(int i7) {
        this.a = i7;
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
