package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class y6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ BaseController e;

    public /* synthetic */ y6(BaseController baseController, int i10, String str, String str2, int i11) {
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
