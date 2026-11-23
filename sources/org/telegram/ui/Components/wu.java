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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class wu extends FrameLayout {
    public final /* synthetic */ ev E;
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final d6 s;
    public ImageReceiver w;
    public boolean x;
    public final d6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(ev evVar, Context context) {
        super(context);
        this.E = evVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        nr nrVar = nr.h;
        this.s = new d6(this, 0L, 350L, nrVar);
        this.y = new d6(this, 0L, 320L, nrVar);
    }

    public final void a() {
        y5[] y5VarArr;
        ev evVar = this.E;
        hi.x xVar = evVar.r1;
        if (xVar == null) {
            y5VarArr = new y5[0];
        } else {
            y5[] y5VarArr2 = new y5[xVar.getChildCount()];
            for (int i7 = 0; i7 < xVar.getChildCount(); i7++) {
                View childAt = xVar.getChildAt(i7);
                if (childAt instanceof xu) {
                    y5VarArr2[i7] = ((xu) childAt).c;
                }
            }
            y5VarArr = y5VarArr2;
        }
        evVar.m1 = y5.update(3, this, y5VarArr, (LongSparseArray<p5>) evVar.m1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        vu vuVar;
        float f12;
        float f13;
        y5 y5Var;
        Canvas canvas2 = canvas;
        ev evVar = this.E;
        up upVar = evVar.A1;
        hi.x xVar = evVar.r1;
        if (this.d) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, evVar.J0);
            Paint paint = this.a;
            paint.setColor(w02);
            org.telegram.ui.ActionBar.m6.n(paint);
            Path path = this.b;
            path.reset();
            float J0 = evVar.J0();
            float d = this.s.d(J0 <= ((float) evVar.b.getPaddingTop()));
            float T1 = org.telegram.messenger.g0.T1(J0, 0.0f, d);
            if (this.w != null) {
                float L = org.telegram.messenger.g0.L(140.0f);
                f10 = 20.0f;
                float L2 = org.telegram.messenger.g0.L(20.0f);
                if (T1 < L + L2) {
                    this.x = false;
                }
                f11 = 2.0f;
                this.w.setAlpha(this.y.d(this.x));
                if (this.w.getAlpha() > 0.0f) {
                    float alpha = ((this.w.getAlpha() * 0.4f) + 0.6f) * L;
                    float f14 = alpha / 2.0f;
                    this.w.y0((getWidth() / 2.0f) - f14, ((T1 - L2) - (L / 2.0f)) - f14, alpha, alpha);
                    this.w.h(canvas2, null);
                } else {
                    this.w.R();
                    this.w = null;
                }
            } else {
                f10 = 20.0f;
                f11 = 2.0f;
            }
            float f15 = 1.0f;
            float L3 = org.telegram.messenger.g0.L((1.0f - d) * 14.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getPaddingLeft(), T1, getWidth() - getPaddingRight(), getBottom() + L3);
            path.addRoundRect(rectF, L3, L3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = d > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                evVar.P0(z10);
            }
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, evVar.J0));
            org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (c8.l9.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.m6.t0.getAlpha()));
            int L4 = org.telegram.messenger.g0.L(36.0f);
            float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.m6.t0);
            evVar.t1.setVisibility((xVar.canScrollVertically(1) || evVar.w1.getVisibility() == 0) ? 0 : 4);
            if (xVar != null) {
                canvas2.save();
                canvas2.translate(xVar.getLeft(), xVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, xVar.getWidth(), xVar.getHeight());
                float f16 = 255.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, xVar.getWidth(), xVar.getHeight(), (int) (xVar.getAlpha() * 255.0f), 31);
                int i7 = 0;
                while (true) {
                    sparseArray = this.e;
                    int size = sparseArray.size();
                    arrayList = this.n;
                    if (i7 >= size) {
                        break;
                    }
                    ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i7);
                    arrayList3.clear();
                    arrayList.add(arrayList3);
                    i7++;
                }
                sparseArray.clear();
                int i10 = 0;
                while (i10 < xVar.getChildCount()) {
                    View childAt = xVar.getChildAt(i10);
                    if (childAt instanceof xu) {
                        xu xuVar = (xu) childAt;
                        if (xuVar.isPressed()) {
                            float f17 = xuVar.e;
                            if (f17 != f15) {
                                xuVar.e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                                xuVar.invalidate();
                            }
                        }
                        if (evVar.m1 == null || (y5Var = xuVar.c) == null) {
                            f12 = f15;
                        } else {
                            f12 = f15;
                            p5 p5Var = (p5) evVar.m1.get(y5Var.getDocumentId());
                            if (p5Var != null) {
                                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, evVar.J0);
                                if (w03 != evVar.P1 || evVar.O1 == null) {
                                    evVar.P1 = w03;
                                    f13 = f16;
                                    evVar.O1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                                } else {
                                    f13 = f16;
                                }
                                p5Var.setColorFilter(evVar.O1);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) p5.c.g(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(xuVar);
                            }
                        }
                        f13 = f16;
                    } else {
                        f12 = f15;
                        f13 = f16;
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i10++;
                    f15 = f12;
                    f16 = f13;
                }
                float f18 = f15;
                float f19 = f16;
                ArrayList arrayList5 = this.h;
                arrayList5.clear();
                ArrayList arrayList6 = this.f;
                arrayList5.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                int i11 = 0;
                while (true) {
                    int size2 = sparseArray.size();
                    arrayList2 = this.r;
                    if (i11 >= size2) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i11);
                    View view = (View) arrayList7.get(0);
                    xVar.getClass();
                    int R = RecyclerView.R(view);
                    long j3 = currentTimeMillis;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList5.size()) {
                            vuVar = null;
                            break;
                        } else {
                            if (((vu) arrayList5.get(i12)).N == R) {
                                vuVar = (vu) arrayList5.get(i12);
                                arrayList5.remove(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                    if (vuVar == null) {
                        if (arrayList2.isEmpty()) {
                            vuVar = new vu(this);
                            vuVar.l(7);
                        } else {
                            vuVar = (vu) p5.c.g(1, arrayList2);
                        }
                        vuVar.N = R;
                        vuVar.e();
                    }
                    arrayList6.add(vuVar);
                    vuVar.O = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    vu vuVar2 = vuVar;
                    currentTimeMillis = j3;
                    vuVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i11++;
                }
                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((vu) arrayList5.get(i13));
                        ((vu) arrayList5.get(i13)).O = null;
                        ((vu) arrayList5.get(i13)).k();
                    } else {
                        ((vu) arrayList5.get(i13)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (xVar.getAlpha() < f18) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) L5)) / 2;
                    int L6 = org.telegram.messenger.g0.L(16.0f);
                    upVar.setAlpha((int) ((f18 - xVar.getAlpha()) * f19));
                    upVar.setBounds(width - L6, height - L6, width + L6, height + L6);
                    upVar.draw(canvas2);
                    invalidate();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ev evVar = this.E;
            if (y10 < evVar.J0() - org.telegram.messenger.g0.L(6.0f)) {
                evVar.dismiss();
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
        int i7 = 0;
        this.d = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((vu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((vu) arrayList2.get(i7)).f();
            i7++;
        }
        arrayList.clear();
        y5.release(this, (LongSparseArray<p5>) this.E.m1);
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
