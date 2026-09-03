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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y9 extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ z9 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(z9 z9Var, Context context) {
        super(context);
        this.r = z9Var;
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
        z9 z9Var = this.r;
        if (z9Var.y() && !z9Var.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && k7.o6.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < z9Var.m) {
                z9Var.L(motionEvent.getRawX(), motionEvent.getRawY());
                z9Var.v();
                z9Var.f(false);
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
        z9 z9Var = this.r;
        if (!z9Var.j0 || (viewGroup = z9Var.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i10;
        char c3;
        float f10;
        int i11;
        ActionMode actionMode;
        boolean isRtlCharAt;
        float f11;
        boolean z4;
        int i12;
        z9 z9Var = this.r;
        g gVar2 = z9Var.r0;
        OvershootInterpolator overshootInterpolator = z9Var.c0;
        RectF rectF = z9Var.S;
        RectF rectF2 = z9Var.T;
        p9 p9Var = z9Var.a0;
        if (z9Var.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = z9Var.x;
            z9Var.O();
            u9 u9Var = z9Var.W;
            Paint paint = this.a;
            Path path = this.e;
            if (u9Var != null) {
                canvas.save();
                int[] m9 = z9Var.m();
                c3 = 1;
                float f12 = m9[1] + z9Var.b;
                f10 = 8.0f;
                float f13 = m9[0] + z9Var.a;
                canvas.translate(f13, f12);
                u9 u9Var2 = z9Var.W;
                MessageObject messageObject = u9Var2 instanceof t1 ? ((t1) u9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(z9Var.u(org.telegram.ui.ActionBar.k6.vf));
                } else {
                    paint.setColor(z9Var.u(org.telegram.ui.ActionBar.k6.Wb));
                }
                int length = z9Var.t(z9Var.W, false).length();
                int i14 = z9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    z9Var.j(i14, p9Var, false);
                    Layout layout = p9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = z9Var.v - p9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + p9Var.c);
                        float f14 = primaryHorizontal + p9Var.d;
                        Rect rect = p9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - z9Var.a;
                            i12 = rect.bottom - z9Var.b;
                            f11 = f15;
                            z4 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(z9Var.v);
                            f11 = f14;
                            z4 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f16 = i12;
                        float f17 = f12 + f16;
                        i10 = i13;
                        if (f17 <= i10 + z9Var.e0 || f17 >= z9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z4) {
                            canvas.save();
                            float f18 = dp;
                            canvas.translate(f11 - f18, f16);
                            float interpolation = overshootInterpolator.getInterpolation(z9Var.V);
                            float f19 = f18 / 2.0f;
                            canvas.scale(interpolation, interpolation, f19, f19);
                            path.reset();
                            Path.Direction direction = Path.Direction.CCW;
                            path.addCircle(f19, f19, f19, direction);
                            path.addRect(f19, 0.0f, f18, f19, direction);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f20 = f13 + f11;
                            rectF2.set(f20 - f18, f17 - f18, f20, f17 + f18);
                            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                        } else {
                            canvas.save();
                            canvas.translate(f11, f16);
                            float interpolation2 = overshootInterpolator.getInterpolation(z9Var.V);
                            float f21 = dp;
                            float f22 = f21 / 2.0f;
                            canvas.scale(interpolation2, interpolation2, f22, f22);
                            path.reset();
                            Path.Direction direction2 = Path.Direction.CCW;
                            path.addCircle(f22, f22, f22, direction2);
                            path.addRect(0.0f, 0.0f, f22, f22, direction2);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f23 = f13 + f11;
                            rectF2.set(f23, f17 - f21, f23 + f21, f17 + f21);
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
                f10 = 8.0f;
                i11 = 0;
            }
            z9Var.P();
            if (z9Var.W != null) {
                canvas.save();
                int[] m10 = z9Var.m();
                float f24 = m10[c3] + z9Var.b;
                float f25 = m10[0] + z9Var.a;
                canvas.translate(f25, f24);
                int length3 = z9Var.t(z9Var.W, false).length();
                int i16 = z9Var.u;
                if (i16 >= 0 && i16 <= length3) {
                    z9Var.j(i16, p9Var, false);
                    Layout layout2 = p9Var.b;
                    if (layout2 != null) {
                        int i17 = z9Var.u - p9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + p9Var.c);
                        float f26 = primaryHorizontal2 + p9Var.d;
                        Rect rect2 = p9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - z9Var.a;
                            lineBottom2 = rect2.bottom - z9Var.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(z9Var.u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 <= i10 + z9Var.e0 || f28 >= z9Var.F.getMeasuredHeight()) {
                            if (f28 > 0.0f && f28 - z9Var.n() < z9Var.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f26, f27);
                            float interpolation3 = overshootInterpolator.getInterpolation(z9Var.V);
                            float f29 = dp;
                            float f30 = f29 / 2.0f;
                            canvas.scale(interpolation3, interpolation3, f30, f30);
                            path.reset();
                            Path.Direction direction3 = Path.Direction.CCW;
                            path.addCircle(f30, f30, f30, direction3);
                            path.addRect(0.0f, 0.0f, f30, f30, direction3);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f31 = f25 + f26;
                            rectF.set(f31, f28 - f29, f31 + f29, f28 + f29);
                            rectF.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
                        } else {
                            canvas.save();
                            float f32 = dp;
                            canvas.translate(f26 - f32, f27);
                            float interpolation4 = overshootInterpolator.getInterpolation(z9Var.V);
                            float f33 = f32 / 2.0f;
                            canvas.scale(interpolation4, interpolation4, f33, f33);
                            path.reset();
                            Path.Direction direction4 = Path.Direction.CCW;
                            path.addCircle(f33, f33, f33, direction4);
                            path.addRect(f33, 0.0f, f32, f33, direction4);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f34 = f25 + f26;
                            rectF.set(f34 - f32, f28 - f32, f34, f28 + f32);
                            rectF.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
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
            if (i11 != 0 && z9Var.i) {
                if (!z9Var.j) {
                    z9Var.O();
                }
                z9.a(z9Var, z9Var.b0);
                if (z9Var.I != z9Var.H || z9Var.L != z9Var.K) {
                    invalidate();
                }
            }
            if (!z9Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = z9Var.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = z9Var.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.k4) actionMode2).e();
                }
            }
            if (z9Var.k) {
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
        boolean z4;
        ViewParent parent;
        boolean z10;
        float f10;
        float f11;
        int l10;
        char charAt;
        char charAt2;
        z9 z9Var = this.r;
        g gVar = z9Var.r0;
        m2.b bVar = z9Var.f0;
        p9 p9Var = z9Var.a0;
        if (!z9Var.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return z9Var.i;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i10 = z9Var.b0 - x10;
        z9Var.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!z9Var.i) {
                float f12 = x10;
                float f13 = y10;
                if (z9Var.S.contains(f12, f13)) {
                    z9Var.P();
                    if (z9Var.W == null) {
                        return false;
                    }
                    z9Var.i = true;
                    z9Var.j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] C = z9Var.C(z9Var.u);
                    float n10 = z9Var.n() / 2;
                    int[] m9 = z9Var.m();
                    if (z9Var.i0) {
                        z9Var.f = ((C[0] + z9Var.a) + m9[0]) - x10;
                    } else {
                        z9Var.f = 0.0f;
                    }
                    z9Var.g = (((C[1] + z9Var.b) + m9[1]) - y10) - n10;
                    z9Var.v();
                    z9Var.C.invalidate();
                    return true;
                }
                if (!z9Var.T.contains(f12, f13)) {
                    z9Var.i = false;
                    z9Var.e = true;
                    return z9Var.i;
                }
                z9Var.O();
                if (z9Var.W == null) {
                    return false;
                }
                z9Var.i = true;
                z9Var.j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] C2 = z9Var.C(z9Var.v);
                float n11 = z9Var.n() / 2;
                int[] m10 = z9Var.m();
                z9Var.f = ((C2[0] + z9Var.a) + m10[0]) - x10;
                z9Var.g = (((C2[1] + z9Var.b) + m10[1]) - y10) - n11;
                z9.a(z9Var, z9Var.b0);
                z9Var.v();
                z9Var.C.invalidate();
                return true;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (z9Var.i) {
                    if (z9Var.j) {
                        z9Var.P();
                    } else {
                        z9Var.O();
                    }
                    if (z9Var.W == null) {
                        return z9Var.i;
                    }
                    int i11 = (int) (x10 + z9Var.f);
                    int i12 = (int) (y10 + z9Var.g);
                    boolean Q = z9Var.Q(i11, i12);
                    if (z9Var.W != null) {
                        if (z9Var.j) {
                            z9Var.j(z9Var.u, p9Var, false);
                        } else {
                            z9Var.j(z9Var.v, p9Var, false);
                        }
                        if (p9Var.b != null) {
                            float f14 = p9Var.c;
                            u9 u9Var = z9Var.W;
                            int[] m11 = z9Var.m();
                            int i13 = i12 - m11[1];
                            int i14 = i11 - m11[0];
                            boolean z11 = z9Var.E != null;
                            boolean z12 = z11 && y10 - z9Var.m > z9Var.F.getMeasuredHeight() - z9Var.p() && (z9Var.k0 || z9Var.Z || z9Var.W.getBottom() > z9Var.F.getMeasuredHeight() - z9Var.p());
                            if (z11) {
                                if (y10 < z9Var.q() + ((View) z9Var.F.getParent()).getTop() && (z9Var.Z || z9Var.W.getTop() < z9Var.q())) {
                                    z10 = true;
                                    if (!z12 || z10) {
                                        if (!z9Var.N) {
                                            z9Var.N = true;
                                            AndroidUtilities.runOnUIThread(bVar);
                                        }
                                        z9Var.O = z12;
                                        if (z12) {
                                            f10 = -z9Var.W.getTop();
                                            f11 = z9Var.g;
                                        } else {
                                            f10 = z9Var.F.getMeasuredHeight() - z9Var.W.getTop();
                                            f11 = z9Var.g;
                                        }
                                        i13 = (int) (f10 + f11);
                                    } else if (z9Var.N) {
                                        z9Var.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(bVar);
                                    }
                                    l10 = z9Var.l(i14, i13, z9Var.a, z9Var.b, z9Var.W, false);
                                    if (l10 >= 0) {
                                        if (z9Var.R) {
                                            if (!Q) {
                                                if (l10 < z9Var.u) {
                                                    z9Var.R = false;
                                                    z9Var.j = true;
                                                    z9Var.v();
                                                } else if (l10 > z9Var.v) {
                                                    z9Var.R = false;
                                                    z9Var.j = false;
                                                    z9Var.v();
                                                }
                                            }
                                        }
                                        if (z9Var.j) {
                                            if (z9Var.u != l10 && z9Var.c(l10)) {
                                                CharSequence t6 = z9Var.t(z9Var.W, false);
                                                z9Var.j(l10, p9Var, false);
                                                Layout layout = p9Var.b;
                                                z9Var.j(z9Var.u, p9Var, false);
                                                Layout layout2 = p9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = l10;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !z9.z(t6.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(z9Var.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(l10);
                                                    if (Q || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(z9Var.u) && lineForOffset3 == lineForOffset)) {
                                                        z9Var.B(l10, i15, Q, z9Var.a0.c, f14, u9Var);
                                                        AndroidUtilities.vibrateCursor(z9Var.C);
                                                        z9Var.x();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(l10)) || layout2.isRtlCharAt(l10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        z9Var.u = l10;
                                                        int i17 = z9Var.v;
                                                        if (l10 > i17) {
                                                            z9Var.v = l10;
                                                            z9Var.u = i17;
                                                            z9Var.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(z9Var.C);
                                                        z9Var.x();
                                                    } else {
                                                        int i18 = l10;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= t6.length() || !z9.z(t6.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(l10 - i15);
                                                        int abs2 = Math.abs(l10 - i18);
                                                        if (z9Var.y) {
                                                            z9Var.y = i10 >= 0;
                                                        }
                                                        int i20 = l10 - 1;
                                                        boolean z13 = i20 > 0 && z9.z(t6.charAt(i20));
                                                        if (l10 >= t6.length()) {
                                                            l10 = t6.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = t6.charAt(l10);
                                                        }
                                                        if (z9Var.u >= t6.length()) {
                                                            z9Var.u = t6.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = t6.charAt(z9Var.u);
                                                        }
                                                        int i21 = z9Var.u;
                                                        if ((l10 < i21 && abs < abs2) || ((l10 > i21 && i10 < 0) || !z9.z(charAt) || ((z9.z(charAt2) && !z9Var.y) || l10 == 0 || !z13 || charAt2 == '\n'))) {
                                                            if (!z9Var.y || l10 != 1) {
                                                                if (l10 >= z9Var.u || !z9.z(charAt) || ((z9.z(charAt2) && !z9Var.y) || charAt2 == '\n')) {
                                                                    z9Var.u = l10;
                                                                } else {
                                                                    z9Var.u = i15;
                                                                    z9Var.y = true;
                                                                }
                                                                int i22 = z9Var.u;
                                                                int i23 = z9Var.v;
                                                                if (i22 > i23) {
                                                                    z9Var.v = i22;
                                                                    z9Var.u = i23;
                                                                    z9Var.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(z9Var.C);
                                                                z9Var.x();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z9Var.G();
                                        } else {
                                            if (l10 != z9Var.v && z9Var.c(l10)) {
                                                CharSequence t9 = z9Var.t(z9Var.W, false);
                                                int i24 = l10;
                                                while (i24 < t9.length() && z9.z(t9.charAt(i24))) {
                                                    i24++;
                                                }
                                                z9Var.j(l10, p9Var, false);
                                                Layout layout3 = p9Var.b;
                                                z9Var.j(z9Var.v, p9Var, false);
                                                Layout layout4 = p9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (l10 > t9.length()) {
                                                        l10 = t9.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(z9Var.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(l10);
                                                    if (Q || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(z9Var.v) && lineForOffset6 == lineForOffset4)) {
                                                        z9Var.B(l10, i24, Q, z9Var.a0.c, f14, u9Var);
                                                        AndroidUtilities.vibrateCursor(z9Var.C);
                                                        z9Var.x();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(l10)) || layout4.isRtlCharAt(l10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        z9Var.v = l10;
                                                        int i25 = z9Var.u;
                                                        if (i25 > l10) {
                                                            z9Var.v = i25;
                                                            z9Var.u = l10;
                                                            z9Var.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(z9Var.C);
                                                        z9Var.x();
                                                    } else {
                                                        int i26 = l10;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !z9.z(t9.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(l10 - i24);
                                                        int abs4 = Math.abs(l10 - i26);
                                                        int i28 = l10 - 1;
                                                        boolean z14 = i28 > 0 && z9.z(t9.charAt(i28));
                                                        if (z9Var.y) {
                                                            z9Var.y = i10 <= 0;
                                                        }
                                                        int i29 = z9Var.v;
                                                        boolean z15 = i29 > 0 && z9.z(t9.charAt(i29 - 1));
                                                        int i30 = z9Var.v;
                                                        if ((l10 > i30 && abs3 <= abs4) || ((l10 < i30 && i10 > 0) || !z14 || (z15 && !z9Var.y))) {
                                                            if (l10 <= i30 || !z14 || (z15 && !z9Var.y)) {
                                                                z9Var.v = l10;
                                                            } else {
                                                                z9Var.v = i24;
                                                                z9Var.y = true;
                                                            }
                                                            int i31 = z9Var.u;
                                                            int i32 = z9Var.v;
                                                            if (i31 > i32) {
                                                                z9Var.v = i31;
                                                                z9Var.u = i32;
                                                                z9Var.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(z9Var.C);
                                                            z9Var.x();
                                                        }
                                                    }
                                                }
                                            }
                                            z9Var.G();
                                        }
                                    }
                                    z9.a(z9Var, z9Var.b0);
                                }
                            }
                            z10 = false;
                            if (z12) {
                            }
                            if (!z9Var.N) {
                            }
                            z9Var.O = z12;
                            if (z12) {
                            }
                            i13 = (int) (f10 + f11);
                            l10 = z9Var.l(i14, i13, z9Var.a, z9Var.b, z9Var.W, false);
                            if (l10 >= 0) {
                            }
                            z9.a(z9Var, z9Var.b0);
                        }
                    }
                    return true;
                }
            }
            return z9Var.i;
        }
        z9Var.w();
        if (!z9Var.i || (parent = getParent()) == null) {
            z4 = false;
        } else {
            z4 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        z9Var.i = z4;
        z9Var.R = z4;
        z9Var.k = z4;
        if (z9Var.y()) {
            z9Var.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            z9Var.V();
        }
        if (z9Var.N) {
            z9Var.N = false;
            AndroidUtilities.cancelRunOnUIThread(bVar);
        }
        return z9Var.i;
    }
}
