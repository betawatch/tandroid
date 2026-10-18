package ai;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pb implements View.OnClickListener {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ pb(ei.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.f3 f3Var, ei.d dVar2, org.telegram.ui.web.a1 a1Var, int i10) {
        this.c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.e = f3Var;
        this.f = dVar2;
        this.n = a1Var;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        JSONObject jSONObject = null;
        int i11 = this.b;
        Object obj = this.n;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.h;
        switch (i10) {
            case 0:
                ei.d dVar = (ei.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            pf.d.q(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new fc(dVar), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i12 = this.b;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_checkChatInvite, new sb(dVar, f3VarArr, d6Var, i12, tL_messages_checkChatInvite, 1));
                        break;
                    }
                }
                break;
            case 1:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.r8) obj3, (org.telegram.ui.Cells.r8[]) obj2, this.b, (org.telegram.ui.Cells.c5[]) obj4, (org.telegram.ui.Cells.v8[]) obj6, (AnimatorSet[]) obj, view);
                break;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj2;
                ei.d dVar2 = (ei.d) obj4;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                if (!((ei.d) obj5).N) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.N) {
                            dVar2.setLoading(true);
                            if (a1Var != null) {
                                boolean z10 = org.telegram.ui.web.a1.P0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                a1Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new org.telegram.messenger.a(), new q5(20, zArr2, f3Var));
                            break;
                        }
                    } else {
                        zArr2[0] = true;
                        f3Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.k2[] k2VarArr = (org.telegram.ui.Wallet.k2[]) obj5;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) obj4;
                wh.n nVar = (wh.n) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.q qVar = new org.telegram.ui.Wallet.q(zArr3, k2VarArr, d6Var2, nVar, 9);
                    if (!wallettransaction.comment_encrypted_preparing) {
                        org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i11);
                        String str2 = wallettransaction.comment;
                        org.telegram.ui.Wallet.m0.F("decrypting transaction comment");
                        w9.y(new org.telegram.ui.Wallet.k(w9, qVar, str, str2), true, false);
                        break;
                    } else {
                        qVar.run(wallettransaction.comment, null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ pb(ei.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = f3VarArr;
        this.f = d6Var;
        this.h = zArr;
        this.n = activity;
    }

    public /* synthetic */ pb(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.r8 r8Var, org.telegram.ui.Cells.r8[] r8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.v8[] v8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = r8Var;
        this.e = r8VarArr;
        this.b = i10;
        this.f = c5VarArr;
        this.h = v8VarArr;
        this.n = animatorSetArr;
    }

    public /* synthetic */ pb(boolean[] zArr, org.telegram.ui.Wallet.k2[] k2VarArr, org.telegram.ui.ActionBar.d6 d6Var, wh.n nVar, TL_wallet.walletTransaction wallettransaction, int i10, String str) {
        this.h = zArr;
        this.c = k2VarArr;
        this.f = d6Var;
        this.d = nVar;
        this.e = wallettransaction;
        this.b = i10;
        this.n = str;
    }
}
