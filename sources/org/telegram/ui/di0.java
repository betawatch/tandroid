package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class di0 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ hi.d b;
    public final /* synthetic */ hi.d c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ org.telegram.ui.web.v0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 m;

    public /* synthetic */ di0(int[] iArr, hi.d dVar, hi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.x2 x2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.v0 v0Var, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.a = iArr;
        this.b = dVar;
        this.c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = x2Var;
        this.f = z10;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z11;
        this.k = v0Var;
        this.l = str2;
        this.m = i6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int[] iArr = this.a;
        hi.d dVar = this.b;
        hi.d dVar2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.x2 x2Var = this.e;
        final boolean z10 = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z11 = this.j;
        final org.telegram.ui.web.v0 v0Var = this.k;
        final String str2 = this.l;
        final org.telegram.ui.ActionBar.i6 i6Var = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] == num.intValue() || dVar.R || dVar2.R) {
            return;
        }
        final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, org.telegram.messenger.t0.b, null);
        u1Var.r(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(1), new org.telegram.messenger.q10() { // from class: org.telegram.ui.ai0
            @Override // org.telegram.messenger.q10
            public final void a(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.u1.this.dismiss();
                org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                if (urlAuthResult2 != null) {
                    x2Var2.dismiss();
                    gi0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, v0Var);
                } else if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Cells.c0.t(x2Var2.F, x2Var2.J0, tL_error, false);
                        return;
                    }
                    x2Var2.dismiss();
                    org.telegram.ui.Components.lc a10 = gi0.a();
                    String M0 = org.telegram.messenger.gd.M0(2131753126, null);
                    String str3 = str2;
                    a10.I(R.raw.error, M0, TextUtils.isEmpty(str3) ? org.telegram.messenger.gd.M0(2131753127, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), org.telegram.messenger.gd.a0(null, null, 2131753128, str3))).j();
                }
            }
        });
    }
}
