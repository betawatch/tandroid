package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jd extends org.telegram.ui.Components.pv0 {
    public final /* synthetic */ int t0;
    public boolean u0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        this.t0 = i10;
        this.v0 = p2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0154  */
    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.Components.fu fuVar;
        int measuredHeight;
        int measuredHeight2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        org.telegram.ui.Components.fu fuVar2;
        int measuredHeight3;
        int measuredHeight4;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        org.telegram.ui.Components.fu fuVar3;
        int measuredHeight5;
        int measuredHeight6;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        org.telegram.ui.Components.mz mzVar;
        int measuredHeight7;
        int measuredHeight8;
        switch (this.t0) {
            case 0:
                nd ndVar = (nd) this.v0;
                int childCount = getChildCount();
                int R = R();
                int emojiPadding = (R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : ndVar.c.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i38 = 0; i38 < childCount; i38++) {
                    View childAt = getChildAt(i38);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight9 = childAt.getMeasuredHeight();
                        int i39 = layoutParams.gravity;
                        if (i39 == -1) {
                            i39 = 51;
                        }
                        int i40 = i39 & 112;
                        int i41 = i39 & 7;
                        if (i41 == 1) {
                            i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        } else if (i41 != 5) {
                            i16 = layoutParams.leftMargin;
                            if (i40 == 16) {
                                if (i40 == 48) {
                                    i19 = layoutParams.topMargin + getPaddingTop();
                                } else if (i40 != 80) {
                                    i19 = layoutParams.topMargin;
                                } else {
                                    i17 = ((i13 - emojiPadding) - i11) - measuredHeight9;
                                    i18 = layoutParams.bottomMargin;
                                }
                                fuVar = ndVar.c;
                                if (fuVar != null && fuVar.l(childAt)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight() + R;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    i19 = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight9 + i19);
                            } else {
                                i17 = ((((i13 - emojiPadding) - i11) - measuredHeight9) / 2) + layoutParams.topMargin;
                                i18 = layoutParams.bottomMargin;
                            }
                            i19 = i17 - i18;
                            fuVar = ndVar.c;
                            if (fuVar != null) {
                                if (AndroidUtilities.isTablet()) {
                                }
                                i19 = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i16, i19, measuredWidth + i16, measuredHeight9 + i19);
                        } else {
                            i14 = i12 - measuredWidth;
                            i15 = layoutParams.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i40 == 16) {
                        }
                        i19 = i17 - i18;
                        fuVar = ndVar.c;
                        if (fuVar != null) {
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight9 + i19);
                    }
                }
                S();
                break;
            case 1:
                po poVar = (po) this.v0;
                int childCount2 = getChildCount();
                int R2 = R();
                int emojiPadding2 = (R2 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : poVar.v.getEmojiPadding();
                setBottomClip(emojiPadding2);
                for (int i42 = 0; i42 < childCount2; i42++) {
                    View childAt2 = getChildAt(i42);
                    if (childAt2.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight10 = childAt2.getMeasuredHeight();
                        int i43 = layoutParams2.gravity;
                        if (i43 == -1) {
                            i43 = 51;
                        }
                        int i44 = i43 & 112;
                        int i45 = i43 & 7;
                        if (i45 == 1) {
                            i20 = (((i12 - i10) - measuredWidth2) / 2) + layoutParams2.leftMargin;
                            i21 = layoutParams2.rightMargin;
                        } else if (i45 != 5) {
                            i22 = layoutParams2.leftMargin;
                            if (i44 == 16) {
                                if (i44 == 48) {
                                    i25 = layoutParams2.topMargin + getPaddingTop();
                                } else if (i44 != 80) {
                                    i25 = layoutParams2.topMargin;
                                } else {
                                    i23 = ((i13 - emojiPadding2) - i11) - measuredHeight10;
                                    i24 = layoutParams2.bottomMargin;
                                }
                                fuVar2 = poVar.v;
                                if (fuVar2 != null && fuVar2.l(childAt2)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight3 = getMeasuredHeight() + R2;
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    } else {
                                        measuredHeight3 = getMeasuredHeight();
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    }
                                    i25 = measuredHeight3 - measuredHeight4;
                                }
                                childAt2.layout(i22, i25, measuredWidth2 + i22, measuredHeight10 + i25);
                            } else {
                                i23 = ((((i13 - emojiPadding2) - i11) - measuredHeight10) / 2) + layoutParams2.topMargin;
                                i24 = layoutParams2.bottomMargin;
                            }
                            i25 = i23 - i24;
                            fuVar2 = poVar.v;
                            if (fuVar2 != null) {
                                if (AndroidUtilities.isTablet()) {
                                }
                                i25 = measuredHeight3 - measuredHeight4;
                            }
                            childAt2.layout(i22, i25, measuredWidth2 + i22, measuredHeight10 + i25);
                        } else {
                            i20 = i12 - measuredWidth2;
                            i21 = layoutParams2.rightMargin;
                        }
                        i22 = i20 - i21;
                        if (i44 == 16) {
                        }
                        i25 = i23 - i24;
                        fuVar2 = poVar.v;
                        if (fuVar2 != null) {
                        }
                        childAt2.layout(i22, i25, measuredWidth2 + i22, measuredHeight10 + i25);
                    }
                }
                S();
                break;
            case 2:
                f70 f70Var = (f70) this.v0;
                int childCount3 = getChildCount();
                int R3 = R();
                int emojiPadding3 = (R3 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : f70Var.c.getEmojiPadding();
                setBottomClip(emojiPadding3);
                for (int i46 = 0; i46 < childCount3; i46++) {
                    View childAt3 = getChildAt(i46);
                    if (childAt3.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) childAt3.getLayoutParams();
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight11 = childAt3.getMeasuredHeight();
                        int i47 = layoutParams3.gravity;
                        if (i47 == -1) {
                            i47 = 51;
                        }
                        int i48 = i47 & 112;
                        int i49 = i47 & 7;
                        if (i49 == 1) {
                            i26 = (((i12 - i10) - measuredWidth3) / 2) + layoutParams3.leftMargin;
                            i27 = layoutParams3.rightMargin;
                        } else if (i49 != 5) {
                            i28 = layoutParams3.leftMargin;
                            if (i48 == 16) {
                                if (i48 == 48) {
                                    i31 = layoutParams3.topMargin + getPaddingTop();
                                } else if (i48 != 80) {
                                    i31 = layoutParams3.topMargin;
                                } else {
                                    i29 = ((i13 - emojiPadding3) - i11) - measuredHeight11;
                                    i30 = layoutParams3.bottomMargin;
                                }
                                fuVar3 = f70Var.c;
                                if (fuVar3 != null && fuVar3.l(childAt3)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight5 = getMeasuredHeight() + R3;
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    } else {
                                        measuredHeight5 = getMeasuredHeight();
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    }
                                    i31 = measuredHeight5 - measuredHeight6;
                                }
                                childAt3.layout(i28, i31, measuredWidth3 + i28, measuredHeight11 + i31);
                            } else {
                                i29 = ((((i13 - emojiPadding3) - i11) - measuredHeight11) / 2) + layoutParams3.topMargin;
                                i30 = layoutParams3.bottomMargin;
                            }
                            i31 = i29 - i30;
                            fuVar3 = f70Var.c;
                            if (fuVar3 != null) {
                                if (AndroidUtilities.isTablet()) {
                                }
                                i31 = measuredHeight5 - measuredHeight6;
                            }
                            childAt3.layout(i28, i31, measuredWidth3 + i28, measuredHeight11 + i31);
                        } else {
                            i26 = i12 - measuredWidth3;
                            i27 = layoutParams3.rightMargin;
                        }
                        i28 = i26 - i27;
                        if (i48 == 16) {
                        }
                        i31 = i29 - i30;
                        fuVar3 = f70Var.c;
                        if (fuVar3 != null) {
                        }
                        childAt3.layout(i28, i31, measuredWidth3 + i28, measuredHeight11 + i31);
                    }
                }
                S();
                break;
            default:
                mv0 mv0Var = (mv0) this.v0;
                int childCount4 = getChildCount();
                int R4 = R();
                int i50 = (R4 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : mv0Var.S;
                setBottomClip(i50);
                for (int i51 = 0; i51 < childCount4; i51++) {
                    View childAt4 = getChildAt(i51);
                    if (childAt4.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) childAt4.getLayoutParams();
                        int measuredWidth4 = childAt4.getMeasuredWidth();
                        int measuredHeight12 = childAt4.getMeasuredHeight();
                        int i52 = layoutParams4.gravity;
                        if (i52 == -1) {
                            i52 = 51;
                        }
                        int i53 = i52 & 112;
                        int i54 = i52 & 7;
                        if (i54 == 1) {
                            i32 = (((i12 - i10) - measuredWidth4) / 2) + layoutParams4.leftMargin;
                            i33 = layoutParams4.rightMargin;
                        } else if (i54 != 5) {
                            i34 = layoutParams4.leftMargin;
                            if (i53 == 16) {
                                if (i53 == 48) {
                                    i37 = layoutParams4.topMargin + getPaddingTop();
                                } else if (i53 != 80) {
                                    i37 = layoutParams4.topMargin;
                                } else {
                                    i35 = ((i13 - i50) - i11) - measuredHeight12;
                                    i36 = layoutParams4.bottomMargin;
                                }
                                mzVar = mv0Var.O;
                                if (mzVar != null && mzVar == childAt4) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight7 = getMeasuredHeight() + R4;
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    } else {
                                        measuredHeight7 = getMeasuredHeight();
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    }
                                    i37 = measuredHeight7 - measuredHeight8;
                                }
                                childAt4.layout(i34, i37, measuredWidth4 + i34, measuredHeight12 + i37);
                            } else {
                                i35 = ((((i13 - i50) - i11) - measuredHeight12) / 2) + layoutParams4.topMargin;
                                i36 = layoutParams4.bottomMargin;
                            }
                            i37 = i35 - i36;
                            mzVar = mv0Var.O;
                            if (mzVar != null) {
                                if (AndroidUtilities.isTablet()) {
                                }
                                i37 = measuredHeight7 - measuredHeight8;
                            }
                            childAt4.layout(i34, i37, measuredWidth4 + i34, measuredHeight12 + i37);
                        } else {
                            i32 = i12 - measuredWidth4;
                            i33 = layoutParams4.rightMargin;
                        }
                        i34 = i32 - i33;
                        if (i53 == 16) {
                        }
                        i37 = i35 - i36;
                        mzVar = mv0Var.O;
                        if (mzVar != null) {
                        }
                        childAt4.layout(i34, i37, measuredWidth4 + i34, measuredHeight12 + i37);
                    }
                }
                S();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        switch (this.t0) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                nd ndVar = (nd) this.v0;
                kVar = ((org.telegram.ui.ActionBar.p2) ndVar).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.u0 = true;
                    ndVar.c.j();
                    this.u0 = false;
                }
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != null && childAt.getVisibility() != 8) {
                        kVar2 = ((org.telegram.ui.ActionBar.p2) ndVar).actionBar;
                        if (childAt != kVar2) {
                            org.telegram.ui.Components.fu fuVar = ndVar.c;
                            if (fuVar == null || !fuVar.l(childAt)) {
                                measureChildWithMargins(childAt, i10, 0, i11, 0);
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                            }
                        }
                    }
                }
                break;
            case 1:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size3, size4);
                int paddingTop2 = size4 - getPaddingTop();
                po poVar = (po) this.v0;
                kVar3 = ((org.telegram.ui.ActionBar.p2) poVar).actionBar;
                measureChildWithMargins(kVar3, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.u0 = true;
                    poVar.v.j();
                    this.u0 = false;
                }
                int childCount2 = getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        kVar4 = ((org.telegram.ui.ActionBar.p2) poVar).actionBar;
                        if (childAt2 != kVar4) {
                            org.telegram.ui.Components.fu fuVar2 = poVar.v;
                            if (fuVar2 == null || !fuVar2.l(childAt2)) {
                                measureChildWithMargins(childAt2, i10, 0, i11, 0);
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt2.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                            } else {
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop2 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                            }
                        }
                    }
                }
                break;
            case 2:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size5, size6);
                int paddingTop3 = size6 - getPaddingTop();
                f70 f70Var = (f70) this.v0;
                kVar5 = ((org.telegram.ui.ActionBar.p2) f70Var).actionBar;
                measureChildWithMargins(kVar5, i10, 0, i11, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    org.telegram.ui.Components.fu fuVar3 = f70Var.c;
                    if (!fuVar3.e) {
                        this.u0 = true;
                        fuVar3.j();
                        this.u0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    View childAt3 = getChildAt(i14);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        kVar6 = ((org.telegram.ui.ActionBar.p2) f70Var).actionBar;
                        if (childAt3 != kVar6) {
                            org.telegram.ui.Components.fu fuVar4 = f70Var.c;
                            if (fuVar4 == null || !fuVar4.l(childAt3)) {
                                measureChildWithMargins(childAt3, i10, 0, i11, 0);
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt3.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                            } else {
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(size5, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop3 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                            }
                        }
                    }
                }
                break;
            default:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                int paddingTop4 = size8 - getPaddingTop();
                mv0 mv0Var = (mv0) this.v0;
                kVar7 = ((org.telegram.ui.ActionBar.p2) mv0Var).actionBar;
                measureChildWithMargins(kVar7, i10, 0, i11, 0);
                int R = R();
                if (R > AndroidUtilities.dp(20.0f) && !mv0Var.M && !mv0Var.y0) {
                    this.u0 = true;
                    mv0Var.l0();
                    this.u0 = false;
                }
                int i15 = (R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : mv0Var.S;
                if (R > AndroidUtilities.dp(20.0f) && mv0Var.y0) {
                    i15 = AndroidUtilities.dp(120.0f);
                }
                int i16 = i15;
                int childCount4 = getChildCount();
                for (int i17 = 0; i17 < childCount4; i17++) {
                    View childAt4 = getChildAt(i17);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        kVar8 = ((org.telegram.ui.ActionBar.p2) mv0Var).actionBar;
                        if (childAt4 != kVar8) {
                            org.telegram.ui.Components.mz mzVar = mv0Var.O;
                            if (mzVar == null || mzVar != childAt4) {
                                if (mv0Var.c == childAt4) {
                                    childAt4.measure(i10, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i16, TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt4, i10, 0, i11, 0);
                                }
                            } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt4.getLayoutParams().height, TLObject.FLAG_30));
                            } else if (AndroidUtilities.isTablet()) {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                            } else {
                                childAt4.measure(View.MeasureSpec.makeMeasureSpec(size7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (paddingTop4 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.t0) {
            case 0:
                if (!this.u0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!this.u0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.u0) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.u0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }
}
