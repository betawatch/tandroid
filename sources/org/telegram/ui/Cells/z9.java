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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class z9 extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ aa r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(aa aaVar, Context context) {
        super(context);
        this.r = aaVar;
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
        aa aaVar = this.r;
        if (aaVar.x() && !aaVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && v7.f7.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < aaVar.m) {
                aaVar.K(motionEvent.getRawX(), motionEvent.getRawY());
                aaVar.u();
                aaVar.f(false);
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
        aa aaVar = this.r;
        if (!aaVar.i0 || (viewGroup = aaVar.F) == null) {
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
        boolean isRtlCharAt;
        float f10;
        boolean z10;
        int i12;
        aa aaVar = this.r;
        g gVar2 = aaVar.m0;
        OvershootInterpolator overshootInterpolator = aaVar.c0;
        RectF rectF = aaVar.S;
        RectF rectF2 = aaVar.T;
        q9 q9Var = aaVar.a0;
        if (aaVar.x()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = aaVar.x;
            aaVar.N();
            v9 v9Var = aaVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (v9Var != null) {
                canvas.save();
                int[] l4 = aaVar.l();
                c10 = 1;
                float f11 = l4[1] + aaVar.b;
                f7 = 8.0f;
                float f12 = l4[0] + aaVar.a;
                canvas.translate(f12, f11);
                v9 v9Var2 = aaVar.W;
                MessageObject messageObject = v9Var2 instanceof u1 ? ((u1) v9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(aaVar.t(org.telegram.ui.ActionBar.h6.vf));
                } else {
                    paint.setColor(aaVar.t(org.telegram.ui.ActionBar.h6.Wb));
                }
                int length = aaVar.s(aaVar.W, false).length();
                int i14 = aaVar.v;
                if (i14 >= 0 && i14 <= length) {
                    aaVar.i(i14, q9Var, false);
                    Layout layout = q9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = aaVar.v - q9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + q9Var.c);
                        float f13 = primaryHorizontal + q9Var.d;
                        Rect rect = q9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - aaVar.a;
                            i12 = rect.bottom - aaVar.b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(aaVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 <= i10 + aaVar.d0 || f16 >= aaVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f17 = dp;
                            canvas.translate(f10 - f17, f15);
                            float interpolation = overshootInterpolator.getInterpolation(aaVar.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(aaVar.V);
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
            aaVar.O();
            if (aaVar.W != null) {
                canvas.save();
                int[] l10 = aaVar.l();
                float f23 = l10[c10] + aaVar.b;
                float f24 = l10[0] + aaVar.a;
                canvas.translate(f24, f23);
                int length3 = aaVar.s(aaVar.W, false).length();
                int i16 = aaVar.u;
                if (i16 >= 0 && i16 <= length3) {
                    aaVar.i(i16, q9Var, false);
                    Layout layout2 = q9Var.b;
                    if (layout2 != null) {
                        int i17 = aaVar.u - q9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + q9Var.c);
                        float f25 = primaryHorizontal2 + q9Var.d;
                        Rect rect2 = q9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - aaVar.a;
                            lineBottom2 = rect2.bottom - aaVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(aaVar.u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 <= i10 + aaVar.d0 || f27 >= aaVar.F.getMeasuredHeight()) {
                            if (f27 > 0.0f && f27 - aaVar.m() < aaVar.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f25, f26);
                            float interpolation3 = overshootInterpolator.getInterpolation(aaVar.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(aaVar.V);
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
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && aaVar.i) {
                if (!aaVar.j) {
                    aaVar.N();
                }
                aa.a(aaVar, aaVar.b0);
                if (aaVar.I != aaVar.H || aaVar.L != aaVar.K) {
                    invalidate();
                }
            }
            if (!aaVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            org.telegram.ui.ActionBar.h4 h4Var = aaVar.Y;
            if (h4Var != null) {
                h4Var.invalidateContentRect();
                org.telegram.ui.ActionBar.h4 h4Var2 = aaVar.Y;
                if (h4Var2 != null) {
                    h4Var2.c();
                }
            }
            if (aaVar.k) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r6 != 3) goto L304;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
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
        aa aaVar = this.r;
        g gVar = aaVar.m0;
        h9 h9Var = aaVar.e0;
        q9 q9Var = aaVar.a0;
        if (!aaVar.x()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return aaVar.i;
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i10 = aaVar.b0 - x10;
        aaVar.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!aaVar.i) {
                float f11 = x10;
                float f12 = y3;
                if (aaVar.S.contains(f11, f12)) {
                    aaVar.O();
                    if (aaVar.W != null) {
                        aaVar.i = true;
                        aaVar.j = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B = aaVar.B(aaVar.u);
                        float m10 = aaVar.m() / 2;
                        int[] l4 = aaVar.l();
                        if (aaVar.h0) {
                            aaVar.f = ((B[0] + aaVar.a) + l4[0]) - x10;
                        } else {
                            aaVar.f = 0.0f;
                        }
                        aaVar.g = (((B[1] + aaVar.b) + l4[1]) - y3) - m10;
                        aaVar.u();
                        aaVar.C.invalidate();
                        return true;
                    }
                } else {
                    if (!aaVar.T.contains(f11, f12)) {
                        aaVar.i = false;
                        aaVar.e = true;
                        return aaVar.i;
                    }
                    aaVar.N();
                    if (aaVar.W != null) {
                        aaVar.i = true;
                        aaVar.j = false;
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B2 = aaVar.B(aaVar.v);
                        float m11 = aaVar.m() / 2;
                        int[] l10 = aaVar.l();
                        aaVar.f = ((B2[0] + aaVar.a) + l10[0]) - x10;
                        aaVar.g = (((B2[1] + aaVar.b) + l10[1]) - y3) - m11;
                        aa.a(aaVar, aaVar.b0);
                        aaVar.u();
                        aaVar.C.invalidate();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (aaVar.i) {
                    if (aaVar.j) {
                        aaVar.O();
                    } else {
                        aaVar.N();
                    }
                    if (aaVar.W == null) {
                        return aaVar.i;
                    }
                    int i11 = (int) (x10 + aaVar.f);
                    int i12 = (int) (y3 + aaVar.g);
                    boolean P = aaVar.P(i11, i12);
                    if (aaVar.W != null) {
                        if (aaVar.j) {
                            aaVar.i(aaVar.u, q9Var, false);
                        } else {
                            aaVar.i(aaVar.v, q9Var, false);
                        }
                        if (q9Var.b != null) {
                            float f13 = q9Var.c;
                            v9 v9Var = aaVar.W;
                            int[] l11 = aaVar.l();
                            int i13 = i12 - l11[1];
                            int i14 = i11 - l11[0];
                            boolean z12 = aaVar.E != null;
                            boolean z13 = z12 && y3 - aaVar.m > aaVar.F.getMeasuredHeight() - aaVar.o() && (aaVar.j0 || aaVar.Z || aaVar.W.getBottom() > aaVar.F.getMeasuredHeight() - aaVar.o());
                            if (z12) {
                                if (y3 < aaVar.p() + ((View) aaVar.F.getParent()).getTop() && (aaVar.Z || aaVar.W.getTop() < aaVar.p())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!aaVar.N) {
                                            aaVar.N = true;
                                            AndroidUtilities.runOnUIThread(h9Var);
                                        }
                                        aaVar.O = z13;
                                        if (z13) {
                                            f7 = -aaVar.W.getTop();
                                            f10 = aaVar.g;
                                        } else {
                                            f7 = aaVar.F.getMeasuredHeight() - aaVar.W.getTop();
                                            f10 = aaVar.g;
                                        }
                                        i13 = (int) (f7 + f10);
                                    } else if (aaVar.N) {
                                        aaVar.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(h9Var);
                                    }
                                    k10 = aaVar.k(i14, i13, aaVar.a, aaVar.b, aaVar.W, false);
                                    if (k10 >= 0) {
                                        if (aaVar.R) {
                                            if (!P) {
                                                if (k10 < aaVar.u) {
                                                    aaVar.R = false;
                                                    aaVar.j = true;
                                                    aaVar.u();
                                                } else if (k10 > aaVar.v) {
                                                    aaVar.R = false;
                                                    aaVar.j = false;
                                                    aaVar.u();
                                                }
                                            }
                                        }
                                        if (aaVar.j) {
                                            if (aaVar.u != k10 && aaVar.c(k10)) {
                                                CharSequence s10 = aaVar.s(aaVar.W, false);
                                                aaVar.i(k10, q9Var, false);
                                                Layout layout = q9Var.b;
                                                aaVar.i(aaVar.u, q9Var, false);
                                                Layout layout2 = q9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = k10;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !aa.y(s10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(aaVar.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(k10);
                                                    if (P || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(aaVar.u) && lineForOffset3 == lineForOffset)) {
                                                        aaVar.A(k10, i15, P, aaVar.a0.c, f13, v9Var);
                                                        AndroidUtilities.vibrateCursor(aaVar.C);
                                                        aaVar.w();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(k10)) || layout2.isRtlCharAt(k10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        aaVar.u = k10;
                                                        int i17 = aaVar.v;
                                                        if (k10 > i17) {
                                                            aaVar.v = k10;
                                                            aaVar.u = i17;
                                                            aaVar.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(aaVar.C);
                                                        aaVar.w();
                                                    } else {
                                                        int i18 = k10;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= s10.length() || !aa.y(s10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(k10 - i15);
                                                        int abs2 = Math.abs(k10 - i18);
                                                        if (aaVar.y) {
                                                            aaVar.y = i10 >= 0;
                                                        }
                                                        int i20 = k10 - 1;
                                                        boolean z14 = i20 > 0 && aa.y(s10.charAt(i20));
                                                        if (k10 >= s10.length()) {
                                                            k10 = s10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = s10.charAt(k10);
                                                        }
                                                        if (aaVar.u >= s10.length()) {
                                                            aaVar.u = s10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = s10.charAt(aaVar.u);
                                                        }
                                                        int i21 = aaVar.u;
                                                        if ((k10 < i21 && abs < abs2) || ((k10 > i21 && i10 < 0) || !aa.y(charAt) || ((aa.y(charAt2) && !aaVar.y) || k10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!aaVar.y || k10 != 1) {
                                                                if (k10 >= aaVar.u || !aa.y(charAt) || ((aa.y(charAt2) && !aaVar.y) || charAt2 == '\n')) {
                                                                    aaVar.u = k10;
                                                                } else {
                                                                    aaVar.u = i15;
                                                                    aaVar.y = true;
                                                                }
                                                                int i22 = aaVar.u;
                                                                int i23 = aaVar.v;
                                                                if (i22 > i23) {
                                                                    aaVar.v = i22;
                                                                    aaVar.u = i23;
                                                                    aaVar.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(aaVar.C);
                                                                aaVar.w();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            aaVar.F();
                                        } else {
                                            if (k10 != aaVar.v && aaVar.c(k10)) {
                                                CharSequence s11 = aaVar.s(aaVar.W, false);
                                                int i24 = k10;
                                                while (i24 < s11.length() && aa.y(s11.charAt(i24))) {
                                                    i24++;
                                                }
                                                aaVar.i(k10, q9Var, false);
                                                Layout layout3 = q9Var.b;
                                                aaVar.i(aaVar.v, q9Var, false);
                                                Layout layout4 = q9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (k10 > s11.length()) {
                                                        k10 = s11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(aaVar.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(k10);
                                                    if (P || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(aaVar.v) && lineForOffset6 == lineForOffset4)) {
                                                        aaVar.A(k10, i24, P, aaVar.a0.c, f13, v9Var);
                                                        AndroidUtilities.vibrateCursor(aaVar.C);
                                                        aaVar.w();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(k10)) || layout4.isRtlCharAt(k10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        aaVar.v = k10;
                                                        int i25 = aaVar.u;
                                                        if (i25 > k10) {
                                                            aaVar.v = i25;
                                                            aaVar.u = k10;
                                                            aaVar.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(aaVar.C);
                                                        aaVar.w();
                                                    } else {
                                                        int i26 = k10;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !aa.y(s11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(k10 - i24);
                                                        int abs4 = Math.abs(k10 - i26);
                                                        int i28 = k10 - 1;
                                                        boolean z15 = i28 > 0 && aa.y(s11.charAt(i28));
                                                        if (aaVar.y) {
                                                            aaVar.y = i10 <= 0;
                                                        }
                                                        int i29 = aaVar.v;
                                                        boolean z16 = i29 > 0 && aa.y(s11.charAt(i29 - 1));
                                                        int i30 = aaVar.v;
                                                        if ((k10 > i30 && abs3 <= abs4) || ((k10 < i30 && i10 > 0) || !z15 || (z16 && !aaVar.y))) {
                                                            if (k10 <= i30 || !z15 || (z16 && !aaVar.y)) {
                                                                aaVar.v = k10;
                                                            } else {
                                                                aaVar.v = i24;
                                                                aaVar.y = true;
                                                            }
                                                            int i31 = aaVar.u;
                                                            int i32 = aaVar.v;
                                                            if (i31 > i32) {
                                                                aaVar.v = i31;
                                                                aaVar.u = i32;
                                                                aaVar.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(aaVar.C);
                                                            aaVar.w();
                                                        }
                                                    }
                                                }
                                            }
                                            aaVar.F();
                                        }
                                    }
                                    aa.a(aaVar, aaVar.b0);
                                }
                            }
                            z11 = false;
                            if (z13) {
                            }
                            if (!aaVar.N) {
                            }
                            aaVar.O = z13;
                            if (z13) {
                            }
                            i13 = (int) (f7 + f10);
                            k10 = aaVar.k(i14, i13, aaVar.a, aaVar.b, aaVar.W, false);
                            if (k10 >= 0) {
                            }
                            aa.a(aaVar, aaVar.b0);
                        }
                    }
                    return true;
                }
            }
            return aaVar.i;
        }
        aaVar.v();
        if (!aaVar.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        aaVar.i = z10;
        aaVar.R = z10;
        aaVar.k = z10;
        if (aaVar.x()) {
            aaVar.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            aaVar.U();
        }
        if (aaVar.N) {
            aaVar.N = false;
            AndroidUtilities.cancelRunOnUIThread(h9Var);
        }
        return aaVar.i;
    }
}
