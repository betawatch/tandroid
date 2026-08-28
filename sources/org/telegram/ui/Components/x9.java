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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x9 {
    public DispatchQueue a;
    public final int b;
    public final View c;
    public final kh.h6 d;
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
    public final org.telegram.ui.ActionBar.b6 y;
    public boolean l = true;
    public boolean p = true;
    public w9 v = new w9(this);
    public final Paint w = new Paint(2);

    public x9(View view, kh.h6 h6Var, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint();
        this.x = paint;
        this.b = 1;
        this.c = view;
        this.d = h6Var;
        this.y = b6Var;
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
        this.v = new w9(this);
        for (int i9 = 0; i9 < 2; i9++) {
            kh.h6 h6Var = this.d;
            int measuredHeight = h6Var.getMeasuredHeight();
            int measuredWidth = h6Var.getMeasuredWidth();
            int dp = AndroidUtilities.dp(200.0f) + AndroidUtilities.statusBarHeight;
            this.s = dp;
            if (i9 != 0) {
                dp = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i9];
            if (bitmap == null || bitmap.getHeight() != dp || bitmapArr[i9].getWidth() != h6Var.getMeasuredWidth()) {
                DispatchQueue dispatchQueue = this.a;
                if (dispatchQueue != null) {
                    dispatchQueue.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i9] = Bitmap.createBitmap(i10, (int) (dp / 15.0f), config);
                org.telegram.ui.ActionBar.b6 b6Var = this.y;
                if (i9 == 1) {
                    this.e[i9].eraseColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
                }
                this.j[i9] = new Canvas(this.e[i9]);
                if (i9 == 0) {
                    measuredHeight = this.s;
                }
                this.g[i9] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i9] = new Canvas(this.g[i9]);
                this.h[i9].scale(this.g[i9].getWidth() / this.e[i9].getWidth(), this.g[i9].getHeight() / this.e[i9].getHeight());
                this.j[i9].save();
                this.j[i9].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.c;
                Drawable background = view.getBackground();
                if (background == null) {
                    background = b6Var instanceof org.telegram.ui.on ? ((org.telegram.ui.on) b6Var).d() : org.telegram.ui.ActionBar.f6.s0();
                }
                view.setTag(67108867, Integer.valueOf(i9));
                if (i9 == 0) {
                    this.j[i9].translate(0.0f, -this.u);
                    view.draw(this.j[i9]);
                }
                if (i9 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.j[i9]);
                    background.setBounds(bounds);
                    view.draw(this.j[i9]);
                }
                view.setTag(67108867, null);
                this.j[i9].restore();
                Utilities.stackBlurBitmap(this.e[i9], 15);
                Paint paint = this.w;
                paint.setAlpha(255);
                if (i9 == 1) {
                    this.g[i9].eraseColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
                }
                this.h[i9].drawBitmap(this.e[i9], 0.0f, 0.0f, paint);
            }
        }
    }
}
