package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;
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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class wx extends sl0 {
    public boolean U2;
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public int a3;
    public SparseArray b3;
    public final /* synthetic */ mz c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(mz mzVar, Context context) {
        super(context, null);
        this.c3 = mzVar;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.a3 = -1;
        new SparseIntArray();
        pr prVar = pr.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203 A[EDGE_INSN: B:72:0x0203->B:73:0x0203 BREAK  A[LOOP:2: B:47:0x0165->B:68:0x01f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z4;
        Canvas canvas2;
        ArrayList arrayList2;
        int i10;
        int size;
        ArrayList arrayList3;
        int i11;
        int i12;
        mz mzVar = this.c3;
        kx kxVar = mzVar.M;
        super.dispatchDraw(canvas);
        if (this.a3 != getChildCount()) {
            w1();
            this.a3 = getChildCount();
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            sparseArray = this.V2;
            int size2 = sparseArray.size();
            arrayList = this.Y2;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i14);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i14++;
        }
        sparseArray.clear();
        if (mzVar.s2 > 0) {
            if (SystemClock.elapsedRealtime() - mzVar.s2 < Math.max(400L, Math.min(45, mzVar.r2 - mzVar.q2) * 35) + Math.max(600L, Math.min(55, mzVar.r2 - mzVar.q2) * 40) + 150 && mzVar.p2 != null && mzVar.q2 >= 0) {
                z4 = true;
                if (mzVar.a2 != null && kxVar != null) {
                    for (i12 = 0; i12 < kxVar.getChildCount(); i12++) {
                        View childAt = kxVar.getChildAt(i12);
                        if (childAt instanceof uy) {
                            int top = childAt.getTop() + ((int) childAt.getTranslationY());
                            ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                            if (arrayList5 == null) {
                                arrayList5 = !arrayList.isEmpty() ? (ArrayList) e2.c.g(1, arrayList) : new ArrayList();
                                sparseArray.put(top, arrayList5);
                            }
                            arrayList5.add((uy) childAt);
                        }
                        if (z4 && childAt != null && RecyclerView.R(childAt) == mzVar.q2 - 1) {
                            float interpolation = pr.g.getInterpolation(k7.o.a((SystemClock.elapsedRealtime() - mzVar.s2) / 140.0f, 0.0f, 1.0f));
                            if (interpolation < 1.0f) {
                                float f10 = 1.0f - interpolation;
                                canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                                canvas.translate(childAt.getLeft(), childAt.getTop());
                                float f11 = (f10 * 0.5f) + 0.5f;
                                canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                                mzVar.p2.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                }
                canvas2 = canvas;
                arrayList2 = this.X2;
                arrayList2.clear();
                ArrayList arrayList6 = this.W2;
                arrayList2.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                i10 = 0;
                while (true) {
                    size = sparseArray.size();
                    ux uxVar = null;
                    arrayList3 = this.Z2;
                    if (i10 < size) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i10);
                    uy uyVar = (uy) arrayList7.get(i13);
                    int i15 = uyVar.a;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            break;
                        }
                        if (((ux) arrayList2.get(i16)).J == i15) {
                            uxVar = (ux) arrayList2.get(i16);
                            arrayList2.remove(i16);
                            break;
                        }
                        i16++;
                    }
                    if (uxVar == null) {
                        uxVar = !arrayList3.isEmpty() ? (ux) e2.c.g(1, arrayList3) : new ux(this);
                        uxVar.J = i15;
                        uxVar.e();
                    }
                    arrayList6.add(uxVar);
                    uxVar.L = arrayList7;
                    canvas2.save();
                    canvas2.translate(uyVar.getLeft(), uyVar.getY() + uyVar.getPaddingTop());
                    uxVar.K = uyVar.getLeft();
                    int measuredWidth = getMeasuredWidth() - (uyVar.getLeft() * 2);
                    int measuredHeight = uyVar.getMeasuredHeight() - uyVar.getPaddingBottom();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        uxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                    }
                    canvas.restore();
                    invalidate();
                    i10++;
                    canvas2 = canvas;
                    i13 = 0;
                }
                for (i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (arrayList3.size() < 3) {
                        arrayList3.add((ux) arrayList2.get(i11));
                        ((ux) arrayList2.get(i11)).L = null;
                        ((ux) arrayList2.get(i11)).k();
                    } else {
                        ((ux) arrayList2.get(i11)).f();
                    }
                }
                arrayList2.clear();
            }
        }
        z4 = false;
        if (mzVar.a2 != null) {
            while (i12 < kxVar.getChildCount()) {
            }
        }
        canvas2 = canvas;
        arrayList2 = this.X2;
        arrayList2.clear();
        ArrayList arrayList62 = this.W2;
        arrayList2.addAll(arrayList62);
        arrayList62.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        i10 = 0;
        while (true) {
            size = sparseArray.size();
            ux uxVar2 = null;
            arrayList3 = this.Z2;
            if (i10 < size) {
            }
            canvas.restore();
            invalidate();
            i10++;
            canvas2 = canvas;
            i13 = 0;
        }
        while (i11 < arrayList2.size()) {
        }
        arrayList2.clear();
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z10 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z11 = motionEvent.getActionMasked() == 3;
        if (z4 || z10 || z11) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.b3 == null) {
                this.b3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (!z4) {
                vx vxVar = (vx) this.b3.get(pointerId);
                this.b3.remove(pointerId);
                if (E != null && vxVar != null) {
                    if (Math.sqrt(Math.pow(y10 - vxVar.b, 2.0d) + Math.pow(x10 - vxVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z11) {
                        mz mzVar = this.c3;
                        if (!mzVar.y1.isShowing() || SystemClock.elapsedRealtime() - vxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = vxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof uy) {
                                    mz.d(mzVar, (uy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof zx) {
                                    mzVar.O.E(R, (zx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (vxVar != null && (vxVar.d.getBackground() instanceof RippleDrawable)) {
                    vxVar.d.getBackground().setState(new int[0]);
                }
                if (vxVar != null) {
                    vxVar.d.setPressed(false);
                }
            } else if (E != null) {
                vx vxVar2 = new vx();
                vxVar2.a = x10;
                vxVar2.b = y10;
                vxVar2.c = SystemClock.elapsedRealtime();
                vxVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                vxVar2.d.setPressed(true);
                this.b3.put(pointerId, vxVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z11 && this.b3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            mz mzVar = this.c3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = mz.L2;
                mzVar.O(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            mz.e(mzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        u5.release(this, (LongSparseArray<l5>) this.c3.a2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.W2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ux) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.Z2;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((ux) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.qt.q().r(motionEvent, this, this.c3.d2, this.m2);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        mz mzVar = this.c3;
        if (mzVar.a0 && mzVar.W) {
            this.U2 = true;
            mzVar.N.h1(0, 0);
            mzVar.W = false;
            this.U2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        mzVar.l(true);
        w1();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.U2 = true;
        int size = View.MeasureSpec.getSize(i10);
        mz mzVar = this.c3;
        lx lxVar = mzVar.N;
        int i12 = lxVar.J;
        lxVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.U2 = false;
        super.onMeasure(i10, i11);
        if (i12 != lxVar.J) {
            mzVar.O.F(false);
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mz mzVar = this.c3;
        int[] iArr = mzVar.A1;
        tu tuVar = mzVar.y1;
        if (mzVar.O1 != null && tuVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (tuVar != null && tuVar.isShowing() && !tuVar.d) {
                    tuVar.dismiss();
                    int i10 = tuVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) mzVar.O1.getTag();
                    if (mzVar.O1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            mz.d(mzVar, mzVar.O1, mz.g(replace, str));
                        } else {
                            mz.d(mzVar, mzVar.O1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = mz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        mzVar.O1.a(Emoji.getEmojiBigDrawable(str2), mzVar.O1.c);
                        mz.d(mzVar, mzVar.O1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (tuVar == null || !tuVar.d) {
                    mzVar.O1 = null;
                }
                mzVar.R1 = -10000.0f;
                mzVar.S1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = mzVar.R1;
                if (f10 != -10000.0f) {
                    if (Math.abs(f10 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(mzVar.S1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        mzVar.R1 = -10000.0f;
                        mzVar.S1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                tuVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z4 = tuVar.d;
                su suVar = tuVar.c;
                if (!z4) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + tuVar.e)));
                    if (suVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(suVar);
                        int[] iArr2 = suVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            suVar.invalidate();
                        }
                    }
                }
            }
            if (tuVar == null || !tuVar.d || tuVar.isShowing()) {
                return true;
            }
        }
        mzVar.P1 = motionEvent.getX();
        mzVar.Q1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }

    public final void v1(View view) {
        if (this.b3 != null) {
            int i10 = 0;
            while (i10 < this.b3.size()) {
                vx vxVar = (vx) this.b3.valueAt(i10);
                if (vxVar.d == view) {
                    this.b3.removeAt(i10);
                    i10--;
                    View view2 = vxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        vxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = vxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void w1() {
        mz mzVar = this.c3;
        int i10 = mzVar.c;
        kx kxVar = mzVar.M;
        u5[] u5VarArr = new u5[kxVar.getChildCount()];
        for (int i11 = 0; i11 < kxVar.getChildCount(); i11++) {
            View childAt = kxVar.getChildAt(i11);
            if (childAt instanceof uy) {
                u5VarArr[i11] = ((uy) childAt).getSpan();
            }
        }
        mzVar.a2 = u5.update(i10, this, u5VarArr, (LongSparseArray<l5>) mzVar.a2);
    }
}
