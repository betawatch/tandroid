package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class de implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ de(BaseController baseController, long j3, int i10, int i11) {
        this.a = i11;
        this.d = baseController;
        this.b = j3;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$506(this.b, this.c, tLObject, tL_error);
                break;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.b, this.c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new j7((org.telegram.ui.i4) this.d, tLObject, this.c, this.b, 11));
                break;
        }
    }

    public /* synthetic */ de(org.telegram.ui.i4 i4Var, int i10, long j3) {
        this.a = 2;
        this.d = i4Var;
        this.c = i10;
        this.b = j3;
    }
}
