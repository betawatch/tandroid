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
import l.j;
import l.k;
import l.m;
import l.z;
import m.e;
import m.h;
import m.i;
import m.l;
import m.w1;
import m.w3;
import m.x1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ActionMenuView extends x1 implements j, z {
    public k B;
    public Context C;
    public int D;
    public boolean E;
    public i F;
    public android.support.v4.media.c G;
    public boolean H;
    public int I;
    public final int J;
    public final int K;
    public l L;

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
        return this.B.q(mVar, null, 0);
    }

    @Override // l.z
    public final void b(k kVar) {
        this.B = kVar;
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
        if (this.B == null) {
            Context context = getContext();
            k kVar = new k(context);
            this.B = kVar;
            kVar.e = new xa.c(this, 25);
            i iVar = new i(context);
            this.F = iVar;
            iVar.w = true;
            iVar.x = true;
            iVar.e = new v9.d(14);
            this.B.b(iVar, this.C);
            i iVar2 = this.F;
            iVar2.n = this;
            this.B = iVar2.c;
        }
        return this.B;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        i iVar = this.F;
        h hVar = iVar.r;
        if (hVar != null) {
            return hVar.getDrawable();
        }
        if (iVar.v) {
            return iVar.s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i9) {
        boolean z10 = false;
        if (i9 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i9 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i9);
        if (i9 < getChildCount() && (childAt instanceof m.j)) {
            z10 = ((m.j) childAt).a();
        }
        return (i9 <= 0 || !(childAt2 instanceof m.j)) ? z10 : ((m.j) childAt2).c() | z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i iVar = this.F;
        if (iVar != null) {
            iVar.e();
            if (this.F.g()) {
                this.F.f();
                this.F.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.F;
        if (iVar != null) {
            iVar.f();
            e eVar = iVar.F;
            if (eVar == null || !eVar.b()) {
                return;
            }
            eVar.i.dismiss();
        }
    }

    @Override // m.x1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int width;
        int i13;
        if (!this.H) {
            super.onLayout(z10, i9, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i11 - i9;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = w3.a(this);
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
                    if (a2) {
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
        if (a2) {
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
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        k kVar;
        boolean z10 = this.H;
        boolean z11 = View.MeasureSpec.getMode(i9) == 1073741824;
        this.H = z11;
        if (z10 != z11) {
            this.I = 0;
        }
        int size = View.MeasureSpec.getSize(i9);
        if (this.H && (kVar = this.B) != null && size != this.I) {
            this.I = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.H || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                m.k kVar2 = (m.k) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) kVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) kVar2).leftMargin = 0;
            }
            super.onMeasure(i9, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i9);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.J;
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
        boolean z12 = false;
        int i25 = 0;
        long j10 = 0;
        while (true) {
            i11 = this.K;
            if (i24 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i24);
            int i26 = size3;
            int i27 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                m.k kVar3 = (m.k) childAt.getLayoutParams();
                kVar3.f = false;
                kVar3.c = 0;
                kVar3.b = 0;
                kVar3.d = false;
                ((LinearLayout.LayoutParams) kVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) kVar3).rightMargin = 0;
                kVar3.e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = kVar3.a ? 1 : i18;
                m.k kVar4 = (m.k) childAt.getLayoutParams();
                int i29 = i18;
                i13 = i20;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i27, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i28 <= 0 || (z14 && i28 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i28, TLObject.FLAG_31), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z15 && i14 < 2) {
                        i14 = 2;
                    }
                }
                kVar4.d = !kVar4.a && z15;
                kVar4.b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, TLObject.FLAG_30), makeMeasureSpec);
                i23 = Math.max(i23, i14);
                if (kVar3.d) {
                    i25++;
                }
                if (kVar3.a) {
                    z12 = true;
                }
                i18 = i29 - i14;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j10 |= 1 << i24;
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
        boolean z16 = z12 && i22 == 2;
        int i33 = i31;
        boolean z17 = false;
        while (i25 > 0 && i33 > 0) {
            int i34 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            long j11 = 0;
            int i35 = 0;
            int i36 = 0;
            while (i36 < childCount2) {
                int i37 = i21;
                m.k kVar5 = (m.k) getChildAt(i36).getLayoutParams();
                boolean z18 = z16;
                if (kVar5.d) {
                    int i38 = kVar5.b;
                    if (i38 < i34) {
                        j11 = 1 << i36;
                        i34 = i38;
                        i35 = 1;
                    } else if (i38 == i34) {
                        j11 |= 1 << i36;
                        i35++;
                    }
                }
                i36++;
                z16 = z18;
                i21 = i37;
            }
            i12 = i21;
            boolean z19 = z16;
            j10 |= j11;
            if (i35 > i33) {
                break;
            }
            int i39 = i34 + 1;
            int i40 = 0;
            while (i40 < childCount2) {
                View childAt2 = getChildAt(i40);
                m.k kVar6 = (m.k) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j12 = 1 << i40;
                if ((j11 & j12) != 0) {
                    if (z19 && kVar6.e) {
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
                    j10 |= j12;
                }
                i40++;
                z12 = z20;
            }
            z16 = z19;
            i21 = i12;
            z17 = true;
        }
        i12 = i21;
        boolean z21 = !z12 && i22 == 1;
        if (i33 > 0 && j10 != 0 && (i33 < i22 - 1 || z21 || i23 > 1)) {
            float bitCount = Long.bitCount(j10);
            if (!z21) {
                if ((j10 & 1) != 0 && !((m.k) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount2 - 1;
                if ((j10 & (1 << i41)) != 0 && !((m.k) getChildAt(i41).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i33 * i32) / bitCount) : 0;
            boolean z22 = z17;
            for (int i43 = 0; i43 < childCount2; i43++) {
                if ((j10 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    m.k kVar7 = (m.k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kVar7.c = i42;
                        kVar7.f = true;
                        if (i43 == 0 && !kVar7.e) {
                            ((LinearLayout.LayoutParams) kVar7).leftMargin = (-i42) / 2;
                        }
                        z22 = true;
                    } else if (kVar7.a) {
                        kVar7.c = i42;
                        kVar7.f = true;
                        ((LinearLayout.LayoutParams) kVar7).rightMargin = (-i42) / 2;
                        z22 = true;
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
            z17 = z22;
        }
        if (z17) {
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

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.F.C = z10;
    }

    public void setOnMenuItemClickListener(l lVar) {
        this.L = lVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        i iVar = this.F;
        h hVar = iVar.r;
        if (hVar != null) {
            hVar.setImageDrawable(drawable);
        } else {
            iVar.v = true;
            iVar.s = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.E = z10;
    }

    public void setPopupTheme(int i9) {
        if (this.D != i9) {
            this.D = i9;
            if (i9 == 0) {
                this.C = getContext();
            } else {
                this.C = new ContextThemeWrapper(getContext(), i9);
            }
        }
    }

    public void setPresenter(i iVar) {
        this.F = iVar;
        iVar.n = this;
        this.B = iVar.c;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.J = (int) (56.0f * f10);
        this.K = (int) (f10 * 4.0f);
        this.C = context;
        this.D = 0;
    }

    @Override // m.x1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m.k(getContext(), attributeSet);
    }
}
