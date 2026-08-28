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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        if (aaVar.y() && !aaVar.i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = motionEvent.getX();
                this.c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && g7.w.b((int) this.b, (int) this.c, (int) motionEvent.getX(), (int) motionEvent.getY()) < aaVar.m) {
                aaVar.L(motionEvent.getRawX(), motionEvent.getRawY());
                aaVar.v();
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
        if (!aaVar.j0 || (viewGroup = aaVar.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i9;
        char c10;
        float f10;
        int i10;
        ActionMode actionMode;
        boolean isRtlCharAt;
        float f11;
        boolean z10;
        int i11;
        aa aaVar = this.r;
        g gVar2 = aaVar.r0;
        OvershootInterpolator overshootInterpolator = aaVar.c0;
        RectF rectF = aaVar.S;
        RectF rectF2 = aaVar.T;
        q9 q9Var = aaVar.a0;
        if (aaVar.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i12 = aaVar.x;
            aaVar.O();
            v9 v9Var = aaVar.W;
            Paint paint = this.a;
            Path path = this.e;
            if (v9Var != null) {
                canvas.save();
                int[] m10 = aaVar.m();
                c10 = 1;
                float f12 = m10[1] + aaVar.b;
                f10 = 8.0f;
                float f13 = m10[0] + aaVar.a;
                canvas.translate(f13, f12);
                v9 v9Var2 = aaVar.W;
                MessageObject messageObject = v9Var2 instanceof t1 ? ((t1) v9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(aaVar.u(org.telegram.ui.ActionBar.f6.vf));
                } else {
                    paint.setColor(aaVar.u(org.telegram.ui.ActionBar.f6.Wb));
                }
                int length = aaVar.t(aaVar.W, false).length();
                int i13 = aaVar.v;
                if (i13 >= 0 && i13 <= length) {
                    aaVar.j(i13, q9Var, false);
                    Layout layout = q9Var.b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i14 = aaVar.v - q9Var.a;
                        int length2 = layout.getText().length();
                        if (i14 > length2) {
                            i14 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i14);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i14);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + q9Var.c);
                        float f14 = primaryHorizontal + q9Var.d;
                        Rect rect = q9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - aaVar.a;
                            i11 = rect.bottom - aaVar.b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(aaVar.v);
                            f11 = f14;
                            z10 = isRtlCharAt2;
                            i11 = lineBottom;
                        }
                        float f16 = i11;
                        float f17 = f12 + f16;
                        i9 = i12;
                        if (f17 <= i9 + aaVar.e0 || f17 >= aaVar.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f18 = dp;
                            canvas.translate(f11 - f18, f16);
                            float interpolation = overshootInterpolator.getInterpolation(aaVar.V);
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
                            float interpolation2 = overshootInterpolator.getInterpolation(aaVar.V);
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
                            i10 = 1;
                            canvas.restore();
                        }
                        i10 = 0;
                        canvas.restore();
                    }
                }
                gVar = gVar2;
                i9 = i12;
                i10 = 0;
                canvas.restore();
            } else {
                gVar = gVar2;
                i9 = i12;
                c10 = 1;
                f10 = 8.0f;
                i10 = 0;
            }
            aaVar.P();
            if (aaVar.W != null) {
                canvas.save();
                int[] m11 = aaVar.m();
                float f24 = m11[c10] + aaVar.b;
                float f25 = m11[0] + aaVar.a;
                canvas.translate(f25, f24);
                int length3 = aaVar.t(aaVar.W, false).length();
                int i15 = aaVar.u;
                if (i15 >= 0 && i15 <= length3) {
                    aaVar.j(i15, q9Var, false);
                    Layout layout2 = q9Var.b;
                    if (layout2 != null) {
                        int i16 = aaVar.u - q9Var.a;
                        int lineForOffset2 = layout2.getLineForOffset(i16);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i16);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + q9Var.c);
                        float f26 = primaryHorizontal2 + q9Var.d;
                        Rect rect2 = q9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - aaVar.a;
                            lineBottom2 = rect2.bottom - aaVar.b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(aaVar.u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 <= i9 + aaVar.e0 || f28 >= aaVar.F.getMeasuredHeight()) {
                            if (f28 > 0.0f && f28 - aaVar.n() < aaVar.F.getMeasuredHeight()) {
                                i10++;
                            }
                            rectF.setEmpty();
                        } else if (isRtlCharAt) {
                            canvas.save();
                            canvas.translate(f26, f27);
                            float interpolation3 = overshootInterpolator.getInterpolation(aaVar.V);
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
                            float interpolation4 = overshootInterpolator.getInterpolation(aaVar.V);
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
                            i10++;
                        }
                    }
                }
                canvas.restore();
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 29) {
                ArrayList arrayList = this.f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i10 != 0 && aaVar.i) {
                if (!aaVar.j) {
                    aaVar.O();
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
            if (i17 >= 23 && (actionMode = aaVar.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = aaVar.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.g4) actionMode2).e();
                }
            }
            if (aaVar.k) {
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
        float f10;
        float f11;
        int l10;
        char charAt;
        char charAt2;
        aa aaVar = this.r;
        g gVar = aaVar.r0;
        m.i3 i3Var = aaVar.f0;
        q9 q9Var = aaVar.a0;
        if (!aaVar.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return aaVar.i;
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i9 = aaVar.b0 - x10;
        aaVar.b0 = x10;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!aaVar.i) {
                float f12 = x10;
                float f13 = y10;
                if (aaVar.S.contains(f12, f13)) {
                    aaVar.P();
                    if (aaVar.W == null) {
                        return false;
                    }
                    aaVar.i = true;
                    aaVar.j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] C = aaVar.C(aaVar.u);
                    float n10 = aaVar.n() / 2;
                    int[] m10 = aaVar.m();
                    if (aaVar.i0) {
                        aaVar.f = ((C[0] + aaVar.a) + m10[0]) - x10;
                    } else {
                        aaVar.f = 0.0f;
                    }
                    aaVar.g = (((C[1] + aaVar.b) + m10[1]) - y10) - n10;
                    aaVar.v();
                    aaVar.C.invalidate();
                    return true;
                }
                if (!aaVar.T.contains(f12, f13)) {
                    aaVar.i = false;
                    aaVar.e = true;
                    return aaVar.i;
                }
                aaVar.O();
                if (aaVar.W == null) {
                    return false;
                }
                aaVar.i = true;
                aaVar.j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] C2 = aaVar.C(aaVar.v);
                float n11 = aaVar.n() / 2;
                int[] m11 = aaVar.m();
                aaVar.f = ((C2[0] + aaVar.a) + m11[0]) - x10;
                aaVar.g = (((C2[1] + aaVar.b) + m11[1]) - y10) - n11;
                aa.a(aaVar, aaVar.b0);
                aaVar.v();
                aaVar.C.invalidate();
                return true;
            }
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (aaVar.i) {
                    if (aaVar.j) {
                        aaVar.P();
                    } else {
                        aaVar.O();
                    }
                    if (aaVar.W == null) {
                        return aaVar.i;
                    }
                    int i10 = (int) (x10 + aaVar.f);
                    int i11 = (int) (y10 + aaVar.g);
                    boolean Q = aaVar.Q(i10, i11);
                    if (aaVar.W != null) {
                        if (aaVar.j) {
                            aaVar.j(aaVar.u, q9Var, false);
                        } else {
                            aaVar.j(aaVar.v, q9Var, false);
                        }
                        if (q9Var.b != null) {
                            float f14 = q9Var.c;
                            v9 v9Var = aaVar.W;
                            int[] m12 = aaVar.m();
                            int i12 = i11 - m12[1];
                            int i13 = i10 - m12[0];
                            boolean z12 = aaVar.E != null;
                            boolean z13 = z12 && y10 - aaVar.m > aaVar.F.getMeasuredHeight() - aaVar.p() && (aaVar.k0 || aaVar.Z || aaVar.W.getBottom() > aaVar.F.getMeasuredHeight() - aaVar.p());
                            if (z12) {
                                if (y10 < aaVar.q() + ((View) aaVar.F.getParent()).getTop() && (aaVar.Z || aaVar.W.getTop() < aaVar.q())) {
                                    z11 = true;
                                    if (!z13 || z11) {
                                        if (!aaVar.N) {
                                            aaVar.N = true;
                                            AndroidUtilities.runOnUIThread(i3Var);
                                        }
                                        aaVar.O = z13;
                                        if (z13) {
                                            f10 = -aaVar.W.getTop();
                                            f11 = aaVar.g;
                                        } else {
                                            f10 = aaVar.F.getMeasuredHeight() - aaVar.W.getTop();
                                            f11 = aaVar.g;
                                        }
                                        i12 = (int) (f10 + f11);
                                    } else if (aaVar.N) {
                                        aaVar.N = false;
                                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                                    }
                                    l10 = aaVar.l(i13, i12, aaVar.a, aaVar.b, aaVar.W, false);
                                    if (l10 >= 0) {
                                        if (aaVar.R) {
                                            if (!Q) {
                                                if (l10 < aaVar.u) {
                                                    aaVar.R = false;
                                                    aaVar.j = true;
                                                    aaVar.v();
                                                } else if (l10 > aaVar.v) {
                                                    aaVar.R = false;
                                                    aaVar.j = false;
                                                    aaVar.v();
                                                }
                                            }
                                        }
                                        if (aaVar.j) {
                                            if (aaVar.u != l10 && aaVar.c(l10)) {
                                                CharSequence t10 = aaVar.t(aaVar.W, false);
                                                aaVar.j(l10, q9Var, false);
                                                Layout layout = q9Var.b;
                                                aaVar.j(aaVar.u, q9Var, false);
                                                Layout layout2 = q9Var.b;
                                                if (layout != null && layout2 != null) {
                                                    int i14 = l10;
                                                    while (true) {
                                                        int i15 = i14 - 1;
                                                        if (i15 < 0 || !aa.z(t10.charAt(i15))) {
                                                            break;
                                                        }
                                                        i14--;
                                                    }
                                                    int lineForOffset = layout2.getLineForOffset(i14);
                                                    int lineForOffset2 = layout2.getLineForOffset(aaVar.u);
                                                    int lineForOffset3 = layout2.getLineForOffset(l10);
                                                    if (Q || layout != layout2 || (lineForOffset3 != layout2.getLineForOffset(aaVar.u) && lineForOffset3 == lineForOffset)) {
                                                        aaVar.B(l10, i14, Q, aaVar.a0.c, f14, v9Var);
                                                        AndroidUtilities.vibrateCursor(aaVar.C);
                                                        aaVar.x();
                                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(l10)) || layout2.isRtlCharAt(l10) || lineForOffset != lineForOffset2 || lineForOffset3 != lineForOffset) {
                                                        aaVar.u = l10;
                                                        int i16 = aaVar.v;
                                                        if (l10 > i16) {
                                                            aaVar.v = l10;
                                                            aaVar.u = i16;
                                                            aaVar.j = false;
                                                        }
                                                        AndroidUtilities.vibrateCursor(aaVar.C);
                                                        aaVar.x();
                                                    } else {
                                                        int i17 = l10;
                                                        while (true) {
                                                            int i18 = i17 + 1;
                                                            if (i18 >= t10.length() || !aa.z(t10.charAt(i18))) {
                                                                break;
                                                            }
                                                            i17 = i18;
                                                        }
                                                        int abs = Math.abs(l10 - i14);
                                                        int abs2 = Math.abs(l10 - i17);
                                                        if (aaVar.y) {
                                                            aaVar.y = i9 >= 0;
                                                        }
                                                        int i19 = l10 - 1;
                                                        boolean z14 = i19 > 0 && aa.z(t10.charAt(i19));
                                                        if (l10 >= t10.length()) {
                                                            l10 = t10.length();
                                                            charAt = '\n';
                                                        } else {
                                                            charAt = t10.charAt(l10);
                                                        }
                                                        if (aaVar.u >= t10.length()) {
                                                            aaVar.u = t10.length();
                                                            charAt2 = '\n';
                                                        } else {
                                                            charAt2 = t10.charAt(aaVar.u);
                                                        }
                                                        int i20 = aaVar.u;
                                                        if ((l10 < i20 && abs < abs2) || ((l10 > i20 && i9 < 0) || !aa.z(charAt) || ((aa.z(charAt2) && !aaVar.y) || l10 == 0 || !z14 || charAt2 == '\n'))) {
                                                            if (!aaVar.y || l10 != 1) {
                                                                if (l10 >= aaVar.u || !aa.z(charAt) || ((aa.z(charAt2) && !aaVar.y) || charAt2 == '\n')) {
                                                                    aaVar.u = l10;
                                                                } else {
                                                                    aaVar.u = i14;
                                                                    aaVar.y = true;
                                                                }
                                                                int i21 = aaVar.u;
                                                                int i22 = aaVar.v;
                                                                if (i21 > i22) {
                                                                    aaVar.v = i21;
                                                                    aaVar.u = i22;
                                                                    aaVar.j = false;
                                                                }
                                                                AndroidUtilities.vibrateCursor(aaVar.C);
                                                                aaVar.x();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            aaVar.G();
                                        } else {
                                            if (l10 != aaVar.v && aaVar.c(l10)) {
                                                CharSequence t11 = aaVar.t(aaVar.W, false);
                                                int i23 = l10;
                                                while (i23 < t11.length() && aa.z(t11.charAt(i23))) {
                                                    i23++;
                                                }
                                                aaVar.j(l10, q9Var, false);
                                                Layout layout3 = q9Var.b;
                                                aaVar.j(aaVar.v, q9Var, false);
                                                Layout layout4 = q9Var.b;
                                                if (layout3 != null && layout4 != null) {
                                                    if (l10 > t11.length()) {
                                                        l10 = t11.length();
                                                    }
                                                    int lineForOffset4 = layout4.getLineForOffset(i23);
                                                    int lineForOffset5 = layout4.getLineForOffset(aaVar.v);
                                                    int lineForOffset6 = layout4.getLineForOffset(l10);
                                                    if (Q || layout3 != layout4 || (lineForOffset6 != layout4.getLineForOffset(aaVar.v) && lineForOffset6 == lineForOffset4)) {
                                                        aaVar.B(l10, i23, Q, aaVar.a0.c, f14, v9Var);
                                                        AndroidUtilities.vibrateCursor(aaVar.C);
                                                        aaVar.x();
                                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(l10)) || layout4.isRtlCharAt(l10) || lineForOffset5 != lineForOffset4 || lineForOffset6 != lineForOffset4) {
                                                        aaVar.v = l10;
                                                        int i24 = aaVar.u;
                                                        if (i24 > l10) {
                                                            aaVar.v = i24;
                                                            aaVar.u = l10;
                                                            aaVar.j = true;
                                                        }
                                                        AndroidUtilities.vibrateCursor(aaVar.C);
                                                        aaVar.x();
                                                    } else {
                                                        int i25 = l10;
                                                        while (true) {
                                                            int i26 = i25 - 1;
                                                            if (i26 < 0 || !aa.z(t11.charAt(i26))) {
                                                                break;
                                                            }
                                                            i25--;
                                                        }
                                                        int abs3 = Math.abs(l10 - i23);
                                                        int abs4 = Math.abs(l10 - i25);
                                                        int i27 = l10 - 1;
                                                        boolean z15 = i27 > 0 && aa.z(t11.charAt(i27));
                                                        if (aaVar.y) {
                                                            aaVar.y = i9 <= 0;
                                                        }
                                                        int i28 = aaVar.v;
                                                        boolean z16 = i28 > 0 && aa.z(t11.charAt(i28 - 1));
                                                        int i29 = aaVar.v;
                                                        if ((l10 > i29 && abs3 <= abs4) || ((l10 < i29 && i9 > 0) || !z15 || (z16 && !aaVar.y))) {
                                                            if (l10 <= i29 || !z15 || (z16 && !aaVar.y)) {
                                                                aaVar.v = l10;
                                                            } else {
                                                                aaVar.v = i23;
                                                                aaVar.y = true;
                                                            }
                                                            int i30 = aaVar.u;
                                                            int i31 = aaVar.v;
                                                            if (i30 > i31) {
                                                                aaVar.v = i30;
                                                                aaVar.u = i31;
                                                                aaVar.j = true;
                                                            }
                                                            AndroidUtilities.vibrateCursor(aaVar.C);
                                                            aaVar.x();
                                                        }
                                                    }
                                                }
                                            }
                                            aaVar.G();
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
                            i12 = (int) (f10 + f11);
                            l10 = aaVar.l(i13, i12, aaVar.a, aaVar.b, aaVar.W, false);
                            if (l10 >= 0) {
                            }
                            aa.a(aaVar, aaVar.b0);
                        }
                    }
                    return true;
                }
            }
            return aaVar.i;
        }
        aaVar.w();
        if (!aaVar.i || (parent = getParent()) == null) {
            z10 = false;
        } else {
            z10 = false;
            parent.requestDisallowInterceptTouchEvent(false);
        }
        aaVar.i = z10;
        aaVar.R = z10;
        aaVar.k = z10;
        if (aaVar.y()) {
            aaVar.C.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar);
            aaVar.V();
        }
        if (aaVar.N) {
            aaVar.N = false;
            AndroidUtilities.cancelRunOnUIThread(i3Var);
        }
        return aaVar.i;
    }
}
