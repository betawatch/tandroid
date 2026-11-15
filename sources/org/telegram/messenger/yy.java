package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class yy implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_stickers_createStickerSet a;
    public final /* synthetic */ zy b;

    public yy(zy zyVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.b = zyVar;
        this.a = tL_stickers_createStickerSet;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new bm(this, tL_error, this.a, tLObject, 26));
    }
}
