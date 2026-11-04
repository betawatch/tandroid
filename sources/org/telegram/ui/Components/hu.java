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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hu extends FrameLayout {
    public final /* synthetic */ pu E;
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final u5 s;
    public ImageReceiver w;
    public boolean x;
    public final u5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(pu puVar, Context context) {
        super(context);
        this.E = puVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        xq xqVar = xq.h;
        this.s = new u5(this, 0L, 350L, xqVar);
        this.y = new u5(this, 0L, 320L, xqVar);
    }

    public final void a() {
        p5[] p5VarArr;
        pu puVar = this.E;
        gi.v vVar = puVar.o1;
        if (vVar == null) {
            p5VarArr = new p5[0];
        } else {
            p5[] p5VarArr2 = new p5[vVar.getChildCount()];
            for (int i3 = 0; i3 < vVar.getChildCount(); i3++) {
                View childAt = vVar.getChildAt(i3);
                if (childAt instanceof iu) {
                    p5VarArr2[i3] = ((iu) childAt).c;
                }
            }
            p5VarArr = p5VarArr2;
        }
        puVar.j1 = p5.update(3, this, p5VarArr, (LongSparseArray<g5>) puVar.j1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        gu guVar;
        float f12;
        float f13;
        p5 p5Var;
        Canvas canvas2 = canvas;
        pu puVar = this.E;
        cp cpVar = puVar.x1;
        gi.v vVar = puVar.o1;
        if (this.d) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, puVar.J0);
            Paint paint = this.a;
            paint.setColor(w02);
            org.telegram.ui.ActionBar.k6.n(paint);
            Path path = this.b;
            path.reset();
            float I0 = puVar.I0();
            float d = this.s.d(I0 <= ((float) puVar.b.getPaddingTop()));
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
            boolean z10 = d > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                puVar.O0(z10);
            }
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, puVar.J0));
            org.telegram.ui.ActionBar.k6.t0.setAlpha((int) (b8.be.a(T1 / org.telegram.messenger.g0.L(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.k6.t0.getAlpha()));
            int L4 = org.telegram.messenger.g0.L(36.0f);
            float L5 = T1 + org.telegram.messenger.g0.L(10.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, L5, (getMeasuredWidth() + L4) / 2, org.telegram.messenger.g0.L(4.0f) + L5);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), org.telegram.ui.ActionBar.k6.t0);
            puVar.q1.setVisibility((vVar.canScrollVertically(1) || puVar.t1.getVisibility() == 0) ? 0 : 4);
            if (vVar != null) {
                canvas2.save();
                canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
                float f16 = 255.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, vVar.getWidth(), vVar.getHeight(), (int) (vVar.getAlpha() * 255.0f), 31);
                int i3 = 0;
                while (true) {
                    sparseArray = this.e;
                    int size = sparseArray.size();
                    arrayList = this.n;
                    if (i3 >= size) {
                        break;
                    }
                    ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i3);
                    arrayList3.clear();
                    arrayList.add(arrayList3);
                    i3++;
                }
                sparseArray.clear();
                int i10 = 0;
                while (i10 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i10);
                    if (childAt instanceof iu) {
                        iu iuVar = (iu) childAt;
                        if (iuVar.isPressed()) {
                            float f17 = iuVar.e;
                            if (f17 != f15) {
                                iuVar.e = Utilities.i(f17 + 0.16f, f15, 0.0f);
                                iuVar.invalidate();
                            }
                        }
                        if (puVar.j1 == null || (p5Var = iuVar.c) == null) {
                            f12 = f15;
                        } else {
                            f12 = f15;
                            g5 g5Var = (g5) puVar.j1.get(p5Var.getDocumentId());
                            if (g5Var != null) {
                                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, puVar.J0);
                                if (w03 != puVar.M1 || puVar.L1 == null) {
                                    puVar.M1 = w03;
                                    f13 = f16;
                                    puVar.L1 = new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN);
                                } else {
                                    f13 = f16;
                                }
                                g5Var.setColorFilter(puVar.L1);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.o(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(iuVar);
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
                    long j10 = currentTimeMillis;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList5.size()) {
                            guVar = null;
                            break;
                        } else {
                            if (((gu) arrayList5.get(i12)).N == R) {
                                guVar = (gu) arrayList5.get(i12);
                                arrayList5.remove(i12);
                                break;
                            }
                            i12++;
                        }
                    }
                    if (guVar == null) {
                        if (arrayList2.isEmpty()) {
                            guVar = new gu(this);
                            guVar.l(7);
                        } else {
                            guVar = (gu) org.telegram.ui.Cells.f1.o(1, arrayList2);
                        }
                        guVar.N = R;
                        guVar.e();
                    }
                    arrayList6.add(guVar);
                    guVar.O = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    gu guVar2 = guVar;
                    currentTimeMillis = j10;
                    guVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i11++;
                }
                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((gu) arrayList5.get(i13));
                        ((gu) arrayList5.get(i13)).O = null;
                        ((gu) arrayList5.get(i13)).k();
                    } else {
                        ((gu) arrayList5.get(i13)).f();
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
            float y9 = motionEvent.getY();
            pu puVar = this.E;
            if (y9 < puVar.I0() - org.telegram.messenger.g0.L(6.0f)) {
                puVar.dismiss();
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
        int i3 = 0;
        this.d = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((gu) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i3 >= arrayList2.size()) {
                break;
            }
            ((gu) arrayList2.get(i3)).f();
            i3++;
        }
        arrayList.clear();
        p5.release(this, (LongSparseArray<g5>) this.E.j1);
        ImageReceiver imageReceiver = this.w;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }
}
