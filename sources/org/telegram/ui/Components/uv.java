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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class uv extends FrameLayout {
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final g6 s;
    public ImageReceiver v;
    public boolean w;
    public final g6 x;
    public final /* synthetic */ ew y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(ew ewVar, Context context) {
        super(context);
        this.y = ewVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        es esVar = es.h;
        this.s = new g6(this, 0L, 350L, esVar);
        this.x = new g6(this, 0L, 320L, esVar);
    }

    public final void a() {
        b6[] b6VarArr;
        ew ewVar = this.y;
        di.v vVar = ewVar.h;
        if (vVar == null) {
            b6VarArr = new b6[0];
        } else {
            b6[] b6VarArr2 = new b6[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof vv) {
                    b6VarArr2[i10] = ((vv) childAt).c;
                }
            }
            b6VarArr = b6VarArr2;
        }
        ewVar.b = b6.update(3, this, b6VarArr, (LongSparseArray<s5>) ewVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f7;
        float f10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        tv tvVar;
        float f11;
        b6 b6Var;
        Canvas canvas2 = canvas;
        ew ewVar = this.y;
        gq gqVar = ewVar.F;
        di.v vVar = ewVar.h;
        if (this.d) {
            int i10 = org.telegram.ui.ActionBar.g6.h5;
            int themedColor = ewVar.getThemedColor(i10);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.g6.m(paint);
            Path path = this.b;
            path.reset();
            float W = ewVar.W();
            viewGroup = ((org.telegram.ui.ActionBar.e3) ewVar).containerView;
            float e = this.s.e(W <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(W, 0.0f, e);
            if (this.v != null) {
                float dp = AndroidUtilities.dp(140.0f);
                f10 = 20.0f;
                float dp2 = AndroidUtilities.dp(20.0f);
                if (lerp < dp + dp2) {
                    this.w = false;
                }
                f7 = 0.0f;
                this.v.setAlpha(this.x.e(this.w));
                if (this.v.getAlpha() > 0.0f) {
                    float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                    float f12 = (lerp - dp2) - (dp / 2.0f);
                    float f13 = alpha / 2.0f;
                    this.v.setImageCoords((getWidth() / 2.0f) - f13, f12 - f13, alpha, alpha);
                    this.v.draw(canvas2);
                } else {
                    this.v.onDetachedFromWindow();
                    this.v = null;
                }
            } else {
                f7 = 0.0f;
                f10 = 20.0f;
            }
            float f14 = 1.0f;
            float dp3 = AndroidUtilities.dp((1.0f - e) * 14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
            path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = e > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                boolean z11 = AndroidUtilities.computePerceivedBrightness(ewVar.getThemedColor(i10)) > 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f;
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(ewVar, z11);
            }
            org.telegram.ui.ActionBar.g6.t0.setColor(ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
            org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (w7.s.a(lerp / AndroidUtilities.dp(f10), f7, 1.0f) * org.telegram.ui.ActionBar.g6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            ewVar.r.setVisibility((vVar.canScrollVertically(1) || ewVar.w.getVisibility() == 0) ? 0 : 4);
            if (vVar != null) {
                canvas2.save();
                canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
                float f15 = 255.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, vVar.getWidth(), vVar.getHeight(), (int) (vVar.getAlpha() * 255.0f), 31);
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
                while (i12 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i12);
                    if (childAt instanceof vv) {
                        vv vvVar = (vv) childAt;
                        if (vvVar.isPressed()) {
                            float f16 = vvVar.e;
                            if (f16 != f14) {
                                vvVar.e = Utilities.clamp(f16 + 0.16f, f14, 0.0f);
                                vvVar.invalidate();
                            }
                        }
                        if (ewVar.b != null && (b6Var = vvVar.c) != null) {
                            s5 s5Var = (s5) ewVar.b.get(b6Var.getDocumentId());
                            if (s5Var != null) {
                                int themedColor2 = ewVar.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
                                if (themedColor2 != ewVar.U || ewVar.T == null) {
                                    ewVar.U = themedColor2;
                                    f11 = f14;
                                    ewVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                } else {
                                    f11 = f14;
                                }
                                s5Var.setColorFilter(ewVar.T);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) i2.d.x(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(vvVar);
                            }
                        }
                        f11 = f14;
                    } else {
                        f11 = f14;
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i12++;
                    f14 = f11;
                }
                float f17 = f14;
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
                    vVar.getClass();
                    int R = RecyclerView.R(view);
                    long j10 = currentTimeMillis;
                    float f18 = f15;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList5.size()) {
                            tvVar = null;
                            break;
                        } else {
                            if (((tv) arrayList5.get(i14)).M == R) {
                                tvVar = (tv) arrayList5.get(i14);
                                arrayList5.remove(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                    if (tvVar == null) {
                        if (arrayList2.isEmpty()) {
                            tvVar = new tv(this);
                            tvVar.l(7);
                        } else {
                            tvVar = (tv) i2.d.x(1, arrayList2);
                        }
                        tvVar.M = R;
                        tvVar.e();
                    }
                    arrayList6.add(tvVar);
                    tvVar.N = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    tv tvVar2 = tvVar;
                    currentTimeMillis = j10;
                    tvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i13++;
                    f15 = f18;
                }
                float f19 = f15;
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((tv) arrayList5.get(i15));
                        ((tv) arrayList5.get(i15)).N = null;
                        ((tv) arrayList5.get(i15)).k();
                    } else {
                        ((tv) arrayList5.get(i15)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (vVar.getAlpha() < f17) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    gqVar.setAlpha((int) ((f17 - vVar.getAlpha()) * f19));
                    gqVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    gqVar.draw(canvas2);
                    invalidate();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            ew ewVar = this.y;
            if (y3 < ewVar.W() - AndroidUtilities.dp(6.0f)) {
                ewVar.dismiss();
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
            ((tv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((tv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        b6.release(this, (LongSparseArray<s5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
