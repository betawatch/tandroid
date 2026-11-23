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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class tg extends View {
    public oh0 E;
    public final float[] F;
    public boolean G;
    public long H;
    public final Paint I;
    public long J;
    public final /* synthetic */ ChatActivityEnterView K;
    public float a;
    public boolean b;
    public boolean c;
    public final oh0 d;
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
    public tg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.K = chatActivityEnterView;
        this.h = -1L;
        this.F = new float[3];
        this.H = -1L;
        this.I = new Paint(1);
        oh0 oh0Var = new oh0(R.raw.chat_audio_record_delete_2, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
        this.d = oh0Var;
        oh0Var.p0 = true;
        h();
    }

    public static float b(long j3) {
        return (((float) Math.cos(((j3 % 1300) / 1300.0f) * 3.141592653589793d * 2.0d)) * 0.5f) + 0.5f;
    }

    public final void c() {
        this.c = true;
        this.J = SystemClock.uptimeMillis();
        oh0 oh0Var = this.d;
        oh0Var.T(true, 0.0f);
        if (this.b) {
            oh0Var.start();
        }
    }

    public final void d() {
        i();
    }

    public final void e() {
        ChatActivityEnterView chatActivityEnterView = this.K;
        chatActivityEnterView.m4.setColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.ag));
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
        int i7 = org.telegram.ui.ActionBar.m6.ag;
        int i10 = ChatActivityEnterView.s7;
        ChatActivityEnterView chatActivityEnterView = this.K;
        int G0 = chatActivityEnterView.G0(i7);
        int G02 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Je);
        int G03 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Vf);
        chatActivityEnterView.m4.setColor(G0);
        oh0 oh0Var = this.d;
        oh0Var.a0 = true;
        oh0Var.Q(G03, "Cup Red");
        oh0Var.Q(G03, "Box Red");
        oh0Var.Q(G03, "Cup Grey");
        oh0Var.Q(G03, "Box Grey");
        oh0Var.Q(G03, "Box_Grey 2");
        oh0Var.Q(G03, "Line 1");
        oh0Var.Q(G03, "Line 2");
        oh0Var.Q(G03, "Line 3");
        oh0Var.Q(G02, "Line 1 Dup");
        oh0Var.Q(G02, "Line 2 Dup");
        oh0Var.Q(G02, "Line 3 Dup");
        oh0Var.o();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        oh0Var.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    public final oh0 i() {
        if (this.E == null) {
            oh0 oh0Var = new oh0(R.raw.chat_audio_record_delete_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            this.E = oh0Var;
            oh0Var.J(true);
            this.E.p0 = false;
            int i7 = org.telegram.ui.ActionBar.m6.Vf;
            int i10 = ChatActivityEnterView.s7;
            int G0 = this.K.G0(i7);
            oh0 oh0Var2 = this.E;
            oh0Var2.a0 = true;
            oh0Var2.Q(G0, "Cup Grey");
            this.E.Q(G0, "Box_Grey 2");
            this.E.Q(G0, "Box Grey");
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
        oh0 oh0Var = this.d;
        if (z10) {
            oh0Var.start();
        }
        oh0Var.R(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b = false;
        oh0 oh0Var = this.d;
        oh0Var.stop();
        oh0Var.R(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        char c10;
        ChatActivityEnterView chatActivityEnterView = this.K;
        Paint paint = chatActivityEnterView.m4;
        if (this.n) {
            float min = Math.min(1.0f, (SystemClock.uptimeMillis() - this.r) / 240.0f);
            float f12 = this.y;
            int i7 = ChatActivityEnterView.s7;
            float interpolation = nr.i.getInterpolation(Utilities.i(f12 / 0.6f, 1.0f, 0.0f));
            float H2 = 1.0f - ChatActivityEnterView.H2(0.05f, 0.55f, f12);
            float[] fArr = this.F;
            fArr[0] = H2;
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.55f, interpolation);
            fArr[2] = interpolation * 20.0f;
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            oh0 i10 = i();
            float f13 = this.x;
            i10.T(true, (f13 > 0.0f ? (Math.min(1.0f, f13) * 14.0f) + 30.0f : this.w * 8.0f) / 52.0f);
            i10.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.save();
            float f14 = fArr[1];
            canvas.scale(f14, f14, measuredWidth, measuredHeight);
            canvas.rotate(fArr[2], measuredWidth, measuredHeight);
            canvas.rotate(g(), measuredWidth, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
            float min2 = Math.min(1.0f, 1.8f * min);
            float H22 = 1.0f - ChatActivityEnterView.H2(0.25f, 0.85f, min);
            float interpolation2 = nr.g.getInterpolation(min);
            if (H22 > 0.0f) {
                c10 = 0;
                paint.setColor(i0.a.f(min2, chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.ag), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Vf)));
                paint.setAlpha((int) (H22 * 255.0f * fArr[0]));
                canvas.drawCircle(measuredWidth, (org.telegram.messenger.g0.L(2.0f) * interpolation2) + measuredHeight, org.telegram.messenger.g0.T1(this.s, org.telegram.messenger.g0.L(1.5f), interpolation2), paint);
            } else {
                c10 = 0;
            }
            float H23 = ChatActivityEnterView.H2(0.05f, 0.6f, min) * fArr[c10];
            if (H23 > 0.0f && i10.u()) {
                float i11 = Utilities.i(min, 1.0f, 0.0f) - 1.0f;
                float T1 = org.telegram.messenger.g0.T1(0.45f, 1.0f, com.google.android.gms.internal.vision.e2.x(i11, 1.1f, i11, (2.1f * i11 * i11 * i11) + 1.0f));
                canvas.save();
                canvas.scale(T1, T1, measuredWidth, measuredHeight + org.telegram.messenger.g0.L(2.0f));
                i10.setAlpha((int) (H23 * 255.0f));
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
            oh0 i12 = i();
            i12.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            i12.setAlpha(org.telegram.messenger.ls.e4);
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
        oh0 oh0Var = this.d;
        if (z11) {
            oh0Var.setAlpha((int) (f11 * 255.0f));
            oh0Var.draw(canvas);
            if (f11 < f10) {
                invalidate();
            }
        }
        if (!this.c || f11 < f10 || !oh0Var.u()) {
            boolean z12 = this.c;
            float f15 = z12 ? 1.0f : this.a;
            float f16 = (z12 && oh0Var.u()) ? 1.0f - f11 : 1.0f;
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
                paint.setColor(i0.a.f(Math.min(1.0f, f11 * 2.5f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.ag), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Vf)));
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
