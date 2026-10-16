package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements Utilities.Callback {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ di.d b;
    public final /* synthetic */ di.d c;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e3 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ TLRPC.UrlAuthResult h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ org.telegram.ui.web.c1 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 m;

    public /* synthetic */ ml0(int[] iArr, di.d dVar, di.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.c1 c1Var, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = iArr;
        this.b = dVar;
        this.c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = e3Var;
        this.f = z10;
        this.g = str;
        this.h = urlAuthResult;
        this.i = strArr;
        this.j = z11;
        this.k = c1Var;
        this.l = str2;
        this.m = c6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int[] iArr = this.a;
        di.d dVar = this.b;
        di.d dVar2 = this.c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.e3 e3Var = this.e;
        final boolean z10 = this.f;
        final String str = this.g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.i;
        final boolean z11 = this.j;
        final org.telegram.ui.web.c1 c1Var = this.k;
        final String str2 = this.l;
        final org.telegram.ui.ActionBar.c6 c6Var = this.m;
        final Integer num = (Integer) obj;
        if (iArr[0] == num.intValue() || dVar.N || dVar2.N) {
            return;
        }
        final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ApplicationLoader.applicationContext, 3, null);
        a2Var.q(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.jl0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj2, Object obj3) {
                TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.a2.this.dismiss();
                org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                if (urlAuthResult2 != null) {
                    e3Var2.dismiss();
                    ql0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, c1Var);
                    return;
                }
                if (tL_error != null) {
                    if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Cells.c1.p(e3Var2.topBulletinContainer, e3Var2.getResourcesProvider(), tL_error, false);
                        return;
                    }
                    e3Var2.dismiss();
                    org.telegram.ui.Components.zc a2 = ql0.a();
                    int i10 = R.raw.error;
                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                    String str3 = str2;
                    a2.M(string, TextUtils.isEmpty(str3) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var)), i10).j();
                }
            }
        });
    }
}
