package org.telegram.messenger;

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.my0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class tu extends fu {
    public final jv W;
    public final jv[] X;
    public final int Y;
    public final int Z;
    public final int a0;
    public int b0;
    public float c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public int g0;
    public final Paint h0;
    public final Path i0;
    public final my0 j0;
    public Drawable k0;
    public int l0;
    public boolean m0;
    public final String n0;
    public final SpannableString o0;
    public final String p0;
    public final int q0;
    public int r0;
    public int s0;
    public VelocityTracker t0;
    public OverScroller u0;
    public final m.f3 v0;

    public tu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockPreformatted pageblockpreformatted, tu tuVar) {
        super(kvVar, rect, i7);
        StaticLayout staticLayout;
        this.h0 = new Paint(1);
        this.i0 = new Path();
        this.v0 = new m.f3(this, 11);
        this.Y = this.c;
        this.p0 = pageblockpreformatted.language;
        String x10 = kv.x(pageblockpreformatted.text);
        this.n0 = x10;
        if (x10 == null) {
            this.n0 = "";
        }
        SpannableString spannableString = new SpannableString(this.n0);
        this.o0 = spannableString;
        int length = this.n0.length();
        int i10 = length > 500 ? 3 : length > 220 ? 2 : length > 80 ? 1 : 0;
        this.q0 = i10;
        if (spannableString.length() > 0) {
            gv gvVar = new gv(this.a, 8, false);
            gvVar.e = i10;
            spannableString.setSpan(gvVar, 0, spannableString.length(), 33);
            spannableString.setSpan(new cu(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (tuVar != null) {
                CharSequence charSequence = tuVar.o0;
                if (charSequence instanceof ni.h) {
                    ni.h hVar = (ni.h) charSequence;
                    if (!hVar.a) {
                        charSequence = hVar.b;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && this.n0.length() >= charSequence.length()) {
                    if (charSequence instanceof ni.h) {
                        ((ni.h) charSequence).b = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.n0.substring(charSequence.length()));
                    for (gv gvVar2 : (gv[]) append.getSpans(0, append.length(), gv.class)) {
                        append.removeSpan(gvVar2);
                    }
                    gv gvVar3 = new gv(this.a, 8, false);
                    gvVar3.e = this.q0;
                    append.setSpan(gvVar3, 0, append.length(), 33);
                    ni.j[] jVarArr = (ni.j[]) append.getSpans(0, append.length(), ni.j.class);
                    for (int i11 = 0; i11 < jVarArr.length; i11++) {
                        int spanStart = append.getSpanStart(jVarArr[i11]);
                        int spanStart2 = append.getSpanStart(jVarArr[i11]);
                        append.removeSpan(jVarArr[i11]);
                        append.setSpan(jVarArr[i11], spanStart, spanStart2, 33);
                    }
                    ni.h hVar2 = new ni.h(this.o0);
                    hVar2.b = append;
                    this.o0 = hVar2;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.o0;
                ni.m.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        jv jvVar = new jv(kvVar, this.o0, g0.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.W = jvVar;
        this.X = new jv[]{jvVar};
        if (!TextUtils.isEmpty(this.p0)) {
            this.j0 = new my0(this.p0, Math.max(8, iz.W0 - 4), null);
        }
        int L = g0.L(28.0f) + g0.L(14.0f) + (this.j0 != null ? g0.L(12.0f) + ((int) Math.ceil(r4.c)) : 0);
        int D = k5.D(14.0f, 2, Math.max(0, jvVar.h - jvVar.f));
        if (this.j0 == null && (staticLayout = jvVar.b) != null && staticLayout.getLineCount() > 0) {
            D = k5.b(36.0f, g0.L(14.0f) + (((int) Math.ceil(jvVar.b.getLineRight(0))) - jvVar.f), D);
        }
        int max = Math.max(L, D);
        this.Z = max;
        int max2 = Math.max(0, max - this.Y);
        this.a0 = max2;
        if (tuVar != null) {
            this.b0 = Utilities.j(tuVar.b0, max2, 0);
        }
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return l0() + k5.D(6.0f, 2, rect.top) + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return Math.min(this.Y, this.Z) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final org.telegram.ui.Cells.t9[] L() {
        return this.X;
    }

    @Override // org.telegram.messenger.fu
    public final boolean Q() {
        if (this.e0) {
            return true;
        }
        OverScroller overScroller = this.u0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        this.W.i(this.V);
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        this.W.f(this.V);
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, g0.L(6.0f));
        i0(canvas);
        k0(canvas, false, 0, 0.0f);
        j0(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.fu
    public final void X(Canvas canvas, int i7, float f10) {
        StaticLayout staticLayout = this.W.b;
        if (staticLayout == null || i7 < 0 || i7 >= staticLayout.getLineCount()) {
            W(canvas);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, g0.L(6.0f));
        i0(canvas);
        k0(canvas, true, i7, f10);
        j0(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float L = g0.L(14.0f) - this.b0;
        float n02 = n0() + g0.L(6.0f);
        if (actionMasked == 0 && p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
            this.m0 = true;
            View view2 = this.V;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            if (!this.m0) {
                jv jvVar = this.W;
                if (actionMasked == 0) {
                    if (this.g0 == 0 && (view = this.V) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.g0 = viewConfiguration.getScaledTouchSlop();
                        this.r0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.s0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    if (this.u0 == null && this.V != null) {
                        this.u0 = new OverScroller(this.V.getContext());
                    }
                    OverScroller overScroller = this.u0;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.u0.forceFinished(true);
                    }
                    this.c0 = motionEvent.getX();
                    this.d0 = this.b0;
                    this.e0 = false;
                    VelocityTracker velocityTracker2 = this.t0;
                    if (velocityTracker2 == null) {
                        this.t0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.t0.addMovement(motionEvent);
                    motionEvent.offsetLocation(-L, -n02);
                    this.f0 = jvVar.t(motionEvent);
                    motionEvent.offsetLocation(L, n02);
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z9 = this.e0;
                        this.e0 = false;
                        if (z9) {
                            a0(false);
                            if (actionMasked == 1 && (velocityTracker = this.t0) != null && this.u0 != null && this.V != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.t0.computeCurrentVelocity(1000, this.s0);
                                float f10 = -this.t0.getXVelocity();
                                if (Math.abs(f10) > this.r0) {
                                    this.u0.fling(this.b0, 0, (int) f10, 0, 0, this.a0, 0, 0);
                                    this.V.postOnAnimation(this.v0);
                                }
                            }
                        }
                        if (!z9 && this.f0) {
                            motionEvent.offsetLocation(-L, -n02);
                            jvVar.t(motionEvent);
                            motionEvent.offsetLocation(L, n02);
                        }
                        this.f0 = false;
                        VelocityTracker velocityTracker3 = this.t0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.t0 = null;
                        }
                        if (z9 || actionMasked == 1) {
                        }
                    }
                    return false;
                }
                VelocityTracker velocityTracker4 = this.t0;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.c0;
                boolean z10 = this.e0;
                int i7 = this.a0;
                if (!z10 && i7 > 0 && Math.abs(x10) > this.g0) {
                    this.e0 = true;
                    a0(true);
                    if (this.f0) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        obtain.offsetLocation(-L, -n02);
                        jvVar.t(obtain);
                        obtain.recycle();
                        this.f0 = false;
                    }
                }
                if (!this.e0) {
                    return this.f0;
                }
                int i10 = (int) (this.d0 - x10);
                int i11 = i10 >= 0 ? i10 : 0;
                if (i11 <= i7) {
                    i7 = i11;
                }
                if (i7 != this.b0) {
                    this.b0 = i7;
                    Z(this.S, this.T, this.U);
                    View view3 = this.V;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                }
            } else if (actionMasked == 2 && !p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
                this.m0 = false;
                View view4 = this.V;
                if (view4 != null) {
                    view4.invalidate();
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.m0 = false;
                View view5 = this.V;
                if (view5 != null) {
                    view5.invalidate();
                }
                org.telegram.ui.Cells.l1 l1Var = this.a.F;
                if (actionMasked == 1 && l1Var != null) {
                    l1Var.P1(this.n0, this.p0);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.fu
    public final void Z(int i7, int i10, int i11) {
        this.S = i7;
        this.T = i10;
        this.U = i11;
        int L = (g0.L(14.0f) + i7) - this.b0;
        jv jvVar = this.W;
        jvVar.c = L - jvVar.f;
        jvVar.d = n0() + g0.L(6.0f) + i10;
        jvVar.e = i11;
    }

    @Override // org.telegram.messenger.fu, org.telegram.ui.ug0
    public final Layout a() {
        return this.W.b;
    }

    public final void i0(Canvas canvas) {
        kv kvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.m6.w0(kvVar.E() ? org.telegram.ui.ActionBar.m6.ml : org.telegram.ui.ActionBar.m6.ll, kvVar.D);
        Paint paint = this.h0;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(0.0f, 0.0f, m0(), l0());
        canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), paint);
    }

    public final void j0(Canvas canvas) {
        Canvas canvas2;
        kv kvVar = this.a;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(kvVar.E() ? org.telegram.ui.ActionBar.m6.Tc : org.telegram.ui.ActionBar.m6.Sc, kvVar.D));
        my0 my0Var = this.j0;
        if (my0Var != null) {
            my0Var.p = m0() - g0.L(54.0f);
            canvas2 = canvas;
            this.j0.c(g0.L(14.0f), g0.L(17.0f), 1.0f, r12, canvas2);
        } else {
            canvas2 = canvas;
        }
        if (this.k0 == null) {
            this.k0 = jg.g.h(t0.b, R.drawable.msg_copy);
        }
        if (this.l0 != r12) {
            Drawable drawable = this.k0;
            this.l0 = r12;
            drawable.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        }
        this.k0.setAlpha(this.m0 ? 128 : qs.e4);
        int m0 = m0() - g0.L(10.0f);
        int o02 = o0();
        this.k0.setBounds(m0 - g0.L(18.0f), o02, m0, g0.L(18.0f) + o02);
        this.k0.draw(canvas2);
    }

    @Override // org.telegram.messenger.fu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        fu.l(spannableStringBuilder, this.W, this.X);
    }

    public final void k0(Canvas canvas, boolean z9, int i7, float f10) {
        int m0 = m0();
        int l02 = l0();
        int i10 = this.a0;
        boolean z10 = i10 > 0;
        canvas.save();
        Path path = this.i0;
        path.rewind();
        RectF rectF = g0.P;
        float f11 = m0;
        float f12 = l02;
        rectF.set(0.0f, 0.0f, f11, f12);
        path.addRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (z10) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f11, f12, qs.e4, 31);
        }
        canvas.save();
        canvas.translate(g0.L(14.0f) - this.b0, n0());
        jv jvVar = this.W;
        if (z9) {
            jvVar.m(canvas, i7, f10);
        } else {
            jvVar.d(canvas, jvVar.S);
        }
        canvas.restore();
        if (z10) {
            float L = this.j0 != null ? g0.L(30.0f) : 0.0f;
            int i11 = this.b0;
            kv kvVar = this.a;
            if (i11 > 0) {
                rectF.set(0.0f, L, g0.L(14.0f), f12);
                kvVar.z.m(canvas, rectF, 0, Math.min(1.0f, this.b0 / g0.L(14.0f)));
            }
            if (this.b0 < i10) {
                rectF.set(m0 - g0.L(14.0f), L, f11, f12);
                kvVar.z.m(canvas, rectF, 2, Math.min(1.0f, (i10 - this.b0) / g0.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final int l0() {
        return g0.L(12.0f) + this.W.b.getHeight() + n0();
    }

    public final int m0() {
        int i7 = this.a.C;
        Rect rect = this.b;
        return (i7 - rect.left) - rect.right;
    }

    public final int n0() {
        return g0.L(this.j0 != null ? 32.0f : 12.0f);
    }

    public final int o0() {
        jv jvVar;
        StaticLayout staticLayout;
        return (this.j0 != null || (staticLayout = (jvVar = this.W).b) == null || staticLayout.getLineCount() == 0) ? g0.L(8.0f) : Math.round(((jvVar.b.getLineBaseline(0) + n0()) - (g0.L(Math.max(Math.min(10, iz.W0 - 2), (iz.W0 - 2) - this.q0)) * 0.36f)) - (g0.L(18.0f) / 2.0f));
    }

    public final boolean p0(float f10, float f11) {
        int m0 = m0();
        if (f10 < m0 - g0.L(38.0f) || f10 > m0 || f11 < 0.0f) {
            return false;
        }
        return f11 <= ((float) (g0.L(26.0f) + o0()));
    }

    @Override // org.telegram.messenger.fu
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        if (!this.W.o(characterStyle, wtVar)) {
            return false;
        }
        Rect rect = this.b;
        wtVar.e = ((g0.L(14.0f) + rect.left) - this.b0) - r0.f;
        wtVar.f = n0() + g0.L(6.0f) + i7 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.fu
    public final CharSequence y() {
        CharSequence y10 = super.y();
        String str = this.p0;
        if (!TextUtils.isEmpty(str)) {
            String b10 = fj.b(str);
            if (!TextUtils.isEmpty(b10)) {
                return TextUtils.concat(y10, " (", b10, ")");
            }
        }
        return y10;
    }
}
