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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z30 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public float A;
    public ValueAnimator B;
    public final String a;
    public final String b;
    public final String c;
    public final lh.e6 d;
    public bh.d e;
    public org.telegram.ui.zj f;
    public FrameLayout h;
    public w30 n;
    public rf.y0 r;
    public FrameLayout s;
    public TextView v;
    public float w;
    public ValueAnimator x;
    public boolean y;

    public z30(String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(null);
        setResourceProvider(c6Var);
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
        this.d = new lh.e6(this.currentAccount, this.c, this.b);
    }

    public final void U(boolean z10, boolean z11) {
        org.telegram.ui.un unVar;
        jh.e1 e1Var;
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
            int i10 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, z10 ? 1.0f : 0.0f);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new x30(this, i10));
            this.B.addListener(new y30(this, z10, i10));
            this.B.setDuration(320L);
            this.B.setInterpolator(jr.h);
            this.B.start();
            return;
        }
        this.y = z10;
        this.A = z10 ? 1.0f : 0.0f;
        this.n.setScaleX(z10 ? 1.0f : 0.95f);
        this.n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.zj zjVar = this.f;
        if (zjVar == null || (unVar = zjVar.a) == null || (e1Var = unVar.H3) == null) {
            return;
        }
        e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
        this.f.a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.A));
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
        ViewPropertyAnimator duration = this.r.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new hh.f(28, this, z10)).setDuration(320L);
        jr jrVar = jr.h;
        duration.setInterpolator(jrVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new x30(this, i10));
        this.x.addListener(new y30(this, z10, i10));
        this.x.setDuration(320L);
        this.x.setInterpolator(jrVar);
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        String str = this.a;
        lVar.setTitle(str);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        lVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        lVar3.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        bh.d dVar = new bh.d(context, 17);
        this.e = dVar;
        frameLayout.addView(dVar, i7.f6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.zj zjVar = new org.telegram.ui.zj(context, getParentLayout(), bundle, 1);
        zjVar.h = false;
        this.f = zjVar;
        this.e.addView(zjVar, i7.f6.e(-1, -1, 119));
        w30 w30Var = new w30(this, context, new iu0(null), this, new v30(), this.resourceProvider);
        this.n = w30Var;
        if (w30Var.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.n.setPinnedToTop(true);
        this.n.n0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.n.setBackgroundColor(getThemedColor(i10));
        w30 w30Var2 = this.n;
        lh.e6 e6Var = this.d;
        w30Var2.P1 = e6Var;
        xs0 xs0Var = w30Var2.V;
        xs0Var.s = e6Var;
        xs0Var.l();
        nu0 nu0Var = w30Var2.W;
        nu0Var.s = e6Var;
        nu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.n, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", e6Var.J, new Object[0]));
        this.s.addView(this.v, i7.f6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, this.resourceProvider));
        this.s.addView(view, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.s, i7.f6.e(-1, 49, 87));
        this.e.addView(this.h, i7.f6.e(-1, -1, 119));
        rf.y0 y0Var = new rf.y0(context, this.resourceProvider);
        this.r = y0Var;
        y0Var.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.i6)));
        this.r.setOnClickListener(new h0(this, 25));
        V(this.r.a(e6Var), false);
        this.r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.b, this.c);
        frameLayout.addView(this.r, i7.f6.e(-1, 48, 55));
        U(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.zj zjVar;
        if (i10 != NotificationCenter.storiesListUpdated) {
            if (i10 != NotificationCenter.hashtagSearchUpdated || (zjVar = this.f) == null || zjVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            rf.y0 y0Var = this.r;
            if (y0Var != null) {
                y0Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        lh.e6 e6Var = this.d;
        if (obj == e6Var) {
            rf.y0 y0Var2 = this.r;
            if (y0Var2 != null) {
                V(y0Var2.a(e6Var), true);
            }
            TextView textView = this.v;
            if (textView != null) {
                textView.setText(LocaleController.formatPluralString("FoundStories", e6Var.J, new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        lh.e6 e6Var = this.d;
        arrayList.add(e6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        e6Var.p(18, true);
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
