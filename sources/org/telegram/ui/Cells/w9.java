package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w9 extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ x9 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(x9 x9Var, Context context) {
        super(context);
        this.r = x9Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        x9 x9Var = this.r;
        if (x9Var.y() && !x9Var.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && i7.z5.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < x9Var.m) {
                x9Var.L(motionEvent.getRawX(), motionEvent.getRawY());
                x9Var.v();
                x9Var.f(false);
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return;
            }
            arrayList.clear();
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        x9 x9Var = this.r;
        if (!x9Var.j0 || (viewGroup = x9Var.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i10;
        char c3;
        float f9;
        int i11;
        ActionMode actionMode;
        boolean isRtlCharAt;
        float f10;
        boolean z10;
        int i12;
        x9 x9Var = this.r;
        g gVar2 = x9Var.r0;
        OvershootInterpolator overshootInterpolator = x9Var.c0;
        RectF rectF = x9Var.S;
        RectF rectF2 = x9Var.T;
        n9 n9Var = x9Var.a0;
        if (x9Var.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = x9Var.x;
            x9Var.O();
            s9 s9Var = x9Var.W;
            Paint paint = this.a;
            Path path = this.e;
            if (s9Var != null) {
                canvas.save();
                int[] m10 = x9Var.m();
                c3 = 1;
                float f11 = m10[1] + x9Var.b;
                f9 = 8.0f;
                float f12 = m10[0] + x9Var.a;
                canvas.translate(f12, f11);
                s9 s9Var2 = x9Var.W;
                MessageObject messageObject = s9Var2 instanceof s1 ? ((s1) s9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(x9Var.u(org.telegram.ui.ActionBar.g6.vf));
                } else {
                    paint.setColor(x9Var.u(org.telegram.ui.ActionBar.g6.Wb));
                }
                int length = x9Var.t(x9Var.W, false).length();
                int i14 = x9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    x9Var.j(i14, n9Var, false);
                    Layout layout = n9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = x9Var.v - n9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + n9Var.c);
                        float f13 = primaryHorizontal + n9Var.d;
                        Rect rect = n9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - x9Var.a;
                            i12 = rect.bottom - x9Var.b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(x9Var.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 <= i10 + x9Var.e0 || f16 >= x9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f17 = dp;
                            canvas.translate(f10 - f17, f15);
                            float interpolation = overshootInterpolator.getInterpolation(x9Var.V);
                            float f18 = f17 / 2.0f;
                            canvas.scale(interpolation, interpolation, f18, f18);
                            path.reset();
                            Path.Direction direction = Path.Direction.CCW;
                            path.addCircle(f18, f18, f18, direction);
                            path.addRect(f18, 0.0f, f17, f18, direction);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f19 = f12 + f10;
                            rectF2.set(f19 - f17, f16 - f17, f19, f16 + f17);
                            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                        } else {
                            canvas.save();
                            canvas.translate(f10, f15);
                            float interpolation2 = overshootInterpolator.getInterpolation(x9Var.V);
                            float f20 = dp;
                            float f21 = f20 / 2.0f;
                            canvas.scale(interpolation2, interpolation2, f21, f21);
                            path.reset();
                            Path.Direction direction2 = Path.Direction.CCW;
                            path.addCircle(f21, f21, f21, direction2);
                            path.addRect(0.0f, 0.0f, f21, f21, direction2);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f22 = f12 + f10;
                            rectF2.set(f22, f16 - f20, f22 + f20, f16 + f20);
                            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            i11 = 1;
                            canvas.restore();
                        }
                        i11 = 0;
                        canvas.restore();
                    }
                }
                gVar = gVar2;
                i10 = i13;
                i11 = 0;
                canvas.restore();
            } else {
                gVar = gVar2;
                i10 = i13;
                c3 = 1;
                f9 = 8.0f;
                i11 = 0;
            }
            x9Var.P();
            if (x9Var.W != null) {
                canvas.save();
                int[] m11 = x9Var.m();
                float f23 = m11[c3] + x9Var.b;
                float f24 = m11[0] + x9Var.a;
                canvas.translate(f24, f23);
                int length3 = x9Var.t(x9Var.W, false).length();
                int i16 = x9Var.u;
                if (i16 >= 0 && i16 <= length3) {
                    x9Var.j(i16, n9Var, false);
                    Layout layout2 = n9Var.b;
                    if (layout2 != null) {
                        int i17 = x9Var.u - n9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + n9Var.c);
                        float f25 = primaryHorizontal2 + n9Var.d;
                        Rect rect2 = n9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - x9Var.a;
                            lineBottom2 = rect2.bottom - x9Var.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(x9Var.u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 <= i10 + x9Var.e0 || f27 >= x9Var.F.getMeasuredHeight()) {
                            if (f27 > 0.0f && f27 - x9Var.n() < x9Var.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f25, f26);
                            float interpolation3 = overshootInterpolator.getInterpolation(x9Var.V);
                            float f28 = dp;
                            float f29 = f28 / 2.0f;
                            canvas.scale(interpolation3, interpolation3, f29, f29);
                            path.reset();
                            Path.Direction direction3 = Path.Direction.CCW;
                            path.addCircle(f29, f29, f29, direction3);
                            path.addRect(0.0f, 0.0f, f29, f29, direction3);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f30 = f24 + f25;
                            rectF.set(f30, f27 - f28, f30 + f28, f27 + f28);
                            rectF.inset(-AndroidUtilities.dp(f9), -AndroidUtilities.dp(f9));
                        } else {
                            canvas.save();
                            float f31 = dp;
                            canvas.translate(f25 - f31, f26);
                            float interpolation4 = overshootInterpolator.getInterpolation(x9Var.V);
                            float f32 = f31 / 2.0f;
                            canvas.scale(interpolation4, interpolation4, f32, f32);
                            path.reset();
                            Path.Direction direction4 = Path.Direction.CCW;
                            path.addCircle(f32, f32, f32, direction4);
                            path.addRect(f32, 0.0f, f31, f32, direction4);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f33 = f24 + f25;
                            rectF.set(f33 - f31, f27 - f31, f33, f27 + f31);
                            rectF.inset(-AndroidUtilities.dp(f9), -AndroidUtilities.dp(f9));
                            i11++;
                        }
                    }
                }
                canvas.restore();
            }
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 29) {
                ArrayList arrayList = this.f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && x9Var.i) {
                if (!x9Var.j) {
                    x9Var.O();
                }
                x9.a(x9Var, x9Var.b0);
                if (x9Var.I != x9Var.H || x9Var.L != x9Var.K) {
                    invalidate();
                }
            }
            if (!x9Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = x9Var.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = x9Var.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.g4) actionMode2).e();
                }
            }
            if (x9Var.k) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r6 != 3) goto L304;
     */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        ViewParent parent;
        boolean z11;
        float f9;
        float f10;
        int l10;
        char charAt;
        char charAt2;
        x9 x9Var = this.r;
        g gVar = x9Var.r0;
        lh.m7 m7Var = x9Var.f0;
        n9 n9Var = x9Var.a0;
        if (!x9Var.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return x9Var.i;
        }
        int x4 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        int i10 = x9Var.b0 - x4;
        x9Var.b0 = x4;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!x9Var.i) {
                float f11 = x4;
                float f12 = y8;
                if (x9Var.S.contains(f11, f12)) {
                    x9Var.P();
                    if (x9Var.W == null) {
                        return false;
                    }
                    x9Var.i = true;
                    x9Var.j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] C = x9Var.C(x9Var.u);
                    float n10 = x9Var.n() / 2;
                    int[] m10 = x9Var.m();
                    if (x9Var.i0) {
                        x9Var.f = ((C[0] + x9Var.a) + m10[0]) - x4;
                    } else {
                        x9Var.f = 0.0f;
                    }
                    x9Var.g = (((C[1] + x9Var.b) + m10[1]) - y8) - n10;
                    x9Var.v();
                    x9Var.C.invalidate();
                    return true;
                }
                if (!x9Var.T.contains(f11, f12)) {
                    x9Var.i = false;
                    x9Var.e = true;
                    return x9Var.i;
                }
                x9Var.O();
                if (x9Var.W == null) {
                    return false;
                }
                x9Var.i = true;
                x9Var.j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] C2 = x9Var.C(x9Var.v);
                float n11 = x9Var.n() / 2;
                int[] m11 = x9Var.m();
                x9Var.f = ((C2[0] + x9Var.a) + m11[0]) - x4;
                x9Var.g = (((C2[1] + x9Var.b) + m11[1]) - y8) - n11;
                x9.a(x9Var, x9Var.b0);
                x9Var.v();
                x9Var.C.invalidate();
                return true;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (x9Var.i) {
                    if (x9Var.j) {
                        x9Var.P();
                    } else {
                        x9Var.O();
                    }
                    if (x9Var.W == null) {
                        return x9Var.i;
                    }
                    int i11 = (int) (x4 + x9Var.f);
                    int i12 = (int) (y8 + x9Var.g);
                    boolean Q = x9Var.Q(i11, i12);
                    if (x9Var.W != null) {
                        if (x9Var.j) {
                            x9Var.j(x9Var.u, n9Var, false);
                        } else {
                            x9Var.j(x9Var.v, n9Var, false);
                        }
                        if (n9Var.b != null) {
                            float f13 = n9Var.c;
                            s9 s9Var = x9Var.W;
                            int[] m12 = x9Var.m();
                            int i13 = i12 - m12[1];
                            int i14 = i11 - m12[0];
                            boolean z12 = x9Var.E != null;
                            boolean z13 = z12 && y8 - x9Var.m > x9Var.F.getMeasuredHeight() - x9Var.p() && (x9Var.k0 || x9Var.Z || x9Var.W.getBottom() > x9Var.F.getMeasuredHeight() - x9Var.p());
                            if (z12) {
                                if (y8 < x9Var.q() + ((View) x9Var.F.getParent()).getTop() && (x9Var.Z || x9Var.W.getTop() < x9Var.q())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!x9Var.N) {
                                            x9Var.N = true;
                                            AndroidUtilities.runOnUIThread(m7Var);
                                        }
                                        x9Var.O = z13;
                                        if (z13) {
                                            f9 = -x9Var.W.getTop();
                                            f10 = x9Var.g;
                                        } else {
                                            f9 = x9Var.F.getMeasuredHeight() - x9Var.W.getTop();
                                            f10 = x9Var.g;
                                        }
                                        i13 = (int) (f9 + f10);
                                    } else if (x9Var.N) {
                                        x9Var.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(m7Var);
                                    }
                                    l10 = x9Var.l(i14, i13, x9Var.a, x9Var.b, x9Var.W, false);
                                    if (l10 >= 0) {
                                        if (x9Var.R) {
                                            if (!Q) {
                                                if (l10 < x9Var.u) {
                                                    x9Var.R = false;
                                                    x9Var.j = true;
                                                    x9Var.v();
                                                } else if (l10 > x9Var.v) {
                                                    x9Var.R = false;
                                                    x9Var.j = false;
                                                    x9Var.v();
                                                }
                                            }
                                        }
                                        if (x9Var.j) {
                                            if (x9Var.u != l10 && x9Var.c(l10)) {
                                                CharSequence t10 = x9Var.t(x9Var.W, false);
                                                x9Var.j(l10, n9Var, false);
                                                Layout layout = n9Var.b;
                                                x9Var.j(x9Var.u, n9Var, false);
                                                Layout layout2 = n9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = l10;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !x9.z(t10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(x9Var.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(l10);
                                                    if (Q || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(x9Var.u) && lineForOffset3 == lineForOffset)) {
                                                        x9Var.B(l10, i15, Q, x9Var.a0.c, f13, s9Var);
                                                        AndroidUtilities.vibrateCursor(x9Var.C);
                                                        x9Var.x();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(l10)) || layout2.isRtlCharAt(l10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        x9Var.u = l10;
                                                        int i17 = x9Var.v;
                                                        if (l10 > i17) {
                                                            x9Var.v = l10;
                                                            x9Var.u = i17;
                                                            x9Var.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(x9Var.C);
                                                        x9Var.x();
                                                    } else {
                                                        int i18 = l10;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= t10.length() || !x9.z(t10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(l10 - i15);
                                                        int abs2 = Math.abs(l10 - i18);
                                                        if (x9Var.y) {
                                                            x9Var.y = i10 >= 0;
                                                        }
                                                        int i20 = l10 - 1;
                                                        boolean z14 = i20 > 0 && x9.z(t10.charAt(i20));
                                                        if (l10 >= t10.length()) {
                                                            l10 = t10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = t10.charAt(l10);
                                                        }
                                                        if (x9Var.u >= t10.length()) {
                                                            x9Var.u = t10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = t10.charAt(x9Var.u);
                                                        }
                                                        int i21 = x9Var.u;
                                                        if ((l10 < i21 && abs < abs2) || ((l10 > i21 && i10 < 0) || !x9.z(charAt) || ((x9.z(charAt2) && !x9Var.y) || l10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!x9Var.y || l10 != 1) {
                                                                if (l10 >= x9Var.u || !x9.z(charAt) || ((x9.z(charAt2) && !x9Var.y) || charAt2 == '\n')) {
                                                                    x9Var.u = l10;
                                                                } else {
                                                                    x9Var.u = i15;
                                                                    x9Var.y = true;
                                                                }
                                                                int i22 = x9Var.u;
                                                                int i23 = x9Var.v;
                                                                if (i22 > i23) {
                                                                    x9Var.v = i22;
                                                                    x9Var.u = i23;
                                                                    x9Var.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(x9Var.C);
                                                                x9Var.x();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            x9Var.G();
                                        } else {
                                            if (l10 != x9Var.v && x9Var.c(l10)) {
                                                CharSequence t11 = x9Var.t(x9Var.W, false);
                                                int i24 = l10;
                                                while (i24 < t11.length() && x9.z(t11.charAt(i24))) {
                                                    i24++;
                                                }
                                                x9Var.j(l10, n9Var, false);
                                                Layout layout3 = n9Var.b;
                                                x9Var.j(x9Var.v, n9Var, false);
                                                Layout layout4 = n9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (l10 > t11.length()) {
                                                        l10 = t11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(x9Var.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(l10);
                                                    if (Q || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(x9Var.v) && lineForOffset6 == lineForOffset4)) {
                                                        x9Var.B(l10, i24, Q, x9Var.a0.c, f13, s9Var);
                                                        AndroidUtilities.vibrateCursor(x9Var.C);
                                                        x9Var.x();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(l10)) || layout4.isRtlCharAt(l10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        x9Var.v = l10;
                                                        int i25 = x9Var.u;
                                                        if (i25 > l10) {
                                                            x9Var.v = i25;
                                                            x9Var.u = l10;
                                                            x9Var.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(x9Var.C);
                                                        x9Var.x();
                                                    } else {
                                                        int i26 = l10;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !x9.z(t11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(l10 - i24);
                                                        int abs4 = Math.abs(l10 - i26);
                                                        int i28 = l10 - 1;
                                                        boolean z15 = i28 > 0 && x9.z(t11.charAt(i28));
                                                        if (x9Var.y) {
                                                            x9Var.y = i10 <= 0;
                                                        }
                                                        int i29 = x9Var.v;
                                                        boolean z16 = i29 > 0 && x9.z(t11.charAt(i29 - 1));
                                                        int i30 = x9Var.v;
                                                        if ((l10 > i30 && abs3 <= abs4) || ((l10 < i30 && i10 > 0) || !z15 || (z16 && !x9Var.y))) {
                                                            if (l10 <= i30 || !z15 || (z16 && !x9Var.y)) {
                                                                x9Var.v = l10;
                                                            } else {
                                                                x9Var.v = i24;
                                                                x9Var.y = true;
                                                            }
                                                            int i31 = x9Var.u;
                                                            int i32 = x9Var.v;
                                                            if (i31 > i32) {
                                                                x9Var.v = i31;
                                                                x9Var.u = i32;
                                                                x9Var.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(x9Var.C);
                                                            x9Var.x();
                                                        }
                                                    }
                                                }
                                            }
                                            x9Var.G();
                                        }
                                    }
                                    x9.a(x9Var, x9Var.b0);
                                }
                            }
                            z11 = false;
                            if (z13) {
                            }
                            if (!x9Var.N) {
                            }
                            x9Var.O = z13;
                            if (z13) {
                            }
                            i13 = (int) (f9 + f10);
                            l10 = x9Var.l(i14, i13, x9Var.a, x9Var.b, x9Var.W, false);
                            if (l10 >= 0) {
                            }
                            x9.a(x9Var, x9Var.b0);
                        }
                    }
                    return true;
                }
            }
            return x9Var.i;
        }
        x9Var.w();
        if (!x9Var.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        x9Var.i = z10;
        x9Var.R = z10;
        x9Var.k = z10;
        if (x9Var.y()) {
            x9Var.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            x9Var.V();
        }
        if (x9Var.N) {
            x9Var.N = false;
            AndroidUtilities.cancelRunOnUIThread(m7Var);
        }
        return x9Var.i;
    }
}
