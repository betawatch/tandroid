package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ha extends st0 {
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ ma h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(ma maVar, Context context, boolean z9, boolean z10) {
        super(context, null);
        this.h0 = maVar;
        this.f0 = z9;
        this.g0 = z10;
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ma maVar = this.h0;
        maVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        maVar.V0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            ma maVar = this.h0;
            if (y10 < maVar.r0.getBounds().top) {
                maVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.g0) {
            this.h0.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    @Override // org.telegram.ui.Components.st0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        int measuredHeight2;
        ma maVar = this.h0;
        if (maVar.K1 == null) {
            super.onLayout(z9, i7, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int Q = Q();
        int paddingBottom = getPaddingBottom();
        if (!maVar.d && maVar.K1 != null && Q <= org.telegram.messenger.g0.L(20.0f) && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            paddingBottom += maVar.K1.getEmojiPadding();
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
                int i21 = i20 & org.telegram.messenger.qs.x1;
                int i22 = i20 & 7;
                if (i22 == 1) {
                    i13 = (((i11 - i7) - measuredWidth) / 2) + layoutParams.leftMargin;
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
                        if (childAt instanceof gy) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + Q;
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
                    if (childAt instanceof gy) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (((i11 - i7) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = maVar.t0;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (childAt instanceof gy) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        kt ktVar;
        int size = View.MeasureSpec.getSize(i10);
        ma maVar = this.h0;
        maVar.q1 = size;
        maVar.S0(i7, i10);
        if (this.f0) {
            i10 = View.MeasureSpec.makeMeasureSpec(maVar.q1, TLObject.FLAG_30);
        }
        if (maVar.K1 == null) {
            super.onMeasure(i7, i10);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size2, size3);
        kt ktVar2 = maVar.K1;
        if (ktVar2 != null && !ktVar2.N && org.telegram.messenger.g0.L(20.0f) >= 0) {
            kt ktVar3 = maVar.K1;
            if (!ktVar3.e && !ktVar3.O) {
                ktVar3.j();
            }
        }
        int i12 = 0;
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            int emojiPadding = (maVar.d || (ktVar = maVar.K1) == null) ? 0 : ktVar.getEmojiPadding();
            if (!org.telegram.messenger.g0.E) {
                size3 -= emojiPadding;
                i10 = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
        }
        int i13 = i10;
        int childCount = getChildCount();
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kt ktVar4 = maVar.K1;
                if (ktVar4 == null || !ktVar4.l(childAt)) {
                    i11 = i7;
                    measureChildWithMargins(childAt, i11, 0, i13, 0);
                    i12++;
                    i7 = i11;
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (size3 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                }
            }
            i11 = i7;
            i12++;
            i7 = i11;
        }
    }
}
