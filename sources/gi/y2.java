package gi;

import ai.fa;
import ai.u4;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fo0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class y2 implements org.telegram.ui.web.g0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ d6 c;
    public final /* synthetic */ d3 d;

    public y2(d3 d3Var, Context context, d6 d6Var) {
        this.d = d3Var;
        this.b = context;
        this.c = d6Var;
    }

    @Override // org.telegram.ui.web.g0
    public final void a() {
        d3 d3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H));
        n2.e eVar = new n2.e(7, false);
        eVar.b = new w2(this, 0);
        qc V = new xc(d3Var.p0, d3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, eVar);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.g0
    public final void b() {
        this.d.k(true);
    }

    @Override // org.telegram.ui.web.g0
    public final void c() {
        d3 d3Var = this.d;
        if (d3Var.D0 != null) {
            org.telegram.ui.ActionBar.n3 P = LaunchActivity.H1.P();
            if (P != null) {
                P.e(d3Var.D0);
            }
            d3Var.D0 = null;
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void d(TLRPC.Document document) {
        d3 d3Var = this.d;
        new xc(d3Var.p0, d3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override // org.telegram.ui.web.g0
    public final void e(String str) {
        d3 d3Var = this.d;
        if (d3Var.m() || d3Var.J != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = MessagesController.getInstance(d3Var.G).getInputUser(d3Var.H);
        tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
        tL_messages_sendWebViewData.button_text = d3Var.M;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(d3Var.G).sendRequest(tL_messages_sendWebViewData, new x2(this, 0));
    }

    @Override // org.telegram.ui.web.g0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        d3 d3Var = this.d;
        new xc(d3Var.p0, d3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(d3Var.G).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.g0
    public final String g(boolean z10, boolean z11) {
        d3 d3Var = this.d;
        boolean z12 = d3Var.d0;
        if (z12 != z10) {
            d3Var.y(z10, true, z11);
            return null;
        }
        if (z12) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.g0
    public final boolean h() {
        d3 d3Var = this.d;
        if (d3Var.m()) {
            return false;
        }
        return MediaDataController.getInstance(d3Var.G).botInAttachMenu(d3Var.H) || MessagesController.getInstance(d3Var.G).whitelistedBots.contains(Long.valueOf(d3Var.H));
    }

    @Override // org.telegram.ui.web.g0
    public final void i(boolean z10) {
        d3 d3Var = this.d;
        ImageView backButton = d3Var.W.getBackButton();
        d3Var.w0 = z10;
        AndroidUtilities.updateImageViewImageAnimated(backButton, z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        BotFullscreenButtons botFullscreenButtons = d3Var.m0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z10, true);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.g0
    public final void k(boolean z10) {
        this.d.r0 = z10;
    }

    @Override // org.telegram.ui.web.g0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        d3 d3Var = this.d;
        z2 z2Var = d3Var.l0;
        v vVar = new v();
        vVar.a = z10;
        vVar.b = z11;
        vVar.c = z12;
        vVar.d = z13;
        vVar.e = str;
        vVar.f = j10;
        vVar.g = i10;
        vVar.h = i11;
        vVar.i = str2;
        int totalHeight = z2Var.getTotalHeight();
        z2Var.e.d = vVar;
        w.b(z2Var.f[1].l, vVar, true);
        z2Var.invalidate();
        if (totalHeight != z2Var.getTotalHeight() && z2Var.r != null) {
            if (totalHeight < z2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(z2Var.r, 200L);
            } else {
                z2Var.r.run();
            }
        }
        if (d3Var.d0) {
            d3Var.E();
            d3Var.H();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void m(int i10) {
        this.d.w(i10, true);
    }

    @Override // org.telegram.ui.web.g0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        d3 d3Var = this.d;
        u2 u2Var = d3Var.v;
        c3 c3Var = d3Var.e;
        org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) d3Var.k0).O().getLastFragment();
        fo0 fo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(c3Var);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(d3Var.getContext(), 3, null);
            b2Var.q(150L);
            fa.y(d3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new u4(b2Var, 1), new ai.n2(18, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(d3Var.G).putUsers(paymentForm.users, false);
            fo0Var = new fo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            fo0Var = new fo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (fo0Var != null) {
            u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(c3Var);
            td0 td0Var = new td0(this.b);
            td0Var.show();
            fo0Var.Z0 = new ai.s2(this, td0Var, str, 9);
            fo0Var.Y0 = this.c;
            td0Var.c(fo0Var);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void p(boolean z10) {
        this.d.p(z10);
    }

    @Override // org.telegram.ui.web.g0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        d3 d3Var = this.d;
        z2 z2Var = d3Var.l0;
        v vVar = new v();
        vVar.a = z10;
        vVar.b = z11;
        vVar.c = z12;
        vVar.d = z13;
        vVar.e = str;
        vVar.f = j10;
        vVar.g = i10;
        vVar.h = i11;
        vVar.i = null;
        int totalHeight = z2Var.getTotalHeight();
        z2Var.e.c = vVar;
        u[] uVarArr = z2Var.f;
        uVarArr[0].l.a();
        if (vVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) vVar.e);
            spannableStringBuilder.setSpan(new a6(vVar.f, 1.4f, uVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            uVarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            uVarArr[0].l.t(vVar.e, true, true);
        }
        z2Var.invalidate();
        if (totalHeight != z2Var.getTotalHeight() && z2Var.r != null) {
            if (totalHeight < z2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(z2Var.r, 200L);
            } else {
                z2Var.r.run();
            }
        }
        if (d3Var.d0) {
            d3Var.E();
            d3Var.H();
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void r(int i10) {
        this.d.z(i10, true);
    }

    @Override // org.telegram.ui.web.g0
    public final void s() {
        u2 u2Var = this.d.v;
        if (u2Var.c) {
            return;
        }
        u2Var.e(u2Var.getTopActionBarOffsetY() + (-u2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.g0
    public final void t(boolean z10) {
        this.d.b0 = z10;
    }

    @Override // org.telegram.ui.web.g0
    public final void u(int i10, int i11, boolean z10) {
        d3 d3Var = this.d;
        d3Var.u0 = i10;
        d3Var.u(i11, z10, true);
    }

    @Override // org.telegram.ui.web.g0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        d3 d3Var = this.d;
        if (isEmpty) {
            Activity activity = d3Var.k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof sn) {
                    ((sn) lastFragment).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    d3Var.k(false);
                    return;
                }
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        ey eyVar = new ey(bundle);
        AndroidUtilities.hideKeyboard(d3Var.e);
        td0 td0Var = new td0(this.b);
        eyVar.C2 = new a1.d(this, user, str, td0Var, 4);
        td0Var.show();
        td0Var.c(eyVar);
    }

    @Override // org.telegram.ui.web.g0
    public final void w(boolean z10) {
        d3 d3Var = this.d;
        d6 d6Var = d3Var.E;
        FrameLayout frameLayout = d3Var.p0;
        TLRPC.User user = MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H));
        int i10 = 1;
        if (z10) {
            n2.e eVar = new n2.e(7, false);
            LocaleController.getString(R.string.UndoNoCaps);
            eVar.b = new w2(this, i10);
            qc V = new xc(frameLayout, d6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, eVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new w2(this, 2)), true));
        qc P = new xc(frameLayout, d6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.g0
    public final void x(boolean z10) {
        u2 u2Var = this.d.v;
        if (u2Var != null) {
            u2Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.g0
    public final void y() {
        this.d.k(false);
    }

    @Override // org.telegram.ui.web.g0
    public final y0 z() {
        d3 d3Var = this.d;
        if (d3Var.B0 == null) {
            y0 y0Var = new y0(this.b);
            d3Var.B0 = y0Var;
            y0Var.k = d3Var.x.getWebView();
        }
        return d3Var.B0;
    }

    @Override // org.telegram.ui.web.g0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }
}
