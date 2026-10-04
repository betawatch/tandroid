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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public abstract class e61 extends org.telegram.ui.Components.zl0 {
    public final SparseArray e3;
    public final ArrayList f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public boolean j3;
    public final LongSparseArray k3;
    public final /* synthetic */ c71 l3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(c71 c71Var, Context context) {
        super(context, null);
        this.l3 = c71Var;
        this.e3 = new SparseArray();
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.k3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, this.p2));
    }

    public static void y1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((d61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.q5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.zl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I0(View view, float f7, float f10) {
        if (view instanceof l61) {
            l61 l61Var = (l61) view;
            if (!l61Var.a) {
                Drawable drawable = l61Var.E;
                if (drawable instanceof org.telegram.ui.Components.q5) {
                }
            }
            setSelectorDrawableColor(i0.a.k(this.l3.f1, 30));
            return true;
        }
        setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, this.p2));
        return true;
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        d61 d61Var;
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
        c71 c71Var = this.l3;
        int i11 = c71Var.W;
        int i12 = 14;
        if (i11 != 6 && i11 != 14 && i11 != 13) {
            Rect rect = this.G1;
            if (!rect.isEmpty()) {
                this.D1.setBounds(rect);
                canvas2.save();
                q0.a aVar = this.o2;
                if (aVar != null) {
                    aVar.accept(canvas2);
                }
                this.D1.draw(canvas2);
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
        boolean z11 = c71Var.P1 > 0 && SystemClock.elapsedRealtime() - c71Var.P1 < c71Var.g() && c71Var.M1 != null && c71Var.N1 >= 0;
        if (this.k3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof l61) {
                    l61 l61Var = (l61) childAt;
                    c71 c71Var2 = l61Var.V;
                    int i15 = c71Var2.W;
                    if (l61Var.isPressed()) {
                        float f7 = l61Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            l61Var.N = Utilities.clamp(f7 + 0.16f, 1.0f, 0.0f);
                            l61Var.invalidate();
                        }
                    }
                    int i16 = l61Var.c;
                    int y3 = c71Var.w1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(l61Var.getX(), l61Var.getY());
                    if (l61Var.w != null) {
                        yh.j8 collectionParticles = c71Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, l61Var.getWidth(), l61Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, l61Var.getWidth() / 2.0f, l61Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, l61Var.getWidth() / 2.0f, l61Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, l61Var.w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = l61Var.L;
                    if ((z15 || l61Var.M || l61Var.S > 0.0f) && !l61Var.b) {
                        if (z15 || l61Var.M) {
                            float f10 = l61Var.R;
                            if (f10 < 1.0f) {
                                l61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!l61Var.L && !l61Var.M) {
                            float f11 = l61Var.R;
                            if (f11 > 0.0f) {
                                l61Var.R = f11 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        l61Var.S = Utilities.clamp(l61Var.L ? org.telegram.ui.Components.tr.h.getInterpolation(l61Var.R) : 1.0f - org.telegram.ui.Components.tr.h.getInterpolation(1.0f - l61Var.R), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, l61Var.getMeasuredWidth(), l61Var.getMeasuredHeight());
                        float f12 = dp;
                        rectF.inset(f12, f12);
                        if (!l61Var.a) {
                            Drawable drawable = l61Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.q5) || !((org.telegram.ui.Components.q5) drawable).c()) {
                                paint = c71Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (l61Var.getAlpha() * alpha * l61Var.S));
                                float f13 = dp2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = c71Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (l61Var.getAlpha() * alpha2 * l61Var.S));
                        float f132 = dp2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (l61Var.getBackground() != null) {
                        l61Var.getBackground().setBounds((int) l61Var.getX(), (int) l61Var.getY(), l61Var.getWidth() + ((int) l61Var.getX()), l61Var.getHeight() + ((int) l61Var.getY()));
                        l61Var.getBackground().setAlpha((int) (l61Var.getAlpha() * 255));
                        l61Var.getBackground().draw(canvas2);
                        l61Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) hg.k0.w(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(l61Var);
                    k61 k61Var = l61Var.J;
                    if (k61Var != null && k61Var.getVisibility() == 0 && l61Var.J.getImageReceiver() == null && (imageReceiver = l61Var.r) != null) {
                        l61Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = c71Var.N1;
                    List list = c71.Z1;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.tr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - c71Var.P1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            c71Var.M1.draw(canvas2);
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
            l61 l61Var2 = (l61) arrayList8.get(0);
            int R2 = RecyclerView.R(l61Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    d61Var = null;
                    break;
                } else {
                    if (((d61) arrayList6.get(i20)).M == R2) {
                        d61Var = (d61) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (d61Var == null) {
                if (arrayList2.isEmpty()) {
                    d61Var = new d61(this);
                    d61Var.l(7);
                } else {
                    d61Var = (d61) hg.k0.w(1, arrayList2);
                }
                d61Var.M = R2;
                d61Var.e();
            }
            arrayList7.add(d61Var);
            d61Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(l61Var2.getLeft(), l61Var2.getY());
            d61Var.N = l61Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (l61Var2.getLeft() * 2);
            int measuredHeight = l61Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                d61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((d61) arrayList6.get(i21));
                ((d61) arrayList6.get(i21)).O = null;
                ((d61) arrayList6.get(i21)).k();
            } else {
                ((d61) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof l61) {
                l61 l61Var3 = (l61) childAt2;
                k61 k61Var2 = l61Var3.J;
                if (k61Var2 != null && k61Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((l61Var3.getX() + l61Var3.getMeasuredWidth()) - l61Var3.J.getMeasuredWidth()), (int) ((l61Var3.getY() + l61Var3.getMeasuredHeight()) - l61Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = l61Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.q5 ? ((org.telegram.ui.Components.q5) drawable2).k : l61Var3.h;
                    k61 k61Var3 = l61Var3.J;
                    if (!k61Var3.h) {
                        k61Var3.setImageReceiver(imageReceiver2);
                    }
                    l61Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (l61Var3.K != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f16 = dp3;
                    canvas2.translate((int) ((l61Var3.getX() + l61Var3.getMeasuredWidth()) - f16), (int) ((l61Var3.getY() + l61Var3.getMeasuredHeight()) - f16));
                    l61Var3.K.setBounds(0, 0, dp3, dp3);
                    l61Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != c71Var.M1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = zg.e0.c;
        if (runnable != null) {
            runnable.run();
            zg.e0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final void h1() {
        if (zg.e0.b(this)) {
            return;
        }
        super.h1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.e0.b(this) || this.j3) {
            return;
        }
        this.j3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c71 c71Var = this.l3;
        if (this == c71Var.h0) {
            c71Var.V0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c71 c71Var = this.l3;
        if (this == c71Var.h0) {
            c71Var.V0.onDetachedFromWindow();
        }
        y1(this.g3);
        y1(this.h3);
        y1(this.i3);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
