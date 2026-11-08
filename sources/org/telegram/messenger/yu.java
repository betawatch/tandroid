package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.rg0;
import org.telegram.ui.tg0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class yu extends fu implements lx0 {
    public final TL_iv.pageBlockTable W;
    public final mx0 X;
    public final ArrayList Y;
    public final org.telegram.ui.Cells.t9[] Z;
    public final jv a0;
    public final int b0;
    public final ArrayList c0;
    public final int d0;
    public final int e0;
    public int f0;
    public int g0;
    public final int h0;
    public int i0;
    public Paint j0;
    public Paint k0;
    public Paint l0;
    public Paint m0;
    public float n0;
    public int o0;
    public boolean p0;
    public jv q0;
    public float r0;
    public float s0;
    public boolean t0;
    public int u0;
    public int v0;
    public int w0;
    public VelocityTracker x0;
    public OverScroller y0;
    public final m.f3 z0;

    public yu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockTable pageblocktable) {
        super(kvVar, rect, i7);
        int i10;
        this.Y = new ArrayList();
        this.c0 = new ArrayList();
        this.z0 = new m.f3(this, 12);
        Rect rect2 = this.b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.W = pageblocktable;
        this.d0 = this.c;
        mx0 mx0Var = new mx0(t0.b, this, null);
        this.X = mx0Var;
        mx0Var.setOrientation(0);
        mx0Var.setRowOrderPreserved(true);
        mx0Var.setDrawLines(pageblocktable.bordered);
        mx0Var.setStriped(pageblocktable.striped);
        mx0Var.setRtl(kvVar.I());
        mx0Var.setFillWidth(false);
        mx0Var.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (mx0Var.w != L || mx0Var.r != L2 || mx0Var.s != L3) {
                mx0Var.w = L;
                mx0Var.r = L2;
                mx0Var.s = L3;
                mx0Var.requestLayout();
            }
        }
        mx0Var.setMinimumCellHeight(g0.L(pageblocktable.compact ? 18.0f : 36.0f));
        if (pageblocktable.rows.isEmpty()) {
            i10 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
            i10 = 0;
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                int i12 = pagetablerow.cells.get(i11).colspan;
                if (i12 == 0) {
                    i12 = 1;
                }
                i10 += i12;
            }
        }
        for (int i13 = 0; i13 < pageblocktable.rows.size(); i13++) {
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i13);
            int i14 = 0;
            for (int i15 = 0; i15 < pagetablerow2.cells.size(); i15++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i15);
                int i16 = pagetablecell.colspan;
                i16 = i16 == 0 ? 1 : i16;
                int i17 = pagetablecell.rowspan;
                i17 = i17 == 0 ? 1 : i17;
                if (pagetablecell.text != null) {
                    this.X.b(pagetablecell, i14, i13, i16);
                } else {
                    this.X.a(i14, i13, i16, i17);
                }
                i14 += i16;
            }
        }
        this.X.setColumnCount(i10);
        this.X.measure(View.MeasureSpec.makeMeasureSpec(this.c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.X.getMeasuredWidth();
        this.g0 = this.X.getMeasuredHeight();
        this.h0 = Math.max(0, measuredWidth - this.d0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || TextUtils.isEmpty(kv.x(richText))) {
            this.a0 = null;
            this.b0 = 0;
        } else {
            jv jvVar = new jv(kvVar, kvVar.l(pageblocktable.title, kv.R(0, 15)), this.d0, Layout.Alignment.ALIGN_CENTER);
            this.a0 = jvVar;
            jvVar.r = true;
            this.b0 = g0.L(9.0f) + jvVar.b.getHeight();
        }
        jv jvVar2 = this.a0;
        int max = kvVar.D() ? Math.max(0, this.d0) : Math.max(0, Math.min(this.d0, Math.max(measuredWidth, jvVar2 != null ? jvVar2.r() : 0)));
        this.e0 = max;
        this.f0 = max;
        for (int i18 = 0; i18 < this.X.getChildCount(); i18++) {
            fx0 d = this.X.d(i18);
            ex0 ex0Var = d.b;
            if (ex0Var instanceof jv) {
                this.Y.add((jv) ex0Var);
                this.c0.add(new xu(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        jv jvVar3 = this.a0;
        if (jvVar3 != null) {
            arrayList.add(jvVar3);
        }
        arrayList.addAll(this.Y);
        this.Z = (org.telegram.ui.Cells.t9[]) arrayList.toArray(new org.telegram.ui.Cells.t9[0]);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return g0.L(10.0f) + rect.top + this.b0 + this.g0 + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.e0 + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final org.telegram.ui.Cells.t9[] L() {
        return this.Z;
    }

    @Override // org.telegram.messenger.fu
    public final boolean Q() {
        if (this.p0) {
            return true;
        }
        OverScroller overScroller = this.y0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        jv jvVar = this.a0;
        if (jvVar != null) {
            jvVar.i(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((jv) obj).i(this.V);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        jv jvVar = this.a0;
        if (jvVar != null) {
            jvVar.f(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((jv) obj).f(this.V);
        }
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        jv jvVar = this.a0;
        if (jvVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            jvVar.d(canvas, jvVar.S);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.b0);
        kv kvVar = this.a;
        int i7 = kvVar.S;
        h6.m mVar = kvVar.z;
        float f10 = -i7;
        int i10 = kvVar.C + kvVar.T;
        Rect rect = this.b;
        canvas.saveLayerAlpha(f10, 0.0f, (i10 - rect.left) - rect.right, this.g0, qs.e4, 31);
        canvas.save();
        canvas.translate(-this.i0, 0.0f);
        mx0 mx0Var = this.X;
        int childCount = mx0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            mx0Var.d(i11).a(canvas, this.V, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-kvVar.S, 0.0f, g0.L(12.0f) + r2, this.g0);
        mVar.m(canvas, rectF, 0, 1.0f);
        rectF.set(r5 - g0.L(12.0f), 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.g0);
        mVar.m(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.h0;
        fx0 fx0Var = null;
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked == 1 || actionMasked == 3) {
                    boolean z9 = this.p0;
                    this.p0 = false;
                    if (z9) {
                        a0(false);
                        if (actionMasked == 1 && (velocityTracker = this.x0) != null && this.y0 != null && this.V != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.x0.computeCurrentVelocity(1000, this.w0);
                            float f10 = -this.x0.getXVelocity();
                            if (Math.abs(f10) > this.v0) {
                                this.y0.fling(this.i0, 0, (int) f10, 0, 0, this.h0, 0, 0);
                                this.V.postOnAnimation(this.z0);
                            }
                        }
                    }
                    if (!z9 && this.t0 && this.q0 != null) {
                        motionEvent.offsetLocation(-this.r0, -this.s0);
                        this.q0.t(motionEvent);
                        motionEvent.offsetLocation(this.r0, this.s0);
                    }
                    boolean z10 = this.t0;
                    this.t0 = false;
                    this.q0 = null;
                    VelocityTracker velocityTracker2 = this.x0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.x0 = null;
                    }
                    if (z9 || z10) {
                    }
                }
            }
            VelocityTracker velocityTracker3 = this.x0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.n0;
            if (!this.p0 && i7 > 0 && Math.abs(x10) > this.u0) {
                this.p0 = true;
                a0(true);
                if (this.t0 && this.q0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.r0, -this.s0);
                    this.q0.t(obtain);
                    obtain.recycle();
                    this.t0 = false;
                }
            }
            if (!this.p0) {
                return this.t0;
            }
            int i10 = (int) (this.o0 - x10);
            int i11 = i10 >= 0 ? i10 : 0;
            if (i11 <= i7) {
                i7 = i11;
            }
            if (i7 != this.i0) {
                this.i0 = i7;
                Z(this.S, this.T, this.U);
                View view2 = this.V;
                if (view2 != null) {
                    view2.invalidate();
                    return true;
                }
            }
        }
        if (this.u0 == 0 && (view = this.V) != null) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
            this.u0 = viewConfiguration.getScaledTouchSlop();
            this.v0 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.w0 = viewConfiguration.getScaledMaximumFlingVelocity();
        }
        if (this.y0 == null && this.V != null) {
            this.y0 = new OverScroller(this.V.getContext());
        }
        OverScroller overScroller = this.y0;
        if (overScroller != null && !overScroller.isFinished()) {
            this.y0.forceFinished(true);
        }
        this.n0 = motionEvent.getX();
        motionEvent.getY();
        this.o0 = this.i0;
        this.p0 = false;
        VelocityTracker velocityTracker4 = this.x0;
        if (velocityTracker4 == null) {
            this.x0 = VelocityTracker.obtain();
        } else {
            velocityTracker4.clear();
        }
        this.x0.addMovement(motionEvent);
        this.q0 = null;
        this.t0 = false;
        int i12 = this.b0;
        jv jvVar = this.a0;
        if (jvVar != null && motionEvent.getY() < i12) {
            float j02 = j0();
            motionEvent.offsetLocation(-j02, 0.0f);
            boolean t6 = jvVar.t(motionEvent);
            motionEvent.offsetLocation(j02, 0.0f);
            if (t6) {
                this.q0 = jvVar;
                this.r0 = j02;
                this.s0 = 0.0f;
                this.t0 = true;
            }
        }
        if (!this.t0) {
            float x11 = motionEvent.getX();
            float f11 = x11 + this.i0;
            float y10 = motionEvent.getY() - i12;
            mx0 mx0Var = this.X;
            int childCount = mx0Var.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                fx0 d = mx0Var.d(i13);
                if (d.b instanceof jv) {
                    if (f11 >= d.p && f11 < r13 + d.k) {
                        if (y10 >= d.q && y10 < r13 + d.l) {
                            fx0Var = d;
                            break;
                        }
                    }
                }
                i13++;
            }
            if (fx0Var != null) {
                this.q0 = (jv) fx0Var.b;
                this.r0 = fx0Var.b() - this.i0;
                this.s0 = fx0Var.c() + i12;
                this.q0.R.set(fx0Var.p - fx0Var.b(), fx0Var.q - fx0Var.c(), (fx0Var.p + fx0Var.k) - fx0Var.b(), (fx0Var.q + fx0Var.l) - fx0Var.c());
                motionEvent.offsetLocation(-this.r0, -this.s0);
                this.t0 = this.q0.t(motionEvent);
                motionEvent.offsetLocation(this.r0, this.s0);
            }
        }
        return this.t0 || i7 > 0;
    }

    @Override // org.telegram.messenger.fu
    public final void Z(int i7, int i10, int i11) {
        this.S = i7;
        this.T = i10;
        this.U = i11;
        jv jvVar = this.a0;
        if (jvVar != null) {
            jvVar.c = (j0() + i7) - jvVar.n();
            jvVar.d = i10;
            jvVar.e = i11;
        }
        mx0 mx0Var = this.X;
        int childCount = mx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            fx0 d = mx0Var.d(i12);
            ex0 ex0Var = d.b;
            if (ex0Var instanceof jv) {
                jv jvVar2 = (jv) ex0Var;
                jvVar2.c = ((d.b() + i7) - this.i0) - jvVar2.n();
                jvVar2.d = d.c() + this.b0 + i10;
                jvVar2.e = i11;
            }
        }
    }

    @Override // org.telegram.ui.Components.lx0
    public final ex0 c(TL_iv.pageTableCell pagetablecell, int i7) {
        if (pagetablecell == null) {
            return null;
        }
        int R = kv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        kv kvVar = this.a;
        jv jvVar = new jv(kvVar, kvVar.l(richText, R), i7, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
        jvVar.r = true;
        return jvVar;
    }

    @Override // org.telegram.ui.Components.lx0
    public final Paint getHeaderPaint() {
        i0();
        return this.l0;
    }

    @Override // org.telegram.ui.Components.lx0
    public final Paint getLinePaint() {
        i0();
        return this.j0;
    }

    @Override // org.telegram.ui.Components.lx0
    public final Paint getStripPaint() {
        i0();
        return this.m0;
    }

    public final void i0() {
        if (this.j0 == null) {
            Paint paint = new Paint(1);
            this.j0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.j0.setStrokeWidth(g0.N(0.66f));
            Paint paint2 = new Paint();
            this.k0 = paint2;
            paint2.setStyle(style);
            this.k0.setStrokeWidth(g0.N(0.66f));
            this.l0 = new Paint();
            this.m0 = new Paint();
        }
        kv kvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.il : org.telegram.ui.ActionBar.k6.hl, kvVar.D);
        this.j0.setColor(w02);
        this.k0.setColor(w02);
        this.l0.setColor(org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.gl : org.telegram.ui.ActionBar.k6.fl, kvVar.D));
        this.m0.setColor(167772160);
    }

    public final int j0() {
        jv jvVar = this.a0;
        if (jvVar == null) {
            return 0;
        }
        int i7 = this.f0;
        int i10 = jvVar.h;
        return Math.round(((i7 - (i10 - r0)) / 2.0f) - jvVar.f);
    }

    @Override // org.telegram.messenger.fu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        fu.l(spannableStringBuilder, this.a0, null);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Y;
            if (i7 >= arrayList.size()) {
                return;
            }
            jv jvVar = (jv) arrayList.get(i7);
            if (jvVar != null && (staticLayout = jvVar.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    spannableStringBuilder.append(", ");
                }
                spannableStringBuilder.append(staticLayout.getText());
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.fu
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.c0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override // org.telegram.messenger.fu
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        boolean z9;
        boolean z10;
        jv jvVar;
        org.telegram.ui.Components.n5 n5Var;
        mx0 mx0Var;
        int i7;
        int i10;
        h6.m mVar;
        int i11;
        org.telegram.ui.Components.n5 n5Var2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        jv jvVar2 = this.a0;
        if (jvVar2 == null || (n5Var2 = jvVar2.E) == null || n5Var2.a.isEmpty()) {
            z9 = false;
        } else {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, jvVar2.b, jvVar2.E, 0.0f, jvVar2.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z9 = true;
        }
        canvas.translate(0.0f, this.b0);
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                z10 = z9;
                break;
            }
            org.telegram.ui.Components.n5 n5Var3 = ((jv) arrayList.get(i12)).E;
            if (n5Var3 == null || n5Var3.a.isEmpty()) {
                i12++;
            } else {
                kv kvVar = this.a;
                int i13 = kvVar.S;
                h6.m mVar2 = kvVar.z;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i13, 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.g0, qs.e4, 31);
                canvas.save();
                canvas.translate(-this.i0, 0.0f);
                mx0 mx0Var2 = this.X;
                int childCount = mx0Var2.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    ex0 ex0Var = mx0Var2.d(i14).b;
                    if (!(ex0Var instanceof jv) || (n5Var = (jvVar = (jv) ex0Var).E) == null || n5Var.a.isEmpty()) {
                        i11 = saveLayerAlpha;
                        mx0Var = mx0Var2;
                        i7 = childCount;
                        i10 = i14;
                        mVar = mVar2;
                    } else {
                        canvas.save();
                        canvas.translate(r6.b(), r6.c());
                        mx0Var = mx0Var2;
                        i7 = childCount;
                        i10 = i14;
                        mVar = mVar2;
                        i11 = saveLayerAlpha;
                        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, jvVar.b, jvVar.E, 0.0f, jvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                        canvas.restore();
                    }
                    i14 = i10 + 1;
                    mVar2 = mVar;
                    mx0Var2 = mx0Var;
                    childCount = i7;
                    saveLayerAlpha = i11;
                }
                int i15 = saveLayerAlpha;
                h6.m mVar3 = mVar2;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-kvVar.S, 0.0f, g0.L(12.0f) + r3, this.g0);
                mVar3.m(canvas, rectF, 0, 1.0f);
                rectF.set(r4 - g0.L(12.0f), 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.g0);
                mVar3.m(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i15);
                z10 = true;
            }
        }
        canvas.restore();
        return z10;
    }

    @Override // org.telegram.messenger.fu
    public final void t(Canvas canvas) {
        xu xuVar;
        float f10;
        int i7;
        mx0 mx0Var;
        int i10;
        int i11;
        tg0 tg0Var = this.K;
        if (tg0Var != null && tg0Var.h) {
            ArrayList arrayList = this.c0;
            if (!arrayList.isEmpty() && tg0Var.d((rg0) arrayList.get(0)) >= 0) {
                float c10 = tg0Var.c((rg0) arrayList.get(0));
                float f11 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.b;
                canvas.translate(rect.left, rect.top);
                jv jvVar = this.a0;
                if (jvVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    jvVar.d(canvas, jvVar.S);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.b0);
                kv kvVar = this.a;
                int i12 = kvVar.S;
                h6.m mVar = kvVar.z;
                float f12 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i12, 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.g0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.i0, 0.0f);
                mx0 mx0Var2 = this.X;
                int childCount = mx0Var2.getChildCount();
                int i13 = 0;
                int i14 = 0;
                while (i13 < childCount) {
                    float f13 = f12;
                    fx0 d = mx0Var2.d(i13);
                    if (i14 >= arrayList.size() || ((xu) arrayList.get(i14)).a != d) {
                        xuVar = null;
                    } else {
                        xuVar = (xu) arrayList.get(i14);
                        i14++;
                    }
                    int i15 = i14;
                    if (xuVar == null) {
                        d.a(canvas, this.V, true);
                    } else if (tg0Var.i(xuVar)) {
                        if (tg0Var.g(xuVar)) {
                            d.a(canvas, this.V, false);
                            if (d.b instanceof jv) {
                                canvas.save();
                                f10 = f11;
                                canvas.translate(d.b(), d.c());
                                ((jv) d.b).m(canvas, tg0Var.g(xuVar) ? tg0Var.e : -1, tg0Var.g(xuVar) ? tg0Var.f : f10);
                                canvas.restore();
                            } else {
                                f10 = f11;
                            }
                        } else {
                            f10 = f11;
                            float c11 = tg0Var.c(xuVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.V, true);
                            } else {
                                if (c11 <= f10 || d.b == null) {
                                    i7 = saveLayerAlpha;
                                    mx0Var = mx0Var2;
                                    i10 = childCount;
                                    i11 = i13;
                                    d.a(canvas, this.V, false);
                                } else {
                                    d.a(canvas, this.V, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    mx0Var = mx0Var2;
                                    i11 = i13;
                                    i7 = saveLayerAlpha;
                                    i10 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.k, d.l, (int) (c11 * f13), 31);
                                    d.b.d(canvas, this.V);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                }
                                i13 = i11 + 1;
                                saveLayerAlpha = i7;
                                f12 = f13;
                                i14 = i15;
                                f11 = f10;
                                childCount = i10;
                                mx0Var2 = mx0Var;
                            }
                        }
                        i7 = saveLayerAlpha;
                        mx0Var = mx0Var2;
                        i10 = childCount;
                        i11 = i13;
                        i13 = i11 + 1;
                        saveLayerAlpha = i7;
                        f12 = f13;
                        i14 = i15;
                        f11 = f10;
                        childCount = i10;
                        mx0Var2 = mx0Var;
                    } else {
                        d.a(canvas, this.V, false);
                    }
                    mx0Var = mx0Var2;
                    i10 = childCount;
                    i11 = i13;
                    f10 = f11;
                    i7 = saveLayerAlpha;
                    i13 = i11 + 1;
                    saveLayerAlpha = i7;
                    f12 = f13;
                    i14 = i15;
                    f11 = f10;
                    childCount = i10;
                    mx0Var2 = mx0Var;
                }
                float f14 = f11;
                int i16 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-kvVar.S, f14, g0.L(12.0f) + r3, this.g0);
                mVar.m(canvas, rectF, 0, 1.0f);
                rectF.set(r3 - g0.L(12.0f), 0.0f, ((kvVar.C + kvVar.T) - rect.left) - rect.right, this.g0);
                mVar.m(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i16);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override // org.telegram.messenger.fu
    public final boolean u(CharacterStyle characterStyle, int i7, wt wtVar) {
        Rect rect = this.b;
        jv jvVar = this.a0;
        if (jvVar != null && jvVar.o(characterStyle, wtVar)) {
            wtVar.e = (j0() + rect.left) - jvVar.n();
            wtVar.f = i7 + rect.top;
            return true;
        }
        mx0 mx0Var = this.X;
        int childCount = mx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ex0 ex0Var = mx0Var.d(i10).b;
            if (ex0Var instanceof jv) {
                if (((jv) ex0Var).o(characterStyle, wtVar)) {
                    wtVar.e = ((r6.b() + rect.left) - this.i0) - r7.n();
                    wtVar.f = r6.c() + i7 + rect.top + this.b0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.lx0
    public final /* synthetic */ void g(ex0 ex0Var, int i7) {
    }
}
