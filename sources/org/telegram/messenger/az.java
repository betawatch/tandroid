package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
