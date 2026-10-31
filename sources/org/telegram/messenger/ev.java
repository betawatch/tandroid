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
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ev extends qu {
    public final uv W;
    public final uv[] X;
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
    public final qz0 j0;
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
    public final mg.c2 v0;

    public ev(vv vvVar, Rect rect, int i10, TL_iv.pageBlockPreformatted pageblockpreformatted, ev evVar) {
        super(vvVar, rect, i10);
        this.h0 = new Paint(1);
        this.i0 = new Path();
        this.v0 = new mg.c2(this, 9);
        this.Y = this.c;
        this.p0 = pageblockpreformatted.language;
        String x10 = vv.x(pageblockpreformatted.text);
        this.n0 = x10;
        if (x10 == null) {
            this.n0 = "";
        }
        SpannableString spannableString = new SpannableString(this.n0);
        this.o0 = spannableString;
        int length = this.n0.length();
        int i11 = length > 500 ? 3 : length > 220 ? 2 : length > 80 ? 1 : 0;
        this.q0 = i11;
        if (spannableString.length() > 0) {
            rv rvVar = new rv(this.a, 8, false);
            rvVar.e = i11;
            spannableString.setSpan(rvVar, 0, spannableString.length(), 33);
            spannableString.setSpan(new nu(pageblockpreformatted.text, 0), 0, spannableString.length(), 33);
            if (evVar != null) {
                CharSequence charSequence = evVar.o0;
                if (charSequence instanceof di.g) {
                    di.g gVar = (di.g) charSequence;
                    if (!gVar.a) {
                        charSequence = gVar.b;
                    }
                }
                if (charSequence != null && charSequence.length() > 0 && this.n0.length() >= charSequence.length()) {
                    if (charSequence instanceof di.g) {
                        ((di.g) charSequence).b = null;
                    }
                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) this.n0.substring(charSequence.length()));
                    for (rv rvVar2 : (rv[]) append.getSpans(0, append.length(), rv.class)) {
                        append.removeSpan(rvVar2);
                    }
                    rv rvVar3 = new rv(this.a, 8, false);
                    rvVar3.e = this.q0;
                    append.setSpan(rvVar3, 0, append.length(), 33);
                    di.i[] iVarArr = (di.i[]) append.getSpans(0, append.length(), di.i.class);
                    for (int i12 = 0; i12 < iVarArr.length; i12++) {
                        int spanStart = append.getSpanStart(iVarArr[i12]);
                        int spanStart2 = append.getSpanStart(iVarArr[i12]);
                        append.removeSpan(iVarArr[i12]);
                        append.setSpan(iVarArr[i12], spanStart, spanStart2, 33);
                    }
                    di.g gVar2 = new di.g(this.o0);
                    gVar2.b = append;
                    this.o0 = gVar2;
                }
            }
            if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                SpannableString spannableString2 = this.o0;
                di.l.c(spannableString2, spannableString2.length(), pageblockpreformatted.language);
            }
        }
        uv uvVar = new uv(vvVar, this.o0, i0.L(5000.0f), Layout.Alignment.ALIGN_NORMAL, 1.22f);
        this.W = uvVar;
        this.X = new uv[]{uvVar};
        if (!TextUtils.isEmpty(this.p0)) {
            this.j0 = new qz0(this.p0, Math.max(8, tz.W0 - 4), null);
        }
        int max = Math.max(i0.L(28.0f) + i0.L(14.0f) + (this.j0 != null ? i0.L(12.0f) + ((int) Math.ceil(r4.c)) : 0), (i0.L(14.0f) * 2) + Math.max(0, uvVar.h - uvVar.f));
        this.Z = max;
        int max2 = Math.max(0, max - this.Y);
        this.a0 = max2;
        if (evVar != null) {
            this.b0 = Utilities.j(evVar.b0, max2, 0);
        }
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return k0() + m5.D(6.0f, 2, rect.top) + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return Math.min(this.Y, this.Z) + rect.left + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final org.telegram.ui.Cells.u9[] K() {
        return this.X;
    }

    @Override // org.telegram.messenger.qu
    public final boolean P() {
        if (this.e0) {
            return true;
        }
        OverScroller overScroller = this.u0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        this.W.i(this.V);
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        this.W.f(this.V);
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, i0.L(6.0f));
        h0(canvas);
        j0(canvas, false, 0, 0.0f);
        i0(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.qu
    public final void W(Canvas canvas, int i10, float f7) {
        StaticLayout staticLayout = this.W.b;
        if (staticLayout == null || i10 < 0 || i10 >= staticLayout.getLineCount()) {
            V(canvas);
            return;
        }
        canvas.save();
        canvas.translate(0.0f, i0.L(6.0f));
        h0(canvas);
        j0(canvas, true, i10, f7);
        i0(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float L = i0.L(14.0f) - this.b0;
        float m0 = m0() + i0.L(6.0f);
        if (actionMasked == 0 && o0(motionEvent.getX(), motionEvent.getY() - i0.L(6.0f))) {
            this.m0 = true;
            View view2 = this.V;
            if (view2 != null) {
                view2.invalidate();
                return true;
            }
        } else {
            if (!this.m0) {
                uv uvVar = this.W;
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
                    motionEvent.offsetLocation(-L, -m0);
                    this.f0 = uvVar.t(motionEvent);
                    motionEvent.offsetLocation(L, m0);
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        boolean z10 = this.e0;
                        this.e0 = false;
                        if (z10) {
                            Z(false);
                            if (actionMasked == 1 && (velocityTracker = this.t0) != null && this.u0 != null && this.V != null) {
                                velocityTracker.addMovement(motionEvent);
                                this.t0.computeCurrentVelocity(1000, this.s0);
                                float f7 = -this.t0.getXVelocity();
                                if (Math.abs(f7) > this.r0) {
                                    this.u0.fling(this.b0, 0, (int) f7, 0, 0, this.a0, 0, 0);
                                    this.V.postOnAnimation(this.v0);
                                }
                            }
                        }
                        if (!z10 && this.f0) {
                            motionEvent.offsetLocation(-L, -m0);
                            uvVar.t(motionEvent);
                            motionEvent.offsetLocation(L, m0);
                        }
                        this.f0 = false;
                        VelocityTracker velocityTracker3 = this.t0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                            this.t0 = null;
                        }
                        if (z10 || actionMasked == 1) {
                        }
                    }
                    return false;
                }
                VelocityTracker velocityTracker4 = this.t0;
                if (velocityTracker4 != null) {
                    velocityTracker4.addMovement(motionEvent);
                }
                float x10 = motionEvent.getX() - this.c0;
                boolean z11 = this.e0;
                int i10 = this.a0;
                if (!z11 && i10 > 0 && Math.abs(x10) > this.g0) {
                    this.e0 = true;
                    Z(true);
                    if (this.f0) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction(3);
                        obtain.offsetLocation(-L, -m0);
                        uvVar.t(obtain);
                        obtain.recycle();
                        this.f0 = false;
                    }
                }
                if (!this.e0) {
                    return this.f0;
                }
                int i11 = (int) (this.d0 - x10);
                int i12 = i11 >= 0 ? i11 : 0;
                if (i12 <= i10) {
                    i10 = i12;
                }
                if (i10 != this.b0) {
                    this.b0 = i10;
                    Y(this.S, this.T, this.U);
                    View view3 = this.V;
                    if (view3 != null) {
                        view3.invalidate();
                        return true;
                    }
                }
            } else if (actionMasked == 2 && !o0(motionEvent.getX(), motionEvent.getY() - i0.L(6.0f))) {
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
                    l1Var.J1(this.n0, this.p0);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.qu
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        int L = (i0.L(14.0f) + i10) - this.b0;
        uv uvVar = this.W;
        uvVar.c = L - uvVar.f;
        uvVar.d = m0() + i0.L(6.0f) + i11;
        uvVar.e = i12;
    }

    @Override // org.telegram.messenger.qu, org.telegram.ui.xh0
    public final Layout a() {
        return this.W.b;
    }

    public final void h0(Canvas canvas) {
        vv vvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.ml : org.telegram.ui.ActionBar.t6.ll, vvVar.D);
        Paint paint = this.h0;
        paint.setColor(w02);
        RectF rectF = i0.P;
        rectF.set(0.0f, 0.0f, l0(), k0());
        canvas.drawRoundRect(rectF, i0.L(12.0f), i0.L(12.0f), paint);
    }

    public final void i0(Canvas canvas) {
        Canvas canvas2;
        vv vvVar = this.a;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.Tc : org.telegram.ui.ActionBar.t6.Sc, vvVar.D));
        qz0 qz0Var = this.j0;
        if (qz0Var != null) {
            qz0Var.p = l0() - i0.L(54.0f);
            canvas2 = canvas;
            this.j0.c(i0.L(14.0f), i0.L(17.0f), 1.0f, r12, canvas2);
        } else {
            canvas2 = canvas;
        }
        if (this.k0 == null) {
            this.k0 = i0.a.f(w0.b, R.drawable.msg_copy);
        }
        if (this.l0 != r12) {
            Drawable drawable = this.k0;
            this.l0 = r12;
            drawable.setColorFilter(new PorterDuffColorFilter(r12, PorterDuff.Mode.SRC_IN));
        }
        this.k0.setAlpha(this.m0 ? 128 : zs.e4);
        int l02 = l0() - i0.L(10.0f);
        int n02 = n0();
        this.k0.setBounds(l02 - i0.L(18.0f), n02, l02, i0.L(18.0f) + n02);
        this.k0.draw(canvas2);
    }

    public final void j0(Canvas canvas, boolean z10, int i10, float f7) {
        int l02 = l0();
        int k02 = k0();
        int i11 = this.a0;
        boolean z11 = i11 > 0;
        canvas.save();
        Path path = this.i0;
        path.rewind();
        RectF rectF = i0.P;
        float f10 = l02;
        float f11 = k02;
        rectF.set(0.0f, 0.0f, f10, f11);
        path.addRoundRect(rectF, i0.L(12.0f), i0.L(12.0f), Path.Direction.CW);
        canvas.clipPath(path);
        if (z11) {
            canvas.saveLayerAlpha(0.0f, 0.0f, f10, f11, zs.e4, 31);
        }
        canvas.save();
        canvas.translate(i0.L(14.0f) - this.b0, m0());
        uv uvVar = this.W;
        if (z10) {
            uvVar.m(canvas, i10, f7);
        } else {
            uvVar.d(canvas, uvVar.S);
        }
        canvas.restore();
        if (z11) {
            float L = this.j0 != null ? i0.L(30.0f) : 0.0f;
            int i12 = this.b0;
            vv vvVar = this.a;
            if (i12 > 0) {
                rectF.set(0.0f, L, i0.L(14.0f), f11);
                vvVar.z.o(canvas, rectF, 0, Math.min(1.0f, this.b0 / i0.L(14.0f)));
            }
            if (this.b0 < i11) {
                rectF.set(l02 - i0.L(14.0f), L, f10, f11);
                vvVar.z.o(canvas, rectF, 2, Math.min(1.0f, (i11 - this.b0) / i0.L(14.0f)));
            }
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.qu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        qu.l(spannableStringBuilder, this.W, this.X);
    }

    public final int k0() {
        return i0.L(12.0f) + this.W.b.getHeight() + m0();
    }

    public final int l0() {
        int i10 = this.a.C;
        Rect rect = this.b;
        return (i10 - rect.left) - rect.right;
    }

    public final int m0() {
        return i0.L(this.j0 != null ? 32.0f : 12.0f);
    }

    public final int n0() {
        uv uvVar;
        StaticLayout staticLayout;
        return (this.j0 != null || (staticLayout = (uvVar = this.W).b) == null || staticLayout.getLineCount() == 0) ? i0.L(8.0f) : Math.round(((uvVar.b.getLineBaseline(0) + m0()) - (i0.L(Math.max(Math.min(10, tz.W0 - 2), (tz.W0 - 2) - this.q0)) * 0.36f)) - (i0.L(18.0f) / 2.0f));
    }

    public final boolean o0(float f7, float f10) {
        int l02 = l0();
        if (f7 < l02 - i0.L(38.0f) || f7 > l02 || f10 < 0.0f) {
            return false;
        }
        return f10 <= ((float) (i0.L(26.0f) + n0()));
    }

    @Override // org.telegram.messenger.qu
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        if (!this.W.o(characterStyle, huVar)) {
            return false;
        }
        Rect rect = this.b;
        huVar.e = ((i0.L(14.0f) + rect.left) - this.b0) - r0.f;
        huVar.f = m0() + i0.L(6.0f) + i10 + rect.top;
        return true;
    }

    @Override // org.telegram.messenger.qu
    public final CharSequence y() {
        CharSequence y3 = super.y();
        String str = this.p0;
        if (!TextUtils.isEmpty(str)) {
            String b10 = gj.b(str);
            if (!TextUtils.isEmpty(b10)) {
                return TextUtils.concat(y3, " (", b10, ")");
            }
        }
        return y3;
    }
}
