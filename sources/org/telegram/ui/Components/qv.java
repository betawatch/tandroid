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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class qv extends FrameLayout {
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final f6 s;
    public ImageReceiver v;
    public boolean w;
    public final f6 x;
    public final /* synthetic */ aw y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(aw awVar, Context context) {
        super(context);
        this.y = awVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        bs bsVar = bs.h;
        this.s = new f6(this, 0L, 350L, bsVar);
        this.x = new f6(this, 0L, 320L, bsVar);
    }

    public final void a() {
        a6[] a6VarArr;
        aw awVar = this.y;
        ei.v vVar = awVar.h;
        if (vVar == null) {
            a6VarArr = new a6[0];
        } else {
            a6[] a6VarArr2 = new a6[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof rv) {
                    a6VarArr2[i10] = ((rv) childAt).c;
                }
            }
            a6VarArr = a6VarArr2;
        }
        awVar.b = a6.update(3, this, a6VarArr, (LongSparseArray<r5>) awVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f7;
        float f10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        pv pvVar;
        float f11;
        a6 a6Var;
        Canvas canvas2 = canvas;
        aw awVar = this.y;
        dq dqVar = awVar.F;
        ei.v vVar = awVar.h;
        if (this.d) {
            int i10 = org.telegram.ui.ActionBar.h6.h5;
            int themedColor = awVar.getThemedColor(i10);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.h6.m(paint);
            Path path = this.b;
            path.reset();
            float W = awVar.W();
            viewGroup = ((org.telegram.ui.ActionBar.f3) awVar).containerView;
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
                boolean z11 = AndroidUtilities.computePerceivedBrightness(awVar.getThemedColor(i10)) > 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(awVar.getThemedColor(org.telegram.ui.ActionBar.h6.s8), 855638016)) > 0.721f;
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(awVar, z11);
            }
            org.telegram.ui.ActionBar.h6.t0.setColor(awVar.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
            org.telegram.ui.ActionBar.h6.t0.setAlpha((int) (w7.r.a(lerp / AndroidUtilities.dp(f10), f7, 1.0f) * org.telegram.ui.ActionBar.h6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.t0);
            awVar.r.setVisibility((vVar.canScrollVertically(1) || awVar.w.getVisibility() == 0) ? 0 : 4);
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
                    if (childAt instanceof rv) {
                        rv rvVar = (rv) childAt;
                        if (rvVar.isPressed()) {
                            float f16 = rvVar.e;
                            if (f16 != f14) {
                                rvVar.e = Utilities.clamp(f16 + 0.16f, f14, 0.0f);
                                rvVar.invalidate();
                            }
                        }
                        if (awVar.b != null && (a6Var = rvVar.c) != null) {
                            r5 r5Var = (r5) awVar.b.get(a6Var.getDocumentId());
                            if (r5Var != null) {
                                int themedColor2 = awVar.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
                                if (themedColor2 != awVar.U || awVar.T == null) {
                                    awVar.U = themedColor2;
                                    f11 = f14;
                                    awVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                } else {
                                    f11 = f14;
                                }
                                r5Var.setColorFilter(awVar.T);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) i2.e.A(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(rvVar);
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
                            pvVar = null;
                            break;
                        } else {
                            if (((pv) arrayList5.get(i14)).M == R) {
                                pvVar = (pv) arrayList5.get(i14);
                                arrayList5.remove(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                    if (pvVar == null) {
                        if (arrayList2.isEmpty()) {
                            pvVar = new pv(this);
                            pvVar.l(7);
                        } else {
                            pvVar = (pv) i2.e.A(1, arrayList2);
                        }
                        pvVar.M = R;
                        pvVar.e();
                    }
                    arrayList6.add(pvVar);
                    pvVar.N = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    pv pvVar2 = pvVar;
                    currentTimeMillis = j10;
                    pvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i13++;
                    f15 = f18;
                }
                float f19 = f15;
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((pv) arrayList5.get(i15));
                        ((pv) arrayList5.get(i15)).N = null;
                        ((pv) arrayList5.get(i15)).k();
                    } else {
                        ((pv) arrayList5.get(i15)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (vVar.getAlpha() < f17) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    dqVar.setAlpha((int) ((f17 - vVar.getAlpha()) * f19));
                    dqVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    dqVar.draw(canvas2);
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
            aw awVar = this.y;
            if (y3 < awVar.W() - AndroidUtilities.dp(6.0f)) {
                awVar.dismiss();
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
            ((pv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((pv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        a6.release(this, (LongSparseArray<r5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
