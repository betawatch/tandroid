package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class wa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wa(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.c).lambda$checkChatlistFolderUpdate$478(this.b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                break;
            case 1:
                ((FileLoadOperation) this.c).lambda$startDownloadRequest$28(this.b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.b, tLObject, tL_error);
                break;
            case 3:
                ((MediaDataController) this.c).lambda$loadStickers$97(this.b, (Utilities.Callback) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.c).lambda$registerForPush$324(this.b, (String) this.d, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ wa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.a = 2;
        this.c = mediaDataController;
        this.d = stickerSet;
        this.b = i10;
    }
}
