package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class nm0 extends FrameLayout {
    public int D;
    public int E;
    public int F;
    public boolean G;
    public final /* synthetic */ pm0 H;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public float d;
    public float e;
    public float f;
    public float h;
    public int n;
    public float r;
    public float s;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm0(pm0 pm0Var, Context context) {
        super(context);
        this.H = pm0Var;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 600.0f;
        this.e = 600.0f;
        this.f = -1.0f;
        this.h = -1.0f;
        this.n = 0;
        this.r = 0.0f;
        this.s = 0.0f;
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(1073412858);
        this.a.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new d0(this, 4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        pm0 pm0Var = this.H;
        BitmapDrawable bitmapDrawable = pm0Var.b;
        if (bitmapDrawable != null) {
            try {
                int i7 = this.y;
                int i10 = this.D;
                bitmapDrawable.setBounds(i7, i10, this.w + i7, this.x + i10);
                pm0Var.b.draw(canvas);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        canvas.drawRect(this.y, this.D, r0 + this.w, this.h, this.c);
        float f10 = this.y;
        float f11 = this.h;
        canvas.drawRect(f10, f11, this.f, f11 + this.e, this.c);
        float f12 = this.f + this.d;
        float f13 = this.h;
        canvas.drawRect(f12, f13, this.y + this.w, f13 + this.e, this.c);
        canvas.drawRect(this.y, this.h + this.e, r0 + this.w, this.D + this.x, this.c);
        float f14 = this.f;
        float f15 = this.h;
        canvas.drawRect(f14, f15, f14 + this.d, f15 + this.e, this.a);
        int L = org.telegram.messenger.g0.L(1.0f);
        float f16 = L;
        float f17 = this.f + f16;
        float f18 = L * 3;
        canvas.drawRect(f17, this.h + f16, f17 + org.telegram.messenger.g0.L(20.0f), this.h + f18, this.b);
        float f19 = this.f;
        float f20 = this.h + f16;
        canvas.drawRect(f19 + f16, f20, f19 + f18, f20 + org.telegram.messenger.g0.L(20.0f), this.b);
        float L2 = ((this.f + this.d) - f16) - org.telegram.messenger.g0.L(20.0f);
        float f21 = this.h;
        canvas.drawRect(L2, f21 + f16, (this.f + this.d) - f16, f21 + f18, this.b);
        float f22 = this.f + this.d;
        float f23 = this.h + f16;
        canvas.drawRect(f22 - f18, f23, f22 - f16, f23 + org.telegram.messenger.g0.L(20.0f), this.b);
        canvas.drawRect(this.f + f16, ((this.h + this.e) - f16) - org.telegram.messenger.g0.L(20.0f), this.f + f18, (this.h + this.e) - f16, this.b);
        float f24 = this.f + f16;
        canvas.drawRect(f24, (this.h + this.e) - f18, f24 + org.telegram.messenger.g0.L(20.0f), (this.h + this.e) - f16, this.b);
        float L3 = ((this.f + this.d) - f16) - org.telegram.messenger.g0.L(20.0f);
        float f25 = this.h + this.e;
        canvas.drawRect(L3, f25 - f18, (this.f + this.d) - f16, f25 - f16, this.b);
        canvas.drawRect((this.f + this.d) - f18, ((this.h + this.e) - f16) - org.telegram.messenger.g0.L(20.0f), (this.f + this.d) - f16, (this.h + this.e) - f16, this.b);
        for (int i11 = 1; i11 < 3; i11++) {
            float f26 = this.f;
            float f27 = i11;
            float f28 = (this.d / 3.0f) * f27;
            float f29 = this.h;
            canvas.drawRect(f28 + f26, f29 + f16, f26 + f16 + f28, (f29 + this.e) - f16, this.b);
            float f30 = this.f;
            float c10 = com.google.android.recaptcha.internal.a.c(this.e, 3.0f, f27, this.h);
            canvas.drawRect(f30 + f16, c10, (f30 - f16) + this.d, c10 + f16, this.b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        pm0 pm0Var;
        Bitmap bitmap;
        super.onLayout(z9, i7, i10, i11, i12);
        this.E = (i11 - i7) - org.telegram.messenger.g0.L(28.0f);
        int L = (i12 - i10) - org.telegram.messenger.g0.L(28.0f);
        this.F = L;
        if (this.E == 0 || L == 0 || (bitmap = (pm0Var = this.H).a) == null) {
            return;
        }
        float f10 = this.f - this.y;
        float f11 = this.w;
        float f12 = f10 / f11;
        float f13 = this.h - this.D;
        float f14 = this.x;
        float f15 = f13 / f14;
        float f16 = this.d / f11;
        float f17 = this.e / f14;
        float width = bitmap.getWidth();
        float height = pm0Var.a.getHeight();
        int i13 = this.E;
        float f18 = i13 / width;
        int i14 = this.F;
        if (f18 > i14 / height) {
            this.x = i14;
            this.w = (int) Math.ceil(width * r5);
        } else {
            this.w = i13;
            this.x = (int) Math.ceil(height * f18);
        }
        this.y = org.telegram.messenger.g0.L(14.0f) + ((this.E - this.w) / 2);
        int L2 = org.telegram.messenger.g0.L(14.0f) + ((this.F - this.x) / 2);
        this.D = L2;
        if (this.f != -1.0f || this.h != -1.0f) {
            float f19 = this.w;
            this.f = (f12 * f19) + this.y;
            float f20 = this.x;
            this.h = (f15 * f20) + L2;
            this.d = f16 * f19;
            this.e = f17 * f20;
        } else if (this.G) {
            this.h = L2;
            this.f = this.y;
            this.d = this.w;
            this.e = this.x;
        } else {
            if (this.w > this.x) {
                this.h = L2;
                this.f = org.telegram.messenger.g0.L(14.0f) + ((this.E - r11) / 2);
                float f21 = this.x;
                this.d = f21;
                this.e = f21;
            } else {
                this.f = this.y;
                this.h = org.telegram.messenger.g0.L(14.0f) + ((this.F - r9) / 2);
                float f22 = this.w;
                this.d = f22;
                this.e = f22;
            }
        }
        invalidate();
    }
}
