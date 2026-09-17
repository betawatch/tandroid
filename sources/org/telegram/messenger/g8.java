package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ BaseController e;

    public /* synthetic */ g8(BaseController baseController, int i10, String str, String str2, int i11) {
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
                ((MediaDataController) this.e).lambda$fetchNewEmojiKeywords$212(this.b, this.c, this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.e).lambda$checkPromoInfoInternal$169(this.b, this.c, this.d, tLObject, tL_error);
                break;
        }
    }
}
