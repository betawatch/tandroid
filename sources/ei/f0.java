package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w9;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f0 extends h0 {
    public final w9 h;
    public final g9 n;
    public final /* synthetic */ k0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        this.r = k0Var;
        i10 = ((h3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        f6Var = ((h3) k0Var).resourcesProvider;
        r61 r61Var = new r61(context, i10, 0, false, tVar, uVar, uVar2, f6Var);
        this.d = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.d;
        r61Var2.Y2.r = false;
        r61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.b);
        this.c.addView(k0Var.F, a6.g());
        this.c.addView(this.d, a6.g());
        this.c.addView(k0Var.H, a6.g());
        f6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, f6Var2);
        this.a = lVar;
        lVar.setOccupyStatusBar(false);
        this.a.setTitleColor(k0Var.getThemedColor(j6.G6));
        this.a.A(k0Var.getThemedColor(j6.z8), false);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        this.a.C(k0Var.getThemedColor(j6.y8), false);
        this.a.setTitle(DialogObject.getName(k0Var.f));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new di.w(this, 7));
        g9 g9Var = new g9(k0Var.f);
        this.n = g9Var;
        w9 w9Var = new w9(getContext());
        this.h = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        w9Var.e(k0Var.f, g9Var);
        this.a.addView(w9Var, a6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, a6.e(-1, 56, 48));
        this.c.addView(k0Var.y, a6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        f6Var3 = ((h3) k0Var).resourcesProvider;
        bi.d dVar = new bi.d(context2, f6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f)) {
            uq uqVar = new uq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.n = dVar;
        dVar.setOnClickListener(new ai.u(this, 14));
        this.c.addView(dVar, a6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // ei.h0
    public final float b() {
        return xf.f0.b(this.r.b.e) * super.b();
    }

    @Override // ei.h0
    public final void c() {
        super.c();
        this.r.y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
