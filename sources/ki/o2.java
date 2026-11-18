package ki;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import di.x8;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.ml0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class o2 implements org.telegram.ui.web.c0 {
    public boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ i6 c;
    public final /* synthetic */ t2 d;

    public o2(t2 t2Var, Context context, i6 i6Var) {
        this.d = t2Var;
        this.b = context;
        this.c = i6Var;
    }

    @Override // org.telegram.ui.web.c0
    public final w0 A() {
        t2 t2Var = this.d;
        if (t2Var.D0 == null) {
            w0 w0Var = new w0(this.b);
            t2Var.D0 = w0Var;
            w0Var.k = t2Var.E.getWebView();
        }
        return t2Var.D0;
    }

    @Override // org.telegram.ui.web.c0
    public final void a() {
        t2 t2Var = this.d;
        TLRPC.User c22 = mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
        k8.a aVar = new k8.a(15, false);
        aVar.b = new m2(this, 0);
        gc V = new lc(t2Var.r0, t2Var.G).V(Arrays.asList(c22), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753085, o10.q(c22))), null, aVar);
        V.j = 5000;
        V.k(true);
    }

    @Override // org.telegram.ui.web.c0
    public final void b() {
        this.d.o(true);
    }

    @Override // org.telegram.ui.web.c0
    public final void c() {
        t2 t2Var = this.d;
        if (t2Var.F0 != null) {
            org.telegram.ui.ActionBar.g3 N = LaunchActivity.H1.N();
            if (N != null) {
                N.e(t2Var.F0);
            }
            t2Var.F0 = null;
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void d(TLRPC.Document document) {
        t2 t2Var = this.d;
        new lc(t2Var.r0, t2Var.G).q(document, gd.M0(2131753073, null)).k(true);
    }

    @Override // org.telegram.ui.web.c0
    public final void e(String str) {
        t2 t2Var = this.d;
        if (t2Var.q() || t2Var.L != 0 || this.a) {
            return;
        }
        this.a = true;
        TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
        tL_messages_sendWebViewData.bot = mp.u1(t2Var.I).q1(t2Var.J);
        tL_messages_sendWebViewData.random_id = Utilities.b.nextLong();
        tL_messages_sendWebViewData.button_text = t2Var.O;
        tL_messages_sendWebViewData.data = str;
        ConnectionsManager.getInstance(t2Var.I).sendRequest(tL_messages_sendWebViewData, new n2(this, 0));
    }

    @Override // org.telegram.ui.web.c0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        t2 t2Var = this.d;
        new lc(t2Var.r0, t2Var.G).Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(size == 1 ? gd.a0(null, null, 2131752962, mp.u1(t2Var.I).D1(((Long) arrayList.get(0)).longValue(), false)) : gd.G(arrayList.size(), "BotSharedToMany", new Object[0]))).k(true);
    }

    @Override // org.telegram.ui.web.c0
    public final String g(boolean z10, boolean z11) {
        t2 t2Var = this.d;
        boolean z12 = t2Var.f0;
        if (z12 != z10) {
            t2Var.C(z10, true, z11);
            return null;
        }
        if (z12) {
            return "ALREADY_FULLSCREEN";
        }
        return null;
    }

    @Override // org.telegram.ui.web.c0
    public final boolean h() {
        t2 t2Var = this.d;
        if (t2Var.q()) {
            return false;
        }
        return ri.d0(t2Var.I).l(t2Var.J) || mp.u1(t2Var.I).Z6.contains(Long.valueOf(t2Var.J));
    }

    @Override // org.telegram.ui.web.c0
    public final void i(boolean z10) {
        t2 t2Var = this.d;
        ImageView backButton = t2Var.Y.getBackButton();
        t2Var.y0 = z10;
        org.telegram.messenger.g0.P3(backButton, z10 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        org.telegram.messenger.h2 h2Var = t2Var.o0;
        if (h2Var != null) {
            h2Var.L = z10;
            h2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void j() {
        z();
    }

    @Override // org.telegram.ui.web.c0
    public final void k(boolean z10) {
        this.d.t0 = z10;
    }

    @Override // org.telegram.ui.web.c0
    public final void l(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13, String str2) {
        t2 t2Var = this.d;
        p2 p2Var = t2Var.n0;
        t tVar = new t();
        tVar.a = z10;
        tVar.b = z11;
        tVar.c = z12;
        tVar.d = z13;
        tVar.e = str;
        tVar.f = j3;
        tVar.g = i7;
        tVar.h = i10;
        tVar.i = str2;
        int totalHeight = p2Var.getTotalHeight();
        p2Var.e.d = tVar;
        u.b(p2Var.f[1].l, tVar, true);
        p2Var.invalidate();
        if (totalHeight != p2Var.getTotalHeight() && p2Var.r != null) {
            if (totalHeight < p2Var.getTotalHeight()) {
                org.telegram.messenger.g0.h3(p2Var.r, 200L);
            } else {
                p2Var.r.run();
            }
        }
        if (t2Var.f0) {
            t2Var.I();
            t2Var.L();
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void m(int i7) {
        this.d.A(i7, true);
    }

    @Override // org.telegram.ui.web.c0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        t2 t2Var = this.d;
        k2 k2Var = t2Var.x;
        s2 s2Var = t2Var.f;
        org.telegram.ui.ActionBar.h2 lastFragment = ((LaunchActivity) t2Var.m0).M().getLastFragment();
        ml0 ml0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.g0.v1(s2Var);
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, t2Var.getContext(), null);
            u1Var.r(150L);
            x8.y(t2Var.I, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new di.u3(u1Var, 1), new ai.v1(29, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            mp.u1(t2Var.I).f4(paymentForm.users, false);
            ml0Var = new ml0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ml0Var = new ml0((TLRPC.PaymentReceipt) tLObject);
        }
        if (ml0Var != null) {
            k2Var.e(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()));
            org.telegram.messenger.g0.v1(s2Var);
            yb0 yb0Var = new yb0(this.b);
            yb0Var.show();
            ml0Var.a1 = new a3.h((Object) this, (Object) yb0Var, str, 14);
            ml0Var.Z0 = this.c;
            yb0Var.d(ml0Var);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void p(boolean z10) {
        this.d.t(z10);
    }

    @Override // org.telegram.ui.web.c0
    public final void q(boolean z10, boolean z11, String str, long j3, int i7, int i10, boolean z12, boolean z13) {
        t2 t2Var = this.d;
        p2 p2Var = t2Var.n0;
        t tVar = new t();
        tVar.a = z10;
        tVar.b = z11;
        tVar.c = z12;
        tVar.d = z13;
        tVar.e = str;
        tVar.f = j3;
        tVar.g = i7;
        tVar.h = i10;
        tVar.i = null;
        int totalHeight = p2Var.getTotalHeight();
        p2Var.e.c = tVar;
        s[] sVarArr = p2Var.f;
        sVarArr[0].l.a();
        if (tVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) tVar.e);
            spannableStringBuilder.setSpan(new x5(tVar.f, 1.4f, sVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            sVarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            sVarArr[0].l.t(tVar.e, true, true);
        }
        p2Var.invalidate();
        if (totalHeight != p2Var.getTotalHeight() && p2Var.r != null) {
            if (totalHeight < p2Var.getTotalHeight()) {
                org.telegram.messenger.g0.h3(p2Var.r, 200L);
            } else {
                p2Var.r.run();
            }
        }
        if (t2Var.f0) {
            t2Var.I();
            t2Var.L();
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void r(int i7) {
        this.d.D(i7, true);
    }

    @Override // org.telegram.ui.web.c0
    public final void s() {
        k2 k2Var = this.d.x;
        if (k2Var.c) {
            return;
        }
        k2Var.e(k2Var.getTopActionBarOffsetY() + (-k2Var.getOffsetY()));
    }

    @Override // org.telegram.ui.web.c0
    public final void t(boolean z10) {
        this.d.d0 = z10;
    }

    @Override // org.telegram.ui.web.c0
    public final void u(int i7, int i10, boolean z10) {
        t2 t2Var = this.d;
        t2Var.w0 = i7;
        t2Var.y(i10, z10, true);
    }

    @Override // org.telegram.ui.web.c0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        t2 t2Var = this.d;
        if (isEmpty) {
            Activity activity = t2Var.m0;
            if (activity instanceof LaunchActivity) {
                org.telegram.ui.ActionBar.h2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof bn) {
                    ((bn) lastFragment).a0.setFieldText("@" + o10.o(user) + " " + str);
                    t2Var.o(false);
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
        cx cxVar = new cx(bundle);
        org.telegram.messenger.g0.v1(t2Var.f);
        yb0 yb0Var = new yb0(this.b);
        cxVar.E2 = new a1.d(this, user, str, yb0Var, 5);
        yb0Var.show();
        yb0Var.d(cxVar);
    }

    @Override // org.telegram.ui.web.c0
    public final void w(boolean z10) {
        t2 t2Var = this.d;
        i6 i6Var = t2Var.G;
        FrameLayout frameLayout = t2Var.r0;
        TLRPC.User c22 = mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
        int i7 = 1;
        if (z10) {
            k8.a aVar = new k8.a(15, false);
            gd.M0(2131743648, null);
            aVar.b = new m2(this, i7);
            gc V = new lc(frameLayout, i6Var).V(Arrays.asList(c22), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753043, o10.q(c22))), null, aVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        org.telegram.messenger.f3.p(null, null, 2131753045, new Object[]{o10.q(c22)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(gd.M0(2131753044, null), new m2(this, 2)), true));
        gc P = new lc(frameLayout, i6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.c0
    public final void x(int i7) {
        r(i7);
    }

    @Override // org.telegram.ui.web.c0
    public final void y(boolean z10) {
        k2 k2Var = this.d.x;
        if (k2Var != null) {
            k2Var.setAllowSwipes(z10);
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void z() {
        this.d.o(false);
    }

    @Override // org.telegram.ui.web.c0
    public final /* synthetic */ void o(int i7, boolean z10) {
    }
}
