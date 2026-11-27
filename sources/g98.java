// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g98 extends wma {
    public int g0;
    public boolean h0;
    public int i0;
    public final /* synthetic */ l98 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g98(l98 l98Var, Context context) {
        super(context, null);
        this.j0 = l98Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        iu3 iu3Var;
        int measuredHeight;
        int measuredHeight2;
        int i11 = this.g0;
        int i12 = i3 - i;
        l98 l98Var = this.j0;
        if (i11 != i12) {
            this.g0 = i12;
            t20 t20Var = l98Var.M;
            if (t20Var != null) {
                t20Var.f();
            }
            n8 n8Var = l98Var.n0;
            if (n8Var != null && n8Var.isShowing()) {
                l98Var.n0.d(true);
            }
        }
        int childCount = getChildCount();
        int emojiPadding = (l98Var.e0 == null || l98Var.a0.getParent() != this || hl.L(20.0f) < 0 || hl.E || hl.O1()) ? 0 : l98Var.e0.getEmojiPadding();
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
                int i15 = i14 & jn7.w1;
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
                            i8 = qd4.f(i4, emojiPadding, i2, measuredHeight3);
                            i9 = layoutParams.bottomMargin;
                        }
                        iu3Var = l98Var.e0;
                        if (iu3Var != null && iu3Var.l(childAt)) {
                            if (hl.O1()) {
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
                    iu3Var = l98Var.e0;
                    if (iu3Var != null) {
                        if (hl.O1()) {
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
                iu3Var = l98Var.e0;
                if (iu3Var != null) {
                }
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight3 + i10);
            }
        }
        R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        iu3 iu3Var;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean O1 = hl.O1();
        l98 l98Var = this.j0;
        if (O1) {
            l98Var.h0 = (byte) 4;
        } else {
            Point point = hl.q;
            if (point.x > point.y) {
                l98Var.h0 = (byte) 4;
            } else {
                l98Var.h0 = (byte) 3;
            }
        }
        this.h0 = true;
        int L = ((size2 - hl.L(4.0f)) - hl.L(4.0f)) / l98Var.h0;
        l98Var.S = L;
        if (this.i0 != L) {
            this.i0 = L;
            hl.c3(new x38(this, (byte) 8));
        }
        boolean z = l98Var.Z;
        h98 h98Var = l98Var.N;
        if (z) {
            h98Var.x1(1);
        } else {
            h98Var.x1(Math.max(1, ((l98Var.h0 - 1) * hl.L(2.0f)) + (l98Var.S * l98Var.h0)));
        }
        this.h0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        setMeasuredDimension(size3, size4);
        int Q = Q();
        if (hl.L(20.0f) >= 0 && !hl.E && l98Var.e0 != null && l98Var.a0.getParent() == this) {
            size4 -= l98Var.e0.getEmojiPadding();
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size4, TLObject.FLAG_30);
        }
        int i3 = size4;
        int i4 = makeMeasureSpec;
        if (Q > hl.L(20.0f) && (iu3Var = l98Var.e0) != null) {
            this.h0 = true;
            iu3Var.j();
            this.h0 = false;
        }
        iu3 iu3Var2 = l98Var.e0;
        if (iu3Var2 != null && iu3Var2.e) {
            l98Var.fragmentView.setTranslationY(0.0f);
            l98Var.L.setTranslationY(0.0f);
            l98Var.O.setTranslationY(0.0f);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null && childAt.getVisibility() != 8) {
                iu3 iu3Var3 = l98Var.e0;
                if (iu3Var3 == null || !iu3Var3.l(childAt)) {
                    measureChildWithMargins(childAt, i, 0, i4, 0);
                } else if (!hl.E && !hl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (hl.O1()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(hl.O1() ? 200.0f : 320.0f), getPaddingTop() + (i3 - hl.m)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (i3 - hl.m), TLObject.FLAG_30));
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
