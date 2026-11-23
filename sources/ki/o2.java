package ki;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import di.y8;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.kl0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final v0 A() {
        t2 t2Var = this.d;
        if (t2Var.D0 == null) {
            v0 v0Var = new v0(this.b);
            t2Var.D0 = v0Var;
            v0Var.k = t2Var.E.getWebView();
        }
        return t2Var.D0;
    }

    @Override // org.telegram.ui.web.c0
    public final void a() {
        t2 t2Var = this.d;
        TLRPC.User c22 = mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
        jb.m mVar = new jb.m(16, false);
        mVar.b = new l2(this, 0);
        fc V = new kc(t2Var.r0, t2Var.G).V(Arrays.asList(c22), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753084, n10.q(c22))), null, mVar);
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
            org.telegram.ui.ActionBar.f3 N = LaunchActivity.H1.N();
            if (N != null) {
                N.e(t2Var.F0);
            }
            t2Var.F0 = null;
        }
    }

    @Override // org.telegram.ui.web.c0
    public final void d(TLRPC.Document document) {
        t2 t2Var = this.d;
        new kc(t2Var.r0, t2Var.G).q(document, gd.N0(2131753072, null)).k(true);
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
        ConnectionsManager.getInstance(t2Var.I).sendRequest(tL_messages_sendWebViewData, new m2(this, 0));
    }

    @Override // org.telegram.ui.web.c0
    public final void f(ArrayList arrayList) {
        int size = arrayList.size();
        t2 t2Var = this.d;
        new kc(t2Var.r0, t2Var.G).Q(R.raw.forward, 36, org.telegram.messenger.g0.W2(size == 1 ? gd.a0(null, null, 2131752961, mp.u1(t2Var.I).D1(((Long) arrayList.get(0)).longValue(), false)) : gd.G(arrayList.size(), "BotSharedToMany", new Object[0]))).k(true);
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
        s sVar = new s();
        sVar.a = z10;
        sVar.b = z11;
        sVar.c = z12;
        sVar.d = z13;
        sVar.e = str;
        sVar.f = j3;
        sVar.g = i7;
        sVar.h = i10;
        sVar.i = str2;
        int totalHeight = p2Var.getTotalHeight();
        p2Var.e.d = sVar;
        t.b(p2Var.f[1].l, sVar, true);
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
        j2 j2Var = t2Var.x;
        s2 s2Var = t2Var.f;
        org.telegram.ui.ActionBar.g2 lastFragment = ((LaunchActivity) t2Var.m0).M().getLastFragment();
        kl0 kl0Var = null;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            org.telegram.messenger.g0.v1(s2Var);
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, t2Var.getContext(), null);
            t1Var.r(150L);
            y8.y(t2Var.I, false).W(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new di.u3(t1Var, 1), new n2(0, this, str));
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            mp.u1(t2Var.I).f4(paymentForm.users, false);
            kl0Var = new kl0(paymentForm, null, str, lastFragment);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            kl0Var = new kl0((TLRPC.PaymentReceipt) tLObject);
        }
        if (kl0Var != null) {
            j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
            org.telegram.messenger.g0.v1(s2Var);
            wb0 wb0Var = new wb0(this.b);
            wb0Var.show();
            kl0Var.a1 = new a3.h((Object) this, (Object) wb0Var, str, 14);
            kl0Var.Z0 = this.c;
            wb0Var.d(kl0Var);
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
        s sVar = new s();
        sVar.a = z10;
        sVar.b = z11;
        sVar.c = z12;
        sVar.d = z13;
        sVar.e = str;
        sVar.f = j3;
        sVar.g = i7;
        sVar.h = i10;
        sVar.i = null;
        int totalHeight = p2Var.getTotalHeight();
        p2Var.e.c = sVar;
        r[] rVarArr = p2Var.f;
        rVarArr[0].l.a();
        if (sVar.f != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.append((CharSequence) sVar.e);
            spannableStringBuilder.setSpan(new x5(sVar.f, 1.4f, rVarArr[0].l.a.getFontMetricsInt()), 0, 1, 33);
            rVarArr[0].l.t(spannableStringBuilder, true, true);
        } else {
            rVarArr[0].l.t(sVar.e, true, true);
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
        j2 j2Var = this.d.x;
        if (j2Var.c) {
            return;
        }
        j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
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
                org.telegram.ui.ActionBar.g2 lastFragment = ((LaunchActivity) activity).M().getLastFragment();
                if (lastFragment instanceof bn) {
                    ((bn) lastFragment).a0.setFieldText("@" + n10.o(user) + " " + str);
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
        bx bxVar = new bx(bundle);
        org.telegram.messenger.g0.v1(t2Var.f);
        wb0 wb0Var = new wb0(this.b);
        bxVar.E2 = new a1.d(this, user, str, wb0Var, 5);
        wb0Var.show();
        wb0Var.d(bxVar);
    }

    @Override // org.telegram.ui.web.c0
    public final void w(boolean z10) {
        t2 t2Var = this.d;
        i6 i6Var = t2Var.G;
        FrameLayout frameLayout = t2Var.r0;
        TLRPC.User c22 = mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J));
        int i7 = 1;
        if (z10) {
            jb.m mVar = new jb.m(16, false);
            gd.N0(2131743638, null);
            mVar.b = new l2(this, i7);
            fc V = new kc(frameLayout, i6Var).V(Arrays.asList(c22), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753042, n10.q(c22))), null, mVar);
            V.j = 5000;
            V.k(true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        org.telegram.messenger.f3.p(null, null, 2131753044, new Object[]{n10.q(c22)}, spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.H2(org.telegram.messenger.g0.k2(gd.N0(2131753043, null), new l2(this, 2)), true));
        fc P = new kc(frameLayout, i6Var).P(R.raw.error, spannableStringBuilder);
        P.j = 5000;
        P.k(true);
    }

    @Override // org.telegram.ui.web.c0
    public final void x(int i7) {
        r(i7);
    }

    @Override // org.telegram.ui.web.c0
    public final void y(boolean z10) {
        j2 j2Var = this.d.x;
        if (j2Var != null) {
            j2Var.setAllowSwipes(z10);
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
