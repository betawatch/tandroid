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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ix extends wk0 {
    public boolean T2;
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public int Z2;
    public SparseArray a3;
    public final /* synthetic */ wy b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(wy wyVar, Context context) {
        super(context, null);
        this.b3 = wyVar;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = -1;
        new SparseIntArray();
        gr grVar = gr.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203 A[EDGE_INSN: B:72:0x0203->B:73:0x0203 BREAK  A[LOOP:2: B:47:0x0165->B:68:0x01f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        Canvas canvas2;
        ArrayList arrayList2;
        int i9;
        int size;
        ArrayList arrayList3;
        int i10;
        int i11;
        wy wyVar = this.b3;
        ww wwVar = wyVar.L;
        super.dispatchDraw(canvas);
        if (this.Z2 != getChildCount()) {
            x1();
            this.Z2 = getChildCount();
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            sparseArray = this.U2;
            int size2 = sparseArray.size();
            arrayList = this.X2;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i13);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i13++;
        }
        sparseArray.clear();
        if (wyVar.r2 > 0) {
            if (SystemClock.elapsedRealtime() - wyVar.r2 < Math.max(400L, Math.min(45, wyVar.q2 - wyVar.p2) * 35) + Math.max(600L, Math.min(55, wyVar.q2 - wyVar.p2) * 40) + 150 && wyVar.o2 != null && wyVar.p2 >= 0) {
                z10 = true;
                if (wyVar.Z1 != null && wwVar != null) {
                    for (i11 = 0; i11 < wwVar.getChildCount(); i11++) {
                        View childAt = wwVar.getChildAt(i11);
                        if (childAt instanceof fy) {
                            int top = childAt.getTop() + ((int) childAt.getTranslationY());
                            ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                            if (arrayList5 == null) {
                                arrayList5 = !arrayList.isEmpty() ? (ArrayList) e2.c.k(1, arrayList) : new ArrayList();
                                sparseArray.put(top, arrayList5);
                            }
                            arrayList5.add((fy) childAt);
                        }
                        if (z10 && childAt != null && RecyclerView.R(childAt) == wyVar.p2 - 1) {
                            float interpolation = gr.g.getInterpolation(g7.n.a((SystemClock.elapsedRealtime() - wyVar.r2) / 140.0f, 0.0f, 1.0f));
                            if (interpolation < 1.0f) {
                                float f10 = 1.0f - interpolation;
                                canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                                canvas.translate(childAt.getLeft(), childAt.getTop());
                                float f11 = (f10 * 0.5f) + 0.5f;
                                canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                                wyVar.o2.draw(canvas);
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
                i9 = 0;
                while (true) {
                    size = sparseArray.size();
                    gx gxVar = null;
                    arrayList3 = this.Y2;
                    if (i9 < size) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i9);
                    fy fyVar = (fy) arrayList7.get(i12);
                    int i14 = fyVar.a;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            break;
                        }
                        if (((gx) arrayList2.get(i15)).I == i14) {
                            gxVar = (gx) arrayList2.get(i15);
                            arrayList2.remove(i15);
                            break;
                        }
                        i15++;
                    }
                    if (gxVar == null) {
                        gxVar = !arrayList3.isEmpty() ? (gx) e2.c.k(1, arrayList3) : new gx(this);
                        gxVar.I = i14;
                        gxVar.e();
                    }
                    arrayList6.add(gxVar);
                    gxVar.K = arrayList7;
                    canvas2.save();
                    canvas2.translate(fyVar.getLeft(), fyVar.getY() + fyVar.getPaddingTop());
                    gxVar.J = fyVar.getLeft();
                    int measuredWidth = getMeasuredWidth() - (fyVar.getLeft() * 2);
                    int measuredHeight = fyVar.getMeasuredHeight() - fyVar.getPaddingBottom();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        gxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                    }
                    canvas.restore();
                    invalidate();
                    i9++;
                    canvas2 = canvas;
                    i12 = 0;
                }
                for (i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (arrayList3.size() < 3) {
                        arrayList3.add((gx) arrayList2.get(i10));
                        ((gx) arrayList2.get(i10)).K = null;
                        ((gx) arrayList2.get(i10)).k();
                    } else {
                        ((gx) arrayList2.get(i10)).f();
                    }
                }
                arrayList2.clear();
            }
        }
        z10 = false;
        if (wyVar.Z1 != null) {
            while (i11 < wwVar.getChildCount()) {
            }
        }
        canvas2 = canvas;
        arrayList2 = this.W2;
        arrayList2.clear();
        ArrayList arrayList62 = this.V2;
        arrayList2.addAll(arrayList62);
        arrayList62.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        i9 = 0;
        while (true) {
            size = sparseArray.size();
            gx gxVar2 = null;
            arrayList3 = this.Y2;
            if (i9 < size) {
            }
            canvas.restore();
            invalidate();
            i9++;
            canvas2 = canvas;
            i12 = 0;
        }
        while (i10 < arrayList2.size()) {
        }
        arrayList2.clear();
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
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
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (!z10) {
                hx hxVar = (hx) this.a3.get(pointerId);
                this.a3.remove(pointerId);
                if (E != null && hxVar != null) {
                    if (Math.sqrt(Math.pow(y10 - hxVar.b, 2.0d) + Math.pow(x10 - hxVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        wy wyVar = this.b3;
                        if (!wyVar.x1.isShowing() || SystemClock.elapsedRealtime() - hxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = hxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof fy) {
                                    wy.c(wyVar, (fy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof lx) {
                                    wyVar.N.E(R, (lx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (hxVar != null && (hxVar.d.getBackground() instanceof RippleDrawable)) {
                    hxVar.d.getBackground().setState(new int[0]);
                }
                if (hxVar != null) {
                    hxVar.d.setPressed(false);
                }
            } else if (E != null) {
                hx hxVar2 = new hx();
                hxVar2.a = x10;
                hxVar2.b = y10;
                hxVar2.c = SystemClock.elapsedRealtime();
                hxVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                hxVar2.d.setPressed(true);
                this.a3.put(pointerId, hxVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.a3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i9) {
        if (i9 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            wy wyVar = this.b3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i10 = wy.K2;
                wyVar.N(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            wy.e(wyVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        t5.release(this, (LongSparseArray<k5>) this.b3.Z1);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.V2;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((gx) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.Y2;
            if (i9 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((gx) arrayList2.get(i9)).f();
                i9++;
            }
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.ht.q().r(motionEvent, this, this.b3.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wy wyVar = this.b3;
        if (wyVar.W && wyVar.V) {
            this.T2 = true;
            wyVar.M.h1(0, 0);
            wyVar.V = false;
            this.T2 = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        wyVar.l(true);
        x1();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        this.T2 = true;
        int size = View.MeasureSpec.getSize(i9);
        wy wyVar = this.b3;
        xw xwVar = wyVar.M;
        int i11 = xwVar.J;
        xwVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.T2 = false;
        super.onMeasure(i9, i10);
        if (i11 != xwVar.J) {
            wyVar.N.F(false);
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wy wyVar = this.b3;
        int[] iArr = wyVar.z1;
        iu iuVar = wyVar.x1;
        if (wyVar.N1 != null && iuVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (iuVar != null && iuVar.isShowing() && !iuVar.d) {
                    iuVar.dismiss();
                    int i9 = iuVar.c.n[0];
                    String str = (i9 < 1 || i9 > 5) ? null : CompoundEmoji.skinTones.get(i9 - 1);
                    String str2 = (String) wyVar.N1.getTag();
                    if (wyVar.N1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            wy.c(wyVar, wyVar.N1, wy.g(replace, str));
                        } else {
                            wy.c(wyVar, wyVar.N1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = wy.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        wyVar.N1.a(Emoji.getEmojiBigDrawable(str2), wyVar.N1.c);
                        wy.c(wyVar, wyVar.N1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (iuVar == null || !iuVar.d) {
                    wyVar.N1 = null;
                }
                wyVar.Q1 = -10000.0f;
                wyVar.R1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = wyVar.Q1;
                if (f10 != -10000.0f) {
                    if (Math.abs(f10 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(wyVar.R1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        wyVar.Q1 = -10000.0f;
                        wyVar.R1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x10 = motionEvent.getX() + iArr[0];
                iuVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = iuVar.d;
                hu huVar = iuVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + iuVar.e)));
                    if (huVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(huVar);
                        int[] iArr2 = huVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            huVar.invalidate();
                        }
                    }
                }
            }
            if (iuVar == null || !iuVar.d || iuVar.isShowing()) {
                return true;
            }
        }
        wyVar.O1 = motionEvent.getX();
        wyVar.P1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }

    public final void w1(View view) {
        if (this.a3 != null) {
            int i9 = 0;
            while (i9 < this.a3.size()) {
                hx hxVar = (hx) this.a3.valueAt(i9);
                if (hxVar.d == view) {
                    this.a3.removeAt(i9);
                    i9--;
                    View view2 = hxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        hxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = hxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i9++;
            }
        }
    }

    public final void x1() {
        wy wyVar = this.b3;
        int i9 = wyVar.c;
        ww wwVar = wyVar.L;
        t5[] t5VarArr = new t5[wwVar.getChildCount()];
        for (int i10 = 0; i10 < wwVar.getChildCount(); i10++) {
            View childAt = wwVar.getChildAt(i10);
            if (childAt instanceof fy) {
                t5VarArr[i10] = ((fy) childAt).getSpan();
            }
        }
        wyVar.Z1 = t5.update(i9, this, t5VarArr, (LongSparseArray<k5>) wyVar.Z1);
    }
}
