package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ed extends org.telegram.ui.Components.xu0 {
    public final /* synthetic */ int s0;
    public boolean t0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed(int i9, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.s0 = i9;
        this.u0 = o2Var;
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
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.ut utVar;
        int measuredHeight;
        int measuredHeight2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        org.telegram.ui.Components.ut utVar2;
        int measuredHeight3;
        int measuredHeight4;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        org.telegram.ui.Components.ut utVar3;
        int measuredHeight5;
        int measuredHeight6;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        org.telegram.ui.Components.wy wyVar;
        int measuredHeight7;
        int measuredHeight8;
        switch (this.s0) {
            case 0:
                id idVar = (id) this.u0;
                int childCount = getChildCount();
                int R = R();
                int emojiPadding = (R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : idVar.c.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i37 = 0; i37 < childCount; i37++) {
                    View childAt = getChildAt(i37);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight9 = childAt.getMeasuredHeight();
                        int i38 = layoutParams.gravity;
                        if (i38 == -1) {
                            i38 = 51;
                        }
                        int i39 = i38 & 112;
                        int i40 = i38 & 7;
                        if (i40 == 1) {
                            i13 = (((i11 - i9) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i14 = layoutParams.rightMargin;
                        } else if (i40 != 5) {
                            i15 = layoutParams.leftMargin;
                            if (i39 == 16) {
                                if (i39 == 48) {
                                    i18 = layoutParams.topMargin + getPaddingTop();
                                } else if (i39 != 80) {
                                    i18 = layoutParams.topMargin;
                                } else {
                                    i16 = ((i12 - emojiPadding) - i10) - measuredHeight9;
                                    i17 = layoutParams.bottomMargin;
                                }
                                utVar = idVar.c;
                                if (utVar != null && utVar.l(childAt)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight = getMeasuredHeight() + R;
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    } else {
                                        measuredHeight = getMeasuredHeight();
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                    i18 = measuredHeight - measuredHeight2;
                                }
                                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight9 + i18);
                            } else {
                                i16 = ((((i12 - emojiPadding) - i10) - measuredHeight9) / 2) + layoutParams.topMargin;
                                i17 = layoutParams.bottomMargin;
                            }
                            i18 = i16 - i17;
                            utVar = idVar.c;
                            if (utVar != null) {
                                if (AndroidUtilities.isTablet()) {
                                }
                                i18 = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(i15, i18, measuredWidth + i15, measuredHeight9 + i18);
                        } else {
                            i13 = i11 - measuredWidth;
                            i14 = layoutParams.rightMargin;
                        }
                        i15 = i13 - i14;
                        if (i39 == 16) {
                        }
                        i18 = i16 - i17;
                        utVar = idVar.c;
                        if (utVar != null) {
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight9 + i18);
                    }
                }
                S();
                break;
            case 1:
                ho hoVar = (ho) this.u0;
                int childCount2 = getChildCount();
                int R2 = R();
                int emojiPadding2 = (R2 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : hoVar.v.getEmojiPadding();
                setBottomClip(emojiPadding2);
                for (int i41 = 0; i41 < childCount2; i41++) {
                    View childAt2 = getChildAt(i41);
                    if (childAt2.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight10 = childAt2.getMeasuredHeight();
                        int i42 = layoutParams2.gravity;
                        if (i42 == -1) {
                            i42 = 51;
                        }
                        int i43 = i42 & 112;
                        int i44 = i42 & 7;
                        if (i44 == 1) {
                            i19 = (((i11 - i9) - measuredWidth2) / 2) + layoutParams2.leftMargin;
                            i20 = layoutParams2.rightMargin;
                        } else if (i44 != 5) {
                            i21 = layoutParams2.leftMargin;
                            if (i43 == 16) {
                                if (i43 == 48) {
                                    i24 = layoutParams2.topMargin + getPaddingTop();
                                } else if (i43 != 80) {
                                    i24 = layoutParams2.topMargin;
                                } else {
                                    i22 = ((i12 - emojiPadding2) - i10) - measuredHeight10;
                                    i23 = layoutParams2.bottomMargin;
                                }
                                utVar2 = hoVar.v;
                                if (utVar2 != null && utVar2.l(childAt2)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight3 = getMeasuredHeight() + R2;
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    } else {
                                        measuredHeight3 = getMeasuredHeight();
                                        measuredHeight4 = childAt2.getMeasuredHeight();
                                    }
                                    i24 = measuredHeight3 - measuredHeight4;
                                }
                                childAt2.layout(i21, i24, measuredWidth2 + i21, measuredHeight10 + i24);
                            } else {
                                i22 = ((((i12 - emojiPadding2) - i10) - measuredHeight10) / 2) + layoutParams2.topMargin;
                                i23 = layoutParams2.bottomMargin;
                            }
                            i24 = i22 - i23;
                            utVar2 = hoVar.v;
                            if (utVar2 != null) {
                                if (AndroidUtilities.isTablet()) {
                                }
                                i24 = measuredHeight3 - measuredHeight4;
                            }
                            childAt2.layout(i21, i24, measuredWidth2 + i21, measuredHeight10 + i24);
                        } else {
                            i19 = i11 - measuredWidth2;
                            i20 = layoutParams2.rightMargin;
                        }
                        i21 = i19 - i20;
                        if (i43 == 16) {
                        }
                        i24 = i22 - i23;
                        utVar2 = hoVar.v;
                        if (utVar2 != null) {
                        }
                        childAt2.layout(i21, i24, measuredWidth2 + i21, measuredHeight10 + i24);
                    }
                }
                S();
                break;
            case 2:
                r60 r60Var = (r60) this.u0;
                int childCount3 = getChildCount();
                int R3 = R();
                int emojiPadding3 = (R3 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : r60Var.c.getEmojiPadding();
                setBottomClip(emojiPadding3);
                for (int i45 = 0; i45 < childCount3; i45++) {
                    View childAt3 = getChildAt(i45);
                    if (childAt3.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) childAt3.getLayoutParams();
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight11 = childAt3.getMeasuredHeight();
                        int i46 = layoutParams3.gravity;
                        if (i46 == -1) {
                            i46 = 51;
                        }
                        int i47 = i46 & 112;
                        int i48 = i46 & 7;
                        if (i48 == 1) {
                            i25 = (((i11 - i9) - measuredWidth3) / 2) + layoutParams3.leftMargin;
                            i26 = layoutParams3.rightMargin;
                        } else if (i48 != 5) {
                            i27 = layoutParams3.leftMargin;
                            if (i47 == 16) {
                                if (i47 == 48) {
                                    i30 = layoutParams3.topMargin + getPaddingTop();
                                } else if (i47 != 80) {
                                    i30 = layoutParams3.topMargin;
                                } else {
                                    i28 = ((i12 - emojiPadding3) - i10) - measuredHeight11;
                                    i29 = layoutParams3.bottomMargin;
                                }
                                utVar3 = r60Var.c;
                                if (utVar3 != null && utVar3.l(childAt3)) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight5 = getMeasuredHeight() + R3;
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    } else {
                                        measuredHeight5 = getMeasuredHeight();
                                        measuredHeight6 = childAt3.getMeasuredHeight();
                                    }
                                    i30 = measuredHeight5 - measuredHeight6;
                                }
                                childAt3.layout(i27, i30, measuredWidth3 + i27, measuredHeight11 + i30);
                            } else {
                                i28 = ((((i12 - emojiPadding3) - i10) - measuredHeight11) / 2) + layoutParams3.topMargin;
                                i29 = layoutParams3.bottomMargin;
                            }
                            i30 = i28 - i29;
                            utVar3 = r60Var.c;
                            if (utVar3 != null) {
                                if (AndroidUtilities.isTablet()) {
                                }
                                i30 = measuredHeight5 - measuredHeight6;
                            }
                            childAt3.layout(i27, i30, measuredWidth3 + i27, measuredHeight11 + i30);
                        } else {
                            i25 = i11 - measuredWidth3;
                            i26 = layoutParams3.rightMargin;
                        }
                        i27 = i25 - i26;
                        if (i47 == 16) {
                        }
                        i30 = i28 - i29;
                        utVar3 = r60Var.c;
                        if (utVar3 != null) {
                        }
                        childAt3.layout(i27, i30, measuredWidth3 + i27, measuredHeight11 + i30);
                    }
                }
                S();
                break;
            default:
                xu0 xu0Var = (xu0) this.u0;
                int childCount4 = getChildCount();
                int R4 = R();
                int i49 = (R4 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : xu0Var.R;
                setBottomClip(i49);
                for (int i50 = 0; i50 < childCount4; i50++) {
                    View childAt4 = getChildAt(i50);
                    if (childAt4.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) childAt4.getLayoutParams();
                        int measuredWidth4 = childAt4.getMeasuredWidth();
                        int measuredHeight12 = childAt4.getMeasuredHeight();
                        int i51 = layoutParams4.gravity;
                        if (i51 == -1) {
                            i51 = 51;
                        }
                        int i52 = i51 & 112;
                        int i53 = i51 & 7;
                        if (i53 == 1) {
                            i31 = (((i11 - i9) - measuredWidth4) / 2) + layoutParams4.leftMargin;
                            i32 = layoutParams4.rightMargin;
                        } else if (i53 != 5) {
                            i33 = layoutParams4.leftMargin;
                            if (i52 == 16) {
                                if (i52 == 48) {
                                    i36 = layoutParams4.topMargin + getPaddingTop();
                                } else if (i52 != 80) {
                                    i36 = layoutParams4.topMargin;
                                } else {
                                    i34 = ((i12 - i49) - i10) - measuredHeight12;
                                    i35 = layoutParams4.bottomMargin;
                                }
                                wyVar = xu0Var.N;
                                if (wyVar != null && wyVar == childAt4) {
                                    if (AndroidUtilities.isTablet()) {
                                        measuredHeight7 = getMeasuredHeight() + R4;
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    } else {
                                        measuredHeight7 = getMeasuredHeight();
                                        measuredHeight8 = childAt4.getMeasuredHeight();
                                    }
                                    i36 = measuredHeight7 - measuredHeight8;
                                }
                                childAt4.layout(i33, i36, measuredWidth4 + i33, measuredHeight12 + i36);
                            } else {
                                i34 = ((((i12 - i49) - i10) - measuredHeight12) / 2) + layoutParams4.topMargin;
                                i35 = layoutParams4.bottomMargin;
                            }
                            i36 = i34 - i35;
                            wyVar = xu0Var.N;
                            if (wyVar != null) {
                                if (AndroidUtilities.isTablet()) {
                                }
                                i36 = measuredHeight7 - measuredHeight8;
                            }
                            childAt4.layout(i33, i36, measuredWidth4 + i33, measuredHeight12 + i36);
                        } else {
                            i31 = i11 - measuredWidth4;
                            i32 = layoutParams4.rightMargin;
                        }
                        i33 = i31 - i32;
                        if (i52 == 16) {
                        }
                        i36 = i34 - i35;
                        wyVar = xu0Var.N;
                        if (wyVar != null) {
                        }
                        childAt4.layout(i33, i36, measuredWidth4 + i33, measuredHeight12 + i36);
                    }
                }
                S();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        switch (this.s0) {
            case 0:
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                int paddingTop = size2 - getPaddingTop();
                id idVar = (id) this.u0;
                kVar = ((org.telegram.ui.ActionBar.o2) idVar).actionBar;
                measureChildWithMargins(kVar, i9, 0, i10, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.t0 = true;
                    idVar.c.j();
                    this.t0 = false;
                }
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt != null && childAt.getVisibility() != 8) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) idVar).actionBar;
                        if (childAt != kVar2) {
                            org.telegram.ui.Components.ut utVar = idVar.c;
                            if (utVar == null || !utVar.l(childAt)) {
                                measureChildWithMargins(childAt, i9, 0, i10, 0);
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
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size3, size4);
                int paddingTop2 = size4 - getPaddingTop();
                ho hoVar = (ho) this.u0;
                kVar3 = ((org.telegram.ui.ActionBar.o2) hoVar).actionBar;
                measureChildWithMargins(kVar3, i9, 0, i10, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    this.t0 = true;
                    hoVar.v.j();
                    this.t0 = false;
                }
                int childCount2 = getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2 != null && childAt2.getVisibility() != 8) {
                        kVar4 = ((org.telegram.ui.ActionBar.o2) hoVar).actionBar;
                        if (childAt2 != kVar4) {
                            org.telegram.ui.Components.ut utVar2 = hoVar.v;
                            if (utVar2 == null || !utVar2.l(childAt2)) {
                                measureChildWithMargins(childAt2, i9, 0, i10, 0);
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
                int size5 = View.MeasureSpec.getSize(i9);
                int size6 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size5, size6);
                int paddingTop3 = size6 - getPaddingTop();
                r60 r60Var = (r60) this.u0;
                kVar5 = ((org.telegram.ui.ActionBar.o2) r60Var).actionBar;
                measureChildWithMargins(kVar5, i9, 0, i10, 0);
                if (R() > AndroidUtilities.dp(20.0f)) {
                    org.telegram.ui.Components.ut utVar3 = r60Var.c;
                    if (!utVar3.e) {
                        this.t0 = true;
                        utVar3.j();
                        this.t0 = false;
                    }
                }
                int childCount3 = getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    if (childAt3 != null && childAt3.getVisibility() != 8) {
                        kVar6 = ((org.telegram.ui.ActionBar.o2) r60Var).actionBar;
                        if (childAt3 != kVar6) {
                            org.telegram.ui.Components.ut utVar4 = r60Var.c;
                            if (utVar4 == null || !utVar4.l(childAt3)) {
                                measureChildWithMargins(childAt3, i9, 0, i10, 0);
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
                int size7 = View.MeasureSpec.getSize(i9);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                int paddingTop4 = size8 - getPaddingTop();
                xu0 xu0Var = (xu0) this.u0;
                kVar7 = ((org.telegram.ui.ActionBar.o2) xu0Var).actionBar;
                measureChildWithMargins(kVar7, i9, 0, i10, 0);
                int R = R();
                if (R > AndroidUtilities.dp(20.0f) && !xu0Var.L && !xu0Var.x0) {
                    this.t0 = true;
                    xu0Var.k0();
                    this.t0 = false;
                }
                int i14 = (R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : xu0Var.R;
                if (R > AndroidUtilities.dp(20.0f) && xu0Var.x0) {
                    i14 = AndroidUtilities.dp(120.0f);
                }
                int i15 = i14;
                int childCount4 = getChildCount();
                for (int i16 = 0; i16 < childCount4; i16++) {
                    View childAt4 = getChildAt(i16);
                    if (childAt4 != null && childAt4.getVisibility() != 8) {
                        kVar8 = ((org.telegram.ui.ActionBar.o2) xu0Var).actionBar;
                        if (childAt4 != kVar8) {
                            org.telegram.ui.Components.wy wyVar = xu0Var.N;
                            if (wyVar == null || wyVar != childAt4) {
                                if (xu0Var.c == childAt4) {
                                    childAt4.measure(i9, View.MeasureSpec.makeMeasureSpec(paddingTop4 - i15, TLObject.FLAG_30));
                                } else {
                                    measureChildWithMargins(childAt4, i9, 0, i10, 0);
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
        switch (this.s0) {
            case 0:
                if (!this.t0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!this.t0) {
                    super.requestLayout();
                    break;
                }
                break;
            case 2:
                if (!this.t0) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.t0) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }
}
