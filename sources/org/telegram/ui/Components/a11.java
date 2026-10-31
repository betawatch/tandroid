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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a11 extends BitmapDrawable {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a11(File file, org.telegram.messenger.u5 u5Var) {
        super(r16);
        int i10;
        int i11;
        BitmapDrawable bitmapDrawable;
        int i12;
        Bitmap bitmap;
        jb0 jb0Var;
        Bitmap bitmap2;
        Bitmap decodeFile;
        int i13;
        new RectF();
        Paint paint = new Paint();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap b10 = org.telegram.messenger.js.b(560, 678);
        Canvas canvas = new Canvas(b10);
        SparseIntArray T0 = org.telegram.ui.ActionBar.t6.T0(null, u5Var.c.d, null);
        SparseIntArray clone = T0.clone();
        u5Var.d.d(T0, clone);
        int I0 = org.telegram.ui.ActionBar.t6.I0(clone, org.telegram.ui.ActionBar.t6.s8);
        int I02 = org.telegram.ui.ActionBar.t6.I0(clone, org.telegram.ui.ActionBar.t6.v8);
        int I03 = org.telegram.ui.ActionBar.t6.I0(clone, org.telegram.ui.ActionBar.t6.Ge);
        int I04 = org.telegram.ui.ActionBar.t6.I0(clone, org.telegram.ui.ActionBar.t6.Le);
        int I05 = org.telegram.ui.ActionBar.t6.I0(clone, org.telegram.ui.ActionBar.t6.ra);
        int I06 = org.telegram.ui.ActionBar.t6.I0(clone, org.telegram.ui.ActionBar.t6.ob);
        int i14 = clone.get(org.telegram.ui.ActionBar.t6.Be);
        int i15 = clone.get(org.telegram.ui.ActionBar.t6.Ce);
        int i16 = clone.get(org.telegram.ui.ActionBar.t6.De);
        int i17 = clone.get(org.telegram.ui.ActionBar.t6.Ee);
        int i18 = clone.get(org.telegram.ui.ActionBar.t6.Fe);
        Drawable mutate = org.telegram.messenger.w0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
        org.telegram.ui.ActionBar.t6.C1(I02, mutate);
        Drawable mutate2 = org.telegram.messenger.w0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.t6.C1(I02, mutate2);
        Drawable mutate3 = org.telegram.messenger.w0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.t6.C1(I04, mutate3);
        Drawable mutate4 = org.telegram.messenger.w0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.t6.C1(I04, mutate4);
        org.telegram.ui.ActionBar.c5[] c5VarArr = new org.telegram.ui.ActionBar.c5[2];
        int i19 = 0;
        while (i19 < 2) {
            Drawable drawable = mutate4;
            org.telegram.ui.ActionBar.c5[] c5VarArr2 = c5VarArr;
            org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(i19 == 1, clone, 1);
            c5VarArr2[i19] = a6Var;
            org.telegram.ui.ActionBar.t6.C1(i19 == 1 ? I06 : I05, a6Var);
            i19++;
            mutate4 = drawable;
            c5VarArr = c5VarArr2;
        }
        Drawable drawable2 = mutate4;
        org.telegram.ui.ActionBar.c5[] c5VarArr3 = c5VarArr;
        if (i16 != 0) {
            i10 = i14;
            i11 = i15;
            i12 = 120;
            jb0Var = new jb0(true, i14, i15, i16, i17);
            bitmapDrawable = null;
            bitmap = b10;
        } else {
            i10 = i14;
            i11 = i15;
            int width = b10.getWidth();
            int height = b10.getHeight() - 120;
            GradientDrawable.Orientation d = f9.d(i18);
            i12 = 120;
            Resources resources = org.telegram.messenger.w0.b.getResources();
            Rect e = f9.e(d, width, height);
            bitmap = b10;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Utilities.drawDitheredGradient(createBitmap, new int[]{i10, i11}, e.left, e.top, e.right, e.bottom);
            bitmapDrawable = new BitmapDrawable(resources, createBitmap);
            jb0Var = null;
        }
        int V0 = org.telegram.messenger.i0.V0(org.telegram.messenger.i0.w0(i10, i11), false);
        if (bitmapDrawable != null) {
            bitmapDrawable.setBounds(0, i12, bitmap.getWidth(), bitmap.getHeight() - 120);
            bitmapDrawable.draw(canvas);
        }
        if (file != null) {
            if ("application/x-tgwallpattern".equals(u5Var.mime_type)) {
                decodeFile = org.telegram.messenger.d00.f(file, 560, 678, 1);
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
                if (jb0Var != null) {
                    jb0Var.s(bitmap2, (int) (u5Var.d.p * 100.0f));
                    jb0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
                    jb0Var.draw(canvas);
                } else {
                    Paint paint2 = new Paint(2);
                    if (u5Var.d.p >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(V0, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(org.telegram.messenger.zs.e4);
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
        paint.setColor(I0);
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
        c5VarArr3[1].setBounds(org.telegram.messenger.zs.r2, org.telegram.messenger.zs.t3, bitmap.getWidth() - 20, org.telegram.messenger.zs.f5);
        c5VarArr3[1].p(0, 560, 522);
        c5VarArr3[1].draw(canvas);
        c5VarArr3[1].setBounds(org.telegram.messenger.zs.r2, 430, bitmap.getWidth() - 20, 522);
        c5VarArr3[1].p(430, 560, 522);
        c5VarArr3[1].draw(canvas);
        c5VarArr3[0].setBounds(20, org.telegram.messenger.zs.u5, 399, 415);
        c5VarArr3[0].p(org.telegram.messenger.zs.u5, 560, 522);
        c5VarArr3[0].draw(canvas);
        paint.setColor(I03);
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
