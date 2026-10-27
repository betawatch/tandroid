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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class h51 extends org.telegram.ui.Components.nm0 {
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public boolean k3;
    public final LongSparseArray l3;
    public final /* synthetic */ f61 m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h51(f61 f61Var, Context context) {
        super(context, null);
        this.m3 = f61Var;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.l3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.i6, this.n2);
    }

    public static void C1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((g51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.t5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.nm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f7, float f10) {
        if (view instanceof o51) {
            o51 o51Var = (o51) view;
            if (!o51Var.a) {
                Drawable drawable = o51Var.E;
                if (drawable instanceof org.telegram.ui.Components.t5) {
                }
            }
            setSelectorDrawableColor(i0.a.o(this.m3.f1, 30));
            return true;
        }
        org.telegram.ui.ActionBar.f7.m(this, 20, org.telegram.ui.ActionBar.y6.i6, this.n2);
        return true;
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        g51 g51Var;
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
        this.k3 = false;
        int saveCount = canvas2.getSaveCount();
        f61 f61Var = this.m3;
        int i11 = f61Var.W;
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
            sparseArray = this.f3;
            int size = sparseArray.size();
            arrayList = this.g3;
            if (i13 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i13++;
        }
        sparseArray.clear();
        boolean z11 = f61Var.Q1 > 0 && SystemClock.elapsedRealtime() - f61Var.Q1 < f61Var.g() && f61Var.N1 != null && f61Var.O1 >= 0;
        if (this.l3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof o51) {
                    o51 o51Var = (o51) childAt;
                    f61 f61Var2 = o51Var.V;
                    int i15 = f61Var2.W;
                    if (o51Var.isPressed()) {
                        float f7 = o51Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            o51Var.N = Utilities.clamp(f7 + 0.16f, 1.0f, 0.0f);
                            o51Var.invalidate();
                        }
                    }
                    int i16 = o51Var.c;
                    int y3 = f61Var.x1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(o51Var.getX(), o51Var.getY());
                    if (o51Var.w != null) {
                        bi.td collectionParticles = f61Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, o51Var.getWidth(), o51Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, o51Var.getWidth() / 2.0f, o51Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, o51Var.getWidth() / 2.0f, o51Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, o51Var.w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = o51Var.L;
                    if ((z15 || o51Var.M || o51Var.S > 0.0f) && !o51Var.b) {
                        if (z15 || o51Var.M) {
                            float f10 = o51Var.R;
                            if (f10 < 1.0f) {
                                o51Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!o51Var.L && !o51Var.M) {
                            float f11 = o51Var.R;
                            if (f11 > 0.0f) {
                                o51Var.R = f11 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        o51Var.S = Utilities.clamp(o51Var.L ? org.telegram.ui.Components.ds.h.getInterpolation(o51Var.R) : 1.0f - org.telegram.ui.Components.ds.h.getInterpolation(1.0f - o51Var.R), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, o51Var.getMeasuredWidth(), o51Var.getMeasuredHeight());
                        float f12 = dp;
                        rectF.inset(f12, f12);
                        if (!o51Var.a) {
                            Drawable drawable = o51Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.t5) || !((org.telegram.ui.Components.t5) drawable).c()) {
                                paint = f61Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (o51Var.getAlpha() * alpha * o51Var.S));
                                float f13 = dp2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = f61Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (o51Var.getAlpha() * alpha2 * o51Var.S));
                        float f132 = dp2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (o51Var.getBackground() != null) {
                        o51Var.getBackground().setBounds((int) o51Var.getX(), (int) o51Var.getY(), o51Var.getWidth() + ((int) o51Var.getX()), o51Var.getHeight() + ((int) o51Var.getY()));
                        o51Var.getBackground().setAlpha((int) (o51Var.getAlpha() * 255));
                        o51Var.getBackground().draw(canvas2);
                        o51Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) ic.a.y(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(o51Var);
                    n51 n51Var = o51Var.J;
                    if (n51Var != null && n51Var.getVisibility() == 0 && o51Var.J.getImageReceiver() == null && (imageReceiver = o51Var.r) != null) {
                        o51Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null && RecyclerView.R(view) == f61Var.O1 - 1) {
                    float interpolation = org.telegram.ui.Components.ds.g.getInterpolation(a8.ee.a((SystemClock.elapsedRealtime() - f61Var.Q1) / 200.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f14 = 1.0f - interpolation;
                        canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                        canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                        float f15 = (f14 * 0.5f) + 0.5f;
                        canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                        f61Var.N1.draw(canvas2);
                        canvas2.restore();
                        i14 = i10 + 1;
                        z12 = z16;
                        i12 = 14;
                    }
                }
                i14 = i10 + 1;
                z12 = z16;
                i12 = 14;
            }
        }
        ArrayList arrayList6 = this.j3;
        arrayList6.clear();
        ArrayList arrayList7 = this.i3;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i18 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.h3;
            if (i18 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i18);
            o51 o51Var2 = (o51) arrayList8.get(0);
            int R = RecyclerView.R(o51Var2);
            int i19 = 0;
            while (true) {
                if (i19 >= arrayList6.size()) {
                    g51Var = null;
                    break;
                } else {
                    if (((g51) arrayList6.get(i19)).M == R) {
                        g51Var = (g51) arrayList6.get(i19);
                        arrayList6.remove(i19);
                        break;
                    }
                    i19++;
                }
            }
            if (g51Var == null) {
                if (arrayList2.isEmpty()) {
                    g51Var = new g51(this);
                    g51Var.l(7);
                } else {
                    g51Var = (g51) ic.a.y(1, arrayList2);
                }
                g51Var.M = R;
                g51Var.e();
            }
            arrayList7.add(g51Var);
            g51Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(o51Var2.getLeft(), o51Var2.getY());
            g51Var.N = o51Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (o51Var2.getLeft() * 2);
            int measuredHeight = o51Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                g51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i18++;
        }
        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((g51) arrayList6.get(i20));
                ((g51) arrayList6.get(i20)).O = null;
                ((g51) arrayList6.get(i20)).k();
            } else {
                ((g51) arrayList6.get(i20)).f();
            }
        }
        arrayList6.clear();
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2 instanceof o51) {
                o51 o51Var3 = (o51) childAt2;
                n51 n51Var2 = o51Var3.J;
                if (n51Var2 != null && n51Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((o51Var3.getX() + o51Var3.getMeasuredWidth()) - o51Var3.J.getMeasuredWidth()), (int) ((o51Var3.getY() + o51Var3.getMeasuredHeight()) - o51Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = o51Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.t5 ? ((org.telegram.ui.Components.t5) drawable2).k : o51Var3.h;
                    n51 n51Var3 = o51Var3.J;
                    if (!n51Var3.h) {
                        n51Var3.setImageReceiver(imageReceiver2);
                    }
                    o51Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (o51Var3.K != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f16 = dp3;
                    canvas2.translate((int) ((o51Var3.getX() + o51Var3.getMeasuredWidth()) - f16), (int) ((o51Var3.getY() + o51Var3.getMeasuredHeight()) - f16));
                    o51Var3.K.setBounds(0, 0, dp3, dp3);
                    o51Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != f61Var.N1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = bh.m0.c;
        if (runnable != null) {
            runnable.run();
            bh.m0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.nm0
    public final void g1() {
        if (bh.m0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (bh.m0.b(this) || this.k3) {
            return;
        }
        this.k3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f61 f61Var = this.m3;
        if (this == f61Var.h0) {
            f61Var.V0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f61 f61Var = this.m3;
        if (this == f61Var.h0) {
            f61Var.V0.onDetachedFromWindow();
        }
        C1(this.h3);
        C1(this.i3);
        C1(this.j3);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (bh.m0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
