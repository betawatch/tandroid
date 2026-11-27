package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ActionMenuView extends s46 implements e27, c37 {
    public f27 G;
    public Context H;
    public int I;
    public boolean J;
    public c9 K;
    public l09 L;
    public boolean M;
    public int N;
    public final int O;
    public final int P;
    public f9 Q;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.O = (int) (56.0f * f);
        this.P = (int) (f * 4.0f);
        this.H = context;
        this.I = 0;
    }

    public static e9 i() {
        e9 e9Var = new e9(-2, -2);
        e9Var.a = false;
        ((LinearLayout.LayoutParams) e9Var).gravity = 16;
        return e9Var;
    }

    public static e9 j(ViewGroup.LayoutParams layoutParams) {
        e9 e9Var;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof e9) {
            e9 e9Var2 = (e9) layoutParams;
            e9Var = new e9(e9Var2);
            e9Var.a = e9Var2.a;
        } else {
            e9Var = new e9(layoutParams);
        }
        if (((LinearLayout.LayoutParams) e9Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) e9Var).gravity = 16;
        }
        return e9Var;
    }

    @Override // e27
    public final boolean a(j27 j27Var) {
        return this.G.q(j27Var, null, 0);
    }

    @Override // c37
    public final void b(f27 f27Var) {
        this.G = f27Var;
    }

    @Override // s46, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e9;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // s46
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ r46 generateDefaultLayoutParams() {
        return i();
    }

    @Override // s46
    /* renamed from: f */
    public final r46 generateLayoutParams(AttributeSet attributeSet) {
        return new e9(getContext(), attributeSet);
    }

    @Override // s46
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ r46 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // s46, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // s46, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e9(getContext(), attributeSet);
    }

    public Menu getMenu() {
        f27 f27Var = this.G;
        if (f27Var != null) {
            return f27Var;
        }
        Context context = getContext();
        f27 f27Var2 = new f27(context);
        this.G = f27Var2;
        f27Var2.e = new wz4(this);
        c9 c9Var = new c9(context);
        this.K = c9Var;
        c9Var.x = true;
        c9Var.y = true;
        c9Var.e = new z6f((byte) 13);
        this.G.b(c9Var, this.H);
        c9 c9Var2 = this.K;
        c9Var2.n = this;
        f27 f27Var3 = c9Var2.c;
        this.G = f27Var3;
        return f27Var3;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c9 c9Var = this.K;
        b9 b9Var = c9Var.r;
        if (b9Var != null) {
            return b9Var.getDrawable();
        }
        if (c9Var.w) {
            return c9Var.s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.I;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof d9)) {
            z = ((d9) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof d9)) ? z : z | ((d9) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c9 c9Var = this.K;
        if (c9Var != null) {
            c9Var.j();
            if (this.K.g()) {
                this.K.d();
                this.K.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c9 c9Var = this.K;
        if (c9Var != null) {
            c9Var.d();
            z8 z8Var = c9Var.K;
            if (z8Var == null || !z8Var.b()) {
                return;
            }
            z8Var.i.dismiss();
        }
    }

    @Override // s46, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.M) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean a = fjc.a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e9 e9Var = (e9) childAt.getLayoutParams();
                if (e9Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) e9Var).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) e9Var).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) e9Var).leftMargin) + ((LinearLayout.LayoutParams) e9Var).rightMargin;
                    k(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                e9 e9Var2 = (e9) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !e9Var2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) e9Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) e9Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            e9 e9Var3 = (e9) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !e9Var3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) e9Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) e9Var3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v37 */
    @Override // s46, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        f27 f27Var;
        boolean z = this.M;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.M = z2;
        if (z != z2) {
            this.N = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.M && (f27Var = this.G) != null && size != this.N) {
            this.N = size;
            f27Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.M || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                e9 e9Var = (e9) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) e9Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) e9Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.O;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        long j = 0;
        while (true) {
            i3 = this.P;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                e9 e9Var2 = (e9) childAt.getLayoutParams();
                e9Var2.f = false;
                e9Var2.c = 0;
                e9Var2.b = 0;
                e9Var2.d = false;
                ((LinearLayout.LayoutParams) e9Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) e9Var2).rightMargin = 0;
                e9Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = e9Var2.a ? 1 : i10;
                e9 e9Var3 = (e9) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, TLObject.FLAG_31), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                e9Var3.d = !e9Var3.a && z6;
                e9Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, TLObject.FLAG_30), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (e9Var2.d) {
                    i17++;
                }
                if (e9Var2.a) {
                    z3 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z7 = z3 && i14 == 2;
        int i25 = i23;
        boolean z8 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            long j2 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = i13;
                e9 e9Var4 = (e9) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (e9Var4.d) {
                    int i30 = e9Var4.b;
                    if (i30 < i26) {
                        j2 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z7 = z9;
                i13 = i29;
            }
            i4 = i13;
            boolean z10 = z7;
            j |= j2;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                e9 e9Var5 = (e9) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && e9Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    e9Var5.b += r11;
                    e9Var5.f = r11;
                    i25--;
                } else if (e9Var5.b == i31) {
                    j |= j3;
                }
                i32++;
                z3 = z11;
            }
            z7 = z10;
            i13 = i4;
            z8 = true;
        }
        i4 = i13;
        boolean z12 = !z3 && i14 == 1;
        if (i25 > 0 && j != 0 && (i25 < i14 - 1 || z12 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((e9) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((e9) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    e9 e9Var6 = (e9) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        e9Var6.c = i34;
                        e9Var6.f = true;
                        if (i35 == 0 && !e9Var6.e) {
                            ((LinearLayout.LayoutParams) e9Var6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (e9Var6.a) {
                        e9Var6.c = i34;
                        e9Var6.f = true;
                        ((LinearLayout.LayoutParams) e9Var6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) e9Var6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) e9Var6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                e9 e9Var7 = (e9) childAt4.getLayoutParams();
                if (e9Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((e9Var7.b * i24) + e9Var7.c, TLObject.FLAG_30), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.K.H = z;
    }

    public void setOnMenuItemClickListener(f9 f9Var) {
        this.Q = f9Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c9 c9Var = this.K;
        b9 b9Var = c9Var.r;
        if (b9Var != null) {
            b9Var.setImageDrawable(drawable);
        } else {
            c9Var.w = true;
            c9Var.s = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.J = z;
    }

    public void setPopupTheme(int i) {
        if (this.I != i) {
            this.I = i;
            if (i == 0) {
                this.H = getContext();
            } else {
                this.H = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(c9 c9Var) {
        this.K = c9Var;
        c9Var.n = this;
        this.G = c9Var.c;
    }

    @Override // s46, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
