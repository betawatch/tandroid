package hg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.py;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i1 extends fg.d2 {
    public static i1 P0;
    public final jg.a N0;
    public final String O0;

    public i1(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, fg.n nVar, String str, boolean z4, g6 g6Var) {
        super(p2Var, i10, user, nVar, null, g6Var);
        this.O0 = str;
        ic.a((FrameLayout) this.containerView, new w(2));
        if (!z4) {
            tl0 tl0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            tl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            jg.a aVar = new jg.a(getContext(), this.resourcesProvider);
            this.N0 = aVar;
            aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 7));
            jg.a aVar2 = this.N0;
            aVar2.e = true;
            qh.d dVar = aVar2.a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.b.setBackgroundColor(k6.v0(k6.h5, aVar2.c));
            this.containerView.addView(this.N0, c6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static /* synthetic */ void c0(i1 i1Var, TLRPC.TL_error tL_error) {
        i1Var.N0.b(false);
        r.c(tL_error, (FrameLayout) i1Var.containerView, i1Var.resourcesProvider, new g1(i1Var, 0));
    }

    public static void d0(i1 i1Var) {
        fg.d2 d2Var = new fg.d2(i1Var.n, UserConfig.selectedAccount, null, null, null, i1Var.resourcesProvider);
        d2Var.G0 = true;
        d2Var.H0 = true;
        d2Var.Z = true;
        i1Var.n.showDialog(d2Var);
    }

    public static void e0(i1 i1Var) {
        String str = "https://t.me/giftcode/" + i1Var.O0;
        py pyVar = new py(y3.e(3, "onlySelect", "dialogsType", true));
        pyVar.z2 = new c1.b(16, i1Var, str);
        i1Var.n.presentFragment(pyVar);
        i1Var.dismiss();
    }

    @Override // fg.d2
    public final int X() {
        return 6;
    }

    @Override // fg.d2
    public final void Y(View view) {
        ((jg.v) view).setSlug(this.O0);
    }

    @Override // fg.d2
    public final View Z(Context context, int i10) {
        if (i10 != 6) {
            return null;
        }
        jg.v vVar = new jg.v(context, this.resourcesProvider);
        vVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        return vVar;
    }

    @Override // fg.d2
    public final void a0(boolean z4) {
        super.a0(z4);
        this.M0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.M0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.M0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.M0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), k6.gc, 0, new g1(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override // fg.d2
    public final void b0() {
        int i10 = this.c0;
        this.d0 = i10;
        this.e0 = i10 + 1;
        int i11 = i10 + 2;
        this.c0 = i11;
        this.f0 = i11;
        this.g0 = i11;
        int size = this.U.size() + i11;
        this.h0 = size;
        this.c0 = size + 1;
        this.i0 = size;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        P0 = null;
    }
}
