package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ l9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = stickerSet;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.lambda$toggleStickerSetInternal$115(this.c, (ArrayList) obj);
                break;
            default:
                this.b.lambda$toggleStickerSetInternal$112(this.c, (ArrayList) obj);
                break;
        }
    }
}
