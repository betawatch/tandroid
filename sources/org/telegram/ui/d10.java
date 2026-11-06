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
import java.nio.charset.StandardCharsets;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d10(int i7, org.telegram.messenger.c20 c20Var, org.telegram.ui.Wallet.n0 n0Var) {
        this.a = 14;
        this.b = i7;
        this.c = c20Var;
        this.d = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06df  */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.Object, q2.k] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        String str;
        boolean z9;
        FrameLayout frameLayout;
        String str2;
        org.telegram.ui.Components.hc a02;
        int i10;
        boolean z10;
        org.telegram.utils.twidget.u uVar;
        int i11 = 6;
        String str3 = null;
        boolean z11 = true;
        char c10 = 1;
        switch (this.a) {
            case 0:
                c40 c40Var = (c40) this.c;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) this.d;
                int i12 = this.b;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new bi.g0(c40Var, i12, i11));
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
                        PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                        i7 = packageInfo.versionCode;
                        try {
                            str3 = packageInfo.versionName;
                        } catch (Exception e10) {
                            e = e10;
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
                    } catch (Exception e11) {
                        e = e11;
                        i7 = 0;
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
                th thVar = (th) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i14 = this.b;
                if (tLObject instanceof TLRPC.User) {
                    thVar.a = (TLRPC.User) tLObject;
                    org.telegram.messenger.qp.s1(i14).X3(thVar.a, false, false);
                }
                org.telegram.ui.Components.lz lzVar = thVar.c;
                org.telegram.ui.Components.w70 w70Var = thVar.b;
                thVar.setEnabled(thVar.a != null);
                TLRPC.User user = thVar.a;
                if (user != null) {
                    w70Var.setText(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.a0(null, null, 2131748598, org.telegram.messenger.t10.p(user)), new bi.r3(thVar, user.id, 28)));
                }
                w70Var.animate().alpha(1.0f).setDuration(220L).start();
                lzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(lzVar)).start();
                break;
            case 3:
                bk0.c0((bk0) this.c, (org.telegram.messenger.ew) this.d, this.b);
                break;
            case 4:
                hl0 hl0Var = (hl0) this.c;
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
                    hl0Var.N0(z9, false);
                    hl0Var.J0(false);
                    frameLayout = hl0Var.P;
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
                            if (hl0Var.K0 == null && hl0Var.M0 == null) {
                                hy0 a10 = c8.yc.a(string);
                                hl0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a10.c, (String) a10.b);
                                uc.a aVar = (uc.a) a10.d;
                                hl0Var.x0 = aVar.a() + " *" + aVar.b();
                                hl0Var.z0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            hl0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            hl0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                hl0Var.x0 = "Android Pay";
                            } else {
                                hl0Var.x0 = optString;
                            }
                            hl0Var.z0();
                        } catch (JSONException e12) {
                            z9 = true;
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    }
                }
                z9 = true;
                hl0Var.N0(z9, false);
                hl0Var.J0(false);
                frameLayout = hl0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 5:
                oq0 oq0Var = (oq0) this.c;
                Uri uri = (Uri) this.d;
                int i17 = this.b;
                oq0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i18 = org.telegram.messenger.p10.s0;
                    Point point = org.telegram.messenger.g0.q;
                    org.telegram.ui.Components.v5 v5Var = new org.telegram.ui.Components.v5(file, true, 0L, 0, null, null, null, 0L, i18, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = v5Var.q(0L, false);
                    v5Var.u();
                    org.telegram.messenger.g0.h3(new d10(oq0Var, i17, q10, i11));
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new ef0(oq0Var, 26));
                    return;
                }
            case 6:
                oq0 oq0Var2 = (oq0) this.c;
                int i19 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i19 == oq0Var2.a) {
                    oq0Var2.setImageBitmap(bitmap);
                    oq0Var2.c = true;
                    oq0Var2.b = false;
                    break;
                }
                break;
            case 7:
                zr0 zr0Var = (zr0) this.c;
                ne neVar = (ne) this.d;
                int i20 = this.b;
                neVar.a(Integer.valueOf(i20));
                zr0Var.c(i20 == 1 || i20 == 13);
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i21 = this.b;
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.g0.g(str5);
                if (i21 == profileActivity.V2) {
                    a02 = org.telegram.ui.Components.hc.a0(profileActivity);
                    i10 = 2131753721;
                } else {
                    a02 = org.telegram.ui.Components.hc.a0(profileActivity);
                    i10 = 2131744195;
                }
                org.telegram.messenger.camera.q.r(null, i10, a02);
                break;
            case 9:
                jw0 jw0Var = (jw0) this.c;
                v4.d1 d1Var = (v4.d1) this.d;
                int i22 = this.b;
                jw0Var.getClass();
                if (d1Var.b() == i22 && jw0Var.e.T2 == i22 && d1Var.f == 2) {
                    jw0Var.t(d1Var, i22);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                int i23 = this.b;
                org.telegram.ui.Components.v80 v80Var = (org.telegram.ui.Components.v80) this.d;
                org.telegram.ui.Components.hc.a0(f2Var).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i23).o0(false);
                org.telegram.messenger.g0.h3(v80Var);
                break;
            case 11:
                org.telegram.messenger.video.a aVar2 = (org.telegram.messenger.video.a) this.c;
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) this.d;
                int i24 = this.b;
                aVar2.run();
                hcVar.c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                org.telegram.messenger.qp.s1(i24).o0(false);
                break;
            case 12:
                f81 f81Var = (f81) this.c;
                ne neVar2 = (ne) this.d;
                int i25 = this.b;
                neVar2.a(Integer.valueOf(i25));
                f81Var.c(i25 == 1 || i25 == 13);
                break;
            case 13:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.c;
                rc.u uVar2 = (rc.u) this.d;
                int i26 = this.b;
                org.telegram.ui.Wallet.a1 a1Var = z0Var.c;
                if (a1Var.c(uVar2, i26)) {
                    a1Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 14:
                int i27 = this.b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.c;
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i27);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new d3.b(c10 == true ? 1 : 0), new org.telegram.ui.Wallet.j(c20Var, n0Var, connectionsManager));
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
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.c;
                int i29 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (z5Var.f0 == i29) {
                    z5Var.f(bitmapArr);
                    z5Var.a.run();
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Wallet.f8 f8Var = (org.telegram.ui.Wallet.f8) this.c;
                int i30 = this.b;
                org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) this.d;
                int i31 = i30 + 1;
                ArrayList arrayList = f8Var.w;
                if (i31 >= arrayList.size()) {
                    org.telegram.messenger.g0.v1(oaVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.oa) arrayList.get(i31)).a.requestFocus();
                    break;
                }
            case 18:
                org.telegram.ui.Wallet.fa faVar = (org.telegram.ui.Wallet.fa) this.c;
                int i32 = this.b;
                org.telegram.ui.Wallet.oa oaVar2 = (org.telegram.ui.Wallet.oa) this.d;
                int i33 = i32 + 1;
                ArrayList arrayList2 = faVar.d;
                if (i33 >= arrayList2.size()) {
                    org.telegram.messenger.g0.v1(oaVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.oa) arrayList2.get(i33)).a.requestFocus();
                    break;
                }
            case 19:
                rc1 rc1Var = (rc1) this.c;
                int i34 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                HashMap hashMap = rc1Var.e;
                WallpapersListActivity wallpapersListActivity = rc1Var.E;
                ArrayList arrayList3 = rc1Var.d;
                if (i34 == rc1Var.w) {
                    rc1Var.s = 0;
                    int size = arrayList3.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        rc1Var.r = messages_botresults.next_offset;
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
                        rc1Var.f = (size == arrayList3.size() || rc1Var.r == null) ? z11 : false;
                    }
                    if (size != arrayList3.size()) {
                        int i37 = size % wallpapersListActivity.N;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / r3);
                        if (i37 != 0) {
                            rc1Var.g(((int) Math.ceil(f10 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.H.o(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.N)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    break;
                }
                break;
            case 20:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.c;
                int i38 = this.b;
                String str8 = (String) this.d;
                if (!h0Var.u && (uVar = h0Var.J) != null) {
                    if (i38 == 13) {
                        if (uVar.e != null && !TextUtils.isEmpty(str8)) {
                            org.telegram.messenger.g0.g(str8);
                            org.telegram.ui.ActionBar.f2 T = org.telegram.messenger.g0.I3() ? LaunchActivity.T() : null;
                            if (T != null) {
                                if (str8.length() > 80) {
                                    str8 = str8.substring(0, 80) + "…";
                                }
                                org.telegram.ui.Components.hc.a0(T).Q(R.raw.copy, 36, org.telegram.messenger.hd.a0(null, null, 2131742867, str8)).j();
                                break;
                            }
                        }
                    } else if (i38 == 14) {
                        boolean equals = "1".equals(str8);
                        if (uVar.A != equals) {
                            uVar.A = equals;
                            if (uVar.e != null) {
                                org.telegram.utils.twidget.p.C();
                                break;
                            }
                        }
                    } else {
                        try {
                            JSONObject jSONObject3 = new JSONObject(str8);
                            if (i38 != 19) {
                                org.telegram.utils.twidget.u uVar3 = h0Var.J;
                                long j10 = jSONObject3.getLong("id");
                                String string2 = jSONObject3.getString("data");
                                boolean optBoolean = jSONObject3.optBoolean("wallet");
                                if (uVar3.e == null) {
                                    uVar3.a(3, null, j10);
                                    break;
                                } else {
                                    org.telegram.utils.twidget.m h = org.telegram.utils.twidget.p.h(uVar3);
                                    if (h != null && h.i && (!optBoolean || org.telegram.utils.twidget.p.D(h))) {
                                        TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                                        tL_widgetQueryTypeData.with_wallet = optBoolean;
                                        org.telegram.utils.twidget.p.u(h, uVar3, j10, tL_widgetQueryTypeData, string2.getBytes(StandardCharsets.UTF_8));
                                        break;
                                    }
                                    uVar3.a(3, null, j10);
                                }
                            } else {
                                h0Var.J.i(jSONObject3.getLong("id"), jSONObject3.getJSONObject("call"));
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 21:
                ((View) this.d).postOnAnimation(new org.telegram.ui.Wallet.h2((org.telegram.ui.Components.bx) this.c, this.b, i11));
                break;
            case 22:
                q2.j jVar = (q2.j) this.c;
                this.d.N(jVar.a, jVar.b, this.b);
                break;
            case 23:
                sg.j0 j0Var = (sg.j0) this.c;
                j0Var.e((sg.z0) this.d, this.b, j0Var.h);
                j0Var.h = null;
                break;
            case 24:
                tg.g0 g0Var = (tg.g0) this.c;
                sg.g gVar = (sg.g) this.d;
                int i39 = this.b;
                if (g0Var.F0.getCurrentBrush() instanceof sg.g) {
                    g0Var.T0 = true;
                }
                g0Var.w(gVar);
                tg.h1 h1Var = g0Var.c1;
                int i40 = h1Var.d + 1;
                h1Var.a(i40);
                org.telegram.messenger.g0.R3(h1Var.a[i40], i39);
                h1Var.e = true;
                break;
            case 25:
                ((u4.c) ((qe.h) this.c).c).l0(this.b, this.d);
                break;
            default:
                org.telegram.ui.Components.up0 up0Var = (org.telegram.ui.Components.up0) this.c;
                int i41 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                bi.t9 t9Var = up0Var.e;
                if (i41 != -1) {
                    int i42 = tL_starGiftCollection.collection_id;
                    int i43 = t9Var.a;
                    int f11 = t9Var.f(i42);
                    if (f11 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) t9Var.e.remove(f11);
                        t9Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = org.telegram.messenger.qp.s1(i43).j1(t9Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i43).sendRequest(deletestargiftcollection, null);
                    }
                    up0Var.f(true);
                    org.telegram.ui.Components.u61 u61Var = up0Var.n;
                    if (i41 < t9Var.d().size()) {
                        i41++;
                    }
                    u61Var.d(-1, i41);
                    up0Var.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d10(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ d10(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
