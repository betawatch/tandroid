package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public org.telegram.ui.Components.o9 a;
    public FrameLayout b;
    public dp c;
    public TextView d;
    public bh.g e;
    public int f;
    public int h;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(org.telegram.ui.ActionBar.f6.W9, org.telegram.ui.ActionBar.f6.X9, org.telegram.ui.ActionBar.f6.V9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        bh.g gVar = this.e;
        org.telegram.ui.Components.o9 o9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        if (str != null) {
            o9Var.f(str, null, drawable);
            return;
        }
        if (photoEntry.path == null) {
            o9Var.setImageDrawable(drawable);
            return;
        }
        o9Var.p(photoEntry.orientation, photoEntry.invert, true);
        if (photoEntry.isLivePhoto()) {
            gVar.setVisibility(4);
            setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
            o9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            return;
        }
        if (!photoEntry.isVideo) {
            gVar.setVisibility(4);
            setContentDescription(LocaleController.getString(R.string.AttachPhoto));
            o9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            return;
        }
        gVar.setVisibility(0);
        this.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
        StringBuilder sb2 = new StringBuilder();
        j2.k(R.string.AttachVideo, ", ", sb2);
        sb2.append(LocaleController.formatDuration(photoEntry.duration));
        setContentDescription(sb2.toString());
        o9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
    }

    public void setNum(int i9) {
        this.c.setNum(i9);
    }

    public void setImage(MediaController.SearchImage searchImage) {
        org.telegram.ui.Components.o9 o9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        if (photoSize != null) {
            o9Var.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            o9Var.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            o9Var.f(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            o9Var.f(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            o9Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
        } else {
            o9Var.setImageDrawable(drawable);
        }
    }
}
