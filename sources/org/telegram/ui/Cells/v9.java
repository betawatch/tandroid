package org.telegram.ui.Cells;

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
import org.telegram.messenger.ij;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class v9 {
    public final g9 A;
    public final Rect B;
    public u9 C;
    public c8.da D;
    public pj0 E;
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
    public q9 W;
    public q9 X;
    public org.telegram.ui.ActionBar.w3 Y;
    public boolean Z;
    public int a;
    public final l9 a0;
    public int b;
    public int b0;
    public int c;
    public final OvershootInterpolator c0;
    public int d;
    public int d0;
    public boolean e;
    public final d9 e0;
    public float f;
    public final d9 f0;
    public float g;
    public org.telegram.ui.ActionBar.f6 g0;
    public final int[] h = new int[2];
    public boolean h0;
    public boolean i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public boolean k;
    public org.telegram.ui.s k0;
    public final int l;
    public ValueAnimator l0;
    public final int m;
    public final f m0;
    public final float n;
    public final d9 n0;
    public final Paint o;
    public final p9 o0;
    public final Paint p;
    public final aq q;
    public final Path r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public v9() {
        new n9().a = 0.0f;
        Paint paint = new Paint(1);
        this.o = paint;
        this.p = new Paint(1);
        aq aqVar = new aq();
        this.q = aqVar;
        this.r = new Path();
        new m9().a = aqVar;
        this.u = -1;
        this.v = -1;
        this.A = new g9(this, new f9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.a0 = new l9();
        this.c0 = new OvershootInterpolator();
        this.e0 = new d9(this, 0);
        this.f0 = new d9(this, 1);
        this.h0 = true;
        this.k0 = null;
        new ArrayList();
        this.m0 = new f(this, 8);
        this.n0 = new d9(this, 2);
        p9 p9Var = new p9();
        p9Var.a = 0.0f;
        p9Var.b = new ArrayList(1);
        p9Var.c = 0;
        this.o0 = p9Var;
        this.l = ViewConfiguration.getLongPressTimeout();
        this.m = ViewConfiguration.get(org.telegram.messenger.t0.b).getScaledTouchSlop();
        float L = org.telegram.messenger.g0.L(6.0f);
        this.n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        aqVar.d = 1.0f;
    }

    public static void a(v9 v9Var, int i7) {
        int lineRight;
        int i10;
        l9 l9Var = v9Var.a0;
        if (Build.VERSION.SDK_INT < 28 || v9Var.W == null || v9Var.k || !v9Var.i || v9Var.C == null) {
            return;
        }
        int i11 = v9Var.j ? v9Var.u : v9Var.v;
        v9Var.i(i11, l9Var, false);
        Layout layout = (Layout) l9Var.d;
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(Utilities.j(i11 - l9Var.a, layout.getText().length(), 0));
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        int[] l10 = v9Var.l();
        int lineTop = (int) (((((layout.getLineTop(lineForOffset) + v9Var.b) + l10[1]) - lineBottom) - org.telegram.messenger.g0.L(8.0f)) + l9Var.b);
        Object obj = v9Var.W;
        if (obj instanceof org.telegram.ui.s2) {
            i10 = l10[0];
            lineRight = ((View) obj).getMeasuredWidth() + i10;
        } else {
            int lineLeft = (int) (layout.getLineLeft(lineForOffset) + l10[0] + v9Var.a + l9Var.c);
            lineRight = (int) (layout.getLineRight(lineForOffset) + l10[0] + v9Var.a + l9Var.c);
            i10 = lineLeft;
        }
        if (i7 < i10) {
            i7 = i10;
        } else if (i7 > lineRight) {
            i7 = lineRight;
        }
        float f10 = lineTop;
        if (v9Var.I != f10) {
            v9Var.I = f10;
            v9Var.J = (f10 - v9Var.H) / 200.0f;
        }
        float f11 = i7;
        if (v9Var.L != f11) {
            v9Var.L = f11;
            v9Var.M = (f11 - v9Var.K) / 100.0f;
        }
        if (v9Var.G == null) {
            v9Var.G = new Magnifier(v9Var.C);
            v9Var.H = v9Var.I;
            v9Var.K = v9Var.L;
        }
        float f12 = v9Var.H;
        float f13 = v9Var.I;
        if (f12 != f13) {
            v9Var.H = (v9Var.J * 16.0f) + f12;
        }
        float f14 = v9Var.J;
        if (f14 > 0.0f && v9Var.H > f13) {
            v9Var.H = f13;
        } else if (f14 < 0.0f && v9Var.H < f13) {
            v9Var.H = f13;
        }
        float f15 = v9Var.K;
        float f16 = v9Var.L;
        if (f15 != f16) {
            v9Var.K = (v9Var.M * 16.0f) + f15;
        }
        float f17 = v9Var.M;
        if (f17 > 0.0f && v9Var.K > f16) {
            v9Var.K = f16;
        } else if (f17 < 0.0f && v9Var.K < f16) {
            v9Var.K = f16;
        }
        v9Var.G.show(v9Var.K, (lineBottom * 1.5f) + v9Var.H + org.telegram.messenger.g0.L(8.0f));
        v9Var.G.update();
    }

    public static boolean y(char c10) {
        return Character.isLetter(c10) || Character.isDigit(c10) || c10 == '_';
    }

    public void A(int i7, int i10, boolean z9, float f10, float f11, q9 q9Var) {
        int i11;
        int i12;
        if (this.j) {
            this.u = i10;
            if (!z9 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.u = i12;
                this.j = false;
            }
            this.y = true;
            return;
        }
        this.v = i10;
        if (!z9 && (i11 = this.u) > i10) {
            this.v = i11;
            this.u = i10;
            this.j = true;
        }
        this.y = true;
    }

    public final int[] B(int i7) {
        l9 l9Var = this.a0;
        i(i7, l9Var, false);
        Layout layout = (Layout) l9Var.d;
        int i10 = i7 - l9Var.a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + l9Var.c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + l9Var.b);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        u9 u9Var;
        if (!x() || (u9Var = this.C) == null) {
            return;
        }
        this.Q = true;
        u9Var.invalidate();
        u();
    }

    public boolean J() {
        return false;
    }

    public abstract void L(q9 q9Var, q9 q9Var2);

    public final boolean M(MotionEvent motionEvent) {
        v9 v9Var;
        int action = motionEvent.getAction();
        d9 d9Var = this.f0;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y10 = (int) motionEvent.getY();
                    int x10 = (int) motionEvent.getX();
                    int i7 = this.t - y10;
                    int i10 = this.s - x10;
                    int i11 = (i10 * i10) + (i7 * i7);
                    int i12 = this.m;
                    if (i11 > i12 * i12) {
                        org.telegram.messenger.g0.r(d9Var);
                        this.z = false;
                    }
                    return this.z;
                }
                if (action != 3) {
                    return false;
                }
            }
            org.telegram.messenger.g0.r(d9Var);
            this.z = false;
            return false;
        }
        this.s = (int) motionEvent.getX();
        this.t = (int) motionEvent.getY();
        this.z = false;
        int i13 = -org.telegram.messenger.g0.L(8.0f);
        int i14 = -org.telegram.messenger.g0.L(8.0f);
        Rect rect = this.B;
        rect.inset(i13, i14);
        if (!rect.contains(this.s, this.t) || this.X == null) {
            v9Var = this;
        } else {
            rect.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            int i15 = this.s;
            int i16 = this.t;
            int i17 = rect.right;
            if (i15 > i17) {
                i15 = i17 - 1;
            }
            int i18 = rect.left;
            if (i15 < i18) {
                i15 = i18 + 1;
            }
            int i19 = i15;
            int i20 = rect.top;
            if (i16 < i20) {
                i16 = i20 + 1;
            }
            int i21 = rect.bottom;
            if (i16 > i21) {
                i16 = i21 - 1;
            }
            v9Var = this;
            int k10 = v9Var.k(i19, i16, this.c, this.d, this.X, true);
            CharSequence s5 = s(v9Var.X, true);
            if (k10 >= s5.length()) {
                l9 l9Var = v9Var.a0;
                i(k10, l9Var, true);
                Layout layout = (Layout) l9Var.d;
                if (layout == null) {
                    v9Var.z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i19 - v9Var.c;
                if (f10 < ((Layout) l9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) l9Var.d).getLineLeft(lineCount)) {
                    k10 = s5.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s5.length() && s5.charAt(k10) != '\n') {
                org.telegram.messenger.g0.r(d9Var);
                org.telegram.messenger.g0.i3(d9Var, v9Var.l);
                v9Var.z = true;
            }
        }
        return v9Var.z;
    }

    public boolean P(int i7, int i10) {
        return false;
    }

    public final void Q(di.h2 h2Var) {
        this.D = h2Var;
    }

    public final void R() {
        this.i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof pj0) {
            this.E = (pj0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.w3 w3Var = this.Y;
                g9 g9Var = this.A;
                if (w3Var == null) {
                    org.telegram.ui.ActionBar.w3 w3Var2 = new org.telegram.ui.ActionBar.w3(this.C.getContext(), g9Var, this.C, new org.telegram.ui.ActionBar.k4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = w3Var2;
                    g9Var.onCreateActionMode(w3Var2, w3Var2.c);
                }
                org.telegram.ui.ActionBar.w3 w3Var3 = this.Y;
                g9Var.onPrepareActionMode(w3Var3, w3Var3.c);
                this.Y.hide(1L);
            }
            org.telegram.messenger.g0.r(this.n0);
            this.P = true;
        }
    }

    public final void U() {
        if (this.V == 1.0f || this.C == null) {
            return;
        }
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 1.0f);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new r(this, 7));
        this.l0.setDuration((long) (Math.abs(1.0f - this.V) * 250.0f));
        this.l0.start();
    }

    public final void V() {
        this.Q = false;
        this.C.invalidate();
        f fVar = this.m0;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.h3(fVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i7) {
        return (i7 == this.u || i7 == this.v) ? false : true;
    }

    public boolean d() {
        return this.W != null;
    }

    public boolean e() {
        return false;
    }

    public void f(boolean z9) {
        E(z9);
        this.u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.w = 0;
        org.telegram.messenger.g0.r(this.f0);
        this.z = false;
        u9 u9Var = this.C;
        if (u9Var != null) {
            u9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        c8.da daVar = this.D;
        if (daVar != null) {
            daVar.a(false);
        }
        this.s = -1;
        this.t = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = false;
    }

    public final void g(Layout layout, int i7, int i10, int i11, boolean z9, boolean z10, float f10) {
        float f11;
        float f12;
        int i12;
        aq aqVar;
        float f13;
        p9 p9Var = this.o0;
        p9Var.reset();
        layout.getSelectionPath(i10, i11, p9Var);
        if (p9Var.a < layout.getLineBottom(i7)) {
            int lineTop = layout.getLineTop(i7);
            float lineBottom = layout.getLineBottom(i7) - lineTop;
            f12 = lineTop;
            f11 = lineBottom / (p9Var.a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = p9Var.c;
            aqVar = this.q;
            f13 = this.n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) p9Var.b.get(i13);
            rectF.set((int) (Math.max(f10, rectF.left) - (z9 ? f13 / 2.0f : 0.0f)), (int) com.google.android.recaptcha.internal.a.z(rectF.top, f12, f11, f12), (int) (Math.max(f10, rectF.right) + (z10 ? f13 / 2.0f : 0.0f)), (int) com.google.android.recaptcha.internal.a.z(rectF.bottom, f12, f11, f12));
            aqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 != 0 || z10) {
            return;
        }
        try {
            aqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i7), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i7), Path.Direction.CW);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[LOOP:1: B:68:0x0104->B:69:0x0106, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Canvas canvas, Layout layout, int i7, int i10, boolean z9, boolean z10, float f10) {
        int i11;
        Rect rect;
        int i12;
        float f11;
        int i13;
        Path path;
        int i14;
        int i15;
        v9 v9Var;
        int i16;
        float lineRight;
        aq aqVar;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int j3 = Utilities.j(i7, layout.getText().length(), 0);
        int j10 = Utilities.j(i10, layout.getText().length(), 0);
        aq aqVar2 = this.q;
        aqVar2.reset();
        Path path2 = this.r;
        path2.reset();
        float f12 = this.n;
        float f13 = f12 * 1.65f;
        int i17 = (int) (f12 / 2.0f);
        int lineForOffset = layout.getLineForOffset(j3);
        int lineForOffset2 = layout.getLineForOffset(j10);
        if (lineForOffset == lineForOffset2) {
            g(layout, lineForOffset, j3, j10, !z9, !z10, f10);
            v9Var = this;
            path = path2;
            f11 = f13;
            i14 = lineForOffset;
            i15 = j3;
            i13 = lineForOffset2;
        } else {
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == -1 || lineEnd <= 0) {
                i11 = lineEnd;
            } else {
                i11 = lineEnd - 1;
                CharSequence text = layout.getText();
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(i11);
                if (layout.isRtlCharAt(i11)) {
                    int i18 = i11;
                    while (layout.isRtlCharAt(i18) && i18 != 0) {
                        i18--;
                    }
                    i16 = lineEnd;
                    lineRight = layout.getLineForOffset(i18) == layout.getLineForOffset(i11) ? layout.getPrimaryHorizontal(i18 + 1) : layout.getLineLeft(lineForOffset);
                } else {
                    i16 = lineEnd;
                    lineRight = layout.getLineRight(lineForOffset);
                }
                int i19 = (int) lineRight;
                int min = Math.min(primaryHorizontal, i19);
                int max = Math.max(primaryHorizontal, i19);
                if (i11 > 0 && i11 < text.length() && !Character.isWhitespace(text.charAt(i16 - 2))) {
                    rect = new Rect(((int) Math.max(f10, min)) - i17, layout.getLineTop(lineForOffset), ((int) Math.max(f10, max)) + i17, layout.getLineBottom(lineForOffset));
                    g(layout, lineForOffset, j3, i11, !z9, true, f10);
                    if (rect != null) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(rect);
                        aqVar2.addRect(rectF, Path.Direction.CW);
                    }
                    i12 = lineForOffset + 1;
                    while (i12 < lineForOffset2) {
                        int lineLeft = (int) layout.getLineLeft(i12);
                        int lineRight2 = (int) layout.getLineRight(i12);
                        int min2 = Math.min(lineLeft, lineRight2);
                        int max2 = Math.max(lineLeft, lineRight2);
                        float max3 = Math.max(f10, min2);
                        float f14 = i17;
                        aqVar2.addRect(max3 - f14, layout.getLineTop(i12), Math.max(f10, max2) + f14, layout.getLineBottom(i12) + 1, Path.Direction.CW);
                        i12++;
                        lineForOffset2 = lineForOffset2;
                        i17 = i17;
                        lineForOffset = lineForOffset;
                        path2 = path2;
                        f13 = f13;
                    }
                    int i20 = lineForOffset;
                    f11 = f13;
                    i13 = lineForOffset2;
                    path = path2;
                    i14 = i20;
                    j10 = j10;
                    i15 = j3;
                    v9Var = this;
                    v9Var.g(layout, i13, layout.getLineStart(i13), j10, true, !z10, f10);
                }
            }
            rect = null;
            g(layout, lineForOffset, j3, i11, !z9, true, f10);
            if (rect != null) {
            }
            i12 = lineForOffset + 1;
            while (i12 < lineForOffset2) {
            }
            int i202 = lineForOffset;
            f11 = f13;
            i13 = lineForOffset2;
            path = path2;
            i14 = i202;
            j10 = j10;
            i15 = j3;
            v9Var = this;
            v9Var.g(layout, i13, layout.getLineStart(i13), j10, true, !z10, f10);
        }
        int i21 = Build.VERSION.SDK_INT;
        boolean z11 = i21 >= 26;
        if (z11) {
            canvas.save();
        }
        float primaryHorizontal2 = layout.getPrimaryHorizontal(i15);
        float primaryHorizontal3 = layout.getPrimaryHorizontal(j10);
        float lineBottom = layout.getLineBottom(i14);
        float lineBottom2 = layout.getLineBottom(i13);
        if (z9 && z10 && lineBottom == lineBottom2 && Math.abs(primaryHorizontal3 - primaryHorizontal2) < f11) {
            float min3 = Math.min(primaryHorizontal2, primaryHorizontal3);
            float max4 = Math.max(primaryHorizontal2, primaryHorizontal3);
            Rect rect2 = org.telegram.messenger.g0.Q;
            rect2.set((int) min3, (int) (lineBottom - f11), (int) max4, (int) lineBottom);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rect2);
            path.addRect(rectF2, Path.Direction.CW);
            if (i21 >= 26) {
                canvas.clipOutRect(rect2);
            }
            aqVar = aqVar2;
        } else {
            if (!z9 || layout.isRtlCharAt(i15)) {
                aqVar = aqVar2;
            } else {
                Rect rect3 = org.telegram.messenger.g0.Q;
                aqVar = aqVar2;
                rect3.set((int) primaryHorizontal2, (int) (lineBottom - f11), (int) Math.min(primaryHorizontal2 + f11, layout.getLineRight(i14)), (int) lineBottom);
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(rect3);
                path.addRect(rectF3, Path.Direction.CW);
                if (i21 >= 26) {
                    rect3.set(rect3.left - ((int) f11), rect3.top, rect3.right, rect3.bottom);
                    canvas.clipOutRect(rect3);
                }
            }
            if (z10 && !layout.isRtlCharAt(j10)) {
                Rect rect4 = org.telegram.messenger.g0.Q;
                rect4.set((int) Math.max(primaryHorizontal3 - f11, layout.getLineLeft(i13)), (int) (lineBottom2 - f11), (int) primaryHorizontal3, (int) lineBottom2);
                RectF rectF4 = org.telegram.messenger.g0.P;
                rectF4.set(rect4);
                path.addRect(rectF4, Path.Direction.CW);
                if (i21 >= 26) {
                    canvas.clipOutRect(rect4);
                }
            }
        }
        aqVar.a();
        canvas.drawPath(aqVar, v9Var.o);
        if (z11) {
            canvas.restore();
            canvas.drawPath(path, v9Var.p);
        }
    }

    public abstract void i(int i7, l9 l9Var, boolean z9);

    public boolean j() {
        return false;
    }

    public abstract int k(int i7, int i10, int i11, int i12, q9 q9Var, boolean z9);

    public final int[] l() {
        int i7;
        View view = (View) this.W;
        int i10 = 0;
        if (view != null && this.F != null) {
            i7 = 0;
            int i11 = 0;
            while (view != this.F) {
                if (view != null) {
                    i7 = (int) (view.getY() + i7);
                    i11 = (int) (view.getX() + i11);
                    if (view instanceof NestedScrollView) {
                        i7 -= view.getScrollY();
                        i11 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i10 = i11;
            return new int[]{i10, i7};
        }
        i7 = 0;
        return new int[]{i10, i7};
    }

    public abstract int m();

    public final u9 n(Context context) {
        if (this.C == null) {
            this.C = new u9(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.f6 q() {
        return this.g0;
    }

    public CharSequence r() {
        CharSequence s5 = s(this.W, false);
        if (s5 != null) {
            return s5.subSequence(this.u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(q9 q9Var, boolean z9);

    public int t(int i7) {
        return org.telegram.ui.ActionBar.k6.w0(i7, this.g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.w3 w3Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.n0.run();
        }
        this.P = false;
        if (x() || (w3Var = this.Y) == null) {
            return;
        }
        w3Var.finish();
        this.Y = null;
    }

    public final void v() {
        Magnifier magnifier;
        if (Build.VERSION.SDK_INT < 28 || (magnifier = this.G) == null) {
            return;
        }
        magnifier.dismiss();
        this.G = null;
    }

    public void w() {
        q9 q9Var = this.W;
        if (q9Var != null) {
            q9Var.invalidate();
        }
        u9 u9Var = this.C;
        if (u9Var != null) {
            u9Var.invalidate();
        }
    }

    public final boolean x() {
        return this.u >= 0 && this.v >= 0;
    }

    public boolean z(ij ijVar) {
        return ijVar != null && this.w == ijVar.f1();
    }

    public void E(boolean z9) {
    }

    public void D() {
    }

    public void F() {
    }

    public void H() {
    }

    public void N() {
    }

    public void O() {
    }

    public void K(float f10, float f11) {
    }

    public void I(int i7, int i10, ij ijVar) {
    }
}
