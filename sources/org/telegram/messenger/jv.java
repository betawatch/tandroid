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
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.xh0;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class jv extends qu implements oy0 {
    public final TL_iv.pageBlockTable W;
    public final py0 X;
    public final ArrayList Y;
    public final org.telegram.ui.Cells.u9[] Z;
    public final uv a0;
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
    public uv q0;
    public float r0;
    public float s0;
    public boolean t0;
    public int u0;
    public int v0;
    public int w0;
    public VelocityTracker x0;
    public OverScroller y0;
    public final mg.c2 z0;

    public jv(vv vvVar, Rect rect, int i10, TL_iv.pageBlockTable pageblocktable) {
        super(vvVar, rect, i10);
        int i11;
        this.Y = new ArrayList();
        this.c0 = new ArrayList();
        this.z0 = new mg.c2(this, 10);
        Rect rect2 = this.b;
        rect2.top = i0.L(10.0f) + rect2.top;
        this.W = pageblocktable;
        this.d0 = this.c;
        py0 py0Var = new py0(w0.b, this, null);
        this.X = py0Var;
        py0Var.setOrientation(0);
        py0Var.setRowOrderPreserved(true);
        py0Var.setDrawLines(pageblocktable.bordered);
        py0Var.setStriped(pageblocktable.striped);
        py0Var.setRtl(vvVar.I());
        py0Var.setFillWidth(false);
        if (pageblocktable.compact) {
            int L = i0.L(5.0f);
            int L2 = i0.L(5.0f);
            int L3 = i0.L(5.0f);
            if (py0Var.w != L || py0Var.r != L2 || py0Var.s != L3) {
                py0Var.w = L;
                py0Var.r = L2;
                py0Var.s = L3;
                py0Var.requestLayout();
            }
        }
        py0Var.setMinimumCellHeight(i0.L(pageblocktable.compact ? 18.0f : 36.0f));
        if (pageblocktable.rows.isEmpty()) {
            i11 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
            i11 = 0;
            for (int i12 = 0; i12 < pagetablerow.cells.size(); i12++) {
                int i13 = pagetablerow.cells.get(i12).colspan;
                if (i13 == 0) {
                    i13 = 1;
                }
                i11 += i13;
            }
        }
        for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i14);
            int i15 = 0;
            for (int i16 = 0; i16 < pagetablerow2.cells.size(); i16++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i16);
                int i17 = pagetablecell.colspan;
                i17 = i17 == 0 ? 1 : i17;
                int i18 = pagetablecell.rowspan;
                i18 = i18 == 0 ? 1 : i18;
                if (pagetablecell.text != null) {
                    this.X.b(pagetablecell, i15, i14, i17);
                } else {
                    this.X.a(i15, i14, i17, i18);
                }
                i15 += i17;
            }
        }
        this.X.setColumnCount(i11);
        this.X.measure(View.MeasureSpec.makeMeasureSpec(this.c, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.X.getMeasuredWidth();
        this.g0 = this.X.getMeasuredHeight();
        this.h0 = Math.max(0, measuredWidth - this.d0);
        TL_iv.RichText richText = pageblocktable.title;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || TextUtils.isEmpty(vv.x(richText))) {
            this.a0 = null;
            this.b0 = 0;
        } else {
            uv uvVar = new uv(vvVar, vvVar.l(pageblocktable.title, vv.R(0, 15)), this.d0);
            this.a0 = uvVar;
            uvVar.r = true;
            this.b0 = i0.L(9.0f) + uvVar.b.getHeight();
        }
        uv uvVar2 = this.a0;
        int max = Math.max(0, Math.min(this.d0, Math.max(measuredWidth, uvVar2 != null ? uvVar2.r() : 0)));
        this.e0 = max;
        this.f0 = max;
        for (int i19 = 0; i19 < this.X.getChildCount(); i19++) {
            iy0 d = this.X.d(i19);
            hy0 hy0Var = d.b;
            if (hy0Var instanceof uv) {
                this.Y.add((uv) hy0Var);
                this.c0.add(new iv(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        uv uvVar3 = this.a0;
        if (uvVar3 != null) {
            arrayList.add(uvVar3);
        }
        arrayList.addAll(this.Y);
        this.Z = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return i0.L(10.0f) + rect.top + this.b0 + this.g0 + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.e0 + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Z;
    }

    @Override // org.telegram.messenger.qu
    public final boolean P() {
        if (this.p0) {
            return true;
        }
        OverScroller overScroller = this.y0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        uv uvVar = this.a0;
        if (uvVar != null) {
            uvVar.i(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uv) obj).i(this.V);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        uv uvVar = this.a0;
        if (uvVar != null) {
            uvVar.f(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((uv) obj).f(this.V);
        }
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        uv uvVar = this.a0;
        if (uvVar != null) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            uvVar.d(canvas, uvVar.S);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.b0);
        vv vvVar = this.a;
        int i10 = vvVar.S;
        li.k kVar = vvVar.z;
        float f7 = -i10;
        int i11 = vvVar.C + vvVar.T;
        Rect rect = this.b;
        canvas.saveLayerAlpha(f7, 0.0f, (i11 - rect.left) - rect.right, this.g0, zs.e4, 31);
        canvas.save();
        canvas.translate(-this.i0, 0.0f);
        py0 py0Var = this.X;
        int childCount = py0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            py0Var.d(i12).a(canvas, this.V, true);
        }
        canvas.restore();
        RectF rectF = i0.P;
        rectF.set(-vvVar.S, 0.0f, i0.L(12.0f) + r2, this.g0);
        kVar.o(canvas, rectF, 0, 1.0f);
        rectF.set(r5 - i0.L(12.0f), 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.g0);
        kVar.o(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.h0;
        iy0 iy0Var = null;
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked == 1 || actionMasked == 3) {
                    boolean z10 = this.p0;
                    this.p0 = false;
                    if (z10) {
                        Z(false);
                        if (actionMasked == 1 && (velocityTracker = this.x0) != null && this.y0 != null && this.V != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.x0.computeCurrentVelocity(1000, this.w0);
                            float f7 = -this.x0.getXVelocity();
                            if (Math.abs(f7) > this.v0) {
                                this.y0.fling(this.i0, 0, (int) f7, 0, 0, this.h0, 0, 0);
                                this.V.postOnAnimation(this.z0);
                            }
                        }
                    }
                    if (!z10 && this.t0 && this.q0 != null) {
                        motionEvent.offsetLocation(-this.r0, -this.s0);
                        this.q0.t(motionEvent);
                        motionEvent.offsetLocation(this.r0, this.s0);
                    }
                    boolean z11 = this.t0;
                    this.t0 = false;
                    this.q0 = null;
                    VelocityTracker velocityTracker2 = this.x0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.x0 = null;
                    }
                    if (z10 || z11) {
                    }
                }
            }
            VelocityTracker velocityTracker3 = this.x0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.n0;
            if (!this.p0 && i10 > 0 && Math.abs(x10) > this.u0) {
                this.p0 = true;
                Z(true);
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
            int i11 = (int) (this.o0 - x10);
            int i12 = i11 >= 0 ? i11 : 0;
            if (i12 <= i10) {
                i10 = i12;
            }
            if (i10 != this.i0) {
                this.i0 = i10;
                Y(this.S, this.T, this.U);
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
        int i13 = this.b0;
        uv uvVar = this.a0;
        if (uvVar != null && motionEvent.getY() < i13) {
            float i02 = i0();
            motionEvent.offsetLocation(-i02, 0.0f);
            boolean t10 = uvVar.t(motionEvent);
            motionEvent.offsetLocation(i02, 0.0f);
            if (t10) {
                this.q0 = uvVar;
                this.r0 = i02;
                this.s0 = 0.0f;
                this.t0 = true;
            }
        }
        if (!this.t0) {
            float x11 = motionEvent.getX();
            float f10 = x11 + this.i0;
            float y3 = motionEvent.getY() - i13;
            py0 py0Var = this.X;
            int childCount = py0Var.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                iy0 d = py0Var.d(i14);
                if (d.b instanceof uv) {
                    if (f10 >= d.p && f10 < r13 + d.k) {
                        if (y3 >= d.q && y3 < r13 + d.l) {
                            iy0Var = d;
                            break;
                        }
                    }
                }
                i14++;
            }
            if (iy0Var != null) {
                this.q0 = (uv) iy0Var.b;
                this.r0 = iy0Var.b() - this.i0;
                this.s0 = iy0Var.c() + i13;
                this.q0.R.set(iy0Var.p - iy0Var.b(), iy0Var.q - iy0Var.c(), (iy0Var.p + iy0Var.k) - iy0Var.b(), (iy0Var.q + iy0Var.l) - iy0Var.c());
                motionEvent.offsetLocation(-this.r0, -this.s0);
                this.t0 = this.q0.t(motionEvent);
                motionEvent.offsetLocation(this.r0, this.s0);
            }
        }
        return this.t0 || i10 > 0;
    }

    @Override // org.telegram.messenger.qu
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        uv uvVar = this.a0;
        if (uvVar != null) {
            uvVar.c = (i0() + i10) - uvVar.n();
            uvVar.d = i11;
            uvVar.e = i12;
        }
        py0 py0Var = this.X;
        int childCount = py0Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            iy0 d = py0Var.d(i13);
            hy0 hy0Var = d.b;
            if (hy0Var instanceof uv) {
                uv uvVar2 = (uv) hy0Var;
                uvVar2.c = ((d.b() + i10) - this.i0) - uvVar2.n();
                uvVar2.d = d.c() + this.b0 + i11;
                uvVar2.e = i12;
            }
        }
    }

    @Override // org.telegram.ui.Components.oy0
    public final hy0 c(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return null;
        }
        int R = vv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        vv vvVar = this.a;
        uv uvVar = new uv(vvVar, vvVar.l(richText, R), i10, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
        uvVar.r = true;
        return uvVar;
    }

    @Override // org.telegram.ui.Components.oy0
    public final Paint getHeaderPaint() {
        h0();
        return this.l0;
    }

    @Override // org.telegram.ui.Components.oy0
    public final Paint getLinePaint() {
        h0();
        return this.j0;
    }

    @Override // org.telegram.ui.Components.oy0
    public final Paint getStripPaint() {
        h0();
        return this.m0;
    }

    public final void h0() {
        if (this.j0 == null) {
            Paint paint = new Paint(1);
            this.j0 = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            this.j0.setStrokeWidth(i0.N(0.66f));
            Paint paint2 = new Paint();
            this.k0 = paint2;
            paint2.setStyle(style);
            this.k0.setStrokeWidth(i0.N(0.66f));
            this.l0 = new Paint();
            this.m0 = new Paint();
        }
        vv vvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.il : org.telegram.ui.ActionBar.t6.hl, vvVar.D);
        this.j0.setColor(w02);
        this.k0.setColor(w02);
        this.l0.setColor(org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.gl : org.telegram.ui.ActionBar.t6.fl, vvVar.D));
        this.m0.setColor(167772160);
    }

    public final int i0() {
        uv uvVar = this.a0;
        if (uvVar == null) {
            return 0;
        }
        int i10 = this.f0;
        int i11 = uvVar.h;
        return Math.round(((i10 - (i11 - r0)) / 2.0f) - uvVar.f);
    }

    @Override // org.telegram.messenger.qu
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        qu.l(spannableStringBuilder, this.a0, null);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y;
            if (i10 >= arrayList.size()) {
                return;
            }
            uv uvVar = (uv) arrayList.get(i10);
            if (uvVar != null && (staticLayout = uvVar.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    spannableStringBuilder.append(", ");
                }
                spannableStringBuilder.append(staticLayout.getText());
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.qu
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.c0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override // org.telegram.messenger.qu
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        boolean z10;
        boolean z11;
        uv uvVar;
        org.telegram.ui.Components.k5 k5Var;
        py0 py0Var;
        int i10;
        int i11;
        li.k kVar;
        int i12;
        org.telegram.ui.Components.k5 k5Var2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        uv uvVar2 = this.a0;
        if (uvVar2 == null || (k5Var2 = uvVar2.E) == null || k5Var2.a.isEmpty()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar2.b, uvVar2.E, 0.0f, uvVar2.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z10 = true;
        }
        canvas.translate(0.0f, this.b0);
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z11 = z10;
                break;
            }
            org.telegram.ui.Components.k5 k5Var3 = ((uv) arrayList.get(i13)).E;
            if (k5Var3 == null || k5Var3.a.isEmpty()) {
                i13++;
            } else {
                vv vvVar = this.a;
                int i14 = vvVar.S;
                li.k kVar2 = vvVar.z;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i14, 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.g0, zs.e4, 31);
                canvas.save();
                canvas.translate(-this.i0, 0.0f);
                py0 py0Var2 = this.X;
                int childCount = py0Var2.getChildCount();
                int i15 = 0;
                while (i15 < childCount) {
                    hy0 hy0Var = py0Var2.d(i15).b;
                    if (!(hy0Var instanceof uv) || (k5Var = (uvVar = (uv) hy0Var).E) == null || k5Var.a.isEmpty()) {
                        i12 = saveLayerAlpha;
                        py0Var = py0Var2;
                        i10 = childCount;
                        i11 = i15;
                        kVar = kVar2;
                    } else {
                        canvas.save();
                        canvas.translate(r6.b(), r6.c());
                        py0Var = py0Var2;
                        i10 = childCount;
                        i11 = i15;
                        kVar = kVar2;
                        i12 = saveLayerAlpha;
                        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar.b, uvVar.E, 0.0f, uvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                        canvas.restore();
                    }
                    i15 = i11 + 1;
                    kVar2 = kVar;
                    py0Var2 = py0Var;
                    childCount = i10;
                    saveLayerAlpha = i12;
                }
                int i16 = saveLayerAlpha;
                li.k kVar3 = kVar2;
                canvas.restore();
                RectF rectF = i0.P;
                rectF.set(-vvVar.S, 0.0f, i0.L(12.0f) + r3, this.g0);
                kVar3.o(canvas, rectF, 0, 1.0f);
                rectF.set(r4 - i0.L(12.0f), 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.g0);
                kVar3.o(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i16);
                z11 = true;
            }
        }
        canvas.restore();
        return z11;
    }

    @Override // org.telegram.messenger.qu
    public final void t(Canvas canvas) {
        iv ivVar;
        float f7;
        int i10;
        py0 py0Var;
        int i11;
        int i12;
        zh0 zh0Var = this.K;
        if (zh0Var != null && zh0Var.h) {
            ArrayList arrayList = this.c0;
            if (!arrayList.isEmpty() && zh0Var.d((xh0) arrayList.get(0)) >= 0) {
                float c10 = zh0Var.c((xh0) arrayList.get(0));
                float f10 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.b;
                canvas.translate(rect.left, rect.top);
                uv uvVar = this.a0;
                if (uvVar != null) {
                    canvas.save();
                    canvas.translate(i0(), 0.0f);
                    uvVar.d(canvas, uvVar.S);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.b0);
                vv vvVar = this.a;
                int i13 = vvVar.S;
                li.k kVar = vvVar.z;
                float f11 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i13, 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.g0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.i0, 0.0f);
                py0 py0Var2 = this.X;
                int childCount = py0Var2.getChildCount();
                int i14 = 0;
                int i15 = 0;
                while (i14 < childCount) {
                    float f12 = f11;
                    iy0 d = py0Var2.d(i14);
                    if (i15 >= arrayList.size() || ((iv) arrayList.get(i15)).a != d) {
                        ivVar = null;
                    } else {
                        ivVar = (iv) arrayList.get(i15);
                        i15++;
                    }
                    int i16 = i15;
                    if (ivVar == null) {
                        d.a(canvas, this.V, true);
                    } else if (zh0Var.i(ivVar)) {
                        if (zh0Var.g(ivVar)) {
                            d.a(canvas, this.V, false);
                            if (d.b instanceof uv) {
                                canvas.save();
                                f7 = f10;
                                canvas.translate(d.b(), d.c());
                                ((uv) d.b).m(canvas, zh0Var.g(ivVar) ? zh0Var.e : -1, zh0Var.g(ivVar) ? zh0Var.f : f7);
                                canvas.restore();
                            } else {
                                f7 = f10;
                            }
                        } else {
                            f7 = f10;
                            float c11 = zh0Var.c(ivVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.V, true);
                            } else {
                                if (c11 <= f7 || d.b == null) {
                                    i10 = saveLayerAlpha;
                                    py0Var = py0Var2;
                                    i11 = childCount;
                                    i12 = i14;
                                    d.a(canvas, this.V, false);
                                } else {
                                    d.a(canvas, this.V, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    py0Var = py0Var2;
                                    i12 = i14;
                                    i10 = saveLayerAlpha;
                                    i11 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.k, d.l, (int) (c11 * f12), 31);
                                    d.b.d(canvas, this.V);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                }
                                i14 = i12 + 1;
                                saveLayerAlpha = i10;
                                f11 = f12;
                                i15 = i16;
                                f10 = f7;
                                childCount = i11;
                                py0Var2 = py0Var;
                            }
                        }
                        i10 = saveLayerAlpha;
                        py0Var = py0Var2;
                        i11 = childCount;
                        i12 = i14;
                        i14 = i12 + 1;
                        saveLayerAlpha = i10;
                        f11 = f12;
                        i15 = i16;
                        f10 = f7;
                        childCount = i11;
                        py0Var2 = py0Var;
                    } else {
                        d.a(canvas, this.V, false);
                    }
                    py0Var = py0Var2;
                    i11 = childCount;
                    i12 = i14;
                    f7 = f10;
                    i10 = saveLayerAlpha;
                    i14 = i12 + 1;
                    saveLayerAlpha = i10;
                    f11 = f12;
                    i15 = i16;
                    f10 = f7;
                    childCount = i11;
                    py0Var2 = py0Var;
                }
                float f13 = f10;
                int i17 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = i0.P;
                rectF.set(-vvVar.S, f13, i0.L(12.0f) + r3, this.g0);
                kVar.o(canvas, rectF, 0, 1.0f);
                rectF.set(r3 - i0.L(12.0f), 0.0f, ((vvVar.C + vvVar.T) - rect.left) - rect.right, this.g0);
                kVar.o(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i17);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override // org.telegram.messenger.qu
    public final boolean u(CharacterStyle characterStyle, int i10, hu huVar) {
        Rect rect = this.b;
        uv uvVar = this.a0;
        if (uvVar != null && uvVar.o(characterStyle, huVar)) {
            huVar.e = (i0() + rect.left) - uvVar.n();
            huVar.f = i10 + rect.top;
            return true;
        }
        py0 py0Var = this.X;
        int childCount = py0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            hy0 hy0Var = py0Var.d(i11).b;
            if (hy0Var instanceof uv) {
                if (((uv) hy0Var).o(characterStyle, huVar)) {
                    huVar.e = ((r6.b() + rect.left) - this.i0) - r7.n();
                    huVar.f = r6.c() + i10 + rect.top + this.b0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.oy0
    public final /* synthetic */ void g(hy0 hy0Var, int i10) {
    }
}
