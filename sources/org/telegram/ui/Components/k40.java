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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class k40 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String a;
    public final String b;
    public final String c;
    public final ci.t6 d;
    public ci.h4 e;
    public org.telegram.ui.bk f;
    public FrameLayout h;
    public h40 n;
    public hg.m1 r;
    public FrameLayout s;
    public TextView v;
    public float w;
    public ValueAnimator x;
    public boolean y;

    public k40(String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(null);
        setResourceProvider(g6Var);
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
        this.d = new ci.t6(this.currentAccount, this.c, this.b);
    }

    public final void U(boolean z10, boolean z11) {
        org.telegram.ui.tn tnVar;
        ai.u1 u1Var;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            if (this.y == z10) {
                return;
            }
            this.y = z10;
            this.h.setVisibility(0);
            int i10 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new i40(this, i10));
            this.F.addListener(new j40(this, z10, i10));
            this.F.setDuration(320L);
            this.F.setInterpolator(bs.h);
            this.F.start();
            return;
        }
        this.y = z10;
        this.E = z10 ? 1.0f : 0.0f;
        this.n.setScaleX(z10 ? 1.0f : 0.95f);
        this.n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.bk bkVar = this.f;
        if (bkVar == null || (tnVar = bkVar.a) == null || (u1Var = tnVar.X3) == null) {
            return;
        }
        u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
        this.f.a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
    }

    public final void V(boolean z10, boolean z11) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (!z11) {
            this.r.setVisibility(z10 ? 0 : 8);
            this.r.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f));
            this.e.setTranslationY(z10 ? AndroidUtilities.dp(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z10 ? AndroidUtilities.dp(48.0f) : 0);
            return;
        }
        this.r.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new ah.t(29, this, z10)).setDuration(320L);
        bs bsVar = bs.h;
        duration.setInterpolator(bsVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new i40(this, i10));
        this.x.addListener(new j40(this, z10, i10));
        this.x.setDuration(320L);
        this.x.setInterpolator(bsVar);
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i10, kVar2, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar3, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.u8, getResourceProvider());
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i11, getResourceProvider());
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout, getResourceProvider());
        ci.h4 h4Var = new ci.h4(context, 16);
        this.e = h4Var;
        frameLayout.addView(h4Var, w7.z5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.bk bkVar = new org.telegram.ui.bk(context, getParentLayout(), bundle, 1);
        bkVar.h = false;
        this.f = bkVar;
        this.e.addView(bkVar, w7.z5.e(-1, -1, 119));
        h40 h40Var = new h40(this, context, new pv0(null), this, new g40(), this.resourceProvider);
        this.n = h40Var;
        if (h40Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.r6.t(this.n.getSearchOptionsItem(), i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.r0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        org.telegram.ui.ActionBar.r6.i(i10, this.n, getResourceProvider());
        h40 h40Var2 = this.n;
        ci.t6 t6Var = this.d;
        h40Var2.U1 = t6Var;
        fu0 fu0Var = h40Var2.c0;
        fu0Var.s = t6Var;
        fu0Var.l();
        uv0 uv0Var = h40Var2.d0;
        uv0Var.s = t6Var;
        uv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, getResourceProvider());
        this.h.addView(this.n, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(this.v, org.telegram.ui.ActionBar.k6.ye, getResourceProvider());
        this.v.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
        this.s.addView(this.v, w7.z5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, this.resourceProvider);
        this.s.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.s, w7.z5.e(-1, 49, 87));
        this.e.addView(this.h, w7.z5.e(-1, -1, 119));
        hg.m1 m1Var = new hg.m1(context, this.resourceProvider);
        this.r = m1Var;
        int themedColor = getThemedColor(i10);
        int i12 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(themedColor, getThemedColor(i12));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
        m1Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(m1Var, h02, O, O2, resourceProvider);
        this.r.setOnClickListener(new f0(this, 24));
        V(this.r.a(t6Var), false);
        this.r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.b, this.c);
        frameLayout.addView(this.r, w7.z5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.bk bkVar;
        if (i10 != NotificationCenter.storiesListUpdated) {
            if (i10 != NotificationCenter.hashtagSearchUpdated || (bkVar = this.f) == null || bkVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            hg.m1 m1Var = this.r;
            if (m1Var != null) {
                m1Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        ci.t6 t6Var = this.d;
        if (obj == t6Var) {
            hg.m1 m1Var2 = this.r;
            if (m1Var2 != null) {
                V(m1Var2.a(t6Var), true);
            }
            TextView textView = this.v;
            if (textView != null) {
                textView.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ci.t6 t6Var = this.d;
        arrayList.add(t6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        t6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getMessagesController().getStoriesController().I.remove(this.d);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.hashtagSearchUpdated);
        super.onFragmentDestroy();
    }
}
