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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ja {
    public DispatchQueue a;
    public final int b;
    public final View c;
    public final fi.f6 d;
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
    public final org.telegram.ui.ActionBar.u6 y;
    public boolean l = true;
    public boolean p = true;
    public ia v = new ia(this);
    public final Paint w = new Paint(2);

    public ja(View view, fi.f6 f6Var, org.telegram.ui.ActionBar.u6 u6Var) {
        Paint paint = new Paint();
        this.x = paint;
        this.b = 1;
        this.c = view;
        this.d = f6Var;
        this.y = u6Var;
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
        this.v = new ia(this);
        for (int i10 = 0; i10 < 2; i10++) {
            fi.f6 f6Var = this.d;
            int measuredHeight = f6Var.getMeasuredHeight();
            int measuredWidth = f6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.s = dp;
            if (i10 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i10];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i10].getWidth() != f6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i11 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i10] = Bitmap.createBitmap(i11, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.u6 u6Var = this.y;
                if (i10 == 1) {
                    this.e[i10].eraseColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
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
                    background = u6Var instanceof org.telegram.ui.un ? ((org.telegram.ui.un) u6Var).l() : org.telegram.ui.ActionBar.y6.t0();
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
                    this.g[i10].eraseColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
                }
                this.h[i10].drawBitmap(this.e[i10], 0.0f, 0.0f, paint);
            }
        }
    }
}
