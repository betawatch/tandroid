package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ BaseController d;

    public /* synthetic */ c8(BaseController baseController, boolean z10, long j10, int i10) {
        this.a = i10;
        this.d = baseController;
        this.b = z10;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.d).lambda$loadFeaturedStickers$58(this.b, this.c, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.d).lambda$getChannelRecommendations$485(this.b, this.c, tLObject, tL_error);
                break;
        }
    }
}
