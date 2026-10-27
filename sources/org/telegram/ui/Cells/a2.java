package org.telegram.ui.Cells;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a2 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d2 b;

    public a2(d2 d2Var, boolean z10) {
        this.b = d2Var;
        this.a = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fe  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        File file2;
        String str;
        String attachFileName;
        File pathToAttach;
        TLRPC.Document document;
        d2 d2Var = this.b;
        int i10 = d2Var.d;
        int i11 = d2Var.P;
        String str2 = null;
        if (i11 == 5 || i11 == 3) {
            TLRPC.Document document2 = d2Var.L;
            if (document2 != null) {
                str2 = FileLoader.getAttachFileName(document2);
                file = FileLoader.getInstance(i10).getPathToAttach(d2Var.L);
            } else {
                if (d2Var.J.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Utilities.MD5(d2Var.J.content.url));
                    sb2.append(".");
                    sb2.append(ImageLoader.getHttpUrlExtension(d2Var.J.content.url, d2Var.P == 5 ? "mp3" : "ogg"));
                    str2 = sb2.toString();
                    file = new File(FileLoader.getDirectory(4), str2);
                }
                str = null;
                file2 = null;
            }
            file2 = file;
            str = str2;
        } else {
            if (d2Var.Q) {
                TLRPC.BotInlineResult botInlineResult = d2Var.J;
                if (botInlineResult != null) {
                    TLRPC.Document document3 = botInlineResult.document;
                    if (document3 instanceof TLRPC.TL_document) {
                        attachFileName = FileLoader.getAttachFileName(document3);
                        pathToAttach = FileLoader.getInstance(i10).getPathToAttach(d2Var.J.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true);
                            d2Var.O = closestPhotoSizeWithSize;
                            attachFileName = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                            pathToAttach = FileLoader.getInstance(i10).getPathToAttach(d2Var.O);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(Utilities.MD5(d2Var.J.content.url));
                            sb3.append(".");
                            TLRPC.WebDocument webDocument = d2Var.J.content;
                            sb3.append(ImageLoader.getHttpUrlExtension(webDocument.url, FileLoader.getMimeTypePart(webDocument.mime_type)));
                            attachFileName = sb3.toString();
                            pathToAttach = new File(FileLoader.getDirectory(4), attachFileName);
                            if (d2Var.P == 2) {
                                TLRPC.WebDocument webDocument2 = d2Var.J.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    attachFileName = null;
                                }
                            }
                        } else {
                            if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(Utilities.MD5(d2Var.J.thumb.url));
                                sb4.append(".");
                                TLRPC.WebDocument webDocument3 = d2Var.J.thumb;
                                sb4.append(ImageLoader.getHttpUrlExtension(webDocument3.url, FileLoader.getMimeTypePart(webDocument3.mime_type)));
                                attachFileName = sb4.toString();
                                pathToAttach = new File(FileLoader.getDirectory(4), attachFileName);
                            }
                            pathToAttach = null;
                            attachFileName = null;
                        }
                    }
                    document = d2Var.L;
                    if (document == null && d2Var.P == 2 && MessageObject.getDocumentVideoThumb(document) != null) {
                        file2 = pathToAttach;
                        str = str2;
                    } else {
                        file2 = pathToAttach;
                        str = attachFileName;
                    }
                } else {
                    TLRPC.Document document4 = d2Var.L;
                    if (document4 != null) {
                        attachFileName = FileLoader.getAttachFileName(document4);
                        pathToAttach = FileLoader.getInstance(i10).getPathToAttach(d2Var.L);
                        document = d2Var.L;
                        if (document == null) {
                        }
                        file2 = pathToAttach;
                        str = attachFileName;
                    }
                    pathToAttach = null;
                    attachFileName = null;
                    document = d2Var.L;
                    if (document == null) {
                    }
                    file2 = pathToAttach;
                    str = attachFileName;
                }
            }
            str = null;
            file2 = null;
        }
        AndroidUtilities.runOnUIThread(new e2.p0(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.a));
    }
}
