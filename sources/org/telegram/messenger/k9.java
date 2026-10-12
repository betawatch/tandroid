package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ k9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
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
