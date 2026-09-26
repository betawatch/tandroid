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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class c40 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String a;
    public final String b;
    public final String c;
    public final ai.v8 d;
    public ai.w5 e;
    public org.telegram.ui.fk f;
    public FrameLayout h;
    public z30 n;
    public gg.n1 r;
    public FrameLayout s;
    public TextView v;
    public float w;
    public ValueAnimator x;
    public boolean y;

    public c40(String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(null);
        setResourceProvider(d6Var);
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
        this.d = new ai.v8(this.currentAccount, this.c, this.b);
    }

    public final void U(boolean z10, boolean z11) {
        org.telegram.ui.xn xnVar;
        ai.w0 w0Var;
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
            ofFloat.addUpdateListener(new a40(this, i10));
            this.F.addListener(new b40(this, z10, i10));
            this.F.setDuration(320L);
            this.F.setInterpolator(rr.h);
            this.F.start();
            return;
        }
        this.y = z10;
        this.E = z10 ? 1.0f : 0.0f;
        this.n.setScaleX(z10 ? 1.0f : 0.95f);
        this.n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.fk fkVar = this.f;
        if (fkVar == null || (xnVar = fkVar.a) == null || (w0Var = xnVar.L3) == null) {
            return;
        }
        w0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
        this.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
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
        ViewPropertyAnimator duration = this.r.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new bi.f(25, this, z10)).setDuration(320L);
        rr rrVar = rr.h;
        duration.setInterpolator(rrVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new a40(this, i10));
        this.x.addListener(new b40(this, z10, i10));
        this.x.setDuration(320L);
        this.x.setInterpolator(rrVar);
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        kVar3.B(getThemedColor(i11), false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.h6.u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        ai.w5 w5Var = new ai.w5(context, 16);
        this.e = w5Var;
        frameLayout.addView(w5Var, w7.y5.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.fk fkVar = new org.telegram.ui.fk(context, getParentLayout(), bundle, 1);
        fkVar.h = false;
        this.f = fkVar;
        this.e.addView(fkVar, w7.y5.e(-1, -1, 119));
        z30 z30Var = new z30(this, context, new bv0(null), this, new y30(), this.resourceProvider);
        this.n = z30Var;
        if (z30Var.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.n.setPinnedToTop(true);
        this.n.r0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.n.setBackgroundColor(getThemedColor(i10));
        z30 z30Var2 = this.n;
        ai.v8 v8Var = this.d;
        z30Var2.T1 = v8Var;
        rt0 rt0Var = z30Var2.c0;
        rt0Var.s = v8Var;
        rt0Var.l();
        gv0 gv0Var = z30Var2.d0;
        gv0Var.s = v8Var;
        gv0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.n, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", v8Var.J, new Object[0]));
        this.s.addView(this.v, w7.y5.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d7, this.resourceProvider));
        this.s.addView(view, w7.y5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.s, w7.y5.e(-1, 49, 87));
        this.e.addView(this.h, w7.y5.e(-1, -1, 119));
        gg.n1 n1Var = new gg.n1(context, this.resourceProvider);
        this.r = n1Var;
        n1Var.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.h6.i6)));
        this.r.setOnClickListener(new f0(this, 25));
        V(this.r.a(v8Var), false);
        this.r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.b, this.c);
        frameLayout.addView(this.r, w7.y5.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.fk fkVar;
        if (i10 != NotificationCenter.storiesListUpdated) {
            if (i10 != NotificationCenter.hashtagSearchUpdated || (fkVar = this.f) == null || fkVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            gg.n1 n1Var = this.r;
            if (n1Var != null) {
                n1Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        ai.v8 v8Var = this.d;
        if (obj == v8Var) {
            gg.n1 n1Var2 = this.r;
            if (n1Var2 != null) {
                V(n1Var2.a(v8Var), true);
            }
            TextView textView = this.v;
            if (textView != null) {
                textView.setText(LocaleController.formatPluralString("FoundStories", v8Var.J, new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        ai.v8 v8Var = this.d;
        arrayList.add(v8Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        v8Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        getMessagesController().getStoriesController().I.remove(this.d);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.hashtagSearchUpdated);
        super.onFragmentDestroy();
    }
}
