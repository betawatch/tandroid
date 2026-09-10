package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.r61;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e0 extends h0 {
    public final /* synthetic */ k0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.b);
        i10 = ((h3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        f6Var = ((h3) k0Var).resourcesProvider;
        r61 r61Var = new r61(context, i10, 0, false, tVar, uVar, null, f6Var);
        this.d = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.d;
        r61Var2.Y2.r = false;
        r61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.c.addView(k0Var.G, a6.g());
        this.c.addView(this.d, 0, a6.c(-1.0f, -1));
        this.c.addView(k0Var.I, a6.g());
        f6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, f6Var2);
        this.a = lVar;
        lVar.setOccupyStatusBar(false);
        this.a.setTitleColor(k0Var.getThemedColor(j6.G6));
        this.a.A(k0Var.getThemedColor(j6.z8), false);
        org.telegram.ui.ActionBar.l lVar2 = this.a;
        boolean z10 = k0Var.N;
        lVar2.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.a.C(k0Var.getThemedColor(j6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new di.w(this, 6));
        this.c.addView(this.a, a6.e(-1, 56, 48));
        this.c.addView(k0Var.E, a6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        f6Var3 = ((h3) k0Var).resourcesProvider;
        bi.d dVar = new bi.d(context2, f6Var3, true);
        k0Var.r = dVar;
        dVar.e();
        k0Var.r.setText(LocaleController.getString(R.string.OK));
        k0Var.r.setOnClickListener(new ai.u(this, 13));
        if (z10) {
            k0Var.r.setVisibility(8);
        }
        this.c.addView(k0Var.r, a6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // ei.h0
    public final float b() {
        return xf.f0.b(this.h.c.e) * super.b();
    }

    @Override // ei.h0
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
