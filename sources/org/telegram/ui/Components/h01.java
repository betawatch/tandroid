package org.telegram.ui.Components;

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.i81;
import org.telegram.ui.uc1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h01(int i7, org.telegram.ui.Wallet.w4 w4Var, org.telegram.ui.Wallet.u0 u0Var) {
        this.a = 18;
        this.b = i7;
        this.c = w4Var;
        this.d = u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x059e  */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Object, q2.k] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        String str;
        PackageInfo packageInfo;
        boolean z10;
        FrameLayout frameLayout;
        String str2;
        lc b02;
        int i10;
        int i11;
        String str3 = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new kp0((j01) this.c, (kp) this.d, this.b, org.telegram.messenger.mz.c(org.telegram.messenger.g0.p, R.raw.default_pattern, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(140.0f), -16777216, 1), 6));
                break;
            case 1:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.c;
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.d;
                int i13 = this.b;
                HashMap hashMap = g21.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(g21.p(fjVar)));
                }
                if (m1Var != null) {
                    m1Var.h0(3);
                }
                org.telegram.messenger.ks.f(i13).k(org.telegram.messenger.ks.A1, fjVar);
                org.telegram.messenger.ks.f(i13).k(org.telegram.messenger.ks.E1, new Object[0]);
                break;
            case 2:
                org.telegram.ui.gw gwVar = (org.telegram.ui.gw) this.c;
                int i14 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                org.telegram.ui.cx cxVar = gwVar.k0;
                ArrayList arrayList = cxVar.T1;
                if (arrayList != null && i14 >= 0 && i14 < arrayList.size()) {
                    cxVar.T1.add(i14, dialog);
                    cxVar.f0[0].q(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ax axVar = (org.telegram.ui.ax) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i15 = this.b;
                org.telegram.ui.bx bxVar = axVar.g;
                org.telegram.ui.cx cxVar2 = axVar.h;
                cxVar2.U1 = true;
                cxVar2.getMessagesController().d(0, i15, dialog2.id);
                cxVar2.U1 = false;
                ArrayList Y0 = cxVar2.getMessagesController().Y0(0);
                int indexOf = Y0.indexOf(dialog2);
                if (indexOf < 0) {
                    bxVar.q(false);
                    break;
                } else {
                    ArrayList Y02 = cxVar2.getMessagesController().Y0(1);
                    if (!Y02.isEmpty() || indexOf != 1) {
                        cxVar2.U4(true, true);
                        bxVar.y.D();
                        bxVar.q(true);
                        cxVar2.z3();
                    }
                    if (Y02.isEmpty()) {
                        Y0.remove(0);
                        if (indexOf != 1) {
                            if (!cxVar2.T1.isEmpty()) {
                                cxVar2.T1.remove(0);
                            }
                            bxVar.y.D();
                            bxVar.q(true);
                            break;
                        } else {
                            cxVar2.U4(true, true);
                            bxVar.q(true);
                            cxVar2.z3();
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) this.c;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
                int i16 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new di.z(f40Var, i16, 6));
                    u1VarArr[0].show();
                    break;
                }
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i17 = this.b;
                String str4 = LaunchActivity.C1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.bz.j1;
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
                        i7 = org.telegram.messenger.bz.d();
                    }
                    if (str3 == null) {
                        str3 = org.telegram.messenger.s2.c;
                    }
                    str = tL_help_appUpdate.version;
                    if (str == null && !org.telegram.messenger.bz.U(str3, str)) {
                        org.telegram.messenger.bz.j1 = tL_help_appUpdate;
                        org.telegram.messenger.bz.k1 = i7;
                        org.telegram.messenger.bz.y();
                        if (tL_help_appUpdate.can_not_skip) {
                            launchActivity.M0(i17, tL_help_appUpdate, false);
                        } else {
                            org.telegram.messenger.t0.u();
                            boolean z11 = org.telegram.messenger.s2.a;
                            org.telegram.messenger.t0.a.getClass();
                        }
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.T4, new Object[0]);
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.sh shVar = (org.telegram.ui.sh) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i18 = this.b;
                if (tLObject instanceof TLRPC.User) {
                    shVar.a = (TLRPC.User) tLObject;
                    org.telegram.messenger.mp.u1(i18).e4(shVar.a, false, false);
                }
                wz wzVar = shVar.c;
                k80 k80Var = shVar.b;
                shVar.setEnabled(shVar.a != null);
                TLRPC.User user = shVar.a;
                if (user != null) {
                    k80Var.setText(org.telegram.messenger.g0.x2(org.telegram.messenger.gd.a0(null, null, 2131748407, org.telegram.messenger.o10.q(user)), new bi.y3(shVar, user.id, 29)));
                }
                k80Var.animate().alpha(1.0f).setDuration(220L).start();
                wzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.on(wzVar)).start();
                break;
            case 7:
                org.telegram.ui.hk0.c0((org.telegram.ui.hk0) this.c, (org.telegram.messenger.yv) this.d, this.b);
                break;
            case 8:
                org.telegram.ui.ml0 ml0Var = (org.telegram.ui.ml0) this.c;
                int i19 = this.b;
                Intent intent = (Intent) this.d;
                if (i19 != -1) {
                    z10 = true;
                    if (i19 == 1) {
                        int i20 = y8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        org.telegram.messenger.a8.d(sb2.toString());
                    }
                    ml0Var.N0(z10, false);
                    ml0Var.J0(false);
                    frameLayout = ml0Var.Q;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<y8.i> creator = y8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    y8.i iVar = (y8.i) (byteArrayExtra != null ? c8.cc.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str2 = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (ml0Var.L0 == null && ml0Var.N0 == null) {
                                org.telegram.ui.nd0 a10 = c8.bd.a(string);
                                ml0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a10.b, (String) a10.d);
                                uc.a aVar = (uc.a) a10.c;
                                ml0Var.y0 = aVar.a() + " *" + aVar.b();
                                ml0Var.z0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            ml0Var.K0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            ml0Var.K0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                ml0Var.y0 = "Android Pay";
                            } else {
                                ml0Var.y0 = optString;
                            }
                            ml0Var.z0();
                        } catch (JSONException e12) {
                            z10 = true;
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    }
                }
                z10 = true;
                ml0Var.N0(z10, false);
                ml0Var.J0(false);
                frameLayout = ml0Var.Q;
                if (frameLayout == null) {
                }
                break;
            case 9:
                org.telegram.ui.pq0 pq0Var = (org.telegram.ui.pq0) this.c;
                Uri uri = (Uri) this.d;
                int i21 = this.b;
                pq0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i22 = org.telegram.messenger.j10.t0;
                    Point point = org.telegram.messenger.g0.q;
                    b6 b6Var = new b6(file, true, 0L, 0, null, null, null, 0L, i22, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = b6Var.q(0L, false);
                    b6Var.u();
                    org.telegram.messenger.g0.g3(new h01(pq0Var, i21, q10, 10));
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.g3(new org.telegram.ui.if0(pq0Var, 26));
                    return;
                }
            case 10:
                org.telegram.ui.pq0 pq0Var2 = (org.telegram.ui.pq0) this.c;
                int i23 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i23 == pq0Var2.a) {
                    pq0Var2.setImageBitmap(bitmap);
                    pq0Var2.c = true;
                    pq0Var2.b = false;
                    break;
                }
                break;
            case 11:
                org.telegram.ui.as0 as0Var = (org.telegram.ui.as0) this.c;
                org.telegram.ui.me meVar = (org.telegram.ui.me) this.d;
                int i24 = this.b;
                meVar.a(Integer.valueOf(i24));
                as0Var.c(i24 == 1 || i24 == 13);
                break;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i25 = this.b;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g(str5);
                if (i25 == profileActivity.X2) {
                    b02 = lc.b0(profileActivity);
                    i10 = 2131753719;
                } else {
                    b02 = lc.b0(profileActivity);
                    i10 = 2131743959;
                }
                org.telegram.messenger.n10.t(null, i10, b02);
                break;
            case 13:
                org.telegram.ui.lw0 lw0Var = (org.telegram.ui.lw0) this.c;
                v4.f1 f1Var = (v4.f1) this.d;
                int i26 = this.b;
                lw0Var.getClass();
                if (f1Var.b() == i26 && lw0Var.e.V2 == i26 && f1Var.f == 2) {
                    lw0Var.t(f1Var, i26);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.c;
                int i27 = this.b;
                dw dwVar = (dw) this.d;
                lc.b0(h2Var).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                org.telegram.messenger.mp.u1(i27).p0(false);
                org.telegram.messenger.g0.g3(dwVar);
                break;
            case 15:
                org.telegram.messenger.video.a aVar2 = (org.telegram.messenger.video.a) this.c;
                lc lcVar = (lc) this.d;
                int i28 = this.b;
                aVar2.run();
                lcVar.c(org.telegram.messenger.gd.M0(2131754486, null)).j();
                org.telegram.messenger.mp.u1(i28).p0(false);
                break;
            case 16:
                i81 i81Var = (i81) this.c;
                org.telegram.ui.me meVar2 = (org.telegram.ui.me) this.d;
                int i29 = this.b;
                meVar2.a(Integer.valueOf(i29));
                i81Var.c(i29 == 1 || i29 == 13);
                break;
            case 17:
                org.telegram.ui.Wallet.h1 h1Var = (org.telegram.ui.Wallet.h1) this.c;
                rc.u uVar = (rc.u) this.d;
                int i30 = this.b;
                org.telegram.ui.Wallet.i1 i1Var = h1Var.c;
                if (i1Var.c(uVar, i30)) {
                    i1Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 18:
                int i31 = this.b;
                org.telegram.ui.Wallet.w4 w4Var = (org.telegram.ui.Wallet.w4) this.c;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i31);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new d3.b(i12), new org.telegram.ui.Wallet.j(w4Var, u0Var, connectionsManager));
                break;
            case 19:
                Context context = (Context) this.c;
                int i32 = this.b;
                String str6 = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str6)) {
                    String str7 = org.telegram.messenger.mp.u1(i32).K6;
                    if (TextUtils.isEmpty(str7)) {
                        str7 = "https://tonviewer.com/";
                    } else if (!str7.endsWith("/")) {
                        str7 = str7.concat("/");
                    }
                    StringBuilder n10 = p5.c.n(str7, "transaction/");
                    n10.append(Uri.encode(str6));
                    vf.c.v(context, n10.toString(), false);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Wallet.p6 p6Var = (org.telegram.ui.Wallet.p6) this.c;
                int i33 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (p6Var.f0 == i33) {
                    p6Var.f(bitmapArr);
                    p6Var.a.run();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) this.c;
                int i34 = this.b;
                org.telegram.ui.Wallet.db dbVar = (org.telegram.ui.Wallet.db) this.d;
                int i35 = i34 + 1;
                ArrayList arrayList2 = u8Var.w;
                if (i35 >= arrayList2.size()) {
                    org.telegram.messenger.g0.v1(dbVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.db) arrayList2.get(i35)).a.requestFocus();
                    break;
                }
            case 22:
                org.telegram.ui.Wallet.va vaVar = (org.telegram.ui.Wallet.va) this.c;
                int i36 = this.b;
                org.telegram.ui.Wallet.db dbVar2 = (org.telegram.ui.Wallet.db) this.d;
                int i37 = i36 + 1;
                ArrayList arrayList3 = vaVar.d;
                if (i37 >= arrayList3.size()) {
                    org.telegram.messenger.g0.v1(dbVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.db) arrayList3.get(i37)).a.requestFocus();
                    break;
                }
            case 23:
                uc1 uc1Var = (uc1) this.c;
                int i38 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                HashMap hashMap2 = uc1Var.e;
                WallpapersListActivity wallpapersListActivity = uc1Var.F;
                ArrayList arrayList4 = uc1Var.d;
                if (i38 == uc1Var.w) {
                    uc1Var.s = 0;
                    int size = arrayList4.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        uc1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i39 = 0;
                        while (i39 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i39);
                            if ("photo".equals(botInlineResult.type) && !hashMap2.containsKey(botInlineResult.id)) {
                                org.telegram.messenger.hf hfVar = new org.telegram.messenger.hf();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                                    i11 = i12;
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(botInlineResult.photo.sizes, org.telegram.messenger.ks.r5, false, null, false);
                                    if (w10 != null) {
                                        hfVar.E = w10.w;
                                        hfVar.F = w10.h;
                                        hfVar.L = w10;
                                        hfVar.K = botInlineResult.photo;
                                        hfVar.G = w10.size;
                                        hfVar.M = w11;
                                        hfVar.B = botInlineResult.id;
                                        hfVar.H = 0;
                                        arrayList4.add(hfVar);
                                        hashMap2.put(hfVar.B, hfVar);
                                    }
                                } else {
                                    i11 = i12;
                                    if (botInlineResult.content != null) {
                                        int i40 = 0;
                                        while (true) {
                                            if (i40 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i40);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    hfVar.E = documentAttribute.w;
                                                    hfVar.F = documentAttribute.h;
                                                } else {
                                                    i40++;
                                                }
                                            }
                                        }
                                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            hfVar.D = webDocument.url;
                                        } else {
                                            hfVar.D = null;
                                        }
                                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                        hfVar.C = webDocument2.url;
                                        hfVar.G = webDocument2.size;
                                        hfVar.B = botInlineResult.id;
                                        hfVar.H = 0;
                                        arrayList4.add(hfVar);
                                        hashMap2.put(hfVar.B, hfVar);
                                    }
                                }
                            } else {
                                i11 = i12;
                            }
                            i39++;
                            i12 = i11;
                        }
                        uc1Var.f = (size == arrayList4.size() || uc1Var.r == null) ? i12 : 0;
                    }
                    if (size != arrayList4.size()) {
                        int i41 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / r3);
                        if (i41 != 0) {
                            uc1Var.g(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.I.o(ceil, ((int) Math.ceil(arrayList4.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.L.c();
                    break;
                }
                break;
            case 24:
                ((View) this.d).postOnAnimation(new org.telegram.ui.jw0((mx) this.c, this.b, 11));
                break;
            case 25:
                q2.j jVar = (q2.j) this.c;
                this.d.N(jVar.a, jVar.b, this.b);
                break;
            case 26:
                sg.i0 i0Var = (sg.i0) this.c;
                i0Var.e((sg.x0) this.d, this.b, i0Var.h);
                i0Var.h = null;
                break;
            case 27:
                tg.g0 g0Var = (tg.g0) this.c;
                sg.g gVar = (sg.g) this.d;
                int i42 = this.b;
                if (g0Var.G0.getCurrentBrush() instanceof sg.g) {
                    g0Var.U0 = true;
                }
                g0Var.w(gVar);
                tg.h1 h1Var2 = g0Var.d1;
                int i43 = h1Var2.d + 1;
                h1Var2.a(i43);
                org.telegram.messenger.g0.P3(h1Var2.a[i43], i42);
                h1Var2.e = true;
                break;
            default:
                ((u4.c) ((qe.h) this.c).c).C(this.b, this.d);
                break;
        }
    }

    public /* synthetic */ h01(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ h01(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
