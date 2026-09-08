package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class a7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;

    public /* synthetic */ a7(MediaDataController mediaDataController, String str, int i10) {
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
