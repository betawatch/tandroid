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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class iu extends FrameLayout {
    public final /* synthetic */ qu D;
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final v5 s;
    public ImageReceiver w;
    public boolean x;
    public final v5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu(qu quVar, Context context) {
        super(context);
        this.D = quVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        wq wqVar = wq.h;
        this.s = new v5(this, 0L, 350L, wqVar);
        this.y = new v5(this, 0L, 320L, wqVar);
    }

    public final void a() {
        q5[] q5VarArr;
        qu quVar = this.D;
        fi.v vVar = quVar.q1;
        if (vVar == null) {
            q5VarArr = new q5[0];
        } else {
            q5[] q5VarArr2 = new q5[vVar.getChildCount()];
            for (int i7 = 0; i7 < vVar.getChildCount(); i7++) {
                View childAt = vVar.getChildAt(i7);
                if (childAt instanceof ju) {
                    q5VarArr2[i7] = ((ju) childAt).c;
                }
            }
            q5VarArr = q5VarArr2;
        }
        quVar.l1 = q5.update(3, this, q5VarArr, (LongSparseArray<h5>) quVar.l1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        hu huVar;
        float f12;
        float f13;
        q5 q5Var;
        Canvas canvas2 = canvas;
        qu quVar = this.D;
        cp cpVar = quVar.z1;
        fi.v vVar = quVar.q1;
        if (this.d) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, quVar.I0);
            Paint paint = this.a;
            paint.setColor(w02);
            org.telegram.ui.ActionBar.m6.n(paint);
            Path path = this.b;
            path.reset();
            float I0 = quVar.I0();
            float d = this.s.d(I0 <= ((float) quVar.b.getPaddingTop()));
            float T1 = org.telegram.messenger.g0.T1(I0, 0.0f, d);
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
            boolean z9 = d > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z9 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z9);
                quVar.O0(z9);
            }
            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, quVar.I0));
            org.telegram.ui.ActionBar.m6.t0.setAlpha((int) (c8.j9.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.m6.t0.getAlpha()));
            int L4 = org.telegram.messenger.g0.L(36.0f);
            float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.m6.t0);
            quVar.s1.setVisibility((vVar.canScrollVertically(1) || quVar.v1.getVisibility() == 0) ? 0 : 4);
            if (vVar != null) {
                canvas2.save();
                canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
                float f16 = 255.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, vVar.getWidth(), vVar.getHeight(), (int) (vVar.getAlpha() * 255.0f), 31);
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
                while (i10 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i10);
                    if (childAt instanceof ju) {
                        ju juVar = (ju) childAt;
                        if (juVar.isPressed()) {
                            float f17 = juVar.e;
                            if (f17 != f15) {
                                juVar.e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                                juVar.invalidate();
                            }
                        }
                        if (quVar.l1 == null || (q5Var = juVar.c) == null) {
                            f12 = f15;
                        } else {
                            f12 = f15;
                            h5 h5Var = (h5) quVar.l1.get(q5Var.getDocumentId());
                            if (h5Var != null) {
                                int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, quVar.I0);
                                if (w03 != quVar.O1 || quVar.N1 == null) {
                                    quVar.O1 = w03;
                                    f13 = f16;
                                    quVar.N1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                                } else {
                                    f13 = f16;
                                }
                                h5Var.setColorFilter(quVar.N1);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(juVar);
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
                    vVar.getClass();
                    int R = RecyclerView.R(view);
                    long j3 = currentTimeMillis;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList5.size()) {
                            huVar = null;
                            break;
                        } else {
                            if (((hu) arrayList5.get(i12)).M == R) {
                                huVar = (hu) arrayList5.get(i12);
                                arrayList5.remove(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                    if (huVar == null) {
                        if (arrayList2.isEmpty()) {
                            huVar = new hu(this);
                            huVar.l(7);
                        } else {
                            huVar = (hu) org.telegram.ui.Cells.f1.k(1, arrayList2);
                        }
                        huVar.M = R;
                        huVar.e();
                    }
                    arrayList6.add(huVar);
                    huVar.N = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    hu huVar2 = huVar;
                    currentTimeMillis = j3;
                    huVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i11++;
                }
                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((hu) arrayList5.get(i13));
                        ((hu) arrayList5.get(i13)).N = null;
                        ((hu) arrayList5.get(i13)).k();
                    } else {
                        ((hu) arrayList5.get(i13)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (vVar.getAlpha() < f18) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) L5)) / 2;
                    int L6 = org.telegram.messenger.g0.L(16.0f);
                    cpVar.setAlpha((int) ((f18 - vVar.getAlpha()) * f19));
                    cpVar.setBounds(width - L6, height - L6, width + L6, height + L6);
                    cpVar.draw(canvas2);
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
            qu quVar = this.D;
            if (y10 < quVar.I0() - org.telegram.messenger.g0.L(6.0f)) {
                quVar.dismiss();
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
            ((hu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((hu) arrayList2.get(i7)).f();
            i7++;
        }
        arrayList.clear();
        q5.release(this, (LongSparseArray<h5>) this.D.l1);
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
