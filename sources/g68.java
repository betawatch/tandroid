// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g68 extends ela {
    public int m0;
    public boolean n0;
    public final /* synthetic */ j68 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g68(j68 j68Var, Context context) {
        super(context, null);
        this.o0 = j68Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        cv3 cv3Var;
        int measuredHeight;
        int measuredHeight2;
        int i11 = this.m0;
        int i12 = i3 - i;
        j68 j68Var = this.o0;
        if (i11 != i12) {
            this.m0 = i12;
            m8 m8Var = j68Var.J;
            if (m8Var != null && m8Var.isShowing()) {
                j68Var.J.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (gm.L(20.0f) < 0 || gm.E || gm.O1()) ? 0 : j68Var.N.getEmojiPadding();
        setBottomClip(emojiPadding);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i14 = layoutParams.gravity;
                if (i14 == -1) {
                    i14 = 51;
                }
                int i15 = i14 & nm7.w1;
                int i16 = i14 & 7;
                if (i16 == 1) {
                    i5 = ((i12 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i16 != 5) {
                    i7 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i15 == 16) {
                        if (i15 == 48) {
                            i10 = layoutParams.topMargin + getPaddingTop();
                        } else if (i15 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = td4.f(i4, emojiPadding, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        cv3Var = j68Var.N;
                        if (cv3Var != null && cv3Var.l(childAt)) {
                            if (gm.O1()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i10 = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                    } else {
                        i8 = ((((i4 - emojiPadding) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    cv3Var = j68Var.N;
                    if (cv3Var != null) {
                        if (gm.O1()) {
                        }
                        i10 = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
                } else {
                    i5 = (i12 - measuredWidth) - layoutParams.rightMargin;
                    i6 = getPaddingRight();
                }
                i7 = i5 - i6;
                if (i15 == 16) {
                }
                i10 = i8 - i9;
                cv3Var = j68Var.N;
                if (cv3Var != null) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        g68 g68Var;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int L = gm.L(20.0f);
        int i4 = 0;
        j68 j68Var = this.o0;
        if (L < 0) {
            this.n0 = true;
            j68Var.N.j();
            this.n0 = false;
        } else if (!gm.E) {
            size2 -= j68Var.N.getEmojiPadding();
            i2 = View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30);
        }
        int i5 = i2;
        int childCount = getChildCount();
        while (i4 < childCount) {
            View childAt = this.getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                cv3 cv3Var = j68Var.N;
                if (cv3Var == null || !cv3Var.l(childAt)) {
                    g68Var = this;
                    i3 = i;
                    g68Var.measureChildWithMargins(childAt, i3, 0, i5, 0);
                    i4++;
                    this = g68Var;
                    i = i3;
                } else if (!gm.E && !gm.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (gm.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(gm.O1() ? 200.0f : 320.0f), this.getPaddingTop() + (size2 - gm.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.getPaddingTop() + (size2 - gm.m), TLObject.FLAG_30));
                }
            }
            g68Var = this;
            i3 = i;
            i4++;
            this = g68Var;
            i = i3;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.n0) {
            return;
        }
        super.requestLayout();
    }
}
