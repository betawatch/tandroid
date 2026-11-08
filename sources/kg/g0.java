package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zh;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g0 extends vh implements a6, ls, te.b {
    public final e0 D;
    public final jy E;
    public final zh F;
    public final te.a n;
    public final FrameLayout r;
    public final bi.q1 s;
    public final c0 w;
    public final HashSet x;
    public final d0 y;

    public g0(Context context, f6 f6Var, di diVar) {
        super(context, f6Var, diVar);
        this.n = new te.a(0, this, xq.h, 380L, false);
        this.x = new HashSet();
        this.D = new e0(this, context);
        ci ciVar = new ci(k6.d6, context, f6Var);
        ciVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        zh zhVar = new zh(context, f6Var, this.b);
        this.F = zhVar;
        zhVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 8);
        ah.i iVar = zhVar.r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(id.M0(2131752656, null));
        frameLayout.addView(ciVar, ha.g());
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(zhVar, d);
        jy jyVar = new jy(context, f6Var);
        this.E = jyVar;
        jyVar.c();
        addView(jyVar, ha.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        bi.q1 q1Var = new bi.q1(this, context, f6Var, 5);
        this.s = q1Var;
        q1Var.r1();
        setBlur3Capture(q1Var);
        this.d = q1Var;
        this.h = true;
        this.f = true;
        qs.e().h(q1Var, qs.i4, new ii.c(this, 4));
        q1Var.setClipToPadding(false);
        getContext();
        c0 c0Var = new c0(this, org.telegram.messenger.g0.L(9.0f), q1Var, 0);
        this.w = c0Var;
        q1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        q1Var.setHorizontalScrollBarEnabled(false);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setClipToPadding(false);
        addView(q1Var, ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d0 d0Var = new d0(this, context);
        this.y = d0Var;
        q1Var.setAdapter(d0Var);
        r6.m(q1Var, 21, k6.A5, f6Var);
        q1Var.setOnItemClickListener(new ai.k(this, 15));
        q1Var.setOnScrollListener(new ai.b(this, 21));
        FrameLayout.LayoutParams e10 = ha.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.m;
        addView(frameLayout, e10);
        P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        bi.q1 q1Var = this.s;
        if (q1Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        if (xi0Var == null) {
            return -1000;
        }
        int paddingTop = q1Var.getPaddingTop();
        if (xi0Var.b() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    @Override // org.telegram.ui.Components.vh
    public final void B(int i7, int i10) {
        int i11;
        di diVar = this.b;
        if (diVar.l3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            diVar.q0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    diVar.q0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            diVar.q0 = true;
        }
        this.s.q1(0, i11 + org.telegram.messenger.g0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.vh
    public final void H(vh vhVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.vh
    public final void J() {
        this.s.y0(0);
    }

    public final void P() {
        this.E.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        Q();
    }

    public final void Q() {
        View childAt;
        jy jyVar = this.E;
        if (jyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            jyVar.setTranslationY((childAt.getTop() + (jyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.U7));
        hashSet.add(Integer.valueOf(k6.T7));
        hashSet.add(Integer.valueOf(k6.S7));
        hashSet.add(Integer.valueOf(k6.R7));
        hashSet.add(Integer.valueOf(k6.Q7));
        hashSet.add(Integer.valueOf(k6.P7));
        hashSet.add(Integer.valueOf(k6.O7));
        hashSet.add(Integer.valueOf(k6.J7));
        hashSet.add(Integer.valueOf(k6.q5));
        hashSet.add(Integer.valueOf(k6.d7));
        hashSet.add(Integer.valueOf(k6.i6));
    }

    @Override // org.telegram.ui.Components.vh
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.s;
        if (q1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        int i7 = (top <= 0 || xi0Var == null || xi0Var.b() != 0) ? 0 : top;
        te.a aVar = this.n;
        if (top < 0 || xi0Var == null || xi0Var.b() != 0) {
            aVar.a(true, true);
            top = i7;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.vh
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.vh
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.vh
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.vh
    public ArrayList<t6> getThemeDescriptions() {
        ArrayList<t6> arrayList = new ArrayList<>();
        arrayList.add(new t6(this.E, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.c7));
        arrayList.add(new t6(this.E, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.h6));
        int i7 = k6.q5;
        arrayList.add(new t6(this.s, 0, new Class[]{f0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (s6) null, i7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        Q();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        zh zhVar = this.F;
        if (zhVar != null) {
            zhVar.setupBlurredBackground(cVar.c(zhVar, c8.g0.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.vh
    public final void p() {
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
    }
}
