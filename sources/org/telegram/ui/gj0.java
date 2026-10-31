package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj0 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ vh.d b;
    public final /* synthetic */ vh.d c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ org.telegram.ui.web.z0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 m;

    public /* synthetic */ gj0(int[] iArr, vh.d dVar, vh.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.z2 z2Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.z0 z0Var, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = iArr;
        this.b = dVar;
        this.c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = z2Var;
        this.f = z10;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z11;
        this.k = z0Var;
        this.l = str2;
        this.m = p6Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int[] iArr = this.a;
        vh.d dVar = this.b;
        vh.d dVar2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.z2 z2Var = this.e;
        final boolean z10 = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z11 = this.j;
        final org.telegram.ui.web.z0 z0Var = this.k;
        final String str2 = this.l;
        final org.telegram.ui.ActionBar.p6 p6Var = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] == num.intValue() || dVar.Q || dVar2.Q) {
            return;
        }
        final org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, org.telegram.messenger.w0.b, null);
        x1Var.r(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new a3.b(1), new org.telegram.messenger.j20() { // from class: org.telegram.ui.dj0
            @Override // org.telegram.messenger.j20
            public final void a(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.x1.this.dismiss();
                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                if (urlAuthResult2 != null) {
                    z2Var2.dismiss();
                    jj0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, z0Var);
                } else if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Cells.f1.s(z2Var2.E, z2Var2.I0, tL_error, false);
                        return;
                    }
                    z2Var2.dismiss();
                    org.telegram.ui.Components.cc a2 = jj0.a();
                    String L0 = org.telegram.messenger.cd.L0(2131753128, null);
                    String str3 = str2;
                    a2.I(R.raw.error, L0, TextUtils.isEmpty(str3) ? org.telegram.messenger.cd.L0(2131753129, null) : org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var), org.telegram.messenger.cd.a0(null, null, 2131753130, str3))).j();
                }
            }
        });
    }
}
