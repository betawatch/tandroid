package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a31;
import org.telegram.ui.bn;
import org.telegram.ui.m60;
import org.telegram.ui.t60;
import org.telegram.ui.t80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b;
                a31 a31Var = (a31) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    v0.P("enable backup: server accepted request");
                    v0Var.w0(walletState);
                    a31Var.a(null);
                    break;
                } else {
                    v0.n("enable backup: server rejected request code=" + tL_error.code + " error=" + tL_error.text);
                    String str = tL_error.text;
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a31Var.a(str);
                    break;
                }
            case 1:
                h0 h0Var = (h0) this.b;
                p10 p10Var = (p10) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (!h0Var.a) {
                    p10Var.a(wallettransaction, str2);
                    break;
                }
                break;
            case 2:
                String str3 = (String) this.b;
                hi.a4 a4Var = (hi.a4) this.c;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse != null && apiresponse.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject = optJSONArray.getJSONObject(0);
                            if (str3.equals(jSONObject.optString("domain"))) {
                                String optString = jSONObject.optString("dns_wallet", "");
                                if (WalletEngine2.isValidAddress(optString)) {
                                    r2 = optString;
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                a4Var.a(r2);
                break;
            case 3:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                t60 t60Var = (t60) this.c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str4 = (String) obj2;
                if (str4 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                t60Var.a(str4);
                break;
            case 4:
                ((s0) this.b).close();
                ((m60) this.c).a((i2) obj, (String) obj2);
                break;
            case 5:
                ((s0) this.b).close();
                org.telegram.messenger.g0.g3(new p(this.c, obj, (String) obj2, 3));
                break;
            case 6:
                e9.g0((e9) this.b, (w10) this.c, (s0) obj, (String) obj2);
                break;
            case 7:
                oa oaVar = (oa) this.b;
                o oVar = (o) this.c;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) == null) {
                    oVar.a(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                } else {
                    oaVar.a0.setLoading(false);
                    break;
                }
            case 8:
                sh.o oVar2 = (sh.o) this.b;
                String str5 = (String) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = oVar2.a;
                if (webpagepreview != null) {
                    mp.u1(i10).f4(webpagepreview.users, false);
                    mp.u1(i10).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        r2 = messageMedia.webpage;
                    }
                }
                oVar2.b.put(str5, r2);
                ArrayList arrayList = (ArrayList) oVar2.c.remove(str5);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        ((p10) obj3).a(r2, tL_error2);
                    }
                    break;
                }
                break;
            default:
                wg.z zVar = (wg.z) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool = (Boolean) obj;
                String str6 = (String) obj2;
                zVar.m2.a.setLoading(false);
                if (zVar.getContext() != null) {
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    t80 t80Var = LaunchActivity.H1.w0;
                    if (T != null) {
                        if (!bool.booleanValue()) {
                            if (str6 != null) {
                                zVar.dismiss();
                                kc.b0(T).Q(R.raw.error, 36, gd.a0(null, null, 2131743631, str6)).j();
                                break;
                            }
                        } else {
                            zVar.dismiss();
                            bn ua2 = bn.ua(-zVar.X1.id);
                            T.presentFragment(ua2);
                            T.whenFullyVisible(new v9.b(7, ua2, tL_starsGiveawayOption));
                            if (t80Var != null) {
                                t80Var.c(true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
