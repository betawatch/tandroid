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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class li0 extends org.telegram.ui.Components.sl0 {
    public final ArrayList U2;
    public final org.telegram.ui.Components.z5 V2;
    public final org.telegram.ui.Components.z5 W2;
    public final g20 X2;
    public final /* synthetic */ si0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li0(si0 si0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Y2 = si0Var;
        this.U2 = new ArrayList(10);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.V2 = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        this.W2 = new org.telegram.ui.Components.z5(this, 0L, 360L, nrVar);
        this.X2 = new g20();
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b9, code lost:
    
        if (r3.messages.size() != 1) goto L167;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v44 */
    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MessageObject.GroupedMessages currentMessagesGroup;
        si0 si0Var;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessages currentMessagesGroup2;
        ArrayList arrayList4;
        li0 li0Var;
        li0 li0Var2;
        ArrayList arrayList5;
        si0 si0Var2;
        MessageObject.GroupedMessages currentMessagesGroup3;
        MessageObject.GroupedMessages currentMessagesGroup4;
        si0 si0Var3 = this.Y2;
        ki0 ki0Var = si0Var3.D;
        int measuredHeight = ki0Var.getMeasuredHeight();
        li0 li0Var3 = si0Var3.H;
        int childCount = li0Var3.getChildCount();
        boolean z4 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = li0Var3.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                RectF rectF = ug.i.h;
                ug.i.c(t1Var2, ki0Var, rectF);
                float f10 = rectF.top;
                int i11 = (int) f10;
                childAt.getMeasuredHeight();
                int i12 = i11 >= 0 ? 0 : -i11;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i12 + measuredHeight;
                }
                t1Var2.b4(i12, measuredHeight2 - i12, measuredHeight, f10, f10, ki0Var.getMeasuredWidth(), ki0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z10 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, 255, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.t1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != groupedMessages)) {
                groupedMessages = currentMessagesGroup4;
            }
        }
        int i14 = 0;
        while (true) {
            arrayList = this.U2;
            int i15 = 2;
            if (i14 >= 3) {
                break;
            }
            arrayList.clear();
            if (i14 != 2 || li0Var3.U1) {
                int i16 = 0;
                ?? r92 = z4;
                while (i16 < childCount2) {
                    View childAt3 = li0Var3.getChildAt(i16);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= li0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = t1Var3.getCurrentMessagesGroup()) != null && ((i14 != 0 || currentMessagesGroup3.messages.size() != z10) && ((i14 != z10 || currentMessagesGroup3.transitionParams.drawBackgroundForDeletedItems) && ((i14 != 0 || !t1Var3.getMessageObject().deleted) && ((i14 != z10 || t1Var3.getMessageObject().deleted) && ((i14 != i15 || t1Var3.lc) && (i14 == i15 || !t1Var3.lc))))))) {
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
                            if (t1Var3.lc) {
                                currentMessagesGroup3.transitionParams.cell = t1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup3.transitionParams;
                            int i17 = transitionParams2.top;
                            if (i17 == 0 || y10 < i17) {
                                transitionParams2.top = y10;
                            }
                            int i18 = transitionParams2.bottom;
                            if (i18 == 0 || y11 > i18) {
                                transitionParams2.bottom = y11;
                            }
                            int i19 = transitionParams2.left;
                            if (i19 == 0 || x10 < i19) {
                                transitionParams2.left = x10;
                            }
                            int i20 = transitionParams2.right;
                            if (i20 == 0 || x11 > i20) {
                                transitionParams2.right = x11;
                            }
                            i16++;
                            i15 = 2;
                            r92 = 0;
                        }
                    }
                    i16++;
                    i15 = 2;
                    r92 = 0;
                }
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i21);
                    if (groupedMessages2 == null) {
                        arrayList5 = arrayList;
                        li0Var2 = li0Var3;
                        si0Var2 = si0Var3;
                    } else {
                        float E2 = groupedMessages2.transitionParams.cell.E2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f11 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                        float f12 = transitionParams3.top + transitionParams3.offsetTop;
                        float f13 = transitionParams3.offsetRight + transitionParams3.right + E2;
                        float f14 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (f12 < (-AndroidUtilities.dp(20.0f))) {
                            f12 = -AndroidUtilities.dp(20.0f);
                        }
                        float f15 = f12;
                        if (f14 > AndroidUtilities.dp(20.0f) + li0Var3.getMeasuredHeight()) {
                            f14 = AndroidUtilities.dp(20.0f) + li0Var3.getMeasuredHeight();
                        }
                        float f16 = f14;
                        boolean z11 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                        if (z11) {
                            canvas2.save();
                            arrayList4 = arrayList;
                            li0Var = li0Var3;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), e2.c.x(f13, f11, 2.0f, f11), e2.c.x(f16, f15, 2.0f, f15));
                        } else {
                            arrayList4 = arrayList;
                            li0Var = li0Var3;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        li0Var2 = li0Var;
                        arrayList5 = arrayList4;
                        si0Var2 = si0Var3;
                        transitionParams4.cell.B1(canvas2, (int) f11, (int) f15, (int) f13, (int) f16, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z11) {
                            canvas.restore();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                View childAt4 = li0Var2.getChildAt(i22);
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
                    i21++;
                    canvas2 = canvas;
                    li0Var3 = li0Var2;
                    si0Var3 = si0Var2;
                    arrayList = arrayList5;
                    z10 = true;
                }
            }
            i14++;
            canvas2 = canvas;
            li0Var3 = li0Var3;
            si0Var3 = si0Var3;
            z4 = false;
            z10 = true;
        }
        ArrayList arrayList6 = arrayList;
        li0 li0Var4 = li0Var3;
        si0 si0Var4 = si0Var3;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        MessageObject.GroupedMessages groupedMessages3 = null;
        int i23 = 0;
        while (i23 < childCount3) {
            View childAt5 = getChildAt(i23);
            if (!(childAt5 instanceof org.telegram.ui.Cells.t1) || ((currentMessagesGroup2 = (t1Var = (org.telegram.ui.Cells.t1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == groupedMessages3)) {
                si0Var = si0Var4;
            } else {
                if (currentMessagesGroup2 == null) {
                    float boundsLeft = t1Var.getBoundsLeft();
                    float y12 = t1Var.getY();
                    float boundsRight = t1Var.getBoundsRight();
                    float y13 = t1Var.getY() + t1Var.getHeight();
                    si0Var = si0Var4;
                    si0Var.j(canvas, boundsLeft, y12, boundsRight, y13);
                } else {
                    si0Var = si0Var4;
                }
                groupedMessages3 = currentMessagesGroup2;
            }
            i23++;
            si0Var4 = si0Var;
        }
        si0 si0Var5 = si0Var4;
        int i24 = 0;
        while (i24 < 3) {
            arrayList6.clear();
            if (i24 != 2 || li0Var4.U1) {
                int i25 = 0;
                while (i25 < childCount3) {
                    View childAt6 = li0Var4.getChildAt(i25);
                    if (childAt6 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) childAt6;
                        if (childAt6.getY() <= li0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= 0.0f && (currentMessagesGroup = t1Var5.getCurrentMessagesGroup()) != null) {
                            int i26 = i24 == 0 ? 1 : 1;
                            if ((i24 != i26 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i24 != 0 || !t1Var5.getMessageObject().deleted) && ((i24 != 1 || t1Var5.getMessageObject().deleted) && ((i24 != 2 || t1Var5.lc) && (i24 == 2 || !t1Var5.lc))))) {
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
                                if (t1Var5.lc) {
                                    currentMessagesGroup.transitionParams.cell = t1Var5;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup.transitionParams;
                                int i27 = transitionParams7.top;
                                if (i27 == 0 || y14 < i27) {
                                    transitionParams7.top = y14;
                                }
                                int i28 = transitionParams7.bottom;
                                if (i28 == 0 || y15 > i28) {
                                    transitionParams7.bottom = y15;
                                }
                                int i29 = transitionParams7.left;
                                if (i29 == 0 || x12 < i29) {
                                    transitionParams7.left = x12;
                                }
                                int i30 = transitionParams7.right;
                                if (i30 == 0 || x13 > i30) {
                                    transitionParams7.right = x13;
                                }
                                i25++;
                                arrayList6 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList6;
                    i25++;
                    arrayList6 = arrayList3;
                }
                arrayList2 = arrayList6;
                for (int i31 = 0; i31 < arrayList2.size(); i31++) {
                    MessageObject.GroupedMessages groupedMessages4 = (MessageObject.GroupedMessages) arrayList2.get(i31);
                    float E22 = groupedMessages4.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams8 = groupedMessages4.transitionParams;
                    float f17 = transitionParams8.left + E22 + transitionParams8.offsetLeft;
                    float f18 = transitionParams8.top + transitionParams8.offsetTop;
                    float f19 = transitionParams8.right + E22 + transitionParams8.offsetRight;
                    float f20 = transitionParams8.bottom + transitionParams8.offsetBottom;
                    if (f18 < (-AndroidUtilities.dp(20.0f))) {
                        f18 = -AndroidUtilities.dp(20.0f);
                    }
                    if (f20 > AndroidUtilities.dp(20.0f) + li0Var4.getMeasuredHeight()) {
                        f20 = AndroidUtilities.dp(20.0f) + li0Var4.getMeasuredHeight();
                    }
                    si0Var5.j(canvas, f17, f18, f19, f20);
                    groupedMessages4.transitionParams.cell = null;
                }
            } else {
                arrayList2 = arrayList6;
            }
            i24++;
            arrayList6 = arrayList2;
        }
        canvas.save();
        float e = this.V2.e(canScrollVertically(-1));
        float e6 = this.W2.e(canScrollVertically(1));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, getScrollY(), getWidth(), AndroidUtilities.dp(14.0f) + getScrollY());
        g20 g20Var = this.X2;
        g20Var.b(canvas, rectF2, 1, e);
        rectF2.set(0.0f, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
        g20Var.b(canvas, rectF2, 3, e6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.t1 t1Var;
        si0 si0Var = this.Y2;
        if (si0Var.w && ((view == (t1Var = si0Var.N) && t1Var != null && t1Var.getCurrentPosition() == null) || view == si0Var.U)) {
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
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & t1Var2.t0()) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
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

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof ri0)) {
                ri0 ri0Var = (ri0) childAt;
                ri0Var.Ce = childAt.getTop();
                ri0Var.De = childAt.getBottom();
                ri0Var.Ee = ri0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        si0 si0Var = this.Y2;
        int dp = AndroidUtilities.dp(si0Var.K.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = si0Var.W;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - si0Var.e.b), TLObject.FLAG_31));
        int max = Math.max(AndroidUtilities.dp(12.0f) + (si0Var.j0 ? si0Var.V : si0Var.T.l()), -((AndroidUtilities.dp(7.0f) + si0Var.l0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, si0Var.L - ((getMeasuredWidth() - max) - AndroidUtilities.dp((si0Var.M.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
