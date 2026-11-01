package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class eh0 extends org.telegram.ui.Components.uk0 {
    public final ArrayList e3;
    public final org.telegram.ui.Components.t5 f3;
    public final org.telegram.ui.Components.t5 g3;
    public final li.k h3;
    public final /* synthetic */ ih0 i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh0(ih0 ih0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.i3 = ih0Var;
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
    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.fj currentMessagesGroup;
        int i11;
        float f7;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.fj currentMessagesGroup2;
        ArrayList arrayList4;
        org.telegram.messenger.fj fjVar;
        eh0 eh0Var;
        ArrayList arrayList5;
        ih0 ih0Var;
        int i12;
        eh0 eh0Var2;
        org.telegram.messenger.fj currentMessagesGroup3;
        org.telegram.messenger.fj currentMessagesGroup4;
        ih0 ih0Var2 = this.i3;
        dh0 dh0Var = ih0Var2.F;
        int measuredHeight = dh0Var.getMeasuredHeight();
        eh0 eh0Var3 = ih0Var2.J;
        int childCount = eh0Var3.getChildCount();
        boolean z10 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = eh0Var3.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                RectF rectF = zg.h.h;
                zg.h.c(q1Var2, dh0Var, rectF);
                float f10 = rectF.top;
                int i14 = (int) f10;
                childAt.getMeasuredHeight();
                int i15 = i14 >= 0 ? 0 : -i14;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i15 + measuredHeight;
                }
                q1Var2.w3(i15, measuredHeight2 - i15, measuredHeight, f10, f10, dh0Var.getMeasuredWidth(), dh0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, org.telegram.messenger.at.e4, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        org.telegram.messenger.fj fjVar2 = null;
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if ((childAt2 instanceof org.telegram.ui.Cells.q1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.q1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != fjVar2)) {
                fjVar2 = currentMessagesGroup4;
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
            if (i17 != 2 || eh0Var3.V1) {
                int i19 = z10 ? 1 : 0;
                ?? r92 = z10;
                while (i19 < childCount2) {
                    View childAt3 = eh0Var3.getChildAt(i19);
                    if (childAt3 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var3 = (org.telegram.ui.Cells.q1) childAt3;
                        if (childAt3.getY() <= eh0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = q1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.ej ejVar = currentMessagesGroup3.m;
                            if ((i17 != 0 || currentMessagesGroup3.d.size() != z11) && ((i17 != z11 || ejVar.i) && ((i17 != 0 || !q1Var3.getMessageObject().Z) && ((i17 != z11 || q1Var3.getMessageObject().Z) && ((i17 != i18 || q1Var3.xa) && (i17 == i18 || !q1Var3.xa)))))) {
                                if (!arrayList.contains(currentMessagesGroup3)) {
                                    ejVar.a = r92;
                                    ejVar.b = r92;
                                    ejVar.c = r92;
                                    ejVar.d = r92;
                                    ejVar.l = r92;
                                    ejVar.k = r92;
                                    ejVar.m = q1Var3;
                                    arrayList.add(currentMessagesGroup3);
                                }
                                ejVar.k = q1Var3.F2();
                                ejVar.l = q1Var3.E2();
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
                                    ejVar.m = q1Var3;
                                }
                                int i20 = ejVar.b;
                                if (i20 == 0 || y3 < i20) {
                                    ejVar.b = y3;
                                }
                                int i21 = ejVar.d;
                                if (i21 == 0 || y10 > i21) {
                                    ejVar.d = y10;
                                }
                                int i22 = ejVar.a;
                                if (i22 == 0 || x10 < i22) {
                                    ejVar.a = x10;
                                }
                                int i23 = ejVar.c;
                                if (i23 == 0 || x11 > i23) {
                                    ejVar.c = x11;
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
                    org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) arrayList6.get(i24);
                    if (fjVar3 == null) {
                        arrayList5 = arrayList6;
                        eh0Var2 = eh0Var3;
                        ih0Var = ih0Var2;
                        i12 = i24;
                    } else {
                        org.telegram.messenger.ej ejVar2 = fjVar3.m;
                        float P1 = ejVar2.m.P1(z11);
                        float f11 = ejVar2.a + P1 + ejVar2.e;
                        float f12 = ejVar2.b + ejVar2.f;
                        float f13 = ejVar2.g + ejVar2.c + P1;
                        float f14 = ejVar2.d + ejVar2.h;
                        if (f12 < (-org.telegram.messenger.i0.L(20.0f))) {
                            f12 = -org.telegram.messenger.i0.L(20.0f);
                        }
                        if (f14 > org.telegram.messenger.i0.L(20.0f) + eh0Var3.getMeasuredHeight()) {
                            f14 = org.telegram.messenger.i0.L(20.0f) + eh0Var3.getMeasuredHeight();
                        }
                        boolean z12 = (ejVar2.m.getScaleX() == 1.0f && ejVar2.m.getScaleY() == 1.0f) ? false : z11;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            fjVar = fjVar3;
                            eh0Var = eh0Var3;
                            canvas2.scale(ejVar2.m.getScaleX(), ejVar2.m.getScaleY(), c3.i0.B(f13, f11, 2.0f, f11), c3.i0.B(f14, f12, 2.0f, f12));
                        } else {
                            arrayList4 = arrayList6;
                            fjVar = fjVar3;
                            eh0Var = eh0Var3;
                        }
                        float f15 = f12;
                        float f16 = f14;
                        arrayList5 = arrayList4;
                        ih0Var = ih0Var2;
                        org.telegram.messenger.fj fjVar4 = fjVar;
                        i12 = i24;
                        eh0Var2 = eh0Var;
                        ejVar2.m.I0(canvas2, (int) f11, (int) f12, (int) f13, (int) f14, ejVar2.k, ejVar2.l, false, 0);
                        ejVar2.m = null;
                        ejVar2.o = fjVar4.c;
                        if (z12) {
                            canvas.restore();
                            for (int i25 = 0; i25 < childCount2; i25++) {
                                View childAt4 = eh0Var2.getChildAt(i25);
                                if (childAt4 instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var4 = (org.telegram.ui.Cells.q1) childAt4;
                                    if (q1Var4.getCurrentMessagesGroup() == fjVar4) {
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
                    eh0Var3 = eh0Var2;
                    ih0Var2 = ih0Var;
                    arrayList6 = arrayList5;
                    z11 = true;
                }
            }
            i17++;
            canvas2 = canvas;
            eh0Var3 = eh0Var3;
            ih0Var2 = ih0Var2;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList7 = arrayList;
        eh0 eh0Var4 = eh0Var3;
        ih0 ih0Var3 = ih0Var2;
        float f17 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        org.telegram.messenger.fj fjVar5 = null;
        int i26 = 0;
        while (i26 < childCount3) {
            View childAt5 = getChildAt(i26);
            if (!(childAt5 instanceof org.telegram.ui.Cells.q1) || ((currentMessagesGroup2 = (q1Var = (org.telegram.ui.Cells.q1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == fjVar5)) {
                i11 = i10;
                f7 = f17;
            } else {
                if (currentMessagesGroup2 == null) {
                    i11 = i10;
                    f7 = f17;
                    ih0Var3.i(canvas, q1Var.getBoundsLeft(), q1Var.getY(), q1Var.getBoundsRight(), q1Var.getY() + q1Var.getHeight());
                } else {
                    i11 = i10;
                    f7 = f17;
                }
                fjVar5 = currentMessagesGroup2;
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
            if (i28 != 2 || eh0Var4.V1) {
                int i29 = 0;
                while (i29 < childCount3) {
                    View childAt6 = eh0Var4.getChildAt(i29);
                    if (childAt6 instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var5 = (org.telegram.ui.Cells.q1) childAt6;
                        if (childAt6.getY() <= eh0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f18 && (currentMessagesGroup = q1Var5.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.ej ejVar3 = currentMessagesGroup.m;
                            int i30 = i28 == 0 ? 1 : 1;
                            if ((i28 != i30 || ejVar3.i) && ((i28 != 0 || !q1Var5.getMessageObject().Z) && ((i28 != 1 || q1Var5.getMessageObject().Z) && ((i28 != 2 || q1Var5.xa) && (i28 == 2 || !q1Var5.xa))))) {
                                arrayList3 = arrayList7;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    ejVar3.a = 0;
                                    ejVar3.b = 0;
                                    ejVar3.c = 0;
                                    ejVar3.d = 0;
                                    ejVar3.l = false;
                                    ejVar3.k = false;
                                    ejVar3.m = q1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                ejVar3.k = q1Var5.F2();
                                ejVar3.l = q1Var5.E2();
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
                                    ejVar3.m = q1Var5;
                                }
                                int i31 = ejVar3.b;
                                if (i31 == 0 || y11 < i31) {
                                    ejVar3.b = y11;
                                }
                                int i32 = ejVar3.d;
                                if (i32 == 0 || y12 > i32) {
                                    ejVar3.d = y12;
                                }
                                int i33 = ejVar3.a;
                                if (i33 == 0 || x12 < i33) {
                                    ejVar3.a = x12;
                                }
                                int i34 = ejVar3.c;
                                if (i34 == 0 || x13 > i34) {
                                    ejVar3.c = x13;
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
                    org.telegram.messenger.ej ejVar4 = ((org.telegram.messenger.fj) arrayList2.get(i35)).m;
                    float P12 = ejVar4.m.P1(true);
                    float f19 = ejVar4.e + ejVar4.a + P12;
                    float f20 = ejVar4.b + ejVar4.f;
                    float f21 = ejVar4.c + P12 + ejVar4.g;
                    float f22 = ejVar4.d + ejVar4.h;
                    if (f20 < (-org.telegram.messenger.i0.L(20.0f))) {
                        f20 = -org.telegram.messenger.i0.L(20.0f);
                    }
                    float f23 = f20;
                    if (f22 > org.telegram.messenger.i0.L(20.0f) + eh0Var4.getMeasuredHeight()) {
                        f22 = org.telegram.messenger.i0.L(20.0f) + eh0Var4.getMeasuredHeight();
                    }
                    float f24 = f22;
                    ih0 ih0Var4 = ih0Var3;
                    ih0Var4.i(canvas, f19, f23, f21, f24);
                    ih0Var3 = ih0Var4;
                    ejVar4.m = null;
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

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.q1 q1Var;
        ih0 ih0Var = this.i3;
        if (ih0Var.w && ((view == (q1Var = ih0Var.P) && q1Var != null && q1Var.getCurrentPosition() == null) || view == ih0Var.W)) {
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

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof hh0)) {
                hh0 hh0Var = (hh0) childAt;
                hh0Var.hd = childAt.getTop();
                hh0Var.id = childAt.getBottom();
                hh0Var.jd = hh0Var.getMessageObject().f1();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.uk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ih0 ih0Var = this.i3;
        int L = org.telegram.messenger.i0.L(ih0Var.M.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = ih0Var.Y;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.i0.q.y - (L + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - org.telegram.messenger.i0.L(8.0f)) - ih0Var.d.b), TLObject.FLAG_31));
        int max = Math.max(org.telegram.messenger.i0.L(12.0f) + (ih0Var.l0 ? ih0Var.X : ih0Var.V.l()), -((org.telegram.messenger.i0.L(7.0f) + ih0Var.n0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - org.telegram.messenger.i0.L(8.0f)) + Math.max(0, ih0Var.N - ((getMeasuredWidth() - max) - org.telegram.messenger.i0.L((ih0Var.O.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
