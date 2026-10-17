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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class b51 extends org.telegram.ui.Components.im0 {
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public boolean a3;
    public final LongSparseArray b3;
    public final /* synthetic */ z51 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b51(z51 z51Var, Context context) {
        super(context, null);
        this.c3 = z51Var;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.b3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, this.n2));
    }

    public static void x1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((a51) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.r5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.im0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f7, float f10) {
        if (view instanceof i51) {
            i51 i51Var = (i51) view;
            if (!i51Var.a) {
                Drawable drawable = i51Var.E;
                if (drawable instanceof org.telegram.ui.Components.r5) {
                }
            }
            setSelectorDrawableColor(i0.b.o(this.c3.f1, 30));
            return true;
        }
        setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, this.n2));
        return true;
    }

    @Override // org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        a51 a51Var;
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
        this.a3 = false;
        int saveCount = canvas2.getSaveCount();
        z51 z51Var = this.c3;
        int i11 = z51Var.W;
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
            sparseArray = this.V2;
            int size = sparseArray.size();
            arrayList = this.W2;
            if (i13 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i13++;
        }
        sparseArray.clear();
        boolean z11 = z51Var.P1 > 0 && SystemClock.elapsedRealtime() - z51Var.P1 < z51Var.g() && z51Var.M1 != null && z51Var.N1 >= 0;
        if (this.b3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof i51) {
                    i51 i51Var = (i51) childAt;
                    z51 z51Var2 = i51Var.V;
                    int i15 = z51Var2.W;
                    if (i51Var.isPressed()) {
                        float f7 = i51Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            i51Var.N = Utilities.clamp(f7 + 0.16f, 1.0f, 0.0f);
                            i51Var.invalidate();
                        }
                    }
                    int i16 = i51Var.c;
                    int y3 = z51Var.w1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(i51Var.getX(), i51Var.getY());
                    if (i51Var.w != null) {
                        ai.ce collectionParticles = z51Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, i51Var.getWidth(), i51Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, i51Var.getWidth() / 2.0f, i51Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, i51Var.getWidth() / 2.0f, i51Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, i51Var.w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = i51Var.L;
                    if ((z15 || i51Var.M || i51Var.S > 0.0f) && !i51Var.b) {
                        if (z15 || i51Var.M) {
                            float f10 = i51Var.R;
                            if (f10 < 1.0f) {
                                i51Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!i51Var.L && !i51Var.M) {
                            float f11 = i51Var.R;
                            if (f11 > 0.0f) {
                                i51Var.R = f11 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        i51Var.S = Utilities.clamp(i51Var.L ? org.telegram.ui.Components.bs.h.getInterpolation(i51Var.R) : 1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - i51Var.R), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, i51Var.getMeasuredWidth(), i51Var.getMeasuredHeight());
                        float f12 = dp;
                        rectF.inset(f12, f12);
                        if (!i51Var.a) {
                            Drawable drawable = i51Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.r5) || !((org.telegram.ui.Components.r5) drawable).c()) {
                                paint = z51Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (i51Var.getAlpha() * alpha * i51Var.S));
                                float f13 = dp2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = z51Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (i51Var.getAlpha() * alpha2 * i51Var.S));
                        float f132 = dp2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (i51Var.getBackground() != null) {
                        i51Var.getBackground().setBounds((int) i51Var.getX(), (int) i51Var.getY(), i51Var.getWidth() + ((int) i51Var.getX()), i51Var.getHeight() + ((int) i51Var.getY()));
                        i51Var.getBackground().setAlpha((int) (i51Var.getAlpha() * 255));
                        i51Var.getBackground().draw(canvas2);
                        i51Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) i0.a.z(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(i51Var);
                    h51 h51Var = i51Var.J;
                    if (h51Var != null && h51Var.getVisibility() == 0 && i51Var.J.getImageReceiver() == null && (imageReceiver = i51Var.r) != null) {
                        i51Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = z51Var.N1;
                    List list = z51.Z1;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.bs.g.getInterpolation(w7.r.a((SystemClock.elapsedRealtime() - z51Var.P1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            z51Var.M1.draw(canvas2);
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
        ArrayList arrayList6 = this.Z2;
        arrayList6.clear();
        ArrayList arrayList7 = this.Y2;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i19 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.X2;
            if (i19 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
            i51 i51Var2 = (i51) arrayList8.get(0);
            int R2 = RecyclerView.R(i51Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    a51Var = null;
                    break;
                } else {
                    if (((a51) arrayList6.get(i20)).M == R2) {
                        a51Var = (a51) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (a51Var == null) {
                if (arrayList2.isEmpty()) {
                    a51Var = new a51(this);
                    a51Var.l(7);
                } else {
                    a51Var = (a51) i0.a.z(1, arrayList2);
                }
                a51Var.M = R2;
                a51Var.e();
            }
            arrayList7.add(a51Var);
            a51Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(i51Var2.getLeft(), i51Var2.getY());
            a51Var.N = i51Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (i51Var2.getLeft() * 2);
            int measuredHeight = i51Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                a51Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((a51) arrayList6.get(i21));
                ((a51) arrayList6.get(i21)).O = null;
                ((a51) arrayList6.get(i21)).k();
            } else {
                ((a51) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof i51) {
                i51 i51Var3 = (i51) childAt2;
                h51 h51Var2 = i51Var3.J;
                if (h51Var2 != null && h51Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((i51Var3.getX() + i51Var3.getMeasuredWidth()) - i51Var3.J.getMeasuredWidth()), (int) ((i51Var3.getY() + i51Var3.getMeasuredHeight()) - i51Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = i51Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.r5 ? ((org.telegram.ui.Components.r5) drawable2).k : i51Var3.h;
                    h51 h51Var3 = i51Var3.J;
                    if (!h51Var3.h) {
                        h51Var3.setImageReceiver(imageReceiver2);
                    }
                    i51Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (i51Var3.K != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f16 = dp3;
                    canvas2.translate((int) ((i51Var3.getX() + i51Var3.getMeasuredWidth()) - f16), (int) ((i51Var3.getY() + i51Var3.getMeasuredHeight()) - f16));
                    i51Var3.K.setBounds(0, 0, dp3, dp3);
                    i51Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != z51Var.M1) {
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

    @Override // org.telegram.ui.Components.im0
    public final void f1() {
        if (ah.x0.b(this)) {
            return;
        }
        super.f1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ah.x0.b(this) || this.a3) {
            return;
        }
        this.a3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z51 z51Var = this.c3;
        if (this == z51Var.h0) {
            z51Var.V0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z51 z51Var = this.c3;
        if (this == z51Var.h0) {
            z51Var.V0.onDetachedFromWindow();
        }
        x1(this.X2);
        x1(this.Y2);
        x1(this.Z2);
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
