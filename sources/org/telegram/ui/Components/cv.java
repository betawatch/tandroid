package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cv extends FrameLayout {
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final z5 s;
    public ImageReceiver v;
    public boolean w;
    public final z5 x;
    public final /* synthetic */ mv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(mv mvVar, Context context) {
        super(context);
        this.y = mvVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        nr nrVar = nr.h;
        this.s = new z5(this, 0L, 350L, nrVar);
        this.x = new z5(this, 0L, 320L, nrVar);
    }

    public final void a() {
        u5[] u5VarArr;
        mv mvVar = this.y;
        org.telegram.ui.k3 k3Var = mvVar.h;
        if (k3Var == null) {
            u5VarArr = new u5[0];
        } else {
            u5[] u5VarArr2 = new u5[k3Var.getChildCount()];
            for (int i10 = 0; i10 < k3Var.getChildCount(); i10++) {
                View childAt = k3Var.getChildAt(i10);
                if (childAt instanceof dv) {
                    u5VarArr2[i10] = ((dv) childAt).c;
                }
            }
            u5VarArr = u5VarArr2;
        }
        mvVar.b = u5.update(3, this, u5VarArr, (LongSparseArray<l5>) mvVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        bv bvVar;
        u5 u5Var;
        Canvas canvas2 = canvas;
        mv mvVar = this.y;
        rp rpVar = mvVar.C;
        org.telegram.ui.k3 k3Var = mvVar.h;
        if (this.d) {
            int i10 = org.telegram.ui.ActionBar.j6.h5;
            int themedColor = mvVar.getThemedColor(i10);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.j6.m(paint);
            Path path = this.b;
            path.reset();
            float V = mvVar.V();
            viewGroup = ((org.telegram.ui.ActionBar.g3) mvVar).containerView;
            float e = this.s.e(V <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(V, 0.0f, e);
            if (this.v != null) {
                float dp = AndroidUtilities.dp(140.0f);
                f10 = 20.0f;
                float dp2 = AndroidUtilities.dp(20.0f);
                if (lerp < dp + dp2) {
                    this.w = false;
                }
                this.v.setAlpha(this.x.e(this.w));
                if (this.v.getAlpha() > 0.0f) {
                    float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                    float f11 = (lerp - dp2) - (dp / 2.0f);
                    float f12 = alpha / 2.0f;
                    this.v.setImageCoords((getWidth() / 2.0f) - f12, f11 - f12, alpha, alpha);
                    this.v.draw(canvas2);
                } else {
                    this.v.onDetachedFromWindow();
                    this.v = null;
                }
            } else {
                f10 = 20.0f;
            }
            float f13 = 1.0f;
            float dp3 = AndroidUtilities.dp((1.0f - e) * 14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
            path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z4 = e > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z4 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z4);
                boolean z10 = AndroidUtilities.computePerceivedBrightness(mvVar.getThemedColor(i10)) > 0.721f;
                boolean z11 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
                if (!z4) {
                    z10 = z11;
                }
                AndroidUtilities.setLightStatusBar(mvVar, z10);
            }
            org.telegram.ui.ActionBar.j6.t0.setColor(mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
            org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (k7.n.a(lerp / AndroidUtilities.dp(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.j6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
            mvVar.r.setVisibility((k3Var.canScrollVertically(1) || mvVar.w.getVisibility() == 0) ? 0 : 4);
            if (k3Var != null) {
                canvas2.save();
                canvas2.translate(k3Var.getLeft(), k3Var.getY() + 0.0f);
                canvas2.clipRect(0, 0, k3Var.getWidth(), k3Var.getHeight());
                canvas2.saveLayerAlpha(0.0f, 0.0f, k3Var.getWidth(), k3Var.getHeight(), (int) (k3Var.getAlpha() * 255.0f), 31);
                int i11 = 0;
                while (true) {
                    sparseArray = this.e;
                    int size = sparseArray.size();
                    arrayList = this.n;
                    if (i11 >= size) {
                        break;
                    }
                    ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
                    arrayList3.clear();
                    arrayList.add(arrayList3);
                    i11++;
                }
                sparseArray.clear();
                int i12 = 0;
                while (i12 < k3Var.getChildCount()) {
                    View childAt = k3Var.getChildAt(i12);
                    if (childAt instanceof dv) {
                        dv dvVar = (dv) childAt;
                        if (dvVar.isPressed()) {
                            float f14 = dvVar.e;
                            if (f14 != f13) {
                                dvVar.e = Utilities.clamp(f14 + 0.16f, f13, 0.0f);
                                dvVar.invalidate();
                            }
                        }
                        if (mvVar.b != null && (u5Var = dvVar.c) != null) {
                            l5 l5Var = (l5) mvVar.b.get(u5Var.getDocumentId());
                            if (l5Var != null) {
                                int themedColor2 = mvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                                if (themedColor2 != mvVar.R || mvVar.Q == null) {
                                    mvVar.R = themedColor2;
                                    mvVar.Q = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                }
                                l5Var.setColorFilter(mvVar.Q);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) e2.c.g(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(dvVar);
                            }
                        }
                    } else {
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i12++;
                    f13 = 1.0f;
                }
                ArrayList arrayList5 = this.h;
                arrayList5.clear();
                ArrayList arrayList6 = this.f;
                arrayList5.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                int i13 = 0;
                while (true) {
                    int size2 = sparseArray.size();
                    arrayList2 = this.r;
                    if (i13 >= size2) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
                    View view = (View) arrayList7.get(0);
                    k3Var.getClass();
                    int R = RecyclerView.R(view);
                    long j10 = currentTimeMillis;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList5.size()) {
                            bvVar = null;
                            break;
                        } else {
                            if (((bv) arrayList5.get(i14)).J == R) {
                                bvVar = (bv) arrayList5.get(i14);
                                arrayList5.remove(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                    if (bvVar == null) {
                        if (arrayList2.isEmpty()) {
                            bvVar = new bv(this);
                            bvVar.l(7);
                        } else {
                            bvVar = (bv) e2.c.g(1, arrayList2);
                        }
                        bvVar.J = R;
                        bvVar.e();
                    }
                    arrayList6.add(bvVar);
                    bvVar.K = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    bv bvVar2 = bvVar;
                    currentTimeMillis = j10;
                    bvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i13++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((bv) arrayList5.get(i15));
                        ((bv) arrayList5.get(i15)).K = null;
                        ((bv) arrayList5.get(i15)).k();
                    } else {
                        ((bv) arrayList5.get(i15)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (k3Var.getAlpha() < 1.0f) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    rpVar.setAlpha((int) ((1.0f - k3Var.getAlpha()) * 255.0f));
                    rpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    rpVar.draw(canvas2);
                    invalidate();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            mv mvVar = this.y;
            if (y10 < mvVar.V() - AndroidUtilities.dp(6.0f)) {
                mvVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        int i10 = 0;
        this.d = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((bv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((bv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        u5.release(this, (LongSparseArray<l5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
