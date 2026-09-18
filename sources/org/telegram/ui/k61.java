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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class k61 extends org.telegram.ui.Components.ml0 {
    public final SparseArray X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public boolean c3;
    public final LongSparseArray d3;
    public final /* synthetic */ i71 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k61(i71 i71Var, Context context) {
        super(context, null);
        this.e3 = i71Var;
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

    public static void x1(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.o5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.ml0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I0(View view, float f7, float f10) {
        if (view instanceof r61) {
            r61 r61Var = (r61) view;
            if (!r61Var.a) {
                Drawable drawable = r61Var.E;
                if (drawable instanceof org.telegram.ui.Components.o5) {
                }
            }
            setSelectorDrawableColor(i0.a.k(this.e3.f1, 30));
            return true;
        }
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.p2));
        return true;
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        j61 j61Var;
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
        i71 i71Var = this.e3;
        int i11 = i71Var.W;
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
        boolean z11 = i71Var.P1 > 0 && SystemClock.elapsedRealtime() - i71Var.P1 < i71Var.g() && i71Var.M1 != null && i71Var.N1 >= 0;
        if (this.d3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof r61) {
                    r61 r61Var = (r61) childAt;
                    i71 i71Var2 = r61Var.V;
                    int i15 = i71Var2.W;
                    if (r61Var.isPressed()) {
                        float f7 = r61Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            r61Var.N = Utilities.clamp(f7 + 0.16f, 1.0f, 0.0f);
                            r61Var.invalidate();
                        }
                    }
                    int i16 = r61Var.c;
                    int y3 = i71Var.w1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(r61Var.getX(), r61Var.getY());
                    if (r61Var.w != null) {
                        yh.k8 collectionParticles = i71Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, r61Var.getWidth(), r61Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, r61Var.getWidth() / 2.0f, r61Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, r61Var.getWidth() / 2.0f, r61Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, r61Var.w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = r61Var.L;
                    if ((z15 || r61Var.M || r61Var.S > 0.0f) && !r61Var.b) {
                        if (z15 || r61Var.M) {
                            float f10 = r61Var.R;
                            if (f10 < 1.0f) {
                                r61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!r61Var.L && !r61Var.M) {
                            float f11 = r61Var.R;
                            if (f11 > 0.0f) {
                                r61Var.R = f11 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        r61Var.S = Utilities.clamp(r61Var.L ? org.telegram.ui.Components.qr.h.getInterpolation(r61Var.R) : 1.0f - org.telegram.ui.Components.qr.h.getInterpolation(1.0f - r61Var.R), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, r61Var.getMeasuredWidth(), r61Var.getMeasuredHeight());
                        float f12 = dp;
                        rectF.inset(f12, f12);
                        if (!r61Var.a) {
                            Drawable drawable = r61Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.o5) || !((org.telegram.ui.Components.o5) drawable).c()) {
                                paint = i71Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (r61Var.getAlpha() * alpha * r61Var.S));
                                float f13 = dp2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = i71Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (r61Var.getAlpha() * alpha2 * r61Var.S));
                        float f132 = dp2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (r61Var.getBackground() != null) {
                        r61Var.getBackground().setBounds((int) r61Var.getX(), (int) r61Var.getY(), r61Var.getWidth() + ((int) r61Var.getX()), r61Var.getHeight() + ((int) r61Var.getY()));
                        r61Var.getBackground().setAlpha((int) (r61Var.getAlpha() * 255));
                        r61Var.getBackground().draw(canvas2);
                        r61Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) hg.k0.z(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(r61Var);
                    q61 q61Var = r61Var.J;
                    if (q61Var != null && q61Var.getVisibility() == 0 && r61Var.J.getImageReceiver() == null && (imageReceiver = r61Var.r) != null) {
                        r61Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int S = RecyclerView.S(view);
                    int i18 = i71Var.N1;
                    List list = i71.Z1;
                    if (S == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.qr.g.getInterpolation(w7.p.a((SystemClock.elapsedRealtime() - i71Var.P1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            i71Var.M1.draw(canvas2);
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
            r61 r61Var2 = (r61) arrayList8.get(0);
            int S2 = RecyclerView.S(r61Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    j61Var = null;
                    break;
                } else {
                    if (((j61) arrayList6.get(i20)).M == S2) {
                        j61Var = (j61) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (j61Var == null) {
                if (arrayList2.isEmpty()) {
                    j61Var = new j61(this);
                    j61Var.l(7);
                } else {
                    j61Var = (j61) hg.k0.z(1, arrayList2);
                }
                j61Var.M = S2;
                j61Var.e();
            }
            arrayList7.add(j61Var);
            j61Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(r61Var2.getLeft(), r61Var2.getY());
            j61Var.N = r61Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (r61Var2.getLeft() * 2);
            int measuredHeight = r61Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                j61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((j61) arrayList6.get(i21));
                ((j61) arrayList6.get(i21)).O = null;
                ((j61) arrayList6.get(i21)).k();
            } else {
                ((j61) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof r61) {
                r61 r61Var3 = (r61) childAt2;
                q61 q61Var2 = r61Var3.J;
                if (q61Var2 != null && q61Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((r61Var3.getX() + r61Var3.getMeasuredWidth()) - r61Var3.J.getMeasuredWidth()), (int) ((r61Var3.getY() + r61Var3.getMeasuredHeight()) - r61Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = r61Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.o5 ? ((org.telegram.ui.Components.o5) drawable2).k : r61Var3.h;
                    q61 q61Var3 = r61Var3.J;
                    if (!q61Var3.h) {
                        q61Var3.setImageReceiver(imageReceiver2);
                    }
                    r61Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (r61Var3.K != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f16 = dp3;
                    canvas2.translate((int) ((r61Var3.getX() + r61Var3.getMeasuredWidth()) - f16), (int) ((r61Var3.getY() + r61Var3.getMeasuredHeight()) - f16));
                    r61Var3.K.setBounds(0, 0, dp3, dp3);
                    r61Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != i71Var.M1) {
                canvas2.save();
                canvas2.translate((int) childAt2.getX(), (int) childAt2.getY());
                childAt2.draw(canvas2);
                canvas2.restore();
            }
        }
        canvas2.restoreToCount(saveCount);
        Runnable runnable = zg.f0.c;
        if (runnable != null) {
            runnable.run();
            zg.f0.c = null;
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public final void g1() {
        if (zg.f0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.f0.b(this) || this.c3) {
            return;
        }
        this.c3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i71 i71Var = this.e3;
        if (this == i71Var.h0) {
            i71Var.V0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i71 i71Var = this.e3;
        if (this == i71Var.h0) {
            i71Var.V0.onDetachedFromWindow();
        }
        x1(this.Z2);
        x1(this.a3);
        x1(this.b3);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        invalidate();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.f0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
