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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class su extends FrameLayout {
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final y5 s;
    public ImageReceiver v;
    public boolean w;
    public final y5 x;
    public final /* synthetic */ cv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(cv cvVar, Context context) {
        super(context);
        this.y = cvVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        er erVar = er.h;
        this.s = new y5(this, 0L, 350L, erVar);
        this.x = new y5(this, 0L, 320L, erVar);
    }

    public final void a() {
        t5[] t5VarArr;
        cv cvVar = this.y;
        lh.w wVar = cvVar.h;
        if (wVar == null) {
            t5VarArr = new t5[0];
        } else {
            t5[] t5VarArr2 = new t5[wVar.getChildCount()];
            for (int i10 = 0; i10 < wVar.getChildCount(); i10++) {
                View childAt = wVar.getChildAt(i10);
                if (childAt instanceof tu) {
                    t5VarArr2[i10] = ((tu) childAt).c;
                }
            }
            t5VarArr = t5VarArr2;
        }
        cvVar.b = t5.update(3, this, t5VarArr, (LongSparseArray<k5>) cvVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        ru ruVar;
        t5 t5Var;
        Canvas canvas2 = canvas;
        cv cvVar = this.y;
        hp hpVar = cvVar.B;
        lh.w wVar = cvVar.h;
        if (this.d) {
            int i10 = org.telegram.ui.ActionBar.g6.h5;
            int themedColor = cvVar.getThemedColor(i10);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.g6.m(paint);
            Path path = this.b;
            path.reset();
            float V = cvVar.V();
            viewGroup = ((org.telegram.ui.ActionBar.e3) cvVar).containerView;
            float e9 = this.s.e(V <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(V, 0.0f, e9);
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
            float dp3 = AndroidUtilities.dp((1.0f - e9) * 14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
            path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = e9 > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                boolean z11 = AndroidUtilities.computePerceivedBrightness(cvVar.getThemedColor(i10)) > 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f;
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(cvVar, z11);
            }
            org.telegram.ui.ActionBar.g6.t0.setColor(cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
            org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (h7.n.a(lerp / AndroidUtilities.dp(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.g6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            cvVar.r.setVisibility((wVar.canScrollVertically(1) || cvVar.w.getVisibility() == 0) ? 0 : 4);
            if (wVar != null) {
                canvas2.save();
                canvas2.translate(wVar.getLeft(), wVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, wVar.getWidth(), wVar.getHeight());
                canvas2.saveLayerAlpha(0.0f, 0.0f, wVar.getWidth(), wVar.getHeight(), (int) (wVar.getAlpha() * 255.0f), 31);
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
                while (i12 < wVar.getChildCount()) {
                    View childAt = wVar.getChildAt(i12);
                    if (childAt instanceof tu) {
                        tu tuVar = (tu) childAt;
                        if (tuVar.isPressed()) {
                            float f14 = tuVar.e;
                            if (f14 != f13) {
                                tuVar.e = Utilities.clamp(f14 + 0.16f, f13, 0.0f);
                                tuVar.invalidate();
                            }
                        }
                        if (cvVar.b != null && (t5Var = tuVar.c) != null) {
                            k5 k5Var = (k5) cvVar.b.get(t5Var.getDocumentId());
                            if (k5Var != null) {
                                int themedColor2 = cvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
                                if (themedColor2 != cvVar.Q || cvVar.P == null) {
                                    cvVar.Q = themedColor2;
                                    cvVar.P = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                }
                                k5Var.setColorFilter(cvVar.P);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) com.google.android.recaptcha.internal.a.k(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(tuVar);
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
                    wVar.getClass();
                    int R = RecyclerView.R(view);
                    long j10 = currentTimeMillis;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList5.size()) {
                            ruVar = null;
                            break;
                        } else {
                            if (((ru) arrayList5.get(i14)).I == R) {
                                ruVar = (ru) arrayList5.get(i14);
                                arrayList5.remove(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                    if (ruVar == null) {
                        if (arrayList2.isEmpty()) {
                            ruVar = new ru(this);
                            ruVar.l(7);
                        } else {
                            ruVar = (ru) com.google.android.recaptcha.internal.a.k(1, arrayList2);
                        }
                        ruVar.I = R;
                        ruVar.e();
                    }
                    arrayList6.add(ruVar);
                    ruVar.J = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    ru ruVar2 = ruVar;
                    currentTimeMillis = j10;
                    ruVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i13++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((ru) arrayList5.get(i15));
                        ((ru) arrayList5.get(i15)).J = null;
                        ((ru) arrayList5.get(i15)).k();
                    } else {
                        ((ru) arrayList5.get(i15)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (wVar.getAlpha() < 1.0f) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    hpVar.setAlpha((int) ((1.0f - wVar.getAlpha()) * 255.0f));
                    hpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    hpVar.draw(canvas2);
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
            cv cvVar = this.y;
            if (y10 < cvVar.V() - AndroidUtilities.dp(6.0f)) {
                cvVar.dismiss();
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
            ((ru) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((ru) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        t5.release(this, (LongSparseArray<k5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
