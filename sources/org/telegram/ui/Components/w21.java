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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w21 extends BitmapDrawable {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w21(File file, DocumentObject.ThemeDocument themeDocument) {
        super(r17);
        int i10;
        int i11;
        int i12;
        BitmapDrawable bitmapDrawable;
        org.telegram.ui.ActionBar.f5[] f5VarArr;
        Bitmap bitmap;
        cd0 cd0Var;
        boolean z10;
        Bitmap bitmap2;
        Bitmap decodeFile;
        int i13;
        new RectF();
        Paint paint = new Paint();
        Bitmap createBitmap = Bitmaps.createBitmap(560, 678, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        SparseIntArray R0 = org.telegram.ui.ActionBar.i6.R0(null, themeDocument.baseTheme.d, null);
        SparseIntArray clone = R0.clone();
        themeDocument.accent.c(R0, clone);
        int G0 = org.telegram.ui.ActionBar.i6.G0(clone, org.telegram.ui.ActionBar.i6.s8);
        int G02 = org.telegram.ui.ActionBar.i6.G0(clone, org.telegram.ui.ActionBar.i6.v8);
        int G03 = org.telegram.ui.ActionBar.i6.G0(clone, org.telegram.ui.ActionBar.i6.Sd);
        int G04 = org.telegram.ui.ActionBar.i6.G0(clone, org.telegram.ui.ActionBar.i6.Xd);
        int G05 = org.telegram.ui.ActionBar.i6.G0(clone, org.telegram.ui.ActionBar.i6.ra);
        int G06 = org.telegram.ui.ActionBar.i6.G0(clone, org.telegram.ui.ActionBar.i6.Aa);
        int i14 = clone.get(org.telegram.ui.ActionBar.i6.Nd);
        int i15 = clone.get(org.telegram.ui.ActionBar.i6.Od);
        int i16 = clone.get(org.telegram.ui.ActionBar.i6.Pd);
        int i17 = clone.get(org.telegram.ui.ActionBar.i6.Qd);
        int i18 = clone.get(org.telegram.ui.ActionBar.i6.Rd);
        Drawable mutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
        org.telegram.ui.ActionBar.i6.x1(G02, mutate);
        Drawable mutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.i6.x1(G02, mutate2);
        Drawable mutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.i6.x1(G04, mutate3);
        Drawable mutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.i6.x1(G04, mutate4);
        org.telegram.ui.ActionBar.f5[] f5VarArr2 = new org.telegram.ui.ActionBar.f5[2];
        int i19 = 0;
        while (i19 < 2) {
            Drawable drawable = mutate4;
            v21 v21Var = new v21(i19 == 1, clone);
            f5VarArr2[i19] = v21Var;
            org.telegram.ui.ActionBar.i6.x1(i19 == 1 ? G06 : G05, v21Var);
            i19++;
            mutate4 = drawable;
        }
        Drawable drawable2 = mutate4;
        if (i16 != 0) {
            cd0 cd0Var2 = new cd0(true, i14, i15, i16, i17);
            i10 = i14;
            i11 = i15;
            bitmap = createBitmap;
            f5VarArr = f5VarArr2;
            cd0Var = cd0Var2;
            i12 = 120;
            bitmapDrawable = null;
        } else {
            i10 = i14;
            i11 = i15;
            int width = createBitmap.getWidth();
            int height = createBitmap.getHeight() - 120;
            GradientDrawable.Orientation d = x9.d(i18);
            i12 = 120;
            f5VarArr = f5VarArr2;
            Resources resources = ApplicationLoader.applicationContext.getResources();
            Rect e7 = x9.e(d, width, height);
            bitmap = createBitmap;
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Utilities.drawDitheredGradient(createBitmap2, new int[]{i10, i11}, e7.left, e7.top, e7.right, e7.bottom);
            bitmapDrawable = new BitmapDrawable(resources, createBitmap2);
            cd0Var = null;
        }
        int patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i10, i11));
        if (bitmapDrawable != null) {
            z10 = false;
            bitmapDrawable.setBounds(0, i12, bitmap.getWidth(), bitmap.getHeight() - 120);
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
                float f7 = options.outWidth;
                float f10 = options.outHeight;
                float f11 = 560;
                float f12 = 678;
                float min = Math.min(f7 / f11, f10 / f12);
                min = min < 1.2f ? 1.0f : min;
                options.inJustDecodeBounds = false;
                if (min <= 1.0f || (f7 <= f11 && f10 <= f12)) {
                    options.inSampleSize = (int) min;
                } else {
                    int i20 = 1;
                    while (true) {
                        i13 = i20 * 2;
                        if (i20 * 4 >= min) {
                            break;
                        } else {
                            i20 = i13;
                        }
                    }
                    options.inSampleSize = i13;
                }
                decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            }
            bitmap2 = decodeFile;
            if (bitmap2 != null) {
                if (cd0Var != null) {
                    cd0Var.t(bitmap2, (int) (themeDocument.accent.p * 100.0f));
                    cd0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
                    cd0Var.draw(canvas);
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
        if (bitmap2 == null && cd0Var != null) {
            cd0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
            cd0Var.draw(canvas);
        }
        paint.setColor(G0);
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
        f5VarArr[1].setBounds(161, 216, bitmap.getWidth() - 20, 308);
        f5VarArr[1].n(0, 560, 522);
        f5VarArr[1].draw(canvas);
        f5VarArr[1].setBounds(161, 430, bitmap.getWidth() - 20, 522);
        f5VarArr[1].n(430, 560, 522);
        f5VarArr[1].draw(canvas);
        f5VarArr[0].setBounds(20, 323, 399, 415);
        f5VarArr[0].n(323, 560, 522);
        f5VarArr[0].draw(canvas);
        paint.setColor(G03);
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
