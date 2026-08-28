package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yd implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yd(BaseController baseController, long j10, int i9, int i10) {
        this.a = i10;
        this.d = baseController;
        this.b = j10;
        this.c = i9;
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
                AndroidUtilities.runOnUIThread(new gh.c9((org.telegram.ui.l4) this.d, tLObject, this.c, this.b, 12));
                break;
        }
    }

    public /* synthetic */ yd(org.telegram.ui.l4 l4Var, int i9, long j10) {
        this.a = 2;
        this.d = l4Var;
        this.c = i9;
        this.b = j10;
    }
}
