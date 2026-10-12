package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class iy extends mm0 {
    public boolean V2;
    public final SparseArray W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public int b3;
    public SparseArray c3;
    public final /* synthetic */ wz d3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(wz wzVar, Context context) {
        super(context, null);
        this.d3 = wzVar;
        this.W2 = new SparseArray();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = -1;
        new SparseIntArray();
        es esVar = es.f;
    }

    @Override // org.telegram.ui.Components.mm0
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        boolean z10;
        Canvas canvas2 = canvas;
        wz wzVar = this.d3;
        iy iyVar = wzVar.P;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.b3 != getChildCount()) {
            z1();
            this.b3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.W2;
            int size = sparseArray.size();
            arrayList = this.Z2;
            if (i12 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i12);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i12++;
        }
        sparseArray.clear();
        int i13 = 1;
        boolean z11 = wzVar.u2 > 0 && SystemClock.elapsedRealtime() - wzVar.u2 < x1() && wzVar.r2 != null && wzVar.s2 >= 0;
        float f7 = 0.0f;
        if (wzVar.d2 != null && iyVar != null) {
            int i14 = 0;
            while (i14 < iyVar.getChildCount()) {
                View childAt = iyVar.getChildAt(i14);
                if (childAt instanceof ez) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) i2.d.x(i13, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ez) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == wzVar.s2 - i13) {
                    z10 = z11;
                    float interpolation = es.g.getInterpolation(w7.s.a((SystemClock.elapsedRealtime() - wzVar.u2) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        wzVar.r2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i10 = i14;
                    z10 = z11;
                }
                i14 = i10 + 1;
                z11 = z10;
                f7 = 0.0f;
                i13 = 1;
            }
        }
        ArrayList arrayList5 = this.Y2;
        arrayList5.clear();
        ArrayList arrayList6 = this.X2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            gy gyVar = null;
            arrayList2 = this.a3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            ez ezVar = (ez) arrayList7.get(i11);
            int i16 = ezVar.a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                }
                if (((gy) arrayList5.get(i17)).M == i16) {
                    gyVar = (gy) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                }
                i17++;
            }
            if (gyVar == null) {
                gyVar = !arrayList2.isEmpty() ? (gy) i2.d.x(1, arrayList2) : new gy(this);
                gyVar.M = i16;
                gyVar.e();
            }
            arrayList6.add(gyVar);
            gyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(ezVar.getLeft(), ezVar.getY() + ezVar.getPaddingTop());
            gyVar.N = ezVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (ezVar.getLeft() * 2);
            int measuredHeight = ezVar.getMeasuredHeight() - ezVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                gyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((gy) arrayList5.get(i18));
                ((gy) arrayList5.get(i18)).O = null;
                ((gy) arrayList5.get(i18)).k();
            } else {
                ((gy) arrayList5.get(i18)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        wz wzVar = this.d3;
        iy iyVar = wzVar.P;
        wzVar.m2.h++;
        if (this.b3 != getChildCount()) {
            z1();
            this.b3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.W2;
            int size = sparseArray.size();
            arrayList = this.Z2;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        boolean z10 = wzVar.u2 > 0 && SystemClock.elapsedRealtime() - wzVar.u2 < x1() && wzVar.r2 != null && wzVar.s2 >= 0;
        if (wzVar.d2 != null && iyVar != null) {
            for (int i12 = 0; i12 < iyVar.getChildCount(); i12++) {
                View childAt = iyVar.getChildAt(i12);
                if (childAt instanceof ez) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) i2.d.x(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ez) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == wzVar.s2 - 1) {
                    float interpolation = es.g.getInterpolation(w7.s.a((SystemClock.elapsedRealtime() - wzVar.u2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        wzVar.r2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.Y2;
        arrayList5.clear();
        ArrayList arrayList6 = this.X2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            gy gyVar = null;
            arrayList2 = this.a3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            ez ezVar = (ez) arrayList7.get(i10);
            int i14 = ezVar.a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                }
                if (((gy) arrayList5.get(i15)).M == i14) {
                    gyVar = (gy) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                }
                i15++;
            }
            if (gyVar == null) {
                gyVar = !arrayList2.isEmpty() ? (gy) i2.d.x(1, arrayList2) : new gy(this);
                gyVar.M = i14;
                gyVar.e();
            }
            arrayList6.add(gyVar);
            gyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(ezVar.getLeft(), ezVar.getY() + ezVar.getPaddingTop());
            gyVar.N = ezVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (ezVar.getLeft() * 2);
            int measuredHeight = ezVar.getMeasuredHeight() - ezVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                gyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((gy) arrayList5.get(i16));
                ((gy) arrayList5.get(i16)).O = null;
                ((gy) arrayList5.get(i16)).k();
            } else {
                ((gy) arrayList5.get(i16)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z11 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z12 = motionEvent.getActionMasked() == 3;
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.c3 == null) {
                this.c3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (!z10) {
                hy hyVar = (hy) this.c3.get(pointerId);
                this.c3.remove(pointerId);
                if (E != null && hyVar != null) {
                    if (Math.sqrt(Math.pow(y3 - hyVar.b, 2.0d) + Math.pow(x10 - hyVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        wz wzVar = this.d3;
                        if (!wzVar.B1.isShowing() || SystemClock.elapsedRealtime() - hyVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = hyVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ez) {
                                    wz.d(wzVar, (ez) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof ly) {
                                    wzVar.R.E(R, (ly) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (hyVar != null && (hyVar.d.getBackground() instanceof RippleDrawable)) {
                    hyVar.d.getBackground().setState(new int[0]);
                }
                if (hyVar != null) {
                    hyVar.d.setPressed(false);
                }
            } else if (E != null) {
                hy hyVar2 = new hy();
                hyVar2.a = x10;
                hyVar2.b = y3;
                hyVar2.c = SystemClock.elapsedRealtime();
                hyVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                hyVar2.d.setPressed(true);
                this.c3.put(pointerId, hyVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.c3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            wz wzVar = this.d3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                wzVar.M(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            wz.e(wzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z1();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        b6.release(this, (LongSparseArray<s5>) this.d3.d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.X2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((gy) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.a3;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((gy) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wz wzVar = this.d3;
        if (wzVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.xt.q().r(motionEvent, this, wzVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wz wzVar = this.d3;
        if (wzVar.d0 && wzVar.c0) {
            this.V2 = true;
            wzVar.Q.h1(0, 0);
            wzVar.c0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        wzVar.l(true);
        z1();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.V2 = true;
        int size = View.MeasureSpec.getSize(i10);
        wz wzVar = this.d3;
        vx vxVar = wzVar.Q;
        int i12 = vxVar.J;
        vxVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.V2 = false;
        super.onMeasure(i10, i11);
        if (i12 != vxVar.J) {
            wzVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wz wzVar = this.d3;
        int[] iArr = wzVar.D1;
        jv jvVar = wzVar.B1;
        if (wzVar.R1 != null && jvVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (jvVar != null && jvVar.isShowing() && !jvVar.d) {
                    jvVar.dismiss();
                    int i10 = jvVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) wzVar.R1.getTag();
                    if (wzVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            wz.d(wzVar, wzVar.R1, wz.g(replace, str));
                        } else {
                            wz.d(wzVar, wzVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = wz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        wzVar.R1.a(Emoji.getEmojiBigDrawable(str2), wzVar.R1.c);
                        wz.d(wzVar, wzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (jvVar == null || !jvVar.d) {
                    wzVar.R1 = null;
                }
                wzVar.U1 = -10000.0f;
                wzVar.V1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f7 = wzVar.U1;
                if (f7 != -10000.0f) {
                    if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(wzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        wzVar.U1 = -10000.0f;
                        wzVar.V1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                jvVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = jvVar.d;
                iv ivVar = jvVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + jvVar.e)));
                    if (ivVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(ivVar);
                        int[] iArr2 = ivVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            ivVar.invalidate();
                        }
                    }
                }
            }
            if (jvVar == null || !jvVar.d || jvVar.isShowing()) {
                return true;
            }
        }
        wzVar.S1 = motionEvent.getX();
        wzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }

    public final long x1() {
        wz wzVar = this.d3;
        return Math.max(400L, Math.min(45, wzVar.t2 - wzVar.s2) * 35) + Math.max(600L, Math.min(55, wzVar.t2 - wzVar.s2) * 40) + 150;
    }

    public final void y1(View view) {
        if (this.c3 != null) {
            int i10 = 0;
            while (i10 < this.c3.size()) {
                hy hyVar = (hy) this.c3.valueAt(i10);
                if (hyVar.d == view) {
                    this.c3.removeAt(i10);
                    i10--;
                    View view2 = hyVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        hyVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = hyVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void z1() {
        wz wzVar = this.d3;
        int i10 = wzVar.c;
        iy iyVar = wzVar.P;
        iy iyVar2 = wzVar.P;
        b6[] b6VarArr = new b6[iyVar.getChildCount()];
        for (int i11 = 0; i11 < iyVar2.getChildCount(); i11++) {
            View childAt = iyVar2.getChildAt(i11);
            if (childAt instanceof ez) {
                b6VarArr[i11] = ((ez) childAt).getSpan();
            }
        }
        wzVar.d2 = b6.update(i10, this, b6VarArr, (LongSparseArray<s5>) wzVar.d2);
    }
}
