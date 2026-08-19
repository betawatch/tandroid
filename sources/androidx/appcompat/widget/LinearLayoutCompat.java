package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.R$styleable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public abstract class LinearLayoutCompat extends ViewGroup {
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    int measureNullChild(int i) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        int[] iArr = R$styleable.LinearLayoutCompat;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int i2 = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(R$styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(R$styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(R$styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(R$styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(R$styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(R$styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin;
            }
            drawHorizontalDivider(canvas, bottom);
        }
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (isLayoutRtl) {
                    left2 = virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else {
                    left2 = (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, left2);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (isLayoutRtl) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (isLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        int i16;
        View view;
        int max;
        boolean z2;
        int max2;
        int i17;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i18 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        float f = 0.0f;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            int i25 = 8;
            if (i19 < virtualChildCount) {
                float f2 = f;
                View virtualChildAt = getVirtualChildAt(i19);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i19);
                } else if (virtualChildAt.getVisibility() == 8) {
                    i19 += getChildrenSkipCount(virtualChildAt, i19);
                } else {
                    if (hasDividerBeforeChildAt(i19)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    float f3 = ((LinearLayout.LayoutParams) layoutParams).weight;
                    float f4 = f2 + f3;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams).height == 0 && f3 > 0.0f) {
                        int i26 = this.mTotalLength;
                        this.mTotalLength = Math.max(i26, ((LinearLayout.LayoutParams) layoutParams).topMargin + i26 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin);
                        i16 = i20;
                        max = i21;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        view = virtualChildAt;
                        z4 = true;
                        i15 = i22;
                        i14 = i23;
                        z = z3;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams).height != 0 || f3 <= 0.0f) {
                            i9 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams).height = -2;
                            i9 = 0;
                        }
                        if (f4 == 0.0f) {
                            int i27 = i23;
                            i11 = this.mTotalLength;
                            i10 = i27;
                        } else {
                            i10 = i23;
                            i11 = 0;
                        }
                        int i28 = i21;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i14 = i10;
                        i15 = i22;
                        z = z3;
                        i16 = i20;
                        measureChildBeforeLayout(virtualChildAt, i19, i, 0, i2, i11);
                        view = virtualChildAt;
                        if (i9 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams).height = i9;
                        }
                        int measuredHeight = view.getMeasuredHeight();
                        int i29 = this.mTotalLength;
                        this.mTotalLength = Math.max(i29, i29 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(view));
                        max = z ? Math.max(measuredHeight, i28) : i28;
                    }
                    if (i18 >= 0 && i18 == i19 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i19 < i18 && ((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams).width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z6 = true;
                    }
                    int i30 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    int measuredWidth = view.getMeasuredWidth() + i30;
                    max2 = Math.max(i15, measuredWidth);
                    int i31 = max;
                    int combineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                    if (z5) {
                        i17 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                            z5 = true;
                            if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                                if (!z2) {
                                    i30 = measuredWidth;
                                }
                                i16 = Math.max(i16, i30);
                            } else {
                                if (!z2) {
                                    i30 = measuredWidth;
                                }
                                i24 = Math.max(i24, i30);
                            }
                            i19 += getChildrenSkipCount(view, i19);
                            f = f4;
                            i21 = i31;
                            i23 = i17;
                            i19++;
                            i22 = max2;
                            i20 = i16;
                            z3 = z;
                            mode2 = i13;
                            virtualChildCount = i12;
                        }
                    } else {
                        i17 = combineMeasuredStates;
                    }
                    z5 = false;
                    if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                    }
                    i19 += getChildrenSkipCount(view, i19);
                    f = f4;
                    i21 = i31;
                    i23 = i17;
                    i19++;
                    i22 = max2;
                    i20 = i16;
                    z3 = z;
                    mode2 = i13;
                    virtualChildCount = i12;
                }
                i16 = i20;
                i12 = virtualChildCount;
                i13 = mode2;
                z = z3;
                f = f2;
                max2 = i22;
                i19++;
                i22 = max2;
                i20 = i16;
                z3 = z;
                mode2 = i13;
                virtualChildCount = i12;
            } else {
                float f5 = f;
                int i32 = i20;
                int i33 = virtualChildCount;
                int i34 = mode2;
                boolean z7 = z3;
                int i35 = i21;
                int i36 = i22;
                int i37 = i23;
                if (this.mTotalLength > 0) {
                    i3 = i33;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i33;
                }
                int i38 = i34;
                if (z7 && (i38 == Integer.MIN_VALUE || i38 == 0)) {
                    this.mTotalLength = 0;
                    int i39 = 0;
                    while (i39 < i3) {
                        View virtualChildAt2 = getVirtualChildAt(i39);
                        if (virtualChildAt2 == null) {
                            this.mTotalLength += measureNullChild(i39);
                        } else if (virtualChildAt2.getVisibility() == i25) {
                            i39 += getChildrenSkipCount(virtualChildAt2, i39);
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            int i40 = this.mTotalLength;
                            this.mTotalLength = Math.max(i40, i40 + i35 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                        }
                        i39++;
                        i25 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i41 = (16777215 & resolveSizeAndState) - this.mTotalLength;
                if (z4 || (i41 != 0 && f5 > 0.0f)) {
                    float f6 = this.mWeightSum;
                    if (f6 <= 0.0f) {
                        f6 = f5;
                    }
                    this.mTotalLength = 0;
                    float f7 = f6;
                    int i42 = i41;
                    int i43 = 0;
                    while (i43 < i3) {
                        View virtualChildAt3 = getVirtualChildAt(i43);
                        if (virtualChildAt3.getVisibility() == 8) {
                            i5 = i38;
                            i6 = i43;
                        } else {
                            LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                            float f8 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                            if (f8 > 0.0f) {
                                i6 = i43;
                                int i44 = (int) ((i42 * f8) / f7);
                                f7 -= f8;
                                i42 -= i44;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin, ((LinearLayout.LayoutParams) layoutParams3).width);
                                if (((LinearLayout.LayoutParams) layoutParams3).height == 0) {
                                    i8 = TLObject.FLAG_30;
                                    if (i38 == 1073741824) {
                                        i5 = i38;
                                        virtualChildAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i44 > 0 ? i44 : 0, TLObject.FLAG_30));
                                        i37 = View.combineMeasuredStates(i37, virtualChildAt3.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i8 = TLObject.FLAG_30;
                                }
                                i5 = i38;
                                int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i44;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                virtualChildAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i8));
                                i37 = View.combineMeasuredStates(i37, virtualChildAt3.getMeasuredState() & (-256));
                            } else {
                                i5 = i38;
                                i6 = i43;
                            }
                            int i45 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                            int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i45;
                            i36 = Math.max(i36, measuredWidth2);
                            if (mode != 1073741824) {
                                i7 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams3).width == -1) {
                                    measuredWidth2 = i45;
                                }
                            } else {
                                i7 = -1;
                            }
                            int max3 = Math.max(i24, measuredWidth2);
                            boolean z8 = z5 && ((LinearLayout.LayoutParams) layoutParams3).width == i7;
                            int i46 = this.mTotalLength;
                            this.mTotalLength = Math.max(i46, i46 + virtualChildAt3.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin + getNextLocationOffset(virtualChildAt3));
                            i24 = max3;
                            z5 = z8;
                        }
                        i43 = i6 + 1;
                        i38 = i5;
                    }
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    i4 = i24;
                } else {
                    i4 = Math.max(i24, i32);
                    if (z7 && i38 != 1073741824) {
                        for (int i47 = 0; i47 < i3; i47++) {
                            View virtualChildAt4 = getVirtualChildAt(i47);
                            if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i35, TLObject.FLAG_30));
                            }
                        }
                    }
                }
                if (!z5 && mode != 1073741824) {
                    i36 = i4;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i36 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i37), resolveSizeAndState);
                if (z6) {
                    forceUniformWidth(i3, i2);
                    return;
                }
                return;
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    i3 = i2;
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i5;
                    i4++;
                    i2 = i3;
                }
            }
            i3 = i2;
            i4++;
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int max;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int baseline;
        int i12;
        int i13;
        int i14;
        float f;
        int i15;
        boolean z2;
        int i16;
        int i17;
        int[] iArr;
        int[] iArr2;
        int i18;
        boolean z3;
        View view;
        int i19;
        boolean z4;
        boolean z5;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr3 = this.mMaxAscent;
        int[] iArr4 = this.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z6 = this.mBaselineAligned;
        boolean z7 = this.mUseLargestChild;
        int i20 = TLObject.FLAG_30;
        boolean z8 = mode == 1073741824;
        boolean z9 = z7;
        int i21 = 0;
        float f2 = 0.0f;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z10 = false;
        int i26 = 0;
        boolean z11 = true;
        boolean z12 = false;
        while (true) {
            i3 = i22;
            if (i21 >= virtualChildCount) {
                break;
            }
            boolean z13 = z6;
            View virtualChildAt = getVirtualChildAt(i21);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(i21);
            } else if (virtualChildAt.getVisibility() == 8) {
                i21 += getChildrenSkipCount(virtualChildAt, i21);
            } else {
                if (hasDividerBeforeChildAt(i21)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                float f3 = ((LinearLayout.LayoutParams) layoutParams).weight;
                float f4 = f2 + f3;
                if (mode == i20 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f3 > 0.0f) {
                    if (z8) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    } else {
                        int i27 = this.mTotalLength;
                        this.mTotalLength = Math.max(i27, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i27 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z13) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        i17 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i18 = i3;
                        z3 = z9;
                        view = virtualChildAt;
                    } else {
                        i17 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i18 = i3;
                        i19 = TLObject.FLAG_30;
                        z10 = true;
                        z3 = z9;
                        view = virtualChildAt;
                        if (mode2 == i19 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            z4 = true;
                            z12 = true;
                        } else {
                            z4 = false;
                        }
                        int i28 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        int measuredHeight = view.getMeasuredHeight() + i28;
                        i26 = View.combineMeasuredStates(i26, view.getMeasuredState());
                        if (z13 || (baseline2 = view.getBaseline()) == -1) {
                            z5 = z4;
                        } else {
                            int i29 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i29 < 0) {
                                i29 = this.mGravity;
                            }
                            int i30 = (((i29 & 112) >> 4) & (-2)) >> 1;
                            z5 = z4;
                            iArr[i30] = Math.max(iArr[i30], baseline2);
                            iArr2[i30] = Math.max(iArr2[i30], measuredHeight - baseline2);
                        }
                        i22 = Math.max(i18, measuredHeight);
                        z11 = !z11 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                        if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                            if (z5) {
                                measuredHeight = i28;
                            }
                            i24 = Math.max(i24, measuredHeight);
                        } else {
                            if (z5) {
                                measuredHeight = i28;
                            }
                            i23 = Math.max(i23, measuredHeight);
                        }
                        i21 += getChildrenSkipCount(view, i21);
                        f2 = f4;
                        i21++;
                        z9 = z3;
                        iArr4 = iArr2;
                        z6 = z13;
                        iArr3 = iArr;
                        mode = i17;
                        i20 = TLObject.FLAG_30;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f3 <= 0.0f) {
                        i15 = TLObject.FLAG_31;
                    } else {
                        ((LinearLayout.LayoutParams) layoutParams).width = -2;
                        i15 = 0;
                    }
                    if (f4 == 0.0f) {
                        z2 = z9;
                        i16 = this.mTotalLength;
                    } else {
                        z2 = z9;
                        i16 = 0;
                    }
                    i17 = mode;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    i18 = i3;
                    int i31 = i15;
                    z3 = z2;
                    measureChildBeforeLayout(virtualChildAt, i21, i, i16, i2, 0);
                    view = virtualChildAt;
                    if (i31 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams).width = i31;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    if (z8) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + getNextLocationOffset(view);
                    } else {
                        int i32 = this.mTotalLength;
                        this.mTotalLength = Math.max(i32, i32 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + getNextLocationOffset(view));
                    }
                    if (z3) {
                        i25 = Math.max(measuredWidth, i25);
                    }
                }
                i19 = TLObject.FLAG_30;
                if (mode2 == i19) {
                }
                z4 = false;
                int i282 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int measuredHeight2 = view.getMeasuredHeight() + i282;
                i26 = View.combineMeasuredStates(i26, view.getMeasuredState());
                if (z13) {
                }
                z5 = z4;
                i22 = Math.max(i18, measuredHeight2);
                if (z11) {
                }
                if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                }
                i21 += getChildrenSkipCount(view, i21);
                f2 = f4;
                i21++;
                z9 = z3;
                iArr4 = iArr2;
                z6 = z13;
                iArr3 = iArr;
                mode = i17;
                i20 = TLObject.FLAG_30;
            }
            i17 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i22 = i3;
            z3 = z9;
            i21++;
            z9 = z3;
            iArr4 = iArr2;
            z6 = z13;
            iArr3 = iArr;
            mode = i17;
            i20 = TLObject.FLAG_30;
        }
        boolean z14 = z6;
        int i33 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i34 = i26;
        boolean z15 = z9;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i35 = iArr5[1];
        int max2 = (i35 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i3 : Math.max(i3, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i35, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
        if (z15) {
            i5 = i33;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                this.mTotalLength = 0;
                int i36 = 0;
                while (i36 < virtualChildCount) {
                    View virtualChildAt2 = getVirtualChildAt(i36);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength += measureNullChild(i36);
                    } else if (virtualChildAt2.getVisibility() == 8) {
                        i36 += getChildrenSkipCount(virtualChildAt2, i36);
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                        if (z8) {
                            i14 = max2;
                            this.mTotalLength += ((LinearLayout.LayoutParams) layoutParams2).leftMargin + i25 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + getNextLocationOffset(virtualChildAt2);
                            f = f2;
                            i36++;
                            max2 = i14;
                            f2 = f;
                        } else {
                            i14 = max2;
                            int i37 = this.mTotalLength;
                            f = f2;
                            this.mTotalLength = Math.max(i37, i37 + i25 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + getNextLocationOffset(virtualChildAt2));
                            i36++;
                            max2 = i14;
                            f2 = f;
                        }
                    }
                    i14 = max2;
                    f = f2;
                    i36++;
                    max2 = i14;
                    f2 = f;
                }
            }
            i4 = max2;
        } else {
            i4 = max2;
            i5 = i33;
        }
        float f5 = f2;
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i38 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (z10 || (i38 != 0 && f5 > 0.0f)) {
            float f6 = this.mWeightSum;
            if (f6 > 0.0f) {
                f5 = f6;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.mTotalLength = 0;
            int i39 = i34;
            int i40 = -1;
            int i41 = 0;
            while (i41 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i41);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i10 = resolveSizeAndState;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f7 > 0.0f) {
                        int i42 = (int) ((i38 * f7) / f5);
                        f5 -= f7;
                        i38 -= i42;
                        i10 = resolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i13 = TLObject.FLAG_30;
                            if (i5 == 1073741824) {
                                if (i42 <= 0) {
                                    i42 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i42, TLObject.FLAG_30), childMeasureSpec);
                                i39 = View.combineMeasuredStates(i39, virtualChildAt3.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i13 = TLObject.FLAG_30;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i42;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i13), childMeasureSpec);
                        i39 = View.combineMeasuredStates(i39, virtualChildAt3.getMeasuredState() & (-16777216));
                    } else {
                        i10 = resolveSizeAndState;
                    }
                    if (z8) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + getNextLocationOffset(virtualChildAt3);
                    } else {
                        int i43 = this.mTotalLength;
                        this.mTotalLength = Math.max(i43, virtualChildAt3.getMeasuredWidth() + i43 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z16 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i44 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight3 = virtualChildAt3.getMeasuredHeight() + i44;
                    i40 = Math.max(i40, measuredHeight3);
                    if (!z16) {
                        i44 = measuredHeight3;
                    }
                    int max3 = Math.max(i23, i44);
                    if (z11) {
                        i11 = -1;
                        if (((LinearLayout.LayoutParams) layoutParams3).height == -1) {
                            z = true;
                            if (z14 && (baseline = virtualChildAt3.getBaseline()) != i11) {
                                i12 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                                if (i12 < 0) {
                                    i12 = this.mGravity;
                                }
                                int i45 = (((i12 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i45] = Math.max(iArr5[i45], baseline);
                                iArr6[i45] = Math.max(iArr6[i45], measuredHeight3 - baseline);
                            }
                            i23 = max3;
                            z11 = z;
                        }
                    } else {
                        i11 = -1;
                    }
                    z = false;
                    if (z14) {
                        i12 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i12 < 0) {
                        }
                        int i452 = (((i12 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i452] = Math.max(iArr5[i452], baseline);
                        iArr6[i452] = Math.max(iArr6[i452], measuredHeight3 - baseline);
                    }
                    i23 = max3;
                    z11 = z;
                }
                i41++;
                resolveSizeAndState = i10;
            }
            i6 = resolveSizeAndState;
            i7 = -16777216;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i46 = iArr5[1];
            max = (i46 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i40 : Math.max(i40, Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i46, iArr5[2]))) + Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))));
            i8 = i39;
            i9 = i23;
        } else {
            i9 = Math.max(i23, i24);
            if (z15 && i5 != 1073741824) {
                for (int i47 = 0; i47 < virtualChildCount; i47++) {
                    View virtualChildAt4 = getVirtualChildAt(i47);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i25, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
            }
            i6 = resolveSizeAndState;
            i8 = i34;
            max = i4;
            i7 = -16777216;
        }
        if (!z11 && mode2 != 1073741824) {
            max = i9;
        }
        setMeasuredDimension(i6 | (i8 & i7), View.resolveSizeAndState(Math.max(max + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i8 << 16));
        if (z12) {
            forceUniformHeight(virtualChildCount, i);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    i3 = i2;
                    measureChildWithMargins(virtualChildAt, i3, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i5;
                    i4++;
                    i2 = i3;
                }
            }
            i3 = i2;
            i4++;
            i2 = i3;
        }
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.mGravity;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        if (i10 == 16) {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        } else if (i10 == 80) {
            paddingTop = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
        } else {
            paddingTop = getPaddingTop();
        }
        int i12 = 0;
        while (i12 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(i12);
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i13 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i13 < 0) {
                    i13 = i11;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i13, ViewCompat.getLayoutDirection(this)) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else if (absoluteGravity == 5) {
                    i5 = paddingRight - measuredWidth;
                    i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else {
                    i7 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    int i14 = i7;
                    if (hasDividerBeforeChildAt(i12)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i15 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    setChildFrame(virtualChildAt, i14, i15 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    paddingTop = i15 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(virtualChildAt);
                    i12 += getChildrenSkipCount(virtualChildAt, i12);
                    i12++;
                }
                i7 = i5 - i6;
                int i142 = i7;
                if (hasDividerBeforeChildAt(i12)) {
                }
                int i152 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                setChildFrame(virtualChildAt, i142, i152 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                paddingTop = i152 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + getNextLocationOffset(virtualChildAt);
                i12 += getChildrenSkipCount(virtualChildAt, i12);
                i12++;
            }
            i12++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i15 = i4 - i2;
        int paddingBottom = i15 - getPaddingBottom();
        int paddingBottom2 = (i15 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.mGravity;
        int i17 = i16 & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = GravityCompat.getAbsoluteGravity(8388615 & i16, ViewCompat.getLayoutDirection(this));
        if (absoluteGravity == 1) {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        } else if (absoluteGravity == 5) {
            paddingLeft = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (isLayoutRtl) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i18 = 0;
        while (i18 < virtualChildCount) {
            int i19 = i5 + (i6 * i18);
            int i20 = i18;
            View virtualChildAt = getVirtualChildAt(i19);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i19);
                i8 = i20;
                i7 = paddingTop;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i21 = paddingLeft;
                if (z) {
                    i9 = measuredHeight;
                    if (((LinearLayout.LayoutParams) layoutParams).height != -1) {
                        i10 = virtualChildAt.getBaseline();
                        i11 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i11 < 0) {
                            i11 = i17;
                        }
                        i12 = i11 & 112;
                        i7 = paddingTop;
                        if (i12 != 16) {
                            i13 = i7 + ((paddingBottom2 - i9) / 2) + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            i14 = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        } else {
                            if (i12 == 48) {
                                i13 = i7 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                                if (i10 != -1) {
                                    i13 += iArr[1] - i10;
                                }
                            } else if (i12 != 80) {
                                i13 = i7;
                            } else {
                                i13 = (paddingBottom - i9) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                if (i10 != -1) {
                                    i14 = iArr2[2] - (virtualChildAt.getMeasuredHeight() - i10);
                                }
                            }
                            int i22 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (hasDividerBeforeChildAt(i19) ? i21 + this.mDividerWidth : i21);
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i22, i13, measuredWidth, i9);
                            int nextLocationOffset = i22 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                            i8 = getChildrenSkipCount(virtualChildAt, i19) + i20;
                            paddingLeft = nextLocationOffset;
                        }
                        i13 -= i14;
                        int i222 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (hasDividerBeforeChildAt(i19) ? i21 + this.mDividerWidth : i21);
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i222, i13, measuredWidth, i9);
                        int nextLocationOffset2 = i222 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                        i8 = getChildrenSkipCount(virtualChildAt, i19) + i20;
                        paddingLeft = nextLocationOffset2;
                    }
                } else {
                    i9 = measuredHeight;
                }
                i10 = -1;
                i11 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i11 < 0) {
                }
                i12 = i11 & 112;
                i7 = paddingTop;
                if (i12 != 16) {
                }
                i13 -= i14;
                int i2222 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + (hasDividerBeforeChildAt(i19) ? i21 + this.mDividerWidth : i21);
                setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i2222, i13, measuredWidth, i9);
                int nextLocationOffset22 = i2222 + ((LinearLayout.LayoutParams) layoutParams).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                i8 = getChildrenSkipCount(virtualChildAt, i19) + i20;
                paddingLeft = nextLocationOffset22;
            } else {
                i7 = paddingTop;
                i8 = i20;
            }
            i18 = i8 + 1;
            paddingTop = i7;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
