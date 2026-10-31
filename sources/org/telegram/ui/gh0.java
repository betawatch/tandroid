package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gh0 extends org.telegram.ui.Components.tk0 {
    public final ArrayList e3;
    public final org.telegram.ui.Components.t5 f3;
    public final org.telegram.ui.Components.t5 g3;
    public final li.k h3;
    public final /* synthetic */ kh0 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(kh0 kh0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.i3 = kh0Var;
        this.e3 = new ArrayList(10);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f3 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.g3 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.h3 = new li.k(23);
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a6, code lost:
    
        if (r2.d.size() != 1) goto L169;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.ej currentMessagesGroup;
        int i11;
        float f7;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.ej currentMessagesGroup2;
        ArrayList arrayList4;
        org.telegram.messenger.ej ejVar;
        gh0 gh0Var;
        ArrayList arrayList5;
        kh0 kh0Var;
        int i12;
        gh0 gh0Var2;
        org.telegram.messenger.ej currentMessagesGroup3;
        org.telegram.messenger.ej currentMessagesGroup4;
        kh0 kh0Var2 = this.i3;
        fh0 fh0Var = kh0Var2.F;
        int measuredHeight = fh0Var.getMeasuredHeight();
        gh0 gh0Var3 = kh0Var2.J;
        int childCount = gh0Var3.getChildCount();
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = gh0Var3.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                RectF rectF = zg.h.h;
                zg.h.c(q1Var2, fh0Var, rectF);
                float f10 = rectF.top;
                int i14 = (int) f10;
                childAt.getMeasuredHeight();
                int i15 = i14 >= 0 ? 0 : -i14;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i15 + measuredHeight;
                }
                q1Var2.w3(i15, measuredHeight2 - i15, measuredHeight, f10, f10, fh0Var.getMeasuredWidth(), fh0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, org.telegram.messenger.zs.e4, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        org.telegram.messenger.ej ejVar2 = null;
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.q1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != ejVar2)) {
                ejVar2 = currentMessagesGroup4;
            }
        }
        int i17 = 0;
        while (true) {
            arrayList = this.e3;
            int i18 = 2;
            i10 = 3;
            if (i17 >= 3) {
                break;
            }
            arrayList.clear();
            if (i17 != 2 || gh0Var3.V1) {
                int i19 = z10 ? 1 : 0;
                ?? r92 = z10;
                while (i19 < childCount2) {
                    View childAt3 = gh0Var3.getChildAt(i19);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= gh0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.dj djVar = currentMessagesGroup3.m;
                            if ((i17 != 0 || currentMessagesGroup3.d.size() != z11) && ((i17 != z11 || djVar.i) && ((i17 != 0 || !q1Var3.getMessageObject().Z) && ((i17 != z11 || q1Var3.getMessageObject().Z) && ((i17 != i18 || q1Var3.xa) && (i17 == i18 || !q1Var3.xa)))))) {
                                if (!arrayList.contains(currentMessagesGroup3)) {
                                    djVar.a = r92;
                                    djVar.b = r92;
                                    djVar.c = r92;
                                    djVar.d = r92;
                                    djVar.l = r92;
                                    djVar.k = r92;
                                    djVar.m = q1Var3;
                                    arrayList.add(currentMessagesGroup3);
                                }
                                djVar.k = q1Var3.F2();
                                djVar.l = q1Var3.E2();
                                int x10 = (int) (q1Var3.getX() + q1Var3.getBackgroundDrawableLeft());
                                int x11 = (int) (q1Var3.getX() + q1Var3.getBackgroundDrawableRight());
                                int y3 = (int) (q1Var3.getY() + q1Var3.getPaddingTop() + q1Var3.getBackgroundDrawableTop());
                                int y10 = (int) (q1Var3.getY() + q1Var3.getPaddingTop() + q1Var3.getBackgroundDrawableBottom());
                                if ((q1Var3.getCurrentPosition().l & 4) == 0) {
                                    y3 -= org.telegram.messenger.i0.L(10.0f);
                                }
                                if ((q1Var3.getCurrentPosition().l & 8) == 0) {
                                    y10 += org.telegram.messenger.i0.L(10.0f);
                                }
                                if (q1Var3.xa) {
                                    djVar.m = q1Var3;
                                }
                                int i20 = djVar.b;
                                if (i20 == 0 || y3 < i20) {
                                    djVar.b = y3;
                                }
                                int i21 = djVar.d;
                                if (i21 == 0 || y10 > i21) {
                                    djVar.d = y10;
                                }
                                int i22 = djVar.a;
                                if (i22 == 0 || x10 < i22) {
                                    djVar.a = x10;
                                }
                                int i23 = djVar.c;
                                if (i23 == 0 || x11 > i23) {
                                    djVar.c = x11;
                                }
                            }
                        }
                    }
                    i19++;
                    i18 = 2;
                    r92 = 0;
                }
                int i24 = 0;
                ArrayList arrayList6 = arrayList;
                while (i24 < arrayList6.size()) {
                    org.telegram.messenger.ej ejVar3 = (org.telegram.messenger.ej) arrayList6.get(i24);
                    if (ejVar3 == null) {
                        arrayList5 = arrayList6;
                        gh0Var2 = gh0Var3;
                        kh0Var = kh0Var2;
                        i12 = i24;
                    } else {
                        org.telegram.messenger.dj djVar2 = ejVar3.m;
                        float P1 = djVar2.m.P1(z11);
                        float f11 = djVar2.a + P1 + djVar2.e;
                        float f12 = djVar2.b + djVar2.f;
                        float f13 = djVar2.g + djVar2.c + P1;
                        float f14 = djVar2.d + djVar2.h;
                        if (f12 < (-org.telegram.messenger.i0.L(20.0f))) {
                            f12 = -org.telegram.messenger.i0.L(20.0f);
                        }
                        if (f14 > org.telegram.messenger.i0.L(20.0f) + gh0Var3.getMeasuredHeight()) {
                            f14 = org.telegram.messenger.i0.L(20.0f) + gh0Var3.getMeasuredHeight();
                        }
                        boolean z12 = (djVar2.m.getScaleX() == 1.0f && djVar2.m.getScaleY() == 1.0f) ? false : z11;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            ejVar = ejVar3;
                            gh0Var = gh0Var3;
                            canvas2.scale(djVar2.m.getScaleX(), djVar2.m.getScaleY(), c3.i0.B(f13, f11, 2.0f, f11), c3.i0.B(f14, f12, 2.0f, f12));
                        } else {
                            arrayList4 = arrayList6;
                            ejVar = ejVar3;
                            gh0Var = gh0Var3;
                        }
                        float f15 = f12;
                        float f16 = f14;
                        arrayList5 = arrayList4;
                        kh0Var = kh0Var2;
                        org.telegram.messenger.ej ejVar4 = ejVar;
                        i12 = i24;
                        gh0Var2 = gh0Var;
                        djVar2.m.I0(canvas2, (int) f11, (int) f12, (int) f13, (int) f14, djVar2.k, djVar2.l, false, 0);
                        djVar2.m = null;
                        djVar2.o = ejVar4.c;
                        if (z12) {
                            canvas.restore();
                            for (int i25 = 0; i25 < childCount2; i25++) {
                                View childAt4 = gh0Var2.getChildAt(i25);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                    if (q1Var4.getCurrentMessagesGroup() == ejVar4) {
                                        int left = q1Var4.getLeft();
                                        int top = q1Var4.getTop();
                                        childAt4.setPivotX(((f13 - f11) / 2.0f) + (f11 - left));
                                        childAt4.setPivotY(((f16 - f15) / 2.0f) + (f15 - top));
                                    }
                                }
                            }
                        }
                    }
                    i24 = i12 + 1;
                    canvas2 = canvas;
                    gh0Var3 = gh0Var2;
                    kh0Var2 = kh0Var;
                    arrayList6 = arrayList5;
                    z11 = true;
                }
            }
            i17++;
            canvas2 = canvas;
            gh0Var3 = gh0Var3;
            kh0Var2 = kh0Var2;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList7 = arrayList;
        gh0 gh0Var4 = gh0Var3;
        kh0 kh0Var3 = kh0Var2;
        float f17 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        org.telegram.messenger.ej ejVar5 = null;
        int i26 = 0;
        while (i26 < childCount3) {
            View childAt5 = getChildAt(i26);
            if (!(childAt5 instanceof org.telegram.ui.Cells.q1) || ((currentMessagesGroup2 = (q1Var = (org.telegram.ui.Cells.q1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == ejVar5)) {
                i11 = i10;
                f7 = f17;
            } else {
                if (currentMessagesGroup2 == null) {
                    i11 = i10;
                    f7 = f17;
                    kh0Var3.i(canvas, q1Var.getBoundsLeft(), q1Var.getY(), q1Var.getBoundsRight(), q1Var.getY() + q1Var.getHeight());
                } else {
                    i11 = i10;
                    f7 = f17;
                }
                ejVar5 = currentMessagesGroup2;
            }
            i26++;
            i10 = i11;
            f17 = f7;
        }
        int i27 = i10;
        float f18 = f17;
        int i28 = 0;
        while (i28 < i27) {
            arrayList7.clear();
            if (i28 != 2 || gh0Var4.V1) {
                int i29 = 0;
                while (i29 < childCount3) {
                    View childAt6 = gh0Var4.getChildAt(i29);
                    if (childAt6 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) childAt6;
                        if (childAt6.getY() <= gh0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f18 && (currentMessagesGroup = q1Var5.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.dj djVar3 = currentMessagesGroup.m;
                            int i30 = i28 == 0 ? 1 : 1;
                            if ((i28 != i30 || djVar3.i) && ((i28 != 0 || !q1Var5.getMessageObject().Z) && ((i28 != 1 || q1Var5.getMessageObject().Z) && ((i28 != 2 || q1Var5.xa) && (i28 == 2 || !q1Var5.xa))))) {
                                arrayList3 = arrayList7;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    djVar3.a = 0;
                                    djVar3.b = 0;
                                    djVar3.c = 0;
                                    djVar3.d = 0;
                                    djVar3.l = false;
                                    djVar3.k = false;
                                    djVar3.m = q1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                djVar3.k = q1Var5.F2();
                                djVar3.l = q1Var5.E2();
                                int x12 = (int) (q1Var5.getX() + q1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (q1Var5.getX() + q1Var5.getBackgroundDrawableRight());
                                int y11 = (int) (q1Var5.getY() + q1Var5.getPaddingTop() + q1Var5.getBackgroundDrawableTop());
                                int y12 = (int) (q1Var5.getY() + q1Var5.getPaddingTop() + q1Var5.getBackgroundDrawableBottom());
                                if ((q1Var5.getCurrentPosition().l & 4) == 0) {
                                    y11 -= org.telegram.messenger.i0.L(10.0f);
                                }
                                if ((q1Var5.getCurrentPosition().l & 8) == 0) {
                                    y12 += org.telegram.messenger.i0.L(10.0f);
                                }
                                if (q1Var5.xa) {
                                    djVar3.m = q1Var5;
                                }
                                int i31 = djVar3.b;
                                if (i31 == 0 || y11 < i31) {
                                    djVar3.b = y11;
                                }
                                int i32 = djVar3.d;
                                if (i32 == 0 || y12 > i32) {
                                    djVar3.d = y12;
                                }
                                int i33 = djVar3.a;
                                if (i33 == 0 || x12 < i33) {
                                    djVar3.a = x12;
                                }
                                int i34 = djVar3.c;
                                if (i34 == 0 || x13 > i34) {
                                    djVar3.c = x13;
                                }
                                i29++;
                                arrayList7 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList7;
                    i29++;
                    arrayList7 = arrayList3;
                }
                arrayList2 = arrayList7;
                for (int i35 = 0; i35 < arrayList2.size(); i35++) {
                    org.telegram.messenger.dj djVar4 = ((org.telegram.messenger.ej) arrayList2.get(i35)).m;
                    float P12 = djVar4.m.P1(true);
                    float f19 = djVar4.e + djVar4.a + P12;
                    float f20 = djVar4.b + djVar4.f;
                    float f21 = djVar4.c + P12 + djVar4.g;
                    float f22 = djVar4.d + djVar4.h;
                    if (f20 < (-org.telegram.messenger.i0.L(20.0f))) {
                        f20 = -org.telegram.messenger.i0.L(20.0f);
                    }
                    float f23 = f20;
                    if (f22 > org.telegram.messenger.i0.L(20.0f) + gh0Var4.getMeasuredHeight()) {
                        f22 = org.telegram.messenger.i0.L(20.0f) + gh0Var4.getMeasuredHeight();
                    }
                    float f24 = f22;
                    kh0 kh0Var4 = kh0Var3;
                    kh0Var4.i(canvas, f19, f23, f21, f24);
                    kh0Var3 = kh0Var4;
                    djVar4.m = null;
                }
            } else {
                arrayList2 = arrayList7;
            }
            i28++;
            arrayList7 = arrayList2;
        }
        canvas.save();
        float d = this.f3.d(canScrollVertically(-1));
        float d10 = this.g3.d(canScrollVertically(1));
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(f18, getScrollY(), getWidth(), org.telegram.messenger.i0.L(14.0f) + getScrollY());
        li.k kVar = this.h3;
        kVar.o(canvas, rectF2, 1, d);
        rectF2.set(f18, (getHeight() + getScrollY()) - org.telegram.messenger.i0.L(14.0f), getWidth(), getHeight() + getScrollY());
        kVar.o(canvas, rectF2, i27, d10);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        kh0 kh0Var = this.i3;
        if (kh0Var.w && ((view == (q1Var = kh0Var.P) && q1Var != null && q1Var.getCurrentPosition() == null) || view == kh0Var.W)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.q1)) {
            return true;
        }
        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
        q1Var2.setInvalidatesParent(true);
        q1Var2.Q0(canvas);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.J0() && q1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, q1Var2.getPaddingTop());
            q1Var2.K0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(q1Var2.getX(), q1Var2.getY() + q1Var2.getPaddingTop());
        canvas.scale(q1Var2.getScaleX(), q1Var2.getScaleY(), q1Var2.getPivotX(), q1Var2.getPivotY());
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().l & q1Var2.F()) != 0 && (q1Var2.getCurrentPosition().l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().i))) {
            q1Var2.O0(q1Var2.getAlpha(), canvas, false);
        }
        if (q1Var2.getCurrentPosition() != null && (((q1Var2.getCurrentPosition().l & 8) != 0 && (q1Var2.getCurrentPosition().l & 1) != 0) || (q1Var2.getCurrentMessagesGroup() != null && q1Var2.getCurrentMessagesGroup().i))) {
            q1Var2.m1(canvas, q1Var2.getAlpha(), null);
            q1Var2.T0(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() != null) {
            q1Var2.f1(canvas, q1Var2.getAlpha());
        }
        if (q1Var2.getCurrentPosition() == null || q1Var2.getCurrentPosition().h) {
            q1Var2.v1(q1Var2.getAlpha(), canvas, true);
        }
        q1Var2.g1(canvas);
        q1Var2.getTransitionParams().d();
        canvas.restore();
        q1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof jh0)) {
                jh0 jh0Var = (jh0) childAt;
                jh0Var.hd = childAt.getTop();
                jh0Var.id = childAt.getBottom();
                jh0Var.jd = jh0Var.getMessageObject().f1();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        kh0 kh0Var = this.i3;
        int L = org.telegram.messenger.i0.L(kh0Var.M.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = kh0Var.Y;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.i0.q.y - (L + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - org.telegram.messenger.i0.L(8.0f)) - kh0Var.d.b), TLObject.FLAG_31));
        int max = Math.max(org.telegram.messenger.i0.L(12.0f) + (kh0Var.l0 ? kh0Var.X : kh0Var.V.l()), -((org.telegram.messenger.i0.L(7.0f) + kh0Var.n0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - org.telegram.messenger.i0.L(8.0f)) + Math.max(0, kh0Var.N - ((getMeasuredWidth() - max) - org.telegram.messenger.i0.L((kh0Var.O.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
