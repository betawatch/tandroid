package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public ValueAnimator B;
    public final String a;
    public final String b;
    public final String c;
    public final ih.h6 d;
    public dh.g e;
    public org.telegram.ui.wj f;
    public FrameLayout h;
    public i30 n;
    public of.i1 r;
    public FrameLayout s;
    public TextView v;
    public float w;
    public ValueAnimator x;
    public boolean y;

    public l30(String str, org.telegram.ui.ActionBar.b6 b6Var) {
        super(null);
        setResourceProvider(b6Var);
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
        this.d = new ih.h6(this.currentAccount, this.c, this.b);
    }

    public final void T(boolean z10, boolean z11) {
        org.telegram.ui.rn rnVar;
        gh.f1 f1Var;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z11) {
            if (this.y == z10) {
                return;
            }
            this.y = z10;
            this.h.setVisibility(0);
            int i9 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new j30(this, i9));
            this.B.addListener(new k30(this, z10, i9));
            this.B.setDuration(320L);
            this.B.setInterpolator(gr.h);
            this.B.start();
            return;
        }
        this.y = z10;
        this.A = z10 ? 1.0f : 0.0f;
        this.n.setScaleX(z10 ? 1.0f : 0.95f);
        this.n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.wj wjVar = this.f;
        if (wjVar == null || (rnVar = wjVar.a) == null || (f1Var = rnVar.H3) == null) {
            return;
        }
        f1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
        this.f.a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
    }

    public final void U(boolean z10, boolean z11) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i9 = 0;
        if (!z11) {
            this.r.setVisibility(z10 ? 0 : 8);
            this.r.setTranslationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f));
            this.e.setTranslationY(z10 ? AndroidUtilities.dp(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z10 ? AndroidUtilities.dp(48.0f) : 0);
            return;
        }
        this.r.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new eh.f(29, this, z10)).setDuration(320L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new j30(this, i9));
        this.x.addListener(new k30(this, z10, i9));
        this.x.setDuration(320L);
        this.x.setInterpolator(grVar);
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
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        kVar2.setBackgroundColor(getThemedColor(i9));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        kVar3.C(getThemedColor(i10), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.u8), false);
        this.actionBar.setTitleColor(getThemedColor(i10));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i9));
        dh.g gVar = new dh.g(context, 15);
        this.e = gVar;
        frameLayout.addView(gVar, g7.e6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.wj wjVar = new org.telegram.ui.wj(context, getParentLayout(), bundle, 1);
        wjVar.h = false;
        this.f = wjVar;
        this.e.addView(wjVar, g7.e6.e(-1, -1, 119));
        i30 i30Var = new i30(this, context, new wt0(null), this, new h30(), this.resourceProvider);
        this.n = i30Var;
        if (i30Var.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.n.setPinnedToTop(true);
        this.n.n0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.n.setBackgroundColor(getThemedColor(i9));
        i30 i30Var2 = this.n;
        ih.h6 h6Var = this.d;
        i30Var2.P1 = h6Var;
        ms0 ms0Var = i30Var2.V;
        ms0Var.s = h6Var;
        ms0Var.l();
        bu0 bu0Var = i30Var2.W;
        bu0Var.s = h6Var;
        bu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i9));
        this.h.addView(this.n, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i9));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", h6Var.J, new Object[0]));
        this.s.addView(this.v, g7.e6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.resourceProvider));
        this.s.addView(view, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.s, g7.e6.e(-1, 49, 87));
        this.e.addView(this.h, g7.e6.e(-1, -1, 119));
        of.i1 i1Var = new of.i1(context, this.resourceProvider);
        this.r = i1Var;
        i1Var.setBackground(org.telegram.ui.ActionBar.f6.g0(getThemedColor(i9), getThemedColor(org.telegram.ui.ActionBar.f6.i6)));
        this.r.setOnClickListener(new f0(this, 25));
        U(this.r.a(h6Var), false);
        this.r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.b, this.c);
        frameLayout.addView(this.r, g7.e6.e(-1, 48, 55));
        T(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.wj wjVar;
        if (i9 != NotificationCenter.storiesListUpdated) {
            if (i9 != NotificationCenter.hashtagSearchUpdated || (wjVar = this.f) == null || wjVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            of.i1 i1Var = this.r;
            if (i1Var != null) {
                i1Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        ih.h6 h6Var = this.d;
        if (obj == h6Var) {
            of.i1 i1Var2 = this.r;
            if (i1Var2 != null) {
                U(i1Var2.a(h6Var), true);
            }
            TextView textView = this.v;
            if (textView != null) {
                textView.setText(LocaleController.formatPluralString("FoundStories", h6Var.J, new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ih.h6 h6Var = this.d;
        arrayList.add(h6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        h6Var.p(18, true);
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
