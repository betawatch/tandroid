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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class qx extends jl0 {
    public boolean T2;
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public int Z2;
    public SparseArray a3;
    public final /* synthetic */ fz b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx(fz fzVar, Context context) {
        super(context, null);
        this.b3 = fzVar;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = -1;
        new SparseIntArray();
        jr jrVar = jr.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203 A[EDGE_INSN: B:72:0x0203->B:73:0x0203 BREAK  A[LOOP:2: B:47:0x0165->B:68:0x01f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        Canvas canvas2;
        ArrayList arrayList2;
        int i10;
        int size;
        ArrayList arrayList3;
        int i11;
        int i12;
        fz fzVar = this.b3;
        dx dxVar = fzVar.L;
        super.dispatchDraw(canvas);
        if (this.Z2 != getChildCount()) {
            x1();
            this.Z2 = getChildCount();
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            sparseArray = this.U2;
            int size2 = sparseArray.size();
            arrayList = this.X2;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i14);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i14++;
        }
        sparseArray.clear();
        if (fzVar.r2 > 0) {
            if (SystemClock.elapsedRealtime() - fzVar.r2 < Math.max(400L, Math.min(45, fzVar.q2 - fzVar.p2) * 35) + Math.max(600L, Math.min(55, fzVar.q2 - fzVar.p2) * 40) + 150 && fzVar.o2 != null && fzVar.p2 >= 0) {
                z10 = true;
                if (fzVar.Z1 != null && dxVar != null) {
                    for (i12 = 0; i12 < dxVar.getChildCount(); i12++) {
                        View childAt = dxVar.getChildAt(i12);
                        if (childAt instanceof ny) {
                            int top = childAt.getTop() + ((int) childAt.getTranslationY());
                            ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                            if (arrayList5 == null) {
                                arrayList5 = !arrayList.isEmpty() ? (ArrayList) com.google.android.recaptcha.internal.a.j(1, arrayList) : new ArrayList();
                                sparseArray.put(top, arrayList5);
                            }
                            arrayList5.add((ny) childAt);
                        }
                        if (z10 && childAt != null && RecyclerView.R(childAt) == fzVar.p2 - 1) {
                            float interpolation = jr.g.getInterpolation(i7.w.a((SystemClock.elapsedRealtime() - fzVar.r2) / 140.0f, 0.0f, 1.0f));
                            if (interpolation < 1.0f) {
                                float f9 = 1.0f - interpolation;
                                canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f9), 31);
                                canvas.translate(childAt.getLeft(), childAt.getTop());
                                float f10 = (f9 * 0.5f) + 0.5f;
                                canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                                fzVar.o2.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                }
                canvas2 = canvas;
                arrayList2 = this.W2;
                arrayList2.clear();
                ArrayList arrayList6 = this.V2;
                arrayList2.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                i10 = 0;
                while (true) {
                    size = sparseArray.size();
                    ox oxVar = null;
                    arrayList3 = this.Y2;
                    if (i10 < size) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i10);
                    ny nyVar = (ny) arrayList7.get(i13);
                    int i15 = nyVar.a;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            break;
                        }
                        if (((ox) arrayList2.get(i16)).I == i15) {
                            oxVar = (ox) arrayList2.get(i16);
                            arrayList2.remove(i16);
                            break;
                        }
                        i16++;
                    }
                    if (oxVar == null) {
                        oxVar = !arrayList3.isEmpty() ? (ox) com.google.android.recaptcha.internal.a.j(1, arrayList3) : new ox(this);
                        oxVar.I = i15;
                        oxVar.e();
                    }
                    arrayList6.add(oxVar);
                    oxVar.K = arrayList7;
                    canvas2.save();
                    canvas2.translate(nyVar.getLeft(), nyVar.getY() + nyVar.getPaddingTop());
                    oxVar.J = nyVar.getLeft();
                    int measuredWidth = getMeasuredWidth() - (nyVar.getLeft() * 2);
                    int measuredHeight = nyVar.getMeasuredHeight() - nyVar.getPaddingBottom();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        oxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                    }
                    canvas.restore();
                    invalidate();
                    i10++;
                    canvas2 = canvas;
                    i13 = 0;
                }
                for (i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (arrayList3.size() < 3) {
                        arrayList3.add((ox) arrayList2.get(i11));
                        ((ox) arrayList2.get(i11)).K = null;
                        ((ox) arrayList2.get(i11)).k();
                    } else {
                        ((ox) arrayList2.get(i11)).f();
                    }
                }
                arrayList2.clear();
            }
        }
        z10 = false;
        if (fzVar.Z1 != null) {
            while (i12 < dxVar.getChildCount()) {
            }
        }
        canvas2 = canvas;
        arrayList2 = this.W2;
        arrayList2.clear();
        ArrayList arrayList62 = this.V2;
        arrayList2.addAll(arrayList62);
        arrayList62.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        i10 = 0;
        while (true) {
            size = sparseArray.size();
            ox oxVar2 = null;
            arrayList3 = this.Y2;
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

    @Override // org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z11 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z12 = motionEvent.getActionMasked() == 3;
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.a3 == null) {
                this.a3 = new SparseArray();
            }
            float x4 = motionEvent.getX(actionIndex);
            float y8 = motionEvent.getY(actionIndex);
            View E = E(x4, y8);
            if (!z10) {
                px pxVar = (px) this.a3.get(pointerId);
                this.a3.remove(pointerId);
                if (E != null && pxVar != null) {
                    if (Math.sqrt(Math.pow(y8 - pxVar.b, 2.0d) + Math.pow(x4 - pxVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        fz fzVar = this.b3;
                        if (!fzVar.x1.isShowing() || SystemClock.elapsedRealtime() - pxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = pxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ny) {
                                    fz.b(fzVar, (ny) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof tx) {
                                    fzVar.N.E(R, (tx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (pxVar != null && (pxVar.d.getBackground() instanceof RippleDrawable)) {
                    pxVar.d.getBackground().setState(new int[0]);
                }
                if (pxVar != null) {
                    pxVar.d.setPressed(false);
                }
            } else if (E != null) {
                px pxVar2 = new px();
                pxVar2.a = x4;
                pxVar2.b = y8;
                pxVar2.c = SystemClock.elapsedRealtime();
                pxVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                pxVar2.d.setPressed(true);
                this.a3.put(pointerId, pxVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.a3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            fz fzVar = this.b3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = fz.K2;
                fzVar.O(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            fz.e(fzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        y5.release(this, (LongSparseArray<p5>) this.b3.Z1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.V2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ox) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.Y2;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((ox) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.ht.q().r(motionEvent, this, this.b3.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        fz fzVar = this.b3;
        if (fzVar.W && fzVar.V) {
            this.T2 = true;
            fzVar.M.h1(0, 0);
            fzVar.V = false;
            this.T2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        fzVar.l(true);
        x1();
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.T2 = true;
        int size = View.MeasureSpec.getSize(i10);
        fz fzVar = this.b3;
        ex exVar = fzVar.M;
        int i12 = exVar.J;
        exVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.T2 = false;
        super.onMeasure(i10, i11);
        if (i12 != exVar.J) {
            fzVar.N.F(false);
        }
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fz fzVar = this.b3;
        int[] iArr = fzVar.z1;
        ou ouVar = fzVar.x1;
        if (fzVar.N1 != null && ouVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (ouVar != null && ouVar.isShowing() && !ouVar.d) {
                    ouVar.dismiss();
                    int i10 = ouVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) fzVar.N1.getTag();
                    if (fzVar.N1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            fz.b(fzVar, fzVar.N1, fz.g(replace, str));
                        } else {
                            fz.b(fzVar, fzVar.N1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = fz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        fzVar.N1.a(Emoji.getEmojiBigDrawable(str2), fzVar.N1.c);
                        fz.b(fzVar, fzVar.N1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (ouVar == null || !ouVar.d) {
                    fzVar.N1 = null;
                }
                fzVar.Q1 = -10000.0f;
                fzVar.R1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f9 = fzVar.Q1;
                if (f9 != -10000.0f) {
                    if (Math.abs(f9 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(fzVar.R1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        fzVar.Q1 = -10000.0f;
                        fzVar.R1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x4 = motionEvent.getX() + iArr[0];
                ouVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x4 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = ouVar.d;
                nu nuVar = ouVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + ouVar.e)));
                    if (nuVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(nuVar);
                        int[] iArr2 = nuVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            nuVar.invalidate();
                        }
                    }
                }
            }
            if (ouVar == null || !ouVar.d || ouVar.isShowing()) {
                return true;
            }
        }
        fzVar.O1 = motionEvent.getX();
        fzVar.P1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }

    public final void w1(View view) {
        if (this.a3 != null) {
            int i10 = 0;
            while (i10 < this.a3.size()) {
                px pxVar = (px) this.a3.valueAt(i10);
                if (pxVar.d == view) {
                    this.a3.removeAt(i10);
                    i10--;
                    View view2 = pxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        pxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = pxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void x1() {
        fz fzVar = this.b3;
        int i10 = fzVar.c;
        dx dxVar = fzVar.L;
        y5[] y5VarArr = new y5[dxVar.getChildCount()];
        for (int i11 = 0; i11 < dxVar.getChildCount(); i11++) {
            View childAt = dxVar.getChildAt(i11);
            if (childAt instanceof ny) {
                y5VarArr[i11] = ((ny) childAt).getSpan();
            }
        }
        fzVar.Z1 = y5.update(i10, this, y5VarArr, (LongSparseArray<p5>) fzVar.Z1);
    }
}
