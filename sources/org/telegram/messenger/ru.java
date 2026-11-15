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
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class ru extends cu {
    public final hv X;
    public final hv[] Y;
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
    public final oy0 k0;
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
    public final j6.o w0;

    public ru(iv ivVar, Rect rect, int i7, TL_iv.pageBlockPreformatted pageblockpreformatted, ru ruVar) {
        super(ivVar, rect, i7);
        StaticLayout staticLayout;
        this.i0 = new Paint(1);
        this.j0 = new Path();
        this.w0 = new j6.o(this, 14);
        this.Z = this.c;
        this.q0 = pageblockpreformatted.language;
        String x10 = iv.x(pageblockpreformatted.text);
        this.o0 = x10;
        if (x10 == null) {
            this.o0 = "";
        }
        SpannableString spannableString = new SpannableString(this.o0);
        this.p0 = spannableString;
        int length = this.o0.length();
        int i10 = length > 500 ? 3 : length > 220 ? 2 : length > 80 ? 1 : 0;
        this.r0 = i10;
        if (spannableString.length() > 0) {
            ev evVar = new ev(this.a, 8, false);
            evVar.e = i10;
            spannableString.setSpan(evVar, 0, spannableString.length(), 33);
            spannableString.setSpan(new zt(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (ruVar != null) {
                CharSequence charSequence = ruVar.p0;
                if (charSequence instanceof qi.e) {
                    qi.e eVar = (qi.e) charSequence;
                    if (!eVar.a) {
                        charSequence = eVar.b;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && this.o0.length() >= charSequence.length()) {
                    if (charSequence instanceof qi.e) {
                        ((qi.e) charSequence).b = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.o0.substring(charSequence.length()));
                    for (ev evVar2 : (ev[]) append.getSpans(0, append.length(), ev.class)) {
                        append.removeSpan(evVar2);
                    }
                    ev evVar3 = new ev(this.a, 8, false);
                    evVar3.e = this.r0;
                    append.setSpan(evVar3, 0, append.length(), 33);
                    qi.g[] gVarArr = (qi.g[]) append.getSpans(0, append.length(), qi.g.class);
                    for (int i11 = 0; i11 < gVarArr.length; i11++) {
                        int spanStart = append.getSpanStart(gVarArr[i11]);
                        int spanStart2 = append.getSpanStart(gVarArr[i11]);
                        append.removeSpan(gVarArr[i11]);
                        append.setSpan(gVarArr[i11], spanStart, spanStart2, 33);
                    }
                    qi.e eVar2 = new qi.e(this.p0);
                    eVar2.b = append;
                    this.p0 = eVar2;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.p0;
                qi.j.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        hv hvVar = new hv(ivVar, this.p0, g0.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.X = hvVar;
        this.Y = new hv[]{hvVar};
        if (!TextUtils.isEmpty(this.q0)) {
            this.k0 = new oy0(this.q0, Math.max(8, gz.W0 - 4), null);
        }
        int L = g0.L(28.0f) + g0.L(14.0f) + (this.k0 != null ? g0.L(12.0f) + ((int) Math.ceil(r4.c)) : 0);
        int D = k5.D(14.0f, 2, Math.max(0, hvVar.h - hvVar.f));
        if (this.k0 == null && (staticLayout = hvVar.b) != null && staticLayout.getLineCount() > 0) {
            D = k5.b(36.0f, g0.L(14.0f) + (((int) Math.ceil(hvVar.b.getLineRight(0))) - hvVar.f), D);
        }
        int max = Math.max(L, D);
        this.a0 = max;
        int max2 = Math.max(0, max - this.Z);
        this.b0 = max2;
        if (ruVar != null) {
            this.c0 = Utilities.j(ruVar.c0, max2, 0);
        }
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        return l0() + k5.D(6.0f, 2, rect.top) + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.cu
    public final int K() {
        Rect rect = this.b;
        return Math.min(this.Z, this.a0) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.cu
    public final org.telegram.ui.Cells.s9[] L() {
        return this.Y;
    }

    @Override // org.telegram.messenger.cu
    public final boolean Q() {
        if (this.f0) {
            return true;
        }
        OverScroller overScroller = this.v0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.cu
    public final void T() {
        this.X.i(this.W);
    }

    @Override // org.telegram.messenger.cu
    public final void V() {
        this.X.f(this.W);
    }

    @Override // org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, g0.L(6.0f));
        i0(canvas);
        k0(canvas, false, 0, 0.0f);
        j0(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.cu
    public final void X(Canvas canvas, int i7, float f10) {
        StaticLayout staticLayout = this.X.b;
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

    @Override // org.telegram.messenger.cu
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float L = g0.L(14.0f) - this.c0;
        float n02 = n0() + g0.L(6.0f);
        if (actionMasked == 0 && p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
            this.n0 = true;
            View view2 = this.W;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            if (!this.n0) {
                hv hvVar = this.X;
                if (actionMasked == 0) {
                    if (this.h0 == 0 && (view = this.W) != null) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
                        this.h0 = viewConfiguration.getScaledTouchSlop();
                        this.s0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.t0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    if (this.v0 == null && this.W != null) {
                        this.v0 = new OverScroller(this.W.getContext());
                    }
                    OverScroller overScroller = this.v0;
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
                    motionEvent.offsetLocation(-L, -n02);
                    this.g0 = hvVar.t(motionEvent);
                    motionEvent.offsetLocation(L, n02);
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = this.f0;
                        this.f0 = false;
                        if (z10) {
                            a0(false);
                            if (actionMasked == 1 && (velocityTracker = this.u0) != null && this.v0 != null && this.W != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.u0.computeCurrentVelocity(1000, this.t0);
                                float f10 = -this.u0.getXVelocity();
                                if (Math.abs(f10) > this.s0) {
                                    this.v0.fling(this.c0, 0, (int) f10, 0, 0, this.b0, 0, 0);
                                    this.W.postOnAnimation(this.w0);
                                }
                            }
                        }
                        if (!z10 && this.g0) {
                            motionEvent.offsetLocation(-L, -n02);
                            hvVar.t(motionEvent);
                            motionEvent.offsetLocation(L, n02);
                        }
                        this.g0 = false;
                        VelocityTracker velocityTracker3 = this.u0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.u0 = null;
                        }
                        if (z10 || actionMasked == 1) {
                        }
                    }
                    return false;
                }
                VelocityTracker velocityTracker4 = this.u0;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.d0;
                boolean z11 = this.f0;
                int i7 = this.b0;
                if (!z11 && i7 > 0 && Math.abs(x10) > this.h0) {
                    this.f0 = true;
                    a0(true);
                    if (this.g0) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        obtain.offsetLocation(-L, -n02);
                        hvVar.t(obtain);
                        obtain.recycle();
                        this.g0 = false;
                    }
                }
                if (!this.f0) {
                    return this.g0;
                }
                int i10 = (int) (this.e0 - x10);
                int i11 = i10 >= 0 ? i10 : 0;
                if (i11 <= i7) {
                    i7 = i11;
                }
                if (i7 != this.c0) {
                    this.c0 = i7;
                    Z(this.T, this.U, this.V);
                    View view3 = this.W;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                }
            } else if (actionMasked == 2 && !p0(motionEvent.getX(), motionEvent.getY() - g0.L(6.0f))) {
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
                org.telegram.ui.Cells.l1 l1Var = this.a.F;
                if (actionMasked == 1 && l1Var != null) {
                    l1Var.e2(this.o0, this.q0);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.cu
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        int L = (g0.L(14.0f) + i7) - this.c0;
        hv hvVar = this.X;
        hvVar.c = L - hvVar.f;
        hvVar.d = n0() + g0.L(6.0f) + i10;
        hvVar.e = i11;
    }

    @Override // org.telegram.messenger.cu, org.telegram.ui.rg0
    public final Layout a() {
        return this.X.b;
    }

    public final void i0(Canvas canvas) {
        iv ivVar = this.a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.pl : org.telegram.ui.ActionBar.j6.ol, ivVar.D);
        Paint paint = this.i0;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(0.0f, 0.0f, m0(), l0());
        canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), paint);
    }

    public final void j0(Canvas canvas) {
        Canvas canvas2;
        iv ivVar = this.a;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(ivVar.E() ? org.telegram.ui.ActionBar.j6.Wc : org.telegram.ui.ActionBar.j6.Vc, ivVar.D));
        oy0 oy0Var = this.k0;
        if (oy0Var != null) {
            oy0Var.p = m0() - g0.L(54.0f);
            canvas2 = canvas;
            this.k0.c(g0.L(14.0f), g0.L(17.0f), 1.0f, r12, canvas2);
        } else {
            canvas2 = canvas;
        }
        if (this.l0 == null) {
            this.l0 = i5.c.g(t0.b, R.drawable.msg_copy);
        }
        if (this.m0 != r12) {
            Drawable drawable = this.l0;
            this.m0 = r12;
            drawable.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        }
        this.l0.setAlpha(this.n0 ? 128 : ns.e4);
        int m0 = m0() - g0.L(10.0f);
        int o02 = o0();
        this.l0.setBounds(m0 - g0.L(18.0f), o02, m0, g0.L(18.0f) + o02);
        this.l0.draw(canvas2);
    }

    @Override // org.telegram.messenger.cu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        cu.l(spannableStringBuilder, this.X, this.Y);
    }

    public final void k0(Canvas canvas, boolean z10, int i7, float f10) {
        int m0 = m0();
        int l02 = l0();
        int i10 = this.b0;
        boolean z11 = i10 > 0;
        canvas.save();
        Path path = this.j0;
        path.rewind();
        RectF rectF = g0.P;
        float f11 = m0;
        float f12 = l02;
        rectF.set(0.0f, 0.0f, f11, f12);
        path.addRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (z11) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f11, f12, ns.e4, 31);
        }
        canvas.save();
        canvas.translate(g0.L(14.0f) - this.c0, n0());
        hv hvVar = this.X;
        if (z10) {
            hvVar.m(canvas, i7, f10);
        } else {
            hvVar.d(canvas, hvVar.T);
        }
        canvas.restore();
        if (z11) {
            float L = this.k0 != null ? g0.L(30.0f) : 0.0f;
            int i11 = this.c0;
            iv ivVar = this.a;
            if (i11 > 0) {
                rectF.set(0.0f, L, g0.L(14.0f), f12);
                ivVar.z.m(canvas, rectF, 0, Math.min(1.0f, this.c0 / g0.L(14.0f)));
            }
            if (this.c0 < i10) {
                rectF.set(m0 - g0.L(14.0f), L, f11, f12);
                ivVar.z.m(canvas, rectF, 2, Math.min(1.0f, (i10 - this.c0) / g0.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    public final int l0() {
        return g0.L(12.0f) + this.X.b.getHeight() + n0();
    }

    public final int m0() {
        int i7 = this.a.C;
        Rect rect = this.b;
        return (i7 - rect.left) - rect.right;
    }

    public final int n0() {
        return g0.L(this.k0 != null ? 32.0f : 12.0f);
    }

    public final int o0() {
        hv hvVar;
        StaticLayout staticLayout;
        return (this.k0 != null || (staticLayout = (hvVar = this.X).b) == null || staticLayout.getLineCount() == 0) ? g0.L(8.0f) : Math.round(((hvVar.b.getLineBaseline(0) + n0()) - (g0.L(Math.max(Math.min(10, gz.W0 - 2), (gz.W0 - 2) - this.r0)) * 0.36f)) - (g0.L(18.0f) / 2.0f));
    }

    public final boolean p0(float f10, float f11) {
        int m0 = m0();
        if (f10 < m0 - g0.L(38.0f) || f10 > m0 || f11 < 0.0f) {
            return false;
        }
        return f11 <= ((float) (g0.L(26.0f) + o0()));
    }

    @Override // org.telegram.messenger.cu
    public final boolean u(CharacterStyle characterStyle, int i7, tt ttVar) {
        if (!this.X.o(characterStyle, ttVar)) {
            return false;
        }
        Rect rect = this.b;
        ttVar.e = ((g0.L(14.0f) + rect.left) - this.c0) - r0.f;
        ttVar.f = n0() + g0.L(6.0f) + i7 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.cu
    public final CharSequence y() {
        CharSequence y10 = super.y();
        String str = this.q0;
        if (!TextUtils.isEmpty(str)) {
            String b10 = dj.b(str);
            if (!TextUtils.isEmpty(b10)) {
                return TextUtils.concat(y10, " (", b10, ")");
            }
        }
        return y10;
    }
}
