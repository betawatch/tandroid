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
import org.telegram.ui.Components.t01;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j4 implements DownloadController.FileDownloadProgressListener {
    public TLRPC.MessageExtendedMedia E;
    public String F;
    public final RadialProgress2 G;
    public int H;
    public final int I;
    public final int J;
    public int K;
    public t01 L;
    public boolean M;
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

    public j4(t1 t1Var, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i10, int i11) {
        new RectF();
        new Path();
        this.H = 4;
        this.J = 0;
        this.K = 0;
        this.e = t1Var;
        this.w = z10;
        this.x = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.x = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document);
            this.J = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.x = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.J = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.x) {
            int i12 = this.J;
            this.K = i12;
            this.L = new t01(AndroidUtilities.formatLongDuration(i12), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f = imageReceiver;
        imageReceiver.setColorFilter(null);
        this.n = i10;
        this.r = i11;
        this.I = DownloadController.getInstance(t1Var.I7).generateObserverTag();
        c(messageExtendedMedia, messageObject);
        RadialProgress2 radialProgress2 = new RadialProgress2(t1Var, t1Var.getResourcesProvider());
        this.G = radialProgress2;
        int a2 = a();
        this.H = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        return (!this.x || this.y) ? 4 : 0;
    }

    public final void b(int i10) {
        if (i10 != this.H) {
            this.H = i10;
            this.G.setIcon(i10, true, true);
        }
    }

    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
        TLRPC.Document document;
        if (this.E == messageExtendedMedia) {
            return;
        }
        this.E = messageExtendedMedia;
        this.y = false;
        int i10 = this.n;
        int i11 = this.r;
        String k10 = a4.a.k(i10, i11, "_");
        boolean z10 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f;
        if (z10) {
            this.h = true;
            this.v = null;
            this.f.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), r6.t(k10, "_b2"), null, null, messageObject, 0);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.4f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
            imageReceiver.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return;
        }
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            boolean z11 = messageObject.isRepostPreview;
            this.h = z11;
            if (z11) {
                k10 = r6.t(k10, "_b3");
            }
            imageReceiver.setColorFilter(null);
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.v = MessageObject.getFileName(messageMedia);
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                this.f.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), k10, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), k10, 0L, null, messageObject, 0);
                return;
            }
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                boolean z12 = this.h;
                boolean z13 = this.x;
                boolean z14 = this.w;
                this.y = !z12 && !z14 && z13 && SharedConfig.isAutoplayVideo();
                if (z14 || !z13 || (document = tL_messageMediaDocument.document) == null) {
                    TLRPC.Document document2 = tL_messageMediaDocument.document;
                    if (document2 != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                        this.f.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document), k10, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize2, false), tL_messageMediaDocument.document), k10, 0L, null, messageObject, 0);
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
                StringBuilder u10 = a4.a.u(k10);
                u10.append(this.y ? "_g" : "");
                String str = k10;
                this.f.setImage(imageLocation, u10.toString(), forDocument2, str, forDocument3, str, null, 0L, null, messageObject, 0);
            }
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.I;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.E.downloadProgress = min;
        this.G.o(min, true);
        b(min < 1.0f ? 3 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.E.uploadProgress = min;
        this.G.o(min, true);
        b(min < 1.0f ? 3 : this.w ? 6 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }
}
