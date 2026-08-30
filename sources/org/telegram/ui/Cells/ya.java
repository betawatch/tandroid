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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.mi1;
import org.telegram.ui.ni1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ya extends FrameLayout {
    public final nh.y3 a;
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
        nh.y3 y3Var = new nh.y3(this, context, 3);
        this.a = y3Var;
        addView(y3Var, k7.b6.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, k7.b6.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false));
        addView(checkBox, k7.b6.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int patternColor;
        int patternColor2;
        nh.y3 y3Var;
        this.h = obj;
        nh.y3 y3Var2 = this.a;
        y3Var2.setVisibility(0);
        this.b.setVisibility(4);
        y3Var2.setBackgroundDrawable(null);
        y3Var2.getImageReceiver().setColorFilter(null);
        y3Var2.getImageReceiver().setAlpha(1.0f);
        y3Var2.getImageReceiver().setBlendMode(null);
        y3Var2.getImageReceiver().setGradientBitmap(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j10 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    y3Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                } else {
                    y3Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                dc0 dc0Var = new dc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.j6.I.q()) {
                    y3Var2.setBackground(dc0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        y3Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    y3Var2.getImageReceiver().setGradientBitmap(dc0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = dc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                y3Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                y3Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                y3Var = y3Var2;
                y3Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
            } else {
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                y3Var = y3Var2;
                y3Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
            }
            y3Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof mi1)) {
            if (obj instanceof ni1) {
                ni1 ni1Var = (ni1) obj;
                File file = ni1Var.e;
                if (file != null) {
                    y3Var2.f(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = ni1Var.d;
                if (file2 != null) {
                    y3Var2.f(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(ni1Var.a)) {
                    y3Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(y3Var2, true));
                    return;
                } else {
                    y3Var2.setImageResource(ni1Var.c);
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
                y3Var2.f(searchImage.thumbUrl, "180_180", null);
                return;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                closestPhotoSizeWithSize4 = null;
            }
            y3Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, "jpg", searchImage, 1);
            return;
        }
        mi1 mi1Var = (mi1) obj;
        File file3 = mi1Var.i;
        int i10 = mi1Var.d;
        int i11 = mi1Var.c;
        int i12 = mi1Var.b;
        if (file3 == null && mi1Var.g == null && !"d".equals(mi1Var.a)) {
            y3Var2.setImageBitmap(null);
            if (mi1Var.k) {
                y3Var2.setBackground(new dc0(true, mi1Var.b, mi1Var.c, mi1Var.d, mi1Var.e));
                return;
            } else if (i11 != 0) {
                y3Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                return;
            } else {
                y3Var2.setBackgroundColor(i12 | (-16777216));
                return;
            }
        }
        if (i10 != 0) {
            dc0 dc0Var2 = new dc0(true, mi1Var.b, mi1Var.c, mi1Var.d, mi1Var.e);
            if (mi1Var.h >= 0.0f) {
                y3Var2.setBackground(new dc0(true, mi1Var.b, mi1Var.c, mi1Var.d, mi1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    y3Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                y3Var2.getImageReceiver().setGradientBitmap(dc0Var2.k);
            }
            patternColor = dc0.g(i12, i11, i10, mi1Var.e);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i12);
        }
        int i13 = patternColor;
        if ("d".equals(mi1Var.a)) {
            if (mi1Var.m == null) {
                mi1Var.m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            y3Var2.setImageBitmap(mi1Var.m);
            y3Var2.getImageReceiver().setAlpha(Math.abs(mi1Var.h));
            return;
        }
        if (file3 != null) {
            y3Var2.f(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(mi1Var.g.document.thumbs, 100);
        y3Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize5, mi1Var.g.document), "180_180", null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : mi1Var.g.document.size, "jpg", mi1Var.g, 1);
        y3Var2.getImageReceiver().setAlpha(Math.abs(mi1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i10 == 0) {
            y3Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i13), PorterDuff.Mode.SRC_IN));
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
            nh.y3 y3Var = this.a;
            if (y3Var.getImageReceiver().hasBitmapImage() && y3Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
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
