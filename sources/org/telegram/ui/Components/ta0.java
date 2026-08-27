package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ta0 extends zk0 {
    public final /* synthetic */ ab0 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(ab0 ab0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.T2 = ab0Var;
    }

    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        ab0 ab0Var;
        float f10;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject.GroupedMessages currentMessagesGroup2;
        ab0 ab0Var2 = this.T2;
        gh.q4 q4Var = ab0Var2.b;
        boolean z11 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                ((org.telegram.ui.Cells.s1) childAt).Y3(q4Var.getMeasuredWidth(), q4Var.getBackgroundSizeY());
            }
        }
        int childCount = getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if ((childAt2 instanceof org.telegram.ui.Cells.s1) && ((currentMessagesGroup2 = ((org.telegram.ui.Cells.s1) childAt2).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                groupedMessages = currentMessagesGroup2;
            }
        }
        int i12 = 0;
        while (i12 < 3) {
            gb0 gb0Var = ab0Var2.V;
            ArrayList arrayList = gb0Var.A;
            ta0 ta0Var = ab0Var2.f;
            gb0Var.A.clear();
            if (i12 != 2 || ta0Var.T1) {
                int i13 = 0;
                ?? r32 = z11;
                while (true) {
                    z10 = true;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt3 = ta0Var.getChildAt(i13);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= ta0Var.getHeight() && childAt3.getY() + childAt3.getHeight() >= 0.0f && (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) != null && ((i12 != 0 || currentMessagesGroup.messages.size() != 1) && ((i12 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i12 != 0 || !s1Var.getMessageObject().deleted) && ((i12 != 1 || s1Var.getMessageObject().deleted) && ((i12 != 2 || s1Var.kc) && (i12 == 2 || !s1Var.kc))))))) {
                            if (!arrayList.contains(currentMessagesGroup)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                transitionParams.left = r32;
                                transitionParams.top = r32;
                                transitionParams.right = r32;
                                transitionParams.bottom = r32;
                                transitionParams.pinnedBotton = r32;
                                transitionParams.pinnedTop = r32;
                                transitionParams.cell = s1Var;
                                arrayList.add(currentMessagesGroup);
                            }
                            currentMessagesGroup.transitionParams.pinnedTop = s1Var.m3();
                            currentMessagesGroup.transitionParams.pinnedBotton = s1Var.l3();
                            int backgroundDrawableLeft = s1Var.getBackgroundDrawableLeft() + s1Var.getLeft();
                            int backgroundDrawableRight = s1Var.getBackgroundDrawableRight() + s1Var.getLeft();
                            int backgroundDrawableTop = s1Var.getBackgroundDrawableTop() + s1Var.getPaddingTop() + s1Var.getTop();
                            int backgroundDrawableBottom = s1Var.getBackgroundDrawableBottom() + s1Var.getPaddingTop() + s1Var.getTop();
                            if ((s1Var.getCurrentPosition().flags & 4) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            if ((s1Var.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom += AndroidUtilities.dp(10.0f);
                            }
                            if (s1Var.kc) {
                                currentMessagesGroup.transitionParams.cell = s1Var;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            int i14 = transitionParams2.top;
                            if (i14 == 0 || backgroundDrawableTop < i14) {
                                transitionParams2.top = backgroundDrawableTop;
                            }
                            int i15 = transitionParams2.bottom;
                            if (i15 == 0 || backgroundDrawableBottom > i15) {
                                transitionParams2.bottom = backgroundDrawableBottom;
                            }
                            int i16 = transitionParams2.left;
                            if (i16 == 0 || backgroundDrawableLeft < i16) {
                                transitionParams2.left = backgroundDrawableLeft;
                            }
                            int i17 = transitionParams2.right;
                            if (i17 == 0 || backgroundDrawableRight > i17) {
                                transitionParams2.right = backgroundDrawableRight;
                            }
                        }
                    }
                    i13++;
                    r32 = 0;
                }
                int i18 = 0;
                while (i18 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i18);
                    if (groupedMessages2 == null) {
                        ab0Var = ab0Var2;
                    } else {
                        float D2 = groupedMessages2.transitionParams.cell.D2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                        float f11 = transitionParams3.left + D2 + transitionParams3.offsetLeft;
                        float f12 = transitionParams3.top + transitionParams3.offsetTop;
                        float f13 = transitionParams3.right + D2 + transitionParams3.offsetRight;
                        float f14 = transitionParams3.bottom + transitionParams3.offsetBottom;
                        if (!transitionParams3.backgroundChangeBounds) {
                            f12 += transitionParams3.cell.getTranslationY();
                            f14 += groupedMessages2.transitionParams.cell.getTranslationY();
                        }
                        if (f12 < (-AndroidUtilities.dp(20.0f))) {
                            f12 = -AndroidUtilities.dp(20.0f);
                        }
                        if (f14 > AndroidUtilities.dp(20.0f) + ta0Var.getMeasuredHeight()) {
                            f14 = AndroidUtilities.dp(20.0f) + ta0Var.getMeasuredHeight();
                        }
                        boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                        if (z12) {
                            canvas.save();
                            ab0Var = ab0Var2;
                            canvas2 = canvas;
                            f10 = 2.0f;
                            canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.recaptcha.internal.a.A(f13, f11, 2.0f, f11), com.google.android.recaptcha.internal.a.A(f14, f12, 2.0f, f12));
                        } else {
                            canvas2 = canvas;
                            ab0Var = ab0Var2;
                            f10 = 2.0f;
                        }
                        MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                        transitionParams4.cell.A1(canvas2, (int) f11, (int) f12, (int) f13, (int) f14, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                        MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                        transitionParams5.cell = null;
                        transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                        if (z12) {
                            canvas.restore();
                            for (int i19 = 0; i19 < childCount; i19++) {
                                View childAt4 = ta0Var.getChildAt(i19);
                                if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt4;
                                    if (s1Var2.getCurrentMessagesGroup() == groupedMessages2) {
                                        int left = s1Var2.getLeft();
                                        int top = s1Var2.getTop();
                                        childAt4.setPivotX(((f13 - f11) / f10) + (f11 - left));
                                        childAt4.setPivotY(((f14 - f12) / f10) + (f12 - top));
                                    }
                                }
                            }
                        }
                    }
                    i18++;
                    z10 = true;
                    ab0Var2 = ab0Var;
                }
            }
            i12++;
            z11 = false;
            ab0Var2 = ab0Var2;
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof org.telegram.ui.Cells.s1)) {
            return super.drawChild(canvas, view, j10);
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        boolean drawChild = super.drawChild(canvas, view, j10);
        s1Var.J1(canvas);
        canvas.save();
        canvas.translate(s1Var.getX(), s1Var.getY());
        canvas.save();
        canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX(), s1Var.getPivotY());
        s1Var.O1(canvas, true);
        s1Var.t3(true);
        s1Var.U1(canvas);
        if (s1Var.getCurrentMessagesGroup() == null || ((s1Var.getCurrentPosition() != null && (((s1Var.getCurrentPosition().flags & s1Var.s0()) != 0 && (s1Var.getCurrentPosition().flags & 1) != 0) || (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().isDocuments))) || s1Var.getTransitionParams().w0)) {
            s1Var.H1(s1Var.getAlpha(), canvas, false);
            s1Var.c2(canvas, s1Var.getAlpha(), null);
            s1Var.M1(canvas, s1Var.getAlpha());
        }
        if (s1Var.getCurrentMessagesGroup() != null || s1Var.getTransitionParams().w0) {
            s1Var.V1(canvas, s1Var.getAlpha());
        }
        if ((s1Var.getCurrentPosition() != null && s1Var.getCurrentPosition().last) || s1Var.getTransitionParams().w0) {
            s1Var.l2(s1Var.getAlpha(), canvas, true);
        }
        s1Var.X1(canvas);
        canvas.restore();
        s1Var.getTransitionParams().i();
        canvas.restore();
        return drawChild;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i10) {
        if (i10 == 0) {
            this.T2.e.W();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i10, int i11) {
        this.T2.e.H();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ab0 ab0Var = this.T2;
        int i14 = ab0Var.a;
        if (ab0Var.G) {
            if (i14 != 0) {
                u0(0);
            }
            ab0Var.G = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        ab0Var.i();
        ta0 ta0Var = ab0Var.f;
        if (ab0Var.Q) {
            if (ta0Var.computeVerticalScrollRange() > ta0Var.computeVerticalScrollExtent()) {
                ab0Var.postDelayed(new na0(ab0Var, 0), 0L);
            }
            ab0Var.Q = false;
        }
        if (ab0Var.J && i14 == 0) {
            int i15 = ab0Var.H;
            int i16 = ab0Var.I;
            ab0Var.J = false;
            post(new h3.z(this, i15, i16, 9));
        }
    }
}
