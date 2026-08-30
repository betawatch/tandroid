package kh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ga1;
import org.telegram.ui.l9;
import org.telegram.ui.nb0;
import org.telegram.ui.ng0;
import org.telegram.ui.o81;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j4 extends qv0 {
    public final /* synthetic */ int t0;
    public final /* synthetic */ Object u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(Object obj, Context context, int i10) {
        super(context, null);
        this.t0 = i10;
        this.u0 = obj;
    }

    @Override // org.telegram.ui.Components.qv0
    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
        switch (this.t0) {
            case 1:
                l9 l9Var = (l9) this.u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && l9Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    l9Var.W.X(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    break;
                } else {
                    canvas.drawRect(rect, paint);
                    break;
                }
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.r0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    contactsActivity.r0.X(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha2 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha2);
                    break;
                } else {
                    canvas.drawRect(rect, paint);
                    break;
                }
            case 8:
                o81 o81Var = (o81) this.u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && o81Var.T != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    o81Var.T.X(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha3 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha3);
                    break;
                } else {
                    canvas.drawRect(rect, paint);
                    break;
                }
            case 9:
                ga1 ga1Var = (ga1) this.u0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && ga1Var.A0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    ga1Var.A0.X(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
                    canvas.restore();
                    int alpha4 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha4);
                    break;
                } else {
                    canvas.drawRect(rect, paint);
                    break;
                }
            default:
                super.J(canvas, f10, rect, paint, z4);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public boolean P() {
        switch (this.t0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public boolean Q() {
        switch (this.t0) {
            case 3:
                return false;
            default:
                return super.Q();
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.t0) {
            case 1:
                l9 l9Var = (l9) this.u0;
                sg.d dVar = l9Var.X;
                sg.d dVar2 = l9Var.W;
                ng.e eVar = l9Var.V;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    l9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(l9Var.getThemedColor(j6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(l9Var.getThemedColor(j6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a10, -2);
                        }
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.u0;
                sg.d dVar3 = contactsActivity.s0;
                sg.d dVar4 = contactsActivity.r0;
                ng.e eVar2 = contactsActivity.q0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a12, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                o81 o81Var = (o81) this.u0;
                sg.d dVar5 = o81Var.U;
                sg.d dVar6 = o81Var.T;
                ng.e eVar3 = o81Var.S;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    o81Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(o81Var.getThemedColor(j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(o81Var.getThemedColor(j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a14, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!o81Var.J) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, o81Var.getThemedColor(j6.d6), o81Var.P);
                    break;
                }
                break;
            case 9:
                ga1 ga1Var = (ga1) this.u0;
                sg.d dVar7 = ga1Var.B0;
                sg.d dVar8 = ga1Var.A0;
                ng.e eVar4 = ga1Var.z0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    ga1.W(ga1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(ga1Var.getThemedColor(j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a15, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(ga1Var.getThemedColor(j6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a16, -2);
                        }
                        dVar7.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.t0) {
            case 2:
                if (motionEvent.getY() < ((qb0) this.u0).Q) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.qv0, org.telegram.ui.ActionBar.a6
    public void e() {
        switch (this.t0) {
            case 8:
                ((o81) this.u0).p0();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public Drawable getNewDrawable() {
        switch (this.t0) {
            case 2:
                Drawable d = ((vn) ((qb0) this.u0).W.C).d();
                if (d == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.qv0
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.t0) {
            case 3:
                return ((f01) this.u0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        switch (this.t0) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                l9 l9Var = (l9) this.u0;
                l9Var.g0();
                l9Var.h0();
                break;
            case 2:
            case 3:
            case 6:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
            case 4:
                super.onLayout(z4, i10, i11, i12, i13);
                ContactsActivity contactsActivity = (ContactsActivity) this.u0;
                contactsActivity.h0();
                contactsActivity.k0();
                contactsActivity.m0();
                contactsActivity.i0();
                ContactsActivity.d0(contactsActivity);
                break;
            case 5:
                nb0 nb0Var = (nb0) this.u0;
                int scrollY = nb0Var.G.getScrollY();
                super.onLayout(z4, i10, i11, i12, i13);
                if (scrollY != nb0Var.G.getScrollY()) {
                    nb0Var.G.setTranslationY(r11.getScrollY() - scrollY);
                    nb0Var.G.animate().cancel();
                    nb0Var.G.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.w).start();
                    break;
                }
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.u0;
                int childCount = getChildCount();
                int emojiPadding = R() <= AndroidUtilities.dp(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
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
                                if (popupNotificationActivity.b.u0(childAt)) {
                                    int measuredHeight2 = getMeasuredHeight();
                                    if (emojiPadding != 0) {
                                        measuredHeight2 -= emojiPadding;
                                    }
                                    i19 = measuredHeight2;
                                } else if (childAt == popupNotificationActivity.b.J1) {
                                    i19 = ((popupNotificationActivity.B.getMeasuredHeight() + popupNotificationActivity.B.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    i16 = ((popupNotificationActivity.B.getMeasuredWidth() + popupNotificationActivity.B.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                }
                                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                            } else {
                                i17 = ((i13 - emojiPadding) - i11) - measuredHeight;
                                i18 = layoutParams.bottomMargin;
                            }
                            i19 = i17 - i18;
                            if (popupNotificationActivity.b.u0(childAt)) {
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
                        if (popupNotificationActivity.b.u0(childAt)) {
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    }
                }
                S();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        org.telegram.ui.ActionBar.k kVar8;
        org.telegram.ui.ActionBar.k kVar9;
        org.telegram.ui.ActionBar.k kVar10;
        org.telegram.ui.ActionBar.k kVar11;
        switch (this.t0) {
            case 0:
                r5 r5Var = (r5) this.u0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r5Var.y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.p2) r5Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r5Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar2 = ((org.telegram.ui.ActionBar.p2) r5Var).actionBar;
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) r5Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar3 = ((org.telegram.ui.ActionBar.p2) r5Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (kVar3.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) r5Var.w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar4 = ((org.telegram.ui.ActionBar.p2) r5Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (kVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i10, i11);
                break;
            case 1:
                l9 l9Var = (l9) this.u0;
                kVar5 = ((org.telegram.ui.ActionBar.p2) l9Var).actionBar;
                measureChildWithMargins(kVar5, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l9Var.J.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.p2) l9Var).actionBar;
                marginLayoutParams.topMargin = kVar6.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) l9Var.b.getLayoutParams();
                kVar7 = ((org.telegram.ui.ActionBar.p2) l9Var).actionBar;
                marginLayoutParams2.topMargin = kVar7.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) l9Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.p2) l9Var).actionBar;
                marginLayoutParams3.topMargin = kVar8.getMeasuredHeight();
                l9Var.i0();
                super.onMeasure(i10, i11);
                break;
            case 2:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((f01) this.u0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.u0;
                kVar9 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                measureChildWithMargins(kVar9, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams();
                kVar10 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                marginLayoutParams4.topMargin = AndroidUtilities.dp(48.0f) + kVar10.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) contactsActivity.V.getLayoutParams();
                kVar11 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                marginLayoutParams5.topMargin = kVar11.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                break;
            case 5:
                nb0 nb0Var = (nb0) this.u0;
                super.onMeasure(i10, i11);
                R();
                int i12 = this.f;
                if (i12 != 0 && i12 < AndroidUtilities.dp(20.0f)) {
                    nb0Var.C.clearFocus();
                    nb0Var.H.clearFocus();
                }
                nb0Var.E.setVisibility(this.f > AndroidUtilities.dp(20.0f) ? 8 : 0);
                break;
            case 6:
                ng0 ng0Var = (ng0) this.u0;
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) ng0Var.K.getLayoutParams();
                int dp = ng0Var.h1() ? AndroidUtilities.dp(226.0f) : 0;
                if (ng0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    dp -= R();
                }
                ic icVar = ic.w;
                if (icVar == null || !icVar.l) {
                    marginLayoutParams6.bottomMargin = AndroidUtilities.dp(14.0f) + dp;
                } else {
                    super.onMeasure(i10, i11);
                    marginLayoutParams6.bottomMargin = org.telegram.ui.b.C(10.0f, ic.w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), dp);
                }
                int i13 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) ng0Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) ng0Var.T.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) ng0Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                TextView textView = ng0Var.c0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                }
                if (R() > AndroidUtilities.dp(20.0f) && ng0Var.c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !ng0Var.X) {
                    ValueAnimator valueAnimator = ng0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ng0Var.c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.u0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i14 = size2;
                int childCount = getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.J1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i14), TLObject.FLAG_30));
                        }
                    }
                }
                break;
        }
    }
}
