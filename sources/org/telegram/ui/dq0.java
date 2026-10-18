package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class dq0 extends org.telegram.ui.Components.jw0 {
    public int w0;
    public boolean x0;
    public int y0;
    public final /* synthetic */ lq0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(lq0 lq0Var, Context context) {
        super(context, null);
        this.z0 = lq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    @Override // org.telegram.ui.Components.jw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.Components.qu quVar;
        int measuredHeight;
        int measuredHeight2;
        int i20 = this.w0;
        int i21 = i12 - i10;
        lq0 lq0Var = this.z0;
        if (i20 != i21) {
            this.w0 = i21;
            jq0 jq0Var = lq0Var.L;
            if (jq0Var != null) {
                jq0Var.l();
            }
            org.telegram.ui.ActionBar.m1 m1Var = lq0Var.m0;
            if (m1Var != null && m1Var.isShowing()) {
                lq0Var.m0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (lq0Var.d0 == null || lq0Var.Z.getParent() != this || AndroidUtilities.dp(20.0f) < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : lq0Var.d0.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i23 = layoutParams.gravity;
                if (i23 == -1) {
                    i23 = 51;
                }
                int i24 = i23 & 112;
                int i25 = i23 & 7;
                if (i25 == 1) {
                    i14 = ((i21 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i25 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i24 == 16) {
                        if (i24 == 48) {
                            i19 = layoutParams.topMargin + getPaddingTop();
                        } else if (i24 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        quVar = lq0Var.d0;
                        if (quVar != null && quVar.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    quVar = lq0Var.d0;
                    if (quVar != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (i21 - measuredWidth) - layoutParams.rightMargin;
                    i15 = getPaddingRight();
                }
                i16 = i14 - i15;
                if (i24 == 16) {
                }
                i19 = i17 - i18;
                quVar = lq0Var.d0;
                if (quVar != null) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        S();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.qu quVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean isTablet = AndroidUtilities.isTablet();
        lq0 lq0Var = this.z0;
        if (isTablet) {
            lq0Var.g0 = 4;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                lq0Var.g0 = 4;
            } else {
                lq0Var.g0 = 3;
            }
        }
        this.x0 = true;
        int dp = ((size2 - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(4.0f)) / lq0Var.g0;
        lq0Var.R = dp;
        if (this.y0 != dp) {
            this.y0 = dp;
            AndroidUtilities.runOnUIThread(new ek0(this, 13));
        }
        if (lq0Var.Y) {
            lq0Var.M.y1(1);
        } else {
            lq0Var.M.y1(Math.max(1, ((lq0Var.g0 - 1) * AndroidUtilities.dp(2.0f)) + (lq0Var.R * lq0Var.g0)));
        }
        this.x0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int R = R();
        if (AndroidUtilities.dp(20.0f) >= 0 && !AndroidUtilities.isInMultiwindow && lq0Var.d0 != null && lq0Var.Z.getParent() == this) {
            size4 -= lq0Var.d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (R > AndroidUtilities.dp(20.0f) && (quVar = lq0Var.d0) != null) {
            this.x0 = true;
            quVar.j();
            this.x0 = false;
        }
        org.telegram.ui.Components.qu quVar2 = lq0Var.d0;
        if (quVar2 != null && quVar2.e) {
            lq0Var.fragmentView.setTranslationY(0.0f);
            lq0Var.K.setTranslationY(0.0f);
            lq0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.qu quVar3 = lq0Var.d0;
                if (quVar3 == null || !quVar3.l(childAt)) {
                    measureChildWithMargins(childAt, i10, 0, i13, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i12 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x0) {
            return;
        }
        super.requestLayout();
    }
}
