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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class vx extends ml0 {
    public boolean X2;
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public int d3;
    public SparseArray e3;
    public final /* synthetic */ kz f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(kz kzVar, Context context) {
        super(context, null);
        this.f3 = kzVar;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = -1;
        new SparseIntArray();
        qr qrVar = qr.f;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void K0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        boolean z10;
        Canvas canvas2 = canvas;
        kz kzVar = this.f3;
        vx vxVar = kzVar.P;
        super.K0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.d3 != getChildCount()) {
            z1();
            this.d3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.b3;
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
        boolean z11 = kzVar.u2 > 0 && SystemClock.elapsedRealtime() - kzVar.u2 < x1() && kzVar.r2 != null && kzVar.s2 >= 0;
        float f7 = 0.0f;
        if (kzVar.d2 != null && vxVar != null) {
            int i14 = 0;
            while (i14 < vxVar.getChildCount()) {
                View childAt = vxVar.getChildAt(i14);
                if (childAt instanceof ty) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.k0.z(i13, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ty) childAt);
                }
                if (z11 && childAt != null && RecyclerView.S(childAt) == kzVar.s2 - i13) {
                    z10 = z11;
                    float interpolation = qr.g.getInterpolation(w7.p.a((SystemClock.elapsedRealtime() - kzVar.u2) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        kzVar.r2.draw(canvas2);
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
        ArrayList arrayList5 = this.a3;
        arrayList5.clear();
        ArrayList arrayList6 = this.Z2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            tx txVar = null;
            arrayList2 = this.c3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            ty tyVar = (ty) arrayList7.get(i11);
            int i16 = tyVar.a;
            int i17 = 0;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                }
                if (((tx) arrayList5.get(i17)).M == i16) {
                    txVar = (tx) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                }
                i17++;
            }
            if (txVar == null) {
                txVar = !arrayList2.isEmpty() ? (tx) hg.k0.z(1, arrayList2) : new tx(this);
                txVar.M = i16;
                txVar.e();
            }
            arrayList6.add(txVar);
            txVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(tyVar.getLeft(), tyVar.getY() + tyVar.getPaddingTop());
            txVar.N = tyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (tyVar.getLeft() * 2);
            int measuredHeight = tyVar.getMeasuredHeight() - tyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                txVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((tx) arrayList5.get(i18));
                ((tx) arrayList5.get(i18)).O = null;
                ((tx) arrayList5.get(i18)).k();
            } else {
                ((tx) arrayList5.get(i18)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        kz kzVar = this.f3;
        vx vxVar = kzVar.P;
        kzVar.m2.g++;
        if (this.d3 != getChildCount()) {
            z1();
            this.d3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.b3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        boolean z10 = kzVar.u2 > 0 && SystemClock.elapsedRealtime() - kzVar.u2 < x1() && kzVar.r2 != null && kzVar.s2 >= 0;
        if (kzVar.d2 != null && vxVar != null) {
            for (int i12 = 0; i12 < vxVar.getChildCount(); i12++) {
                View childAt = vxVar.getChildAt(i12);
                if (childAt instanceof ty) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.k0.z(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ty) childAt);
                }
                if (z10 && childAt != null && RecyclerView.S(childAt) == kzVar.s2 - 1) {
                    float interpolation = qr.g.getInterpolation(w7.p.a((SystemClock.elapsedRealtime() - kzVar.u2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        kzVar.r2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.a3;
        arrayList5.clear();
        ArrayList arrayList6 = this.Z2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            tx txVar = null;
            arrayList2 = this.c3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            ty tyVar = (ty) arrayList7.get(i10);
            int i14 = tyVar.a;
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                }
                if (((tx) arrayList5.get(i15)).M == i14) {
                    txVar = (tx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                }
                i15++;
            }
            if (txVar == null) {
                txVar = !arrayList2.isEmpty() ? (tx) hg.k0.z(1, arrayList2) : new tx(this);
                txVar.M = i14;
                txVar.e();
            }
            arrayList6.add(txVar);
            txVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(tyVar.getLeft(), tyVar.getY() + tyVar.getPaddingTop());
            txVar.N = tyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (tyVar.getLeft() * 2);
            int measuredHeight = tyVar.getMeasuredHeight() - tyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                txVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((tx) arrayList5.get(i16));
                ((tx) arrayList5.get(i16)).O = null;
                ((tx) arrayList5.get(i16)).k();
            } else {
                ((tx) arrayList5.get(i16)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z11 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z12 = motionEvent.getActionMasked() == 3;
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.e3 == null) {
                this.e3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View F = F(x10, y3);
            if (!z10) {
                ux uxVar = (ux) this.e3.get(pointerId);
                this.e3.remove(pointerId);
                if (F != null && uxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - uxVar.b, 2.0d) + Math.pow(x10 - uxVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        kz kzVar = this.f3;
                        if (!kzVar.B1.isShowing() || SystemClock.elapsedRealtime() - uxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = uxVar.d;
                            int S = RecyclerView.S(view);
                            try {
                                if (view instanceof ty) {
                                    kz.c(kzVar, (ty) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof yx) {
                                    kzVar.R.E(S, (yx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (uxVar != null && (uxVar.d.getBackground() instanceof RippleDrawable)) {
                    uxVar.d.getBackground().setState(new int[0]);
                }
                if (uxVar != null) {
                    uxVar.d.setPressed(false);
                }
            } else if (F != null) {
                ux uxVar2 = new ux();
                uxVar2.a = x10;
                uxVar2.b = y3;
                uxVar2.c = SystemClock.elapsedRealtime();
                uxVar2.d = F;
                if (F.getBackground() instanceof RippleDrawable) {
                    F.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                uxVar2.d.setPressed(true);
                this.e3.put(pointerId, uxVar2);
                C0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.e3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            kz kzVar = this.f3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                kzVar.M(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            kz.e(kzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z1();
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        x5.release(this, (LongSparseArray<o5>) this.f3.d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.Z2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((tx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.c3;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((tx) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.f3;
        if (kzVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.ut.q().r(motionEvent, this, kzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kz kzVar = this.f3;
        if (kzVar.d0 && kzVar.c0) {
            this.X2 = true;
            kzVar.Q.h1(0, 0);
            kzVar.c0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        kzVar.l(true);
        z1();
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.X2 = true;
        int size = View.MeasureSpec.getSize(i10);
        kz kzVar = this.f3;
        jx jxVar = kzVar.Q;
        int i12 = jxVar.J;
        jxVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.X2 = false;
        super.onMeasure(i10, i11);
        if (i12 != jxVar.J) {
            kzVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.f3;
        int[] iArr = kzVar.D1;
        xu xuVar = kzVar.B1;
        if (kzVar.R1 != null && xuVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (xuVar != null && xuVar.isShowing() && !xuVar.d) {
                    xuVar.dismiss();
                    int i10 = xuVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) kzVar.R1.getTag();
                    if (kzVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            kz.c(kzVar, kzVar.R1, kz.g(replace, str));
                        } else {
                            kz.c(kzVar, kzVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = kz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        kzVar.R1.a(Emoji.getEmojiBigDrawable(str2), kzVar.R1.c);
                        kz.c(kzVar, kzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (xuVar == null || !xuVar.d) {
                    kzVar.R1 = null;
                }
                kzVar.U1 = -10000.0f;
                kzVar.V1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f7 = kzVar.U1;
                if (f7 != -10000.0f) {
                    if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(kzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        kzVar.U1 = -10000.0f;
                        kzVar.V1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                xuVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = xuVar.d;
                wu wuVar = xuVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + xuVar.e)));
                    if (wuVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(wuVar);
                        int[] iArr2 = wuVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            wuVar.invalidate();
                        }
                    }
                }
            }
            if (xuVar == null || !xuVar.d || xuVar.isShowing()) {
                return true;
            }
        }
        kzVar.S1 = motionEvent.getX();
        kzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }

    public final long x1() {
        kz kzVar = this.f3;
        return Math.max(400L, Math.min(45, kzVar.t2 - kzVar.s2) * 35) + Math.max(600L, Math.min(55, kzVar.t2 - kzVar.s2) * 40) + 150;
    }

    public final void y1(View view) {
        if (this.e3 != null) {
            int i10 = 0;
            while (i10 < this.e3.size()) {
                ux uxVar = (ux) this.e3.valueAt(i10);
                if (uxVar.d == view) {
                    this.e3.removeAt(i10);
                    i10--;
                    View view2 = uxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        uxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = uxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void z1() {
        kz kzVar = this.f3;
        int i10 = kzVar.c;
        vx vxVar = kzVar.P;
        vx vxVar2 = kzVar.P;
        x5[] x5VarArr = new x5[vxVar.getChildCount()];
        for (int i11 = 0; i11 < vxVar2.getChildCount(); i11++) {
            View childAt = vxVar2.getChildAt(i11);
            if (childAt instanceof ty) {
                x5VarArr[i11] = ((ty) childAt).getSpan();
            }
        }
        kzVar.d2 = x5.update(i10, this, x5VarArr, (LongSparseArray<o5>) kzVar.d2);
    }
}
