// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Magnifier;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class mmb {
    public final rt3 A;
    public final Rect B;
    public lmb C;
    public b0f D;
    public d79 E;
    public ViewGroup F;
    public Magnifier G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final RectF S;
    public final RectF T;
    public float U;
    public float V;
    public hmb W;
    public hmb X;
    public cl4 Y;
    public boolean Z;
    public int a;
    public final dj2 a0;
    public int b;
    public int b0;
    public int c;
    public final OvershootInterpolator c0;
    public int d;
    public int d0;
    public boolean e;
    public final xlb e0;
    public float f;
    public final xlb f0;
    public float g;
    public vnb g0;
    public final int[] h = new int[2];
    public boolean h0;
    public boolean i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public boolean k;
    public xs k0;
    public final int l;
    public ValueAnimator l0;
    public final int m;
    public final s8b m0;
    public final float n;
    public final xlb n0;
    public final Paint o;
    public final gmb o0;
    public final Paint p;
    public final jx2 q;
    public final Path r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public mmb() {
        Paint paint = new Paint(1);
        this.o = paint;
        this.p = new Paint(1);
        jx2 jx2Var = new jx2();
        this.q = jx2Var;
        this.r = new Path();
        this.u = -1;
        this.v = -1;
        this.A = new rt3(this, new ut3(this), (byte) 2);
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.a0 = new dj2();
        this.c0 = new OvershootInterpolator();
        this.e0 = new xlb(this, (byte) 0);
        this.f0 = new xlb(this, (byte) 1);
        this.h0 = true;
        this.k0 = null;
        this.m0 = new s8b(this, (byte) 16);
        this.n0 = new xlb(this, (byte) 2);
        gmb gmbVar = new gmb();
        gmbVar.a = 0.0f;
        gmbVar.b = new ArrayList(1);
        gmbVar.c = 0;
        this.o0 = gmbVar;
        this.l = ViewConfiguration.getLongPressTimeout();
        this.m = ViewConfiguration.get(a.b).getScaledTouchSlop();
        float L = hl.L(6.0f);
        this.n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        jx2Var.d = 1.0f;
    }

    public static boolean x(char c) {
        return Character.isLetter(c) || Character.isDigit(c) || c == '_';
    }

    public final int[] A(int i) {
        dj2 dj2Var = this.a0;
        h(i, dj2Var, false);
        Layout layout = (Layout) dj2Var.d;
        int i2 = i - dj2Var.a;
        int[] iArr = this.h;
        if (layout != null && i2 >= 0 && i2 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i2);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i2) + dj2Var.c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + dj2Var.b);
        }
        return iArr;
    }

    public boolean B() {
        return false;
    }

    public final void F() {
        lmb lmbVar;
        if (!w() || (lmbVar = this.C) == null) {
            return;
        }
        this.Q = true;
        lmbVar.invalidate();
        t();
    }

    public boolean I() {
        return false;
    }

    public void K(hmb hmbVar, hmb hmbVar2) {
    }

    public final boolean L(MotionEvent motionEvent) {
        mmb mmbVar;
        int action = motionEvent.getAction();
        xlb xlbVar = this.f0;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y = (int) motionEvent.getY();
                    int x = (int) motionEvent.getX();
                    int i = this.t - y;
                    int i2 = this.s - x;
                    int i3 = (i2 * i2) + (i * i);
                    int i4 = this.m;
                    if (i3 > i4 * i4) {
                        hl.r(xlbVar);
                        this.z = false;
                    }
                    return this.z;
                }
                if (action != 3) {
                    return false;
                }
            }
            hl.r(xlbVar);
            this.z = false;
            return false;
        }
        this.s = (int) motionEvent.getX();
        this.t = (int) motionEvent.getY();
        this.z = false;
        int i5 = -hl.L(8.0f);
        int i6 = -hl.L(8.0f);
        Rect rect = this.B;
        rect.inset(i5, i6);
        if (!rect.contains(this.s, this.t) || this.X == null) {
            mmbVar = this;
        } else {
            rect.inset(hl.L(8.0f), hl.L(8.0f));
            int i7 = this.s;
            int i8 = this.t;
            int i9 = rect.right;
            if (i7 > i9) {
                i7 = i9 - 1;
            }
            int i10 = rect.left;
            if (i7 < i10) {
                i7 = i10 + 1;
            }
            int i11 = i7;
            int i12 = rect.top;
            if (i8 < i12) {
                i8 = i12 + 1;
            }
            int i13 = rect.bottom;
            if (i8 > i13) {
                i8 = i13 - 1;
            }
            mmbVar = this;
            int j = mmbVar.j(i11, i8, this.c, this.d, this.X, true);
            CharSequence r = mmbVar.r(mmbVar.X, true);
            if (j >= r.length()) {
                dj2 dj2Var = mmbVar.a0;
                mmbVar.h(j, dj2Var, true);
                Layout layout = (Layout) dj2Var.d;
                if (layout == null) {
                    mmbVar.z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f = i11 - mmbVar.c;
                if (f < ((Layout) dj2Var.d).getLineRight(lineCount) + hl.L(4.0f) && f > ((Layout) dj2Var.d).getLineLeft(lineCount)) {
                    j = r.length() - 1;
                }
            }
            if (j >= 0 && j < r.length() && r.charAt(j) != '\n') {
                hl.r(xlbVar);
                hl.d3(xlbVar, mmbVar.l);
                mmbVar.z = true;
            }
        }
        return mmbVar.z;
    }

    public boolean O(int i, int i2) {
        return false;
    }

    public final void P() {
        this.i0 = true;
    }

    public final void Q(ViewGroup viewGroup) {
        if (viewGroup instanceof d79) {
            this.E = (d79) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void R() {
        if (this.C == null || this.i || !w() || !c()) {
            return;
        }
        if (!this.P) {
            cl4 cl4Var = this.Y;
            rt3 rt3Var = this.A;
            if (cl4Var == null) {
                cl4 cl4Var2 = new cl4(this.C.getContext(), rt3Var, this.C, new lm4(this.C.getContext(), this.C, 1, p(), null));
                this.Y = cl4Var2;
                rt3Var.onCreateActionMode(cl4Var2, cl4Var2.c);
            }
            cl4 cl4Var3 = this.Y;
            rt3Var.onPrepareActionMode(cl4Var3, cl4Var3.c);
            this.Y.hide(1L);
        }
        hl.r(this.n0);
        this.P = true;
    }

    public final void S() {
        if (this.V == 1.0f || this.C == null) {
            return;
        }
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new ija(this, (byte) 22));
        this.l0.setDuration((long) (Math.abs(1.0f - this.V) * 250.0f));
        this.l0.start();
    }

    public final void T(int i) {
        int lineRight;
        int i2;
        if (Build.VERSION.SDK_INT < 28 || this.W == null || this.k || !this.i || this.C == null) {
            return;
        }
        int i3 = this.j ? this.u : this.v;
        dj2 dj2Var = this.a0;
        h(i3, dj2Var, false);
        Layout layout = (Layout) dj2Var.d;
        if (layout != null) {
            int lineForOffset = layout.getLineForOffset(Utilities.j(i3 - dj2Var.a, layout.getText().length(), 0));
            int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
            int[] k = k();
            int lineTop = (int) (((((layout.getLineTop(lineForOffset) + this.b) + k[1]) - lineBottom) - hl.L(8.0f)) + dj2Var.b);
            Object obj = this.W;
            if (obj instanceof vv) {
                i2 = k[0];
                lineRight = ((View) obj).getMeasuredWidth() + i2;
            } else {
                int lineLeft = (int) (layout.getLineLeft(lineForOffset) + k[0] + this.a + dj2Var.c);
                lineRight = (int) (layout.getLineRight(lineForOffset) + k[0] + this.a + dj2Var.c);
                i2 = lineLeft;
            }
            if (i < i2) {
                i = i2;
            } else if (i > lineRight) {
                i = lineRight;
            }
            float f = this.I;
            float f2 = lineTop;
            if (f != f2) {
                this.I = f2;
                this.J = (f2 - this.H) / 200.0f;
                f = f2;
            }
            float f3 = this.L;
            float f4 = i;
            if (f3 != f4) {
                this.L = f4;
                this.M = (f4 - this.K) / 100.0f;
                f3 = f4;
            }
            Magnifier magnifier = this.G;
            if (magnifier == null) {
                Magnifier magnifier2 = new Magnifier(this.C);
                this.G = magnifier2;
                float f5 = this.I;
                this.H = f5;
                f3 = this.L;
                this.K = f3;
                f = f5;
                magnifier = magnifier2;
            }
            float f6 = this.H;
            if (f6 != f) {
                f6 += this.J * 16.0f;
                this.H = f6;
            }
            float f7 = this.J;
            if (f7 > 0.0f && f6 > f) {
                this.H = f;
            } else if (f7 >= 0.0f || f6 >= f) {
                f = f6;
            } else {
                this.H = f;
            }
            float f8 = this.K;
            if (f8 != f3) {
                f8 += this.M * 16.0f;
                this.K = f8;
            }
            float f9 = this.M;
            if (f9 > 0.0f && f8 > f3) {
                this.K = f3;
            } else if (f9 >= 0.0f || f8 >= f3) {
                f3 = f8;
            } else {
                this.K = f3;
            }
            magnifier.show(f3, (lineBottom * 1.5f) + f + hl.L(8.0f));
            this.G.update();
        }
    }

    public final void U() {
        this.Q = false;
        this.C.invalidate();
        s8b s8bVar = this.m0;
        hl.r(s8bVar);
        hl.c3(s8bVar);
    }

    public boolean a() {
        return true;
    }

    public boolean b(int i) {
        return (i == this.u || i == this.v) ? false : true;
    }

    public boolean c() {
        return this.W != null;
    }

    public boolean d() {
        return false;
    }

    public void e(boolean z) {
        D(z);
        this.u = -1;
        this.v = -1;
        u();
        t();
        v();
        this.W = null;
        this.w = 0;
        hl.r(this.f0);
        this.z = false;
        lmb lmbVar = this.C;
        if (lmbVar != null) {
            lmbVar.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        b0f b0fVar = this.D;
        if (b0fVar != null) {
            b0fVar.a(false);
        }
        this.s = -1;
        this.t = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = false;
    }

    public final void f(Layout layout, int i, int i2, int i3, boolean z, boolean z2, float f) {
        float f2;
        float f3;
        int i4;
        jx2 jx2Var;
        float f4;
        gmb gmbVar = this.o0;
        gmbVar.reset();
        layout.getSelectionPath(i2, i3, gmbVar);
        if (gmbVar.a < layout.getLineBottom(i)) {
            int lineTop = layout.getLineTop(i);
            float lineBottom = layout.getLineBottom(i) - lineTop;
            f3 = lineTop;
            f2 = lineBottom / (gmbVar.a - f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        int i5 = 0;
        while (true) {
            i4 = gmbVar.c;
            jx2Var = this.q;
            f4 = this.n;
            if (i5 >= i4) {
                break;
            }
            RectF rectF = (RectF) gmbVar.b.get(i5);
            rectF.set((int) (Math.max(f, rectF.left) - (z ? f4 / 2.0f : 0.0f)), (int) qd4.A(rectF.top, f3, f2, f3), (int) (Math.max(f, rectF.right) + (z2 ? f4 / 2.0f : 0.0f)), (int) qd4.A(rectF.bottom, f3, f2, f3));
            jx2Var.addRect(rectF, Path.Direction.CW);
            i5++;
        }
        if (i4 != 0 || z2) {
            return;
        }
        try {
            jx2Var.addRect(((int) layout.getPrimaryHorizontal(i2)) - (f4 / 2.0f), layout.getLineTop(i), (f4 / 4.0f) + ((int) layout.getPrimaryHorizontal(i3)), layout.getLineBottom(i), Path.Direction.CW);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103 A[LOOP:1: B:68:0x0101->B:69:0x0103, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, Layout layout, int i, int i2, boolean z, boolean z2, float f) {
        int i3;
        Rect rect;
        int i4;
        float f2;
        int i5;
        Path path;
        int i6;
        int i7;
        mmb mmbVar;
        int i8;
        float lineRight;
        jx2 jx2Var;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int j = Utilities.j(i, layout.getText().length(), 0);
        int j2 = Utilities.j(i2, layout.getText().length(), 0);
        jx2 jx2Var2 = this.q;
        jx2Var2.reset();
        Path path2 = this.r;
        path2.reset();
        float f3 = this.n;
        float f4 = f3 * 1.65f;
        int i9 = (int) (f3 / 2.0f);
        int lineForOffset = layout.getLineForOffset(j);
        int lineForOffset2 = layout.getLineForOffset(j2);
        if (lineForOffset == lineForOffset2) {
            f(layout, lineForOffset, j, j2, !z, !z2, f);
            mmbVar = this;
            path = path2;
            f2 = f4;
            i6 = lineForOffset;
            i7 = j;
            i5 = lineForOffset2;
        } else {
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == -1 || lineEnd <= 0) {
                i3 = lineEnd;
            } else {
                i3 = lineEnd - 1;
                CharSequence text = layout.getText();
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(i3);
                if (layout.isRtlCharAt(i3)) {
                    int i10 = i3;
                    while (layout.isRtlCharAt(i10) && i10 != 0) {
                        i10--;
                    }
                    i8 = lineEnd;
                    lineRight = layout.getLineForOffset(i10) == layout.getLineForOffset(i3) ? layout.getPrimaryHorizontal(i10 + 1) : layout.getLineLeft(lineForOffset);
                } else {
                    i8 = lineEnd;
                    lineRight = layout.getLineRight(lineForOffset);
                }
                int i11 = (int) lineRight;
                int min = Math.min(primaryHorizontal, i11);
                int max = Math.max(primaryHorizontal, i11);
                if (i3 > 0 && i3 < text.length() && !Character.isWhitespace(text.charAt(i8 - 2))) {
                    rect = new Rect(((int) Math.max(f, min)) - i9, layout.getLineTop(lineForOffset), ((int) Math.max(f, max)) + i9, layout.getLineBottom(lineForOffset));
                    f(layout, lineForOffset, j, i3, !z, true, f);
                    if (rect != null) {
                        RectF rectF = hl.P;
                        rectF.set(rect);
                        jx2Var2.addRect(rectF, Path.Direction.CW);
                    }
                    i4 = lineForOffset + 1;
                    while (i4 < lineForOffset2) {
                        int lineLeft = (int) layout.getLineLeft(i4);
                        int lineRight2 = (int) layout.getLineRight(i4);
                        int min2 = Math.min(lineLeft, lineRight2);
                        int max2 = Math.max(lineLeft, lineRight2);
                        float max3 = Math.max(f, min2);
                        float f5 = i9;
                        jx2Var2.addRect(max3 - f5, layout.getLineTop(i4), Math.max(f, max2) + f5, layout.getLineBottom(i4) + 1, Path.Direction.CW);
                        i4++;
                        lineForOffset2 = lineForOffset2;
                        i9 = i9;
                        lineForOffset = lineForOffset;
                        path2 = path2;
                        f4 = f4;
                    }
                    int i12 = lineForOffset;
                    f2 = f4;
                    i5 = lineForOffset2;
                    path = path2;
                    i6 = i12;
                    j2 = j2;
                    i7 = j;
                    mmbVar = this;
                    mmbVar.f(layout, i5, layout.getLineStart(i5), j2, true, !z2, f);
                }
            }
            rect = null;
            f(layout, lineForOffset, j, i3, !z, true, f);
            if (rect != null) {
            }
            i4 = lineForOffset + 1;
            while (i4 < lineForOffset2) {
            }
            int i122 = lineForOffset;
            f2 = f4;
            i5 = lineForOffset2;
            path = path2;
            i6 = i122;
            j2 = j2;
            i7 = j;
            mmbVar = this;
            mmbVar.f(layout, i5, layout.getLineStart(i5), j2, true, !z2, f);
        }
        int i13 = Build.VERSION.SDK_INT;
        boolean z3 = i13 >= 26;
        if (z3) {
            canvas.save();
        }
        float primaryHorizontal2 = layout.getPrimaryHorizontal(i7);
        float primaryHorizontal3 = layout.getPrimaryHorizontal(j2);
        float lineBottom = layout.getLineBottom(i6);
        float lineBottom2 = layout.getLineBottom(i5);
        if (z && z2 && lineBottom == lineBottom2 && Math.abs(primaryHorizontal3 - primaryHorizontal2) < f2) {
            float min3 = Math.min(primaryHorizontal2, primaryHorizontal3);
            float max4 = Math.max(primaryHorizontal2, primaryHorizontal3);
            Rect rect2 = hl.Q;
            rect2.set((int) min3, (int) (lineBottom - f2), (int) max4, (int) lineBottom);
            RectF rectF2 = hl.P;
            rectF2.set(rect2);
            path.addRect(rectF2, Path.Direction.CW);
            if (i13 >= 26) {
                canvas.clipOutRect(rect2);
            }
            jx2Var = jx2Var2;
        } else {
            if (!z || layout.isRtlCharAt(i7)) {
                jx2Var = jx2Var2;
            } else {
                Rect rect3 = hl.Q;
                jx2Var = jx2Var2;
                rect3.set((int) primaryHorizontal2, (int) (lineBottom - f2), (int) Math.min(primaryHorizontal2 + f2, layout.getLineRight(i6)), (int) lineBottom);
                RectF rectF3 = hl.P;
                rectF3.set(rect3);
                path.addRect(rectF3, Path.Direction.CW);
                if (i13 >= 26) {
                    rect3.set(rect3.left - ((int) f2), rect3.top, rect3.right, rect3.bottom);
                    canvas.clipOutRect(rect3);
                }
            }
            if (z2 && !layout.isRtlCharAt(j2)) {
                Rect rect4 = hl.Q;
                rect4.set((int) Math.max(primaryHorizontal3 - f2, layout.getLineLeft(i5)), (int) (lineBottom2 - f2), (int) primaryHorizontal3, (int) lineBottom2);
                RectF rectF4 = hl.P;
                rectF4.set(rect4);
                path.addRect(rectF4, Path.Direction.CW);
                if (i13 >= 26) {
                    canvas.clipOutRect(rect4);
                }
            }
        }
        jx2Var.a();
        canvas.drawPath(jx2Var, mmbVar.o);
        if (z3) {
            canvas.restore();
            canvas.drawPath(path, mmbVar.p);
        }
    }

    public abstract void h(int i, dj2 dj2Var, boolean z);

    public boolean i() {
        return false;
    }

    public abstract int j(int i, int i2, int i3, int i4, hmb hmbVar, boolean z);

    public final int[] k() {
        int i;
        View view = (View) this.W;
        int i2 = 0;
        if (view != null && this.F != null) {
            i = 0;
            int i3 = 0;
            while (view != this.F) {
                if (view != null) {
                    i = (int) (view.getY() + i);
                    i3 = (int) (view.getX() + i3);
                    if (view instanceof NestedScrollView) {
                        i -= view.getScrollY();
                        i3 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i2 = i3;
            return new int[]{i2, i};
        }
        i = 0;
        return new int[]{i2, i};
    }

    public abstract int l();

    public final lmb m(Context context) {
        lmb lmbVar = this.C;
        if (lmbVar != null) {
            return lmbVar;
        }
        lmb lmbVar2 = new lmb(this, context);
        this.C = lmbVar2;
        return lmbVar2;
    }

    public int n() {
        return 0;
    }

    public int o() {
        return 0;
    }

    public vnb p() {
        return this.g0;
    }

    public CharSequence q() {
        CharSequence r = r(this.W, false);
        if (r != null) {
            return r.subSequence(this.u, this.v);
        }
        return null;
    }

    public CharSequence r(hmb hmbVar, boolean z) {
        return ((imb) hmbVar).getText();
    }

    public int s(int i) {
        return aob.v0(i, this.g0);
    }

    public final void t() {
        cl4 cl4Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.n0.run();
        }
        this.P = false;
        if (w() || (cl4Var = this.Y) == null) {
            return;
        }
        cl4Var.finish();
        this.Y = null;
    }

    public final void u() {
        Magnifier magnifier;
        if (Build.VERSION.SDK_INT < 28 || (magnifier = this.G) == null) {
            return;
        }
        magnifier.dismiss();
        this.G = null;
    }

    public void v() {
        hmb hmbVar = this.W;
        if (hmbVar != null) {
            hmbVar.invalidate();
        }
        lmb lmbVar = this.C;
        if (lmbVar != null) {
            lmbVar.invalidate();
        }
    }

    public final boolean w() {
        return this.u >= 0 && this.v >= 0;
    }

    public boolean y(r47 r47Var) {
        return r47Var != null && this.w == r47Var.e1();
    }

    public void z(int i, int i2, boolean z, float f, float f2, hmb hmbVar) {
        int i3;
        int i4;
        if (this.j) {
            this.u = i2;
            if (!z && i2 > (i4 = this.v)) {
                this.v = i2;
                this.u = i4;
                this.j = false;
            }
            this.y = true;
            return;
        }
        this.v = i2;
        if (!z && (i3 = this.u) > i2) {
            this.v = i3;
            this.u = i2;
            this.j = true;
        }
        this.y = true;
    }

    public void C() {
    }

    public void E() {
    }

    public void G() {
    }

    public void M() {
    }

    public void N() {
    }

    public void D(boolean z) {
    }

    public void J(float f, float f2) {
    }

    public void H(int i, int i2, r47 r47Var) {
    }
}
