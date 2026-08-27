package nh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import hh.u7;
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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.do0;
import org.telegram.ui.gy;
import org.telegram.ui.i6;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class w2 implements org.telegram.ui.web.f0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ c6 c;
    public final /* synthetic */ b3 d;

    public w2(b3 b3Var, Context context, c6 c6Var) {
        this.d = b3Var;
        this.b = context;
        this.c = c6Var;
    }

    @Override // org.telegram.ui.web.f0
    public final void a() {
        b3 b3Var = this.d;
        TLRPC.User user = MessagesController.getInstance(b3Var.C).getUser(Long.valueOf(b3Var.D));
        i6 i6Var = new i6(2);
        i6Var.b = new u2(this, 0);
        ec V = new mc(b3Var.l0, b3Var.A).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user))), null, i6Var);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void b() {
        this.d.k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void c() {
        b3 b3Var = this.d;
        if (b3Var.z0 != null) {
            org.telegram.ui.ActionBar.m3 P = LaunchActivity.C1.P();
            if (P != null) {
                P.e(b3Var.z0);
            }
            b3Var.z0 = null;
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void d(TLRPC.Document document) {
        b3 b3Var = this.d;
        new mc(b3Var.l0, b3Var.A).r(document, LocaleController.getString(R.string.BotEmojiStatusUpdated)).k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void e(String str) {
        b3 b3Var = this.d;
        if (b3Var.F != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = MessagesController.getInstance(b3Var.C).getInputUser(b3Var.D);
        tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
        tL_messages_sendWebViewData.button_text = b3Var.I;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(b3Var.C).sendRequest(tL_messages_sendWebViewData, new v2(this, 0));
    }

    @Override // org.telegram.ui.web.f0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        b3 b3Var = this.d;
        new mc(b3Var.l0, b3Var.A).Q(R.raw.forward, 36, AndroidUtilities.replaceTags(size == 1 ? LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(b3Var.C).getPeerName(((Long) arrayList.get(0)).longValue())) : LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final String g(boolean z10, boolean z11) {
        b3 b3Var = this.d;
        boolean z12 = b3Var.Z;
        if (z12 != z10) {
            b3Var.x(z10, true, z11);
            return null;
        }
        if (z12) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.f0
    public final boolean h() {
        b3 b3Var = this.d;
        return MediaDataController.getInstance(b3Var.C).botInAttachMenu(b3Var.D) || MessagesController.getInstance(b3Var.C).whitelistedBots.contains(Long.valueOf(b3Var.D));
    }

    @Override // org.telegram.ui.web.f0
    public final void i(boolean z10) {
        b3 b3Var = this.d;
        ImageView backButton = b3Var.S.getBackButton();
        b3Var.s0 = z10;
        AndroidUtilities.updateImageViewImageAnimated(backButton, z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        BotFullscreenButtons botFullscreenButtons = b3Var.i0;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(z10, true);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void j() {
        y();
    }

    @Override // org.telegram.ui.web.f0
    public final void k(boolean z10) {
        this.d.n0 = z10;
    }

    @Override // org.telegram.ui.web.f0
    public final void l(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13, String str2) {
        b3 b3Var = this.d;
        x2 x2Var = b3Var.h0;
        u uVar = new u();
        uVar.a = z10;
        uVar.b = z11;
        uVar.c = z12;
        uVar.d = z13;
        uVar.e = str;
        uVar.f = j10;
        uVar.g = i10;
        uVar.h = i11;
        uVar.i = str2;
        int totalHeight = x2Var.getTotalHeight();
        x2Var.e.d = uVar;
        v.b(x2Var.f[1].l, uVar, true);
        x2Var.invalidate();
        if (totalHeight != x2Var.getTotalHeight() && x2Var.r != null) {
            if (totalHeight < x2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(x2Var.r, 200L);
            } else {
                x2Var.r.run();
            }
        }
        if (b3Var.Z) {
            b3Var.D();
            b3Var.G();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void m(int i10) {
        this.d.v(i10, true);
    }

    @Override // org.telegram.ui.web.f0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        b3 b3Var = this.d;
        s2 s2Var = b3Var.v;
        a3 a3Var = b3Var.e;
        org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) b3Var.g0).O().getLastFragment();
        do0 do0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            AndroidUtilities.hideKeyboard(a3Var);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(b3Var.getContext(), 3, null);
            b2Var.q(150L);
            u7.y(b3Var.C, false).Y(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new hh.h3(b2Var, 1), new gh.d1(20, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(b3Var.C).putUsers(paymentForm.users, false);
            do0Var = new do0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            do0Var = new do0((TLRPC.PaymentReceipt) tLObject);
        }
        if (do0Var != null) {
            s2Var.e(s2Var.getTopActionBarOffsetY() + (-s2Var.getOffsetY()));
            AndroidUtilities.hideKeyboard(a3Var);
            kc0 kc0Var = new kc0(this.b);
            kc0Var.show();
            do0Var.V0 = new ag.l0(this, kc0Var, str, 14);
            do0Var.U0 = this.c;
            kc0Var.c(do0Var);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void p(boolean z10) {
        this.d.o(z10);
    }

    @Override // org.telegram.ui.web.f0
    public final void q(boolean z10, boolean z11, String str, long j10, int i10, int i11, boolean z12, boolean z13) {
        b3 b3Var = this.d;
        x2 x2Var = b3Var.h0;
        u uVar = new u();
        uVar.a = z10;
        uVar.b = z11;
        uVar.c = z12;
        uVar.d = z13;
        uVar.e = str;
        uVar.f = j10;
        uVar.g = i10;
        uVar.h = i11;
        uVar.i = null;
        int totalHeight = x2Var.getTotalHeight();
        x2Var.e.b = uVar;
        t[] tVarArr = x2Var.f;
        tVarArr[0].l.b();
        if (uVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) uVar.e);
            spannableStringBuilder.setSpan(new t5(uVar.f, 1.4f, tVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            tVarArr[0].l.q(spannableStringBuilder, true, true);
        } else {
            tVarArr[0].l.q(uVar.e, true, true);
        }
        x2Var.invalidate();
        if (totalHeight != x2Var.getTotalHeight() && x2Var.r != null) {
            if (totalHeight < x2Var.getTotalHeight()) {
                AndroidUtilities.runOnUIThread(x2Var.r, 200L);
            } else {
                x2Var.r.run();
            }
        }
        if (b3Var.Z) {
            b3Var.D();
            b3Var.G();
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void r(int i10) {
        this.d.y(i10, true);
    }

    @Override // org.telegram.ui.web.f0
    public final void s() {
        s2 s2Var = this.d.v;
        if (s2Var.c) {
            return;
        }
        s2Var.e(s2Var.getTopActionBarOffsetY() + (-s2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.f0
    public final void t(boolean z10) {
        this.d.X = z10;
    }

    @Override // org.telegram.ui.web.f0
    public final void u(int i10, int i11, boolean z10) {
        b3 b3Var = this.d;
        b3Var.q0 = i10;
        b3Var.t(i11, z10, true);
    }

    @Override // org.telegram.ui.web.f0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        b3 b3Var = this.d;
        if (isEmpty) {
            Activity activity = b3Var.g0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) activity).O().getLastFragment();
                if (lastFragment instanceof rn) {
                    ((rn) lastFragment).U.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                    b3Var.k(false);
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
        gy gyVar = new gy(bundle);
        AndroidUtilities.hideKeyboard(b3Var.e);
        kc0 kc0Var = new kc0(this.b);
        gyVar.y2 = new a1.d(this, user, str, kc0Var, 4);
        kc0Var.show();
        kc0Var.c(gyVar);
    }

    @Override // org.telegram.ui.web.f0
    public final void w(boolean z10) {
        b3 b3Var = this.d;
        c6 c6Var = b3Var.A;
        FrameLayout frameLayout = b3Var.l0;
        TLRPC.User user = MessagesController.getInstance(b3Var.C).getUser(Long.valueOf(b3Var.D));
        int i10 = 2;
        int i11 = 1;
        if (z10) {
            i6 i6Var = new i6(2);
            LocaleController.getString(R.string.UndoNoCaps);
            i6Var.b = new u2(this, i11);
            ec V = new mc(frameLayout, c6Var).V(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user))), null, i6Var);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new u2(this, i10)), true));
        ec P = new mc(frameLayout, c6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.f0
    public final void x(boolean z10) {
        s2 s2Var = this.d.v;
        if (s2Var != null) {
            s2Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.f0
    public final void y() {
        this.d.k(false);
    }

    @Override // org.telegram.ui.web.f0
    public final x0 z() {
        b3 b3Var = this.d;
        if (b3Var.x0 == null) {
            x0 x0Var = new x0(this.b);
            b3Var.x0 = x0Var;
            x0Var.k = b3Var.x.getWebView();
        }
        return b3Var.x0;
    }

    @Override // org.telegram.ui.web.f0
    public final /* synthetic */ void o(int i10, boolean z10) {
    }
}
