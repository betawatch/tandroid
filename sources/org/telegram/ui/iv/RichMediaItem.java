package org.telegram.ui.iv;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RadialProgress2;

/* loaded from: classes3.dex */
public class RichMediaItem {
    private static ColorMatrixColorFilter fancyBlurFilter;
    private boolean attached;
    private final ImageReceiver blurImageReceiver;
    private Bitmap blurSource;
    private final ImageReceiver imageReceiver;
    private String loadedKey;
    private MediaUploadState media;
    private final View parent;
    private final RadialProgress2 radialProgress;

    public RichMediaItem(View view, Theme.ResourcesProvider resourcesProvider) {
        this.parent = view;
        this.imageReceiver = new ImageReceiver(view);
        this.blurImageReceiver = new ImageReceiver(view);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, resourcesProvider);
        this.radialProgress = radialProgress2;
        radialProgress2.setProgressColor(-1);
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public void setMedia(MediaUploadState mediaUploadState) {
        this.media = mediaUploadState;
        applyImage();
    }

    public boolean hasImage() {
        MediaUploadState mediaUploadState = this.media;
        return mediaUploadState != null && (mediaUploadState.localPath != null || mediaUploadState.isReady());
    }

    public int getWidth() {
        if (this.media == null) {
            return 0;
        }
        return isLocalRotated90() ? this.media.height : this.media.width;
    }

    public int getHeight() {
        if (this.media == null) {
            return 0;
        }
        return isLocalRotated90() ? this.media.width : this.media.height;
    }

    private boolean isLocalRotated90() {
        int i;
        MediaUploadState mediaUploadState = this.media;
        return (mediaUploadState == null || mediaUploadState.isVideo || mediaUploadState.isReady() || ((i = this.media.orientation) != 90 && i != 270)) ? false : true;
    }

    public void attach() {
        this.attached = true;
        this.imageReceiver.onAttachedToWindow();
        this.blurImageReceiver.onAttachedToWindow();
        this.loadedKey = null;
        applyImage();
    }

