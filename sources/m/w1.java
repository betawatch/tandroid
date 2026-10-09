package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class w1 extends ViewGroup {
    public int E;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float h;
    public boolean n;
    public int[] r;
    public int[] s;
    public Drawable v;
    public int w;
    public int x;
    public int y;

    public w1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = f.a.n;
        la.h R = la.h.R(context, attributeSet, iArr, i10);
        r0.i0.i(this, context, iArr, attributeSet, (TypedArray) R.c, i10);
        TypedArray typedArray = (TypedArray) R.c;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.b = typedArray.getInt(3, -1);
        this.n = typedArray.getBoolean(7, false);
        setDividerDrawable(R.G(5));
        this.y = typedArray.getInt(8, 0);
        this.E = typedArray.getDimensionPixelSize(6, 0);
        R.S();
    }

    public final void c(Canvas canvas, int i10) {
        this.v.setBounds(getPaddingLeft() + this.E, i10, (getWidth() - getPaddingRight()) - this.E, this.x + i10);
        this.v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v1;
    }

    public final void d(Canvas canvas, int i10) {
        this.v.setBounds(i10, getPaddingTop() + this.E, this.w + i10, (getHeight() - getPaddingBottom()) - this.E);
        this.v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public v1 generateDefaultLayoutParams() {
        int i10 = this.d;
        if (i10 == 0) {
            return new v1(-2, -2);
        }
        if (i10 == 1) {
            return new v1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public v1 generateLayoutParams(AttributeSet attributeSet) {
        return new v1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new v1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.c;
        if (this.d == 1 && (i10 = this.e & 112) != 48) {
            if (i10 == 16) {
                i12 = hg.c.z(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f, 2, i12);
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.v;
    }

    public int getDividerPadding() {
        return this.E;
    }

    public int getDividerWidth() {
        return this.w;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.y;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public final boolean h(int i10) {
        if (i10 == 0) {
            return (this.y & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.y & 4) != 0;
        }
        if ((this.y & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.v == null) {
            return;
        }
        int i11 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && h(i11)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin) - this.x);
                }
                i11++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.x : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((v1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = t3.a(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i11)) {
                v1 v1Var = (v1) childAt3.getLayoutParams();
                d(canvas, a2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) v1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) v1Var).leftMargin) - this.w);
            }
            i11++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                v1 v1Var2 = (v1) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                    i10 = this.w;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) v1Var2).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.w;
                right = left - i10;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int z11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int z12;
        int i23 = 8;
        if (this.d == 1) {
            int paddingLeft = getPaddingLeft();
            int i24 = i12 - i10;
            int paddingRight = i24 - getPaddingRight();
            int paddingRight2 = (i24 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i25 = this.e;
            int i26 = i25 & 112;
            int i27 = 8388615 & i25;
            int paddingTop = i26 != 16 ? i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f : hg.c.z(i13 - i11, this.f, 2, getPaddingTop());
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View childAt = getChildAt(i28);
                if (childAt != null && childAt.getVisibility() != i23) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    v1 v1Var = (v1) childAt.getLayoutParams();
                    int i29 = ((LinearLayout.LayoutParams) v1Var).gravity;
                    if (i29 < 0) {
                        i29 = i27;
                    }
                    WeakHashMap weakHashMap = r0.i0.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i29, getLayoutDirection()) & 7;
                    int z13 = absoluteGravity != 1 ? absoluteGravity != 5 ? ((LinearLayout.LayoutParams) v1Var).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) v1Var).rightMargin : (hg.c.z(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) v1Var).leftMargin) - ((LinearLayout.LayoutParams) v1Var).rightMargin;
                    if (h(i28)) {
                        paddingTop += this.x;
                    }
                    int i30 = paddingTop + ((LinearLayout.LayoutParams) v1Var).topMargin;
                    childAt.layout(z13, i30, measuredWidth + z13, i30 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) v1Var).bottomMargin + i30;
                }
                i28++;
                i23 = 8;
            }
            return;
        }
        boolean a2 = t3.a(this);
        int paddingTop2 = getPaddingTop();
        int i31 = i13 - i11;
        int paddingBottom = i31 - getPaddingBottom();
        int paddingBottom2 = (i31 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i32 = this.e;
        int i33 = 8388615 & i32;
        int i34 = i32 & 112;
        boolean z14 = this.a;
        int[] iArr = this.r;
        int[] iArr2 = this.s;
        WeakHashMap weakHashMap2 = r0.i0.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i33, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            z11 = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f;
            i14 = 1;
        } else {
            i14 = 1;
            z11 = hg.c.z(i12 - i10, this.f, 2, getPaddingLeft());
        }
        if (a2) {
            i16 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i15 = i14;
            i16 = 0;
        }
        int i35 = 0;
        while (i35 < virtualChildCount2) {
            int i36 = (i15 * i35) + i16;
            View childAt2 = getChildAt(i36);
            if (childAt2 == null) {
                i17 = i16;
            } else {
                i17 = i16;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i37 = z11;
                    v1 v1Var2 = (v1) childAt2.getLayoutParams();
                    if (z14) {
                        i18 = i15;
                        if (((LinearLayout.LayoutParams) v1Var2).height != -1) {
                            i19 = childAt2.getBaseline();
                            i20 = ((LinearLayout.LayoutParams) v1Var2).gravity;
                            if (i20 < 0) {
                                i20 = i34;
                            }
                            i21 = i20 & 112;
                            i22 = i35;
                            if (i21 != 16) {
                                z12 = (hg.c.z(paddingBottom2, measuredHeight2, 2, paddingTop2) + ((LinearLayout.LayoutParams) v1Var2).topMargin) - ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                            } else if (i21 == 48) {
                                z12 = ((LinearLayout.LayoutParams) v1Var2).topMargin + paddingTop2;
                                if (i19 != -1) {
                                    z12 = (iArr[i14] - i19) + z12;
                                }
                            } else if (i21 != 80) {
                                z12 = paddingTop2;
                            } else {
                                z12 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                                if (i19 != -1) {
                                    z12 -= iArr2[2] - (childAt2.getMeasuredHeight() - i19);
                                }
                            }
                            int i38 = (!h(i36) ? i37 + this.w : i37) + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                            childAt2.layout(i38, z12, i38 + measuredWidth2, measuredHeight2 + z12);
                            z11 = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i38;
                            i35 = i22 + 1;
                            i15 = i18;
                            i16 = i17;
                        }
                    } else {
                        i18 = i15;
                    }
                    i19 = -1;
                    i20 = ((LinearLayout.LayoutParams) v1Var2).gravity;
                    if (i20 < 0) {
                    }
                    i21 = i20 & 112;
                    i22 = i35;
                    if (i21 != 16) {
                    }
                    int i382 = (!h(i36) ? i37 + this.w : i37) + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                    childAt2.layout(i382, z12, i382 + measuredWidth2, measuredHeight2 + z12);
                    z11 = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i382;
                    i35 = i22 + 1;
                    i15 = i18;
                    i16 = i17;
                }
            }
            i18 = i15;
            i22 = i35;
            i35 = i22 + 1;
            i15 = i18;
            i16 = i17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int baseline;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        int i21;
        boolean z11;
        boolean z12;
        v1 v1Var;
        int i22;
        int[] iArr2;
        int i23;
        View view;
        int i24;
        boolean z13;
        boolean z14;
        int max;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z15;
        int i33;
        int i34;
        int i35;
        View view2;
        boolean z16;
        boolean z17;
        w1 w1Var = this;
        int i36 = w1Var.d;
        int i37 = -2;
        int i38 = 0;
        int i39 = TLObject.FLAG_30;
        int i40 = 8;
        if (i36 == 1) {
            w1Var.f = 0;
            int virtualChildCount = w1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i41 = w1Var.b;
            boolean z18 = w1Var.n;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            boolean z19 = false;
            int i45 = 0;
            boolean z20 = false;
            boolean z21 = true;
            float f7 = 0.0f;
            int i46 = 0;
            while (i42 < virtualChildCount) {
                int i47 = mode;
                View childAt = w1Var.getChildAt(i42);
                if (childAt == null) {
                    w1Var.f = w1Var.f;
                } else if (childAt.getVisibility() != i40) {
                    if (w1Var.h(i42)) {
                        w1Var.f += w1Var.x;
                    }
                    v1 v1Var2 = (v1) childAt.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) v1Var2).weight;
                    f7 += f10;
                    if (mode2 == i39 && ((LinearLayout.LayoutParams) v1Var2).height == 0 && f10 > 0.0f) {
                        int i48 = w1Var.f;
                        w1Var.f = Math.max(i48, ((LinearLayout.LayoutParams) v1Var2).topMargin + i48 + ((LinearLayout.LayoutParams) v1Var2).bottomMargin);
                        view2 = childAt;
                        i32 = mode2;
                        i33 = i41;
                        z15 = z18;
                        i34 = i42;
                        z19 = true;
                        i35 = i47;
                    } else {
                        if (((LinearLayout.LayoutParams) v1Var2).height != 0 || f10 <= 0.0f) {
                            i29 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) v1Var2).height = i37;
                            i29 = 0;
                        }
                        if (f7 == 0.0f) {
                            i30 = i42;
                            i31 = w1Var.f;
                        } else {
                            i30 = i42;
                            i31 = 0;
                        }
                        i32 = mode2;
                        z15 = z18;
                        i33 = i41;
                        i34 = i30;
                        i35 = i47;
                        w1Var.measureChildWithMargins(childAt, i10, 0, i11, i31);
                        if (i29 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) v1Var2).height = i29;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i49 = w1Var.f;
                        view2 = childAt;
                        w1Var.f = Math.max(i49, i49 + measuredHeight + ((LinearLayout.LayoutParams) v1Var2).topMargin + ((LinearLayout.LayoutParams) v1Var2).bottomMargin);
                        if (z15) {
                            i46 = Math.max(measuredHeight, i46);
                        }
                    }
                    if (i33 >= 0 && i33 == i34 + 1) {
                        w1Var.c = w1Var.f;
                    }
                    if (i34 < i33 && ((LinearLayout.LayoutParams) v1Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i35 == 1073741824 || ((LinearLayout.LayoutParams) v1Var2).width != -1) {
                        z16 = false;
                    } else {
                        z16 = true;
                        z20 = true;
                    }
                    int i50 = ((LinearLayout.LayoutParams) v1Var2).leftMargin + ((LinearLayout.LayoutParams) v1Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i50;
                    i38 = Math.max(i38, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z22 = z16;
                    int combineMeasuredStates = View.combineMeasuredStates(i45, measuredState);
                    if (z21) {
                        i45 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) v1Var2).width == -1) {
                            z17 = true;
                            if (((LinearLayout.LayoutParams) v1Var2).weight <= 0.0f) {
                                if (!z22) {
                                    i50 = measuredWidth;
                                }
                                i44 = Math.max(i44, i50);
                            } else {
                                if (!z22) {
                                    i50 = measuredWidth;
                                }
                                i43 = Math.max(i43, i50);
                            }
                            z21 = z17;
                            i42 = i34 + 1;
                            i41 = i33;
                            mode = i35;
                            z18 = z15;
                            mode2 = i32;
                            i37 = -2;
                            i39 = TLObject.FLAG_30;
                            i40 = 8;
                        }
                    } else {
                        i45 = combineMeasuredStates;
                    }
                    z17 = false;
                    if (((LinearLayout.LayoutParams) v1Var2).weight <= 0.0f) {
                    }
                    z21 = z17;
                    i42 = i34 + 1;
                    i41 = i33;
                    mode = i35;
                    z18 = z15;
                    mode2 = i32;
                    i37 = -2;
                    i39 = TLObject.FLAG_30;
                    i40 = 8;
                }
                i32 = mode2;
                i33 = i41;
                z15 = z18;
                i34 = i42;
                i35 = i47;
                i42 = i34 + 1;
                i41 = i33;
                mode = i35;
                z18 = z15;
                mode2 = i32;
                i37 = -2;
                i39 = TLObject.FLAG_30;
                i40 = 8;
            }
            int i51 = mode;
            int i52 = mode2;
            boolean z23 = z18;
            int i53 = i45;
            int i54 = i11;
            if (w1Var.f > 0 && w1Var.h(virtualChildCount)) {
                w1Var.f += w1Var.x;
            }
            if (z23 && (i52 == Integer.MIN_VALUE || i52 == 0)) {
                w1Var.f = 0;
                for (int i55 = 0; i55 < virtualChildCount; i55++) {
                    View childAt2 = w1Var.getChildAt(i55);
                    if (childAt2 == null) {
                        w1Var.f = w1Var.f;
                    } else if (childAt2.getVisibility() != 8) {
                        v1 v1Var3 = (v1) childAt2.getLayoutParams();
                        int i56 = w1Var.f;
                        w1Var.f = Math.max(i56, i56 + i46 + ((LinearLayout.LayoutParams) v1Var3).topMargin + ((LinearLayout.LayoutParams) v1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = w1Var.getPaddingBottom() + w1Var.getPaddingTop() + w1Var.f;
            w1Var.f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, w1Var.getSuggestedMinimumHeight()), i54, 0);
            int i57 = (resolveSizeAndState & 16777215) - w1Var.f;
            if (z19 || (i57 != 0 && f7 > 0.0f)) {
                float f11 = w1Var.h;
                if (f11 > 0.0f) {
                    f7 = f11;
                }
                w1Var.f = 0;
                int i58 = i53;
                int i59 = 0;
                while (i59 < virtualChildCount) {
                    View childAt3 = w1Var.getChildAt(i59);
                    if (childAt3.getVisibility() == 8) {
                        i26 = i59;
                    } else {
                        v1 v1Var4 = (v1) childAt3.getLayoutParams();
                        float f12 = ((LinearLayout.LayoutParams) v1Var4).weight;
                        if (f12 > 0.0f) {
                            int i60 = (int) ((i57 * f12) / f7);
                            f7 -= f12;
                            i57 -= i60;
                            i26 = i59;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, w1Var.getPaddingRight() + w1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) v1Var4).leftMargin + ((LinearLayout.LayoutParams) v1Var4).rightMargin, ((LinearLayout.LayoutParams) v1Var4).width);
                            if (((LinearLayout.LayoutParams) v1Var4).height == 0) {
                                i28 = TLObject.FLAG_30;
                                if (i52 == 1073741824) {
                                    if (i60 <= 0) {
                                        i60 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i60, TLObject.FLAG_30));
                                    i58 = View.combineMeasuredStates(i58, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i28 = TLObject.FLAG_30;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i60;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i28));
                            i58 = View.combineMeasuredStates(i58, childAt3.getMeasuredState() & (-256));
                        } else {
                            i26 = i59;
                        }
                        int i61 = ((LinearLayout.LayoutParams) v1Var4).leftMargin + ((LinearLayout.LayoutParams) v1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i61;
                        i38 = Math.max(i38, measuredWidth2);
                        if (i51 != 1073741824) {
                            i27 = -1;
                            if (((LinearLayout.LayoutParams) v1Var4).width == -1) {
                                measuredWidth2 = i61;
                            }
                        } else {
                            i27 = -1;
                        }
                        i43 = Math.max(i43, measuredWidth2);
                        boolean z24 = z21 && ((LinearLayout.LayoutParams) v1Var4).width == i27;
                        int i62 = w1Var.f;
                        w1Var.f = Math.max(i62, childAt3.getMeasuredHeight() + i62 + ((LinearLayout.LayoutParams) v1Var4).topMargin + ((LinearLayout.LayoutParams) v1Var4).bottomMargin);
                        z21 = z24;
                    }
                    i59 = i26 + 1;
                }
                w1Var.f = w1Var.getPaddingBottom() + w1Var.getPaddingTop() + w1Var.f;
                i53 = i58;
            } else {
                i43 = Math.max(i43, i44);
                if (z23 && i52 != 1073741824) {
                    for (int i63 = 0; i63 < virtualChildCount; i63++) {
                        View childAt4 = w1Var.getChildAt(i63);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((v1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i46, TLObject.FLAG_30));
                        }
                    }
                }
            }
            if (z21 || i51 == 1073741824) {
                i43 = i38;
            }
            w1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(w1Var.getPaddingRight() + w1Var.getPaddingLeft() + i43, w1Var.getSuggestedMinimumWidth()), i10, i53), resolveSizeAndState);
            if (z20) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(w1Var.getMeasuredWidth(), TLObject.FLAG_30);
                int i64 = 0;
                while (i64 < virtualChildCount) {
                    View childAt5 = w1Var.getChildAt(i64);
                    if (childAt5.getVisibility() != 8) {
                        v1 v1Var5 = (v1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) v1Var5).width == -1) {
                            int i65 = ((LinearLayout.LayoutParams) v1Var5).height;
                            ((LinearLayout.LayoutParams) v1Var5).height = childAt5.getMeasuredHeight();
                            w1Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i54, 0);
                            ((LinearLayout.LayoutParams) v1Var5).height = i65;
                        }
                    }
                    i64++;
                    i54 = i11;
                }
                return;
            }
            return;
        }
        int i66 = i10;
        w1Var.f = 0;
        int virtualChildCount2 = w1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i66);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (w1Var.r == null || w1Var.s == null) {
            w1Var.r = new int[4];
            w1Var.s = new int[4];
        }
        int[] iArr3 = w1Var.r;
        int[] iArr4 = w1Var.s;
        iArr3[3] = -1;
        char c10 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z25 = w1Var.a;
        boolean z26 = w1Var.n;
        boolean z27 = mode3 == 1073741824;
        float f13 = 0.0f;
        boolean z28 = true;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        boolean z29 = false;
        boolean z30 = false;
        while (i67 < virtualChildCount2) {
            char c11 = c10;
            View childAt6 = w1Var.getChildAt(i67);
            if (childAt6 == null) {
                w1Var.f = w1Var.f;
                i21 = i67;
                i25 = i69;
                iArr2 = iArr3;
                iArr = iArr4;
                z11 = z25;
                z12 = z26;
            } else {
                int i73 = i68;
                if (childAt6.getVisibility() == 8) {
                    i66 = i10;
                    i21 = i67;
                    i25 = i69;
                    iArr = iArr4;
                    z11 = z25;
                    z12 = z26;
                    i68 = i73;
                    iArr2 = iArr3;
                } else {
                    if (w1Var.h(i67)) {
                        w1Var.f += w1Var.w;
                    }
                    v1 v1Var6 = (v1) childAt6.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) v1Var6).weight;
                    f13 += f14;
                    int i74 = i67;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) v1Var6).width == 0 && f14 > 0.0f) {
                        if (z27) {
                            w1Var.f = ((LinearLayout.LayoutParams) v1Var6).leftMargin + ((LinearLayout.LayoutParams) v1Var6).rightMargin + w1Var.f;
                        } else {
                            int i75 = w1Var.f;
                            w1Var.f = Math.max(i75, ((LinearLayout.LayoutParams) v1Var6).leftMargin + i75 + ((LinearLayout.LayoutParams) v1Var6).rightMargin);
                        }
                        if (z25) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            i22 = i73;
                            i21 = i74;
                            v1Var = v1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i66 = i10;
                            i23 = i69;
                            i20 = i70;
                        } else {
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            z30 = true;
                            i22 = i73;
                            i21 = i74;
                            i24 = TLObject.FLAG_30;
                            v1Var = v1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i66 = i10;
                            i23 = i69;
                            i20 = i70;
                            if (mode4 == i24 && ((LinearLayout.LayoutParams) v1Var).height == -1) {
                                z13 = true;
                                z29 = true;
                            } else {
                                z13 = false;
                            }
                            int i76 = ((LinearLayout.LayoutParams) v1Var).topMargin + ((LinearLayout.LayoutParams) v1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i76;
                            i72 = View.combineMeasuredStates(i72, view.getMeasuredState());
                            if (z11) {
                                z14 = z13;
                            } else {
                                int baseline2 = view.getBaseline();
                                z14 = z13;
                                if (baseline2 != -1) {
                                    int i77 = ((LinearLayout.LayoutParams) v1Var).gravity;
                                    if (i77 < 0) {
                                        i77 = w1Var.e;
                                    }
                                    int i78 = (((i77 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i78] = Math.max(iArr2[i78], baseline2);
                                    iArr[i78] = Math.max(iArr[i78], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i22, measuredHeight3);
                            boolean z31 = !z28 && ((LinearLayout.LayoutParams) v1Var).height == -1;
                            if (((LinearLayout.LayoutParams) v1Var).weight <= 0.0f) {
                                if (!z14) {
                                    i76 = measuredHeight3;
                                }
                                i70 = Math.max(i20, i76);
                                max = i23;
                            } else {
                                if (!z14) {
                                    i76 = measuredHeight3;
                                }
                                max = Math.max(i23, i76);
                                i70 = i20;
                            }
                            int i79 = max;
                            i68 = max2;
                            i25 = i79;
                            z28 = z31;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) v1Var6).width != 0 || f14 <= 0.0f) {
                            i19 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) v1Var6).width = -2;
                            i19 = 0;
                        }
                        iArr = iArr4;
                        i20 = i70;
                        i21 = i74;
                        z11 = z25;
                        z12 = z26;
                        int i80 = i19;
                        v1Var = v1Var6;
                        i22 = i73;
                        i66 = i10;
                        iArr2 = iArr3;
                        i23 = i69;
                        w1Var.measureChildWithMargins(childAt6, i66, f13 == 0.0f ? w1Var.f : 0, i11, 0);
                        if (i80 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) v1Var).width = i80;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z27) {
                            view = childAt6;
                            w1Var.f = ((LinearLayout.LayoutParams) v1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) v1Var).rightMargin + w1Var.f;
                        } else {
                            view = childAt6;
                            int i81 = w1Var.f;
                            w1Var.f = Math.max(i81, i81 + measuredWidth3 + ((LinearLayout.LayoutParams) v1Var).leftMargin + ((LinearLayout.LayoutParams) v1Var).rightMargin);
                        }
                        if (z12) {
                            i71 = Math.max(measuredWidth3, i71);
                        }
                    }
                    i24 = TLObject.FLAG_30;
                    if (mode4 == i24) {
                    }
                    z13 = false;
                    int i762 = ((LinearLayout.LayoutParams) v1Var).topMargin + ((LinearLayout.LayoutParams) v1Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i762;
                    i72 = View.combineMeasuredStates(i72, view.getMeasuredState());
                    if (z11) {
                    }
                    int max22 = Math.max(i22, measuredHeight32);
                    if (z28) {
                    }
                    if (((LinearLayout.LayoutParams) v1Var).weight <= 0.0f) {
                    }
                    int i792 = max;
                    i68 = max22;
                    i25 = i792;
                    z28 = z31;
                }
            }
            i69 = i25;
            i67 = i21 + 1;
            c10 = c11;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z11;
            z26 = z12;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c12 = c10;
        boolean z32 = z25;
        boolean z33 = z26;
        int i82 = i68;
        int i83 = i69;
        int i84 = i70;
        if (w1Var.f > 0 && w1Var.h(virtualChildCount2)) {
            w1Var.f += w1Var.w;
        }
        int i85 = iArr5[1];
        int max3 = (i85 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) ? i82 : Math.max(i82, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i85, iArr5[c12]))));
        if (z33 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            w1Var.f = 0;
            for (int i86 = 0; i86 < virtualChildCount2; i86++) {
                View childAt7 = w1Var.getChildAt(i86);
                if (childAt7 == null) {
                    w1Var.f = w1Var.f;
                } else if (childAt7.getVisibility() != 8) {
                    v1 v1Var7 = (v1) childAt7.getLayoutParams();
                    if (z27) {
                        w1Var.f = ((LinearLayout.LayoutParams) v1Var7).leftMargin + i71 + ((LinearLayout.LayoutParams) v1Var7).rightMargin + w1Var.f;
                    } else {
                        int i87 = w1Var.f;
                        w1Var.f = Math.max(i87, i87 + i71 + ((LinearLayout.LayoutParams) v1Var7).leftMargin + ((LinearLayout.LayoutParams) v1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = w1Var.getPaddingRight() + w1Var.getPaddingLeft() + w1Var.f;
        w1Var.f = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, w1Var.getSuggestedMinimumWidth()), i66, 0);
        int i88 = (resolveSizeAndState2 & 16777215) - w1Var.f;
        if (z30 || (i88 != 0 && f13 > 0.0f)) {
            float f15 = w1Var.h;
            if (f15 > 0.0f) {
                f13 = f15;
            }
            iArr5[3] = -1;
            iArr5[c12] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c12] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            w1Var.f = 0;
            max3 = -1;
            int i89 = 0;
            while (i89 < virtualChildCount2) {
                View childAt8 = w1Var.getChildAt(i89);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i16 = resolveSizeAndState2;
                } else {
                    v1 v1Var8 = (v1) childAt8.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) v1Var8).weight;
                    if (f16 > 0.0f) {
                        int i90 = (int) ((i88 * f16) / f13);
                        f13 -= f16;
                        i88 -= i90;
                        i16 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, w1Var.getPaddingBottom() + w1Var.getPaddingTop() + ((LinearLayout.LayoutParams) v1Var8).topMargin + ((LinearLayout.LayoutParams) v1Var8).bottomMargin, ((LinearLayout.LayoutParams) v1Var8).height);
                        if (((LinearLayout.LayoutParams) v1Var8).width == 0) {
                            i18 = TLObject.FLAG_30;
                            if (mode3 == 1073741824) {
                                if (i90 <= 0) {
                                    i90 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i90, TLObject.FLAG_30), childMeasureSpec2);
                                i72 = View.combineMeasuredStates(i72, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i18 = TLObject.FLAG_30;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i90;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i18), childMeasureSpec2);
                        i72 = View.combineMeasuredStates(i72, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i16 = resolveSizeAndState2;
                    }
                    if (z27) {
                        w1Var.f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) v1Var8).leftMargin + ((LinearLayout.LayoutParams) v1Var8).rightMargin + w1Var.f;
                    } else {
                        int i91 = w1Var.f;
                        w1Var.f = Math.max(i91, childAt8.getMeasuredWidth() + i91 + ((LinearLayout.LayoutParams) v1Var8).leftMargin + ((LinearLayout.LayoutParams) v1Var8).rightMargin);
                    }
                    boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) v1Var8).height == -1;
                    int i92 = ((LinearLayout.LayoutParams) v1Var8).topMargin + ((LinearLayout.LayoutParams) v1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i92;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z34) {
                        i92 = measuredHeight4;
                    }
                    int max4 = Math.max(i83, i92);
                    if (z28) {
                        i17 = -1;
                        if (((LinearLayout.LayoutParams) v1Var8).height == -1) {
                            z10 = true;
                            if (!z32 && (baseline = childAt8.getBaseline()) != i17) {
                                int i93 = ((LinearLayout.LayoutParams) v1Var8).gravity;
                                if (i93 < 0) {
                                    i93 = w1Var.e;
                                }
                                int i94 = (((i93 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i94] = Math.max(iArr5[i94], baseline);
                                iArr6[i94] = Math.max(iArr6[i94], measuredHeight4 - baseline);
                            }
                            z28 = z10;
                            i83 = max4;
                        }
                    } else {
                        i17 = -1;
                    }
                    z10 = false;
                    if (!z32) {
                    }
                    z28 = z10;
                    i83 = max4;
                }
                i89++;
                resolveSizeAndState2 = i16;
            }
            i12 = resolveSizeAndState2;
            i13 = -16777216;
            w1Var.f = w1Var.getPaddingRight() + w1Var.getPaddingLeft() + w1Var.f;
            int i95 = iArr5[1];
            if (i95 == -1 && iArr5[0] == -1 && iArr5[c12] == -1 && iArr5[3] == -1) {
                i14 = 0;
            } else {
                i14 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c12]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i95, iArr5[c12]))));
            }
            i15 = i83;
        } else {
            i15 = Math.max(i83, i84);
            if (z33 && mode3 != 1073741824) {
                for (int i96 = 0; i96 < virtualChildCount2; i96++) {
                    View childAt9 = w1Var.getChildAt(i96);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((v1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i71, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
            }
            i12 = resolveSizeAndState2;
            i13 = -16777216;
            i14 = 0;
        }
        if (!z28 && mode4 != 1073741824) {
            max3 = i15;
        }
        w1Var.setMeasuredDimension(i12 | (i72 & i13), View.resolveSizeAndState(Math.max(w1Var.getPaddingBottom() + w1Var.getPaddingTop() + max3, w1Var.getSuggestedMinimumHeight()), i11, i72 << 16));
        if (z29) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(w1Var.getMeasuredHeight(), TLObject.FLAG_30);
            int i97 = i14;
            while (i97 < virtualChildCount2) {
                View childAt10 = w1Var.getChildAt(i97);
                if (childAt10.getVisibility() != 8) {
                    v1 v1Var9 = (v1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) v1Var9).height == -1) {
                        int i98 = ((LinearLayout.LayoutParams) v1Var9).width;
                        ((LinearLayout.LayoutParams) v1Var9).width = childAt10.getMeasuredWidth();
                        w1Var.measureChildWithMargins(childAt10, i66, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) v1Var9).width = i98;
                    }
                }
                i97++;
                w1Var = this;
                i66 = i10;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.v) {
            return;
        }
        this.v = drawable;
        if (drawable != null) {
            this.w = drawable.getIntrinsicWidth();
            this.x = drawable.getIntrinsicHeight();
        } else {
            this.w = 0;
            this.x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.E = i10;
    }

    public void setGravity(int i10) {
        if (this.e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.e;
        if ((8388615 & i12) != i11) {
            this.e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.n = z10;
    }

    public void setOrientation(int i10) {
        if (this.d != i10) {
            this.d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.y) {
            requestLayout();
        }
        this.y = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.e;
        if ((i12 & 112) != i11) {
            this.e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f7) {
        this.h = Math.max(0.0f, f7);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
