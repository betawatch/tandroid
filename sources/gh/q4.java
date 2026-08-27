package gh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.fb0;
import org.telegram.ui.ig0;
import org.telegram.ui.j9;
import org.telegram.ui.pn;
import org.telegram.ui.q91;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q4 extends zu0 {
    public final /* synthetic */ int s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4(Object obj, Context context, int i10) {
        super(context, null);
        this.s0 = i10;
        this.t0 = obj;
    }

    @Override // org.telegram.ui.Components.zu0
    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        switch (this.s0) {
            case 1:
                j9 j9Var = (j9) this.t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && j9Var.V != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    j9Var.V.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.q0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    contactsActivity.q0.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                x71 x71Var = (x71) this.t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && x71Var.S != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    x71Var.S.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                q91 q91Var = (q91) this.t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && q91Var.z0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    q91Var.z0.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                super.J(canvas, f10, rect, paint, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public boolean P() {
        switch (this.s0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public boolean Q() {
        switch (this.s0) {
            case 3:
                return false;
            default:
                return super.Q();
        }
    }

    @Override // org.telegram.ui.Components.zu0, org.telegram.ui.ActionBar.x5
    public void d() {
        switch (this.s0) {
            case 8:
                ((x71) this.t0).p0();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.s0) {
            case 1:
                j9 j9Var = (j9) this.t0;
                og.d dVar = j9Var.W;
                og.d dVar2 = j9Var.V;
                jg.e eVar = j9Var.U;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    j9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(j9Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.n) {
                        RecordingCanvas a3 = dVar.a(measuredWidth, measuredHeight);
                        a3.drawColor(j9Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a3, -2);
                        }
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.t0;
                og.d dVar3 = contactsActivity.r0;
                og.d dVar4 = contactsActivity.q0;
                jg.e eVar2 = contactsActivity.p0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.n) {
                        RecordingCanvas a10 = dVar4.a(measuredWidth2, measuredHeight2);
                        a10.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a10, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.n) {
                        RecordingCanvas a11 = dVar3.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                x71 x71Var = (x71) this.t0;
                og.d dVar5 = x71Var.T;
                og.d dVar6 = x71Var.S;
                jg.e eVar3 = x71Var.R;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    x71Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.n) {
                        RecordingCanvas a12 = dVar6.a(measuredWidth3, measuredHeight3);
                        a12.drawColor(x71Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a12, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.n) {
                        RecordingCanvas a13 = dVar5.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(x71Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!x71Var.I) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, x71Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6), x71Var.O);
                    break;
                }
                break;
            case 9:
                q91 q91Var = (q91) this.t0;
                og.d dVar7 = q91Var.A0;
                og.d dVar8 = q91Var.z0;
                jg.e eVar4 = q91Var.y0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    q91.W(q91Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.n) {
                        RecordingCanvas a14 = dVar8.a(measuredWidth4, measuredHeight4);
                        a14.drawColor(q91Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a14, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.n) {
                        RecordingCanvas a15 = dVar7.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(q91Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a15, -2);
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
        switch (this.s0) {
            case 2:
                if (motionEvent.getY() < ((ab0) this.t0).P) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.zu0
    public Drawable getNewDrawable() {
        switch (this.s0) {
            case 2:
                Drawable d = ((pn) ((ab0) this.t0).V.B).d();
                if (d == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.zu0
    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        switch (this.s0) {
            case 3:
                return ((kz0) this.t0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // org.telegram.ui.Components.zu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        switch (this.s0) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                j9 j9Var = (j9) this.t0;
                j9Var.g0();
                j9Var.h0();
                break;
            case 2:
            case 3:
            case 6:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                ContactsActivity contactsActivity = (ContactsActivity) this.t0;
                contactsActivity.h0();
                contactsActivity.k0();
                contactsActivity.m0();
                contactsActivity.i0();
                ContactsActivity.d0(contactsActivity);
                break;
            case 5:
                fb0 fb0Var = (fb0) this.t0;
                int scrollY = fb0Var.F.getScrollY();
                super.onLayout(z10, i10, i11, i12, i13);
                if (scrollY != fb0Var.F.getScrollY()) {
                    fb0Var.F.setTranslationY(r11.getScrollY() - scrollY);
                    fb0Var.F.animate().cancel();
                    fb0Var.F.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                    break;
                }
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.t0;
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
                                } else if (childAt == popupNotificationActivity.b.I1) {
                                    i19 = ((popupNotificationActivity.A.getMeasuredHeight() + popupNotificationActivity.A.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    i16 = ((popupNotificationActivity.A.getMeasuredWidth() + popupNotificationActivity.A.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
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
        switch (this.s0) {
            case 0:
                y5 y5Var = (y5) this.t0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y5Var.y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.n2) y5Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) y5Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar2 = ((org.telegram.ui.ActionBar.n2) y5Var).actionBar;
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) y5Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar3 = ((org.telegram.ui.ActionBar.n2) y5Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (kVar3.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) y5Var.w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar4 = ((org.telegram.ui.ActionBar.n2) y5Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (kVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i10, i11);
                break;
            case 1:
                j9 j9Var = (j9) this.t0;
                kVar5 = ((org.telegram.ui.ActionBar.n2) j9Var).actionBar;
                measureChildWithMargins(kVar5, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) j9Var.I.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.n2) j9Var).actionBar;
                marginLayoutParams.topMargin = kVar6.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) j9Var.b.getLayoutParams();
                kVar7 = ((org.telegram.ui.ActionBar.n2) j9Var).actionBar;
                marginLayoutParams2.topMargin = kVar7.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) j9Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.n2) j9Var).actionBar;
                marginLayoutParams3.topMargin = kVar8.getMeasuredHeight();
                j9Var.i0();
                super.onMeasure(i10, i11);
                break;
            case 2:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((kz0) this.t0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.t0;
                kVar9 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                measureChildWithMargins(kVar9, i10, 0, i11, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams();
                kVar10 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                marginLayoutParams4.topMargin = AndroidUtilities.dp(48.0f) + kVar10.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) contactsActivity.U.getLayoutParams();
                kVar11 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                marginLayoutParams5.topMargin = kVar11.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                break;
            case 5:
                fb0 fb0Var = (fb0) this.t0;
                super.onMeasure(i10, i11);
                R();
                int i12 = this.f;
                if (i12 != 0 && i12 < AndroidUtilities.dp(20.0f)) {
                    fb0Var.B.clearFocus();
                    fb0Var.G.clearFocus();
                }
                fb0Var.D.setVisibility(this.f > AndroidUtilities.dp(20.0f) ? 8 : 0);
                break;
            case 6:
                ig0 ig0Var = (ig0) this.t0;
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) ig0Var.J.getLayoutParams();
                int dp = ig0Var.h1() ? AndroidUtilities.dp(226.0f) : 0;
                if (ig0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    dp -= R();
                }
                ec ecVar = ec.w;
                if (ecVar == null || !ecVar.l) {
                    marginLayoutParams6.bottomMargin = AndroidUtilities.dp(14.0f) + dp;
                } else {
                    super.onMeasure(i10, i11);
                    marginLayoutParams6.bottomMargin = rl.C(10.0f, ec.w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), dp);
                }
                int i13 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) ig0Var.Q.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) ig0Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                ((ViewGroup.MarginLayoutParams) ig0Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                TextView textView = ig0Var.b0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i13;
                }
                if (R() > AndroidUtilities.dp(20.0f) && ig0Var.c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !ig0Var.W) {
                    ValueAnimator valueAnimator = ig0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ig0Var.c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.t0;
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
                        } else if (childAt == popupNotificationActivity.b.I1) {
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
