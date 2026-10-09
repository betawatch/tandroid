package fi;

import ai.v0;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.k71;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e0 extends h0 {
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        e6 e6Var;
        e6 e6Var2;
        e6 e6Var3;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.b);
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        e6Var = ((f3) k0Var).resourcesProvider;
        k71 k71Var = new k71(context, i10, 0, false, tVar, uVar, null, e6Var);
        this.d = k71Var;
        k71Var.p1();
        k71 k71Var2 = this.d;
        k71Var2.W2.r = false;
        k71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.c.addView(k0Var.G, x5.g());
        this.c.addView(this.d, 0, x5.d(-1.0f, -1));
        this.c.addView(k0Var.I, x5.g());
        e6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(k0Var.getThemedColor(i6.G6));
        this.a.C(k0Var.getThemedColor(i6.z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        boolean z10 = k0Var.N;
        kVar2.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.a.D(k0Var.getThemedColor(i6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new ei.t(this, 6));
        this.c.addView(this.a, x5.e(-1, 56, 48));
        this.c.addView(k0Var.E, x5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.z o9 = this.a.o();
        o9.setGlassMode(true);
        o9.setTranslationX(-AndroidUtilities.dp(7.0f));
        o9.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        e6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, e6Var3, true);
        k0Var.r = dVar;
        dVar.e();
        k0Var.r.setText(LocaleController.getString(R.string.OK));
        k0Var.r.setOnClickListener(new v0(this, 18));
        if (z10) {
            k0Var.r.setVisibility(8);
        }
        this.c.addView(k0Var.r, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // fi.h0
    public final float b() {
        return yf.e0.b(this.h.c.e) * super.b();
    }

    @Override // fi.h0
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
