package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class lq0 extends FrameLayout {
    public int E;
    public int F;
    public boolean G;
    public final /* synthetic */ nq0 H;
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
    public int v;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(nq0 nq0Var, Context context) {
        super(context);
        this.H = nq0Var;
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
        this.a.setStrokeWidth(AndroidUtilities.dp(2.0f));
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
        nq0 nq0Var = this.H;
        BitmapDrawable bitmapDrawable = nq0Var.b;
        if (bitmapDrawable != null) {
            try {
                int i10 = this.x;
                int i11 = this.y;
                bitmapDrawable.setBounds(i10, i11, this.v + i10, this.w + i11);
                nq0Var.b.draw(canvas);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        canvas.drawRect(this.x, this.y, r0 + this.v, this.h, this.c);
        float f7 = this.x;
        float f10 = this.h;
        canvas.drawRect(f7, f10, this.f, f10 + this.e, this.c);
        float f11 = this.f + this.d;
        float f12 = this.h;
        canvas.drawRect(f11, f12, this.x + this.v, f12 + this.e, this.c);
        canvas.drawRect(this.x, this.h + this.e, r14 + this.v, this.y + this.w, this.c);
        float f13 = this.f;
        float f14 = this.h;
        canvas.drawRect(f13, f14, f13 + this.d, f14 + this.e, this.a);
        int dp = AndroidUtilities.dp(1.0f);
        float f15 = this.f;
        float f16 = dp;
        float f17 = dp * 3;
        canvas.drawRect(f15 + f16, this.h + f16, f15 + f16 + AndroidUtilities.dp(20.0f), this.h + f17, this.b);
        float f18 = this.f;
        float f19 = this.h;
        canvas.drawRect(f18 + f16, f19 + f16, f18 + f17, f19 + f16 + AndroidUtilities.dp(20.0f), this.b);
        float dp2 = ((this.f + this.d) - f16) - AndroidUtilities.dp(20.0f);
        float f20 = this.h;
        canvas.drawRect(dp2, f20 + f16, (this.f + this.d) - f16, f20 + f17, this.b);
        float f21 = this.f;
        float f22 = this.d;
        float f23 = this.h;
        canvas.drawRect((f21 + f22) - f17, f23 + f16, (f21 + f22) - f16, f23 + f16 + AndroidUtilities.dp(20.0f), this.b);
        canvas.drawRect(this.f + f16, ((this.h + this.e) - f16) - AndroidUtilities.dp(20.0f), this.f + f17, (this.h + this.e) - f16, this.b);
        float f24 = this.f;
        canvas.drawRect(f24 + f16, (this.h + this.e) - f17, f24 + f16 + AndroidUtilities.dp(20.0f), (this.h + this.e) - f16, this.b);
        float dp3 = ((this.f + this.d) - f16) - AndroidUtilities.dp(20.0f);
        float f25 = this.h;
        float f26 = this.e;
        canvas.drawRect(dp3, (f25 + f26) - f17, (this.f + this.d) - f16, (f25 + f26) - f16, this.b);
        canvas.drawRect((this.f + this.d) - f17, ((this.h + this.e) - f16) - AndroidUtilities.dp(20.0f), (this.f + this.d) - f16, (this.h + this.e) - f16, this.b);
        for (int i12 = 1; i12 < 3; i12++) {
            float f27 = this.f;
            float f28 = this.d;
            float f29 = i12;
            float f30 = this.h;
            canvas.drawRect(((f28 / 3.0f) * f29) + f27, f30 + f16, a4.a.e(f28, 3.0f, f29, f27 + f16), (f30 + this.e) - f16, this.b);
            float f31 = this.f;
            float f32 = this.h;
            float f33 = this.e;
            canvas.drawRect(f31 + f16, a4.a.e(f33, 3.0f, f29, f32), this.d + (f31 - f16), ((f33 / 3.0f) * f29) + f32 + f16, this.b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nq0 nq0Var;
        Bitmap bitmap;
        super.onLayout(z10, i10, i11, i12, i13);
        this.E = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int dp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.F = dp;
        if (this.E == 0 || dp == 0 || (bitmap = (nq0Var = this.H).a) == null) {
            return;
        }
        float f7 = this.f - this.x;
        float f10 = this.v;
        float f11 = f7 / f10;
        float f12 = this.h - this.y;
        float f13 = this.w;
        float f14 = f12 / f13;
        float f15 = this.d / f10;
        float f16 = this.e / f13;
        float width = bitmap.getWidth();
        float height = nq0Var.a.getHeight();
        int i14 = this.E;
        float f17 = i14 / width;
        int i15 = this.F;
        if (f17 > i15 / height) {
            this.w = i15;
            this.v = (int) Math.ceil(width * r5);
        } else {
            this.v = i14;
            this.w = (int) Math.ceil(height * f17);
        }
        this.x = AndroidUtilities.dp(14.0f) + ((this.E - this.v) / 2);
        int dp2 = AndroidUtilities.dp(14.0f) + ((this.F - this.w) / 2);
        this.y = dp2;
        if (this.f != -1.0f || this.h != -1.0f) {
            float f18 = this.v;
            this.f = (f11 * f18) + this.x;
            float f19 = this.w;
            this.h = (f14 * f19) + dp2;
            this.d = f15 * f18;
            this.e = f16 * f19;
        } else if (this.G) {
            this.h = dp2;
            this.f = this.x;
            this.d = this.v;
            this.e = this.w;
        } else {
            if (this.v > this.w) {
                this.h = dp2;
                this.f = AndroidUtilities.dp(14.0f) + ((this.E - r11) / 2);
                float f20 = this.w;
                this.d = f20;
                this.e = f20;
            } else {
                this.f = this.x;
                this.h = AndroidUtilities.dp(14.0f) + ((this.F - r9) / 2);
                float f21 = this.v;
                this.d = f21;
                this.e = f21;
            }
        }
        invalidate();
    }
}
