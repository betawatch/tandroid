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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class da extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ ea r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(ea eaVar, Context context) {
        super(context);
        this.r = eaVar;
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
        ea eaVar = this.r;
        if (eaVar.y() && !eaVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && v7.a7.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < eaVar.m) {
                eaVar.L(motionEvent.getRawX(), motionEvent.getRawY());
                eaVar.v();
                eaVar.f(false);
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
        ea eaVar = this.r;
        if (!eaVar.j0 || (viewGroup = eaVar.F) == null) {
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
        ea eaVar = this.r;
        g gVar2 = eaVar.r0;
        OvershootInterpolator overshootInterpolator = eaVar.c0;
        RectF rectF = eaVar.S;
        RectF rectF2 = eaVar.T;
        u9 u9Var = eaVar.a0;
        if (eaVar.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = eaVar.x;
            eaVar.O();
            z9 z9Var = eaVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (z9Var != null) {
                canvas.save();
                int[] m10 = eaVar.m();
                c10 = 1;
                float f11 = m10[1] + eaVar.b;
                f7 = 8.0f;
                float f12 = m10[0] + eaVar.a;
                canvas.translate(f12, f11);
                z9 z9Var2 = eaVar.W;
                MessageObject messageObject = z9Var2 instanceof u1 ? ((u1) z9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(eaVar.u(org.telegram.ui.ActionBar.j6.vf));
                } else {
                    paint.setColor(eaVar.u(org.telegram.ui.ActionBar.j6.Wb));
                }
                int length = eaVar.t(eaVar.W, false).length();
                int i14 = eaVar.v;
                if (i14 >= 0 && i14 <= length) {
                    eaVar.j(i14, u9Var, false);
                    Layout layout = u9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = eaVar.v - u9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + u9Var.c);
                        float f13 = primaryHorizontal + u9Var.d;
                        Rect rect = u9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - eaVar.a;
                            i12 = rect.bottom - eaVar.b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(eaVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 <= i10 + eaVar.e0 || f16 >= eaVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f17 = dp;
                            canvas.translate(f10 - f17, f15);
                            float interpolation = overshootInterpolator.getInterpolation(eaVar.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(eaVar.V);
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
            eaVar.P();
            if (eaVar.W != null) {
                canvas.save();
                int[] m11 = eaVar.m();
                float f23 = m11[c10] + eaVar.b;
                float f24 = m11[0] + eaVar.a;
                canvas.translate(f24, f23);
                int length3 = eaVar.t(eaVar.W, false).length();
                int i16 = eaVar.u;
                if (i16 >= 0 && i16 <= length3) {
                    eaVar.j(i16, u9Var, false);
                    Layout layout2 = u9Var.b;
                    if (layout2 != null) {
                        int i17 = eaVar.u - u9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + u9Var.c);
                        float f25 = primaryHorizontal2 + u9Var.d;
                        Rect rect2 = u9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - eaVar.a;
                            lineBottom2 = rect2.bottom - eaVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(eaVar.u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 <= i10 + eaVar.e0 || f27 >= eaVar.F.getMeasuredHeight()) {
                            if (f27 > 0.0f && f27 - eaVar.n() < eaVar.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f25, f26);
                            float interpolation3 = overshootInterpolator.getInterpolation(eaVar.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(eaVar.V);
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
            if (i11 != 0 && eaVar.i) {
                if (!eaVar.j) {
                    eaVar.O();
                }
                ea.a(eaVar, eaVar.b0);
                if (eaVar.I != eaVar.H || eaVar.L != eaVar.K) {
                    invalidate();
                }
            }
            if (!eaVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = eaVar.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = eaVar.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.i4) actionMode2).e();
                }
            }
            if (eaVar.k) {
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
        ea eaVar = this.r;
        g gVar = eaVar.r0;
        u6 u6Var = eaVar.f0;
        u9 u9Var = eaVar.a0;
        if (!eaVar.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return eaVar.i;
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i10 = eaVar.b0 - x10;
        eaVar.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!eaVar.i) {
                float f11 = x10;
                float f12 = y3;
                if (eaVar.S.contains(f11, f12)) {
                    eaVar.P();
                    if (eaVar.W == null) {
                        return false;
                    }
                    eaVar.i = true;
                    eaVar.j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] C = eaVar.C(eaVar.u);
                    float n10 = eaVar.n() / 2;
                    int[] m10 = eaVar.m();
                    if (eaVar.i0) {
                        eaVar.f = ((C[0] + eaVar.a) + m10[0]) - x10;
                    } else {
                        eaVar.f = 0.0f;
                    }
                    eaVar.g = (((C[1] + eaVar.b) + m10[1]) - y3) - n10;
                    eaVar.v();
                    eaVar.C.invalidate();
                    return true;
                }
                if (!eaVar.T.contains(f11, f12)) {
                    eaVar.i = false;
                    eaVar.e = true;
                    return eaVar.i;
                }
                eaVar.O();
                if (eaVar.W == null) {
                    return false;
                }
                eaVar.i = true;
                eaVar.j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] C2 = eaVar.C(eaVar.v);
                float n11 = eaVar.n() / 2;
                int[] m11 = eaVar.m();
                eaVar.f = ((C2[0] + eaVar.a) + m11[0]) - x10;
                eaVar.g = (((C2[1] + eaVar.b) + m11[1]) - y3) - n11;
                ea.a(eaVar, eaVar.b0);
                eaVar.v();
                eaVar.C.invalidate();
                return true;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (eaVar.i) {
                    if (eaVar.j) {
                        eaVar.P();
                    } else {
                        eaVar.O();
                    }
                    if (eaVar.W == null) {
                        return eaVar.i;
                    }
                    int i11 = (int) (x10 + eaVar.f);
                    int i12 = (int) (y3 + eaVar.g);
                    boolean Q = eaVar.Q(i11, i12);
                    if (eaVar.W != null) {
                        if (eaVar.j) {
                            eaVar.j(eaVar.u, u9Var, false);
                        } else {
                            eaVar.j(eaVar.v, u9Var, false);
                        }
                        if (u9Var.b != null) {
                            float f13 = u9Var.c;
                            z9 z9Var = eaVar.W;
                            int[] m12 = eaVar.m();
                            int i13 = i12 - m12[1];
                            int i14 = i11 - m12[0];
                            boolean z12 = eaVar.E != null;
                            boolean z13 = z12 && y3 - eaVar.m > eaVar.F.getMeasuredHeight() - eaVar.p() && (eaVar.k0 || eaVar.Z || eaVar.W.getBottom() > eaVar.F.getMeasuredHeight() - eaVar.p());
                            if (z12) {
                                if (y3 < eaVar.q() + ((View) eaVar.F.getParent()).getTop() && (eaVar.Z || eaVar.W.getTop() < eaVar.q())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!eaVar.N) {
                                            eaVar.N = true;
                                            AndroidUtilities.runOnUIThread(u6Var);
                                        }
                                        eaVar.O = z13;
                                        if (z13) {
                                            f7 = -eaVar.W.getTop();
                                            f10 = eaVar.g;
                                        } else {
                                            f7 = eaVar.F.getMeasuredHeight() - eaVar.W.getTop();
                                            f10 = eaVar.g;
                                        }
                                        i13 = (int) (f7 + f10);
                                    } else if (eaVar.N) {
                                        eaVar.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(u6Var);
                                    }
                                    l4 = eaVar.l(i14, i13, eaVar.a, eaVar.b, eaVar.W, false);
                                    if (l4 >= 0) {
                                        if (eaVar.R) {
                                            if (!Q) {
                                                if (l4 < eaVar.u) {
                                                    eaVar.R = false;
                                                    eaVar.j = true;
                                                    eaVar.v();
                                                } else if (l4 > eaVar.v) {
                                                    eaVar.R = false;
                                                    eaVar.j = false;
                                                    eaVar.v();
                                                }
                                            }
                                        }
                                        if (eaVar.j) {
                                            if (eaVar.u != l4 && eaVar.c(l4)) {
                                                CharSequence t10 = eaVar.t(eaVar.W, false);
                                                eaVar.j(l4, u9Var, false);
                                                Layout layout = u9Var.b;
                                                eaVar.j(eaVar.u, u9Var, false);
                                                Layout layout2 = u9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = l4;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !ea.z(t10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(eaVar.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(l4);
                                                    if (Q || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(eaVar.u) && lineForOffset3 == lineForOffset)) {
                                                        eaVar.B(l4, i15, Q, eaVar.a0.c, f13, z9Var);
                                                        AndroidUtilities.vibrateCursor(eaVar.C);
                                                        eaVar.x();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(l4)) || layout2.isRtlCharAt(l4) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        eaVar.u = l4;
                                                        int i17 = eaVar.v;
                                                        if (l4 > i17) {
                                                            eaVar.v = l4;
                                                            eaVar.u = i17;
                                                            eaVar.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(eaVar.C);
                                                        eaVar.x();
                                                    } else {
                                                        int i18 = l4;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= t10.length() || !ea.z(t10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(l4 - i15);
                                                        int abs2 = Math.abs(l4 - i18);
                                                        if (eaVar.y) {
                                                            eaVar.y = i10 >= 0;
                                                        }
                                                        int i20 = l4 - 1;
                                                        boolean z14 = i20 > 0 && ea.z(t10.charAt(i20));
                                                        if (l4 >= t10.length()) {
                                                            l4 = t10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = t10.charAt(l4);
                                                        }
                                                        if (eaVar.u >= t10.length()) {
                                                            eaVar.u = t10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = t10.charAt(eaVar.u);
                                                        }
                                                        int i21 = eaVar.u;
                                                        if ((l4 < i21 && abs < abs2) || ((l4 > i21 && i10 < 0) || !ea.z(charAt) || ((ea.z(charAt2) && !eaVar.y) || l4 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!eaVar.y || l4 != 1) {
                                                                if (l4 >= eaVar.u || !ea.z(charAt) || ((ea.z(charAt2) && !eaVar.y) || charAt2 == '\n')) {
                                                                    eaVar.u = l4;
                                                                } else {
                                                                    eaVar.u = i15;
                                                                    eaVar.y = true;
                                                                }
                                                                int i22 = eaVar.u;
                                                                int i23 = eaVar.v;
                                                                if (i22 > i23) {
                                                                    eaVar.v = i22;
                                                                    eaVar.u = i23;
                                                                    eaVar.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(eaVar.C);
                                                                eaVar.x();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            eaVar.G();
                                        } else {
                                            if (l4 != eaVar.v && eaVar.c(l4)) {
                                                CharSequence t11 = eaVar.t(eaVar.W, false);
                                                int i24 = l4;
                                                while (i24 < t11.length() && ea.z(t11.charAt(i24))) {
                                                    i24++;
                                                }
                                                eaVar.j(l4, u9Var, false);
                                                Layout layout3 = u9Var.b;
                                                eaVar.j(eaVar.v, u9Var, false);
                                                Layout layout4 = u9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (l4 > t11.length()) {
                                                        l4 = t11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(eaVar.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(l4);
                                                    if (Q || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(eaVar.v) && lineForOffset6 == lineForOffset4)) {
                                                        eaVar.B(l4, i24, Q, eaVar.a0.c, f13, z9Var);
                                                        AndroidUtilities.vibrateCursor(eaVar.C);
                                                        eaVar.x();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(l4)) || layout4.isRtlCharAt(l4) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        eaVar.v = l4;
                                                        int i25 = eaVar.u;
                                                        if (i25 > l4) {
                                                            eaVar.v = i25;
                                                            eaVar.u = l4;
                                                            eaVar.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(eaVar.C);
                                                        eaVar.x();
                                                    } else {
                                                        int i26 = l4;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !ea.z(t11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(l4 - i24);
                                                        int abs4 = Math.abs(l4 - i26);
                                                        int i28 = l4 - 1;
                                                        boolean z15 = i28 > 0 && ea.z(t11.charAt(i28));
                                                        if (eaVar.y) {
                                                            eaVar.y = i10 <= 0;
                                                        }
                                                        int i29 = eaVar.v;
                                                        boolean z16 = i29 > 0 && ea.z(t11.charAt(i29 - 1));
                                                        int i30 = eaVar.v;
                                                        if ((l4 > i30 && abs3 <= abs4) || ((l4 < i30 && i10 > 0) || !z15 || (z16 && !eaVar.y))) {
                                                            if (l4 <= i30 || !z15 || (z16 && !eaVar.y)) {
                                                                eaVar.v = l4;
                                                            } else {
                                                                eaVar.v = i24;
                                                                eaVar.y = true;
                                                            }
                                                            int i31 = eaVar.u;
                                                            int i32 = eaVar.v;
                                                            if (i31 > i32) {
                                                                eaVar.v = i31;
                                                                eaVar.u = i32;
                                                                eaVar.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(eaVar.C);
                                                            eaVar.x();
                                                        }
                                                    }
                                                }
                                            }
                                            eaVar.G();
                                        }
                                    }
                                    ea.a(eaVar, eaVar.b0);
                                }
                            }
                            z11 = false;
                            if (z13) {
                            }
                            if (!eaVar.N) {
                            }
                            eaVar.O = z13;
                            if (z13) {
                            }
                            i13 = (int) (f7 + f10);
                            l4 = eaVar.l(i14, i13, eaVar.a, eaVar.b, eaVar.W, false);
                            if (l4 >= 0) {
                            }
                            ea.a(eaVar, eaVar.b0);
                        }
                    }
                    return true;
                }
            }
            return eaVar.i;
        }
        eaVar.w();
        if (!eaVar.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        eaVar.i = z10;
        eaVar.R = z10;
        eaVar.k = z10;
        if (eaVar.y()) {
            eaVar.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            eaVar.V();
        }
        if (eaVar.N) {
            eaVar.N = false;
            AndroidUtilities.cancelRunOnUIThread(u6Var);
        }
        return eaVar.i;
    }
}
