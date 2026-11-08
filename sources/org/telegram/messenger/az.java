package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class az implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_stickers_createStickerSet a;
    public final /* synthetic */ bz b;

    public az(bz bzVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.b = bzVar;
        this.a = tL_stickers_createStickerSet;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new em(this, tL_error, this.a, tLObject, 26));
    }
}
