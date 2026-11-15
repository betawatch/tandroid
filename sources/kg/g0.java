package kg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi.b6;
import bi.z4;
import c8.ja;
import hi.g7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ny;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g0 extends ci implements z5, is, te.b {
    public final e0 E;
    public final ny F;
    public final gi G;
    public final te.a n;
    public final FrameLayout r;
    public final di.c1 s;
    public final c0 w;
    public final HashSet x;
    public final d0 y;

    public g0(Context context, e6 e6Var, ki kiVar) {
        super(context, e6Var, kiVar);
        this.n = new te.a(0, this, er.h, 380L, false);
        this.x = new HashSet();
        this.E = new e0(this, context);
        ji jiVar = new ji(j6.d6, context, e6Var);
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        gi giVar = new gi(context, e6Var, this.b);
        this.G = giVar;
        giVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        ah.j jVar = new ah.j(this, 9);
        ah.i iVar = giVar.r;
        iVar.addTextChangedListener(jVar);
        iVar.setHint(hd.M0(2131752656, null));
        frameLayout.addView(jiVar, ja.g());
        FrameLayout.LayoutParams d = ja.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += org.telegram.messenger.g0.m;
        frameLayout.addView(giVar, d);
        ny nyVar = new ny(context, e6Var);
        this.F = nyVar;
        nyVar.c();
        addView(nyVar, ja.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        di.c1 c1Var = new di.c1(this, context, e6Var, 4);
        this.s = c1Var;
        c1Var.r1();
        setBlur3Capture(c1Var);
        this.d = c1Var;
        this.h = true;
        this.f = true;
        ns.e().h(c1Var, ns.i4, new g7(this, 7));
        c1Var.setClipToPadding(false);
        getContext();
        c0 c0Var = new c0(this, org.telegram.messenger.g0.L(9.0f), c1Var, 0);
        this.w = c0Var;
        c1Var.setLayoutManager(c0Var);
        c0Var.P = false;
        c1Var.setHorizontalScrollBarEnabled(false);
        c1Var.setVerticalScrollBarEnabled(false);
        c1Var.setClipToPadding(false);
        addView(c1Var, ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        d0 d0Var = new d0(this, context);
        this.y = d0Var;
        c1Var.setAdapter(d0Var);
        q6.l(c1Var, 21, j6.A5, e6Var);
        c1Var.setOnItemClickListener(new b6(this, 15));
        c1Var.setOnScrollListener(new z4(this, 18));
        FrameLayout.LayoutParams e10 = ja.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e10).height += org.telegram.messenger.g0.m;
        addView(frameLayout, e10);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentTop() {
        di.c1 c1Var = this.s;
        if (c1Var.getChildCount() == 0) {
            return -1000;
        }
        int i7 = 0;
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        if (cj0Var == null) {
            return -1000;
        }
        int paddingTop = c1Var.getPaddingTop();
        if (cj0Var.b() == 0 && childAt.getTop() >= 0) {
            i7 = childAt.getTop();
        }
        return paddingTop - i7;
    }

    @Override // org.telegram.ui.Components.ci
    public final void B(int i7, int i10) {
        int i11;
        ki kiVar = this.b;
        if (kiVar.p3.Q() > org.telegram.messenger.g0.L(20.0f)) {
            i11 = org.telegram.messenger.g0.L(8.0f);
            kiVar.r0 = false;
        } else {
            if (!org.telegram.messenger.g0.Q1()) {
                Point point = org.telegram.messenger.g0.q;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    kiVar.r0 = true;
                }
            }
            i11 = (i10 / 5) * 2;
            kiVar.r0 = true;
        }
        this.s.q1(0, i11 + org.telegram.messenger.g0.m, 0, this.e);
    }

    @Override // org.telegram.ui.Components.ci
    public final void I(ci ciVar) {
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void K() {
        this.s.y0(0);
    }

    public final void Q() {
        this.F.setVisibility(this.s.getAdapter().b() == 2 ? 0 : 8);
        R();
    }

    public final void R() {
        View childAt;
        ny nyVar = this.F;
        if (nyVar.getVisibility() == 0 && (childAt = this.s.getChildAt(0)) != null) {
            nyVar.setTranslationY((childAt.getTop() + (nyVar.getMeasuredHeight() - getMeasuredHeight())) / 2);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.U7));
        hashSet.add(Integer.valueOf(j6.T7));
        hashSet.add(Integer.valueOf(j6.S7));
        hashSet.add(Integer.valueOf(j6.R7));
        hashSet.add(Integer.valueOf(j6.Q7));
        hashSet.add(Integer.valueOf(j6.P7));
        hashSet.add(Integer.valueOf(j6.O7));
        hashSet.add(Integer.valueOf(j6.J7));
        hashSet.add(Integer.valueOf(j6.q5));
        hashSet.add(Integer.valueOf(j6.d7));
        hashSet.add(Integer.valueOf(j6.i6));
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        di.c1 c1Var = this.s;
        if (c1Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = (childAt.getTop() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(8.0f);
        int i7 = (top <= 0 || cj0Var == null || cj0Var.b() != 0) ? 0 : top;
        te.a aVar = this.n;
        if (top < 0 || cj0Var == null || cj0Var.b() != 0) {
            aVar.a(true, true);
            top = i7;
        } else {
            aVar.a(false, true);
        }
        this.r.setTranslationY(top);
        return org.telegram.messenger.g0.L(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    @Override // org.telegram.ui.Components.ci
    public int getSelectedItemsCount() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<s6> getThemeDescriptions() {
        ArrayList<s6> arrayList = new ArrayList<>();
        arrayList.add(new s6(this.F, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (r6) null, j6.c7));
        arrayList.add(new s6(this.F, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (r6) null, j6.h6));
        int i7 = j6.q5;
        arrayList.add(new s6(this.s, 0, new Class[]{f0.class}, new String[]{"nameTextView"}, (Drawable[]) null, (r6) null, i7));
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
        gi giVar = this.G;
        if (giVar != null) {
            giVar.setupBlurredBackground(cVar.c(giVar, c8.g0.a(this.a), false));
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void p() {
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
    }

    @Override // te.b
    public final /* synthetic */ void E(float f10, int i7) {
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
    }

    @Override // te.b
    public final void G(int i7, float f10, float f11, te.c cVar) {
    }
}
