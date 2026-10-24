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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ey extends mm0 {
    public boolean Y2;
    public final SparseArray Z2;
    public final ArrayList a3;
    public final ArrayList b3;
    public final ArrayList c3;
    public final ArrayList d3;
    public int e3;
    public SparseArray f3;
    public final /* synthetic */ tz g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(tz tzVar, Context context) {
        super(context, null);
        this.g3 = tzVar;
        this.Z2 = new SparseArray();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = new ArrayList();
        this.e3 = -1;
        new SparseIntArray();
        bs bsVar = bs.f;
    }

    public final long C1() {
        tz tzVar = this.g3;
        return Math.max(400L, Math.min(45, tzVar.u2 - tzVar.t2) * 35) + Math.max(600L, Math.min(55, tzVar.u2 - tzVar.t2) * 40) + 150;
    }

    public final void D1(View view) {
        if (this.f3 != null) {
            int i10 = 0;
            while (i10 < this.f3.size()) {
                dy dyVar = (dy) this.f3.valueAt(i10);
                if (dyVar.d == view) {
                    this.f3.removeAt(i10);
                    i10--;
                    View view2 = dyVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        dyVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = dyVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void E1() {
        tz tzVar = this.g3;
        int i10 = tzVar.c;
        ey eyVar = tzVar.P;
        ey eyVar2 = tzVar.P;
        a6[] a6VarArr = new a6[eyVar.getChildCount()];
        for (int i11 = 0; i11 < eyVar2.getChildCount(); i11++) {
            View childAt = eyVar2.getChildAt(i11);
            if (childAt instanceof cz) {
                a6VarArr[i11] = ((cz) childAt).getSpan();
            }
        }
        tzVar.d2 = a6.update(i10, this, a6VarArr, (LongSparseArray<r5>) tzVar.d2);
    }

    @Override // org.telegram.ui.Components.mm0
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        boolean z10;
        Canvas canvas2 = canvas;
        tz tzVar = this.g3;
        ey eyVar = tzVar.P;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.e3 != getChildCount()) {
            E1();
            this.e3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.Z2;
            int size = sparseArray.size();
            arrayList = this.c3;
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
        boolean z11 = tzVar.v2 > 0 && SystemClock.elapsedRealtime() - tzVar.v2 < C1() && tzVar.s2 != null && tzVar.t2 >= 0;
        float f7 = 0.0f;
        if (tzVar.d2 != null && eyVar != null) {
            int i14 = 0;
            while (i14 < eyVar.getChildCount()) {
                View childAt = eyVar.getChildAt(i14);
                if (childAt instanceof cz) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) i2.o1.A(i13, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((cz) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == tzVar.t2 - i13) {
                    z10 = z11;
                    float interpolation = bs.g.getInterpolation(w7.r.a((SystemClock.elapsedRealtime() - tzVar.v2) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        tzVar.s2.draw(canvas2);
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
        ArrayList arrayList5 = this.b3;
        arrayList5.clear();
        ArrayList arrayList6 = this.a3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            cy cyVar = null;
            arrayList2 = this.d3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            cz czVar = (cz) arrayList7.get(i11);
            int i16 = czVar.a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                }
                if (((cy) arrayList5.get(i17)).M == i16) {
                    cyVar = (cy) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                }
                i17++;
            }
            if (cyVar == null) {
                cyVar = !arrayList2.isEmpty() ? (cy) i2.o1.A(1, arrayList2) : new cy(this);
                cyVar.M = i16;
                cyVar.e();
            }
            arrayList6.add(cyVar);
            cyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(czVar.getLeft(), czVar.getY() + czVar.getPaddingTop());
            cyVar.N = czVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (czVar.getLeft() * 2);
            int measuredHeight = czVar.getMeasuredHeight() - czVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                cyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((cy) arrayList5.get(i18));
                ((cy) arrayList5.get(i18)).O = null;
                ((cy) arrayList5.get(i18)).k();
            } else {
                ((cy) arrayList5.get(i18)).f();
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
        tz tzVar = this.g3;
        ey eyVar = tzVar.P;
        tzVar.n2.h++;
        if (this.e3 != getChildCount()) {
            E1();
            this.e3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.Z2;
            int size = sparseArray.size();
            arrayList = this.c3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        boolean z10 = tzVar.v2 > 0 && SystemClock.elapsedRealtime() - tzVar.v2 < C1() && tzVar.s2 != null && tzVar.t2 >= 0;
        if (tzVar.d2 != null && eyVar != null) {
            for (int i12 = 0; i12 < eyVar.getChildCount(); i12++) {
                View childAt = eyVar.getChildAt(i12);
                if (childAt instanceof cz) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) i2.o1.A(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((cz) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == tzVar.t2 - 1) {
                    float interpolation = bs.g.getInterpolation(w7.r.a((SystemClock.elapsedRealtime() - tzVar.v2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        tzVar.s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.b3;
        arrayList5.clear();
        ArrayList arrayList6 = this.a3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            cy cyVar = null;
            arrayList2 = this.d3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            cz czVar = (cz) arrayList7.get(i10);
            int i14 = czVar.a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                }
                if (((cy) arrayList5.get(i15)).M == i14) {
                    cyVar = (cy) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                }
                i15++;
            }
            if (cyVar == null) {
                cyVar = !arrayList2.isEmpty() ? (cy) i2.o1.A(1, arrayList2) : new cy(this);
                cyVar.M = i14;
                cyVar.e();
            }
            arrayList6.add(cyVar);
            cyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(czVar.getLeft(), czVar.getY() + czVar.getPaddingTop());
            cyVar.N = czVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (czVar.getLeft() * 2);
            int measuredHeight = czVar.getMeasuredHeight() - czVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                cyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((cy) arrayList5.get(i16));
                ((cy) arrayList5.get(i16)).O = null;
                ((cy) arrayList5.get(i16)).k();
            } else {
                ((cy) arrayList5.get(i16)).f();
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
            if (this.f3 == null) {
                this.f3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (!z10) {
                dy dyVar = (dy) this.f3.get(pointerId);
                this.f3.remove(pointerId);
                if (E != null && dyVar != null) {
                    if (Math.sqrt(Math.pow(y3 - dyVar.b, 2.0d) + Math.pow(x10 - dyVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        tz tzVar = this.g3;
                        if (!tzVar.B1.isShowing() || SystemClock.elapsedRealtime() - dyVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = dyVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof cz) {
                                    tz.d(tzVar, (cz) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof hy) {
                                    tzVar.R.E(R, (hy) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (dyVar != null && (dyVar.d.getBackground() instanceof RippleDrawable)) {
                    dyVar.d.getBackground().setState(new int[0]);
                }
                if (dyVar != null) {
                    dyVar.d.setPressed(false);
                }
            } else if (E != null) {
                dy dyVar2 = new dy();
                dyVar2.a = x10;
                dyVar2.b = y3;
                dyVar2.c = SystemClock.elapsedRealtime();
                dyVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                dyVar2.d.setPressed(true);
                this.f3.put(pointerId, dyVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.f3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            tz tzVar = this.g3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                tzVar.M(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            tz.e(tzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        E1();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        a6.release(this, (LongSparseArray<r5>) this.g3.d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.a3;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((cy) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.d3;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((cy) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        tz tzVar = this.g3;
        if (tzVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.ht.o().p(motionEvent, this, tzVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tz tzVar = this.g3;
        if (tzVar.d0 && tzVar.c0) {
            this.Y2 = true;
            tzVar.Q.h1(0, 0);
            tzVar.c0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        tzVar.l(true);
        E1();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.Y2 = true;
        int size = View.MeasureSpec.getSize(i10);
        tz tzVar = this.g3;
        rx rxVar = tzVar.Q;
        int i12 = rxVar.J;
        rxVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.Y2 = false;
        super.onMeasure(i10, i11);
        if (i12 != rxVar.J) {
            tzVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tz tzVar = this.g3;
        int[] iArr = tzVar.D1;
        ev evVar = tzVar.B1;
        if (tzVar.R1 != null && evVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (evVar != null && evVar.isShowing() && !evVar.d) {
                    evVar.dismiss();
                    int i10 = evVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) tzVar.R1.getTag();
                    if (tzVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            tz.d(tzVar, tzVar.R1, tz.g(replace, str));
                        } else {
                            tz.d(tzVar, tzVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = tz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        tzVar.R1.a(Emoji.getEmojiBigDrawable(str2), tzVar.R1.c);
                        tz.d(tzVar, tzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (evVar == null || !evVar.d) {
                    tzVar.R1 = null;
                }
                tzVar.U1 = -10000.0f;
                tzVar.V1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f7 = tzVar.U1;
                if (f7 != -10000.0f) {
                    if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(tzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        tzVar.U1 = -10000.0f;
                        tzVar.V1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                evVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = evVar.d;
                dv dvVar = evVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + evVar.e)));
                    if (dvVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(dvVar);
                        int[] iArr2 = dvVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            dvVar.invalidate();
                        }
                    }
                }
            }
            if (evVar == null || !evVar.d || evVar.isShowing()) {
                return true;
            }
        }
        tzVar.S1 = motionEvent.getX();
        tzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}
