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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ni0 extends org.telegram.ui.Components.rl0 {
    public final ArrayList U2;
    public final org.telegram.ui.Components.z5 V2;
    public final org.telegram.ui.Components.z5 W2;
    public final i20 X2;
    public final /* synthetic */ ui0 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni0(ui0 ui0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.Y2 = ui0Var;
        this.U2 = new ArrayList(10);
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        this.V2 = new org.telegram.ui.Components.z5(this, 0L, 360L, mrVar);
        this.W2 = new org.telegram.ui.Components.z5(this, 0L, 360L, mrVar);
        this.X2 = new i20();
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03b9, code lost:
    
        if (r3.messages.size() != 1) goto L167;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v44 */
    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MessageObject.GroupedMessages currentMessagesGroup;
        ui0 ui0Var;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.GroupedMessages currentMessagesGroup2;
        ArrayList arrayList4;
        ni0 ni0Var;
        ni0 ni0Var2;
        ArrayList arrayList5;
        ui0 ui0Var2;
        MessageObject.GroupedMessages currentMessagesGroup3;
        MessageObject.GroupedMessages currentMessagesGroup4;
        ui0 ui0Var3 = this.Y2;
        mi0 mi0Var = ui0Var3.D;
        int measuredHeight = mi0Var.getMeasuredHeight();
        ni0 ni0Var3 = ui0Var3.H;
        int childCount = ni0Var3.getChildCount();
        boolean z4 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ni0Var3.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                RectF rectF = ug.i.h;
                ug.i.c(s1Var2, mi0Var, rectF);
                float f10 = rectF.top;
                int i11 = (int) f10;
                childAt.getMeasuredHeight();
                int i12 = i11 >= 0 ? 0 : -i11;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i12 + measuredHeight;
                }
                s1Var2.b4(i12, measuredHeight2 - i12, measuredHeight, f10, f10, mi0Var.getMeasuredWidth(), mi0Var.getMeasuredHeight(), 0, 0, 0);
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
            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.s1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != groupedMessages)) {
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
            if (i14 != 2 || ni0Var3.U1) {
                int i16 = 0;
                ?? r92 = z4;
                while (i16 < childCount2) {
                    View childAt3 = ni0Var3.getChildAt(i16);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= ni0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = s1Var3.getCurrentMessagesGroup()) != null && ((i14 != 0 || currentMessagesGroup3.messages.size() != z10) && ((i14 != z10 || currentMessagesGroup3.transitionParams.drawBackgroundForDeletedItems) && ((i14 != 0 || !s1Var3.getMessageObject().deleted) && ((i14 != z10 || s1Var3.getMessageObject().deleted) && ((i14 != i15 || s1Var3.lc) && (i14 == i15 || !s1Var3.lc))))))) {
                            if (!arrayList.contains(currentMessagesGroup3)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup3.transitionParams;
                                transitionParams.left = r92;
                                transitionParams.top = r92;
                                transitionParams.right = r92;
                                transitionParams.bottom = r92;
                                transitionParams.pinnedBotton = r92;
                                transitionParams.pinnedTop = r92;
                                transitionParams.cell = s1Var3;
                                arrayList.add(currentMessagesGroup3);
                            }
                            currentMessagesGroup3.transitionParams.pinnedTop = s1Var3.n3();
                            currentMessagesGroup3.transitionParams.pinnedBotton = s1Var3.m3();
                            int x10 = (int) (s1Var3.getX() + s1Var3.getBackgroundDrawableLeft());
                            int x11 = (int) (s1Var3.getX() + s1Var3.getBackgroundDrawableRight());
                            int y10 = (int) (s1Var3.getY() + s1Var3.getPaddingTop() + s1Var3.getBackgroundDrawableTop());
                            int y11 = (int) (s1Var3.getY() + s1Var3.getPaddingTop() + s1Var3.getBackgroundDrawableBottom());
                            if ((s1Var3.getCurrentPosition().flags & 4) == 0) {
                                y10 -= AndroidUtilities.dp(10.0f);
                            }
                            if ((s1Var3.getCurrentPosition().flags & 8) == 0) {
                                y11 += AndroidUtilities.dp(10.0f);
                            }
                            if (s1Var3.lc) {
                                currentMessagesGroup3.transitionParams.cell = s1Var3;
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
                        ni0Var2 = ni0Var3;
                        ui0Var2 = ui0Var3;
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
                        if (f14 > AndroidUtilities.dp(20.0f) + ni0Var3.getMeasuredHeight()) {
                            f14 = AndroidUtilities.dp(20.0f) + ni0Var3.getMeasuredHeight();
                        }
                        float f16 = f14;
                        boolean z11 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                        if (z11) {
                            canvas2.save();
                            arrayList4 = arrayList;
                            ni0Var = ni0Var3;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), e2.c.x(f13, f11, 2.0f, f11), e2.c.x(f16, f15, 2.0f, f15));
                        } else {
                            arrayList4 = arrayList;
                            ni0Var = ni0Var3;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        ni0Var2 = ni0Var;
                        arrayList5 = arrayList4;
                        ui0Var2 = ui0Var3;
                        transitionParams4.cell.B1(canvas2, (int) f11, (int) f15, (int) f13, (int) f16, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z11) {
                            canvas.restore();
                            for (int i22 = 0; i22 < childCount2; i22++) {
                                View childAt4 = ni0Var2.getChildAt(i22);
                                if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                    org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt4;
                                    if (s1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = s1Var4.getLeft();
                                        int top = s1Var4.getTop();
                                        childAt4.setPivotX(((f13 - f11) / 2.0f) + (f11 - left));
                                        childAt4.setPivotY(((f16 - f15) / 2.0f) + (f15 - top));
                                    }
                                }
                            }
                        }
                    }
                    i21++;
                    canvas2 = canvas;
                    ni0Var3 = ni0Var2;
                    ui0Var3 = ui0Var2;
                    arrayList = arrayList5;
                    z10 = true;
                }
            }
            i14++;
            canvas2 = canvas;
            ni0Var3 = ni0Var3;
            ui0Var3 = ui0Var3;
            z4 = false;
            z10 = true;
        }
        ArrayList arrayList6 = arrayList;
        ni0 ni0Var4 = ni0Var3;
        ui0 ui0Var4 = ui0Var3;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        MessageObject.GroupedMessages groupedMessages3 = null;
        int i23 = 0;
        while (i23 < childCount3) {
            View childAt5 = getChildAt(i23);
            if (!(childAt5 instanceof org.telegram.ui.Cells.s1) || ((currentMessagesGroup2 = (s1Var = (org.telegram.ui.Cells.s1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == groupedMessages3)) {
                ui0Var = ui0Var4;
            } else {
                if (currentMessagesGroup2 == null) {
                    float boundsLeft = s1Var.getBoundsLeft();
                    float y12 = s1Var.getY();
                    float boundsRight = s1Var.getBoundsRight();
                    float y13 = s1Var.getY() + s1Var.getHeight();
                    ui0Var = ui0Var4;
                    ui0Var.j(canvas, boundsLeft, y12, boundsRight, y13);
                } else {
                    ui0Var = ui0Var4;
                }
                groupedMessages3 = currentMessagesGroup2;
            }
            i23++;
            ui0Var4 = ui0Var;
        }
        ui0 ui0Var5 = ui0Var4;
        int i24 = 0;
        while (i24 < 3) {
            arrayList6.clear();
            if (i24 != 2 || ni0Var4.U1) {
                int i25 = 0;
                while (i25 < childCount3) {
                    View childAt6 = ni0Var4.getChildAt(i25);
                    if (childAt6 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) childAt6;
                        if (childAt6.getY() <= ni0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= 0.0f && (currentMessagesGroup = s1Var5.getCurrentMessagesGroup()) != null) {
                            int i26 = i24 == 0 ? 1 : 1;
                            if ((i24 != i26 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i24 != 0 || !s1Var5.getMessageObject().deleted) && ((i24 != 1 || s1Var5.getMessageObject().deleted) && ((i24 != 2 || s1Var5.lc) && (i24 == 2 || !s1Var5.lc))))) {
                                arrayList3 = arrayList6;
                                if (!arrayList3.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup.transitionParams;
                                    transitionParams6.left = 0;
                                    transitionParams6.top = 0;
                                    transitionParams6.right = 0;
                                    transitionParams6.bottom = 0;
                                    transitionParams6.pinnedBotton = false;
                                    transitionParams6.pinnedTop = false;
                                    transitionParams6.cell = s1Var5;
                                    arrayList3.add(currentMessagesGroup);
                                }
                                currentMessagesGroup.transitionParams.pinnedTop = s1Var5.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = s1Var5.m3();
                                int x12 = (int) (s1Var5.getX() + s1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (s1Var5.getX() + s1Var5.getBackgroundDrawableRight());
                                int y14 = (int) (s1Var5.getY() + s1Var5.getPaddingTop() + s1Var5.getBackgroundDrawableTop());
                                int y15 = (int) (s1Var5.getY() + s1Var5.getPaddingTop() + s1Var5.getBackgroundDrawableBottom());
                                if ((s1Var5.getCurrentPosition().flags & 4) == 0) {
                                    y14 -= AndroidUtilities.dp(10.0f);
                                }
                                if ((s1Var5.getCurrentPosition().flags & 8) == 0) {
                                    y15 += AndroidUtilities.dp(10.0f);
                                }
                                if (s1Var5.lc) {
                                    currentMessagesGroup.transitionParams.cell = s1Var5;
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
                    if (f20 > AndroidUtilities.dp(20.0f) + ni0Var4.getMeasuredHeight()) {
                        f20 = AndroidUtilities.dp(20.0f) + ni0Var4.getMeasuredHeight();
                    }
                    ui0Var5.j(canvas, f17, f18, f19, f20);
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
        i20 i20Var = this.X2;
        i20Var.b(canvas, rectF2, 1, e);
        rectF2.set(0.0f, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
        i20Var.b(canvas, rectF2, 3, e6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        ui0 ui0Var = this.Y2;
        if (ui0Var.w && ((view == (s1Var = ui0Var.N) && s1Var != null && s1Var.getCurrentPosition() == null) || view == ui0Var.U)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            return true;
        }
        org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
        s1Var2.setInvalidatesParent(true);
        s1Var2.K1(canvas);
        canvas.save();
        canvas.translate(s1Var2.getX(), s1Var2.getY());
        canvas.scale(s1Var2.getScaleX(), s1Var2.getScaleY(), s1Var2.getPivotX(), s1Var2.getPivotY());
        if (s1Var2.C1() && s1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, s1Var2.getPaddingTop());
            s1Var2.D1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(s1Var2.getX(), s1Var2.getY() + s1Var2.getPaddingTop());
        canvas.scale(s1Var2.getScaleX(), s1Var2.getScaleY(), s1Var2.getPivotX(), s1Var2.getPivotY());
        if (s1Var2.getCurrentPosition() != null && (((s1Var2.getCurrentPosition().flags & s1Var2.t0()) != 0 && (s1Var2.getCurrentPosition().flags & 1) != 0) || (s1Var2.getCurrentMessagesGroup() != null && s1Var2.getCurrentMessagesGroup().isDocuments))) {
            s1Var2.I1(s1Var2.getAlpha(), canvas, false);
        }
        if (s1Var2.getCurrentPosition() != null && (((s1Var2.getCurrentPosition().flags & 8) != 0 && (s1Var2.getCurrentPosition().flags & 1) != 0) || (s1Var2.getCurrentMessagesGroup() != null && s1Var2.getCurrentMessagesGroup().isDocuments))) {
            s1Var2.d2(canvas, s1Var2.getAlpha(), null);
            s1Var2.N1(canvas, s1Var2.getAlpha());
        }
        if (s1Var2.getCurrentPosition() != null) {
            s1Var2.W1(canvas, s1Var2.getAlpha());
        }
        if (s1Var2.getCurrentPosition() == null || s1Var2.getCurrentPosition().last) {
            s1Var2.m2(s1Var2.getAlpha(), canvas, true);
        }
        s1Var2.X1(canvas);
        s1Var2.getTransitionParams().i();
        canvas.restore();
        s1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof ti0)) {
                ti0 ti0Var = (ti0) childAt;
                ti0Var.Ce = childAt.getTop();
                ti0Var.De = childAt.getBottom();
                ti0Var.Ee = ti0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z4, i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        ui0 ui0Var = this.Y2;
        int dp = AndroidUtilities.dp(ui0Var.K.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = ui0Var.W;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - ui0Var.e.b), TLObject.FLAG_31));
        int max = Math.max(AndroidUtilities.dp(12.0f) + (ui0Var.j0 ? ui0Var.V : ui0Var.T.l()), -((AndroidUtilities.dp(7.0f) + ui0Var.l0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, ui0Var.L - ((getMeasuredWidth() - max) - AndroidUtilities.dp((ui0Var.M.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
