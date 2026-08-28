package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ org.telegram.ui.Cells.t1 e;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet f;

    public /* synthetic */ ev0(TLRPC.Document document, int i9, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.a = i10;
        this.b = document;
        this.c = i9;
        this.d = messageObject;
        this.e = t1Var;
        this.f = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Document document = this.b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i9 = this.c;
                DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i9).loadFile(document, this.f, 1, 1);
                break;
            default:
                TLRPC.Document document2 = this.b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i10 = this.c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document2, this.f, 1, 1);
                break;
        }
    }
}
