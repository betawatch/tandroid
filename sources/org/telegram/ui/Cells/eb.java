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
import org.telegram.ui.Components.kc0;
import org.telegram.ui.fj1;
import org.telegram.ui.gj1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class eb extends FrameLayout {
    public final ai.z5 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public final /* synthetic */ fb n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(fb fbVar, Context context) {
        super(context);
        this.n = fbVar;
        setWillNotDraw(false);
        ai.z5 z5Var = new ai.z5(this, context, 4);
        this.a = z5Var;
        addView(z5Var, w7.y5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
        addView(view, w7.y5.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i7, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false));
        addView(checkBox, w7.y5.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int patternColor;
        int patternColor2;
        ai.z5 z5Var;
        this.h = obj;
        ai.z5 z5Var2 = this.a;
        z5Var2.setVisibility(0);
        this.b.setVisibility(4);
        z5Var2.setBackgroundDrawable(null);
        z5Var2.getImageReceiver().setColorFilter(null);
        z5Var2.getImageReceiver().setAlpha(1.0f);
        z5Var2.getImageReceiver().setBlendMode(null);
        z5Var2.getImageReceiver().setGradientBitmap(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j3 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    z5Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j3, "jpg", tL_wallPaper, 1);
                    return;
                } else {
                    z5Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j3, "jpg", tL_wallPaper, 1);
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                kc0 kc0Var = new kc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.j6.I.q()) {
                    z5Var2.setBackground(kc0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        z5Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    z5Var2.getImageReceiver().setGradientBitmap(kc0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = kc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                z5Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.X0(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                z5Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                z5Var = z5Var2;
                z5Var.k(forDocument, "180_180", forDocument2, null, j3, "jpg", tL_wallPaper, 1);
            } else {
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                z5Var = z5Var2;
                z5Var.k(forDocument3, "180_180", null, null, j3, "jpg", tL_wallPaper, 1);
            }
            z5Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof fj1)) {
            if (obj instanceof gj1) {
                gj1 gj1Var = (gj1) obj;
                File file = gj1Var.e;
                if (file != null) {
                    z5Var2.f(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = gj1Var.d;
                if (file2 != null) {
                    z5Var2.f(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(gj1Var.a)) {
                    z5Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(z5Var2, true));
                    return;
                } else {
                    z5Var2.setImageResource(gj1Var.c);
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
                z5Var2.f(searchImage.thumbUrl, "180_180", null);
                return;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                closestPhotoSizeWithSize4 = null;
            }
            z5Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, "jpg", searchImage, 1);
            return;
        }
        fj1 fj1Var = (fj1) obj;
        File file3 = fj1Var.i;
        int i10 = fj1Var.d;
        int i11 = fj1Var.c;
        int i12 = fj1Var.b;
        if (file3 == null && fj1Var.g == null && !"d".equals(fj1Var.a)) {
            z5Var2.setImageBitmap(null);
            if (fj1Var.k) {
                z5Var2.setBackground(new kc0(true, fj1Var.b, fj1Var.c, fj1Var.d, fj1Var.e));
                return;
            } else if (i11 != 0) {
                z5Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                return;
            } else {
                z5Var2.setBackgroundColor(i12 | (-16777216));
                return;
            }
        }
        if (i10 != 0) {
            kc0 kc0Var2 = new kc0(true, fj1Var.b, fj1Var.c, fj1Var.d, fj1Var.e);
            if (fj1Var.h >= 0.0f) {
                z5Var2.setBackground(new kc0(true, fj1Var.b, fj1Var.c, fj1Var.d, fj1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    z5Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                z5Var2.getImageReceiver().setGradientBitmap(kc0Var2.k);
            }
            patternColor = kc0.g(i12, i11, i10, fj1Var.e);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i12);
        }
        int i13 = patternColor;
        if ("d".equals(fj1Var.a)) {
            if (fj1Var.m == null) {
                fj1Var.m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            z5Var2.setImageBitmap(fj1Var.m);
            z5Var2.getImageReceiver().setAlpha(Math.abs(fj1Var.h));
            return;
        }
        if (file3 != null) {
            z5Var2.f(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(fj1Var.g.document.thumbs, 100);
        z5Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize5, fj1Var.g.document), "180_180", null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : fj1Var.g.document.size, "jpg", fj1Var.g, 1);
        z5Var2.getImageReceiver().setAlpha(Math.abs(fj1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i10 == 0) {
            z5Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i13), PorterDuff.Mode.SRC_IN));
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
        fb fbVar = this.n;
        if (!fbVar.b || !this.c.x) {
            ai.z5 z5Var = this.a;
            if (z5Var.getImageReceiver().hasBitmapImage() && z5Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), fbVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
