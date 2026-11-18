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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c30 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String a;
    public final String b;
    public final String c;
    public final fi.b6 d;
    public bi.p2 e;
    public org.telegram.ui.nj f;
    public FrameLayout h;
    public z20 n;
    public jg.k1 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public c30(String str, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null);
        setResourceProvider(i6Var);
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
        this.d = new fi.b6(this.currentAccount, this.c, this.b);
    }

    public final int Z() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.simpleActionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
    }

    public final void a0(boolean z10, boolean z11) {
        org.telegram.ui.cn cnVar;
        di.b1 b1Var;
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
            int i7 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new a30(this, i7));
            this.G.addListener(new b30(this, z10, i7));
            this.G.setDuration(320L);
            this.G.setInterpolator(lr.h);
            this.G.start();
            return;
        }
        this.E = z10;
        this.F = z10 ? 1.0f : 0.0f;
        this.n.setScaleX(z10 ? 1.0f : 0.95f);
        this.n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.nj njVar = this.f;
        if (njVar == null || (cnVar = njVar.a) == null || (b1Var = cnVar.a4) == null) {
            return;
        }
        b1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
        this.f.a.a4.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.F));
    }

    public final void b0(boolean z10, boolean z11) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = 0;
        if (!z11) {
            this.r.setVisibility(z10 ? 0 : 8);
            this.r.setTranslationY(z10 ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
            this.e.setTranslationY(z10 ? org.telegram.messenger.g0.L(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z10 ? org.telegram.messenger.g0.L(48.0f) : 0);
            return;
        }
        this.r.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z10 ? 0.0f : -org.telegram.messenger.g0.L(48.0f)).withEndAction(new ch.k(26, this, z10)).setDuration(320L);
        lr lrVar = lr.h;
        duration.setInterpolator(lrVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new a30(this, i7));
        this.y.addListener(new b30(this, z10, i7));
        this.y.setDuration(320L);
        this.y.setInterpolator(lrVar);
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        String str = this.a;
        a5Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.x7(this, 16));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        bi.p2 p2Var = new bi.p2(context, 17);
        this.e = p2Var;
        p2Var.setClipChildren(false);
        frameLayout.addView(this.e, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        org.telegram.messenger.g0.z3(this.e, 0, Z(), 0, 0);
        org.telegram.messenger.ma.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.nj njVar = new org.telegram.ui.nj(context, getParentLayout(), bundle, 1);
        njVar.h = false;
        this.f = njVar;
        this.e.addView(njVar, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        z20 z20Var = new z20(this, context, new ys0(null), this, new y20(), this.resourceProvider);
        this.n = z20Var;
        if (z20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.u6.s(this.n.getSearchOptionsItem(), org.telegram.ui.ActionBar.n6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.u0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        z20 z20Var2 = this.n;
        fi.b6 b6Var = this.d;
        z20Var2.X1 = b6Var;
        qr0 qr0Var = z20Var2.f0;
        qr0Var.s = b6Var;
        qr0Var.f();
        dt0 dt0Var = z20Var2.g0;
        dt0Var.s = b6Var;
        dt0Var.f();
        this.n.n1(0, ri.a.c(org.telegram.messenger.g0.m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, c8.ma.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.u6.U(this.w, org.telegram.ui.ActionBar.n6.qf, getResourceProvider());
        this.w.setText(org.telegram.messenger.gd.G(b6Var.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, c8.ma.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view, this.resourceProvider);
        this.s.addView(view, c8.ma.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        this.h.addView(this.s, c8.ma.e(-1, 49, 87));
        this.e.addView(this.h, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        jg.k1 k1Var = new jg.k1(context, this.resourceProvider);
        this.r = k1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.n6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 resourceProvider = getResourceProvider();
        k1Var.setBackground(i02);
        org.telegram.ui.ActionBar.u6.j(k1Var, i02, M, M2, resourceProvider);
        this.r.setOnClickListener(new n0(this, 26));
        b0(this.r.a(b6Var), false);
        this.r.b(org.telegram.messenger.ma.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, c8.ma.e(-1, 48, 55));
        org.telegram.messenger.g0.z3(this.r, 0, Z(), 0, 0);
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.a5 a5Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.i6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.m = frameLayout;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(frameLayout, a5Var2, resourceProvider2);
        baseSimpleGlass.o = new di.f(4, this, frameLayout);
        this.n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.a5 a5Var3 = this.simpleActionBar;
        a5Var3.setBackground(baseSimpleGlass.a(a5Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.nj njVar;
        if (i7 != org.telegram.messenger.ks.z5) {
            if (i7 != org.telegram.messenger.ks.I0 || (njVar = this.f) == null || njVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            jg.k1 k1Var = this.r;
            if (k1Var != null) {
                k1Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        fi.b6 b6Var = this.d;
        if (obj == b6Var) {
            jg.k1 k1Var2 = this.r;
            if (k1Var2 != null) {
                b0(k1Var2.a(b6Var), true);
            }
            TextView textView = this.w;
            if (textView != null) {
                textView.setText(org.telegram.messenger.gd.G(b6Var.J, "FoundStories", new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().R1().I;
        fi.b6 b6Var = this.d;
        arrayList.add(b6Var);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.z5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.I0);
        b6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        getMessagesController().R1().I.remove(this.d);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.z5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.I0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
