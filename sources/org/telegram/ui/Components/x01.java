package org.telegram.ui.Components;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x01 extends BitmapDrawable {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x01(File file, DocumentObject.ThemeDocument themeDocument) {
        super(r17);
        int i9;
        int i10;
        BitmapDrawable bitmapDrawable;
        org.telegram.ui.ActionBar.d5[] d5VarArr;
        Bitmap bitmap;
        jb0 jb0Var;
        boolean z10;
        Bitmap bitmap2;
        Bitmap decodeFile;
        int i11;
        new RectF();
        Paint paint = new Paint();
        Bitmap createBitmap = Bitmaps.createBitmap(560, 678, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        SparseIntArray Q0 = org.telegram.ui.ActionBar.f6.Q0(null, themeDocument.baseTheme.d, null);
        SparseIntArray clone = Q0.clone();
        themeDocument.accent.c(Q0, clone);
        int F0 = org.telegram.ui.ActionBar.f6.F0(clone, org.telegram.ui.ActionBar.f6.s8);
        int F02 = org.telegram.ui.ActionBar.f6.F0(clone, org.telegram.ui.ActionBar.f6.v8);
        int F03 = org.telegram.ui.ActionBar.f6.F0(clone, org.telegram.ui.ActionBar.f6.Sd);
        int F04 = org.telegram.ui.ActionBar.f6.F0(clone, org.telegram.ui.ActionBar.f6.Xd);
        int F05 = org.telegram.ui.ActionBar.f6.F0(clone, org.telegram.ui.ActionBar.f6.ra);
        int F06 = org.telegram.ui.ActionBar.f6.F0(clone, org.telegram.ui.ActionBar.f6.Aa);
        int i12 = clone.get(org.telegram.ui.ActionBar.f6.Nd);
        int i13 = clone.get(org.telegram.ui.ActionBar.f6.Od);
        int i14 = clone.get(org.telegram.ui.ActionBar.f6.Pd);
        int i15 = clone.get(org.telegram.ui.ActionBar.f6.Qd);
        int i16 = clone.get(org.telegram.ui.ActionBar.f6.Rd);
        Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        org.telegram.ui.ActionBar.f6.w1(F02, mutate);
        Drawable mutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.f6.w1(F02, mutate2);
        Drawable mutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.f6.w1(F04, mutate3);
        Drawable mutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.f6.w1(F04, mutate4);
        org.telegram.ui.ActionBar.d5[] d5VarArr2 = new org.telegram.ui.ActionBar.d5[2];
        int i17 = 0;
        while (i17 < 2) {
            Drawable drawable = mutate4;
            w01 w01Var = new w01(i17 == 1, clone);
            d5VarArr2[i17] = w01Var;
            org.telegram.ui.ActionBar.f6.w1(i17 == 1 ? F06 : F05, w01Var);
            i17++;
            mutate4 = drawable;
        }
        Drawable drawable2 = mutate4;
        if (i14 != 0) {
            jb0 jb0Var2 = new jb0(true, i12, i13, i14, i15);
            i9 = i12;
            i10 = i13;
            bitmap = createBitmap;
            d5VarArr = d5VarArr2;
            jb0Var = jb0Var2;
            bitmapDrawable = null;
        } else {
            i9 = i12;
            i10 = i13;
            int width = createBitmap.getWidth();
            int height = createBitmap.getHeight() - 120;
            GradientDrawable.Orientation d = n9.d(i16);
            d5VarArr = d5VarArr2;
            Resources resources = ApplicationLoader.applicationContext.getResources();
            Rect e10 = n9.e(d, width, height);
            bitmap = createBitmap;
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Utilities.drawDitheredGradient(createBitmap2, new int[]{i9, i10}, e10.left, e10.top, e10.right, e10.bottom);
            bitmapDrawable = new BitmapDrawable(resources, createBitmap2);
            jb0Var = null;
        }
        int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i9, i10));
        if (bitmapDrawable != null) {
            z10 = false;
            bitmapDrawable.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
            bitmapDrawable.draw(canvas);
        } else {
            z10 = false;
        }
        if (file != null) {
            if ("application/x-tgwallpattern".equals(themeDocument.mime_type)) {
                decodeFile = SvgHelper.getBitmap(file, 560, 678, z10);
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                float f10 = options.outWidth;
                float f11 = options.outHeight;
                float f12 = 560;
                float f13 = 678;
                float min = Math.min(f10 / f12, f11 / f13);
                min = min < 1.2f ? 1.0f : min;
                options.inJustDecodeBounds = false;
                if (min <= 1.0f || (f10 <= f12 && f11 <= f13)) {
                    options.inSampleSize = (int) min;
                } else {
                    int i18 = 1;
                    while (true) {
                        i11 = i18 * 2;
                        if (i18 * 4 >= min) {
                            break;
                        } else {
                            i18 = i11;
                        }
                    }
                    options.inSampleSize = i11;
                }
                decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            bitmap2 = decodeFile;
            if (bitmap2 != null) {
                if (jb0Var != null) {
                    jb0Var.t(bitmap2, (int) (themeDocument.accent.p * 100.0f));
                    jb0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
                    jb0Var.draw(canvas);
                } else {
                    Paint paint2 = new Paint(2);
                    if (themeDocument.accent.p >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(255);
                    float max = Math.max(560 / bitmap2.getWidth(), 678 / bitmap2.getHeight());
                    int width2 = (int) (bitmap2.getWidth() * max);
                    canvas.save();
                    canvas.translate((560 - width2) / 2, (678 - ((int) (bitmap2.getHeight() * max))) / 2);
                    canvas.scale(max, max);
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint2);
                    canvas.restore();
                }
            }
        } else {
            bitmap2 = null;
        }
        if (bitmap2 == null && jb0Var != null) {
            jb0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
            jb0Var.draw(canvas);
        }
        paint.setColor(F0);
        canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), 120.0f, paint);
        if (mutate != null) {
            int intrinsicHeight = (120 - mutate.getIntrinsicHeight()) / 2;
            mutate.setBounds(13, intrinsicHeight, mutate.getIntrinsicWidth() + 13, mutate.getIntrinsicHeight() + intrinsicHeight);
            mutate.draw(canvas);
        }
        if (mutate2 != null) {
            int width3 = (bitmap.getWidth() - mutate2.getIntrinsicWidth()) - 10;
            int intrinsicHeight2 = (120 - mutate2.getIntrinsicHeight()) / 2;
            mutate2.setBounds(width3, intrinsicHeight2, mutate2.getIntrinsicWidth() + width3, mutate2.getIntrinsicHeight() + intrinsicHeight2);
            mutate2.draw(canvas);
        }
        d5VarArr[1].setBounds(161, 216, bitmap.getWidth() - 20, 308);
        d5VarArr[1].n(0, 560, 522);
        d5VarArr[1].draw(canvas);
        d5VarArr[1].setBounds(161, 430, bitmap.getWidth() - 20, 522);
        d5VarArr[1].n(430, 560, 522);
        d5VarArr[1].draw(canvas);
        d5VarArr[0].setBounds(20, 323, 399, 415);
        d5VarArr[0].n(323, 560, 522);
        d5VarArr[0].draw(canvas);
        paint.setColor(F03);
        canvas.drawRect(0.0f, bitmap.getHeight() - 120, bitmap.getWidth(), bitmap.getHeight(), paint);
        if (mutate3 != null) {
            int intrinsicHeight3 = ((120 - mutate3.getIntrinsicHeight()) / 2) + (bitmap.getHeight() - 120);
            mutate3.setBounds(22, intrinsicHeight3, mutate3.getIntrinsicWidth() + 22, mutate3.getIntrinsicHeight() + intrinsicHeight3);
            mutate3.draw(canvas);
        }
        if (drawable2 != null) {
            int width4 = (bitmap.getWidth() - drawable2.getIntrinsicWidth()) - 22;
            int intrinsicHeight4 = ((120 - drawable2.getIntrinsicHeight()) / 2) + (bitmap.getHeight() - 120);
            drawable2.setBounds(width4, intrinsicHeight4, drawable2.getIntrinsicWidth() + width4, drawable2.getIntrinsicHeight() + intrinsicHeight4);
            drawable2.draw(canvas);
        }
    }
}
