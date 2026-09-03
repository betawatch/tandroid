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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.ui1;
import org.telegram.ui.vi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xa extends FrameLayout {
    public final nh.y3 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public final /* synthetic */ ya n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(ya yaVar, Context context) {
        super(context);
        this.n = yaVar;
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
                ec0 ec0Var = new ec0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.j6.I.q()) {
                    y3Var2.setBackground(ec0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        y3Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    y3Var2.getImageReceiver().setGradientBitmap(ec0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = ec0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
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
        if (!(obj instanceof ui1)) {
            if (obj instanceof vi1) {
                vi1 vi1Var = (vi1) obj;
                File file = vi1Var.e;
                if (file != null) {
                    y3Var2.f(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = vi1Var.d;
                if (file2 != null) {
                    y3Var2.f(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(vi1Var.a)) {
                    y3Var2.setImageDrawable(org.telegram.ui.ActionBar.j6.W0(y3Var2, true));
                    return;
                } else {
                    y3Var2.setImageResource(vi1Var.c);
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
        ui1 ui1Var = (ui1) obj;
        File file3 = ui1Var.i;
        int i10 = ui1Var.d;
        int i11 = ui1Var.c;
        int i12 = ui1Var.b;
        if (file3 == null && ui1Var.g == null && !"d".equals(ui1Var.a)) {
            y3Var2.setImageBitmap(null);
            if (ui1Var.k) {
                y3Var2.setBackground(new ec0(true, ui1Var.b, ui1Var.c, ui1Var.d, ui1Var.e));
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
            ec0 ec0Var2 = new ec0(true, ui1Var.b, ui1Var.c, ui1Var.d, ui1Var.e);
            if (ui1Var.h >= 0.0f) {
                y3Var2.setBackground(new ec0(true, ui1Var.b, ui1Var.c, ui1Var.d, ui1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    y3Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                y3Var2.getImageReceiver().setGradientBitmap(ec0Var2.k);
            }
            patternColor = ec0.g(i12, i11, i10, ui1Var.e);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i12);
        }
        int i13 = patternColor;
        if ("d".equals(ui1Var.a)) {
            if (ui1Var.m == null) {
                ui1Var.m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            y3Var2.setImageBitmap(ui1Var.m);
            y3Var2.getImageReceiver().setAlpha(Math.abs(ui1Var.h));
            return;
        }
        if (file3 != null) {
            y3Var2.f(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(ui1Var.g.document.thumbs, 100);
        y3Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize5, ui1Var.g.document), "180_180", null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : ui1Var.g.document.size, "jpg", ui1Var.g, 1);
        y3Var2.getImageReceiver().setAlpha(Math.abs(ui1Var.h));
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
        ya yaVar = this.n;
        if (!yaVar.b || !this.c.x) {
            nh.y3 y3Var = this.a;
            if (y3Var.getImageReceiver().hasBitmapImage() && y3Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), yaVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
