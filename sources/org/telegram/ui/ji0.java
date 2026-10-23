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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ji0 extends org.telegram.ui.Components.mm0 {
    public final ArrayList Y2;
    public final org.telegram.ui.Components.f6 Z2;
    public final org.telegram.ui.Components.f6 a3;
    public final w10 b3;
    public final /* synthetic */ qi0 c3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(qi0 qi0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.c3 = qi0Var;
        this.Y2 = new ArrayList(10);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.Z2 = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        this.a3 = new org.telegram.ui.Components.f6(this, 0L, 360L, bsVar);
        this.b3 = new w10();
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03bf, code lost:
    
        if (r3.messages.size() != 1) goto L167;
     */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v45 */
    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i11;
        float f7;
        qi0 qi0Var;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.GroupedMessages currentMessagesGroup2;
        ArrayList arrayList4;
        ji0 ji0Var;
        ji0 ji0Var2;
        qi0 qi0Var2;
        ArrayList arrayList5;
        MessageObject.GroupedMessages currentMessagesGroup3;
        MessageObject.GroupedMessages currentMessagesGroup4;
        qi0 qi0Var3 = this.c3;
        ii0 ii0Var = qi0Var3.F;
        int measuredHeight = ii0Var.getMeasuredHeight();
        ji0 ji0Var3 = qi0Var3.J;
        int childCount = ji0Var3.getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = ji0Var3.getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                RectF rectF = ih.k.h;
                ih.k.c(t1Var2, ii0Var, rectF);
                float f10 = rectF.top;
                int i13 = (int) f10;
                childAt.getMeasuredHeight();
                int i14 = i13 >= 0 ? 0 : -i13;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i14 + measuredHeight;
                }
                t1Var2.a4(i14, measuredHeight2 - i14, measuredHeight, f10, f10, ii0Var.getMeasuredWidth(), ii0Var.getMeasuredHeight(), 0, 0, 0);
            }
        }
        boolean z11 = true;
        canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getHeight() + getScrollY()) - 1, 255, 31);
        Canvas canvas2 = canvas;
        canvas2.save();
        int childCount2 = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if ((childAt2 instanceof org.telegram.ui.Cells.t1) && ((currentMessagesGroup4 = ((org.telegram.ui.Cells.t1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup4 != groupedMessages)) {
                groupedMessages = currentMessagesGroup4;
            }
        }
        int i16 = 0;
        while (true) {
            arrayList = this.Y2;
            int i17 = 2;
            i10 = 3;
            if (i16 >= 3) {
                break;
            }
            arrayList.clear();
            if (i16 != 2 || ji0Var3.V1) {
                int i18 = z10 ? 1 : 0;
                ?? r92 = z10;
                while (i18 < childCount2) {
                    View childAt3 = ji0Var3.getChildAt(i18);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= ji0Var3.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup3 = t1Var3.getCurrentMessagesGroup()) != null && ((i16 != 0 || currentMessagesGroup3.messages.size() != z11) && ((i16 != z11 || currentMessagesGroup3.transitionParams.drawBackgroundForDeletedItems) && ((i16 != 0 || !t1Var3.getMessageObject().deleted) && ((i16 != z11 || t1Var3.getMessageObject().deleted) && ((i16 != i17 || t1Var3.oc) && (i16 == i17 || !t1Var3.oc))))))) {
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
                            currentMessagesGroup3.transitionParams.pinnedTop = t1Var3.m3();
                            currentMessagesGroup3.transitionParams.pinnedBotton = t1Var3.l3();
                            int x10 = (int) (t1Var3.getX() + t1Var3.getBackgroundDrawableLeft());
                            int x11 = (int) (t1Var3.getX() + t1Var3.getBackgroundDrawableRight());
                            int y3 = (int) (t1Var3.getY() + t1Var3.getPaddingTop() + t1Var3.getBackgroundDrawableTop());
                            int y10 = (int) (t1Var3.getY() + t1Var3.getPaddingTop() + t1Var3.getBackgroundDrawableBottom());
                            if ((t1Var3.getCurrentPosition().flags & 4) == 0) {
                                y3 -= AndroidUtilities.dp(10.0f);
                            }
                            if ((t1Var3.getCurrentPosition().flags & 8) == 0) {
                                y10 += AndroidUtilities.dp(10.0f);
                            }
                            if (t1Var3.oc) {
                                currentMessagesGroup3.transitionParams.cell = t1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup3.transitionParams;
                            int i19 = transitionParams2.top;
                            if (i19 == 0 || y3 < i19) {
                                transitionParams2.top = y3;
                            }
                            int i20 = transitionParams2.bottom;
                            if (i20 == 0 || y10 > i20) {
                                transitionParams2.bottom = y10;
                            }
                            int i21 = transitionParams2.left;
                            if (i21 == 0 || x10 < i21) {
                                transitionParams2.left = x10;
                            }
                            int i22 = transitionParams2.right;
                            if (i22 == 0 || x11 > i22) {
                                transitionParams2.right = x11;
                            }
                            i18++;
                            i17 = 2;
                            r92 = 0;
                        }
                    }
                    i18++;
                    i17 = 2;
                    r92 = 0;
                }
                int i23 = 0;
                ArrayList arrayList6 = arrayList;
                while (i23 < arrayList6.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList6.get(i23);
                    if (groupedMessages2 == null) {
                        arrayList5 = arrayList6;
                        ji0Var2 = ji0Var3;
                        qi0Var2 = qi0Var3;
                    } else {
                        float D2 = groupedMessages2.transitionParams.cell.D2(z11);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f11 = transitionParams3.left + D2 + transitionParams3.offsetLeft;
                        float f12 = transitionParams3.top + transitionParams3.offsetTop;
                        float f13 = transitionParams3.offsetRight + transitionParams3.right + D2;
                        float f14 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (f12 < (-AndroidUtilities.dp(20.0f))) {
                            f12 = -AndroidUtilities.dp(20.0f);
                        }
                        float f15 = f12;
                        if (f14 > AndroidUtilities.dp(20.0f) + ji0Var3.getMeasuredHeight()) {
                            f14 = AndroidUtilities.dp(20.0f) + ji0Var3.getMeasuredHeight();
                        }
                        float f16 = f14;
                        boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : z11;
                        if (z12) {
                            canvas2.save();
                            arrayList4 = arrayList6;
                            ji0Var = ji0Var3;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.gms.internal.play_billing.k3.z(f13, f11, 2.0f, f11), com.google.android.gms.internal.play_billing.k3.z(f16, f15, 2.0f, f15));
                        } else {
                            arrayList4 = arrayList6;
                            ji0Var = ji0Var3;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        ji0Var2 = ji0Var;
                        ArrayList arrayList7 = arrayList4;
                        qi0Var2 = qi0Var3;
                        arrayList5 = arrayList7;
                        transitionParams4.cell.A1(canvas2, (int) f11, (int) f15, (int) f13, (int) f16, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z12) {
                            canvas.restore();
                            for (int i24 = 0; i24 < childCount2; i24++) {
                                View childAt4 = ji0Var2.getChildAt(i24);
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
                    i23++;
                    canvas2 = canvas;
                    ji0Var3 = ji0Var2;
                    qi0Var3 = qi0Var2;
                    arrayList6 = arrayList5;
                    z11 = true;
                }
            }
            i16++;
            canvas2 = canvas;
            ji0Var3 = ji0Var3;
            qi0Var3 = qi0Var3;
            z10 = false;
            z11 = true;
        }
        ArrayList arrayList8 = arrayList;
        ji0 ji0Var4 = ji0Var3;
        qi0 qi0Var4 = qi0Var3;
        float f17 = 0.0f;
        super.dispatchDraw(canvas);
        int childCount3 = getChildCount();
        MessageObject.GroupedMessages groupedMessages3 = null;
        int i25 = 0;
        while (i25 < childCount3) {
            View childAt5 = getChildAt(i25);
            if (!(childAt5 instanceof org.telegram.ui.Cells.t1) || ((currentMessagesGroup2 = (t1Var = (org.telegram.ui.Cells.t1) childAt5).getCurrentMessagesGroup()) != null && currentMessagesGroup2 == groupedMessages3)) {
                i11 = i10;
                f7 = f17;
                qi0Var = qi0Var4;
            } else {
                if (currentMessagesGroup2 == null) {
                    float boundsLeft = t1Var.getBoundsLeft();
                    float y11 = t1Var.getY();
                    float boundsRight = t1Var.getBoundsRight();
                    float y12 = t1Var.getY() + t1Var.getHeight();
                    i11 = i10;
                    f7 = f17;
                    qi0Var = qi0Var4;
                    qi0Var.i(canvas, boundsLeft, y11, boundsRight, y12);
                } else {
                    i11 = i10;
                    f7 = f17;
                    qi0Var = qi0Var4;
                }
                groupedMessages3 = currentMessagesGroup2;
            }
            i25++;
            qi0Var4 = qi0Var;
            i10 = i11;
            f17 = f7;
        }
        int i26 = i10;
        float f18 = f17;
        qi0 qi0Var5 = qi0Var4;
        int i27 = 0;
        while (i27 < i26) {
            arrayList8.clear();
            if (i27 != 2 || ji0Var4.V1) {
                int i28 = 0;
                while (i28 < childCount3) {
                    View childAt6 = ji0Var4.getChildAt(i28);
                    if (childAt6 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) childAt6;
                        if (childAt6.getY() <= ji0Var4.getHeight() && childAt6.getY() + childAt6.getHeight() >= f18 && (currentMessagesGroup = t1Var5.getCurrentMessagesGroup()) != null) {
                            int i29 = i27 == 0 ? 1 : 1;
                            if ((i27 != i29 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i27 != 0 || !t1Var5.getMessageObject().deleted) && ((i27 != 1 || t1Var5.getMessageObject().deleted) && ((i27 != 2 || t1Var5.oc) && (i27 == 2 || !t1Var5.oc))))) {
                                arrayList3 = arrayList8;
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
                                currentMessagesGroup.transitionParams.pinnedTop = t1Var5.m3();
                                currentMessagesGroup.transitionParams.pinnedBotton = t1Var5.l3();
                                int x12 = (int) (t1Var5.getX() + t1Var5.getBackgroundDrawableLeft());
                                int x13 = (int) (t1Var5.getX() + t1Var5.getBackgroundDrawableRight());
                                int y13 = (int) (t1Var5.getY() + t1Var5.getPaddingTop() + t1Var5.getBackgroundDrawableTop());
                                int y14 = (int) (t1Var5.getY() + t1Var5.getPaddingTop() + t1Var5.getBackgroundDrawableBottom());
                                if ((t1Var5.getCurrentPosition().flags & 4) == 0) {
                                    y13 -= AndroidUtilities.dp(10.0f);
                                }
                                if ((t1Var5.getCurrentPosition().flags & 8) == 0) {
                                    y14 += AndroidUtilities.dp(10.0f);
                                }
                                if (t1Var5.oc) {
                                    currentMessagesGroup.transitionParams.cell = t1Var5;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup.transitionParams;
                                int i30 = transitionParams7.top;
                                if (i30 == 0 || y13 < i30) {
                                    transitionParams7.top = y13;
                                }
                                int i31 = transitionParams7.bottom;
                                if (i31 == 0 || y14 > i31) {
                                    transitionParams7.bottom = y14;
                                }
                                int i32 = transitionParams7.left;
                                if (i32 == 0 || x12 < i32) {
                                    transitionParams7.left = x12;
                                }
                                int i33 = transitionParams7.right;
                                if (i33 == 0 || x13 > i33) {
                                    transitionParams7.right = x13;
                                }
                                i28++;
                                arrayList8 = arrayList3;
                            }
                        }
                    }
                    arrayList3 = arrayList8;
                    i28++;
                    arrayList8 = arrayList3;
                }
                arrayList2 = arrayList8;
                for (int i34 = 0; i34 < arrayList2.size(); i34++) {
                    MessageObject.GroupedMessages groupedMessages4 = (MessageObject.GroupedMessages) arrayList2.get(i34);
                    float D22 = groupedMessages4.transitionParams.cell.D2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams8 = groupedMessages4.transitionParams;
                    float f19 = transitionParams8.left + D22 + transitionParams8.offsetLeft;
                    float f20 = transitionParams8.top + transitionParams8.offsetTop;
                    float f21 = transitionParams8.right + D22 + transitionParams8.offsetRight;
                    float f22 = transitionParams8.bottom + transitionParams8.offsetBottom;
                    if (f20 < (-AndroidUtilities.dp(20.0f))) {
                        f20 = -AndroidUtilities.dp(20.0f);
                    }
                    if (f22 > AndroidUtilities.dp(20.0f) + ji0Var4.getMeasuredHeight()) {
                        f22 = AndroidUtilities.dp(20.0f) + ji0Var4.getMeasuredHeight();
                    }
                    qi0Var5.i(canvas, f19, f20, f21, f22);
                    groupedMessages4.transitionParams.cell = null;
                }
            } else {
                arrayList2 = arrayList8;
            }
            i27++;
            arrayList8 = arrayList2;
        }
        canvas.save();
        float e = this.Z2.e(canScrollVertically(-1));
        float e7 = this.a3.e(canScrollVertically(1));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(f18, getScrollY(), getWidth(), AndroidUtilities.dp(14.0f) + getScrollY());
        w10 w10Var = this.b3;
        w10Var.b(canvas, rectF2, 1, e);
        rectF2.set(f18, (getHeight() + getScrollY()) - AndroidUtilities.dp(14.0f), getWidth(), getHeight() + getScrollY());
        w10Var.b(canvas, rectF2, i26, e7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.t1 t1Var;
        qi0 qi0Var = this.c3;
        if (qi0Var.v && ((view == (t1Var = qi0Var.P) && t1Var != null && t1Var.getCurrentPosition() == null) || view == qi0Var.W)) {
            return false;
        }
        if (!(view instanceof org.telegram.ui.Cells.t1)) {
            return true;
        }
        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
        t1Var2.setInvalidatesParent(true);
        t1Var2.J1(canvas);
        canvas.save();
        canvas.translate(t1Var2.getX(), t1Var2.getY());
        canvas.scale(t1Var2.getScaleX(), t1Var2.getScaleY(), t1Var2.getPivotX(), t1Var2.getPivotY());
        if (t1Var2.B1() && t1Var2.getCurrentPosition() == null) {
            canvas.save();
            canvas.translate(0.0f, t1Var2.getPaddingTop());
            t1Var2.C1(canvas, true, false);
            canvas.restore();
        }
        canvas.restore();
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.save();
        canvas.translate(t1Var2.getX(), t1Var2.getY() + t1Var2.getPaddingTop());
        canvas.scale(t1Var2.getScaleX(), t1Var2.getScaleY(), t1Var2.getPivotX(), t1Var2.getPivotY());
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & t1Var2.s0()) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
            t1Var2.H1(t1Var2.getAlpha(), canvas, false);
        }
        if (t1Var2.getCurrentPosition() != null && (((t1Var2.getCurrentPosition().flags & 8) != 0 && (t1Var2.getCurrentPosition().flags & 1) != 0) || (t1Var2.getCurrentMessagesGroup() != null && t1Var2.getCurrentMessagesGroup().isDocuments))) {
            t1Var2.c2(canvas, t1Var2.getAlpha(), null);
            t1Var2.M1(canvas, t1Var2.getAlpha());
        }
        if (t1Var2.getCurrentPosition() != null) {
            t1Var2.V1(canvas, t1Var2.getAlpha());
        }
        if (t1Var2.getCurrentPosition() == null || t1Var2.getCurrentPosition().last) {
            t1Var2.l2(t1Var2.getAlpha(), canvas, true);
        }
        t1Var2.W1(canvas);
        t1Var2.getTransitionParams().i();
        canvas.restore();
        t1Var2.setInvalidatesParent(false);
        return drawChild;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTop() != 0 && (childAt instanceof pi0)) {
                pi0 pi0Var = (pi0) childAt;
                pi0Var.Ge = childAt.getTop();
                pi0Var.He = childAt.getBottom();
                pi0Var.Ie = pi0Var.getMessageObject().getId();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        qi0 qi0Var = this.c3;
        int dp = AndroidUtilities.dp(qi0Var.M.isEmpty() ? -6.0f : 48.0f);
        ViewGroup viewGroup = qi0Var.Y;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (dp + (viewGroup == null ? 0 : viewGroup.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - qi0Var.d.b), TLObject.FLAG_31));
        int max = Math.max(AndroidUtilities.dp(12.0f) + (qi0Var.l0 ? qi0Var.X : qi0Var.V.l()), -((AndroidUtilities.dp(7.0f) + qi0Var.n0[0]) - getMeasuredWidth()));
        float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, qi0Var.N - ((getMeasuredWidth() - max) - AndroidUtilities.dp((qi0Var.O.i() ? 0 : 40) + 8))));
        setPivotX(getMeasuredWidth());
        setPivotY(getMeasuredHeight());
        setScaleX(max2);
        setScaleY(max2);
    }
}
