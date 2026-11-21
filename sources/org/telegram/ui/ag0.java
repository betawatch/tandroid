package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ag0 extends org.telegram.ui.Components.ek0 {
    public final ArrayList f3;
    public final org.telegram.ui.Components.d6 g3;
    public final org.telegram.ui.Components.d6 h3;
    public final h6.m i3;
    public final /* synthetic */ eg0 j3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(eg0 eg0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.j3 = eg0Var;
        this.f3 = new ArrayList(10);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.g3 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.h3 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.i3 = new h6.m(29);
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ab, code lost:
    
        if (r2.d.size() != 1) goto L169;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v31 */
    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i7;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.aj currentMessagesGroup;
        int i10;
        float f10;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.messenger.aj currentMessagesGroup2;
        ArrayList arrayList4;
        org.telegram.messenger.aj ajVar;
        ag0 ag0Var;
        ag0 ag0Var2;
        ArrayList arrayList5;
        eg0 eg0Var;
        int i11;
        org.telegram.messenger.aj currentMessagesGroup3;
        org.telegram.messenger.aj currentMessagesGroup4;
        eg0 eg0Var2 = this.j3;
        zf0 zf0Var = eg0Var2.G;
        int measuredHeight = zf0Var.getMeasuredHeight();
        ag0 ag0Var3 = eg0Var2.K;
        int childCount = ag0Var3.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = ag0Var3.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) childAt;
                RectF rectF = jh.k.h;
                jh.k.c(r1Var2, zf0Var, rectF);
                float f11 = rectF.top;
                int i13 = (int) f11;
                childAt.getMeasuredHeight();
                int i14 = i13 >= 0 ? 0 : -i13;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i14 + measuredHeight;
                }
                r1Var2.C3(i14, measuredHeight2 - i14, measuredHeight, f11, f11, zf0Var.getMeasuredWidth(), zf0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, org.telegram.messenger.ks.e4, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        org.telegram.messenger.aj ajVar2 = null;
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if ((childAt2 instanceof org.telegram.ui.Cells.r1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.r1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != ajVar2)) {
                ajVar2 = currentMessagesGroup4;
            }
        }
        int i16 = 0;
        while (true) {
            arrayList = this.f3;
            int i17 = 2;
            i7 = 3;
            if (i16 >= 3) {
                break;
            }
            arrayList.clear();
            if (i16 != 2 || ag0Var3.W1) {
                int i18 = z10 ? 1 : 0;
                ?? r92 = z10;
                while (i18 < childCount2) {
                    View childAt3 = ag0Var3.getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var3 = (org.telegram.ui.Cells.r1) childAt3;
                        if (childAt3.getY() <= ag0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = r1Var3.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.zi ziVar = currentMessagesGroup3.m;
                            if ((i16 != 0 || currentMessagesGroup3.d.size() != z11) && ((i16 != z11 || ziVar.i) && ((i16 != 0 || !r1Var3.getMessageObject().Z) && ((i16 != z11 || r1Var3.getMessageObject().Z) && ((i16 != i17 || r1Var3.za) && (i16 == i17 || !r1Var3.za)))))) {
                                if (!arrayList.contains(currentMessagesGroup3)) {
                                    ziVar.a = r92;
                                    ziVar.b = r92;
                                    ziVar.c = r92;
                                    ziVar.d = r92;
                                    ziVar.l = r92;
                                    ziVar.k = r92;
                                    ziVar.m = r1Var3;
                                    arrayList.add(currentMessagesGroup3);
                                }
                                ziVar.k = r1Var3.L2();
                                ziVar.l = r1Var3.K2();
                                int x10 = (int) (r1Var3.getX() + r1Var3.getBackgroundDrawableLeft());
                                int x11 = (int) (r1Var3.getX() + r1Var3.getBackgroundDrawableRight());
                                int y10 = (int) (r1Var3.getY() + r1Var3.getPaddingTop() + r1Var3.getBackgroundDrawableTop());
                                int y11 = (int) (r1Var3.getY() + r1Var3.getPaddingTop() + r1Var3.getBackgroundDrawableBottom());
                                if ((r1Var3.getCurrentPosition().l & 4) == 0) {
                                    y10 -= org.telegram.messenger.g0.L(10.0f);
                                }
                                if ((r1Var3.getCurrentPosition().l & 8) == 0) {
                                    y11 += org.telegram.messenger.g0.L(10.0f);
                                }
                                if (r1Var3.za) {
                                    ziVar.m = r1Var3;
                                }
                                int i19 = ziVar.b;
                                if (i19 == 0 || y10 < i19) {
                                    ziVar.b = y10;
                                }
                                int i20 = ziVar.d;
                                if (i20 == 0 || y11 > i20) {
                                    ziVar.d = y11;
                                }
                                int i21 = ziVar.a;
                                if (i21 == 0 || x10 < i21) {
                                    ziVar.a = x10;
                                }
                                int i22 = ziVar.c;
                                if (i22 == 0 || x11 > i22) {
                                    ziVar.c = x11;
                                }
                            }
                        }
                    }
                    i18++;
                    i17 = 2;
                    r92 = 0;
                }
                int i23 = 0;
                ArrayList arrayList6 = arrayList;
                while (i23 < arrayList6.size()) {
                    org.telegram.messenger.aj ajVar3 = (org.telegram.messenger.aj) arrayList6.get(i23);
                    if (ajVar3 == null) {
                        arrayList5 = arrayList6;
                        ag0Var2 = ag0Var3;
                        eg0Var = eg0Var2;
                        i11 = i23;
                    } else {
                        org.telegram.messenger.zi ziVar2 = ajVar3.m;
                        float S1 = ziVar2.m.S1(z11);
                        float f12 = ziVar2.a + S1 + ziVar2.e;
                        float f13 = ziVar2.b + ziVar2.f;
                        float f14 = ziVar2.g + ziVar2.c + S1;
                        float f15 = ziVar2.d + ziVar2.h;
                        if (f13 < (-org.telegram.messenger.g0.L(20.0f))) {
                            f13 = -org.telegram.messenger.g0.L(20.0f);
                        }
                        if (f15 > org.telegram.messenger.g0.L(20.0f) + ag0Var3.getMeasuredHeight()) {
                            f15 = org.telegram.messenger.g0.L(20.0f) + ag0Var3.getMeasuredHeight();
                        }
                        boolean z12 = (ziVar2.m.getScaleX() == 1.0f && ziVar2.m.getScaleY() == 1.0f) ? false : z11;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            ajVar = ajVar3;
                            ag0Var = ag0Var3;
                            canvas2.scale(ziVar2.m.getScaleX(), ziVar2.m.getScaleY(), com.google.android.gms.internal.vision.e2.A(f14, f12, 2.0f, f12), com.google.android.gms.internal.vision.e2.A(f15, f13, 2.0f, f13));
                        } else {
                            arrayList4 = arrayList6;
                            ajVar = ajVar3;
                            ag0Var = ag0Var3;
                        }
                        float f16 = f13;
                        float f17 = f15;
                        ag0Var2 = ag0Var;
                        arrayList5 = arrayList4;
                        eg0Var = eg0Var2;
                        org.telegram.messenger.aj ajVar4 = ajVar;
                        i11 = i23;
                        ziVar2.m.K0(canvas, (int) f12, (int) f13, (int) f14, (int) f15, ziVar2.k, ziVar2.l, false, 0);
                        ziVar2.m = null;
                        ziVar2.o = ajVar4.c;
                        if (z12) {
                            canvas.restore();
                            for (int i24 = 0; i24 < childCount2; i24++) {
                                View childAt4 = ag0Var2.getChildAt(i24);
                                if (childAt4 instanceof org.telegram.ui.Cells.r1) {
                                    org.telegram.ui.Cells.r1 r1Var4 = (org.telegram.ui.Cells.r1) childAt4;
                                    if (r1Var4.getCurrentMessagesGroup() == ajVar4) {
                                        int left = r1Var4.getLeft();
                                        int top = r1Var4.getTop();
                                        childAt4.setPivotX(((f14 - f12) / 2.0f) + (f12 - left));
                                        childAt4.setPivotY(((f17 - f16) / 2.0f) + (f16 - top));
                                    }
                                }
                            }
                        }
                    }
                    i23 = i11 + 1;
                    canvas2 = canvas;
                    ag0Var3 = ag0Var2;
                    eg0Var2 = eg0Var;
                    arrayList6 = arrayList5;
                    z11 = true;
                }
            }
            i16++;
            canvas2 = canvas;
            ag0Var3 = ag0Var3;
            eg0Var2 = eg0Var2;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList7 = arrayList;
        ag0 ag0Var4 = ag0Var3;
        eg0 eg0Var3 = eg0Var2;
        float f18 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        org.telegram.messenger.aj ajVar5 = null;
        int i25 = 0;
        while (i25 < childCount3) {
            View childAt5 = getChildAt(i25);
            if (!(childAt5 instanceof org.telegram.ui.Cells.r1) || ((currentMessagesGroup2 = (r1Var = (org.telegram.ui.Cells.r1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == ajVar5)) {
                i10 = i7;
                f10 = f18;
            } else {
                if (currentMessagesGroup2 == null) {
                    i10 = i7;
                    f10 = f18;
                    eg0Var3.j(r1Var.getBoundsLeft(), r1Var.getY(), r1Var.getBoundsRight(), r1Var.getY() + r1Var.getHeight(), canvas);
                } else {
                    i10 = i7;
                    f10 = f18;
                }
                ajVar5 = currentMessagesGroup2;
            }
            i25++;
            i7 = i10;
            f18 = f10;
        }
        int i26 = i7;
        float f19 = f18;
        int i27 = 0;
        while (i27 < i26) {
            arrayList7.clear();
            if (i27 != 2 || ag0Var4.W1) {
                int i28 = 0;
                while (i28 < childCount3) {
                    View childAt6 = ag0Var4.getChildAt(i28);
                    if (childAt6 instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.ui.Cells.r1 r1Var5 = (org.telegram.ui.Cells.r1) childAt6;
                        if (childAt6.getY() <= ag0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f19 && (currentMessagesGroup = r1Var5.getCurrentMessagesGroup()) != null) {
                            org.telegram.messenger.zi ziVar3 = currentMessagesGroup.m;
                            int i29 = i27 == 0 ? 1 : 1;
                            if ((i27 != i29 || ziVar3.i) && ((i27 != 0 || !r1Var5.getMessageObject().Z) && ((i27 != 1 || r1Var5.getMessageObject().Z) && ((i27 != 2 || r1Var5.za) && (i27 == 2 || !r1Var5.za))))) {
                                arrayList3 = arrayList7;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    ziVar3.a = 0;
                                    ziVar3.b = 0;
                                    ziVar3.c = 0;
                                    ziVar3.d = 0;
                                    ziVar3.l = false;
                                    ziVar3.k = false;
                                    ziVar3.m = r1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                ziVar3.k = r1Var5.L2();
                                ziVar3.l = r1Var5.K2();
                                int x12 = (int) (r1Var5.getX() + r1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (r1Var5.getX() + r1Var5.getBackgroundDrawableRight());
                                int y12 = (int) (r1Var5.getY() + r1Var5.getPaddingTop() + r1Var5.getBackgroundDrawableTop());
                                int y13 = (int) (r1Var5.getY() + r1Var5.getPaddingTop() + r1Var5.getBackgroundDrawableBottom());
                                if ((r1Var5.getCurrentPosition().l & 4) == 0) {
                                    y12 -= org.telegram.messenger.g0.L(10.0f);
                                }
                                if ((r1Var5.getCurrentPosition().l & 8) == 0) {
                                    y13 += org.telegram.messenger.g0.L(10.0f);
                                }
                                if (r1Var5.za) {
                                    ziVar3.m = r1Var5;
                                }
                                int i30 = ziVar3.b;
                                if (i30 == 0 || y12 < i30) {
                                    ziVar3.b = y12;
                                }
                                int i31 = ziVar3.d;
                                if (i31 == 0 || y13 > i31) {
                                    ziVar3.d = y13;
                                }
                                int i32 = ziVar3.a;
                                if (i32 == 0 || x12 < i32) {
                                    ziVar3.a = x12;
                                }
                                int i33 = ziVar3.c;
                                if (i33 == 0 || x13 > i33) {
                                    ziVar3.c = x13;
                                }
                                i28++;
                                arrayList7 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList7;
                    i28++;
                    arrayList7 = arrayList3;
                }
                arrayList2 = arrayList7;
                for (int i34 = 0; i34 < arrayList2.size(); i34++) {
                    org.telegram.messenger.zi ziVar4 = ((org.telegram.messenger.aj) arrayList2.get(i34)).m;
                    float S12 = ziVar4.m.S1(true);
                    float f20 = ziVar4.a + S12 + ziVar4.e;
                    float f21 = ziVar4.b + ziVar4.f;
                    float f22 = ziVar4.c + S12 + ziVar4.g;
                    float f23 = ziVar4.d + ziVar4.h;
                    if (f21 < (-org.telegram.messenger.g0.L(20.0f))) {
                        f21 = -org.telegram.messenger.g0.L(20.0f);
                    }
                    if (f23 > org.telegram.messenger.g0.L(20.0f) + ag0Var4.getMeasuredHeight()) {
                        f23 = org.telegram.messenger.g0.L(20.0f) + ag0Var4.getMeasuredHeight();
                    }
                    float f24 = f23;
                    eg0 eg0Var4 = eg0Var3;
                    eg0Var4.j(f20, f21, f22, f24, canvas);
                    eg0Var3 = eg0Var4;
                    ziVar4.m = null;
                }
            } else {
                arrayList2 = arrayList7;
            }
            i27++;
            arrayList7 = arrayList2;
        }
        canvas.save();
        float d = this.g3.d(canScrollVertically(-1));
        float d2 = this.h3.d(canScrollVertically(1));
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(f19, getScrollY(), getWidth(), org.telegram.messenger.g0.L(14.0f) + getScrollY());
        h6.m mVar = this.i3;
        mVar.n(canvas, rectF2, 1, d);
        rectF2.set(f19, (getHeight() + getScrollY()) - org.telegram.messenger.g0.L(14.0f), getWidth(), getHeight() + getScrollY());
        mVar.n(canvas, rectF2, i26, d2);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.r1 r1Var;
        eg0 eg0Var = this.j3;
        if (eg0Var.w && ((view == (r1Var = eg0Var.Q) && r1Var != null && r1Var.getCurrentPosition() == null) || view == eg0Var.X)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.r1)) {
            return true;
        }
        org.telegram.ui.Cells.r1 r1Var2 = (org.telegram.ui.Cells.r1) view;
        r1Var2.setInvalidatesParent(true);
        r1Var2.S0(canvas);
        canvas.save();
        canvas.translate(r1Var2.getX(), r1Var2.getY());
        canvas.scale(r1Var2.getScaleX(), r1Var2.getScaleY(), r1Var2.getPivotX(), r1Var2.getPivotY());
        if (r1Var2.L0() && r1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, r1Var2.getPaddingTop());
            r1Var2.M0(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.save();
        canvas.translate(r1Var2.getX(), r1Var2.getY() + r1Var2.getPaddingTop());
        canvas.scale(r1Var2.getScaleX(), r1Var2.getScaleY(), r1Var2.getPivotX(), r1Var2.getPivotY());
        if (r1Var2.getCurrentPosition() != null && (((r1Var2.getCurrentPosition().l & r1Var2.B()) != 0 && (r1Var2.getCurrentPosition().l & 1) != 0) || (r1Var2.getCurrentMessagesGroup() != null && r1Var2.getCurrentMessagesGroup().i))) {
            r1Var2.Q0(r1Var2.getAlpha(), canvas, false);
        }
        if (r1Var2.getCurrentPosition() != null && (((r1Var2.getCurrentPosition().l & 8) != 0 && (r1Var2.getCurrentPosition().l & 1) != 0) || (r1Var2.getCurrentMessagesGroup() != null && r1Var2.getCurrentMessagesGroup().i))) {
            r1Var2.o1(canvas, r1Var2.getAlpha(), null);
            r1Var2.V0(canvas, r1Var2.getAlpha());
        }
        if (r1Var2.getCurrentPosition() != null) {
            r1Var2.h1(canvas, r1Var2.getAlpha());
        }
        if (r1Var2.getCurrentPosition() == null || r1Var2.getCurrentPosition().h) {
            r1Var2.y1(r1Var2.getAlpha(), canvas, true);
        }
        r1Var2.i1(canvas);
        r1Var2.getTransitionParams().d();
        canvas.restore();
        r1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTop() != 0 && (childAt instanceof dg0)) {
                dg0 dg0Var = (dg0) childAt;
                dg0Var.zd = childAt.getTop();
                dg0Var.Ad = childAt.getBottom();
                dg0Var.Bd = dg0Var.getMessageObject().e1();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        eg0 eg0Var = this.j3;
        int L = org.telegram.messenger.g0.L(eg0Var.N.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = eg0Var.Z;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((org.telegram.messenger.g0.q.y - (L + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - org.telegram.messenger.g0.L(8.0f)) - eg0Var.d.b), TLObject.FLAG_31));
        int max = Math.max(org.telegram.messenger.g0.L(12.0f) + (eg0Var.p0 ? eg0Var.Y : eg0Var.W.l()), -((org.telegram.messenger.g0.L(7.0f) + eg0Var.r0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - org.telegram.messenger.g0.L(8.0f)) + Math.max(0, eg0Var.O - ((getMeasuredWidth() - max) - org.telegram.messenger.g0.L((eg0Var.P.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
