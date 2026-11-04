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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class j01 extends org.telegram.ui.Components.tj0 {
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public boolean k3;
    public final LongSparseArray l3;
    public final /* synthetic */ g11 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(g11 g11Var, Context context) {
        super(context, null);
        this.m3 = g11Var;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, this.o2);
    }

    public static void z1(ArrayList arrayList) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((i01) arrayList.get(i3)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.g5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f10, float f11) {
        if (view instanceof q01) {
            q01 q01Var = (q01) view;
            if (!q01Var.a) {
                Drawable drawable = q01Var.F;
                if (drawable instanceof org.telegram.ui.Components.g5) {
                }
            }
            setSelectorDrawableColor(i0.a.o(this.m3.g1, 30));
            return true;
        }
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, this.o2);
        return true;
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        i01 i01Var;
        int i3;
        View view;
        Paint paint;
        ArrayList arrayList3;
        ImageReceiver imageReceiver;
        boolean z10;
        Canvas canvas2 = canvas;
        if (getVisibility() != 0) {
            return;
        }
        this.k3 = false;
        int saveCount = canvas2.getSaveCount();
        g11 g11Var = this.m3;
        int i10 = g11Var.a0;
        int i11 = 14;
        if (i10 != 6 && i10 != 14 && i10 != 13) {
            Rect rect = this.F1;
            if (!rect.isEmpty()) {
                this.C1.setBounds(rect);
                canvas2.save();
                q0.a aVar = this.n2;
                if (aVar != null) {
                    aVar.accept(canvas2);
                }
                this.C1.draw(canvas2);
                canvas2.restore();
            }
        }
        int i12 = 0;
        while (true) {
            sparseArray = this.f3;
            int size = sparseArray.size();
            arrayList = this.g3;
            if (i12 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i12);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i12++;
        }
        sparseArray.clear();
        boolean z11 = g11Var.R1 > 0 && SystemClock.elapsedRealtime() - g11Var.R1 < g11Var.g() && g11Var.O1 != null && g11Var.P1 >= 0;
        if (this.l3 != null) {
            int i13 = 0;
            boolean z12 = false;
            while (i13 < getChildCount()) {
                View childAt = getChildAt(i13);
                if (childAt instanceof q01) {
                    q01 q01Var = (q01) childAt;
                    g11 g11Var2 = q01Var.W;
                    int i14 = g11Var2.a0;
                    if (q01Var.isPressed()) {
                        float f10 = q01Var.O;
                        if (f10 != 1.0f && i14 != i11) {
                            q01Var.O = Utilities.i(f10 + 0.16f, 1.0f, 0.0f);
                            q01Var.invalidate();
                        }
                    }
                    int i15 = q01Var.c;
                    int y9 = g11Var.y1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y9);
                    canvas2.save();
                    canvas2.translate(q01Var.getX(), q01Var.getY());
                    if (q01Var.x != null) {
                        ci.lc collectionParticles = g11Var.getCollectionParticles();
                        i3 = i13;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, q01Var.getWidth(), q01Var.getHeight());
                        if (z13) {
                            z10 = z13;
                        } else {
                            collectionParticles.d();
                            z10 = true;
                        }
                        canvas2.save();
                        int i16 = i15 % 6;
                        boolean z14 = z10;
                        view = childAt;
                        canvas2.scale(i16 == 2 ? -1.0f : 1.0f, i16 == 2 ? -1.0f : 1.0f, q01Var.getWidth() / 2.0f, q01Var.getHeight() / 2.0f);
                        canvas2.rotate((i15 % 4) * 90, q01Var.getWidth() / 2.0f, q01Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, q01Var.x.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i3 = i13;
                        view = childAt;
                    }
                    boolean z15 = q01Var.M;
                    if ((z15 || q01Var.N || q01Var.T > 0.0f) && !q01Var.b) {
                        if (z15 || q01Var.N) {
                            float f11 = q01Var.S;
                            if (f11 < 1.0f) {
                                q01Var.S = ((1000.0f / org.telegram.messenger.g0.r) / 240.0f) + f11;
                                invalidate();
                            }
                        }
                        if (!q01Var.M && !q01Var.N) {
                            float f12 = q01Var.S;
                            if (f12 > 0.0f) {
                                q01Var.S = f12 - ((1000.0f / org.telegram.messenger.g0.r) / 240.0f);
                                invalidate();
                            }
                        }
                        q01Var.T = Utilities.i(q01Var.M ? org.telegram.ui.Components.xq.h.getInterpolation(q01Var.S) : 1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - q01Var.S), 1.0f, 0.0f);
                        int L = org.telegram.messenger.g0.L(i14 == 6 ? 1.5f : 1.0f);
                        int L2 = org.telegram.messenger.g0.L(i14 == 6 ? 6.0f : 4.0f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(0.0f, 0.0f, q01Var.getMeasuredWidth(), q01Var.getMeasuredHeight());
                        float f13 = L;
                        rectF.inset(f13, f13);
                        if (!q01Var.a) {
                            Drawable drawable = q01Var.F;
                            if (!(drawable instanceof org.telegram.ui.Components.g5) || !((org.telegram.ui.Components.g5) drawable).c()) {
                                paint = g11Var2.M;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (q01Var.getAlpha() * alpha * q01Var.T));
                                float f14 = L2;
                                canvas2.drawRoundRect(rectF, f14, f14, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = g11Var2.N;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (q01Var.getAlpha() * alpha2 * q01Var.T));
                        float f142 = L2;
                        canvas2.drawRoundRect(rectF, f142, f142, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (q01Var.getBackground() != null) {
                        q01Var.getBackground().setBounds((int) q01Var.getX(), (int) q01Var.getY(), q01Var.getWidth() + ((int) q01Var.getX()), q01Var.getHeight() + ((int) q01Var.getY()));
                        q01Var.getBackground().setAlpha((int) (q01Var.getAlpha() * org.telegram.messenger.hs.e4));
                        q01Var.getBackground().draw(canvas2);
                        q01Var.getBackground().setAlpha(org.telegram.messenger.hs.e4);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) org.telegram.ui.Cells.f1.o(1, arrayList) : new ArrayList();
                        sparseArray.put(y9, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(q01Var);
                    p01 p01Var = q01Var.K;
                    if (p01Var != null && p01Var.getVisibility() == 0 && q01Var.K.getImageReceiver() == null && (imageReceiver = q01Var.r) != null) {
                        q01Var.K.setImageReceiver(imageReceiver);
                    }
                } else {
                    i3 = i13;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null && RecyclerView.R(view) == g11Var.P1 - 1) {
                    float interpolation = org.telegram.ui.Components.xq.g.getInterpolation(b8.be.a((SystemClock.elapsedRealtime() - g11Var.R1) / 200.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f15 = 1.0f - interpolation;
                        canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f15), 31);
                        canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                        float f16 = (f15 * 0.5f) + 0.5f;
                        canvas2.scale(f16, f16, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                        g11Var.O1.draw(canvas2);
                        canvas2.restore();
                        i13 = i3 + 1;
                        z12 = z16;
                        i11 = 14;
                    }
                }
                i13 = i3 + 1;
                z12 = z16;
                i11 = 14;
            }
        }
        ArrayList arrayList6 = this.j3;
        arrayList6.clear();
        ArrayList arrayList7 = this.i3;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i17 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.h3;
            if (i17 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i17);
            q01 q01Var2 = (q01) arrayList8.get(0);
            int R = RecyclerView.R(q01Var2);
            int i18 = 0;
            while (true) {
                if (i18 >= arrayList6.size()) {
                    i01Var = null;
                    break;
                } else {
                    if (((i01) arrayList6.get(i18)).N == R) {
                        i01Var = (i01) arrayList6.get(i18);
                        arrayList6.remove(i18);
                        break;
                    }
                    i18++;
                }
            }
            if (i01Var == null) {
                if (arrayList2.isEmpty()) {
                    i01Var = new i01(this);
                    i01Var.l(7);
                } else {
                    i01Var = (i01) org.telegram.ui.Cells.f1.o(1, arrayList2);
                }
                i01Var.N = R;
                i01Var.e();
            }
            arrayList7.add(i01Var);
            i01Var.P = arrayList8;
            canvas2.save();
            canvas2.translate(q01Var2.getLeft(), q01Var2.getY());
            i01Var.O = q01Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (q01Var2.getLeft() * 2);
            int measuredHeight = q01Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                i01Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i17++;
        }
        for (int i19 = 0; i19 < arrayList6.size(); i19++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((i01) arrayList6.get(i19));
                ((i01) arrayList6.get(i19)).P = null;
                ((i01) arrayList6.get(i19)).k();
            } else {
                ((i01) arrayList6.get(i19)).f();
            }
        }
        arrayList6.clear();
        for (int i20 = 0; i20 < getChildCount(); i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof q01) {
                q01 q01Var3 = (q01) childAt2;
                p01 p01Var2 = q01Var3.K;
                if (p01Var2 != null && p01Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((q01Var3.getX() + q01Var3.getMeasuredWidth()) - q01Var3.K.getMeasuredWidth()), (int) ((q01Var3.getY() + q01Var3.getMeasuredHeight()) - q01Var3.K.getMeasuredHeight()));
                    Drawable drawable2 = q01Var3.F;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.g5 ? ((org.telegram.ui.Components.g5) drawable2).k : q01Var3.h;
                    p01 p01Var3 = q01Var3.K;
                    if (!p01Var3.h) {
                        p01Var3.setImageReceiver(imageReceiver2);
                    }
                    q01Var3.K.draw(canvas2);
                    canvas2.restore();
                }
                if (q01Var3.L != null) {
                    canvas2.save();
                    int L3 = org.telegram.messenger.g0.L(17.0f);
                    float f17 = L3;
                    canvas2.translate((int) ((q01Var3.getX() + q01Var3.getMeasuredWidth()) - f17), (int) ((q01Var3.getY() + q01Var3.getMeasuredHeight()) - f17));
                    q01Var3.L.setBounds(0, 0, L3, L3);
                    q01Var3.L.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != g11Var.O1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = dh.d0.c;
        if (runnable != null) {
            runnable.run();
            dh.d0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final void g1() {
        if (dh.d0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (dh.d0.b(this) || this.k3) {
            return;
        }
        this.k3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g11 g11Var = this.m3;
        if (this == g11Var.i0) {
            g11Var.W0.P();
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g11 g11Var = this.m3;
        if (this == g11Var.i0) {
            g11Var.W0.R();
        }
        z1(this.h3);
        z1(this.i3);
        z1(this.j3);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        if (dh.d0.b(this)) {
            return;
        }
        super.invalidate(i3, i10, i11, i12);
    }
}
