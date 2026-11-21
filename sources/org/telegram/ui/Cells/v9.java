package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.fj;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        if (w9Var.x() && !w9Var.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && a8.w9.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < w9Var.m) {
                w9Var.K(motionEvent.getRawX(), motionEvent.getRawY());
                w9Var.u();
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
        if (!w9Var.i0 || (viewGroup = w9Var.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f fVar;
        int i7;
        char c10;
        float f10;
        int i10;
        boolean isRtlCharAt;
        float f11;
        boolean z10;
        int i11;
        w9 w9Var = this.r;
        f fVar2 = w9Var.m0;
        OvershootInterpolator overshootInterpolator = w9Var.c0;
        RectF rectF = w9Var.S;
        RectF rectF2 = w9Var.T;
        m9 m9Var = w9Var.a0;
        if (w9Var.x()) {
            int L = org.telegram.messenger.g0.L(22.0f);
            int i12 = w9Var.x;
            w9Var.N();
            r9 r9Var = w9Var.W;
            Paint paint = this.a;
            Path path = this.e;
            if (r9Var != null) {
                canvas.save();
                int[] l10 = w9Var.l();
                c10 = 1;
                float f12 = l10[1] + w9Var.b;
                f10 = 8.0f;
                float f13 = l10[0] + w9Var.a;
                canvas.translate(f13, f12);
                r9 r9Var2 = w9Var.W;
                fj messageObject = r9Var2 instanceof r1 ? ((r1) r9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.P3()) {
                    paint.setColor(w9Var.t(org.telegram.ui.ActionBar.m6.mg));
                } else {
                    paint.setColor(w9Var.t(org.telegram.ui.ActionBar.m6.Nc));
                }
                int length = w9Var.s(w9Var.W, false).length();
                int i13 = w9Var.v;
                if (i13 >= 0 && i13 <= length) {
                    w9Var.i(i13, m9Var, false);
                    Layout layout = (Layout) m9Var.d;
                    if (layout != null) {
                        fVar = fVar2;
                        int i14 = w9Var.v - m9Var.a;
                        int length2 = layout.getText().length();
                        if (i14 > length2) {
                            i14 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i14);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i14);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + m9Var.b);
                        float f14 = primaryHorizontal + m9Var.c;
                        Rect rect = (Rect) m9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - w9Var.a;
                            i11 = rect.bottom - w9Var.b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(w9Var.v);
                            f11 = f14;
                            z10 = isRtlCharAt2;
                            i11 = lineBottom;
                        }
                        float f16 = i11;
                        float f17 = f12 + f16;
                        i7 = i12;
                        if (f17 <= i7 + w9Var.d0 || f17 >= w9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f18 = L;
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
                            rectF2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                        } else {
                            canvas.save();
                            canvas.translate(f11, f16);
                            float interpolation2 = overshootInterpolator.getInterpolation(w9Var.V);
                            float f21 = L;
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
                            rectF2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                            i10 = 1;
                            canvas.restore();
                        }
                        i10 = 0;
                        canvas.restore();
                    }
                }
                fVar = fVar2;
                i7 = i12;
                i10 = 0;
                canvas.restore();
            } else {
                fVar = fVar2;
                i7 = i12;
                c10 = 1;
                f10 = 8.0f;
                i10 = 0;
            }
            w9Var.O();
            if (w9Var.W != null) {
                canvas.save();
                int[] l11 = w9Var.l();
                float f24 = l11[c10] + w9Var.b;
                float f25 = l11[0] + w9Var.a;
                canvas.translate(f25, f24);
                int length3 = w9Var.s(w9Var.W, false).length();
                int i15 = w9Var.u;
                if (i15 >= 0 && i15 <= length3) {
                    w9Var.i(i15, m9Var, false);
                    Layout layout2 = (Layout) m9Var.d;
                    if (layout2 != null) {
                        int i16 = w9Var.u - m9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i16);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i16);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + m9Var.b);
                        float f26 = primaryHorizontal2 + m9Var.c;
                        Rect rect2 = (Rect) m9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - w9Var.a;
                            lineBottom2 = rect2.bottom - w9Var.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(w9Var.u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 <= i7 + w9Var.d0 || f28 >= w9Var.F.getMeasuredHeight()) {
                            if (f28 > 0.0f && f28 - w9Var.m() < w9Var.F.getMeasuredHeight()) {
                                i10++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f26, f27);
                            float interpolation3 = overshootInterpolator.getInterpolation(w9Var.V);
                            float f29 = L;
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
                            rectF.inset(-org.telegram.messenger.g0.L(f10), -org.telegram.messenger.g0.L(f10));
                        } else {
                            canvas.save();
                            float f32 = L;
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
                            rectF.inset(-org.telegram.messenger.g0.L(f10), -org.telegram.messenger.g0.L(f10));
                            i10++;
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i10 != 0 && w9Var.i) {
                if (!w9Var.j) {
                    w9Var.N();
                }
                w9.a(w9Var, w9Var.b0);
                if (w9Var.I != w9Var.H || w9Var.L != w9Var.K) {
                    invalidate();
                }
            }
            if (!w9Var.Q) {
                org.telegram.messenger.g0.r(fVar);
                org.telegram.messenger.g0.g3(fVar);
            }
            org.telegram.ui.ActionBar.x3 x3Var = w9Var.Y;
            if (x3Var != null) {
                x3Var.invalidateContentRect();
                org.telegram.ui.ActionBar.x3 x3Var2 = w9Var.Y;
                if (x3Var2 != null) {
                    x3Var2.c();
                }
            }
            if (w9Var.k) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r6 != 3) goto L304;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
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
        int k10;
        char charAt;
        char charAt2;
        w9 w9Var = this.r;
        f fVar = w9Var.m0;
        e9 e9Var = w9Var.e0;
        m9 m9Var = w9Var.a0;
        if (!w9Var.x()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return w9Var.i;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i7 = w9Var.b0 - x10;
        w9Var.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!w9Var.i) {
                float f12 = x10;
                float f13 = y10;
                if (w9Var.S.contains(f12, f13)) {
                    w9Var.O();
                    if (w9Var.W != null) {
                        w9Var.i = true;
                        w9Var.j = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B = w9Var.B(w9Var.u);
                        float m10 = w9Var.m() / 2;
                        int[] l10 = w9Var.l();
                        if (w9Var.h0) {
                            w9Var.f = ((B[0] + w9Var.a) + l10[0]) - x10;
                        } else {
                            w9Var.f = 0.0f;
                        }
                        w9Var.g = (((B[1] + w9Var.b) + l10[1]) - y10) - m10;
                        w9Var.u();
                        w9Var.C.invalidate();
                        return true;
                    }
                } else {
                    if (!w9Var.T.contains(f12, f13)) {
                        w9Var.i = false;
                        w9Var.e = true;
                        return w9Var.i;
                    }
                    w9Var.N();
                    if (w9Var.W != null) {
                        w9Var.i = true;
                        w9Var.j = false;
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B2 = w9Var.B(w9Var.v);
                        float m11 = w9Var.m() / 2;
                        int[] l11 = w9Var.l();
                        w9Var.f = ((B2[0] + w9Var.a) + l11[0]) - x10;
                        w9Var.g = (((B2[1] + w9Var.b) + l11[1]) - y10) - m11;
                        w9.a(w9Var, w9Var.b0);
                        w9Var.u();
                        w9Var.C.invalidate();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (w9Var.i) {
                    if (w9Var.j) {
                        w9Var.O();
                    } else {
                        w9Var.N();
                    }
                    if (w9Var.W == null) {
                        return w9Var.i;
                    }
                    int i10 = (int) (x10 + w9Var.f);
                    int i11 = (int) (y10 + w9Var.g);
                    boolean P = w9Var.P(i10, i11);
                    if (w9Var.W != null) {
                        if (w9Var.j) {
                            w9Var.i(w9Var.u, m9Var, false);
                        } else {
                            w9Var.i(w9Var.v, m9Var, false);
                        }
                        if (((Layout) m9Var.d) != null) {
                            float f14 = m9Var.b;
                            r9 r9Var = w9Var.W;
                            int[] l12 = w9Var.l();
                            int i12 = i11 - l12[1];
                            int i13 = i10 - l12[0];
                            boolean z12 = w9Var.E != null;
                            boolean z13 = z12 && y10 - w9Var.m > w9Var.F.getMeasuredHeight() - w9Var.o() && (w9Var.j0 || w9Var.Z || w9Var.W.getBottom() > w9Var.F.getMeasuredHeight() - w9Var.o());
                            if (z12) {
                                if (y10 < w9Var.p() + ((View) w9Var.F.getParent()).getTop() && (w9Var.Z || w9Var.W.getTop() < w9Var.p())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!w9Var.N) {
                                            w9Var.N = true;
                                            org.telegram.messenger.g0.g3(e9Var);
                                        }
                                        w9Var.O = z13;
                                        if (z13) {
                                            f10 = -w9Var.W.getTop();
                                            f11 = w9Var.g;
                                        } else {
                                            f10 = w9Var.F.getMeasuredHeight() - w9Var.W.getTop();
                                            f11 = w9Var.g;
                                        }
                                        i12 = (int) (f10 + f11);
                                    } else if (w9Var.N) {
                                        w9Var.N = false;
                                        org.telegram.messenger.g0.r(e9Var);
                                    }
                                    k10 = w9Var.k(i13, i12, w9Var.a, w9Var.b, w9Var.W, false);
                                    if (k10 >= 0) {
                                        if (w9Var.R) {
                                            if (!P) {
                                                if (k10 < w9Var.u) {
                                                    w9Var.R = false;
                                                    w9Var.j = true;
                                                    w9Var.u();
                                                } else if (k10 > w9Var.v) {
                                                    w9Var.R = false;
                                                    w9Var.j = false;
                                                    w9Var.u();
                                                }
                                            }
                                        }
                                        if (w9Var.j) {
                                            if (w9Var.u != k10 && w9Var.c(k10)) {
                                                CharSequence s5 = w9Var.s(w9Var.W, false);
                                                w9Var.i(k10, m9Var, false);
                                                Layout layout = (Layout) m9Var.d;
                                                w9Var.i(w9Var.u, m9Var, false);
                                                Layout layout2 = (Layout) m9Var.d;
                                                if (layout != null && layout2 != null) {
                                                    int i14 = k10;
                                                    while (true) {
                                                        int i15 = i14 - 1;
                                                        if (i15 < 0 || !w9.y(s5.charAt(i15))) {
                                                            break;
                                                        }
                                                        i14--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i14);
                                                    int lineForOffset2 = layout2.getLineForOffset(w9Var.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(k10);
                                                    if (P || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(w9Var.u) && lineForOffset3 == lineForOffset)) {
                                                        w9Var.A(k10, i14, P, w9Var.a0.b, f14, r9Var);
                                                        org.telegram.messenger.g0.a4(w9Var.C);
                                                        w9Var.w();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(k10)) || layout2.isRtlCharAt(k10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        w9Var.u = k10;
                                                        int i16 = w9Var.v;
                                                        if (k10 > i16) {
                                                            w9Var.v = k10;
                                                            w9Var.u = i16;
                                                            w9Var.j = false;
                                                        }
                                                        org.telegram.messenger.g0.a4(w9Var.C);
                                                        w9Var.w();
                                                    } else {
                                                        int i17 = k10;
                                                        while (true) {
                                                            int i18 = i17 + 1;
                                                            if (i18 >= s5.length() || !w9.y(s5.charAt(i18))) {
                                                                break;
                                                            }
                                                            i17 = i18;
                                                        }
                                                        int abs = Math.abs(k10 - i14);
                                                        int abs2 = Math.abs(k10 - i17);
                                                        if (w9Var.y) {
                                                            w9Var.y = i7 >= 0;
                                                        }
                                                        int i19 = k10 - 1;
                                                        boolean z14 = i19 > 0 && w9.y(s5.charAt(i19));
                                                        if (k10 >= s5.length()) {
                                                            k10 = s5.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = s5.charAt(k10);
                                                        }
                                                        if (w9Var.u >= s5.length()) {
                                                            w9Var.u = s5.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = s5.charAt(w9Var.u);
                                                        }
                                                        int i20 = w9Var.u;
                                                        if ((k10 < i20 && abs < abs2) || ((k10 > i20 && i7 < 0) || !w9.y(charAt) || ((w9.y(charAt2) && !w9Var.y) || k10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!w9Var.y || k10 != 1) {
                                                                if (k10 >= w9Var.u || !w9.y(charAt) || ((w9.y(charAt2) && !w9Var.y) || charAt2 == '\n')) {
                                                                    w9Var.u = k10;
                                                                } else {
                                                                    w9Var.u = i14;
                                                                    w9Var.y = true;
                                                                }
                                                                int i21 = w9Var.u;
                                                                int i22 = w9Var.v;
                                                                if (i21 > i22) {
                                                                    w9Var.v = i21;
                                                                    w9Var.u = i22;
                                                                    w9Var.j = false;
                                                                }
                                                                org.telegram.messenger.g0.a4(w9Var.C);
                                                                w9Var.w();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            w9Var.F();
                                        } else {
                                            if (k10 != w9Var.v && w9Var.c(k10)) {
                                                CharSequence s9 = w9Var.s(w9Var.W, false);
                                                int i23 = k10;
                                                while (i23 < s9.length() && w9.y(s9.charAt(i23))) {
                                                    i23++;
                                                }
                                                w9Var.i(k10, m9Var, false);
                                                Layout layout3 = (Layout) m9Var.d;
                                                w9Var.i(w9Var.v, m9Var, false);
                                                Layout layout4 = (Layout) m9Var.d;
                                                if (layout3 != null && layout4 != null) {
                                                    if (k10 > s9.length()) {
                                                        k10 = s9.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i23);
                                                    int lineForOffset5 = layout4.getLineForOffset(w9Var.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(k10);
                                                    if (P || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(w9Var.v) && lineForOffset6 == lineForOffset4)) {
                                                        w9Var.A(k10, i23, P, w9Var.a0.b, f14, r9Var);
                                                        org.telegram.messenger.g0.a4(w9Var.C);
                                                        w9Var.w();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(k10)) || layout4.isRtlCharAt(k10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        w9Var.v = k10;
                                                        int i24 = w9Var.u;
                                                        if (i24 > k10) {
                                                            w9Var.v = i24;
                                                            w9Var.u = k10;
                                                            w9Var.j = true;
                                                        }
                                                        org.telegram.messenger.g0.a4(w9Var.C);
                                                        w9Var.w();
                                                    } else {
                                                        int i25 = k10;
                                                        while (true) {
                                                            int i26 = i25 - 1;
                                                            if (i26 < 0 || !w9.y(s9.charAt(i26))) {
                                                                break;
                                                            }
                                                            i25--;
                                                        }
                                                        int abs3 = Math.abs(k10 - i23);
                                                        int abs4 = Math.abs(k10 - i25);
                                                        int i27 = k10 - 1;
                                                        boolean z15 = i27 > 0 && w9.y(s9.charAt(i27));
                                                        if (w9Var.y) {
                                                            w9Var.y = i7 <= 0;
                                                        }
                                                        int i28 = w9Var.v;
                                                        boolean z16 = i28 > 0 && w9.y(s9.charAt(i28 - 1));
                                                        int i29 = w9Var.v;
                                                        if ((k10 > i29 && abs3 <= abs4) || ((k10 < i29 && i7 > 0) || !z15 || (z16 && !w9Var.y))) {
                                                            if (k10 <= i29 || !z15 || (z16 && !w9Var.y)) {
                                                                w9Var.v = k10;
                                                            } else {
                                                                w9Var.v = i23;
                                                                w9Var.y = true;
                                                            }
                                                            int i30 = w9Var.u;
                                                            int i31 = w9Var.v;
                                                            if (i30 > i31) {
                                                                w9Var.v = i30;
                                                                w9Var.u = i31;
                                                                w9Var.j = true;
                                                            }
                                                            org.telegram.messenger.g0.a4(w9Var.C);
                                                            w9Var.w();
                                                        }
                                                    }
                                                }
                                            }
                                            w9Var.F();
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
                            i12 = (int) (f10 + f11);
                            k10 = w9Var.k(i13, i12, w9Var.a, w9Var.b, w9Var.W, false);
                            if (k10 >= 0) {
                            }
                            w9.a(w9Var, w9Var.b0);
                        }
                    }
                    return true;
                }
            }
            return w9Var.i;
        }
        w9Var.v();
        if (!w9Var.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        w9Var.i = z10;
        w9Var.R = z10;
        w9Var.k = z10;
        if (w9Var.x()) {
            w9Var.C.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.g3(fVar);
            w9Var.U();
        }
        if (w9Var.N) {
            w9Var.N = false;
            org.telegram.messenger.g0.r(e9Var);
        }
        return w9Var.i;
    }
}
