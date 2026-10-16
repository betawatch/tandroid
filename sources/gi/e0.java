package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i71;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class e0 extends h0 {
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.b);
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        c6Var = ((e3) k0Var).resourcesProvider;
        i71 i71Var = new i71(context, i10, 0, false, tVar, uVar, null, c6Var);
        this.d = i71Var;
        i71Var.p1();
        i71 i71Var2 = this.d;
        i71Var2.W2.r = false;
        i71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.c.addView(k0Var.G, z5.g());
        this.c.addView(this.d, 0, z5.d(-1.0f, -1));
        this.c.addView(k0Var.I, z5.g());
        c6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(k0Var.getThemedColor(g6.G6));
        this.a.C(k0Var.getThemedColor(g6.z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        boolean z10 = k0Var.N;
        kVar2.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.a.D(k0Var.getThemedColor(g6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new ah.s(this, 7));
        this.c.addView(this.a, z5.e(-1, 56, 48));
        this.c.addView(k0Var.E, z5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.y n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        c6Var3 = ((e3) k0Var).resourcesProvider;
        di.d dVar = new di.d(context2, c6Var3, true);
        k0Var.r = dVar;
        dVar.e();
        k0Var.r.setText(LocaleController.getString(R.string.OK));
        k0Var.r.setOnClickListener(new ah.g0(this, 19));
        if (z10) {
            k0Var.r.setVisibility(8);
        }
        this.c.addView(k0Var.r, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // gi.h0
    public final float b() {
        return zf.f0.b(this.h.c.e) * super.b();
    }

    @Override // gi.h0
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
