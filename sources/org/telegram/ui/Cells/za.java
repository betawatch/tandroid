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
import org.telegram.ui.Components.wc0;
import org.telegram.ui.uh1;
import org.telegram.ui.vh1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class za extends FrameLayout {
    public final ci.j4 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public final /* synthetic */ ab n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(ab abVar, Context context) {
        super(context);
        this.n = abVar;
        setWillNotDraw(false);
        ci.j4 j4Var = new ci.j4(this, context, 4);
        this.a = j4Var;
        addView(j4Var, w7.z5.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
        addView(view, w7.z5.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i7, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k7, false));
        addView(checkBox, w7.z5.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int patternColor;
        int patternColor2;
        ci.j4 j4Var;
        this.h = obj;
        ci.j4 j4Var2 = this.a;
        j4Var2.setVisibility(0);
        this.b.setVisibility(4);
        j4Var2.setBackgroundDrawable(null);
        j4Var2.getImageReceiver().setColorFilter(null);
        j4Var2.getImageReceiver().setAlpha(1.0f);
        j4Var2.getImageReceiver().setBlendMode(null);
        j4Var2.getImageReceiver().setGradientBitmap(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j10 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    j4Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                } else {
                    j4Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                wc0 wc0Var = new wc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.h6.I.q()) {
                    j4Var2.setBackground(wc0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        j4Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    j4Var2.getImageReceiver().setGradientBitmap(wc0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = wc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.Y0(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                j4Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                j4Var = j4Var2;
                j4Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
            } else {
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                j4Var = j4Var2;
                j4Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
            }
            j4Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof uh1)) {
            if (obj instanceof vh1) {
                vh1 vh1Var = (vh1) obj;
                File file = vh1Var.e;
                if (file != null) {
                    j4Var2.f(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = vh1Var.d;
                if (file2 != null) {
                    j4Var2.f(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(vh1Var.a)) {
                    j4Var2.setImageDrawable(org.telegram.ui.ActionBar.h6.X0(j4Var2, true));
                    return;
                } else {
                    j4Var2.setImageResource(vh1Var.c);
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
                j4Var2.f(searchImage.thumbUrl, "180_180", null);
                return;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                closestPhotoSizeWithSize4 = null;
            }
            j4Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, "jpg", searchImage, 1);
            return;
        }
        uh1 uh1Var = (uh1) obj;
        File file3 = uh1Var.i;
        int i10 = uh1Var.d;
        int i11 = uh1Var.c;
        int i12 = uh1Var.b;
        if (file3 == null && uh1Var.g == null && !"d".equals(uh1Var.a)) {
            j4Var2.setImageBitmap(null);
            if (uh1Var.k) {
                j4Var2.setBackground(new wc0(true, uh1Var.b, uh1Var.c, uh1Var.d, uh1Var.e));
                return;
            } else if (i11 != 0) {
                j4Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                return;
            } else {
                j4Var2.setBackgroundColor(i12 | (-16777216));
                return;
            }
        }
        if (i10 != 0) {
            wc0 wc0Var2 = new wc0(true, uh1Var.b, uh1Var.c, uh1Var.d, uh1Var.e);
            if (uh1Var.h >= 0.0f) {
                j4Var2.setBackground(new wc0(true, uh1Var.b, uh1Var.c, uh1Var.d, uh1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    j4Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                j4Var2.getImageReceiver().setGradientBitmap(wc0Var2.k);
            }
            patternColor = wc0.g(i12, i11, i10, uh1Var.e);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i12);
        }
        int i13 = patternColor;
        if ("d".equals(uh1Var.a)) {
            if (uh1Var.m == null) {
                uh1Var.m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            j4Var2.setImageBitmap(uh1Var.m);
            j4Var2.getImageReceiver().setAlpha(Math.abs(uh1Var.h));
            return;
        }
        if (file3 != null) {
            j4Var2.f(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(uh1Var.g.document.thumbs, 100);
        j4Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize5, uh1Var.g.document), "180_180", null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : uh1Var.g.document.size, "jpg", uh1Var.g, 1);
        j4Var2.getImageReceiver().setAlpha(Math.abs(uh1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i10 == 0) {
            j4Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i13), PorterDuff.Mode.SRC_IN));
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
        ab abVar = this.n;
        if (!abVar.b || !this.c.x) {
            ci.j4 j4Var = this.a;
            if (j4Var.getImageReceiver().hasBitmapImage() && j4Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), abVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
