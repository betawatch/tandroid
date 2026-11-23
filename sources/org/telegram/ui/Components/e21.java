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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.sc1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e21(int i7, org.telegram.ui.Wallet.x4 x4Var, org.telegram.ui.Wallet.v0 v0Var) {
        this.a = 17;
        this.b = i7;
        this.c = x4Var;
        this.d = v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x059c  */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.Object, q2.k] */
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
        kc b02;
        int i10;
        int i11;
        int i12 = 13;
        String str3 = null;
        int i13 = 1;
        switch (this.a) {
            case 0:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.c;
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.d;
                int i14 = this.b;
                HashMap hashMap = i21.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(i21.r(fjVar)));
                }
                if (m1Var != null) {
                    m1Var.m0(3);
                }
                org.telegram.messenger.ks.f(i14).k(org.telegram.messenger.ks.A1, fjVar);
                org.telegram.messenger.ks.f(i14).k(org.telegram.messenger.ks.E1, new Object[0]);
                break;
            case 1:
                org.telegram.ui.fw fwVar = (org.telegram.ui.fw) this.c;
                int i15 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                org.telegram.ui.bx bxVar = fwVar.k0;
                ArrayList arrayList = bxVar.T1;
                if (arrayList != null && i15 >= 0 && i15 < arrayList.size()) {
                    bxVar.T1.add(i15, dialog);
                    bxVar.f0[0].q(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.zw zwVar = (org.telegram.ui.zw) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i16 = this.b;
                org.telegram.ui.ax axVar = zwVar.g;
                org.telegram.ui.bx bxVar2 = zwVar.h;
                bxVar2.U1 = true;
                bxVar2.getMessagesController().d(0, i16, dialog2.id);
                bxVar2.U1 = false;
                ArrayList Y0 = bxVar2.getMessagesController().Y0(0);
                int indexOf = Y0.indexOf(dialog2);
                if (indexOf < 0) {
                    axVar.q(false);
                    break;
                } else {
                    ArrayList Y02 = bxVar2.getMessagesController().Y0(1);
                    if (!Y02.isEmpty() || indexOf != 1) {
                        bxVar2.U4(true, true);
                        axVar.y.D();
                        axVar.q(true);
                        bxVar2.z3();
                    }
                    if (Y02.isEmpty()) {
                        Y0.remove(0);
                        if (indexOf != 1) {
                            if (!bxVar2.T1.isEmpty()) {
                                bxVar2.T1.remove(0);
                            }
                            axVar.y.D();
                            axVar.q(true);
                            break;
                        } else {
                            bxVar2.U4(true, true);
                            axVar.q(true);
                            bxVar2.z3();
                            break;
                        }
                    }
                }
                break;
            case 3:
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) this.c;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
                int i17 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    t1Var.setOnCancelListener(new di.z(e40Var, i17, 6));
                    t1VarArr[0].show();
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i18 = this.b;
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
                            launchActivity.M0(i18, tL_help_appUpdate, false);
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
            case 5:
                org.telegram.ui.th thVar = (org.telegram.ui.th) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i19 = this.b;
                if (tLObject instanceof TLRPC.User) {
                    thVar.a = (TLRPC.User) tLObject;
                    org.telegram.messenger.mp.u1(i19).e4(thVar.a, false, false);
                }
                vz vzVar = thVar.c;
                j80 j80Var = thVar.b;
                thVar.setEnabled(thVar.a != null);
                TLRPC.User user = thVar.a;
                if (user != null) {
                    j80Var.setText(org.telegram.messenger.g0.x2(org.telegram.messenger.gd.a0(null, null, 2131748406, org.telegram.messenger.n10.q(user)), new bi.e4(thVar, user.id, 29)));
                }
                j80Var.animate().alpha(1.0f).setDuration(220L).start();
                vzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.on(vzVar)).start();
                break;
            case 6:
                org.telegram.ui.fk0.c0((org.telegram.ui.fk0) this.c, (org.telegram.messenger.yv) this.d, this.b);
                break;
            case 7:
                org.telegram.ui.kl0 kl0Var = (org.telegram.ui.kl0) this.c;
                int i20 = this.b;
                Intent intent = (Intent) this.d;
                if (i20 != -1) {
                    z10 = true;
                    if (i20 == 1) {
                        int i21 = y8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        org.telegram.messenger.a8.d(sb2.toString());
                    }
                    kl0Var.N0(z10, false);
                    kl0Var.J0(false);
                    frameLayout = kl0Var.Q;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<y8.i> creator = y8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    y8.i iVar = (y8.i) (byteArrayExtra != null ? c8.dc.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str2 = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (kl0Var.L0 == null && kl0Var.N0 == null) {
                                i61 a10 = c8.dd.a(string);
                                kl0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a10.c, (String) a10.b);
                                uc.a aVar = (uc.a) a10.d;
                                kl0Var.y0 = aVar.a() + " *" + aVar.b();
                                kl0Var.z0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            kl0Var.K0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            kl0Var.K0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                kl0Var.y0 = "Android Pay";
                            } else {
                                kl0Var.y0 = optString;
                            }
                            kl0Var.z0();
                        } catch (JSONException e12) {
                            z10 = true;
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    }
                }
                z10 = true;
                kl0Var.N0(z10, false);
                kl0Var.J0(false);
                frameLayout = kl0Var.Q;
                if (frameLayout == null) {
                }
                break;
            case 8:
                org.telegram.ui.pq0 pq0Var = (org.telegram.ui.pq0) this.c;
                Uri uri = (Uri) this.d;
                int i22 = this.b;
                pq0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i23 = org.telegram.messenger.i10.t0;
                    Point point = org.telegram.messenger.g0.q;
                    b6 b6Var = new b6(file, true, 0L, 0, null, null, null, 0L, i23, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = b6Var.q(0L, false);
                    b6Var.u();
                    org.telegram.messenger.g0.g3(new e21(pq0Var, i22, q10, 9));
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.g3(new org.telegram.ui.gf0(pq0Var, 26));
                    return;
                }
            case 9:
                org.telegram.ui.pq0 pq0Var2 = (org.telegram.ui.pq0) this.c;
                int i24 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i24 == pq0Var2.a) {
                    pq0Var2.setImageBitmap(bitmap);
                    pq0Var2.c = true;
                    pq0Var2.b = false;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.zr0 zr0Var = (org.telegram.ui.zr0) this.c;
                org.telegram.ui.me meVar = (org.telegram.ui.me) this.d;
                int i25 = this.b;
                meVar.a(Integer.valueOf(i25));
                zr0Var.c(i25 == 1 || i25 == 13);
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i26 = this.b;
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.g(str5);
                if (i26 == profileActivity.X2) {
                    b02 = kc.b0(profileActivity);
                    i10 = 2131753718;
                } else {
                    b02 = kc.b0(profileActivity);
                    i10 = 2131743949;
                }
                org.telegram.messenger.m10.t(null, i10, b02);
                break;
            case 12:
                org.telegram.ui.jw0 jw0Var = (org.telegram.ui.jw0) this.c;
                v4.f1 f1Var = (v4.f1) this.d;
                int i27 = this.b;
                jw0Var.getClass();
                if (f1Var.b() == i27 && jw0Var.e.V2 == i27 && f1Var.f == 2) {
                    jw0Var.t(f1Var, i27);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.c;
                int i28 = this.b;
                sh0 sh0Var = (sh0) this.d;
                kc.b0(g2Var).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                org.telegram.messenger.mp.u1(i28).p0(false);
                org.telegram.messenger.g0.g3(sh0Var);
                break;
            case 14:
                org.telegram.messenger.video.a aVar2 = (org.telegram.messenger.video.a) this.c;
                kc kcVar = (kc) this.d;
                int i29 = this.b;
                aVar2.run();
                kcVar.c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                org.telegram.messenger.mp.u1(i29).p0(false);
                break;
            case 15:
                org.telegram.ui.g81 g81Var = (org.telegram.ui.g81) this.c;
                org.telegram.ui.me meVar2 = (org.telegram.ui.me) this.d;
                int i30 = this.b;
                meVar2.a(Integer.valueOf(i30));
                g81Var.c(i30 == 1 || i30 == 13);
                break;
            case 16:
                org.telegram.ui.Wallet.i1 i1Var = (org.telegram.ui.Wallet.i1) this.c;
                rc.u uVar = (rc.u) this.d;
                int i31 = this.b;
                org.telegram.ui.Wallet.j1 j1Var = i1Var.c;
                if (j1Var.c(uVar, i31)) {
                    j1Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 17:
                int i32 = this.b;
                org.telegram.ui.Wallet.x4 x4Var = (org.telegram.ui.Wallet.x4) this.c;
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i32);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new d3.b(i13), new org.telegram.ui.Wallet.j(x4Var, v0Var, connectionsManager));
                break;
            case 18:
                Context context = (Context) this.c;
                int i33 = this.b;
                String str6 = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str6)) {
                    String str7 = org.telegram.messenger.mp.u1(i33).K6;
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
            case 19:
                org.telegram.ui.Wallet.q6 q6Var = (org.telegram.ui.Wallet.q6) this.c;
                int i34 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (q6Var.f0 == i34) {
                    q6Var.f(bitmapArr);
                    q6Var.a.run();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Wallet.v8 v8Var = (org.telegram.ui.Wallet.v8) this.c;
                int i35 = this.b;
                org.telegram.ui.Wallet.eb ebVar = (org.telegram.ui.Wallet.eb) this.d;
                int i36 = i35 + 1;
                ArrayList arrayList2 = v8Var.w;
                if (i36 >= arrayList2.size()) {
                    org.telegram.messenger.g0.v1(ebVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.eb) arrayList2.get(i36)).a.requestFocus();
                    break;
                }
            case 21:
                org.telegram.ui.Wallet.wa waVar = (org.telegram.ui.Wallet.wa) this.c;
                int i37 = this.b;
                org.telegram.ui.Wallet.eb ebVar2 = (org.telegram.ui.Wallet.eb) this.d;
                int i38 = i37 + 1;
                ArrayList arrayList3 = waVar.d;
                if (i38 >= arrayList3.size()) {
                    org.telegram.messenger.g0.v1(ebVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.eb) arrayList3.get(i38)).a.requestFocus();
                    break;
                }
            case 22:
                sc1 sc1Var = (sc1) this.c;
                int i39 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                HashMap hashMap2 = sc1Var.e;
                WallpapersListActivity wallpapersListActivity = sc1Var.F;
                ArrayList arrayList4 = sc1Var.d;
                if (i39 == sc1Var.w) {
                    sc1Var.s = 0;
                    int size = arrayList4.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        sc1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i40 = 0;
                        while (i40 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i40);
                            if ("photo".equals(botInlineResult.type) && !hashMap2.containsKey(botInlineResult.id)) {
                                org.telegram.messenger.hf hfVar = new org.telegram.messenger.hf();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                                    i11 = i13;
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
                                    i11 = i13;
                                    if (botInlineResult.content != null) {
                                        int i41 = 0;
                                        while (true) {
                                            if (i41 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i41);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    hfVar.E = documentAttribute.w;
                                                    hfVar.F = documentAttribute.h;
                                                } else {
                                                    i41++;
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
                                i11 = i13;
                            }
                            i40++;
                            i13 = i11;
                        }
                        sc1Var.f = (size == arrayList4.size() || sc1Var.r == null) ? i13 : 0;
                    }
                    if (size != arrayList4.size()) {
                        int i42 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / r3);
                        if (i42 != 0) {
                            sc1Var.g(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.I.o(ceil, ((int) Math.ceil(arrayList4.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.L.c();
                    break;
                }
                break;
            case 23:
                ((View) this.d).postOnAnimation(new org.telegram.ui.ao0((lx) this.c, this.b, i12));
                break;
            case 24:
                q2.j jVar = (q2.j) this.c;
                this.d.N(jVar.a, jVar.b, this.b);
                break;
            case 25:
                sg.h0 h0Var = (sg.h0) this.c;
                h0Var.e((sg.w0) this.d, this.b, h0Var.h);
                h0Var.h = null;
                break;
            case 26:
                tg.l0 l0Var = (tg.l0) this.c;
                sg.g gVar = (sg.g) this.d;
                int i43 = this.b;
                if (l0Var.G0.getCurrentBrush() instanceof sg.g) {
                    l0Var.U0 = true;
                }
                l0Var.w(gVar);
                tg.m1 m1Var2 = l0Var.d1;
                int i44 = m1Var2.d + 1;
                m1Var2.a(i44);
                org.telegram.messenger.g0.P3(m1Var2.a[i44], i43);
                m1Var2.e = true;
                break;
            default:
                ((u4.c) ((qe.h) this.c).c).E(this.b, this.d);
                break;
        }
    }

    public /* synthetic */ e21(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ e21(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
