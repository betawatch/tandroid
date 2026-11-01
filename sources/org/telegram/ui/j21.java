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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class j21 extends org.telegram.ui.Components.uk0 {
    public final SparseArray e3;
    public final ArrayList f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public boolean j3;
    public final LongSparseArray k3;
    public final /* synthetic */ g31 l3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j21(g31 g31Var, Context context) {
        super(context, null);
        this.l3 = g31Var;
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
            ((i21) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.f5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.uk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f7, float f10) {
        if (view instanceof q21) {
            q21 q21Var = (q21) view;
            if (!q21Var.a) {
                Drawable drawable = q21Var.E;
                if (drawable instanceof org.telegram.ui.Components.f5) {
                }
            }
            setSelectorDrawableColor(i0.b.o(this.l3.f1, 30));
            return true;
        }
        org.telegram.ui.ActionBar.a7.m(this, 20, org.telegram.ui.ActionBar.t6.i6, this.n2);
        return true;
    }

    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        i21 i21Var;
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
        g31 g31Var = this.l3;
        int i11 = g31Var.W;
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
        boolean z11 = g31Var.Q1 > 0 && SystemClock.elapsedRealtime() - g31Var.Q1 < g31Var.g() && g31Var.N1 != null && g31Var.O1 >= 0;
        if (this.k3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof q21) {
                    q21 q21Var = (q21) childAt;
                    g31 g31Var2 = q21Var.V;
                    int i15 = g31Var2.W;
                    if (q21Var.isPressed()) {
                        float f7 = q21Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            q21Var.N = Utilities.i(f7 + 0.16f, 1.0f, 0.0f);
                            q21Var.invalidate();
                        }
                    }
                    int i16 = q21Var.c;
                    int y3 = g31Var.x1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(q21Var.getX(), q21Var.getY());
                    if (q21Var.x != null) {
                        rh.s8 collectionParticles = g31Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, q21Var.getWidth(), q21Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, q21Var.getWidth() / 2.0f, q21Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, q21Var.getWidth() / 2.0f, q21Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, q21Var.x.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = q21Var.L;
                    if ((z15 || q21Var.M || q21Var.S > 0.0f) && !q21Var.b) {
                        if (z15 || q21Var.M) {
                            float f10 = q21Var.R;
                            if (f10 < 1.0f) {
                                q21Var.R = ((1000.0f / org.telegram.messenger.i0.r) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!q21Var.L && !q21Var.M) {
                            float f11 = q21Var.R;
                            if (f11 > 0.0f) {
                                q21Var.R = f11 - ((1000.0f / org.telegram.messenger.i0.r) / 240.0f);
                                invalidate();
                            }
                        }
                        q21Var.S = Utilities.i(q21Var.L ? org.telegram.ui.Components.gr.h.getInterpolation(q21Var.R) : 1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - q21Var.R), 1.0f, 0.0f);
                        int L = org.telegram.messenger.i0.L(i15 == 6 ? 1.5f : 1.0f);
                        int L2 = org.telegram.messenger.i0.L(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = org.telegram.messenger.i0.P;
                        rectF.set(0.0f, 0.0f, q21Var.getMeasuredWidth(), q21Var.getMeasuredHeight());
                        float f12 = L;
                        rectF.inset(f12, f12);
                        if (!q21Var.a) {
                            Drawable drawable = q21Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.f5) || !((org.telegram.ui.Components.f5) drawable).c()) {
                                paint = g31Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (q21Var.getAlpha() * alpha * q21Var.S));
                                float f13 = L2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = g31Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (q21Var.getAlpha() * alpha2 * q21Var.S));
                        float f132 = L2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (q21Var.getBackground() != null) {
                        q21Var.getBackground().setBounds((int) q21Var.getX(), (int) q21Var.getY(), q21Var.getWidth() + ((int) q21Var.getX()), q21Var.getHeight() + ((int) q21Var.getY()));
                        q21Var.getBackground().setAlpha((int) (q21Var.getAlpha() * org.telegram.messenger.at.e4));
                        q21Var.getBackground().draw(canvas2);
                        q21Var.getBackground().setAlpha(org.telegram.messenger.at.e4);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) i0.a.v(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(q21Var);
                    p21 p21Var = q21Var.J;
                    if (p21Var != null && p21Var.getVisibility() == 0 && q21Var.J.getImageReceiver() == null && (imageReceiver = q21Var.r) != null) {
                        q21Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = g31Var.O1;
                    List list = g31.a2;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.gr.g.getInterpolation(w7.u.a((SystemClock.elapsedRealtime() - g31Var.Q1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            g31Var.N1.draw(canvas2);
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
            q21 q21Var2 = (q21) arrayList8.get(0);
            int R2 = RecyclerView.R(q21Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    i21Var = null;
                    break;
                } else {
                    if (((i21) arrayList6.get(i20)).M == R2) {
                        i21Var = (i21) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (i21Var == null) {
                if (arrayList2.isEmpty()) {
                    i21Var = new i21(this);
                    i21Var.l(7);
                } else {
                    i21Var = (i21) i0.a.v(1, arrayList2);
                }
                i21Var.M = R2;
                i21Var.e();
            }
            arrayList7.add(i21Var);
            i21Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(q21Var2.getLeft(), q21Var2.getY());
            i21Var.N = q21Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (q21Var2.getLeft() * 2);
            int measuredHeight = q21Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                i21Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((i21) arrayList6.get(i21));
                ((i21) arrayList6.get(i21)).O = null;
                ((i21) arrayList6.get(i21)).k();
            } else {
                ((i21) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof q21) {
                q21 q21Var3 = (q21) childAt2;
                p21 p21Var2 = q21Var3.J;
                if (p21Var2 != null && p21Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((q21Var3.getX() + q21Var3.getMeasuredWidth()) - q21Var3.J.getMeasuredWidth()), (int) ((q21Var3.getY() + q21Var3.getMeasuredHeight()) - q21Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = q21Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.f5 ? ((org.telegram.ui.Components.f5) drawable2).k : q21Var3.h;
                    p21 p21Var3 = q21Var3.J;
                    if (!p21Var3.h) {
                        p21Var3.setImageReceiver(imageReceiver2);
                    }
                    q21Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (q21Var3.K != null) {
                    canvas2.save();
                    int L3 = org.telegram.messenger.i0.L(17.0f);
                    float f16 = L3;
                    canvas2.translate((int) ((q21Var3.getX() + q21Var3.getMeasuredWidth()) - f16), (int) ((q21Var3.getY() + q21Var3.getMeasuredHeight()) - f16));
                    q21Var3.K.setBounds(0, 0, L3, L3);
                    q21Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != g31Var.N1) {
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

    @Override // org.telegram.ui.Components.uk0
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

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g31 g31Var = this.l3;
        if (this == g31Var.h0) {
            g31Var.V0.P();
        }
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g31 g31Var = this.l3;
        if (this == g31Var.h0) {
            g31Var.V0.R();
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
