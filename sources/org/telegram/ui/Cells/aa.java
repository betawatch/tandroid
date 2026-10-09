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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class aa extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ ba r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ba baVar, Context context) {
        super(context);
        this.r = baVar;
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
        ba baVar = this.r;
        if (baVar.x() && !baVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && v7.z6.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < baVar.m) {
                baVar.K(motionEvent.getRawX(), motionEvent.getRawY());
                baVar.u();
                baVar.f(false);
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
        ba baVar = this.r;
        if (!baVar.i0 || (viewGroup = baVar.F) == null) {
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
        ba baVar = this.r;
        g gVar2 = baVar.m0;
        OvershootInterpolator overshootInterpolator = baVar.c0;
        RectF rectF = baVar.S;
        RectF rectF2 = baVar.T;
        r9 r9Var = baVar.a0;
        if (baVar.x()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = baVar.x;
            baVar.N();
            w9 w9Var = baVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (w9Var != null) {
                canvas.save();
                int[] l4 = baVar.l();
                c10 = 1;
                float f11 = l4[1] + baVar.b;
                f7 = 8.0f;
                float f12 = l4[0] + baVar.a;
                canvas.translate(f12, f11);
                w9 w9Var2 = baVar.W;
                MessageObject messageObject = w9Var2 instanceof u1 ? ((u1) w9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(baVar.t(org.telegram.ui.ActionBar.i6.vf));
                } else {
                    paint.setColor(baVar.t(org.telegram.ui.ActionBar.i6.Wb));
                }
                int length = baVar.s(baVar.W, false).length();
                int i14 = baVar.v;
                if (i14 >= 0 && i14 <= length) {
                    baVar.i(i14, r9Var, false);
                    Layout layout = r9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = baVar.v - r9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + r9Var.c);
                        float f13 = primaryHorizontal + r9Var.d;
                        Rect rect = r9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - baVar.a;
                            i12 = rect.bottom - baVar.b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(baVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 <= i10 + baVar.d0 || f16 >= baVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f17 = dp;
                            canvas.translate(f10 - f17, f15);
                            float interpolation = overshootInterpolator.getInterpolation(baVar.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(baVar.V);
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
            baVar.O();
            if (baVar.W != null) {
                canvas.save();
                int[] l10 = baVar.l();
                float f23 = l10[c10] + baVar.b;
                float f24 = l10[0] + baVar.a;
                canvas.translate(f24, f23);
                int length3 = baVar.s(baVar.W, false).length();
                int i16 = baVar.u;
                if (i16 >= 0 && i16 <= length3) {
                    baVar.i(i16, r9Var, false);
                    Layout layout2 = r9Var.b;
                    if (layout2 != null) {
                        int i17 = baVar.u - r9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + r9Var.c);
                        float f25 = primaryHorizontal2 + r9Var.d;
                        Rect rect2 = r9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - baVar.a;
                            lineBottom2 = rect2.bottom - baVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(baVar.u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 <= i10 + baVar.d0 || f27 >= baVar.F.getMeasuredHeight()) {
                            if (f27 > 0.0f && f27 - baVar.m() < baVar.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f25, f26);
                            float interpolation3 = overshootInterpolator.getInterpolation(baVar.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(baVar.V);
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
            if (i11 != 0 && baVar.i) {
                if (!baVar.j) {
                    baVar.N();
                }
                ba.a(baVar, baVar.b0);
                if (baVar.I != baVar.H || baVar.L != baVar.K) {
                    invalidate();
                }
            }
            if (!baVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            org.telegram.ui.ActionBar.h4 h4Var = baVar.Y;
            if (h4Var != null) {
                h4Var.invalidateContentRect();
                org.telegram.ui.ActionBar.h4 h4Var2 = baVar.Y;
                if (h4Var2 != null) {
                    h4Var2.c();
                }
            }
            if (baVar.k) {
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
        ba baVar = this.r;
        g gVar = baVar.m0;
        i9 i9Var = baVar.e0;
        r9 r9Var = baVar.a0;
        if (!baVar.x()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return baVar.i;
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i10 = baVar.b0 - x10;
        baVar.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!baVar.i) {
                float f11 = x10;
                float f12 = y3;
                if (baVar.S.contains(f11, f12)) {
                    baVar.O();
                    if (baVar.W != null) {
                        baVar.i = true;
                        baVar.j = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B = baVar.B(baVar.u);
                        float m10 = baVar.m() / 2;
                        int[] l4 = baVar.l();
                        if (baVar.h0) {
                            baVar.f = ((B[0] + baVar.a) + l4[0]) - x10;
                        } else {
                            baVar.f = 0.0f;
                        }
                        baVar.g = (((B[1] + baVar.b) + l4[1]) - y3) - m10;
                        baVar.u();
                        baVar.C.invalidate();
                        return true;
                    }
                } else {
                    if (!baVar.T.contains(f11, f12)) {
                        baVar.i = false;
                        baVar.e = true;
                        return baVar.i;
                    }
                    baVar.N();
                    if (baVar.W != null) {
                        baVar.i = true;
                        baVar.j = false;
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B2 = baVar.B(baVar.v);
                        float m11 = baVar.m() / 2;
                        int[] l10 = baVar.l();
                        baVar.f = ((B2[0] + baVar.a) + l10[0]) - x10;
                        baVar.g = (((B2[1] + baVar.b) + l10[1]) - y3) - m11;
                        ba.a(baVar, baVar.b0);
                        baVar.u();
                        baVar.C.invalidate();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (baVar.i) {
                    if (baVar.j) {
                        baVar.O();
                    } else {
                        baVar.N();
                    }
                    if (baVar.W == null) {
                        return baVar.i;
                    }
                    int i11 = (int) (x10 + baVar.f);
                    int i12 = (int) (y3 + baVar.g);
                    boolean P = baVar.P(i11, i12);
                    if (baVar.W != null) {
                        if (baVar.j) {
                            baVar.i(baVar.u, r9Var, false);
                        } else {
                            baVar.i(baVar.v, r9Var, false);
                        }
                        if (r9Var.b != null) {
                            float f13 = r9Var.c;
                            w9 w9Var = baVar.W;
                            int[] l11 = baVar.l();
                            int i13 = i12 - l11[1];
                            int i14 = i11 - l11[0];
                            boolean z12 = baVar.E != null;
                            boolean z13 = z12 && y3 - baVar.m > baVar.F.getMeasuredHeight() - baVar.o() && (baVar.j0 || baVar.Z || baVar.W.getBottom() > baVar.F.getMeasuredHeight() - baVar.o());
                            if (z12) {
                                if (y3 < baVar.p() + ((View) baVar.F.getParent()).getTop() && (baVar.Z || baVar.W.getTop() < baVar.p())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!baVar.N) {
                                            baVar.N = true;
                                            AndroidUtilities.runOnUIThread(i9Var);
                                        }
                                        baVar.O = z13;
                                        if (z13) {
                                            f7 = -baVar.W.getTop();
                                            f10 = baVar.g;
                                        } else {
                                            f7 = baVar.F.getMeasuredHeight() - baVar.W.getTop();
                                            f10 = baVar.g;
                                        }
                                        i13 = (int) (f7 + f10);
                                    } else if (baVar.N) {
                                        baVar.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(i9Var);
                                    }
                                    k10 = baVar.k(i14, i13, baVar.a, baVar.b, baVar.W, false);
                                    if (k10 >= 0) {
                                        if (baVar.R) {
                                            if (!P) {
                                                if (k10 < baVar.u) {
                                                    baVar.R = false;
                                                    baVar.j = true;
                                                    baVar.u();
                                                } else if (k10 > baVar.v) {
                                                    baVar.R = false;
                                                    baVar.j = false;
                                                    baVar.u();
                                                }
                                            }
                                        }
                                        if (baVar.j) {
                                            if (baVar.u != k10 && baVar.c(k10)) {
                                                CharSequence s10 = baVar.s(baVar.W, false);
                                                baVar.i(k10, r9Var, false);
                                                Layout layout = r9Var.b;
                                                baVar.i(baVar.u, r9Var, false);
                                                Layout layout2 = r9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = k10;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !ba.y(s10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(baVar.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(k10);
                                                    if (P || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(baVar.u) && lineForOffset3 == lineForOffset)) {
                                                        baVar.A(k10, i15, P, baVar.a0.c, f13, w9Var);
                                                        AndroidUtilities.vibrateCursor(baVar.C);
                                                        baVar.w();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(k10)) || layout2.isRtlCharAt(k10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        baVar.u = k10;
                                                        int i17 = baVar.v;
                                                        if (k10 > i17) {
                                                            baVar.v = k10;
                                                            baVar.u = i17;
                                                            baVar.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(baVar.C);
                                                        baVar.w();
                                                    } else {
                                                        int i18 = k10;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= s10.length() || !ba.y(s10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(k10 - i15);
                                                        int abs2 = Math.abs(k10 - i18);
                                                        if (baVar.y) {
                                                            baVar.y = i10 >= 0;
                                                        }
                                                        int i20 = k10 - 1;
                                                        boolean z14 = i20 > 0 && ba.y(s10.charAt(i20));
                                                        if (k10 >= s10.length()) {
                                                            k10 = s10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = s10.charAt(k10);
                                                        }
                                                        if (baVar.u >= s10.length()) {
                                                            baVar.u = s10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = s10.charAt(baVar.u);
                                                        }
                                                        int i21 = baVar.u;
                                                        if ((k10 < i21 && abs < abs2) || ((k10 > i21 && i10 < 0) || !ba.y(charAt) || ((ba.y(charAt2) && !baVar.y) || k10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!baVar.y || k10 != 1) {
                                                                if (k10 >= baVar.u || !ba.y(charAt) || ((ba.y(charAt2) && !baVar.y) || charAt2 == '\n')) {
                                                                    baVar.u = k10;
                                                                } else {
                                                                    baVar.u = i15;
                                                                    baVar.y = true;
                                                                }
                                                                int i22 = baVar.u;
                                                                int i23 = baVar.v;
                                                                if (i22 > i23) {
                                                                    baVar.v = i22;
                                                                    baVar.u = i23;
                                                                    baVar.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(baVar.C);
                                                                baVar.w();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            baVar.F();
                                        } else {
                                            if (k10 != baVar.v && baVar.c(k10)) {
                                                CharSequence s11 = baVar.s(baVar.W, false);
                                                int i24 = k10;
                                                while (i24 < s11.length() && ba.y(s11.charAt(i24))) {
                                                    i24++;
                                                }
                                                baVar.i(k10, r9Var, false);
                                                Layout layout3 = r9Var.b;
                                                baVar.i(baVar.v, r9Var, false);
                                                Layout layout4 = r9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (k10 > s11.length()) {
                                                        k10 = s11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(baVar.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(k10);
                                                    if (P || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(baVar.v) && lineForOffset6 == lineForOffset4)) {
                                                        baVar.A(k10, i24, P, baVar.a0.c, f13, w9Var);
                                                        AndroidUtilities.vibrateCursor(baVar.C);
                                                        baVar.w();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(k10)) || layout4.isRtlCharAt(k10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        baVar.v = k10;
                                                        int i25 = baVar.u;
                                                        if (i25 > k10) {
                                                            baVar.v = i25;
                                                            baVar.u = k10;
                                                            baVar.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(baVar.C);
                                                        baVar.w();
                                                    } else {
                                                        int i26 = k10;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !ba.y(s11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(k10 - i24);
                                                        int abs4 = Math.abs(k10 - i26);
                                                        int i28 = k10 - 1;
                                                        boolean z15 = i28 > 0 && ba.y(s11.charAt(i28));
                                                        if (baVar.y) {
                                                            baVar.y = i10 <= 0;
                                                        }
                                                        int i29 = baVar.v;
                                                        boolean z16 = i29 > 0 && ba.y(s11.charAt(i29 - 1));
                                                        int i30 = baVar.v;
                                                        if ((k10 > i30 && abs3 <= abs4) || ((k10 < i30 && i10 > 0) || !z15 || (z16 && !baVar.y))) {
                                                            if (k10 <= i30 || !z15 || (z16 && !baVar.y)) {
                                                                baVar.v = k10;
                                                            } else {
                                                                baVar.v = i24;
                                                                baVar.y = true;
                                                            }
                                                            int i31 = baVar.u;
                                                            int i32 = baVar.v;
                                                            if (i31 > i32) {
                                                                baVar.v = i31;
                                                                baVar.u = i32;
                                                                baVar.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(baVar.C);
                                                            baVar.w();
                                                        }
                                                    }
                                                }
                                            }
                                            baVar.F();
                                        }
                                    }
                                    ba.a(baVar, baVar.b0);
                                }
                            }
                            z11 = false;
                            if (z13) {
                            }
                            if (!baVar.N) {
                            }
                            baVar.O = z13;
                            if (z13) {
                            }
                            i13 = (int) (f7 + f10);
                            k10 = baVar.k(i14, i13, baVar.a, baVar.b, baVar.W, false);
                            if (k10 >= 0) {
                            }
                            ba.a(baVar, baVar.b0);
                        }
                    }
                    return true;
                }
            }
            return baVar.i;
        }
        baVar.v();
        if (!baVar.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        baVar.i = z10;
        baVar.R = z10;
        baVar.k = z10;
        if (baVar.x()) {
            baVar.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            baVar.U();
        }
        if (baVar.N) {
            baVar.N = false;
            AndroidUtilities.cancelRunOnUIThread(i9Var);
        }
        return baVar.i;
    }
}
