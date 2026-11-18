package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class aa {
    public org.telegram.messenger.r5 a;
    public final int b;
    public final View c;
    public final hi.m5 d;
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
    public final org.telegram.ui.ActionBar.i6 y;
    public boolean l = true;
    public boolean p = true;
    public z9 v = new z9(this);
    public final Paint w = new Paint(2);

    public aa(View view, hi.m5 m5Var, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint();
        this.x = paint;
        this.b = 1;
        this.c = view;
        this.d = m5Var;
        this.y = i6Var;
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
        this.v = new z9(this);
        for (int i7 = 0; i7 < 2; i7++) {
            hi.m5 m5Var = this.d;
            int measuredHeight = m5Var.getMeasuredHeight();
            int measuredWidth = m5Var.getMeasuredWidth();
            int L = org.telegram.messenger.g0.L(200.0f) + org.telegram.messenger.g0.m;
            this.s = L;
            if (i7 != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i7];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i7].getWidth() != m5Var.getMeasuredWidth()) {
                org.telegram.messenger.r5 r5Var = this.a;
                if (r5Var != null) {
                    r5Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i10 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i7] = Bitmap.createBitmap(i10, (int) (L / 15.0f), config);
                org.telegram.ui.ActionBar.i6 i6Var = this.y;
                if (i7 == 1) {
                    this.e[i7].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var));
                }
                this.j[i7] = new Canvas(this.e[i7]);
                if (i7 == 0) {
                    measuredHeight = this.s;
                }
                this.g[i7] = Bitmap.createBitmap(i10, (int) (measuredHeight / 15.0f), config);
                this.h[i7] = new Canvas(this.g[i7]);
                this.h[i7].scale(this.g[i7].getWidth() / this.e[i7].getWidth(), this.g[i7].getHeight() / this.e[i7].getHeight());
                this.j[i7].save();
                this.j[i7].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.c;
                Drawable background = view.getBackground();
                if (background == null) {
                    background = i6Var instanceof org.telegram.ui.zm ? ((org.telegram.ui.zm) i6Var).c() : org.telegram.ui.ActionBar.n6.t0();
                }
                view.setTag(67108867, Integer.valueOf(i7));
                if (i7 == 0) {
                    this.j[i7].translate(0.0f, -this.u);
                    view.draw(this.j[i7]);
                }
                if (i7 == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.j[i7]);
                    background.setBounds(bounds);
                    view.draw(this.j[i7]);
                }
                view.setTag(67108867, null);
                this.j[i7].restore();
                Utilities.stackBlurBitmap(this.e[i7], 15);
                Paint paint = this.w;
                paint.setAlpha(org.telegram.messenger.ks.e4);
                if (i7 == 1) {
                    this.g[i7].eraseColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var));
                }
                this.h[i7].drawBitmap(this.e[i7], 0.0f, 0.0f, paint);
            }
        }
    }
}
