package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei0 implements Runnable {
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ org.telegram.ui.web.v0 H;
    public final /* synthetic */ hi.e a;
    public final /* synthetic */ hi.e b;
    public final /* synthetic */ TLRPC.TL_urlAuthResultRequest c;
    public final /* synthetic */ TL_wallet.inputTonConnectOauthSession[] d;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth e;
    public final /* synthetic */ String[] f;
    public final /* synthetic */ org.telegram.ui.Cells.s8 h;
    public final /* synthetic */ boolean[] n;
    public final /* synthetic */ boolean[] r;
    public final /* synthetic */ int[] s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2 x;
    public final /* synthetic */ String y;

    public /* synthetic */ ei0(hi.e eVar, hi.e eVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.s8 s8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.w2 w2Var, String str, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, String str2, org.telegram.ui.web.v0 v0Var) {
        this.a = eVar;
        this.b = eVar2;
        this.c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f = strArr;
        this.h = s8Var;
        this.n = zArr;
        this.r = zArr2;
        this.s = iArr;
        this.w = zArr3;
        this.x = w2Var;
        this.y = str;
        this.E = h6Var;
        this.F = z10;
        this.G = str2;
        this.H = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final hi.e eVar = this.a;
        if (eVar.R || this.b.R) {
            return;
        }
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.c;
        boolean z10 = tL_urlAuthResultRequest.request_wallet;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
        if (z10 && inputtonconnectoauthsessionArr[0] == null) {
            return;
        }
        eVar.setLoading(true);
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
        org.telegram.ui.Cells.s8 s8Var = this.h;
        tL_messages_acceptUrlAuth.write_allowed = s8Var != null && s8Var.e.h;
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
        d3.b bVar = new d3.b(1);
        final boolean[] zArr = this.w;
        final org.telegram.ui.ActionBar.w2 w2Var = this.x;
        final String str2 = this.y;
        final org.telegram.ui.ActionBar.h6 h6Var = this.E;
        final boolean z11 = this.F;
        final String str3 = this.G;
        final org.telegram.ui.web.v0 v0Var = this.H;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.q10() { // from class: org.telegram.ui.ci0
            @Override // org.telegram.messenger.q10
            public final void a(Object obj, Object obj2) {
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                hi.e.this.setLoading(false);
                TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                if (inputtonconnectoauthsession2 != null) {
                    Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                }
                zArr[0] = true;
                w2Var.dismiss();
                if (tL_error == null) {
                    gi0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, v0Var);
                    return;
                }
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    gi0.a().g0(tL_error, false);
                    return;
                }
                org.telegram.ui.Components.lc a10 = gi0.a();
                String N0 = org.telegram.messenger.gd.N0(2131753125, null);
                String str4 = str2;
                a10.I(R.raw.error, N0, TextUtils.isEmpty(str4) ? org.telegram.messenger.gd.N0(2131753126, null) : org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var), org.telegram.messenger.gd.a0(null, null, 2131753127, str4))).j();
            }
        });
    }
}
