package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class v7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaDataController b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Utilities.Callback d;

    public /* synthetic */ v7(MediaDataController mediaDataController, String str, Utilities.Callback callback, int i10) {
        this.a = i10;
        this.b = mediaDataController;
        this.c = str;
        this.d = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj2;
        switch (this.a) {
            case 0:
                this.b.lambda$getStickerSet$32(this.c, this.d, bool, tL_messages_stickerSet);
                break;
            default:
                this.b.lambda$getStickerSet$35(this.c, this.d, bool, tL_messages_stickerSet);
                break;
        }
    }
}
