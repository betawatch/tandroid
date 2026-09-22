package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ j9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
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
