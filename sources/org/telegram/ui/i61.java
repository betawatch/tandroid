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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class i61 extends org.telegram.ui.Components.wl0 {
    public final SparseArray X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public boolean c3;
    public final LongSparseArray d3;
    public final /* synthetic */ g71 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i61(g71 g71Var, Context context) {
        super(context, null);
        this.e3 = g71Var;
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
            ((h61) arrayList.get(i10)).f();
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (((org.telegram.ui.Components.q5) r1).c() != false) goto L10;
     */
    @Override // org.telegram.ui.Components.wl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I0(View view, float f7, float f10) {
        if (view instanceof p61) {
            p61 p61Var = (p61) view;
            if (!p61Var.a) {
                Drawable drawable = p61Var.E;
                if (drawable instanceof org.telegram.ui.Components.q5) {
                }
            }
            setSelectorDrawableColor(i0.a.k(this.e3.f1, 30));
            return true;
        }
        setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, this.p2));
        return true;
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        h61 h61Var;
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
        g71 g71Var = this.e3;
        int i11 = g71Var.W;
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
        boolean z11 = g71Var.P1 > 0 && SystemClock.elapsedRealtime() - g71Var.P1 < g71Var.g() && g71Var.M1 != null && g71Var.N1 >= 0;
        if (this.d3 != null) {
            int i14 = 0;
            boolean z12 = false;
            while (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof p61) {
                    p61 p61Var = (p61) childAt;
                    g71 g71Var2 = p61Var.V;
                    int i15 = g71Var2.W;
                    if (p61Var.isPressed()) {
                        float f7 = p61Var.N;
                        if (f7 != 1.0f && i15 != i12) {
                            p61Var.N = Utilities.clamp(f7 + 0.16f, 1.0f, 0.0f);
                            p61Var.invalidate();
                        }
                    }
                    int i16 = p61Var.c;
                    int y3 = g71Var.w1 ? (int) childAt.getY() : childAt.getTop();
                    ArrayList arrayList5 = (ArrayList) sparseArray.get(y3);
                    canvas2.save();
                    canvas2.translate(p61Var.getX(), p61Var.getY());
                    if (p61Var.w != null) {
                        yh.i8 collectionParticles = g71Var.getCollectionParticles();
                        i10 = i14;
                        boolean z13 = z12;
                        collectionParticles.f(0, 0, p61Var.getWidth(), p61Var.getHeight());
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
                        canvas2.scale(i17 == 2 ? -1.0f : 1.0f, i17 == 2 ? -1.0f : 1.0f, p61Var.getWidth() / 2.0f, p61Var.getHeight() / 2.0f);
                        canvas2.rotate((i16 % 4) * 90, p61Var.getWidth() / 2.0f, p61Var.getHeight() / 2.0f);
                        collectionParticles.a(canvas2, p61Var.w.intValue());
                        canvas2.restore();
                        z12 = z14;
                    } else {
                        i10 = i14;
                        view = childAt;
                    }
                    boolean z15 = p61Var.L;
                    if ((z15 || p61Var.M || p61Var.S > 0.0f) && !p61Var.b) {
                        if (z15 || p61Var.M) {
                            float f10 = p61Var.R;
                            if (f10 < 1.0f) {
                                p61Var.R = ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f) + f10;
                                invalidate();
                            }
                        }
                        if (!p61Var.L && !p61Var.M) {
                            float f11 = p61Var.R;
                            if (f11 > 0.0f) {
                                p61Var.R = f11 - ((1000.0f / AndroidUtilities.screenRefreshRate) / 240.0f);
                                invalidate();
                            }
                        }
                        p61Var.S = Utilities.clamp(p61Var.L ? org.telegram.ui.Components.qr.h.getInterpolation(p61Var.R) : 1.0f - org.telegram.ui.Components.qr.h.getInterpolation(1.0f - p61Var.R), 1.0f, 0.0f);
                        int dp = AndroidUtilities.dp(i15 == 6 ? 1.5f : 1.0f);
                        int dp2 = AndroidUtilities.dp(i15 == 6 ? 6.0f : 4.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, p61Var.getMeasuredWidth(), p61Var.getMeasuredHeight());
                        float f12 = dp;
                        rectF.inset(f12, f12);
                        if (!p61Var.a) {
                            Drawable drawable = p61Var.E;
                            if (!(drawable instanceof org.telegram.ui.Components.q5) || !((org.telegram.ui.Components.q5) drawable).c()) {
                                paint = g71Var2.L;
                                int alpha = paint.getAlpha();
                                paint.setAlpha((int) (p61Var.getAlpha() * alpha * p61Var.S));
                                float f13 = dp2;
                                canvas2.drawRoundRect(rectF, f13, f13, paint);
                                paint.setAlpha(alpha);
                            }
                        }
                        paint = g71Var2.M;
                        int alpha2 = paint.getAlpha();
                        paint.setAlpha((int) (p61Var.getAlpha() * alpha2 * p61Var.S));
                        float f132 = dp2;
                        canvas2.drawRoundRect(rectF, f132, f132, paint);
                        paint.setAlpha(alpha2);
                    }
                    canvas2.restore();
                    if (p61Var.getBackground() != null) {
                        p61Var.getBackground().setBounds((int) p61Var.getX(), (int) p61Var.getY(), p61Var.getWidth() + ((int) p61Var.getX()), p61Var.getHeight() + ((int) p61Var.getY()));
                        p61Var.getBackground().setAlpha((int) (p61Var.getAlpha() * 255));
                        p61Var.getBackground().draw(canvas2);
                        p61Var.getBackground().setAlpha(255);
                    }
                    if (arrayList5 == null) {
                        arrayList3 = !arrayList.isEmpty() ? (ArrayList) hg.k0.v(1, arrayList) : new ArrayList();
                        sparseArray.put(y3, arrayList3);
                    } else {
                        arrayList3 = arrayList5;
                    }
                    arrayList3.add(p61Var);
                    o61 o61Var = p61Var.J;
                    if (o61Var != null && o61Var.getVisibility() == 0 && p61Var.J.getImageReceiver() == null && (imageReceiver = p61Var.r) != null) {
                        p61Var.J.setImageReceiver(imageReceiver);
                    }
                } else {
                    i10 = i14;
                    view = childAt;
                }
                boolean z16 = z12;
                if (z11 && view != null) {
                    int S = RecyclerView.S(view);
                    int i18 = g71Var.N1;
                    List list = g71.Z1;
                    if (S == i18 - 1) {
                        float interpolation = org.telegram.ui.Components.qr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - g71Var.P1) / 200.0f, 0.0f, 1.0f));
                        if (interpolation < 1.0f) {
                            float f14 = 1.0f - interpolation;
                            canvas2.saveLayerAlpha(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (int) (255.0f * f14), 31);
                            canvas2.translate(view.getLeft(), view.getTop() + 0.0f);
                            float f15 = (f14 * 0.5f) + 0.5f;
                            canvas2.scale(f15, f15, view.getWidth() / 2.0f, view.getHeight() / 2.0f);
                            g71Var.M1.draw(canvas2);
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
            p61 p61Var2 = (p61) arrayList8.get(0);
            int S2 = RecyclerView.S(p61Var2);
            int i20 = 0;
            while (true) {
                if (i20 >= arrayList6.size()) {
                    h61Var = null;
                    break;
                } else {
                    if (((h61) arrayList6.get(i20)).M == S2) {
                        h61Var = (h61) arrayList6.get(i20);
                        arrayList6.remove(i20);
                        break;
                    }
                    i20++;
                }
            }
            if (h61Var == null) {
                if (arrayList2.isEmpty()) {
                    h61Var = new h61(this);
                    h61Var.l(7);
                } else {
                    h61Var = (h61) hg.k0.v(1, arrayList2);
                }
                h61Var.M = S2;
                h61Var.e();
            }
            arrayList7.add(h61Var);
            h61Var.O = arrayList8;
            canvas2.save();
            canvas2.translate(p61Var2.getLeft(), p61Var2.getY());
            h61Var.N = p61Var2.getLeft();
            int measuredWidth = getMeasuredWidth() - (p61Var2.getLeft() * 2);
            int measuredHeight = p61Var2.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                Canvas canvas3 = canvas2;
                h61Var.a(canvas3, currentTimeMillis, measuredWidth, measuredHeight, getAlpha());
                canvas2 = canvas3;
            }
            canvas2.restore();
            i19++;
        }
        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((h61) arrayList6.get(i21));
                ((h61) arrayList6.get(i21)).O = null;
                ((h61) arrayList6.get(i21)).k();
            } else {
                ((h61) arrayList6.get(i21)).f();
            }
        }
        arrayList6.clear();
        for (int i22 = 0; i22 < getChildCount(); i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof p61) {
                p61 p61Var3 = (p61) childAt2;
                o61 o61Var2 = p61Var3.J;
                if (o61Var2 != null && o61Var2.getVisibility() == 0) {
                    canvas2.save();
                    canvas2.translate((int) ((p61Var3.getX() + p61Var3.getMeasuredWidth()) - p61Var3.J.getMeasuredWidth()), (int) ((p61Var3.getY() + p61Var3.getMeasuredHeight()) - p61Var3.J.getMeasuredHeight()));
                    Drawable drawable2 = p61Var3.E;
                    ImageReceiver imageReceiver2 = drawable2 instanceof org.telegram.ui.Components.q5 ? ((org.telegram.ui.Components.q5) drawable2).k : p61Var3.h;
                    o61 o61Var3 = p61Var3.J;
                    if (!o61Var3.h) {
                        o61Var3.setImageReceiver(imageReceiver2);
                    }
                    p61Var3.J.draw(canvas2);
                    canvas2.restore();
                }
                if (p61Var3.K != null) {
                    canvas2.save();
                    int dp3 = AndroidUtilities.dp(17.0f);
                    float f16 = dp3;
                    canvas2.translate((int) ((p61Var3.getX() + p61Var3.getMeasuredWidth()) - f16), (int) ((p61Var3.getY() + p61Var3.getMeasuredHeight()) - f16));
                    p61Var3.K.setBounds(0, 0, dp3, dp3);
                    p61Var3.K.draw(canvas2);
                    canvas2.restore();
                }
            } else if (childAt2 != null && childAt2 != g71Var.M1) {
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

    @Override // org.telegram.ui.Components.wl0
    public final void g1() {
        if (zg.e0.b(this)) {
            return;
        }
        super.g1();
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.e0.b(this) || this.c3) {
            return;
        }
        this.c3 = true;
        super.invalidate();
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g71 g71Var = this.e3;
        if (this == g71Var.h0) {
            g71Var.V0.onAttachedToWindow();
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g71 g71Var = this.e3;
        if (this == g71Var.h0) {
            g71Var.V0.onDetachedFromWindow();
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
        if (zg.e0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
