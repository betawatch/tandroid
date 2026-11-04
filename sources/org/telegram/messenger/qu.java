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
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.lg0;
import org.telegram.ui.ng0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class qu extends xt implements kx0 {
    public final mi.b0 A0;
    public final TL_iv.pageBlockTable X;
    public final lx0 Y;
    public final ArrayList Z;
    public final org.telegram.ui.Cells.s9[] a0;
    public final bv b0;
    public final int c0;
    public final ArrayList d0;
    public final int e0;
    public final int f0;
    public int g0;
    public int h0;
    public final int i0;
    public int j0;
    public Paint k0;
    public Paint l0;
    public Paint m0;
    public Paint n0;
    public float o0;
    public int p0;
    public boolean q0;
    public bv r0;
    public float s0;
    public float t0;
    public boolean u0;
    public int v0;
    public int w0;
    public int x0;
    public VelocityTracker y0;
    public OverScroller z0;

    public qu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockTable pageblocktable) {
        super(cvVar, rect, i3);
        int i10;
        this.Z = new ArrayList();
        this.d0 = new ArrayList();
        this.A0 = new mi.b0(this, 11);
        Rect rect2 = this.b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.e0 = this.c;
        lx0 lx0Var = new lx0(t0.b, this, null);
        this.Y = lx0Var;
        lx0Var.setOrientation(0);
        lx0Var.setRowOrderPreserved(true);
        lx0Var.setDrawLines(pageblocktable.bordered);
        lx0Var.setStriped(pageblocktable.striped);
        lx0Var.setRtl(cvVar.I());
        lx0Var.setFillWidth(false);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (lx0Var.w != L || lx0Var.r != L2 || lx0Var.s != L3) {
                lx0Var.w = L;
                lx0Var.r = L2;
                lx0Var.s = L3;
                lx0Var.requestLayout();
            }
        }
        lx0Var.setMinimumCellHeight(g0.L(pageblocktable.compact ? 18.0f : 36.0f));
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
                    this.Y.b(pagetablecell, i14, i13, i16);
                } else {
                    this.Y.a(i14, i13, i16, i17);
                }
                i14 += i16;
            }
        }
        this.Y.setColumnCount(i10);
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.Y.getMeasuredWidth();
        this.h0 = this.Y.getMeasuredHeight();
        this.i0 = Math.max(0, measuredWidth - this.e0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || TextUtils.isEmpty(cv.x(richText))) {
            this.b0 = null;
            this.c0 = 0;
        } else {
            bv bvVar = new bv(cvVar, cvVar.l(pageblocktable.title, cv.R(0, 15)), this.e0);
            this.b0 = bvVar;
            bvVar.r = true;
            this.c0 = g0.L(9.0f) + bvVar.b.getHeight();
        }
        bv bvVar2 = this.b0;
        int max = Math.max(0, Math.min(this.e0, Math.max(measuredWidth, bvVar2 != null ? bvVar2.r() : 0)));
        this.f0 = max;
        this.g0 = max;
        for (int i18 = 0; i18 < this.Y.getChildCount(); i18++) {
            ex0 d = this.Y.d(i18);
            dx0 dx0Var = d.b;
            if (dx0Var instanceof bv) {
                this.Z.add((bv) dx0Var);
                this.d0.add(new pu(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        bv bvVar3 = this.b0;
        if (bvVar3 != null) {
            arrayList.add(bvVar3);
        }
        arrayList.addAll(this.Z);
        this.a0 = (org.telegram.ui.Cells.s9[]) arrayList.toArray(new org.telegram.ui.Cells.s9[0]);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return g0.L(10.0f) + rect.top + this.c0 + this.h0 + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.f0 + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final org.telegram.ui.Cells.s9[] L() {
        return this.a0;
    }

    @Override // org.telegram.messenger.xt
    public final boolean Q() {
        if (this.q0) {
            return true;
        }
        OverScroller overScroller = this.z0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        bv bvVar = this.b0;
        if (bvVar != null) {
            bvVar.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((bv) obj).i(this.W);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        bv bvVar = this.b0;
        if (bvVar != null) {
            bvVar.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((bv) obj).f(this.W);
        }
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        bv bvVar = this.b0;
        if (bvVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            bvVar.d(canvas, bvVar.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.c0);
        cv cvVar = this.a;
        int i3 = cvVar.S;
        k4.j jVar = cvVar.z;
        float f10 = -i3;
        int i10 = cvVar.C + cvVar.T;
        Rect rect = this.b;
        canvas.saveLayerAlpha(f10, 0.0f, (i10 - rect.left) - rect.right, this.h0, hs.e4, 31);
        canvas.save();
        canvas.translate(-this.j0, 0.0f);
        lx0 lx0Var = this.Y;
        int childCount = lx0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            lx0Var.d(i11).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-cvVar.S, 0.0f, g0.L(12.0f) + r2, this.h0);
        jVar.w(canvas, rectF, 0, 1.0f);
        rectF.set(r5 - g0.L(12.0f), 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.h0);
        jVar.w(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.i0;
        ex0 ex0Var = null;
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked == 1 || actionMasked == 3) {
                    boolean z10 = this.q0;
                    this.q0 = false;
                    if (z10) {
                        a0(false);
                        if (actionMasked == 1 && (velocityTracker = this.y0) != null && this.z0 != null && this.W != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.y0.computeCurrentVelocity(1000, this.x0);
                            float f10 = -this.y0.getXVelocity();
                            if (Math.abs(f10) > this.w0) {
                                this.z0.fling(this.j0, 0, (int) f10, 0, 0, this.i0, 0, 0);
                                this.W.postOnAnimation(this.A0);
                            }
                        }
                    }
                    if (!z10 && this.u0 && this.r0 != null) {
                        motionEvent.offsetLocation(-this.s0, -this.t0);
                        this.r0.t(motionEvent);
                        motionEvent.offsetLocation(this.s0, this.t0);
                    }
                    boolean z11 = this.u0;
                    this.u0 = false;
                    this.r0 = null;
                    VelocityTracker velocityTracker2 = this.y0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.y0 = null;
                    }
                    if (z10 || z11) {
                    }
                }
            }
            VelocityTracker velocityTracker3 = this.y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.o0;
            if (!this.q0 && i3 > 0 && Math.abs(x10) > this.v0) {
                this.q0 = true;
                a0(true);
                if (this.u0 && this.r0 != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    obtain.offsetLocation(-this.s0, -this.t0);
                    this.r0.t(obtain);
                    obtain.recycle();
                    this.u0 = false;
                }
            }
            if (!this.q0) {
                return this.u0;
            }
            int i10 = (int) (this.p0 - x10);
            int i11 = i10 >= 0 ? i10 : 0;
            if (i11 <= i3) {
                i3 = i11;
            }
            if (i3 != this.j0) {
                this.j0 = i3;
                Z(this.T, this.U, this.V);
                View view2 = this.W;
                if (view2 != null) {
                    view2.invalidate();
                    return true;
                }
            }
        }
        if (this.v0 == 0 && (view = this.W) != null) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
            this.v0 = viewConfiguration.getScaledTouchSlop();
            this.w0 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.x0 = viewConfiguration.getScaledMaximumFlingVelocity();
        }
        if (this.z0 == null && this.W != null) {
            this.z0 = new OverScroller(this.W.getContext());
        }
        OverScroller overScroller = this.z0;
        if (overScroller != null && !overScroller.isFinished()) {
            this.z0.forceFinished(true);
        }
        this.o0 = motionEvent.getX();
        motionEvent.getY();
        this.p0 = this.j0;
        this.q0 = false;
        VelocityTracker velocityTracker4 = this.y0;
        if (velocityTracker4 == null) {
            this.y0 = VelocityTracker.obtain();
        } else {
            velocityTracker4.clear();
        }
        this.y0.addMovement(motionEvent);
        this.r0 = null;
        this.u0 = false;
        int i12 = this.c0;
        bv bvVar = this.b0;
        if (bvVar != null && motionEvent.getY() < i12) {
            float j02 = j0();
            motionEvent.offsetLocation(-j02, 0.0f);
            boolean t10 = bvVar.t(motionEvent);
            motionEvent.offsetLocation(j02, 0.0f);
            if (t10) {
                this.r0 = bvVar;
                this.s0 = j02;
                this.t0 = 0.0f;
                this.u0 = true;
            }
        }
        if (!this.u0) {
            float x11 = motionEvent.getX();
            float f11 = x11 + this.j0;
            float y9 = motionEvent.getY() - i12;
            lx0 lx0Var = this.Y;
            int childCount = lx0Var.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                ex0 d = lx0Var.d(i13);
                if (d.b instanceof bv) {
                    if (f11 >= d.p && f11 < r13 + d.k) {
                        if (y9 >= d.q && y9 < r13 + d.l) {
                            ex0Var = d;
                            break;
                        }
                    }
                }
                i13++;
            }
            if (ex0Var != null) {
                this.r0 = (bv) ex0Var.b;
                this.s0 = ex0Var.b() - this.j0;
                this.t0 = ex0Var.c() + i12;
                this.r0.S.set(ex0Var.p - ex0Var.b(), ex0Var.q - ex0Var.c(), (ex0Var.p + ex0Var.k) - ex0Var.b(), (ex0Var.q + ex0Var.l) - ex0Var.c());
                motionEvent.offsetLocation(-this.s0, -this.t0);
                this.u0 = this.r0.t(motionEvent);
                motionEvent.offsetLocation(this.s0, this.t0);
            }
        }
        return this.u0 || i3 > 0;
    }

    @Override // org.telegram.messenger.xt
    public final void Z(int i3, int i10, int i11) {
        this.T = i3;
        this.U = i10;
        this.V = i11;
        bv bvVar = this.b0;
        if (bvVar != null) {
            bvVar.c = (j0() + i3) - bvVar.n();
            bvVar.d = i10;
            bvVar.e = i11;
        }
        lx0 lx0Var = this.Y;
        int childCount = lx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ex0 d = lx0Var.d(i12);
            dx0 dx0Var = d.b;
            if (dx0Var instanceof bv) {
                bv bvVar2 = (bv) dx0Var;
                bvVar2.c = ((d.b() + i3) - this.j0) - bvVar2.n();
                bvVar2.d = d.c() + this.c0 + i10;
                bvVar2.e = i11;
            }
        }
    }

    @Override // org.telegram.ui.Components.kx0
    public final dx0 c(TL_iv.pageTableCell pagetablecell, int i3) {
        if (pagetablecell == null) {
            return null;
        }
        int R = cv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        cv cvVar = this.a;
        bv bvVar = new bv(cvVar, cvVar.l(richText, R), i3, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
        bvVar.r = true;
        return bvVar;
    }

    @Override // org.telegram.ui.Components.kx0
    public final Paint getHeaderPaint() {
        i0();
        return this.m0;
    }

    @Override // org.telegram.ui.Components.kx0
    public final Paint getLinePaint() {
        i0();
        return this.k0;
    }

    @Override // org.telegram.ui.Components.kx0
    public final Paint getStripPaint() {
        i0();
        return this.n0;
    }

    public final void i0() {
        if (this.k0 == null) {
            Paint paint = new Paint(1);
            this.k0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.k0.setStrokeWidth(g0.N(0.66f));
            Paint paint2 = new Paint();
            this.l0 = paint2;
            paint2.setStyle(style);
            this.l0.setStrokeWidth(g0.N(0.66f));
            this.m0 = new Paint();
            this.n0 = new Paint();
        }
        cv cvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.il : org.telegram.ui.ActionBar.k6.hl, cvVar.D);
        this.k0.setColor(w02);
        this.l0.setColor(w02);
        this.m0.setColor(org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.gl : org.telegram.ui.ActionBar.k6.fl, cvVar.D));
        this.n0.setColor(167772160);
    }

    public final int j0() {
        bv bvVar = this.b0;
        if (bvVar == null) {
            return 0;
        }
        int i3 = this.g0;
        int i10 = bvVar.h;
        return Math.round(((i3 - (i10 - r0)) / 2.0f) - bvVar.f);
    }

    @Override // org.telegram.messenger.xt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        xt.l(spannableStringBuilder, this.b0, null);
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i3 >= arrayList.size()) {
                return;
            }
            bv bvVar = (bv) arrayList.get(i3);
            if (bvVar != null && (staticLayout = bvVar.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    spannableStringBuilder.append(", ");
                }
                spannableStringBuilder.append(staticLayout.getText());
            }
            i3++;
        }
    }

    @Override // org.telegram.messenger.xt
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.d0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override // org.telegram.messenger.xt
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        boolean z10;
        boolean z11;
        bv bvVar;
        org.telegram.ui.Components.l5 l5Var;
        lx0 lx0Var;
        int i3;
        int i10;
        k4.j jVar;
        int i11;
        org.telegram.ui.Components.l5 l5Var2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        bv bvVar2 = this.b0;
        if (bvVar2 == null || (l5Var2 = bvVar2.F) == null || l5Var2.a.isEmpty()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar2.b, bvVar2.F, 0.0f, bvVar2.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        }
        canvas.translate(0.0f, this.c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                z11 = z10;
                break;
            }
            org.telegram.ui.Components.l5 l5Var3 = ((bv) arrayList.get(i12)).F;
            if (l5Var3 == null || l5Var3.a.isEmpty()) {
                i12++;
            } else {
                cv cvVar = this.a;
                int i13 = cvVar.S;
                k4.j jVar2 = cvVar.z;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i13, 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.h0, hs.e4, 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                lx0 lx0Var2 = this.Y;
                int childCount = lx0Var2.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    dx0 dx0Var = lx0Var2.d(i14).b;
                    if (!(dx0Var instanceof bv) || (l5Var = (bvVar = (bv) dx0Var).F) == null || l5Var.a.isEmpty()) {
                        i11 = saveLayerAlpha;
                        lx0Var = lx0Var2;
                        i3 = childCount;
                        i10 = i14;
                        jVar = jVar2;
                    } else {
                        canvas.save();
                        canvas.translate(r6.b(), r6.c());
                        lx0Var = lx0Var2;
                        i3 = childCount;
                        i10 = i14;
                        jVar = jVar2;
                        i11 = saveLayerAlpha;
                        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, bvVar.b, bvVar.F, 0.0f, bvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                        canvas.restore();
                    }
                    i14 = i10 + 1;
                    jVar2 = jVar;
                    lx0Var2 = lx0Var;
                    childCount = i3;
                    saveLayerAlpha = i11;
                }
                int i15 = saveLayerAlpha;
                k4.j jVar3 = jVar2;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-cvVar.S, 0.0f, g0.L(12.0f) + r3, this.h0);
                jVar3.w(canvas, rectF, 0, 1.0f);
                rectF.set(r4 - g0.L(12.0f), 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.h0);
                jVar3.w(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i15);
                z11 = true;
            }
        }
        canvas.restore();
        return z11;
    }

    @Override // org.telegram.messenger.xt
    public final void t(Canvas canvas) {
        pu puVar;
        float f10;
        int i3;
        lx0 lx0Var;
        int i10;
        int i11;
        ng0 ng0Var = this.L;
        if (ng0Var != null && ng0Var.h) {
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty() && ng0Var.d((lg0) arrayList.get(0)) >= 0) {
                float c2 = ng0Var.c((lg0) arrayList.get(0));
                float f11 = 0.0f;
                if (c2 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.b;
                canvas.translate(rect.left, rect.top);
                bv bvVar = this.b0;
                if (bvVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    bvVar.d(canvas, bvVar.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.c0);
                cv cvVar = this.a;
                int i12 = cvVar.S;
                k4.j jVar = cvVar.z;
                float f12 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i12, 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.h0, (int) (c2 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                lx0 lx0Var2 = this.Y;
                int childCount = lx0Var2.getChildCount();
                int i13 = 0;
                int i14 = 0;
                while (i13 < childCount) {
                    float f13 = f12;
                    ex0 d = lx0Var2.d(i13);
                    if (i14 >= arrayList.size() || ((pu) arrayList.get(i14)).a != d) {
                        puVar = null;
                    } else {
                        puVar = (pu) arrayList.get(i14);
                        i14++;
                    }
                    int i15 = i14;
                    if (puVar == null) {
                        d.a(canvas, this.W, true);
                    } else if (ng0Var.i(puVar)) {
                        if (ng0Var.g(puVar)) {
                            d.a(canvas, this.W, false);
                            if (d.b instanceof bv) {
                                canvas.save();
                                f10 = f11;
                                canvas.translate(d.b(), d.c());
                                ((bv) d.b).m(canvas, ng0Var.g(puVar) ? ng0Var.e : -1, ng0Var.g(puVar) ? ng0Var.f : f10);
                                canvas.restore();
                            } else {
                                f10 = f11;
                            }
                        } else {
                            f10 = f11;
                            float c10 = ng0Var.c(puVar);
                            if (c10 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c10 <= f10 || d.b == null) {
                                    i3 = saveLayerAlpha;
                                    lx0Var = lx0Var2;
                                    i10 = childCount;
                                    i11 = i13;
                                    d.a(canvas, this.W, false);
                                } else {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    lx0Var = lx0Var2;
                                    i11 = i13;
                                    i3 = saveLayerAlpha;
                                    i10 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.k, d.l, (int) (c10 * f13), 31);
                                    d.b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                }
                                i13 = i11 + 1;
                                saveLayerAlpha = i3;
                                f12 = f13;
                                i14 = i15;
                                f11 = f10;
                                childCount = i10;
                                lx0Var2 = lx0Var;
                            }
                        }
                        i3 = saveLayerAlpha;
                        lx0Var = lx0Var2;
                        i10 = childCount;
                        i11 = i13;
                        i13 = i11 + 1;
                        saveLayerAlpha = i3;
                        f12 = f13;
                        i14 = i15;
                        f11 = f10;
                        childCount = i10;
                        lx0Var2 = lx0Var;
                    } else {
                        d.a(canvas, this.W, false);
                    }
                    lx0Var = lx0Var2;
                    i10 = childCount;
                    i11 = i13;
                    f10 = f11;
                    i3 = saveLayerAlpha;
                    i13 = i11 + 1;
                    saveLayerAlpha = i3;
                    f12 = f13;
                    i14 = i15;
                    f11 = f10;
                    childCount = i10;
                    lx0Var2 = lx0Var;
                }
                float f14 = f11;
                int i16 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-cvVar.S, f14, g0.L(12.0f) + r3, this.h0);
                jVar.w(canvas, rectF, 0, 1.0f);
                rectF.set(r3 - g0.L(12.0f), 0.0f, ((cvVar.C + cvVar.T) - rect.left) - rect.right, this.h0);
                jVar.w(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i16);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override // org.telegram.messenger.xt
    public final boolean u(CharacterStyle characterStyle, int i3, ot otVar) {
        Rect rect = this.b;
        bv bvVar = this.b0;
        if (bvVar != null && bvVar.o(characterStyle, otVar)) {
            otVar.e = (j0() + rect.left) - bvVar.n();
            otVar.f = i3 + rect.top;
            return true;
        }
        lx0 lx0Var = this.Y;
        int childCount = lx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            dx0 dx0Var = lx0Var.d(i10).b;
            if (dx0Var instanceof bv) {
                if (((bv) dx0Var).o(characterStyle, otVar)) {
                    otVar.e = ((r6.b() + rect.left) - this.j0) - r7.n();
                    otVar.f = r6.c() + i3 + rect.top + this.c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kx0
    public final /* synthetic */ void g(dx0 dx0Var, int i3) {
    }
}
