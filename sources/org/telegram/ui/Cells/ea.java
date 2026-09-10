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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        if (faVar.y() && !faVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && v7.a7.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < faVar.m) {
                faVar.L(motionEvent.getRawX(), motionEvent.getRawY());
                faVar.v();
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
        if (!faVar.j0 || (viewGroup = faVar.F) == null) {
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
        fa faVar = this.r;
        g gVar2 = faVar.r0;
        OvershootInterpolator overshootInterpolator = faVar.c0;
        RectF rectF = faVar.S;
        RectF rectF2 = faVar.T;
        v9 v9Var = faVar.a0;
        if (faVar.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = faVar.x;
            faVar.O();
            aa aaVar = faVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (aaVar != null) {
                canvas.save();
                int[] m10 = faVar.m();
                c10 = 1;
                float f11 = m10[1] + faVar.b;
                f7 = 8.0f;
                float f12 = m10[0] + faVar.a;
                canvas.translate(f12, f11);
                aa aaVar2 = faVar.W;
                MessageObject messageObject = aaVar2 instanceof t1 ? ((t1) aaVar2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(faVar.u(org.telegram.ui.ActionBar.j6.vf));
                } else {
                    paint.setColor(faVar.u(org.telegram.ui.ActionBar.j6.Wb));
                }
                int length = faVar.t(faVar.W, false).length();
                int i14 = faVar.v;
                if (i14 >= 0 && i14 <= length) {
                    faVar.j(i14, v9Var, false);
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
                        if (f16 <= i10 + faVar.e0 || f16 >= faVar.F.getMeasuredHeight()) {
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
            faVar.P();
            if (faVar.W != null) {
                canvas.save();
                int[] m11 = faVar.m();
                float f23 = m11[c10] + faVar.b;
                float f24 = m11[0] + faVar.a;
                canvas.translate(f24, f23);
                int length3 = faVar.t(faVar.W, false).length();
                int i16 = faVar.u;
                if (i16 >= 0 && i16 <= length3) {
                    faVar.j(i16, v9Var, false);
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
                        if (f27 <= i10 + faVar.e0 || f27 >= faVar.F.getMeasuredHeight()) {
                            if (f27 > 0.0f && f27 - faVar.n() < faVar.F.getMeasuredHeight()) {
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
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 29) {
                ArrayList arrayList = this.f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && faVar.i) {
                if (!faVar.j) {
                    faVar.O();
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
            if (i18 >= 23 && (actionMode = faVar.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = faVar.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.k4) actionMode2).e();
                }
            }
            if (faVar.k) {
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
        fa faVar = this.r;
        g gVar = faVar.r0;
        l9 l9Var = faVar.f0;
        v9 v9Var = faVar.a0;
        if (!faVar.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return faVar.i;
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i10 = faVar.b0 - x10;
        faVar.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!faVar.i) {
                float f11 = x10;
                float f12 = y3;
                if (faVar.S.contains(f11, f12)) {
                    faVar.P();
                    if (faVar.W == null) {
                        return false;
                    }
                    faVar.i = true;
                    faVar.j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] C = faVar.C(faVar.u);
                    float n10 = faVar.n() / 2;
                    int[] m10 = faVar.m();
                    if (faVar.i0) {
                        faVar.f = ((C[0] + faVar.a) + m10[0]) - x10;
                    } else {
                        faVar.f = 0.0f;
                    }
                    faVar.g = (((C[1] + faVar.b) + m10[1]) - y3) - n10;
                    faVar.v();
                    faVar.C.invalidate();
                    return true;
                }
                if (!faVar.T.contains(f11, f12)) {
                    faVar.i = false;
                    faVar.e = true;
                    return faVar.i;
                }
                faVar.O();
                if (faVar.W == null) {
                    return false;
                }
                faVar.i = true;
                faVar.j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] C2 = faVar.C(faVar.v);
                float n11 = faVar.n() / 2;
                int[] m11 = faVar.m();
                faVar.f = ((C2[0] + faVar.a) + m11[0]) - x10;
                faVar.g = (((C2[1] + faVar.b) + m11[1]) - y3) - n11;
                fa.a(faVar, faVar.b0);
                faVar.v();
                faVar.C.invalidate();
                return true;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (faVar.i) {
                    if (faVar.j) {
                        faVar.P();
                    } else {
                        faVar.O();
                    }
                    if (faVar.W == null) {
                        return faVar.i;
                    }
                    int i11 = (int) (x10 + faVar.f);
                    int i12 = (int) (y3 + faVar.g);
                    boolean Q = faVar.Q(i11, i12);
                    if (faVar.W != null) {
                        if (faVar.j) {
                            faVar.j(faVar.u, v9Var, false);
                        } else {
                            faVar.j(faVar.v, v9Var, false);
                        }
                        if (v9Var.b != null) {
                            float f13 = v9Var.c;
                            aa aaVar = faVar.W;
                            int[] m12 = faVar.m();
                            int i13 = i12 - m12[1];
                            int i14 = i11 - m12[0];
                            boolean z12 = faVar.E != null;
                            boolean z13 = z12 && y3 - faVar.m > faVar.F.getMeasuredHeight() - faVar.p() && (faVar.k0 || faVar.Z || faVar.W.getBottom() > faVar.F.getMeasuredHeight() - faVar.p());
                            if (z12) {
                                if (y3 < faVar.q() + ((View) faVar.F.getParent()).getTop() && (faVar.Z || faVar.W.getTop() < faVar.q())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!faVar.N) {
                                            faVar.N = true;
                                            AndroidUtilities.runOnUIThread(l9Var);
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
                                        AndroidUtilities.cancelRunOnUIThread(l9Var);
                                    }
                                    l4 = faVar.l(i14, i13, faVar.a, faVar.b, faVar.W, false);
                                    if (l4 >= 0) {
                                        if (faVar.R) {
                                            if (!Q) {
                                                if (l4 < faVar.u) {
                                                    faVar.R = false;
                                                    faVar.j = true;
                                                    faVar.v();
                                                } else if (l4 > faVar.v) {
                                                    faVar.R = false;
                                                    faVar.j = false;
                                                    faVar.v();
                                                }
                                            }
                                        }
                                        if (faVar.j) {
                                            if (faVar.u != l4 && faVar.c(l4)) {
                                                CharSequence t10 = faVar.t(faVar.W, false);
                                                faVar.j(l4, v9Var, false);
                                                Layout layout = v9Var.b;
                                                faVar.j(faVar.u, v9Var, false);
                                                Layout layout2 = v9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i15 = l4;
                                                    while (true) {
                                                        int i16 = i15 - 1;
                                                        if (i16 < 0 || !fa.z(t10.charAt(i16))) {
                                                            break;
                                                        }
                                                        i15--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i15);
                                                    int lineForOffset2 = layout2.getLineForOffset(faVar.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(l4);
                                                    if (Q || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(faVar.u) && lineForOffset3 == lineForOffset)) {
                                                        faVar.B(l4, i15, Q, faVar.a0.c, f13, aaVar);
                                                        AndroidUtilities.vibrateCursor(faVar.C);
                                                        faVar.x();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(l4)) || layout2.isRtlCharAt(l4) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        faVar.u = l4;
                                                        int i17 = faVar.v;
                                                        if (l4 > i17) {
                                                            faVar.v = l4;
                                                            faVar.u = i17;
                                                            faVar.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(faVar.C);
                                                        faVar.x();
                                                    } else {
                                                        int i18 = l4;
                                                        while (true) {
                                                            int i19 = i18 + 1;
                                                            if (i19 >= t10.length() || !fa.z(t10.charAt(i19))) {
                                                                break;
                                                            }
                                                            i18 = i19;
                                                        }
                                                        int abs = Math.abs(l4 - i15);
                                                        int abs2 = Math.abs(l4 - i18);
                                                        if (faVar.y) {
                                                            faVar.y = i10 >= 0;
                                                        }
                                                        int i20 = l4 - 1;
                                                        boolean z14 = i20 > 0 && fa.z(t10.charAt(i20));
                                                        if (l4 >= t10.length()) {
                                                            l4 = t10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = t10.charAt(l4);
                                                        }
                                                        if (faVar.u >= t10.length()) {
                                                            faVar.u = t10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = t10.charAt(faVar.u);
                                                        }
                                                        int i21 = faVar.u;
                                                        if ((l4 < i21 && abs < abs2) || ((l4 > i21 && i10 < 0) || !fa.z(charAt) || ((fa.z(charAt2) && !faVar.y) || l4 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!faVar.y || l4 != 1) {
                                                                if (l4 >= faVar.u || !fa.z(charAt) || ((fa.z(charAt2) && !faVar.y) || charAt2 == '\n')) {
                                                                    faVar.u = l4;
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
                                                                faVar.x();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            faVar.G();
                                        } else {
                                            if (l4 != faVar.v && faVar.c(l4)) {
                                                CharSequence t11 = faVar.t(faVar.W, false);
                                                int i24 = l4;
                                                while (i24 < t11.length() && fa.z(t11.charAt(i24))) {
                                                    i24++;
                                                }
                                                faVar.j(l4, v9Var, false);
                                                Layout layout3 = v9Var.b;
                                                faVar.j(faVar.v, v9Var, false);
                                                Layout layout4 = v9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (l4 > t11.length()) {
                                                        l4 = t11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i24);
                                                    int lineForOffset5 = layout4.getLineForOffset(faVar.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(l4);
                                                    if (Q || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(faVar.v) && lineForOffset6 == lineForOffset4)) {
                                                        faVar.B(l4, i24, Q, faVar.a0.c, f13, aaVar);
                                                        AndroidUtilities.vibrateCursor(faVar.C);
                                                        faVar.x();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(l4)) || layout4.isRtlCharAt(l4) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        faVar.v = l4;
                                                        int i25 = faVar.u;
                                                        if (i25 > l4) {
                                                            faVar.v = i25;
                                                            faVar.u = l4;
                                                            faVar.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(faVar.C);
                                                        faVar.x();
                                                    } else {
                                                        int i26 = l4;
                                                        while (true) {
                                                            int i27 = i26 - 1;
                                                            if (i27 < 0 || !fa.z(t11.charAt(i27))) {
                                                                break;
                                                            }
                                                            i26--;
                                                        }
                                                        int abs3 = Math.abs(l4 - i24);
                                                        int abs4 = Math.abs(l4 - i26);
                                                        int i28 = l4 - 1;
                                                        boolean z15 = i28 > 0 && fa.z(t11.charAt(i28));
                                                        if (faVar.y) {
                                                            faVar.y = i10 <= 0;
                                                        }
                                                        int i29 = faVar.v;
                                                        boolean z16 = i29 > 0 && fa.z(t11.charAt(i29 - 1));
                                                        int i30 = faVar.v;
                                                        if ((l4 > i30 && abs3 <= abs4) || ((l4 < i30 && i10 > 0) || !z15 || (z16 && !faVar.y))) {
                                                            if (l4 <= i30 || !z15 || (z16 && !faVar.y)) {
                                                                faVar.v = l4;
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
                                                            faVar.x();
                                                        }
                                                    }
                                                }
                                            }
                                            faVar.G();
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
                            l4 = faVar.l(i14, i13, faVar.a, faVar.b, faVar.W, false);
                            if (l4 >= 0) {
                            }
                            fa.a(faVar, faVar.b0);
                        }
                    }
                    return true;
                }
            }
            return faVar.i;
        }
        faVar.w();
        if (!faVar.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        faVar.i = z10;
        faVar.R = z10;
        faVar.k = z10;
        if (faVar.y()) {
            faVar.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            faVar.V();
        }
        if (faVar.N) {
            faVar.N = false;
            AndroidUtilities.cancelRunOnUIThread(l9Var);
        }
        return faVar.i;
    }
}
