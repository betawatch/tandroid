package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a9 extends org.telegram.ui.Components.vw0 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9(Object obj, Context context, int i10) {
        super(context, null);
        this.l0 = i10;
        this.m0 = obj;
    }

    @Override // org.telegram.ui.Components.vw0
    public boolean O() {
        switch (this.l0) {
            case 2:
                return false;
            default:
                return super.O();
        }
    }

    @Override // org.telegram.ui.Components.vw0
    public boolean P() {
        switch (this.l0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        oi.q qVar;
        switch (this.l0) {
            case 7:
                d81 d81Var = (d81) this.m0;
                d81Var.o0();
                super.dispatchDraw(canvas);
                qVar = ((org.telegram.ui.ActionBar.r2) d81Var).glassEngine;
                qVar.g();
                if (!d81Var.N) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, d81Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6), d81Var.c0);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.l0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.hc0) this.m0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.vw0
    public Drawable getNewDrawable() {
        switch (this.l0) {
            case 1:
                Drawable l4 = ((sn) ((org.telegram.ui.Components.hc0) this.m0).c0.F).l();
                if (l4 == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.vw0
    public org.telegram.ui.ActionBar.u6 getResourceProvider() {
        switch (this.l0) {
            case 2:
                return ((org.telegram.ui.Components.i11) this.m0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // org.telegram.ui.Components.vw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        switch (this.l0) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                ((o9) this.m0).c0();
                break;
            case 1:
            case 2:
            case 5:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                ContactsActivity contactsActivity = (ContactsActivity) this.m0;
                contactsActivity.e0();
                org.telegram.ui.ActionBar.y5 y5Var = contactsActivity.n;
                if (y5Var != null) {
                    os osVar = contactsActivity.b;
                    y5Var.Y((osVar == null || osVar.I) ? false : true, true);
                }
                contactsActivity.f0();
                break;
            case 4:
                db0 db0Var = (db0) this.m0;
                int scrollY = db0Var.J.getScrollY();
                super.onLayout(z10, i10, i11, i12, i13);
                if (scrollY != db0Var.J.getScrollY()) {
                    db0Var.J.setTranslationY(r11.getScrollY() - scrollY);
                    db0Var.J.animate().cancel();
                    db0Var.J.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                    break;
                }
                break;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.m0;
                int childCount = getChildCount();
                int emojiPadding = Q() <= AndroidUtilities.dp(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i21 = layoutParams.gravity;
                        if (i21 == -1) {
                            i21 = 51;
                        }
                        int i22 = i21 & 112;
                        int i23 = i21 & 7;
                        if (i23 == 1) {
                            i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i15 = layoutParams.rightMargin;
                        } else if (i23 != 5) {
                            i16 = layoutParams.leftMargin;
                            if (i22 != 16) {
                                i17 = ((((i13 - emojiPadding) - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                                i18 = layoutParams.bottomMargin;
                            } else if (i22 != 80) {
                                i19 = layoutParams.topMargin;
                                if (popupNotificationActivity.b.r0(childAt)) {
                                    int measuredHeight2 = getMeasuredHeight();
                                    if (emojiPadding != 0) {
                                        measuredHeight2 -= emojiPadding;
                                    }
                                    i19 = measuredHeight2;
                                } else if (childAt == popupNotificationActivity.b.N1) {
                                    i19 = ((popupNotificationActivity.E.getMeasuredHeight() + popupNotificationActivity.E.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    i16 = ((popupNotificationActivity.E.getMeasuredWidth() + popupNotificationActivity.E.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                }
                                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                            } else {
                                i17 = ((i13 - emojiPadding) - i11) - measuredHeight;
                                i18 = layoutParams.bottomMargin;
                            }
                            i19 = i17 - i18;
                            if (popupNotificationActivity.b.r0(childAt)) {
                            }
                            childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                        } else {
                            i14 = i12 - measuredWidth;
                            i15 = layoutParams.rightMargin;
                        }
                        i16 = i14 - i15;
                        if (i22 != 16) {
                        }
                        i19 = i17 - i18;
                        if (popupNotificationActivity.b.r0(childAt)) {
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    }
                }
                R();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        switch (this.l0) {
            case 0:
                ((o9) this.m0).d0();
                super.onMeasure(i10, i11);
                break;
            case 1:
            case 7:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.i11) this.m0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.m0;
                r5Var = ((org.telegram.ui.ActionBar.r2) contactsActivity).simpleActionBar;
                measureChildWithMargins(r5Var, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) contactsActivity.c.getLayoutParams();
                r5Var2 = ((org.telegram.ui.ActionBar.r2) contactsActivity).simpleActionBar;
                marginLayoutParams.topMargin = r5Var2.getMeasuredHeight();
                super.onMeasure(i10, i11);
                break;
            case 4:
                db0 db0Var = (db0) this.m0;
                super.onMeasure(i10, i11);
                Q();
                int i12 = this.f;
                if (i12 != 0 && i12 < AndroidUtilities.dp(20.0f)) {
                    db0Var.F.clearFocus();
                    db0Var.K.clearFocus();
                }
                db0Var.H.setVisibility(this.f > AndroidUtilities.dp(20.0f) ? 8 : 0);
                break;
            case 5:
                gg0 gg0Var = (gg0) this.m0;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) gg0Var.N.getLayoutParams();
                int dp = gg0Var.m1() ? AndroidUtilities.dp(226.0f) : 0;
                if (gg0Var.m1() && Q() > AndroidUtilities.dp(20.0f)) {
                    dp -= Q();
                }
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
                if (qcVar == null || !qcVar.m) {
                    marginLayoutParams2.bottomMargin = AndroidUtilities.dp(14.0f) + dp;
                } else {
                    super.onMeasure(i10, i11);
                    marginLayoutParams2.bottomMargin = d3.w(10.0f, org.telegram.ui.Components.qc.x.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), dp);
                }
                int i13 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) gg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) gg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) gg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                TextView textView = gg0Var.f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                }
                if (Q() > AndroidUtilities.dp(20.0f) && gg0Var.c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !gg0Var.a0) {
                    ValueAnimator valueAnimator = gg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    gg0Var.c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                break;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.m0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (Q() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i14 = size2;
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.r0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.N1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i14), TLObject.FLAG_30));
                        }
                    }
                }
                break;
            case 8:
                zh.h4 h4Var = (zh.h4) this.m0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h4Var.y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.r2) h4Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar2 = ((org.telegram.ui.ActionBar.r2) h4Var).actionBar;
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h4Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar3 = ((org.telegram.ui.ActionBar.r2) h4Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (kVar3.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) h4Var.w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar4 = ((org.telegram.ui.ActionBar.r2) h4Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (kVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.vw0, org.telegram.ui.ActionBar.p6
    public void updateColors() {
        switch (this.l0) {
            case 7:
                try {
                    ((d81) this.m0).p0();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
