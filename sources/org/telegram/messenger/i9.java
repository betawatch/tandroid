package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class i9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ i9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
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
