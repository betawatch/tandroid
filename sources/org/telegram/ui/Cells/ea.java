package org.telegram.ui.Cells;

import a8.ic;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ea extends View {
    public final Paint a;
    public float b;
    public float c;
    public long d;
    public final Path e;
    public final ArrayList f;
    public float h;
    public float n;
    public final /* synthetic */ fa r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(fa faVar, Context context) {
        super(context);
        this.r = faVar;
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
        fa faVar = this.r;
        if (faVar.x() && !faVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && ic.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < faVar.m) {
                faVar.K(motionEvent.getRawX(), motionEvent.getRawY());
                faVar.u();
                faVar.f(false);
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
        fa faVar = this.r;
        if (!faVar.i0 || (viewGroup = faVar.F) == null) {
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
        fa faVar = this.r;
        g gVar2 = faVar.m0;
        OvershootInterpolator overshootInterpolator = faVar.c0;
        RectF rectF = faVar.S;
        RectF rectF2 = faVar.T;
        v9 v9Var = faVar.a0;
        if (faVar.x()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = faVar.x;
            faVar.N();
            aa aaVar = faVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (aaVar != null) {
                canvas.save();
                int[] l4 = faVar.l();
                c10 = 1;
                float f11 = l4[1] + faVar.b;
                f7 = 8.0f;
                float f12 = l4[0] + faVar.a;
                canvas.translate(f12, f11);
                aa aaVar2 = faVar.W;
                MessageObject messageObject = aaVar2 instanceof s1 ? ((s1) aaVar2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(faVar.t(org.telegram.ui.ActionBar.y6.vf));
                } else {
                    paint.setColor(faVar.t(org.telegram.ui.ActionBar.y6.Wb));
                }
                int length = faVar.s(faVar.W, false).length();
                int i14 = faVar.v;
                if (i14 >= 0 && i14 <= length) {
                    faVar.i(i14, v9Var, false);
                    Layout layout = v9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = faVar.v - v9Var.a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + v9Var.c);
                        float f13 = primaryHorizontal + v9Var.d;
                        Rect rect = v9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - faVar.a;
                            i12 = rect.bottom - faVar.b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(faVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 <= i10 + faVar.d0 || f16 >= faVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f17 = dp;
                            canvas.translate(f10 - f17, f15);
                            float interpolation = overshootInterpolator.getInterpolation(faVar.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(faVar.V);
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
            faVar.O();
            if (faVar.W != null) {
                canvas.save();
                int[] l10 = faVar.l();
                float f23 = l10[c10] + faVar.b;
                float f24 = l10[0] + faVar.a;
                canvas.translate(f24, f23);
                int length3 = faVar.s(faVar.W, false).length();
                int i16 = faVar.u;
                if (i16 >= 0 && i16 <= length3) {
                    faVar.i(i16, v9Var, false);
                    Layout layout2 = v9Var.b;
                    if (layout2 != null) {
                        int i17 = faVar.u - v9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + v9Var.c);
                        float f25 = primaryHorizontal2 + v9Var.d;
                        Rect rect2 = v9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - faVar.a;
                            lineBottom2 = rect2.bottom - faVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(faVar.u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 <= i10 + faVar.d0 || f27 >= faVar.F.getMeasuredHeight()) {
                            if (f27 > 0.0f && f27 - faVar.m() < faVar.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f25, f26);
                            float interpolation3 = overshootInterpolator.getInterpolation(faVar.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(faVar.V);
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
            if (i11 != 0 && faVar.i) {
                if (!faVar.j) {
                    faVar.N();
                }
                fa.a(faVar, faVar.b0);
                if (faVar.I != faVar.H || faVar.L != faVar.K) {
                    invalidate();
                }
            }
            if (!faVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            org.telegram.ui.ActionBar.m4 m4Var = faVar.Y;
            if (m4Var != null) {
                m4Var.invalidateContentRect();
                org.telegram.ui.ActionBar.m4 m4Var2 = faVar.Y;
                if (m4Var2 != null) {
                    m4Var2.c();
                }
            }
            if (faVar.k) {
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
        fa faVar = this.r;
        g gVar = faVar.m0;
        m9 m9Var = faVar.e0;
        v9 v9Var = faVar.a0;
        if (!faVar.x()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return faVar.i;
        }
        int x9 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i10 = faVar.b0 - x9;
        faVar.b0 = x9;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!faVar.i) {
                float f11 = x9;
                float f12 = y3;
                if (faVar.S.contains(f11, f12)) {
                    faVar.O();
                    if (faVar.W != null) {
                        faVar.i = true;
                        faVar.j = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B = faVar.B(faVar.u);
                        float m10 = faVar.m() / 2;
                        int[] l4 = faVar.l();
                        if (faVar.h0) {
                            faVar.f = ((B[0] + faVar.a) + l4[0]) - x9;
                        } else {
                            faVar.f = 0.0f;
                        }
                        faVar.g = (((B[1] + faVar.b) + l4[1]) - y3) - m10;
                        faVar.u();
                        faVar.C.invalidate();
                        return true;
                    }
                } else {
                    if (!faVar.T.contains(f11, f12)) {
                        faVar.i = false;
                        faVar.e = true;
                        return faVar.i;
                    }
                    faVar.N();
                    if (faVar.W != null) {
                        faVar.i = true;
                        faVar.j = false;
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        int[] B2 = faVar.B(faVar.v);
                        float m11 = faVar.m() / 2;
                        int[] l10 = faVar.l();
                        faVar.f = ((B2[0] + faVar.a) + l10[0]) - x9;
                        faVar.g = (((B2[1] + faVar.b) + l10[1]) - y3) - m11;
                        fa.a(faVar, faVar.b0);
                        faVar.u();
                        faVar.C.invalidate();
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (faVar.i) {
                    if (faVar.j) {
                        faVar.O();
                    } else {
                        faVar.N();
                    }
                    if (faVar.W == null) {
                        return faVar.i;
                    }
                    int i11 = (int) (x9 + faVar.f);
                    int i12 = (int) (y3 + faVar.g);
                    boolean P = faVar.P(i11, i12);
                    if (faVar.W != null) {
                        if (faVar.j) {
                            faVar.i(faVar.u, v9Var, false);
                        } else {
                            faVar.i(faVar.v, v9Var, false);
                        }
                        if (v9Var.b != null) {
                            float f13 = v9Var.c;
                            aa aaVar = faVar.W;
                            int[] l11 = faVar.l();
                            int i13 = i12 - l11[1];
                            int i14 = i11 - l11[0];
                            boolean z12 = faVar.E != null;
                            boolean z13 = z12 && y3 - faVar.m > faVar.F.getMeasuredHeight() - faVar.o() && (faVar.j0 || faVar.Z || faVar.W.getBottom() > faVar.F.getMeasuredHeight() - faVar.o());
                            if (z12) {
                                if (y3 < faVar.p() + ((View) faVar.F.getParent()).getTop() && (faVar.Z || faVar.W.getTop() < faVar.p())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!faVar.N) {
                                            faVar.N = true;
                                            AndroidUtilities.runOnUIThread(m9Var);
                                        }
                                        faVar.O = z13;
                                        if (z13) {
                                            f7 = -faVar.W.getTop();
                                            f10 = faVar.g;
                                        } else {
                                            f7 = faVar.F.getMeasuredHeight() - faVar.W.getTop();
                                            f10 = faVar.g;
                                        }
                                        i13 = (int) (f7 + f10);
                                    } else if (faVar.N) {
                                        faVar.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(m9Var);
                                    }
                                    k10 = faVar.k(i14, i13, faVar.a, faVar.b, faVar.W, false);
                                    if (k10 >= 0) {
                                        if (faVar.R) {
                                            if (!P) {
                                                if (k10 < faVar.u) {
                                                    faVar.R = false;
                                                    faVar.j = true;
                                                    faVar.u();
                                                } else if (k10 > faVar.v) {
                                                    faVar.R = false;
                                                    faVar.j = false;
                                                    faVar.u();
                                                }
                                            }
                                        }
                                        if (faVar.j) {
                                            if (faVar.u != k10 && faVar.c(k10)) {
                                                CharSequence s10 = faVar.s(faVar.W, false);
                                                faVar.i(k10, v9Var, false);
                                                Layout layout = v9Var.b;
                                                faVar.i(faVar.u, v9Var, false);
                                                Layout layout2 = v9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = k10;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !fa.y(s10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(faVar.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(k10);
                                                    if (P || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(faVar.u) && lineForOffset3 == lineForOffset)) {
                                                        faVar.A(k10, i15, P, faVar.a0.c, f13, aaVar);
                                                        AndroidUtilities.vibrateCursor(faVar.C);
                                                        faVar.w();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(k10)) || layout2.isRtlCharAt(k10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        faVar.u = k10;
                                                        int i17 = faVar.v;
                                                        if (k10 > i17) {
                                                            faVar.v = k10;
                                                            faVar.u = i17;
                                                            faVar.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(faVar.C);
                                                        faVar.w();
                                                    } else {
                                                        int i18 = k10;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= s10.length() || !fa.y(s10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(k10 - i15);
                                                        int abs2 = Math.abs(k10 - i18);
                                                        if (faVar.y) {
                                                            faVar.y = i10 >= 0;
                                                        }
                                                        int i20 = k10 - 1;
                                                        boolean z14 = i20 > 0 && fa.y(s10.charAt(i20));
                                                        if (k10 >= s10.length()) {
                                                            k10 = s10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = s10.charAt(k10);
                                                        }
                                                        if (faVar.u >= s10.length()) {
                                                            faVar.u = s10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = s10.charAt(faVar.u);
                                                        }
                                                        int i21 = faVar.u;
                                                        if ((k10 < i21 && abs < abs2) || ((k10 > i21 && i10 < 0) || !fa.y(charAt) || ((fa.y(charAt2) && !faVar.y) || k10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!faVar.y || k10 != 1) {
                                                                if (k10 >= faVar.u || !fa.y(charAt) || ((fa.y(charAt2) && !faVar.y) || charAt2 == '\n')) {
                                                                    faVar.u = k10;
                                                                } else {
                                                                    faVar.u = i15;
                                                                    faVar.y = true;
                                                                }
                                                                int i22 = faVar.u;
                                                                int i23 = faVar.v;
                                                                if (i22 > i23) {
                                                                    faVar.v = i22;
                                                                    faVar.u = i23;
                                                                    faVar.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(faVar.C);
                                                                faVar.w();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            faVar.F();
                                        } else {
                                            if (k10 != faVar.v && faVar.c(k10)) {
                                                CharSequence s11 = faVar.s(faVar.W, false);
                                                int i24 = k10;
                                                while (i24 < s11.length() && fa.y(s11.charAt(i24))) {
                                                    i24++;
                                                }
                                                faVar.i(k10, v9Var, false);
                                                Layout layout3 = v9Var.b;
                                                faVar.i(faVar.v, v9Var, false);
                                                Layout layout4 = v9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (k10 > s11.length()) {
                                                        k10 = s11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(faVar.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(k10);
                                                    if (P || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(faVar.v) && lineForOffset6 == lineForOffset4)) {
                                                        faVar.A(k10, i24, P, faVar.a0.c, f13, aaVar);
                                                        AndroidUtilities.vibrateCursor(faVar.C);
                                                        faVar.w();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(k10)) || layout4.isRtlCharAt(k10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        faVar.v = k10;
                                                        int i25 = faVar.u;
                                                        if (i25 > k10) {
                                                            faVar.v = i25;
                                                            faVar.u = k10;
                                                            faVar.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(faVar.C);
                                                        faVar.w();
                                                    } else {
                                                        int i26 = k10;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !fa.y(s11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(k10 - i24);
                                                        int abs4 = Math.abs(k10 - i26);
                                                        int i28 = k10 - 1;
                                                        boolean z15 = i28 > 0 && fa.y(s11.charAt(i28));
                                                        if (faVar.y) {
                                                            faVar.y = i10 <= 0;
                                                        }
                                                        int i29 = faVar.v;
                                                        boolean z16 = i29 > 0 && fa.y(s11.charAt(i29 - 1));
                                                        int i30 = faVar.v;
                                                        if ((k10 > i30 && abs3 <= abs4) || ((k10 < i30 && i10 > 0) || !z15 || (z16 && !faVar.y))) {
                                                            if (k10 <= i30 || !z15 || (z16 && !faVar.y)) {
                                                                faVar.v = k10;
                                                            } else {
                                                                faVar.v = i24;
                                                                faVar.y = true;
                                                            }
                                                            int i31 = faVar.u;
                                                            int i32 = faVar.v;
                                                            if (i31 > i32) {
                                                                faVar.v = i31;
                                                                faVar.u = i32;
                                                                faVar.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(faVar.C);
                                                            faVar.w();
                                                        }
                                                    }
                                                }
                                            }
                                            faVar.F();
                                        }
                                    }
                                    fa.a(faVar, faVar.b0);
                                }
                            }
                            z11 = false;
                            if (z13) {
                            }
                            if (!faVar.N) {
                            }
                            faVar.O = z13;
                            if (z13) {
                            }
                            i13 = (int) (f7 + f10);
                            k10 = faVar.k(i14, i13, faVar.a, faVar.b, faVar.W, false);
                            if (k10 >= 0) {
                            }
                            fa.a(faVar, faVar.b0);
                        }
                    }
                    return true;
                }
            }
            return faVar.i;
        }
        faVar.v();
        if (!faVar.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        faVar.i = z10;
        faVar.R = z10;
        faVar.k = z10;
        if (faVar.x()) {
            faVar.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            faVar.U();
        }
        if (faVar.N) {
            faVar.N = false;
            AndroidUtilities.cancelRunOnUIThread(m9Var);
        }
        return faVar.i;
    }
}
