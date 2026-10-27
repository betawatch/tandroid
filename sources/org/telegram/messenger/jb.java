package org.telegram.messenger;

import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class jb implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jb(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((MessagesController) this.c).lambda$checkChatlistFolderUpdate$484(this.b, (MessagesController.ChatlistUpdatesStat) this.d, tLObject, tL_error);
                break;
            case 1:
                ((FileLoadOperation) this.c).lambda$startDownloadRequest$29(this.b, (FileLoadOperation.RequestInfo) this.d, tLObject, tL_error);
                break;
            case 2:
                ((MediaDataController) this.c).lambda$toggleStickerSetInternal$117((TLRPC.StickerSet) this.d, this.b, tLObject, tL_error);
                break;
            case 3:
                ((MediaDataController) this.c).lambda$loadStickers$97(this.b, (Utilities.Callback) this.d, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.c).lambda$registerForPush$325(this.b, (String) this.d, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ jb(MediaDataController mediaDataController, TLRPC.StickerSet stickerSet, int i10) {
        this.a = 2;
        this.c = mediaDataController;
        this.d = stickerSet;
        this.b = i10;
    }
}
