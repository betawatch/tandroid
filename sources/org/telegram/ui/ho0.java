package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ho0 extends org.telegram.ui.Components.uu0 {
    public int f0;
    public boolean g0;
    public int h0;
    public final /* synthetic */ lo0 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(lo0 lo0Var, Context context) {
        super(context, null);
        this.i0 = lo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
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
        org.telegram.ui.Components.wt wtVar;
        int measuredHeight;
        int measuredHeight2;
        int i20 = this.f0;
        int i21 = i12 - i10;
        lo0 lo0Var = this.i0;
        if (i20 != i21) {
            this.f0 = i21;
            fg.j jVar = lo0Var.L;
            if (jVar != null) {
                jVar.f();
            }
            org.telegram.ui.ActionBar.k1 k1Var = lo0Var.m0;
            if (k1Var != null && k1Var.isShowing()) {
                lo0Var.m0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (lo0Var.d0 == null || lo0Var.Z.getParent() != this || org.telegram.messenger.i0.L(20.0f) < 0 || org.telegram.messenger.i0.E || org.telegram.messenger.i0.Q1()) ? 0 : lo0Var.d0.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i23 = layoutParams.gravity;
                if (i23 == -1) {
                    i23 = 51;
                }
                int i24 = i23 & org.telegram.messenger.zs.x1;
                int i25 = i23 & 7;
                if (i25 == 1) {
                    i14 = ((i21 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i25 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i24 == 16) {
                        if (i24 == 48) {
                            i19 = layoutParams.topMargin + getPaddingTop();
                        } else if (i24 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - emojiPadding) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        wtVar = lo0Var.d0;
                        if (wtVar != null && wtVar.l(childAt)) {
                            if (org.telegram.messenger.i0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - emojiPadding) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    wtVar = lo0Var.d0;
                    if (wtVar != null) {
                        if (org.telegram.messenger.i0.Q1()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (i21 - measuredWidth) - layoutParams.rightMargin;
                    i15 = getPaddingRight();
                }
                i16 = i14 - i15;
                if (i24 == 16) {
                }
                i19 = i17 - i18;
                wtVar = lo0Var.d0;
                if (wtVar != null) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.wt wtVar;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean Q1 = org.telegram.messenger.i0.Q1();
        lo0 lo0Var = this.i0;
        if (Q1) {
            lo0Var.g0 = 4;
        } else {
            Point point = org.telegram.messenger.i0.q;
            if (point.x > point.y) {
                lo0Var.g0 = 4;
            } else {
                lo0Var.g0 = 3;
            }
        }
        this.g0 = true;
        int L = ((size2 - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(4.0f)) / lo0Var.g0;
        lo0Var.R = L;
        if (this.h0 != L) {
            this.h0 = L;
            org.telegram.messenger.i0.g3(new mg0(this, 16));
        }
        if (lo0Var.Y) {
            lo0Var.M.y1(1);
        } else {
            lo0Var.M.y1(Math.max(1, ((lo0Var.g0 - 1) * org.telegram.messenger.i0.L(2.0f)) + (lo0Var.R * lo0Var.g0)));
        }
        this.g0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.i0.L(20.0f) >= 0 && !org.telegram.messenger.i0.E && lo0Var.d0 != null && lo0Var.Z.getParent() == this) {
            size4 -= lo0Var.d0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i12 = size4;
        int i13 = makeMeasureSpec;
        if (Q > org.telegram.messenger.i0.L(20.0f) && (wtVar = lo0Var.d0) != null) {
            this.g0 = true;
            wtVar.j();
            this.g0 = false;
        }
        org.telegram.ui.Components.wt wtVar2 = lo0Var.d0;
        if (wtVar2 != null && wtVar2.e) {
            lo0Var.fragmentView.setTranslationY(0.0f);
            lo0Var.K.setTranslationY(0.0f);
            lo0Var.N.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.wt wtVar3 = lo0Var.d0;
                if (wtVar3 == null || !wtVar3.l(childAt)) {
                    measureChildWithMargins(childAt, i10, 0, i13, 0);
                } else if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.i0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (i12 - org.telegram.messenger.i0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i12 - org.telegram.messenger.i0.m), TLObject.FLAG_30));
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}
