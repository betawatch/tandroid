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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class wz0 extends BitmapDrawable {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wz0(File file, org.telegram.messenger.s5 s5Var) {
        super(r16);
        int i7;
        int i10;
        BitmapDrawable bitmapDrawable;
        int i11;
        Bitmap bitmap;
        qa0 qa0Var;
        Bitmap bitmap2;
        Bitmap decodeFile;
        int i12;
        new RectF();
        Paint paint = new Paint();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap c10 = org.telegram.messenger.as.c(560, 678);
        Canvas canvas = new Canvas(c10);
        SparseIntArray T0 = org.telegram.ui.ActionBar.k6.T0(null, s5Var.c.d, null);
        SparseIntArray clone = T0.clone();
        s5Var.d.d(T0, clone);
        int I0 = org.telegram.ui.ActionBar.k6.I0(clone, org.telegram.ui.ActionBar.k6.s8);
        int I02 = org.telegram.ui.ActionBar.k6.I0(clone, org.telegram.ui.ActionBar.k6.v8);
        int I03 = org.telegram.ui.ActionBar.k6.I0(clone, org.telegram.ui.ActionBar.k6.Ge);
        int I04 = org.telegram.ui.ActionBar.k6.I0(clone, org.telegram.ui.ActionBar.k6.Le);
        int I05 = org.telegram.ui.ActionBar.k6.I0(clone, org.telegram.ui.ActionBar.k6.ra);
        int I06 = org.telegram.ui.ActionBar.k6.I0(clone, org.telegram.ui.ActionBar.k6.ob);
        int i13 = clone.get(org.telegram.ui.ActionBar.k6.Be);
        int i14 = clone.get(org.telegram.ui.ActionBar.k6.Ce);
        int i15 = clone.get(org.telegram.ui.ActionBar.k6.De);
        int i16 = clone.get(org.telegram.ui.ActionBar.k6.Ee);
        int i17 = clone.get(org.telegram.ui.ActionBar.k6.Fe);
        Drawable mutate = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.preview_back).mutate();
        org.telegram.ui.ActionBar.k6.C1(I02, mutate);
        Drawable mutate2 = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
        org.telegram.ui.ActionBar.k6.C1(I02, mutate2);
        Drawable mutate3 = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
        org.telegram.ui.ActionBar.k6.C1(I04, mutate3);
        Drawable mutate4 = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
        org.telegram.ui.ActionBar.k6.C1(I04, mutate4);
        org.telegram.ui.ActionBar.t4[] t4VarArr = new org.telegram.ui.ActionBar.t4[2];
        int i18 = 0;
        while (i18 < 2) {
            Drawable drawable = mutate4;
            org.telegram.ui.ActionBar.t4[] t4VarArr2 = t4VarArr;
            org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(i18 == 1, clone, 1);
            t4VarArr2[i18] = q5Var;
            org.telegram.ui.ActionBar.k6.C1(i18 == 1 ? I06 : I05, q5Var);
            i18++;
            mutate4 = drawable;
            t4VarArr = t4VarArr2;
        }
        Drawable drawable2 = mutate4;
        org.telegram.ui.ActionBar.t4[] t4VarArr3 = t4VarArr;
        if (i15 != 0) {
            i7 = i13;
            i10 = i14;
            i11 = 120;
            qa0Var = new qa0(true, i13, i14, i15, i16);
            bitmapDrawable = null;
            bitmap = c10;
        } else {
            i7 = i13;
            i10 = i14;
            int width = c10.getWidth();
            int height = c10.getHeight() - 120;
            GradientDrawable.Orientation d = k9.d(i17);
            i11 = 120;
            Resources resources = org.telegram.messenger.t0.b.getResources();
            Rect e10 = k9.e(d, width, height);
            bitmap = c10;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Utilities.drawDitheredGradient(createBitmap, new int[]{i7, i10}, e10.left, e10.top, e10.right, e10.bottom);
            bitmapDrawable = new BitmapDrawable(resources, createBitmap);
            qa0Var = null;
        }
        int V0 = org.telegram.messenger.g0.V0(org.telegram.messenger.g0.w0(i7, i10), false);
        if (bitmapDrawable != null) {
            bitmapDrawable.setBounds(0, i11, bitmap.getWidth(), bitmap.getHeight() - 120);
            bitmapDrawable.draw(canvas);
        }
        if (file != null) {
            if ("application/x-tgwallpattern".equals(s5Var.mime_type)) {
                decodeFile = org.telegram.messenger.sz.f(file, 560, 678, 1);
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
                if (qa0Var != null) {
                    qa0Var.s(bitmap2, (int) (s5Var.d.p * 100.0f));
                    qa0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
                    qa0Var.draw(canvas);
                } else {
                    Paint paint2 = new Paint(2);
                    if (s5Var.d.p >= 0.0f) {
                        paint2.setColorFilter(new PorterDuffColorFilter(V0, PorterDuff.Mode.SRC_IN));
                    }
                    paint2.setAlpha(org.telegram.messenger.qs.e4);
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
        if (bitmap2 == null && qa0Var != null) {
            qa0Var.setBounds(0, 120, bitmap.getWidth(), bitmap.getHeight() - 120);
            qa0Var.draw(canvas);
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
        t4VarArr3[1].setBounds(org.telegram.messenger.qs.r2, org.telegram.messenger.qs.t3, bitmap.getWidth() - 20, org.telegram.messenger.qs.f5);
        t4VarArr3[1].p(0, 560, 522);
        t4VarArr3[1].draw(canvas);
        t4VarArr3[1].setBounds(org.telegram.messenger.qs.r2, 430, bitmap.getWidth() - 20, 522);
        t4VarArr3[1].p(430, 560, 522);
        t4VarArr3[1].draw(canvas);
        t4VarArr3[0].setBounds(20, org.telegram.messenger.qs.u5, 399, 415);
        t4VarArr3[0].p(org.telegram.messenger.qs.u5, 560, 522);
        t4VarArr3[0].draw(canvas);
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
