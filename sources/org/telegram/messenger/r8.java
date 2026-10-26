package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Utilities.Callback e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ TLRPC.InputStickerSet h;

    public /* synthetic */ r8(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Utilities.Callback callback, boolean z10, TLRPC.InputStickerSet inputStickerSet, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = tL_messages_stickerSet;
        this.d = str;
        this.e = callback;
        this.f = z10;
        this.h = inputStickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getStickerSet$33(this.c, this.d, this.e, this.f, this.h);
                break;
            default:
                this.b.lambda$getStickerSet$36(this.c, this.d, this.e, this.f, this.h);
                break;
        }
    }
}
