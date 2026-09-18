package fi;

import ai.v0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u9;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class f0 extends h0 {
    public final u9 h;
    public final f9 n;
    public final /* synthetic */ k0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        this.r = k0Var;
        i10 = ((g3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        f6Var = ((g3) k0Var).resourcesProvider;
        f61 f61Var = new f61(context, i10, 0, false, tVar, uVar, uVar2, f6Var);
        this.d = f61Var;
        f61Var.q1();
        f61 f61Var2 = this.d;
        f61Var2.Y2.r = false;
        f61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.b);
        this.c.addView(k0Var.F, x5.g());
        this.c.addView(this.d, x5.g());
        this.c.addView(k0Var.H, x5.g());
        f6Var2 = ((g3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(k0Var.getThemedColor(j6.G6));
        this.a.A(k0Var.getThemedColor(j6.z8), false);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        this.a.B(k0Var.getThemedColor(j6.y8), false);
        this.a.setTitle(DialogObject.getName(k0Var.f));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        f9 f9Var = new f9(k0Var.f);
        this.n = f9Var;
        u9 u9Var = new u9(getContext());
        this.h = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        u9Var.e(k0Var.f, f9Var);
        this.a.addView(u9Var, x5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, x5.e(-1, 56, 48));
        this.c.addView(k0Var.y, x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.a0 n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        f6Var3 = ((g3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, f6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f)) {
            oq oqVar = new oq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.c.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // fi.h0
    public final float b() {
        return yf.e0.b(this.r.b.e) * super.b();
    }

    @Override // fi.h0
    public final void c() {
        super.c();
        this.r.y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
