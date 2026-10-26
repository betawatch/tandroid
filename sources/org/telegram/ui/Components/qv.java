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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public final h6 s;
    public ImageReceiver v;
    public boolean w;
    public final h6 x;
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
        ds dsVar = ds.h;
        this.s = new h6(this, 0L, 350L, dsVar);
        this.x = new h6(this, 0L, 320L, dsVar);
    }

    public final void a() {
        c6[] c6VarArr;
        aw awVar = this.y;
        fi.v vVar = awVar.h;
        if (vVar == null) {
            c6VarArr = new c6[0];
        } else {
            c6[] c6VarArr2 = new c6[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof rv) {
                    c6VarArr2[i10] = ((rv) childAt).c;
                }
            }
            c6VarArr = c6VarArr2;
        }
        awVar.b = c6.update(3, this, c6VarArr, (LongSparseArray<t5>) awVar.b);
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
        float f12;
        c6 c6Var;
        Canvas canvas2 = canvas;
        aw awVar = this.y;
        gq gqVar = awVar.F;
        fi.v vVar = awVar.h;
        if (this.d) {
            int themedColor = awVar.getThemedColor(org.telegram.ui.ActionBar.y6.h5);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.y6.m(paint);
            Path path = this.b;
            path.reset();
            float f02 = awVar.f0();
            viewGroup = ((org.telegram.ui.ActionBar.k3) awVar).containerView;
            float e = this.s.e(f02 <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(f02, 0.0f, e);
            if (this.v != null) {
                float dp = AndroidUtilities.dp(140.0f);
                f7 = 20.0f;
                float dp2 = AndroidUtilities.dp(20.0f);
                if (lerp < dp + dp2) {
                    this.w = false;
                }
                f10 = 2.0f;
                this.v.setAlpha(this.x.e(this.w));
                if (this.v.getAlpha() > 0.0f) {
                    float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                    float f13 = alpha / 2.0f;
                    this.v.setImageCoords((getWidth() / 2.0f) - f13, ((lerp - dp2) - (dp / 2.0f)) - f13, alpha, alpha);
                    this.v.draw(canvas2);
                } else {
                    this.v.onDetachedFromWindow();
                    this.v = null;
                }
            } else {
                f7 = 20.0f;
                f10 = 2.0f;
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
                awVar.l0(z10);
            }
            org.telegram.ui.ActionBar.y6.t0.setColor(awVar.getThemedColor(org.telegram.ui.ActionBar.y6.Ii));
            org.telegram.ui.ActionBar.y6.t0.setAlpha((int) (a8.ee.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.y6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), org.telegram.ui.ActionBar.y6.t0);
            awVar.r.setVisibility((vVar.canScrollVertically(1) || awVar.w.getVisibility() == 0) ? 0 : 4);
            if (vVar != null) {
                canvas2.save();
                canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
                float f15 = 255.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, vVar.getWidth(), vVar.getHeight(), (int) (vVar.getAlpha() * 255.0f), 31);
                int i10 = 0;
                while (true) {
                    sparseArray = this.e;
                    int size = sparseArray.size();
                    arrayList = this.n;
                    if (i10 >= size) {
                        break;
                    }
                    ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
                    arrayList3.clear();
                    arrayList.add(arrayList3);
                    i10++;
                }
                sparseArray.clear();
                int i11 = 0;
                while (i11 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i11);
                    if (childAt instanceof rv) {
                        rv rvVar = (rv) childAt;
                        if (rvVar.isPressed()) {
                            float f16 = rvVar.e;
                            if (f16 != f14) {
                                rvVar.e = Utilities.clamp(f16 + 0.16f, f14, 0.0f);
                                rvVar.invalidate();
                            }
                        }
                        if (awVar.b == null || (c6Var = rvVar.c) == null) {
                            f11 = f14;
                        } else {
                            f11 = f14;
                            t5 t5Var = (t5) awVar.b.get(c6Var.getDocumentId());
                            if (t5Var != null) {
                                int themedColor2 = awVar.getThemedColor(org.telegram.ui.ActionBar.y6.G6);
                                if (themedColor2 != awVar.U || awVar.T == null) {
                                    awVar.U = themedColor2;
                                    f12 = f15;
                                    awVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                } else {
                                    f12 = f15;
                                }
                                t5Var.setColorFilter(awVar.T);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) ic.a.y(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(rvVar);
                            }
                        }
                        f12 = f15;
                    } else {
                        f11 = f14;
                        f12 = f15;
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i11++;
                    f14 = f11;
                    f15 = f12;
                }
                float f17 = f14;
                float f18 = f15;
                ArrayList arrayList5 = this.h;
                arrayList5.clear();
                ArrayList arrayList6 = this.f;
                arrayList5.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                int i12 = 0;
                while (true) {
                    int size2 = sparseArray.size();
                    arrayList2 = this.r;
                    if (i12 >= size2) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
                    View view = (View) arrayList7.get(0);
                    vVar.getClass();
                    int R = RecyclerView.R(view);
                    long j10 = currentTimeMillis;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList5.size()) {
                            pvVar = null;
                            break;
                        } else {
                            if (((pv) arrayList5.get(i13)).M == R) {
                                pvVar = (pv) arrayList5.get(i13);
                                arrayList5.remove(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (pvVar == null) {
                        if (arrayList2.isEmpty()) {
                            pvVar = new pv(this);
                            pvVar.l(7);
                        } else {
                            pvVar = (pv) ic.a.y(1, arrayList2);
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
                    i12++;
                }
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((pv) arrayList5.get(i14));
                        ((pv) arrayList5.get(i14)).N = null;
                        ((pv) arrayList5.get(i14)).k();
                    } else {
                        ((pv) arrayList5.get(i14)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (vVar.getAlpha() < f17) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    gqVar.setAlpha((int) ((f17 - vVar.getAlpha()) * f18));
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
            aw awVar = this.y;
            if (y3 < awVar.f0() - AndroidUtilities.dp(6.0f)) {
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
        c6.release(this, (LongSparseArray<t5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
