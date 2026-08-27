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
import org.telegram.ui.Components.pz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g4 implements DownloadController.FileDownloadProgressListener {
    public TLRPC.MessageExtendedMedia A;
    public String B;
    public final RadialProgress2 C;
    public int D;
    public final int E;
    public final int F;
    public int G;
    public pz0 H;
    public boolean I;
    public int a;
    public int b;
    public int c;
    public int d;
    public final s1 e;
    public final ImageReceiver f;
    public boolean h;
    public final int n;
    public final int r;
    public final float[] s = new float[8];
    public String v;
    public final boolean w;
    public final boolean x;
    public boolean y;

    public g4(s1 s1Var, MessageObject messageObject, TLRPC.MessageExtendedMedia messageExtendedMedia, boolean z10, int i10, int i11) {
        new RectF();
        new Path();
        this.D = 4;
        this.F = 0;
        this.G = 0;
        this.e = s1Var;
        this.w = z10;
        this.x = false;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.x = (messageMedia instanceof TLRPC.TL_messageMediaDocument) && MessageObject.isVideoDocument(messageMedia.document);
            this.F = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(messageMedia.document)));
        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia;
            this.x = (4 & tL_messageExtendedMediaPreview.flags) != 0;
            this.F = tL_messageExtendedMediaPreview.video_duration;
        }
        if (this.x) {
            int i12 = this.F;
            this.G = i12;
            this.H = new pz0(AndroidUtilities.formatLongDuration(i12), 12.0f, null);
        }
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f = imageReceiver;
        imageReceiver.setColorFilter(null);
        this.n = i10;
        this.r = i11;
        this.E = DownloadController.getInstance(s1Var.E7).generateObserverTag();
        c(messageExtendedMedia, messageObject);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, s1Var.getResourcesProvider());
        this.C = radialProgress2;
        int a2 = a();
        this.D = a2;
        radialProgress2.setIcon(a2, false, false);
    }

    public final int a() {
        return (!this.x || this.y) ? 4 : 0;
    }

    public final void b(int i10) {
        if (i10 != this.D) {
            this.D = i10;
            this.C.setIcon(i10, true, true);
        }
    }

    public final void c(TLRPC.MessageExtendedMedia messageExtendedMedia, MessageObject messageObject) {
        TLRPC.Document document;
        if (this.A == messageExtendedMedia) {
            return;
        }
        this.A = messageExtendedMedia;
        this.y = false;
        int i10 = this.n;
        int i11 = this.r;
        String l10 = com.google.android.recaptcha.internal.a.l(i10, "_", i11);
        boolean z10 = messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview;
        ImageReceiver imageReceiver = this.f;
        if (z10) {
            this.h = true;
            this.v = null;
            this.f.setImage(ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).thumb, messageObject.messageOwner), s3.c.l(l10, "_b2"), null, null, messageObject, 0);
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
                l10 = s3.c.l(l10, "_b3");
            }
            imageReceiver.setColorFilter(null);
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            this.v = MessageObject.getFileName(messageMedia);
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, AndroidUtilities.getPhotoSize(), true, null, true);
                this.f.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, tL_messageMediaPhoto.photo), l10, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaPhoto.photo.sizes, Math.min(i10, i11) / 100, false, closestPhotoSizeWithSize, false), tL_messageMediaPhoto.photo), l10, 0L, null, messageObject, 0);
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
                        this.f.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize2, tL_messageMediaDocument.document), l10, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_messageMediaDocument.document.thumbs, Math.min(i10, i11), false, closestPhotoSizeWithSize2, false), tL_messageMediaDocument.document), l10, 0L, null, messageObject, 0);
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
                StringBuilder o10 = com.google.android.recaptcha.internal.a.o(l10);
                o10.append(this.y ? "_g" : "");
                String str = l10;
                this.f.setImage(imageLocation, o10.toString(), forDocument2, str, forDocument3, str, null, 0L, null, messageObject, 0);
            }
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.E;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.A.downloadProgress = min;
        this.C.o(min, true);
        b(min < 1.0f ? 3 : a());
        this.e.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.A.uploadProgress = min;
        this.C.o(min, true);
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
