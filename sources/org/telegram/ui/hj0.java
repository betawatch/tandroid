package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj0 implements Runnable {
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ String F;
    public final /* synthetic */ org.telegram.ui.web.z0 G;
    public final /* synthetic */ vh.d a;
    public final /* synthetic */ vh.d b;
    public final /* synthetic */ TLRPC.TL_urlAuthResultRequest c;
    public final /* synthetic */ TL_wallet.inputTonConnectOauthSession[] d;
    public final /* synthetic */ TLRPC.TL_messages_requestUrlAuth e;
    public final /* synthetic */ String[] f;
    public final /* synthetic */ org.telegram.ui.Cells.t8 h;
    public final /* synthetic */ boolean[] n;
    public final /* synthetic */ boolean[] r;
    public final /* synthetic */ int[] s;
    public final /* synthetic */ boolean[] w;
    public final /* synthetic */ org.telegram.ui.ActionBar.z2 x;
    public final /* synthetic */ String y;

    public /* synthetic */ hj0(vh.d dVar, vh.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.t8 t8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.z2 z2Var, String str, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str2, org.telegram.ui.web.z0 z0Var) {
        this.a = dVar;
        this.b = dVar2;
        this.c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f = strArr;
        this.h = t8Var;
        this.n = zArr;
        this.r = zArr2;
        this.s = iArr;
        this.w = zArr3;
        this.x = z2Var;
        this.y = str;
        this.D = p6Var;
        this.E = z10;
        this.F = str2;
        this.G = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final vh.d dVar = this.a;
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
        org.telegram.ui.Cells.t8 t8Var = this.h;
        tL_messages_acceptUrlAuth.write_allowed = t8Var != null && t8Var.e.h;
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
        a3.b bVar = new a3.b(1);
        final boolean[] zArr = this.w;
        final org.telegram.ui.ActionBar.z2 z2Var = this.x;
        final String str2 = this.y;
        final org.telegram.ui.ActionBar.p6 p6Var = this.D;
        final boolean z11 = this.E;
        final String str3 = this.F;
        final org.telegram.ui.web.z0 z0Var = this.G;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.j20() { // from class: org.telegram.ui.ej0
            @Override // org.telegram.messenger.j20
            public final void a(Object obj, Object obj2) {
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                vh.d.this.setLoading(false);
                TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                if (inputtonconnectoauthsession2 != null) {
                    Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                }
                zArr[0] = true;
                z2Var.dismiss();
                if (tL_error == null) {
                    jj0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, z0Var);
                    return;
                }
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    jj0.a().f0(tL_error, false);
                    return;
                }
                org.telegram.ui.Components.cc a2 = jj0.a();
                String L0 = org.telegram.messenger.cd.L0(2131753128, null);
                String str4 = str2;
                a2.I(R.raw.error, L0, TextUtils.isEmpty(str4) ? org.telegram.messenger.cd.L0(2131753129, null) : org.telegram.messenger.i0.O2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.uj, p6Var), org.telegram.messenger.cd.a0(null, null, 2131753130, str4))).j();
            }
        });
    }
}
