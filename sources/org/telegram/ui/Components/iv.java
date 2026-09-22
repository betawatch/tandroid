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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class iv extends FrameLayout {
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final c6 s;
    public ImageReceiver v;
    public boolean w;
    public final c6 x;
    public final /* synthetic */ sv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(sv svVar, Context context) {
        super(context);
        this.y = svVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        qr qrVar = qr.h;
        this.s = new c6(this, 0L, 350L, qrVar);
        this.x = new c6(this, 0L, 320L, qrVar);
    }

    public final void a() {
        x5[] x5VarArr;
        sv svVar = this.y;
        ci.v vVar = svVar.h;
        if (vVar == null) {
            x5VarArr = new x5[0];
        } else {
            x5[] x5VarArr2 = new x5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof jv) {
                    x5VarArr2[i10] = ((jv) childAt).c;
                }
            }
            x5VarArr = x5VarArr2;
        }
        svVar.b = x5.update(3, this, x5VarArr, (LongSparseArray<o5>) svVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f7;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        hv hvVar;
        x5 x5Var;
        Canvas canvas2 = canvas;
        sv svVar = this.y;
        tp tpVar = svVar.F;
        ci.v vVar = svVar.h;
        if (this.d) {
            int i10 = org.telegram.ui.ActionBar.i6.h5;
            int themedColor = svVar.getThemedColor(i10);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.i6.m(paint);
            Path path = this.b;
            path.reset();
            float V = svVar.V();
            viewGroup = ((org.telegram.ui.ActionBar.f3) svVar).containerView;
            float e = this.s.e(V <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(V, 0.0f, e);
            if (this.v != null) {
                float dp = AndroidUtilities.dp(140.0f);
                f7 = 20.0f;
                float dp2 = AndroidUtilities.dp(20.0f);
                if (lerp < dp + dp2) {
                    this.w = false;
                }
                this.v.setAlpha(this.x.e(this.w));
                if (this.v.getAlpha() > 0.0f) {
                    float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                    float f10 = (lerp - dp2) - (dp / 2.0f);
                    float f11 = alpha / 2.0f;
                    this.v.setImageCoords((getWidth() / 2.0f) - f11, f10 - f11, alpha, alpha);
                    this.v.draw(canvas2);
                } else {
                    this.v.onDetachedFromWindow();
                    this.v = null;
                }
            } else {
                f7 = 20.0f;
            }
            float f12 = 1.0f;
            float dp3 = AndroidUtilities.dp((1.0f - e) * 14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
            path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = e > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                boolean z11 = AndroidUtilities.computePerceivedBrightness(svVar.getThemedColor(i10)) > 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v(svVar.getThemedColor(org.telegram.ui.ActionBar.i6.s8), 855638016)) > 0.721f;
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(svVar, z11);
            }
            org.telegram.ui.ActionBar.i6.t0.setColor(svVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
            org.telegram.ui.ActionBar.i6.t0.setAlpha((int) (w7.p.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.i6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.t0);
            svVar.r.setVisibility((vVar.canScrollVertically(1) || svVar.w.getVisibility() == 0) ? 0 : 4);
            if (vVar != null) {
                canvas2.save();
                canvas2.translate(vVar.getLeft(), vVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, vVar.getWidth(), vVar.getHeight());
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
                    if (childAt instanceof jv) {
                        jv jvVar = (jv) childAt;
                        if (jvVar.isPressed()) {
                            float f13 = jvVar.e;
                            if (f13 != f12) {
                                jvVar.e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                                jvVar.invalidate();
                            }
                        }
                        if (svVar.b != null && (x5Var = jvVar.c) != null) {
                            o5 o5Var = (o5) svVar.b.get(x5Var.getDocumentId());
                            if (o5Var != null) {
                                int themedColor2 = svVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                                if (themedColor2 != svVar.U || svVar.T == null) {
                                    svVar.U = themedColor2;
                                    svVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                }
                                o5Var.setColorFilter(svVar.T);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.c.z(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(jvVar);
                            }
                        }
                    } else {
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i12++;
                    f12 = 1.0f;
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
                    vVar.getClass();
                    int R = RecyclerView.R(view);
                    long j3 = currentTimeMillis;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList5.size()) {
                            hvVar = null;
                            break;
                        } else {
                            if (((hv) arrayList5.get(i14)).M == R) {
                                hvVar = (hv) arrayList5.get(i14);
                                arrayList5.remove(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                    if (hvVar == null) {
                        if (arrayList2.isEmpty()) {
                            hvVar = new hv(this);
                            hvVar.l(7);
                        } else {
                            hvVar = (hv) hg.c.z(1, arrayList2);
                        }
                        hvVar.M = R;
                        hvVar.e();
                    }
                    arrayList6.add(hvVar);
                    hvVar.N = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    hv hvVar2 = hvVar;
                    currentTimeMillis = j3;
                    hvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i13++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((hv) arrayList5.get(i15));
                        ((hv) arrayList5.get(i15)).N = null;
                        ((hv) arrayList5.get(i15)).k();
                    } else {
                        ((hv) arrayList5.get(i15)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (vVar.getAlpha() < 1.0f) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    tpVar.setAlpha((int) ((1.0f - vVar.getAlpha()) * 255.0f));
                    tpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    tpVar.draw(canvas2);
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
            sv svVar = this.y;
            if (y3 < svVar.V() - AndroidUtilities.dp(6.0f)) {
                svVar.dismiss();
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
            ((hv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((hv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        x5.release(this, (LongSparseArray<o5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
