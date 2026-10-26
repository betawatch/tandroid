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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m40 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public float E;
    public ValueAnimator F;
    public final String a;
    public final String b;
    public final String c;
    public final di.t6 d;
    public di.i4 e;
    public org.telegram.ui.ck f;
    public FrameLayout h;
    public j40 n;
    public ig.m1 r;
    public FrameLayout s;
    public TextView v;
    public float w;
    public ValueAnimator x;
    public boolean y;

    public m40(String str, org.telegram.ui.ActionBar.u6 u6Var) {
        super(null);
        setResourceProvider(u6Var);
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
        this.d = new di.t6(this.currentAccount, this.c, this.b);
    }

    public final int V() {
        return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.simpleActionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
    }

    public final void W(boolean z10, boolean z11) {
        org.telegram.ui.vn vnVar;
        bi.r1 r1Var;
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
            ofFloat.addUpdateListener(new k40(this, i10));
            this.F.addListener(new l40(this, z10, i10));
            this.F.setDuration(320L);
            this.F.setInterpolator(ds.h);
            this.F.start();
            return;
        }
        this.y = z10;
        this.E = z10 ? 1.0f : 0.0f;
        this.n.setScaleX(z10 ? 1.0f : 0.95f);
        this.n.setScaleY(z10 ? 1.0f : 0.95f);
        this.h.setAlpha(z10 ? 1.0f : 0.0f);
        this.h.setVisibility(z10 ? 0 : 8);
        org.telegram.ui.ck ckVar = this.f;
        if (ckVar == null || (vnVar = ckVar.a) == null || (r1Var = vnVar.X3) == null) {
            return;
        }
        r1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
        this.f.a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, this.E));
    }

    public final void X(boolean z10, boolean z11) {
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
        ViewPropertyAnimator duration = this.r.animate().translationY(z10 ? 0.0f : -AndroidUtilities.dp(48.0f)).withEndAction(new bh.n(29, this, z10)).setDuration(320L);
        ds dsVar = ds.h;
        duration.setInterpolator(dsVar).start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.w, z10 ? 1.0f : 0.0f);
        this.x = ofFloat;
        ofFloat.addUpdateListener(new k40(this, i10));
        this.x.addListener(new l40(this, z10, i10));
        this.x.setDuration(320L);
        this.x.setInterpolator(dsVar);
        this.x.start();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        String str = this.a;
        r5Var.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i10, frameLayout, getResourceProvider());
        frameLayout.setClipChildren(false);
        di.i4 i4Var = new di.i4(context, 15);
        this.e = i4Var;
        i4Var.setClipChildren(false);
        frameLayout.addView(this.e, gb1.i(-1, -1, 119));
        AndroidUtilities.setViewLayoutMargins(this.e, 0, V(), 0, 0);
        HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        org.telegram.ui.ck ckVar = new org.telegram.ui.ck(context, getParentLayout(), bundle, 1);
        ckVar.h = false;
        this.f = ckVar;
        this.e.addView(ckVar, gb1.i(-1, -1, 119));
        j40 j40Var = new j40(this, context, new sv0(null), this, new i40(), this.resourceProvider);
        this.n = j40Var;
        if (j40Var.getSearchOptionsItem() != null) {
            org.telegram.ui.ActionBar.f7.t(this.n.getSearchOptionsItem(), org.telegram.ui.ActionBar.y6.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.t0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        j40 j40Var2 = this.n;
        di.t6 t6Var = this.d;
        j40Var2.W1 = t6Var;
        hu0 hu0Var = j40Var2.e0;
        hu0Var.s = t6Var;
        hu0Var.l();
        xv0 xv0Var = j40Var2.f0;
        xv0Var.s = t6Var;
        xv0Var.l();
        this.n.h1(0, oi.a.c(AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(48.0f) + V(), AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        org.telegram.ui.ActionBar.f7.i(i10, frameLayout3, getResourceProvider());
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setTypeface(AndroidUtilities.bold());
        this.v.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(this.v, org.telegram.ui.ActionBar.y6.ye, getResourceProvider());
        this.v.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
        this.s.addView(this.v, gb1.h(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d7, view, this.resourceProvider);
        this.s.addView(view, gb1.e(-1.0f, 1.0f / AndroidUtilities.density, 55));
        this.h.addView(this.s, gb1.i(-1, 49, 87));
        this.e.addView(this.h, gb1.i(-1, -1, 119));
        ig.m1 m1Var = new ig.m1(context, this.resourceProvider);
        this.r = m1Var;
        int themedColor = getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.y6.h0(themedColor, getThemedColor(i11));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        m1Var.setBackground(h02);
        org.telegram.ui.ActionBar.f7.k(m1Var, h02, N, N2, resourceProvider);
        this.r.setOnClickListener(new f0(this, 24));
        X(this.r.a(t6Var), false);
        this.r.b(HashtagSearchController.getInstance(this.currentAccount).getCount(3), this.b, this.c);
        frameLayout.addView(this.r, gb1.i(-1, 48, 55));
        AndroidUtilities.setViewLayoutMargins(this.r, 0, V(), 0, 0);
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        org.telegram.ui.ActionBar.r5 r5Var2 = this.simpleActionBar;
        org.telegram.ui.ActionBar.u6 resourceProvider2 = getResourceProvider();
        baseSimpleGlass.g = frameLayout;
        baseSimpleGlass.h = null;
        baseSimpleGlass.f(frameLayout, r5Var2, resourceProvider2);
        baseSimpleGlass.i = new bi.g(6, this, frameLayout);
        this.n.setPagesGlassEngine(this.glassEngine);
        org.telegram.ui.ActionBar.r5 r5Var3 = this.simpleActionBar;
        r5Var3.setBackground(baseSimpleGlass.a(r5Var3));
        W(false, false);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ck ckVar;
        if (i10 != NotificationCenter.storiesListUpdated) {
            if (i10 != NotificationCenter.hashtagSearchUpdated || (ckVar = this.f) == null || ckVar.a == null || ((Integer) objArr[0]).intValue() != this.f.a.getClassGuid()) {
                return;
            }
            int intValue = ((Integer) objArr[1]).intValue();
            ig.m1 m1Var = this.r;
            if (m1Var != null) {
                m1Var.b(intValue, this.b, this.c);
                return;
            }
            return;
        }
        Object obj = objArr[0];
        di.t6 t6Var = this.d;
        if (obj == t6Var) {
            ig.m1 m1Var2 = this.r;
            if (m1Var2 != null) {
                X(m1Var2.a(t6Var), true);
            }
            TextView textView = this.v;
            if (textView != null) {
                textView.setText(LocaleController.formatPluralString("FoundStories", t6Var.J, new Object[0]));
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().getStoriesController().I;
        di.t6 t6Var = this.d;
        arrayList.add(t6Var);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.hashtagSearchUpdated);
        t6Var.p(18, true);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        getMessagesController().getStoriesController().I.remove(this.d);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.hashtagSearchUpdated);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
