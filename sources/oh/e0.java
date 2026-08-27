package oh;

import ag.e2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import h7.z5;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class e0 extends g0 {
    public final n9 h;
    public final y8 n;
    public final /* synthetic */ j0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        this.r = j0Var;
        i10 = ((e3) j0Var).currentAccount;
        s sVar = new s(j0Var, 4);
        t tVar = new t(j0Var, 3);
        t tVar2 = new t(j0Var, 4);
        c6Var = ((e3) j0Var).resourcesProvider;
        k51 k51Var = new k51(context, i10, 0, false, sVar, tVar, tVar2, c6Var);
        this.d = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.d;
        k51Var2.U2.r = false;
        k51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.b);
        this.c.addView(j0Var.B, z5.g());
        this.c.addView(this.d, z5.g());
        this.c.addView(j0Var.D, z5.g());
        c6Var2 = ((e3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(j0Var.getThemedColor(g6.G6));
        this.a.C(j0Var.getThemedColor(g6.z8), false);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        this.a.D(j0Var.getThemedColor(g6.y8), false);
        this.a.setTitle(DialogObject.getName(j0Var.f));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new e2(this, 11));
        y8 y8Var = new y8(j0Var.f);
        this.n = y8Var;
        n9 n9Var = new n9(getContext());
        this.h = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        n9Var.e(j0Var.f, y8Var);
        this.a.addView(n9Var, z5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, z5.e(-1, 56, 48));
        this.c.addView(j0Var.y, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(j0Var.f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        c6Var3 = ((e3) j0Var).resourcesProvider;
        lh.d dVar = new lh.d(context2, c6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(j0Var.f)) {
            cq cqVar = new cq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        j0Var.n = dVar;
        dVar.setOnClickListener(new c5(this, 9));
        this.c.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // oh.g0
    public final float b() {
        return gf.m0.b(this.r.b.e) * super.b();
    }

    @Override // oh.g0
    public final void c() {
        super.c();
        this.r.y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
