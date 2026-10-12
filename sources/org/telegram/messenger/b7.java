package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ BaseController e;

    public /* synthetic */ b7(BaseController baseController, int i10, String str, String str2, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = i10;
        this.c = str;
        this.d = str2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$213(this.b, this.c, this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$168(this.b, this.c, this.d, tLObject, tL_error);
                break;
        }
    }
}
