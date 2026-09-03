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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x9 extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ y9 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(y9 y9Var, Context context) {
        super(context);
        this.r = y9Var;
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
        y9 y9Var = this.r;
        if (y9Var.y() && !y9Var.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && k7.n6.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < y9Var.m) {
                y9Var.L(motionEvent.getRawX(), motionEvent.getRawY());
                y9Var.v();
                y9Var.f(false);
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
        y9 y9Var = this.r;
        if (!y9Var.j0 || (viewGroup = y9Var.F) == null) {
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
        y9 y9Var = this.r;
        g gVar2 = y9Var.r0;
        OvershootInterpolator overshootInterpolator = y9Var.c0;
        RectF rectF = y9Var.S;
        RectF rectF2 = y9Var.T;
        o9 o9Var = y9Var.a0;
        if (y9Var.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = y9Var.x;
            y9Var.O();
            t9 t9Var = y9Var.W;
            Paint paint = this.a;
            Path path = this.e;
            if (t9Var != null) {
                canvas.save();
                int[] m9 = y9Var.m();
                c3 = 1;
                float f12 = m9[1] + y9Var.b;
                f10 = 8.0f;
                float f13 = m9[0] + y9Var.a;
                canvas.translate(f13, f12);
                t9 t9Var2 = y9Var.W;
                MessageObject messageObject = t9Var2 instanceof s1 ? ((s1) t9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(y9Var.u(org.telegram.ui.ActionBar.j6.vf));
                } else {
                    paint.setColor(y9Var.u(org.telegram.ui.ActionBar.j6.Wb));
                }
                int length = y9Var.t(y9Var.W, false).length();
                int i14 = y9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    y9Var.j(i14, o9Var, false);
                    Layout layout = o9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = y9Var.v - o9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + o9Var.c);
                        float f14 = primaryHorizontal + o9Var.d;
                        Rect rect = o9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - y9Var.a;
                            i12 = rect.bottom - y9Var.b;
                            f11 = f15;
                            z4 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(y9Var.v);
                            f11 = f14;
                            z4 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f16 = i12;
                        float f17 = f12 + f16;
                        i10 = i13;
                        if (f17 <= i10 + y9Var.e0 || f17 >= y9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z4) {
                            canvas.save();
                            float f18 = dp;
                            canvas.translate(f11 - f18, f16);
                            float interpolation = overshootInterpolator.getInterpolation(y9Var.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(y9Var.V);
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
            y9Var.P();
            if (y9Var.W != null) {
                canvas.save();
                int[] m10 = y9Var.m();
                float f24 = m10[c3] + y9Var.b;
                float f25 = m10[0] + y9Var.a;
                canvas.translate(f25, f24);
                int length3 = y9Var.t(y9Var.W, false).length();
                int i16 = y9Var.u;
                if (i16 >= 0 && i16 <= length3) {
                    y9Var.j(i16, o9Var, false);
                    Layout layout2 = o9Var.b;
                    if (layout2 != null) {
                        int i17 = y9Var.u - o9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + o9Var.c);
                        float f26 = primaryHorizontal2 + o9Var.d;
                        Rect rect2 = o9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - y9Var.a;
                            lineBottom2 = rect2.bottom - y9Var.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(y9Var.u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 <= i10 + y9Var.e0 || f28 >= y9Var.F.getMeasuredHeight()) {
                            if (f28 > 0.0f && f28 - y9Var.n() < y9Var.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f26, f27);
                            float interpolation3 = overshootInterpolator.getInterpolation(y9Var.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(y9Var.V);
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
            if (i11 != 0 && y9Var.i) {
                if (!y9Var.j) {
                    y9Var.O();
                }
                y9.a(y9Var, y9Var.b0);
                if (y9Var.I != y9Var.H || y9Var.L != y9Var.K) {
                    invalidate();
                }
            }
            if (!y9Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = y9Var.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = y9Var.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.j4) actionMode2).e();
                }
            }
            if (y9Var.k) {
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
        y9 y9Var = this.r;
        g gVar = y9Var.r0;
        m2.b bVar = y9Var.f0;
        o9 o9Var = y9Var.a0;
        if (!y9Var.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return y9Var.i;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i10 = y9Var.b0 - x10;
        y9Var.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!y9Var.i) {
                float f12 = x10;
                float f13 = y10;
                if (y9Var.S.contains(f12, f13)) {
                    y9Var.P();
                    if (y9Var.W == null) {
                        return false;
                    }
                    y9Var.i = true;
                    y9Var.j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] C = y9Var.C(y9Var.u);
                    float n10 = y9Var.n() / 2;
                    int[] m9 = y9Var.m();
                    if (y9Var.i0) {
                        y9Var.f = ((C[0] + y9Var.a) + m9[0]) - x10;
                    } else {
                        y9Var.f = 0.0f;
                    }
                    y9Var.g = (((C[1] + y9Var.b) + m9[1]) - y10) - n10;
                    y9Var.v();
                    y9Var.C.invalidate();
                    return true;
                }
                if (!y9Var.T.contains(f12, f13)) {
                    y9Var.i = false;
                    y9Var.e = true;
                    return y9Var.i;
                }
                y9Var.O();
                if (y9Var.W == null) {
                    return false;
                }
                y9Var.i = true;
                y9Var.j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] C2 = y9Var.C(y9Var.v);
                float n11 = y9Var.n() / 2;
                int[] m10 = y9Var.m();
                y9Var.f = ((C2[0] + y9Var.a) + m10[0]) - x10;
                y9Var.g = (((C2[1] + y9Var.b) + m10[1]) - y10) - n11;
                y9.a(y9Var, y9Var.b0);
                y9Var.v();
                y9Var.C.invalidate();
                return true;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (y9Var.i) {
                    if (y9Var.j) {
                        y9Var.P();
                    } else {
                        y9Var.O();
                    }
                    if (y9Var.W == null) {
                        return y9Var.i;
                    }
                    int i11 = (int) (x10 + y9Var.f);
                    int i12 = (int) (y10 + y9Var.g);
                    boolean Q = y9Var.Q(i11, i12);
                    if (y9Var.W != null) {
                        if (y9Var.j) {
                            y9Var.j(y9Var.u, o9Var, false);
                        } else {
                            y9Var.j(y9Var.v, o9Var, false);
                        }
                        if (o9Var.b != null) {
                            float f14 = o9Var.c;
                            t9 t9Var = y9Var.W;
                            int[] m11 = y9Var.m();
                            int i13 = i12 - m11[1];
                            int i14 = i11 - m11[0];
                            boolean z11 = y9Var.E != null;
                            boolean z12 = z11 && y10 - y9Var.m > y9Var.F.getMeasuredHeight() - y9Var.p() && (y9Var.k0 || y9Var.Z || y9Var.W.getBottom() > y9Var.F.getMeasuredHeight() - y9Var.p());
                            if (z11) {
                                if (y10 < y9Var.q() + ((View) y9Var.F.getParent()).getTop() && (y9Var.Z || y9Var.W.getTop() < y9Var.q())) {
                                    z10 = true;
                                    if (!z12 || z10) {
                                        if (!y9Var.N) {
                                            y9Var.N = true;
                                            AndroidUtilities.runOnUIThread(bVar);
                                        }
                                        y9Var.O = z12;
                                        if (z12) {
                                            f10 = -y9Var.W.getTop();
                                            f11 = y9Var.g;
                                        } else {
                                            f10 = y9Var.F.getMeasuredHeight() - y9Var.W.getTop();
                                            f11 = y9Var.g;
                                        }
                                        i13 = (int) (f10 + f11);
                                    } else if (y9Var.N) {
                                        y9Var.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(bVar);
                                    }
                                    l10 = y9Var.l(i14, i13, y9Var.a, y9Var.b, y9Var.W, false);
                                    if (l10 >= 0) {
                                        if (y9Var.R) {
                                            if (!Q) {
                                                if (l10 < y9Var.u) {
                                                    y9Var.R = false;
                                                    y9Var.j = true;
                                                    y9Var.v();
                                                } else if (l10 > y9Var.v) {
                                                    y9Var.R = false;
                                                    y9Var.j = false;
                                                    y9Var.v();
                                                }
                                            }
                                        }
                                        if (y9Var.j) {
                                            if (y9Var.u != l10 && y9Var.c(l10)) {
                                                CharSequence t6 = y9Var.t(y9Var.W, false);
                                                y9Var.j(l10, o9Var, false);
                                                Layout layout = o9Var.b;
                                                y9Var.j(y9Var.u, o9Var, false);
                                                Layout layout2 = o9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = l10;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !y9.z(t6.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(y9Var.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(l10);
                                                    if (Q || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(y9Var.u) && lineForOffset3 == lineForOffset)) {
                                                        y9Var.B(l10, i15, Q, y9Var.a0.c, f14, t9Var);
                                                        AndroidUtilities.vibrateCursor(y9Var.C);
                                                        y9Var.x();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(l10)) || layout2.isRtlCharAt(l10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        y9Var.u = l10;
                                                        int i17 = y9Var.v;
                                                        if (l10 > i17) {
                                                            y9Var.v = l10;
                                                            y9Var.u = i17;
                                                            y9Var.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(y9Var.C);
                                                        y9Var.x();
                                                    } else {
                                                        int i18 = l10;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= t6.length() || !y9.z(t6.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(l10 - i15);
                                                        int abs2 = Math.abs(l10 - i18);
                                                        if (y9Var.y) {
                                                            y9Var.y = i10 >= 0;
                                                        }
                                                        int i20 = l10 - 1;
                                                        boolean z13 = i20 > 0 && y9.z(t6.charAt(i20));
                                                        if (l10 >= t6.length()) {
                                                            l10 = t6.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = t6.charAt(l10);
                                                        }
                                                        if (y9Var.u >= t6.length()) {
                                                            y9Var.u = t6.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = t6.charAt(y9Var.u);
                                                        }
                                                        int i21 = y9Var.u;
                                                        if ((l10 < i21 && abs < abs2) || ((l10 > i21 && i10 < 0) || !y9.z(charAt) || ((y9.z(charAt2) && !y9Var.y) || l10 == 0 || !z13 || charAt2 == '\n'))) {
                                                            if (!y9Var.y || l10 != 1) {
                                                                if (l10 >= y9Var.u || !y9.z(charAt) || ((y9.z(charAt2) && !y9Var.y) || charAt2 == '\n')) {
                                                                    y9Var.u = l10;
                                                                } else {
                                                                    y9Var.u = i15;
                                                                    y9Var.y = true;
                                                                }
                                                                int i22 = y9Var.u;
                                                                int i23 = y9Var.v;
                                                                if (i22 > i23) {
                                                                    y9Var.v = i22;
                                                                    y9Var.u = i23;
                                                                    y9Var.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(y9Var.C);
                                                                y9Var.x();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            y9Var.G();
                                        } else {
                                            if (l10 != y9Var.v && y9Var.c(l10)) {
                                                CharSequence t9 = y9Var.t(y9Var.W, false);
                                                int i24 = l10;
                                                while (i24 < t9.length() && y9.z(t9.charAt(i24))) {
                                                    i24++;
                                                }
                                                y9Var.j(l10, o9Var, false);
                                                Layout layout3 = o9Var.b;
                                                y9Var.j(y9Var.v, o9Var, false);
                                                Layout layout4 = o9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (l10 > t9.length()) {
                                                        l10 = t9.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(y9Var.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(l10);
                                                    if (Q || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(y9Var.v) && lineForOffset6 == lineForOffset4)) {
                                                        y9Var.B(l10, i24, Q, y9Var.a0.c, f14, t9Var);
                                                        AndroidUtilities.vibrateCursor(y9Var.C);
                                                        y9Var.x();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(l10)) || layout4.isRtlCharAt(l10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        y9Var.v = l10;
                                                        int i25 = y9Var.u;
                                                        if (i25 > l10) {
                                                            y9Var.v = i25;
                                                            y9Var.u = l10;
                                                            y9Var.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(y9Var.C);
                                                        y9Var.x();
                                                    } else {
                                                        int i26 = l10;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !y9.z(t9.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(l10 - i24);
                                                        int abs4 = Math.abs(l10 - i26);
                                                        int i28 = l10 - 1;
                                                        boolean z14 = i28 > 0 && y9.z(t9.charAt(i28));
                                                        if (y9Var.y) {
                                                            y9Var.y = i10 <= 0;
                                                        }
                                                        int i29 = y9Var.v;
                                                        boolean z15 = i29 > 0 && y9.z(t9.charAt(i29 - 1));
                                                        int i30 = y9Var.v;
                                                        if ((l10 > i30 && abs3 <= abs4) || ((l10 < i30 && i10 > 0) || !z14 || (z15 && !y9Var.y))) {
                                                            if (l10 <= i30 || !z14 || (z15 && !y9Var.y)) {
                                                                y9Var.v = l10;
                                                            } else {
                                                                y9Var.v = i24;
                                                                y9Var.y = true;
                                                            }
                                                            int i31 = y9Var.u;
                                                            int i32 = y9Var.v;
                                                            if (i31 > i32) {
                                                                y9Var.v = i31;
                                                                y9Var.u = i32;
                                                                y9Var.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(y9Var.C);
                                                            y9Var.x();
                                                        }
                                                    }
                                                }
                                            }
                                            y9Var.G();
                                        }
                                    }
                                    y9.a(y9Var, y9Var.b0);
                                }
                            }
                            z10 = false;
                            if (z12) {
                            }
                            if (!y9Var.N) {
                            }
                            y9Var.O = z12;
                            if (z12) {
                            }
                            i13 = (int) (f10 + f11);
                            l10 = y9Var.l(i14, i13, y9Var.a, y9Var.b, y9Var.W, false);
                            if (l10 >= 0) {
                            }
                            y9.a(y9Var, y9Var.b0);
                        }
                    }
                    return true;
                }
            }
            return y9Var.i;
        }
        y9Var.w();
        if (!y9Var.i || (parent = getParent()) == null) {
            z4 = false;
        } else {
            z4 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        y9Var.i = z4;
        y9Var.R = z4;
        y9Var.k = z4;
        if (y9Var.y()) {
            y9Var.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            y9Var.V();
        }
        if (y9Var.N) {
            y9Var.N = false;
            AndroidUtilities.cancelRunOnUIThread(bVar);
        }
        return y9Var.i;
    }
}
