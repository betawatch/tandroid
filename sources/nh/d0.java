package nh;

import android.content.Context;
import fh.w4;
import g7.e6;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d0 extends g0 {
    public final /* synthetic */ j0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i9;
        b6 b6Var;
        b6 b6Var2;
        b6 b6Var3;
        this.h = j0Var;
        AndroidUtilities.removeFromParent(this.b);
        i9 = ((f3) j0Var).currentAccount;
        s sVar = new s(j0Var, 3);
        t tVar = new t(j0Var, 2);
        b6Var = ((f3) j0Var).resourcesProvider;
        i51 i51Var = new i51(context, i9, 0, false, sVar, tVar, null, b6Var);
        this.d = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.d;
        i51Var2.U2.r = false;
        i51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.c.addView(j0Var.C, e6.g());
        this.c.addView(this.d, 0, e6.c(-1.0f, -1));
        this.c.addView(j0Var.E, e6.g());
        b6Var2 = ((f3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(j0Var.getThemedColor(f6.G6));
        this.a.A(j0Var.getThemedColor(f6.z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        boolean z10 = j0Var.J;
        kVar2.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.a.C(j0Var.getThemedColor(f6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new w4(this, 9));
        this.c.addView(this.a, e6.e(-1, 56, 48));
        this.c.addView(j0Var.A, e6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        b6Var3 = ((f3) j0Var).resourcesProvider;
        kh.d dVar = new kh.d(context2, b6Var3, true);
        j0Var.r = dVar;
        dVar.e();
        j0Var.r.setText(LocaleController.getString(R.string.OK));
        j0Var.r.setOnClickListener(new x8(this, 6));
        if (z10) {
            j0Var.r.setVisibility(8);
        }
        this.c.addView(j0Var.r, e6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // nh.g0
    public final float b() {
        return ff.m0.b(this.h.c.e) * super.b();
    }

    @Override // nh.g0
    public final void c() {
        super.c();
        this.h.A.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
