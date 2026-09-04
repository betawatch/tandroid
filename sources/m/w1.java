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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        aa.a y3 = aa.a.y(context, attributeSet, iArr, i10);
        r0.i0.j(this, context, iArr, attributeSet, (TypedArray) y3.c, i10);
        TypedArray typedArray = (TypedArray) y3.c;
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
        setDividerDrawable(y3.r(5));
        this.y = typedArray.getInt(8, 0);
        this.E = typedArray.getDimensionPixelSize(6, 0);
        y3.A();
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
                i12 = i2.g.C(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f, 2, i12);
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
        boolean a2 = s3.a(this);
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

    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        char c10;
        int C;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int C2;
        int i22 = 8;
        if (this.d == 1) {
            int paddingLeft = getPaddingLeft();
            int i23 = i12 - i10;
            int paddingRight = i23 - getPaddingRight();
            int paddingRight2 = (i23 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i24 = this.e;
            int i25 = i24 & 112;
            int i26 = 8388615 & i24;
            int paddingTop = i25 != 16 ? i25 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f : i2.g.C(i13 - i11, this.f, 2, getPaddingTop());
            int i27 = 0;
            while (i27 < virtualChildCount) {
                View childAt = getChildAt(i27);
                if (childAt != null && childAt.getVisibility() != i22) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    v1 v1Var = (v1) childAt.getLayoutParams();
                    int i28 = ((LinearLayout.LayoutParams) v1Var).gravity;
                    if (i28 < 0) {
                        i28 = i26;
                    }
                    WeakHashMap weakHashMap = r0.i0.a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i28, getLayoutDirection()) & 7;
                    int C3 = absoluteGravity != 1 ? absoluteGravity != 5 ? ((LinearLayout.LayoutParams) v1Var).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) v1Var).rightMargin : (i2.g.C(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) v1Var).leftMargin) - ((LinearLayout.LayoutParams) v1Var).rightMargin;
                    if (h(i27)) {
                        paddingTop += this.x;
                    }
                    int i29 = paddingTop + ((LinearLayout.LayoutParams) v1Var).topMargin;
                    childAt.layout(C3, i29, measuredWidth + C3, i29 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) v1Var).bottomMargin + i29;
                }
                i27++;
                i22 = 8;
            }
            return;
        }
        boolean a2 = s3.a(this);
        int paddingTop2 = getPaddingTop();
        int i30 = i13 - i11;
        int paddingBottom = i30 - getPaddingBottom();
        int paddingBottom2 = (i30 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i31 = this.e;
        int i32 = 8388615 & i31;
        int i33 = i31 & 112;
        boolean z11 = this.a;
        int[] iArr = this.r;
        int[] iArr2 = this.s;
        WeakHashMap weakHashMap2 = r0.i0.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i32, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            C = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f;
            c10 = 1;
        } else {
            c10 = 1;
            C = i2.g.C(i12 - i10, this.f, 2, getPaddingLeft());
        }
        if (a2) {
            i14 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i34 = 0;
        while (i34 < virtualChildCount2) {
            int i35 = (i15 * i34) + i14;
            View childAt2 = getChildAt(i35);
            if (childAt2 == null) {
                i16 = i14;
            } else {
                i16 = i14;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i36 = C;
                    v1 v1Var2 = (v1) childAt2.getLayoutParams();
                    if (z11) {
                        i17 = i15;
                        if (((LinearLayout.LayoutParams) v1Var2).height != -1) {
                            i18 = childAt2.getBaseline();
                            i19 = ((LinearLayout.LayoutParams) v1Var2).gravity;
                            if (i19 < 0) {
                                i19 = i33;
                            }
                            i20 = i19 & 112;
                            i21 = i34;
                            if (i20 != 16) {
                                C2 = (i2.g.C(paddingBottom2, measuredHeight2, 2, paddingTop2) + ((LinearLayout.LayoutParams) v1Var2).topMargin) - ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                            } else if (i20 == 48) {
                                C2 = ((LinearLayout.LayoutParams) v1Var2).topMargin + paddingTop2;
                                if (i18 != -1) {
                                    C2 = (iArr[c10] - i18) + C2;
                                }
                            } else if (i20 != 80) {
                                C2 = paddingTop2;
                            } else {
                                C2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                                if (i18 != -1) {
                                    C2 -= iArr2[2] - (childAt2.getMeasuredHeight() - i18);
                                }
                            }
                            int i37 = (!h(i35) ? i36 + this.w : i36) + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                            childAt2.layout(i37, C2, i37 + measuredWidth2, measuredHeight2 + C2);
                            C = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i37;
                            i34 = i21 + 1;
                            i15 = i17;
                            i14 = i16;
                        }
                    } else {
                        i17 = i15;
                    }
                    i18 = -1;
                    i19 = ((LinearLayout.LayoutParams) v1Var2).gravity;
                    if (i19 < 0) {
                    }
                    i20 = i19 & 112;
                    i21 = i34;
                    if (i20 != 16) {
                    }
                    int i372 = (!h(i35) ? i36 + this.w : i36) + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                    childAt2.layout(i372, C2, i372 + measuredWidth2, measuredHeight2 + C2);
                    C = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i372;
                    i34 = i21 + 1;
                    i15 = i17;
                    i14 = i16;
                }
            }
            i17 = i15;
            i21 = i34;
            i34 = i21 + 1;
            i15 = i17;
            i14 = i16;
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
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        int baseline;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int i20;
        boolean z11;
        boolean z12;
        v1 v1Var;
        int i21;
        int[] iArr2;
        int i22;
        View view;
        int i23;
        boolean z13;
        boolean z14;
        int max;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z15;
        int i32;
        int i33;
        int i34;
        View view2;
        boolean z16;
        boolean z17;
        w1 w1Var = this;
        int i35 = w1Var.d;
        int i36 = -2;
        int i37 = 0;
        int i38 = TLObject.FLAG_30;
        int i39 = 8;
        if (i35 == 1) {
            w1Var.f = 0;
            int virtualChildCount = w1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i40 = w1Var.b;
            boolean z18 = w1Var.n;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            float f7 = 0.0f;
            boolean z19 = false;
            int i45 = 0;
            boolean z20 = false;
            boolean z21 = true;
            while (i41 < virtualChildCount) {
                int i46 = mode;
                View childAt = w1Var.getChildAt(i41);
                if (childAt == null) {
                    w1Var.f = w1Var.f;
                } else if (childAt.getVisibility() != i39) {
                    if (w1Var.h(i41)) {
                        w1Var.f += w1Var.x;
                    }
                    v1 v1Var2 = (v1) childAt.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) v1Var2).weight;
                    f7 += f10;
                    if (mode2 == i38 && ((LinearLayout.LayoutParams) v1Var2).height == 0 && f10 > 0.0f) {
                        int i47 = w1Var.f;
                        w1Var.f = Math.max(i47, ((LinearLayout.LayoutParams) v1Var2).topMargin + i47 + ((LinearLayout.LayoutParams) v1Var2).bottomMargin);
                        view2 = childAt;
                        i31 = mode2;
                        i32 = i40;
                        z15 = z18;
                        i33 = i41;
                        i34 = i46;
                        z19 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) v1Var2).height != 0 || f10 <= 0.0f) {
                            i28 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) v1Var2).height = i36;
                            i28 = 0;
                        }
                        if (f7 == 0.0f) {
                            i29 = i41;
                            i30 = w1Var.f;
                        } else {
                            i29 = i41;
                            i30 = 0;
                        }
                        i31 = mode2;
                        z15 = z18;
                        i32 = i40;
                        i33 = i29;
                        i34 = i46;
                        w1Var.measureChildWithMargins(childAt, i10, 0, i11, i30);
                        if (i28 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) v1Var2).height = i28;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i48 = w1Var.f;
                        view2 = childAt;
                        w1Var.f = Math.max(i48, i48 + measuredHeight + ((LinearLayout.LayoutParams) v1Var2).topMargin + ((LinearLayout.LayoutParams) v1Var2).bottomMargin);
                        if (z15) {
                            i44 = Math.max(measuredHeight, i44);
                        }
                    }
                    if (i32 >= 0 && i32 == i33 + 1) {
                        w1Var.c = w1Var.f;
                    }
                    if (i33 < i32 && ((LinearLayout.LayoutParams) v1Var2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i34 == 1073741824 || ((LinearLayout.LayoutParams) v1Var2).width != -1) {
                        z16 = false;
                    } else {
                        z16 = true;
                        z20 = true;
                    }
                    int i49 = ((LinearLayout.LayoutParams) v1Var2).leftMargin + ((LinearLayout.LayoutParams) v1Var2).rightMargin;
                    int measuredWidth = view2.getMeasuredWidth() + i49;
                    i37 = Math.max(i37, measuredWidth);
                    int measuredState = view2.getMeasuredState();
                    boolean z22 = z16;
                    int combineMeasuredStates = View.combineMeasuredStates(i45, measuredState);
                    if (z21) {
                        i45 = combineMeasuredStates;
                        if (((LinearLayout.LayoutParams) v1Var2).width == -1) {
                            z17 = true;
                            if (((LinearLayout.LayoutParams) v1Var2).weight <= 0.0f) {
                                if (!z22) {
                                    i49 = measuredWidth;
                                }
                                i43 = Math.max(i43, i49);
                            } else {
                                if (!z22) {
                                    i49 = measuredWidth;
                                }
                                i42 = Math.max(i42, i49);
                            }
                            z21 = z17;
                            i41 = i33 + 1;
                            i40 = i32;
                            mode = i34;
                            z18 = z15;
                            mode2 = i31;
                            i36 = -2;
                            i38 = TLObject.FLAG_30;
                            i39 = 8;
                        }
                    } else {
                        i45 = combineMeasuredStates;
                    }
                    z17 = false;
                    if (((LinearLayout.LayoutParams) v1Var2).weight <= 0.0f) {
                    }
                    z21 = z17;
                    i41 = i33 + 1;
                    i40 = i32;
                    mode = i34;
                    z18 = z15;
                    mode2 = i31;
                    i36 = -2;
                    i38 = TLObject.FLAG_30;
                    i39 = 8;
                }
                i31 = mode2;
                i32 = i40;
                z15 = z18;
                i33 = i41;
                i34 = i46;
                i41 = i33 + 1;
                i40 = i32;
                mode = i34;
                z18 = z15;
                mode2 = i31;
                i36 = -2;
                i38 = TLObject.FLAG_30;
                i39 = 8;
            }
            int i50 = mode;
            int i51 = mode2;
            boolean z23 = z18;
            int i52 = i45;
            int i53 = i11;
            if (w1Var.f > 0 && w1Var.h(virtualChildCount)) {
                w1Var.f += w1Var.x;
            }
            if (z23 && (i51 == Integer.MIN_VALUE || i51 == 0)) {
                w1Var.f = 0;
                for (int i54 = 0; i54 < virtualChildCount; i54++) {
                    View childAt2 = w1Var.getChildAt(i54);
                    if (childAt2 == null) {
                        w1Var.f = w1Var.f;
                    } else if (childAt2.getVisibility() != 8) {
                        v1 v1Var3 = (v1) childAt2.getLayoutParams();
                        int i55 = w1Var.f;
                        w1Var.f = Math.max(i55, i55 + i44 + ((LinearLayout.LayoutParams) v1Var3).topMargin + ((LinearLayout.LayoutParams) v1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = w1Var.getPaddingBottom() + w1Var.getPaddingTop() + w1Var.f;
            w1Var.f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, w1Var.getSuggestedMinimumHeight()), i53, 0);
            int i56 = (resolveSizeAndState & 16777215) - w1Var.f;
            if (z19 || (i56 != 0 && f7 > 0.0f)) {
                float f11 = w1Var.h;
                if (f11 > 0.0f) {
                    f7 = f11;
                }
                w1Var.f = 0;
                int i57 = i52;
                int i58 = 0;
                while (i58 < virtualChildCount) {
                    View childAt3 = w1Var.getChildAt(i58);
                    if (childAt3.getVisibility() == 8) {
                        i25 = i58;
                    } else {
                        v1 v1Var4 = (v1) childAt3.getLayoutParams();
                        float f12 = ((LinearLayout.LayoutParams) v1Var4).weight;
                        if (f12 > 0.0f) {
                            int i59 = (int) ((i56 * f12) / f7);
                            f7 -= f12;
                            i56 -= i59;
                            i25 = i58;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, w1Var.getPaddingRight() + w1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) v1Var4).leftMargin + ((LinearLayout.LayoutParams) v1Var4).rightMargin, ((LinearLayout.LayoutParams) v1Var4).width);
                            if (((LinearLayout.LayoutParams) v1Var4).height == 0) {
                                i27 = TLObject.FLAG_30;
                                if (i51 == 1073741824) {
                                    if (i59 <= 0) {
                                        i59 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i59, TLObject.FLAG_30));
                                    i57 = View.combineMeasuredStates(i57, childAt3.getMeasuredState() & (-256));
                                }
                            } else {
                                i27 = TLObject.FLAG_30;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i59;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i27));
                            i57 = View.combineMeasuredStates(i57, childAt3.getMeasuredState() & (-256));
                        } else {
                            i25 = i58;
                        }
                        int i60 = ((LinearLayout.LayoutParams) v1Var4).leftMargin + ((LinearLayout.LayoutParams) v1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i60;
                        i37 = Math.max(i37, measuredWidth2);
                        if (i50 != 1073741824) {
                            i26 = -1;
                            if (((LinearLayout.LayoutParams) v1Var4).width == -1) {
                                measuredWidth2 = i60;
                            }
                        } else {
                            i26 = -1;
                        }
                        i42 = Math.max(i42, measuredWidth2);
                        boolean z24 = z21 && ((LinearLayout.LayoutParams) v1Var4).width == i26;
                        int i61 = w1Var.f;
                        w1Var.f = Math.max(i61, childAt3.getMeasuredHeight() + i61 + ((LinearLayout.LayoutParams) v1Var4).topMargin + ((LinearLayout.LayoutParams) v1Var4).bottomMargin);
                        z21 = z24;
                    }
                    i58 = i25 + 1;
                }
                w1Var.f = w1Var.getPaddingBottom() + w1Var.getPaddingTop() + w1Var.f;
                i52 = i57;
            } else {
                i42 = Math.max(i42, i43);
                if (z23 && i51 != 1073741824) {
                    for (int i62 = 0; i62 < virtualChildCount; i62++) {
                        View childAt4 = w1Var.getChildAt(i62);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((v1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i44, TLObject.FLAG_30));
                        }
                    }
                }
            }
            if (z21 || i50 == 1073741824) {
                i42 = i37;
            }
            w1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(w1Var.getPaddingRight() + w1Var.getPaddingLeft() + i42, w1Var.getSuggestedMinimumWidth()), i10, i52), resolveSizeAndState);
            if (z20) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(w1Var.getMeasuredWidth(), TLObject.FLAG_30);
                int i63 = 0;
                while (i63 < virtualChildCount) {
                    View childAt5 = w1Var.getChildAt(i63);
                    if (childAt5.getVisibility() != 8) {
                        v1 v1Var5 = (v1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) v1Var5).width == -1) {
                            int i64 = ((LinearLayout.LayoutParams) v1Var5).height;
                            ((LinearLayout.LayoutParams) v1Var5).height = childAt5.getMeasuredHeight();
                            w1Var.measureChildWithMargins(childAt5, makeMeasureSpec, 0, i53, 0);
                            ((LinearLayout.LayoutParams) v1Var5).height = i64;
                        }
                    }
                    i63++;
                    i53 = i11;
                }
                return;
            }
            return;
        }
        int i65 = i10;
        w1Var.f = 0;
        int virtualChildCount2 = w1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i65);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (w1Var.r == null || w1Var.s == null) {
            w1Var.r = new int[4];
            w1Var.s = new int[4];
        }
        int[] iArr3 = w1Var.r;
        int[] iArr4 = w1Var.s;
        iArr3[3] = -1;
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
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        boolean z28 = false;
        boolean z29 = false;
        float f13 = 0.0f;
        boolean z30 = true;
        while (i66 < virtualChildCount2) {
            View childAt6 = w1Var.getChildAt(i66);
            if (childAt6 == null) {
                w1Var.f = w1Var.f;
                i20 = i66;
                i24 = i68;
                iArr2 = iArr3;
                iArr = iArr4;
                z11 = z25;
                z12 = z26;
            } else {
                int i72 = i67;
                if (childAt6.getVisibility() == 8) {
                    i65 = i10;
                    i20 = i66;
                    i24 = i68;
                    iArr = iArr4;
                    z11 = z25;
                    z12 = z26;
                    i67 = i72;
                    iArr2 = iArr3;
                } else {
                    if (w1Var.h(i66)) {
                        w1Var.f += w1Var.w;
                    }
                    v1 v1Var6 = (v1) childAt6.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) v1Var6).weight;
                    f13 += f14;
                    int i73 = i66;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) v1Var6).width == 0 && f14 > 0.0f) {
                        if (z27) {
                            w1Var.f = ((LinearLayout.LayoutParams) v1Var6).leftMargin + ((LinearLayout.LayoutParams) v1Var6).rightMargin + w1Var.f;
                        } else {
                            int i74 = w1Var.f;
                            w1Var.f = Math.max(i74, ((LinearLayout.LayoutParams) v1Var6).leftMargin + i74 + ((LinearLayout.LayoutParams) v1Var6).rightMargin);
                        }
                        if (z25) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            i21 = i72;
                            i20 = i73;
                            v1Var = v1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i65 = i10;
                            i22 = i68;
                            i19 = i69;
                        } else {
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            i21 = i72;
                            i20 = i73;
                            i23 = TLObject.FLAG_30;
                            z29 = true;
                            v1Var = v1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i65 = i10;
                            i22 = i68;
                            i19 = i69;
                            if (mode4 == i23 && ((LinearLayout.LayoutParams) v1Var).height == -1) {
                                z13 = true;
                                z28 = true;
                            } else {
                                z13 = false;
                            }
                            int i75 = ((LinearLayout.LayoutParams) v1Var).topMargin + ((LinearLayout.LayoutParams) v1Var).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i75;
                            i71 = View.combineMeasuredStates(i71, view.getMeasuredState());
                            if (z11) {
                                z14 = z13;
                            } else {
                                int baseline2 = view.getBaseline();
                                z14 = z13;
                                if (baseline2 != -1) {
                                    int i76 = ((LinearLayout.LayoutParams) v1Var).gravity;
                                    if (i76 < 0) {
                                        i76 = w1Var.e;
                                    }
                                    int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i77] = Math.max(iArr2[i77], baseline2);
                                    iArr[i77] = Math.max(iArr[i77], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i21, measuredHeight3);
                            boolean z31 = !z30 && ((LinearLayout.LayoutParams) v1Var).height == -1;
                            if (((LinearLayout.LayoutParams) v1Var).weight <= 0.0f) {
                                if (!z14) {
                                    i75 = measuredHeight3;
                                }
                                i69 = Math.max(i19, i75);
                                max = i22;
                            } else {
                                if (!z14) {
                                    i75 = measuredHeight3;
                                }
                                max = Math.max(i22, i75);
                                i69 = i19;
                            }
                            int i78 = max;
                            i67 = max2;
                            i24 = i78;
                            z30 = z31;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) v1Var6).width != 0 || f14 <= 0.0f) {
                            i18 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) v1Var6).width = -2;
                            i18 = 0;
                        }
                        iArr = iArr4;
                        i19 = i69;
                        i20 = i73;
                        z11 = z25;
                        z12 = z26;
                        int i79 = i18;
                        v1Var = v1Var6;
                        i21 = i72;
                        i65 = i10;
                        iArr2 = iArr3;
                        i22 = i68;
                        w1Var.measureChildWithMargins(childAt6, i65, f13 == 0.0f ? w1Var.f : 0, i11, 0);
                        if (i79 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) v1Var).width = i79;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z27) {
                            view = childAt6;
                            w1Var.f = ((LinearLayout.LayoutParams) v1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) v1Var).rightMargin + w1Var.f;
                        } else {
                            view = childAt6;
                            int i80 = w1Var.f;
                            w1Var.f = Math.max(i80, i80 + measuredWidth3 + ((LinearLayout.LayoutParams) v1Var).leftMargin + ((LinearLayout.LayoutParams) v1Var).rightMargin);
                        }
                        if (z12) {
                            i70 = Math.max(measuredWidth3, i70);
                        }
                    }
                    i23 = TLObject.FLAG_30;
                    if (mode4 == i23) {
                    }
                    z13 = false;
                    int i752 = ((LinearLayout.LayoutParams) v1Var).topMargin + ((LinearLayout.LayoutParams) v1Var).bottomMargin;
                    int measuredHeight32 = view.getMeasuredHeight() + i752;
                    i71 = View.combineMeasuredStates(i71, view.getMeasuredState());
                    if (z11) {
                    }
                    int max22 = Math.max(i21, measuredHeight32);
                    if (z30) {
                    }
                    if (((LinearLayout.LayoutParams) v1Var).weight <= 0.0f) {
                    }
                    int i782 = max;
                    i67 = max22;
                    i24 = i782;
                    z30 = z31;
                }
            }
            i68 = i24;
            i66 = i20 + 1;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z11;
            z26 = z12;
        }
        int i81 = i67;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        boolean z32 = z25;
        boolean z33 = z26;
        int i82 = i68;
        int i83 = i69;
        if (w1Var.f > 0 && w1Var.h(virtualChildCount2)) {
            w1Var.f += w1Var.w;
        }
        int i84 = iArr5[1];
        int max3 = (i84 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i81 : Math.max(i81, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i84, iArr5[2]))));
        if (z33 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            w1Var.f = 0;
            for (int i85 = 0; i85 < virtualChildCount2; i85++) {
                View childAt7 = w1Var.getChildAt(i85);
                if (childAt7 == null) {
                    w1Var.f = w1Var.f;
                } else if (childAt7.getVisibility() != 8) {
                    v1 v1Var7 = (v1) childAt7.getLayoutParams();
                    if (z27) {
                        w1Var.f = ((LinearLayout.LayoutParams) v1Var7).leftMargin + i70 + ((LinearLayout.LayoutParams) v1Var7).rightMargin + w1Var.f;
                    } else {
                        int i86 = w1Var.f;
                        w1Var.f = Math.max(i86, i86 + i70 + ((LinearLayout.LayoutParams) v1Var7).leftMargin + ((LinearLayout.LayoutParams) v1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = w1Var.getPaddingRight() + w1Var.getPaddingLeft() + w1Var.f;
        w1Var.f = paddingRight;
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, w1Var.getSuggestedMinimumWidth()), i65, 0);
        int i87 = (resolveSizeAndState2 & 16777215) - w1Var.f;
        if (z29 || (i87 != 0 && f13 > 0.0f)) {
            float f15 = w1Var.h;
            if (f15 > 0.0f) {
                f13 = f15;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            w1Var.f = 0;
            max3 = -1;
            int i88 = 0;
            while (i88 < virtualChildCount2) {
                View childAt8 = w1Var.getChildAt(i88);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i15 = resolveSizeAndState2;
                } else {
                    v1 v1Var8 = (v1) childAt8.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) v1Var8).weight;
                    if (f16 > 0.0f) {
                        int i89 = (int) ((i87 * f16) / f13);
                        f13 -= f16;
                        i87 -= i89;
                        i15 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, w1Var.getPaddingBottom() + w1Var.getPaddingTop() + ((LinearLayout.LayoutParams) v1Var8).topMargin + ((LinearLayout.LayoutParams) v1Var8).bottomMargin, ((LinearLayout.LayoutParams) v1Var8).height);
                        if (((LinearLayout.LayoutParams) v1Var8).width == 0) {
                            i17 = TLObject.FLAG_30;
                            if (mode3 == 1073741824) {
                                if (i89 <= 0) {
                                    i89 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i89, TLObject.FLAG_30), childMeasureSpec2);
                                i71 = View.combineMeasuredStates(i71, childAt8.getMeasuredState() & (-16777216));
                            }
                        } else {
                            i17 = TLObject.FLAG_30;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i89;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i17), childMeasureSpec2);
                        i71 = View.combineMeasuredStates(i71, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i15 = resolveSizeAndState2;
                    }
                    if (z27) {
                        w1Var.f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) v1Var8).leftMargin + ((LinearLayout.LayoutParams) v1Var8).rightMargin + w1Var.f;
                    } else {
                        int i90 = w1Var.f;
                        w1Var.f = Math.max(i90, childAt8.getMeasuredWidth() + i90 + ((LinearLayout.LayoutParams) v1Var8).leftMargin + ((LinearLayout.LayoutParams) v1Var8).rightMargin);
                    }
                    boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) v1Var8).height == -1;
                    int i91 = ((LinearLayout.LayoutParams) v1Var8).topMargin + ((LinearLayout.LayoutParams) v1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i91;
                    max3 = Math.max(max3, measuredHeight4);
                    if (!z34) {
                        i91 = measuredHeight4;
                    }
                    int max4 = Math.max(i82, i91);
                    if (z30) {
                        i16 = -1;
                        if (((LinearLayout.LayoutParams) v1Var8).height == -1) {
                            z10 = true;
                            if (!z32 && (baseline = childAt8.getBaseline()) != i16) {
                                int i92 = ((LinearLayout.LayoutParams) v1Var8).gravity;
                                if (i92 < 0) {
                                    i92 = w1Var.e;
                                }
                                int i93 = (((i92 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i93] = Math.max(iArr5[i93], baseline);
                                iArr6[i93] = Math.max(iArr6[i93], measuredHeight4 - baseline);
                            }
                            z30 = z10;
                            i82 = max4;
                        }
                    } else {
                        i16 = -1;
                    }
                    z10 = false;
                    if (!z32) {
                    }
                    z30 = z10;
                    i82 = max4;
                }
                i88++;
                resolveSizeAndState2 = i15;
            }
            i12 = resolveSizeAndState2;
            i13 = -16777216;
            w1Var.f = w1Var.getPaddingRight() + w1Var.getPaddingLeft() + w1Var.f;
            int i94 = iArr5[1];
            if (i94 != -1 || iArr5[0] != -1 || iArr5[2] != -1 || iArr5[3] != -1) {
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i94, iArr5[2]))));
            }
            i14 = i82;
        } else {
            i14 = Math.max(i82, i83);
            if (z33 && mode3 != 1073741824) {
                for (int i95 = 0; i95 < virtualChildCount2; i95++) {
                    View childAt9 = w1Var.getChildAt(i95);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((v1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i70, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
            }
            i12 = resolveSizeAndState2;
            i13 = -16777216;
        }
        if (!z30 && mode4 != 1073741824) {
            max3 = i14;
        }
        w1Var.setMeasuredDimension(i12 | (i71 & i13), View.resolveSizeAndState(Math.max(w1Var.getPaddingBottom() + w1Var.getPaddingTop() + max3, w1Var.getSuggestedMinimumHeight()), i11, i71 << 16));
        if (z28) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(w1Var.getMeasuredHeight(), TLObject.FLAG_30);
            int i96 = 0;
            while (i96 < virtualChildCount2) {
                View childAt10 = w1Var.getChildAt(i96);
                if (childAt10.getVisibility() != 8) {
                    v1 v1Var9 = (v1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) v1Var9).height == -1) {
                        int i97 = ((LinearLayout.LayoutParams) v1Var9).width;
                        ((LinearLayout.LayoutParams) v1Var9).width = childAt10.getMeasuredWidth();
                        w1Var.measureChildWithMargins(childAt10, i65, 0, makeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) v1Var9).width = i97;
                    }
                }
                i96++;
                w1Var = this;
                i65 = i10;
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
