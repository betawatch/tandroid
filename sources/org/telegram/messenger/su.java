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
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.vg0;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class su extends zt implements vx0 {
    public final j6.o A0;
    public final TL_iv.pageBlockTable X;
    public final wx0 Y;
    public final ArrayList Z;
    public final org.telegram.ui.Cells.t9[] a0;
    public final dv b0;
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
    public dv r0;
    public float s0;
    public float t0;
    public boolean u0;
    public int v0;
    public int w0;
    public int x0;
    public VelocityTracker y0;
    public OverScroller z0;

    public su(ev evVar, Rect rect, int i7, TL_iv.pageBlockTable pageblocktable) {
        super(evVar, rect, i7);
        int i10;
        this.Z = new ArrayList();
        this.d0 = new ArrayList();
        this.A0 = new j6.o(this, 15);
        Rect rect2 = this.b;
        rect2.top = g0.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.e0 = this.c;
        wx0 wx0Var = new wx0(t0.b, this, null);
        this.Y = wx0Var;
        wx0Var.setOrientation(0);
        wx0Var.setRowOrderPreserved(true);
        wx0Var.setDrawLines(pageblocktable.bordered);
        wx0Var.setStriped(pageblocktable.striped);
        wx0Var.setRtl(evVar.I());
        wx0Var.setFillWidth(false);
        wx0Var.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = g0.L(5.0f);
            int L2 = g0.L(5.0f);
            int L3 = g0.L(5.0f);
            if (wx0Var.w != L || wx0Var.r != L2 || wx0Var.s != L3) {
                wx0Var.w = L;
                wx0Var.r = L2;
                wx0Var.s = L3;
                wx0Var.requestLayout();
            }
        }
        wx0Var.setMinimumCellHeight(g0.L(pageblocktable.compact ? 18.0f : 36.0f));
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
        if (richText == null || (richText instanceof TL_iv.textEmpty) || TextUtils.isEmpty(ev.x(richText))) {
            this.b0 = null;
            this.c0 = 0;
        } else {
            dv dvVar = new dv(evVar, evVar.l(pageblocktable.title, ev.R(0, 15)), this.e0, Layout.Alignment.ALIGN_CENTER);
            this.b0 = dvVar;
            dvVar.r = true;
            this.c0 = g0.L(9.0f) + dvVar.b.getHeight();
        }
        dv dvVar2 = this.b0;
        int max = evVar.D() ? Math.max(0, this.e0) : Math.max(0, Math.min(this.e0, Math.max(measuredWidth, dvVar2 != null ? dvVar2.r() : 0)));
        this.f0 = max;
        this.g0 = max;
        for (int i18 = 0; i18 < this.Y.getChildCount(); i18++) {
            px0 d = this.Y.d(i18);
            ox0 ox0Var = d.b;
            if (ox0Var instanceof dv) {
                this.Z.add((dv) ox0Var);
                this.d0.add(new ru(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        dv dvVar3 = this.b0;
        if (dvVar3 != null) {
            arrayList.add(dvVar3);
        }
        arrayList.addAll(this.Z);
        this.a0 = (org.telegram.ui.Cells.t9[]) arrayList.toArray(new org.telegram.ui.Cells.t9[0]);
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        return g0.L(10.0f) + rect.top + this.c0 + this.h0 + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int J() {
        return K();
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.f0 + rect.right;
    }

    @Override // org.telegram.messenger.zt
    public final org.telegram.ui.Cells.t9[] L() {
        return this.a0;
    }

    @Override // org.telegram.messenger.zt
    public final boolean Q() {
        if (this.q0) {
            return true;
        }
        OverScroller overScroller = this.z0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        dv dvVar = this.b0;
        if (dvVar != null) {
            dvVar.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((dv) obj).i(this.W);
        }
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        dv dvVar = this.b0;
        if (dvVar != null) {
            dvVar.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((dv) obj).f(this.W);
        }
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        dv dvVar = this.b0;
        if (dvVar != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            dvVar.d(canvas, dvVar.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.c0);
        ev evVar = this.a;
        int i7 = evVar.S;
        h6.m mVar = evVar.z;
        float f10 = -i7;
        int i10 = evVar.C + evVar.T;
        Rect rect = this.b;
        canvas.saveLayerAlpha(f10, 0.0f, (i10 - rect.left) - rect.right, this.h0, ks.e4, 31);
        canvas.save();
        canvas.translate(-this.j0, 0.0f);
        wx0 wx0Var = this.Y;
        int childCount = wx0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            wx0Var.d(i11).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = g0.P;
        rectF.set(-evVar.S, 0.0f, g0.L(12.0f) + r2, this.h0);
        mVar.n(canvas, rectF, 0, 1.0f);
        rectF.set(r5 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.h0);
        mVar.n(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.i0;
        px0 px0Var = null;
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
            if (!this.q0 && i7 > 0 && Math.abs(x10) > this.v0) {
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
            if (i11 <= i7) {
                i7 = i11;
            }
            if (i7 != this.j0) {
                this.j0 = i7;
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
        dv dvVar = this.b0;
        if (dvVar != null && motionEvent.getY() < i12) {
            float j02 = j0();
            motionEvent.offsetLocation(-j02, 0.0f);
            boolean t6 = dvVar.t(motionEvent);
            motionEvent.offsetLocation(j02, 0.0f);
            if (t6) {
                this.r0 = dvVar;
                this.s0 = j02;
                this.t0 = 0.0f;
                this.u0 = true;
            }
        }
        if (!this.u0) {
            float x11 = motionEvent.getX();
            float f11 = x11 + this.j0;
            float y10 = motionEvent.getY() - i12;
            wx0 wx0Var = this.Y;
            int childCount = wx0Var.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                px0 d = wx0Var.d(i13);
                if (d.b instanceof dv) {
                    if (f11 >= d.p && f11 < r13 + d.k) {
                        if (y10 >= d.q && y10 < r13 + d.l) {
                            px0Var = d;
                            break;
                        }
                    }
                }
                i13++;
            }
            if (px0Var != null) {
                this.r0 = (dv) px0Var.b;
                this.s0 = px0Var.b() - this.j0;
                this.t0 = px0Var.c() + i12;
                this.r0.S.set(px0Var.p - px0Var.b(), px0Var.q - px0Var.c(), (px0Var.p + px0Var.k) - px0Var.b(), (px0Var.q + px0Var.l) - px0Var.c());
                motionEvent.offsetLocation(-this.s0, -this.t0);
                this.u0 = this.r0.t(motionEvent);
                motionEvent.offsetLocation(this.s0, this.t0);
            }
        }
        return this.u0 || i7 > 0;
    }

    @Override // org.telegram.messenger.zt
    public final void Z(int i7, int i10, int i11) {
        this.T = i7;
        this.U = i10;
        this.V = i11;
        dv dvVar = this.b0;
        if (dvVar != null) {
            dvVar.c = (j0() + i7) - dvVar.n();
            dvVar.d = i10;
            dvVar.e = i11;
        }
        wx0 wx0Var = this.Y;
        int childCount = wx0Var.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            px0 d = wx0Var.d(i12);
            ox0 ox0Var = d.b;
            if (ox0Var instanceof dv) {
                dv dvVar2 = (dv) ox0Var;
                dvVar2.c = ((d.b() + i7) - this.j0) - dvVar2.n();
                dvVar2.d = d.c() + this.c0 + i10;
                dvVar2.e = i11;
            }
        }
    }

    @Override // org.telegram.ui.Components.vx0
    public final ox0 c(TL_iv.pageTableCell pagetablecell, int i7) {
        if (pagetablecell == null) {
            return null;
        }
        int R = ev.R(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        ev evVar = this.a;
        dv dvVar = new dv(evVar, evVar.l(richText, R), i7, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
        dvVar.r = true;
        return dvVar;
    }

    @Override // org.telegram.ui.Components.vx0
    public final Paint getHeaderPaint() {
        i0();
        return this.m0;
    }

    @Override // org.telegram.ui.Components.vx0
    public final Paint getLinePaint() {
        i0();
        return this.k0;
    }

    @Override // org.telegram.ui.Components.vx0
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
        ev evVar = this.a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.ll : org.telegram.ui.ActionBar.n6.kl, evVar.D);
        this.k0.setColor(w02);
        this.l0.setColor(w02);
        this.m0.setColor(org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.jl : org.telegram.ui.ActionBar.n6.il, evVar.D));
        this.n0.setColor(167772160);
    }

    public final int j0() {
        dv dvVar = this.b0;
        if (dvVar == null) {
            return 0;
        }
        int i7 = this.g0;
        int i10 = dvVar.h;
        return Math.round(((i7 - (i10 - r0)) / 2.0f) - dvVar.f);
    }

    @Override // org.telegram.messenger.zt
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        zt.l(spannableStringBuilder, this.b0, null);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i7 >= arrayList.size()) {
                return;
            }
            dv dvVar = (dv) arrayList.get(i7);
            if (dvVar != null && (staticLayout = dvVar.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    spannableStringBuilder.append(", ");
                }
                spannableStringBuilder.append(staticLayout.getText());
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.zt
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.d0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override // org.telegram.messenger.zt
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        boolean z10;
        boolean z11;
        dv dvVar;
        org.telegram.ui.Components.t5 t5Var;
        wx0 wx0Var;
        int i7;
        int i10;
        h6.m mVar;
        int i11;
        org.telegram.ui.Components.t5 t5Var2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        dv dvVar2 = this.b0;
        if (dvVar2 == null || (t5Var2 = dvVar2.F) == null || t5Var2.a.isEmpty()) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar2.b, dvVar2.F, 0.0f, dvVar2.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
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
            org.telegram.ui.Components.t5 t5Var3 = ((dv) arrayList.get(i12)).F;
            if (t5Var3 == null || t5Var3.a.isEmpty()) {
                i12++;
            } else {
                ev evVar = this.a;
                int i13 = evVar.S;
                h6.m mVar2 = evVar.z;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i13, 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.h0, ks.e4, 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                wx0 wx0Var2 = this.Y;
                int childCount = wx0Var2.getChildCount();
                int i14 = 0;
                while (i14 < childCount) {
                    ox0 ox0Var = wx0Var2.d(i14).b;
                    if (!(ox0Var instanceof dv) || (t5Var = (dvVar = (dv) ox0Var).F) == null || t5Var.a.isEmpty()) {
                        i11 = saveLayerAlpha;
                        wx0Var = wx0Var2;
                        i7 = childCount;
                        i10 = i14;
                        mVar = mVar2;
                    } else {
                        canvas.save();
                        canvas.translate(r6.b(), r6.c());
                        wx0Var = wx0Var2;
                        i7 = childCount;
                        i10 = i14;
                        mVar = mVar2;
                        i11 = saveLayerAlpha;
                        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, dvVar.b, dvVar.F, 0.0f, dvVar.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                        canvas.restore();
                    }
                    i14 = i10 + 1;
                    mVar2 = mVar;
                    wx0Var2 = wx0Var;
                    childCount = i7;
                    saveLayerAlpha = i11;
                }
                int i15 = saveLayerAlpha;
                h6.m mVar3 = mVar2;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-evVar.S, 0.0f, g0.L(12.0f) + r3, this.h0);
                mVar3.n(canvas, rectF, 0, 1.0f);
                rectF.set(r4 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.h0);
                mVar3.n(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i15);
                z11 = true;
            }
        }
        canvas.restore();
        return z11;
    }

    @Override // org.telegram.messenger.zt
    public final void t(Canvas canvas) {
        ru ruVar;
        float f10;
        int i7;
        wx0 wx0Var;
        int i10;
        int i11;
        xg0 xg0Var = this.L;
        if (xg0Var != null && xg0Var.h) {
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty() && xg0Var.d((vg0) arrayList.get(0)) >= 0) {
                float c10 = xg0Var.c((vg0) arrayList.get(0));
                float f11 = 0.0f;
                if (c10 <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.b;
                canvas.translate(rect.left, rect.top);
                dv dvVar = this.b0;
                if (dvVar != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    dvVar.d(canvas, dvVar.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.c0);
                ev evVar = this.a;
                int i12 = evVar.S;
                h6.m mVar = evVar.z;
                float f12 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i12, 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.h0, (int) (c10 * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                wx0 wx0Var2 = this.Y;
                int childCount = wx0Var2.getChildCount();
                int i13 = 0;
                int i14 = 0;
                while (i13 < childCount) {
                    float f13 = f12;
                    px0 d = wx0Var2.d(i13);
                    if (i14 >= arrayList.size() || ((ru) arrayList.get(i14)).a != d) {
                        ruVar = null;
                    } else {
                        ruVar = (ru) arrayList.get(i14);
                        i14++;
                    }
                    int i15 = i14;
                    if (ruVar == null) {
                        d.a(canvas, this.W, true);
                    } else if (xg0Var.i(ruVar)) {
                        if (xg0Var.g(ruVar)) {
                            d.a(canvas, this.W, false);
                            if (d.b instanceof dv) {
                                canvas.save();
                                f10 = f11;
                                canvas.translate(d.b(), d.c());
                                ((dv) d.b).m(canvas, xg0Var.g(ruVar) ? xg0Var.e : -1, xg0Var.g(ruVar) ? xg0Var.f : f10);
                                canvas.restore();
                            } else {
                                f10 = f11;
                            }
                        } else {
                            f10 = f11;
                            float c11 = xg0Var.c(ruVar);
                            if (c11 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c11 <= f10 || d.b == null) {
                                    i7 = saveLayerAlpha;
                                    wx0Var = wx0Var2;
                                    i10 = childCount;
                                    i11 = i13;
                                    d.a(canvas, this.W, false);
                                } else {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    wx0Var = wx0Var2;
                                    i11 = i13;
                                    i7 = saveLayerAlpha;
                                    i10 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.k, d.l, (int) (c11 * f13), 31);
                                    d.b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                }
                                i13 = i11 + 1;
                                saveLayerAlpha = i7;
                                f12 = f13;
                                i14 = i15;
                                f11 = f10;
                                childCount = i10;
                                wx0Var2 = wx0Var;
                            }
                        }
                        i7 = saveLayerAlpha;
                        wx0Var = wx0Var2;
                        i10 = childCount;
                        i11 = i13;
                        i13 = i11 + 1;
                        saveLayerAlpha = i7;
                        f12 = f13;
                        i14 = i15;
                        f11 = f10;
                        childCount = i10;
                        wx0Var2 = wx0Var;
                    } else {
                        d.a(canvas, this.W, false);
                    }
                    wx0Var = wx0Var2;
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
                    wx0Var2 = wx0Var;
                }
                float f14 = f11;
                int i16 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = g0.P;
                rectF.set(-evVar.S, f14, g0.L(12.0f) + r3, this.h0);
                mVar.n(canvas, rectF, 0, 1.0f);
                rectF.set(r3 - g0.L(12.0f), 0.0f, ((evVar.C + evVar.T) - rect.left) - rect.right, this.h0);
                mVar.n(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i16);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override // org.telegram.messenger.zt
    public final boolean u(CharacterStyle characterStyle, int i7, qt qtVar) {
        Rect rect = this.b;
        dv dvVar = this.b0;
        if (dvVar != null && dvVar.o(characterStyle, qtVar)) {
            qtVar.e = (j0() + rect.left) - dvVar.n();
            qtVar.f = i7 + rect.top;
            return true;
        }
        wx0 wx0Var = this.Y;
        int childCount = wx0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ox0 ox0Var = wx0Var.d(i10).b;
            if (ox0Var instanceof dv) {
                if (((dv) ox0Var).o(characterStyle, qtVar)) {
                    qtVar.e = ((r6.b() + rect.left) - this.j0) - r7.n();
                    qtVar.f = r6.c() + i7 + rect.top + this.c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vx0
    public final /* synthetic */ void g(ox0 ox0Var, int i7) {
    }
}
