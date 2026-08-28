package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oa extends xu0 {
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ boolean t0;
    public final /* synthetic */ sa u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(sa saVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.u0 = saVar;
        this.s0 = z10;
        this.t0 = z11;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sa saVar = this.u0;
        saVar.H(canvas, this);
        super.dispatchDraw(canvas);
        saVar.G(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            sa saVar = this.u0;
            drawable = ((org.telegram.ui.ActionBar.f3) saVar).shadowDrawable;
            if (y10 < drawable.getBounds().top) {
                saVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.t0) {
            this.u0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        int measuredHeight2;
        sa saVar = this.u0;
        if (saVar.L == null) {
            super.onLayout(z10, i9, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int R = R();
        int paddingBottom = getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.f3) saVar).keyboardVisible;
        if (!z11 && saVar.L != null && R <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            paddingBottom += saVar.L.getEmojiPadding();
        }
        setBottomClip(paddingBottom);
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
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
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i21 == 16) {
                        if (i21 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                        } else if (i21 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - paddingBottom) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt instanceof wy) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + R;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - paddingBottom) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt instanceof wy) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (((i11 - i9) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = ((org.telegram.ui.ActionBar.f3) saVar).backgroundPaddingLeft;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (childAt instanceof wy) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        S();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        boolean z10;
        ut utVar;
        int size = View.MeasureSpec.getSize(i10);
        sa saVar = this.u0;
        saVar.h = size;
        saVar.D(i9, i10);
        if (this.s0) {
            i10 = View.MeasureSpec.makeMeasureSpec(saVar.h, TLObject.FLAG_30);
        }
        if (saVar.L == null) {
            super.onMeasure(i9, i10);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i9);
        int size3 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size2, size3);
        ut utVar2 = saVar.L;
        if (utVar2 != null && !utVar2.J && AndroidUtilities.dp(20.0f) >= 0) {
            ut utVar3 = saVar.L;
            if (!utVar3.e && !utVar3.K) {
                utVar3.j();
            }
        }
        int i12 = 0;
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.f3) saVar).keyboardVisible;
            int emojiPadding = (z10 || (utVar = saVar.L) == null) ? 0 : utVar.getEmojiPadding();
            if (!AndroidUtilities.isInMultiwindow) {
                size3 -= emojiPadding;
                i10 = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
        }
        int i13 = i10;
        int childCount = getChildCount();
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                ut utVar4 = saVar.L;
                if (utVar4 == null || !utVar4.l(childAt)) {
                    i11 = i9;
                    measureChildWithMargins(childAt, i11, 0, i13, 0);
                    i12++;
                    i9 = i11;
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                }
            }
            i11 = i9;
            i12++;
            i9 = i11;
        }
    }
}
