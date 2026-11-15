package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements org.telegram.messenger.z10 {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ hi.d b;
    public final /* synthetic */ hi.d c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ org.telegram.ui.web.v0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 m;

    public /* synthetic */ ai0(int[] iArr, hi.d dVar, hi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.u2 u2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.v0 v0Var, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = iArr;
        this.b = dVar;
        this.c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = u2Var;
        this.f = z10;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z11;
        this.k = v0Var;
        this.l = str2;
        this.m = e6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        int[] iArr = this.a;
        hi.d dVar = this.b;
        hi.d dVar2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.u2 u2Var = this.e;
        final boolean z10 = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z11 = this.j;
        final org.telegram.ui.web.v0 v0Var = this.k;
        final String str2 = this.l;
        final org.telegram.ui.ActionBar.e6 e6Var = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] == num.intValue() || dVar.R || dVar2.R) {
            return;
        }
        final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.b, null);
        t1Var.r(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.s10() { // from class: org.telegram.ui.xh0
            @Override // org.telegram.messenger.s10
            public final void a(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.t1.this.dismiss();
                org.telegram.ui.ActionBar.u2 u2Var2 = u2Var;
                if (urlAuthResult2 != null) {
                    u2Var2.dismiss();
                    di0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, v0Var);
                } else if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Cells.y0.q(u2Var2.F, u2Var2.J0, tL_error, false);
                        return;
                    }
                    u2Var2.dismiss();
                    org.telegram.ui.Components.cc a10 = di0.a();
                    String M0 = org.telegram.messenger.hd.M0(2131753128, null);
                    String str3 = str2;
                    a10.I(R.raw.error, M0, TextUtils.isEmpty(str3) ? org.telegram.messenger.hd.M0(2131753129, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var), org.telegram.messenger.hd.a0(null, null, 2131753130, str3))).j();
                }
            }
        });
    }
}
