package di;

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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements View.OnClickListener {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ aa(hi.d dVar, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, org.telegram.ui.ActionBar.x2 x2Var, hi.d dVar2, org.telegram.ui.web.v0 v0Var, int i7) {
        this.c = dVar;
        this.d = tL_messages_requestUrlAuth;
        this.h = zArr;
        this.e = x2Var;
        this.f = dVar2;
        this.n = v0Var;
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
                hi.d dVar = (hi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                boolean[] zArr = (boolean[]) obj6;
                Activity activity = (Activity) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            vf.c.s(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new qa(dVar), null, false, true, false, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i11 = this.b;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_checkChatInvite, new bg.l0(dVar, x2VarArr, i6Var, i11, tL_messages_checkChatInvite, 1));
                        break;
                    }
                }
                break;
            case 1:
                DataAutoDownloadActivity.Z((DataAutoDownloadActivity) obj5, (org.telegram.ui.Cells.o8) obj3, (org.telegram.ui.Cells.o8[]) obj2, this.b, (org.telegram.ui.Cells.d5[]) obj4, (org.telegram.ui.Cells.s8[]) obj6, (AnimatorSet[]) obj, view);
                break;
            case 2:
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj3;
                boolean[] zArr2 = (boolean[]) obj6;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj2;
                hi.d dVar2 = (hi.d) obj4;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj;
                if (!((hi.d) obj5).R) {
                    if (tL_messages_requestUrlAuth != null && !TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                        if (!dVar2.R) {
                            dVar2.setLoading(true);
                            if (v0Var != null) {
                                boolean z10 = org.telegram.ui.web.v0.R0;
                                try {
                                    jSONObject = new JSONObject();
                                } catch (Exception unused) {
                                }
                                v0Var.y("oauth_result_failed", jSONObject);
                            }
                            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
                            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
                            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_declineUrlAuth, new d3.b(1), new bi.l6(24, zArr2, x2Var));
                            break;
                        }
                    } else {
                        zArr2[0] = true;
                        x2Var.dismiss();
                        break;
                    }
                }
                break;
            default:
                boolean[] zArr3 = (boolean[]) obj6;
                org.telegram.ui.Wallet.e3[] e3VarArr = (org.telegram.ui.Wallet.e3[]) obj5;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj4;
                xh.l lVar = (xh.l) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                String str = (String) obj;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    org.telegram.ui.Wallet.s sVar = new org.telegram.ui.Wallet.s(zArr3, e3VarArr, i6Var2, lVar, 9);
                    if (!wallettransaction.comment_encrypted_preparing) {
                        org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i10);
                        String str2 = wallettransaction.comment;
                        org.telegram.ui.Wallet.u0.P("decrypting transaction comment");
                        D.F(true, false, false, new org.telegram.ui.Wallet.j(D, sVar, str, str2));
                        break;
                    } else {
                        sVar.a(wallettransaction.comment, null);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ aa(hi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.x2[] x2VarArr, org.telegram.ui.ActionBar.i6 i6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i7;
        this.e = x2VarArr;
        this.f = i6Var;
        this.h = zArr;
        this.n = activity;
    }

    public /* synthetic */ aa(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.o8 o8Var, org.telegram.ui.Cells.o8[] o8VarArr, int i7, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.s8[] s8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = o8Var;
        this.e = o8VarArr;
        this.b = i7;
        this.f = d5VarArr;
        this.h = s8VarArr;
        this.n = animatorSetArr;
    }

    public /* synthetic */ aa(boolean[] zArr, org.telegram.ui.Wallet.e3[] e3VarArr, org.telegram.ui.ActionBar.i6 i6Var, xh.l lVar, TL_wallet.walletTransaction wallettransaction, int i7, String str) {
        this.h = zArr;
        this.c = e3VarArr;
        this.f = i6Var;
        this.d = lVar;
        this.e = wallettransaction;
        this.b = i7;
        this.n = str;
    }
}
