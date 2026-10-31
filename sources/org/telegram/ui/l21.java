package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class l21 extends org.telegram.ui.Components.tk0 {
    public final SparseArray e3;
    public final ArrayList f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public boolean j3;
    public final LongSparseArray k3;
    public final /* synthetic */ i31 l3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(i31 i31Var, Context context) {
        super(context, null);
        this.l3 = i31Var;
        this.e3 = new SparseArray();
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.k3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.i0.L(4.0f));
        org.telegram.ui.ActionBar.a7.m(this, 20, org.telegram.ui.ActionBar.t6.i6, this.n2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((k21) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.f5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f7, float f10) {
        if (view instanceof s21) {
            s21 s21Var = (s21) view;
            if (!s21Var.a) {
                Drawable drawable = s21Var.E;
                if (drawable instanceof org.telegram.ui.Components.f5) {
                }
            }
            setSelectorDrawableColor(i0.b.o(this.l3.f1, 30));
            return true;
        }
        org.telegram.ui.ActionBar.a7.m(this, 20, org.telegram.ui.ActionBar.t6.i6, this.n2);
        return true;
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        k21 k21Var;
        int i10;
        View view;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver;
        boolean z10;
        Canvas canvas2 = canvas;
        if (getVisibility() != 0) {
            return;
        }
        this.j3 = false;
        int saveCount = canvas2.getSaveCount();
        i31 i31Var = this.l3;
        int i11 = i31Var.W;
        int i12 = 14;
        if (i11 != 6 && i11 != 14 && i11 != 13) {
            Rect rect = this.E1;
            if (!rect.isEmpty()) {
                this.B1.setBounds(rect);
                canvas2.save();
                q0.a aVar = this.m2;
                if (aVar != null) {
                    aVar.accept(canvas2);
                }
                this.B1.draw(canvas2);
                canvas2.restore();
            }
        }
        int i13 = 0;
        while (true) {
            sparseArray = this.e3;
            int size = sparseArray.size();
            arrayList = this.f3;
            if (i13 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i13++;
        }
        sparseArray.clear();
        boolean z11 = i31Var.Q1 > 0 && SystemClock.elapsedRealtime() - i31Var.Q1 < i31Var.g() && i31Var.N1 != null && i31Var.O1 >= 0;
        if (this.k3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof s21) {
                    s21 s21Var = (s21) childAt;
                    i31 i31Var2 = s21Var.V;
                    int i15 = i31Var2.W;
                    if (s21Var.isPressed()) {
                        float f7 = s21Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            s21Var.N = Utilities.i(f7 + 0.16f, 1.0f, 0.0f);
                            s21Var.invalidate();
                        }
                    }
                    int i16 = s21Var.c;
                    int y3 = i31Var.x1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(s21Var.getX(), s21Var.getY());
                    if (s21Var.x != null) {
                        rh.s8 collectionParticles = i31Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, s21Var.getWidth(), s21Var.getHeight());
                        if (z13) {
                            z10 = z13;
                        } else {
                            collectionParticles.d();
                            z10 = true;
                        }
                        canvas2.save();
                        int i17 = i16 % 6;
                        boolean z14 = z10;
                        view = childAt;
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, s21Var.getWidth() / 2.0f, s21Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, s21Var.getWidth() / 2.0f, s21Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, s21Var.x.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = s21Var.L;
                    if ((z15 || s21Var.M || s21Var.S > 0.0f) && !s21Var.b) {
                        if (z15 || s21Var.M) {
                            float f10 = s21Var.R;
                            if (f10 < 1.0f) {
                                s21Var.R = ((1000.0f / org.telegram.messenger.i0.r) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!s21Var.L && !s21Var.M) {
                            float f11 = s21Var.R;
                            if (f11 > 0.0f) {
                                s21Var.R = f11 - ((1000.0f / org.telegram.messenger.i0.r) / 240.0f);
                                invalidate();
                            }
                        }
                        s21Var.S = Utilities.i(s21Var.L ? org.telegram.ui.Components.gr.h.getInterpolation(s21Var.R) : 1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - s21Var.R), 1.0f, 0.0f);
                        int L = org.telegram.messenger.i0.L(i15 == 6 ? 1.5f : 1.0f);
                        int L2 = org.telegram.messenger.i0.L(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = org.telegram.messenger.i0.P;
                        rectF.set(0.0f, 0.0f, s21Var.getMeasuredWidth(), s21Var.getMeasuredHeight());
                        float f12 = L;
                        rectF.inset(f12, f12);
                        if (!s21Var.a) {
                            Drawable drawable = s21Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.f5) || !((org.telegram.ui.Components.f5) drawable).c()) {
                                paint = i31Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (s21Var.getAlpha() * alpha * s21Var.S));
                                float f13 = L2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = i31Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (s21Var.getAlpha() * alpha2 * s21Var.S));
                        float f132 = L2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (s21Var.getBackground() != null) {
                        s21Var.getBackground().setBounds((int) s21Var.getX(), (int) s21Var.getY(), s21Var.getWidth() + ((int) s21Var.getX()), s21Var.getHeight() + ((int) s21Var.getY()));
                        s21Var.getBackground().setAlpha((int) (s21Var.getAlpha() * org.telegram.messenger.zs.e4));
                        s21Var.getBackground().draw(canvas2);
                        s21Var.getBackground().setAlpha(org.telegram.messenger.zs.e4);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) i0.a.v(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(s21Var);
                    r21 r21Var = s21Var.J;
                    if (r21Var != null && r21Var.getVisibility() == 0 && s21Var.J.getImageReceiver() == null && (imageReceiver = s21Var.r) != null) {
                        s21Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = i31Var.O1;
                    List list = i31.a2;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.gr.g.getInterpolation(w7.u.a((SystemClock.elapsedRealtime() - i31Var.Q1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            i31Var.N1.draw(canvas2);
                            canvas2.restore();
                            i14 = i10 + 1;
                            z12 = z16;
                            i12 = 14;
                        }
                    }
                }
                i14 = i10 + 1;
                z12 = z16;
                i12 = 14;
            }
        }
        ArrayList arrayList6 = this.i3;
        arrayList6.clear();
        ArrayList arrayList7 = this.h3;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i19 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.g3;
            if (i19 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
            s21 s21Var2 = (s21) arrayList8.get(0);
            int R2 = RecyclerView.R(s21Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    k21Var = null;
                    break;
                } else {
                    if (((k21) arrayList6.get(i20)).M == R2) {
                        k21Var = (k21) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (k21Var == null) {
                if (arrayList2.isEmpty()) {
                    k21Var = new k21(this);
                    k21Var.l(7);
                } else {
                    k21Var = (k21) i0.a.v(1, arrayList2);
                }
                k21Var.M = R2;
                k21Var.e();
            }
            arrayList7.add(k21Var);
            k21Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(s21Var2.getLeft(), s21Var2.getY());
            k21Var.N = s21Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (s21Var2.getLeft() * 2);
            int measuredHeight = s21Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                k21Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((k21) arrayList6.get(i21));
                ((k21) arrayList6.get(i21)).O = null;
                ((k21) arrayList6.get(i21)).k();
            } else {
                ((k21) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof s21) {
                s21 s21Var3 = (s21) childAt2;
                r21 r21Var2 = s21Var3.J;
                if (r21Var2 != null && r21Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((s21Var3.getX() + s21Var3.getMeasuredWidth()) - s21Var3.J.getMeasuredWidth()), (int) ((s21Var3.getY() + s21Var3.getMeasuredHeight()) - s21Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = s21Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.f5 ? ((org.telegram.ui.Components.f5) drawable2).k : s21Var3.h;
                    r21 r21Var3 = s21Var3.J;
                    if (!r21Var3.h) {
                        r21Var3.setImageReceiver(imageReceiver2);
                    }
                    s21Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (s21Var3.K != null) {
                    canvas2.save();
                    int L3 = org.telegram.messenger.i0.L(17.0f);
                    float f16 = L3;
                    canvas2.translate((int) ((s21Var3.getX() + s21Var3.getMeasuredWidth()) - f16), (int) ((s21Var3.getY() + s21Var3.getMeasuredHeight()) - f16));
                    s21Var3.K.setBounds(0, 0, L3, L3);
                    s21Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != i31Var.N1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = sg.e0.c;
        if (runnable != null) {
            runnable.run();
            sg.e0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final void g1() {
        if (sg.e0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (sg.e0.b(this) || this.j3) {
            return;
        }
        this.j3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i31 i31Var = this.l3;
        if (this == i31Var.h0) {
            i31Var.V0.P();
        }
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i31 i31Var = this.l3;
        if (this == i31Var.h0) {
            i31Var.V0.R();
        }
        z1(this.g3);
        z1(this.h3);
        z1(this.i3);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (sg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
