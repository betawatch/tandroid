package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class uu extends FrameLayout {
    public final /* synthetic */ cv D;
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final t5 s;
    public ImageReceiver w;
    public boolean x;
    public final t5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(cv cvVar, Context context) {
        super(context);
        this.D = cvVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        gr grVar = gr.h;
        this.s = new t5(this, 0L, 350L, grVar);
        this.y = new t5(this, 0L, 320L, grVar);
    }

    public final void a() {
        o5[] o5VarArr;
        cv cvVar = this.D;
        org.telegram.ui.g3 g3Var = cvVar.n1;
        if (g3Var == null) {
            o5VarArr = new o5[0];
        } else {
            o5[] o5VarArr2 = new o5[g3Var.getChildCount()];
            for (int i10 = 0; i10 < g3Var.getChildCount(); i10++) {
                View childAt = g3Var.getChildAt(i10);
                if (childAt instanceof vu) {
                    o5VarArr2[i10] = ((vu) childAt).c;
                }
            }
            o5VarArr = o5VarArr2;
        }
        cvVar.i1 = o5.update(3, this, o5VarArr, (LongSparseArray<f5>) cvVar.i1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        tu tuVar;
        float f11;
        float f12;
        o5 o5Var;
        Canvas canvas2 = canvas;
        cv cvVar = this.D;
        kp kpVar = cvVar.w1;
        org.telegram.ui.g3 g3Var = cvVar.n1;
        if (this.d) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, cvVar.I0);
            Paint paint = this.a;
            paint.setColor(w02);
            org.telegram.ui.ActionBar.t6.n(paint);
            Path path = this.b;
            path.reset();
            float I0 = cvVar.I0();
            float d = this.s.d(I0 <= ((float) cvVar.b.getPaddingTop()));
            float T1 = org.telegram.messenger.i0.T1(I0, 0.0f, d);
            if (this.w != null) {
                float L = org.telegram.messenger.i0.L(140.0f);
                f7 = 20.0f;
                float L2 = org.telegram.messenger.i0.L(20.0f);
                if (T1 < L + L2) {
                    this.x = false;
                }
                f10 = 2.0f;
                this.w.setAlpha(this.y.d(this.x));
                if (this.w.getAlpha() > 0.0f) {
                    float alpha = ((this.w.getAlpha() * 0.4f) + 0.6f) * L;
                    float f13 = alpha / 2.0f;
                    this.w.y0((getWidth() / 2.0f) - f13, ((T1 - L2) - (L / 2.0f)) - f13, alpha, alpha);
                    this.w.h(canvas2, null);
                } else {
                    this.w.R();
                    this.w = null;
                }
            } else {
                f7 = 20.0f;
                f10 = 2.0f;
            }
            float f14 = 1.0f;
            float L3 = org.telegram.messenger.i0.L((1.0f - d) * 14.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(getPaddingLeft(), T1, getWidth() - getPaddingRight(), getBottom() + L3);
            path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = d > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                cvVar.O0(z10);
            }
            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, cvVar.I0));
            org.telegram.ui.ActionBar.t6.t0.setAlpha((int) (w7.u.a(T1 / org.telegram.messenger.i0.L(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.t6.t0.getAlpha()));
            int L4 = org.telegram.messenger.i0.L(36.0f);
            float L5 = T1 + org.telegram.messenger.i0.L(10.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.i0.L(4.0f) + L5);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), org.telegram.ui.ActionBar.t6.t0);
            cvVar.p1.setVisibility((g3Var.canScrollVertically(1) || cvVar.s1.getVisibility() == 0) ? 0 : 4);
            if (g3Var != null) {
                canvas2.save();
                canvas2.translate(g3Var.getLeft(), g3Var.getY() + 0.0f);
                canvas2.clipRect(0, 0, g3Var.getWidth(), g3Var.getHeight());
                float f15 = 255.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, g3Var.getWidth(), g3Var.getHeight(), (int) (g3Var.getAlpha() * 255.0f), 31);
                int i10 = 0;
                while (true) {
                    sparseArray = this.e;
                    int size = sparseArray.size();
                    arrayList = this.n;
                    if (i10 >= size) {
                        break;
                    }
                    ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
                    arrayList3.clear();
                    arrayList.add(arrayList3);
                    i10++;
                }
                sparseArray.clear();
                int i11 = 0;
                while (i11 < g3Var.getChildCount()) {
                    View childAt = g3Var.getChildAt(i11);
                    if (childAt instanceof vu) {
                        vu vuVar = (vu) childAt;
                        if (vuVar.isPressed()) {
                            float f16 = vuVar.e;
                            if (f16 != f14) {
                                vuVar.e = Utilities.i(f16 + 0.16f, f14, 0.0f);
                                vuVar.invalidate();
                            }
                        }
                        if (cvVar.i1 == null || (o5Var = vuVar.c) == null) {
                            f11 = f14;
                        } else {
                            f11 = f14;
                            f5 f5Var = (f5) cvVar.i1.get(o5Var.getDocumentId());
                            if (f5Var != null) {
                                int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, cvVar.I0);
                                if (w03 != cvVar.L1 || cvVar.K1 == null) {
                                    cvVar.L1 = w03;
                                    f12 = f15;
                                    cvVar.K1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                                } else {
                                    f12 = f15;
                                }
                                f5Var.setColorFilter(cvVar.K1);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) i0.a.v(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(vuVar);
                            }
                        }
                        f12 = f15;
                    } else {
                        f11 = f14;
                        f12 = f15;
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i11++;
                    f14 = f11;
                    f15 = f12;
                }
                float f17 = f14;
                float f18 = f15;
                ArrayList arrayList5 = this.h;
                arrayList5.clear();
                ArrayList arrayList6 = this.f;
                arrayList5.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                int i12 = 0;
                while (true) {
                    int size2 = sparseArray.size();
                    arrayList2 = this.r;
                    if (i12 >= size2) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
                    View view = (View) arrayList7.get(0);
                    g3Var.getClass();
                    int R = RecyclerView.R(view);
                    long j10 = currentTimeMillis;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList5.size()) {
                            tuVar = null;
                            break;
                        } else {
                            if (((tu) arrayList5.get(i13)).M == R) {
                                tuVar = (tu) arrayList5.get(i13);
                                arrayList5.remove(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (tuVar == null) {
                        if (arrayList2.isEmpty()) {
                            tuVar = new tu(this);
                            tuVar.l(7);
                        } else {
                            tuVar = (tu) i0.a.v(1, arrayList2);
                        }
                        tuVar.M = R;
                        tuVar.e();
                    }
                    arrayList6.add(tuVar);
                    tuVar.N = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    tu tuVar2 = tuVar;
                    currentTimeMillis = j10;
                    tuVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i12++;
                }
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((tu) arrayList5.get(i14));
                        ((tu) arrayList5.get(i14)).N = null;
                        ((tu) arrayList5.get(i14)).k();
                    } else {
                        ((tu) arrayList5.get(i14)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (g3Var.getAlpha() < f17) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) L5)) / 2;
                    int L6 = org.telegram.messenger.i0.L(16.0f);
                    kpVar.setAlpha((int) ((f17 - g3Var.getAlpha()) * f18));
                    kpVar.setBounds(width - L6, height - L6, width + L6, height + L6);
                    kpVar.draw(canvas2);
                    invalidate();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            cv cvVar = this.D;
            if (y3 < cvVar.I0() - org.telegram.messenger.i0.L(6.0f)) {
                cvVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        int i10 = 0;
        this.d = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((tu) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((tu) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        o5.release(this, (LongSparseArray<f5>) this.D.i1);
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
