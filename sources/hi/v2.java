package hi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.ea;
import bi.r4;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.kl0;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class v2 implements org.telegram.ui.web.d0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ h6 c;
    public final /* synthetic */ a3 d;

    public v2(a3 a3Var, Context context, h6 h6Var) {
        this.d = a3Var;
        this.b = context;
        this.c = h6Var;
    }

    @Override // org.telegram.ui.web.d0
    public final v0 A() {
        a3 a3Var = this.d;
        if (a3Var.C0 == null) {
            v0 v0Var = new v0(this.b);
            a3Var.C0 = v0Var;
            v0Var.k = a3Var.D.getWebView();
        }
        return a3Var.C0;
    }

    @Override // org.telegram.ui.web.d0
    public final void a() {
        a3 a3Var = this.d;
        TLRPC.User a22 = qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I));
        m4.d0 d0Var = new m4.d0();
        d0Var.a = new t2(this, 0);
        bc V = new gc(a3Var.q0, a3Var.F).V(Arrays.asList(a22), org.telegram.messenger.g0.X2(id.a0(null, null, 2131753087, t10.p(a22))), null, d0Var);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void b() {
        this.d.o(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void c() {
        a3 a3Var = this.d;
        if (a3Var.E0 != null) {
            org.telegram.ui.ActionBar.e3 O = LaunchActivity.G1.O();
            if (O != null) {
                O.e(a3Var.E0);
            }
            a3Var.E0 = null;
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void d(TLRPC.Document document) {
        a3 a3Var = this.d;
        new gc(a3Var.q0, a3Var.F).q(document, id.M0(2131753075, null)).k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void e(String str) {
        a3 a3Var = this.d;
        if (a3Var.q() || a3Var.K != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = qp.s1(a3Var.H).o1(a3Var.I);
        tL_messages_sendWebViewData.random_id = Utilities.b.nextLong();
        tL_messages_sendWebViewData.button_text = a3Var.N;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(a3Var.H).sendRequest(tL_messages_sendWebViewData, new u2(this, 0));
    }

    @Override // org.telegram.ui.web.d0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        a3 a3Var = this.d;
        new gc(a3Var.q0, a3Var.F).Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(size == 1 ? id.a0(null, null, 2131752973, qp.s1(a3Var.H).B1(((Long) arrayList.get(0)).longValue(), false)) : id.G(arrayList.size(), "BotSharedToMany", new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final String g(boolean z9, boolean z10) {
        a3 a3Var = this.d;
        boolean z11 = a3Var.e0;
        if (z11 != z9) {
            a3Var.C(z9, true, z10);
            return null;
        }
        if (z11) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.d0
    public final boolean h() {
        a3 a3Var = this.d;
        if (a3Var.q()) {
            return false;
        }
        return ui.b0(a3Var.H).j(a3Var.I) || qp.s1(a3Var.H).W6.contains(Long.valueOf(a3Var.I));
    }

    @Override // org.telegram.ui.web.d0
    public final void i(boolean z9) {
        a3 a3Var = this.d;
        ImageView backButton = a3Var.X.getBackButton();
        a3Var.x0 = z9;
        org.telegram.messenger.g0.R3(backButton, z9 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        org.telegram.messenger.h2 h2Var = a3Var.n0;
        if (h2Var != null) {
            h2Var.K = z9;
            h2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void j() {
        z();
    }

    @Override // org.telegram.ui.web.d0
    public final void k(boolean z9) {
        this.d.s0 = z9;
    }

    @Override // org.telegram.ui.web.d0
    public final void l(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12, String str2) {
        a3 a3Var = this.d;
        w2 w2Var = a3Var.m0;
        s sVar = new s();
        sVar.a = z9;
        sVar.b = z10;
        sVar.c = z11;
        sVar.d = z12;
        sVar.e = str;
        sVar.f = j3;
        sVar.g = i7;
        sVar.h = i10;
        sVar.i = str2;
        int totalHeight = w2Var.getTotalHeight();
        w2Var.e.d = sVar;
        t.b(w2Var.f[1].l, sVar, true);
        w2Var.invalidate();
        if (totalHeight != w2Var.getTotalHeight() && w2Var.r != null) {
            if (totalHeight < w2Var.getTotalHeight()) {
                org.telegram.messenger.g0.i3(w2Var.r, 200L);
            } else {
                w2Var.r.run();
            }
        }
        if (a3Var.e0) {
            a3Var.I();
            a3Var.L();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void m(int i7) {
        this.d.A(i7, true);
    }

    @Override // org.telegram.ui.web.d0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        a3 a3Var = this.d;
        r2 r2Var = a3Var.x;
        z2 z2Var = a3Var.f;
        org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) a3Var.l0).M().getLastFragment();
        kl0 kl0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.g0.v1(z2Var);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, a3Var.getContext(), null);
            u1Var.r(150L);
            ea.y(a3Var.H, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new r4(u1Var, 1), new ai.f1(19, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            qp.s1(a3Var.H).Y3(paymentForm.users, false);
            kl0Var = new kl0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            kl0Var = new kl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (kl0Var != null) {
            r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
            org.telegram.messenger.g0.v1(z2Var);
            mb0 mb0Var = new mb0(this.b);
            mb0Var.show();
            kl0Var.Z0 = new a3.h((Object) this, (Object) mb0Var, str, 12);
            kl0Var.Y0 = this.c;
            mb0Var.c(kl0Var);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void p(boolean z9) {
        this.d.t(z9);
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z9, boolean z10, String str, long j3, int i7, int i10, boolean z11, boolean z12) {
        a3 a3Var = this.d;
        w2 w2Var = a3Var.m0;
        s sVar = new s();
        sVar.a = z9;
        sVar.b = z10;
        sVar.c = z11;
        sVar.d = z12;
        sVar.e = str;
        sVar.f = j3;
        sVar.g = i7;
        sVar.h = i10;
        sVar.i = null;
        int totalHeight = w2Var.getTotalHeight();
        w2Var.e.c = sVar;
        r[] rVarArr = w2Var.f;
        rVarArr[0].l.a();
        if (sVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) sVar.e);
            spannableStringBuilder.setSpan(new q5(sVar.f, 1.4f, rVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            rVarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            rVarArr[0].l.t(sVar.e, true, true);
        }
        w2Var.invalidate();
        if (totalHeight != w2Var.getTotalHeight() && w2Var.r != null) {
            if (totalHeight < w2Var.getTotalHeight()) {
                org.telegram.messenger.g0.i3(w2Var.r, 200L);
            } else {
                w2Var.r.run();
            }
        }
        if (a3Var.e0) {
            a3Var.I();
            a3Var.L();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void r(int i7) {
        this.d.D(i7, true);
    }

    @Override // org.telegram.ui.web.d0
    public final void s() {
        r2 r2Var = this.d.x;
        if (r2Var.c) {
            return;
        }
        r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.d0
    public final void t(boolean z9) {
        this.d.c0 = z9;
    }

    @Override // org.telegram.ui.web.d0
    public final void u(int i7, int i10, boolean z9) {
        a3 a3Var = this.d;
        a3Var.v0 = i7;
        a3Var.y(i10, z9, true);
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        a3 a3Var = this.d;
        if (isEmpty) {
            Activity activity = a3Var.l0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.f2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof cn) {
                    ((cn) lastFragment).Z.setFieldText("@" + t10.n(user) + " " + str);
                    a3Var.o(false);
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
        zw zwVar = new zw(bundle);
        org.telegram.messenger.g0.v1(a3Var.f);
        mb0 mb0Var = new mb0(this.b);
        zwVar.D2 = new a1.d(this, user, str, mb0Var, 5);
        mb0Var.show();
        mb0Var.c(zwVar);
    }

    @Override // org.telegram.ui.web.d0
    public final void w(boolean z9) {
        a3 a3Var = this.d;
        h6 h6Var = a3Var.F;
        FrameLayout frameLayout = a3Var.q0;
        TLRPC.User a22 = qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I));
        int i7 = 1;
        if (z9) {
            m4.d0 d0Var = new m4.d0();
            id.M0(2131743885, null);
            d0Var.a = new t2(this, i7);
            bc V = new gc(frameLayout, h6Var).V(Arrays.asList(a22), org.telegram.messenger.g0.X2(id.a0(null, null, 2131753054, t10.p(a22))), null, d0Var);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        k5.q(null, null, 2131753056, new Object[]{t10.p(a22)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(id.M0(2131753055, null), new t2(this, 2)), true));
        bc P = new gc(frameLayout, h6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void x(int i7) {
        r(i7);
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z9) {
        r2 r2Var = this.d.x;
        if (r2Var != null) {
            r2Var.setAllowSwipes(z9);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        this.d.o(false);
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void o(int i7, boolean z9) {
    }
}
