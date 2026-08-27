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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v9 extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ w9 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(w9 w9Var, Context context) {
        super(context);
        this.r = w9Var;
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
        w9 w9Var = this.r;
        if (w9Var.y() && !w9Var.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && h7.y.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < w9Var.m) {
                w9Var.L(motionEvent.getRawX(), motionEvent.getRawY());
                w9Var.v();
                w9Var.f(false);
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
        w9 w9Var = this.r;
        if (!w9Var.j0 || (viewGroup = w9Var.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i10;
        char c10;
        float f10;
        int i11;
        ActionMode actionMode;
        boolean isRtlCharAt;
        float f11;
        boolean z10;
        int i12;
        w9 w9Var = this.r;
        g gVar2 = w9Var.r0;
        OvershootInterpolator overshootInterpolator = w9Var.c0;
        RectF rectF = w9Var.S;
        RectF rectF2 = w9Var.T;
        m9 m9Var = w9Var.a0;
        if (w9Var.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = w9Var.x;
            w9Var.O();
            r9 r9Var = w9Var.W;
            Paint paint = this.a;
            Path path = this.e;
            if (r9Var != null) {
                canvas.save();
                int[] m10 = w9Var.m();
                c10 = 1;
                float f12 = m10[1] + w9Var.b;
                f10 = 8.0f;
                float f13 = m10[0] + w9Var.a;
                canvas.translate(f13, f12);
                r9 r9Var2 = w9Var.W;
                MessageObject messageObject = r9Var2 instanceof s1 ? ((s1) r9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(w9Var.u(org.telegram.ui.ActionBar.g6.vf));
                } else {
                    paint.setColor(w9Var.u(org.telegram.ui.ActionBar.g6.Wb));
                }
                int length = w9Var.t(w9Var.W, false).length();
                int i14 = w9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    w9Var.j(i14, m9Var, false);
                    Layout layout = m9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = w9Var.v - m9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + m9Var.c);
                        float f14 = primaryHorizontal + m9Var.d;
                        Rect rect = m9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - w9Var.a;
                            i12 = rect.bottom - w9Var.b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(w9Var.v);
                            f11 = f14;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f16 = i12;
                        float f17 = f12 + f16;
                        i10 = i13;
                        if (f17 <= i10 + w9Var.e0 || f17 >= w9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f18 = dp;
                            canvas.translate(f11 - f18, f16);
                            float interpolation = overshootInterpolator.getInterpolation(w9Var.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(w9Var.V);
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
                c10 = 1;
                f10 = 8.0f;
                i11 = 0;
            }
            w9Var.P();
            if (w9Var.W != null) {
                canvas.save();
                int[] m11 = w9Var.m();
                float f24 = m11[c10] + w9Var.b;
                float f25 = m11[0] + w9Var.a;
                canvas.translate(f25, f24);
                int length3 = w9Var.t(w9Var.W, false).length();
                int i16 = w9Var.u;
                if (i16 >= 0 && i16 <= length3) {
                    w9Var.j(i16, m9Var, false);
                    Layout layout2 = m9Var.b;
                    if (layout2 != null) {
                        int i17 = w9Var.u - m9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + m9Var.c);
                        float f26 = primaryHorizontal2 + m9Var.d;
                        Rect rect2 = m9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - w9Var.a;
                            lineBottom2 = rect2.bottom - w9Var.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(w9Var.u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 <= i10 + w9Var.e0 || f28 >= w9Var.F.getMeasuredHeight()) {
                            if (f28 > 0.0f && f28 - w9Var.n() < w9Var.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f26, f27);
                            float interpolation3 = overshootInterpolator.getInterpolation(w9Var.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(w9Var.V);
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
            if (i11 != 0 && w9Var.i) {
                if (!w9Var.j) {
                    w9Var.O();
                }
                w9.a(w9Var, w9Var.b0);
                if (w9Var.I != w9Var.H || w9Var.L != w9Var.K) {
                    invalidate();
                }
            }
            if (!w9Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = w9Var.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = w9Var.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.g4) actionMode2).e();
                }
            }
            if (w9Var.k) {
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
        float f10;
        float f11;
        int l10;
        char charAt;
        char charAt2;
        w9 w9Var = this.r;
        g gVar = w9Var.r0;
        m.i3 i3Var = w9Var.f0;
        m9 m9Var = w9Var.a0;
        if (!w9Var.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return w9Var.i;
        }
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i10 = w9Var.b0 - x8;
        w9Var.b0 = x8;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!w9Var.i) {
                float f12 = x8;
                float f13 = y10;
                if (w9Var.S.contains(f12, f13)) {
                    w9Var.P();
                    if (w9Var.W == null) {
                        return false;
                    }
                    w9Var.i = true;
                    w9Var.j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] C = w9Var.C(w9Var.u);
                    float n10 = w9Var.n() / 2;
                    int[] m10 = w9Var.m();
                    if (w9Var.i0) {
                        w9Var.f = ((C[0] + w9Var.a) + m10[0]) - x8;
                    } else {
                        w9Var.f = 0.0f;
                    }
                    w9Var.g = (((C[1] + w9Var.b) + m10[1]) - y10) - n10;
                    w9Var.v();
                    w9Var.C.invalidate();
                    return true;
                }
                if (!w9Var.T.contains(f12, f13)) {
                    w9Var.i = false;
                    w9Var.e = true;
                    return w9Var.i;
                }
                w9Var.O();
                if (w9Var.W == null) {
                    return false;
                }
                w9Var.i = true;
                w9Var.j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] C2 = w9Var.C(w9Var.v);
                float n11 = w9Var.n() / 2;
                int[] m11 = w9Var.m();
                w9Var.f = ((C2[0] + w9Var.a) + m11[0]) - x8;
                w9Var.g = (((C2[1] + w9Var.b) + m11[1]) - y10) - n11;
                w9.a(w9Var, w9Var.b0);
                w9Var.v();
                w9Var.C.invalidate();
                return true;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (w9Var.i) {
                    if (w9Var.j) {
                        w9Var.P();
                    } else {
                        w9Var.O();
                    }
                    if (w9Var.W == null) {
                        return w9Var.i;
                    }
                    int i11 = (int) (x8 + w9Var.f);
                    int i12 = (int) (y10 + w9Var.g);
                    boolean Q = w9Var.Q(i11, i12);
                    if (w9Var.W != null) {
                        if (w9Var.j) {
                            w9Var.j(w9Var.u, m9Var, false);
                        } else {
                            w9Var.j(w9Var.v, m9Var, false);
                        }
                        if (m9Var.b != null) {
                            float f14 = m9Var.c;
                            r9 r9Var = w9Var.W;
                            int[] m12 = w9Var.m();
                            int i13 = i12 - m12[1];
                            int i14 = i11 - m12[0];
                            boolean z12 = w9Var.E != null;
                            boolean z13 = z12 && y10 - w9Var.m > w9Var.F.getMeasuredHeight() - w9Var.p() && (w9Var.k0 || w9Var.Z || w9Var.W.getBottom() > w9Var.F.getMeasuredHeight() - w9Var.p());
                            if (z12) {
                                if (y10 < w9Var.q() + ((View) w9Var.F.getParent()).getTop() && (w9Var.Z || w9Var.W.getTop() < w9Var.q())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!w9Var.N) {
                                            w9Var.N = true;
                                            AndroidUtilities.runOnUIThread(i3Var);
                                        }
                                        w9Var.O = z13;
                                        if (z13) {
                                            f10 = -w9Var.W.getTop();
                                            f11 = w9Var.g;
                                        } else {
                                            f10 = w9Var.F.getMeasuredHeight() - w9Var.W.getTop();
                                            f11 = w9Var.g;
                                        }
                                        i13 = (int) (f10 + f11);
                                    } else if (w9Var.N) {
                                        w9Var.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                                    }
                                    l10 = w9Var.l(i14, i13, w9Var.a, w9Var.b, w9Var.W, false);
                                    if (l10 >= 0) {
                                        if (w9Var.R) {
                                            if (!Q) {
                                                if (l10 < w9Var.u) {
                                                    w9Var.R = false;
                                                    w9Var.j = true;
                                                    w9Var.v();
                                                } else if (l10 > w9Var.v) {
                                                    w9Var.R = false;
                                                    w9Var.j = false;
                                                    w9Var.v();
                                                }
                                            }
                                        }
                                        if (w9Var.j) {
                                            if (w9Var.u != l10 && w9Var.c(l10)) {
                                                CharSequence t10 = w9Var.t(w9Var.W, false);
                                                w9Var.j(l10, m9Var, false);
                                                Layout layout = m9Var.b;
                                                w9Var.j(w9Var.u, m9Var, false);
                                                Layout layout2 = m9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = l10;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !w9.z(t10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(w9Var.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(l10);
                                                    if (Q || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(w9Var.u) && lineForOffset3 == lineForOffset)) {
                                                        w9Var.B(l10, i15, Q, w9Var.a0.c, f14, r9Var);
                                                        AndroidUtilities.vibrateCursor(w9Var.C);
                                                        w9Var.x();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(l10)) || layout2.isRtlCharAt(l10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        w9Var.u = l10;
                                                        int i17 = w9Var.v;
                                                        if (l10 > i17) {
                                                            w9Var.v = l10;
                                                            w9Var.u = i17;
                                                            w9Var.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(w9Var.C);
                                                        w9Var.x();
                                                    } else {
                                                        int i18 = l10;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= t10.length() || !w9.z(t10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(l10 - i15);
                                                        int abs2 = Math.abs(l10 - i18);
                                                        if (w9Var.y) {
                                                            w9Var.y = i10 >= 0;
                                                        }
                                                        int i20 = l10 - 1;
                                                        boolean z14 = i20 > 0 && w9.z(t10.charAt(i20));
                                                        if (l10 >= t10.length()) {
                                                            l10 = t10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = t10.charAt(l10);
                                                        }
                                                        if (w9Var.u >= t10.length()) {
                                                            w9Var.u = t10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = t10.charAt(w9Var.u);
                                                        }
                                                        int i21 = w9Var.u;
                                                        if ((l10 < i21 && abs < abs2) || ((l10 > i21 && i10 < 0) || !w9.z(charAt) || ((w9.z(charAt2) && !w9Var.y) || l10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!w9Var.y || l10 != 1) {
                                                                if (l10 >= w9Var.u || !w9.z(charAt) || ((w9.z(charAt2) && !w9Var.y) || charAt2 == '\n')) {
                                                                    w9Var.u = l10;
                                                                } else {
                                                                    w9Var.u = i15;
                                                                    w9Var.y = true;
                                                                }
                                                                int i22 = w9Var.u;
                                                                int i23 = w9Var.v;
                                                                if (i22 > i23) {
                                                                    w9Var.v = i22;
                                                                    w9Var.u = i23;
                                                                    w9Var.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(w9Var.C);
                                                                w9Var.x();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            w9Var.G();
                                        } else {
                                            if (l10 != w9Var.v && w9Var.c(l10)) {
                                                CharSequence t11 = w9Var.t(w9Var.W, false);
                                                int i24 = l10;
                                                while (i24 < t11.length() && w9.z(t11.charAt(i24))) {
                                                    i24++;
                                                }
                                                w9Var.j(l10, m9Var, false);
                                                Layout layout3 = m9Var.b;
                                                w9Var.j(w9Var.v, m9Var, false);
                                                Layout layout4 = m9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (l10 > t11.length()) {
                                                        l10 = t11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(w9Var.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(l10);
                                                    if (Q || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(w9Var.v) && lineForOffset6 == lineForOffset4)) {
                                                        w9Var.B(l10, i24, Q, w9Var.a0.c, f14, r9Var);
                                                        AndroidUtilities.vibrateCursor(w9Var.C);
                                                        w9Var.x();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(l10)) || layout4.isRtlCharAt(l10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        w9Var.v = l10;
                                                        int i25 = w9Var.u;
                                                        if (i25 > l10) {
                                                            w9Var.v = i25;
                                                            w9Var.u = l10;
                                                            w9Var.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(w9Var.C);
                                                        w9Var.x();
                                                    } else {
                                                        int i26 = l10;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !w9.z(t11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(l10 - i24);
                                                        int abs4 = Math.abs(l10 - i26);
                                                        int i28 = l10 - 1;
                                                        boolean z15 = i28 > 0 && w9.z(t11.charAt(i28));
                                                        if (w9Var.y) {
                                                            w9Var.y = i10 <= 0;
                                                        }
                                                        int i29 = w9Var.v;
                                                        boolean z16 = i29 > 0 && w9.z(t11.charAt(i29 - 1));
                                                        int i30 = w9Var.v;
                                                        if ((l10 > i30 && abs3 <= abs4) || ((l10 < i30 && i10 > 0) || !z15 || (z16 && !w9Var.y))) {
                                                            if (l10 <= i30 || !z15 || (z16 && !w9Var.y)) {
                                                                w9Var.v = l10;
                                                            } else {
                                                                w9Var.v = i24;
                                                                w9Var.y = true;
                                                            }
                                                            int i31 = w9Var.u;
                                                            int i32 = w9Var.v;
                                                            if (i31 > i32) {
                                                                w9Var.v = i31;
                                                                w9Var.u = i32;
                                                                w9Var.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(w9Var.C);
                                                            w9Var.x();
                                                        }
                                                    }
                                                }
                                            }
                                            w9Var.G();
                                        }
                                    }
                                    w9.a(w9Var, w9Var.b0);
                                }
                            }
                            z11 = false;
                            if (z13) {
                            }
                            if (!w9Var.N) {
                            }
                            w9Var.O = z13;
                            if (z13) {
                            }
                            i13 = (int) (f10 + f11);
                            l10 = w9Var.l(i14, i13, w9Var.a, w9Var.b, w9Var.W, false);
                            if (l10 >= 0) {
                            }
                            w9.a(w9Var, w9Var.b0);
                        }
                    }
                    return true;
                }
            }
            return w9Var.i;
        }
        w9Var.w();
        if (!w9Var.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        w9Var.i = z10;
        w9Var.R = z10;
        w9Var.k = z10;
        if (w9Var.y()) {
            w9Var.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            w9Var.V();
        }
        if (w9Var.N) {
            w9Var.N = false;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
        }
        return w9Var.i;
    }
}
