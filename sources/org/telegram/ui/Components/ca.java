package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ca extends uu0 {
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ ha h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(ha haVar, Context context, boolean z10, boolean z11) {
        super(context, null);
        this.h0 = haVar;
        this.f0 = z10;
        this.g0 = z11;
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ha haVar = this.h0;
        haVar.W0(canvas, this);
        super.dispatchDraw(canvas);
        haVar.V0(canvas, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            ha haVar = this.h0;
            if (y3 < haVar.r0.getBounds().top) {
                haVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.g0) {
            this.h0.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    @Override // org.telegram.ui.Components.uu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        int measuredHeight;
        int measuredHeight2;
        ha haVar = this.h0;
        if (haVar.H1 == null) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int Q = Q();
        int paddingBottom = getPaddingBottom();
        if (!haVar.d && haVar.H1 != null && Q <= org.telegram.messenger.i0.L(20.0f) && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            paddingBottom += haVar.H1.getEmojiPadding();
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
                int i22 = i21 & org.telegram.messenger.zs.x1;
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
                        if (childAt instanceof vy) {
                            if (org.telegram.messenger.i0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + Q;
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
                    if (childAt instanceof vy) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = haVar.t0;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (childAt instanceof vy) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        wt wtVar;
        int size = View.MeasureSpec.getSize(i11);
        ha haVar = this.h0;
        haVar.n1 = size;
        haVar.S0(i10, i11);
        if (this.f0) {
            i11 = View.MeasureSpec.makeMeasureSpec(haVar.n1, TLObject.FLAG_30);
        }
        if (haVar.H1 == null) {
            super.onMeasure(i10, i11);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size2, size3);
        wt wtVar2 = haVar.H1;
        if (wtVar2 != null && !wtVar2.N && org.telegram.messenger.i0.L(20.0f) >= 0) {
            wt wtVar3 = haVar.H1;
            if (!wtVar3.e && !wtVar3.O) {
                wtVar3.j();
            }
        }
        int i13 = 0;
        if (org.telegram.messenger.i0.L(20.0f) >= 0) {
            int emojiPadding = (haVar.d || (wtVar = haVar.H1) == null) ? 0 : wtVar.getEmojiPadding();
            if (!org.telegram.messenger.i0.E) {
                size3 -= emojiPadding;
                i11 = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
        }
        int i14 = i11;
        int childCount = getChildCount();
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                wt wtVar4 = haVar.H1;
                if (wtVar4 == null || !wtVar4.l(childAt)) {
                    i12 = i10;
                    measureChildWithMargins(childAt, i12, 0, i14, 0);
                    i13++;
                    i10 = i12;
                } else if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (size3 - org.telegram.messenger.i0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size3 - org.telegram.messenger.i0.m), TLObject.FLAG_30));
                }
            }
            i12 = i10;
            i13++;
            i10 = i12;
        }
    }
}
