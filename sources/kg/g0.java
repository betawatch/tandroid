package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.i8;
import c8.ma;
import hi.t6;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ty;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g0 extends ki implements c6, fs, te.b {
    public final e0 E;
    public final ty F;
    public final oi G;
    public final te.a n;
    public final FrameLayout r;
    public final di.b1 s;
    public final c0 w;
    public final HashSet x;
    public final d0 y;

    public g0(Context context, i6 i6Var, si siVar) {
        super(context, i6Var, siVar);
        this.n = new te.a(0, this, lr.h, 380L, false);
        this.x = new HashSet();
        this.E = new e0(this, context);
        ri riVar = new ri(n6.d6, context, i6Var);
        riVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        oi oiVar = new oi(context, i6Var, this.b);
        this.G = oiVar;
        oiVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 10);
        ah.i iVar = oiVar.r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(gd.M0(2131752645, null));
        frameLayout.addView(riVar, ma.g());
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(oiVar, d);
        ty tyVar = new ty(context, i6Var);
        this.F = tyVar;
        tyVar.c();
        addView(tyVar, ma.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.b1 b1Var = new di.b1(this, context, i6Var, 4);
        this.s = b1Var;
        b1Var.r1();
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.h = true;
        this.f = true;
        ks.e().h(b1Var, ks.k4, new t6(this, 8));
        b1Var.setClipToPadding(false);
        getContext();
        c0 c0Var = new c0(this, org.telegram.messenger.g0.L(9.0f), b1Var, 0);
        this.w = c0Var;
        b1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        b1Var.setHorizontalScrollBarEnabled(false);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setClipToPadding(false);
        addView(b1Var, ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d0 d0Var = new d0(this, context);
        this.y = d0Var;
        b1Var.setAdapter(d0Var);
        u6.l(b1Var, 21, n6.A5, i6Var);
        b1Var.setOnItemClickListener(new i8(this, 15));
        b1Var.setOnScrollListener(new bi.q1(this, 19));
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
        kj0 kj0Var = (kj0) b1Var.G(childAt);
        if (kj0Var == null) {
            return -1000;
        }
        int paddingTop = b1Var.getPaddingTop();
        if (kj0Var.b() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    @Override // org.telegram.ui.Components.ki
    public final void B(int i7, int i10) {
        int i11;
        si siVar = this.b;
        if (siVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            siVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    siVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            siVar.r0 = true;
        }
        this.s.q1(0, i11 + org.telegram.messenger.g0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ki
    public final void I(ki kiVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ki
    public final void K() {
        this.s.y0(0);
    }

    public final void Q() {
        this.F.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        R();
    }

    public final void R() {
        View childAt;
        ty tyVar = this.F;
        if (tyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            tyVar.setTranslationY((childAt.getTop() + (tyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.U7));
        hashSet.add(Integer.valueOf(n6.T7));
        hashSet.add(Integer.valueOf(n6.S7));
        hashSet.add(Integer.valueOf(n6.R7));
        hashSet.add(Integer.valueOf(n6.Q7));
        hashSet.add(Integer.valueOf(n6.P7));
        hashSet.add(Integer.valueOf(n6.O7));
        hashSet.add(Integer.valueOf(n6.J7));
        hashSet.add(Integer.valueOf(n6.q5));
        hashSet.add(Integer.valueOf(n6.d7));
        hashSet.add(Integer.valueOf(n6.i6));
    }

    @Override // org.telegram.ui.Components.ki
    public int getCurrentItemTop() {
        di.b1 b1Var = this.s;
        if (b1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = b1Var.getChildAt(0);
        kj0 kj0Var = (kj0) b1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        int i7 = (top <= 0 || kj0Var == null || kj0Var.b() != 0) ? 0 : top;
        te.a aVar = this.n;
        if (top < 0 || kj0Var == null || kj0Var.b() != 0) {
            aVar.a(true, true);
            top = i7;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ki
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ki
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ki
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ki
    public ArrayList<w6> getThemeDescriptions() {
        ArrayList<w6> arrayList = new ArrayList<>();
        arrayList.add(new w6(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (v6) null, n6.c7));
        arrayList.add(new w6(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (v6) null, n6.h6));
        int i7 = n6.q5;
        arrayList.add(new w6(this.s, 0, new Class[]{f0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (v6) null, i7));
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
        oi oiVar = this.G;
        if (oiVar != null) {
            oiVar.setupBlurredBackground(cVar.c(oiVar, c8.i0.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.ki
    public final void p() {
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
    }
}
