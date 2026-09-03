package org.telegram.ui.Cells;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b2 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e2 b;

    public b2(e2 e2Var, boolean z4) {
        this.b = e2Var;
        this.a = z4;
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
        e2 e2Var = this.b;
        int i10 = e2Var.d;
        int i11 = e2Var.L;
        String str2 = null;
        if (i11 == 5 || i11 == 3) {
            TLRPC.Document document2 = e2Var.H;
            if (document2 != null) {
                str2 = FileLoader.getAttachFileName(document2);
                file = FileLoader.getInstance(i10).getPathToAttach(e2Var.H);
            } else {
                if (e2Var.F.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Utilities.MD5(e2Var.F.content.url));
                    sb.append(".");
                    sb.append(ImageLoader.getHttpUrlExtension(e2Var.F.content.url, e2Var.L == 5 ? "mp3" : "ogg"));
                    str2 = sb.toString();
                    file = new File(FileLoader.getDirectory(4), str2);
                }
                str = null;
                file2 = null;
            }
            file2 = file;
            str = str2;
        } else {
            if (e2Var.M) {
                TLRPC.BotInlineResult botInlineResult = e2Var.F;
                if (botInlineResult != null) {
                    TLRPC.Document document3 = botInlineResult.document;
                    if (document3 instanceof TLRPC.TL_document) {
                        attachFileName = FileLoader.getAttachFileName(document3);
                        pathToAttach = FileLoader.getInstance(i10).getPathToAttach(e2Var.F.document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo instanceof TLRPC.TL_photo) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true);
                            e2Var.K = closestPhotoSizeWithSize;
                            attachFileName = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                            pathToAttach = FileLoader.getInstance(i10).getPathToAttach(e2Var.K);
                        } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(Utilities.MD5(e2Var.F.content.url));
                            sb2.append(".");
                            TLRPC.WebDocument webDocument = e2Var.F.content;
                            sb2.append(ImageLoader.getHttpUrlExtension(webDocument.url, FileLoader.getMimeTypePart(webDocument.mime_type)));
                            attachFileName = sb2.toString();
                            pathToAttach = new File(FileLoader.getDirectory(4), attachFileName);
                            if (e2Var.L == 2) {
                                TLRPC.WebDocument webDocument2 = e2Var.F.thumb;
                                if ((webDocument2 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument2.mime_type)) {
                                    attachFileName = null;
                                }
                            }
                        } else {
                            if (botInlineResult.thumb instanceof TLRPC.TL_webDocument) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(Utilities.MD5(e2Var.F.thumb.url));
                                sb3.append(".");
                                TLRPC.WebDocument webDocument3 = e2Var.F.thumb;
                                sb3.append(ImageLoader.getHttpUrlExtension(webDocument3.url, FileLoader.getMimeTypePart(webDocument3.mime_type)));
                                attachFileName = sb3.toString();
                                pathToAttach = new File(FileLoader.getDirectory(4), attachFileName);
                            }
                            pathToAttach = null;
                            attachFileName = null;
                        }
                    }
                    document = e2Var.H;
                    if (document == null && e2Var.L == 2 && MessageObject.getDocumentVideoThumb(document) != null) {
                        file2 = pathToAttach;
                        str = str2;
                    } else {
                        file2 = pathToAttach;
                        str = attachFileName;
                    }
                } else {
                    TLRPC.Document document4 = e2Var.H;
                    if (document4 != null) {
                        attachFileName = FileLoader.getAttachFileName(document4);
                        pathToAttach = FileLoader.getInstance(i10).getPathToAttach(e2Var.H);
                        document = e2Var.H;
                        if (document == null) {
                        }
                        file2 = pathToAttach;
                        str = attachFileName;
                    }
                    pathToAttach = null;
                    attachFileName = null;
                    document = e2Var.H;
                    if (document == null) {
                    }
                    file2 = pathToAttach;
                    str = attachFileName;
                }
            }
            str = null;
            file2 = null;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(this, str, file2, !TextUtils.isEmpty(str) && file2.exists(), this.a));
    }
}
