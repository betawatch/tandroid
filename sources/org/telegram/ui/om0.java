package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class om0 extends org.telegram.ui.Components.qt0 {
    public int g0;
    public boolean h0;
    public int i0;
    public final /* synthetic */ sm0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om0(sm0 sm0Var, Context context) {
        super(context, null);
        this.j0 = sm0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.Components.jt jtVar;
        int measuredHeight;
        int measuredHeight2;
        int i19 = this.g0;
        int i20 = i11 - i3;
        sm0 sm0Var = this.j0;
        if (i19 != i20) {
            this.g0 = i20;
            n4 n4Var = sm0Var.M;
            if (n4Var != null) {
                n4Var.f();
            }
            org.telegram.ui.ActionBar.f1 f1Var = sm0Var.n0;
            if (f1Var != null && f1Var.isShowing()) {
                sm0Var.n0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (sm0Var.e0 == null || sm0Var.a0.getParent() != this || org.telegram.messenger.g0.L(20.0f) < 0 || org.telegram.messenger.g0.E || org.telegram.messenger.g0.Q1()) ? 0 : sm0Var.e0.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & org.telegram.messenger.hs.x1;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i13 = ((i20 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                        } else if (i23 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - emojiPadding) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        jtVar = sm0Var.e0;
                        if (jtVar != null && jtVar.l(childAt)) {
                            if (org.telegram.messenger.g0.Q1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - emojiPadding) - i10) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    jtVar = sm0Var.e0;
                    if (jtVar != null) {
                        if (org.telegram.messenger.g0.Q1()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (i20 - measuredWidth) - layoutParams.rightMargin;
                    i14 = getPaddingRight();
                }
                i15 = i13 - i14;
                if (i23 == 16) {
                }
                i18 = i16 - i17;
                jtVar = sm0Var.e0;
                if (jtVar != null) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.Components.jt jtVar;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i3);
        boolean Q1 = org.telegram.messenger.g0.Q1();
        sm0 sm0Var = this.j0;
        if (Q1) {
            sm0Var.h0 = 4;
        } else {
            Point point = org.telegram.messenger.g0.q;
            if (point.x > point.y) {
                sm0Var.h0 = 4;
            } else {
                sm0Var.h0 = 3;
            }
        }
        this.h0 = true;
        int L = ((size2 - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(4.0f)) / sm0Var.h0;
        sm0Var.S = L;
        if (this.i0 != L) {
            this.i0 = L;
            org.telegram.messenger.g0.h3(new sg0(this, 15));
        }
        if (sm0Var.Z) {
            sm0Var.N.y1(1);
        } else {
            sm0Var.N.y1(Math.max(1, ((sm0Var.h0 - 1) * org.telegram.messenger.g0.L(2.0f)) + (sm0Var.S * sm0Var.h0)));
        }
        this.h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i3);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !org.telegram.messenger.g0.E && sm0Var.e0 != null && sm0Var.a0.getParent() == this) {
            size4 -= sm0Var.e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i11 = size4;
        int i12 = makeMeasureSpec;
        if (Q > org.telegram.messenger.g0.L(20.0f) && (jtVar = sm0Var.e0) != null) {
            this.h0 = true;
            jtVar.j();
            this.h0 = false;
        }
        org.telegram.ui.Components.jt jtVar2 = sm0Var.e0;
        if (jtVar2 != null && jtVar2.e) {
            sm0Var.fragmentView.setTranslationY(0.0f);
            sm0Var.L.setTranslationY(0.0f);
            sm0Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                org.telegram.ui.Components.jt jtVar3 = sm0Var.e0;
                if (jtVar3 == null || !jtVar3.l(childAt)) {
                    measureChildWithMargins(childAt, i3, 0, i12, 0);
                } else if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (org.telegram.messenger.g0.Q1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 200.0f : 320.0f), getPaddingTop() + (i11 - org.telegram.messenger.g0.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i11 - org.telegram.messenger.g0.m), TLObject.FLAG_30));
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h0) {
            return;
        }
        super.requestLayout();
    }
}
