package androidx.appcompat.widget;

import ag.o1;
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
import f7.v;
import l.j;
import l.k;
import l.m;
import l.z;
import m.e;
import m.h;
import m.i;
import m.l;
import m.v3;
import m.w1;
import m.x1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ActionMenuView extends x1 implements j, z {
    public k B;
    public Context C;
    public int D;
    public boolean E;
    public i F;
    public m5.i G;
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
            kVar.e = new o1(this, 22);
            i iVar = new i(context);
            this.F = iVar;
            iVar.w = true;
            iVar.x = true;
            iVar.e = new v(12);
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

    public final boolean k(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof m.j)) {
            z10 = ((m.j) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof m.j)) ? z10 : ((m.j) childAt2).c() | z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i iVar = this.F;
        if (iVar != null) {
            iVar.e();
            if (this.F.h()) {
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.H) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = v3.a(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                m.k kVar = (m.k) childAt.getLayoutParams();
                if (kVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) kVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) kVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) kVar).leftMargin) + ((LinearLayout.LayoutParams) kVar).rightMargin;
                    k(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                m.k kVar2 = (m.k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !kVar2.a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) kVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) kVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            m.k kVar3 = (m.k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !kVar3.a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) kVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) kVar3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // m.x1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        k kVar;
        boolean z10 = this.H;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.H = z11;
        if (z10 != z11) {
            this.I = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.H && (kVar = this.B) != null && size != this.I) {
            this.I = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.H || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                m.k kVar2 = (m.k) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) kVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) kVar2).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.J;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z12 = false;
        int i26 = 0;
        long j10 = 0;
        while (true) {
            i12 = this.K;
            if (i25 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i25);
            int i27 = size3;
            int i28 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i23++;
                if (z13) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                m.k kVar3 = (m.k) childAt.getLayoutParams();
                kVar3.f = false;
                kVar3.c = 0;
                kVar3.b = 0;
                kVar3.d = false;
                ((LinearLayout.LayoutParams) kVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) kVar3).rightMargin = 0;
                kVar3.e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i29 = kVar3.a ? 1 : i19;
                m.k kVar4 = (m.k) childAt.getLayoutParams();
                int i30 = i19;
                i14 = i21;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i28, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i29 <= 0 || (z14 && i29 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i29, TLObject.FLAG_31), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z15 && i15 < 2) {
                        i15 = 2;
                    }
                }
                kVar4.d = !kVar4.a && z15;
                kVar4.b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, TLObject.FLAG_30), makeMeasureSpec);
                i24 = Math.max(i24, i15);
                if (kVar3.d) {
                    i26++;
                }
                if (kVar3.a) {
                    z12 = true;
                }
                i19 = i30 - i15;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j10 |= 1 << i25;
                }
            }
            i25++;
            size3 = i27;
            paddingBottom = i28;
            i21 = i14;
        }
        int i31 = size3;
        int i32 = i19;
        int i33 = i21;
        boolean z16 = z12 && i23 == 2;
        int i34 = i32;
        boolean z17 = false;
        while (i26 > 0 && i34 > 0) {
            int i35 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            long j11 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i37 < childCount2) {
                int i38 = i22;
                m.k kVar5 = (m.k) getChildAt(i37).getLayoutParams();
                boolean z18 = z16;
                if (kVar5.d) {
                    int i39 = kVar5.b;
                    if (i39 < i35) {
                        j11 = 1 << i37;
                        i35 = i39;
                        i36 = 1;
                    } else if (i39 == i35) {
                        j11 |= 1 << i37;
                        i36++;
                    }
                }
                i37++;
                z16 = z18;
                i22 = i38;
            }
            i13 = i22;
            boolean z19 = z16;
            j10 |= j11;
            if (i36 > i34) {
                break;
            }
            int i40 = i35 + 1;
            int i41 = 0;
            while (i41 < childCount2) {
                View childAt2 = getChildAt(i41);
                m.k kVar6 = (m.k) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j12 = 1 << i41;
                if ((j11 & j12) != 0) {
                    if (z19 && kVar6.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i34 == 1) {
                            childAt2.setPadding(i12 + i33, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    kVar6.b += r11;
                    kVar6.f = r11;
                    i34--;
                } else if (kVar6.b == i40) {
                    j10 |= j12;
                }
                i41++;
                z12 = z20;
            }
            z16 = z19;
            i22 = i13;
            z17 = true;
        }
        i13 = i22;
        boolean z21 = !z12 && i23 == 1;
        if (i34 > 0 && j10 != 0 && (i34 < i23 - 1 || z21 || i24 > 1)) {
            float bitCount = Long.bitCount(j10);
            if (!z21) {
                if ((j10 & 1) != 0 && !((m.k) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i42 = childCount2 - 1;
                if ((j10 & (1 << i42)) != 0 && !((m.k) getChildAt(i42).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i43 = bitCount > 0.0f ? (int) ((i34 * i33) / bitCount) : 0;
            boolean z22 = z17;
            for (int i44 = 0; i44 < childCount2; i44++) {
                if ((j10 & (1 << i44)) != 0) {
                    View childAt3 = getChildAt(i44);
                    m.k kVar7 = (m.k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        kVar7.c = i43;
                        kVar7.f = true;
                        if (i44 == 0 && !kVar7.e) {
                            ((LinearLayout.LayoutParams) kVar7).leftMargin = (-i43) / 2;
                        }
                        z22 = true;
                    } else if (kVar7.a) {
                        kVar7.c = i43;
                        kVar7.f = true;
                        ((LinearLayout.LayoutParams) kVar7).rightMargin = (-i43) / 2;
                        z22 = true;
                    } else {
                        if (i44 != 0) {
                            ((LinearLayout.LayoutParams) kVar7).leftMargin = i43 / 2;
                        }
                        if (i44 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) kVar7).rightMargin = i43 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i45 = 0; i45 < childCount2; i45++) {
                View childAt4 = getChildAt(i45);
                m.k kVar8 = (m.k) childAt4.getLayoutParams();
                if (kVar8.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((kVar8.b * i33) + kVar8.c, TLObject.FLAG_30), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i31);
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

    public void setPopupTheme(int i10) {
        if (this.D != i10) {
            this.D = i10;
            if (i10 == 0) {
                this.C = getContext();
            } else {
                this.C = new ContextThemeWrapper(getContext(), i10);
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
        float f9 = context.getResources().getDisplayMetrics().density;
        this.J = (int) (56.0f * f9);
        this.K = (int) (f9 * 4.0f);
        this.C = context;
        this.D = 0;
    }

    @Override // m.x1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m.k(getContext(), attributeSet);
    }
}
