package org.telegram.ui.Cells;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.l01;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j4 implements DownloadController.FileDownloadProgressListener {
    public TLRPC.MessageExtendedMedia B;
    public String C;
    public final RadialProgress2 D;
    public int E;
    public final int F;
    public final int G;
    public int H;
    public l01 I;
    public boolean J;
    public int a;
    public int b;
    public int c;
    public int d;
    public final t1 e;
    public final ImageReceiver f;
    public boolean h;
    public final int n;
    public final int r;
    public final float[] s = new float[8];
    public String v;
    public final boolean w;
    public final boolean x;
    public boolean y;

    public j4(t1 t1Var, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z4, int i10, int i11) {
        new RectF();
        new Path();
        this.E = 4;
        this.G = 0;
        this.H = 0;
        this.e = t1Var;
        this.w = z4;
        this.x = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.x = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document);
            this.G = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.x = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.G = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.x) {
            int i12 = this.G;
            this.H = i12;
            this.I = new l01(AndroidUtilities.formatLongDuration(i12), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f = imageReceiver;
        imageReceiver.setColorFilter(null);
        this.n = i10;
        this.r = i11;
        this.F = DownloadController.getInstance(t1Var.F7).generateObserverTag();
        c(messageExtendedMedia, messageObject);
        RadialProgress2 radialProgress2 = new RadialProgress2(t1Var, t1Var.getResourcesProvider());
        this.D = radialProgress2;
        int a2 = a();
        this.E = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        return (!this.x || this.y) ? 4 : 0;
    }

    public final void b(int i10) {
        if (i10 != this.E) {
            this.E = i10;
            this.D.setIcon(i10, true, true);
        }
    }

    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
        TLRPC.Document document;
        if (this.B == messageExtendedMedia) {
            return;
        }
        this.B = messageExtendedMedia;
        this.y = false;
        int i10 = this.n;
        int i11 = this.r;
        String h = e2.c.h(i10, "_", i11);
        boolean z4 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f;
        if (z4) {
            this.h = true;
            this.v = null;
            this.f.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), w.c.e(h, "_b2"), null, null, messageObject, 0);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.4f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
            imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return;
        }
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            boolean z10 = messageObject.isRepostPreview;
            this.h = z10;
            if (z10) {
                h = w.c.e(h, "_b3");
            }
            imageReceiver.setColorFilter(null);
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.v = MessageObject.getFileName(messageMedia);
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                this.f.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), h, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), h, 0L, null, messageObject, 0);
                return;
            }
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                boolean z11 = this.h;
                boolean z12 = this.x;
                boolean z13 = this.w;
                this.y = !z11 && !z13 && z12 && SharedConfig.isAutoplayVideo();
                if (z13 || !z12 || (document = tL_messageMediaDocument.document) == null) {
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    if (document2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.f.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document), h, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize2, false), tL_messageMediaDocument.document), h, 0L, null, messageObject, 0);
                        return;
                    }
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize3, false);
                ImageLocation forDocument = ImageLocation.getForDocument(tL_messageMediaDocument.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize3, tL_messageMediaDocument.document);
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, tL_messageMediaDocument.document);
                ImageLocation imageLocation = this.y ? forDocument : null;
                StringBuilder l10 = e2.c.l(h);
                l10.append(this.y ? "_g" : "");
                String str = h;
                this.f.setImage(imageLocation, l10.toString(), forDocument2, str, forDocument3, str, null, 0L, null, messageObject, 0);
            }
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.F;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.B.downloadProgress = min;
        this.D.o(min, true);
        b(min < 1.0f ? 3 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.B.uploadProgress = min;
        this.D.o(min, true);
        b(min < 1.0f ? 3 : this.w ? 6 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
    }
}
