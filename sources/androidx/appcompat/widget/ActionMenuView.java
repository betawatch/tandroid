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
import h9.f1;
import l.j;
import l.k;
import l.m;
import l.z;
import m.e;
import m.h;
import m.i;
import m.l;
import m.t3;
import m.w1;
import m.x1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import w7.s;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class ActionMenuView extends x1 implements j, z {
    public k F;
    public Context G;
    public int H;
    public boolean I;
    public i J;
    public f1 K;
    public boolean L;
    public int M;
    public final int N;
    public final int O;
    public l P;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static m.k i() {
        m.k kVar = new m.k(-2, -2);
        kVar.a = false;
        ((LinearLayout.LayoutParams) kVar).gravity = 16;
        return kVar;
    }

    public static m.k j(ViewGroup.LayoutParams layoutParams) {
        m.k kVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof m.k) {
            m.k kVar2 = (m.k) layoutParams;
            kVar = new m.k(kVar2);
            kVar.a = kVar2.a;
        } else {
            kVar = new m.k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) kVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) kVar).gravity = 16;
        }
        return kVar;
    }

    @Override // l.j
    public final boolean a(m mVar) {
        return this.F.q(mVar, null, 0);
    }

    @Override // l.z
    public final void b(k kVar) {
        this.F = kVar;
    }

    @Override // m.x1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.k;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.x1
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ w1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.x1
    /* renamed from: f */
    public final w1 generateLayoutParams(AttributeSet attributeSet) {
        return new m.k(getContext(), attributeSet);
    }

    @Override // m.x1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ w1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // m.x1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.x1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.F == null) {
            Context context = getContext();
            k kVar = new k(context);
            this.F = kVar;
            kVar.e = new f1(this, 12);
            i iVar = new i(context);
            this.J = iVar;
            iVar.x = true;
            iVar.y = true;
            iVar.e = new s(13, false);
            this.F.b(iVar, this.G);
            i iVar2 = this.J;
            iVar2.n = this;
            this.F = iVar2.c;
        }
        return this.F;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        i iVar = this.J;
        h hVar = iVar.r;
        if (hVar != null) {
            return hVar.getDrawable();
        }
        if (iVar.w) {
            return iVar.s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.H;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i7) {
        boolean z9 = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof m.j)) {
            z9 = ((m.j) childAt).a();
        }
        return (i7 <= 0 || !(childAt2 instanceof m.j)) ? z9 : ((m.j) childAt2).c() | z9;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i iVar = this.J;
        if (iVar != null) {
            iVar.e();
            if (this.J.g()) {
                this.J.f();
                this.J.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.J;
        if (iVar != null) {
            iVar.f();
            e eVar = iVar.J;
            if (eVar == null || !eVar.b()) {
                return;
            }
            eVar.i.dismiss();
        }
    }

    @Override // m.x1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int width;
        int i13;
        if (!this.L) {
            super.onLayout(z9, i7, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i11 - i7;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = t3.a(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                m.k kVar = (m.k) childAt.getLayoutParams();
                if (kVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i13 = getPaddingLeft() + ((LinearLayout.LayoutParams) kVar).leftMargin;
                        width = i13 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) kVar).rightMargin;
                        i13 = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i13, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) kVar).leftMargin) + ((LinearLayout.LayoutParams) kVar).rightMargin;
                    k(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int max = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (a10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                m.k kVar2 = (m.k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kVar2.a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) kVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) kVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            m.k kVar3 = (m.k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kVar3.a) {
                int i27 = paddingLeft + ((LinearLayout.LayoutParams) kVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) kVar3).rightMargin + max + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // m.x1, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        k kVar;
        boolean z9 = this.L;
        boolean z10 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.L = z10;
        if (z9 != z10) {
            this.M = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.L && (kVar = this.F) != null && size != this.M) {
            this.M = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.L || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                m.k kVar2 = (m.k) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) kVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) kVar2).leftMargin = 0;
            }
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.N;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z11 = false;
        int i25 = 0;
        long j3 = 0;
        while (true) {
            i11 = this.O;
            if (i24 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i24);
            int i26 = size3;
            int i27 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z12) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                m.k kVar3 = (m.k) childAt.getLayoutParams();
                kVar3.f = false;
                kVar3.c = 0;
                kVar3.b = 0;
                kVar3.d = false;
                ((LinearLayout.LayoutParams) kVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) kVar3).rightMargin = 0;
                kVar3.e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = kVar3.a ? 1 : i18;
                m.k kVar4 = (m.k) childAt.getLayoutParams();
                int i29 = i18;
                i13 = i20;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i27, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i28 <= 0 || (z13 && i28 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i28, TLObject.FLAG_31), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z14 && i14 < 2) {
                        i14 = 2;
                    }
                }
                kVar4.d = !kVar4.a && z14;
                kVar4.b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, TLObject.FLAG_30), makeMeasureSpec);
                i23 = Math.max(i23, i14);
                if (kVar3.d) {
                    i25++;
                }
                if (kVar3.a) {
                    z11 = true;
                }
                i18 = i29 - i14;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j3 |= 1 << i24;
                }
            }
            i24++;
            size3 = i26;
            paddingBottom = i27;
            i20 = i13;
        }
        int i30 = size3;
        int i31 = i18;
        int i32 = i20;
        boolean z15 = z11 && i22 == 2;
        int i33 = i31;
        boolean z16 = false;
        while (i25 > 0 && i33 > 0) {
            int i34 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            long j10 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i36 < childCount2) {
                int i37 = i21;
                m.k kVar5 = (m.k) getChildAt(i36).getLayoutParams();
                boolean z17 = z15;
                if (kVar5.d) {
                    int i38 = kVar5.b;
                    if (i38 < i34) {
                        j10 = 1 << i36;
                        i34 = i38;
                        i35 = 1;
                    } else if (i38 == i34) {
                        j10 |= 1 << i36;
                        i35++;
                    }
                }
                i36++;
                z15 = z17;
                i21 = i37;
            }
            i12 = i21;
            boolean z18 = z15;
            j3 |= j10;
            if (i35 > i33) {
                break;
            }
            int i39 = i34 + 1;
            int i40 = 0;
            while (i40 < childCount2) {
                View childAt2 = getChildAt(i40);
                m.k kVar6 = (m.k) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j11 = 1 << i40;
                if ((j10 & j11) != 0) {
                    if (z18 && kVar6.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i33 == 1) {
                            childAt2.setPadding(i11 + i32, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    kVar6.b += r11;
                    kVar6.f = r11;
                    i33--;
                } else if (kVar6.b == i39) {
                    j3 |= j11;
                }
                i40++;
                z11 = z19;
            }
            z15 = z18;
            i21 = i12;
            z16 = true;
        }
        i12 = i21;
        boolean z20 = !z11 && i22 == 1;
        if (i33 > 0 && j3 != 0 && (i33 < i22 - 1 || z20 || i23 > 1)) {
            float bitCount = Long.bitCount(j3);
            if (!z20) {
                if ((j3 & 1) != 0 && !((m.k) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount2 - 1;
                if ((j3 & (1 << i41)) != 0 && !((m.k) getChildAt(i41).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i33 * i32) / bitCount) : 0;
            boolean z21 = z16;
            for (int i43 = 0; i43 < childCount2; i43++) {
                if ((j3 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    m.k kVar7 = (m.k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kVar7.c = i42;
                        kVar7.f = true;
                        if (i43 == 0 && !kVar7.e) {
                            ((LinearLayout.LayoutParams) kVar7).leftMargin = (-i42) / 2;
                        }
                        z21 = true;
                    } else if (kVar7.a) {
                        kVar7.c = i42;
                        kVar7.f = true;
                        ((LinearLayout.LayoutParams) kVar7).rightMargin = (-i42) / 2;
                        z21 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) kVar7).leftMargin = i42 / 2;
                        }
                        if (i43 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) kVar7).rightMargin = i42 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i44 = 0; i44 < childCount2; i44++) {
                View childAt4 = getChildAt(i44);
                m.k kVar8 = (m.k) childAt4.getLayoutParams();
                if (kVar8.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((kVar8.b * i32) + kVar8.c, TLObject.FLAG_30), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i30);
    }

    public void setExpandedActionViewsExclusive(boolean z9) {
        this.J.G = z9;
    }

    public void setOnMenuItemClickListener(l lVar) {
        this.P = lVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        i iVar = this.J;
        h hVar = iVar.r;
        if (hVar != null) {
            hVar.setImageDrawable(drawable);
        } else {
            iVar.w = true;
            iVar.s = drawable;
        }
    }

    public void setOverflowReserved(boolean z9) {
        this.I = z9;
    }

    public void setPopupTheme(int i7) {
        if (this.H != i7) {
            this.H = i7;
            if (i7 == 0) {
                this.G = getContext();
            } else {
                this.G = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(i iVar) {
        this.J = iVar;
        iVar.n = this;
        this.F = iVar.c;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.N = (int) (56.0f * f10);
        this.O = (int) (f10 * 4.0f);
        this.G = context;
        this.H = 0;
    }

    @Override // m.x1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m.k(getContext(), attributeSet);
    }
}
