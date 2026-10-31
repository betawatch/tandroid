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
import org.telegram.messenger.jj;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && w7.z8.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < w9Var.m) {
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
        int i10;
        char c10;
        float f7;
        int i11;
        boolean isRtlCharAt;
        float f10;
        boolean z10;
        int i12;
        w9 w9Var = this.r;
        f fVar2 = w9Var.m0;
        OvershootInterpolator overshootInterpolator = w9Var.c0;
        RectF rectF = w9Var.S;
        RectF rectF2 = w9Var.T;
        ge.b bVar = w9Var.a0;
        if (w9Var.x()) {
            int L = org.telegram.messenger.i0.L(22.0f);
            int i13 = w9Var.x;
            w9Var.N();
            r9 r9Var = w9Var.W;
            Paint paint = this.a;
            Path path = this.e;
            if (r9Var != null) {
                canvas.save();
                int[] l4 = w9Var.l();
                c10 = 1;
                float f11 = l4[1] + w9Var.b;
                f7 = 8.0f;
                float f12 = l4[0] + w9Var.a;
                canvas.translate(f12, f11);
                r9 r9Var2 = w9Var.W;
                jj messageObject = r9Var2 instanceof q1 ? ((q1) r9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.P3()) {
                    paint.setColor(w9Var.t(org.telegram.ui.ActionBar.t6.jg));
                } else {
                    paint.setColor(w9Var.t(org.telegram.ui.ActionBar.t6.Kc));
                }
                int length = w9Var.s(w9Var.W, false).length();
                int i14 = w9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    w9Var.i(i14, bVar, false);
                    Layout layout = (Layout) bVar.d;
                    if (layout != null) {
                        fVar = fVar2;
                        int i15 = w9Var.v - bVar.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + bVar.b);
                        float f13 = primaryHorizontal + bVar.c;
                        Rect rect = (Rect) bVar.e;
                        if (rect != null) {
                            float f14 = rect.right - w9Var.a;
                            i12 = rect.bottom - w9Var.b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(w9Var.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 <= i10 + w9Var.d0 || f16 >= w9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f17 = L;
                            canvas.translate(f10 - f17, f15);
                            float interpolation = overshootInterpolator.getInterpolation(w9Var.V);
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
                            rectF2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                        } else {
                            canvas.save();
                            canvas.translate(f10, f15);
                            float interpolation2 = overshootInterpolator.getInterpolation(w9Var.V);
                            float f20 = L;
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
                            rectF2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                            i11 = 1;
                            canvas.restore();
                        }
                        i11 = 0;
                        canvas.restore();
                    }
                }
                fVar = fVar2;
                i10 = i13;
                i11 = 0;
                canvas.restore();
            } else {
                fVar = fVar2;
                i10 = i13;
                c10 = 1;
                f7 = 8.0f;
                i11 = 0;
            }
            w9Var.O();
            if (w9Var.W != null) {
                canvas.save();
                int[] l10 = w9Var.l();
                float f23 = l10[c10] + w9Var.b;
                float f24 = l10[0] + w9Var.a;
                canvas.translate(f24, f23);
                int length3 = w9Var.s(w9Var.W, false).length();
                int i16 = w9Var.u;
                if (i16 >= 0 && i16 <= length3) {
                    w9Var.i(i16, bVar, false);
                    Layout layout2 = (Layout) bVar.d;
                    if (layout2 != null) {
                        int i17 = w9Var.u - bVar.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + bVar.b);
                        float f25 = primaryHorizontal2 + bVar.c;
                        Rect rect2 = (Rect) bVar.e;
                        if (rect2 != null) {
                            f25 = rect2.left - w9Var.a;
                            lineBottom2 = rect2.bottom - w9Var.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(w9Var.u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 <= i10 + w9Var.d0 || f27 >= w9Var.F.getMeasuredHeight()) {
                            if (f27 > 0.0f && f27 - w9Var.m() < w9Var.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f25, f26);
                            float interpolation3 = overshootInterpolator.getInterpolation(w9Var.V);
                            float f28 = L;
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
                            rectF.inset(-org.telegram.messenger.i0.L(f7), -org.telegram.messenger.i0.L(f7));
                        } else {
                            canvas.save();
                            float f31 = L;
                            canvas.translate(f25 - f31, f26);
                            float interpolation4 = overshootInterpolator.getInterpolation(w9Var.V);
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
                            rectF.inset(-org.telegram.messenger.i0.L(f7), -org.telegram.messenger.i0.L(f7));
                            i11++;
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
            if (i11 != 0 && w9Var.i) {
                if (!w9Var.j) {
                    w9Var.N();
                }
                w9.a(w9Var, w9Var.b0);
                if (w9Var.I != w9Var.H || w9Var.L != w9Var.K) {
                    invalidate();
                }
            }
            if (!w9Var.Q) {
                org.telegram.messenger.i0.r(fVar);
                org.telegram.messenger.i0.g3(fVar);
            }
            org.telegram.ui.ActionBar.d4 d4Var = w9Var.Y;
            if (d4Var != null) {
                d4Var.invalidateContentRect();
                org.telegram.ui.ActionBar.d4 d4Var2 = w9Var.Y;
                if (d4Var2 != null) {
                    d4Var2.c();
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
        float f7;
        float f10;
        int k10;
        char charAt;
        char charAt2;
        w9 w9Var = this.r;
        f fVar = w9Var.m0;
        f9 f9Var = w9Var.e0;
        ge.b bVar = w9Var.a0;
        if (!w9Var.x()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return w9Var.i;
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i10 = w9Var.b0 - x10;
        w9Var.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!w9Var.i) {
                float f11 = x10;
                float f12 = y3;
                if (w9Var.S.contains(f11, f12)) {
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
                        int[] l4 = w9Var.l();
                        if (w9Var.h0) {
                            w9Var.f = ((B[0] + w9Var.a) + l4[0]) - x10;
                        } else {
                            w9Var.f = 0.0f;
                        }
                        w9Var.g = (((B[1] + w9Var.b) + l4[1]) - y3) - m10;
                        w9Var.u();
                        w9Var.C.invalidate();
                        return true;
                    }
                } else {
                    if (!w9Var.T.contains(f11, f12)) {
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
                        int[] l10 = w9Var.l();
                        w9Var.f = ((B2[0] + w9Var.a) + l10[0]) - x10;
                        w9Var.g = (((B2[1] + w9Var.b) + l10[1]) - y3) - m11;
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
                    int i11 = (int) (x10 + w9Var.f);
                    int i12 = (int) (y3 + w9Var.g);
                    boolean P = w9Var.P(i11, i12);
                    if (w9Var.W != null) {
                        if (w9Var.j) {
                            w9Var.i(w9Var.u, bVar, false);
                        } else {
                            w9Var.i(w9Var.v, bVar, false);
                        }
                        if (((Layout) bVar.d) != null) {
                            float f13 = bVar.b;
                            r9 r9Var = w9Var.W;
                            int[] l11 = w9Var.l();
                            int i13 = i12 - l11[1];
                            int i14 = i11 - l11[0];
                            boolean z12 = w9Var.E != null;
                            boolean z13 = z12 && y3 - w9Var.m > w9Var.F.getMeasuredHeight() - w9Var.o() && (w9Var.j0 || w9Var.Z || w9Var.W.getBottom() > w9Var.F.getMeasuredHeight() - w9Var.o());
                            if (z12) {
                                if (y3 < w9Var.p() + ((View) w9Var.F.getParent()).getTop() && (w9Var.Z || w9Var.W.getTop() < w9Var.p())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!w9Var.N) {
                                            w9Var.N = true;
                                            org.telegram.messenger.i0.g3(f9Var);
                                        }
                                        w9Var.O = z13;
                                        if (z13) {
                                            f7 = -w9Var.W.getTop();
                                            f10 = w9Var.g;
                                        } else {
                                            f7 = w9Var.F.getMeasuredHeight() - w9Var.W.getTop();
                                            f10 = w9Var.g;
                                        }
                                        i13 = (int) (f7 + f10);
                                    } else if (w9Var.N) {
                                        w9Var.N = false;
                                        org.telegram.messenger.i0.r(f9Var);
                                    }
                                    k10 = w9Var.k(i14, i13, w9Var.a, w9Var.b, w9Var.W, false);
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
                                                CharSequence s10 = w9Var.s(w9Var.W, false);
                                                w9Var.i(k10, bVar, false);
                                                Layout layout = (Layout) bVar.d;
                                                w9Var.i(w9Var.u, bVar, false);
                                                Layout layout2 = (Layout) bVar.d;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = k10;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !w9.y(s10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(w9Var.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(k10);
                                                    if (P || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(w9Var.u) && lineForOffset3 == lineForOffset)) {
                                                        w9Var.A(k10, i15, P, w9Var.a0.b, f13, r9Var);
                                                        org.telegram.messenger.i0.b4(w9Var.C);
                                                        w9Var.w();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(k10)) || layout2.isRtlCharAt(k10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        w9Var.u = k10;
                                                        int i17 = w9Var.v;
                                                        if (k10 > i17) {
                                                            w9Var.v = k10;
                                                            w9Var.u = i17;
                                                            w9Var.j = false;
                                                        }
                                                        org.telegram.messenger.i0.b4(w9Var.C);
                                                        w9Var.w();
                                                    } else {
                                                        int i18 = k10;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= s10.length() || !w9.y(s10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(k10 - i15);
                                                        int abs2 = Math.abs(k10 - i18);
                                                        if (w9Var.y) {
                                                            w9Var.y = i10 >= 0;
                                                        }
                                                        int i20 = k10 - 1;
                                                        boolean z14 = i20 > 0 && w9.y(s10.charAt(i20));
                                                        if (k10 >= s10.length()) {
                                                            k10 = s10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = s10.charAt(k10);
                                                        }
                                                        if (w9Var.u >= s10.length()) {
                                                            w9Var.u = s10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = s10.charAt(w9Var.u);
                                                        }
                                                        int i21 = w9Var.u;
                                                        if ((k10 < i21 && abs < abs2) || ((k10 > i21 && i10 < 0) || !w9.y(charAt) || ((w9.y(charAt2) && !w9Var.y) || k10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!w9Var.y || k10 != 1) {
                                                                if (k10 >= w9Var.u || !w9.y(charAt) || ((w9.y(charAt2) && !w9Var.y) || charAt2 == '\n')) {
                                                                    w9Var.u = k10;
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
                                                                org.telegram.messenger.i0.b4(w9Var.C);
                                                                w9Var.w();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            w9Var.F();
                                        } else {
                                            if (k10 != w9Var.v && w9Var.c(k10)) {
                                                CharSequence s11 = w9Var.s(w9Var.W, false);
                                                int i24 = k10;
                                                while (i24 < s11.length() && w9.y(s11.charAt(i24))) {
                                                    i24++;
                                                }
                                                w9Var.i(k10, bVar, false);
                                                Layout layout3 = (Layout) bVar.d;
                                                w9Var.i(w9Var.v, bVar, false);
                                                Layout layout4 = (Layout) bVar.d;
                                                if (layout3 != null && layout4 != null) {
                                                    if (k10 > s11.length()) {
                                                        k10 = s11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(w9Var.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(k10);
                                                    if (P || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(w9Var.v) && lineForOffset6 == lineForOffset4)) {
                                                        w9Var.A(k10, i24, P, w9Var.a0.b, f13, r9Var);
                                                        org.telegram.messenger.i0.b4(w9Var.C);
                                                        w9Var.w();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(k10)) || layout4.isRtlCharAt(k10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        w9Var.v = k10;
                                                        int i25 = w9Var.u;
                                                        if (i25 > k10) {
                                                            w9Var.v = i25;
                                                            w9Var.u = k10;
                                                            w9Var.j = true;
                                                        }
                                                        org.telegram.messenger.i0.b4(w9Var.C);
                                                        w9Var.w();
                                                    } else {
                                                        int i26 = k10;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !w9.y(s11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(k10 - i24);
                                                        int abs4 = Math.abs(k10 - i26);
                                                        int i28 = k10 - 1;
                                                        boolean z15 = i28 > 0 && w9.y(s11.charAt(i28));
                                                        if (w9Var.y) {
                                                            w9Var.y = i10 <= 0;
                                                        }
                                                        int i29 = w9Var.v;
                                                        boolean z16 = i29 > 0 && w9.y(s11.charAt(i29 - 1));
                                                        int i30 = w9Var.v;
                                                        if ((k10 > i30 && abs3 <= abs4) || ((k10 < i30 && i10 > 0) || !z15 || (z16 && !w9Var.y))) {
                                                            if (k10 <= i30 || !z15 || (z16 && !w9Var.y)) {
                                                                w9Var.v = k10;
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
                                                            org.telegram.messenger.i0.b4(w9Var.C);
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
                            i13 = (int) (f7 + f10);
                            k10 = w9Var.k(i14, i13, w9Var.a, w9Var.b, w9Var.W, false);
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
            org.telegram.messenger.i0.r(fVar);
            org.telegram.messenger.i0.g3(fVar);
            w9Var.U();
        }
        if (w9Var.N) {
            w9Var.N = false;
            org.telegram.messenger.i0.r(f9Var);
        }
        return w9Var.i;
    }
}
