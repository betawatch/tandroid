package ii;

import a8.v0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e0 extends g0 {
    public final y9 h;
    public final j9 n;
    public final /* synthetic */ j0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i10;
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5;
        u6 u6Var6;
        this.r = j0Var;
        i10 = ((k3) j0Var).currentAccount;
        s sVar = new s(j0Var, 4);
        t tVar = new t(j0Var, 3);
        t tVar2 = new t(j0Var, 4);
        u6Var = ((k3) j0Var).resourcesProvider;
        s71 s71Var = new s71(context, i10, 0, false, sVar, tVar, tVar2, u6Var);
        this.d = s71Var;
        s71Var.u1();
        s71 s71Var2 = this.d;
        s71Var2.g3.r = false;
        s71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.b);
        this.c.addView(j0Var.F, kb1.k());
        this.c.addView(this.d, kb1.k());
        this.c.addView(j0Var.H, kb1.k());
        u6Var2 = ((k3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        int i11 = y6.G6;
        u6Var3 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar2, 5, i11, u6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.a;
        int i12 = y6.z8;
        u6Var4 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar3, 3, i12, u6Var4);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar4 = this.a;
        int i13 = y6.y8;
        u6Var5 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar4, 1, i13, u6Var5);
        this.a.setTitle(DialogObject.getName(j0Var.f));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new bh.m(this, 9));
        j9 j9Var = new j9(j0Var.f);
        this.n = j9Var;
        y9 y9Var = new y9(getContext());
        this.h = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        y9Var.f(j0Var.f, j9Var);
        this.a.addView(y9Var, kb1.f(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, kb1.i(-1, 56, 48));
        this.c.addView(j0Var.y, kb1.h(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z l4 = this.a.l();
        l4.setGlassMode(true);
        l4.setTranslationX(-AndroidUtilities.dp(7.0f));
        l4.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(j0Var.f)) {
            l4.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        u6Var6 = ((k3) j0Var).resourcesProvider;
        fi.d dVar = new fi.d(context2, u6Var6, true);
        dVar.f();
        if (ChatObject.canAddChatToCommunity(j0Var.f)) {
            zq zqVar = new zq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        j0Var.n = dVar;
        dVar.setOnClickListener(new ig.d0(this, 5));
        this.c.addView(dVar, kb1.j(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // ii.g0
    public final float b() {
        return v0.a(this.r.b.e) * super.b();
    }

    @Override // ii.g0
    public final void c() {
        super.c();
        this.r.y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
