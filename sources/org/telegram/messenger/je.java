package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class je implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ je(BaseController baseController, long j10, int i10, int i11) {
        this.a = i11;
        this.d = baseController;
        this.b = j10;
        this.c = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.d).lambda$approveOrRejectSuggestedMessageImpl$512(this.b, this.c, tLObject, tL_error);
                break;
            case 1:
                ((TopicsController) this.d).lambda$loadTopics$7(this.b, this.c, tLObject, tL_error);
                break;
            default:
                AndroidUtilities.runOnUIThread(new bi.da((org.telegram.ui.j4) this.d, tLObject, this.c, this.b, 14));
                break;
        }
    }

    public /* synthetic */ je(org.telegram.ui.j4 j4Var, int i10, long j10) {
        this.a = 2;
        this.d = j4Var;
        this.c = i10;
        this.b = j10;
    }
}
