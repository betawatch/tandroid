package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v9 {
    public org.telegram.messenger.q5 a;
    public final int b;
    public final View c;
    public final gi.n5 d;
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
    public final org.telegram.ui.ActionBar.e6 y;
    public boolean l = true;
    public boolean p = true;
    public u9 v = new u9(this);
    public final Paint w = new Paint(2);

    public v9(View view, gi.n5 n5Var, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint();
        this.x = paint;
        this.b = 1;
        this.c = view;
        this.d = n5Var;
        this.y = e6Var;
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
        this.v = new u9(this);
        for (int i3 = 0; i3 < 2; i3++) {
            gi.n5 n5Var = this.d;
            int measuredHeight = n5Var.getMeasuredHeight();
            int measuredWidth = n5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.m;
            this.s = L;
            if (i3 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i3];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i3].getWidth() != n5Var.getMeasuredWidth()) {
                org.telegram.messenger.q5 q5Var = this.a;
                if (q5Var != null) {
                    q5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i3] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.e6 e6Var = this.y;
                if (i3 == 1) {
                    this.e[i3].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
                }
                this.j[i3] = new Canvas(this.e[i3]);
                if (i3 == 0) {
                    measuredHeight = this.s;
                }
                this.g[i3] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i3] = new Canvas(this.g[i3]);
                this.h[i3].scale(this.g[i3].getWidth() / this.e[i3].getWidth(), this.g[i3].getHeight() / this.e[i3].getHeight());
                this.j[i3].save();
                this.j[i3].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.c;
                Drawable background = view.getBackground();
                if (background == null) {
                    background = e6Var instanceof org.telegram.ui.um ? ((org.telegram.ui.um) e6Var).m() : org.telegram.ui.ActionBar.k6.t0();
                }
                view.setTag(67108867, Integer.valueOf(i3));
                if (i3 == 0) {
                    this.j[i3].translate(0.0f, -this.u);
                    view.draw(this.j[i3]);
                }
                if (i3 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.j[i3]);
                    background.setBounds(bounds);
                    view.draw(this.j[i3]);
                }
                view.setTag(67108867, null);
                this.j[i3].restore();
                Utilities.stackBlurBitmap(this.e[i3], 15);
                Paint paint = this.w;
                paint.setAlpha(org.telegram.messenger.hs.e4);
                if (i3 == 1) {
                    this.g[i3].eraseColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
                }
                this.h[i3].drawBitmap(this.e[i3], 0.0f, 0.0f, paint);
            }
        }
    }
}
