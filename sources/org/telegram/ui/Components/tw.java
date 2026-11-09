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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tw extends qj0 {
    public boolean e3;
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public int k3;
    public SparseArray l3;
    public final /* synthetic */ hy m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw(hy hyVar, Context context) {
        super(context, null);
        this.m3 = hyVar;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = -1;
        new SparseIntArray();
        xq xqVar = xq.f;
    }

    public final void A1(View view) {
        if (this.l3 != null) {
            int i7 = 0;
            while (i7 < this.l3.size()) {
                sw swVar = (sw) this.l3.valueAt(i7);
                if (swVar.d == view) {
                    this.l3.removeAt(i7);
                    i7--;
                    View view2 = swVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        swVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = swVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i7++;
            }
        }
    }

    public final void B1() {
        hy hyVar = this.m3;
        int i7 = hyVar.c;
        tw twVar = hyVar.P;
        tw twVar2 = hyVar.P;
        r5[] r5VarArr = new r5[twVar.getChildCount()];
        for (int i10 = 0; i10 < twVar2.getChildCount(); i10++) {
            View childAt = twVar2.getChildAt(i10);
            if (childAt instanceof qx) {
                r5VarArr[i10] = ((qx) childAt).getSpan();
            }
        }
        hyVar.d2 = r5.update(i7, this, r5VarArr, (LongSparseArray<i5>) hyVar.d2);
    }

    @Override // org.telegram.ui.Components.qj0
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        boolean z9;
        Canvas canvas2 = canvas;
        hy hyVar = this.m3;
        tw twVar = hyVar.P;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
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
        int i12 = 1;
        boolean z10 = hyVar.v2 > 0 && SystemClock.elapsedRealtime() - hyVar.v2 < z1() && hyVar.s2 != null && hyVar.t2 >= 0;
        float f10 = 0.0f;
        if (hyVar.d2 != null && twVar != null) {
            int i13 = 0;
            while (i13 < twVar.getChildCount()) {
                View childAt = twVar.getChildAt(i13);
                if (childAt instanceof qx) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.k(i12, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((qx) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == hyVar.t2 - i12) {
                    z9 = z10;
                    float interpolation = xq.g.getInterpolation(c8.j9.a((SystemClock.elapsedRealtime() - hyVar.v2) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i7 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i7 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        hyVar.s2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i7 = i13;
                    z9 = z10;
                }
                i13 = i7 + 1;
                z10 = z9;
                f10 = 0.0f;
                i12 = 1;
            }
        }
        ArrayList arrayList5 = this.h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        while (true) {
            int size2 = sparseArray.size();
            rw rwVar = null;
            arrayList2 = this.j3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            qx qxVar = (qx) arrayList7.get(i10);
            int i15 = qxVar.a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                }
                if (((rw) arrayList5.get(i16)).M == i15) {
                    rwVar = (rw) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                }
                i16++;
            }
            if (rwVar == null) {
                rwVar = !arrayList2.isEmpty() ? (rw) org.telegram.ui.Cells.f1.k(1, arrayList2) : new rw(this);
                rwVar.M = i15;
                rwVar.e();
            }
            arrayList6.add(rwVar);
            rwVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(qxVar.getLeft(), qxVar.getY() + qxVar.getPaddingTop());
            rwVar.N = qxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (qxVar.getLeft() * 2);
            int measuredHeight = qxVar.getMeasuredHeight() - qxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                rwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((rw) arrayList5.get(i17));
                ((rw) arrayList5.get(i17)).O = null;
                ((rw) arrayList5.get(i17)).k();
            } else {
                ((rw) arrayList5.get(i17)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        hy hyVar = this.m3;
        tw twVar = hyVar.P;
        hyVar.n2.g();
        if (this.k3 != getChildCount()) {
            B1();
            this.k3 = getChildCount();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.f3;
            int size = sparseArray.size();
            arrayList = this.i3;
            if (i10 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i10++;
        }
        sparseArray.clear();
        boolean z9 = hyVar.v2 > 0 && SystemClock.elapsedRealtime() - hyVar.v2 < z1() && hyVar.s2 != null && hyVar.t2 >= 0;
        if (hyVar.d2 != null && twVar != null) {
            for (int i11 = 0; i11 < twVar.getChildCount(); i11++) {
                View childAt = twVar.getChildAt(i11);
                if (childAt instanceof qx) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((qx) childAt);
                }
                if (z9 && childAt != null && RecyclerView.R(childAt) == hyVar.t2 - 1) {
                    float interpolation = xq.g.getInterpolation(c8.j9.a((SystemClock.elapsedRealtime() - hyVar.v2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        hyVar.s2.draw(canvas);
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
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            rw rwVar = null;
            arrayList2 = this.j3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            qx qxVar = (qx) arrayList7.get(i7);
            int i13 = qxVar.a;
            int i14 = i7;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                }
                if (((rw) arrayList5.get(i14)).M == i13) {
                    rwVar = (rw) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                }
                i14++;
            }
            if (rwVar == null) {
                rwVar = !arrayList2.isEmpty() ? (rw) org.telegram.ui.Cells.f1.k(1, arrayList2) : new rw(this);
                rwVar.M = i13;
                rwVar.e();
            }
            arrayList6.add(rwVar);
            rwVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(qxVar.getLeft(), qxVar.getY() + qxVar.getPaddingTop());
            rwVar.N = qxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (qxVar.getLeft() * 2);
            int measuredHeight = qxVar.getMeasuredHeight() - qxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                rwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i7 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((rw) arrayList5.get(i15));
                ((rw) arrayList5.get(i15)).O = null;
                ((rw) arrayList5.get(i15)).k();
            } else {
                ((rw) arrayList5.get(i15)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z9 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z10 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z11 = motionEvent.getActionMasked() == 3;
        if (z9 || z10 || z11) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.l3 == null) {
                this.l3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (!z9) {
                sw swVar = (sw) this.l3.get(pointerId);
                this.l3.remove(pointerId);
                if (E != null && swVar != null) {
                    if (Math.sqrt(Math.pow(y10 - swVar.b, 2.0d) + Math.pow(x10 - swVar.a, 2.0d)) < org.telegram.messenger.g0.e * 3.0f && !z11) {
                        hy hyVar = this.m3;
                        if (!hyVar.B1.isShowing() || SystemClock.elapsedRealtime() - swVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = swVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof qx) {
                                    hy.d(hyVar, (qx) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof ww) {
                                    hyVar.R.E(R, (ww) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (swVar != null && (swVar.d.getBackground() instanceof RippleDrawable)) {
                    swVar.d.getBackground().setState(new int[0]);
                }
                if (swVar != null) {
                    swVar.d.setPressed(false);
                }
            } else if (E != null) {
                sw swVar2 = new sw();
                swVar2.a = x10;
                swVar2.b = y10;
                swVar2.c = SystemClock.elapsedRealtime();
                swVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                swVar2.d.setPressed(true);
                this.l3.put(pointerId, swVar2);
                C0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z11 && this.l3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            hy hyVar = this.m3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                hyVar.M(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            hy.e(hyVar, 1, org.telegram.messenger.g0.L(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        r5.release(this, (LongSparseArray<i5>) this.m3.d2);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.g3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((rw) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i7 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((rw) arrayList2.get(i7)).f();
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hy hyVar = this.m3;
        if (hyVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.ms.p().q(motionEvent, this, hyVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        hy hyVar = this.m3;
        if (hyVar.d0 && hyVar.c0) {
            this.e3 = true;
            hyVar.Q.h1(0, 0);
            hyVar.c0 = false;
            this.e3 = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        hyVar.l(true);
        B1();
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.e3 = true;
        int size = View.MeasureSpec.getSize(i7);
        hy hyVar = this.m3;
        hw hwVar = hyVar.Q;
        int i11 = hwVar.J;
        hwVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f)));
        this.e3 = false;
        super.onMeasure(i7, i10);
        if (i11 != hwVar.J) {
            hyVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hy hyVar = this.m3;
        int[] iArr = hyVar.D1;
        yt ytVar = hyVar.B1;
        if (hyVar.R1 != null && ytVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (ytVar != null && ytVar.isShowing() && !ytVar.d) {
                    ytVar.dismiss();
                    int i7 = ytVar.c.n[0];
                    String str = (i7 < 1 || i7 > 5) ? null : (String) org.telegram.messenger.h4.a.get(i7 - 1);
                    String str2 = (String) hyVar.R1.getTag();
                    if (hyVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            hy.d(hyVar, hyVar.R1, hy.g(replace, str));
                        } else {
                            hy.d(hyVar, hyVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            org.telegram.messenger.i6.j.put(str2, str);
                            str2 = hy.g(str2, str);
                        } else {
                            org.telegram.messenger.i6.j.remove(str2);
                        }
                        hyVar.R1.a(org.telegram.messenger.i6.f(str2), hyVar.R1.c);
                        hy.d(hyVar, hyVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.i6.q();
                    }
                }
                if (ytVar == null || !ytVar.d) {
                    hyVar.R1 = null;
                }
                hyVar.U1 = -10000.0f;
                hyVar.V1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = hyVar.U1;
                if (f10 != -10000.0f) {
                    if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(hyVar.V1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                        hyVar.U1 = -10000.0f;
                        hyVar.V1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                ytVar.c.getLocationOnScreen(iArr);
                int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                boolean z9 = ytVar.d;
                xt xtVar = ytVar.c;
                if (!z9) {
                    int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + ytVar.e)));
                    if (xtVar.n[0] != max) {
                        org.telegram.messenger.g0.c4(xtVar);
                        int[] iArr2 = xtVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            xtVar.invalidate();
                        }
                    }
                }
            }
            if (ytVar == null || !ytVar.d || ytVar.isShowing()) {
                return true;
            }
        }
        hyVar.S1 = motionEvent.getX();
        hyVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        hy hyVar = this.m3;
        return Math.max(400L, Math.min(45, hyVar.u2 - hyVar.t2) * 35) + Math.max(600L, Math.min(55, hyVar.u2 - hyVar.t2) * 40) + 150;
    }
}
