package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ int c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ org.telegram.ui.Cells.t1 e;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet f;

    public /* synthetic */ vv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.a = i11;
        this.b = document;
        this.c = i10;
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
                int i10 = this.c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f, 1, 1);
                break;
            default:
                TLRPC.Document document2 = this.b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f, 1, 1);
                break;
        }
    }
}
