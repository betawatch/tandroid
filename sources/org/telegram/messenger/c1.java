package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;

    public /* synthetic */ c1(ChatObject.Call call, int i10) {
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
