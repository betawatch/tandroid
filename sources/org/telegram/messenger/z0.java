package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;

    public /* synthetic */ z0(ChatObject.Call call, int i10) {
        this.a = i10;
        this.b = call;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$loadGroupCall$11(tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$reloadGroupCall$9(tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$setTitle$4(tLObject, tL_error);
                break;
            default:
                this.b.lambda$toggleRecord$13(tLObject, tL_error);
                break;
        }
    }
}
