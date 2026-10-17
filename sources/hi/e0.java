package hi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class e0 extends h0 {
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        d6 d6Var3;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.b);
        i10 = ((f3) k0Var).currentAccount;
        s sVar = new s(k0Var, 3);
        u uVar = new u(k0Var, 2);
        d6Var = ((f3) k0Var).resourcesProvider;
        a71 a71Var = new a71(context, i10, 0, false, sVar, uVar, null, d6Var);
        this.d = a71Var;
        a71Var.p1();
        a71 a71Var2 = this.d;
        a71Var2.W2.r = false;
        a71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.c.addView(k0Var.G, z5.g());
        this.c.addView(this.d, 0, z5.d(-1.0f, -1));
        this.c.addView(k0Var.I, z5.g());
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.a.B(k0Var.getThemedColor(h6.z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        boolean z10 = k0Var.N;
        kVar2.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.a.C(k0Var.getThemedColor(h6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new ah.s(this, 8));
        this.c.addView(this.a, z5.e(-1, 56, 48));
        this.c.addView(k0Var.E, z5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.y n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context2, d6Var3, true);
        k0Var.r = dVar;
        dVar.e();
        k0Var.r.setText(LocaleController.getString(R.string.OK));
        k0Var.r.setOnClickListener(new hg.r0(this, 3));
        if (z10) {
            k0Var.r.setVisibility(8);
        }
        this.c.addView(k0Var.r, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // hi.h0
    public final float b() {
        return zf.e0.b(this.h.c.e) * super.b();
    }

    @Override // hi.h0
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
