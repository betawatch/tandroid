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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb implements View.OnClickListener {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ lb(fi.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.v2 v2Var, fi.d dVar2, org.telegram.ui.web.x0 x0Var, int i7) {
        this.c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.e = v2Var;
        this.f = dVar2;
        this.n = x0Var;
        this.b = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        JSONObject jSONObject = null;
        int i10 = this.b;
        Object obj = this.n;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.h;
        switch (i7) {
            case 0:
                fi.d dVar = (fi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            vf.c.s(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new bc(dVar), null, false, true, false, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i11 = this.b;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_checkChatInvite, new bg.k0(dVar, v2VarArr, f6Var, i11, tL_messages_checkChatInvite, 1));
                        break;
                    }
                }
                break;
            case 1:
                DataAutoDownloadActivity.Z((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.n8) obj3, (org.telegram.ui.Cells.n8[]) obj2, this.b, (org.telegram.ui.Cells.b5[]) obj4, (org.telegram.ui.Cells.r8[]) obj6, (AnimatorSet[]) obj, view);
                break;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj2;
                fi.d dVar2 = (fi.d) obj4;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                if (!((fi.d) obj5).Q) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.Q) {
                            dVar2.setLoading(true);
                            if (x0Var != null) {
                                boolean z9 = org.telegram.ui.web.x0.Q0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                x0Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_declineUrlAuth, new d3.b(1), new p5(19, zArr2, v2Var));
                            break;
                        }
                    } else {
                        zArr2[0] = true;
                        v2Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.a3[] a3VarArr = (org.telegram.ui.Wallet.a3[]) obj5;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj4;
                xh.l lVar = (xh.l) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.r rVar = new org.telegram.ui.Wallet.r(zArr3, a3VarArr, f6Var2, lVar, 9);
                    if (!wallettransaction.comment_encrypted_preparing) {
                        org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i10);
                        String str2 = wallettransaction.comment;
                        org.telegram.ui.Wallet.n0.H("decrypting transaction comment");
                        x10.z(new org.telegram.ui.Wallet.j(x10, rVar, str, str2), true, false);
                        break;
                    } else {
                        rVar.a(wallettransaction.comment, null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ lb(fi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.v2[] v2VarArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i7;
        this.e = v2VarArr;
        this.f = f6Var;
        this.h = zArr;
        this.n = activity;
    }

    public /* synthetic */ lb(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i7, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = n8Var;
        this.e = n8VarArr;
        this.b = i7;
        this.f = b5VarArr;
        this.h = r8VarArr;
        this.n = animatorSetArr;
    }

    public /* synthetic */ lb(boolean[] zArr, org.telegram.ui.Wallet.a3[] a3VarArr, org.telegram.ui.ActionBar.f6 f6Var, xh.l lVar, TL_wallet.walletTransaction wallettransaction, int i7, String str) {
        this.h = zArr;
        this.c = a3VarArr;
        this.f = f6Var;
        this.d = lVar;
        this.e = wallettransaction;
        this.b = i7;
        this.n = str;
    }
}
