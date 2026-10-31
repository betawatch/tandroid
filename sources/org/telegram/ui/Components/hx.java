package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hx extends tk0 {
    public boolean e3;
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public int k3;
    public SparseArray l3;
    public final /* synthetic */ vy m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(vy vyVar, Context context) {
        super(context, null);
        this.m3 = vyVar;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = -1;
        new SparseIntArray();
        gr grVar = gr.f;
    }

    public final void A1(View view) {
        if (this.l3 != null) {
            int i10 = 0;
            while (i10 < this.l3.size()) {
                gx gxVar = (gx) this.l3.valueAt(i10);
                if (gxVar.d == view) {
                    this.l3.removeAt(i10);
                    i10--;
                    View view2 = gxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        gxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = gxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void B1() {
        vy vyVar = this.m3;
        int i10 = vyVar.c;
        hx hxVar = vyVar.P;
        hx hxVar2 = vyVar.P;
        o5[] o5VarArr = new o5[hxVar.getChildCount()];
        for (int i11 = 0; i11 < hxVar2.getChildCount(); i11++) {
            View childAt = hxVar2.getChildAt(i11);
            if (childAt instanceof ey) {
                o5VarArr[i11] = ((ey) childAt).getSpan();
            }
        }
        vyVar.d2 = o5.update(i10, this, o5VarArr, (LongSparseArray<f5>) vyVar.d2);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        boolean z10;
        Canvas canvas2 = canvas;
        vy vyVar = this.m3;
        hx hxVar = vyVar.P;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.k3 != getChildCount()) {
            B1();
            this.k3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.f3;
            int size = sparseArray.size();
            arrayList = this.i3;
            if (i12 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i12);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i12++;
        }
        sparseArray.clear();
        int i13 = 1;
        boolean z11 = vyVar.v2 > 0 && SystemClock.elapsedRealtime() - vyVar.v2 < z1() && vyVar.s2 != null && vyVar.t2 >= 0;
        float f7 = 0.0f;
        if (vyVar.d2 != null && hxVar != null) {
            int i14 = 0;
            while (i14 < hxVar.getChildCount()) {
                View childAt = hxVar.getChildAt(i14);
                if (childAt instanceof ey) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) i0.a.v(i13, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ey) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == vyVar.t2 - i13) {
                    z10 = z11;
                    float interpolation = gr.g.getInterpolation(w7.u.a((SystemClock.elapsedRealtime() - vyVar.v2) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        vyVar.s2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i10 = i14;
                    z10 = z11;
                }
                i14 = i10 + 1;
                z11 = z10;
                f7 = 0.0f;
                i13 = 1;
            }
        }
        ArrayList arrayList5 = this.h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            fx fxVar = null;
            arrayList2 = this.j3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            ey eyVar = (ey) arrayList7.get(i11);
            int i16 = eyVar.a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                }
                if (((fx) arrayList5.get(i17)).M == i16) {
                    fxVar = (fx) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                }
                i17++;
            }
            if (fxVar == null) {
                fxVar = !arrayList2.isEmpty() ? (fx) i0.a.v(1, arrayList2) : new fx(this);
                fxVar.M = i16;
                fxVar.e();
            }
            arrayList6.add(fxVar);
            fxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(eyVar.getLeft(), eyVar.getY() + eyVar.getPaddingTop());
            fxVar.N = eyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (eyVar.getLeft() * 2);
            int measuredHeight = eyVar.getMeasuredHeight() - eyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                fxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((fx) arrayList5.get(i18));
                ((fx) arrayList5.get(i18)).O = null;
                ((fx) arrayList5.get(i18)).k();
            } else {
                ((fx) arrayList5.get(i18)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        vy vyVar = this.m3;
        hx hxVar = vyVar.P;
        vyVar.n2.g();
        if (this.k3 != getChildCount()) {
            B1();
            this.k3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f3;
            int size = sparseArray.size();
            arrayList = this.i3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        boolean z10 = vyVar.v2 > 0 && SystemClock.elapsedRealtime() - vyVar.v2 < z1() && vyVar.s2 != null && vyVar.t2 >= 0;
        if (vyVar.d2 != null && hxVar != null) {
            for (int i12 = 0; i12 < hxVar.getChildCount(); i12++) {
                View childAt = hxVar.getChildAt(i12);
                if (childAt instanceof ey) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) i0.a.v(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ey) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == vyVar.t2 - 1) {
                    float interpolation = gr.g.getInterpolation(w7.u.a((SystemClock.elapsedRealtime() - vyVar.v2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        vyVar.s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            fx fxVar = null;
            arrayList2 = this.j3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            ey eyVar = (ey) arrayList7.get(i10);
            int i14 = eyVar.a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                }
                if (((fx) arrayList5.get(i15)).M == i14) {
                    fxVar = (fx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                }
                i15++;
            }
            if (fxVar == null) {
                fxVar = !arrayList2.isEmpty() ? (fx) i0.a.v(1, arrayList2) : new fx(this);
                fxVar.M = i14;
                fxVar.e();
            }
            arrayList6.add(fxVar);
            fxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(eyVar.getLeft(), eyVar.getY() + eyVar.getPaddingTop());
            fxVar.N = eyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (eyVar.getLeft() * 2);
            int measuredHeight = eyVar.getMeasuredHeight() - eyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                fxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((fx) arrayList5.get(i16));
                ((fx) arrayList5.get(i16)).O = null;
                ((fx) arrayList5.get(i16)).k();
            } else {
                ((fx) arrayList5.get(i16)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z11 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z12 = motionEvent.getActionMasked() == 3;
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.l3 == null) {
                this.l3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (!z10) {
                gx gxVar = (gx) this.l3.get(pointerId);
                this.l3.remove(pointerId);
                if (E != null && gxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - gxVar.b, 2.0d) + Math.pow(x10 - gxVar.a, 2.0d)) < org.telegram.messenger.i0.e * 3.0f && !z12) {
                        vy vyVar = this.m3;
                        if (!vyVar.B1.isShowing() || SystemClock.elapsedRealtime() - gxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = gxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ey) {
                                    vy.b(vyVar, (ey) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof kx) {
                                    vyVar.R.E(R, (kx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (gxVar != null && (gxVar.d.getBackground() instanceof RippleDrawable)) {
                    gxVar.d.getBackground().setState(new int[0]);
                }
                if (gxVar != null) {
                    gxVar.d.setPressed(false);
                }
            } else if (E != null) {
                gx gxVar2 = new gx();
                gxVar2.a = x10;
                gxVar2.b = y3;
                gxVar2.c = SystemClock.elapsedRealtime();
                gxVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                gxVar2.d.setPressed(true);
                this.l3.put(pointerId, gxVar2);
                C0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.l3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            vy vyVar = this.m3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                vyVar.N(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            vy.e(vyVar, 1, org.telegram.messenger.i0.L(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        o5.release(this, (LongSparseArray<f5>) this.m3.d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.g3;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((fx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((fx) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vy vyVar = this.m3;
        if (vyVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.lt.p().q(motionEvent, this, vyVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        vy vyVar = this.m3;
        if (vyVar.d0 && vyVar.c0) {
            this.e3 = true;
            vyVar.Q.h1(0, 0);
            vyVar.c0 = false;
            this.e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        vyVar.l(true);
        B1();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.e3 = true;
        int size = View.MeasureSpec.getSize(i10);
        vy vyVar = this.m3;
        vw vwVar = vyVar.Q;
        int i12 = vwVar.J;
        vwVar.y1(Math.max(1, size / org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 60.0f : 45.0f)));
        this.e3 = false;
        super.onMeasure(i10, i11);
        if (i12 != vwVar.J) {
            vyVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vy vyVar = this.m3;
        int[] iArr = vyVar.D1;
        ju juVar = vyVar.B1;
        if (vyVar.R1 != null && juVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (juVar != null && juVar.isShowing() && !juVar.d) {
                    juVar.dismiss();
                    int i10 = juVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : (String) org.telegram.messenger.k4.a.get(i10 - 1);
                    String str2 = (String) vyVar.R1.getTag();
                    if (vyVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            vy.b(vyVar, vyVar.R1, vy.g(replace, str));
                        } else {
                            vy.b(vyVar, vyVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            org.telegram.messenger.k6.j.put(str2, str);
                            str2 = vy.g(str2, str);
                        } else {
                            org.telegram.messenger.k6.j.remove(str2);
                        }
                        vyVar.R1.a(org.telegram.messenger.k6.f(str2), vyVar.R1.c);
                        vy.b(vyVar, vyVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.k6.q();
                    }
                }
                if (juVar == null || !juVar.d) {
                    vyVar.R1 = null;
                }
                vyVar.U1 = -10000.0f;
                vyVar.V1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f7 = vyVar.U1;
                if (f7 != -10000.0f) {
                    if (Math.abs(f7 - motionEvent.getX()) > org.telegram.messenger.i0.a1(true, 0.2f) || Math.abs(vyVar.V1 - motionEvent.getY()) > org.telegram.messenger.i0.a1(false, 0.2f)) {
                        vyVar.U1 = -10000.0f;
                        vyVar.V1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                juVar.c.getLocationOnScreen(iArr);
                int L = (int) (x10 - (org.telegram.messenger.i0.L(3.0f) + iArr[0]));
                boolean z10 = juVar.d;
                iu iuVar = juVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.i0.L(4.0f) + juVar.e)));
                    if (iuVar.n[0] != max) {
                        org.telegram.messenger.i0.b4(iuVar);
                        int[] iArr2 = iuVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            iuVar.invalidate();
                        }
                    }
                }
            }
            if (juVar == null || !juVar.d || juVar.isShowing()) {
                return true;
            }
        }
        vyVar.S1 = motionEvent.getX();
        vyVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        vy vyVar = this.m3;
        return Math.max(400L, Math.min(45, vyVar.u2 - vyVar.t2) * 35) + Math.max(600L, Math.min(55, vyVar.u2 - vyVar.t2) * 40) + 150;
    }
}
