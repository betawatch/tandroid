package fh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.bb0;
import org.telegram.ui.fg0;
import org.telegram.ui.i9;
import org.telegram.ui.on;
import org.telegram.ui.s91;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x4 extends xu0 {
    public final /* synthetic */ int s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4(Object obj, Context context, int i9) {
        super(context, null);
        this.s0 = i9;
        this.t0 = obj;
    }

    @Override // org.telegram.ui.Components.xu0
    public void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z10) {
        switch (this.s0) {
            case 1:
                i9 i9Var = (i9) this.t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && i9Var.V != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    i9Var.V.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                z71 z71Var = (z71) this.t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && z71Var.S != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    z71Var.S.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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
                s91 s91Var = (s91) this.t0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && s91Var.z0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f10);
                    s91Var.z0.T0(canvas, rect.left, rect.top + f10, rect.right, rect.bottom + f10);
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

    @Override // org.telegram.ui.Components.xu0
    public boolean P() {
        switch (this.s0) {
            case 3:
                return false;
            default:
                return super.P();
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public boolean Q() {
        switch (this.s0) {
            case 3:
                return false;
            default:
                return super.Q();
        }
    }

    @Override // org.telegram.ui.Components.xu0, org.telegram.ui.ActionBar.w5
    public void d() {
        switch (this.s0) {
            case 8:
                ((z71) this.t0).o0();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.s0) {
            case 1:
                i9 i9Var = (i9) this.t0;
                ng.d dVar = i9Var.W;
                ng.d dVar2 = i9Var.V;
                ig.e eVar = i9Var.U;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    i9Var.e0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(i9Var.getThemedColor(org.telegram.ui.ActionBar.f6.a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.n) {
                        RecordingCanvas a3 = dVar.a(measuredWidth, measuredHeight);
                        a3.drawColor(i9Var.getThemedColor(org.telegram.ui.ActionBar.f6.a7));
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
                ng.d dVar3 = contactsActivity.r0;
                ng.d dVar4 = contactsActivity.q0;
                ig.e eVar2 = contactsActivity.p0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.n) {
                        RecordingCanvas a10 = dVar4.a(measuredWidth2, measuredHeight2);
                        a10.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a10, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.n) {
                        RecordingCanvas a11 = dVar3.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 8:
                z71 z71Var = (z71) this.t0;
                ng.d dVar5 = z71Var.T;
                ng.d dVar6 = z71Var.S;
                ig.e eVar3 = z71Var.R;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    z71Var.h0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.n) {
                        RecordingCanvas a12 = dVar6.a(measuredWidth3, measuredHeight3);
                        a12.drawColor(z71Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a12, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.n) {
                        RecordingCanvas a13 = dVar5.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(z71Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!z71Var.I) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, z71Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6), z71Var.O);
                    break;
                }
                break;
            case 9:
                s91 s91Var = (s91) this.t0;
                ng.d dVar7 = s91Var.A0;
                ng.d dVar8 = s91Var.z0;
                ig.e eVar4 = s91Var.y0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    s91.V(s91Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.n) {
                        RecordingCanvas a14 = dVar8.a(measuredWidth4, measuredHeight4);
                        a14.drawColor(s91Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a14, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.n) {
                        RecordingCanvas a15 = dVar7.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(s91Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
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
                if (motionEvent.getY() < ((wa0) this.t0).P) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.xu0
    public Drawable getNewDrawable() {
        switch (this.s0) {
            case 2:
                Drawable d = ((on) ((wa0) this.t0).V.B).d();
                if (d == null) {
                    break;
                }
                break;
        }
        return super.getNewDrawable();
    }

    @Override // org.telegram.ui.Components.xu0
    public org.telegram.ui.ActionBar.b6 getResourceProvider() {
        switch (this.s0) {
            case 3:
                return ((iz0) this.t0).c;
            default:
                return super.getResourceProvider();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        switch (this.s0) {
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                i9 i9Var = (i9) this.t0;
                i9Var.f0();
                i9Var.g0();
                break;
            case 2:
            case 3:
            case 6:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
            case 4:
                super.onLayout(z10, i9, i10, i11, i12);
                ContactsActivity contactsActivity = (ContactsActivity) this.t0;
                contactsActivity.g0();
                contactsActivity.j0();
                contactsActivity.l0();
                contactsActivity.h0();
                ContactsActivity.c0(contactsActivity);
                break;
            case 5:
                bb0 bb0Var = (bb0) this.t0;
                int scrollY = bb0Var.F.getScrollY();
                super.onLayout(z10, i9, i10, i11, i12);
                if (scrollY != bb0Var.F.getScrollY()) {
                    bb0Var.F.setTranslationY(r11.getScrollY() - scrollY);
                    bb0Var.F.animate().cancel();
                    bb0Var.F.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                    break;
                }
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.t0;
                int childCount = getChildCount();
                int emojiPadding = R() <= AndroidUtilities.dp(20.0f) ? popupNotificationActivity.b.getEmojiPadding() : 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = getChildAt(i19);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i20 = layoutParams.gravity;
                        if (i20 == -1) {
                            i20 = 51;
                        }
                        int i21 = i20 & 112;
                        int i22 = i20 & 7;
                        if (i22 == 1) {
                            i13 = (((i11 - i9) - measuredWidth) / 2) + layoutParams.leftMargin;
                            i14 = layoutParams.rightMargin;
                        } else if (i22 != 5) {
                            i15 = layoutParams.leftMargin;
                            if (i21 != 16) {
                                i16 = ((((i12 - emojiPadding) - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                                i17 = layoutParams.bottomMargin;
                            } else if (i21 != 80) {
                                i18 = layoutParams.topMargin;
                                if (popupNotificationActivity.b.t0(childAt)) {
                                    int measuredHeight2 = getMeasuredHeight();
                                    if (emojiPadding != 0) {
                                        measuredHeight2 -= emojiPadding;
                                    }
                                    i18 = measuredHeight2;
                                } else if (childAt == popupNotificationActivity.b.I1) {
                                    i18 = ((popupNotificationActivity.A.getMeasuredHeight() + popupNotificationActivity.A.getTop()) - childAt.getMeasuredHeight()) - layoutParams.bottomMargin;
                                    i15 = ((popupNotificationActivity.A.getMeasuredWidth() + popupNotificationActivity.A.getLeft()) - childAt.getMeasuredWidth()) - layoutParams.rightMargin;
                                }
                                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                            } else {
                                i16 = ((i12 - emojiPadding) - i10) - measuredHeight;
                                i17 = layoutParams.bottomMargin;
                            }
                            i18 = i16 - i17;
                            if (popupNotificationActivity.b.t0(childAt)) {
                            }
                            childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                        } else {
                            i13 = i11 - measuredWidth;
                            i14 = layoutParams.rightMargin;
                        }
                        i15 = i13 - i14;
                        if (i21 != 16) {
                        }
                        i18 = i16 - i17;
                        if (popupNotificationActivity.b.t0(childAt)) {
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    }
                }
                S();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
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
                g6 g6Var = (g6) this.t0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g6Var.y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar = ((org.telegram.ui.ActionBar.o2) g6Var).actionBar;
                layoutParams.topMargin = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g6Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar2 = ((org.telegram.ui.ActionBar.o2) g6Var).actionBar;
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) g6Var.n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar3 = ((org.telegram.ui.ActionBar.o2) g6Var).actionBar;
                layoutParams3.topMargin = currentActionBarHeight3 + (kVar3.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) g6Var.w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                kVar4 = ((org.telegram.ui.ActionBar.o2) g6Var).actionBar;
                layoutParams4.topMargin = currentActionBarHeight4 + (kVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i9, i10);
                break;
            case 1:
                i9 i9Var = (i9) this.t0;
                kVar5 = ((org.telegram.ui.ActionBar.o2) i9Var).actionBar;
                measureChildWithMargins(kVar5, i9, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.I.getLayoutParams();
                kVar6 = ((org.telegram.ui.ActionBar.o2) i9Var).actionBar;
                marginLayoutParams.topMargin = kVar6.getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) i9Var.b.getLayoutParams();
                kVar7 = ((org.telegram.ui.ActionBar.o2) i9Var).actionBar;
                marginLayoutParams2.topMargin = kVar7.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) i9Var.r.getLayoutParams();
                kVar8 = ((org.telegram.ui.ActionBar.o2) i9Var).actionBar;
                marginLayoutParams3.topMargin = kVar8.getMeasuredHeight();
                i9Var.h0();
                super.onMeasure(i9, i10);
                break;
            case 2:
            default:
                super.onMeasure(i9, i10);
                break;
            case 3:
                super.onMeasure(i9, i10);
                setMeasuredDimension(View.MeasureSpec.getSize(i9), ((iz0) this.t0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                break;
            case 4:
                ContactsActivity contactsActivity = (ContactsActivity) this.t0;
                kVar9 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                measureChildWithMargins(kVar9, i9, 0, i10, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams();
                kVar10 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                marginLayoutParams4.topMargin = AndroidUtilities.dp(48.0f) + kVar10.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) contactsActivity.U.getLayoutParams();
                kVar11 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                marginLayoutParams5.topMargin = kVar11.getMeasuredHeight();
                contactsActivity.i0();
                super.onMeasure(i9, i10);
                break;
            case 5:
                bb0 bb0Var = (bb0) this.t0;
                super.onMeasure(i9, i10);
                R();
                int i11 = this.f;
                if (i11 != 0 && i11 < AndroidUtilities.dp(20.0f)) {
                    bb0Var.B.clearFocus();
                    bb0Var.G.clearFocus();
                }
                bb0Var.D.setVisibility(this.f > AndroidUtilities.dp(20.0f) ? 8 : 0);
                break;
            case 6:
                fg0 fg0Var = (fg0) this.t0;
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) fg0Var.J.getLayoutParams();
                int dp = fg0Var.h1() ? AndroidUtilities.dp(226.0f) : 0;
                if (fg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    dp -= R();
                }
                gc gcVar = gc.w;
                if (gcVar == null || !gcVar.l) {
                    marginLayoutParams6.bottomMargin = AndroidUtilities.dp(14.0f) + dp;
                } else {
                    super.onMeasure(i9, i10);
                    marginLayoutParams6.bottomMargin = ll.D(10.0f, gc.w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), dp);
                }
                int i12 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) fg0Var.Q.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i12;
                ((ViewGroup.MarginLayoutParams) fg0Var.S.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i12;
                ((ViewGroup.MarginLayoutParams) fg0Var.R.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i12;
                TextView textView = fg0Var.b0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i12;
                }
                if (R() > AndroidUtilities.dp(20.0f) && fg0Var.c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !fg0Var.W) {
                    ValueAnimator valueAnimator = fg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    fg0Var.c.setVisibility(8);
                }
                super.onMeasure(i9, i10);
                break;
            case 7:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.t0;
                View.MeasureSpec.getMode(i9);
                View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.b.getEmojiPadding();
                }
                int i13 = size2;
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.b.t0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                        } else if (childAt == popupNotificationActivity.b.I1) {
                            measureChildWithMargins(childAt, i9, 0, i10, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i13), TLObject.FLAG_30));
                        }
                    }
                }
                break;
        }
    }
}
