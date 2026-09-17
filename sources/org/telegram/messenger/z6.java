package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z6 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ z6(MediaDataController mediaDataController, String str, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$verifyAnimatedStickerMessageInternal$70(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$fetchStickerSetInternal$42(this.c, tLObject, tL_error);
                break;
        }
    }
}
