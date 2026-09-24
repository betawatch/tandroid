package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;

    public /* synthetic */ x0(ChatObject.Call call, int i10) {
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
