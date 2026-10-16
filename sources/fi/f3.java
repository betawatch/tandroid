package fi;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.fo;
import org.telegram.ui.yy;
import zh.n5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class f3 implements org.telegram.ui.web.h0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ c6 c;
    public final /* synthetic */ k3 d;

    public f3(k3 k3Var, Context context, c6 c6Var) {
        this.d = k3Var;
        this.b = context;
        this.c = c6Var;
    }

    @Override // org.telegram.ui.web.h0
    public final void a() {
        k3 k3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        n3.b bVar = new n3.b(6, false);
        bVar.b = new c3(this, 0);
        sc V = new zc(k3Var.p0, k3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, bVar);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.h0
    public final void b() {
        this.d.k(true);
    }

    @Override // org.telegram.ui.web.h0
    public final void c() {
        k3 k3Var = this.d;
        if (k3Var.D0 != null) {
            org.telegram.ui.ActionBar.m3 P = LaunchActivity.G1.P();
            if (P != null) {
                P.e(k3Var.D0);
            }
            k3Var.D0 = null;
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void d(TLRPC.Document document) {
        k3 k3Var = this.d;
        new zc(k3Var.p0, k3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override // org.telegram.ui.web.h0
    public final void e(String str) {
        k3 k3Var = this.d;
        if (k3Var.m() || k3Var.J != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = MessagesController.getInstance(k3Var.G).getInputUser(k3Var.H);
        tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
        tL_messages_sendWebViewData.button_text = k3Var.M;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(k3Var.G).sendRequest(tL_messages_sendWebViewData, new d3(this, 0));
    }

    @Override // org.telegram.ui.web.h0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        k3 k3Var = this.d;
        new zc(k3Var.p0, k3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(k3Var.G).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.h0
    public final String g(boolean z10, boolean z11) {
        k3 k3Var = this.d;
        boolean z12 = k3Var.d0;
        if (z12 != z10) {
            k3Var.y(z10, true, z11);
            return null;
        }
        if (z12) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.h0
    public final boolean h() {
        k3 k3Var = this.d;
        if (k3Var.m()) {
            return false;
        }
        return MediaDataController.getInstance(k3Var.G).botInAttachMenu(k3Var.H) || MessagesController.getInstance(k3Var.G).whitelistedBots.contains(Long.valueOf(k3Var.H));
    }

    @Override // org.telegram.ui.web.h0
    public final void i(boolean z10) {
        k3 k3Var = this.d;
        ImageView backButton = k3Var.W.getBackButton();
        k3Var.w0 = z10;
        AndroidUtilities.updateImageViewImageAnimated(backButton, z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        BotFullscreenButtons botFullscreenButtons = k3Var.m0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z10, true);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.h0
    public final void k(boolean z10) {
        this.d.r0 = z10;
    }

    @Override // org.telegram.ui.web.h0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.l0;
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
        int totalHeight = g3Var.getTotalHeight();
        g3Var.e.d = vVar;
        w.b(g3Var.f[1].l, vVar, true);
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.r, 200L);
            } else {
                g3Var.r.run();
            }
        }
        if (k3Var.d0) {
            k3Var.E();
            k3Var.H();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void m(int i10) {
        this.d.w(i10, true);
    }

    @Override // org.telegram.ui.web.h0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        k3 k3Var = this.d;
        a3 a3Var = k3Var.v;
        j3 j3Var = k3Var.e;
        org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) k3Var.k0).O().getLastFragment();
        ap0 ap0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(j3Var);
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(k3Var.getContext(), 3, null);
            a2Var.q(150L);
            n5.y(k3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e3(a2Var, 0), new bi.v2(12, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k3Var.G).putUsers(paymentForm.users, false);
            ap0Var = new ap0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ap0Var = new ap0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ap0Var != null) {
            a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(j3Var);
            zd0 zd0Var = new zd0(this.b);
            zd0Var.show();
            ap0Var.Z0 = new androidx.car.app.utils.a(this, zd0Var, str, 8);
            ap0Var.Y0 = this.c;
            zd0Var.c(ap0Var);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void p(boolean z10) {
        this.d.p(z10);
    }

    @Override // org.telegram.ui.web.h0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.l0;
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
        int totalHeight = g3Var.getTotalHeight();
        g3Var.e.c = vVar;
        u[] uVarArr = g3Var.f;
        uVarArr[0].l.a();
        if (vVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) vVar.e);
            spannableStringBuilder.setSpan(new b6(vVar.f, 1.4f, uVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            uVarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            uVarArr[0].l.t(vVar.e, true, true);
        }
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.r, 200L);
            } else {
                g3Var.r.run();
            }
        }
        if (k3Var.d0) {
            k3Var.E();
            k3Var.H();
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void r(int i10) {
        this.d.z(i10, true);
    }

    @Override // org.telegram.ui.web.h0
    public final void s() {
        a3 a3Var = this.d.v;
        if (a3Var.c) {
            return;
        }
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.h0
    public final void t(boolean z10) {
        this.d.b0 = z10;
    }

    @Override // org.telegram.ui.web.h0
    public final void u(int i10, int i11, boolean z10) {
        k3 k3Var = this.d;
        k3Var.u0 = i10;
        k3Var.u(i11, z10, true);
    }

    @Override // org.telegram.ui.web.h0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        k3 k3Var = this.d;
        if (isEmpty) {
            Activity activity = k3Var.k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof fo) {
                    ((fo) lastFragment).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    k3Var.k(false);
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
        yy yyVar = new yy(bundle);
        AndroidUtilities.hideKeyboard(k3Var.e);
        zd0 zd0Var = new zd0(this.b);
        yyVar.C2 = new a1.d(this, user, str, zd0Var, 2);
        zd0Var.show();
        zd0Var.c(yyVar);
    }

    @Override // org.telegram.ui.web.h0
    public final void w(boolean z10) {
        k3 k3Var = this.d;
        c6 c6Var = k3Var.E;
        FrameLayout frameLayout = k3Var.p0;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        int i10 = 1;
        if (z10) {
            n3.b bVar = new n3.b(6, false);
            LocaleController.getString(R.string.UndoNoCaps);
            bVar.b = new c3(this, i10);
            sc V = new zc(frameLayout, c6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, bVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new c3(this, 2)), true));
        sc P = new zc(frameLayout, c6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.h0
    public final void x(boolean z10) {
        a3 a3Var = this.d.v;
        if (a3Var != null) {
            a3Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.h0
    public final void y() {
        this.d.k(false);
    }

    @Override // org.telegram.ui.web.h0
    public final z0 z() {
        k3 k3Var = this.d;
        if (k3Var.B0 == null) {
            z0 z0Var = new z0(this.b);
            k3Var.B0 = z0Var;
            z0Var.k = k3Var.x.getWebView();
        }
        return k3Var.B0;
    }

    @Override // org.telegram.ui.web.h0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }
}
