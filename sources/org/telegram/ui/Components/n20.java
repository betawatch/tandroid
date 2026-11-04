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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n20 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String a;
    public final String b;
    public final String c;
    public final ei.l6 d;
    public ai.d2 e;
    public org.telegram.ui.ij f;
    public FrameLayout h;
    public k20 n;
    public kg.h1 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public n20(String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        setResourceProvider(e6Var);
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
        this.d = new ei.l6(this.currentAccount, this.c, this.b);
    }

    public final int Z() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.simpleActionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
    }

    public final void a0(boolean z10, boolean z11) {
        org.telegram.ui.xm xmVar;
        ci.j1 j1Var;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            if (this.E == z10) {
                return;
            }
            this.E = z10;
            this.h.setVisibility(0);
            int i3 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new l20(this, i3));
            this.G.addListener(new m20(this, z10, i3));
            this.G.setDuration(320L);
            this.G.setInterpolator(xq.h);
            this.G.start();
            return;
        }
        this.E = z10;
        this.F = z10 ? 1.0f : 0.0f;
        this.n.setScaleX(z10 ? 1.0f : 0.95f);
        this.n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.ij ijVar = this.f;
        if (ijVar == null || (xmVar = ijVar.a) == null || (j1Var = xmVar.a4) == null) {
            return;
        }
        j1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
        this.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
    }

    public final void b0(boolean z10, boolean z11) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i3 = 0;
        if (!z11) {
            this.r.setVisibility(z10 ? 0 : 8);
            this.r.setTranslationY(z10 ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
            this.e.setTranslationY(z10 ? org.telegram.messenger.g0.L(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z10 ? org.telegram.messenger.g0.L(48.0f) : 0);
            return;
        }
        this.r.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z10 ? 0.0f : -org.telegram.messenger.g0.L(48.0f)).withEndAction(new ci.e1(25, this, z10)).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new l20(this, i3));
        this.y.addListener(new m20(this, z10, i3));
        this.y.setDuration(320L);
        this.y.setInterpolator(xqVar);
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        String str = this.a;
        y4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.o9(this, 14));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i3, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        ai.d2 d2Var = new ai.d2(context, 17);
        this.e = d2Var;
        d2Var.setClipChildren(false);
        frameLayout.addView(this.e, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        org.telegram.messenger.g0.B3(this.e, 0, Z(), 0, 0);
        org.telegram.messenger.ha.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ij ijVar = new org.telegram.ui.ij(context, getParentLayout(), bundle, 1);
        ijVar.h = false;
        this.f = ijVar;
        this.e.addView(ijVar, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        k20 k20Var = new k20(this, context, new os0(null), this, new j20(), this.resourceProvider);
        this.n = k20Var;
        if (k20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.r6.t(this.n.getSearchOptionsItem(), org.telegram.ui.ActionBar.k6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.u0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        k20 k20Var2 = this.n;
        ei.l6 l6Var = this.d;
        k20Var2.X1 = l6Var;
        gr0 gr0Var = k20Var2.f0;
        gr0Var.s = l6Var;
        gr0Var.f();
        ts0 ts0Var = k20Var2.g0;
        ts0Var.s = l6Var;
        ts0Var.f();
        this.n.l1(0, pi.a.c(org.telegram.messenger.g0.m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        org.telegram.ui.ActionBar.r6.i(i3, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(this.w, org.telegram.ui.ActionBar.k6.nf, getResourceProvider());
        this.w.setText(org.telegram.messenger.bd.G(l6Var.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, b8.mf.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.resourceProvider);
        this.s.addView(view, b8.mf.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        this.h.addView(this.s, b8.mf.e(-1, 49, 87));
        this.e.addView(this.h, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        kg.h1 h1Var = new kg.h1(context, this.resourceProvider);
        this.r = h1Var;
        int themedColor = getThemedColor(i3);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
        h1Var.setBackground(i02);
        org.telegram.ui.ActionBar.r6.k(h1Var, i02, N, N2, resourceProvider);
        this.r.setOnClickListener(new f0(this, 24));
        b0(this.r.a(l6Var), false);
        this.r.b(org.telegram.messenger.ha.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, b8.mf.e(-1, 48, 55));
        org.telegram.messenger.g0.B3(this.r, 0, Z(), 0, 0);
        pi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.e6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.l = frameLayout;
        baseSimpleGlass.m = null;
        baseSimpleGlass.g(frameLayout, y4Var2, resourceProvider2);
        baseSimpleGlass.n = new ci.g(4, this, frameLayout);
        this.n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.y4 y4Var3 = this.simpleActionBar;
        y4Var3.setBackground(baseSimpleGlass.a(y4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.ij ijVar;
        if (i3 != org.telegram.messenger.hs.x5) {
            if (i3 != org.telegram.messenger.hs.I0 || (ijVar = this.f) == null || ijVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            kg.h1 h1Var = this.r;
            if (h1Var != null) {
                h1Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        ei.l6 l6Var = this.d;
        if (obj == l6Var) {
            kg.h1 h1Var2 = this.r;
            if (h1Var2 != null) {
                b0(h1Var2.a(l6Var), true);
            }
            TextView textView = this.w;
            if (textView != null) {
                textView.setText(org.telegram.messenger.bd.G(l6Var.J, "FoundStories", new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().P1().I;
        ei.l6 l6Var = this.d;
        arrayList.add(l6Var);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.x5);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.I0);
        l6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getMessagesController().P1().I.remove(this.d);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.x5);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.I0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
