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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zu extends FrameLayout {
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final d6 s;
    public ImageReceiver v;
    public boolean w;
    public final d6 x;
    public final /* synthetic */ jv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(jv jvVar, Context context) {
        super(context);
        this.y = jvVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        jr jrVar = jr.h;
        this.s = new d6(this, 0L, 350L, jrVar);
        this.x = new d6(this, 0L, 320L, jrVar);
    }

    public final void a() {
        y5[] y5VarArr;
        jv jvVar = this.y;
        nh.v vVar = jvVar.h;
        if (vVar == null) {
            y5VarArr = new y5[0];
        } else {
            y5[] y5VarArr2 = new y5[vVar.getChildCount()];
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (childAt instanceof av) {
                    y5VarArr2[i10] = ((av) childAt).c;
                }
            }
            y5VarArr = y5VarArr2;
        }
        jvVar.b = y5.update(3, this, y5VarArr, (LongSparseArray<p5>) jvVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f9;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        yu yuVar;
        y5 y5Var;
        Canvas canvas2 = canvas;
        jv jvVar = this.y;
        np npVar = jvVar.B;
        nh.v vVar = jvVar.h;
        if (this.d) {
            int i10 = org.telegram.ui.ActionBar.g6.h5;
            int themedColor = jvVar.getThemedColor(i10);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.g6.m(paint);
            Path path = this.b;
            path.reset();
            float V = jvVar.V();
            viewGroup = ((org.telegram.ui.ActionBar.f3) jvVar).containerView;
            float e10 = this.s.e(V <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(V, 0.0f, e10);
            if (this.v != null) {
                float dp = AndroidUtilities.dp(140.0f);
                f9 = 20.0f;
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
                f9 = 20.0f;
            }
            float f12 = 1.0f;
            float dp3 = AndroidUtilities.dp((1.0f - e10) * 14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
            path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = e10 > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                boolean z11 = AndroidUtilities.computePerceivedBrightness(jvVar.getThemedColor(i10)) > 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.s8), 855638016)) > 0.721f;
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(jvVar, z11);
            }
            org.telegram.ui.ActionBar.g6.t0.setColor(jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
            org.telegram.ui.ActionBar.g6.t0.setAlpha((int) (i7.w.a(lerp / AndroidUtilities.dp(f9), 0.0f, 1.0f) * org.telegram.ui.ActionBar.g6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
            jvVar.r.setVisibility((vVar.canScrollVertically(1) || jvVar.w.getVisibility() == 0) ? 0 : 4);
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
                    if (childAt instanceof av) {
                        av avVar = (av) childAt;
                        if (avVar.isPressed()) {
                            float f13 = avVar.e;
                            if (f13 != f12) {
                                avVar.e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                                avVar.invalidate();
                            }
                        }
                        if (jvVar.b != null && (y5Var = avVar.c) != null) {
                            p5 p5Var = (p5) jvVar.b.get(y5Var.getDocumentId());
                            if (p5Var != null) {
                                int themedColor2 = jvVar.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
                                if (themedColor2 != jvVar.Q || jvVar.P == null) {
                                    jvVar.Q = themedColor2;
                                    jvVar.P = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                }
                                p5Var.setColorFilter(jvVar.P);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) com.google.android.recaptcha.internal.a.j(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(avVar);
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
                    long j10 = currentTimeMillis;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList5.size()) {
                            yuVar = null;
                            break;
                        } else {
                            if (((yu) arrayList5.get(i14)).I == R) {
                                yuVar = (yu) arrayList5.get(i14);
                                arrayList5.remove(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                    if (yuVar == null) {
                        if (arrayList2.isEmpty()) {
                            yuVar = new yu(this);
                            yuVar.l(7);
                        } else {
                            yuVar = (yu) com.google.android.recaptcha.internal.a.j(1, arrayList2);
                        }
                        yuVar.I = R;
                        yuVar.e();
                    }
                    arrayList6.add(yuVar);
                    yuVar.J = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    yu yuVar2 = yuVar;
                    currentTimeMillis = j10;
                    yuVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i13++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((yu) arrayList5.get(i15));
                        ((yu) arrayList5.get(i15)).J = null;
                        ((yu) arrayList5.get(i15)).k();
                    } else {
                        ((yu) arrayList5.get(i15)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (vVar.getAlpha() < 1.0f) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    npVar.setAlpha((int) ((1.0f - vVar.getAlpha()) * 255.0f));
                    npVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    npVar.draw(canvas2);
                    invalidate();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y8 = motionEvent.getY();
            jv jvVar = this.y;
            if (y8 < jvVar.V() - AndroidUtilities.dp(6.0f)) {
                jvVar.dismiss();
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
            ((yu) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((yu) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        y5.release(this, (LongSparseArray<p5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
