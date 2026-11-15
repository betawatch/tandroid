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
import org.telegram.ui.e81;
import org.telegram.ui.nb1;
import org.telegram.ui.rc1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u11(int i7, org.telegram.messenger.z10 z10Var, org.telegram.ui.Wallet.l0 l0Var) {
        this.a = 17;
        this.b = i7;
        this.c = z10Var;
        this.d = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x059e  */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.Object, q2.l] */
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
        cc a02;
        int i10;
        int i11;
        String str3 = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.c;
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
                int i13 = this.b;
                HashMap hashMap = x11.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(x11.p(gjVar)));
                }
                if (l1Var != null) {
                    l1Var.e0(3);
                }
                org.telegram.messenger.ns.f(i13).k(org.telegram.messenger.ns.A1, gjVar);
                org.telegram.messenger.ns.f(i13).k(org.telegram.messenger.ns.E1, new Object[0]);
                break;
            case 1:
                org.telegram.ui.dw dwVar = (org.telegram.ui.dw) this.c;
                int i14 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                org.telegram.ui.yw ywVar = dwVar.k0;
                ArrayList arrayList = ywVar.T1;
                if (arrayList != null && i14 >= 0 && i14 < arrayList.size()) {
                    ywVar.T1.add(i14, dialog);
                    ywVar.f0[0].q(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ww wwVar = (org.telegram.ui.ww) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i15 = this.b;
                org.telegram.ui.xw xwVar = wwVar.g;
                org.telegram.ui.yw ywVar2 = wwVar.h;
                ywVar2.U1 = true;
                ywVar2.getMessagesController().d(0, i15, dialog2.id);
                ywVar2.U1 = false;
                ArrayList W0 = ywVar2.getMessagesController().W0(0);
                int indexOf = W0.indexOf(dialog2);
                if (indexOf < 0) {
                    xwVar.q(false);
                    break;
                } else {
                    ArrayList W02 = ywVar2.getMessagesController().W0(1);
                    if (!W02.isEmpty() || indexOf != 1) {
                        ywVar2.M4(true, true);
                        xwVar.y.D();
                        xwVar.q(true);
                        ywVar2.z3();
                    }
                    if (W02.isEmpty()) {
                        W0.remove(0);
                        if (indexOf != 1) {
                            if (!ywVar2.T1.isEmpty()) {
                                ywVar2.T1.remove(0);
                            }
                            xwVar.y.D();
                            xwVar.q(true);
                            break;
                        } else {
                            ywVar2.M4(true, true);
                            xwVar.q(true);
                            ywVar2.z3();
                            break;
                        }
                    }
                }
                break;
            case 3:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) this.c;
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
                int i16 = this.b;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    t1Var.setOnCancelListener(new di.z(c40Var, i16, 6));
                    t1VarArr[0].show();
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i17 = this.b;
                String str4 = LaunchActivity.C1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.gz.j1;
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
                        i7 = org.telegram.messenger.gz.d();
                    }
                    if (str3 == null) {
                        str3 = org.telegram.messenger.r2.c;
                    }
                    str = tL_help_appUpdate.version;
                    if (str == null && !org.telegram.messenger.gz.U(str3, str)) {
                        org.telegram.messenger.gz.j1 = tL_help_appUpdate;
                        org.telegram.messenger.gz.k1 = i7;
                        org.telegram.messenger.gz.y();
                        if (tL_help_appUpdate.can_not_skip) {
                            launchActivity.M0(i17, tL_help_appUpdate, false);
                        } else {
                            org.telegram.messenger.t0.u();
                            boolean z11 = org.telegram.messenger.r2.a;
                            org.telegram.messenger.t0.a.getClass();
                        }
                        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.Q4, new Object[0]);
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.th thVar = (org.telegram.ui.th) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i18 = this.b;
                if (tLObject instanceof TLRPC.User) {
                    thVar.a = (TLRPC.User) tLObject;
                    org.telegram.messenger.np.s1(i18).X3(thVar.a, false, false);
                }
                pz pzVar = thVar.c;
                z70 z70Var = thVar.b;
                thVar.setEnabled(thVar.a != null);
                TLRPC.User user = thVar.a;
                if (user != null) {
                    z70Var.setText(org.telegram.messenger.g0.x2(org.telegram.messenger.hd.a0(null, null, 2131748599, org.telegram.messenger.q10.p(user)), new di.x2(thVar, user.id, 28)));
                }
                z70Var.animate().alpha(1.0f).setDuration(220L).start();
                pzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.nn(pzVar)).start();
                break;
            case 6:
                org.telegram.ui.ek0.c0((org.telegram.ui.ek0) this.c, (org.telegram.messenger.cw) this.d, this.b);
                break;
            case 7:
                org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) this.c;
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
                    jl0Var.N0(z10, false);
                    jl0Var.J0(false);
                    frameLayout = jl0Var.Q;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<y8.i> creator = y8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    y8.i iVar = (y8.i) (byteArrayExtra != null ? c8.zb.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str2 = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (jl0Var.L0 == null && jl0Var.N0 == null) {
                                org.telegram.ui.ld0 a10 = c8.yc.a(string);
                                jl0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a10.b, (String) a10.d);
                                uc.a aVar = (uc.a) a10.c;
                                jl0Var.y0 = aVar.a() + " *" + aVar.b();
                                jl0Var.z0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            jl0Var.K0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            jl0Var.K0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                jl0Var.y0 = "Android Pay";
                            } else {
                                jl0Var.y0 = optString;
                            }
                            jl0Var.z0();
                        } catch (JSONException e12) {
                            z10 = true;
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    }
                }
                z10 = true;
                jl0Var.N0(z10, false);
                jl0Var.J0(false);
                frameLayout = jl0Var.Q;
                if (frameLayout == null) {
                }
                break;
            case 8:
                org.telegram.ui.nq0 nq0Var = (org.telegram.ui.nq0) this.c;
                Uri uri = (Uri) this.d;
                int i21 = this.b;
                nq0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i22 = org.telegram.messenger.m10.t0;
                    Point point = org.telegram.messenger.g0.q;
                    t5 t5Var = new t5(file, true, 0L, 0, null, null, null, 0L, i22, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = t5Var.q(0L, false);
                    t5Var.u();
                    org.telegram.messenger.g0.h3(new u11(nq0Var, i21, q10, 9));
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new org.telegram.ui.ef0(nq0Var, 26));
                    return;
                }
            case 9:
                org.telegram.ui.nq0 nq0Var2 = (org.telegram.ui.nq0) this.c;
                int i23 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i23 == nq0Var2.a) {
                    nq0Var2.setImageBitmap(bitmap);
                    nq0Var2.c = true;
                    nq0Var2.b = false;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.xr0 xr0Var = (org.telegram.ui.xr0) this.c;
                org.telegram.ui.ke keVar = (org.telegram.ui.ke) this.d;
                int i24 = this.b;
                keVar.a(Integer.valueOf(i24));
                xr0Var.c(i24 == 1 || i24 == 13);
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i25 = this.b;
                RectF rectF = ProfileActivity.X6;
                org.telegram.messenger.g0.g(str5);
                if (i25 == profileActivity.X2) {
                    a02 = cc.a0(profileActivity);
                    i10 = 2131753721;
                } else {
                    a02 = cc.a0(profileActivity);
                    i10 = 2131744194;
                }
                org.telegram.messenger.i20.s(null, i10, a02);
                break;
            case 12:
                org.telegram.ui.iw0 iw0Var = (org.telegram.ui.iw0) this.c;
                v4.e1 e1Var = (v4.e1) this.d;
                int i26 = this.b;
                iw0Var.getClass();
                if (e1Var.b() == i26 && iw0Var.e.V2 == i26 && e1Var.f == 2) {
                    iw0Var.t(e1Var, i26);
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                int i27 = this.b;
                hh0 hh0Var = (hh0) this.d;
                cc.a0(e2Var).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                org.telegram.messenger.np.s1(i27).o0(false);
                org.telegram.messenger.g0.h3(hh0Var);
                break;
            case 14:
                org.telegram.messenger.video.a aVar2 = (org.telegram.messenger.video.a) this.c;
                cc ccVar = (cc) this.d;
                int i28 = this.b;
                aVar2.run();
                ccVar.c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                org.telegram.messenger.np.s1(i28).o0(false);
                break;
            case 15:
                e81 e81Var = (e81) this.c;
                org.telegram.ui.ke keVar2 = (org.telegram.ui.ke) this.d;
                int i29 = this.b;
                keVar2.a(Integer.valueOf(i29));
                e81Var.c(i29 == 1 || i29 == 13);
                break;
            case 16:
                org.telegram.ui.Wallet.x0 x0Var = (org.telegram.ui.Wallet.x0) this.c;
                rc.u uVar = (rc.u) this.d;
                int i30 = this.b;
                org.telegram.ui.Wallet.y0 y0Var = x0Var.c;
                if (y0Var.c(uVar, i30)) {
                    y0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 17:
                int i31 = this.b;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.c;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i31);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new d3.b(i12), new org.telegram.ui.Wallet.j(z10Var, l0Var, connectionsManager));
                break;
            case 18:
                Context context = (Context) this.c;
                int i32 = this.b;
                String str6 = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str6)) {
                    String str7 = org.telegram.messenger.np.s1(i32).I6;
                    if (TextUtils.isEmpty(str7)) {
                        str7 = "https://tonviewer.com/";
                    } else if (!str7.endsWith("/")) {
                        str7 = str7.concat("/");
                    }
                    StringBuilder m10 = r.b.m(str7, "transaction/");
                    m10.append(Uri.encode(str6));
                    vf.c.v(context, m10.toString(), false);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.c;
                int i33 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (z5Var.f0 == i33) {
                    z5Var.f(bitmapArr);
                    z5Var.a.run();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Wallet.f8 f8Var = (org.telegram.ui.Wallet.f8) this.c;
                int i34 = this.b;
                org.telegram.ui.Wallet.pa paVar = (org.telegram.ui.Wallet.pa) this.d;
                int i35 = i34 + 1;
                ArrayList arrayList2 = f8Var.w;
                if (i35 >= arrayList2.size()) {
                    org.telegram.messenger.g0.v1(paVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.pa) arrayList2.get(i35)).a.requestFocus();
                    break;
                }
            case 21:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) this.c;
                int i36 = this.b;
                org.telegram.ui.Wallet.pa paVar2 = (org.telegram.ui.Wallet.pa) this.d;
                int i37 = i36 + 1;
                ArrayList arrayList3 = haVar.d;
                if (i37 >= arrayList3.size()) {
                    org.telegram.messenger.g0.v1(paVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.pa) arrayList3.get(i37)).a.requestFocus();
                    break;
                }
            case 22:
                rc1 rc1Var = (rc1) this.c;
                int i38 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                HashMap hashMap2 = rc1Var.e;
                WallpapersListActivity wallpapersListActivity = rc1Var.F;
                ArrayList arrayList4 = rc1Var.d;
                if (i38 == rc1Var.w) {
                    rc1Var.s = 0;
                    int size = arrayList4.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        rc1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i39 = 0;
                        while (i39 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i39);
                            if ("photo".equals(botInlineResult.type) && !hashMap2.containsKey(botInlineResult.id)) {
                                org.telegram.messenger.jf jfVar = new org.telegram.messenger.jf();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                                    i11 = i12;
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(botInlineResult.photo.sizes, org.telegram.messenger.ns.r5, false, null, false);
                                    if (w10 != null) {
                                        jfVar.E = w10.w;
                                        jfVar.F = w10.h;
                                        jfVar.L = w10;
                                        jfVar.K = botInlineResult.photo;
                                        jfVar.G = w10.size;
                                        jfVar.M = w11;
                                        jfVar.B = botInlineResult.id;
                                        jfVar.H = 0;
                                        arrayList4.add(jfVar);
                                        hashMap2.put(jfVar.B, jfVar);
                                    }
                                } else {
                                    i11 = i12;
                                    if (botInlineResult.content != null) {
                                        int i40 = 0;
                                        while (true) {
                                            if (i40 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i40);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    jfVar.E = documentAttribute.w;
                                                    jfVar.F = documentAttribute.h;
                                                } else {
                                                    i40++;
                                                }
                                            }
                                        }
                                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            jfVar.D = webDocument.url;
                                        } else {
                                            jfVar.D = null;
                                        }
                                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                        jfVar.C = webDocument2.url;
                                        jfVar.G = webDocument2.size;
                                        jfVar.B = botInlineResult.id;
                                        jfVar.H = 0;
                                        arrayList4.add(jfVar);
                                        hashMap2.put(jfVar.B, jfVar);
                                    }
                                }
                            } else {
                                i11 = i12;
                            }
                            i39++;
                            i12 = i11;
                        }
                        rc1Var.f = (size == arrayList4.size() || rc1Var.r == null) ? i12 : 0;
                    }
                    if (size != arrayList4.size()) {
                        int i41 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / r3);
                        if (i41 != 0) {
                            rc1Var.g(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.I.o(ceil, ((int) Math.ceil(arrayList4.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.L.c();
                    break;
                }
                break;
            case 23:
                ((View) this.d).postOnAnimation(new nb1((hx) this.c, this.b, 8));
                break;
            case 24:
                q2.k kVar = (q2.k) this.c;
                this.d.N(kVar.a, kVar.b, this.b);
                break;
            case 25:
                sg.i0 i0Var = (sg.i0) this.c;
                i0Var.e((sg.x0) this.d, this.b, i0Var.h);
                i0Var.h = null;
                break;
            case 26:
                tg.g0 g0Var = (tg.g0) this.c;
                sg.g gVar = (sg.g) this.d;
                int i42 = this.b;
                if (g0Var.G0.getCurrentBrush() instanceof sg.g) {
                    g0Var.U0 = true;
                }
                g0Var.w(gVar);
                tg.h1 h1Var = g0Var.d1;
                int i43 = h1Var.d + 1;
                h1Var.a(i43);
                org.telegram.messenger.g0.Q3(h1Var.a[i43], i42);
                h1Var.e = true;
                break;
            default:
                ((u4.c) ((qe.h) this.c).c).I(this.b, this.d);
                break;
        }
    }

    public /* synthetic */ u11(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ u11(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
