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
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class w1 extends ViewGroup {
    public int E;
    public int F;
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
    public Drawable w;
    public int x;
    public int y;

    public w1(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = f.a.n;
        k4.j F = k4.j.F(context, attributeSet, iArr, i3);
        r0.i0.i(this, context, iArr, attributeSet, (TypedArray) F.b, i3);
        TypedArray typedArray = (TypedArray) F.b;
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
        setDividerDrawable(F.A(5));
        this.E = typedArray.getInt(8, 0);
        this.F = typedArray.getDimensionPixelSize(6, 0);
        F.H();
    }

    public final void c(Canvas canvas, int i3) {
        this.w.setBounds(getPaddingLeft() + this.F, i3, (getWidth() - getPaddingRight()) - this.F, this.y + i3);
        this.w.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof v1;
    }

    public final void d(Canvas canvas, int i3) {
        this.w.setBounds(i3, getPaddingTop() + this.F, this.x + i3, (getHeight() - getPaddingBottom()) - this.F);
        this.w.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public v1 generateDefaultLayoutParams() {
        int i3 = this.d;
        if (i3 == 0) {
            return new v1(-2, -2);
        }
        if (i3 == 1) {
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
        int i3;
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
        if (this.d == 1 && (i3 = this.e & hs.x1) != 48) {
            if (i3 == 16) {
                i11 = k2.p1.e(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f, 2, i11);
            } else if (i3 == 80) {
                i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
            }
        }
        return i11 + ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.w;
    }

    public int getDividerPadding() {
        return this.F;
    }

    public int getDividerWidth() {
        return this.x;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.E;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    public final boolean h(int i3) {
        if (i3 == 0) {
            return (this.E & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.E & 4) != 0;
        }
        if ((this.E & 2) != 0) {
            for (int i10 = i3 - 1; i10 >= 0; i10--) {
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
        int i3;
        if (this.w == null) {
            return;
        }
        int i10 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && h(i10)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((v1) childAt.getLayoutParams())).topMargin) - this.y);
                }
                i10++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.y : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((v1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = r3.a(this);
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i10)) {
                v1 v1Var = (v1) childAt3.getLayoutParams();
                d(canvas, a10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) v1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) v1Var).leftMargin) - this.x);
            }
            i10++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                v1 v1Var2 = (v1) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                    i3 = this.x;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) v1Var2).rightMargin;
                }
            } else if (a10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.x;
                right = left - i3;
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int e10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int e11;
        int i22 = 8;
        if (this.d == 1) {
            int paddingLeft = getPaddingLeft();
            int i23 = i11 - i3;
            int paddingRight = i23 - getPaddingRight();
            int paddingRight2 = (i23 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i24 = this.e;
            int i25 = i24 & hs.x1;
            int i26 = 8388615 & i24;
            int paddingTop = i25 != 16 ? i25 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.f : k2.p1.e(i12 - i10, this.f, 2, getPaddingTop());
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
                    int e12 = absoluteGravity != 1 ? absoluteGravity != 5 ? ((LinearLayout.LayoutParams) v1Var).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) v1Var).rightMargin : (k2.p1.e(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) v1Var).leftMargin) - ((LinearLayout.LayoutParams) v1Var).rightMargin;
                    if (h(i27)) {
                        paddingTop += this.y;
                    }
                    int i29 = paddingTop + ((LinearLayout.LayoutParams) v1Var).topMargin;
                    childAt.layout(e12, i29, measuredWidth + e12, i29 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) v1Var).bottomMargin + i29;
                }
                i27++;
                i22 = 8;
            }
            return;
        }
        boolean a10 = r3.a(this);
        int paddingTop2 = getPaddingTop();
        int i30 = i12 - i10;
        int paddingBottom = i30 - getPaddingBottom();
        int paddingBottom2 = (i30 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i31 = this.e;
        int i32 = 8388615 & i31;
        int i33 = i31 & hs.x1;
        boolean z11 = this.a;
        int[] iArr = this.r;
        int[] iArr2 = this.s;
        WeakHashMap weakHashMap2 = r0.i0.a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i32, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            e10 = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i3) - this.f;
            i13 = 1;
        } else {
            i13 = 1;
            e10 = k2.p1.e(i11 - i3, this.f, 2, getPaddingLeft());
        }
        if (a10) {
            i15 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i14 = i13;
            i15 = 0;
        }
        int i34 = 0;
        while (i34 < virtualChildCount2) {
            int i35 = (i14 * i34) + i15;
            View childAt2 = getChildAt(i35);
            if (childAt2 == null) {
                i16 = i15;
            } else {
                i16 = i15;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i36 = e10;
                    v1 v1Var2 = (v1) childAt2.getLayoutParams();
                    if (z11) {
                        i17 = i14;
                        if (((LinearLayout.LayoutParams) v1Var2).height != -1) {
                            i18 = childAt2.getBaseline();
                            i19 = ((LinearLayout.LayoutParams) v1Var2).gravity;
                            if (i19 < 0) {
                                i19 = i33;
                            }
                            i20 = i19 & hs.x1;
                            i21 = i34;
                            if (i20 != 16) {
                                e11 = (k2.p1.e(paddingBottom2, measuredHeight2, 2, paddingTop2) + ((LinearLayout.LayoutParams) v1Var2).topMargin) - ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                            } else if (i20 == 48) {
                                e11 = ((LinearLayout.LayoutParams) v1Var2).topMargin + paddingTop2;
                                if (i18 != -1) {
                                    e11 = (iArr[i13] - i18) + e11;
                                }
                            } else if (i20 != 80) {
                                e11 = paddingTop2;
                            } else {
                                e11 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) v1Var2).bottomMargin;
                                if (i18 != -1) {
                                    e11 -= iArr2[2] - (childAt2.getMeasuredHeight() - i18);
                                }
                            }
                            int i37 = (!h(i35) ? i36 + this.x : i36) + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                            childAt2.layout(i37, e11, i37 + measuredWidth2, measuredHeight2 + e11);
                            e10 = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i37;
                            i34 = i21 + 1;
                            i14 = i17;
                            i15 = i16;
                        }
                    } else {
                        i17 = i14;
                    }
                    i18 = -1;
                    i19 = ((LinearLayout.LayoutParams) v1Var2).gravity;
                    if (i19 < 0) {
                    }
                    i20 = i19 & hs.x1;
                    i21 = i34;
                    if (i20 != 16) {
                    }
                    int i372 = (!h(i35) ? i36 + this.x : i36) + ((LinearLayout.LayoutParams) v1Var2).leftMargin;
                    childAt2.layout(i372, e11, i372 + measuredWidth2, measuredHeight2 + e11);
                    e10 = measuredWidth2 + ((LinearLayout.LayoutParams) v1Var2).rightMargin + i372;
                    i34 = i21 + 1;
                    i14 = i17;
                    i15 = i16;
                }
            }
            i17 = i14;
            i21 = i34;
            i34 = i21 + 1;
            i14 = i17;
            i15 = i16;
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
    public void onMeasure(int i3, int i10) {
        int i11;
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
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i40 = w1Var.b;
            boolean z18 = w1Var.n;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            boolean z19 = false;
            int i44 = 0;
            boolean z20 = false;
            boolean z21 = true;
            float f10 = 0.0f;
            int i45 = 0;
            while (i41 < virtualChildCount) {
                int i46 = mode;
                View childAt = w1Var.getChildAt(i41);
                if (childAt == null) {
                    w1Var.f = w1Var.f;
                } else if (childAt.getVisibility() != i39) {
                    if (w1Var.h(i41)) {
                        w1Var.f += w1Var.y;
                    }
                    v1 v1Var2 = (v1) childAt.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) v1Var2).weight;
                    f10 += f11;
                    if (mode2 == i38 && ((LinearLayout.LayoutParams) v1Var2).height == 0 && f11 > 0.0f) {
                        int i47 = w1Var.f;
                        w1Var.f = Math.max(i47, ((LinearLayout.LayoutParams) v1Var2).topMargin + i47 + ((LinearLayout.LayoutParams) v1Var2).bottomMargin);
                        view2 = childAt;
                        i31 = mode2;
                        i32 = i40;
                        z15 = z18;
                        i33 = i41;
                        z19 = true;
                        i34 = i46;
                    } else {
                        if (((LinearLayout.LayoutParams) v1Var2).height != 0 || f11 <= 0.0f) {
                            i28 = TLObject.FLAG_31;
                        } else {
                            ((LinearLayout.LayoutParams) v1Var2).height = i36;
                            i28 = 0;
                        }
                        if (f10 == 0.0f) {
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
                        w1Var.measureChildWithMargins(childAt, i3, 0, i10, i30);
                        if (i28 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) v1Var2).height = i28;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i48 = w1Var.f;
                        view2 = childAt;
                        w1Var.f = Math.max(i48, i48 + measuredHeight + ((LinearLayout.LayoutParams) v1Var2).topMargin + ((LinearLayout.LayoutParams) v1Var2).bottomMargin);
                        if (z15) {
                            i45 = Math.max(measuredHeight, i45);
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
                    int combineMeasuredStates = View.combineMeasuredStates(i44, measuredState);
                    if (z21) {
                        i44 = combineMeasuredStates;
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
                        i44 = combineMeasuredStates;
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
            int i52 = i44;
            int i53 = i10;
            if (w1Var.f > 0 && w1Var.h(virtualChildCount)) {
                w1Var.f += w1Var.y;
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
                        w1Var.f = Math.max(i55, i55 + i45 + ((LinearLayout.LayoutParams) v1Var3).topMargin + ((LinearLayout.LayoutParams) v1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = w1Var.getPaddingBottom() + w1Var.getPaddingTop() + w1Var.f;
            w1Var.f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, w1Var.getSuggestedMinimumHeight()), i53, 0);
            int i56 = (resolveSizeAndState & 16777215) - w1Var.f;
            if (z19 || (i56 != 0 && f10 > 0.0f)) {
                float f12 = w1Var.h;
                if (f12 > 0.0f) {
                    f10 = f12;
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
                        float f13 = ((LinearLayout.LayoutParams) v1Var4).weight;
                        if (f13 > 0.0f) {
                            int i59 = (int) ((i56 * f13) / f10);
                            f10 -= f13;
                            i56 -= i59;
                            i25 = i58;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, w1Var.getPaddingRight() + w1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) v1Var4).leftMargin + ((LinearLayout.LayoutParams) v1Var4).rightMargin, ((LinearLayout.LayoutParams) v1Var4).width);
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
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i45, TLObject.FLAG_30));
                        }
                    }
                }
            }
            if (z21 || i50 == 1073741824) {
                i42 = i37;
            }
            w1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(w1Var.getPaddingRight() + w1Var.getPaddingLeft() + i42, w1Var.getSuggestedMinimumWidth()), i3, i52), resolveSizeAndState);
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
                    i53 = i10;
                }
                return;
            }
            return;
        }
        int i65 = i3;
        w1Var.f = 0;
        int virtualChildCount2 = w1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i65);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (w1Var.r == null || w1Var.s == null) {
            w1Var.r = new int[4];
            w1Var.s = new int[4];
        }
        int[] iArr3 = w1Var.r;
        int[] iArr4 = w1Var.s;
        iArr3[3] = -1;
        char c2 = 2;
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
        float f14 = 0.0f;
        boolean z28 = true;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        boolean z29 = false;
        boolean z30 = false;
        while (i66 < virtualChildCount2) {
            char c10 = c2;
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
                    i65 = i3;
                    i20 = i66;
                    i24 = i68;
                    iArr = iArr4;
                    z11 = z25;
                    z12 = z26;
                    i67 = i72;
                    iArr2 = iArr3;
                } else {
                    if (w1Var.h(i66)) {
                        w1Var.f += w1Var.x;
                    }
                    v1 v1Var6 = (v1) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) v1Var6).weight;
                    f14 += f15;
                    int i73 = i66;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) v1Var6).width == 0 && f15 > 0.0f) {
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
                            i65 = i3;
                            i22 = i68;
                            i19 = i69;
                        } else {
                            view = childAt6;
                            z11 = z25;
                            z12 = z26;
                            z30 = true;
                            i21 = i72;
                            i20 = i73;
                            i23 = TLObject.FLAG_30;
                            v1Var = v1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i65 = i3;
                            i22 = i68;
                            i19 = i69;
                            if (mode4 == i23 && ((LinearLayout.LayoutParams) v1Var).height == -1) {
                                z13 = true;
                                z29 = true;
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
                                    int i77 = (((i76 & hs.x1) >> 4) & (-2)) >> 1;
                                    iArr2[i77] = Math.max(iArr2[i77], baseline2);
                                    iArr[i77] = Math.max(iArr[i77], measuredHeight3 - baseline2);
                                }
                            }
                            int max2 = Math.max(i21, measuredHeight3);
                            boolean z31 = !z28 && ((LinearLayout.LayoutParams) v1Var).height == -1;
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
                            z28 = z31;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) v1Var6).width != 0 || f15 <= 0.0f) {
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
                        i65 = i3;
                        iArr2 = iArr3;
                        i22 = i68;
                        w1Var.measureChildWithMargins(childAt6, i65, f14 == 0.0f ? w1Var.f : 0, i10, 0);
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
                    if (z28) {
                    }
                    if (((LinearLayout.LayoutParams) v1Var).weight <= 0.0f) {
                    }
                    int i782 = max;
                    i67 = max22;
                    i24 = i782;
                    z28 = z31;
                }
            }
            i68 = i24;
            i66 = i20 + 1;
            c2 = c10;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z11;
            z26 = z12;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c11 = c2;
        boolean z32 = z25;
        boolean z33 = z26;
        int i81 = i67;
        int i82 = i68;
        int i83 = i69;
        if (w1Var.f > 0 && w1Var.h(virtualChildCount2)) {
            w1Var.f += w1Var.x;
        }
        int i84 = iArr5[1];
        int max3 = (i84 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) ? i81 : Math.max(i81, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i84, iArr5[c11]))));
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
        if (z30 || (i87 != 0 && f14 > 0.0f)) {
            float f16 = w1Var.h;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[c11] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c11] = -1;
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
                    float f17 = ((LinearLayout.LayoutParams) v1Var8).weight;
                    if (f17 > 0.0f) {
                        int i89 = (int) ((i87 * f17) / f14);
                        f14 -= f17;
                        i87 -= i89;
                        i15 = resolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, w1Var.getPaddingBottom() + w1Var.getPaddingTop() + ((LinearLayout.LayoutParams) v1Var8).topMargin + ((LinearLayout.LayoutParams) v1Var8).bottomMargin, ((LinearLayout.LayoutParams) v1Var8).height);
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
                    if (z28) {
                        i16 = -1;
                        if (((LinearLayout.LayoutParams) v1Var8).height == -1) {
                            z10 = true;
                            if (!z32 && (baseline = childAt8.getBaseline()) != i16) {
                                int i92 = ((LinearLayout.LayoutParams) v1Var8).gravity;
                                if (i92 < 0) {
                                    i92 = w1Var.e;
                                }
                                int i93 = (((i92 & hs.x1) >> 4) & (-2)) >> 1;
                                iArr5[i93] = Math.max(iArr5[i93], baseline);
                                iArr6[i93] = Math.max(iArr6[i93], measuredHeight4 - baseline);
                            }
                            z28 = z10;
                            i82 = max4;
                        }
                    } else {
                        i16 = -1;
                    }
                    z10 = false;
                    if (!z32) {
                    }
                    z28 = z10;
                    i82 = max4;
                }
                i88++;
                resolveSizeAndState2 = i15;
            }
            i11 = resolveSizeAndState2;
            i12 = -16777216;
            w1Var.f = w1Var.getPaddingRight() + w1Var.getPaddingLeft() + w1Var.f;
            int i94 = iArr5[1];
            if (i94 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) {
                i13 = 0;
            } else {
                i13 = 0;
                max3 = Math.max(max3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i94, iArr5[c11]))));
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
            i11 = resolveSizeAndState2;
            i12 = -16777216;
            i13 = 0;
        }
        if (!z28 && mode4 != 1073741824) {
            max3 = i14;
        }
        w1Var.setMeasuredDimension(i11 | (i71 & i12), View.resolveSizeAndState(Math.max(w1Var.getPaddingBottom() + w1Var.getPaddingTop() + max3, w1Var.getSuggestedMinimumHeight()), i10, i71 << 16));
        if (z29) {
            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(w1Var.getMeasuredHeight(), TLObject.FLAG_30);
            int i96 = i13;
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
                i65 = i3;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.a = z10;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.b = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.w) {
            return;
        }
        this.w = drawable;
        if (drawable != null) {
            this.x = drawable.getIntrinsicWidth();
            this.y = drawable.getIntrinsicHeight();
        } else {
            this.x = 0;
            this.y = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.F = i3;
    }

    public void setGravity(int i3) {
        if (this.e != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & hs.x1) == 0) {
                i3 |= 48;
            }
            this.e = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i10 = i3 & 8388615;
        int i11 = this.e;
        if ((8388615 & i11) != i10) {
            this.e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.n = z10;
    }

    public void setOrientation(int i3) {
        if (this.d != i3) {
            this.d = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.E) {
            requestLayout();
        }
        this.E = i3;
    }

    public void setVerticalGravity(int i3) {
        int i10 = i3 & hs.x1;
        int i11 = this.e;
        if ((i11 & hs.x1) != i10) {
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
