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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class x1 extends ViewGroup {
    public int A;
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

    public x1(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = f.a.n;
        j4.c E = j4.c.E(context, attributeSet, iArr, i9);
        r0.j0.j(this, context, iArr, attributeSet, (TypedArray) E.c, i9);
        TypedArray typedArray = (TypedArray) E.c;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.h = typedArray.getFloat(4, -1.0f);
        this.b = typedArray.getInt(3, -1);
        this.n = typedArray.getBoolean(7, false);
        setDividerDrawable(E.w(5));
        this.y = typedArray.getInt(8, 0);
        this.A = typedArray.getDimensionPixelSize(6, 0);
        E.G();
    }

    public final void c(Canvas canvas, int i9) {
        this.v.setBounds(getPaddingLeft() + this.A, i9, (getWidth() - getPaddingRight()) - this.A, this.x + i9);
        this.v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w1;
    }

    public final void d(Canvas canvas, int i9) {
        this.v.setBounds(i9, getPaddingTop() + this.A, this.w + i9, (getHeight() - getPaddingBottom()) - this.A);
        this.v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public w1 generateDefaultLayoutParams() {
        int i9 = this.d;
        if (i9 == 0) {
            return new w1(-2, -2);
        }
        if (i9 == 1) {
            return new w1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public w1 generateLayoutParams(AttributeSet attributeSet) {
        return new w1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public w1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new w1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i9;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.b;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i11 = this.c;
        if (this.d == 1 && (i9 = this.e & 112) != 48) {
            if (i9 == 16) {
                i11 = j3.r0.d(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f, 2, i11);
            } else if (i9 == 80) {
                i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return i11 + ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.v;
    }

    public int getDividerPadding() {
        return this.A;
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

    public final boolean h(int i9) {
        if (i9 == 0) {
            return (this.y & 1) != 0;
        }
        if (i9 == getChildCount()) {
            return (this.y & 4) != 0;
        }
        if ((this.y & 2) != 0) {
            for (int i10 = i9 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
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
        int i9;
        if (this.v == null) {
            return;
        }
        int i10 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && h(i10)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin) - this.x);
                }
                i10++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.x : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((w1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = w3.a(this);
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i10)) {
                w1 w1Var = (w1) childAt3.getLayoutParams();
                d(canvas, a2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) w1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) w1Var).leftMargin) - this.w);
            }
            i10++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                w1 w1Var2 = (w1) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                    i9 = this.w;
                    right = left - i9;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
                }
            } else if (a2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i9 = this.w;
                right = left - i9;
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

    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        char c10;
        int d;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int d9;
        int i21 = 8;
        if (this.d == 1) {
            int paddingLeft = getPaddingLeft();
            int i22 = i11 - i9;
            int paddingRight = i22 - getPaddingRight();
            int paddingRight2 = (i22 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i23 = this.e;
            int i24 = i23 & 112;
            int i25 = 8388615 & i23;
            int paddingTop = i24 != 16 ? i24 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.f : j3.r0.d(i12 - i10, this.f, 2, getPaddingTop());
            int i26 = 0;
            while (i26 < virtualChildCount) {
                View childAt = getChildAt(i26);
                if (childAt != null && childAt.getVisibility() != i21) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    w1 w1Var = (w1) childAt.getLayoutParams();
                    int i27 = ((LinearLayout.LayoutParams) w1Var).gravity;
                    if (i27 < 0) {
                        i27 = i25;
                    }
                    WeakHashMap weakHashMap = r0.j0.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i27, getLayoutDirection()) & 7;
                    int d10 = absoluteGravity != 1 ? absoluteGravity != 5 ? ((LinearLayout.LayoutParams) w1Var).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) w1Var).rightMargin : (j3.r0.d(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) w1Var).leftMargin) - ((LinearLayout.LayoutParams) w1Var).rightMargin;
                    if (h(i26)) {
                        paddingTop += this.x;
                    }
                    int i28 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                    childAt.layout(d10, i28, measuredWidth + d10, i28 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i28;
                }
                i26++;
                i21 = 8;
            }
            return;
        }
        boolean a2 = w3.a(this);
        int paddingTop2 = getPaddingTop();
        int i29 = i12 - i10;
        int paddingBottom = i29 - getPaddingBottom();
        int paddingBottom2 = (i29 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i30 = this.e;
        int i31 = 8388615 & i30;
        int i32 = i30 & 112;
        boolean z11 = this.a;
        int[] iArr = this.r;
        int[] iArr2 = this.s;
        WeakHashMap weakHashMap2 = r0.j0.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i31, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            d = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i9) - this.f;
            c10 = 1;
        } else {
            c10 = 1;
            d = j3.r0.d(i11 - i9, this.f, 2, getPaddingLeft());
        }
        if (a2) {
            i13 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i13 = 0;
            i14 = 1;
        }
        int i33 = 0;
        while (i33 < virtualChildCount2) {
            int i34 = (i14 * i33) + i13;
            View childAt2 = getChildAt(i34);
            if (childAt2 == null) {
                i15 = i13;
            } else {
                i15 = i13;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i35 = d;
                    w1 w1Var2 = (w1) childAt2.getLayoutParams();
                    if (z11) {
                        i16 = i14;
                        if (((LinearLayout.LayoutParams) w1Var2).height != -1) {
                            i17 = childAt2.getBaseline();
                            i18 = ((LinearLayout.LayoutParams) w1Var2).gravity;
                            if (i18 < 0) {
                                i18 = i32;
                            }
                            i19 = i18 & 112;
                            i20 = i33;
                            if (i19 != 16) {
                                d9 = (j3.r0.d(paddingBottom2, measuredHeight2, 2, paddingTop2) + ((LinearLayout.LayoutParams) w1Var2).topMargin) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                            } else if (i19 == 48) {
                                d9 = ((LinearLayout.LayoutParams) w1Var2).topMargin + paddingTop2;
                                if (i17 != -1) {
                                    d9 = (iArr[c10] - i17) + d9;
                                }
                            } else if (i19 != 80) {
                                d9 = paddingTop2;
                            } else {
                                d9 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                                if (i17 != -1) {
                                    d9 -= iArr2[2] - (childAt2.getMeasuredHeight() - i17);
                                }
                            }
                            int i36 = (!h(i34) ? i35 + this.w : i35) + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                            childAt2.layout(i36, d9, i36 + measuredWidth2, measuredHeight2 + d9);
                            d = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i36;
                            i33 = i20 + 1;
                            i14 = i16;
                            i13 = i15;
                        }
                    } else {
                        i16 = i14;
                    }
                    i17 = -1;
                    i18 = ((LinearLayout.LayoutParams) w1Var2).gravity;
                    if (i18 < 0) {
                    }
                    i19 = i18 & 112;
                    i20 = i33;
                    if (i19 != 16) {
                    }
                    int i362 = (!h(i34) ? i35 + this.w : i35) + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                    childAt2.layout(i362, d9, i362 + measuredWidth2, measuredHeight2 + d9);
                    d = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i362;
                    i33 = i20 + 1;
                    i14 = i16;
                    i13 = i15;
                }
            }
            i16 = i14;
            i20 = i33;
            i33 = i20 + 1;
            i14 = i16;
            i13 = i15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int baseline;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        boolean z11;
        boolean z12;
        w1 w1Var;
        int i20;
        int[] iArr2;
        int i21;
        View view;
        int i22;
        boolean z13;
        boolean z14;
        int max;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z15;
        int i31;
        int i32;
        int i33;
        View view2;
        boolean z16;
        boolean z17;
        x1 x1Var = this;
        int i34 = x1Var.d;
        int i35 = -2;
        int i36 = 0;
        int i37 = TLObject.FLAG_30;
        int i38 = 8;
        if (i34 == 1) {
            x1Var.f = 0;
            int virtualChildCount = x1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i9);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i39 = x1Var.b;
            boolean z18 = x1Var.n;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            float f10 = 0.0f;
            boolean z19 = false;
            int i44 = 0;
            boolean z20 = false;
            boolean z21 = true;
            while (i40 < virtualChildCount) {
                int i45 = mode;
                View childAt = x1Var.getChildAt(i40);
                if (childAt == null) {
                    x1Var.f = x1Var.f;
                } else if (childAt.getVisibility() != i38) {
                    if (x1Var.h(i40)) {
                        x1Var.f += x1Var.x;
                    }
                    w1 w1Var2 = (w1) childAt.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) w1Var2).weight;
                    f10 += f11;
                    if (mode2 == i37 && ((LinearLayout.LayoutParams) w1Var2).height == 0 && f11 > 0.0f) {
                        int i46 = x1Var.f;
                        x1Var.f = Math.max(i46, ((LinearLayout.LayoutParams) w1Var2).topMargin + i46 + ((LinearLayout.LayoutParams) w1Var2).bottomMargin);
                        view2 = childAt;
                        i30 = mode2;
                        i31 = i39;
                        z15 = z18;
                        i32 = i40;
                        i33 = i45;
                        z19 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) w1Var2).height != 0 || f11 <= 0.0f) {
                            i27 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) w1Var2).height = i35;
                            i27 = 0;
                        }
                        if (f10 == 0.0f) {
                            i28 = i40;
                            i29 = x1Var.f;
                        } else {
                            i28 = i40;
                            i29 = 0;
                        }
                        i30 = mode2;
                        z15 = z18;
                        i31 = i39;
                        i32 = i28;
                        i33 = i45;
                        x1Var.measureChildWithMargins(childAt, i9, 0, i10, i29);
                        if (i27 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) w1Var2).height = i27;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i47 = x1Var.f;
                        view2 = childAt;
                        x1Var.f = Math.max(i47, i47 + measuredHeight + ((LinearLayout.LayoutParams) w1Var2).topMargin + ((LinearLayout.LayoutParams) w1Var2).bottomMargin);
                        if (z15) {
                            i43 = Math.max(measuredHeight, i43);
                        }
                    }
                    if (i31 >= 0 && i31 == i32 + 1) {
                        x1Var.c = x1Var.f;
                    }
                    if (i32 < i31 && ((LinearLayout.LayoutParams) w1Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i33 == 1073741824 || ((LinearLayout.LayoutParams) w1Var2).width != -1) {
                        z16 = false;
                    } else {
                        z16 = true;
                        z20 = true;
                    }
                    int i48 = ((LinearLayout.LayoutParams) w1Var2).leftMargin + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i48;
                    i36 = Math.max(i36, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z22 = z16;
                    int combineMeasuredStates = View.combineMeasuredStates(i44, measuredState);
                    if (z21) {
                        i44 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) w1Var2).width == -1) {
                            z17 = true;
                            if (((LinearLayout.LayoutParams) w1Var2).weight <= 0.0f) {
                                if (!z22) {
                                    i48 = measuredWidth;
                                }
                                i42 = Math.max(i42, i48);
                            } else {
                                if (!z22) {
                                    i48 = measuredWidth;
                                }
                                i41 = Math.max(i41, i48);
                            }
                            z21 = z17;
                            i40 = i32 + 1;
                            i39 = i31;
                            mode = i33;
                            z18 = z15;
                            mode2 = i30;
                            i35 = -2;
                            i37 = TLObject.FLAG_30;
                            i38 = 8;
                        }
                    } else {
                        i44 = combineMeasuredStates;
                    }
                    z17 = false;
                    if (((LinearLayout.LayoutParams) w1Var2).weight <= 0.0f) {
                    }
                    z21 = z17;
                    i40 = i32 + 1;
                    i39 = i31;
                    mode = i33;
                    z18 = z15;
                    mode2 = i30;
                    i35 = -2;
                    i37 = TLObject.FLAG_30;
                    i38 = 8;
                }
                i30 = mode2;
                i31 = i39;
                z15 = z18;
                i32 = i40;
                i33 = i45;
                i40 = i32 + 1;
                i39 = i31;
                mode = i33;
                z18 = z15;
                mode2 = i30;
                i35 = -2;
                i37 = TLObject.FLAG_30;
                i38 = 8;
            }
            int i49 = mode;
            int i50 = mode2;
            boolean z23 = z18;
            int i51 = i44;
            int i52 = i10;
            if (x1Var.f > 0 && x1Var.h(virtualChildCount)) {
                x1Var.f += x1Var.x;
            }
            if (z23 && (i50 == Integer.MIN_VALUE || i50 == 0)) {
                x1Var.f = 0;
                for (int i53 = 0; i53 < virtualChildCount; i53++) {
                    View childAt2 = x1Var.getChildAt(i53);
                    if (childAt2 == null) {
                        x1Var.f = x1Var.f;
                    } else if (childAt2.getVisibility() != 8) {
                        w1 w1Var3 = (w1) childAt2.getLayoutParams();
                        int i54 = x1Var.f;
                        x1Var.f = Math.max(i54, i54 + i43 + ((LinearLayout.LayoutParams) w1Var3).topMargin + ((LinearLayout.LayoutParams) w1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = x1Var.getPaddingBottom() + x1Var.getPaddingTop() + x1Var.f;
            x1Var.f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, x1Var.getSuggestedMinimumHeight()), i52, 0);
            int i55 = (resolveSizeAndState & 16777215) - x1Var.f;
            if (z19 || (i55 != 0 && f10 > 0.0f)) {
                float f12 = x1Var.h;
                if (f12 > 0.0f) {
                    f10 = f12;
                }
                x1Var.f = 0;
                int i56 = i51;
                int i57 = 0;
                while (i57 < virtualChildCount) {
                    View childAt3 = x1Var.getChildAt(i57);
                    if (childAt3.getVisibility() == 8) {
                        i24 = i57;
                    } else {
                        w1 w1Var4 = (w1) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) w1Var4).weight;
                        if (f13 > 0.0f) {
                            int i58 = (int) ((i55 * f13) / f10);
                            f10 -= f13;
                            i55 -= i58;
                            i24 = i57;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, x1Var.getPaddingRight() + x1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) w1Var4).leftMargin + ((LinearLayout.LayoutParams) w1Var4).rightMargin, ((LinearLayout.LayoutParams) w1Var4).width);
                            if (((LinearLayout.LayoutParams) w1Var4).height == 0) {
                                i26 = TLObject.FLAG_30;
                                if (i50 == 1073741824) {
                                    if (i58 <= 0) {
                                        i58 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i58, TLObject.FLAG_30));
                                    i56 = View.combineMeasuredStates(i56, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i26 = TLObject.FLAG_30;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i58;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i26));
                            i56 = View.combineMeasuredStates(i56, childAt3.getMeasuredState() & (-256));
                        } else {
                            i24 = i57;
                        }
                        int i59 = ((LinearLayout.LayoutParams) w1Var4).leftMargin + ((LinearLayout.LayoutParams) w1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i59;
                        i36 = Math.max(i36, measuredWidth2);
                        if (i49 != 1073741824) {
                            i25 = -1;
                            if (((LinearLayout.LayoutParams) w1Var4).width == -1) {
                                measuredWidth2 = i59;
                            }
                        } else {
                            i25 = -1;
                        }
                        i41 = Math.max(i41, measuredWidth2);
                        boolean z24 = z21 && ((LinearLayout.LayoutParams) w1Var4).width == i25;
                        int i60 = x1Var.f;
                        x1Var.f = Math.max(i60, childAt3.getMeasuredHeight() + i60 + ((LinearLayout.LayoutParams) w1Var4).topMargin + ((LinearLayout.LayoutParams) w1Var4).bottomMargin);
                        z21 = z24;
                    }
                    i57 = i24 + 1;
                }
                x1Var.f = x1Var.getPaddingBottom() + x1Var.getPaddingTop() + x1Var.f;
                i51 = i56;
            } else {
                i41 = Math.max(i41, i42);
                if (z23 && i50 != 1073741824) {
                    for (int i61 = 0; i61 < virtualChildCount; i61++) {
                        View childAt4 = x1Var.getChildAt(i61);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((w1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i43, TLObject.FLAG_30));
                        }
                    }
                }
            }
            if (z21 || i49 == 1073741824) {
                i41 = i36;
            }
            x1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(x1Var.getPaddingRight() + x1Var.getPaddingLeft() + i41, x1Var.getSuggestedMinimumWidth()), i9, i51), resolveSizeAndState);
            if (z20) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(x1Var.getMeasuredWidth(), TLObject.FLAG_30);
                int i62 = 0;
                while (i62 < virtualChildCount) {
                    View childAt5 = x1Var.getChildAt(i62);
                    if (childAt5.getVisibility() != 8) {
                        w1 w1Var5 = (w1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) w1Var5).width == -1) {
                            int i63 = ((LinearLayout.LayoutParams) w1Var5).height;
                            ((LinearLayout.LayoutParams) w1Var5).height = childAt5.getMeasuredHeight();
                            x1Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i52, 0);
                            ((LinearLayout.LayoutParams) w1Var5).height = i63;
                        }
                    }
                    i62++;
                    i52 = i10;
                }
                return;
            }
            return;
        }
        int i64 = i9;
        x1Var.f = 0;
        int virtualChildCount2 = x1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i64);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (x1Var.r == null || x1Var.s == null) {
            x1Var.r = new int[4];
            x1Var.s = new int[4];
        }
        int[] iArr3 = x1Var.r;
        int[] iArr4 = x1Var.s;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z25 = x1Var.a;
        boolean z26 = x1Var.n;
        boolean z27 = mode3 == 1073741824;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        boolean z28 = false;
        boolean z29 = false;
        float f14 = 0.0f;
        boolean z30 = true;
        while (i65 < virtualChildCount2) {
            View childAt6 = x1Var.getChildAt(i65);
            if (childAt6 == null) {
                x1Var.f = x1Var.f;
                i19 = i65;
                i23 = i67;
                iArr2 = iArr3;
                iArr = iArr4;
                z11 = z25;
                z12 = z26;
            } else {
                int i71 = i66;
                if (childAt6.getVisibility() == 8) {
                    i64 = i9;
                    i19 = i65;
                    i23 = i67;
                    iArr = iArr4;
                    z11 = z25;
                    z12 = z26;
                    i66 = i71;
                    iArr2 = iArr3;
                } else {
                    if (x1Var.h(i65)) {
                        x1Var.f += x1Var.w;
                    }
                    w1 w1Var6 = (w1) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) w1Var6).weight;
                    f14 += f15;
                    int i72 = i65;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) w1Var6).width == 0 && f15 > 0.0f) {
                        if (z27) {
                            x1Var.f = ((LinearLayout.LayoutParams) w1Var6).leftMargin + ((LinearLayout.LayoutParams) w1Var6).rightMargin + x1Var.f;
                        } else {
                            int i73 = x1Var.f;
                            x1Var.f = Math.max(i73, ((LinearLayout.LayoutParams) w1Var6).leftMargin + i73 + ((LinearLayout.LayoutParams) w1Var6).rightMargin);
                        }
                        if (z25) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            i20 = i71;
                            i19 = i72;
                            w1Var = w1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i64 = i9;
                            i21 = i67;
                            i18 = i68;
                        } else {
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            i20 = i71;
                            i19 = i72;
                            i22 = TLObject.FLAG_30;
                            z29 = true;
                            w1Var = w1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i64 = i9;
                            i21 = i67;
                            i18 = i68;
                            if (mode4 == i22 && ((LinearLayout.LayoutParams) w1Var).height == -1) {
                                z13 = true;
                                z28 = true;
                            } else {
                                z13 = false;
                            }
                            int i74 = ((LinearLayout.LayoutParams) w1Var).topMargin + ((LinearLayout.LayoutParams) w1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i74;
                            i70 = View.combineMeasuredStates(i70, view.getMeasuredState());
                            if (z11) {
                                z14 = z13;
                            } else {
                                int baseline2 = view.getBaseline();
                                z14 = z13;
                                if (baseline2 != -1) {
                                    int i75 = ((LinearLayout.LayoutParams) w1Var).gravity;
                                    if (i75 < 0) {
                                        i75 = x1Var.e;
                                    }
                                    int i76 = (((i75 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i76] = Math.max(iArr2[i76], baseline2);
                                    iArr[i76] = Math.max(iArr[i76], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i20, measuredHeight3);
                            boolean z31 = !z30 && ((LinearLayout.LayoutParams) w1Var).height == -1;
                            if (((LinearLayout.LayoutParams) w1Var).weight <= 0.0f) {
                                if (!z14) {
                                    i74 = measuredHeight3;
                                }
                                i68 = Math.max(i18, i74);
                                max = i21;
                            } else {
                                if (!z14) {
                                    i74 = measuredHeight3;
                                }
                                max = Math.max(i21, i74);
                                i68 = i18;
                            }
                            int i77 = max;
                            i66 = max2;
                            i23 = i77;
                            z30 = z31;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) w1Var6).width != 0 || f15 <= 0.0f) {
                            i17 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) w1Var6).width = -2;
                            i17 = 0;
                        }
                        iArr = iArr4;
                        i18 = i68;
                        i19 = i72;
                        z11 = z25;
                        z12 = z26;
                        int i78 = i17;
                        w1Var = w1Var6;
                        i20 = i71;
                        i64 = i9;
                        iArr2 = iArr3;
                        i21 = i67;
                        x1Var.measureChildWithMargins(childAt6, i64, f14 == 0.0f ? x1Var.f : 0, i10, 0);
                        if (i78 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) w1Var).width = i78;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z27) {
                            view = childAt6;
                            x1Var.f = ((LinearLayout.LayoutParams) w1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) w1Var).rightMargin + x1Var.f;
                        } else {
                            view = childAt6;
                            int i79 = x1Var.f;
                            x1Var.f = Math.max(i79, i79 + measuredWidth3 + ((LinearLayout.LayoutParams) w1Var).leftMargin + ((LinearLayout.LayoutParams) w1Var).rightMargin);
                        }
                        if (z12) {
                            i69 = Math.max(measuredWidth3, i69);
                        }
                    }
                    i22 = TLObject.FLAG_30;
                    if (mode4 == i22) {
                    }
                    z13 = false;
                    int i742 = ((LinearLayout.LayoutParams) w1Var).topMargin + ((LinearLayout.LayoutParams) w1Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i742;
                    i70 = View.combineMeasuredStates(i70, view.getMeasuredState());
                    if (z11) {
                    }
                    int max22 = Math.max(i20, measuredHeight32);
                    if (z30) {
                    }
                    if (((LinearLayout.LayoutParams) w1Var).weight <= 0.0f) {
                    }
                    int i772 = max;
                    i66 = max22;
                    i23 = i772;
                    z30 = z31;
                }
            }
            i67 = i23;
            i65 = i19 + 1;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z11;
            z26 = z12;
        }
        int i80 = i66;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        boolean z32 = z25;
        boolean z33 = z26;
        int i81 = i67;
        int i82 = i68;
        if (x1Var.f > 0 && x1Var.h(virtualChildCount2)) {
            x1Var.f += x1Var.w;
        }
        int i83 = iArr5[1];
        int max3 = (i83 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i80 : Math.max(i80, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i83, iArr5[2]))));
        if (z33 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            x1Var.f = 0;
            for (int i84 = 0; i84 < virtualChildCount2; i84++) {
                View childAt7 = x1Var.getChildAt(i84);
                if (childAt7 == null) {
                    x1Var.f = x1Var.f;
                } else if (childAt7.getVisibility() != 8) {
                    w1 w1Var7 = (w1) childAt7.getLayoutParams();
                    if (z27) {
                        x1Var.f = ((LinearLayout.LayoutParams) w1Var7).leftMargin + i69 + ((LinearLayout.LayoutParams) w1Var7).rightMargin + x1Var.f;
                    } else {
                        int i85 = x1Var.f;
                        x1Var.f = Math.max(i85, i85 + i69 + ((LinearLayout.LayoutParams) w1Var7).leftMargin + ((LinearLayout.LayoutParams) w1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = x1Var.getPaddingRight() + x1Var.getPaddingLeft() + x1Var.f;
        x1Var.f = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, x1Var.getSuggestedMinimumWidth()), i64, 0);
        int i86 = (resolveSizeAndState2 & 16777215) - x1Var.f;
        if (z29 || (i86 != 0 && f14 > 0.0f)) {
            float f16 = x1Var.h;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            x1Var.f = 0;
            max3 = -1;
            int i87 = 0;
            while (i87 < virtualChildCount2) {
                View childAt8 = x1Var.getChildAt(i87);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i14 = resolveSizeAndState2;
                } else {
                    w1 w1Var8 = (w1) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) w1Var8).weight;
                    if (f17 > 0.0f) {
                        int i88 = (int) ((i86 * f17) / f14);
                        f14 -= f17;
                        i86 -= i88;
                        i14 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, x1Var.getPaddingBottom() + x1Var.getPaddingTop() + ((LinearLayout.LayoutParams) w1Var8).topMargin + ((LinearLayout.LayoutParams) w1Var8).bottomMargin, ((LinearLayout.LayoutParams) w1Var8).height);
                        if (((LinearLayout.LayoutParams) w1Var8).width == 0) {
                            i16 = TLObject.FLAG_30;
                            if (mode3 == 1073741824) {
                                if (i88 <= 0) {
                                    i88 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i88, TLObject.FLAG_30), childMeasureSpec2);
                                i70 = View.combineMeasuredStates(i70, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i16 = TLObject.FLAG_30;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i88;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i16), childMeasureSpec2);
                        i70 = View.combineMeasuredStates(i70, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i14 = resolveSizeAndState2;
                    }
                    if (z27) {
                        x1Var.f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) w1Var8).leftMargin + ((LinearLayout.LayoutParams) w1Var8).rightMargin + x1Var.f;
                    } else {
                        int i89 = x1Var.f;
                        x1Var.f = Math.max(i89, childAt8.getMeasuredWidth() + i89 + ((LinearLayout.LayoutParams) w1Var8).leftMargin + ((LinearLayout.LayoutParams) w1Var8).rightMargin);
                    }
                    boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) w1Var8).height == -1;
                    int i90 = ((LinearLayout.LayoutParams) w1Var8).topMargin + ((LinearLayout.LayoutParams) w1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i90;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z34) {
                        i90 = measuredHeight4;
                    }
                    int max4 = Math.max(i81, i90);
                    if (z30) {
                        i15 = -1;
                        if (((LinearLayout.LayoutParams) w1Var8).height == -1) {
                            z10 = true;
                            if (!z32 && (baseline = childAt8.getBaseline()) != i15) {
                                int i91 = ((LinearLayout.LayoutParams) w1Var8).gravity;
                                if (i91 < 0) {
                                    i91 = x1Var.e;
                                }
                                int i92 = (((i91 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i92] = Math.max(iArr5[i92], baseline);
                                iArr6[i92] = Math.max(iArr6[i92], measuredHeight4 - baseline);
                            }
                            z30 = z10;
                            i81 = max4;
                        }
                    } else {
                        i15 = -1;
                    }
                    z10 = false;
                    if (!z32) {
                    }
                    z30 = z10;
                    i81 = max4;
                }
                i87++;
                resolveSizeAndState2 = i14;
            }
            i11 = resolveSizeAndState2;
            i12 = -16777216;
            x1Var.f = x1Var.getPaddingRight() + x1Var.getPaddingLeft() + x1Var.f;
            int i93 = iArr5[1];
            if (i93 != -1 || iArr5[0] != -1 || iArr5[2] != -1 || iArr5[3] != -1) {
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i93, iArr5[2]))));
            }
            i13 = i81;
        } else {
            i13 = Math.max(i81, i82);
            if (z33 && mode3 != 1073741824) {
                for (int i94 = 0; i94 < virtualChildCount2; i94++) {
                    View childAt9 = x1Var.getChildAt(i94);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((w1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i69, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
            }
            i11 = resolveSizeAndState2;
            i12 = -16777216;
        }
        if (!z30 && mode4 != 1073741824) {
            max3 = i13;
        }
        x1Var.setMeasuredDimension(i11 | (i70 & i12), View.resolveSizeAndState(Math.max(x1Var.getPaddingBottom() + x1Var.getPaddingTop() + max3, x1Var.getSuggestedMinimumHeight()), i10, i70 << 16));
        if (z28) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(x1Var.getMeasuredHeight(), TLObject.FLAG_30);
            int i95 = 0;
            while (i95 < virtualChildCount2) {
                View childAt10 = x1Var.getChildAt(i95);
                if (childAt10.getVisibility() != 8) {
                    w1 w1Var9 = (w1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) w1Var9).height == -1) {
                        int i96 = ((LinearLayout.LayoutParams) w1Var9).width;
                        ((LinearLayout.LayoutParams) w1Var9).width = childAt10.getMeasuredWidth();
                        x1Var.measureChildWithMargins(childAt10, i64, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) w1Var9).width = i96;
                    }
                }
                i95++;
                x1Var = this;
                i64 = i9;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.a = z10;
    }

    public void setBaselineAlignedChildIndex(int i9) {
        if (i9 >= 0 && i9 < getChildCount()) {
            this.b = i9;
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

    public void setDividerPadding(int i9) {
        this.A = i9;
    }

    public void setGravity(int i9) {
        if (this.e != i9) {
            if ((8388615 & i9) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            this.e = i9;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i9) {
        int i10 = i9 & 8388615;
        int i11 = this.e;
        if ((8388615 & i11) != i10) {
            this.e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.n = z10;
    }

    public void setOrientation(int i9) {
        if (this.d != i9) {
            this.d = i9;
            requestLayout();
        }
    }

    public void setShowDividers(int i9) {
        if (i9 != this.y) {
            requestLayout();
        }
        this.y = i9;
    }

    public void setVerticalGravity(int i9) {
        int i10 = i9 & 112;
        int i11 = this.e;
        if ((i11 & 112) != i10) {
            this.e = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.h = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
