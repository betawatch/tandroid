package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mm0 extends org.telegram.ui.Components.st0 {
    public int g0;
    public boolean h0;
    public final /* synthetic */ om0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm0(om0 om0Var, Context context) {
        super(context, null);
        this.i0 = om0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.rt rtVar;
        int measuredHeight;
        int measuredHeight2;
        int i19 = this.g0;
        int i20 = i11 - i7;
        om0 om0Var = this.i0;
        if (i19 != i20) {
            this.g0 = i20;
            org.telegram.ui.ActionBar.g1 g1Var = om0Var.J;
            if (g1Var != null && g1Var.isShowing()) {
                om0Var.J.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (org.telegram.messenger.g0.L(20.0f) < 0 || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) ? 0 : om0Var.N.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.ns.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i13 = ((i20 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                        } else if (i23 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - emojiPadding) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        rtVar = om0Var.N;
                        if (rtVar != null && rtVar.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - emojiPadding) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    rtVar = om0Var.N;
                    if (rtVar != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (i20 - measuredWidth) - layoutParams.rightMargin;
                    i14 = getPaddingRight();
                }
                i15 = i13 - i14;
                if (i23 == 16) {
                }
                i18 = i16 - i17;
                rtVar = om0Var.N;
                if (rtVar != null) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i12 = 0;
        om0 om0Var = this.i0;
        if (L < 0) {
            this.h0 = true;
            om0Var.N.j();
            this.h0 = false;
        } else if (!org.telegram.messenger.g0.E) {
            size2 -= om0Var.N.getEmojiPadding();
            i10 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
        }
        int i13 = i10;
        int childCount = getChildCount();
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.rt rtVar = om0Var.N;
                if (rtVar == null || !rtVar.l(childAt)) {
                    i11 = i7;
                    measureChildWithMargins(childAt, i11, 0, i13, 0);
                    i12++;
                    i7 = i11;
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (size2 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                }
            }
            i11 = i7;
            i12++;
            i7 = i11;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }
}
