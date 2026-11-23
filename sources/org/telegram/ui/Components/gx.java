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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class gx extends ek0 {
    public boolean f3;
    public final SparseArray g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public int l3;
    public SparseArray m3;
    public final /* synthetic */ ty n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(ty tyVar, Context context) {
        super(context, null);
        this.n3 = tyVar;
        this.g3 = new SparseArray();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = -1;
        new SparseIntArray();
        nr nrVar = nr.f;
    }

    public final void A1(View view) {
        if (this.m3 != null) {
            int i7 = 0;
            while (i7 < this.m3.size()) {
                fx fxVar = (fx) this.m3.valueAt(i7);
                if (fxVar.d == view) {
                    this.m3.removeAt(i7);
                    i7--;
                    View view2 = fxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        fxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = fxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i7++;
            }
        }
    }

    public final void B1() {
        ty tyVar = this.n3;
        int i7 = tyVar.c;
        gx gxVar = tyVar.Q;
        gx gxVar2 = tyVar.Q;
        y5[] y5VarArr = new y5[gxVar.getChildCount()];
        for (int i10 = 0; i10 < gxVar2.getChildCount(); i10++) {
            View childAt = gxVar2.getChildAt(i10);
            if (childAt instanceof cy) {
                y5VarArr[i10] = ((cy) childAt).getSpan();
            }
        }
        tyVar.e2 = y5.update(i7, this, y5VarArr, (LongSparseArray<p5>) tyVar.e2);
    }

    @Override // org.telegram.ui.Components.ek0
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7;
        boolean z10;
        Canvas canvas2 = canvas;
        ty tyVar = this.n3;
        gx gxVar = tyVar.Q;
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
        boolean z11 = tyVar.w2 > 0 && SystemClock.elapsedRealtime() - tyVar.w2 < z1() && tyVar.t2 != null && tyVar.u2 >= 0;
        float f10 = 0.0f;
        if (tyVar.e2 != null && gxVar != null) {
            int i13 = 0;
            while (i13 < gxVar.getChildCount()) {
                View childAt = gxVar.getChildAt(i13);
                if (childAt instanceof cy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) p5.c.g(i12, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((cy) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == tyVar.u2 - i12) {
                    z10 = z11;
                    float interpolation = nr.g.getInterpolation(c8.l9.a((SystemClock.elapsedRealtime() - tyVar.w2) / 140.0f, f10, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i7 = i13;
                    } else {
                        float f11 = 1.0f - interpolation;
                        i7 = i13;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f11), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f12 = (f11 * 0.5f) + 0.5f;
                        canvas2.scale(f12, f12, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        tyVar.t2.draw(canvas2);
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
            ex exVar = null;
            arrayList2 = this.k3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i14);
            cy cyVar = (cy) arrayList7.get(i10);
            int i15 = cyVar.a;
            int i16 = i10;
            while (true) {
                if (i16 >= arrayList5.size()) {
                    break;
                }
                if (((ex) arrayList5.get(i16)).N == i15) {
                    exVar = (ex) arrayList5.get(i16);
                    arrayList5.remove(i16);
                    break;
                }
                i16++;
            }
            if (exVar == null) {
                exVar = !arrayList2.isEmpty() ? (ex) p5.c.g(1, arrayList2) : new ex(this);
                exVar.N = i15;
                exVar.e();
            }
            arrayList6.add(exVar);
            exVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(cyVar.getLeft(), cyVar.getY() + cyVar.getPaddingTop());
            exVar.O = cyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (cyVar.getLeft() * 2);
            int measuredHeight = cyVar.getMeasuredHeight() - cyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                exVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i14++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ex) arrayList5.get(i17));
                ((ex) arrayList5.get(i17)).P = null;
                ((ex) arrayList5.get(i17)).k();
            } else {
                ((ex) arrayList5.get(i17)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        ty tyVar = this.n3;
        gx gxVar = tyVar.Q;
        tyVar.o2.g();
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
        boolean z10 = tyVar.w2 > 0 && SystemClock.elapsedRealtime() - tyVar.w2 < z1() && tyVar.t2 != null && tyVar.u2 >= 0;
        if (tyVar.e2 != null && gxVar != null) {
            for (int i11 = 0; i11 < gxVar.getChildCount(); i11++) {
                View childAt = gxVar.getChildAt(i11);
                if (childAt instanceof cy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) p5.c.g(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((cy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == tyVar.u2 - 1) {
                    float interpolation = nr.g.getInterpolation(c8.l9.a((SystemClock.elapsedRealtime() - tyVar.w2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        tyVar.t2.draw(canvas);
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
            ex exVar = null;
            arrayList2 = this.k3;
            if (i12 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
            cy cyVar = (cy) arrayList7.get(i7);
            int i13 = cyVar.a;
            int i14 = i7;
            while (true) {
                if (i14 >= arrayList5.size()) {
                    break;
                }
                if (((ex) arrayList5.get(i14)).N == i13) {
                    exVar = (ex) arrayList5.get(i14);
                    arrayList5.remove(i14);
                    break;
                }
                i14++;
            }
            if (exVar == null) {
                exVar = !arrayList2.isEmpty() ? (ex) p5.c.g(1, arrayList2) : new ex(this);
                exVar.N = i13;
                exVar.e();
            }
            arrayList6.add(exVar);
            exVar.P = arrayList7;
            canvas2.save();
            canvas2.translate(cyVar.getLeft(), cyVar.getY() + cyVar.getPaddingTop());
            exVar.O = cyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (cyVar.getLeft() * 2);
            int measuredHeight = cyVar.getMeasuredHeight() - cyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                exVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i12++;
            canvas2 = canvas;
            i7 = 0;
        }
        for (int i15 = 0; i15 < arrayList5.size(); i15++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ex) arrayList5.get(i15));
                ((ex) arrayList5.get(i15)).P = null;
                ((ex) arrayList5.get(i15)).k();
            } else {
                ((ex) arrayList5.get(i15)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
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
                fx fxVar = (fx) this.m3.get(pointerId);
                this.m3.remove(pointerId);
                if (E != null && fxVar != null) {
                    if (Math.sqrt(Math.pow(y10 - fxVar.b, 2.0d) + Math.pow(x10 - fxVar.a, 2.0d)) < org.telegram.messenger.g0.e * 3.0f && !z12) {
                        ty tyVar = this.n3;
                        if (!tyVar.C1.isShowing() || SystemClock.elapsedRealtime() - fxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = fxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof cy) {
                                    ty.d(tyVar, (cy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof jx) {
                                    tyVar.S.E(R, (jx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (fxVar != null && (fxVar.d.getBackground() instanceof RippleDrawable)) {
                    fxVar.d.getBackground().setState(new int[0]);
                }
                if (fxVar != null) {
                    fxVar.d.setPressed(false);
                }
            } else if (E != null) {
                fx fxVar2 = new fx();
                fxVar2.a = x10;
                fxVar2.b = y10;
                fxVar2.c = SystemClock.elapsedRealtime();
                fxVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                fxVar2.d.setPressed(true);
                this.m3.put(pointerId, fxVar2);
                C0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.m3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i7) {
        if (i7 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            ty tyVar = this.n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                tyVar.N(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            ty.e(tyVar, 1, org.telegram.messenger.g0.L(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        B1();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        y5.release(this, (LongSparseArray<p5>) this.n3.e2);
        int i7 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.h3;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((ex) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.k3;
            if (i7 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((ex) arrayList2.get(i7)).f();
                i7++;
            }
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ty tyVar = this.n3;
        if (tyVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.ns.p().q(motionEvent, this, tyVar.h2, this.o2);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ty tyVar = this.n3;
        if (tyVar.e0 && tyVar.d0) {
            this.f3 = true;
            tyVar.R.h1(0, 0);
            tyVar.d0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        tyVar.l(true);
        B1();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.f3 = true;
        int size = View.MeasureSpec.getSize(i7);
        ty tyVar = this.n3;
        uw uwVar = tyVar.R;
        int i11 = uwVar.J;
        uwVar.y1(Math.max(1, size / org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 60.0f : 45.0f)));
        this.f3 = false;
        super.onMeasure(i7, i10);
        if (i11 != uwVar.J) {
            tyVar.S.F(false);
        }
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ty tyVar = this.n3;
        int[] iArr = tyVar.E1;
        ku kuVar = tyVar.C1;
        if (tyVar.S1 != null && kuVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (kuVar != null && kuVar.isShowing() && !kuVar.d) {
                    kuVar.dismiss();
                    int i7 = kuVar.c.n[0];
                    String str = (i7 < 1 || i7 > 5) ? null : (String) org.telegram.messenger.j4.a.get(i7 - 1);
                    String str2 = (String) tyVar.S1.getTag();
                    if (tyVar.S1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            ty.d(tyVar, tyVar.S1, ty.g(replace, str));
                        } else {
                            ty.d(tyVar, tyVar.S1, replace);
                        }
                    } else {
                        if (str != null) {
                            org.telegram.messenger.j6.j.put(str2, str);
                            str2 = ty.g(str2, str);
                        } else {
                            org.telegram.messenger.j6.j.remove(str2);
                        }
                        tyVar.S1.a(org.telegram.messenger.j6.f(str2), tyVar.S1.c);
                        ty.d(tyVar, tyVar.S1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        org.telegram.messenger.j6.q();
                    }
                }
                if (kuVar == null || !kuVar.d) {
                    tyVar.S1 = null;
                }
                tyVar.V1 = -10000.0f;
                tyVar.W1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = tyVar.V1;
                if (f10 != -10000.0f) {
                    if (Math.abs(f10 - motionEvent.getX()) > org.telegram.messenger.g0.a1(true, 0.2f) || Math.abs(tyVar.W1 - motionEvent.getY()) > org.telegram.messenger.g0.a1(false, 0.2f)) {
                        tyVar.V1 = -10000.0f;
                        tyVar.W1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                kuVar.c.getLocationOnScreen(iArr);
                int L = (int) (x10 - (org.telegram.messenger.g0.L(3.0f) + iArr[0]));
                boolean z10 = kuVar.d;
                ju juVar = kuVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, L / (org.telegram.messenger.g0.L(4.0f) + kuVar.e)));
                    if (juVar.n[0] != max) {
                        org.telegram.messenger.g0.a4(juVar);
                        int[] iArr2 = juVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            juVar.invalidate();
                        }
                    }
                }
            }
            if (kuVar == null || !kuVar.d || kuVar.isShowing()) {
                return true;
            }
        }
        tyVar.T1 = motionEvent.getX();
        tyVar.U1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }

    public final long z1() {
        ty tyVar = this.n3;
        return Math.max(400L, Math.min(45, tyVar.v2 - tyVar.u2) * 35) + Math.max(600L, Math.min(55, tyVar.v2 - tyVar.u2) * 40) + 150;
    }
}
