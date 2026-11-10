package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h10(int i7, org.telegram.messenger.c20 c20Var, org.telegram.ui.Wallet.l0 l0Var) {
        this.a = 14;
        this.b = i7;
        this.c = c20Var;
        this.d = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05f9  */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, q2.k] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        String str;
        PackageInfo packageInfo;
        boolean z9;
        FrameLayout frameLayout;
        String str2;
        org.telegram.ui.Components.gc a02;
        int i10;
        boolean z10;
        int i11 = 6;
        String str3 = null;
        boolean z11 = true;
        char c10 = 1;
        switch (this.a) {
            case 0:
                f40 f40Var = (f40) this.c;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
                int i12 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new bi.g0(f40Var, i12, i11));
                    u1VarArr[0].show();
                    break;
                }
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i13 = this.b;
                String str4 = LaunchActivity.B1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.iz.j1;
                if (tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) {
                    try {
                        packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                        i7 = packageInfo.versionCode;
                    } catch (Exception e10) {
                        e = e10;
                        i7 = 0;
                    }
                    try {
                        str3 = packageInfo.versionName;
                    } catch (Exception e11) {
                        e = e11;
                        org.telegram.messenger.a8.g(e, true);
                        if (i7 == 0) {
                        }
                        if (str3 == null) {
                        }
                        str = tL_help_appUpdate.version;
                        if (str == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (i7 == 0) {
                        i7 = org.telegram.messenger.iz.d();
                    }
                    if (str3 == null) {
                        str3 = org.telegram.messenger.r2.c;
                    }
                    str = tL_help_appUpdate.version;
                    if (str == null && !org.telegram.messenger.iz.U(str3, str)) {
                        org.telegram.messenger.iz.j1 = tL_help_appUpdate;
                        org.telegram.messenger.iz.k1 = i7;
                        org.telegram.messenger.iz.y();
                        if (tL_help_appUpdate.can_not_skip) {
                            launchActivity.M0(i13, tL_help_appUpdate, false);
                        } else {
                            org.telegram.messenger.t0.u();
                            boolean z12 = org.telegram.messenger.r2.a;
                            org.telegram.messenger.t0.a.getClass();
                        }
                        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.Q4, new Object[0]);
                        break;
                    }
                }
                break;
            case 2:
                vh vhVar = (vh) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i14 = this.b;
                if (tLObject instanceof TLRPC.User) {
                    vhVar.a = (TLRPC.User) tLObject;
                    org.telegram.messenger.qp.s1(i14).X3(vhVar.a, false, false);
                }
                org.telegram.ui.Components.lz lzVar = vhVar.c;
                org.telegram.ui.Components.w70 w70Var = vhVar.b;
                vhVar.setEnabled(vhVar.a != null);
                TLRPC.User user = vhVar.a;
                if (user != null) {
                    w70Var.setText(org.telegram.messenger.g0.x2(org.telegram.messenger.id.a0(null, null, 2131748599, org.telegram.messenger.t10.p(user)), new bi.r3(vhVar, user.id, 28)));
                }
                w70Var.animate().alpha(1.0f).setDuration(220L).start();
                lzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(lzVar)).start();
                break;
            case 3:
                ek0.c0((ek0) this.c, (org.telegram.messenger.ew) this.d, this.b);
                break;
            case 4:
                kl0 kl0Var = (kl0) this.c;
                int i15 = this.b;
                Intent intent = (Intent) this.d;
                if (i15 != -1) {
                    z9 = true;
                    if (i15 == 1) {
                        int i16 = y8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        org.telegram.messenger.a8.d(sb2.toString());
                    }
                    kl0Var.N0(z9, false);
                    kl0Var.J0(false);
                    frameLayout = kl0Var.P;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z9);
                        break;
                    }
                } else {
                    Parcelable.Creator<y8.i> creator = y8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    y8.i iVar = (y8.i) (byteArrayExtra != null ? c8.yb.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str2 = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (kl0Var.K0 == null && kl0Var.M0 == null) {
                                ly0 a10 = c8.yc.a(string);
                                kl0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a10.c, (String) a10.b);
                                uc.a aVar = (uc.a) a10.d;
                                kl0Var.x0 = aVar.a() + " *" + aVar.b();
                                kl0Var.z0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            kl0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            kl0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                kl0Var.x0 = "Android Pay";
                            } else {
                                kl0Var.x0 = optString;
                            }
                            kl0Var.z0();
                        } catch (JSONException e12) {
                            z9 = true;
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    }
                }
                z9 = true;
                kl0Var.N0(z9, false);
                kl0Var.J0(false);
                frameLayout = kl0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 5:
                rq0 rq0Var = (rq0) this.c;
                Uri uri = (Uri) this.d;
                int i17 = this.b;
                rq0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i18 = org.telegram.messenger.p10.s0;
                    Point point = org.telegram.messenger.g0.q;
                    org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(file, true, 0L, 0, null, null, null, 0L, i18, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = u5Var.q(0L, false);
                    u5Var.u();
                    org.telegram.messenger.g0.h3(new h10(rq0Var, i17, q10, i11));
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new hf0(rq0Var, 26));
                    return;
                }
            case 6:
                rq0 rq0Var2 = (rq0) this.c;
                int i19 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i19 == rq0Var2.a) {
                    rq0Var2.setImageBitmap(bitmap);
                    rq0Var2.c = true;
                    rq0Var2.b = false;
                    break;
                }
                break;
            case 7:
                cs0 cs0Var = (cs0) this.c;
                ne neVar = (ne) this.d;
                int i20 = this.b;
                neVar.a(Integer.valueOf(i20));
                cs0Var.c(i20 == 1 || i20 == 13);
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i21 = this.b;
                RectF rectF = ProfileActivity.V6;
                org.telegram.messenger.g0.g(str5);
                if (i21 == profileActivity.V2) {
                    a02 = org.telegram.ui.Components.gc.a0(profileActivity);
                    i10 = 2131753721;
                } else {
                    a02 = org.telegram.ui.Components.gc.a0(profileActivity);
                    i10 = 2131744194;
                }
                org.telegram.messenger.camera.q.r(null, i10, a02);
                break;
            case 9:
                mw0 mw0Var = (mw0) this.c;
                v4.d1 d1Var = (v4.d1) this.d;
                int i22 = this.b;
                mw0Var.getClass();
                if (d1Var.b() == i22 && mw0Var.e.T2 == i22 && d1Var.f == 2) {
                    mw0Var.t(d1Var, i22);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                int i23 = this.b;
                org.telegram.ui.Components.r80 r80Var = (org.telegram.ui.Components.r80) this.d;
                org.telegram.ui.Components.gc.a0(f2Var).c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i23).o0(false);
                org.telegram.messenger.g0.h3(r80Var);
                break;
            case 11:
                org.telegram.messenger.video.a aVar2 = (org.telegram.messenger.video.a) this.c;
                org.telegram.ui.Components.gc gcVar = (org.telegram.ui.Components.gc) this.d;
                int i24 = this.b;
                aVar2.run();
                gcVar.c(org.telegram.messenger.id.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i24).o0(false);
                break;
            case 12:
                i81 i81Var = (i81) this.c;
                ne neVar2 = (ne) this.d;
                int i25 = this.b;
                neVar2.a(Integer.valueOf(i25));
                i81Var.c(i25 == 1 || i25 == 13);
                break;
            case 13:
                org.telegram.ui.Wallet.x0 x0Var = (org.telegram.ui.Wallet.x0) this.c;
                rc.u uVar = (rc.u) this.d;
                int i26 = this.b;
                org.telegram.ui.Wallet.y0 y0Var = x0Var.c;
                if (y0Var.c(uVar, i26)) {
                    y0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 14:
                int i27 = this.b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.c;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i27);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new d3.b(c10 == true ? 1 : 0), new org.telegram.ui.Wallet.j(c20Var, l0Var, connectionsManager));
                break;
            case 15:
                Context context = (Context) this.c;
                int i28 = this.b;
                String str6 = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str6)) {
                    String str7 = org.telegram.messenger.qp.s1(i28).H6;
                    if (TextUtils.isEmpty(str7)) {
                        str7 = "https://tonviewer.com/";
                    } else if (!str7.endsWith("/")) {
                        str7 = str7.concat("/");
                    }
                    StringBuilder j3 = rf.b.j(str7, "transaction/");
                    j3.append(Uri.encode(str6));
                    vf.c.v(context, j3.toString(), false);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) this.c;
                int i29 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (a6Var.f0 == i29) {
                    a6Var.f(bitmapArr);
                    a6Var.a.run();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Wallet.g8 g8Var = (org.telegram.ui.Wallet.g8) this.c;
                int i30 = this.b;
                org.telegram.ui.Wallet.pa paVar = (org.telegram.ui.Wallet.pa) this.d;
                int i31 = i30 + 1;
                ArrayList arrayList = g8Var.w;
                if (i31 >= arrayList.size()) {
                    org.telegram.messenger.g0.v1(paVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.pa) arrayList.get(i31)).a.requestFocus();
                    break;
                }
            case 18:
                org.telegram.ui.Wallet.ga gaVar = (org.telegram.ui.Wallet.ga) this.c;
                int i32 = this.b;
                org.telegram.ui.Wallet.pa paVar2 = (org.telegram.ui.Wallet.pa) this.d;
                int i33 = i32 + 1;
                ArrayList arrayList2 = gaVar.d;
                if (i33 >= arrayList2.size()) {
                    org.telegram.messenger.g0.v1(paVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.pa) arrayList2.get(i33)).a.requestFocus();
                    break;
                }
            case 19:
                wc1 wc1Var = (wc1) this.c;
                int i34 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                HashMap hashMap = wc1Var.e;
                WallpapersListActivity wallpapersListActivity = wc1Var.E;
                ArrayList arrayList3 = wc1Var.d;
                if (i34 == wc1Var.w) {
                    wc1Var.s = 0;
                    int size = arrayList3.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        wc1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i35 = 0;
                        while (i35 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i35);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                org.telegram.messenger.kf kfVar = new org.telegram.messenger.kf();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                                    z10 = z11;
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(botInlineResult.photo.sizes, org.telegram.messenger.qs.r5, false, null, false);
                                    if (w10 != null) {
                                        kfVar.E = w10.w;
                                        kfVar.F = w10.h;
                                        kfVar.L = w10;
                                        kfVar.K = botInlineResult.photo;
                                        kfVar.G = w10.size;
                                        kfVar.M = w11;
                                        kfVar.B = botInlineResult.id;
                                        kfVar.H = 0;
                                        arrayList3.add(kfVar);
                                        hashMap.put(kfVar.B, kfVar);
                                    }
                                } else {
                                    z10 = z11;
                                    if (botInlineResult.content != null) {
                                        int i36 = 0;
                                        while (true) {
                                            if (i36 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i36);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    kfVar.E = documentAttribute.w;
                                                    kfVar.F = documentAttribute.h;
                                                } else {
                                                    i36++;
                                                }
                                            }
                                        }
                                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            kfVar.D = webDocument.url;
                                        } else {
                                            kfVar.D = null;
                                        }
                                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                        kfVar.C = webDocument2.url;
                                        kfVar.G = webDocument2.size;
                                        kfVar.B = botInlineResult.id;
                                        kfVar.H = 0;
                                        arrayList3.add(kfVar);
                                        hashMap.put(kfVar.B, kfVar);
                                    }
                                }
                            } else {
                                z10 = z11;
                            }
                            i35++;
                            z11 = z10;
                        }
                        wc1Var.f = (size == arrayList3.size() || wc1Var.r == null) ? z11 : false;
                    }
                    if (size != arrayList3.size()) {
                        int i37 = size % wallpapersListActivity.N;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / r3);
                        if (i37 != 0) {
                            wc1Var.g(((int) Math.ceil(f10 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.H.o(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.N)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    break;
                }
                break;
            case 20:
                ((View) this.d).postOnAnimation(new org.telegram.ui.Wallet.f2((org.telegram.ui.Components.bx) this.c, this.b, 5));
                break;
            case 21:
                q2.j jVar = (q2.j) this.c;
                this.d.N(jVar.a, jVar.b, this.b);
                break;
            case 22:
                sg.j0 j0Var = (sg.j0) this.c;
                j0Var.e((sg.y0) this.d, this.b, j0Var.h);
                j0Var.h = null;
                break;
            case 23:
                tg.g0 g0Var = (tg.g0) this.c;
                sg.g gVar = (sg.g) this.d;
                int i38 = this.b;
                if (g0Var.F0.getCurrentBrush() instanceof sg.g) {
                    g0Var.T0 = true;
                }
                g0Var.w(gVar);
                tg.h1 h1Var = g0Var.c1;
                int i39 = h1Var.d + 1;
                h1Var.a(i39);
                org.telegram.messenger.g0.R3(h1Var.a[i39], i38);
                h1Var.e = true;
                break;
            case 24:
                ((u4.c) ((qe.h) this.c).c).l0(this.b, this.d);
                break;
            default:
                org.telegram.ui.Components.up0 up0Var = (org.telegram.ui.Components.up0) this.c;
                int i40 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                bi.t9 t9Var = up0Var.e;
                if (i40 != -1) {
                    int i41 = tL_starGiftCollection.collection_id;
                    int i42 = t9Var.a;
                    int f11 = t9Var.f(i41);
                    if (f11 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) t9Var.e.remove(f11);
                        t9Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = org.telegram.messenger.qp.s1(i42).j1(t9Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i42).sendRequest(deletestargiftcollection, null);
                    }
                    up0Var.f(true);
                    org.telegram.ui.Components.u61 u61Var = up0Var.n;
                    if (i40 < t9Var.d().size()) {
                        i40++;
                    }
                    u61Var.d(-1, i40);
                    up0Var.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h10(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ h10(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
