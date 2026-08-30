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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class ux extends sl0 {
    public boolean U2;
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public int a3;
    public SparseArray b3;
    public final /* synthetic */ kz c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(kz kzVar, Context context) {
        super(context, null);
        this.c3 = kzVar;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.a3 = -1;
        new SparseIntArray();
        nr nrVar = nr.f;
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
        kz kzVar = this.c3;
        ix ixVar = kzVar.M;
        super.dispatchDraw(canvas);
        if (this.a3 != getChildCount()) {
            x1();
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
        if (kzVar.s2 > 0) {
            if (SystemClock.elapsedRealtime() - kzVar.s2 < Math.max(400L, Math.min(45, kzVar.r2 - kzVar.q2) * 35) + Math.max(600L, Math.min(55, kzVar.r2 - kzVar.q2) * 40) + 150 && kzVar.p2 != null && kzVar.q2 >= 0) {
                z4 = true;
                if (kzVar.a2 != null && ixVar != null) {
                    for (i12 = 0; i12 < ixVar.getChildCount(); i12++) {
                        View childAt = ixVar.getChildAt(i12);
                        if (childAt instanceof sy) {
                            int top = childAt.getTop() + ((int) childAt.getTranslationY());
                            ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                            if (arrayList5 == null) {
                                arrayList5 = !arrayList.isEmpty() ? (ArrayList) e2.c.g(1, arrayList) : new ArrayList();
                                sparseArray.put(top, arrayList5);
                            }
                            arrayList5.add((sy) childAt);
                        }
                        if (z4 && childAt != null && RecyclerView.R(childAt) == kzVar.q2 - 1) {
                            float interpolation = nr.g.getInterpolation(k7.n.a((SystemClock.elapsedRealtime() - kzVar.s2) / 140.0f, 0.0f, 1.0f));
                            if (interpolation < 1.0f) {
                                float f10 = 1.0f - interpolation;
                                canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                                canvas.translate(childAt.getLeft(), childAt.getTop());
                                float f11 = (f10 * 0.5f) + 0.5f;
                                canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                                kzVar.p2.draw(canvas);
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
                    sx sxVar = null;
                    arrayList3 = this.Z2;
                    if (i10 < size) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i10);
                    sy syVar = (sy) arrayList7.get(i13);
                    int i15 = syVar.a;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            break;
                        }
                        if (((sx) arrayList2.get(i16)).J == i15) {
                            sxVar = (sx) arrayList2.get(i16);
                            arrayList2.remove(i16);
                            break;
                        }
                        i16++;
                    }
                    if (sxVar == null) {
                        sxVar = !arrayList3.isEmpty() ? (sx) e2.c.g(1, arrayList3) : new sx(this);
                        sxVar.J = i15;
                        sxVar.e();
                    }
                    arrayList6.add(sxVar);
                    sxVar.L = arrayList7;
                    canvas2.save();
                    canvas2.translate(syVar.getLeft(), syVar.getY() + syVar.getPaddingTop());
                    sxVar.K = syVar.getLeft();
                    int measuredWidth = getMeasuredWidth() - (syVar.getLeft() * 2);
                    int measuredHeight = syVar.getMeasuredHeight() - syVar.getPaddingBottom();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        sxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                    }
                    canvas.restore();
                    invalidate();
                    i10++;
                    canvas2 = canvas;
                    i13 = 0;
                }
                for (i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (arrayList3.size() < 3) {
                        arrayList3.add((sx) arrayList2.get(i11));
                        ((sx) arrayList2.get(i11)).L = null;
                        ((sx) arrayList2.get(i11)).k();
                    } else {
                        ((sx) arrayList2.get(i11)).f();
                    }
                }
                arrayList2.clear();
            }
        }
        z4 = false;
        if (kzVar.a2 != null) {
            while (i12 < ixVar.getChildCount()) {
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
            sx sxVar2 = null;
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
                tx txVar = (tx) this.b3.get(pointerId);
                this.b3.remove(pointerId);
                if (E != null && txVar != null) {
                    if (Math.sqrt(Math.pow(y10 - txVar.b, 2.0d) + Math.pow(x10 - txVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z11) {
                        kz kzVar = this.c3;
                        if (!kzVar.y1.isShowing() || SystemClock.elapsedRealtime() - txVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = txVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof sy) {
                                    kz.d(kzVar, (sy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof xx) {
                                    kzVar.O.E(R, (xx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (txVar != null && (txVar.d.getBackground() instanceof RippleDrawable)) {
                    txVar.d.getBackground().setState(new int[0]);
                }
                if (txVar != null) {
                    txVar.d.setPressed(false);
                }
            } else if (E != null) {
                tx txVar2 = new tx();
                txVar2.a = x10;
                txVar2.b = y10;
                txVar2.c = SystemClock.elapsedRealtime();
                txVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                txVar2.d.setPressed(true);
                this.b3.put(pointerId, txVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z11 && this.b3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            kz kzVar = this.c3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = kz.L2;
                kzVar.O(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            kz.e(kzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1();
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
            ((sx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.Z2;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((sx) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.pt.q().r(motionEvent, this, this.c3.d2, this.m2);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        kz kzVar = this.c3;
        if (kzVar.a0 && kzVar.W) {
            this.U2 = true;
            kzVar.N.h1(0, 0);
            kzVar.W = false;
            this.U2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        kzVar.l(true);
        x1();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.U2 = true;
        int size = View.MeasureSpec.getSize(i10);
        kz kzVar = this.c3;
        jx jxVar = kzVar.N;
        int i12 = jxVar.J;
        jxVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.U2 = false;
        super.onMeasure(i10, i11);
        if (i12 != jxVar.J) {
            kzVar.O.F(false);
        }
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.c3;
        int[] iArr = kzVar.A1;
        ru ruVar = kzVar.y1;
        if (kzVar.O1 != null && ruVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (ruVar != null && ruVar.isShowing() && !ruVar.d) {
                    ruVar.dismiss();
                    int i10 = ruVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) kzVar.O1.getTag();
                    if (kzVar.O1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            kz.d(kzVar, kzVar.O1, kz.g(replace, str));
                        } else {
                            kz.d(kzVar, kzVar.O1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = kz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        kzVar.O1.a(Emoji.getEmojiBigDrawable(str2), kzVar.O1.c);
                        kz.d(kzVar, kzVar.O1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (ruVar == null || !ruVar.d) {
                    kzVar.O1 = null;
                }
                kzVar.R1 = -10000.0f;
                kzVar.S1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = kzVar.R1;
                if (f10 != -10000.0f) {
                    if (Math.abs(f10 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(kzVar.S1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        kzVar.R1 = -10000.0f;
                        kzVar.S1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                ruVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z4 = ruVar.d;
                qu quVar = ruVar.c;
                if (!z4) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + ruVar.e)));
                    if (quVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(quVar);
                        int[] iArr2 = quVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            quVar.invalidate();
                        }
                    }
                }
            }
            if (ruVar == null || !ruVar.d || ruVar.isShowing()) {
                return true;
            }
        }
        kzVar.P1 = motionEvent.getX();
        kzVar.Q1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }

    public final void w1(View view) {
        if (this.b3 != null) {
            int i10 = 0;
            while (i10 < this.b3.size()) {
                tx txVar = (tx) this.b3.valueAt(i10);
                if (txVar.d == view) {
                    this.b3.removeAt(i10);
                    i10--;
                    View view2 = txVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        txVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = txVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void x1() {
        kz kzVar = this.c3;
        int i10 = kzVar.c;
        ix ixVar = kzVar.M;
        u5[] u5VarArr = new u5[ixVar.getChildCount()];
        for (int i11 = 0; i11 < ixVar.getChildCount(); i11++) {
            View childAt = ixVar.getChildAt(i11);
            if (childAt instanceof sy) {
                u5VarArr[i11] = ((sy) childAt).getSpan();
            }
        }
        kzVar.a2 = u5.update(i10, this, u5VarArr, (LongSparseArray<l5>) kzVar.a2);
    }
}
