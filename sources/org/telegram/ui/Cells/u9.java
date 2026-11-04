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
import b8.hf;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class u9 {
    public final f9 A;
    public final Rect B;
    public t9 C;
    public hf D;
    public tj0 E;
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
    public p9 W;
    public p9 X;
    public org.telegram.ui.ActionBar.u3 Y;
    public boolean Z;
    public int a;
    public final k9 a0;
    public int b;
    public int b0;
    public int c;
    public final OvershootInterpolator c0;
    public int d;
    public int d0;
    public boolean e;
    public final c9 e0;
    public float f;
    public final c9 f0;
    public float g;
    public org.telegram.ui.ActionBar.e6 g0;
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
    public final c9 n0;
    public final Paint o;
    public final o9 o0;
    public final Paint p;
    public final bq q;
    public final Path r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public u9() {
        new m9().a = 0.0f;
        Paint paint = new Paint(1);
        this.o = paint;
        this.p = new Paint(1);
        bq bqVar = new bq();
        this.q = bqVar;
        this.r = new Path();
        new l9().a = bqVar;
        this.u = -1;
        this.v = -1;
        this.A = new f9(this, new e9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.a0 = new k9();
        this.c0 = new OvershootInterpolator();
        this.e0 = new c9(this, 0);
        this.f0 = new c9(this, 1);
        this.h0 = true;
        this.k0 = null;
        new ArrayList();
        this.m0 = new f(this, 8);
        this.n0 = new c9(this, 2);
        o9 o9Var = new o9();
        o9Var.a = 0.0f;
        o9Var.b = new ArrayList(1);
        o9Var.c = 0;
        this.o0 = o9Var;
        this.l = ViewConfiguration.getLongPressTimeout();
        this.m = ViewConfiguration.get(org.telegram.messenger.t0.b).getScaledTouchSlop();
        float L = org.telegram.messenger.g0.L(6.0f);
        this.n = L;
        paint.setPathEffect(new CornerPathEffect(L));
        bqVar.d = 1.0f;
    }

    public static void a(u9 u9Var, int i3) {
        int lineRight;
        int i10;
        k9 k9Var = u9Var.a0;
        if (Build.VERSION.SDK_INT < 28 || u9Var.W == null || u9Var.k || !u9Var.i || u9Var.C == null) {
            return;
        }
        int i11 = u9Var.j ? u9Var.u : u9Var.v;
        u9Var.i(i11, k9Var, false);
        Layout layout = (Layout) k9Var.d;
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(Utilities.j(i11 - k9Var.a, layout.getText().length(), 0));
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        int[] l10 = u9Var.l();
        int lineTop = (int) (((((layout.getLineTop(lineForOffset) + u9Var.b) + l10[1]) - lineBottom) - org.telegram.messenger.g0.L(8.0f)) + k9Var.b);
        Object obj = u9Var.W;
        if (obj instanceof org.telegram.ui.t2) {
            i10 = l10[0];
            lineRight = ((View) obj).getMeasuredWidth() + i10;
        } else {
            int lineLeft = (int) (layout.getLineLeft(lineForOffset) + l10[0] + u9Var.a + k9Var.c);
            lineRight = (int) (layout.getLineRight(lineForOffset) + l10[0] + u9Var.a + k9Var.c);
            i10 = lineLeft;
        }
        if (i3 < i10) {
            i3 = i10;
        } else if (i3 > lineRight) {
            i3 = lineRight;
        }
        float f10 = lineTop;
        if (u9Var.I != f10) {
            u9Var.I = f10;
            u9Var.J = (f10 - u9Var.H) / 200.0f;
        }
        float f11 = i3;
        if (u9Var.L != f11) {
            u9Var.L = f11;
            u9Var.M = (f11 - u9Var.K) / 100.0f;
        }
        if (u9Var.G == null) {
            u9Var.G = new Magnifier(u9Var.C);
            u9Var.H = u9Var.I;
            u9Var.K = u9Var.L;
        }
        float f12 = u9Var.H;
        float f13 = u9Var.I;
        if (f12 != f13) {
            u9Var.H = (u9Var.J * 16.0f) + f12;
        }
        float f14 = u9Var.J;
        if (f14 > 0.0f && u9Var.H > f13) {
            u9Var.H = f13;
        } else if (f14 < 0.0f && u9Var.H < f13) {
            u9Var.H = f13;
        }
        float f15 = u9Var.K;
        float f16 = u9Var.L;
        if (f15 != f16) {
            u9Var.K = (u9Var.M * 16.0f) + f15;
        }
        float f17 = u9Var.M;
        if (f17 > 0.0f && u9Var.K > f16) {
            u9Var.K = f16;
        } else if (f17 < 0.0f && u9Var.K < f16) {
            u9Var.K = f16;
        }
        u9Var.G.show(u9Var.K, (lineBottom * 1.5f) + u9Var.H + org.telegram.messenger.g0.L(8.0f));
        u9Var.G.update();
    }

    public static boolean y(char c2) {
        return Character.isLetter(c2) || Character.isDigit(c2) || c2 == '_';
    }

    public void A(int i3, int i10, boolean z10, float f10, float f11, p9 p9Var) {
        int i11;
        int i12;
        if (this.j) {
            this.u = i10;
            if (!z10 && i10 > (i12 = this.v)) {
                this.v = i10;
                this.u = i12;
                this.j = false;
            }
            this.y = true;
            return;
        }
        this.v = i10;
        if (!z10 && (i11 = this.u) > i10) {
            this.v = i11;
            this.u = i10;
            this.j = true;
        }
        this.y = true;
    }

    public final int[] B(int i3) {
        k9 k9Var = this.a0;
        i(i3, k9Var, false);
        Layout layout = (Layout) k9Var.d;
        int i10 = i3 - k9Var.a;
        int[] iArr = this.h;
        if (layout != null && i10 >= 0 && i10 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i10);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i10) + k9Var.c);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + k9Var.b);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        t9 t9Var;
        if (!x() || (t9Var = this.C) == null) {
            return;
        }
        this.Q = true;
        t9Var.invalidate();
        u();
    }

    public boolean J() {
        return false;
    }

    public abstract void L(p9 p9Var, p9 p9Var2);

    public final boolean M(MotionEvent motionEvent) {
        u9 u9Var;
        int action = motionEvent.getAction();
        c9 c9Var = this.f0;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y9 = (int) motionEvent.getY();
                    int x10 = (int) motionEvent.getX();
                    int i3 = this.t - y9;
                    int i10 = this.s - x10;
                    int i11 = (i10 * i10) + (i3 * i3);
                    int i12 = this.m;
                    if (i11 > i12 * i12) {
                        org.telegram.messenger.g0.r(c9Var);
                        this.z = false;
                    }
                    return this.z;
                }
                if (action != 3) {
                    return false;
                }
            }
            org.telegram.messenger.g0.r(c9Var);
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
            u9Var = this;
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
            u9Var = this;
            int k10 = u9Var.k(i19, i16, this.c, this.d, this.X, true);
            CharSequence s6 = s(u9Var.X, true);
            if (k10 >= s6.length()) {
                k9 k9Var = u9Var.a0;
                i(k10, k9Var, true);
                Layout layout = (Layout) k9Var.d;
                if (layout == null) {
                    u9Var.z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f10 = i19 - u9Var.c;
                if (f10 < ((Layout) k9Var.d).getLineRight(lineCount) + org.telegram.messenger.g0.L(4.0f) && f10 > ((Layout) k9Var.d).getLineLeft(lineCount)) {
                    k10 = s6.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s6.length() && s6.charAt(k10) != '\n') {
                org.telegram.messenger.g0.r(c9Var);
                org.telegram.messenger.g0.i3(c9Var, u9Var.l);
                u9Var.z = true;
            }
        }
        return u9Var.z;
    }

    public boolean P(int i3, int i10) {
        return false;
    }

    public final void Q(ei.l2 l2Var) {
        this.D = l2Var;
    }

    public final void R() {
        this.i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof tj0) {
            this.E = (tj0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.u3 u3Var = this.Y;
                f9 f9Var = this.A;
                if (u3Var == null) {
                    org.telegram.ui.ActionBar.u3 u3Var2 = new org.telegram.ui.ActionBar.u3(this.C.getContext(), f9Var, this.C, new org.telegram.ui.ActionBar.k4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = u3Var2;
                    f9Var.onCreateActionMode(u3Var2, u3Var2.c);
                }
                org.telegram.ui.ActionBar.u3 u3Var3 = this.Y;
                f9Var.onPrepareActionMode(u3Var3, u3Var3.c);
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

    public boolean c(int i3) {
        return (i3 == this.u || i3 == this.v) ? false : true;
    }

    public boolean d() {
        return this.W != null;
    }

    public boolean e() {
        return false;
    }

    public void f(boolean z10) {
        E(z10);
        this.u = -1;
        this.v = -1;
        v();
        u();
        w();
        this.W = null;
        this.w = 0;
        org.telegram.messenger.g0.r(this.f0);
        this.z = false;
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        hf hfVar = this.D;
        if (hfVar != null) {
            hfVar.a(false);
        }
        this.s = -1;
        this.t = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = false;
    }

    public final void g(Layout layout, int i3, int i10, int i11, boolean z10, boolean z11, float f10) {
        float f11;
        float f12;
        int i12;
        bq bqVar;
        float f13;
        o9 o9Var = this.o0;
        o9Var.reset();
        layout.getSelectionPath(i10, i11, o9Var);
        if (o9Var.a < layout.getLineBottom(i3)) {
            int lineTop = layout.getLineTop(i3);
            float lineBottom = layout.getLineBottom(i3) - lineTop;
            f12 = lineTop;
            f11 = lineBottom / (o9Var.a - f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        int i13 = 0;
        while (true) {
            i12 = o9Var.c;
            bqVar = this.q;
            f13 = this.n;
            if (i13 >= i12) {
                break;
            }
            RectF rectF = (RectF) o9Var.b.get(i13);
            rectF.set((int) (Math.max(f10, rectF.left) - (z10 ? f13 / 2.0f : 0.0f)), (int) com.google.android.recaptcha.internal.a.y(rectF.top, f12, f11, f12), (int) (Math.max(f10, rectF.right) + (z11 ? f13 / 2.0f : 0.0f)), (int) com.google.android.recaptcha.internal.a.y(rectF.bottom, f12, f11, f12));
            bqVar.addRect(rectF, Path.Direction.CW);
            i13++;
        }
        if (i12 != 0 || z11) {
            return;
        }
        try {
            bqVar.addRect(((int) layout.getPrimaryHorizontal(i10)) - (f13 / 2.0f), layout.getLineTop(i3), (f13 / 4.0f) + ((int) layout.getPrimaryHorizontal(i11)), layout.getLineBottom(i3), Path.Direction.CW);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[LOOP:1: B:68:0x0104->B:69:0x0106, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Canvas canvas, Layout layout, int i3, int i10, boolean z10, boolean z11, float f10) {
        int i11;
        Rect rect;
        int i12;
        float f11;
        int i13;
        Path path;
        int i14;
        int i15;
        u9 u9Var;
        int i16;
        float lineRight;
        bq bqVar;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int j10 = Utilities.j(i3, layout.getText().length(), 0);
        int j11 = Utilities.j(i10, layout.getText().length(), 0);
        bq bqVar2 = this.q;
        bqVar2.reset();
        Path path2 = this.r;
        path2.reset();
        float f12 = this.n;
        float f13 = f12 * 1.65f;
        int i17 = (int) (f12 / 2.0f);
        int lineForOffset = layout.getLineForOffset(j10);
        int lineForOffset2 = layout.getLineForOffset(j11);
        if (lineForOffset == lineForOffset2) {
            g(layout, lineForOffset, j10, j11, !z10, !z11, f10);
            u9Var = this;
            path = path2;
            f11 = f13;
            i14 = lineForOffset;
            i15 = j10;
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
                    g(layout, lineForOffset, j10, i11, !z10, true, f10);
                    if (rect != null) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(rect);
                        bqVar2.addRect(rectF, Path.Direction.CW);
                    }
                    i12 = lineForOffset + 1;
                    while (i12 < lineForOffset2) {
                        int lineLeft = (int) layout.getLineLeft(i12);
                        int lineRight2 = (int) layout.getLineRight(i12);
                        int min2 = Math.min(lineLeft, lineRight2);
                        int max2 = Math.max(lineLeft, lineRight2);
                        float max3 = Math.max(f10, min2);
                        float f14 = i17;
                        bqVar2.addRect(max3 - f14, layout.getLineTop(i12), Math.max(f10, max2) + f14, layout.getLineBottom(i12) + 1, Path.Direction.CW);
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
                    j11 = j11;
                    i15 = j10;
                    u9Var = this;
                    u9Var.g(layout, i13, layout.getLineStart(i13), j11, true, !z11, f10);
                }
            }
            rect = null;
            g(layout, lineForOffset, j10, i11, !z10, true, f10);
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
            j11 = j11;
            i15 = j10;
            u9Var = this;
            u9Var.g(layout, i13, layout.getLineStart(i13), j11, true, !z11, f10);
        }
        int i21 = Build.VERSION.SDK_INT;
        boolean z12 = i21 >= 26;
        if (z12) {
            canvas.save();
        }
        float primaryHorizontal2 = layout.getPrimaryHorizontal(i15);
        float primaryHorizontal3 = layout.getPrimaryHorizontal(j11);
        float lineBottom = layout.getLineBottom(i14);
        float lineBottom2 = layout.getLineBottom(i13);
        if (z10 && z11 && lineBottom == lineBottom2 && Math.abs(primaryHorizontal3 - primaryHorizontal2) < f11) {
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
            bqVar = bqVar2;
        } else {
            if (!z10 || layout.isRtlCharAt(i15)) {
                bqVar = bqVar2;
            } else {
                Rect rect3 = org.telegram.messenger.g0.Q;
                bqVar = bqVar2;
                rect3.set((int) primaryHorizontal2, (int) (lineBottom - f11), (int) Math.min(primaryHorizontal2 + f11, layout.getLineRight(i14)), (int) lineBottom);
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(rect3);
                path.addRect(rectF3, Path.Direction.CW);
                if (i21 >= 26) {
                    rect3.set(rect3.left - ((int) f11), rect3.top, rect3.right, rect3.bottom);
                    canvas.clipOutRect(rect3);
                }
            }
            if (z11 && !layout.isRtlCharAt(j11)) {
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
        bqVar.a();
        canvas.drawPath(bqVar, u9Var.o);
        if (z12) {
            canvas.restore();
            canvas.drawPath(path, u9Var.p);
        }
    }

    public abstract void i(int i3, k9 k9Var, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i3, int i10, int i11, int i12, p9 p9Var, boolean z10);

    public final int[] l() {
        int i3;
        View view = (View) this.W;
        int i10 = 0;
        if (view != null && this.F != null) {
            i3 = 0;
            int i11 = 0;
            while (view != this.F) {
                if (view != null) {
                    i3 = (int) (view.getY() + i3);
                    i11 = (int) (view.getX() + i11);
                    if (view instanceof NestedScrollView) {
                        i3 -= view.getScrollY();
                        i11 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i10 = i11;
            return new int[]{i10, i3};
        }
        i3 = 0;
        return new int[]{i10, i3};
    }

    public abstract int m();

    public final t9 n(Context context) {
        if (this.C == null) {
            this.C = new t9(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.e6 q() {
        return this.g0;
    }

    public CharSequence r() {
        CharSequence s6 = s(this.W, false);
        if (s6 != null) {
            return s6.subSequence(this.u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(p9 p9Var, boolean z10);

    public int t(int i3) {
        return org.telegram.ui.ActionBar.k6.w0(i3, this.g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.u3 u3Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.n0.run();
        }
        this.P = false;
        if (x() || (u3Var = this.Y) == null) {
            return;
        }
        u3Var.finish();
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
        p9 p9Var = this.W;
        if (p9Var != null) {
            p9Var.invalidate();
        }
        t9 t9Var = this.C;
        if (t9Var != null) {
            t9Var.invalidate();
        }
    }

    public final boolean x() {
        return this.u >= 0 && this.v >= 0;
    }

    public boolean z(zi ziVar) {
        return ziVar != null && this.w == ziVar.f1();
    }

    public void E(boolean z10) {
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

    public void I(int i3, int i10, zi ziVar) {
    }
}
