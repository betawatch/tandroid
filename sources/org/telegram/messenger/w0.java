package org.telegram.messenger;

import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatObject.Call b;

    public /* synthetic */ w0(ChatObject.Call call, int i10) {
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
