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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class l61 extends org.telegram.ui.Components.ll0 {
    public final SparseArray X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public boolean c3;
    public final LongSparseArray d3;
    public final /* synthetic */ j71 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(j71 j71Var, Context context) {
        super(context, null);
        this.e3 = j71Var;
        this.X2 = new SparseArray();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.d3 = new LongSparseArray();
        setDrawSelectorBehind(true);
        setClipToPadding(false);
        setSelectorRadius(AndroidUtilities.dp(4.0f));
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.p2));
    }

    public static void v1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((k61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.q5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.ll0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H0(View view, float f7, float f10) {
        if (view instanceof s61) {
            s61 s61Var = (s61) view;
            if (!s61Var.a) {
                Drawable drawable = s61Var.E;
                if (drawable instanceof org.telegram.ui.Components.q5) {
                }
            }
            setSelectorDrawableColor(i0.a.k(this.e3.f1, 30));
            return true;
        }
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.p2));
        return true;
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        k61 k61Var;
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
        this.c3 = false;
        int saveCount = canvas2.getSaveCount();
        j71 j71Var = this.e3;
        int i11 = j71Var.W;
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
            sparseArray = this.X2;
            int size = sparseArray.size();
            arrayList = this.Y2;
            if (i13 >= size) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i13++;
        }
        sparseArray.clear();
        boolean z11 = j71Var.P1 > 0 && SystemClock.elapsedRealtime() - j71Var.P1 < j71Var.g() && j71Var.M1 != null && j71Var.N1 >= 0;
        if (this.d3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof s61) {
                    s61 s61Var = (s61) childAt;
                    j71 j71Var2 = s61Var.V;
                    int i15 = j71Var2.W;
                    if (s61Var.isPressed()) {
                        float f7 = s61Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            s61Var.N = Utilities.clamp(f7 + 0.16f, 1.0f, 0.0f);
                            s61Var.invalidate();
                        }
                    }
                    int i16 = s61Var.c;
                    int y3 = j71Var.w1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(s61Var.getX(), s61Var.getY());
                    if (s61Var.w != null) {
                        zh.h8 collectionParticles = j71Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, s61Var.getWidth(), s61Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, s61Var.getWidth() / 2.0f, s61Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, s61Var.getWidth() / 2.0f, s61Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, s61Var.w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = s61Var.L;
                    if ((z15 || s61Var.M || s61Var.S > 0.0f) && !s61Var.b) {
                        if (z15 || s61Var.M) {
                            float f10 = s61Var.R;
                            if (f10 < 1.0f) {
                                s61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!s61Var.L && !s61Var.M) {
                            float f11 = s61Var.R;
                            if (f11 > 0.0f) {
                                s61Var.R = f11 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        s61Var.S = Utilities.clamp(s61Var.L ? org.telegram.ui.Components.pr.h.getInterpolation(s61Var.R) : 1.0f - org.telegram.ui.Components.pr.h.getInterpolation(1.0f - s61Var.R), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, s61Var.getMeasuredWidth(), s61Var.getMeasuredHeight());
                        float f12 = dp;
                        rectF.inset(f12, f12);
                        if (!s61Var.a) {
                            Drawable drawable = s61Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.q5) || !((org.telegram.ui.Components.q5) drawable).c()) {
                                paint = j71Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (s61Var.getAlpha() * alpha * s61Var.S));
                                float f13 = dp2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = j71Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (s61Var.getAlpha() * alpha2 * s61Var.S));
                        float f132 = dp2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (s61Var.getBackground() != null) {
                        s61Var.getBackground().setBounds((int) s61Var.getX(), (int) s61Var.getY(), s61Var.getWidth() + ((int) s61Var.getX()), s61Var.getHeight() + ((int) s61Var.getY()));
                        s61Var.getBackground().setAlpha((int) (s61Var.getAlpha() * 255));
                        s61Var.getBackground().draw(canvas2);
                        s61Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) i2.g.z(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(s61Var);
                    r61 r61Var = s61Var.J;
                    if (r61Var != null && r61Var.getVisibility() == 0 && s61Var.J.getImageReceiver() == null && (imageReceiver = s61Var.r) != null) {
                        s61Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int R = RecyclerView.R(view);
                    int i18 = j71Var.N1;
                    List list = j71.Z1;
                    if (R == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.pr.g.getInterpolation(w7.p.a((SystemClock.elapsedRealtime() - j71Var.P1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            j71Var.M1.draw(canvas2);
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
        ArrayList arrayList6 = this.b3;
        arrayList6.clear();
        ArrayList arrayList7 = this.a3;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i19 = 0;
        while (true) {
            int size2 = sparseArray.size();
            arrayList2 = this.Z2;
            if (i19 >= size2) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) sparseArray.valueAt(i19);
            s61 s61Var2 = (s61) arrayList8.get(0);
            int R2 = RecyclerView.R(s61Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    k61Var = null;
                    break;
                } else {
                    if (((k61) arrayList6.get(i20)).M == R2) {
                        k61Var = (k61) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (k61Var == null) {
                if (arrayList2.isEmpty()) {
                    k61Var = new k61(this);
                    k61Var.l(7);
                } else {
                    k61Var = (k61) i2.g.z(1, arrayList2);
                }
                k61Var.M = R2;
                k61Var.e();
            }
            arrayList7.add(k61Var);
            k61Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(s61Var2.getLeft(), s61Var2.getY());
            k61Var.N = s61Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (s61Var2.getLeft() * 2);
            int measuredHeight = s61Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                k61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((k61) arrayList6.get(i21));
                ((k61) arrayList6.get(i21)).O = null;
                ((k61) arrayList6.get(i21)).k();
            } else {
                ((k61) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof s61) {
                s61 s61Var3 = (s61) childAt2;
                r61 r61Var2 = s61Var3.J;
                if (r61Var2 != null && r61Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((s61Var3.getX() + s61Var3.getMeasuredWidth()) - s61Var3.J.getMeasuredWidth()), (int) ((s61Var3.getY() + s61Var3.getMeasuredHeight()) - s61Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = s61Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.q5 ? ((org.telegram.ui.Components.q5) drawable2).k : s61Var3.h;
                    r61 r61Var3 = s61Var3.J;
                    if (!r61Var3.h) {
                        r61Var3.setImageReceiver(imageReceiver2);
                    }
                    s61Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (s61Var3.K != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f16 = dp3;
                    canvas2.translate((int) ((s61Var3.getX() + s61Var3.getMeasuredWidth()) - f16), (int) ((s61Var3.getY() + s61Var3.getMeasuredHeight()) - f16));
                    s61Var3.K.setBounds(0, 0, dp3, dp3);
                    s61Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != j71Var.M1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = ah.y0.c;
        if (runnable != null) {
            runnable.run();
            ah.y0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public final void e1() {
        if (ah.y0.b(this)) {
            return;
        }
        super.e1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ah.y0.b(this) || this.c3) {
            return;
        }
        this.c3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j71 j71Var = this.e3;
        if (this == j71Var.h0) {
            j71Var.V0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j71 j71Var = this.e3;
        if (this == j71Var.h0) {
            j71Var.V0.onDetachedFromWindow();
        }
        v1(this.Z2);
        v1(this.a3);
        v1(this.b3);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (ah.y0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
