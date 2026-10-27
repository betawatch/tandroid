package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl0 implements Runnable {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ String F;
    public final /* synthetic */ org.telegram.ui.web.a1 G;
    public final /* synthetic */ fi.d a;
    public final /* synthetic */ fi.d b;
    public final /* synthetic */ TLRPC.TL_urlAuthResultRequest c;
    public final /* synthetic */ TL_wallet.inputTonConnectOauthSession[] d;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth e;
    public final /* synthetic */ String[] f;
    public final /* synthetic */ org.telegram.ui.Cells.a9 h;
    public final /* synthetic */ boolean[] n;
    public final /* synthetic */ boolean[] r;
    public final /* synthetic */ int[] s;
    public final /* synthetic */ boolean[] v;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 y;

    public /* synthetic */ cl0(fi.d dVar, fi.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.a9 a9Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.k3 k3Var, String str, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, String str2, org.telegram.ui.web.a1 a1Var) {
        this.a = dVar;
        this.b = dVar2;
        this.c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f = strArr;
        this.h = a9Var;
        this.n = zArr;
        this.r = zArr2;
        this.s = iArr;
        this.v = zArr3;
        this.w = k3Var;
        this.x = str;
        this.y = u6Var;
        this.E = z10;
        this.F = str2;
        this.G = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final fi.d dVar = this.a;
        if (dVar.Q || this.b.Q) {
            return;
        }
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.c;
        boolean z10 = tL_urlAuthResultRequest.request_wallet;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
        if (z10 && inputtonconnectoauthsessionArr[0] == null) {
            return;
        }
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.e;
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 2)) {
            tL_messages_acceptUrlAuth.flags |= 2;
            tL_messages_acceptUrlAuth.peer = tL_messages_requestUrlAuth.peer;
            tL_messages_acceptUrlAuth.msg_id = tL_messages_requestUrlAuth.msg_id;
            tL_messages_acceptUrlAuth.button_id = tL_messages_requestUrlAuth.button_id;
        }
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 4)) {
            tL_messages_acceptUrlAuth.flags |= 4;
            tL_messages_acceptUrlAuth.url = tL_messages_requestUrlAuth.url;
        }
        String str = this.f[0];
        if (str != null) {
            tL_messages_acceptUrlAuth.match_code = str;
        }
        org.telegram.ui.Cells.a9 a9Var = this.h;
        tL_messages_acceptUrlAuth.write_allowed = a9Var != null && a9Var.e.h;
        tL_messages_acceptUrlAuth.share_phone_number = this.n[0];
        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
        tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
        inputtonconnectoauthsessionArr[0] = null;
        if (this.r[0]) {
            if (inputtonconnectoauthsession != null) {
                Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                return;
            }
            return;
        }
        final int[] iArr = this.s;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final boolean[] zArr = this.v;
        final org.telegram.ui.ActionBar.k3 k3Var = this.w;
        final String str2 = this.x;
        final org.telegram.ui.ActionBar.u6 u6Var = this.y;
        final boolean z11 = this.E;
        final String str3 = this.F;
        final org.telegram.ui.web.a1 a1Var = this.G;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, aVar, new Utilities.Callback2() { // from class: org.telegram.ui.zk0
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                fi.d.this.setLoading(false);
                TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                if (inputtonconnectoauthsession2 != null) {
                    Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                }
                zArr[0] = true;
                k3Var.dismiss();
                if (tL_error == null) {
                    fl0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, a1Var);
                    return;
                }
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    fl0.a().g0(tL_error, false);
                    return;
                }
                org.telegram.ui.Components.wc a2 = fl0.a();
                int i10 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                String str4 = str2;
                a2.M(string, TextUtils.isEmpty(str4) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var)), i10).j();
            }
        });
    }
}
