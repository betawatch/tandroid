package org.telegram.ui;

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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class du implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ du(ci.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.f3 f3Var, ci.d dVar2, org.telegram.ui.web.b1 b1Var, int i10) {
        this.c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.e = zArr;
        this.f = f3Var;
        this.h = dVar2;
        this.n = b1Var;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        JSONObject jSONObject = null;
        int i11 = this.b;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i10) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) obj6, (org.telegram.ui.Cells.s8) obj5, (org.telegram.ui.Cells.s8[]) obj4, this.b, (org.telegram.ui.Cells.d5[]) obj3, (org.telegram.ui.Cells.w8[]) obj2, (AnimatorSet[]) obj, view);
                break;
            case 1:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj5;
                boolean[] zArr = (boolean[]) obj4;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj3;
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (!((ci.d) obj6).N) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar.N) {
                            dVar.setLoading(true);
                            if (b1Var != null) {
                                boolean z10 = org.telegram.ui.web.b1.P0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                b1Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new org.telegram.messenger.a(), new ai.m0(16, zArr, f3Var));
                            break;
                        }
                    } else {
                        zArr[0] = true;
                        f3Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.Wallet.i2[] i2VarArr = (org.telegram.ui.Wallet.i2[]) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                vh.n nVar = (vh.n) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    org.telegram.ui.Wallet.n nVar2 = new org.telegram.ui.Wallet.n(zArr2, i2VarArr, e6Var, nVar, 9);
                    if (!wallettransaction.comment_encrypted_preparing) {
                        org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i11);
                        String str2 = wallettransaction.comment;
                        org.telegram.ui.Wallet.k0.E("decrypting transaction comment");
                        v.x(new org.telegram.ui.Wallet.i(v, nVar2, str, str2), true, false);
                        break;
                    } else {
                        nVar2.run(wallettransaction.comment, null);
                        break;
                    }
                }
                break;
            default:
                ci.d dVar2 = (ci.d) obj6;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj5;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj4;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj3;
                boolean[] zArr3 = (boolean[]) obj2;
                Activity activity = (Activity) obj;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr3[0] = true;
                            of.f.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new yh.o6(dVar2), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i12 = this.b;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_checkChatInvite, new ai.za(dVar2, f3VarArr, e6Var2, i12, tL_messages_checkChatInvite, 14));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ du(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = f3VarArr;
        this.f = e6Var;
        this.h = zArr;
        this.n = activity;
    }

    public /* synthetic */ du(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.e = s8VarArr;
        this.b = i10;
        this.f = d5VarArr;
        this.h = w8VarArr;
        this.n = animatorSetArr;
    }

    public /* synthetic */ du(boolean[] zArr, org.telegram.ui.Wallet.i2[] i2VarArr, org.telegram.ui.ActionBar.e6 e6Var, vh.n nVar, TL_wallet.walletTransaction wallettransaction, int i10, String str) {
        this.c = zArr;
        this.d = i2VarArr;
        this.e = e6Var;
        this.f = nVar;
        this.h = wallettransaction;
        this.b = i10;
        this.n = str;
    }
}
