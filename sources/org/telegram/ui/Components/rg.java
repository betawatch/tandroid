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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class rg extends View {
    public mh0 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final /* synthetic */ ChatActivityEnterView K;
    public float a;
    public boolean b;
    public boolean c;
    public final mh0 d;
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
    public rg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        mh0 mh0Var = new mh0(R.raw.chat_audio_record_delete_2, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.d = mh0Var;
        mh0Var.p0 = true;
        h();
    }

    public static float b(long j3) {
        return (((float) Math.cos(((j3 % 1300) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void c() {
        this.c = true;
        this.J = SystemClock.uptimeMillis();
        mh0 mh0Var = this.d;
        mh0Var.T(true, 0.0f);
        if (this.b) {
            mh0Var.start();
        }
    }

    public final void d() {
        i();
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.k4.setColor(chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.ag));
        this.a = 1.0f;
        System.currentTimeMillis();
        this.H = -1L;
        this.h = -1L;
        this.c = false;
        this.d.stop();
        this.n = false;
        this.y = 0.0f;
        this.x = 0.0f;
        this.w = 0.0f;
        invalidate();
    }

    public final void f(boolean z10) {
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        if (z10) {
            i();
        }
        invalidate();
    }

    public final float g() {
        float i7 = (1.0f - Utilities.i(this.x / 0.8f, 1.0f, 0.0f)) * this.w;
        return com.google.android.gms.internal.vision.e2.C(i7, 2.0f, 3.0f, 12.0f * i7 * i7);
    }

    public final void h() {
        int i7 = org.telegram.ui.ActionBar.n6.ag;
        int i10 = ChatActivityEnterView.n7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int C0 = chatActivityEnterView.C0(i7);
        int C02 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Je);
        int C03 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Vf);
        chatActivityEnterView.k4.setColor(C0);
        mh0 mh0Var = this.d;
        mh0Var.a0 = true;
        mh0Var.Q(C03, "Cup Red");
        mh0Var.Q(C03, "Box Red");
        mh0Var.Q(C03, "Cup Grey");
        mh0Var.Q(C03, "Box Grey");
        mh0Var.Q(C03, "Box_Grey 2");
        mh0Var.Q(C03, "Line 1");
        mh0Var.Q(C03, "Line 2");
        mh0Var.Q(C03, "Line 3");
        mh0Var.Q(C02, "Line 1 Dup");
        mh0Var.Q(C02, "Line 2 Dup");
        mh0Var.Q(C02, "Line 3 Dup");
        mh0Var.o();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        mh0Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final mh0 i() {
        if (this.E == null) {
            mh0 mh0Var = new mh0(R.raw.chat_audio_record_delete_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            this.E = mh0Var;
            mh0Var.J(true);
            this.E.p0 = false;
            int i7 = org.telegram.ui.ActionBar.n6.Vf;
            int i10 = ChatActivityEnterView.n7;
            int C0 = this.K.C0(i7);
            mh0 mh0Var2 = this.E;
            mh0Var2.a0 = true;
            mh0Var2.Q(C0, "Cup Grey");
            this.E.Q(C0, "Box_Grey 2");
            this.E.Q(C0, "Box Grey");
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
        mh0 mh0Var = this.d;
        if (z10) {
            mh0Var.start();
        }
        mh0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        mh0 mh0Var = this.d;
        mh0Var.stop();
        mh0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        char c10;
        ChatActivityEnterView chatActivityEnterView = this.K;
        Paint paint = chatActivityEnterView.k4;
        if (this.n) {
            float min = Math.min(1.0f, (SystemClock.uptimeMillis() - this.r) / 240.0f);
            float f12 = this.y;
            int i7 = ChatActivityEnterView.n7;
            float interpolation = lr.i.getInterpolation(Utilities.i(f12 / 0.6f, 1.0f, 0.0f));
            float E2 = 1.0f - ChatActivityEnterView.E2(0.05f, 0.55f, f12);
            float[] fArr = this.F;
            fArr[0] = E2;
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            mh0 i10 = i();
            float f13 = this.x;
            i10.T(true, (f13 > 0.0f ? (Math.min(1.0f, f13) * 14.0f) + 30.0f : this.w * 8.0f) / 52.0f);
            i10.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f14 = fArr[1];
            canvas.scale(f14, f14, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(g(), measuredWidth, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float E22 = 1.0f - ChatActivityEnterView.E2(0.25f, 0.85f, min);
            float interpolation2 = lr.g.getInterpolation(min);
            if (E22 > 0.0f) {
                c10 = 0;
                paint.setColor(i0.a.f(min2, chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.ag), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Vf)));
                paint.setAlpha((int) (E22 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (org.telegram.messenger.g0.L(2.0f) * interpolation2) + measuredHeight, org.telegram.messenger.g0.T1(this.s, org.telegram.messenger.g0.L(1.5f), interpolation2), paint);
            } else {
                c10 = 0;
            }
            float E23 = ChatActivityEnterView.E2(0.05f, 0.6f, min) * fArr[c10];
            if (E23 > 0.0f && i10.u()) {
                float i11 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float T1 = org.telegram.messenger.g0.T1(0.45f, 1.0f, com.google.android.gms.internal.vision.e2.x(i11, 1.1f, i11, (2.1f * i11 * i11 * i11) + 1.0f));
                canvas.save();
                canvas.scale(T1, T1, measuredWidth, measuredHeight + org.telegram.messenger.g0.L(2.0f));
                i10.setAlpha((int) (E23 * 255.0f));
                i10.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            if (min < 1.0f || !i10.u()) {
                invalidate();
                return;
            }
            return;
        }
        if (this.G) {
            mh0 i12 = i();
            i12.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i12.setAlpha(org.telegram.messenger.ks.e4);
            i12.draw(canvas);
            return;
        }
        if (!this.f) {
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean z10 = this.e;
            if (z10 || this.H < 0) {
                this.H = uptimeMillis;
            }
            this.a = (z10 || this.c) ? 1.0f : b(uptimeMillis - this.H);
        }
        if (this.c) {
            f10 = 1.0f;
            f11 = Math.min(1.0f, (SystemClock.uptimeMillis() - this.J) / 160.0f);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        boolean z11 = this.c;
        mh0 mh0Var = this.d;
        if (z11) {
            mh0Var.setAlpha((int) (f11 * 255.0f));
            mh0Var.draw(canvas);
            if (f11 < f10) {
                invalidate();
            }
        }
        if (!this.c || f11 < f10 || !mh0Var.u()) {
            boolean z12 = this.c;
            float f15 = z12 ? 1.0f : this.a;
            float f16 = (z12 && mh0Var.u()) ? 1.0f - f11 : 1.0f;
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
                paint.setColor(i0.a.f(Math.min(1.0f, f11 * 2.5f), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.ag), chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Vf)));
            }
            int color = paint.getColor();
            Paint paint2 = this.I;
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
