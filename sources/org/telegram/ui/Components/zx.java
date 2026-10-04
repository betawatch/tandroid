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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class zx extends zl0 {
    public boolean e3;
    public final SparseArray f3;
    public final ArrayList g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public int k3;
    public SparseArray l3;
    public final /* synthetic */ nz m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(nz nzVar, Context context) {
        super(context, null);
        this.m3 = nzVar;
        this.f3 = new SparseArray();
        this.g3 = new ArrayList();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = -1;
        new SparseIntArray();
        tr trVar = tr.f;
    }

    public final void A1() {
        nz nzVar = this.m3;
        int i10 = nzVar.c;
        zx zxVar = nzVar.P;
        zx zxVar2 = nzVar.P;
        z5[] z5VarArr = new z5[zxVar.getChildCount()];
        for (int i11 = 0; i11 < zxVar2.getChildCount(); i11++) {
            View childAt = zxVar2.getChildAt(i11);
            if (childAt instanceof wy) {
                z5VarArr[i11] = ((wy) childAt).getSpan();
            }
        }
        nzVar.d2 = z5.update(i10, this, z5VarArr, (LongSparseArray<q5>) nzVar.d2);
    }

    @Override // org.telegram.ui.Components.zl0
    public final void K0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        boolean z10;
        Canvas canvas2 = canvas;
        nz nzVar = this.m3;
        zx zxVar = nzVar.P;
        super.K0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.k3 != getChildCount()) {
            A1();
            this.k3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.f3;
            int size = sparseArray.size();
            arrayList = this.i3;
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
        boolean z11 = nzVar.u2 > 0 && SystemClock.elapsedRealtime() - nzVar.u2 < y1() && nzVar.r2 != null && nzVar.s2 >= 0;
        float f7 = 0.0f;
        if (nzVar.d2 != null && zxVar != null) {
            int i14 = 0;
            while (i14 < zxVar.getChildCount()) {
                View childAt = zxVar.getChildAt(i14);
                if (childAt instanceof wy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.k0.w(i13, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((wy) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == nzVar.s2 - i13) {
                    z10 = z11;
                    float interpolation = tr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - nzVar.u2) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        nzVar.r2.draw(canvas2);
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
        ArrayList arrayList5 = this.h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            xx xxVar = null;
            arrayList2 = this.j3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            wy wyVar = (wy) arrayList7.get(i11);
            int i16 = wyVar.a;
            int i17 = 0;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                }
                if (((xx) arrayList5.get(i17)).M == i16) {
                    xxVar = (xx) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                }
                i17++;
            }
            if (xxVar == null) {
                xxVar = !arrayList2.isEmpty() ? (xx) hg.k0.w(1, arrayList2) : new xx(this);
                xxVar.M = i16;
                xxVar.e();
            }
            arrayList6.add(xxVar);
            xxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(wyVar.getLeft(), wyVar.getY() + wyVar.getPaddingTop());
            xxVar.N = wyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (wyVar.getLeft() * 2);
            int measuredHeight = wyVar.getMeasuredHeight() - wyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                xxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((xx) arrayList5.get(i18));
                ((xx) arrayList5.get(i18)).O = null;
                ((xx) arrayList5.get(i18)).k();
            } else {
                ((xx) arrayList5.get(i18)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        nz nzVar = this.m3;
        zx zxVar = nzVar.P;
        nzVar.m2.g();
        if (this.k3 != getChildCount()) {
            A1();
            this.k3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f3;
            int size = sparseArray.size();
            arrayList = this.i3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        boolean z10 = nzVar.u2 > 0 && SystemClock.elapsedRealtime() - nzVar.u2 < y1() && nzVar.r2 != null && nzVar.s2 >= 0;
        if (nzVar.d2 != null && zxVar != null) {
            for (int i12 = 0; i12 < zxVar.getChildCount(); i12++) {
                View childAt = zxVar.getChildAt(i12);
                if (childAt instanceof wy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.k0.w(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((wy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == nzVar.s2 - 1) {
                    float interpolation = tr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - nzVar.u2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        nzVar.r2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            xx xxVar = null;
            arrayList2 = this.j3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            wy wyVar = (wy) arrayList7.get(i10);
            int i14 = wyVar.a;
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                }
                if (((xx) arrayList5.get(i15)).M == i14) {
                    xxVar = (xx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                }
                i15++;
            }
            if (xxVar == null) {
                xxVar = !arrayList2.isEmpty() ? (xx) hg.k0.w(1, arrayList2) : new xx(this);
                xxVar.M = i14;
                xxVar.e();
            }
            arrayList6.add(xxVar);
            xxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(wyVar.getLeft(), wyVar.getY() + wyVar.getPaddingTop());
            xxVar.N = wyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (wyVar.getLeft() * 2);
            int measuredHeight = wyVar.getMeasuredHeight() - wyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                xxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((xx) arrayList5.get(i16));
                ((xx) arrayList5.get(i16)).O = null;
                ((xx) arrayList5.get(i16)).k();
            } else {
                ((xx) arrayList5.get(i16)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z11 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z12 = motionEvent.getActionMasked() == 3;
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.l3 == null) {
                this.l3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (!z10) {
                yx yxVar = (yx) this.l3.get(pointerId);
                this.l3.remove(pointerId);
                if (E != null && yxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - yxVar.b, 2.0d) + Math.pow(x10 - yxVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        nz nzVar = this.m3;
                        if (!nzVar.B1.isShowing() || SystemClock.elapsedRealtime() - yxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = yxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof wy) {
                                    nz.c(nzVar, (wy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof dy) {
                                    nzVar.R.E(R, (dy) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (yxVar != null && (yxVar.d.getBackground() instanceof RippleDrawable)) {
                    yxVar.d.getBackground().setState(new int[0]);
                }
                if (yxVar != null) {
                    yxVar.d.setPressed(false);
                }
            } else if (E != null) {
                yx yxVar2 = new yx();
                yxVar2.a = x10;
                yxVar2.b = y3;
                yxVar2.c = SystemClock.elapsedRealtime();
                yxVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                yxVar2.d.setPressed(true);
                this.l3.put(pointerId, yxVar2);
                C0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.l3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            nz nzVar = this.m3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                nzVar.K(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            nz.e(nzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A1();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        z5.release(this, (LongSparseArray<q5>) this.m3.d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.g3;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((xx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((xx) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nz nzVar = this.m3;
        if (nzVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.rt.q().r(motionEvent, this, nzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.m3;
        if (nzVar.d0 && nzVar.c0) {
            this.e3 = true;
            nzVar.Q.h1(0, 0);
            nzVar.c0 = false;
            this.e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nzVar.l(true);
        A1();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.e3 = true;
        int size = View.MeasureSpec.getSize(i10);
        nz nzVar = this.m3;
        nx nxVar = nzVar.Q;
        int i12 = nxVar.J;
        nxVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.e3 = false;
        super.onMeasure(i10, i11);
        if (i12 != nxVar.J) {
            nzVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        nz nzVar = this.m3;
        int[] iArr = nzVar.D1;
        bv bvVar = nzVar.B1;
        if (nzVar.R1 != null && bvVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (bvVar != null && bvVar.isShowing() && !bvVar.d) {
                    bvVar.dismiss();
                    int i10 = bvVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) nzVar.R1.getTag();
                    if (nzVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            nz.c(nzVar, nzVar.R1, nz.g(replace, str));
                        } else {
                            nz.c(nzVar, nzVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = nz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        nzVar.R1.a(Emoji.getEmojiBigDrawable(str2), nzVar.R1.c);
                        nz.c(nzVar, nzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (bvVar == null || !bvVar.d) {
                    nzVar.R1 = null;
                }
                nzVar.U1 = -10000.0f;
                nzVar.V1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f7 = nzVar.U1;
                if (f7 != -10000.0f) {
                    if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(nzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        nzVar.U1 = -10000.0f;
                        nzVar.V1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                bvVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = bvVar.d;
                av avVar = bvVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + bvVar.e)));
                    if (avVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(avVar);
                        int[] iArr2 = avVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            avVar.invalidate();
                        }
                    }
                }
            }
            if (bvVar == null || !bvVar.d || bvVar.isShowing()) {
                return true;
            }
        }
        nzVar.S1 = motionEvent.getX();
        nzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3) {
            return;
        }
        super.requestLayout();
    }

    public final long y1() {
        nz nzVar = this.m3;
        return Math.max(400L, Math.min(45, nzVar.t2 - nzVar.s2) * 35) + Math.max(600L, Math.min(55, nzVar.t2 - nzVar.s2) * 40) + 150;
    }

    public final void z1(View view) {
        if (this.l3 != null) {
            int i10 = 0;
            while (i10 < this.l3.size()) {
                yx yxVar = (yx) this.l3.valueAt(i10);
                if (yxVar.d == view) {
                    this.l3.removeAt(i10);
                    i10--;
                    View view2 = yxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        yxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = yxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }
}
