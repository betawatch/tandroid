package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ua extends qv0 {
    public final /* synthetic */ boolean w0;
    public final /* synthetic */ boolean x0;
    public final /* synthetic */ za y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(za zaVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.y0 = zaVar;
        this.w0 = z10;
        this.x0 = z11;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        za zaVar = this.y0;
        zaVar.I(canvas, this);
        super.dispatchDraw(canvas);
        zaVar.H(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            za zaVar = this.y0;
            drawable = ((org.telegram.ui.ActionBar.g3) zaVar).shadowDrawable;
            if (y3 < drawable.getBounds().top) {
                zaVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.x0) {
            this.y0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int measuredHeight;
        int measuredHeight2;
        za zaVar = this.y0;
        if (zaVar.Q == null) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int R = R();
        int paddingBottom = getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.g3) zaVar).keyboardVisible;
        if (!z11 && zaVar.Q != null && R <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            paddingBottom += zaVar.Q.getEmojiPadding();
        }
        setBottomClip(paddingBottom);
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
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
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i19 = layoutParams.topMargin + getPaddingTop();
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - paddingBottom) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt instanceof kz) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + R;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - paddingBottom) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt instanceof kz) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.g3) zaVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (childAt instanceof kz) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        S();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        ju juVar;
        int size = View.MeasureSpec.getSize(i11);
        za zaVar = this.y0;
        zaVar.h = size;
        zaVar.E(i10, i11);
        if (this.w0) {
            i11 = View.MeasureSpec.makeMeasureSpec(zaVar.h, TLObject.FLAG_30);
        }
        if (zaVar.Q == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size2, size3);
        ju juVar2 = zaVar.Q;
        if (juVar2 != null && !juVar2.N && AndroidUtilities.dp(20.0f) >= 0) {
            ju juVar3 = zaVar.Q;
            if (!juVar3.e && !juVar3.O) {
                juVar3.j();
            }
        }
        int i13 = 0;
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.g3) zaVar).keyboardVisible;
            int emojiPadding = (z10 || (juVar = zaVar.Q) == null) ? 0 : juVar.getEmojiPadding();
            if (!AndroidUtilities.isInMultiwindow) {
                size3 -= emojiPadding;
                i11 = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                ju juVar4 = zaVar.Q;
                if (juVar4 == null || !juVar4.l(childAt)) {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, i14, 0);
                    i13++;
                    i10 = i12;
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                }
            }
            i12 = i10;
            i13++;
            i10 = i12;
        }
    }
}
