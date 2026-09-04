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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.uy;
import org.telegram.ui.xo0;
import zh.s5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class f3 implements org.telegram.ui.web.i0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f6 c;
    public final /* synthetic */ k3 d;

    public f3(k3 k3Var, Context context, f6 f6Var) {
        this.d = k3Var;
        this.b = context;
        this.c = f6Var;
    }

    @Override // org.telegram.ui.web.i0
    public final void a() {
        k3 k3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        o0.a aVar = new o0.a(3, (byte) 0);
        aVar.b = new c3(this, 0);
        qc V = new yc(k3Var.p0, k3Var.E).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.i0
    public final void b() {
        this.d.k(true);
    }

    @Override // org.telegram.ui.web.i0
    public final void c() {
        k3 k3Var = this.d;
        if (k3Var.D0 != null) {
            org.telegram.ui.ActionBar.o3 P = LaunchActivity.G1.P();
            if (P != null) {
                P.e(k3Var.D0);
            }
            k3Var.D0 = null;
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void d(TLRPC.Document document) {
        k3 k3Var = this.d;
        new yc(k3Var.p0, k3Var.E).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override // org.telegram.ui.web.i0
    public final void e(String str) {
        k3 k3Var = this.d;
        if (k3Var.J != 0 || this.a) {
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

    @Override // org.telegram.ui.web.i0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        k3 k3Var = this.d;
        new yc(k3Var.p0, k3Var.E).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(k3Var.G).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.i0
    public final String g(boolean z10, boolean z11) {
        k3 k3Var = this.d;
        boolean z12 = k3Var.d0;
        if (z12 != z10) {
            k3Var.x(z10, true, z11);
            return null;
        }
        if (z12) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.i0
    public final boolean h() {
        k3 k3Var = this.d;
        return MediaDataController.getInstance(k3Var.G).botInAttachMenu(k3Var.H) || MessagesController.getInstance(k3Var.G).whitelistedBots.contains(Long.valueOf(k3Var.H));
    }

    @Override // org.telegram.ui.web.i0
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

    @Override // org.telegram.ui.web.i0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.i0
    public final void k(boolean z10) {
        this.d.r0 = z10;
    }

    @Override // org.telegram.ui.web.i0
    public final void l(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13, String str2) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.l0;
        w wVar = new w();
        wVar.a = z10;
        wVar.b = z11;
        wVar.c = z12;
        wVar.d = z13;
        wVar.e = str;
        wVar.f = j3;
        wVar.g = i10;
        wVar.h = i11;
        wVar.i = str2;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.e.d = wVar;
        x.b(g3Var.f[1].l, wVar, true);
        g3Var.invalidate();
        if (totalHeight != g3Var.getTotalHeight() && g3Var.r != null) {
            if (totalHeight < g3Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(g3Var.r, 200L);
            } else {
                g3Var.r.run();
            }
        }
        if (k3Var.d0) {
            k3Var.D();
            k3Var.G();
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void m(int i10) {
        this.d.v(i10, true);
    }

    @Override // org.telegram.ui.web.i0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        k3 k3Var = this.d;
        a3 a3Var = k3Var.v;
        j3 j3Var = k3Var.e;
        org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) k3Var.k0).O().getLastFragment();
        xo0 xo0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(j3Var);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(k3Var.getContext(), 3, null);
            b2Var.q(150L);
            s5.y(k3Var.G, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new e3(b2Var, 0), new di.m2(11, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k3Var.G).putUsers(paymentForm.users, false);
            xo0Var = new xo0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            xo0Var = new xo0((TLRPC.PaymentReceipt) tLObject);
        }
        if (xo0Var != null) {
            a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(j3Var);
            ad0 ad0Var = new ad0(this.b);
            ad0Var.show();
            xo0Var.Z0 = new androidx.car.app.utils.a(this, ad0Var, str, 8);
            xo0Var.Y0 = this.c;
            ad0Var.c(xo0Var);
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override // org.telegram.ui.web.i0
    public final void q(boolean z10, boolean z11, String str, long j3, int i10, int i11, boolean z12, boolean z13) {
        k3 k3Var = this.d;
        g3 g3Var = k3Var.l0;
        w wVar = new w();
        wVar.a = z10;
        wVar.b = z11;
        wVar.c = z12;
        wVar.d = z13;
        wVar.e = str;
        wVar.f = j3;
        wVar.g = i10;
        wVar.h = i11;
        wVar.i = null;
        int totalHeight = g3Var.getTotalHeight();
        g3Var.e.c = wVar;
        v[] vVarArr = g3Var.f;
        vVarArr[0].l.b();
        if (wVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) wVar.e);
            spannableStringBuilder.setSpan(new z5(wVar.f, 1.4f, vVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            vVarArr[0].l.q(spannableStringBuilder, true, true);
        } else {
            vVarArr[0].l.q(wVar.e, true, true);
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
            k3Var.D();
            k3Var.G();
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void r(int i10) {
        this.d.y(i10, true);
    }

    @Override // org.telegram.ui.web.i0
    public final void s() {
        a3 a3Var = this.d.v;
        if (a3Var.c) {
            return;
        }
        a3Var.e(a3Var.getTopActionBarOffsetY() + (-a3Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.i0
    public final void t(boolean z10) {
        this.d.b0 = z10;
    }

    @Override // org.telegram.ui.web.i0
    public final void u(int i10, int i11, boolean z10) {
        k3 k3Var = this.d;
        k3Var.u0 = i10;
        k3Var.t(i11, z10, true);
    }

    @Override // org.telegram.ui.web.i0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        k3 k3Var = this.d;
        if (isEmpty) {
            Activity activity = k3Var.k0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof co) {
                    ((co) lastFragment).Y.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
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
        uy uyVar = new uy(bundle);
        AndroidUtilities.hideKeyboard(k3Var.e);
        ad0 ad0Var = new ad0(this.b);
        uyVar.C2 = new a1.d(this, user, str, ad0Var, 2);
        ad0Var.show();
        ad0Var.c(uyVar);
    }

    @Override // org.telegram.ui.web.i0
    public final void w(boolean z10) {
        k3 k3Var = this.d;
        f6 f6Var = k3Var.E;
        FrameLayout frameLayout = k3Var.p0;
        TLRPC.User user = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
        int i10 = 1;
        if (z10) {
            o0.a aVar = new o0.a(3, (byte) 0);
            LocaleController.getString(R.string.UndoNoCaps);
            aVar.b = new c3(this, i10);
            qc V = new yc(frameLayout, f6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, aVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new c3(this, 2)), true));
        qc P = new yc(frameLayout, f6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.i0
    public final void x(boolean z10) {
        a3 a3Var = this.d.v;
        if (a3Var != null) {
            a3Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.i0
    public final void y() {
        this.d.k(false);
    }

    @Override // org.telegram.ui.web.i0
    public final a1 z() {
        k3 k3Var = this.d;
        if (k3Var.B0 == null) {
            a1 a1Var = new a1(this.b);
            k3Var.B0 = a1Var;
            a1Var.k = k3Var.x.getWebView();
        }
        return k3Var.B0;
    }

    @Override // org.telegram.ui.web.i0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }
}
