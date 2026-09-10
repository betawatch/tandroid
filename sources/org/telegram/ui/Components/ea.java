package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ea {
    public DispatchQueue a;
    public final int b;
    public final View c;
    public final bi.s7 d;
    public Bitmap[] e;
    public Bitmap[] f;
    public Bitmap[] g;
    public Canvas[] h;
    public Canvas[] i;
    public Canvas[] j;
    public boolean k;
    public float m;
    public boolean n;
    public boolean o;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public float u;
    public final Paint x;
    public final org.telegram.ui.ActionBar.f6 y;
    public boolean l = true;
    public boolean p = true;
    public da v = new da(this);
    public final Paint w = new Paint(2);

    public ea(View view, bi.s7 s7Var, org.telegram.ui.ActionBar.f6 f6Var) {
        Paint paint = new Paint();
        this.x = paint;
        this.b = 1;
        this.c = view;
        this.d = s7Var;
        this.y = f6Var;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.j = new Canvas[2];
        }
        this.v.a = true;
        this.v = new da(this);
        for (int i10 = 0; i10 < 2; i10++) {
            bi.s7 s7Var = this.d;
            int measuredHeight = s7Var.getMeasuredHeight();
            int measuredWidth = s7Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != s7Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.f6 f6Var = this.y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                }
                this.j[i10] = new Canvas(this.e[i10]);
                if (i10 == 0) {
                    measuredHeight = this.s;
                }
                this.g[i10] = Bitmap.createBitmap(i11, (int) (measuredHeight / 15.0f), config);
                this.h[i10] = new Canvas(this.g[i10]);
                this.h[i10].scale(this.g[i10].getWidth() / this.e[i10].getWidth(), this.g[i10].getHeight() / this.e[i10].getHeight());
                this.j[i10].save();
                this.j[i10].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.c;
                Drawable background = view.getBackground();
                if (background == null) {
                    background = f6Var instanceof org.telegram.ui.bo ? ((org.telegram.ui.bo) f6Var).d() : org.telegram.ui.ActionBar.j6.s0();
                }
                view.setTag(67108867, Integer.valueOf(i10));
                if (i10 == 0) {
                    this.j[i10].translate(0.0f, -this.u);
                    view.draw(this.j[i10]);
                }
                if (i10 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.j[i10]);
                    background.setBounds(bounds);
                    view.draw(this.j[i10]);
                }
                view.setTag(67108867, null);
                this.j[i10].restore();
                Utilities.stackBlurBitmap(this.e[i10], 15);
                Paint paint = this.w;
                paint.setAlpha(255);
                if (i10 == 1) {
                    this.g[i10].eraseColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
