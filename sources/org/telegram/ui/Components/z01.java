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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z01 extends BitmapDrawable {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z01(File file, DocumentObject.ThemeDocument themeDocument) {
        super(r17);
        int i10;
        int i11;
        BitmapDrawable bitmapDrawable;
        org.telegram.ui.ActionBar.d5[] d5VarArr;
        Bitmap bitmap;
        nb0 nb0Var;
        boolean z10;
        Bitmap bitmap2;
        Bitmap decodeFile;
        int i12;
        new RectF();
        Paint paint = new Paint();
        Bitmap createBitmap = Bitmaps.createBitmap(560, 678, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        SparseIntArray Q0 = org.telegram.ui.ActionBar.g6.Q0(null, themeDocument.baseTheme.d, null);
        SparseIntArray clone = Q0.clone();
        themeDocument.accent.c(Q0, clone);
        int F0 = org.telegram.ui.ActionBar.g6.F0(clone, org.telegram.ui.ActionBar.g6.s8);
        int F02 = org.telegram.ui.ActionBar.g6.F0(clone, org.telegram.ui.ActionBar.g6.v8);
        int F03 = org.telegram.ui.ActionBar.g6.F0(clone, org.telegram.ui.ActionBar.g6.Sd);
        int F04 = org.telegram.ui.ActionBar.g6.F0(clone, org.telegram.ui.ActionBar.g6.Xd);
        int F05 = org.telegram.ui.ActionBar.g6.F0(clone, org.telegram.ui.ActionBar.g6.ra);
        int F06 = org.telegram.ui.ActionBar.g6.F0(clone, org.telegram.ui.ActionBar.g6.Aa);
        int i13 = clone.get(org.telegram.ui.ActionBar.g6.Nd);
        int i14 = clone.get(org.telegram.ui.ActionBar.g6.Od);
        int i15 = clone.get(org.telegram.ui.ActionBar.g6.Pd);
        int i16 = clone.get(org.telegram.ui.ActionBar.g6.Qd);
        int i17 = clone.get(org.telegram.ui.ActionBar.g6.Rd);
        Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        org.telegram.ui.ActionBar.g6.w1(F02, mutate);
        Drawable mutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.g6.w1(F02, mutate2);
        Drawable mutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.g6.w1(F04, mutate3);
        Drawable mutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.g6.w1(F04, mutate4);
        org.telegram.ui.ActionBar.d5[] d5VarArr2 = new org.telegram.ui.ActionBar.d5[2];
        int i18 = 0;
        while (i18 < 2) {
            Drawable drawable = mutate4;
            y01 y01Var = new y01(i18 == 1, clone);
            d5VarArr2[i18] = y01Var;
            org.telegram.ui.ActionBar.g6.w1(i18 == 1 ? F06 : F05, y01Var);
            i18++;
            mutate4 = drawable;
        }
        Drawable drawable2 = mutate4;
        if (i15 != 0) {
            nb0 nb0Var2 = new nb0(true, i13, i14, i15, i16);
            i10 = i13;
            i11 = i14;
            bitmap = createBitmap;
            d5VarArr = d5VarArr2;
            nb0Var = nb0Var2;
            bitmapDrawable = null;
        } else {
            i10 = i13;
            i11 = i14;
            int width = createBitmap.getWidth();
            int height = createBitmap.getHeight() - 120;
            GradientDrawable.Orientation d = m9.d(i17);
            d5VarArr = d5VarArr2;
            Resources resources = ApplicationLoader.applicationContext.getResources();
            Rect e9 = m9.e(d, width, height);
            bitmap = createBitmap;
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Utilities.drawDitheredGradient(createBitmap2, new int[]{i10, i11}, e9.left, e9.top, e9.right, e9.bottom);
            bitmapDrawable = new BitmapDrawable(resources, createBitmap2);
            nb0Var = null;
        }
        int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i10, i11));
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
                    int i19 = 1;
                    while (true) {
                        i12 = i19 * 2;
                        if (i19 * 4 >= min) {
                            break;
                        } else {
                            i19 = i12;
                        }
                    }
                    options.inSampleSize = i12;
                }
                decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            bitmap2 = decodeFile;
            if (bitmap2 != null) {
                if (nb0Var != null) {
                    nb0Var.t(bitmap2, (int) (themeDocument.accent.p * 100.0f));
                    nb0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
                    nb0Var.draw(canvas);
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
        if (bitmap2 == null && nb0Var != null) {
            nb0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
            nb0Var.draw(canvas);
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
