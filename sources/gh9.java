// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gh9 extends mg9 implements dfb {
    public final bg7 A0;
    public final TL_iv.pageBlockTable X;
    public final efb Y;
    public final ArrayList Z;
    public final pib[] a0;
    public final qh9 b0;
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
    public qh9 r0;
    public float s0;
    public float t0;
    public boolean u0;
    public int v0;
    public int w0;
    public int x0;
    public VelocityTracker y0;
    public OverScroller z0;

    public gh9(rh9 rh9Var, Rect rect, int i, TL_iv.pageBlockTable pageblocktable) {
        super(rh9Var, rect, i);
        int i2;
        this.Z = new ArrayList();
        this.d0 = new ArrayList();
        this.A0 = new bg7(this, (byte) 20);
        Rect rect2 = this.b;
        rect2.top = gl.L(10.0f) + rect2.top;
        this.X = pageblocktable;
        this.e0 = this.c;
        qh9 qh9Var = null;
        efb efbVar = new efb(a.b, this, null);
        this.Y = efbVar;
        efbVar.setOrientation(0);
        efbVar.setRowOrderPreserved(true);
        efbVar.setDrawLines(pageblocktable.bordered);
        efbVar.setStriped(pageblocktable.striped);
        efbVar.setRtl(rh9Var.H());
        efbVar.setFillWidth(false);
        efbVar.setBalancedColumns(true);
        if (pageblocktable.compact) {
            int L = gl.L(5.0f);
            int L2 = gl.L(5.0f);
            int L3 = gl.L(5.0f);
            if (efbVar.w != L || efbVar.r != L2 || efbVar.s != L3) {
                efbVar.w = L;
                efbVar.r = L2;
                efbVar.s = L3;
                efbVar.requestLayout();
            }
        }
        efbVar.setMinimumCellHeight(gl.L(pageblocktable.compact ? 18.0f : 36.0f));
        if (pageblocktable.rows.isEmpty()) {
            i2 = 0;
        } else {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(0);
            i2 = 0;
            for (int i3 = 0; i3 < pagetablerow.cells.size(); i3++) {
                int i4 = pagetablerow.cells.get(i3).colspan;
                if (i4 == 0) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
        for (int i5 = 0; i5 < pageblocktable.rows.size(); i5++) {
            TL_iv.pageTableRow pagetablerow2 = pageblocktable.rows.get(i5);
            int i6 = 0;
            for (int i7 = 0; i7 < pagetablerow2.cells.size(); i7++) {
                TL_iv.pageTableCell pagetablecell = pagetablerow2.cells.get(i7);
                int i8 = pagetablecell.colspan;
                i8 = i8 == 0 ? 1 : i8;
                int i9 = pagetablecell.rowspan;
                i9 = i9 == 0 ? 1 : i9;
                TL_iv.RichText richText = pagetablecell.text;
                efb efbVar2 = this.Y;
                if (richText != null) {
                    efbVar2.b(pagetablecell, i6, i5, i8);
                } else {
                    efbVar2.a(i6, i5, i8, i9);
                }
                i6 += i8;
            }
        }
        this.Y.setColumnCount(i2);
        this.Y.measure(View.MeasureSpec.makeMeasureSpec(this.c, 0), 0);
        int measuredWidth = this.Y.getMeasuredWidth();
        this.h0 = this.Y.getMeasuredHeight();
        this.i0 = Math.max(0, measuredWidth - this.e0);
        TL_iv.RichText richText2 = pageblocktable.title;
        if (richText2 == null || (richText2 instanceof TL_iv.textEmpty) || TextUtils.isEmpty(rh9.w(richText2))) {
            this.b0 = null;
            this.c0 = 0;
        } else {
            qh9 qh9Var2 = new qh9(rh9Var, rh9Var.l(pageblocktable.title, rh9.Q(0, 15)), this.e0, Layout.Alignment.ALIGN_CENTER);
            this.b0 = qh9Var2;
            qh9Var2.r = true;
            this.c0 = gl.L(9.0f) + qh9Var2.b.getHeight();
            qh9Var = qh9Var2;
        }
        int r = qh9Var != null ? qh9Var.r() : 0;
        boolean C = rh9Var.C();
        int i10 = this.e0;
        int max = C ? Math.max(0, i10) : Math.max(0, Math.min(i10, Math.max(measuredWidth, r)));
        this.f0 = max;
        this.g0 = max;
        for (int i11 = 0; i11 < this.Y.getChildCount(); i11++) {
            xeb d = this.Y.d(i11);
            web webVar = d.b;
            if (webVar instanceof qh9) {
                this.Z.add((qh9) webVar);
                this.d0.add(new fh9(d));
            }
        }
        ArrayList arrayList = new ArrayList();
        qh9 qh9Var3 = this.b0;
        if (qh9Var3 != null) {
            arrayList.add(qh9Var3);
        }
        arrayList.addAll(this.Z);
        this.a0 = (pib[]) arrayList.toArray(new pib[0]);
    }

    @Override // mg9
    public final int I() {
        Rect rect = this.b;
        return gl.L(10.0f) + rect.top + this.c0 + this.h0 + rect.bottom;
    }

    @Override // mg9
    public final int J() {
        return K();
    }

    @Override // mg9
    public final int K() {
        Rect rect = this.b;
        return rect.left + this.f0 + rect.right;
    }

    @Override // mg9
    public final pib[] L() {
        return this.a0;
    }

    @Override // mg9
    public final boolean Q() {
        if (this.q0) {
            return true;
        }
        OverScroller overScroller = this.z0;
        return (overScroller == null || overScroller.isFinished()) ? false : true;
    }

    @Override // mg9
    public final void T() {
        qh9 qh9Var = this.b0;
        if (qh9Var != null) {
            qh9Var.i(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qh9) obj).i(this.W);
        }
    }

    @Override // mg9
    public final void V() {
        qh9 qh9Var = this.b0;
        if (qh9Var != null) {
            qh9Var.f(this.W);
        }
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qh9) obj).f(this.W);
        }
    }

    @Override // mg9
    public final void W(Canvas canvas) {
        qh9 qh9Var = this.b0;
        if (qh9Var != null) {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            qh9Var.d(canvas, qh9Var.T);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(0.0f, this.c0);
        rh9 rh9Var = this.a;
        int i = rh9Var.S;
        xl3 xl3Var = rh9Var.z;
        float f = -i;
        int i2 = rh9Var.C + rh9Var.T;
        Rect rect = this.b;
        canvas.saveLayerAlpha(f, 0.0f, (i2 - rect.left) - rect.right, this.h0, kk7.d4, 31);
        canvas.save();
        canvas.translate(-this.j0, 0.0f);
        efb efbVar = this.Y;
        int childCount = efbVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            efbVar.d(i3).a(canvas, this.W, true);
        }
        canvas.restore();
        RectF rectF = gl.P;
        rectF.set(-rh9Var.S, 0.0f, gl.L(12.0f) + r2, this.h0);
        xl3Var.s(canvas, rectF, 0, 1.0f);
        rectF.set(r5 - gl.L(12.0f), 0.0f, ((rh9Var.C + rh9Var.T) - rect.left) - rect.right, this.h0);
        xl3Var.s(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // mg9
    public final boolean Y(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        int i = this.i0;
        xeb xebVar = null;
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked == 1 || actionMasked == 3) {
                    boolean z = this.q0;
                    this.q0 = false;
                    if (z) {
                        a0(false);
                        if (actionMasked == 1 && (velocityTracker = this.y0) != null && this.z0 != null && this.W != null) {
                            velocityTracker.addMovement(motionEvent);
                            this.y0.computeCurrentVelocity(1000, this.x0);
                            float f = -this.y0.getXVelocity();
                            if (Math.abs(f) > this.w0) {
                                this.z0.fling(this.j0, 0, (int) f, 0, 0, this.i0, 0, 0);
                                this.W.postOnAnimation(this.A0);
                            }
                        }
                    }
                    if (!z && this.u0 && this.r0 != null) {
                        motionEvent.offsetLocation(-this.s0, -this.t0);
                        this.r0.t(motionEvent);
                        motionEvent.offsetLocation(this.s0, this.t0);
                    }
                    boolean z2 = this.u0;
                    this.u0 = false;
                    this.r0 = null;
                    VelocityTracker velocityTracker2 = this.y0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.y0 = null;
                    }
                    if (z || z2) {
                    }
                }
            }
            VelocityTracker velocityTracker3 = this.y0;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
            float x = motionEvent.getX() - this.o0;
            if (!this.q0 && i > 0 && Math.abs(x) > this.v0) {
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
            int i2 = (int) (this.p0 - x);
            int i3 = i2 >= 0 ? i2 : 0;
            if (i3 <= i) {
                i = i3;
            }
            if (i != this.j0) {
                this.j0 = i;
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
        OverScroller overScroller = this.z0;
        if (overScroller == null && this.W != null) {
            overScroller = new OverScroller(this.W.getContext());
            this.z0 = overScroller;
        }
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
        int i4 = this.c0;
        qh9 qh9Var = this.b0;
        if (qh9Var != null && motionEvent.getY() < i4) {
            float j0 = j0();
            motionEvent.offsetLocation(-j0, 0.0f);
            boolean t = qh9Var.t(motionEvent);
            motionEvent.offsetLocation(j0, 0.0f);
            if (t) {
                this.r0 = qh9Var;
                this.s0 = j0;
                this.t0 = 0.0f;
                this.u0 = true;
            }
        }
        if (!this.u0) {
            float x2 = motionEvent.getX();
            float f2 = x2 + this.j0;
            float y = motionEvent.getY() - i4;
            efb efbVar = this.Y;
            int childCount = efbVar.getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                xeb d = efbVar.d(i5);
                if (d.b instanceof qh9) {
                    if (f2 >= d.p && f2 < r13 + d.k) {
                        if (y >= d.q && y < r13 + d.l) {
                            xebVar = d;
                            break;
                        }
                    }
                }
                i5++;
            }
            if (xebVar != null) {
                this.r0 = (qh9) xebVar.b;
                this.s0 = xebVar.b() - this.j0;
                this.t0 = xebVar.c() + i4;
                this.r0.S.set(xebVar.p - xebVar.b(), xebVar.q - xebVar.c(), (xebVar.p + xebVar.k) - xebVar.b(), (xebVar.q + xebVar.l) - xebVar.c());
                motionEvent.offsetLocation(-this.s0, -this.t0);
                this.u0 = this.r0.t(motionEvent);
                motionEvent.offsetLocation(this.s0, this.t0);
            }
        }
        return this.u0 || i > 0;
    }

    @Override // mg9
    public final void Z(int i, int i2, int i3) {
        this.T = i;
        this.U = i2;
        this.V = i3;
        qh9 qh9Var = this.b0;
        if (qh9Var != null) {
            qh9Var.c = (j0() + i) - qh9Var.n();
            qh9Var.d = i2;
            qh9Var.e = i3;
        }
        efb efbVar = this.Y;
        int childCount = efbVar.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            xeb d = efbVar.d(i4);
            web webVar = d.b;
            if (webVar instanceof qh9) {
                qh9 qh9Var2 = (qh9) webVar;
                qh9Var2.c = ((d.b() + i) - this.j0) - qh9Var2.n();
                qh9Var2.d = d.c() + this.c0 + i2;
                qh9Var2.e = i3;
            }
        }
    }

    @Override // dfb
    public final web c(TL_iv.pageTableCell pagetablecell, int i) {
        if (pagetablecell == null) {
            return null;
        }
        int Q = rh9.Q(0, 14);
        TL_iv.RichText richText = pagetablecell.text;
        rh9 rh9Var = this.a;
        qh9 qh9Var = new qh9(rh9Var, rh9Var.l(richText, Q), i, pagetablecell.align_right ? Layout.Alignment.ALIGN_OPPOSITE : pagetablecell.align_center ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL);
        qh9Var.r = true;
        return qh9Var;
    }

    @Override // dfb
    public final Paint getHeaderPaint() {
        i0();
        return this.m0;
    }

    @Override // dfb
    public final Paint getLinePaint() {
        i0();
        return this.k0;
    }

    @Override // dfb
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
            this.k0.setStrokeWidth(gl.N(0.66f));
            Paint paint2 = new Paint();
            this.l0 = paint2;
            paint2.setStyle(style);
            this.l0.setStrokeWidth(gl.N(0.66f));
            this.m0 = new Paint();
            this.n0 = new Paint();
        }
        rh9 rh9Var = this.a;
        int v0 = bkb.v0(rh9Var.D() ? bkb.kl : bkb.jl, rh9Var.D);
        this.k0.setColor(v0);
        this.l0.setColor(v0);
        this.m0.setColor(bkb.v0(rh9Var.D() ? bkb.il : bkb.hl, rh9Var.D));
        this.n0.setColor(167772160);
    }

    public final int j0() {
        qh9 qh9Var = this.b0;
        if (qh9Var == null) {
            return 0;
        }
        int i = this.g0;
        int i2 = qh9Var.h;
        return Math.round(((i - (i2 - r0)) / 2.0f) - qh9Var.f);
    }

    @Override // mg9
    public final void k(SpannableStringBuilder spannableStringBuilder) {
        StaticLayout staticLayout;
        mg9.m(spannableStringBuilder, this.b0, null);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i >= arrayList.size()) {
                return;
            }
            qh9 qh9Var = (qh9) arrayList.get(i);
            if (qh9Var != null && (staticLayout = qh9Var.b) != null && !TextUtils.isEmpty(staticLayout.getText())) {
                if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
                    spannableStringBuilder.append(", ");
                }
                spannableStringBuilder.append(staticLayout.getText());
            }
            i++;
        }
    }

    @Override // mg9
    public final void p(ArrayList arrayList) {
        ArrayList arrayList2 = this.d0;
        if (arrayList2.isEmpty()) {
            arrayList.add(this);
        } else {
            arrayList.addAll(arrayList2);
        }
    }

    @Override // mg9
    public final boolean s(Canvas canvas, ColorFilter colorFilter) {
        boolean z;
        boolean z2;
        int i;
        efb efbVar;
        int i2;
        int i3;
        xl3 xl3Var;
        qh9 qh9Var;
        cm cmVar;
        cm cmVar2;
        canvas.save();
        Rect rect = this.b;
        canvas.translate(rect.left, rect.top);
        qh9 qh9Var2 = this.b0;
        if (qh9Var2 == null || (cmVar2 = qh9Var2.F) == null || cmVar2.a.isEmpty()) {
            z = false;
        } else {
            canvas.save();
            canvas.translate(j0(), 0.0f);
            gm.drawAnimatedEmojis(canvas, qh9Var2.b, qh9Var2.F, 0.0f, qh9Var2.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
            canvas.restore();
            z = true;
        }
        canvas.translate(0.0f, this.c0);
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z2 = z;
                break;
            }
            cm cmVar3 = ((qh9) arrayList.get(i4)).F;
            if (cmVar3 == null || cmVar3.a.isEmpty()) {
                i4++;
            } else {
                rh9 rh9Var = this.a;
                int i5 = rh9Var.S;
                xl3 xl3Var2 = rh9Var.z;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i5, 0.0f, ((rh9Var.C + rh9Var.T) - rect.left) - rect.right, this.h0, kk7.d4, 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                efb efbVar2 = this.Y;
                int childCount = efbVar2.getChildCount();
                int i6 = 0;
                while (i6 < childCount) {
                    web webVar = efbVar2.d(i6).b;
                    if (!(webVar instanceof qh9) || (cmVar = (qh9Var = (qh9) webVar).F) == null || cmVar.a.isEmpty()) {
                        i = saveLayerAlpha;
                        efbVar = efbVar2;
                        i2 = childCount;
                        i3 = i6;
                        xl3Var = xl3Var2;
                    } else {
                        canvas.save();
                        canvas.translate(r6.b(), r6.c());
                        efbVar = efbVar2;
                        i2 = childCount;
                        i3 = i6;
                        xl3Var = xl3Var2;
                        i = saveLayerAlpha;
                        gm.drawAnimatedEmojis(canvas, qh9Var.b, qh9Var.F, 0.0f, qh9Var.x, 0.0f, 0.0f, 0.0f, 1.0f, colorFilter);
                        canvas.restore();
                    }
                    i6 = i3 + 1;
                    xl3Var2 = xl3Var;
                    efbVar2 = efbVar;
                    childCount = i2;
                    saveLayerAlpha = i;
                }
                int i7 = saveLayerAlpha;
                xl3 xl3Var3 = xl3Var2;
                canvas.restore();
                RectF rectF = gl.P;
                rectF.set(-rh9Var.S, 0.0f, gl.L(12.0f) + r3, this.h0);
                xl3Var3.s(canvas, rectF, 0, 1.0f);
                rectF.set(r4 - gl.L(12.0f), 0.0f, ((rh9Var.C + rh9Var.T) - rect.left) - rect.right, this.h0);
                xl3Var3.s(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i7);
                z2 = true;
            }
        }
        canvas.restore();
        return z2;
    }

    @Override // mg9
    public final void t(Canvas canvas) {
        fh9 fh9Var;
        float f;
        int i;
        efb efbVar;
        int i2;
        int i3;
        lg7 lg7Var = this.L;
        if (lg7Var != null && lg7Var.h) {
            ArrayList arrayList = this.d0;
            if (!arrayList.isEmpty() && lg7Var.d((jg7) arrayList.get(0)) >= 0) {
                float c = lg7Var.c((jg7) arrayList.get(0));
                float f2 = 0.0f;
                if (c <= 0.0f) {
                    return;
                }
                canvas.save();
                Rect rect = this.b;
                canvas.translate(rect.left, rect.top);
                qh9 qh9Var = this.b0;
                if (qh9Var != null) {
                    canvas.save();
                    canvas.translate(j0(), 0.0f);
                    qh9Var.d(canvas, qh9Var.T);
                    canvas.restore();
                }
                canvas.translate(0.0f, this.c0);
                rh9 rh9Var = this.a;
                int i4 = rh9Var.S;
                xl3 xl3Var = rh9Var.z;
                float f3 = 255.0f;
                int saveLayerAlpha = canvas.saveLayerAlpha(-i4, 0.0f, ((rh9Var.C + rh9Var.T) - rect.left) - rect.right, this.h0, (int) (c * 255.0f), 31);
                canvas.save();
                canvas.translate(-this.j0, 0.0f);
                efb efbVar2 = this.Y;
                int childCount = efbVar2.getChildCount();
                int i5 = 0;
                int i6 = 0;
                while (i5 < childCount) {
                    float f4 = f3;
                    xeb d = efbVar2.d(i5);
                    if (i6 >= arrayList.size() || ((fh9) arrayList.get(i6)).a != d) {
                        fh9Var = null;
                    } else {
                        fh9Var = (fh9) arrayList.get(i6);
                        i6++;
                    }
                    int i7 = i6;
                    if (fh9Var == null) {
                        d.a(canvas, this.W, true);
                    } else if (lg7Var.i(fh9Var)) {
                        if (lg7Var.g(fh9Var)) {
                            d.a(canvas, this.W, false);
                            if (d.b instanceof qh9) {
                                canvas.save();
                                f = f2;
                                canvas.translate(d.b(), d.c());
                                ((qh9) d.b).m(canvas, lg7Var.g(fh9Var) ? lg7Var.e : -1, lg7Var.g(fh9Var) ? lg7Var.f : f);
                                canvas.restore();
                            } else {
                                f = f2;
                            }
                        } else {
                            f = f2;
                            float c2 = lg7Var.c(fh9Var);
                            if (c2 >= 1.0f) {
                                d.a(canvas, this.W, true);
                            } else {
                                if (c2 <= f || d.b == null) {
                                    i = saveLayerAlpha;
                                    efbVar = efbVar2;
                                    i2 = childCount;
                                    i3 = i5;
                                    d.a(canvas, this.W, false);
                                } else {
                                    d.a(canvas, this.W, false);
                                    canvas.save();
                                    canvas.translate(d.b(), d.c());
                                    efbVar = efbVar2;
                                    i3 = i5;
                                    i = saveLayerAlpha;
                                    i2 = childCount;
                                    int saveLayerAlpha2 = canvas.saveLayerAlpha(0.0f, 0.0f, d.k, d.l, (int) (c2 * f4), 31);
                                    d.b.d(canvas, this.W);
                                    canvas.restoreToCount(saveLayerAlpha2);
                                    canvas.restore();
                                }
                                i5 = i3 + 1;
                                saveLayerAlpha = i;
                                f3 = f4;
                                i6 = i7;
                                f2 = f;
                                childCount = i2;
                                efbVar2 = efbVar;
                            }
                        }
                        i = saveLayerAlpha;
                        efbVar = efbVar2;
                        i2 = childCount;
                        i3 = i5;
                        i5 = i3 + 1;
                        saveLayerAlpha = i;
                        f3 = f4;
                        i6 = i7;
                        f2 = f;
                        childCount = i2;
                        efbVar2 = efbVar;
                    } else {
                        d.a(canvas, this.W, false);
                    }
                    efbVar = efbVar2;
                    i2 = childCount;
                    i3 = i5;
                    f = f2;
                    i = saveLayerAlpha;
                    i5 = i3 + 1;
                    saveLayerAlpha = i;
                    f3 = f4;
                    i6 = i7;
                    f2 = f;
                    childCount = i2;
                    efbVar2 = efbVar;
                }
                float f5 = f2;
                int i8 = saveLayerAlpha;
                canvas.restore();
                RectF rectF = gl.P;
                rectF.set(-rh9Var.S, f5, gl.L(12.0f) + r3, this.h0);
                xl3Var.s(canvas, rectF, 0, 1.0f);
                rectF.set(r3 - gl.L(12.0f), 0.0f, ((rh9Var.C + rh9Var.T) - rect.left) - rect.right, this.h0);
                xl3Var.s(canvas, rectF, 2, 1.0f);
                canvas.restoreToCount(i8);
                canvas.restore();
                return;
            }
        }
        q(canvas);
    }

    @Override // mg9
    public final boolean u(CharacterStyle characterStyle, int i, eg9 eg9Var) {
        Rect rect = this.b;
        qh9 qh9Var = this.b0;
        if (qh9Var != null && qh9Var.o(characterStyle, eg9Var)) {
            eg9Var.e = (j0() + rect.left) - qh9Var.n();
            eg9Var.f = i + rect.top;
            return true;
        }
        efb efbVar = this.Y;
        int childCount = efbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            web webVar = efbVar.d(i2).b;
            if (webVar instanceof qh9) {
                if (((qh9) webVar).o(characterStyle, eg9Var)) {
                    eg9Var.e = ((r6.b() + rect.left) - this.j0) - r7.n();
                    eg9Var.f = r6.c() + i + rect.top + this.c0;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // dfb
    public final void h(web webVar, int i) {
    }
}
