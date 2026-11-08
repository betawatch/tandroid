package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class m3 extends View {
    public final ic A0;
    public final Rect B0;
    public final RectF C0;
    public float D;
    public final RectF D0;
    public float E;
    public final Path E0;
    public final Paint F;
    public float F0;
    public CharSequence G;
    public float G0;
    public final org.telegram.ui.Components.i6 H;
    public float H0;
    public boolean I;
    public float I0;
    public final TextPaint J;
    public boolean J0;
    public Layout.Alignment K;
    public boolean K0;
    public StaticLayout L;
    public boolean L0;
    public org.telegram.ui.Components.n5 M;
    public Path M0;
    public float N;
    public float N0;
    public float O;
    public Paint O0;
    public float P;
    public Paint P0;
    public final n2.n0 Q;
    public LinearGradient Q0;
    public float R;
    public Matrix R0;
    public float S;
    public LinearGradient S0;
    public boolean T;
    public long T0;
    public boolean U;
    public final RectF U0;
    public boolean V;
    public x70 V0;
    public final org.telegram.ui.Components.w5 W;
    public int a;
    public org.telegram.ui.Cells.y a0;
    public float b;
    public Paint b0;
    public float c;
    public Drawable c0;
    public long d;
    public float d0;
    public boolean e;
    public int e0;
    public final boolean f;
    public int f0;
    public int g0;
    public int h;
    public boolean h0;
    public float i0;
    public float j0;
    public int k0;
    public fh.g l0;
    public final float m0;
    public Drawable n;
    public final float n0;
    public final float o0;
    public final float p0;
    public Runnable q0;
    public boolean r;
    public View r0;
    public boolean s;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public float w;
    public final int[] w0;
    public final RectF x;
    public final oy x0;
    public float y;
    public ValueAnimator y0;
    public float z0;

    public m3(Context context, int i7) {
        super(context);
        this.b = 0.5f;
        this.c = 0.0f;
        this.d = 3500L;
        this.e = true;
        this.f = true;
        this.h = -1;
        this.s = true;
        this.w = org.telegram.messenger.g0.L(8.0f);
        this.x = new RectF(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f));
        this.y = org.telegram.messenger.g0.L(2.0f);
        this.D = org.telegram.messenger.g0.L(7.0f);
        this.E = org.telegram.messenger.g0.L(6.0f);
        Paint paint = new Paint(1);
        this.F = paint;
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        this.K = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new n2.n0();
        this.T = true;
        this.U = true;
        xq xqVar = xq.h;
        this.W = new org.telegram.ui.Components.w5(this, 350L, xqVar);
        this.e0 = org.telegram.messenger.g0.L(2.0f);
        this.m0 = org.telegram.messenger.g0.N(4.0f);
        this.n0 = org.telegram.messenger.g0.N(4.0f);
        this.o0 = org.telegram.messenger.g0.N(5.0f);
        this.p0 = org.telegram.messenger.g0.N(2.0f);
        this.s0 = Float.NaN;
        this.w0 = new int[2];
        this.x0 = new oy(this, 1);
        this.z0 = 1.0f;
        this.A0 = new ic(this, 2.0f, 5.0f);
        this.B0 = new Rect();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new Path();
        this.K0 = true;
        this.U0 = new RectF();
        this.a = i7;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.w));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, false);
        this.H = i6Var;
        i6Var.n(0.4f, 320L, xqVar);
        i6Var.setCallback(this);
        v(14.0f);
        i6Var.u(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int length = charSequence.length() / 2;
        float f10 = 0.0f;
        int i7 = 0;
        int i10 = -1;
        float f11 = 0.0f;
        float f12 = Float.MAX_VALUE;
        float f13 = 0.0f;
        while (i7 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i10;
            }
            f13 = h(charSequence.subSequence(0, length), textPaint);
            f11 = h(org.telegram.messenger.g0.n1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f13 != f10 || f11 != f12) {
                if (f13 < f11) {
                    length++;
                    i10 = 1;
                } else {
                    length--;
                    i10 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i7++;
                f10 = f13;
                f12 = f11;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f13, f11));
    }

    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i7;
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return charSequence;
        }
        int length = charSequence.length() / 2;
        float f10 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        float f11 = 0.0f;
        float f12 = Float.MAX_VALUE;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            float h = h(charSequence.subSequence(0, length), textPaint);
            float h7 = h(org.telegram.messenger.g0.n1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (length > 0 && length < charSequence.length() && Math.max(h, h7) < f10) {
                f10 = Math.max(h, h7);
                i12 = length;
            }
            if (h != f11 || h7 != f12) {
                if (h < h7) {
                    length++;
                    i7 = 1;
                } else {
                    length--;
                    i7 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i10++;
                f11 = h;
                i11 = i7;
                f12 = h7;
            } else {
                break;
            }
        }
        return i12 < 0 ? charSequence : TextUtils.concat(org.telegram.messenger.g0.n1(charSequence.subSequence(0, i12)), "\n", org.telegram.messenger.g0.n1(charSequence.subSequence(i12, charSequence.length())));
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.x;
        int i7 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i10 = this.h;
        if (i10 > 0) {
            i7 = Math.min(i10, i7);
        }
        return Math.max(0, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float h(CharSequence charSequence, TextPaint textPaint) {
        float f10 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        u31[] u31VarArr = (u31[]) spanned.getSpans(0, charSequence.length(), u31.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i7 = 0;
        int i10 = 0;
        while (i7 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i7];
            TextPaint textPaint2 = textPaint;
            i10 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, r10, r11, r12, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanned.getSpanStart(replacementSpan), spanned.getSpanEnd(replacementSpan))) + i10);
            i7++;
            textPaint = textPaint2;
            charSequence = charSequence;
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (u31VarArr == null || u31VarArr.length == 0) {
            return textPaint3.measureText(charSequence2.toString()) + i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < u31VarArr.length; i12++) {
            int spanStart = spanned.getSpanStart(u31VarArr[i12]);
            int spanEnd = spanned.getSpanEnd(u31VarArr[i12]);
            int max = Math.max(i11, spanStart);
            if (max - i11 > 0) {
                f10 += textPaint3.measureText(spanned, i11, max);
            }
            i11 = Math.max(max, spanEnd);
            if (i11 - max > 0) {
                Typeface typeface = textPaint3.getTypeface();
                textPaint3.setTypeface(u31VarArr[i12].a);
                float measureText = textPaint3.measureText(spanned, max, i11) + f10;
                textPaint3.setTypeface(typeface);
                f10 = measureText;
            }
        }
        int max2 = Math.max(i11, charSequence2.length());
        if (max2 - i11 > 0) {
            f10 += textPaint3.measureText(spanned, i11, max2);
        }
        return f10 + i10;
    }

    public void c(Canvas canvas, float f10) {
        fh.g gVar = this.l0;
        if (gVar != null) {
            gVar.setAlpha(Math.max(1, (int) (f10 * 255.0f)));
            this.l0.draw(canvas);
            d(canvas);
            return;
        }
        int i7 = this.k0;
        Paint paint = this.F;
        if (i7 != 0) {
            paint.setShadowLayer(this.i0, 0.0f, this.j0, org.telegram.ui.ActionBar.k6.r1(f10, i7));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        canvas.drawPath(this.E0, paint);
        paint.setAlpha(alpha);
        d(canvas);
    }

    public final void d(Canvas canvas) {
        if (this.L0) {
            int L = org.telegram.messenger.g0.L(64.0f);
            float b10 = org.telegram.messenger.camera.q.b(this.H0 * 4.0f, L * 2, ((System.currentTimeMillis() - this.T0) % 4000) / 4000.0f, -L);
            this.R0.reset();
            this.R0.postTranslate(this.C0.left + b10, 0.0f);
            this.Q0.setLocalMatrix(this.R0);
            this.S0.setLocalMatrix(this.R0);
            canvas.drawPath(this.E0, this.O0);
            canvas.drawPath(this.M0, this.P0);
            invalidate();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        float f10;
        float f11;
        float f12;
        m3 m3Var;
        RectF rectF3;
        float f13;
        float f14;
        float f15;
        Canvas canvas2;
        float f16;
        if (this.I && this.L == null) {
            return;
        }
        float d = this.W.d(this.V && !this.K0);
        if (this.K0) {
            this.K0 = false;
            invalidate();
        }
        if (d <= 0.0f) {
            fh.g gVar = this.l0;
            if (gVar != null) {
                gVar.setAlpha(0);
                return;
            }
            return;
        }
        boolean z9 = this.I;
        org.telegram.ui.Components.i6 i6Var = this.H;
        float c10 = z9 ? this.O : i6Var.c();
        float f17 = this.I ? this.P : i6Var.e;
        if (this.r) {
            if (this.n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                this.n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            c10 += this.y + this.n.getIntrinsicWidth();
            f17 = Math.max(this.n.getIntrinsicHeight(), f17);
        }
        if (this.c0 != null) {
            c10 += this.f0 + this.e0;
            f17 = Math.max(this.g0, f17);
        }
        float f18 = c10;
        RectF rectF4 = this.x;
        float f19 = rectF4.left + f18 + rectF4.right;
        float f20 = rectF4.top + f17 + rectF4.bottom;
        boolean z10 = this.J0;
        RectF rectF5 = this.C0;
        if (!z10 || Math.abs(f19 - this.H0) > 0.1f || Math.abs(f20 - this.I0) > 0.1f) {
            this.H0 = f19;
            this.I0 = f20;
            rectF = rectF4;
            e(this.E0, f19, f20, 0.0f, rectF5, this.B0);
            if (this.l0 == null) {
                rectF2 = rectF5;
                f10 = f19;
                f11 = f20;
                f12 = f18;
            } else {
                int round = Math.round(this.E);
                int round2 = Math.round(rectF5.left);
                int round3 = Math.round(rectF5.top);
                int round4 = Math.round(rectF5.right);
                int round5 = Math.round(rectF5.bottom);
                int i7 = this.a;
                rectF2 = rectF5;
                if (i7 == 0) {
                    round2 -= round;
                } else if (i7 == 1) {
                    round3 -= round;
                } else if (i7 != 2) {
                    round5 += round;
                } else {
                    round4 += round;
                }
                boolean z11 = i7 == 0 || i7 == 2;
                fh.g gVar2 = this.l0;
                float f21 = z11 ? this.G0 : this.F0;
                float f22 = round;
                f10 = f19;
                fh.f fVar = gVar2.Q;
                int i10 = fVar.n;
                f11 = f20;
                float f23 = this.m0;
                f12 = f18;
                float f24 = this.n0;
                if (i10 != i7 || fVar.o != f21 || fVar.p != f22 || fVar.q != f23 || fVar.r != f24) {
                    fVar.n = i7;
                    fVar.o = f21;
                    fVar.p = f22;
                    fVar.q = f23;
                    fVar.r = f24;
                    fVar.a();
                    gVar2.n();
                    gVar2.invalidateSelf();
                }
                this.l0.setBounds(round2, round3, round4, round5);
            }
            if (this.L0) {
                rectF3 = rectF2;
                f13 = f11;
                e(this.M0, f10, f13, this.N0, this.D0, null);
                m3Var = this;
            } else {
                m3Var = this;
                rectF3 = rectF2;
                f13 = f11;
            }
        } else {
            m3Var = this;
            rectF = rectF4;
            f13 = f20;
            rectF3 = rectF5;
            f12 = f18;
        }
        float f25 = m3Var.f ? d : 1.0f;
        canvas.save();
        if (d < 1.0f && m3Var.e) {
            float T1 = org.telegram.messenger.g0.T1(0.75f, 1.0f, d);
            canvas.scale(T1, T1, m3Var.F0, m3Var.G0);
        }
        float a10 = m3Var.A0.a(0.025f);
        if (a10 != 1.0f) {
            canvas.scale(a10, a10, m3Var.F0, m3Var.G0);
        }
        if (m3Var.z0 != 1.0f) {
            int i11 = m3Var.a;
            if (i11 == 3 || i11 == 1) {
                canvas.translate(0.0f, (m3Var.z0 - 1.0f) * Math.max(i11 == 3 ? m3Var.getPaddingBottom() : m3Var.getPaddingTop(), org.telegram.messenger.g0.L(24.0f)) * (m3Var.a != 1 ? 1 : -1));
            } else {
                canvas.translate((m3Var.z0 - 1.0f) * Math.max(i11 == 0 ? m3Var.getPaddingLeft() : m3Var.getPaddingRight(), org.telegram.messenger.g0.L(24.0f)) * (m3Var.a != 0 ? 1 : -1), 0.0f);
            }
        }
        RectF rectF6 = org.telegram.messenger.g0.P;
        rectF6.set(rectF3);
        float f26 = -m3Var.E;
        rectF6.inset(f26, f26);
        m3Var.c(canvas, f25);
        org.telegram.ui.Cells.y yVar = m3Var.a0;
        if (yVar != null) {
            yVar.setAlpha((int) (f25 * 255.0f));
            m3Var.a0.setBounds(m3Var.B0);
            m3Var.a0.draw(canvas);
        }
        float f27 = ((rectF3.top + rectF.top) + (rectF3.bottom - rectF.bottom)) / 2.0f;
        Drawable drawable = m3Var.c0;
        if (drawable != null) {
            if (m3Var.h0) {
                float f28 = (rectF.left / 2.0f) + 0.0f + rectF3.left;
                float f29 = m3Var.d0 + f27;
                float f30 = m3Var.g0 / 2.0f;
                f14 = 255.0f;
                drawable.setBounds((int) f28, (int) (f29 - f30), (int) (f28 + m3Var.f0), (int) (f30 + f29));
                f16 = m3Var.f0 + m3Var.e0 + 0.0f;
            } else {
                f14 = 255.0f;
                float f31 = (0.0f + rectF3.right) - (rectF.right / 2.0f);
                float f32 = m3Var.d0 + f27;
                float f33 = m3Var.g0 / 2.0f;
                drawable.setBounds((int) (f31 - m3Var.f0), (int) (f32 - f33), (int) f31, (int) (f33 + f32));
                f16 = 0.0f;
            }
            m3Var.c0.setAlpha((int) (f25 * f14));
            m3Var.c0.draw(canvas);
            f15 = f16;
        } else {
            f14 = 255.0f;
            f15 = 0.0f;
        }
        if (m3Var.I) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, m3Var.getWidth(), Math.max(m3Var.getHeight(), f13), (int) (f25 * f14), 31);
            float f34 = ((f15 + rectF3.left) + rectF.left) - m3Var.N;
            m3Var.R = f34;
            float f35 = f27 - (m3Var.P / 2.0f);
            m3Var.S = f35;
            canvas2.translate(f34, f35);
            if (m3Var.Q.h(canvas2)) {
                m3Var.invalidate();
            }
            m3Var.L.draw(canvas2);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas2, m3Var.L, m3Var.M, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2.restore();
        } else {
            canvas2 = canvas;
            CharSequence charSequence = m3Var.G;
            if (charSequence != null) {
                i6Var.t(charSequence, m3Var.V, true);
                m3Var.G = null;
            }
            float f36 = rectF3.left;
            float f37 = rectF.left;
            float f38 = m3Var.P / 2.0f;
            i6Var.setBounds((int) (f15 + f36 + f37), (int) (f27 - f38), (int) (f36 + f37 + f12), (int) (f38 + f27));
            i6Var.B = (int) (f25 * f14);
            i6Var.draw(canvas2);
        }
        if (m3Var.r) {
            if (m3Var.n == null) {
                Drawable mutate2 = m3Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                m3Var.n = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            m3Var.n.setAlpha((int) (f25 * f14));
            m3Var.n.setBounds((int) ((rectF3.right - (rectF.right * 0.66f)) - r1.getIntrinsicWidth()), (int) (rectF3.centerY() - (m3Var.n.getIntrinsicHeight() / 2.0f)), (int) (rectF3.right - (rectF.right * 0.66f)), (int) ((m3Var.n.getIntrinsicHeight() / 2.0f) + rectF3.centerY()));
            m3Var.n.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void e(Path path, float f10, float f11, float f12, RectF rectF, Rect rect) {
        float f13;
        float f14 = f10 / 2.0f;
        float f15 = f11 / 2.0f;
        float min = Math.min(this.w, Math.min(f14, f15));
        int i7 = this.a;
        if (i7 == 1 || i7 == 3) {
            float i10 = Utilities.i(org.telegram.messenger.g0.W1(this.b, getPaddingLeft(), getMeasuredWidth() - getPaddingRight()) + this.c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min2 = Math.min(Math.max(getPaddingLeft(), i10 - f14) + f10, getMeasuredWidth() - getPaddingRight());
            float f16 = min2 - f10;
            float f17 = this.D;
            float i11 = Utilities.i(i10, (min2 - min) - f17, f16 + min + f17);
            if (this.a == 1) {
                rectF.set(f16, getPaddingTop() + this.E, min2, getPaddingTop() + this.E + f11);
            } else {
                rectF.set(f16, ((getMeasuredHeight() - this.E) - getPaddingBottom()) - f11, min2, (getMeasuredHeight() - this.E) - getPaddingBottom());
            }
            f13 = i11;
        } else {
            float i12 = Utilities.i(org.telegram.messenger.g0.W1(this.b, getPaddingTop(), getMeasuredHeight() - getPaddingBottom()) + this.c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min3 = Math.min(Math.max(getPaddingTop(), i12 - f15) + f11, getMeasuredHeight() - getPaddingBottom());
            float f18 = min3 - f11;
            float f19 = this.D;
            f13 = Utilities.i(i12, (min3 - min) - f19, f18 + min + f19);
            if (this.a == 0) {
                rectF.set(getPaddingLeft() + this.E, f18, getPaddingLeft() + this.E + f10, min3);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.E) - f10, f18, (getMeasuredWidth() - getPaddingRight()) - this.E, min3);
            }
        }
        float f20 = -f12;
        rectF.inset(f20, f20);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z9 = this.s;
        RectF rectF2 = this.U0;
        if (z9) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f21 = rectF.left;
            float f22 = rectF.bottom;
            float f23 = min * 2.0f;
            rectF2.set(f21, f22 - f23, f23 + f21, f22);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.a == 0) {
            path.lineTo(rectF.left, this.D + f13 + org.telegram.messenger.g0.L(2.0f));
            path.lineTo(rectF.left, this.D + f13);
            path.lineTo(rectF.left - this.E, org.telegram.messenger.g0.L(1.0f) + f13);
            float f24 = rectF.left - this.E;
            this.F0 = f24;
            this.G0 = f13;
            path.lineTo(f24, f13 - org.telegram.messenger.g0.L(1.0f));
            path.lineTo(rectF.left, f13 - this.D);
            path.lineTo(rectF.left, (f13 - this.D) - org.telegram.messenger.g0.L(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.E);
            }
        }
        if (this.s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f25 = rectF.left;
            float f26 = rectF.top;
            float f27 = min * 2.0f;
            rectF2.set(f25, f26, f25 + f27, f27 + f26);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.a == 1) {
            path.lineTo((f13 - this.D) - org.telegram.messenger.g0.L(2.0f), rectF.top);
            path.lineTo(f13 - this.D, rectF.top);
            path.lineTo(f13 - org.telegram.messenger.g0.L(1.0f), rectF.top - this.E);
            this.F0 = f13;
            this.G0 = rectF.top - this.E;
            path.lineTo(org.telegram.messenger.g0.L(1.0f) + f13, rectF.top - this.E);
            path.lineTo(this.D + f13, rectF.top);
            path.lineTo(this.D + f13 + org.telegram.messenger.g0.L(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.E);
            }
        }
        if (this.s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f28 = rectF.right;
            float f29 = min * 2.0f;
            float f30 = rectF.top;
            rectF2.set(f28 - f29, f30, f28, f29 + f30);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.a == 2) {
            path.lineTo(rectF.right, (f13 - this.D) - org.telegram.messenger.g0.L(2.0f));
            path.lineTo(rectF.right, f13 - this.D);
            path.lineTo(rectF.right + this.E, f13 - org.telegram.messenger.g0.L(1.0f));
            float f31 = rectF.right + this.E;
            this.F0 = f31;
            this.G0 = f13;
            path.lineTo(f31, org.telegram.messenger.g0.L(1.0f) + f13);
            path.lineTo(rectF.right, this.D + f13);
            path.lineTo(rectF.right, this.D + f13 + org.telegram.messenger.g0.L(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.E);
            }
        }
        if (this.s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f32 = rectF.right;
            float f33 = min * 2.0f;
            float f34 = rectF.bottom;
            rectF2.set(f32 - f33, f34 - f33, f32, f34);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.a == 3) {
            path.lineTo(this.D + f13 + org.telegram.messenger.g0.L(2.0f), rectF.bottom);
            path.lineTo(this.D + f13, rectF.bottom);
            path.lineTo(org.telegram.messenger.g0.L(1.0f) + f13, rectF.bottom + this.E);
            this.F0 = f13;
            this.G0 = rectF.bottom + this.E;
            path.lineTo(f13 - org.telegram.messenger.g0.L(1.0f), rectF.bottom + this.E);
            path.lineTo(f13 - this.D, rectF.bottom);
            path.lineTo((f13 - this.D) - org.telegram.messenger.g0.L(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.E);
            }
        }
        path.close();
        this.J0 = true;
    }

    public final void f(boolean z9) {
        org.telegram.messenger.g0.r(this.x0);
        Runnable runnable = this.q0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        this.V = false;
        org.telegram.ui.Components.w5 w5Var = this.W;
        if (!z9) {
            w5Var.getClass();
            w5Var.e(false, 0.0f);
        }
        invalidate();
        Runnable runnable2 = this.q0;
        if (runnable2 != null) {
            org.telegram.messenger.g0.i3(runnable2, (long) (w5Var.c * w5Var.g));
        }
        this.Q.f(true);
    }

    public final void g(int i7, CharSequence charSequence) {
        this.L = new StaticLayout(charSequence, this.J, i7, this.K, 1.0f, 0.0f, false);
        float f10 = i7;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < this.L.getLineCount(); i10++) {
            f10 = Math.min(f10, this.L.getLineLeft(i10));
            f11 = Math.max(f11, this.L.getLineRight(i10));
        }
        this.O = Math.max(0.0f, f11 - f10);
        this.P = this.L.getHeight();
        this.N = f10;
        this.M = org.telegram.ui.Components.r5.update(0, this, this.M, this.L);
    }

    public View getAnchorView() {
        return this.r0;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.G;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.I) {
            return this.H.i;
        }
        StaticLayout staticLayout = this.L;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        return this.I ? this.J : this.H.a;
    }

    public final void i(float f10) {
        this.u0 = f10;
    }

    public final void j(int i7) {
        Paint paint = this.F;
        if (paint.getColor() != i7) {
            paint.setColor(i7);
            invalidate();
        }
    }

    public final void k(boolean z9) {
        this.r = z9;
        if (this.I) {
            return;
        }
        this.x.set(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.r ? 15.0f : 11.0f), org.telegram.messenger.g0.L(7.0f));
    }

    public final void l(dh.c cVar) {
        gh.e eVar = new gh.e(null);
        eVar.e = new g2.c(6);
        eVar.f(872415231, 872415231);
        eVar.e(452984831, 452984831);
        eVar.d(808661811, 805306368);
        eVar.n = org.telegram.messenger.g0.N(6.0f);
        eVar.r = 0.0f;
        eVar.f = 1.0f;
        eVar.h = 1.0f;
        fh.g c10 = cVar.c(this, eVar, false);
        this.l0 = c10;
        c10.setCallback(this);
        this.l0.r(this.w + this.p0);
        this.l0.u((int) this.o0);
        fh.g gVar = this.l0;
        gVar.Q.g = 1.0f;
        gVar.n();
        fh.g gVar2 = this.l0;
        if (!gVar2.P) {
            gVar2.P = true;
            gVar2.O = null;
            gVar2.invalidateSelf();
        }
        this.l0.setAlpha(0);
        this.J0 = false;
        invalidate();
    }

    public final void m(Drawable drawable) {
        Drawable drawable2 = this.c0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.c0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            Drawable drawable3 = this.c0;
            if (drawable3 instanceof zg0) {
                this.d = Math.max(this.d, ((zg0) drawable3).r());
            }
            this.f0 = this.c0.getIntrinsicWidth();
            this.g0 = this.c0.getIntrinsicHeight();
            this.h0 = true;
        }
    }

    public final void n(float f10, float f11, float f12, float f13) {
        this.x.set(org.telegram.messenger.g0.N(f10), org.telegram.messenger.g0.N(f11), org.telegram.messenger.g0.N(f12), org.telegram.messenger.g0.N(f13));
    }

    public final void o(float f10, float f11) {
        if (Math.abs(this.b - f10) >= 1.0f || Math.abs(this.c - org.telegram.messenger.g0.L(f11)) >= 1.0f) {
            this.J0 = false;
            invalidate();
        }
        this.b = f10;
        this.c = org.telegram.messenger.g0.L(f11);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r5.release(this, this.M);
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9 && this.V) {
            z();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        this.J0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.i6 i6Var = this.H;
        i6Var.M = textMaxWidth;
        if (this.I) {
            CharSequence charSequence = this.G;
            if (charSequence == null) {
                StaticLayout staticLayout = this.L;
                if (staticLayout == null) {
                    return;
                } else {
                    charSequence = staticLayout.getText();
                }
            }
            StaticLayout staticLayout2 = this.L;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                g(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.G;
            if (charSequence2 != null) {
                i6Var.t(charSequence2, false, true);
            }
        }
        this.G = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        CharacterStyle characterStyle;
        if ((this.T || hasOnClickListeners()) && this.V) {
            if (this.L != null) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                StaticLayout staticLayout = this.L;
                if (staticLayout != null) {
                    int i7 = (int) (x10 - this.R);
                    int i10 = (int) (y10 - this.S);
                    int lineForVertical = staticLayout.getLineForVertical(i10);
                    float f10 = i7;
                    int offsetForHorizontal = this.L.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = this.L.getLineLeft(lineForVertical);
                    if (lineLeft <= f10 && this.L.getLineWidth(lineForVertical) + lineLeft >= f10 && i10 >= 0 && i10 <= this.L.getHeight()) {
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(this.L.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0 && !org.telegram.messenger.g0.C1()) {
                            clickableSpan = clickableSpanArr[0];
                            oy oyVar = this.x0;
                            n2.n0 n0Var = this.Q;
                            if (clickableSpan == null && motionEvent.getAction() == 0) {
                                x70 x70Var = new x70(clickableSpan, null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.V0 = x70Var;
                                n0Var.b(x70Var, null);
                                SpannableString spannableString = new SpannableString(this.L.getText());
                                int spanStart = spannableString.getSpanStart(this.V0.i);
                                int spanEnd = spannableString.getSpanEnd(this.V0.i);
                                r70 b10 = this.V0.b();
                                b10.d(this.L, spanStart, 0.0f);
                                this.L.getSelectionPath(spanStart, spanEnd, b10);
                                invalidate();
                                org.telegram.messenger.g0.i3(new bi.s2(this, x70Var, clickableSpan), ViewConfiguration.getLongPressTimeout());
                                org.telegram.messenger.g0.r(oyVar);
                                return true;
                            }
                            if (motionEvent.getAction() == 1) {
                                n0Var.f(true);
                                invalidate();
                                org.telegram.messenger.g0.r(oyVar);
                                long j3 = this.d;
                                if (j3 > 0) {
                                    org.telegram.messenger.g0.i3(oyVar, j3);
                                }
                                x70 x70Var2 = this.V0;
                                if (x70Var2 != null && (characterStyle = x70Var2.i) == clickableSpan) {
                                    if (characterStyle != null) {
                                        ((ClickableSpan) characterStyle).onClick(this);
                                    }
                                    this.V0 = null;
                                    return true;
                                }
                                this.V0 = null;
                            }
                            if (motionEvent.getAction() == 3) {
                                n0Var.f(true);
                                invalidate();
                                org.telegram.messenger.g0.r(oyVar);
                                long j10 = this.d;
                                if (j10 > 0) {
                                    org.telegram.messenger.g0.i3(oyVar, j10);
                                }
                                this.V0 = null;
                            }
                        }
                    }
                }
                clickableSpan = null;
                oy oyVar2 = this.x0;
                n2.n0 n0Var2 = this.Q;
                if (clickableSpan == null) {
                }
                if (motionEvent.getAction() == 1) {
                }
                if (motionEvent.getAction() == 3) {
                }
            }
            if (this.V0 == null) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                int action = motionEvent.getAction();
                ic icVar = this.A0;
                if (action == 0) {
                    if (this.C0.contains(motionEvent.getX() - 0.0f, motionEvent.getY() - 0.0f)) {
                        icVar.c(true);
                        org.telegram.ui.Cells.y yVar = this.a0;
                        if (yVar != null) {
                            yVar.setHotspot(x11, y11);
                            this.a0.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                            return true;
                        }
                    }
                }
                if (motionEvent.getAction() == 1) {
                    if (hasOnClickListeners()) {
                        performClick();
                    } else if (this.T) {
                        f(true);
                    }
                    icVar.c(false);
                    org.telegram.ui.Cells.y yVar2 = this.a0;
                    if (yVar2 != null) {
                        yVar2.setState(new int[0]);
                        return true;
                    }
                } else if (motionEvent.getAction() == 3) {
                    icVar.c(false);
                    org.telegram.ui.Cells.y yVar3 = this.a0;
                    if (yVar3 != null) {
                        yVar3.setState(new int[0]);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void p(float f10, float f11) {
        if (Math.abs(this.b - f10) >= 1.0f || Math.abs(this.c - f11) >= 1.0f) {
            this.J0 = false;
            invalidate();
        }
        this.b = f10;
        this.c = f11;
    }

    public final void q(int i7) {
        this.h = i7;
    }

    public final void r(boolean z9) {
        this.I = z9;
        RectF rectF = this.x;
        if (z9) {
            rectF.set(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(8.0f));
            this.y = org.telegram.messenger.g0.L(6.0f);
        } else {
            rectF.set(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.r ? 15.0f : 11.0f), org.telegram.messenger.g0.L(7.0f));
            this.y = org.telegram.messenger.g0.L(2.0f);
        }
    }

    public final void s(float f10) {
        float L = org.telegram.messenger.g0.L(f10);
        this.w = L;
        fh.g gVar = this.l0;
        if (gVar != null) {
            gVar.r(L + this.p0);
        }
        this.F.setPathEffect(this.s ? new CornerPathEffect(this.w) : null);
        Paint paint = this.b0;
        if (paint != null) {
            paint.setPathEffect(this.s ? new CornerPathEffect(this.w) : null);
        }
    }

    public final void t() {
        this.s = false;
        this.F.setPathEffect(null);
    }

    public final void u(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.G = charSequence;
        } else if (this.I) {
            g(getTextMaxWidth(), charSequence);
        } else {
            this.H.t(charSequence, false, true);
        }
    }

    public final void v(float f10) {
        this.H.w(org.telegram.messenger.g0.N(f10));
        this.J.setTextSize(org.telegram.messenger.g0.N(f10));
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.H || drawable == this.a0 || drawable == this.c0 || drawable == this.l0 || super.verifyDrawable(drawable);
    }

    public final void w() {
        if (this.V && this.U) {
            ValueAnimator valueAnimator = this.y0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.y0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.y0 = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 29));
            this.y0.addListener(new bi.t5(this, 19));
            this.y0.setInterpolator(xq.k);
            this.y0.setDuration(300L);
            this.y0.start();
        }
        org.telegram.messenger.g0.i2(getText());
        this.V = true;
        invalidate();
        oy oyVar = this.x0;
        org.telegram.messenger.g0.r(oyVar);
        long j3 = this.d;
        if (j3 > 0) {
            org.telegram.messenger.g0.i3(oyVar, j3);
        }
        Runnable runnable = this.q0;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
    }

    public final void x(float f10, float f11, boolean z9) {
        this.r0 = null;
        this.s0 = f10;
        this.t0 = f11;
        z();
        if (this.V) {
            return;
        }
        w();
        if (z9) {
            return;
        }
        this.W.a(true);
    }

    public final void y(View view, boolean z9) {
        boolean z10 = this.V && this.r0 == view;
        this.r0 = view;
        this.s0 = Float.NaN;
        z();
        if (z10) {
            return;
        }
        w();
        if (z9) {
            return;
        }
        this.W.a(true);
    }

    public final void z() {
        float f10;
        float f11;
        if (getParent() instanceof View) {
            if (this.r0 == null && Float.isNaN(this.s0)) {
                return;
            }
            if (!isLaidOut()) {
                post(new bi.s2(this, 2));
                return;
            }
            View view = this.r0;
            if (view != null) {
                int[] iArr = this.w0;
                view.getLocationInWindow(iArr);
                float f12 = iArr[0];
                float f13 = iArr[1];
                ((View) getParent()).getLocationInWindow(iArr);
                float f14 = f12 - iArr[0];
                float f15 = f13 - iArr[1];
                int width = this.r0.getWidth();
                int height = this.r0.getHeight();
                float f16 = f14 + this.v0;
                int i7 = this.a;
                if (i7 == 0) {
                    f10 = this.u0 + f16 + width;
                } else if (i7 == 1) {
                    f10 = (width / 2.0f) + f16;
                    f11 = f15 + height + this.u0;
                } else if (i7 != 2) {
                    f10 = (width / 2.0f) + f16;
                    f11 = f15 - this.u0;
                } else {
                    f10 = f16 - this.u0;
                }
                f11 = f15 + (height / 2.0f);
            } else {
                f10 = this.s0;
                f11 = this.t0;
            }
            int i10 = this.a;
            if (i10 == 0) {
                setTranslationX(f10 - (getPaddingLeft() + getLeft()));
                p(0.0f, (f11 - getTop()) - getPaddingTop());
            } else if (i10 == 1) {
                setTranslationY(f11 - (getPaddingTop() + getTop()));
                p(0.0f, (f10 - getLeft()) - getPaddingLeft());
            } else if (i10 != 2) {
                setTranslationY(f11 - ((getHeight() + getTop()) - getPaddingBottom()));
                p(0.0f, (f10 - getLeft()) - getPaddingLeft());
            } else {
                setTranslationX(f10 - ((getWidth() + getLeft()) - getPaddingRight()));
                p(0.0f, (f11 - getTop()) - getPaddingTop());
            }
        }
    }
}
