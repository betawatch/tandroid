package oh;

import ag.e2;
import android.content.Context;
import h7.z5;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class d0 extends g0 {
    public final /* synthetic */ j0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        this.h = j0Var;
        AndroidUtilities.removeFromParent(this.b);
        i10 = ((e3) j0Var).currentAccount;
        s sVar = new s(j0Var, 3);
        t tVar = new t(j0Var, 2);
        c6Var = ((e3) j0Var).resourcesProvider;
        k51 k51Var = new k51(context, i10, 0, false, sVar, tVar, null, c6Var);
        this.d = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.d;
        k51Var2.U2.r = false;
        k51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.c.addView(j0Var.C, z5.g());
        this.c.addView(this.d, 0, z5.c(-1.0f, -1));
        this.c.addView(j0Var.E, z5.g());
        c6Var2 = ((e3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(j0Var.getThemedColor(g6.G6));
        this.a.C(j0Var.getThemedColor(g6.z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        boolean z10 = j0Var.J;
        kVar2.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.a.D(j0Var.getThemedColor(g6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new e2(this, 10));
        this.c.addView(this.a, z5.e(-1, 56, 48));
        this.c.addView(j0Var.A, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        c6Var3 = ((e3) j0Var).resourcesProvider;
        lh.d dVar = new lh.d(context2, c6Var3, true);
        j0Var.r = dVar;
        dVar.e();
        j0Var.r.setText(LocaleController.getString(R.string.OK));
        j0Var.r.setOnClickListener(new c5(this, 8));
        if (z10) {
            j0Var.r.setVisibility(8);
        }
        this.c.addView(j0Var.r, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // oh.g0
    public final float b() {
        return gf.m0.b(this.h.c.e) * super.b();
    }

    @Override // oh.g0
    public final void c() {
        super.c();
        this.h.A.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
