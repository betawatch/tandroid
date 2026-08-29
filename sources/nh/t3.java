package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class t3 extends View {
    public float A;
    public Paint A0;
    public final Paint B;
    public LinearGradient B0;
    public CharSequence C;
    public Matrix C0;
    public final org.telegram.ui.Components.n6 D;
    public LinearGradient D0;
    public boolean E;
    public long E0;
    public final TextPaint F;
    public final RectF F0;
    public Layout.Alignment G;
    public z80 G0;
    public StaticLayout H;
    public org.telegram.ui.Components.u5 I;
    public float J;
    public float K;
    public float L;
    public final v80 M;
    public float N;
    public float O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final org.telegram.ui.Components.d6 S;
    public org.telegram.ui.Cells.z T;
    public Paint U;
    public xi0 V;
    public float W;
    public int a;
    public int a0;
    public float b;
    public int b0;
    public float c;
    public int c0;
    public long d;
    public boolean d0;
    public boolean e;
    public float e0;
    public final boolean f;
    public float f0;
    public int g0;
    public int h;
    public Runnable h0;
    public final vk0 i0;
    public ValueAnimator j0;
    public float k0;
    public final uc l0;
    public final Rect m0;
    public Drawable n;
    public final RectF n0;
    public final RectF o0;
    public final Path p0;
    public float q0;
    public boolean r;
    public float r0;
    public boolean s;
    public float s0;
    public float t0;
    public boolean u0;
    public float v;
    public boolean v0;
    public final RectF w;
    public boolean w0;
    public float x;
    public Path x0;
    public float y;
    public float y0;
    public Paint z0;

    public t3(Context context, int i10) {
        super(context);
        this.b = 0.5f;
        this.c = 0.0f;
        this.d = 3500L;
        this.e = true;
        this.f = true;
        this.h = -1;
        this.s = true;
        this.v = AndroidUtilities.dp(8.0f);
        this.w = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.x = AndroidUtilities.dp(2.0f);
        this.y = AndroidUtilities.dp(7.0f);
        this.A = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.B = paint;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.G = Layout.Alignment.ALIGN_NORMAL;
        this.M = new v80();
        this.P = true;
        this.Q = true;
        jr jrVar = jr.h;
        this.S = new org.telegram.ui.Components.d6(this, 350L, jrVar);
        this.a0 = AndroidUtilities.dp(2.0f);
        this.i0 = new vk0(this, 27);
        this.k0 = 1.0f;
        this.l0 = new uc(this, 2.0f, 5.0f);
        this.m0 = new Rect();
        this.n0 = new RectF();
        this.o0 = new RectF();
        this.p0 = new Path();
        this.v0 = true;
        this.F0 = new RectF();
        this.a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.v));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, false, false);
        this.D = n6Var;
        n6Var.k(0.4f, 320L, jrVar);
        n6Var.setCallback(this);
        u(14.0f);
        n6Var.r(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int length = charSequence.length() / 2;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = -1;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            f10 = g(charSequence.subSequence(0, length), textPaint);
            f11 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f10 != f9 || f11 != f12) {
                if (f10 < f11) {
                    length++;
                    i11 = 1;
                } else {
                    length--;
                    i11 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i10++;
                f9 = f10;
                f12 = f11;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f10, f11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i10;
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return charSequence;
        }
        int length = charSequence.length() / 2;
        int i11 = length;
        float f9 = 0.0f;
        float f10 = Float.MAX_VALUE;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int i14 = 1;
            if (i12 >= 10) {
                break;
            }
            length = i11;
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i13;
            }
            float g10 = g(charSequence.subSequence(0, length), textPaint);
            float g11 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (g10 == f9 && g11 == f10) {
                break;
            }
            if (g10 < g11) {
                i10 = length + 1;
            } else {
                i10 = length - 1;
                i14 = -1;
            }
            if (i10 <= 0 || i10 >= charSequence.length()) {
                break;
            }
            i12++;
            int i15 = i10;
            f9 = g10;
            i11 = i15;
            f10 = g11;
            i13 = i14;
        }
        return TextUtils.concat(AndroidUtilities.getTrimmedString(charSequence.subSequence(0, length)), "\n", AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float g(CharSequence charSequence, TextPaint textPaint) {
        float f9 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        t41[] t41VarArr = (t41[]) spanned.getSpans(0, charSequence.length(), t41.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i10 = 0;
        int i11 = 0;
        while (i10 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i10];
            TextPaint textPaint2 = textPaint;
            i11 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, r10, r11, r12, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanned.getSpanStart(replacementSpan), spanned.getSpanEnd(replacementSpan))) + i11);
            i10++;
            textPaint = textPaint2;
            charSequence = charSequence;
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (t41VarArr == null || t41VarArr.length == 0) {
            return textPaint3.measureText(charSequence2.toString()) + i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < t41VarArr.length; i13++) {
            int spanStart = spanned.getSpanStart(t41VarArr[i13]);
            int spanEnd = spanned.getSpanEnd(t41VarArr[i13]);
            int max = Math.max(i12, spanStart);
            if (max - i12 > 0) {
                f9 += textPaint3.measureText(spanned, i12, max);
            }
            i12 = Math.max(max, spanEnd);
            if (i12 - max > 0) {
                Typeface typeface = textPaint3.getTypeface();
                textPaint3.setTypeface(t41VarArr[i13].a);
                float measureText = textPaint3.measureText(spanned, max, i12) + f9;
                textPaint3.setTypeface(typeface);
                f9 = measureText;
            }
        }
        int max2 = Math.max(i12, charSequence2.length());
        if (max2 - i12 > 0) {
            f9 += textPaint3.measureText(spanned, i12, max2);
        }
        return f9 + i11;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.w;
        int i10 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i11 = this.h;
        if (i11 > 0) {
            i10 = Math.min(i11, i10);
        }
        return Math.max(0, i10);
    }

    public void c(Canvas canvas, float f9) {
        int i10 = this.g0;
        Paint paint = this.B;
        if (i10 != 0) {
            paint.setShadowLayer(this.e0, 0.0f, this.f0, org.telegram.ui.ActionBar.g6.l1(f9, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f9));
        Path path = this.p0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.w0) {
            int dp = AndroidUtilities.dp(64.0f);
            float currentTimeMillis = (((this.s0 * 4.0f) + (dp * 2)) * (((System.currentTimeMillis() - this.E0) % 4000) / 4000.0f)) + (-dp);
            this.C0.reset();
            this.C0.postTranslate(this.n0.left + currentTimeMillis, 0.0f);
            this.B0.setLocalMatrix(this.C0);
            this.D0.setLocalMatrix(this.C0);
            canvas.drawPath(path, this.z0);
            canvas.drawPath(this.x0, this.A0);
            invalidate();
        }
    }

    public final void d(Path path, float f9, float f10, float f11, RectF rectF, Rect rect) {
        float f12;
        float f13 = f9 / 2.0f;
        float f14 = f10 / 2.0f;
        float min = Math.min(this.v, Math.min(f13, f14));
        int i10 = this.a;
        if (i10 == 1 || i10 == 3) {
            float clamp = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.b) + this.c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min2 = Math.min(Math.max(getPaddingLeft(), clamp - f13) + f9, getMeasuredWidth() - getPaddingRight());
            float f15 = min2 - f9;
            float f16 = this.y;
            float clamp2 = Utilities.clamp(clamp, (min2 - min) - f16, f15 + min + f16);
            if (this.a == 1) {
                rectF.set(f15, getPaddingTop() + this.A, min2, getPaddingTop() + this.A + f10);
            } else {
                rectF.set(f15, ((getMeasuredHeight() - this.A) - getPaddingBottom()) - f10, min2, (getMeasuredHeight() - this.A) - getPaddingBottom());
            }
            f12 = clamp2;
        } else {
            float clamp3 = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.b) + this.c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min3 = Math.min(Math.max(getPaddingTop(), clamp3 - f14) + f10, getMeasuredHeight() - getPaddingBottom());
            float f17 = min3 - f10;
            float f18 = this.y;
            f12 = Utilities.clamp(clamp3, (min3 - min) - f18, f17 + min + f18);
            if (this.a == 0) {
                rectF.set(getPaddingLeft() + this.A, f17, getPaddingLeft() + this.A + f9, min3);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.A) - f9, f17, (getMeasuredWidth() - getPaddingRight()) - this.A, min3);
            }
        }
        float f19 = -f11;
        rectF.inset(f19, f19);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z10 = this.s;
        RectF rectF2 = this.F0;
        if (z10) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f20 = rectF.left;
            float f21 = rectF.bottom;
            float f22 = min * 2.0f;
            rectF2.set(f20, f21 - f22, f22 + f20, f21);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.a == 0) {
            path.lineTo(rectF.left, this.y + f12 + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.y + f12);
            path.lineTo(rectF.left - this.A, AndroidUtilities.dp(1.0f) + f12);
            float f23 = rectF.left - this.A;
            this.q0 = f23;
            this.r0 = f12;
            path.lineTo(f23, f12 - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, f12 - this.y);
            path.lineTo(rectF.left, (f12 - this.y) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.A);
            }
        }
        if (this.s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f24 = rectF.left;
            float f25 = rectF.top;
            float f26 = min * 2.0f;
            rectF2.set(f24, f25, f24 + f26, f26 + f25);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.a == 1) {
            path.lineTo((f12 - this.y) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(f12 - this.y, rectF.top);
            path.lineTo(f12 - AndroidUtilities.dp(1.0f), rectF.top - this.A);
            this.q0 = f12;
            this.r0 = rectF.top - this.A;
            path.lineTo(AndroidUtilities.dp(1.0f) + f12, rectF.top - this.A);
            path.lineTo(this.y + f12, rectF.top);
            path.lineTo(this.y + f12 + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.A);
            }
        }
        if (this.s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f27 = rectF.right;
            float f28 = min * 2.0f;
            float f29 = rectF.top;
            rectF2.set(f27 - f28, f29, f27, f28 + f29);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.a == 2) {
            path.lineTo(rectF.right, (f12 - this.y) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, f12 - this.y);
            path.lineTo(rectF.right + this.A, f12 - AndroidUtilities.dp(1.0f));
            float f30 = rectF.right + this.A;
            this.q0 = f30;
            this.r0 = f12;
            path.lineTo(f30, AndroidUtilities.dp(1.0f) + f12);
            path.lineTo(rectF.right, this.y + f12);
            path.lineTo(rectF.right, this.y + f12 + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.A);
            }
        }
        if (this.s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f31 = rectF.right;
            float f32 = min * 2.0f;
            float f33 = rectF.bottom;
            rectF2.set(f31 - f32, f33 - f32, f31, f33);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.a == 3) {
            path.lineTo(this.y + f12 + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.y + f12, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + f12, rectF.bottom + this.A);
            this.q0 = f12;
            this.r0 = rectF.bottom + this.A;
            path.lineTo(f12 - AndroidUtilities.dp(1.0f), rectF.bottom + this.A);
            path.lineTo(f12 - this.y, rectF.bottom);
            path.lineTo((f12 - this.y) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.A);
            }
        }
        path.close();
        this.u0 = true;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float f9;
        float f10;
        t3 t3Var;
        float f11;
        Canvas canvas2;
        if (this.E && this.H == null) {
            return;
        }
        float e10 = this.S.e(this.R && !this.v0);
        if (this.v0) {
            this.v0 = false;
            invalidate();
        }
        if (e10 <= 0.0f) {
            return;
        }
        boolean z10 = this.E;
        org.telegram.ui.Components.n6 n6Var = this.D;
        float d = z10 ? this.K : n6Var.d();
        float f12 = this.E ? this.L : n6Var.e;
        if (this.r) {
            if (this.n == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                this.n = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            d += this.x + this.n.getIntrinsicWidth();
            f12 = Math.max(this.n.getIntrinsicHeight(), f12);
        }
        if (this.V != null) {
            d += this.b0 + this.a0;
            f12 = Math.max(this.c0, f12);
        }
        float f13 = d;
        RectF rectF2 = this.w;
        float f14 = rectF2.left + f13 + rectF2.right;
        float f15 = rectF2.top + f12 + rectF2.bottom;
        boolean z11 = this.u0;
        RectF rectF3 = this.n0;
        if (!z11 || Math.abs(f14 - this.s0) > 0.1f || Math.abs(f15 - this.t0) > 0.1f) {
            this.s0 = f14;
            this.t0 = f15;
            d(this.p0, f14, f15, 0.0f, rectF3, this.m0);
            rectF = rectF3;
            if (this.w0) {
                d(this.x0, f14, f15, this.y0, this.o0, null);
            }
        } else {
            rectF = rectF3;
        }
        float f16 = this.f ? e10 : 1.0f;
        canvas.save();
        if (e10 < 1.0f && this.e) {
            float lerp = AndroidUtilities.lerp(0.75f, 1.0f, e10);
            canvas.scale(lerp, lerp, this.q0, this.r0);
        }
        float a2 = this.l0.a(0.025f);
        if (a2 != 1.0f) {
            canvas.scale(a2, a2, this.q0, this.r0);
        }
        if (this.k0 != 1.0f) {
            int i10 = this.a;
            if (i10 == 3 || i10 == 1) {
                canvas.translate(0.0f, (this.k0 - 1.0f) * Math.max(i10 == 3 ? getPaddingBottom() : getPaddingTop(), AndroidUtilities.dp(24.0f)) * (this.a != 1 ? 1 : -1));
            } else {
                canvas.translate((this.k0 - 1.0f) * Math.max(i10 == 0 ? getPaddingLeft() : getPaddingRight(), AndroidUtilities.dp(24.0f)) * (this.a != 0 ? 1 : -1), 0.0f);
            }
        }
        RectF rectF4 = AndroidUtilities.rectTmp;
        rectF4.set(rectF);
        float f17 = -this.A;
        rectF4.inset(f17, f17);
        c(canvas, f16);
        org.telegram.ui.Cells.z zVar = this.T;
        if (zVar != null) {
            zVar.setAlpha((int) (f16 * 255.0f));
            this.T.setBounds(this.m0);
            this.T.draw(canvas);
        }
        float f18 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
        xi0 xi0Var = this.V;
        if (xi0Var != null) {
            if (this.d0) {
                float f19 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                float f20 = this.W + f18;
                f9 = 255.0f;
                float f21 = this.c0 / 2.0f;
                xi0Var.setBounds((int) f19, (int) (f20 - f21), (int) (f19 + this.b0), (int) (f21 + f20));
                f10 = this.b0 + this.a0 + 0.0f;
            } else {
                f9 = 255.0f;
                float f22 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                float f23 = this.W + f18;
                float f24 = this.c0 / 2.0f;
                xi0Var.setBounds((int) (f22 - this.b0), (int) (f23 - f24), (int) f22, (int) (f24 + f23));
                f10 = 0.0f;
            }
            this.V.setAlpha((int) (f16 * f9));
            this.V.draw(canvas);
        } else {
            f9 = 255.0f;
            f10 = 0.0f;
        }
        if (this.E) {
            f11 = f16;
            t3Var = this;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f15), (int) (f16 * f9), 31);
            float f25 = ((f10 + rectF.left) + rectF2.left) - t3Var.J;
            t3Var.N = f25;
            float f26 = f18 - (t3Var.L / 2.0f);
            t3Var.O = f26;
            canvas2.translate(f25, f26);
            if (t3Var.M.f(canvas2)) {
                t3Var.invalidate();
            }
            t3Var.H.draw(canvas2);
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, t3Var.H, t3Var.I, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2.restore();
        } else {
            t3Var = this;
            f11 = f16;
            canvas2 = canvas;
            CharSequence charSequence = t3Var.C;
            if (charSequence != null) {
                n6Var.q(charSequence, t3Var.R, true);
                t3Var.C = null;
            }
            float f27 = rectF.left;
            float f28 = rectF2.left;
            float f29 = t3Var.L / 2.0f;
            n6Var.setBounds((int) (f10 + f27 + f28), (int) (f18 - f29), (int) (f27 + f28 + f13), (int) (f29 + f18));
            n6Var.w = (int) (f11 * f9);
            n6Var.draw(canvas2);
        }
        if (t3Var.r) {
            if (t3Var.n == null) {
                Drawable mutate2 = t3Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                t3Var.n = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            t3Var.n.setAlpha((int) (f11 * f9));
            t3Var.n.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - r1.getIntrinsicWidth()), (int) (rectF.centerY() - (t3Var.n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((t3Var.n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
            t3Var.n.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void e(boolean z10) {
        AndroidUtilities.cancelRunOnUIThread(this.i0);
        Runnable runnable = this.h0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.R = false;
        org.telegram.ui.Components.d6 d6Var = this.S;
        if (!z10) {
            d6Var.getClass();
            d6Var.d(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.h0;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, (long) (d6Var.c * d6Var.g));
        }
        this.M.d(true);
    }

    public final void f(int i10, CharSequence charSequence) {
        this.H = new StaticLayout(charSequence, this.F, i10, this.G, 1.0f, 0.0f, false);
        float f9 = i10;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < this.H.getLineCount(); i11++) {
            f9 = Math.min(f9, this.H.getLineLeft(i11));
            f10 = Math.max(f10, this.H.getLineRight(i11));
        }
        this.K = Math.max(0.0f, f10 - f9);
        this.L = this.H.getHeight();
        this.J = f9;
        this.I = org.telegram.ui.Components.y5.update(0, this, this.I, this.H);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.C;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.E) {
            return this.D.g;
        }
        StaticLayout staticLayout = this.H;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        return this.E ? this.F : this.D.a;
    }

    public final void h(int i10) {
        Paint paint = this.B;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i() {
        this.r = true;
        if (this.E) {
            return;
        }
        this.w.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.r ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
    }

    public final void j(int i10) {
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(34.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(34.0f));
        xi0Var.start();
        k(xi0Var);
    }

    public final void k(xi0 xi0Var) {
        xi0 xi0Var2 = this.V;
        if (xi0Var2 != null) {
            xi0Var2.setCallback(null);
        }
        this.V = xi0Var;
        xi0Var.setCallback(this);
        xi0 xi0Var3 = this.V;
        if (com.google.android.recaptcha.internal.a.u(xi0Var3)) {
            this.d = Math.max(this.d, xi0Var3.p());
        }
        xi0 xi0Var4 = this.V;
        this.b0 = xi0Var4.b;
        this.c0 = xi0Var4.c;
        this.d0 = true;
    }

    public final void l(float f9, float f10, float f11, float f12) {
        this.w.set(AndroidUtilities.dpf2(f9), AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f12));
    }

    public final void m(float f9, float f10) {
        if (Math.abs(this.b - f9) >= 1.0f || Math.abs(this.c - AndroidUtilities.dp(f10)) >= 1.0f) {
            this.u0 = false;
            invalidate();
        }
        this.b = f9;
        this.c = AndroidUtilities.dp(f10);
    }

    public final void n(float f9, float f10) {
        if (Math.abs(this.b - f9) >= 1.0f || Math.abs(this.c - f10) >= 1.0f) {
            this.u0 = false;
            invalidate();
        }
        this.b = f9;
        this.c = f10;
    }

    public final void o() {
        this.h = AndroidUtilities.dp(165.0f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release(this, this.I);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.u0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.n6 n6Var = this.D;
        n6Var.G = textMaxWidth;
        if (this.E) {
            CharSequence charSequence = this.C;
            if (charSequence == null) {
                StaticLayout staticLayout = this.H;
                if (staticLayout == null) {
                    return;
                } else {
                    charSequence = staticLayout.getText();
                }
            }
            StaticLayout staticLayout2 = this.H;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                f(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.C;
            if (charSequence2 != null) {
                n6Var.q(charSequence2, false, true);
            }
        }
        this.C = null;
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
        if ((this.P || hasOnClickListeners()) && this.R) {
            if (this.H != null) {
                int x4 = (int) motionEvent.getX();
                int y8 = (int) motionEvent.getY();
                StaticLayout staticLayout = this.H;
                if (staticLayout != null) {
                    int i10 = (int) (x4 - this.N);
                    int i11 = (int) (y8 - this.O);
                    int lineForVertical = staticLayout.getLineForVertical(i11);
                    float f9 = i10;
                    int offsetForHorizontal = this.H.getOffsetForHorizontal(lineForVertical, f9);
                    float lineLeft = this.H.getLineLeft(lineForVertical);
                    if (lineLeft <= f9 && this.H.getLineWidth(lineForVertical) + lineLeft >= f9 && i11 >= 0 && i11 <= this.H.getHeight()) {
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(this.H.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            clickableSpan = clickableSpanArr[0];
                            vk0 vk0Var = this.i0;
                            v80 v80Var = this.M;
                            if (clickableSpan == null && motionEvent.getAction() == 0) {
                                z80 z80Var = new z80(clickableSpan, null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.G0 = z80Var;
                                v80Var.a(z80Var, null);
                                SpannableString spannableString = new SpannableString(this.H.getText());
                                int spanStart = spannableString.getSpanStart(this.G0.i);
                                int spanEnd = spannableString.getSpanEnd(this.G0.i);
                                s80 b10 = this.G0.b();
                                b10.d(this.H, spanStart, 0.0f);
                                this.H.getSelectionPath(spanStart, spanEnd, b10);
                                invalidate();
                                AndroidUtilities.runOnUIThread(new ih.x(this, z80Var, clickableSpan), ViewConfiguration.getLongPressTimeout());
                                AndroidUtilities.cancelRunOnUIThread(vk0Var);
                                return true;
                            }
                            if (motionEvent.getAction() == 1) {
                                v80Var.d(true);
                                invalidate();
                                AndroidUtilities.cancelRunOnUIThread(vk0Var);
                                long j10 = this.d;
                                if (j10 > 0) {
                                    AndroidUtilities.runOnUIThread(vk0Var, j10);
                                }
                                z80 z80Var2 = this.G0;
                                if (z80Var2 != null && (characterStyle = z80Var2.i) == clickableSpan) {
                                    if (characterStyle != null) {
                                        ((ClickableSpan) characterStyle).onClick(this);
                                    }
                                    this.G0 = null;
                                    return true;
                                }
                                this.G0 = null;
                            }
                            if (motionEvent.getAction() == 3) {
                                v80Var.d(true);
                                invalidate();
                                AndroidUtilities.cancelRunOnUIThread(vk0Var);
                                long j11 = this.d;
                                if (j11 > 0) {
                                    AndroidUtilities.runOnUIThread(vk0Var, j11);
                                }
                                this.G0 = null;
                            }
                        }
                    }
                }
                clickableSpan = null;
                vk0 vk0Var2 = this.i0;
                v80 v80Var2 = this.M;
                if (clickableSpan == null) {
                }
                if (motionEvent.getAction() == 1) {
                }
                if (motionEvent.getAction() == 3) {
                }
            }
            if (this.G0 == null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int action = motionEvent.getAction();
                uc ucVar = this.l0;
                if (action == 0) {
                    if (this.n0.contains(motionEvent.getX() - 0.0f, motionEvent.getY() - 0.0f)) {
                        ucVar.c(true);
                        org.telegram.ui.Cells.z zVar = this.T;
                        if (zVar != null) {
                            zVar.setHotspot(x10, y10);
                            this.T.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                            return true;
                        }
                    }
                }
                if (motionEvent.getAction() == 1) {
                    if (hasOnClickListeners()) {
                        performClick();
                    } else if (this.P) {
                        e(true);
                    }
                    ucVar.c(false);
                    org.telegram.ui.Cells.z zVar2 = this.T;
                    if (zVar2 != null) {
                        zVar2.setState(new int[0]);
                        return true;
                    }
                } else if (motionEvent.getAction() == 3) {
                    ucVar.c(false);
                    org.telegram.ui.Cells.z zVar3 = this.T;
                    if (zVar3 != null) {
                        zVar3.setState(new int[0]);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void p(int i10) {
        this.h = i10;
    }

    public final void q(boolean z10) {
        this.E = z10;
        RectF rectF = this.w;
        if (z10) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.x = AndroidUtilities.dp(6.0f);
        } else {
            rectF.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.r ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
            this.x = AndroidUtilities.dp(2.0f);
        }
    }

    public final void r(float f9) {
        this.v = AndroidUtilities.dp(f9);
        this.B.setPathEffect(this.s ? new CornerPathEffect(this.v) : null);
        Paint paint = this.U;
        if (paint != null) {
            paint.setPathEffect(this.s ? new CornerPathEffect(this.v) : null);
        }
    }

    public final void s() {
        this.s = false;
        this.B.setPathEffect(null);
    }

    public final void t(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.C = charSequence;
        } else if (this.E) {
            f(getTextMaxWidth(), charSequence);
        } else {
            this.D.q(charSequence, false, true);
        }
    }

    public final void u(float f9) {
        this.D.t(AndroidUtilities.dpf2(f9));
        this.F.setTextSize(AndroidUtilities.dpf2(f9));
    }

    public final void v() {
        if (this.R && this.Q) {
            ValueAnimator valueAnimator = this.j0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.j0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.j0 = ofFloat;
            ofFloat.addUpdateListener(new lh.d5(this, 8));
            this.j0.addListener(new ag.m0(this, 29));
            this.j0.setInterpolator(jr.k);
            this.j0.setDuration(300L);
            this.j0.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.R = true;
        invalidate();
        vk0 vk0Var = this.i0;
        AndroidUtilities.cancelRunOnUIThread(vk0Var);
        long j10 = this.d;
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(vk0Var, j10);
        }
        Runnable runnable = this.h0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.D || drawable == this.T || drawable == this.V || super.verifyDrawable(drawable);
    }
}
