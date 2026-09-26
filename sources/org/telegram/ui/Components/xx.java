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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class xx extends wl0 {
    public boolean X2;
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public int d3;
    public SparseArray e3;
    public final /* synthetic */ lz f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(lz lzVar, Context context) {
        super(context, null);
        this.f3 = lzVar;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = -1;
        new SparseIntArray();
        rr rrVar = rr.f;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        boolean z10;
        Canvas canvas2 = canvas;
        lz lzVar = this.f3;
        xx xxVar = lzVar.P;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.d3 != getChildCount()) {
            y1();
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
        boolean z11 = lzVar.u2 > 0 && SystemClock.elapsedRealtime() - lzVar.u2 < w1() && lzVar.r2 != null && lzVar.s2 >= 0;
        float f7 = 0.0f;
        if (lzVar.d2 != null && xxVar != null) {
            int i14 = 0;
            while (i14 < xxVar.getChildCount()) {
                View childAt = xxVar.getChildAt(i14);
                if (childAt instanceof uy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.c.x(i13, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((uy) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == lzVar.s2 - i13) {
                    z10 = z11;
                    float interpolation = rr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - lzVar.u2) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        lzVar.r2.draw(canvas2);
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
            vx vxVar = null;
            arrayList2 = this.c3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            uy uyVar = (uy) arrayList7.get(i11);
            int i16 = uyVar.a;
            int i17 = 0;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                }
                if (((vx) arrayList5.get(i17)).M == i16) {
                    vxVar = (vx) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                }
                i17++;
            }
            if (vxVar == null) {
                vxVar = !arrayList2.isEmpty() ? (vx) hg.c.x(1, arrayList2) : new vx(this);
                vxVar.M = i16;
                vxVar.e();
            }
            arrayList6.add(vxVar);
            vxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(uyVar.getLeft(), uyVar.getY() + uyVar.getPaddingTop());
            vxVar.N = uyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (uyVar.getLeft() * 2);
            int measuredHeight = uyVar.getMeasuredHeight() - uyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                vxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((vx) arrayList5.get(i18));
                ((vx) arrayList5.get(i18)).O = null;
                ((vx) arrayList5.get(i18)).k();
            } else {
                ((vx) arrayList5.get(i18)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        lz lzVar = this.f3;
        xx xxVar = lzVar.P;
        lzVar.m2.h++;
        if (this.d3 != getChildCount()) {
            y1();
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
        boolean z10 = lzVar.u2 > 0 && SystemClock.elapsedRealtime() - lzVar.u2 < w1() && lzVar.r2 != null && lzVar.s2 >= 0;
        if (lzVar.d2 != null && xxVar != null) {
            for (int i12 = 0; i12 < xxVar.getChildCount(); i12++) {
                View childAt = xxVar.getChildAt(i12);
                if (childAt instanceof uy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) hg.c.x(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((uy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == lzVar.s2 - 1) {
                    float interpolation = rr.g.getInterpolation(w7.q.a((SystemClock.elapsedRealtime() - lzVar.u2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        lzVar.r2.draw(canvas);
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
            vx vxVar = null;
            arrayList2 = this.c3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            uy uyVar = (uy) arrayList7.get(i10);
            int i14 = uyVar.a;
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                }
                if (((vx) arrayList5.get(i15)).M == i14) {
                    vxVar = (vx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                }
                i15++;
            }
            if (vxVar == null) {
                vxVar = !arrayList2.isEmpty() ? (vx) hg.c.x(1, arrayList2) : new vx(this);
                vxVar.M = i14;
                vxVar.e();
            }
            arrayList6.add(vxVar);
            vxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(uyVar.getLeft(), uyVar.getY() + uyVar.getPaddingTop());
            vxVar.N = uyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (uyVar.getLeft() * 2);
            int measuredHeight = uyVar.getMeasuredHeight() - uyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                vxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((vx) arrayList5.get(i16));
                ((vx) arrayList5.get(i16)).O = null;
                ((vx) arrayList5.get(i16)).k();
            } else {
                ((vx) arrayList5.get(i16)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
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
            View E = E(x10, y3);
            if (!z10) {
                wx wxVar = (wx) this.e3.get(pointerId);
                this.e3.remove(pointerId);
                if (E != null && wxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - wxVar.b, 2.0d) + Math.pow(x10 - wxVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        lz lzVar = this.f3;
                        if (!lzVar.B1.isShowing() || SystemClock.elapsedRealtime() - wxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = wxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof uy) {
                                    lz.c(lzVar, (uy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof ay) {
                                    lzVar.R.E(R, (ay) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (wxVar != null && (wxVar.d.getBackground() instanceof RippleDrawable)) {
                    wxVar.d.getBackground().setState(new int[0]);
                }
                if (wxVar != null) {
                    wxVar.d.setPressed(false);
                }
            } else if (E != null) {
                wx wxVar2 = new wx();
                wxVar2.a = x10;
                wxVar2.b = y3;
                wxVar2.c = SystemClock.elapsedRealtime();
                wxVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                wxVar2.d.setPressed(true);
                this.e3.put(pointerId, wxVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.e3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            lz lzVar = this.f3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                lzVar.M(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            lz.e(lzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y1();
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        z5.release(this, (LongSparseArray<q5>) this.f3.d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.Z2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((vx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.c3;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((vx) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lz lzVar = this.f3;
        if (lzVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.nt.q().r(motionEvent, this, lzVar.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        lz lzVar = this.f3;
        if (lzVar.d0 && lzVar.c0) {
            this.X2 = true;
            lzVar.Q.h1(0, 0);
            lzVar.c0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        lzVar.l(true);
        y1();
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.X2 = true;
        int size = View.MeasureSpec.getSize(i10);
        lz lzVar = this.f3;
        lx lxVar = lzVar.Q;
        int i12 = lxVar.J;
        lxVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.X2 = false;
        super.onMeasure(i10, i11);
        if (i12 != lxVar.J) {
            lzVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        lz lzVar = this.f3;
        int[] iArr = lzVar.D1;
        yu yuVar = lzVar.B1;
        if (lzVar.R1 != null && yuVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (yuVar != null && yuVar.isShowing() && !yuVar.d) {
                    yuVar.dismiss();
                    int i10 = yuVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) lzVar.R1.getTag();
                    if (lzVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            lz.c(lzVar, lzVar.R1, lz.g(replace, str));
                        } else {
                            lz.c(lzVar, lzVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = lz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        lzVar.R1.a(Emoji.getEmojiBigDrawable(str2), lzVar.R1.c);
                        lz.c(lzVar, lzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (yuVar == null || !yuVar.d) {
                    lzVar.R1 = null;
                }
                lzVar.U1 = -10000.0f;
                lzVar.V1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f7 = lzVar.U1;
                if (f7 != -10000.0f) {
                    if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(lzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        lzVar.U1 = -10000.0f;
                        lzVar.V1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                yuVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = yuVar.d;
                xu xuVar = yuVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + yuVar.e)));
                    if (xuVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(xuVar);
                        int[] iArr2 = xuVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            xuVar.invalidate();
                        }
                    }
                }
            }
            if (yuVar == null || !yuVar.d || yuVar.isShowing()) {
                return true;
            }
        }
        lzVar.S1 = motionEvent.getX();
        lzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }

    public final long w1() {
        lz lzVar = this.f3;
        return Math.max(400L, Math.min(45, lzVar.t2 - lzVar.s2) * 35) + Math.max(600L, Math.min(55, lzVar.t2 - lzVar.s2) * 40) + 150;
    }

    public final void x1(View view) {
        if (this.e3 != null) {
            int i10 = 0;
            while (i10 < this.e3.size()) {
                wx wxVar = (wx) this.e3.valueAt(i10);
                if (wxVar.d == view) {
                    this.e3.removeAt(i10);
                    i10--;
                    View view2 = wxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        wxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = wxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void y1() {
        lz lzVar = this.f3;
        int i10 = lzVar.c;
        xx xxVar = lzVar.P;
        xx xxVar2 = lzVar.P;
        z5[] z5VarArr = new z5[xxVar.getChildCount()];
        for (int i11 = 0; i11 < xxVar2.getChildCount(); i11++) {
            View childAt = xxVar2.getChildAt(i11);
            if (childAt instanceof uy) {
                z5VarArr[i11] = ((uy) childAt).getSpan();
            }
        }
        lzVar.d2 = z5.update(i10, this, z5VarArr, (LongSparseArray<q5>) lzVar.d2);
    }
}
