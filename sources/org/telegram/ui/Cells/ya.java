package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.vi1;
import org.telegram.ui.wi1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ya extends FrameLayout {
    public final oh.a4 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public final /* synthetic */ za n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(za zaVar, Context context) {
        super(context);
        this.n = zaVar;
        setWillNotDraw(false);
        oh.a4 a4Var = new oh.a4(this, context, 3);
        this.a = a4Var;
        addView(a4Var, k7.c6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
        addView(view, k7.c6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.k7, false));
        addView(checkBox, k7.c6.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int patternColor;
        int patternColor2;
        oh.a4 a4Var;
        this.h = obj;
        oh.a4 a4Var2 = this.a;
        a4Var2.setVisibility(0);
        this.b.setVisibility(4);
        a4Var2.setBackgroundDrawable(null);
        a4Var2.getImageReceiver().setColorFilter(null);
        a4Var2.getImageReceiver().setAlpha(1.0f);
        a4Var2.getImageReceiver().setBlendMode(null);
        a4Var2.getImageReceiver().setGradientBitmap(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j10 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    a4Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                } else {
                    a4Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                fc0 fc0Var = new fc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.k6.I.q()) {
                    a4Var2.setBackground(fc0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        a4Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    a4Var2.getImageReceiver().setGradientBitmap(fc0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = fc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                a4Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.X0(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                a4Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                a4Var = a4Var2;
                a4Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
            } else {
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                a4Var = a4Var2;
                a4Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
            }
            a4Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof vi1)) {
            if (obj instanceof wi1) {
                wi1 wi1Var = (wi1) obj;
                File file = wi1Var.e;
                if (file != null) {
                    a4Var2.f(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = wi1Var.d;
                if (file2 != null) {
                    a4Var2.f(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(wi1Var.a)) {
                    a4Var2.setImageDrawable(org.telegram.ui.ActionBar.k6.W0(a4Var2, true));
                    return;
                } else {
                    a4Var2.setImageResource(wi1Var.c);
                    return;
                }
            }
            if (!(obj instanceof MediaController.SearchImage)) {
                this.e = false;
                return;
            }
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo == null) {
                a4Var2.f(searchImage.thumbUrl, "180_180", null);
                return;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                closestPhotoSizeWithSize4 = null;
            }
            a4Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, "jpg", searchImage, 1);
            return;
        }
        vi1 vi1Var = (vi1) obj;
        File file3 = vi1Var.i;
        int i10 = vi1Var.d;
        int i11 = vi1Var.c;
        int i12 = vi1Var.b;
        if (file3 == null && vi1Var.g == null && !"d".equals(vi1Var.a)) {
            a4Var2.setImageBitmap(null);
            if (vi1Var.k) {
                a4Var2.setBackground(new fc0(true, vi1Var.b, vi1Var.c, vi1Var.d, vi1Var.e));
                return;
            } else if (i11 != 0) {
                a4Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                return;
            } else {
                a4Var2.setBackgroundColor(i12 | (-16777216));
                return;
            }
        }
        if (i10 != 0) {
            fc0 fc0Var2 = new fc0(true, vi1Var.b, vi1Var.c, vi1Var.d, vi1Var.e);
            if (vi1Var.h >= 0.0f) {
                a4Var2.setBackground(new fc0(true, vi1Var.b, vi1Var.c, vi1Var.d, vi1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    a4Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                a4Var2.getImageReceiver().setGradientBitmap(fc0Var2.k);
            }
            patternColor = fc0.g(i12, i11, i10, vi1Var.e);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i12);
        }
        int i13 = patternColor;
        if ("d".equals(vi1Var.a)) {
            if (vi1Var.m == null) {
                vi1Var.m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            a4Var2.setImageBitmap(vi1Var.m);
            a4Var2.getImageReceiver().setAlpha(Math.abs(vi1Var.h));
            return;
        }
        if (file3 != null) {
            a4Var2.f(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(vi1Var.g.document.thumbs, 100);
        a4Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize5, vi1Var.g.document), "180_180", null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : vi1Var.g.document.size, "jpg", vi1Var.g, 1);
        a4Var2.getImageReceiver().setAlpha(Math.abs(vi1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i10 == 0) {
            a4Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i13), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        za zaVar = this.n;
        if (!zaVar.b || !this.c.x) {
            oh.a4 a4Var = this.a;
            if (a4Var.getImageReceiver().hasBitmapImage() && a4Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zaVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
