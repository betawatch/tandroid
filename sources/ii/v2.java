package ii;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.e9;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dl0;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v2 implements org.telegram.ui.web.d0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e6 c;
    public final /* synthetic */ a3 d;

    public v2(a3 a3Var, Context context, e6 e6Var) {
        this.d = a3Var;
        this.b = context;
        this.c = e6Var;
    }

    @Override // org.telegram.ui.web.d0
    public final w0 A() {
        a3 a3Var = this.d;
        if (a3Var.D0 == null) {
            w0 w0Var = new w0(this.b);
            a3Var.D0 = w0Var;
            w0Var.k = a3Var.E.getWebView();
        }
        return a3Var.D0;
    }

    @Override // org.telegram.ui.web.d0
    public final void a() {
        a3 a3Var = this.d;
        TLRPC.User a22 = hp.s1(a3Var.I).a2(Long.valueOf(a3Var.J));
        m2.t tVar = new m2.t(12, false);
        tVar.b = new t2(this, 0);
        ac V = new fc(a3Var.r0, a3Var.G).V(Arrays.asList(a22), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753087, l10.p(a22))), null, tVar);
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
        if (a3Var.F0 != null) {
            org.telegram.ui.ActionBar.b3 O = LaunchActivity.K1.O();
            if (O != null) {
                O.e(a3Var.F0);
            }
            a3Var.F0 = null;
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void d(TLRPC.Document document) {
        a3 a3Var = this.d;
        new fc(a3Var.r0, a3Var.G).q(document, bd.M0(2131753075, null)).k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void e(String str) {
        a3 a3Var = this.d;
        if (a3Var.q() || a3Var.L != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = hp.s1(a3Var.I).o1(a3Var.J);
        tL_messages_sendWebViewData.random_id = Utilities.b.nextLong();
        tL_messages_sendWebViewData.button_text = a3Var.O;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(a3Var.I).sendRequest(tL_messages_sendWebViewData, new u2(this, 0));
    }

    @Override // org.telegram.ui.web.d0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        a3 a3Var = this.d;
        new fc(a3Var.r0, a3Var.G).Q(R.raw.forward, 36, org.telegram.messenger.g0.X2(size == 1 ? bd.a0(null, null, 2131752973, hp.s1(a3Var.I).B1(((Long) arrayList.get(0)).longValue(), false)) : bd.G(arrayList.size(), "BotSharedToMany", new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final String g(boolean z10, boolean z11) {
        a3 a3Var = this.d;
        boolean z12 = a3Var.f0;
        if (z12 != z10) {
            a3Var.C(z10, true, z11);
            return null;
        }
        if (z12) {
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
        return li.b0(a3Var.I).j(a3Var.J) || hp.s1(a3Var.I).W6.contains(Long.valueOf(a3Var.J));
    }

    @Override // org.telegram.ui.web.d0
    public final void i(boolean z10) {
        a3 a3Var = this.d;
        ImageView backButton = a3Var.Y.getBackButton();
        a3Var.y0 = z10;
        org.telegram.messenger.g0.R3(backButton, z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        org.telegram.messenger.h2 h2Var = a3Var.o0;
        if (h2Var != null) {
            h2Var.L = z10;
            h2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void j() {
        z();
    }

    @Override // org.telegram.ui.web.d0
    public final void k(boolean z10) {
        this.d.t0 = z10;
    }

    @Override // org.telegram.ui.web.d0
    public final void l(boolean z10, boolean z11, String str, long j10, int i3, int i10, boolean z12, boolean z13, String str2) {
        a3 a3Var = this.d;
        w2 w2Var = a3Var.n0;
        u uVar = new u();
        uVar.a = z10;
        uVar.b = z11;
        uVar.c = z12;
        uVar.d = z13;
        uVar.e = str;
        uVar.f = j10;
        uVar.g = i3;
        uVar.h = i10;
        uVar.i = str2;
        int totalHeight = w2Var.getTotalHeight();
        w2Var.e.d = uVar;
        v.b(w2Var.f[1].l, uVar, true);
        w2Var.invalidate();
        if (totalHeight != w2Var.getTotalHeight() && w2Var.r != null) {
            if (totalHeight < w2Var.getTotalHeight()) {
                org.telegram.messenger.g0.i3(w2Var.r, 200L);
            } else {
                w2Var.r.run();
            }
        }
        if (a3Var.f0) {
            a3Var.I();
            a3Var.L();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void m(int i3) {
        this.d.A(i3, true);
    }

    @Override // org.telegram.ui.web.d0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        a3 a3Var = this.d;
        r2 r2Var = a3Var.x;
        z2 z2Var = a3Var.f;
        org.telegram.ui.ActionBar.d2 lastFragment = ((LaunchActivity) a3Var.m0).M().getLastFragment();
        dl0 dl0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.g0.v1(z2Var);
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, a3Var.getContext(), null);
            s1Var.r(150L);
            e9.y(a3Var.I, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new ci.b4(s1Var, 1), new ai.o1(23, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            hp.s1(a3Var.I).Y3(paymentForm.users, false);
            dl0Var = new dl0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            dl0Var = new dl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (dl0Var != null) {
            r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
            org.telegram.messenger.g0.v1(z2Var);
            hb0 hb0Var = new hb0(this.b);
            hb0Var.show();
            dl0Var.a1 = new aa.a(this, hb0Var, str, 9);
            dl0Var.Z0 = this.c;
            hb0Var.c(dl0Var);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void p(boolean z10) {
        this.d.t(z10);
    }

    @Override // org.telegram.ui.web.d0
    public final void q(boolean z10, boolean z11, String str, long j10, int i3, int i10, boolean z12, boolean z13) {
        a3 a3Var = this.d;
        w2 w2Var = a3Var.n0;
        u uVar = new u();
        uVar.a = z10;
        uVar.b = z11;
        uVar.c = z12;
        uVar.d = z13;
        uVar.e = str;
        uVar.f = j10;
        uVar.g = i3;
        uVar.h = i10;
        uVar.i = null;
        int totalHeight = w2Var.getTotalHeight();
        w2Var.e.c = uVar;
        t[] tVarArr = w2Var.f;
        tVarArr[0].l.a();
        if (uVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) uVar.e);
            spannableStringBuilder.setSpan(new p5(uVar.f, 1.4f, tVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            tVarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            tVarArr[0].l.t(uVar.e, true, true);
        }
        w2Var.invalidate();
        if (totalHeight != w2Var.getTotalHeight() && w2Var.r != null) {
            if (totalHeight < w2Var.getTotalHeight()) {
                org.telegram.messenger.g0.i3(w2Var.r, 200L);
            } else {
                w2Var.r.run();
            }
        }
        if (a3Var.f0) {
            a3Var.I();
            a3Var.L();
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void r(int i3) {
        this.d.D(i3, true);
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
    public final void t(boolean z10) {
        this.d.d0 = z10;
    }

    @Override // org.telegram.ui.web.d0
    public final void u(int i3, int i10, boolean z10) {
        a3 a3Var = this.d;
        a3Var.w0 = i3;
        a3Var.y(i10, z10, true);
    }

    @Override // org.telegram.ui.web.d0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        a3 a3Var = this.d;
        if (isEmpty) {
            Activity activity = a3Var.m0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.d2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof wm) {
                    ((wm) lastFragment).a0.setFieldText("@" + l10.n(user) + " " + str);
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
        uw uwVar = new uw(bundle);
        org.telegram.messenger.g0.v1(a3Var.f);
        hb0 hb0Var = new hb0(this.b);
        uwVar.D2 = new a1.d(this, user, str, hb0Var, 4);
        hb0Var.show();
        hb0Var.c(uwVar);
    }

    @Override // org.telegram.ui.web.d0
    public final void w(boolean z10) {
        a3 a3Var = this.d;
        e6 e6Var = a3Var.G;
        FrameLayout frameLayout = a3Var.r0;
        TLRPC.User a22 = hp.s1(a3Var.I).a2(Long.valueOf(a3Var.J));
        int i3 = 1;
        if (z10) {
            m2.t tVar = new m2.t(12, false);
            bd.M0(2131743895, null);
            tVar.b = new t2(this, i3);
            ac V = new fc(frameLayout, e6Var).V(Arrays.asList(a22), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753054, l10.p(a22))), null, tVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        k5.q(null, null, 2131753056, new Object[]{l10.p(a22)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(bd.M0(2131753055, null), new t2(this, 2)), true));
        ac P = new fc(frameLayout, e6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.d0
    public final void x(int i3) {
        r(i3);
    }

    @Override // org.telegram.ui.web.d0
    public final void y(boolean z10) {
        r2 r2Var = this.d.x;
        if (r2Var != null) {
            r2Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.d0
    public final void z() {
        this.d.o(false);
    }

    @Override // org.telegram.ui.web.d0
    public final /* synthetic */ void o(int i3, boolean z10) {
    }
}
