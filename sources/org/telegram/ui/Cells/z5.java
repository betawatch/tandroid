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
import org.telegram.ui.Components.aq;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    public org.telegram.ui.Components.z9 a;
    public FrameLayout b;
    public aq c;
    public TextView d;
    public org.telegram.ui.x5 e;
    public int f;
    public int h;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f + this.h, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30));
    }

    public void setImage(MediaController.PhotoEntry photoEntry) {
        org.telegram.ui.x5 x5Var = this.e;
        org.telegram.ui.Components.z9 z9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        String str = photoEntry.thumbPath;
        if (str != null) {
            z9Var.f(str, null, drawable);
            return;
        }
        if (photoEntry.path == null) {
            z9Var.setImageDrawable(drawable);
            return;
        }
        z9Var.p(photoEntry.orientation, photoEntry.invert, true);
        if (photoEntry.isLivePhoto()) {
            x5Var.setVisibility(4);
            setContentDescription(LocaleController.getString(R.string.AttachLivePhoto));
            z9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            return;
        }
        if (!photoEntry.isVideo) {
            x5Var.setVisibility(4);
            setContentDescription(LocaleController.getString(R.string.AttachPhoto));
            z9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
            return;
        }
        x5Var.setVisibility(0);
        this.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
        StringBuilder sb2 = new StringBuilder();
        c1.l(R.string.AttachVideo, ", ", sb2);
        sb2.append(LocaleController.formatDuration(photoEntry.duration));
        setContentDescription(sb2.toString());
        z9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, drawable);
    }

    public void setNum(int i10) {
        this.c.setNum(i10);
    }

    public void setImage(MediaController.SearchImage searchImage) {
        org.telegram.ui.Components.z9 z9Var = this.a;
        Drawable drawable = getResources().getDrawable(R.drawable.nophotos);
        TLRPC.PhotoSize photoSize = searchImage.thumbPhotoSize;
        if (photoSize != null) {
            z9Var.h(ImageLocation.getForPhoto(photoSize, searchImage.photo), null, drawable, searchImage);
            return;
        }
        TLRPC.PhotoSize photoSize2 = searchImage.photoSize;
        if (photoSize2 != null) {
            z9Var.h(ImageLocation.getForPhoto(photoSize2, searchImage.photo), "80_80", drawable, searchImage);
            return;
        }
        String str = searchImage.thumbPath;
        if (str != null) {
            z9Var.f(str, null, drawable);
            return;
        }
        String str2 = searchImage.thumbUrl;
        if (str2 != null && str2.length() > 0) {
            z9Var.f(searchImage.thumbUrl, null, drawable);
        } else if (MessageObject.isDocumentHasThumb(searchImage.document)) {
            z9Var.h(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(searchImage.document.thumbs, 320), searchImage.document), null, drawable, searchImage);
        } else {
            z9Var.setImageDrawable(drawable);
        }
    }
}
