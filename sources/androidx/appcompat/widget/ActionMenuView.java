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
import androidx.biometric.f0;
import h7.u;
import l.j;
import l.k;
import l.m;
import l.z;
import m.g;
import m.h;
import m.i;
import m.v3;
import m.w1;
import m.x1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class ActionMenuView extends x1 implements j, z {
    public k C;
    public Context D;
    public int E;
    public boolean F;
    public h G;
    public f0 H;
    public boolean I;
    public int J;
    public final int K;
    public final int L;
    public m.k M;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static m.j i() {
        m.j jVar = new m.j(-2, -2);
        jVar.a = false;
        ((LinearLayout.LayoutParams) jVar).gravity = 16;
        return jVar;
    }

    public static m.j j(ViewGroup.LayoutParams layoutParams) {
        m.j jVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof m.j) {
            m.j jVar2 = (m.j) layoutParams;
            jVar = new m.j(jVar2);
            jVar.a = jVar2.a;
        } else {
            jVar = new m.j(layoutParams);
        }
        if (((LinearLayout.LayoutParams) jVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) jVar).gravity = 16;
        }
        return jVar;
    }

    @Override // l.j
    public final boolean a(m mVar) {
        return this.C.q(mVar, null, 0);
    }

    @Override // l.z
    public final void b(k kVar) {
        this.C = kVar;
    }

    @Override // m.x1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.j;
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
        return new m.j(getContext(), attributeSet);
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
        if (this.C == null) {
            Context context = getContext();
            k kVar = new k(context);
            this.C = kVar;
            kVar.e = new a3.c(this, 24);
            h hVar = new h(context);
            this.G = hVar;
            hVar.w = true;
            hVar.x = true;
            hVar.e = new u(11);
            this.C.b(hVar, this.D);
            h hVar2 = this.G;
            hVar2.n = this;
            this.C = hVar2.c;
        }
        return this.C;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        h hVar = this.G;
        g gVar = hVar.r;
        if (gVar != null) {
            return gVar.getDrawable();
        }
        if (hVar.v) {
            return hVar.s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.E;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i10) {
        boolean z4 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof i)) {
            z4 = ((i) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof i)) ? z4 : ((i) childAt2).c() | z4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h hVar = this.G;
        if (hVar != null) {
            hVar.e();
            if (this.G.g()) {
                this.G.f();
                this.G.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.G;
        if (hVar != null) {
            hVar.f();
            m.d dVar = hVar.G;
            if (dVar == null || !dVar.b()) {
                return;
            }
            dVar.i.dismiss();
        }
    }

    @Override // m.x1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.I) {
            super.onLayout(z4, i10, i11, i12, i13);
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
                m.j jVar = (m.j) childAt.getLayoutParams();
                if (jVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) jVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) jVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) jVar).leftMargin) + ((LinearLayout.LayoutParams) jVar).rightMargin;
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
                m.j jVar2 = (m.j) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !jVar2.a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) jVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) jVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            m.j jVar3 = (m.j) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !jVar3.a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) jVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) jVar3).rightMargin + max + i28;
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
        boolean z4 = this.I;
        boolean z10 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.I = z10;
        if (z4 != z10) {
            this.J = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.I && (kVar = this.C) != null && size != this.J) {
            this.J = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.I || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                m.j jVar = (m.j) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) jVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) jVar).leftMargin = 0;
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
        int i18 = this.K;
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
        boolean z11 = false;
        int i26 = 0;
        long j10 = 0;
        while (true) {
            i12 = this.L;
            if (i25 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i25);
            int i27 = size3;
            int i28 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i23++;
                if (z12) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                m.j jVar2 = (m.j) childAt.getLayoutParams();
                jVar2.f = false;
                jVar2.c = 0;
                jVar2.b = 0;
                jVar2.d = false;
                ((LinearLayout.LayoutParams) jVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) jVar2).rightMargin = 0;
                jVar2.e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i29 = jVar2.a ? 1 : i19;
                m.j jVar3 = (m.j) childAt.getLayoutParams();
                int i30 = i19;
                i14 = i21;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i28, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i29 <= 0 || (z13 && i29 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i29, TLObject.FLAG_31), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z14 && i15 < 2) {
                        i15 = 2;
                    }
                }
                jVar3.d = !jVar3.a && z14;
                jVar3.b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, TLObject.FLAG_30), makeMeasureSpec);
                i24 = Math.max(i24, i15);
                if (jVar2.d) {
                    i26++;
                }
                if (jVar2.a) {
                    z11 = true;
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
        boolean z15 = z11 && i23 == 2;
        int i34 = i32;
        boolean z16 = false;
        while (i26 > 0 && i34 > 0) {
            int i35 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            long j11 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i37 < childCount2) {
                int i38 = i22;
                m.j jVar4 = (m.j) getChildAt(i37).getLayoutParams();
                boolean z17 = z15;
                if (jVar4.d) {
                    int i39 = jVar4.b;
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
                z15 = z17;
                i22 = i38;
            }
            i13 = i22;
            boolean z18 = z15;
            j10 |= j11;
            if (i36 > i34) {
                break;
            }
            int i40 = i35 + 1;
            int i41 = 0;
            while (i41 < childCount2) {
                View childAt2 = getChildAt(i41);
                m.j jVar5 = (m.j) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j12 = 1 << i41;
                if ((j11 & j12) != 0) {
                    if (z18 && jVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i34 == 1) {
                            childAt2.setPadding(i12 + i33, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    jVar5.b += r11;
                    jVar5.f = r11;
                    i34--;
                } else if (jVar5.b == i40) {
                    j10 |= j12;
                }
                i41++;
                z11 = z19;
            }
            z15 = z18;
            i22 = i13;
            z16 = true;
        }
        i13 = i22;
        boolean z20 = !z11 && i23 == 1;
        if (i34 > 0 && j10 != 0 && (i34 < i23 - 1 || z20 || i24 > 1)) {
            float bitCount = Long.bitCount(j10);
            if (!z20) {
                if ((j10 & 1) != 0 && !((m.j) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i42 = childCount2 - 1;
                if ((j10 & (1 << i42)) != 0 && !((m.j) getChildAt(i42).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i43 = bitCount > 0.0f ? (int) ((i34 * i33) / bitCount) : 0;
            boolean z21 = z16;
            for (int i44 = 0; i44 < childCount2; i44++) {
                if ((j10 & (1 << i44)) != 0) {
                    View childAt3 = getChildAt(i44);
                    m.j jVar6 = (m.j) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        jVar6.c = i43;
                        jVar6.f = true;
                        if (i44 == 0 && !jVar6.e) {
                            ((LinearLayout.LayoutParams) jVar6).leftMargin = (-i43) / 2;
                        }
                        z21 = true;
                    } else if (jVar6.a) {
                        jVar6.c = i43;
                        jVar6.f = true;
                        ((LinearLayout.LayoutParams) jVar6).rightMargin = (-i43) / 2;
                        z21 = true;
                    } else {
                        if (i44 != 0) {
                            ((LinearLayout.LayoutParams) jVar6).leftMargin = i43 / 2;
                        }
                        if (i44 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) jVar6).rightMargin = i43 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i45 = 0; i45 < childCount2; i45++) {
                View childAt4 = getChildAt(i45);
                m.j jVar7 = (m.j) childAt4.getLayoutParams();
                if (jVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((jVar7.b * i33) + jVar7.c, TLObject.FLAG_30), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i31);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.G.D = z4;
    }

    public void setOnMenuItemClickListener(m.k kVar) {
        this.M = kVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        h hVar = this.G;
        g gVar = hVar.r;
        if (gVar != null) {
            gVar.setImageDrawable(drawable);
        } else {
            hVar.v = true;
            hVar.s = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.F = z4;
    }

    public void setPopupTheme(int i10) {
        if (this.E != i10) {
            this.E = i10;
            if (i10 == 0) {
                this.D = getContext();
            } else {
                this.D = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(h hVar) {
        this.G = hVar;
        hVar.n = this;
        this.C = hVar.c;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.K = (int) (56.0f * f10);
        this.L = (int) (f10 * 4.0f);
        this.D = context;
        this.E = 0;
    }

    @Override // m.x1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m.j(getContext(), attributeSet);
    }
}
