package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bp;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l7 extends FrameLayout {
    public final org.telegram.ui.Components.n9 a;
    public final TextView b;
    public final n5 c;
    public final View d;
    public final bp e;
    public final FrameLayout f;
    public AnimatorSet h;
    public MessageObject n;
    public final /* synthetic */ p7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(p7 p7Var, Context context) {
        super(context);
        this.r = p7Var;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.a = n9Var;
        n9Var.getImageReceiver().setNeedsQualityThumb(true);
        n9Var.getImageReceiver().setShouldGenerateQualityThumb(true);
        frameLayout.addView(n9Var, h7.z5.c(-1.0f, -1));
        n5 n5Var = new n5(context, 1);
        n5Var.b = new RectF();
        this.c = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(n5Var, h7.z5.d(-2, 17.0f, 83, 4.0f, 0.0f, 0.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.play_mini_video);
        n5Var.addView(imageView, h7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        n5Var.addView(textView, h7.z5.d(-2, -2.0f, 19, 13.0f, -0.7f, 0.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        addView(view, h7.z5.c(-1.0f, -1));
        bp bpVar = new bp(context, 21, null);
        this.e = bpVar;
        bpVar.setVisibility(4);
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.Lh, org.telegram.ui.ActionBar.g6.k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(1);
        addView(bpVar, h7.z5.d(24, 24.0f, 53, 0.0f, 1.0f, 1.0f, 0.0f));
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.e.a.q) {
            org.telegram.ui.Components.n9 n9Var = this.a;
            if (n9Var.getImageReceiver().hasBitmapImage() && n9Var.getImageReceiver().getCurrentAlpha() == 1.0f && !PhotoViewer.M1(this.n)) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.r.n);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.n.isLivePhoto()) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachLivePhoto));
        } else if (this.n.isVideo()) {
            StringBuilder sb2 = new StringBuilder();
            rl.j(R.string.AttachVideo, ", ", sb2);
            sb2.append(LocaleController.formatDuration((int) this.n.getDuration()));
            accessibilityNodeInfo.setText(sb2.toString());
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AttachPhoto));
        }
        if (this.e.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    public void setMessageObject(MessageObject messageObject) {
        TLRPC.PhotoSize photoSize;
        this.n = messageObject;
        this.a.getImageReceiver().setVisible(!PhotoViewer.M1(messageObject), false);
        if (!TextUtils.isEmpty(MessagesController.getInstance(this.r.s).getRestrictionReason(messageObject.messageOwner.restriction_reason))) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        if (messageObject.isVideo()) {
            this.c.setVisibility(0);
            this.b.setText(AndroidUtilities.formatShortDuration((int) messageObject.getDuration()));
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320);
            photoSize = closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null;
            if (closestPhotoSizeWithSize == null) {
                this.a.setImageResource(R.drawable.photo_placeholder_in);
                return;
            } else if (messageObject.strippedThumb != null) {
                this.a.i(ImageLocation.getForDocument(photoSize, document), "100_100", null, messageObject.strippedThumb, messageObject);
                return;
            } else {
                this.a.m(ImageLocation.getForDocument(photoSize, document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                return;
            }
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null || messageObject.photoThumbs.isEmpty()) {
            this.c.setVisibility(4);
            this.a.setImageResource(R.drawable.photo_placeholder_in);
            return;
        }
        this.c.setVisibility(4);
        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 320, false, closestPhotoSizeWithSize3, false);
        if (!messageObject.mediaExists && !DownloadController.getInstance(this.r.s).canDownloadMedia(messageObject)) {
            BitmapDrawable bitmapDrawable = messageObject.strippedThumb;
            if (bitmapDrawable != null) {
                this.a.m(null, null, null, null, bitmapDrawable, null, 0, messageObject);
                return;
            } else {
                this.a.m(null, null, ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject), "b", ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.photo_placeholder_in), null, 0, messageObject);
                return;
            }
        }
        photoSize = closestPhotoSizeWithSize4 != closestPhotoSizeWithSize3 ? closestPhotoSizeWithSize3 : null;
        if (messageObject.strippedThumb != null) {
            ImageReceiver imageReceiver = this.a.getImageReceiver();
            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
            long j10 = 0;
            BitmapDrawable bitmapDrawable2 = messageObject.strippedThumb;
            if (closestPhotoSizeWithSize4 != null) {
                j10 = closestPhotoSizeWithSize4.size;
            }
            imageReceiver.setImage(forObject, "100_100", null, null, bitmapDrawable2, j10, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
            return;
        }
        long j11 = 0;
        ImageReceiver imageReceiver2 = this.a.getImageReceiver();
        ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize4, messageObject.photoThumbsObject);
        ImageLocation forObject3 = ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject);
        if (closestPhotoSizeWithSize4 != null) {
            j11 = closestPhotoSizeWithSize4.size;
        }
        imageReceiver2.setImage(forObject2, "100_100", forObject3, "b", j11, null, messageObject, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 1);
    }
}
