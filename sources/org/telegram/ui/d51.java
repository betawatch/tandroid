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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class d51 extends org.telegram.ui.Components.mm0 {
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public boolean d3;
    public final LongSparseArray e3;
    public final /* synthetic */ b61 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d51(b61 b61Var, Context context) {
        super(context, null);
        this.f3 = b61Var;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.e3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, this.n2);
    }

    public static void C1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((c51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.r5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.mm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f7, float f10) {
        if (view instanceof k51) {
            k51 k51Var = (k51) view;
            if (!k51Var.a) {
                Drawable drawable = k51Var.E;
                if (drawable instanceof org.telegram.ui.Components.r5) {
                }
            }
            setSelectorDrawableColor(i0.a.o(this.f3.f1, 30));
            return true;
        }
        org.telegram.ui.ActionBar.r6.m(this, 20, org.telegram.ui.ActionBar.k6.i6, this.n2);
        return true;
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        c51 c51Var;
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
        this.d3 = false;
        int saveCount = canvas2.getSaveCount();
        b61 b61Var = this.f3;
        int i11 = b61Var.W;
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
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.Z2;
            if (i13 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i13++;
        }
        sparseArray.clear();
        boolean z11 = b61Var.Q1 > 0 && SystemClock.elapsedRealtime() - b61Var.Q1 < b61Var.g() && b61Var.N1 != null && b61Var.O1 >= 0;
        if (this.e3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof k51) {
                    k51 k51Var = (k51) childAt;
                    b61 b61Var2 = k51Var.V;
                    int i15 = b61Var2.W;
                    if (k51Var.isPressed()) {
                        float f7 = k51Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            k51Var.N = Utilities.clamp(f7 + 0.16f, 1.0f, 0.0f);
                            k51Var.invalidate();
                        }
                    }
                    int i16 = k51Var.c;
                    int y3 = b61Var.x1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(k51Var.getX(), k51Var.getY());
                    if (k51Var.w != null) {
                        ai.ee collectionParticles = b61Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, k51Var.getWidth(), k51Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, k51Var.getWidth() / 2.0f, k51Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, k51Var.getWidth() / 2.0f, k51Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, k51Var.w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = k51Var.L;
                    if ((z15 || k51Var.M || k51Var.S > 0.0f) && !k51Var.b) {
                        if (z15 || k51Var.M) {
                            float f10 = k51Var.R;
                            if (f10 < 1.0f) {
                                k51Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!k51Var.L && !k51Var.M) {
                            float f11 = k51Var.R;
                            if (f11 > 0.0f) {
                                k51Var.R = f11 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        k51Var.S = Utilities.clamp(k51Var.L ? org.telegram.ui.Components.bs.h.getInterpolation(k51Var.R) : 1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - k51Var.R), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, k51Var.getMeasuredWidth(), k51Var.getMeasuredHeight());
                        float f12 = dp;
                        rectF.inset(f12, f12);
                        if (!k51Var.a) {
                            Drawable drawable = k51Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.r5) || !((org.telegram.ui.Components.r5) drawable).c()) {
                                paint = b61Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (k51Var.getAlpha() * alpha * k51Var.S));
                                float f13 = dp2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = b61Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (k51Var.getAlpha() * alpha2 * k51Var.S));
                        float f132 = dp2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (k51Var.getBackground() != null) {
                        k51Var.getBackground().setBounds((int) k51Var.getX(), (int) k51Var.getY(), k51Var.getWidth() + ((int) k51Var.getX()), k51Var.getHeight() + ((int) k51Var.getY()));
                        k51Var.getBackground().setAlpha((int) (k51Var.getAlpha() * 255));
                        k51Var.getBackground().draw(canvas2);
                        k51Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) i2.o1.A(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(k51Var);
                    j51 j51Var = k51Var.J;
                    if (j51Var != null && j51Var.getVisibility() == 0 && k51Var.J.getImageReceiver() == null && (imageReceiver = k51Var.r) != null) {
                        k51Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = b61Var.O1;
                    List list = b61.a2;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.bs.g.getInterpolation(w7.r.a((SystemClock.elapsedRealtime() - b61Var.Q1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            b61Var.N1.draw(canvas2);
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
        ArrayList arrayList6 = this.c3;
        arrayList6.clear();
        ArrayList arrayList7 = this.b3;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i19 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.a3;
            if (i19 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
            k51 k51Var2 = (k51) arrayList8.get(0);
            int R2 = RecyclerView.R(k51Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    c51Var = null;
                    break;
                } else {
                    if (((c51) arrayList6.get(i20)).M == R2) {
                        c51Var = (c51) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (c51Var == null) {
                if (arrayList2.isEmpty()) {
                    c51Var = new c51(this);
                    c51Var.l(7);
                } else {
                    c51Var = (c51) i2.o1.A(1, arrayList2);
                }
                c51Var.M = R2;
                c51Var.e();
            }
            arrayList7.add(c51Var);
            c51Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(k51Var2.getLeft(), k51Var2.getY());
            c51Var.N = k51Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (k51Var2.getLeft() * 2);
            int measuredHeight = k51Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                c51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((c51) arrayList6.get(i21));
                ((c51) arrayList6.get(i21)).O = null;
                ((c51) arrayList6.get(i21)).k();
            } else {
                ((c51) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof k51) {
                k51 k51Var3 = (k51) childAt2;
                j51 j51Var2 = k51Var3.J;
                if (j51Var2 != null && j51Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((k51Var3.getX() + k51Var3.getMeasuredWidth()) - k51Var3.J.getMeasuredWidth()), (int) ((k51Var3.getY() + k51Var3.getMeasuredHeight()) - k51Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = k51Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.r5 ? ((org.telegram.ui.Components.r5) drawable2).k : k51Var3.h;
                    j51 j51Var3 = k51Var3.J;
                    if (!j51Var3.h) {
                        j51Var3.setImageReceiver(imageReceiver2);
                    }
                    k51Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (k51Var3.K != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f16 = dp3;
                    canvas2.translate((int) ((k51Var3.getX() + k51Var3.getMeasuredWidth()) - f16), (int) ((k51Var3.getY() + k51Var3.getMeasuredHeight()) - f16));
                    k51Var3.K.setBounds(0, 0, dp3, dp3);
                    k51Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != b61Var.N1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = ah.x0.c;
        if (runnable != null) {
            runnable.run();
            ah.x0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final void g1() {
        if (ah.x0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ah.x0.b(this) || this.d3) {
            return;
        }
        this.d3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b61 b61Var = this.f3;
        if (this == b61Var.h0) {
            b61Var.V0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b61 b61Var = this.f3;
        if (this == b61Var.h0) {
            b61Var.V0.onDetachedFromWindow();
        }
        C1(this.a3);
        C1(this.b3);
        C1(this.c3);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.x0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
