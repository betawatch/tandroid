package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ig extends View {
    public ch0 E;
    public final float[] F;
    public long G;
    public final Paint H;
    public long I;
    public final /* synthetic */ ChatActivityEnterView J;
    public float a;
    public boolean b;
    public boolean c;
    public final ch0 d;
    public boolean e;
    public boolean f;
    public long h;
    public boolean n;
    public long r;
    public float s;
    public float w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.J = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.G = -1L;
        this.H = new Paint(1);
        ch0 ch0Var = new ch0(R.raw.chat_audio_record_delete_2, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.d = ch0Var;
        ch0Var.p0 = true;
        g();
    }

    public static float b(long j3) {
        return (((float) Math.cos(((j3 % 1300) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void c() {
        this.c = true;
        this.I = SystemClock.uptimeMillis();
        ch0 ch0Var = this.d;
        ch0Var.T(true, 0.0f);
        if (this.b) {
            ch0Var.start();
        }
    }

    public final void d() {
        h();
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.J;
        chatActivityEnterView.e4.setColor(chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.ag));
        this.a = 1.0f;
        System.currentTimeMillis();
        this.G = -1L;
        this.h = -1L;
        this.c = false;
        this.d.stop();
        this.n = false;
        this.y = 0.0f;
        this.x = 0.0f;
        this.w = 0.0f;
        invalidate();
    }

    public final float f() {
        float i7 = (1.0f - Utilities.i(this.x / 0.8f, 1.0f, 0.0f)) * this.w;
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, 12.0f * i7 * i7);
    }

    public final void g() {
        int i7 = org.telegram.ui.ActionBar.j6.ag;
        int i10 = ChatActivityEnterView.N6;
        ChatActivityEnterView chatActivityEnterView = this.J;
        int u02 = chatActivityEnterView.u0(i7);
        int u03 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Je);
        int u04 = chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Vf);
        chatActivityEnterView.e4.setColor(u02);
        ch0 ch0Var = this.d;
        ch0Var.a0 = true;
        ch0Var.Q(u04, "Cup Red");
        ch0Var.Q(u04, "Box Red");
        ch0Var.Q(u04, "Cup Grey");
        ch0Var.Q(u04, "Box Grey");
        ch0Var.Q(u04, "Box_Grey 2");
        ch0Var.Q(u04, "Line 1");
        ch0Var.Q(u04, "Line 2");
        ch0Var.Q(u04, "Line 3");
        ch0Var.Q(u03, "Line 1 Dup");
        ch0Var.Q(u03, "Line 2 Dup");
        ch0Var.Q(u03, "Line 3 Dup");
        ch0Var.o();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ch0Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final ch0 h() {
        if (this.E == null) {
            ch0 ch0Var = new ch0(R.raw.chat_audio_record_delete_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            this.E = ch0Var;
            ch0Var.J(true);
            this.E.p0 = false;
            int i7 = org.telegram.ui.ActionBar.j6.Vf;
            int i10 = ChatActivityEnterView.N6;
            int u02 = this.J.u0(i7);
            ch0 ch0Var2 = this.E;
            ch0Var2.a0 = true;
            ch0Var2.Q(u02, "Cup Grey");
            this.E.Q(u02, "Box_Grey 2");
            this.E.Q(u02, "Box Grey");
            this.E.o();
            this.E.R(this);
            this.E.T(true, 0.0f);
        }
        return this.E;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = true;
        boolean z10 = this.c;
        ch0 ch0Var = this.d;
        if (z10) {
            ch0Var.start();
        }
        ch0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        ch0 ch0Var = this.d;
        ch0Var.stop();
        ch0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        char c10;
        ChatActivityEnterView chatActivityEnterView = this.J;
        Paint paint = chatActivityEnterView.e4;
        if (this.n) {
            float min = Math.min(1.0f, (SystemClock.uptimeMillis() - this.r) / 240.0f);
            float f12 = this.y;
            int i7 = ChatActivityEnterView.N6;
            float interpolation = er.i.getInterpolation(Utilities.i(f12 / 0.6f, 1.0f, 0.0f));
            float u22 = 1.0f - ChatActivityEnterView.u2(0.05f, 0.55f, f12);
            float[] fArr = this.F;
            fArr[0] = u22;
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            ch0 h = h();
            float f13 = this.x;
            h.T(true, (f13 > 0.0f ? (Math.min(1.0f, f13) * 14.0f) + 30.0f : this.w * 8.0f) / 52.0f);
            h.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f14 = fArr[1];
            canvas.scale(f14, f14, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(f(), measuredWidth, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float u23 = 1.0f - ChatActivityEnterView.u2(0.25f, 0.85f, min);
            float interpolation2 = er.g.getInterpolation(min);
            if (u23 > 0.0f) {
                c10 = 0;
                paint.setColor(i0.a.f(min2, chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.ag), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Vf)));
                paint.setAlpha((int) (u23 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (org.telegram.messenger.g0.L(2.0f) * interpolation2) + measuredHeight, org.telegram.messenger.g0.T1(this.s, org.telegram.messenger.g0.L(1.5f), interpolation2), paint);
            } else {
                c10 = 0;
            }
            float u24 = ChatActivityEnterView.u2(0.05f, 0.6f, min) * fArr[c10];
            if (u24 > 0.0f && h.u()) {
                float i10 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float T1 = org.telegram.messenger.g0.T1(0.45f, 1.0f, com.google.android.gms.internal.vision.e2.x(i10, 1.1f, i10, (2.1f * i10 * i10 * i10) + 1.0f));
                canvas.save();
                canvas.scale(T1, T1, measuredWidth, measuredHeight + org.telegram.messenger.g0.L(2.0f));
                h.setAlpha((int) (u24 * 255.0f));
                h.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            if (min < 1.0f || !h.u()) {
                invalidate();
                return;
            }
            return;
        }
        if (!this.f) {
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z10 = this.e;
            if (z10 || this.G < 0) {
                this.G = uptimeMillis;
            }
            this.a = (z10 || this.c) ? 1.0f : b(uptimeMillis - this.G);
        }
        if (this.c) {
            f10 = 1.0f;
            f11 = Math.min(1.0f, (SystemClock.uptimeMillis() - this.I) / 160.0f);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        boolean z11 = this.c;
        ch0 ch0Var = this.d;
        if (z11) {
            ch0Var.setAlpha((int) (f11 * 255.0f));
            ch0Var.draw(canvas);
            if (f11 < f10) {
                invalidate();
            }
        }
        if (!this.c || f11 < f10 || !ch0Var.u()) {
            boolean z12 = this.c;
            float f15 = z12 ? 1.0f : this.a;
            float f16 = (z12 && ch0Var.u()) ? 1.0f - f11 : 1.0f;
            if (f16 <= 0.0f) {
                if (this.f) {
                    return;
                }
                invalidate();
                return;
            }
            canvas.save();
            float T12 = org.telegram.messenger.g0.T1(0.4f, 1.0f, f16);
            canvas.scale(T12, T12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            float measuredWidth2 = getMeasuredWidth() / 2.0f;
            float measuredHeight2 = getMeasuredHeight() / 2.0f;
            float T13 = org.telegram.messenger.g0.T1(0.85f, 1.0f, f15) * org.telegram.messenger.g0.L(5.0f);
            if (this.c) {
                paint.setColor(i0.a.f(Math.min(1.0f, f11 * 2.5f), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.ag), chatActivityEnterView.u0(org.telegram.ui.ActionBar.j6.Vf)));
            }
            int color = paint.getColor();
            Paint paint2 = this.H;
            paint2.setColor(color);
            paint2.setAlpha((int) (40.8f * f15 * f16));
            canvas.drawCircle(measuredWidth2, measuredHeight2, org.telegram.messenger.g0.T1(1.35f, 1.75f, f15) * T13, paint2);
            paint.setAlpha((int) (org.telegram.messenger.g0.T1(0.6f, 1.0f, f15) * 255.0f * f16));
            canvas.drawCircle(measuredWidth2, measuredHeight2, T13, paint);
            canvas.restore();
        }
        if (this.f) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
