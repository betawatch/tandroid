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
import org.telegram.ui.Components.mc0;
import org.telegram.ui.yi1;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class db extends FrameLayout {
    public final ai.y5 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public final /* synthetic */ eb n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(eb ebVar, Context context) {
        super(context);
        this.n = ebVar;
        setWillNotDraw(false);
        ai.y5 y5Var = new ai.y5(this, context, 4);
        this.a = y5Var;
        addView(y5Var, w7.y5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(false));
        addView(view, w7.y5.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i7, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k7, false));
        addView(checkBox, w7.y5.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int patternColor;
        int patternColor2;
        ai.y5 y5Var;
        this.h = obj;
        ai.y5 y5Var2 = this.a;
        y5Var2.setVisibility(0);
        this.b.setVisibility(4);
        y5Var2.setBackgroundDrawable(null);
        y5Var2.getImageReceiver().setColorFilter(null);
        y5Var2.getImageReceiver().setAlpha(1.0f);
        y5Var2.getImageReceiver().setBlendMode(null);
        y5Var2.getImageReceiver().setGradientBitmap(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j3 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    y5Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j3, "jpg", tL_wallPaper, 1);
                    return;
                } else {
                    y5Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j3, "jpg", tL_wallPaper, 1);
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                mc0 mc0Var = new mc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.h6.I.q()) {
                    y5Var2.setBackground(mc0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        y5Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    y5Var2.getImageReceiver().setGradientBitmap(mc0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = mc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                y5Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.X0(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                y5Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                y5Var = y5Var2;
                y5Var.k(forDocument, "180_180", forDocument2, null, j3, "jpg", tL_wallPaper, 1);
            } else {
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                y5Var = y5Var2;
                y5Var.k(forDocument3, "180_180", null, null, j3, "jpg", tL_wallPaper, 1);
            }
            y5Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof yi1)) {
            if (obj instanceof zi1) {
                zi1 zi1Var = (zi1) obj;
                File file = zi1Var.e;
                if (file != null) {
                    y5Var2.f(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = zi1Var.d;
                if (file2 != null) {
                    y5Var2.f(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(zi1Var.a)) {
                    y5Var2.setImageDrawable(org.telegram.ui.ActionBar.h6.W0(y5Var2, true));
                    return;
                } else {
                    y5Var2.setImageResource(zi1Var.c);
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
                y5Var2.f(searchImage.thumbUrl, "180_180", null);
                return;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                closestPhotoSizeWithSize4 = null;
            }
            y5Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, "jpg", searchImage, 1);
            return;
        }
        yi1 yi1Var = (yi1) obj;
        File file3 = yi1Var.i;
        int i10 = yi1Var.d;
        int i11 = yi1Var.c;
        int i12 = yi1Var.b;
        if (file3 == null && yi1Var.g == null && !"d".equals(yi1Var.a)) {
            y5Var2.setImageBitmap(null);
            if (yi1Var.k) {
                y5Var2.setBackground(new mc0(true, yi1Var.b, yi1Var.c, yi1Var.d, yi1Var.e));
                return;
            } else if (i11 != 0) {
                y5Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                return;
            } else {
                y5Var2.setBackgroundColor(i12 | (-16777216));
                return;
            }
        }
        if (i10 != 0) {
            mc0 mc0Var2 = new mc0(true, yi1Var.b, yi1Var.c, yi1Var.d, yi1Var.e);
            if (yi1Var.h >= 0.0f) {
                y5Var2.setBackground(new mc0(true, yi1Var.b, yi1Var.c, yi1Var.d, yi1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    y5Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                y5Var2.getImageReceiver().setGradientBitmap(mc0Var2.k);
            }
            patternColor = mc0.g(i12, i11, i10, yi1Var.e);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i12);
        }
        int i13 = patternColor;
        if ("d".equals(yi1Var.a)) {
            if (yi1Var.m == null) {
                yi1Var.m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            y5Var2.setImageBitmap(yi1Var.m);
            y5Var2.getImageReceiver().setAlpha(Math.abs(yi1Var.h));
            return;
        }
        if (file3 != null) {
            y5Var2.f(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(yi1Var.g.document.thumbs, 100);
        y5Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize5, yi1Var.g.document), "180_180", null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : yi1Var.g.document.size, "jpg", yi1Var.g, 1);
        y5Var2.getImageReceiver().setAlpha(Math.abs(yi1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i10 == 0) {
            y5Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i13), PorterDuff.Mode.SRC_IN));
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
        eb ebVar = this.n;
        if (!ebVar.b || !this.c.x) {
            ai.y5 y5Var = this.a;
            if (y5Var.getImageReceiver().hasBitmapImage() && y5Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ebVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
