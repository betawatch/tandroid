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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ca extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ da r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(da daVar, Context context) {
        super(context);
        this.r = daVar;
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
        da daVar = this.r;
        if (daVar.y() && !daVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && v7.z6.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < daVar.m) {
                daVar.L(motionEvent.getRawX(), motionEvent.getRawY());
                daVar.v();
                daVar.f(false);
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
        da daVar = this.r;
        if (!daVar.j0 || (viewGroup = daVar.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i10;
        char c10;
        float f7;
        int i11;
        ActionMode actionMode;
        boolean isRtlCharAt;
        float f10;
        boolean z10;
        int i12;
        da daVar = this.r;
        g gVar2 = daVar.r0;
        OvershootInterpolator overshootInterpolator = daVar.c0;
        RectF rectF = daVar.S;
        RectF rectF2 = daVar.T;
        t9 t9Var = daVar.a0;
        if (daVar.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = daVar.x;
            daVar.O();
            y9 y9Var = daVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (y9Var != null) {
                canvas.save();
                int[] m10 = daVar.m();
                c10 = 1;
                float f11 = m10[1] + daVar.b;
                f7 = 8.0f;
                float f12 = m10[0] + daVar.a;
                canvas.translate(f12, f11);
                y9 y9Var2 = daVar.W;
                MessageObject messageObject = y9Var2 instanceof t1 ? ((t1) y9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(daVar.u(org.telegram.ui.ActionBar.j6.vf));
                } else {
                    paint.setColor(daVar.u(org.telegram.ui.ActionBar.j6.Wb));
                }
                int length = daVar.t(daVar.W, false).length();
                int i14 = daVar.v;
                if (i14 >= 0 && i14 <= length) {
                    daVar.j(i14, t9Var, false);
                    Layout layout = t9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = daVar.v - t9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + t9Var.c);
                        float f13 = primaryHorizontal + t9Var.d;
                        Rect rect = t9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - daVar.a;
                            i12 = rect.bottom - daVar.b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(daVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 <= i10 + daVar.e0 || f16 >= daVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f17 = dp;
                            canvas.translate(f10 - f17, f15);
                            float interpolation = overshootInterpolator.getInterpolation(daVar.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(daVar.V);
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
                c10 = 1;
                f7 = 8.0f;
                i11 = 0;
            }
            daVar.P();
            if (daVar.W != null) {
                canvas.save();
                int[] m11 = daVar.m();
                float f23 = m11[c10] + daVar.b;
                float f24 = m11[0] + daVar.a;
                canvas.translate(f24, f23);
                int length3 = daVar.t(daVar.W, false).length();
                int i16 = daVar.u;
                if (i16 >= 0 && i16 <= length3) {
                    daVar.j(i16, t9Var, false);
                    Layout layout2 = t9Var.b;
                    if (layout2 != null) {
                        int i17 = daVar.u - t9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + t9Var.c);
                        float f25 = primaryHorizontal2 + t9Var.d;
                        Rect rect2 = t9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - daVar.a;
                            lineBottom2 = rect2.bottom - daVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(daVar.u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 <= i10 + daVar.e0 || f27 >= daVar.F.getMeasuredHeight()) {
                            if (f27 > 0.0f && f27 - daVar.n() < daVar.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f25, f26);
                            float interpolation3 = overshootInterpolator.getInterpolation(daVar.V);
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
                            rectF.inset(-AndroidUtilities.dp(f7), -AndroidUtilities.dp(f7));
                        } else {
                            canvas.save();
                            float f31 = dp;
                            canvas.translate(f25 - f31, f26);
                            float interpolation4 = overshootInterpolator.getInterpolation(daVar.V);
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
                            rectF.inset(-AndroidUtilities.dp(f7), -AndroidUtilities.dp(f7));
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
            if (i11 != 0 && daVar.i) {
                if (!daVar.j) {
                    daVar.O();
                }
                da.a(daVar, daVar.b0);
                if (daVar.I != daVar.H || daVar.L != daVar.K) {
                    invalidate();
                }
            }
            if (!daVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = daVar.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = daVar.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.i4) actionMode2).e();
                }
            }
            if (daVar.k) {
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
        float f7;
        float f10;
        int l4;
        char charAt;
        char charAt2;
        da daVar = this.r;
        g gVar = daVar.r0;
        l7 l7Var = daVar.f0;
        t9 t9Var = daVar.a0;
        if (!daVar.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return daVar.i;
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i10 = daVar.b0 - x10;
        daVar.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!daVar.i) {
                float f11 = x10;
                float f12 = y3;
                if (daVar.S.contains(f11, f12)) {
                    daVar.P();
                    if (daVar.W == null) {
                        return false;
                    }
                    daVar.i = true;
                    daVar.j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] C = daVar.C(daVar.u);
                    float n10 = daVar.n() / 2;
                    int[] m10 = daVar.m();
                    if (daVar.i0) {
                        daVar.f = ((C[0] + daVar.a) + m10[0]) - x10;
                    } else {
                        daVar.f = 0.0f;
                    }
                    daVar.g = (((C[1] + daVar.b) + m10[1]) - y3) - n10;
                    daVar.v();
                    daVar.C.invalidate();
                    return true;
                }
                if (!daVar.T.contains(f11, f12)) {
                    daVar.i = false;
                    daVar.e = true;
                    return daVar.i;
                }
                daVar.O();
                if (daVar.W == null) {
                    return false;
                }
                daVar.i = true;
                daVar.j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] C2 = daVar.C(daVar.v);
                float n11 = daVar.n() / 2;
                int[] m11 = daVar.m();
                daVar.f = ((C2[0] + daVar.a) + m11[0]) - x10;
                daVar.g = (((C2[1] + daVar.b) + m11[1]) - y3) - n11;
                da.a(daVar, daVar.b0);
                daVar.v();
                daVar.C.invalidate();
                return true;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (daVar.i) {
                    if (daVar.j) {
                        daVar.P();
                    } else {
                        daVar.O();
                    }
                    if (daVar.W == null) {
                        return daVar.i;
                    }
                    int i11 = (int) (x10 + daVar.f);
                    int i12 = (int) (y3 + daVar.g);
                    boolean Q = daVar.Q(i11, i12);
                    if (daVar.W != null) {
                        if (daVar.j) {
                            daVar.j(daVar.u, t9Var, false);
                        } else {
                            daVar.j(daVar.v, t9Var, false);
                        }
                        if (t9Var.b != null) {
                            float f13 = t9Var.c;
                            y9 y9Var = daVar.W;
                            int[] m12 = daVar.m();
                            int i13 = i12 - m12[1];
                            int i14 = i11 - m12[0];
                            boolean z12 = daVar.E != null;
                            boolean z13 = z12 && y3 - daVar.m > daVar.F.getMeasuredHeight() - daVar.p() && (daVar.k0 || daVar.Z || daVar.W.getBottom() > daVar.F.getMeasuredHeight() - daVar.p());
                            if (z12) {
                                if (y3 < daVar.q() + ((View) daVar.F.getParent()).getTop() && (daVar.Z || daVar.W.getTop() < daVar.q())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!daVar.N) {
                                            daVar.N = true;
                                            AndroidUtilities.runOnUIThread(l7Var);
                                        }
                                        daVar.O = z13;
                                        if (z13) {
                                            f7 = -daVar.W.getTop();
                                            f10 = daVar.g;
                                        } else {
                                            f7 = daVar.F.getMeasuredHeight() - daVar.W.getTop();
                                            f10 = daVar.g;
                                        }
                                        i13 = (int) (f7 + f10);
                                    } else if (daVar.N) {
                                        daVar.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(l7Var);
                                    }
                                    l4 = daVar.l(i14, i13, daVar.a, daVar.b, daVar.W, false);
                                    if (l4 >= 0) {
                                        if (daVar.R) {
                                            if (!Q) {
                                                if (l4 < daVar.u) {
                                                    daVar.R = false;
                                                    daVar.j = true;
                                                    daVar.v();
                                                } else if (l4 > daVar.v) {
                                                    daVar.R = false;
                                                    daVar.j = false;
                                                    daVar.v();
                                                }
                                            }
                                        }
                                        if (daVar.j) {
                                            if (daVar.u != l4 && daVar.c(l4)) {
                                                CharSequence t10 = daVar.t(daVar.W, false);
                                                daVar.j(l4, t9Var, false);
                                                Layout layout = t9Var.b;
                                                daVar.j(daVar.u, t9Var, false);
                                                Layout layout2 = t9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = l4;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !da.z(t10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(daVar.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(l4);
                                                    if (Q || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(daVar.u) && lineForOffset3 == lineForOffset)) {
                                                        daVar.B(l4, i15, Q, daVar.a0.c, f13, y9Var);
                                                        AndroidUtilities.vibrateCursor(daVar.C);
                                                        daVar.x();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(l4)) || layout2.isRtlCharAt(l4) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        daVar.u = l4;
                                                        int i17 = daVar.v;
                                                        if (l4 > i17) {
                                                            daVar.v = l4;
                                                            daVar.u = i17;
                                                            daVar.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(daVar.C);
                                                        daVar.x();
                                                    } else {
                                                        int i18 = l4;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= t10.length() || !da.z(t10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(l4 - i15);
                                                        int abs2 = Math.abs(l4 - i18);
                                                        if (daVar.y) {
                                                            daVar.y = i10 >= 0;
                                                        }
                                                        int i20 = l4 - 1;
                                                        boolean z14 = i20 > 0 && da.z(t10.charAt(i20));
                                                        if (l4 >= t10.length()) {
                                                            l4 = t10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = t10.charAt(l4);
                                                        }
                                                        if (daVar.u >= t10.length()) {
                                                            daVar.u = t10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = t10.charAt(daVar.u);
                                                        }
                                                        int i21 = daVar.u;
                                                        if ((l4 < i21 && abs < abs2) || ((l4 > i21 && i10 < 0) || !da.z(charAt) || ((da.z(charAt2) && !daVar.y) || l4 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!daVar.y || l4 != 1) {
                                                                if (l4 >= daVar.u || !da.z(charAt) || ((da.z(charAt2) && !daVar.y) || charAt2 == '\n')) {
                                                                    daVar.u = l4;
                                                                } else {
                                                                    daVar.u = i15;
                                                                    daVar.y = true;
                                                                }
                                                                int i22 = daVar.u;
                                                                int i23 = daVar.v;
                                                                if (i22 > i23) {
                                                                    daVar.v = i22;
                                                                    daVar.u = i23;
                                                                    daVar.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(daVar.C);
                                                                daVar.x();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            daVar.G();
                                        } else {
                                            if (l4 != daVar.v && daVar.c(l4)) {
                                                CharSequence t11 = daVar.t(daVar.W, false);
                                                int i24 = l4;
                                                while (i24 < t11.length() && da.z(t11.charAt(i24))) {
                                                    i24++;
                                                }
                                                daVar.j(l4, t9Var, false);
                                                Layout layout3 = t9Var.b;
                                                daVar.j(daVar.v, t9Var, false);
                                                Layout layout4 = t9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (l4 > t11.length()) {
                                                        l4 = t11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(daVar.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(l4);
                                                    if (Q || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(daVar.v) && lineForOffset6 == lineForOffset4)) {
                                                        daVar.B(l4, i24, Q, daVar.a0.c, f13, y9Var);
                                                        AndroidUtilities.vibrateCursor(daVar.C);
                                                        daVar.x();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(l4)) || layout4.isRtlCharAt(l4) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        daVar.v = l4;
                                                        int i25 = daVar.u;
                                                        if (i25 > l4) {
                                                            daVar.v = i25;
                                                            daVar.u = l4;
                                                            daVar.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(daVar.C);
                                                        daVar.x();
                                                    } else {
                                                        int i26 = l4;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !da.z(t11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(l4 - i24);
                                                        int abs4 = Math.abs(l4 - i26);
                                                        int i28 = l4 - 1;
                                                        boolean z15 = i28 > 0 && da.z(t11.charAt(i28));
                                                        if (daVar.y) {
                                                            daVar.y = i10 <= 0;
                                                        }
                                                        int i29 = daVar.v;
                                                        boolean z16 = i29 > 0 && da.z(t11.charAt(i29 - 1));
                                                        int i30 = daVar.v;
                                                        if ((l4 > i30 && abs3 <= abs4) || ((l4 < i30 && i10 > 0) || !z15 || (z16 && !daVar.y))) {
                                                            if (l4 <= i30 || !z15 || (z16 && !daVar.y)) {
                                                                daVar.v = l4;
                                                            } else {
                                                                daVar.v = i24;
                                                                daVar.y = true;
                                                            }
                                                            int i31 = daVar.u;
                                                            int i32 = daVar.v;
                                                            if (i31 > i32) {
                                                                daVar.v = i31;
                                                                daVar.u = i32;
                                                                daVar.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(daVar.C);
                                                            daVar.x();
                                                        }
                                                    }
                                                }
                                            }
                                            daVar.G();
                                        }
                                    }
                                    da.a(daVar, daVar.b0);
                                }
                            }
                            z11 = false;
                            if (z13) {
                            }
                            if (!daVar.N) {
                            }
                            daVar.O = z13;
                            if (z13) {
                            }
                            i13 = (int) (f7 + f10);
                            l4 = daVar.l(i14, i13, daVar.a, daVar.b, daVar.W, false);
                            if (l4 >= 0) {
                            }
                            da.a(daVar, daVar.b0);
                        }
                    }
                    return true;
                }
            }
            return daVar.i;
        }
        daVar.w();
        if (!daVar.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        daVar.i = z10;
        daVar.R = z10;
        daVar.k = z10;
        if (daVar.y()) {
            daVar.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            daVar.V();
        }
        if (daVar.N) {
            daVar.N = false;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
        }
        return daVar.i;
    }
}
