package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j30 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final String a;
    public final String b;
    public final String c;
    public final th.r4 d;
    public org.telegram.ui.Cells.a5 e;
    public org.telegram.ui.ik f;
    public FrameLayout h;
    public g30 n;
    public zf.a1 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public j30(String str, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null);
        setResourceProvider(p6Var);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            this.b = trim.substring(0, indexOf);
            this.c = trim.substring(indexOf + 1);
        } else {
            this.b = trim;
            this.c = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.b);
        if (!TextUtils.isEmpty(this.c)) {
            str2 = "@" + this.c;
        }
        sb2.append(str2);
        this.a = sb2.toString();
        this.d = new th.r4(this.currentAccount, this.c, this.b);
    }

    public final int Y() {
        return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.simpleActionBar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
    }

    public final void Z(boolean z10, boolean z11) {
        org.telegram.ui.vn vnVar;
        ag.b1 b1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            if (this.D == z10) {
                return;
            }
            this.D = z10;
            this.h.setVisibility(0);
            int i10 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new h30(this, i10));
            this.F.addListener(new i30(this, z10, i10));
            this.F.setDuration(320L);
            this.F.setInterpolator(gr.h);
            this.F.start();
            return;
        }
        this.D = z10;
        this.E = z10 ? 1.0f : 0.0f;
        this.n.setScaleX(z10 ? 1.0f : 0.95f);
        this.n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.ik ikVar = this.f;
        if (ikVar == null || (vnVar = ikVar.a) == null || (b1Var = vnVar.Z3) == null) {
            return;
        }
        b1Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 0.95f, this.E));
        this.f.a.Z3.setScaleY(org.telegram.messenger.i0.T1(1.0f, 0.95f, this.E));
    }

    public final void a0(boolean z10, boolean z11) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (!z11) {
            this.r.setVisibility(z10 ? 0 : 8);
            this.r.setTranslationY(z10 ? 0.0f : -org.telegram.messenger.i0.L(48.0f));
            this.e.setTranslationY(z10 ? org.telegram.messenger.i0.L(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z10 ? org.telegram.messenger.i0.L(48.0f) : 0);
            return;
        }
        this.r.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z10 ? 0.0f : -org.telegram.messenger.i0.L(48.0f)).withEndAction(new k2.v(15, this, z10)).setDuration(320L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new h30(this, i10));
        this.y.addListener(new i30(this, z10, i10));
        this.y.setDuration(320L);
        this.y.setInterpolator(grVar);
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        String str = this.a;
        i5Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ar(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i10, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 19);
        this.e = a5Var;
        a5Var.setClipChildren(false);
        frameLayout.addView(this.e, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        org.telegram.messenger.i0.A3(this.e, 0, Y(), 0, 0);
        int i11 = 3;
        org.telegram.messenger.oa.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ik ikVar = new org.telegram.ui.ik(context, getParentLayout(), bundle, 1);
        ikVar.h = false;
        this.f = ikVar;
        this.e.addView(ikVar, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        g30 g30Var = new g30(this, context, new rt0(null), this, new f30(), this.resourceProvider);
        this.n = g30Var;
        if (g30Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.a7.t(this.n.getSearchOptionsItem(), org.telegram.ui.ActionBar.t6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.t0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        g30 g30Var2 = this.n;
        th.r4 r4Var = this.d;
        g30Var2.W1 = r4Var;
        hs0 hs0Var = g30Var2.e0;
        hs0Var.s = r4Var;
        hs0Var.f();
        wt0 wt0Var = g30Var2.f0;
        wt0Var.s = r4Var;
        wt0Var.f();
        this.n.i1(0, ei.b.c(org.telegram.messenger.i0.m) + org.telegram.messenger.i0.L(48.0f) + Y(), org.telegram.messenger.i0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        org.telegram.ui.ActionBar.a7.i(i10, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        this.w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.a7.V(this.w, org.telegram.ui.ActionBar.t6.nf, getResourceProvider());
        this.w.setText(org.telegram.messenger.cd.G(r4Var.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, w7.b6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, this.resourceProvider);
        this.s.addView(view, w7.b6.a(-1.0f, 1.0f / org.telegram.messenger.i0.p, 55));
        this.h.addView(this.s, w7.b6.e(-1, 49, 87));
        this.e.addView(this.h, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        zf.a1 a1Var = new zf.a1(context, this.resourceProvider);
        this.r = a1Var;
        int themedColor = getThemedColor(i10);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.t6.i0(themedColor, getThemedColor(i12));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i12);
        org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
        a1Var.setBackground(i02);
        org.telegram.ui.ActionBar.a7.k(a1Var, i02, N, N2, resourceProvider);
        this.r.setOnClickListener(new h0(this, 23));
        a0(this.r.a(r4Var), false);
        this.r.b(org.telegram.messenger.oa.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, w7.b6.e(-1, 48, 55));
        org.telegram.messenger.i0.A3(this.r, 0, Y(), 0, 0);
        ei.b baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.p6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.k = frameLayout;
        baseSimpleGlass.l = null;
        baseSimpleGlass.g(frameLayout, i5Var2, resourceProvider2);
        baseSimpleGlass.m = new ei.a(i11, this, frameLayout);
        this.n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.i5 i5Var3 = this.simpleActionBar;
        i5Var3.setBackground(baseSimpleGlass.a(i5Var3));
        Z(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ik ikVar;
        if (i10 != org.telegram.messenger.zs.x5) {
            if (i10 != org.telegram.messenger.zs.I0 || (ikVar = this.f) == null || ikVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            zf.a1 a1Var = this.r;
            if (a1Var != null) {
                a1Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        th.r4 r4Var = this.d;
        if (obj == r4Var) {
            zf.a1 a1Var2 = this.r;
            if (a1Var2 != null) {
                a0(a1Var2.a(r4Var), true);
            }
            TextView textView = this.w;
            if (textView != null) {
                textView.setText(org.telegram.messenger.cd.G(r4Var.J, "FoundStories", new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().O1().I;
        th.r4 r4Var = this.d;
        arrayList.add(r4Var);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.x5);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.I0);
        r4Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getMessagesController().O1().I.remove(this.d);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.x5);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.I0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
