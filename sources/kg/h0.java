package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.k8;
import c8.ma;
import hi.s6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h0 extends mi implements b6, gs, te.b {
    public final f0 E;
    public final vy F;
    public final qi G;
    public final te.a n;
    public final FrameLayout r;
    public final di.b1 s;
    public final d0 w;
    public final HashSet x;
    public final e0 y;

    public h0(Context context, h6 h6Var, ui uiVar) {
        super(context, h6Var, uiVar);
        this.n = new te.a(0, this, nr.h, 380L, false);
        this.x = new HashSet();
        this.E = new f0(this, context);
        ti tiVar = new ti(m6.d6, context, h6Var);
        tiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        qi qiVar = new qi(context, h6Var, this.b);
        this.G = qiVar;
        qiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 10);
        ah.i iVar = qiVar.r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(hd.N0(2131752644, null));
        frameLayout.addView(tiVar, ma.g());
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(qiVar, d);
        vy vyVar = new vy(context, h6Var);
        this.F = vyVar;
        vyVar.c();
        addView(vyVar, ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, h6Var, 4);
        this.s = b1Var;
        b1Var.r1();
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f = true;
        ls.e().h(b1Var, ls.l4, new s6(this, 8));
        b1Var.setClipToPadding(false);
        getContext();
        d0 d0Var = new d0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 0);
        this.w = d0Var;
        b1Var.setLayoutManager(d0Var);
        d0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        e0 e0Var = new e0(this, context);
        this.y = e0Var;
        b1Var.setAdapter(e0Var);
        t6.l(b1Var, 21, m6.A5, h6Var);
        b1Var.setOnItemClickListener(new k8(this, 15));
        b1Var.setOnScrollListener(new bi.u1(this, 19));
        FrameLayout.LayoutParams e10 = ma.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.m;
        addView(frameLayout, e10);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        di.b1 b1Var = this.s;
        if (b1Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        if (mj0Var == null) {
            return -1000;
        }
        int paddingTop = b1Var.getPaddingTop();
        if (mj0Var.b() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    @Override // org.telegram.ui.Components.mi
    public final void B(int i7, int i10) {
        int i11;
        ui uiVar = this.b;
        if (uiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            uiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    uiVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            uiVar.r0 = true;
        }
        this.s.q1(0, i11 + org.telegram.messenger.g0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.mi
    public final void I(mi miVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.mi
    public final void K() {
        this.s.y0(0);
    }

    public final void Q() {
        this.F.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        R();
    }

    public final void R() {
        View childAt;
        vy vyVar = this.F;
        if (vyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            vyVar.setTranslationY((childAt.getTop() + (vyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.U7));
        hashSet.add(Integer.valueOf(m6.T7));
        hashSet.add(Integer.valueOf(m6.S7));
        hashSet.add(Integer.valueOf(m6.R7));
        hashSet.add(Integer.valueOf(m6.Q7));
        hashSet.add(Integer.valueOf(m6.P7));
        hashSet.add(Integer.valueOf(m6.O7));
        hashSet.add(Integer.valueOf(m6.J7));
        hashSet.add(Integer.valueOf(m6.q5));
        hashSet.add(Integer.valueOf(m6.d7));
        hashSet.add(Integer.valueOf(m6.i6));
    }

    @Override // org.telegram.ui.Components.mi
    public int getCurrentItemTop() {
        di.b1 b1Var = this.s;
        if (b1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        int i7 = (top <= 0 || mj0Var == null || mj0Var.b() != 0) ? 0 : top;
        te.a aVar = this.n;
        if (top < 0 || mj0Var == null || mj0Var.b() != 0) {
            aVar.a(true, true);
            top = i7;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.mi
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.mi
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.mi
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.mi
    public ArrayList<v6> getThemeDescriptions() {
        ArrayList<v6> arrayList = new ArrayList<>();
        arrayList.add(new v6(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (u6) null, m6.c7));
        arrayList.add(new v6(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (u6) null, m6.h6));
        int i7 = m6.q5;
        arrayList.add(new v6(this.s, 0, new Class[]{g0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (u6) null, i7));
        return arrayList;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(dh.c cVar) {
        qi qiVar = this.G;
        if (qiVar != null) {
            qiVar.setupBlurredBackground(cVar.c(qiVar, c8.i0.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.mi
    public final void p() {
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
    }
}
