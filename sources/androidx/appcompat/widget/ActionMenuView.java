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
import m.g;
import m.h;
import m.i;
import m.r3;
import m.v1;
import m.w1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ActionMenuView extends w1 implements j, z {
    public k G;
    public Context H;
    public int I;
    public boolean J;
    public h K;
    public hi.d L;
    public boolean M;
    public int N;
    public final int O;
    public final int P;
    public m.k Q;

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
        return this.G.q(mVar, null, 0);
    }

    @Override // l.z
    public final void b(k kVar) {
        this.G = kVar;
    }

    @Override // m.w1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m.j;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.w1
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ v1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.w1
    /* renamed from: f */
    public final v1 generateLayoutParams(AttributeSet attributeSet) {
        return new m.j(getContext(), attributeSet);
    }

    @Override // m.w1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // m.w1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.w1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.G == null) {
            Context context = getContext();
            k kVar = new k(context);
            this.G = kVar;
            kVar.e = new hi.d(this, 9);
            h hVar = new h(context);
            this.K = hVar;
            hVar.x = true;
            hVar.y = true;
            hVar.e = new mb.b(14);
            this.G.b(hVar, this.H);
            h hVar2 = this.K;
            hVar2.n = this;
            this.G = hVar2.c;
        }
        return this.G;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        h hVar = this.K;
        g gVar = hVar.r;
        if (gVar != null) {
            return gVar.getDrawable();
        }
        if (hVar.w) {
            return hVar.s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.I;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i3) {
        boolean z10 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof i)) {
            z10 = ((i) childAt).a();
        }
        return (i3 <= 0 || !(childAt2 instanceof i)) ? z10 : ((i) childAt2).c() | z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h hVar = this.K;
        if (hVar != null) {
            hVar.e();
            if (this.K.g()) {
                this.K.f();
                this.K.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.K;
        if (hVar != null) {
            hVar.f();
            m.d dVar = hVar.K;
            if (dVar == null || !dVar.b()) {
                return;
            }
            dVar.i.dismiss();
        }
    }

    @Override // m.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int width;
        int i13;
        if (!this.M) {
            super.onLayout(z10, i3, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i11 - i3;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = r3.a(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                m.j jVar = (m.j) childAt.getLayoutParams();
                if (jVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i13 = getPaddingLeft() + ((LinearLayout.LayoutParams) jVar).leftMargin;
                        width = i13 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) jVar).rightMargin;
                        i13 = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i13, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) jVar).leftMargin) + ((LinearLayout.LayoutParams) jVar).rightMargin;
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
                m.j jVar2 = (m.j) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !jVar2.a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) jVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) jVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            m.j jVar3 = (m.j) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !jVar3.a) {
                int i27 = paddingLeft + ((LinearLayout.LayoutParams) jVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) jVar3).rightMargin + max + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // m.w1, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        k kVar;
        boolean z10 = this.M;
        boolean z11 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.M = z11;
        if (z10 != z11) {
            this.N = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.M && (kVar = this.G) != null && size != this.N) {
            this.N = size;
            kVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.M || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                m.j jVar = (m.j) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) jVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) jVar).leftMargin = 0;
            }
            super.onMeasure(i3, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.O;
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
            i11 = this.P;
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
                m.j jVar2 = (m.j) childAt.getLayoutParams();
                jVar2.f = false;
                jVar2.c = 0;
                jVar2.b = 0;
                jVar2.d = false;
                ((LinearLayout.LayoutParams) jVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) jVar2).rightMargin = 0;
                jVar2.e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i28 = jVar2.a ? 1 : i18;
                m.j jVar3 = (m.j) childAt.getLayoutParams();
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
                jVar3.d = !jVar3.a && z15;
                jVar3.b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, TLObject.FLAG_30), makeMeasureSpec);
                i23 = Math.max(i23, i14);
                if (jVar2.d) {
                    i25++;
                }
                if (jVar2.a) {
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
                m.j jVar4 = (m.j) getChildAt(i36).getLayoutParams();
                boolean z18 = z16;
                if (jVar4.d) {
                    int i38 = jVar4.b;
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
                m.j jVar5 = (m.j) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j12 = 1 << i40;
                if ((j11 & j12) != 0) {
                    if (z19 && jVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i33 == 1) {
                            childAt2.setPadding(i11 + i32, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    jVar5.b += r11;
                    jVar5.f = r11;
                    i33--;
                } else if (jVar5.b == i39) {
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
                if ((j10 & 1) != 0 && !((m.j) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount2 - 1;
                if ((j10 & (1 << i41)) != 0 && !((m.j) getChildAt(i41).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i33 * i32) / bitCount) : 0;
            boolean z22 = z17;
            for (int i43 = 0; i43 < childCount2; i43++) {
                if ((j10 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    m.j jVar6 = (m.j) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        jVar6.c = i42;
                        jVar6.f = true;
                        if (i43 == 0 && !jVar6.e) {
                            ((LinearLayout.LayoutParams) jVar6).leftMargin = (-i42) / 2;
                        }
                        z22 = true;
                    } else if (jVar6.a) {
                        jVar6.c = i42;
                        jVar6.f = true;
                        ((LinearLayout.LayoutParams) jVar6).rightMargin = (-i42) / 2;
                        z22 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) jVar6).leftMargin = i42 / 2;
                        }
                        if (i43 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) jVar6).rightMargin = i42 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i44 = 0; i44 < childCount2; i44++) {
                View childAt4 = getChildAt(i44);
                m.j jVar7 = (m.j) childAt4.getLayoutParams();
                if (jVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((jVar7.b * i32) + jVar7.c, TLObject.FLAG_30), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i30);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.K.H = z10;
    }

    public void setOnMenuItemClickListener(m.k kVar) {
        this.Q = kVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        h hVar = this.K;
        g gVar = hVar.r;
        if (gVar != null) {
            gVar.setImageDrawable(drawable);
        } else {
            hVar.w = true;
            hVar.s = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.J = z10;
    }

    public void setPopupTheme(int i3) {
        if (this.I != i3) {
            this.I = i3;
            if (i3 == 0) {
                this.H = getContext();
            } else {
                this.H = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(h hVar) {
        this.K = hVar;
        hVar.n = this;
        this.G = hVar.c;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.O = (int) (56.0f * f10);
        this.P = (int) (f10 * 4.0f);
        this.H = context;
        this.I = 0;
    }

    @Override // m.w1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m.j(getContext(), attributeSet);
    }
}
