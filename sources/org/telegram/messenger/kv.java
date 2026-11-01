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
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.vh0;
import org.telegram.ui.xh0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class kv extends ru implements py0 {
    public final TL_iv.pageBlockTable W;
    public final qy0 X;
    public final ArrayList Y;
    public final org.telegram.ui.Cells.u9[] Z;
    public final vv a0;
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
    public vv q0;
    public float r0;
    public float s0;
    public boolean t0;
    public int u0;
    public int v0;
    public int w0;
    public VelocityTracker x0;
    public OverScroller y0;
    public final mg.c2 z0;

    public kv(wv wvVar, Rect rect, int i10, TL_iv.pageBlockTable pageblocktable) {
        super(wvVar, rect, i10);
        int i11;
        this.Y = new ArrayList();
        this.c0 = new ArrayList();
        this.z0 = new mg.c2(this, 10);
        Rect rect2 = this.b;
        rect2.top = i0.L(10.0f) + rect2.top;
        this.W = pageblocktable;
        this.d0 = this.c;
        qy0 qy0Var = new qy0(w0.b, this, null);
        this.X = qy0Var;
        qy0Var.setOrientation(0);
        qy0Var.setRowOrderPreserved(true);
        qy0Var.setDrawLines(pageblocktable.bordered);
        qy0Var.setStriped(pageblocktable.striped);
        qy0Var.setRtl(wvVar.I());
        qy0Var.setFillWidth(false);
        if (pageblocktable.compact) {
            int L = i0.L(5.0f);
            int L2 = i0.L(5.0f);
            int L3 = i0.L(5.0f);
            if (qy0Var.w != L || qy0Var.r != L2 || qy0Var.s != L3) {
                qy0Var.w = L;
                qy0Var.r = L2;
                qy0Var.s = L3;
                qy0Var.requestLayout();
            }
        }
        qy0Var.setMinimumCellHeight(i0.L(pageblocktable.compact ? 18.0f : 36.0f));
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
        if (richText == null || (richText instanceof TL_iv.textEmpty) || TextUtils.isEmpty(wv.x(richText))) {
            this.a0 = null;
            this.b0 = 0;
        } else {
            vv vvVar = new vv(wvVar, wvVar.l(pageblocktable.title, wv.R(0, 15)), this.d0);
            this.a0 = vvVar;
            vvVar.r = true;
            this.b0 = i0.L(9.0f) + vvVar.b.getHeight();
        }
        vv vvVar2 = this.a0;
        int max = Math.max(0, Math.min(this.d0, Math.max(measuredWidth, vvVar2 != null ? vvVar2.r() : 0)));
        this.e0 = max;
        this.f0 = max;
        for (int i19 = 0; i19 < this.X.getChildCount(); i19++) {
            jy0 d = this.X.d(i19);
            iy0 iy0Var = d.b;
            if (iy0Var instanceof vv) {
                this.Y.add((vv) iy0Var);
                this.c0.add(new jv(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        vv vvVar3 = this.a0;
        if (vvVar3 != null) {
            arrayList.add(vvVar3);
        }
        arrayList.addAll(this.Y);
        this.Z = (org.telegram.ui.Cells.u9[]) arrayList.toArray(new org.telegram.ui.Cells.u9[0]);
    }

    @Override // org.telegram.messenger.ru
    public final int H() {
        Rect rect = this.b;
        return i0.L(10.0f) + rect.top + this.b0 + this.g0 + rect.bottom;
    }

    @Override // org.telegram.messenger.ru
    public final int I() {
        return J();
    }

    @Override // org.telegram.messenger.ru
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.e0 + rect.right;
    }

    @Override // org.telegram.messenger.ru
    public final org.telegram.ui.Cells.u9[] K() {
        return this.Z;
    }

    @Override // org.telegram.messenger.ru
    public final boolean P() {
        if (this.p0) {
            return true;
        }
        OverScroller overScroller = this.y0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.ru
    public final void S() {
        vv vvVar = this.a0;
        if (vvVar != null) {
            vvVar.i(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vv) obj).i(this.V);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void U() {
        vv vvVar = this.a0;
        if (vvVar != null) {
            vvVar.f(this.V);
        }
        ArrayList arrayList = this.Y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vv) obj).f(this.V);
        }
    }

    @Override // org.telegram.messenger.ru
    public final void V(Canvas canvas) {
        vv vvVar = this.a0;
        if (vvVar != null) {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            vvVar.d(canvas, vvVar.S);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.b0);
        wv wvVar = this.a;
        int i10 = wvVar.S;
        li.k kVar = wvVar.z;
        float f7 = -i10;
        int i11 = wvVar.C + wvVar.T;
        Rect rect = this.b;
        canvas.saveLayerAlpha(f7, 0.0f, (i11 - rect.left) - rect.right, this.g0, at.e4, 31);
        canvas.save();
        canvas.translate(-this.i0, 0.0f);
        qy0 qy0Var = this.X;
        int childCount = qy0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            qy0Var.d(i12).a(canvas, this.V, true);
        }
        canvas.restore();
        RectF rectF = i0.P;
        rectF.set(-wvVar.S, 0.0f, i0.L(12.0f) + r2, this.g0);
        kVar.o(canvas, rectF, 0, 1.0f);
        rectF.set(r5 - i0.L(12.0f), 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.g0);
        kVar.o(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.messenger.ru
    public final boolean X(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.h0;
        jy0 jy0Var = null;
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
        vv vvVar = this.a0;
        if (vvVar != null && motionEvent.getY() < i13) {
            float i02 = i0();
            motionEvent.offsetLocation(-i02, 0.0f);
            boolean t10 = vvVar.t(motionEvent);
            motionEvent.offsetLocation(i02, 0.0f);
            if (t10) {
                this.q0 = vvVar;
                this.r0 = i02;
                this.s0 = 0.0f;
                this.t0 = true;
            }
        }
        if (!this.t0) {
            float x11 = motionEvent.getX();
            float f10 = x11 + this.i0;
            float y3 = motionEvent.getY() - i13;
            qy0 qy0Var = this.X;
            int childCount = qy0Var.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                jy0 d = qy0Var.d(i14);
                if (d.b instanceof vv) {
                    if (f10 >= d.p && f10 < r13 + d.k) {
                        if (y3 >= d.q && y3 < r13 + d.l) {
                            jy0Var = d;
                            break;
                        }
                    }
                }
                i14++;
            }
            if (jy0Var != null) {
                this.q0 = (vv) jy0Var.b;
                this.r0 = jy0Var.b() - this.i0;
                this.s0 = jy0Var.c() + i13;
                this.q0.R.set(jy0Var.p - jy0Var.b(), jy0Var.q - jy0Var.c(), (jy0Var.p + jy0Var.k) - jy0Var.b(), (jy0Var.q + jy0Var.l) - jy0Var.c());
                motionEvent.offsetLocation(-this.r0, -this.s0);
                this.t0 = this.q0.t(motionEvent);
                motionEvent.offsetLocation(this.r0, this.s0);
            }
        }
        return this.t0 || i10 > 0;
    }

    @Override // org.telegram.messenger.ru
    public final void Y(int i10, int i11, int i12) {
        this.S = i10;
        this.T = i11;
        this.U = i12;
        vv vvVar = this.a0;
        if (vvVar != null) {
            vvVar.c = (i0() + i10) - vvVar.n();
            vvVar.d = i11;
            vvVar.e = i12;
        }
        qy0 qy0Var = this.X;
        int childCount = qy0Var.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            jy0 d = qy0Var.d(i13);
            iy0 iy0Var = d.b;
            if (iy0Var instanceof vv) {
                vv vvVar2 = (vv) iy0Var;
                vvVar2.c = ((d.b() + i10) - this.i0) - vvVar2.n();
                vvVar2.d = d.c() + this.b0 + i11;
                vvVar2.e = i12;
            }
        }
    }

    @Override // org.telegram.ui.Components.py0
    public final iy0 c(TL_iv.pageTableCell pagetablecell, int i10) {
        if (pagetablecell == null) {
            return null;
        }
        int R = wv.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        wv wvVar = this.a;
        vv vvVar = new vv(wvVar, wvVar.l(richText, R), i10, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
        vvVar.r = true;
        return vvVar;
    }

    @Override // org.telegram.ui.Components.py0
    public final Paint getHeaderPaint() {
        h0();
        return this.l0;
    }

    @Override // org.telegram.ui.Components.py0
    public final Paint getLinePaint() {
        h0();
        return this.j0;
    }

    @Override // org.telegram.ui.Components.py0
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
        wv wvVar = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.il : org.telegram.ui.ActionBar.t6.hl, wvVar.D);
        this.j0.setColor(w02);
        this.k0.setColor(w02);
        this.l0.setColor(org.telegram.ui.ActionBar.t6.w0(wvVar.E() ? org.telegram.ui.ActionBar.t6.gl : org.telegram.ui.ActionBar.t6.fl, wvVar.D));
        this.m0.setColor(167772160);
    }

    public final int i0() {
        vv vvVar = this.a0;
        if (vvVar == null) {
            return 0;
        }
        int i10 = this.f0;
        int i11 = vvVar.h;
        return Math.round(((i10 - (i11 - r0)) / 2.0f) - vvVar.f);
    }

    @Override // org.telegram.messenger.ru
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        ru.l(spannableStringBuilder, this.a0, null);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.Y;
            if (i10 >= arrayList.size()) {
                return;
            }
            vv vvVar = (vv) arrayList.get(i10);
            if (vvVar != null && (staticLayout = vvVar.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    spannableStringBuilder.append(", ");
                }
                spannableStringBuilder.append(staticLayout.getText());
            }
            i10++;
        }
    }

    @Override // org.telegram.messenger.ru
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.c0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override // org.telegram.messenger.ru
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        boolean z10;
        boolean z11;
        vv vvVar;
        org.telegram.ui.Components.k5 k5Var;
        qy0 qy0Var;
        int i10;
        int i11;
        li.k kVar;
        int i12;
        org.telegram.ui.Components.k5 k5Var2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        vv vvVar2 = this.a0;
        if (vvVar2 == null || (k5Var2 = vvVar2.E) == null || k5Var2.a.isEmpty()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(i0(), 0.0f);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, vvVar2.b, vvVar2.E, 0.0f, vvVar2.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
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
            org.telegram.ui.Components.k5 k5Var3 = ((vv) arrayList.get(i13)).E;
            if (k5Var3 == null || k5Var3.a.isEmpty()) {
                i13++;
            } else {
                wv wvVar = this.a;
                int i14 = wvVar.S;
                li.k kVar2 = wvVar.z;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i14, 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.g0, at.e4, 31);
                canvas.save();
                canvas.translate(-this.i0, 0.0f);
                qy0 qy0Var2 = this.X;
                int childCount = qy0Var2.getChildCount();
                int i15 = 0;
                while (i15 < childCount) {
                    iy0 iy0Var = qy0Var2.d(i15).b;
                    if (!(iy0Var instanceof vv) || (k5Var = (vvVar = (vv) iy0Var).E) == null || k5Var.a.isEmpty()) {
                        i12 = saveLayerAlpha;
                        qy0Var = qy0Var2;
                        i10 = childCount;
                        i11 = i15;
                        kVar = kVar2;
                    } else {
                        canvas.save();
                        canvas.translate(r6.b(), r6.c());
                        qy0Var = qy0Var2;
                        i10 = childCount;
                        i11 = i15;
                        kVar = kVar2;
                        i12 = saveLayerAlpha;
                        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, vvVar.b, vvVar.E, 0.0f, vvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                        canvas.restore();
                    }
                    i15 = i11 + 1;
                    kVar2 = kVar;
                    qy0Var2 = qy0Var;
                    childCount = i10;
                    saveLayerAlpha = i12;
                }
                int i16 = saveLayerAlpha;
                li.k kVar3 = kVar2;
                canvas.restore();
                RectF rectF = i0.P;
                rectF.set(-wvVar.S, 0.0f, i0.L(12.0f) + r3, this.g0);
                kVar3.o(canvas, rectF, 0, 1.0f);
                rectF.set(r4 - i0.L(12.0f), 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.g0);
                kVar3.o(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i16);
                z11 = true;
            }
        }
        canvas.restore();
        return z11;
    }

    @Override // org.telegram.messenger.ru
    public final void t(Canvas canvas) {
        jv jvVar;
        float f7;
        int i10;
        qy0 qy0Var;
        int i11;
        int i12;
        xh0 xh0Var = this.K;
        if (xh0Var != null && xh0Var.h) {
            ArrayList arrayList = this.c0;
            if (!arrayList.isEmpty() && xh0Var.d((vh0) arrayList.get(0)) >= 0) {
                float c10 = xh0Var.c((vh0) arrayList.get(0));
                float f10 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.b;
                canvas.translate(rect.left, rect.top);
                vv vvVar = this.a0;
                if (vvVar != null) {
                    canvas.save();
                    canvas.translate(i0(), 0.0f);
                    vvVar.d(canvas, vvVar.S);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.b0);
                wv wvVar = this.a;
                int i13 = wvVar.S;
                li.k kVar = wvVar.z;
                float f11 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i13, 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.g0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.i0, 0.0f);
                qy0 qy0Var2 = this.X;
                int childCount = qy0Var2.getChildCount();
                int i14 = 0;
                int i15 = 0;
                while (i14 < childCount) {
                    float f12 = f11;
                    jy0 d = qy0Var2.d(i14);
                    if (i15 >= arrayList.size() || ((jv) arrayList.get(i15)).a != d) {
                        jvVar = null;
                    } else {
                        jvVar = (jv) arrayList.get(i15);
                        i15++;
                    }
                    int i16 = i15;
                    if (jvVar == null) {
                        d.a(canvas, this.V, true);
                    } else if (xh0Var.i(jvVar)) {
                        if (xh0Var.g(jvVar)) {
                            d.a(canvas, this.V, false);
                            if (d.b instanceof vv) {
                                canvas.save();
                                f7 = f10;
                                canvas.translate(d.b(), d.c());
                                ((vv) d.b).m(canvas, xh0Var.g(jvVar) ? xh0Var.e : -1, xh0Var.g(jvVar) ? xh0Var.f : f7);
                                canvas.restore();
                            } else {
                                f7 = f10;
                            }
                        } else {
                            f7 = f10;
                            float c11 = xh0Var.c(jvVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.V, true);
                            } else {
                                if (c11 <= f7 || d.b == null) {
                                    i10 = saveLayerAlpha;
                                    qy0Var = qy0Var2;
                                    i11 = childCount;
                                    i12 = i14;
                                    d.a(canvas, this.V, false);
                                } else {
                                    d.a(canvas, this.V, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    qy0Var = qy0Var2;
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
                                qy0Var2 = qy0Var;
                            }
                        }
                        i10 = saveLayerAlpha;
                        qy0Var = qy0Var2;
                        i11 = childCount;
                        i12 = i14;
                        i14 = i12 + 1;
                        saveLayerAlpha = i10;
                        f11 = f12;
                        i15 = i16;
                        f10 = f7;
                        childCount = i11;
                        qy0Var2 = qy0Var;
                    } else {
                        d.a(canvas, this.V, false);
                    }
                    qy0Var = qy0Var2;
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
                    qy0Var2 = qy0Var;
                }
                float f13 = f10;
                int i17 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = i0.P;
                rectF.set(-wvVar.S, f13, i0.L(12.0f) + r3, this.g0);
                kVar.o(canvas, rectF, 0, 1.0f);
                rectF.set(r3 - i0.L(12.0f), 0.0f, ((wvVar.C + wvVar.T) - rect.left) - rect.right, this.g0);
                kVar.o(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i17);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override // org.telegram.messenger.ru
    public final boolean u(CharacterStyle characterStyle, int i10, iu iuVar) {
        Rect rect = this.b;
        vv vvVar = this.a0;
        if (vvVar != null && vvVar.o(characterStyle, iuVar)) {
            iuVar.e = (i0() + rect.left) - vvVar.n();
            iuVar.f = i10 + rect.top;
            return true;
        }
        qy0 qy0Var = this.X;
        int childCount = qy0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            iy0 iy0Var = qy0Var.d(i11).b;
            if (iy0Var instanceof vv) {
                if (((vv) iy0Var).o(characterStyle, iuVar)) {
                    iuVar.e = ((r6.b() + rect.left) - this.i0) - r7.n();
                    iuVar.f = r6.c() + i10 + rect.top + this.b0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.py0
    public final /* synthetic */ void g(iy0 iy0Var, int i10) {
    }
}
