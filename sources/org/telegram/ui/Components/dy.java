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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dy extends nm0 {
    public boolean f3;
    public final SparseArray g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public int l3;
    public SparseArray m3;
    public final /* synthetic */ sz n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(sz szVar, Context context) {
        super(context, null);
        this.n3 = szVar;
        this.g3 = new SparseArray();
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = -1;
        new SparseIntArray();
        ds dsVar = ds.f;
    }

    public final long C1() {
        sz szVar = this.n3;
        return Math.max(400L, Math.min(45, szVar.u2 - szVar.t2) * 35) + Math.max(600L, Math.min(55, szVar.u2 - szVar.t2) * 40) + 150;
    }

    public final void D1(View view) {
        if (this.m3 != null) {
            int i10 = 0;
            while (i10 < this.m3.size()) {
                cy cyVar = (cy) this.m3.valueAt(i10);
                if (cyVar.d == view) {
                    this.m3.removeAt(i10);
                    i10--;
                    View view2 = cyVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        cyVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = cyVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void E1() {
        sz szVar = this.n3;
        int i10 = szVar.c;
        dy dyVar = szVar.P;
        dy dyVar2 = szVar.P;
        c6[] c6VarArr = new c6[dyVar.getChildCount()];
        for (int i11 = 0; i11 < dyVar2.getChildCount(); i11++) {
            View childAt = dyVar2.getChildAt(i11);
            if (childAt instanceof bz) {
                c6VarArr[i11] = ((bz) childAt).getSpan();
            }
        }
        szVar.d2 = c6.update(i10, this, c6VarArr, (LongSparseArray<t5>) szVar.d2);
    }

    @Override // org.telegram.ui.Components.nm0
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        boolean z10;
        Canvas canvas2 = canvas;
        sz szVar = this.n3;
        dy dyVar = szVar.P;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.l3 != getChildCount()) {
            E1();
            this.l3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.g3;
            int size = sparseArray.size();
            arrayList = this.j3;
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
        boolean z11 = szVar.v2 > 0 && SystemClock.elapsedRealtime() - szVar.v2 < C1() && szVar.s2 != null && szVar.t2 >= 0;
        float f7 = 0.0f;
        if (szVar.d2 != null && dyVar != null) {
            int i14 = 0;
            while (i14 < dyVar.getChildCount()) {
                View childAt = dyVar.getChildAt(i14);
                if (childAt instanceof bz) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) ic.a.y(i13, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((bz) childAt);
                }
                if (z11 && childAt != null && RecyclerView.R(childAt) == szVar.t2 - i13) {
                    z10 = z11;
                    float interpolation = ds.g.getInterpolation(a8.ee.a((SystemClock.elapsedRealtime() - szVar.v2) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        szVar.s2.draw(canvas2);
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
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ay ayVar = null;
            arrayList2 = this.k3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            bz bzVar = (bz) arrayList7.get(i11);
            int i16 = bzVar.a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                }
                if (((ay) arrayList5.get(i17)).M == i16) {
                    ayVar = (ay) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                }
                i17++;
            }
            if (ayVar == null) {
                ayVar = !arrayList2.isEmpty() ? (ay) ic.a.y(1, arrayList2) : new ay(this);
                ayVar.M = i16;
                ayVar.e();
            }
            arrayList6.add(ayVar);
            ayVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(bzVar.getLeft(), bzVar.getY() + bzVar.getPaddingTop());
            ayVar.N = bzVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (bzVar.getLeft() * 2);
            int measuredHeight = bzVar.getMeasuredHeight() - bzVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                ayVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ay) arrayList5.get(i18));
                ((ay) arrayList5.get(i18)).O = null;
                ((ay) arrayList5.get(i18)).k();
            } else {
                ((ay) arrayList5.get(i18)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        sz szVar = this.n3;
        dy dyVar = szVar.P;
        szVar.n2.g();
        if (this.l3 != getChildCount()) {
            E1();
            this.l3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.g3;
            int size = sparseArray.size();
            arrayList = this.j3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        boolean z10 = szVar.v2 > 0 && SystemClock.elapsedRealtime() - szVar.v2 < C1() && szVar.s2 != null && szVar.t2 >= 0;
        if (szVar.d2 != null && dyVar != null) {
            for (int i12 = 0; i12 < dyVar.getChildCount(); i12++) {
                View childAt = dyVar.getChildAt(i12);
                if (childAt instanceof bz) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) ic.a.y(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((bz) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == szVar.t2 - 1) {
                    float interpolation = ds.g.getInterpolation(a8.ee.a((SystemClock.elapsedRealtime() - szVar.v2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        szVar.s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ay ayVar = null;
            arrayList2 = this.k3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            bz bzVar = (bz) arrayList7.get(i10);
            int i14 = bzVar.a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                }
                if (((ay) arrayList5.get(i15)).M == i14) {
                    ayVar = (ay) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                }
                i15++;
            }
            if (ayVar == null) {
                ayVar = !arrayList2.isEmpty() ? (ay) ic.a.y(1, arrayList2) : new ay(this);
                ayVar.M = i14;
                ayVar.e();
            }
            arrayList6.add(ayVar);
            ayVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(bzVar.getLeft(), bzVar.getY() + bzVar.getPaddingTop());
            ayVar.N = bzVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (bzVar.getLeft() * 2);
            int measuredHeight = bzVar.getMeasuredHeight() - bzVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                ayVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ay) arrayList5.get(i16));
                ((ay) arrayList5.get(i16)).O = null;
                ((ay) arrayList5.get(i16)).k();
            } else {
                ((ay) arrayList5.get(i16)).f();
            }
        }
        arrayList5.clear();
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z11 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z12 = motionEvent.getActionMasked() == 3;
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.m3 == null) {
                this.m3 = new SparseArray();
            }
            float x9 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x9, y3);
            if (!z10) {
                cy cyVar = (cy) this.m3.get(pointerId);
                this.m3.remove(pointerId);
                if (E != null && cyVar != null) {
                    if (Math.sqrt(Math.pow(y3 - cyVar.b, 2.0d) + Math.pow(x9 - cyVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        sz szVar = this.n3;
                        if (!szVar.B1.isShowing() || SystemClock.elapsedRealtime() - cyVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = cyVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof bz) {
                                    sz.b(szVar, (bz) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof gy) {
                                    szVar.R.E(R, (gy) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (cyVar != null && (cyVar.d.getBackground() instanceof RippleDrawable)) {
                    cyVar.d.getBackground().setState(new int[0]);
                }
                if (cyVar != null) {
                    cyVar.d.setPressed(false);
                }
            } else if (E != null) {
                cy cyVar2 = new cy();
                cyVar2.a = x9;
                cyVar2.b = y3;
                cyVar2.c = SystemClock.elapsedRealtime();
                cyVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                cyVar2.d.setPressed(true);
                this.m3.put(pointerId, cyVar2);
                C0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.m3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            sz szVar = this.n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                szVar.N(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            sz.e(szVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        E1();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        c6.release(this, (LongSparseArray<t5>) this.n3.d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.h3;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ay) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.k3;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((ay) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        sz szVar = this.n3;
        if (szVar.f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.ht.o().p(motionEvent, this, szVar.g2, this.n2);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        sz szVar = this.n3;
        if (szVar.d0 && szVar.c0) {
            this.f3 = true;
            szVar.Q.h1(0, 0);
            szVar.c0 = false;
            this.f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        szVar.l(true);
        E1();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.f3 = true;
        int size = View.MeasureSpec.getSize(i10);
        sz szVar = this.n3;
        qx qxVar = szVar.Q;
        int i12 = qxVar.J;
        qxVar.z1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.f3 = false;
        super.onMeasure(i10, i11);
        if (i12 != qxVar.J) {
            szVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sz szVar = this.n3;
        int[] iArr = szVar.D1;
        fv fvVar = szVar.B1;
        if (szVar.R1 != null && fvVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (fvVar != null && fvVar.isShowing() && !fvVar.d) {
                    fvVar.dismiss();
                    int i10 = fvVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) szVar.R1.getTag();
                    if (szVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            sz.b(szVar, szVar.R1, sz.g(replace, str));
                        } else {
                            sz.b(szVar, szVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = sz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        szVar.R1.a(Emoji.getEmojiBigDrawable(str2), szVar.R1.c);
                        sz.b(szVar, szVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (fvVar == null || !fvVar.d) {
                    szVar.R1 = null;
                }
                szVar.U1 = -10000.0f;
                szVar.V1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f7 = szVar.U1;
                if (f7 != -10000.0f) {
                    if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(szVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        szVar.U1 = -10000.0f;
                        szVar.V1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x9 = motionEvent.getX() + iArr[0];
                fvVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x9 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = fvVar.d;
                ev evVar = fvVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + fvVar.e)));
                    if (evVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(evVar);
                        int[] iArr2 = evVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            evVar.invalidate();
                        }
                    }
                }
            }
            if (fvVar == null || !fvVar.d || fvVar.isShowing()) {
                return true;
            }
        }
        szVar.S1 = motionEvent.getX();
        szVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }
}
