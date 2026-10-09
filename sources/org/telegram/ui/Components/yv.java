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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yv extends FrameLayout {
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
    public final /* synthetic */ iw y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv(iw iwVar, Context context) {
        super(context);
        this.y = iwVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        hs hsVar = hs.h;
        this.s = new g6(this, 0L, 350L, hsVar);
        this.x = new g6(this, 0L, 320L, hsVar);
    }

    public final void a() {
        b6[] b6VarArr;
        iw iwVar = this.y;
        ci.v vVar = iwVar.h;
        if (vVar == null) {
            b6VarArr = new b6[0];
        } else {
            b6[] b6VarArr2 = new b6[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof zv) {
                    b6VarArr2[i10] = ((zv) childAt).c;
                }
            }
            b6VarArr = b6VarArr2;
        }
        iwVar.b = b6.update(3, this, b6VarArr, (LongSparseArray<s5>) iwVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f7;
        float f10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        xv xvVar;
        float f11;
        b6 b6Var;
        Canvas canvas2 = canvas;
        iw iwVar = this.y;
        jq jqVar = iwVar.F;
        ci.v vVar = iwVar.h;
        if (this.d) {
            int i10 = org.telegram.ui.ActionBar.i6.h5;
            int themedColor = iwVar.getThemedColor(i10);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.i6.m(paint);
            Path path = this.b;
            path.reset();
            float W = iwVar.W();
            viewGroup = ((org.telegram.ui.ActionBar.f3) iwVar).containerView;
            float e7 = this.s.e(W <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(W, 0.0f, e7);
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
            float dp3 = AndroidUtilities.dp((1.0f - e7) * 14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
            path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = e7 > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                boolean z11 = AndroidUtilities.computePerceivedBrightness(iwVar.getThemedColor(i10)) > 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v(iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.s8), 855638016)) > 0.721f;
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(iwVar, z11);
            }
            org.telegram.ui.ActionBar.i6.t0.setColor(iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
            org.telegram.ui.ActionBar.i6.t0.setAlpha((int) (w7.o.a(lerp / AndroidUtilities.dp(f10), f7, 1.0f) * org.telegram.ui.ActionBar.i6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.t0);
            iwVar.r.setVisibility((vVar.canScrollVertically(1) || iwVar.w.getVisibility() == 0) ? 0 : 4);
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
                    if (childAt instanceof zv) {
                        zv zvVar = (zv) childAt;
                        if (zvVar.isPressed()) {
                            float f16 = zvVar.e;
                            if (f16 != f14) {
                                zvVar.e = Utilities.clamp(f16 + 0.16f, f14, 0.0f);
                                zvVar.invalidate();
                            }
                        }
                        if (iwVar.b != null && (b6Var = zvVar.c) != null) {
                            s5 s5Var = (s5) iwVar.b.get(b6Var.getDocumentId());
                            if (s5Var != null) {
                                int themedColor2 = iwVar.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
                                if (themedColor2 != iwVar.U || iwVar.T == null) {
                                    iwVar.U = themedColor2;
                                    f11 = f14;
                                    iwVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                } else {
                                    f11 = f14;
                                }
                                s5Var.setColorFilter(iwVar.T);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.c.x(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(zvVar);
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
                    long j3 = currentTimeMillis;
                    float f18 = f15;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList5.size()) {
                            xvVar = null;
                            break;
                        } else {
                            if (((xv) arrayList5.get(i14)).M == R) {
                                xvVar = (xv) arrayList5.get(i14);
                                arrayList5.remove(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                    if (xvVar == null) {
                        if (arrayList2.isEmpty()) {
                            xvVar = new xv(this);
                            xvVar.l(7);
                        } else {
                            xvVar = (xv) hg.c.x(1, arrayList2);
                        }
                        xvVar.M = R;
                        xvVar.e();
                    }
                    arrayList6.add(xvVar);
                    xvVar.N = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    xv xvVar2 = xvVar;
                    currentTimeMillis = j3;
                    xvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i13++;
                    f15 = f18;
                }
                float f19 = f15;
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((xv) arrayList5.get(i15));
                        ((xv) arrayList5.get(i15)).N = null;
                        ((xv) arrayList5.get(i15)).k();
                    } else {
                        ((xv) arrayList5.get(i15)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (vVar.getAlpha() < f17) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    jqVar.setAlpha((int) ((f17 - vVar.getAlpha()) * f19));
                    jqVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    jqVar.draw(canvas2);
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
            iw iwVar = this.y;
            if (y3 < iwVar.W() - AndroidUtilities.dp(6.0f)) {
                iwVar.dismiss();
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
            ((xv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((xv) arrayList2.get(i10)).f();
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
