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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d40 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public float B;
    public ValueAnimator C;
    public final String a;
    public final String b;
    public final String c;
    public final nh.f6 d;
    public dh.d e;
    public org.telegram.ui.fk f;
    public FrameLayout h;
    public a40 n;
    public tf.x0 r;
    public FrameLayout s;
    public TextView v;
    public float w;
    public ValueAnimator x;
    public boolean y;

    public d40(String str, org.telegram.ui.ActionBar.f6 f6Var) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (!TextUtils.isEmpty(this.c)) {
            str2 = "@" + this.c;
        }
        sb.append(str2);
        this.a = sb.toString();
        this.d = new nh.f6(this.currentAccount, this.c, this.b);
    }

    public final void U(boolean z4, boolean z10) {
        org.telegram.ui.yn ynVar;
        lh.e1 e1Var;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            if (this.y == z4) {
                return;
            }
            this.y = z4;
            this.h.setVisibility(0);
            int i10 = 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, z4 ? 1.0f : 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new b40(this, i10));
            this.C.addListener(new c40(this, z4, i10));
            this.C.setDuration(320L);
            this.C.setInterpolator(nr.h);
            this.C.start();
            return;
        }
        this.y = z4;
        this.B = z4 ? 1.0f : 0.0f;
        this.n.setScaleX(z4 ? 1.0f : 0.95f);
        this.n.setScaleY(z4 ? 1.0f : 0.95f);
        this.h.setAlpha(z4 ? 1.0f : 0.0f);
        this.h.setVisibility(z4 ? 0 : 8);
        org.telegram.ui.fk fkVar = this.f;
        if (fkVar == null || (ynVar = fkVar.a) == null || (e1Var = ynVar.I3) == null) {
            return;
        }
        e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.B));
        this.f.a.I3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.B));
    }

    public final void V(boolean z4, boolean z10) {
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i10 = 0;
        if (!z10) {
            this.r.setVisibility(z4 ? 0 : 8);
            this.r.setTranslationY(z4 ? 0.0f : -AndroidUtilities.dp(48.0f));
            this.e.setTranslationY(z4 ? AndroidUtilities.dp(48.0f) : 0.0f);
            this.e.setPadding(0, 0, 0, z4 ? AndroidUtilities.dp(48.0f) : 0);
            return;
        }
        this.r.setVisibility(0);
        ViewPropertyAnimator duration = this.r.animate().translationY(z4 ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new jh.f(23, this, z4)).setDuration(320L);
        nr nrVar = nr.h;
        duration.setInterpolator(nrVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z4 ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new b40(this, i10));
        this.x.addListener(new c40(this, z4, i10));
        this.x.setDuration(320L);
        this.x.setInterpolator(nrVar);
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        String str = this.a;
        kVar.setTitle(str);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        kVar2.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        kVar3.C(getThemedColor(i11), false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.j6.u8), false);
        this.actionBar.setTitleColor(getThemedColor(i11));
        this.actionBar.setCastShadows(true);
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 26));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        dh.d dVar = new dh.d(context, 16);
        this.e = dVar;
        frameLayout.addView(dVar, k7.b6.e(-1, -1, 119));
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.fk fkVar = new org.telegram.ui.fk(context, getParentLayout(), bundle, 1);
        fkVar.h = false;
        this.f = fkVar;
        this.e.addView(fkVar, k7.b6.e(-1, -1, 119));
        a40 a40Var = new a40(this, context, new qu0(null), this, new z30(), this.resourceProvider);
        this.n = a40Var;
        if (a40Var.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        }
        this.n.setPinnedToTop(true);
        this.n.o0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        this.n.setBackgroundColor(getThemedColor(i10));
        a40 a40Var2 = this.n;
        nh.f6 f6Var = this.d;
        a40Var2.Q1 = f6Var;
        ft0 ft0Var = a40Var2.W;
        ft0Var.s = f6Var;
        ft0Var.l();
        vu0 vu0Var = a40Var2.a0;
        vu0Var.s = f6Var;
        vu0Var.l();
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.h.addView(this.n, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(i10));
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.ye));
        this.v.setText(LocaleController.formatPluralString("FoundStories", f6Var.J, new Object[0]));
        this.s.addView(this.v, k7.b6.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
        this.s.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.s, k7.b6.e(-1, 49, 87));
        this.e.addView(this.h, k7.b6.e(-1, -1, 119));
        tf.x0 x0Var = new tf.x0(context, this.resourceProvider);
        this.r = x0Var;
        x0Var.setBackground(org.telegram.ui.ActionBar.j6.g0(getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.j6.i6)));
        this.r.setOnClickListener(new g0(this, 25));
        V(this.r.a(f6Var), false);
        this.r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.b, this.c);
        frameLayout.addView(this.r, k7.b6.e(-1, 48, 55));
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
            tf.x0 x0Var = this.r;
            if (x0Var != null) {
                x0Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        nh.f6 f6Var = this.d;
        if (obj == f6Var) {
            tf.x0 x0Var2 = this.r;
            if (x0Var2 != null) {
                V(x0Var2.a(f6Var), true);
            }
            TextView textView = this.v;
            if (textView != null) {
                textView.setText(LocaleController.formatPluralString("FoundStories", f6Var.J, new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        nh.f6 f6Var = this.d;
        arrayList.add(f6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        f6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getMessagesController().getStoriesController().I.remove(this.d);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.hashtagSearchUpdated);
        super.onFragmentDestroy();
    }
}
