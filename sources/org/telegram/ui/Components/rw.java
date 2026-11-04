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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rw extends tj0 {
    public boolean f3;
    public final SparseArray g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public int l3;
    public SparseArray m3;
    public final /* synthetic */ ey n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(ey eyVar, Context context) {
        super(context, null);
        this.n3 = eyVar;
        this.g3 = new SparseArray();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = -1;
        new SparseIntArray();
        xq xqVar = xq.f;
    }

    public final void A1(View view) {
        if (this.m3 != null) {
            int i3 = 0;
            while (i3 < this.m3.size()) {
                qw qwVar = (qw) this.m3.valueAt(i3);
                if (qwVar.d == view) {
                    this.m3.removeAt(i3);
                    i3--;
                    View view2 = qwVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        qwVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = qwVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i3++;
            }
        }
    }

    public final void B1() {
        ey eyVar = this.n3;
        int i3 = eyVar.c;
        rw rwVar = eyVar.Q;
        rw rwVar2 = eyVar.Q;
        p5[] p5VarArr = new p5[rwVar.getChildCount()];
        for (int i10 = 0; i10 < rwVar2.getChildCount(); i10++) {
            View childAt = rwVar2.getChildAt(i10);
            if (childAt instanceof nx) {
                p5VarArr[i10] = ((nx) childAt).getSpan();
            }
        }
        eyVar.e2 = p5.update(i3, this, p5VarArr, (LongSparseArray<g5>) eyVar.e2);
    }

    @Override // org.telegram.ui.Components.tj0
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        boolean z10;
        Canvas canvas2 = canvas;
        ey eyVar = this.n3;
        rw rwVar = eyVar.Q;
        super.J0(canvas, rectF, j10);
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
        boolean z11 = eyVar.w2 > 0 && SystemClock.elapsedRealtime() - eyVar.w2 < z1() && eyVar.t2 != null && eyVar.u2 >= 0;
        float f10 = 0.0f;
        if (eyVar.e2 != null && rwVar != null) {
            int i13 = 0;
            while (i13 < rwVar.getChildCount()) {
                View childAt = rwVar.getChildAt(i13);
                if (childAt instanceof nx) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.o(i12, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((nx) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == eyVar.u2 - i12) {
                    z10 = z11;
                    float interpolation = xq.g.getInterpolation(b8.be.a((SystemClock.elapsedRealtime() - eyVar.w2) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i3 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i3 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        eyVar.t2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i3 = i13;
                    z10 = z11;
                }
                i13 = i3 + 1;
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
            pw pwVar = null;
            arrayList2 = this.k3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            nx nxVar = (nx) arrayList7.get(i10);
            int i15 = nxVar.a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                }
                if (((pw) arrayList5.get(i16)).N == i15) {
                    pwVar = (pw) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                }
                i16++;
            }
            if (pwVar == null) {
                pwVar = !arrayList2.isEmpty() ? (pw) org.telegram.ui.Cells.f1.o(1, arrayList2) : new pw(this);
                pwVar.N = i15;
                pwVar.e();
            }
            arrayList6.add(pwVar);
            pwVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(nxVar.getLeft(), nxVar.getY() + nxVar.getPaddingTop());
            pwVar.O = nxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (nxVar.getLeft() * 2);
            int measuredHeight = nxVar.getMeasuredHeight() - nxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                pwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((pw) arrayList5.get(i17));
                ((pw) arrayList5.get(i17)).P = null;
                ((pw) arrayList5.get(i17)).k();
            } else {
                ((pw) arrayList5.get(i17)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        ey eyVar = this.n3;
        rw rwVar = eyVar.Q;
        eyVar.o2.g();
        if (this.l3 != getChildCount()) {
            B1();
            this.l3 = getChildCount();
        }
        int i3 = 0;
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
        boolean z10 = eyVar.w2 > 0 && SystemClock.elapsedRealtime() - eyVar.w2 < z1() && eyVar.t2 != null && eyVar.u2 >= 0;
        if (eyVar.e2 != null && rwVar != null) {
            for (int i11 = 0; i11 < rwVar.getChildCount(); i11++) {
                View childAt = rwVar.getChildAt(i11);
                if (childAt instanceof nx) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.o(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((nx) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == eyVar.u2 - 1) {
                    float interpolation = xq.g.getInterpolation(b8.be.a((SystemClock.elapsedRealtime() - eyVar.w2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        eyVar.t2.draw(canvas);
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
            pw pwVar = null;
            arrayList2 = this.k3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            nx nxVar = (nx) arrayList7.get(i3);
            int i13 = nxVar.a;
            int i14 = i3;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                }
                if (((pw) arrayList5.get(i14)).N == i13) {
                    pwVar = (pw) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                }
                i14++;
            }
            if (pwVar == null) {
                pwVar = !arrayList2.isEmpty() ? (pw) org.telegram.ui.Cells.f1.o(1, arrayList2) : new pw(this);
                pwVar.N = i13;
                pwVar.e();
            }
            arrayList6.add(pwVar);
            pwVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(nxVar.getLeft(), nxVar.getY() + nxVar.getPaddingTop());
            pwVar.O = nxVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (nxVar.getLeft() * 2);
            int measuredHeight = nxVar.getMeasuredHeight() - nxVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                pwVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i3 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((pw) arrayList5.get(i15));
                ((pw) arrayList5.get(i15)).P = null;
                ((pw) arrayList5.get(i15)).k();
            } else {
                ((pw) arrayList5.get(i15)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
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
            float y9 = motionEvent.getY(actionIndex);
            View E = E(x10, y9);
            if (!z10) {
                qw qwVar = (qw) this.m3.get(pointerId);
                this.m3.remove(pointerId);
                if (E != null && qwVar != null) {
                    if (Math.sqrt(Math.pow(y9 - qwVar.b, 2.0d) + Math.pow(x10 - qwVar.a, 2.0d)) < org.telegram.messenger.g0.e * 3.0f && !z12) {
                        ey eyVar = this.n3;
                        if (!eyVar.C1.isShowing() || SystemClock.elapsedRealtime() - qwVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = qwVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof nx) {
                                    ey.b(eyVar, (nx) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof uw) {
                                    eyVar.S.E(R, (uw) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (qwVar != null && (qwVar.d.getBackground() instanceof RippleDrawable)) {
                    qwVar.d.getBackground().setState(new int[0]);
                }
                if (qwVar != null) {
                    qwVar.d.setPressed(false);
                }
            } else if (E != null) {
                qw qwVar2 = new qw();
                qwVar2.a = x10;
                qwVar2.b = y9;
                qwVar2.c = SystemClock.elapsedRealtime();
                qwVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                qwVar2.d.setPressed(true);
                this.m3.put(pointerId, qwVar2);
                C0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.m3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i3) {
        if (i3 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            ey eyVar = this.n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                eyVar.M(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            ey.e(eyVar, 1, org.telegram.messenger.g0.L(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        p5.release(this, (LongSparseArray<g5>) this.n3.e2);
        int i3 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((pw) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.k3;
            if (i3 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((pw) arrayList2.get(i3)).f();
                i3++;
            }
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ey eyVar = this.n3;
        if (eyVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.is.p().q(motionEvent, this, eyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        ey eyVar = this.n3;
        if (eyVar.e0 && eyVar.d0) {
            this.f3 = true;
            eyVar.R.h1(0, 0);
            eyVar.d0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        eyVar.l(true);
        B1();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.f3 = true;
        int size = View.MeasureSpec.getSize(i3);
        ey eyVar = this.n3;
        fw fwVar = eyVar.R;
        int i11 = fwVar.J;
        fwVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f)));
        this.f3 = false;
        super.onMeasure(i3, i10);
        if (i11 != fwVar.J) {
            eyVar.S.F(false);
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ey eyVar = this.n3;
        int[] iArr = eyVar.E1;
        wt wtVar = eyVar.C1;
        if (eyVar.S1 != null && wtVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (wtVar != null && wtVar.isShowing() && !wtVar.d) {
                    wtVar.dismiss();
                    int i3 = wtVar.c.n[0];
                    String str = (i3 < 1 || i3 > 5) ? null : (String) org.telegram.messenger.h4.a.get(i3 - 1);
                    String str2 = (String) eyVar.S1.getTag();
                    if (eyVar.S1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            ey.b(eyVar, eyVar.S1, ey.g(replace, str));
                        } else {
                            ey.b(eyVar, eyVar.S1, replace);
                        }
                    } else {
                        if (str != null) {
                            org.telegram.messenger.i6.j.put(str2, str);
                            str2 = ey.g(str2, str);
                        } else {
                            org.telegram.messenger.i6.j.remove(str2);
                        }
                        eyVar.S1.a(org.telegram.messenger.i6.f(str2), eyVar.S1.c);
                        ey.b(eyVar, eyVar.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.i6.q();
                    }
                }
                if (wtVar == null || !wtVar.d) {
                    eyVar.S1 = null;
                }
                eyVar.V1 = -10000.0f;
                eyVar.W1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = eyVar.V1;
                if (f10 != -10000.0f) {
                    if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(eyVar.W1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                        eyVar.V1 = -10000.0f;
                        eyVar.W1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                wtVar.c.getLocationOnScreen(iArr);
                int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                boolean z10 = wtVar.d;
                vt vtVar = wtVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + wtVar.e)));
                    if (vtVar.n[0] != max) {
                        org.telegram.messenger.g0.c4(vtVar);
                        int[] iArr2 = vtVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            vtVar.invalidate();
                        }
                    }
                }
            }
            if (wtVar == null || !wtVar.d || wtVar.isShowing()) {
                return true;
            }
        }
        eyVar.T1 = motionEvent.getX();
        eyVar.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        ey eyVar = this.n3;
        return Math.max(400L, Math.min(45, eyVar.v2 - eyVar.u2) * 35) + Math.max(600L, Math.min(55, eyVar.v2 - eyVar.u2) * 40) + 150;
    }
}
