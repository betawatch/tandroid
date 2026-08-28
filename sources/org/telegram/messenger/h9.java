package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class h9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ h9(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i9) {
        this.a = i9;
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
