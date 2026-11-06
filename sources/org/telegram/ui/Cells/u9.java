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
import org.telegram.messenger.ij;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class u9 extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ v9 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(v9 v9Var, Context context) {
        super(context);
        this.r = v9Var;
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
        v9 v9Var = this.r;
        if (v9Var.x() && !v9Var.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && a8.r9.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < v9Var.m) {
                v9Var.K(motionEvent.getRawX(), motionEvent.getRawY());
                v9Var.u();
                v9Var.f(false);
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
        v9 v9Var = this.r;
        if (!v9Var.i0 || (viewGroup = v9Var.F) == null) {
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
        boolean z9;
        int i11;
        v9 v9Var = this.r;
        f fVar2 = v9Var.m0;
        OvershootInterpolator overshootInterpolator = v9Var.c0;
        RectF rectF = v9Var.S;
        RectF rectF2 = v9Var.T;
        l9 l9Var = v9Var.a0;
        if (v9Var.x()) {
            int L = org.telegram.messenger.g0.L(22.0f);
            int i12 = v9Var.x;
            v9Var.N();
            q9 q9Var = v9Var.W;
            Paint paint = this.a;
            Path path = this.e;
            if (q9Var != null) {
                canvas.save();
                int[] l10 = v9Var.l();
                c10 = 1;
                float f12 = l10[1] + v9Var.b;
                f10 = 8.0f;
                float f13 = l10[0] + v9Var.a;
                canvas.translate(f13, f12);
                q9 q9Var2 = v9Var.W;
                ij messageObject = q9Var2 instanceof q1 ? ((q1) q9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.Q3()) {
                    paint.setColor(v9Var.t(org.telegram.ui.ActionBar.k6.jg));
                } else {
                    paint.setColor(v9Var.t(org.telegram.ui.ActionBar.k6.Kc));
                }
                int length = v9Var.s(v9Var.W, false).length();
                int i13 = v9Var.v;
                if (i13 >= 0 && i13 <= length) {
                    v9Var.i(i13, l9Var, false);
                    Layout layout = (Layout) l9Var.d;
                    if (layout != null) {
                        fVar = fVar2;
                        int i14 = v9Var.v - l9Var.a;
                        int length2 = layout.getText().length();
                        if (i14 > length2) {
                            i14 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i14);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i14);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + l9Var.b);
                        float f14 = primaryHorizontal + l9Var.c;
                        Rect rect = (Rect) l9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - v9Var.a;
                            i11 = rect.bottom - v9Var.b;
                            f11 = f15;
                            z9 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(v9Var.v);
                            f11 = f14;
                            z9 = isRtlCharAt2;
                            i11 = lineBottom;
                        }
                        float f16 = i11;
                        float f17 = f12 + f16;
                        i7 = i12;
                        if (f17 <= i7 + v9Var.d0 || f17 >= v9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z9) {
                            canvas.save();
                            float f18 = L;
                            canvas.translate(f11 - f18, f16);
                            float interpolation = overshootInterpolator.getInterpolation(v9Var.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(v9Var.V);
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
            v9Var.O();
            if (v9Var.W != null) {
                canvas.save();
                int[] l11 = v9Var.l();
                float f24 = l11[c10] + v9Var.b;
                float f25 = l11[0] + v9Var.a;
                canvas.translate(f25, f24);
                int length3 = v9Var.s(v9Var.W, false).length();
                int i15 = v9Var.u;
                if (i15 >= 0 && i15 <= length3) {
                    v9Var.i(i15, l9Var, false);
                    Layout layout2 = (Layout) l9Var.d;
                    if (layout2 != null) {
                        int i16 = v9Var.u - l9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i16);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i16);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + l9Var.b);
                        float f26 = primaryHorizontal2 + l9Var.c;
                        Rect rect2 = (Rect) l9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - v9Var.a;
                            lineBottom2 = rect2.bottom - v9Var.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(v9Var.u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 <= i7 + v9Var.d0 || f28 >= v9Var.F.getMeasuredHeight()) {
                            if (f28 > 0.0f && f28 - v9Var.m() < v9Var.F.getMeasuredHeight()) {
                                i10++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f26, f27);
                            float interpolation3 = overshootInterpolator.getInterpolation(v9Var.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(v9Var.V);
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
            if (i10 != 0 && v9Var.i) {
                if (!v9Var.j) {
                    v9Var.N();
                }
                v9.a(v9Var, v9Var.b0);
                if (v9Var.I != v9Var.H || v9Var.L != v9Var.K) {
                    invalidate();
                }
            }
            if (!v9Var.Q) {
                org.telegram.messenger.g0.r(fVar);
                org.telegram.messenger.g0.h3(fVar);
            }
            org.telegram.ui.ActionBar.w3 w3Var = v9Var.Y;
            if (w3Var != null) {
                w3Var.invalidateContentRect();
                org.telegram.ui.ActionBar.w3 w3Var2 = v9Var.Y;
                if (w3Var2 != null) {
                    w3Var2.c();
                }
            }
            if (v9Var.k) {
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
        boolean z9;
        ViewParent parent;
        boolean z10;
        float f10;
        float f11;
        int k10;
        char charAt;
        char charAt2;
        v9 v9Var = this.r;
        f fVar = v9Var.m0;
        d9 d9Var = v9Var.e0;
        l9 l9Var = v9Var.a0;
        if (!v9Var.x()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return v9Var.i;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i7 = v9Var.b0 - x10;
        v9Var.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!v9Var.i) {
                float f12 = x10;
                float f13 = y10;
                if (v9Var.S.contains(f12, f13)) {
                    v9Var.O();
                    if (v9Var.W != null) {
                        v9Var.i = true;
                        v9Var.j = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B = v9Var.B(v9Var.u);
                        float m10 = v9Var.m() / 2;
                        int[] l10 = v9Var.l();
                        if (v9Var.h0) {
                            v9Var.f = ((B[0] + v9Var.a) + l10[0]) - x10;
                        } else {
                            v9Var.f = 0.0f;
                        }
                        v9Var.g = (((B[1] + v9Var.b) + l10[1]) - y10) - m10;
                        v9Var.u();
                        v9Var.C.invalidate();
                        return true;
                    }
                } else {
                    if (!v9Var.T.contains(f12, f13)) {
                        v9Var.i = false;
                        v9Var.e = true;
                        return v9Var.i;
                    }
                    v9Var.N();
                    if (v9Var.W != null) {
                        v9Var.i = true;
                        v9Var.j = false;
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B2 = v9Var.B(v9Var.v);
                        float m11 = v9Var.m() / 2;
                        int[] l11 = v9Var.l();
                        v9Var.f = ((B2[0] + v9Var.a) + l11[0]) - x10;
                        v9Var.g = (((B2[1] + v9Var.b) + l11[1]) - y10) - m11;
                        v9.a(v9Var, v9Var.b0);
                        v9Var.u();
                        v9Var.C.invalidate();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (v9Var.i) {
                    if (v9Var.j) {
                        v9Var.O();
                    } else {
                        v9Var.N();
                    }
                    if (v9Var.W == null) {
                        return v9Var.i;
                    }
                    int i10 = (int) (x10 + v9Var.f);
                    int i11 = (int) (y10 + v9Var.g);
                    boolean P = v9Var.P(i10, i11);
                    if (v9Var.W != null) {
                        if (v9Var.j) {
                            v9Var.i(v9Var.u, l9Var, false);
                        } else {
                            v9Var.i(v9Var.v, l9Var, false);
                        }
                        if (((Layout) l9Var.d) != null) {
                            float f14 = l9Var.b;
                            q9 q9Var = v9Var.W;
                            int[] l12 = v9Var.l();
                            int i12 = i11 - l12[1];
                            int i13 = i10 - l12[0];
                            boolean z11 = v9Var.E != null;
                            boolean z12 = z11 && y10 - v9Var.m > v9Var.F.getMeasuredHeight() - v9Var.o() && (v9Var.j0 || v9Var.Z || v9Var.W.getBottom() > v9Var.F.getMeasuredHeight() - v9Var.o());
                            if (z11) {
                                if (y10 < v9Var.p() + ((View) v9Var.F.getParent()).getTop() && (v9Var.Z || v9Var.W.getTop() < v9Var.p())) {
                                    z10 = true;
                                    if (!z12 || z10) {
                                        if (!v9Var.N) {
                                            v9Var.N = true;
                                            org.telegram.messenger.g0.h3(d9Var);
                                        }
                                        v9Var.O = z12;
                                        if (z12) {
                                            f10 = -v9Var.W.getTop();
                                            f11 = v9Var.g;
                                        } else {
                                            f10 = v9Var.F.getMeasuredHeight() - v9Var.W.getTop();
                                            f11 = v9Var.g;
                                        }
                                        i12 = (int) (f10 + f11);
                                    } else if (v9Var.N) {
                                        v9Var.N = false;
                                        org.telegram.messenger.g0.r(d9Var);
                                    }
                                    k10 = v9Var.k(i13, i12, v9Var.a, v9Var.b, v9Var.W, false);
                                    if (k10 >= 0) {
                                        if (v9Var.R) {
                                            if (!P) {
                                                if (k10 < v9Var.u) {
                                                    v9Var.R = false;
                                                    v9Var.j = true;
                                                    v9Var.u();
                                                } else if (k10 > v9Var.v) {
                                                    v9Var.R = false;
                                                    v9Var.j = false;
                                                    v9Var.u();
                                                }
                                            }
                                        }
                                        if (v9Var.j) {
                                            if (v9Var.u != k10 && v9Var.c(k10)) {
                                                CharSequence s5 = v9Var.s(v9Var.W, false);
                                                v9Var.i(k10, l9Var, false);
                                                Layout layout = (Layout) l9Var.d;
                                                v9Var.i(v9Var.u, l9Var, false);
                                                Layout layout2 = (Layout) l9Var.d;
                                                if (layout != null && layout2 != null) {
                                                    int i14 = k10;
                                                    while (true) {
                                                        int i15 = i14 - 1;
                                                        if (i15 < 0 || !v9.y(s5.charAt(i15))) {
                                                            break;
                                                        }
                                                        i14--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i14);
                                                    int lineForOffset2 = layout2.getLineForOffset(v9Var.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(k10);
                                                    if (P || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(v9Var.u) && lineForOffset3 == lineForOffset)) {
                                                        v9Var.A(k10, i14, P, v9Var.a0.b, f14, q9Var);
                                                        org.telegram.messenger.g0.c4(v9Var.C);
                                                        v9Var.w();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(k10)) || layout2.isRtlCharAt(k10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        v9Var.u = k10;
                                                        int i16 = v9Var.v;
                                                        if (k10 > i16) {
                                                            v9Var.v = k10;
                                                            v9Var.u = i16;
                                                            v9Var.j = false;
                                                        }
                                                        org.telegram.messenger.g0.c4(v9Var.C);
                                                        v9Var.w();
                                                    } else {
                                                        int i17 = k10;
                                                        while (true) {
                                                            int i18 = i17 + 1;
                                                            if (i18 >= s5.length() || !v9.y(s5.charAt(i18))) {
                                                                break;
                                                            }
                                                            i17 = i18;
                                                        }
                                                        int abs = Math.abs(k10 - i14);
                                                        int abs2 = Math.abs(k10 - i17);
                                                        if (v9Var.y) {
                                                            v9Var.y = i7 >= 0;
                                                        }
                                                        int i19 = k10 - 1;
                                                        boolean z13 = i19 > 0 && v9.y(s5.charAt(i19));
                                                        if (k10 >= s5.length()) {
                                                            k10 = s5.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = s5.charAt(k10);
                                                        }
                                                        if (v9Var.u >= s5.length()) {
                                                            v9Var.u = s5.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = s5.charAt(v9Var.u);
                                                        }
                                                        int i20 = v9Var.u;
                                                        if ((k10 < i20 && abs < abs2) || ((k10 > i20 && i7 < 0) || !v9.y(charAt) || ((v9.y(charAt2) && !v9Var.y) || k10 == 0 || !z13 || charAt2 == '\n'))) {
                                                            if (!v9Var.y || k10 != 1) {
                                                                if (k10 >= v9Var.u || !v9.y(charAt) || ((v9.y(charAt2) && !v9Var.y) || charAt2 == '\n')) {
                                                                    v9Var.u = k10;
                                                                } else {
                                                                    v9Var.u = i14;
                                                                    v9Var.y = true;
                                                                }
                                                                int i21 = v9Var.u;
                                                                int i22 = v9Var.v;
                                                                if (i21 > i22) {
                                                                    v9Var.v = i21;
                                                                    v9Var.u = i22;
                                                                    v9Var.j = false;
                                                                }
                                                                org.telegram.messenger.g0.c4(v9Var.C);
                                                                v9Var.w();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            v9Var.F();
                                        } else {
                                            if (k10 != v9Var.v && v9Var.c(k10)) {
                                                CharSequence s9 = v9Var.s(v9Var.W, false);
                                                int i23 = k10;
                                                while (i23 < s9.length() && v9.y(s9.charAt(i23))) {
                                                    i23++;
                                                }
                                                v9Var.i(k10, l9Var, false);
                                                Layout layout3 = (Layout) l9Var.d;
                                                v9Var.i(v9Var.v, l9Var, false);
                                                Layout layout4 = (Layout) l9Var.d;
                                                if (layout3 != null && layout4 != null) {
                                                    if (k10 > s9.length()) {
                                                        k10 = s9.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i23);
                                                    int lineForOffset5 = layout4.getLineForOffset(v9Var.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(k10);
                                                    if (P || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(v9Var.v) && lineForOffset6 == lineForOffset4)) {
                                                        v9Var.A(k10, i23, P, v9Var.a0.b, f14, q9Var);
                                                        org.telegram.messenger.g0.c4(v9Var.C);
                                                        v9Var.w();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(k10)) || layout4.isRtlCharAt(k10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        v9Var.v = k10;
                                                        int i24 = v9Var.u;
                                                        if (i24 > k10) {
                                                            v9Var.v = i24;
                                                            v9Var.u = k10;
                                                            v9Var.j = true;
                                                        }
                                                        org.telegram.messenger.g0.c4(v9Var.C);
                                                        v9Var.w();
                                                    } else {
                                                        int i25 = k10;
                                                        while (true) {
                                                            int i26 = i25 - 1;
                                                            if (i26 < 0 || !v9.y(s9.charAt(i26))) {
                                                                break;
                                                            }
                                                            i25--;
                                                        }
                                                        int abs3 = Math.abs(k10 - i23);
                                                        int abs4 = Math.abs(k10 - i25);
                                                        int i27 = k10 - 1;
                                                        boolean z14 = i27 > 0 && v9.y(s9.charAt(i27));
                                                        if (v9Var.y) {
                                                            v9Var.y = i7 <= 0;
                                                        }
                                                        int i28 = v9Var.v;
                                                        boolean z15 = i28 > 0 && v9.y(s9.charAt(i28 - 1));
                                                        int i29 = v9Var.v;
                                                        if ((k10 > i29 && abs3 <= abs4) || ((k10 < i29 && i7 > 0) || !z14 || (z15 && !v9Var.y))) {
                                                            if (k10 <= i29 || !z14 || (z15 && !v9Var.y)) {
                                                                v9Var.v = k10;
                                                            } else {
                                                                v9Var.v = i23;
                                                                v9Var.y = true;
                                                            }
                                                            int i30 = v9Var.u;
                                                            int i31 = v9Var.v;
                                                            if (i30 > i31) {
                                                                v9Var.v = i30;
                                                                v9Var.u = i31;
                                                                v9Var.j = true;
                                                            }
                                                            org.telegram.messenger.g0.c4(v9Var.C);
                                                            v9Var.w();
                                                        }
                                                    }
                                                }
                                            }
                                            v9Var.F();
                                        }
                                    }
                                    v9.a(v9Var, v9Var.b0);
                                }
                            }
                            z10 = false;
                            if (z12) {
                            }
                            if (!v9Var.N) {
                            }
                            v9Var.O = z12;
                            if (z12) {
                            }
                            i12 = (int) (f10 + f11);
                            k10 = v9Var.k(i13, i12, v9Var.a, v9Var.b, v9Var.W, false);
                            if (k10 >= 0) {
                            }
                            v9.a(v9Var, v9Var.b0);
                        }
                    }
                    return true;
                }
            }
            return v9Var.i;
        }
        v9Var.v();
        if (!v9Var.i || (parent = getParent()) == null) {
            z9 = false;
        } else {
            z9 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        v9Var.i = z9;
        v9Var.R = z9;
        v9Var.k = z9;
        if (v9Var.x()) {
            v9Var.C.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar);
            v9Var.U();
        }
        if (v9Var.N) {
            v9Var.N = false;
            org.telegram.messenger.g0.r(d9Var);
        }
        return v9Var.i;
    }
}
