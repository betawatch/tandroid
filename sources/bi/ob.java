package bi;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ob implements View.OnClickListener {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ob(fi.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.k3 k3Var, fi.d dVar2, org.telegram.ui.web.a1 a1Var, int i10) {
        this.c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.e = k3Var;
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
                fi.d dVar = (fi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            qf.d.q(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new zb(dVar), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i12 = this.b;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_checkChatInvite, new ag.p0(dVar, k3VarArr, u6Var, i12, tL_messages_checkChatInvite, 1));
                        break;
                    }
                }
                break;
            case 1:
                DataAutoDownloadActivity.V((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.w8) obj3, (org.telegram.ui.Cells.w8[]) obj2, this.b, (org.telegram.ui.Cells.h5[]) obj4, (org.telegram.ui.Cells.a9[]) obj6, (AnimatorSet[]) obj, view);
                break;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj2;
                fi.d dVar2 = (fi.d) obj4;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                if (!((fi.d) obj5).Q) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.Q) {
                            dVar2.setLoading(true);
                            if (a1Var != null) {
                                boolean z10 = org.telegram.ui.web.a1.Q0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                a1Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i11).sendRequestTyped(tL_messages_declineUrlAuth, new org.telegram.messenger.a(), new m5(20, zArr2, k3Var));
                            break;
                        }
                    } else {
                        zArr2[0] = true;
                        k3Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) obj5;
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) obj4;
                xh.n nVar = (xh.n) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.p pVar = new org.telegram.ui.Wallet.p(zArr3, j2VarArr, u6Var2, nVar, 9);
                    if (!wallettransaction.comment_encrypted_preparing) {
                        org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i11);
                        String str2 = wallettransaction.comment;
                        org.telegram.ui.Wallet.l0.H("decrypting transaction comment");
                        x9.z(new org.telegram.ui.Wallet.j(x9, pVar, str, str2), true, false);
                        break;
                    } else {
                        pVar.run(wallettransaction.comment, null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ob(fi.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.k3[] k3VarArr, org.telegram.ui.ActionBar.u6 u6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = k3VarArr;
        this.f = u6Var;
        this.h = zArr;
        this.n = activity;
    }

    public /* synthetic */ ob(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.w8 w8Var, org.telegram.ui.Cells.w8[] w8VarArr, int i10, org.telegram.ui.Cells.h5[] h5VarArr, org.telegram.ui.Cells.a9[] a9VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = w8Var;
        this.e = w8VarArr;
        this.b = i10;
        this.f = h5VarArr;
        this.h = a9VarArr;
        this.n = animatorSetArr;
    }

    public /* synthetic */ ob(boolean[] zArr, org.telegram.ui.Wallet.j2[] j2VarArr, org.telegram.ui.ActionBar.u6 u6Var, xh.n nVar, TL_wallet.walletTransaction wallettransaction, int i10, String str) {
        this.h = zArr;
        this.c = j2VarArr;
        this.f = u6Var;
        this.d = nVar;
        this.e = wallettransaction;
        this.b = i10;
        this.n = str;
    }
}
