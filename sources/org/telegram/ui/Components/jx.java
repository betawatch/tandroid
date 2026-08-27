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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class jx extends zk0 {
    public boolean T2;
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public int Z2;
    public SparseArray a3;
    public final /* synthetic */ yy b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(yy yyVar, Context context) {
        super(context, null);
        this.b3 = yyVar;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = -1;
        new SparseIntArray();
        er erVar = er.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203 A[EDGE_INSN: B:72:0x0203->B:73:0x0203 BREAK  A[LOOP:2: B:47:0x0165->B:68:0x01f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
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
        yy yyVar = this.b3;
        ww wwVar = yyVar.L;
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
        if (yyVar.r2 > 0) {
            if (SystemClock.elapsedRealtime() - yyVar.r2 < Math.max(400L, Math.min(45, yyVar.q2 - yyVar.p2) * 35) + Math.max(600L, Math.min(55, yyVar.q2 - yyVar.p2) * 40) + 150 && yyVar.o2 != null && yyVar.p2 >= 0) {
                z10 = true;
                if (yyVar.Z1 != null && wwVar != null) {
                    for (i12 = 0; i12 < wwVar.getChildCount(); i12++) {
                        View childAt = wwVar.getChildAt(i12);
                        if (childAt instanceof gy) {
                            int top = childAt.getTop() + ((int) childAt.getTranslationY());
                            ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                            if (arrayList5 == null) {
                                arrayList5 = !arrayList.isEmpty() ? (ArrayList) com.google.android.recaptcha.internal.a.k(1, arrayList) : new ArrayList();
                                sparseArray.put(top, arrayList5);
                            }
                            arrayList5.add((gy) childAt);
                        }
                        if (z10 && childAt != null && RecyclerView.R(childAt) == yyVar.p2 - 1) {
                            float interpolation = er.g.getInterpolation(h7.n.a((SystemClock.elapsedRealtime() - yyVar.r2) / 140.0f, 0.0f, 1.0f));
                            if (interpolation < 1.0f) {
                                float f10 = 1.0f - interpolation;
                                canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                                canvas.translate(childAt.getLeft(), childAt.getTop());
                                float f11 = (f10 * 0.5f) + 0.5f;
                                canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                                yyVar.o2.draw(canvas);
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
                    hx hxVar = null;
                    arrayList3 = this.Y2;
                    if (i10 < size) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i10);
                    gy gyVar = (gy) arrayList7.get(i13);
                    int i15 = gyVar.a;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            break;
                        }
                        if (((hx) arrayList2.get(i16)).I == i15) {
                            hxVar = (hx) arrayList2.get(i16);
                            arrayList2.remove(i16);
                            break;
                        }
                        i16++;
                    }
                    if (hxVar == null) {
                        hxVar = !arrayList3.isEmpty() ? (hx) com.google.android.recaptcha.internal.a.k(1, arrayList3) : new hx(this);
                        hxVar.I = i15;
                        hxVar.e();
                    }
                    arrayList6.add(hxVar);
                    hxVar.K = arrayList7;
                    canvas2.save();
                    canvas2.translate(gyVar.getLeft(), gyVar.getY() + gyVar.getPaddingTop());
                    hxVar.J = gyVar.getLeft();
                    int measuredWidth = getMeasuredWidth() - (gyVar.getLeft() * 2);
                    int measuredHeight = gyVar.getMeasuredHeight() - gyVar.getPaddingBottom();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        hxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                    }
                    canvas.restore();
                    invalidate();
                    i10++;
                    canvas2 = canvas;
                    i13 = 0;
                }
                for (i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (arrayList3.size() < 3) {
                        arrayList3.add((hx) arrayList2.get(i11));
                        ((hx) arrayList2.get(i11)).K = null;
                        ((hx) arrayList2.get(i11)).k();
                    } else {
                        ((hx) arrayList2.get(i11)).f();
                    }
                }
                arrayList2.clear();
            }
        }
        z10 = false;
        if (yyVar.Z1 != null) {
            while (i12 < wwVar.getChildCount()) {
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
            hx hxVar2 = null;
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

    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
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
            float x8 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x8, y10);
            if (!z10) {
                ix ixVar = (ix) this.a3.get(pointerId);
                this.a3.remove(pointerId);
                if (E != null && ixVar != null) {
                    if (Math.sqrt(Math.pow(y10 - ixVar.b, 2.0d) + Math.pow(x8 - ixVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        yy yyVar = this.b3;
                        if (!yyVar.x1.isShowing() || SystemClock.elapsedRealtime() - ixVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = ixVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof gy) {
                                    yy.c(yyVar, (gy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof mx) {
                                    yyVar.N.E(R, (mx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (ixVar != null && (ixVar.d.getBackground() instanceof RippleDrawable)) {
                    ixVar.d.getBackground().setState(new int[0]);
                }
                if (ixVar != null) {
                    ixVar.d.setPressed(false);
                }
            } else if (E != null) {
                ix ixVar2 = new ix();
                ixVar2.a = x8;
                ixVar2.b = y10;
                ixVar2.c = SystemClock.elapsedRealtime();
                ixVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                ixVar2.d.setPressed(true);
                this.a3.put(pointerId, ixVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.a3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            yy yyVar = this.b3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = yy.K2;
                yyVar.O(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            yy.e(yyVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        t5.release(this, (LongSparseArray<k5>) this.b3.Z1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.V2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((hx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.Y2;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((hx) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.kt.q().r(motionEvent, this, this.b3.c2, this.l2);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yy yyVar = this.b3;
        if (yyVar.W && yyVar.V) {
            this.T2 = true;
            yyVar.M.h1(0, 0);
            yyVar.V = false;
            this.T2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        yyVar.l(true);
        x1();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.T2 = true;
        int size = View.MeasureSpec.getSize(i10);
        yy yyVar = this.b3;
        xw xwVar = yyVar.M;
        int i12 = xwVar.J;
        xwVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.T2 = false;
        super.onMeasure(i10, i11);
        if (i12 != xwVar.J) {
            yyVar.N.F(false);
        }
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yy yyVar = this.b3;
        int[] iArr = yyVar.z1;
        hu huVar = yyVar.x1;
        if (yyVar.N1 != null && huVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (huVar != null && huVar.isShowing() && !huVar.d) {
                    huVar.dismiss();
                    int i10 = huVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) yyVar.N1.getTag();
                    if (yyVar.N1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            yy.c(yyVar, yyVar.N1, yy.g(replace, str));
                        } else {
                            yy.c(yyVar, yyVar.N1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = yy.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        yyVar.N1.a(Emoji.getEmojiBigDrawable(str2), yyVar.N1.c);
                        yy.c(yyVar, yyVar.N1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (huVar == null || !huVar.d) {
                    yyVar.N1 = null;
                }
                yyVar.Q1 = -10000.0f;
                yyVar.R1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = yyVar.Q1;
                if (f10 != -10000.0f) {
                    if (Math.abs(f10 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(yyVar.R1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                        yyVar.Q1 = -10000.0f;
                        yyVar.R1 = -10000.0f;
                    }
                }
                getLocationOnScreen(iArr);
                float x8 = motionEvent.getX() + iArr[0];
                huVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x8 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = huVar.d;
                gu guVar = huVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + huVar.e)));
                    if (guVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(guVar);
                        int[] iArr2 = guVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            guVar.invalidate();
                        }
                    }
                }
            }
            if (huVar == null || !huVar.d || huVar.isShowing()) {
                return true;
            }
        }
        yyVar.O1 = motionEvent.getX();
        yyVar.P1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
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
                ix ixVar = (ix) this.a3.valueAt(i10);
                if (ixVar.d == view) {
                    this.a3.removeAt(i10);
                    i10--;
                    View view2 = ixVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        ixVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = ixVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void x1() {
        yy yyVar = this.b3;
        int i10 = yyVar.c;
        ww wwVar = yyVar.L;
        t5[] t5VarArr = new t5[wwVar.getChildCount()];
        for (int i11 = 0; i11 < wwVar.getChildCount(); i11++) {
            View childAt = wwVar.getChildAt(i11);
            if (childAt instanceof gy) {
                t5VarArr[i11] = ((gy) childAt).getSpan();
            }
        }
        yyVar.Z1 = t5.update(i10, this, t5VarArr, (LongSparseArray<k5>) yyVar.Z1);
    }
}