    private String imageKey() {
        MediaUploadState mediaUploadState = this.media;
        if (mediaUploadState == null) {
            return "null";
        }
        String str = mediaUploadState.isVideo ? "v" : mediaUploadState.isAudio ? "a" : "p";
        long j = 0;
        if (mediaUploadState.isReady()) {
            MediaUploadState mediaUploadState2 = this.media;
            TLRPC.Document document = mediaUploadState2.document;
            if (document != null) {
                j = document.id;
            } else {
                TLRPC.Photo photo = mediaUploadState2.photo;
                if (photo != null) {
                    j = photo.id;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(this.media.state);
        sb.append(":");
        sb.append(j);
        sb.append(":");
        String str2 = this.media.localPath;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public void detach() {
        this.attached = false;
        this.imageReceiver.onDetachedFromWindow();
        this.blurImageReceiver.onDetachedFromWindow();
        this.blurSource = null;
    }

    public void drawBlurBackground(Canvas canvas, RectF rectF) {
        Bitmap bitmap;
        if (!hasImage() || (bitmap = this.imageReceiver.getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        if ((this.blurImageReceiver.getBitmap() == null || this.imageReceiver.getAnimation() == null) && (bitmap != this.blurSource || this.blurImageReceiver.getBitmap() == null)) {
            this.blurSource = bitmap;
            this.blurImageReceiver.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
            if (fancyBlurFilter == null) {
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                fancyBlurFilter = new ColorMatrixColorFilter(colorMatrix);
            }
            this.blurImageReceiver.setColorFilter(fancyBlurFilter);
        }
        if (this.blurImageReceiver.getBitmap() == null) {
            return;
        }
        this.blurImageReceiver.setImageCoords(rectF);
        this.blurImageReceiver.setAlpha(this.imageReceiver.getCurrentAlpha());
        this.blurImageReceiver.draw(canvas);
    }

    public void draw(Canvas canvas, RectF rectF) {
        this.imageReceiver.setImageCoords(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.width()), Math.round(rectF.height()));
        if (hasImage()) {
            this.imageReceiver.draw(canvas);
        }
        MediaUploadState mediaUploadState = this.media;
        if (mediaUploadState == null || !mediaUploadState.isPending()) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int round = Math.round(rectF.centerX());
        int round2 = Math.round(rectF.centerY());
        int i = dp / 2;
        this.radialProgress.setProgressRect(round - i, round2 - i, round + i, round2 + i);
        this.radialProgress.setProgress(this.media.progress, true);
        this.radialProgress.draw(canvas);
    }

    private void applyImage() {
        TLRPC.Photo photo;
        ImageLocation imageLocation;
        TLRPC.Document document;
        ImageLocation forDocument;
        ImageLocation imageLocation2;
        ImageLocation imageLocation3;
        TLRPC.Document document2;
        if (this.media == null) {
            this.loadedKey = null;
            this.imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i = AndroidUtilities.displaySize.x;
        String str = i + "_" + i;
        String str2 = imageKey() + "@" + str;
        if (str2.equals(this.loadedKey)) {
            return;
        }
        this.loadedKey = str2;
        BitmapDrawable bitmapDrawable = this.media.localThumbBitmap != null ? new BitmapDrawable(this.parent.getResources(), this.media.localThumbBitmap) : null;
        MediaUploadState mediaUploadState = this.media;
        if (mediaUploadState.isVideo) {
            String str3 = mediaUploadState.localPath;
            if (str3 != null) {
                forDocument = ImageLocation.getForVideoPath(str3);
            } else if (mediaUploadState.isReady() && (document = this.media.document) != null) {
                forDocument = ImageLocation.getForDocument(document);
            } else {
                imageLocation = null;
                if (this.media.isReady() || (document2 = this.media.document) == null) {
                    imageLocation2 = null;
                    imageLocation3 = null;
                } else {
                    TLRPC.PhotoSize pickNonStrippedClosest = pickNonStrippedClosest(document2.thumbs, AndroidUtilities.getPhotoSize());
                    TLRPC.PhotoSize pickStripped = pickStripped(this.media.document.thumbs);
                    imageLocation2 = ImageLocation.getForDocument(pickNonStrippedClosest, this.media.document);
                    imageLocation3 = ImageLocation.getForDocument(pickStripped, this.media.document);
                }
                this.imageReceiver.setOrientation(0, 0, false);
                this.imageReceiver.setImage(imageLocation, ImageLoader.AUTOPLAY_FILTER, imageLocation2, str, imageLocation3, str, bitmapDrawable, 0L, null, this.media.document, 0);
                return;
            }
            imageLocation = forDocument;
            if (this.media.isReady()) {
            }
            imageLocation2 = null;
            imageLocation3 = null;
            this.imageReceiver.setOrientation(0, 0, false);
            this.imageReceiver.setImage(imageLocation, ImageLoader.AUTOPLAY_FILTER, imageLocation2, str, imageLocation3, str, bitmapDrawable, 0L, null, this.media.document, 0);
            return;
        }
        if (mediaUploadState.isReady() && (photo = this.media.photo) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.media.photo.sizes, 100);
            this.imageReceiver.setOrientation(0, 0, false);
            this.imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.media.photo), str, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.media.photo), str, null, 0L, null, this.media.photo, 0);
            return;
        }
        MediaUploadState mediaUploadState2 = this.media;
        if (mediaUploadState2.localPath != null) {
            this.imageReceiver.setOrientation(mediaUploadState2.orientation, mediaUploadState2.invert, true);
            this.imageReceiver.setImage(ImageLocation.getForPath(this.media.localPath), str, null, null, null, 0);
        } else {
            this.imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    private static TLRPC.PhotoSize pickNonStrippedClosest(ArrayList arrayList, int i) {
        int abs;
        TLRPC.PhotoSize photoSize = null;
        if (arrayList == null) {
            return null;
        }
        int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) arrayList.get(i3);
            if (!(photoSize2 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize2 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize2.w, photoSize2.h) - i)) < i2) {
                photoSize = photoSize2;
                i2 = abs;
            }
        }
        return photoSize;
    }

    private static TLRPC.PhotoSize pickStripped(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.PhotoSize) arrayList.get(i);
            }
        }
        return null;
    }
}
