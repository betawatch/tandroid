package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class sa implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sa(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
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

    public /* synthetic */ sa(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i9) {
        this.a = 2;
        this.c = mediaDataController;
        this.d = stickerSet;
        this.b = i9;
    }
}
