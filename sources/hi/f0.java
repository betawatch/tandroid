package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xq;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class f0 extends h0 {
    public final w9 h;
    public final h9 n;
    public final /* synthetic */ k0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        this.r = k0Var;
        i10 = ((h3) k0Var).currentAccount;
        s sVar = new s(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        g6Var = ((h3) k0Var).resourcesProvider;
        j71 j71Var = new j71(context, i10, 0, false, sVar, uVar, uVar2, g6Var);
        this.d = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.d;
        j71Var2.Z2.r = false;
        j71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.b);
        this.c.addView(k0Var.F, z5.g());
        this.c.addView(this.d, z5.g());
        this.c.addView(k0Var.H, z5.g());
        g6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        int i11 = k6.G6;
        g6Var3 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar2, 5, i11, g6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.a;
        int i12 = k6.z8;
        g6Var4 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar3, 3, i12, g6Var4);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar4 = this.a;
        int i13 = k6.y8;
        g6Var5 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar4, 1, i13, g6Var5);
        this.a.setTitle(DialogObject.getName(k0Var.f));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new ah.s(this, 9));
        h9 h9Var = new h9(k0Var.f);
        this.n = h9Var;
        w9 w9Var = new w9(getContext());
        this.h = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        w9Var.e(k0Var.f, h9Var);
        this.a.addView(w9Var, z5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, z5.e(-1, 56, 48));
        this.c.addView(k0Var.y, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y m10 = this.a.m();
        m10.setGlassMode(true);
        m10.setTranslationX(-AndroidUtilities.dp(7.0f));
        m10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f)) {
            m10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        g6Var6 = ((h3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context2, g6Var6, true);
        dVar.f();
        if (ChatObject.canAddChatToCommunity(k0Var.f)) {
            xq xqVar = new xq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(xqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.n = dVar;
        dVar.setOnClickListener(new hg.r0(this, 4));
        this.c.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // hi.h0
    public final float b() {
        return zf.f0.b(this.r.b.e) * super.b();
    }

    @Override // hi.h0
    public final void c() {
        super.c();
        this.r.y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
