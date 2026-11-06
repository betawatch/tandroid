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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class r20 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean D;
    public float E;
    public ValueAnimator F;
    public final String a;
    public final String b;
    public final String c;
    public final di.k6 d;
    public di.a4 e;
    public org.telegram.ui.mj f;
    public FrameLayout h;
    public o20 n;
    public jg.l1 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public r20(String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(null);
        setResourceProvider(f6Var);
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
        this.d = new di.k6(this.currentAccount, this.c, this.b);
    }

    public final int Z() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.simpleActionBar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
    }

    public final void a0(boolean z9, boolean z10) {
        org.telegram.ui.bn bnVar;
        bi.q1 q1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            if (this.D == z9) {
                return;
            }
            this.D = z9;
            this.h.setVisibility(0);
            int i7 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z9 ? 1.0f : 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new p20(this, i7));
            this.F.addListener(new q20(this, z9, i7));
            this.F.setDuration(320L);
            this.F.setInterpolator(xq.h);
            this.F.start();
            return;
        }
        this.D = z9;
        this.E = z9 ? 1.0f : 0.0f;
        this.n.setScaleX(z9 ? 1.0f : 0.95f);
        this.n.setScaleY(z9 ? 1.0f : 0.95f);
        this.h.setAlpha(z9 ? 1.0f : 0.0f);
        this.h.setVisibility(z9 ? 0 : 8);
        org.telegram.ui.mj mjVar = this.f;
        if (mjVar == null || (bnVar = mjVar.a) == null || (q1Var = bnVar.Z3) == null) {
            return;
        }
        q1Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.E));
        this.f.a.Z3.setScaleY(org.telegram.messenger.g0.T1(1.0f, 0.95f, this.E));
    }

    public final void b0(boolean z9, boolean z10) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i7 = 0;
        if (!z10) {
            this.r.setVisibility(z9 ? 0 : 8);
            this.r.setTranslationY(z9 ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
            this.e.setTranslationY(z9 ? org.telegram.messenger.g0.L(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z9 ? org.telegram.messenger.g0.L(48.0f) : 0);
            return;
        }
        this.r.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z9 ? 0.0f : -org.telegram.messenger.g0.L(48.0f)).withEndAction(new bi.k1(25, this, z9)).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z9 ? 1.0f : 0.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new p20(this, i7));
        this.y.addListener(new q20(this, z9, i7));
        this.y.setDuration(320L);
        this.y.setInterpolator(xqVar);
        this.y.start();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        String str = this.a;
        y4Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.w9(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i7, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        di.a4 a4Var = new di.a4(context, 15);
        this.e = a4Var;
        a4Var.setClipChildren(false);
        frameLayout.addView(this.e, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        org.telegram.messenger.g0.B3(this.e, 0, Z(), 0, 0);
        org.telegram.messenger.oa.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.mj mjVar = new org.telegram.ui.mj(context, getParentLayout(), bundle, 1);
        mjVar.h = false;
        this.f = mjVar;
        this.e.addView(mjVar, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        o20 o20Var = new o20(this, context, new ps0(null), this, new n20(), this.resourceProvider);
        this.n = o20Var;
        if (o20Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.r6.t(this.n.getSearchOptionsItem(), org.telegram.ui.ActionBar.k6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.t0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        o20 o20Var2 = this.n;
        di.k6 k6Var = this.d;
        o20Var2.W1 = k6Var;
        gr0 gr0Var = o20Var2.e0;
        gr0Var.s = k6Var;
        gr0Var.f();
        us0 us0Var = o20Var2.f0;
        us0Var.s = k6Var;
        us0Var.f();
        this.n.l1(0, oi.a.c(org.telegram.messenger.g0.m) + org.telegram.messenger.g0.L(48.0f) + Z(), org.telegram.messenger.g0.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        org.telegram.ui.ActionBar.r6.i(i7, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.w.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.V(this.w, org.telegram.ui.ActionBar.k6.nf, getResourceProvider());
        this.w.setText(org.telegram.messenger.hd.G(k6Var.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, c8.ha.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.resourceProvider);
        this.s.addView(view, c8.ha.a(-1.0f, 1.0f / org.telegram.messenger.g0.p, 55));
        this.h.addView(this.s, c8.ha.e(-1, 49, 87));
        this.e.addView(this.h, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        jg.l1 l1Var = new jg.l1(context, this.resourceProvider);
        this.r = l1Var;
        int themedColor = getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(themedColor, getThemedColor(i10));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.f6 resourceProvider = getResourceProvider();
        l1Var.setBackground(i02);
        org.telegram.ui.ActionBar.r6.k(l1Var, i02, N, N2, resourceProvider);
        this.r.setOnClickListener(new h0(this, 24));
        b0(this.r.a(k6Var), false);
        this.r.b(org.telegram.messenger.oa.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, c8.ha.e(-1, 48, 55));
        org.telegram.messenger.g0.B3(this.r, 0, Z(), 0, 0);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.f6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.m = frameLayout;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(frameLayout, y4Var2, resourceProvider2);
        baseSimpleGlass.o = new bi.g(6, this, frameLayout);
        this.n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.y4 y4Var3 = this.simpleActionBar;
        y4Var3.setBackground(baseSimpleGlass.a(y4Var3));
        a0(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.mj mjVar;
        if (i7 != org.telegram.messenger.qs.x5) {
            if (i7 != org.telegram.messenger.qs.I0 || (mjVar = this.f) == null || mjVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            jg.l1 l1Var = this.r;
            if (l1Var != null) {
                l1Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        di.k6 k6Var = this.d;
        if (obj == k6Var) {
            jg.l1 l1Var2 = this.r;
            if (l1Var2 != null) {
                b0(l1Var2.a(k6Var), true);
            }
            TextView textView = this.w;
            if (textView != null) {
                textView.setText(org.telegram.messenger.hd.G(k6Var.J, "FoundStories", new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().P1().I;
        di.k6 k6Var = this.d;
        arrayList.add(k6Var);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.x5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.I0);
        k6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getMessagesController().P1().I.remove(this.d);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.x5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.I0);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
