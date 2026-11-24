// default package

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fv0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fv0(gk7 gk7Var, Object obj, String str, byte b) {
        this.a = b;
        this.b = gk7Var;
        this.d = obj;
        this.c = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03e4, code lost:
    
        if (r8.equals("allowScroll") == false) goto L172;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        MediaMetadataRetriever mediaMetadataRetriever;
        String str;
        byte b = this.a;
        Object obj = 7;
        char c = 7;
        byte b2 = 4;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        mediaMetadataRetriever2 = null;
        boolean z2 = true;
        int i = 0;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                hv0 hv0Var = ((BotWebViewContainer$WebViewProxy) obj4).a;
                if (hv0Var != null) {
                    boolean z3 = hv0.R0;
                    if (hv0Var.p0 || hv0Var.c == null) {
                        return;
                    }
                    if (hv0Var.H0 != null && !TextUtils.equals(hv0Var.getOriginHost(), hv0Var.H0)) {
                        hv0Var.e("onWebEventReceived ignore " + str2);
                        return;
                    }
                    hv0Var.e("onWebEventReceived " + str2 + " " + str3);
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1695046810:
                            if (str2.equals("actionBarColor")) {
                                b2 = 0;
                                break;
                            }
                            b2 = -1;
                            break;
                        case -462720700:
                            if (str2.equals("navigationBarColor")) {
                                b2 = 1;
                                break;
                            }
                            b2 = -1;
                            break;
                        case 479731943:
                            if (str2.equals("oauth_request")) {
                                b2 = 2;
                                break;
                            }
                            b2 = -1;
                            break;
                        case 675009138:
                            if (str2.equals("siteName")) {
                                b2 = 3;
                                break;
                            }
                            b2 = -1;
                            break;
                        case 997530486:
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                        case 1:
                            try {
                                JSONArray jSONArray = new JSONArray(str3);
                                boolean equals = TextUtils.equals(str2, "actionBarColor");
                                int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                cv0 cv0Var = hv0Var.a;
                                if (cv0Var != null) {
                                    if (equals) {
                                        cv0Var.s = true;
                                        cv0Var.x = argb;
                                    } else {
                                        cv0Var.w = true;
                                        cv0Var.y = argb;
                                    }
                                    int i2 = cv0.W;
                                    cv0Var.e();
                                }
                                hv0Var.c.o(argb, equals);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            hv0Var.e("oauth_request " + str3);
                            if (hv0Var.a != null) {
                                String originHost = hv0Var.getOriginHost();
                                if (TextUtils.isEmpty(originHost)) {
                                    return;
                                }
                                try {
                                    String optString = new JSONObject(str3).optString("url");
                                    hv0Var.v("oauth_supported", hv0.x(1, "version"));
                                    if (TextUtils.isEmpty(optString)) {
                                        return;
                                    }
                                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                    tL_messages_requestUrlAuth.url = optString;
                                    int i3 = tL_messages_requestUrlAuth.flags;
                                    tL_messages_requestUrlAuth.in_app_origin = originHost;
                                    tL_messages_requestUrlAuth.flags = i3 | 12;
                                    ConnectionsManager.getInstance(hv0Var.N).sendRequest(tL_messages_requestUrlAuth, new rt0((Object) hv0Var, (Object) tL_messages_requestUrlAuth, (Object) optString, (Object) originHost, (byte) 1), 2);
                                    return;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return;
                                }
                            }
                            return;
                        case 3:
                            hv0Var.e("siteName " + str3);
                            cv0 cv0Var2 = hv0Var.a;
                            if (cv0Var2 != null) {
                                cv0Var2.r = str3;
                                cv0Var2.e();
                                return;
                            }
                            return;
                        case 4:
                            try {
                                JSONArray jSONArray2 = new JSONArray(str3);
                                z = jSONArray2.optBoolean(0, true);
                                try {
                                    z2 = jSONArray2.optBoolean(1, true);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                z = true;
                            }
                            if (hv0Var.getParent() instanceof r12) {
                                r12 r12Var = (r12) hv0Var.getParent();
                                r12Var.P = z;
                                r12Var.Q = z2;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                boolean z4 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                ow0 ow0Var = ((jw0) obj4).d;
                if (!z4) {
                    new u21(ow0Var.r0, ow0Var.G).Z(tL_error).k(true);
                    return;
                }
                gw0 gw0Var = ow0Var.E;
                gw0Var.getClass();
                gw0Var.v("emoji_status_access_requested", hv0.x("cancelled", "status"));
                return;
            case 2:
                ((d) obj2).presentFragment((mu1) obj3);
                ((qx0) obj4).c = false;
                return;
            case 3:
                qx0 qx0Var = (qx0) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                px0 px0Var = (px0) obj3;
                while (i < arrayList.size()) {
                    if (((nx0) arrayList.get(i)).a == px0Var) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                qx0Var.invalidate();
                return;
            case 4:
                pz0 pz0Var = (pz0) obj4;
                fz0 fz0Var = (fz0) obj2;
                nz0 nz0Var = (nz0) obj3;
                if (pz0Var.d.get(Long.valueOf(fz0Var.a)) == fz0Var && fz0Var.k.get(nz0Var.a) == nz0Var && nz0Var.i == null && pz0Var.c == 2) {
                    pz0Var.r(fz0Var, nz0Var);
                    return;
                }
                return;
            case 5:
                y31 y31Var = (y31) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj3;
                if (tL_error2 != null) {
                    y31Var.f.b(false);
                    u21.e0(tL_error2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    y31Var.f.b(false);
                    yjb.x(null, 2131743640, u21.b0(y31Var), null);
                    return;
                } else {
                    if (y31Var.F != null) {
                        y31Var.getMessagesController().Z2(y31Var.getUserConfig().f(), 0, true, null);
                    }
                    y31Var.finishFragment();
                    return;
                }
            case 6:
                j41 j41Var = (j41) obj4;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj3;
                ArrayList arrayList2 = j41Var.b;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    fa4.g(new RuntimeException("Unexpected response from server!"), true);
                    return;
                }
                if (arrayList2.contains(tL_businessChatLink)) {
                    arrayList2.remove(tL_businessChatLink);
                    kk7.f(j41Var.a).k(kk7.I1, new Object[0]);
                }
                j41Var.f();
                return;
            case 7:
                j41 j41Var2 = (j41) obj4;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) obj2;
                ConnectionsManager.getInstance(j41Var2.a).sendRequest(deletebusinesschatlink, new pl(j41Var2, (TL_account.TL_businessChatLink) obj3, (byte) 8));
                return;
            case 8:
                r61 r61Var = (r61) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                hd hdVar = (hd) obj3;
                while (i < arrayList3.size()) {
                    ((u61) arrayList3.get(i)).a.delete();
                    i++;
                }
                gl.c3(new q21(r61Var, hdVar, b2));
                return;
            case 9:
                t61 t61Var = (t61) obj4;
                Pair pair = (Pair) obj2;
                p8c p8cVar = (p8c) obj3;
                HashMap hashMap = t61Var.c;
                if (hashMap == null) {
                    hashMap = new HashMap();
                    t61Var.c = hashMap;
                }
                ArrayList arrayList4 = (ArrayList) hashMap.get(pair);
                if (arrayList4 == null) {
                    HashMap hashMap2 = t61Var.c;
                    arrayList4 = new ArrayList();
                    hashMap2.put(pair, arrayList4);
                }
                arrayList4.add(p8cVar);
                return;
            case 10:
                o71 o71Var = (o71) obj4;
                u61 u61Var = (u61) obj2;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj3;
                String str4 = "";
                try {
                    try {
                        try {
                            mediaMetadataRetriever = new MediaMetadataRetriever();
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            try {
                                mediaMetadataRetriever.setDataSource(o71Var.getContext(), Uri.fromFile(u61Var.a));
                                str = mediaMetadataRetriever.extractMetadata(7);
                            } catch (Exception e2) {
                                e = e2;
                                str = "";
                            }
                            try {
                                str4 = mediaMetadataRetriever.extractMetadata(2);
                                mediaMetadataRetriever.release();
                                obj = str;
                            } catch (Exception e3) {
                                e = e3;
                                mediaMetadataRetriever2 = mediaMetadataRetriever;
                                obj = str;
                                fa4.g(e, true);
                                if (mediaMetadataRetriever2 != null) {
                                    mediaMetadataRetriever2.release();
                                    obj = obj;
                                }
                                gl.c3(new b87((Object) o71Var, (Object) u61Var, (Object) tL_documentAttributeAudio, obj, (Object) str4, (byte) 11));
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mediaMetadataRetriever2 = mediaMetadataRetriever;
                            if (mediaMetadataRetriever2 != null) {
                                try {
                                    mediaMetadataRetriever2.release();
                                } catch (Throwable unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        obj = "";
                    }
                } catch (Throwable unused5) {
                }
                gl.c3(new b87((Object) o71Var, (Object) u61Var, (Object) tL_documentAttributeAudio, obj, (Object) str4, (byte) 11));
                return;
            case 11:
                ((w71) obj4).b.y.finishFragment();
                ((mu1) obj2).c8(((z71) obj3).h);
                return;
            case 12:
                ((z81) obj4).f0((TLObject) obj3, (TLRPC.TL_error) obj2);
                return;
            case 13:
                gl.g(((String[]) obj4)[0]);
                new u21(((fx0) obj2).F, (wjb) obj3).i(k96.M0(2131748729, null)).j();
                return;
            case 14:
                ((me1) obj4).h0((hd) obj2, (TLRPC.User) obj3);
                return;
            case 15:
                ((nf1) obj4).T0((TLObject) obj3, (TLRPC.TL_error) obj2);
                return;
            case 16:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj2;
                gl.g(connectedbotstarref.url);
                u21.b0((eg1) obj4).I(R.raw.copy, k96.M0(2131754330, null), gl.S2(k96.a0(null, null, 2131754331, bc.I0(connectedbotstarref.commission_permille), l7c.r((TLRPC.User) obj3)))).j();
                return;
            case 17:
                ((eg1) obj4).E0((TLObject) obj2, (hd) obj3);
                return;
            case 18:
                TLObject tLObject2 = (TLObject) obj2;
                akb akbVar = (akb) obj3;
                HashMap hashMap3 = ((lh1) obj4).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    akbVar.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r = ba4.r(null, wallPaper.document);
                if (hashMap3.containsKey(r)) {
                    return;
                }
                hashMap3.put(r, akbVar);
                ba4.G(akbVar.F).X(wallPaper.document, wallPaper, 1, 1);
                return;
            case 19:
                yh1 yh1Var = (yh1) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                if (((TLRPC.TL_error) obj2) == null) {
                    yh1Var.e0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                yh1Var.d0 = false;
                f36 f36Var = yh1Var.R;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = yh1Var.e0;
                f36Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 20:
                ((uxa) obj4).showDialog(zi1.J((wjb) obj3, (Activity) obj2, false));
                return;
            case 21:
                zi1 zi1Var = (zi1) obj4;
                TLObject tLObject4 = (TLObject) obj2;
                Activity activity = (Activity) obj3;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    d01.t(activity, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                gl.d3(new ei1(zi1Var, b2), 1000L);
                return;
            case 22:
                uk1 uk1Var = (uk1) obj4;
                hmc.I0(uk1Var.getContext(), uk1Var.I, (TL_wallet.walletTransaction) obj2, null, null, null, (nk1) obj3, uk1Var.h1);
                return;
            case 23:
                uk1 uk1Var2 = (uk1) obj4;
                uk1Var2.g1.U(uk1Var2, (TLRPC.TL_premiumGiftOption) obj3, (String) obj2);
                return;
            case 24:
                mu1 mu1Var = (mu1) obj4;
                mu1Var.f = ((ad7) obj2).g0(mu1Var.h.user_id);
                ((CountDownLatch) obj3).countDown();
                return;
            case 25:
                gl.c3(new aj1((yt0) obj3, ((mu1) obj4).getMessagesStorage().g0(((TLRPC.TL_contact) obj2).user_id), c));
                return;
            case 26:
                ((mu1) obj4).H9((TLRPC.User) obj2, (TLRPC.EmojiStatus) obj3);
                return;
            case 27:
                mu1 mu1Var2 = (mu1) obj4;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                ij.Q(mu1Var2.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new ie((Object) mu1Var2, (Object) suggestedPost, obj3, (byte) 14), mu1Var2.getResourceProvider(), 0).M2();
                return;
            case 28:
                ((tq9) obj2).dismiss();
                ((mu1) obj4).presentFragment(ProfileActivity.P2(((TLRPC.User) obj3).id));
                return;
            default:
                mu1 mu1Var3 = (mu1) obj4;
                ((cs5) obj3).u();
                jj7 jj7Var = new jj7(mu1Var3, mu1Var3.getParentActivity());
                jj7Var.H0((String) obj2, false);
                jj7Var.show();
                return;
        }
    }

    public /* synthetic */ fv0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
