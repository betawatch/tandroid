package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.m60;
import org.telegram.ui.p51;
import org.telegram.ui.u60;
import org.telegram.ui.u80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        int i7 = 0;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                p51 p51Var = (p51) this.c;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    u0.P("enable backup: server accepted request");
                    u0Var.w0(walletState);
                    p51Var.a(null);
                    break;
                } else {
                    u0.n("enable backup: server rejected request code=" + tL_error.code + " error=" + tL_error.text);
                    String str = tL_error.text;
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    p51Var.a(str);
                    break;
                }
            case 1:
                g0 g0Var = (g0) this.b;
                q10 q10Var = (q10) this.c;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (!g0Var.a) {
                    q10Var.a(wallettransaction, str2);
                    break;
                }
                break;
            case 2:
                String str3 = (String) this.b;
                ai.y1 y1Var = (ai.y1) this.c;
                TL_toncenter.apiResponse apiresponse = (TL_toncenter.apiResponse) obj;
                if (((TLRPC.TL_error) obj2) == null && apiresponse != null && apiresponse.response != null) {
                    try {
                        JSONArray optJSONArray = new JSONObject(apiresponse.response.data).optJSONArray("records");
                        if (optJSONArray != null && optJSONArray.length() == 1) {
                            JSONObject jSONObject = optJSONArray.getJSONObject(0);
                            if (str3.equals(jSONObject.optString("domain"))) {
                                String optString = jSONObject.optString("dns_wallet", "");
                                if (WalletEngine2.isValidAddress(optString)) {
                                    r1 = optString;
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
                y1Var.a(r1);
                break;
            case 3:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) this.b;
                u60 u60Var = (u60) this.c;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str4 = (String) obj2;
                if (str4 == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                u60Var.a(str4);
                break;
            case 4:
                ((r0) this.b).close();
                ((m60) this.c).a((h2) obj, (String) obj2);
                break;
            case 5:
                ((r0) this.b).close();
                org.telegram.messenger.g0.g3(new p(this.c, obj, (String) obj2, 3));
                break;
            case 6:
                d9.g0((d9) this.b, (x10) this.c, (r0) obj, (String) obj2);
                break;
            case 7:
                na naVar = (na) this.b;
                o oVar = (o) this.c;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) == null) {
                    oVar.a(walletuseraddress != null ? walletuseraddress.address : null);
                    break;
                } else {
                    naVar.a0.setLoading(false);
                    break;
                }
            case 8:
                sh.p pVar = (sh.p) this.b;
                String str5 = (String) this.c;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i10 = pVar.a;
                if (webpagepreview != null) {
                    mp.u1(i10).f4(webpagepreview.users, false);
                    mp.u1(i10).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        r1 = messageMedia.webpage;
                    }
                }
                pVar.b.put(str5, r1);
                ArrayList arrayList = (ArrayList) pVar.c.remove(str5);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        ((q10) obj3).a(r1, tL_error2);
                    }
                    break;
                }
                break;
            default:
                wg.a0 a0Var = (wg.a0) this.b;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) this.c;
                Boolean bool = (Boolean) obj;
                String str6 = (String) obj2;
                a0Var.m2.a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    u80 u80Var = LaunchActivity.H1.w0;
                    if (T != null) {
                        if (!bool.booleanValue()) {
                            if (str6 != null) {
                                a0Var.dismiss();
                                lc.b0(T).Q(R.raw.error, 36, gd.a0(null, null, 2131743641, str6)).j();
                                break;
                            }
                        } else {
                            a0Var.dismiss();
                            bn ua2 = bn.ua(-a0Var.X1.id);
                            T.presentFragment(ua2);
                            T.whenFullyVisible(new wg.r(1, ua2, tL_starsGiveawayOption));
                            if (u80Var != null) {
                                u80Var.c(true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
