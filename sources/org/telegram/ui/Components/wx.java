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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class wx extends ll0 {
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
    public wx(kz kzVar, Context context) {
        super(context, null);
        this.f3 = kzVar;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.a3 = new ArrayList();
        this.b3 = new ArrayList();
        this.c3 = new ArrayList();
        this.d3 = -1;
        new SparseIntArray();
        pr prVar = pr.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203 A[EDGE_INSN: B:72:0x0203->B:73:0x0203 BREAK  A[LOOP:2: B:47:0x0165->B:68:0x01f6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
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
        kz kzVar = this.f3;
        kx kxVar = kzVar.P;
        super.dispatchDraw(canvas);
        if (this.d3 != getChildCount()) {
            w1();
            this.d3 = getChildCount();
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size2 = sparseArray.size();
            arrayList = this.b3;
            if (i14 >= size2) {
                break;
            }
            ArrayList arrayList4 = (ArrayList) sparseArray.valueAt(i14);
            arrayList4.clear();
            arrayList.add(arrayList4);
            i14++;
        }
        sparseArray.clear();
        if (kzVar.v2 > 0) {
            if (SystemClock.elapsedRealtime() - kzVar.v2 < Math.max(400L, Math.min(45, kzVar.u2 - kzVar.t2) * 35) + Math.max(600L, Math.min(55, kzVar.u2 - kzVar.t2) * 40) + 150 && kzVar.s2 != null && kzVar.t2 >= 0) {
                z10 = true;
                if (kzVar.d2 != null && kxVar != null) {
                    for (i12 = 0; i12 < kxVar.getChildCount(); i12++) {
                        View childAt = kxVar.getChildAt(i12);
                        if (childAt instanceof ty) {
                            int top = childAt.getTop() + ((int) childAt.getTranslationY());
                            ArrayList arrayList5 = (ArrayList) sparseArray.get(top);
                            if (arrayList5 == null) {
                                arrayList5 = !arrayList.isEmpty() ? (ArrayList) i2.g.z(1, arrayList) : new ArrayList();
                                sparseArray.put(top, arrayList5);
                            }
                            arrayList5.add((ty) childAt);
                        }
                        if (z10 && childAt != null && RecyclerView.R(childAt) == kzVar.t2 - 1) {
                            float interpolation = pr.g.getInterpolation(w7.p.a((SystemClock.elapsedRealtime() - kzVar.v2) / 140.0f, 0.0f, 1.0f));
                            if (interpolation < 1.0f) {
                                float f7 = 1.0f - interpolation;
                                canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                                canvas.translate(childAt.getLeft(), childAt.getTop());
                                float f10 = (f7 * 0.5f) + 0.5f;
                                canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                                kzVar.s2.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                }
                canvas2 = canvas;
                arrayList2 = this.a3;
                arrayList2.clear();
                ArrayList arrayList6 = this.Z2;
                arrayList2.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                i10 = 0;
                while (true) {
                    size = sparseArray.size();
                    ux uxVar = null;
                    arrayList3 = this.c3;
                    if (i10 < size) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i10);
                    ty tyVar = (ty) arrayList7.get(i13);
                    int i15 = tyVar.a;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList2.size()) {
                            break;
                        }
                        if (((ux) arrayList2.get(i16)).M == i15) {
                            uxVar = (ux) arrayList2.get(i16);
                            arrayList2.remove(i16);
                            break;
                        }
                        i16++;
                    }
                    if (uxVar == null) {
                        uxVar = !arrayList3.isEmpty() ? (ux) i2.g.z(1, arrayList3) : new ux(this);
                        uxVar.M = i15;
                        uxVar.e();
                    }
                    arrayList6.add(uxVar);
                    uxVar.O = arrayList7;
                    canvas2.save();
                    canvas2.translate(tyVar.getLeft(), tyVar.getY() + tyVar.getPaddingTop());
                    uxVar.N = tyVar.getLeft();
                    int measuredWidth = getMeasuredWidth() - (tyVar.getLeft() * 2);
                    int measuredHeight = tyVar.getMeasuredHeight() - tyVar.getPaddingBottom();
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
                        ((ux) arrayList2.get(i11)).O = null;
                        ((ux) arrayList2.get(i11)).k();
                    } else {
                        ((ux) arrayList2.get(i11)).f();
                    }
                }
                arrayList2.clear();
            }
        }
        z10 = false;
        if (kzVar.d2 != null) {
            while (i12 < kxVar.getChildCount()) {
            }
        }
        canvas2 = canvas;
        arrayList2 = this.a3;
        arrayList2.clear();
        ArrayList arrayList62 = this.Z2;
        arrayList2.addAll(arrayList62);
        arrayList62.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        i10 = 0;
        while (true) {
            size = sparseArray.size();
            ux uxVar2 = null;
            arrayList3 = this.c3;
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

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
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
                vx vxVar = (vx) this.e3.get(pointerId);
                this.e3.remove(pointerId);
                if (E != null && vxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - vxVar.b, 2.0d) + Math.pow(x10 - vxVar.a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        kz kzVar = this.f3;
                        if (!kzVar.B1.isShowing() || SystemClock.elapsedRealtime() - vxVar.c < ViewConfiguration.getLongPressTimeout()) {
                            View view = vxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ty) {
                                    kz.d(kzVar, (ty) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof zx) {
                                    kzVar.R.E(R, (zx) view);
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
                vxVar2.b = y3;
                vxVar2.c = SystemClock.elapsedRealtime();
                vxVar2.d = E;
                if (E.getBackground() instanceof RippleDrawable) {
                    E.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                }
                vxVar2.d.setPressed(true);
                this.e3.put(pointerId, vxVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.e3.size() > 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            kz kzVar = this.f3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = kz.O2;
                kzVar.O(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            kz.e(kzVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
            ((ux) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.c3;
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

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.st.q().r(motionEvent, this, this.f3.g2, this.p2);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
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
        w1();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.X2 = true;
        int size = View.MeasureSpec.getSize(i10);
        kz kzVar = this.f3;
        lx lxVar = kzVar.Q;
        int i12 = lxVar.J;
        lxVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.X2 = false;
        super.onMeasure(i10, i11);
        if (i12 != lxVar.J) {
            kzVar.R.F(false);
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kz kzVar = this.f3;
        int[] iArr = kzVar.D1;
        vu vuVar = kzVar.B1;
        if (kzVar.R1 != null && vuVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (vuVar != null && vuVar.isShowing() && !vuVar.d) {
                    vuVar.dismiss();
                    int i10 = vuVar.c.n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String str2 = (String) kzVar.R1.getTag();
                    if (kzVar.R1.c) {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            kz.d(kzVar, kzVar.R1, kz.g(replace, str));
                        } else {
                            kz.d(kzVar, kzVar.R1, replace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = kz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        kzVar.R1.a(Emoji.getEmojiBigDrawable(str2), kzVar.R1.c);
                        kz.d(kzVar, kzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (vuVar == null || !vuVar.d) {
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
                vuVar.c.getLocationOnScreen(iArr);
                int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                boolean z10 = vuVar.d;
                uu uuVar = vuVar.c;
                if (!z10) {
                    int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + vuVar.e)));
                    if (uuVar.n[0] != max) {
                        AndroidUtilities.vibrateCursor(uuVar);
                        int[] iArr2 = uuVar.n;
                        if (iArr2[0] != max) {
                            iArr2[0] = max;
                            uuVar.invalidate();
                        }
                    }
                }
            }
            if (vuVar == null || !vuVar.d || vuVar.isShowing()) {
                return true;
            }
        }
        kzVar.S1 = motionEvent.getX();
        kzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }

    public final void v1(View view) {
        if (this.e3 != null) {
            int i10 = 0;
            while (i10 < this.e3.size()) {
                vx vxVar = (vx) this.e3.valueAt(i10);
                if (vxVar.d == view) {
                    this.e3.removeAt(i10);
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
        kz kzVar = this.f3;
        int i10 = kzVar.c;
        kx kxVar = kzVar.P;
        z5[] z5VarArr = new z5[kxVar.getChildCount()];
        for (int i11 = 0; i11 < kxVar.getChildCount(); i11++) {
            View childAt = kxVar.getChildAt(i11);
            if (childAt instanceof ty) {
                z5VarArr[i11] = ((ty) childAt).getSpan();
            }
        }
        kzVar.d2 = z5.update(i10, this, z5VarArr, (LongSparseArray<q5>) kzVar.d2);
    }
}
