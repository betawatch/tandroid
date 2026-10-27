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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.di1;
import org.telegram.ui.ei1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class eb extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final di.k4 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final /* synthetic */ fb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(fb fbVar, Context context) {
        super(context);
        this.s = fbVar;
        setWillNotDraw(false);
        di.k4 k4Var = new di.k4(this, context, 4);
        this.a = k4Var;
        addView(k4Var, kb1.i(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, kb1.i(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
        addView(view, kb1.g(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i7, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k7, false));
        addView(checkBox, kb1.h(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        int patternColor;
        int patternColor2;
        di.k4 k4Var;
        this.h = obj;
        di.k4 k4Var2 = this.a;
        k4Var2.setVisibility(0);
        this.b.setVisibility(4);
        k4Var2.setBackgroundDrawable(null);
        k4Var2.getImageReceiver().setColorFilter(null);
        k4Var2.getImageReceiver().setAlpha(1.0f);
        k4Var2.getImageReceiver().setBlendMode(null);
        k4Var2.getImageReceiver().setGradientBitmap(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(180));
            TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize2 != closestPhotoSizeWithSize ? closestPhotoSizeWithSize2 : null;
            long j10 = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                if (photoSize != null) {
                    k4Var2.k(ImageLocation.getForDocument(photoSize, tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                } else {
                    k4Var2.k(ImageLocation.getForDocument(tL_wallPaper.document), "180_180", ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document), "100_100_b", j10, "jpg", tL_wallPaper, 1);
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                vc0 vc0Var = new vc0(true, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color);
                if (tL_wallPaper.settings.intensity >= 0 || !org.telegram.ui.ActionBar.y6.I.q()) {
                    k4Var2.setBackground(vc0Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        k4Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    k4Var2.getImageReceiver().setGradientBitmap(vc0Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                patternColor2 = vc0.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                k4Var2.setBackgroundColor(org.telegram.ui.ActionBar.y6.Z0(wallPaperSettings.background_color));
                patternColor2 = AndroidUtilities.getPatternColor(tL_wallPaper.settings.background_color);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                k4Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(patternColor2), PorterDuff.Mode.SRC_IN));
            }
            if (photoSize != null) {
                ImageLocation forDocument = ImageLocation.getForDocument(photoSize, tL_wallPaper.document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                k4Var = k4Var2;
                k4Var.k(forDocument, "180_180", forDocument2, null, j10, "jpg", tL_wallPaper, 1);
            } else {
                ImageLocation forDocument3 = ImageLocation.getForDocument(closestPhotoSizeWithSize, tL_wallPaper.document);
                k4Var = k4Var2;
                k4Var.k(forDocument3, "180_180", null, null, j10, "jpg", tL_wallPaper, 1);
            }
            k4Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof di1)) {
            if (obj instanceof ei1) {
                ei1 ei1Var = (ei1) obj;
                File file = ei1Var.e;
                if (file != null) {
                    k4Var2.g(file.getAbsolutePath(), "180_180", null);
                    return;
                }
                File file2 = ei1Var.d;
                if (file2 != null) {
                    k4Var2.g(file2.getAbsolutePath(), "180_180", null);
                    return;
                } else if ("t".equals(ei1Var.a)) {
                    k4Var2.setImageDrawable(org.telegram.ui.ActionBar.y6.Y0(k4Var2, true));
                    return;
                } else {
                    k4Var2.setImageResource(ei1Var.c);
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
                k4Var2.g(searchImage.thumbUrl, "180_180", null);
                return;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(100));
            TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(searchImage.photo.sizes, AndroidUtilities.dp(180));
            if (closestPhotoSizeWithSize4 == closestPhotoSizeWithSize3) {
                closestPhotoSizeWithSize4 = null;
            }
            k4Var2.k(ImageLocation.getForPhoto(closestPhotoSizeWithSize4, searchImage.photo), "180_180", ImageLocation.getForPhoto(closestPhotoSizeWithSize3, searchImage.photo), "100_100_b", closestPhotoSizeWithSize4 != null ? closestPhotoSizeWithSize4.size : 0, "jpg", searchImage, 1);
            return;
        }
        di1 di1Var = (di1) obj;
        File file3 = di1Var.i;
        int i10 = di1Var.d;
        int i11 = di1Var.c;
        int i12 = di1Var.b;
        if (file3 == null && di1Var.g == null && !"d".equals(di1Var.a)) {
            k4Var2.setImageBitmap(null);
            if (di1Var.k) {
                k4Var2.setBackground(new vc0(true, di1Var.b, di1Var.c, di1Var.d, di1Var.e));
                return;
            } else if (i11 != 0) {
                k4Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i12 | (-16777216), i11 | (-16777216)}));
                return;
            } else {
                k4Var2.setBackgroundColor(i12 | (-16777216));
                return;
            }
        }
        if (i10 != 0) {
            vc0 vc0Var2 = new vc0(true, di1Var.b, di1Var.c, di1Var.d, di1Var.e);
            if (di1Var.h >= 0.0f) {
                k4Var2.setBackground(new vc0(true, di1Var.b, di1Var.c, di1Var.d, di1Var.e));
                if (Build.VERSION.SDK_INT >= 29) {
                    k4Var2.getImageReceiver().setBlendMode(BlendMode.SOFT_LIGHT);
                }
            } else {
                k4Var2.getImageReceiver().setGradientBitmap(vc0Var2.k);
            }
            patternColor = vc0.g(i12, i11, i10, di1Var.e);
        } else {
            patternColor = AndroidUtilities.getPatternColor(i12);
        }
        int i13 = patternColor;
        if ("d".equals(di1Var.a)) {
            if (di1Var.m == null) {
                di1Var.m = SvgHelper.getBitmap(R.raw.default_pattern, 100, 180, -16777216);
            }
            k4Var2.setImageBitmap(di1Var.m);
            k4Var2.getImageReceiver().setAlpha(Math.abs(di1Var.h));
            return;
        }
        if (file3 != null) {
            k4Var2.g(file3.getAbsolutePath(), "180_180", null);
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(di1Var.g.document.thumbs, 100);
        k4Var2.k(ImageLocation.getForDocument(closestPhotoSizeWithSize5, di1Var.g.document), "180_180", null, null, closestPhotoSizeWithSize5 != null ? closestPhotoSizeWithSize5.size : di1Var.g.document.size, "jpg", di1Var.g, 1);
        k4Var2.getImageReceiver().setAlpha(Math.abs(di1Var.h));
        if (Build.VERSION.SDK_INT < 29 || i10 == 0) {
            k4Var2.getImageReceiver().setColorFilter(new PorterDuffColorFilter(AndroidUtilities.getPatternColor(i13), PorterDuff.Mode.SRC_IN));
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
        fb fbVar = this.s;
        if (!fbVar.b || !this.c.x) {
            di.k4 k4Var = this.a;
            if (k4Var.getImageReceiver().hasBitmapImage() && k4Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i7, false);
            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.k7, false);
            CheckBox checkBox = this.c;
            if (checkBox != null) {
                if (x02 == this.n) {
                    if (x03 != this.r) {
                    }
                }
                this.n = x02;
                this.r = x03;
                checkBox.c(x02, x03);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
