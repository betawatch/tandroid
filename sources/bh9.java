// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bh9 extends mg9 {
    public final qh9 X;
    public final qh9[] Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public int c0;
    public float d0;
    public int e0;
    public boolean f0;
    public boolean g0;
    public int h0;
    public final Paint i0;
    public final Path j0;
    public final tgb k0;
    public Drawable l0;
    public int m0;
    public boolean n0;
    public final String o0;
    public final SpannableString p0;
    public final String q0;
    public final int r0;
    public int s0;
    public int t0;
    public VelocityTracker u0;
    public OverScroller v0;
    public final bg7 w0;

    public bh9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockPreformatted pageblockpreformatted, bh9 bh9Var) {
        super(rh9Var, rect, i);
        StaticLayout staticLayout;
        this.i0 = new Paint(1);
        this.j0 = new Path();
        this.w0 = new bg7(this, (byte) 19);
        this.Z = this.c;
        this.q0 = pageblockpreformatted.language;
        String w = rh9.w(pageblockpreformatted.text);
        this.o0 = w;
        SpannableString spannableString = new SpannableString(w);
        this.p0 = spannableString;
        int length = w.length();
        int i2 = length > 500 ? 3 : length > 220 ? 2 : length > 80 ? 1 : 0;
        this.r0 = i2;
        if (spannableString.length() > 0) {
            oh9 oh9Var = new oh9(this.a, 8, false);
            oh9Var.e = i2;
            spannableString.setSpan(oh9Var, 0, spannableString.length(), 33);
            spannableString.setSpan(new kg9(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (bh9Var != null) {
                CharSequence charSequence = bh9Var.p0;
                if (charSequence instanceof lj2) {
                    lj2 lj2Var = (lj2) charSequence;
                    if (!lj2Var.a) {
                        charSequence = lj2Var.c;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && w.length() >= charSequence.length()) {
                    if (charSequence instanceof lj2) {
                        ((lj2) charSequence).c = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) w.substring(charSequence.length()));
                    for (oh9 oh9Var2 : (oh9[]) append.getSpans(0, append.length(), oh9.class)) {
                        append.removeSpan(oh9Var2);
                    }
                    oh9 oh9Var3 = new oh9(this.a, 8, false);
                    oh9Var3.e = this.r0;
                    append.setSpan(oh9Var3, 0, append.length(), 33);
                    nj2[] nj2VarArr = (nj2[]) append.getSpans(0, append.length(), nj2.class);
                    for (int i3 = 0; i3 < nj2VarArr.length; i3++) {
                        int spanStart = append.getSpanStart(nj2VarArr[i3]);
                        int spanStart2 = append.getSpanStart(nj2VarArr[i3]);
                        append.removeSpan(nj2VarArr[i3]);
                        append.setSpan(nj2VarArr[i3], spanStart, spanStart2, 33);
                    }
                    lj2 lj2Var2 = new lj2(this.p0);
                    lj2Var2.c = append;
                    this.p0 = lj2Var2;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.p0;
                qj2.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        qh9 qh9Var = new qh9(rh9Var, this.p0, gl.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.X = qh9Var;
        this.Y = new qh9[]{qh9Var};
        if (!TextUtils.isEmpty(this.q0)) {
            this.k0 = new tgb(this.q0, Math.max(8, gba.S0 - 4), null);
        }
        int L = gl.L(28.0f) + gl.L(14.0f) + (this.k0 != null ? gl.L(12.0f) + ((int) Math.ceil(r5.c)) : 0);
        int max = Math.max(0, qh9Var.h - qh9Var.f) + (gl.L(14.0f) << 1);
        if (this.k0 == null && (staticLayout = qh9Var.b) != null && staticLayout.getLineCount() > 0) {
            max = ls6.e(36.0f, gl.L(14.0f) + (((int) Math.ceil(qh9Var.b.getLineRight(0))) - qh9Var.f), max);
        }
        int max2 = Math.max(L, max);
        this.a0 = max2;
        int max3 = Math.max(0, max2 - this.Z);
        this.b0 = max3;
        if (bh9Var != null) {
            this.c0 = Utilities.j(bh9Var.c0, max3, 0);
        }
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return l0() + rect.top + (gl.L(6.0f) << 1) + rect.bottom;
    }

    @Override // mg9
    public final int J() {
        return K();
    }

    @Override // mg9
    public final int K() {
        Rect rect = this.b;
        return Math.min(this.Z, this.a0) + rect.left + rect.right;
    }

    @Override // mg9
    public final pib[] L() {
        return this.Y;
    }

    @Override // mg9
    public final boolean Q() {
        if (this.f0) {
            return true;
        }
        OverScroller overScroller = this.v0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // mg9
    public final void T() {
        this.X.i(this.W);
    }

    @Override // mg9
    public final void V() {
        this.X.f(this.W);
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, gl.L(6.0f));
        i0(canvas);
        k0(canvas, false, 0, 0.0f);
        j0(canvas);
        canvas.restore();
    }

    @Override // mg9
    public final void X(Canvas canvas, int i, float f) {
        StaticLayout staticLayout = this.X.b;
        if (staticLayout == null || i < 0 || i >= staticLayout.getLineCount()) {
            W(canvas);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, gl.L(6.0f));
        i0(canvas);
        k0(canvas, true, i, f);
        j0(canvas);
        canvas.restore();
    }

    @Override // mg9
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float L = gl.L(14.0f) - this.c0;
        float n0 = n0() + gl.L(6.0f);
        if (actionMasked == 0 && p0(motionEvent.getX(), motionEvent.getY() - gl.L(6.0f))) {
            this.n0 = true;
            View view2 = this.W;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            if (!this.n0) {
                qh9 qh9Var = this.X;
                if (actionMasked == 0) {
                    if (this.h0 == 0 && (view = this.W) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.h0 = viewConfiguration.getScaledTouchSlop();
                        this.s0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.t0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    OverScroller overScroller = this.v0;
                    if (overScroller == null && this.W != null) {
                        overScroller = new OverScroller(this.W.getContext());
                        this.v0 = overScroller;
                    }
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.v0.forceFinished(true);
                    }
                    this.d0 = motionEvent.getX();
                    this.e0 = this.c0;
                    this.f0 = false;
                    VelocityTracker velocityTracker2 = this.u0;
                    if (velocityTracker2 == null) {
                        this.u0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.u0.addMovement(motionEvent);
                    motionEvent.offsetLocation(-L, -n0);
                    this.g0 = qh9Var.t(motionEvent);
                    motionEvent.offsetLocation(L, n0);
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z = this.f0;
                        this.f0 = false;
                        if (z) {
                            a0(false);
                            if (actionMasked == 1 && (velocityTracker = this.u0) != null && this.v0 != null && this.W != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.u0.computeCurrentVelocity(1000, this.t0);
                                float f = -this.u0.getXVelocity();
                                if (Math.abs(f) > this.s0) {
                                    this.v0.fling(this.c0, 0, (int) f, 0, 0, this.b0, 0, 0);
                                    this.W.postOnAnimation(this.w0);
                                }
                            }
                        }
                        if (!z && this.g0) {
                            motionEvent.offsetLocation(-L, -n0);
                            qh9Var.t(motionEvent);
                            motionEvent.offsetLocation(L, n0);
                        }
                        this.g0 = false;
                        VelocityTracker velocityTracker3 = this.u0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.u0 = null;
                        }
                        if (z || actionMasked == 1) {
                        }
                    }
                    return false;
                }
                VelocityTracker velocityTracker4 = this.u0;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                float x = motionEvent.getX() - this.d0;
                boolean z2 = this.f0;
                int i = this.b0;
                if (!z2 && i > 0 && Math.abs(x) > this.h0) {
                    this.f0 = true;
                    a0(true);
                    if (this.g0) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        obtain.offsetLocation(-L, -n0);
                        qh9Var.t(obtain);
                        obtain.recycle();
                        this.g0 = false;
                    }
                }
                if (!this.f0) {
                    return this.g0;
                }
                int i2 = (int) (this.e0 - x);
                int i3 = i2 >= 0 ? i2 : 0;
                if (i3 <= i) {
                    i = i3;
                }
                if (i != this.c0) {
                    this.c0 = i;
                    Z(this.T, this.U, this.V);
                    View view3 = this.W;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                }
            } else if (actionMasked == 2 && !p0(motionEvent.getX(), motionEvent.getY() - gl.L(6.0f))) {
                this.n0 = false;
                View view4 = this.W;
                if (view4 != null) {
                    view4.invalidate();
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.n0 = false;
                View view5 = this.W;
                if (view5 != null) {
                    view5.invalidate();
                }
                bb2 bb2Var = this.a.F;
                if (actionMasked == 1 && bb2Var != null) {
                    bb2Var.b2(this.o0, this.q0);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // mg9
    public final void Z(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        int L = (gl.L(14.0f) + i) - this.c0;
        qh9 qh9Var = this.X;
        qh9Var.c = L - qh9Var.f;
        qh9Var.d = n0() + gl.L(6.0f) + i2;
        qh9Var.e = i3;
    }

    @Override // mg9, jg7
    public final Layout a() {
        return this.X.b;
    }

    public final void i0(Canvas canvas) {
        rh9 rh9Var = this.a;
        int v0 = bkb.v0(rh9Var.D() ? bkb.ol : bkb.nl, rh9Var.D);
        Paint paint = this.i0;
        paint.setColor(v0);
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, m0(), l0());
        canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paint);
    }

    public final void j0(Canvas canvas) {
        Canvas canvas2;
        rh9 rh9Var = this.a;
        int p1 = bkb.p1(0.5f, bkb.v0(rh9Var.D() ? bkb.Vc : bkb.Uc, rh9Var.D));
        tgb tgbVar = this.k0;
        if (tgbVar != null) {
            tgbVar.p = m0() - gl.L(54.0f);
            canvas2 = canvas;
            this.k0.c(gl.L(14.0f), gl.L(17.0f), 1.0f, p1, canvas2);
        } else {
            canvas2 = canvas;
        }
        Drawable drawable = this.l0;
        if (drawable == null) {
            drawable = b00.d(a.b, R.drawable.msg_copy);
            this.l0 = drawable;
        }
        if (this.m0 != p1) {
            this.m0 = p1;
            drawable.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN));
        }
        this.l0.setAlpha(this.n0 ? 128 : kk7.d4);
        int m0 = m0() - gl.L(10.0f);
        int o0 = o0();
        this.l0.setBounds(m0 - gl.L(18.0f), o0, m0, gl.L(18.0f) + o0);
        this.l0.draw(canvas2);
    }

    @Override // mg9
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        mg9.m(spannableStringBuilder, this.X, this.Y);
    }

    public final void k0(Canvas canvas, boolean z, int i, float f) {
        int m0 = m0();
        int l0 = l0();
        int i2 = this.b0;
        boolean z2 = i2 > 0;
        canvas.save();
        Path path = this.j0;
        path.rewind();
        RectF rectF = gl.P;
        float f2 = m0;
        float f3 = l0;
        rectF.set(0.0f, 0.0f, f2, f3);
        path.addRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (z2) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f2, f3, kk7.d4, 31);
        }
        canvas.save();
        canvas.translate(gl.L(14.0f) - this.c0, n0());
        qh9 qh9Var = this.X;
        if (z) {
            qh9Var.m(canvas, i, f);
        } else {
            qh9Var.d(canvas, qh9Var.T);
        }
        canvas.restore();
        if (z2) {
            float L = this.k0 != null ? gl.L(30.0f) : 0.0f;
            int i3 = this.c0;
            rh9 rh9Var = this.a;
            if (i3 > 0) {
                rectF.set(0.0f, L, gl.L(14.0f), f3);
                rh9Var.z.s(canvas, rectF, 0, Math.min(1.0f, this.c0 / gl.L(14.0f)));
            }
            if (this.c0 < i2) {
                rectF.set(m0 - gl.L(14.0f), L, f2, f3);
                rh9Var.z.s(canvas, rectF, 2, Math.min(1.0f, (i2 - this.c0) / gl.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final int l0() {
        return gl.L(12.0f) + this.X.b.getHeight() + n0();
    }

    public final int m0() {
        int i = this.a.C;
        Rect rect = this.b;
        return (i - rect.left) - rect.right;
    }

    public final int n0() {
        return gl.L(this.k0 != null ? 32.0f : 12.0f);
    }

    public final int o0() {
        qh9 qh9Var;
        StaticLayout staticLayout;
        return (this.k0 != null || (staticLayout = (qh9Var = this.X).b) == null || staticLayout.getLineCount() == 0) ? gl.L(8.0f) : Math.round(((qh9Var.b.getLineBaseline(0) + n0()) - (gl.L(Math.max(Math.min(10, gba.S0 - 2), (gba.S0 - 2) - this.r0)) * 0.36f)) - (gl.L(18.0f) / 2.0f));
    }

    public final boolean p0(float f, float f2) {
        int m0 = m0();
        if (f < m0 - gl.L(38.0f) || f > m0 || f2 < 0.0f) {
            return false;
        }
        return f2 <= ((float) (gl.L(26.0f) + o0()));
    }

    @Override // mg9
    public final boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        if (!this.X.o(characterStyle, eg9Var)) {
            return false;
        }
        Rect rect = this.b;
        eg9Var.e = ((gl.L(14.0f) + rect.left) - this.c0) - r0.f;
        eg9Var.f = n0() + gl.L(6.0f) + i + rect.top;
        return true;
    }

    @Override // mg9
    public final CharSequence y() {
        CharSequence y = super.y();
        String str = this.q0;
        if (!TextUtils.isEmpty(str)) {
            String b = h27.b(str);
            if (!TextUtils.isEmpty(b)) {
                return TextUtils.concat(y, " (", b, ")");
            }
        }
        return y;
    }
}
