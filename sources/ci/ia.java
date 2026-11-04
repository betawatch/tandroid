package ci;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia implements View.OnClickListener {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ ia(gi.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.t2 t2Var, gi.d dVar2, org.telegram.ui.web.w0 w0Var, int i3) {
        this.c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.e = t2Var;
        this.f = dVar2;
        this.n = w0Var;
        this.b = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        JSONObject jSONObject = null;
        int i10 = this.b;
        Object obj = this.n;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.h;
        switch (i3) {
            case 0:
                gi.d dVar = (gi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            sf.c.s(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new xa(dVar), null, false, true, false, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i11 = this.b;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_checkChatInvite, new cg.j0(dVar, t2VarArr, e6Var, i11, tL_messages_checkChatInvite, 1));
                        break;
                    }
                }
                break;
            case 1:
                DataAutoDownloadActivity.Z((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.m8) obj3, (org.telegram.ui.Cells.m8[]) obj2, this.b, (org.telegram.ui.Cells.b5[]) obj4, (org.telegram.ui.Cells.q8[]) obj6, (AnimatorSet[]) obj, view);
                break;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj2;
                gi.d dVar2 = (gi.d) obj4;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj;
                if (!((gi.d) obj5).R) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.R) {
                            dVar2.setLoading(true);
                            if (w0Var != null) {
                                boolean z10 = org.telegram.ui.web.w0.R0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                w0Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_declineUrlAuth, new c3.b(1), new ai.q4(20, zArr2, t2Var));
                            break;
                        }
                    } else {
                        zArr2[0] = true;
                        t2Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) obj5;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj4;
                yh.l lVar = (yh.l) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.q qVar = new org.telegram.ui.Wallet.q(zArr3, y2VarArr, e6Var2, lVar, 9);
                    if (!wallettransaction.comment_encrypted_preparing) {
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                        String str2 = wallettransaction.comment;
                        org.telegram.ui.Wallet.k0.H("decrypting transaction comment");
                        x10.z(new org.telegram.ui.Wallet.j(x10, qVar, str, str2), true, false);
                        break;
                    } else {
                        qVar.a(wallettransaction.comment, null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ia(gi.d dVar, TL_stars.StarsSubscription starsSubscription, int i3, org.telegram.ui.ActionBar.t2[] t2VarArr, org.telegram.ui.ActionBar.e6 e6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i3;
        this.e = t2VarArr;
        this.f = e6Var;
        this.h = zArr;
        this.n = activity;
    }

    public /* synthetic */ ia(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.m8 m8Var, org.telegram.ui.Cells.m8[] m8VarArr, int i3, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = m8Var;
        this.e = m8VarArr;
        this.b = i3;
        this.f = b5VarArr;
        this.h = q8VarArr;
        this.n = animatorSetArr;
    }

    public /* synthetic */ ia(boolean[] zArr, org.telegram.ui.Wallet.y2[] y2VarArr, org.telegram.ui.ActionBar.e6 e6Var, yh.l lVar, TL_wallet.walletTransaction wallettransaction, int i3, String str) {
        this.h = zArr;
        this.c = y2VarArr;
        this.f = e6Var;
        this.d = lVar;
        this.e = wallettransaction;
        this.b = i3;
        this.n = str;
    }
}
