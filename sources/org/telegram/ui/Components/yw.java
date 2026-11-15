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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class yw extends uj0 {
    public boolean f3;
    public final SparseArray g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public int l3;
    public SparseArray m3;
    public final /* synthetic */ ly n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(ly lyVar, Context context) {
        super(context, null);
        this.n3 = lyVar;
        this.g3 = new SparseArray();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = -1;
        new SparseIntArray();
        er erVar = er.f;
    }

    public final void A1(View view) {
        if (this.m3 != null) {
            int i7 = 0;
            while (i7 < this.m3.size()) {
                xw xwVar = (xw) this.m3.valueAt(i7);
                if (xwVar.d == view) {
                    this.m3.removeAt(i7);
                    i7--;
                    View view2 = xwVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        xwVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = xwVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i7++;
            }
        }
    }

    public final void B1() {
        ly lyVar = this.n3;
        int i7 = lyVar.c;
        yw ywVar = lyVar.Q;
        yw ywVar2 = lyVar.Q;
        p5[] p5VarArr = new p5[ywVar.getChildCount()];
        for (int i10 = 0; i10 < ywVar2.getChildCount(); i10++) {
            View childAt = ywVar2.getChildAt(i10);
            if (childAt instanceof ux) {
                p5VarArr[i10] = ((ux) childAt).getSpan();
            }
        }
        lyVar.e2 = p5.update(i7, this, p5VarArr, (LongSparseArray<g5>) lyVar.e2);
    }

    @Override // org.telegram.ui.Components.uj0
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        boolean z10;
        Canvas canvas2 = canvas;
        ly lyVar = this.n3;
        yw ywVar = lyVar.Q;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.l3 != getChildCount()) {
            B1();
            this.l3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.g3;
            int size = sparseArray.size();
            arrayList = this.j3;
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
        boolean z11 = lyVar.w2 > 0 && SystemClock.elapsedRealtime() - lyVar.w2 < z1() && lyVar.t2 != null && lyVar.u2 >= 0;
        float f10 = 0.0f;
        if (lyVar.e2 != null && ywVar != null) {
            int i13 = 0;
            while (i13 < ywVar.getChildCount()) {
                View childAt = ywVar.getChildAt(i13);
                if (childAt instanceof ux) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) r.b.g(i12, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ux) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == lyVar.u2 - i12) {
                    z10 = z11;
                    float interpolation = er.g.getInterpolation(c8.i9.a((SystemClock.elapsedRealtime() - lyVar.w2) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i7 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i7 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        lyVar.t2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i7 = i13;
                    z10 = z11;
                }
                i13 = i7 + 1;
                z11 = z10;
                f10 = 0.0f;
                i12 = 1;
            }
        }
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i14 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ww wwVar = null;
            arrayList2 = this.k3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            ux uxVar = (ux) arrayList7.get(i10);
            int i15 = uxVar.a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                }
                if (((ww) arrayList5.get(i16)).N == i15) {
                    wwVar = (ww) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                }
                i16++;
            }
            if (wwVar == null) {
                wwVar = !arrayList2.isEmpty() ? (ww) r.b.g(1, arrayList2) : new ww(this);
                wwVar.N = i15;
                wwVar.e();
            }
            arrayList6.add(wwVar);
            wwVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(uxVar.getLeft(), uxVar.getY() + uxVar.getPaddingTop());
            wwVar.O = uxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (uxVar.getLeft() * 2);
            int measuredHeight = uxVar.getMeasuredHeight() - uxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                wwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ww) arrayList5.get(i17));
                ((ww) arrayList5.get(i17)).P = null;
                ((ww) arrayList5.get(i17)).k();
            } else {
                ((ww) arrayList5.get(i17)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        ly lyVar = this.n3;
        yw ywVar = lyVar.Q;
        lyVar.o2.g();
        if (this.l3 != getChildCount()) {
            B1();
            this.l3 = getChildCount();
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            sparseArray = this.g3;
            int size = sparseArray.size();
            arrayList = this.j3;
            if (i10 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i10++;
        }
        sparseArray.clear();
        boolean z10 = lyVar.w2 > 0 && SystemClock.elapsedRealtime() - lyVar.w2 < z1() && lyVar.t2 != null && lyVar.u2 >= 0;
        if (lyVar.e2 != null && ywVar != null) {
            for (int i11 = 0; i11 < ywVar.getChildCount(); i11++) {
                View childAt = ywVar.getChildAt(i11);
                if (childAt instanceof ux) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) r.b.g(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ux) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == lyVar.u2 - 1) {
                    float interpolation = er.g.getInterpolation(c8.i9.a((SystemClock.elapsedRealtime() - lyVar.w2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        lyVar.t2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ww wwVar = null;
            arrayList2 = this.k3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            ux uxVar = (ux) arrayList7.get(i7);
            int i13 = uxVar.a;
            int i14 = i7;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                }
                if (((ww) arrayList5.get(i14)).N == i13) {
                    wwVar = (ww) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                }
                i14++;
            }
            if (wwVar == null) {
                wwVar = !arrayList2.isEmpty() ? (ww) r.b.g(1, arrayList2) : new ww(this);
                wwVar.N = i13;
                wwVar.e();
            }
            arrayList6.add(wwVar);
            wwVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(uxVar.getLeft(), uxVar.getY() + uxVar.getPaddingTop());
            wwVar.O = uxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (uxVar.getLeft() * 2);
            int measuredHeight = uxVar.getMeasuredHeight() - uxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                wwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i7 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ww) arrayList5.get(i15));
                ((ww) arrayList5.get(i15)).P = null;
                ((ww) arrayList5.get(i15)).k();
            } else {
                ((ww) arrayList5.get(i15)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z11 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z12 = motionEvent.getActionMasked() == 3;
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.m3 == null) {
                this.m3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (!z10) {
                xw xwVar = (xw) this.m3.get(pointerId);
                this.m3.remove(pointerId);
                if (E != null && xwVar != null) {
                    if (Math.sqrt(Math.pow(y10 - xwVar.b, 2.0d) + Math.pow(x10 - xwVar.a, 2.0d)) < org.telegram.messenger.g0.e * 3.0f && !z12) {
                        ly lyVar = this.n3;
                        if (!lyVar.C1.isShowing() || SystemClock.elapsedRealtime() - xwVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = xwVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ux) {
                                    ly.d(lyVar, (ux) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof bx) {
                                    lyVar.S.E(R, (bx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (xwVar != null && (xwVar.d.getBackground() instanceof RippleDrawable)) {
                    xwVar.d.getBackground().setState(new int[0]);
                }
                if (xwVar != null) {
                    xwVar.d.setPressed(false);
                }
            } else if (E != null) {
                xw xwVar2 = new xw();
                xwVar2.a = x10;
                xwVar2.b = y10;
                xwVar2.c = SystemClock.elapsedRealtime();
                xwVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                xwVar2.d.setPressed(true);
                this.m3.put(pointerId, xwVar2);
                C0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.m3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            ly lyVar = this.n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                lyVar.N(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            ly.e(lyVar, 1, org.telegram.messenger.g0.L(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        p5.release(this, (LongSparseArray<g5>) this.n3.e2);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ww) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.k3;
            if (i7 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((ww) arrayList2.get(i7)).f();
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ly lyVar = this.n3;
        if (lyVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.ns.p().q(motionEvent, this, lyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ly lyVar = this.n3;
        if (lyVar.e0 && lyVar.d0) {
            this.f3 = true;
            lyVar.R.h1(0, 0);
            lyVar.d0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        lyVar.l(true);
        B1();
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.f3 = true;
        int size = View.MeasureSpec.getSize(i7);
        ly lyVar = this.n3;
        mw mwVar = lyVar.R;
        int i11 = mwVar.J;
        mwVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f)));
        this.f3 = false;
        super.onMeasure(i7, i10);
        if (i11 != mwVar.J) {
            lyVar.S.F(false);
        }
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ly lyVar = this.n3;
        int[] iArr = lyVar.E1;
        du duVar = lyVar.C1;
        if (lyVar.S1 != null && duVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (duVar != null && duVar.isShowing() && !duVar.d) {
                    duVar.dismiss();
                    int i7 = duVar.c.n[0];
                    String str = (i7 < 1 || i7 > 5) ? null : (String) org.telegram.messenger.h4.a.get(i7 - 1);
                    String str2 = (String) lyVar.S1.getTag();
                    if (lyVar.S1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            ly.d(lyVar, lyVar.S1, ly.g(replace, str));
                        } else {
                            ly.d(lyVar, lyVar.S1, replace);
                        }
                    } else {
                        if (str != null) {
                            org.telegram.messenger.j6.j.put(str2, str);
                            str2 = ly.g(str2, str);
                        } else {
                            org.telegram.messenger.j6.j.remove(str2);
                        }
                        lyVar.S1.a(org.telegram.messenger.j6.f(str2), lyVar.S1.c);
                        ly.d(lyVar, lyVar.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.j6.q();
                    }
                }
                if (duVar == null || !duVar.d) {
                    lyVar.S1 = null;
                }
                lyVar.V1 = -10000.0f;
                lyVar.W1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = lyVar.V1;
                if (f10 != -10000.0f) {
                    if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(lyVar.W1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                        lyVar.V1 = -10000.0f;
                        lyVar.W1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                duVar.c.getLocationOnScreen(iArr);
                int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                boolean z10 = duVar.d;
                cu cuVar = duVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + duVar.e)));
                    if (cuVar.n[0] != max) {
                        org.telegram.messenger.g0.b4(cuVar);
                        int[] iArr2 = cuVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            cuVar.invalidate();
                        }
                    }
                }
            }
            if (duVar == null || !duVar.d || duVar.isShowing()) {
                return true;
            }
        }
        lyVar.T1 = motionEvent.getX();
        lyVar.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        ly lyVar = this.n3;
        return Math.max(400L, Math.min(45, lyVar.v2 - lyVar.u2) * 35) + Math.max(600L, Math.min(55, lyVar.v2 - lyVar.u2) * 40) + 150;
    }
}
