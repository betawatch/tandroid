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
import org.telegram.messenger.zi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t9 extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ u9 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(u9 u9Var, Context context) {
        super(context);
        this.r = u9Var;
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
        u9 u9Var = this.r;
        if (u9Var.x() && !u9Var.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && a7.h.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < u9Var.m) {
                u9Var.K(motionEvent.getRawX(), motionEvent.getRawY());
                u9Var.u();
                u9Var.f(false);
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
        u9 u9Var = this.r;
        if (!u9Var.i0 || (viewGroup = u9Var.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f fVar;
        int i3;
        char c2;
        float f10;
        int i10;
        boolean isRtlCharAt;
        float f11;
        boolean z10;
        int i11;
        u9 u9Var = this.r;
        f fVar2 = u9Var.m0;
        OvershootInterpolator overshootInterpolator = u9Var.c0;
        RectF rectF = u9Var.S;
        RectF rectF2 = u9Var.T;
        k9 k9Var = u9Var.a0;
        if (u9Var.x()) {
            int L = org.telegram.messenger.g0.L(22.0f);
            int i12 = u9Var.x;
            u9Var.N();
            p9 p9Var = u9Var.W;
            Paint paint = this.a;
            Path path = this.e;
            if (p9Var != null) {
                canvas.save();
                int[] l10 = u9Var.l();
                c2 = 1;
                float f12 = l10[1] + u9Var.b;
                f10 = 8.0f;
                float f13 = l10[0] + u9Var.a;
                canvas.translate(f13, f12);
                p9 p9Var2 = u9Var.W;
                zi messageObject = p9Var2 instanceof q1 ? ((q1) p9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.Q3()) {
                    paint.setColor(u9Var.t(org.telegram.ui.ActionBar.k6.jg));
                } else {
                    paint.setColor(u9Var.t(org.telegram.ui.ActionBar.k6.Kc));
                }
                int length = u9Var.s(u9Var.W, false).length();
                int i13 = u9Var.v;
                if (i13 >= 0 && i13 <= length) {
                    u9Var.i(i13, k9Var, false);
                    Layout layout = (Layout) k9Var.d;
                    if (layout != null) {
                        fVar = fVar2;
                        int i14 = u9Var.v - k9Var.a;
                        int length2 = layout.getText().length();
                        if (i14 > length2) {
                            i14 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i14);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i14);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + k9Var.b);
                        float f14 = primaryHorizontal + k9Var.c;
                        Rect rect = (Rect) k9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - u9Var.a;
                            i11 = rect.bottom - u9Var.b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(u9Var.v);
                            f11 = f14;
                            z10 = isRtlCharAt2;
                            i11 = lineBottom;
                        }
                        float f16 = i11;
                        float f17 = f12 + f16;
                        i3 = i12;
                        if (f17 <= i3 + u9Var.d0 || f17 >= u9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f18 = L;
                            canvas.translate(f11 - f18, f16);
                            float interpolation = overshootInterpolator.getInterpolation(u9Var.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(u9Var.V);
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
                i3 = i12;
                i10 = 0;
                canvas.restore();
            } else {
                fVar = fVar2;
                i3 = i12;
                c2 = 1;
                f10 = 8.0f;
                i10 = 0;
            }
            u9Var.O();
            if (u9Var.W != null) {
                canvas.save();
                int[] l11 = u9Var.l();
                float f24 = l11[c2] + u9Var.b;
                float f25 = l11[0] + u9Var.a;
                canvas.translate(f25, f24);
                int length3 = u9Var.s(u9Var.W, false).length();
                int i15 = u9Var.u;
                if (i15 >= 0 && i15 <= length3) {
                    u9Var.i(i15, k9Var, false);
                    Layout layout2 = (Layout) k9Var.d;
                    if (layout2 != null) {
                        int i16 = u9Var.u - k9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i16);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i16);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + k9Var.b);
                        float f26 = primaryHorizontal2 + k9Var.c;
                        Rect rect2 = (Rect) k9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - u9Var.a;
                            lineBottom2 = rect2.bottom - u9Var.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(u9Var.u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 <= i3 + u9Var.d0 || f28 >= u9Var.F.getMeasuredHeight()) {
                            if (f28 > 0.0f && f28 - u9Var.m() < u9Var.F.getMeasuredHeight()) {
                                i10++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f26, f27);
                            float interpolation3 = overshootInterpolator.getInterpolation(u9Var.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(u9Var.V);
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
            if (i10 != 0 && u9Var.i) {
                if (!u9Var.j) {
                    u9Var.N();
                }
                u9.a(u9Var, u9Var.b0);
                if (u9Var.I != u9Var.H || u9Var.L != u9Var.K) {
                    invalidate();
                }
            }
            if (!u9Var.Q) {
                org.telegram.messenger.g0.r(fVar);
                org.telegram.messenger.g0.h3(fVar);
            }
            org.telegram.ui.ActionBar.u3 u3Var = u9Var.Y;
            if (u3Var != null) {
                u3Var.invalidateContentRect();
                org.telegram.ui.ActionBar.u3 u3Var2 = u9Var.Y;
                if (u3Var2 != null) {
                    u3Var2.c();
                }
            }
            if (u9Var.k) {
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
        u9 u9Var = this.r;
        f fVar = u9Var.m0;
        c9 c9Var = u9Var.e0;
        k9 k9Var = u9Var.a0;
        if (!u9Var.x()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return u9Var.i;
        }
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int i3 = u9Var.b0 - x10;
        u9Var.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!u9Var.i) {
                float f12 = x10;
                float f13 = y9;
                if (u9Var.S.contains(f12, f13)) {
                    u9Var.O();
                    if (u9Var.W != null) {
                        u9Var.i = true;
                        u9Var.j = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B = u9Var.B(u9Var.u);
                        float m10 = u9Var.m() / 2;
                        int[] l10 = u9Var.l();
                        if (u9Var.h0) {
                            u9Var.f = ((B[0] + u9Var.a) + l10[0]) - x10;
                        } else {
                            u9Var.f = 0.0f;
                        }
                        u9Var.g = (((B[1] + u9Var.b) + l10[1]) - y9) - m10;
                        u9Var.u();
                        u9Var.C.invalidate();
                        return true;
                    }
                } else {
                    if (!u9Var.T.contains(f12, f13)) {
                        u9Var.i = false;
                        u9Var.e = true;
                        return u9Var.i;
                    }
                    u9Var.N();
                    if (u9Var.W != null) {
                        u9Var.i = true;
                        u9Var.j = false;
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B2 = u9Var.B(u9Var.v);
                        float m11 = u9Var.m() / 2;
                        int[] l11 = u9Var.l();
                        u9Var.f = ((B2[0] + u9Var.a) + l11[0]) - x10;
                        u9Var.g = (((B2[1] + u9Var.b) + l11[1]) - y9) - m11;
                        u9.a(u9Var, u9Var.b0);
                        u9Var.u();
                        u9Var.C.invalidate();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (u9Var.i) {
                    if (u9Var.j) {
                        u9Var.O();
                    } else {
                        u9Var.N();
                    }
                    if (u9Var.W == null) {
                        return u9Var.i;
                    }
                    int i10 = (int) (x10 + u9Var.f);
                    int i11 = (int) (y9 + u9Var.g);
                    boolean P = u9Var.P(i10, i11);
                    if (u9Var.W != null) {
                        if (u9Var.j) {
                            u9Var.i(u9Var.u, k9Var, false);
                        } else {
                            u9Var.i(u9Var.v, k9Var, false);
                        }
                        if (((Layout) k9Var.d) != null) {
                            float f14 = k9Var.b;
                            p9 p9Var = u9Var.W;
                            int[] l12 = u9Var.l();
                            int i12 = i11 - l12[1];
                            int i13 = i10 - l12[0];
                            boolean z12 = u9Var.E != null;
                            boolean z13 = z12 && y9 - u9Var.m > u9Var.F.getMeasuredHeight() - u9Var.o() && (u9Var.j0 || u9Var.Z || u9Var.W.getBottom() > u9Var.F.getMeasuredHeight() - u9Var.o());
                            if (z12) {
                                if (y9 < u9Var.p() + ((View) u9Var.F.getParent()).getTop() && (u9Var.Z || u9Var.W.getTop() < u9Var.p())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!u9Var.N) {
                                            u9Var.N = true;
                                            org.telegram.messenger.g0.h3(c9Var);
                                        }
                                        u9Var.O = z13;
                                        if (z13) {
                                            f10 = -u9Var.W.getTop();
                                            f11 = u9Var.g;
                                        } else {
                                            f10 = u9Var.F.getMeasuredHeight() - u9Var.W.getTop();
                                            f11 = u9Var.g;
                                        }
                                        i12 = (int) (f10 + f11);
                                    } else if (u9Var.N) {
                                        u9Var.N = false;
                                        org.telegram.messenger.g0.r(c9Var);
                                    }
                                    k10 = u9Var.k(i13, i12, u9Var.a, u9Var.b, u9Var.W, false);
                                    if (k10 >= 0) {
                                        if (u9Var.R) {
                                            if (!P) {
                                                if (k10 < u9Var.u) {
                                                    u9Var.R = false;
                                                    u9Var.j = true;
                                                    u9Var.u();
                                                } else if (k10 > u9Var.v) {
                                                    u9Var.R = false;
                                                    u9Var.j = false;
                                                    u9Var.u();
                                                }
                                            }
                                        }
                                        if (u9Var.j) {
                                            if (u9Var.u != k10 && u9Var.c(k10)) {
                                                CharSequence s6 = u9Var.s(u9Var.W, false);
                                                u9Var.i(k10, k9Var, false);
                                                Layout layout = (Layout) k9Var.d;
                                                u9Var.i(u9Var.u, k9Var, false);
                                                Layout layout2 = (Layout) k9Var.d;
                                                if (layout != null && layout2 != null) {
                                                    int i14 = k10;
                                                    while (true) {
                                                        int i15 = i14 - 1;
                                                        if (i15 < 0 || !u9.y(s6.charAt(i15))) {
                                                            break;
                                                        }
                                                        i14--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i14);
                                                    int lineForOffset2 = layout2.getLineForOffset(u9Var.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(k10);
                                                    if (P || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(u9Var.u) && lineForOffset3 == lineForOffset)) {
                                                        u9Var.A(k10, i14, P, u9Var.a0.b, f14, p9Var);
                                                        org.telegram.messenger.g0.c4(u9Var.C);
                                                        u9Var.w();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(k10)) || layout2.isRtlCharAt(k10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        u9Var.u = k10;
                                                        int i16 = u9Var.v;
                                                        if (k10 > i16) {
                                                            u9Var.v = k10;
                                                            u9Var.u = i16;
                                                            u9Var.j = false;
                                                        }
                                                        org.telegram.messenger.g0.c4(u9Var.C);
                                                        u9Var.w();
                                                    } else {
                                                        int i17 = k10;
                                                        while (true) {
                                                            int i18 = i17 + 1;
                                                            if (i18 >= s6.length() || !u9.y(s6.charAt(i18))) {
                                                                break;
                                                            }
                                                            i17 = i18;
                                                        }
                                                        int abs = Math.abs(k10 - i14);
                                                        int abs2 = Math.abs(k10 - i17);
                                                        if (u9Var.y) {
                                                            u9Var.y = i3 >= 0;
                                                        }
                                                        int i19 = k10 - 1;
                                                        boolean z14 = i19 > 0 && u9.y(s6.charAt(i19));
                                                        if (k10 >= s6.length()) {
                                                            k10 = s6.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = s6.charAt(k10);
                                                        }
                                                        if (u9Var.u >= s6.length()) {
                                                            u9Var.u = s6.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = s6.charAt(u9Var.u);
                                                        }
                                                        int i20 = u9Var.u;
                                                        if ((k10 < i20 && abs < abs2) || ((k10 > i20 && i3 < 0) || !u9.y(charAt) || ((u9.y(charAt2) && !u9Var.y) || k10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!u9Var.y || k10 != 1) {
                                                                if (k10 >= u9Var.u || !u9.y(charAt) || ((u9.y(charAt2) && !u9Var.y) || charAt2 == '\n')) {
                                                                    u9Var.u = k10;
                                                                } else {
                                                                    u9Var.u = i14;
                                                                    u9Var.y = true;
                                                                }
                                                                int i21 = u9Var.u;
                                                                int i22 = u9Var.v;
                                                                if (i21 > i22) {
                                                                    u9Var.v = i21;
                                                                    u9Var.u = i22;
                                                                    u9Var.j = false;
                                                                }
                                                                org.telegram.messenger.g0.c4(u9Var.C);
                                                                u9Var.w();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            u9Var.F();
                                        } else {
                                            if (k10 != u9Var.v && u9Var.c(k10)) {
                                                CharSequence s10 = u9Var.s(u9Var.W, false);
                                                int i23 = k10;
                                                while (i23 < s10.length() && u9.y(s10.charAt(i23))) {
                                                    i23++;
                                                }
                                                u9Var.i(k10, k9Var, false);
                                                Layout layout3 = (Layout) k9Var.d;
                                                u9Var.i(u9Var.v, k9Var, false);
                                                Layout layout4 = (Layout) k9Var.d;
                                                if (layout3 != null && layout4 != null) {
                                                    if (k10 > s10.length()) {
                                                        k10 = s10.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i23);
                                                    int lineForOffset5 = layout4.getLineForOffset(u9Var.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(k10);
                                                    if (P || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(u9Var.v) && lineForOffset6 == lineForOffset4)) {
                                                        u9Var.A(k10, i23, P, u9Var.a0.b, f14, p9Var);
                                                        org.telegram.messenger.g0.c4(u9Var.C);
                                                        u9Var.w();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(k10)) || layout4.isRtlCharAt(k10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        u9Var.v = k10;
                                                        int i24 = u9Var.u;
                                                        if (i24 > k10) {
                                                            u9Var.v = i24;
                                                            u9Var.u = k10;
                                                            u9Var.j = true;
                                                        }
                                                        org.telegram.messenger.g0.c4(u9Var.C);
                                                        u9Var.w();
                                                    } else {
                                                        int i25 = k10;
                                                        while (true) {
                                                            int i26 = i25 - 1;
                                                            if (i26 < 0 || !u9.y(s10.charAt(i26))) {
                                                                break;
                                                            }
                                                            i25--;
                                                        }
                                                        int abs3 = Math.abs(k10 - i23);
                                                        int abs4 = Math.abs(k10 - i25);
                                                        int i27 = k10 - 1;
                                                        boolean z15 = i27 > 0 && u9.y(s10.charAt(i27));
                                                        if (u9Var.y) {
                                                            u9Var.y = i3 <= 0;
                                                        }
                                                        int i28 = u9Var.v;
                                                        boolean z16 = i28 > 0 && u9.y(s10.charAt(i28 - 1));
                                                        int i29 = u9Var.v;
                                                        if ((k10 > i29 && abs3 <= abs4) || ((k10 < i29 && i3 > 0) || !z15 || (z16 && !u9Var.y))) {
                                                            if (k10 <= i29 || !z15 || (z16 && !u9Var.y)) {
                                                                u9Var.v = k10;
                                                            } else {
                                                                u9Var.v = i23;
                                                                u9Var.y = true;
                                                            }
                                                            int i30 = u9Var.u;
                                                            int i31 = u9Var.v;
                                                            if (i30 > i31) {
                                                                u9Var.v = i30;
                                                                u9Var.u = i31;
                                                                u9Var.j = true;
                                                            }
                                                            org.telegram.messenger.g0.c4(u9Var.C);
                                                            u9Var.w();
                                                        }
                                                    }
                                                }
                                            }
                                            u9Var.F();
                                        }
                                    }
                                    u9.a(u9Var, u9Var.b0);
                                }
                            }
                            z11 = false;
                            if (z13) {
                            }
                            if (!u9Var.N) {
                            }
                            u9Var.O = z13;
                            if (z13) {
                            }
                            i12 = (int) (f10 + f11);
                            k10 = u9Var.k(i13, i12, u9Var.a, u9Var.b, u9Var.W, false);
                            if (k10 >= 0) {
                            }
                            u9.a(u9Var, u9Var.b0);
                        }
                    }
                    return true;
                }
            }
            return u9Var.i;
        }
        u9Var.v();
        if (!u9Var.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        u9Var.i = z10;
        u9Var.R = z10;
        u9Var.k = z10;
        if (u9Var.x()) {
            u9Var.C.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.h3(fVar);
            u9Var.U();
        }
        if (u9Var.N) {
            u9Var.N = false;
            org.telegram.messenger.g0.r(c9Var);
        }
        return u9Var.i;
    }
}
