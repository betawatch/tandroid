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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jm0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public abstract class aa {
    public final l9 A;
    public final Rect B;
    public z9 C;
    public w7.j0 D;
    public jm0 E;
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
    public v9 W;
    public v9 X;
    public org.telegram.ui.ActionBar.h4 Y;
    public boolean Z;
    public int a;
    public final q9 a0;
    public int b;
    public int b0;
    public int c;
    public final OvershootInterpolator c0;
    public int d;
    public int d0;
    public boolean e;
    public final h9 e0;
    public float f;
    public final i9 f0;
    public float g;
    public org.telegram.ui.ActionBar.d6 g0;
    public final int[] h = new int[2];
    public boolean h0;
    public boolean i;
    public boolean i0;
    public boolean j;
    public boolean j0;
    public boolean k;
    public org.telegram.ui.t k0;
    public final int l;
    public ValueAnimator l0;
    public final int m;
    public final g m0;
    public final float n;
    public final h9 n0;
    public final Paint o;
    public final u9 o0;
    public final Paint p;
    public final er q;
    public final Path r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public aa() {
        new s9().a = 0.0f;
        Paint paint = new Paint(1);
        this.o = paint;
        this.p = new Paint(1);
        er erVar = new er();
        this.q = erVar;
        this.r = new Path();
        new r9().a = erVar;
        this.u = -1;
        this.v = -1;
        this.A = new l9(this, new k9(this));
        this.B = new Rect();
        this.S = new RectF();
        this.T = new RectF();
        this.a0 = new q9();
        this.c0 = new OvershootInterpolator();
        this.e0 = new h9(this, 0);
        this.f0 = new i9(this);
        this.h0 = true;
        this.k0 = null;
        this.m0 = new g(this, 7);
        this.n0 = new h9(this, 1);
        u9 u9Var = new u9();
        u9Var.a = 0.0f;
        u9Var.b = new ArrayList(1);
        u9Var.c = 0;
        this.o0 = u9Var;
        this.l = ViewConfiguration.getLongPressTimeout();
        this.m = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        float dp = AndroidUtilities.dp(6.0f);
        this.n = dp;
        paint.setPathEffect(new CornerPathEffect(dp));
        erVar.d = 1.0f;
    }

    public static void a(aa aaVar, int i10) {
        int lineRight;
        int i11;
        q9 q9Var = aaVar.a0;
        if (Build.VERSION.SDK_INT < 28 || aaVar.W == null || aaVar.k || !aaVar.i || aaVar.C == null) {
            return;
        }
        int i12 = aaVar.j ? aaVar.u : aaVar.v;
        aaVar.i(i12, q9Var, false);
        Layout layout = q9Var.b;
        if (layout == null) {
            return;
        }
        int lineForOffset = layout.getLineForOffset(Utilities.clamp(i12 - q9Var.a, layout.getText().length(), 0));
        int lineBottom = layout.getLineBottom(lineForOffset) - layout.getLineTop(lineForOffset);
        int[] l4 = aaVar.l();
        int lineTop = (int) (((((layout.getLineTop(lineForOffset) + aaVar.b) + l4[1]) - lineBottom) - AndroidUtilities.dp(8.0f)) + q9Var.c);
        Object obj = aaVar.W;
        if (obj instanceof org.telegram.ui.w2) {
            i11 = l4[0];
            lineRight = ((View) obj).getMeasuredWidth() + i11;
        } else {
            int lineLeft = (int) (layout.getLineLeft(lineForOffset) + l4[0] + aaVar.a + q9Var.d);
            lineRight = (int) (layout.getLineRight(lineForOffset) + l4[0] + aaVar.a + q9Var.d);
            i11 = lineLeft;
        }
        if (i10 < i11) {
            i10 = i11;
        } else if (i10 > lineRight) {
            i10 = lineRight;
        }
        float f7 = lineTop;
        if (aaVar.I != f7) {
            aaVar.I = f7;
            aaVar.J = (f7 - aaVar.H) / 200.0f;
        }
        float f10 = i10;
        if (aaVar.L != f10) {
            aaVar.L = f10;
            aaVar.M = (f10 - aaVar.K) / 100.0f;
        }
        if (aaVar.G == null) {
            aaVar.G = new Magnifier(aaVar.C);
            aaVar.H = aaVar.I;
            aaVar.K = aaVar.L;
        }
        float f11 = aaVar.H;
        float f12 = aaVar.I;
        if (f11 != f12) {
            aaVar.H = (aaVar.J * 16.0f) + f11;
        }
        float f13 = aaVar.J;
        if (f13 > 0.0f && aaVar.H > f12) {
            aaVar.H = f12;
        } else if (f13 < 0.0f && aaVar.H < f12) {
            aaVar.H = f12;
        }
        float f14 = aaVar.K;
        float f15 = aaVar.L;
        if (f14 != f15) {
            aaVar.K = (aaVar.M * 16.0f) + f14;
        }
        float f16 = aaVar.M;
        if (f16 > 0.0f && aaVar.K > f15) {
            aaVar.K = f15;
        } else if (f16 < 0.0f && aaVar.K < f15) {
            aaVar.K = f15;
        }
        aaVar.G.show(aaVar.K, (lineBottom * 1.5f) + aaVar.H + AndroidUtilities.dp(8.0f));
        aaVar.G.update();
    }

    public static boolean y(char c10) {
        return Character.isLetter(c10) || Character.isDigit(c10) || c10 == '_';
    }

    public void A(int i10, int i11, boolean z10, float f7, float f10, v9 v9Var) {
        int i12;
        int i13;
        if (this.j) {
            this.u = i11;
            if (!z10 && i11 > (i13 = this.v)) {
                this.v = i11;
                this.u = i13;
                this.j = false;
            }
            this.y = true;
            return;
        }
        this.v = i11;
        if (!z10 && (i12 = this.u) > i11) {
            this.v = i12;
            this.u = i11;
            this.j = true;
        }
        this.y = true;
    }

    public final int[] B(int i10) {
        q9 q9Var = this.a0;
        i(i10, q9Var, false);
        Layout layout = q9Var.b;
        int i11 = i10 - q9Var.a;
        int[] iArr = this.h;
        if (layout != null && i11 >= 0 && i11 <= layout.getText().length()) {
            int lineForOffset = layout.getLineForOffset(i11);
            iArr[0] = (int) (layout.getPrimaryHorizontal(i11) + q9Var.d);
            int lineBottom = layout.getLineBottom(lineForOffset);
            iArr[1] = lineBottom;
            iArr[1] = (int) (lineBottom + q9Var.c);
        }
        return iArr;
    }

    public boolean C() {
        return false;
    }

    public final void G() {
        z9 z9Var;
        if (!x() || (z9Var = this.C) == null) {
            return;
        }
        this.Q = true;
        z9Var.invalidate();
        u();
    }

    public boolean J() {
        return false;
    }

    public abstract void L(v9 v9Var, v9 v9Var2);

    public final boolean M(MotionEvent motionEvent) {
        aa aaVar;
        int action = motionEvent.getAction();
        i9 i9Var = this.f0;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int y3 = (int) motionEvent.getY();
                    int x10 = (int) motionEvent.getX();
                    int i10 = this.t - y3;
                    int i11 = this.s - x10;
                    int i12 = (i11 * i11) + (i10 * i10);
                    int i13 = this.m;
                    if (i12 > i13 * i13) {
                        AndroidUtilities.cancelRunOnUIThread(i9Var);
                        this.z = false;
                    }
                    return this.z;
                }
                if (action != 3) {
                    return false;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(i9Var);
            this.z = false;
            return false;
        }
        this.s = (int) motionEvent.getX();
        this.t = (int) motionEvent.getY();
        this.z = false;
        int i14 = -AndroidUtilities.dp(8.0f);
        int i15 = -AndroidUtilities.dp(8.0f);
        Rect rect = this.B;
        rect.inset(i14, i15);
        if (!rect.contains(this.s, this.t) || this.X == null) {
            aaVar = this;
        } else {
            rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            int i16 = this.s;
            int i17 = this.t;
            int i18 = rect.right;
            if (i16 > i18) {
                i16 = i18 - 1;
            }
            int i19 = rect.left;
            if (i16 < i19) {
                i16 = i19 + 1;
            }
            int i20 = i16;
            int i21 = rect.top;
            if (i17 < i21) {
                i17 = i21 + 1;
            }
            int i22 = rect.bottom;
            if (i17 > i22) {
                i17 = i22 - 1;
            }
            aaVar = this;
            int k10 = aaVar.k(i20, i17, this.c, this.d, this.X, true);
            CharSequence s10 = s(aaVar.X, true);
            if (k10 >= s10.length()) {
                q9 q9Var = aaVar.a0;
                i(k10, q9Var, true);
                Layout layout = q9Var.b;
                if (layout == null) {
                    aaVar.z = false;
                    return false;
                }
                int lineCount = layout.getLineCount() - 1;
                float f7 = i20 - aaVar.c;
                if (f7 < q9Var.b.getLineRight(lineCount) + AndroidUtilities.dp(4.0f) && f7 > q9Var.b.getLineLeft(lineCount)) {
                    k10 = s10.length() - 1;
                }
            }
            if (k10 >= 0 && k10 < s10.length() && s10.charAt(k10) != '\n') {
                AndroidUtilities.cancelRunOnUIThread(i9Var);
                AndroidUtilities.runOnUIThread(i9Var, aaVar.l);
                aaVar.z = true;
            }
        }
        return aaVar.z;
    }

    public boolean P(int i10, int i11) {
        return false;
    }

    public final void Q(ci.o2 o2Var) {
        this.D = o2Var;
    }

    public final void R() {
        this.i0 = true;
    }

    public final void S(ViewGroup viewGroup) {
        if (viewGroup instanceof jm0) {
            this.E = (jm0) viewGroup;
        }
        this.F = viewGroup;
    }

    public final void T() {
        if (this.C != null && !this.i && x() && d()) {
            if (!this.P) {
                org.telegram.ui.ActionBar.h4 h4Var = this.Y;
                l9 l9Var = this.A;
                if (h4Var == null) {
                    org.telegram.ui.ActionBar.h4 h4Var2 = new org.telegram.ui.ActionBar.h4(this.C.getContext(), l9Var, this.C, new org.telegram.ui.ActionBar.x4(this.C.getContext(), this.C, 1, q(), null));
                    this.Y = h4Var2;
                    l9Var.onCreateActionMode(h4Var2, h4Var2.c);
                }
                org.telegram.ui.ActionBar.h4 h4Var3 = this.Y;
                l9Var.onPrepareActionMode(h4Var3, h4Var3.c);
                this.Y.hide(1L);
            }
            AndroidUtilities.cancelRunOnUIThread(this.n0);
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
        g gVar = this.m0;
        AndroidUtilities.cancelRunOnUIThread(gVar);
        AndroidUtilities.runOnUIThread(gVar);
    }

    public boolean b() {
        return true;
    }

    public boolean c(int i10) {
        return (i10 == this.u || i10 == this.v) ? false : true;
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
        AndroidUtilities.cancelRunOnUIThread(this.f0);
        this.z = false;
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.setVisibility(8);
            this.C.c();
        }
        this.V = 0.0f;
        w7.j0 j0Var = this.D;
        if (j0Var != null) {
            j0Var.a(false);
        }
        this.s = -1;
        this.t = -1;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = 0.0f;
        this.i = false;
    }

    public final void g(Layout layout, int i10, int i11, int i12, boolean z10, boolean z11, float f7) {
        float f10;
        float f11;
        int i13;
        er erVar;
        float f12;
        u9 u9Var = this.o0;
        u9Var.reset();
        layout.getSelectionPath(i11, i12, u9Var);
        if (u9Var.a < layout.getLineBottom(i10)) {
            int lineTop = layout.getLineTop(i10);
            float lineBottom = layout.getLineBottom(i10) - lineTop;
            f11 = lineTop;
            f10 = lineBottom / (u9Var.a - f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        int i14 = 0;
        while (true) {
            i13 = u9Var.c;
            erVar = this.q;
            f12 = this.n;
            if (i14 >= i13) {
                break;
            }
            RectF rectF = (RectF) u9Var.b.get(i14);
            rectF.set((int) (Math.max(f7, rectF.left) - (z10 ? f12 / 2.0f : 0.0f)), (int) com.google.android.gms.internal.play_billing.k3.y(rectF.top, f11, f10, f11), (int) (Math.max(f7, rectF.right) + (z11 ? f12 / 2.0f : 0.0f)), (int) com.google.android.gms.internal.play_billing.k3.y(rectF.bottom, f11, f10, f11));
            erVar.addRect(rectF, Path.Direction.CW);
            i14++;
        }
        if (i13 != 0 || z11) {
            return;
        }
        try {
            erVar.addRect(((int) layout.getPrimaryHorizontal(i11)) - (f12 / 2.0f), layout.getLineTop(i10), (f12 / 4.0f) + ((int) layout.getPrimaryHorizontal(i12)), layout.getLineBottom(i10), Path.Direction.CW);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106 A[LOOP:1: B:68:0x0104->B:69:0x0106, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Canvas canvas, Layout layout, int i10, int i11, boolean z10, boolean z11, float f7) {
        int i12;
        Rect rect;
        int i13;
        float f10;
        int i14;
        Path path;
        int i15;
        int i16;
        aa aaVar;
        int i17;
        float lineRight;
        er erVar;
        if (layout == null || layout.getText() == null) {
            return;
        }
        int clamp = Utilities.clamp(i10, layout.getText().length(), 0);
        int clamp2 = Utilities.clamp(i11, layout.getText().length(), 0);
        er erVar2 = this.q;
        erVar2.reset();
        Path path2 = this.r;
        path2.reset();
        float f11 = this.n;
        float f12 = f11 * 1.65f;
        int i18 = (int) (f11 / 2.0f);
        int lineForOffset = layout.getLineForOffset(clamp);
        int lineForOffset2 = layout.getLineForOffset(clamp2);
        if (lineForOffset == lineForOffset2) {
            g(layout, lineForOffset, clamp, clamp2, !z10, !z11, f7);
            aaVar = this;
            path = path2;
            f10 = f12;
            i15 = lineForOffset;
            i16 = clamp;
            i14 = lineForOffset2;
        } else {
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (layout.getParagraphDirection(lineForOffset) == -1 || lineEnd <= 0) {
                i12 = lineEnd;
            } else {
                i12 = lineEnd - 1;
                CharSequence text = layout.getText();
                int primaryHorizontal = (int) layout.getPrimaryHorizontal(i12);
                if (layout.isRtlCharAt(i12)) {
                    int i19 = i12;
                    while (layout.isRtlCharAt(i19) && i19 != 0) {
                        i19--;
                    }
                    i17 = lineEnd;
                    lineRight = layout.getLineForOffset(i19) == layout.getLineForOffset(i12) ? layout.getPrimaryHorizontal(i19 + 1) : layout.getLineLeft(lineForOffset);
                } else {
                    i17 = lineEnd;
                    lineRight = layout.getLineRight(lineForOffset);
                }
                int i20 = (int) lineRight;
                int min = Math.min(primaryHorizontal, i20);
                int max = Math.max(primaryHorizontal, i20);
                if (i12 > 0 && i12 < text.length() && !Character.isWhitespace(text.charAt(i17 - 2))) {
                    rect = new Rect(((int) Math.max(f7, min)) - i18, layout.getLineTop(lineForOffset), ((int) Math.max(f7, max)) + i18, layout.getLineBottom(lineForOffset));
                    g(layout, lineForOffset, clamp, i12, !z10, true, f7);
                    if (rect != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        erVar2.addRect(rectF, Path.Direction.CW);
                    }
                    i13 = lineForOffset + 1;
                    while (i13 < lineForOffset2) {
                        int lineLeft = (int) layout.getLineLeft(i13);
                        int lineRight2 = (int) layout.getLineRight(i13);
                        int min2 = Math.min(lineLeft, lineRight2);
                        int max2 = Math.max(lineLeft, lineRight2);
                        float max3 = Math.max(f7, min2);
                        float f13 = i18;
                        erVar2.addRect(max3 - f13, layout.getLineTop(i13), Math.max(f7, max2) + f13, layout.getLineBottom(i13) + 1, Path.Direction.CW);
                        i13++;
                        lineForOffset2 = lineForOffset2;
                        i18 = i18;
                        lineForOffset = lineForOffset;
                        path2 = path2;
                        f12 = f12;
                    }
                    int i21 = lineForOffset;
                    f10 = f12;
                    i14 = lineForOffset2;
                    path = path2;
                    i15 = i21;
                    clamp2 = clamp2;
                    i16 = clamp;
                    aaVar = this;
                    aaVar.g(layout, i14, layout.getLineStart(i14), clamp2, true, !z11, f7);
                }
            }
            rect = null;
            g(layout, lineForOffset, clamp, i12, !z10, true, f7);
            if (rect != null) {
            }
            i13 = lineForOffset + 1;
            while (i13 < lineForOffset2) {
            }
            int i212 = lineForOffset;
            f10 = f12;
            i14 = lineForOffset2;
            path = path2;
            i15 = i212;
            clamp2 = clamp2;
            i16 = clamp;
            aaVar = this;
            aaVar.g(layout, i14, layout.getLineStart(i14), clamp2, true, !z11, f7);
        }
        int i22 = Build.VERSION.SDK_INT;
        boolean z12 = i22 >= 26;
        if (z12) {
            canvas.save();
        }
        float primaryHorizontal2 = layout.getPrimaryHorizontal(i16);
        float primaryHorizontal3 = layout.getPrimaryHorizontal(clamp2);
        float lineBottom = layout.getLineBottom(i15);
        float lineBottom2 = layout.getLineBottom(i14);
        if (z10 && z11 && lineBottom == lineBottom2 && Math.abs(primaryHorizontal3 - primaryHorizontal2) < f10) {
            float min3 = Math.min(primaryHorizontal2, primaryHorizontal3);
            float max4 = Math.max(primaryHorizontal2, primaryHorizontal3);
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) min3, (int) (lineBottom - f10), (int) max4, (int) lineBottom);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rect2);
            path.addRect(rectF2, Path.Direction.CW);
            if (i22 >= 26) {
                canvas.clipOutRect(rect2);
            }
            erVar = erVar2;
        } else {
            if (!z10 || layout.isRtlCharAt(i16)) {
                erVar = erVar2;
            } else {
                Rect rect3 = AndroidUtilities.rectTmp2;
                erVar = erVar2;
                rect3.set((int) primaryHorizontal2, (int) (lineBottom - f10), (int) Math.min(primaryHorizontal2 + f10, layout.getLineRight(i15)), (int) lineBottom);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect3);
                path.addRect(rectF3, Path.Direction.CW);
                if (i22 >= 26) {
                    rect3.set(rect3.left - ((int) f10), rect3.top, rect3.right, rect3.bottom);
                    canvas.clipOutRect(rect3);
                }
            }
            if (z11 && !layout.isRtlCharAt(clamp2)) {
                Rect rect4 = AndroidUtilities.rectTmp2;
                rect4.set((int) Math.max(primaryHorizontal3 - f10, layout.getLineLeft(i14)), (int) (lineBottom2 - f10), (int) primaryHorizontal3, (int) lineBottom2);
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(rect4);
                path.addRect(rectF4, Path.Direction.CW);
                if (i22 >= 26) {
                    canvas.clipOutRect(rect4);
                }
            }
        }
        erVar.a();
        canvas.drawPath(erVar, aaVar.o);
        if (z12) {
            canvas.restore();
            canvas.drawPath(path, aaVar.p);
        }
    }

    public abstract void i(int i10, q9 q9Var, boolean z10);

    public boolean j() {
        return false;
    }

    public abstract int k(int i10, int i11, int i12, int i13, v9 v9Var, boolean z10);

    public final int[] l() {
        int i10;
        View view = (View) this.W;
        int i11 = 0;
        if (view != null && this.F != null) {
            i10 = 0;
            int i12 = 0;
            while (view != this.F) {
                if (view != null) {
                    i10 = (int) (view.getY() + i10);
                    i12 = (int) (view.getX() + i12);
                    if (view instanceof NestedScrollView) {
                        i10 -= view.getScrollY();
                        i12 -= view.getScrollX();
                    }
                    if (view.getParent() instanceof View) {
                        view = (View) view.getParent();
                    }
                }
            }
            i11 = i12;
            return new int[]{i11, i10};
        }
        i10 = 0;
        return new int[]{i11, i10};
    }

    public abstract int m();

    public final z9 n(Context context) {
        if (this.C == null) {
            this.C = new z9(this, context);
        }
        return this.C;
    }

    public int o() {
        return 0;
    }

    public int p() {
        return 0;
    }

    public org.telegram.ui.ActionBar.d6 q() {
        return this.g0;
    }

    public CharSequence r() {
        CharSequence s10 = s(this.W, false);
        if (s10 != null) {
            return s10.subSequence(this.u, this.v);
        }
        return null;
    }

    public abstract CharSequence s(v9 v9Var, boolean z10);

    public int t(int i10) {
        return org.telegram.ui.ActionBar.h6.w0(i10, this.g0);
    }

    public final void u() {
        org.telegram.ui.ActionBar.h4 h4Var;
        if (this.Y != null && this.P) {
            this.P = false;
            this.n0.run();
        }
        this.P = false;
        if (x() || (h4Var = this.Y) == null) {
            return;
        }
        h4Var.finish();
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
        v9 v9Var = this.W;
        if (v9Var != null) {
            v9Var.invalidate();
        }
        z9 z9Var = this.C;
        if (z9Var != null) {
            z9Var.invalidate();
        }
    }

    public final boolean x() {
        return this.u >= 0 && this.v >= 0;
    }

    public boolean z(MessageObject messageObject) {
        return messageObject != null && this.w == messageObject.getId();
    }

    public void D() {
    }

    public void E(boolean z10) {
    }

    public void F() {
    }

    public void H() {
    }

    public void N() {
    }

    public void O() {
    }

    public void K(float f7, float f10) {
    }

    public void I(MessageObject messageObject, int i10, int i11) {
    }
}
