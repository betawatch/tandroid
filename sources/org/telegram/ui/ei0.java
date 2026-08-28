package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ei0 extends org.telegram.ui.Components.wk0 {
    public final ArrayList T2;
    public final org.telegram.ui.Components.y5 U2;
    public final org.telegram.ui.Components.y5 V2;
    public final s10 W2;
    public final /* synthetic */ li0 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei0(li0 li0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.X2 = li0Var;
        this.T2 = new ArrayList(10);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.U2 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.V2 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.W2 = new s10();
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b9, code lost:
    
        if (r3.messages.size() != 1) goto L167;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v44 */
    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MessageObject.GroupedMessages currentMessagesGroup;
        li0 li0Var;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessages currentMessagesGroup2;
        ArrayList arrayList4;
        ei0 ei0Var;
        ei0 ei0Var2;
        ArrayList arrayList5;
        li0 li0Var2;
        MessageObject.GroupedMessages currentMessagesGroup3;
        MessageObject.GroupedMessages currentMessagesGroup4;
        li0 li0Var3 = this.X2;
        di0 di0Var = li0Var3.C;
        int measuredHeight = di0Var.getMeasuredHeight();
        ei0 ei0Var3 = li0Var3.G;
        int childCount = ei0Var3.getChildCount();
        boolean z10 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = ei0Var3.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                RectF rectF = pg.i.h;
                pg.i.c(t1Var2, di0Var, rectF);
                float f10 = rectF.top;
                int i10 = (int) f10;
                childAt.getMeasuredHeight();
                int i11 = i10 >= 0 ? 0 : -i10;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i11 + measuredHeight;
                }
                t1Var2.b4(i11, measuredHeight2 - i11, measuredHeight, f10, f10, di0Var.getMeasuredWidth(), di0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, 255, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.t1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != groupedMessages)) {
                groupedMessages = currentMessagesGroup4;
            }
        }
        int i13 = 0;
        while (true) {
            arrayList = this.T2;
            int i14 = 2;
            if (i13 >= 3) {
                break;
            }
            arrayList.clear();
            if (i13 != 2 || ei0Var3.T1) {
                int i15 = 0;
                ?? r92 = z10;
                while (i15 < childCount2) {
                    View childAt3 = ei0Var3.getChildAt(i15);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= ei0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = t1Var3.getCurrentMessagesGroup()) != null && ((i13 != 0 || currentMessagesGroup3.messages.size() != z11) && ((i13 != z11 || currentMessagesGroup3.transitionParams.drawBackgroundForDeletedItems) && ((i13 != 0 || !t1Var3.getMessageObject().deleted) && ((i13 != z11 || t1Var3.getMessageObject().deleted) && ((i13 != i14 || t1Var3.kc) && (i13 == i14 || !t1Var3.kc))))))) {
                            if (!arrayList.contains(currentMessagesGroup3)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup3.transitionParams;
                                transitionParams.left = r92;
                                transitionParams.top = r92;
                                transitionParams.right = r92;
                                transitionParams.bottom = r92;
                                transitionParams.pinnedBotton = r92;
                                transitionParams.pinnedTop = r92;
                                transitionParams.cell = t1Var3;
                                arrayList.add(currentMessagesGroup3);
                            }
                            currentMessagesGroup3.transitionParams.pinnedTop = t1Var3.n3();
                            currentMessagesGroup3.transitionParams.pinnedBotton = t1Var3.m3();
                            int x10 = (int) (t1Var3.getX() + t1Var3.getBackgroundDrawableLeft());
                            int x11 = (int) (t1Var3.getX() + t1Var3.getBackgroundDrawableRight());
                            int y10 = (int) (t1Var3.getY() + t1Var3.getPaddingTop() + t1Var3.getBackgroundDrawableTop());
                            int y11 = (int) (t1Var3.getY() + t1Var3.getPaddingTop() + t1Var3.getBackgroundDrawableBottom());
                            if ((t1Var3.getCurrentPosition().flags & 4) == 0) {
                                y10 -= AndroidUtilities.dp(10.0f);
                            }
                            if ((t1Var3.getCurrentPosition().flags & 8) == 0) {
                                y11 += AndroidUtilities.dp(10.0f);
                            }
                            if (t1Var3.kc) {
                                currentMessagesGroup3.transitionParams.cell = t1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup3.transitionParams;
                            int i16 = transitionParams2.top;
                            if (i16 == 0 || y10 < i16) {
                                transitionParams2.top = y10;
                            }
                            int i17 = transitionParams2.bottom;
                            if (i17 == 0 || y11 > i17) {
                                transitionParams2.bottom = y11;
                            }
                            int i18 = transitionParams2.left;
                            if (i18 == 0 || x10 < i18) {
                                transitionParams2.left = x10;
                            }
                            int i19 = transitionParams2.right;
                            if (i19 == 0 || x11 > i19) {
                                transitionParams2.right = x11;
                            }
                            i15++;
                            i14 = 2;
                            r92 = 0;
                        }
                    }
                    i15++;
                    i14 = 2;
                    r92 = 0;
                }
                int i20 = 0;
                while (i20 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i20);
                    if (groupedMessages2 == null) {
                        arrayList5 = arrayList;
                        ei0Var2 = ei0Var3;
                        li0Var2 = li0Var3;
                    } else {
                        float E2 = groupedMessages2.transitionParams.cell.E2(z11);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f11 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                        float f12 = transitionParams3.top + transitionParams3.offsetTop;
                        float f13 = transitionParams3.offsetRight + transitionParams3.right + E2;
                        float f14 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (f12 < (-AndroidUtilities.dp(20.0f))) {
                            f12 = -AndroidUtilities.dp(20.0f);
                        }
                        float f15 = f12;
                        if (f14 > AndroidUtilities.dp(20.0f) + ei0Var3.getMeasuredHeight()) {
                            f14 = AndroidUtilities.dp(20.0f) + ei0Var3.getMeasuredHeight();
                        }
                        float f16 = f14;
                        boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList;
                            ei0Var = ei0Var3;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), e2.c.A(f13, f11, 2.0f, f11), e2.c.A(f16, f15, 2.0f, f15));
                        } else {
                            arrayList4 = arrayList;
                            ei0Var = ei0Var3;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        ei0Var2 = ei0Var;
                        arrayList5 = arrayList4;
                        li0Var2 = li0Var3;
                        transitionParams4.cell.B1(canvas2, (int) f11, (int) f15, (int) f13, (int) f16, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z12) {
                            canvas.restore();
                            for (int i21 = 0; i21 < childCount2; i21++) {
                                View childAt4 = ei0Var2.getChildAt(i21);
                                if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                    org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt4;
                                    if (t1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = t1Var4.getLeft();
                                        int top = t1Var4.getTop();
                                        childAt4.setPivotX(((f13 - f11) / 2.0f) + (f11 - left));
                                        childAt4.setPivotY(((f16 - f15) / 2.0f) + (f15 - top));
                                    }
                                }
                            }
                        }
                    }
                    i20++;
                    canvas2 = canvas;
                    ei0Var3 = ei0Var2;
                    li0Var3 = li0Var2;
                    arrayList = arrayList5;
                    z11 = true;
                }
            }
            i13++;
            canvas2 = canvas;
            ei0Var3 = ei0Var3;
            li0Var3 = li0Var3;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList6 = arrayList;
        ei0 ei0Var4 = ei0Var3;
        li0 li0Var4 = li0Var3;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        MessageObject.GroupedMessages groupedMessages3 = null;
        int i22 = 0;
        while (i22 < childCount3) {
            View childAt5 = getChildAt(i22);
            if (!(childAt5 instanceof org.telegram.ui.Cells.t1) || ((currentMessagesGroup2 = (t1Var = (org.telegram.ui.Cells.t1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == groupedMessages3)) {
                li0Var = li0Var4;
            } else {
                if (currentMessagesGroup2 == null) {
                    float boundsLeft = t1Var.getBoundsLeft();
                    float y12 = t1Var.getY();
                    float boundsRight = t1Var.getBoundsRight();
                    float y13 = t1Var.getY() + t1Var.getHeight();
                    li0Var = li0Var4;
                    li0Var.j(canvas, boundsLeft, y12, boundsRight, y13);
                } else {
                    li0Var = li0Var4;
                }
                groupedMessages3 = currentMessagesGroup2;
            }
            i22++;
            li0Var4 = li0Var;
        }
        li0 li0Var5 = li0Var4;
        int i23 = 0;
        while (i23 < 3) {
            arrayList6.clear();
            if (i23 != 2 || ei0Var4.T1) {
                int i24 = 0;
                while (i24 < childCount3) {
                    View childAt6 = ei0Var4.getChildAt(i24);
                    if (childAt6 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) childAt6;
                        if (childAt6.getY() <= ei0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= 0.0f && (currentMessagesGroup = t1Var5.getCurrentMessagesGroup()) != null) {
                            int i25 = i23 == 0 ? 1 : 1;
                            if ((i23 != i25 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i23 != 0 || !t1Var5.getMessageObject().deleted) && ((i23 != 1 || t1Var5.getMessageObject().deleted) && ((i23 != 2 || t1Var5.kc) && (i23 == 2 || !t1Var5.kc))))) {
                                arrayList3 = arrayList6;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup.transitionParams;
                                    transitionParams6.left = 0;
                                    transitionParams6.top = 0;
                                    transitionParams6.right = 0;
                                    transitionParams6.bottom = 0;
                                    transitionParams6.pinnedBotton = false;
                                    transitionParams6.pinnedTop = false;
                                    transitionParams6.cell = t1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                currentMessagesGroup.transitionParams.pinnedTop = t1Var5.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = t1Var5.m3();
                                int x12 = (int) (t1Var5.getX() + t1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (t1Var5.getX() + t1Var5.getBackgroundDrawableRight());
                                int y14 = (int) (t1Var5.getY() + t1Var5.getPaddingTop() + t1Var5.getBackgroundDrawableTop());
                                int y15 = (int) (t1Var5.getY() + t1Var5.getPaddingTop() + t1Var5.getBackgroundDrawableBottom());
                                if ((t1Var5.getCurrentPosition().flags & 4) == 0) {
                                    y14 -= AndroidUtilities.dp(10.0f);
                                }
                                if ((t1Var5.getCurrentPosition().flags & 8) == 0) {
                                    y15 += AndroidUtilities.dp(10.0f);
                                }
                                if (t1Var5.kc) {
                                    currentMessagesGroup.transitionParams.cell = t1Var5;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup.transitionParams;
                                int i26 = transitionParams7.top;
                                if (i26 == 0 || y14 < i26) {
                                    transitionParams7.top = y14;
                                }
                                int i27 = transitionParams7.bottom;
                                if (i27 == 0 || y15 > i27) {
                                    transitionParams7.bottom = y15;
                                }
                                int i28 = transitionParams7.left;
                                if (i28 == 0 || x12 < i28) {
                                    transitionParams7.left = x12;
                                }
                                int i29 = transitionParams7.right;
                                if (i29 == 0 || x13 > i29) {
                                    transitionParams7.right = x13;
                                }
                                i24++;
                                arrayList6 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList6;
                    i24++;
                    arrayList6 = arrayList3;
                }
                arrayList2 = arrayList6;
                for (int i30 = 0; i30 < arrayList2.size(); i30++) {
                    MessageObject.GroupedMessages groupedMessages4 = (MessageObject.GroupedMessages) arrayList2.get(i30);
                    float E22 = groupedMessages4.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams8 = groupedMessages4.transitionParams;
                    float f17 = transitionParams8.left + E22 + transitionParams8.offsetLeft;
                    float f18 = transitionParams8.top + transitionParams8.offsetTop;
                    float f19 = transitionParams8.right + E22 + transitionParams8.offsetRight;
                    float f20 = transitionParams8.bottom + transitionParams8.offsetBottom;
                    if (f18 < (-AndroidUtilities.dp(20.0f))) {
                        f18 = -AndroidUtilities.dp(20.0f);
                    }
                    if (f20 > AndroidUtilities.dp(20.0f) + ei0Var4.getMeasuredHeight()) {
                        f20 = AndroidUtilities.dp(20.0f) + ei0Var4.getMeasuredHeight();
                    }
                    li0Var5.j(canvas, f17, f18, f19, f20);
                    groupedMessages4.transitionParams.cell = null;
                }
            } else {
                arrayList2 = arrayList6;
            }
            i23++;
            arrayList6 = arrayList2;
        }
        canvas.save();
        float e10 = this.U2.e(canScrollVertically(-1));
        float e11 = this.V2.e(canScrollVertically(1));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, getScrollY(), getWidth(), AndroidUtilities.dp(14.0f) + getScrollY());
        s10 s10Var = this.W2;
        s10Var.b(canvas, rectF2, 1, e10);
        rectF2.set(0.0f, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
        s10Var.b(canvas, rectF2, 3, e11);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.t1 t1Var;
        li0 li0Var = this.X2;
        if (li0Var.w && ((view == (t1Var = li0Var.M) && t1Var != null && t1Var.getCurrentPosition() == null) || view == li0Var.T)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            return true;
        }
        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
        t1Var2.setInvalidatesParent(true);
        t1Var2.K1(canvas);
        canvas.save();
        canvas.translate(t1Var2.getX(), t1Var2.getY());
        canvas.scale(t1Var2.getScaleX(), t1Var2.getScaleY(), t1Var2.getPivotX(), t1Var2.getPivotY());
        if (t1Var2.C1() && t1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, t1Var2.getPaddingTop());
            t1Var2.D1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(t1Var2.getX(), t1Var2.getY() + t1Var2.getPaddingTop());
        canvas.scale(t1Var2.getScaleX(), t1Var2.getScaleY(), t1Var2.getPivotX(), t1Var2.getPivotY());
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & t1Var2.s0()) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
            t1Var2.I1(t1Var2.getAlpha(), canvas, false);
        }
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & 8) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
            t1Var2.d2(canvas, t1Var2.getAlpha(), null);
            t1Var2.N1(canvas, t1Var2.getAlpha());
        }
        if (t1Var2.getCurrentPosition() != null) {
            t1Var2.W1(canvas, t1Var2.getAlpha());
        }
        if (t1Var2.getCurrentPosition() == null || t1Var2.getCurrentPosition().last) {
            t1Var2.m2(t1Var2.getAlpha(), canvas, true);
        }
        t1Var2.X1(canvas);
        t1Var2.getTransitionParams().i();
        canvas.restore();
        t1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTop() != 0 && (childAt instanceof ki0)) {
                ki0 ki0Var = (ki0) childAt;
                ki0Var.Be = childAt.getTop();
                ki0Var.Ce = childAt.getBottom();
                ki0Var.De = ki0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z10, i9, i10, i11, i12);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        li0 li0Var = this.X2;
        int dp = AndroidUtilities.dp(li0Var.J.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = li0Var.V;
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - li0Var.e.b), TLObject.FLAG_31));
        int max = Math.max(AndroidUtilities.dp(12.0f) + (li0Var.i0 ? li0Var.U : li0Var.S.l()), -((AndroidUtilities.dp(7.0f) + li0Var.k0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, li0Var.K - ((getMeasuredWidth() - max) - AndroidUtilities.dp((li0Var.L.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
