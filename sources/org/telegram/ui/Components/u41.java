package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.zn;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u41(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0265  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z10;
        char c10;
        boolean z11;
        boolean z12;
        org.telegram.ui.web.c2 c2Var;
        Object obj2;
        boolean z13;
        boolean z14;
        qh.x0 x0Var;
        String str;
        int i11;
        String str2;
        qh.m0 m0Var;
        int i12;
        int i13;
        TLRPC.Message message;
        int i14 = 3;
        int i15 = 0;
        switch (this.a) {
            case 0:
                v41 v41Var = (v41) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = v41Var.f;
                ArrayList arrayList = v41Var.e;
                ArrayList arrayList2 = v41Var.n;
                SparseArray sparseArray2 = v41Var.d;
                v41Var.r = false;
                if (tL_error != null || !(tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    v41Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                    if (arrayList3.size() < 40) {
                        v41Var.s = true;
                    }
                    if (!arrayList3.isEmpty()) {
                        if (arrayList2.isEmpty()) {
                            int i16 = v41Var.x;
                            v41Var.x = i16 + 1;
                            sparseArray2.put(i16, -1);
                        }
                        arrayList2.addAll(arrayList3);
                        int size = arrayList.size();
                        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i17);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList.add(stickerSetCovered);
                                sparseArray.put(v41Var.x, stickerSetCovered);
                                int i18 = v41Var.x;
                                v41Var.x = i18 + 1;
                                int i19 = size + 1;
                                sparseArray2.put(i18, Integer.valueOf(size));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(v41Var.x, stickerSetCovered.cover);
                                    i10 = 1;
                                } else {
                                    i10 = (int) Math.ceil(stickerSetCovered.covers.size() / v41Var.w);
                                    for (int i20 = 0; i20 < stickerSetCovered.covers.size(); i20++) {
                                        sparseArray2.put(v41Var.x + i20, stickerSetCovered.covers.get(i20));
                                    }
                                }
                                int i21 = 0;
                                while (true) {
                                    int i22 = v41Var.w * i10;
                                    if (i21 < i22) {
                                        sparseArray.put(v41Var.x + i21, stickerSetCovered);
                                        i21++;
                                    } else {
                                        v41Var.x = i22 + v41Var.x;
                                        size = i19;
                                    }
                                }
                            }
                        }
                        v41Var.f();
                        break;
                    }
                }
                break;
            case 1:
                b71 b71Var = (b71) this.b;
                Uri uri = (Uri) this.c;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.d;
                b71Var.getClass();
                if ("tg".equals(uri.getScheme())) {
                    int intValue = Utilities.z(uri.getQueryParameter("account")).intValue();
                    Object obj3 = org.telegram.messenger.b8.G(intValue).G.get(Utilities.z(uri.getQueryParameter("rid")));
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.A(uri.getQueryParameter("hash")).longValue();
                    tL_document.id = Utilities.A(uri.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.A(uri.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.z(uri.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.v(uri.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (org.telegram.messenger.b8.G(intValue).T(org.telegram.messenger.b8.r(null, tL_document))) {
                        File z15 = org.telegram.messenger.b8.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z15, a1.g.q(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.b8.G(intValue);
                        absolutePath = org.telegram.messenger.b8.K(tL_document, null, false, true).getAbsolutePath();
                    }
                    b71Var.b = new s5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj3, 0L, intValue, true);
                } else {
                    b71Var.b = new s5(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                b71Var.c = b71Var.b.d[4];
                float f7 = b71Var.h;
                if (f7 != 0.0f) {
                    b71Var.e(jjVar, f7, b71Var.r);
                    b71Var.h = 0.0f;
                }
                org.telegram.messenger.i0.g3(new x61(b71Var, 1));
                break;
            case 2:
                b71 b71Var2 = (b71) this.b;
                t61 t61Var = (t61) this.c;
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.d;
                b71Var2.getClass();
                if (t61Var.b()) {
                    b71Var2.b = new s5(new File(t61Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i23 = org.telegram.messenger.d20.s0;
                    try {
                        i23 = Utilities.z(t61Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                    int i24 = i23;
                    try {
                        obj = org.telegram.messenger.b8.G(i24).G.get(Utilities.z(t61Var.d.getQueryParameter("rid")));
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                        obj = null;
                    }
                    TLRPC.Document document = t61Var.g;
                    if (org.telegram.messenger.b8.G(i24).T(org.telegram.messenger.b8.r(null, document))) {
                        File z16 = org.telegram.messenger.b8.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z16, a1.g.q(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.b8.G(i24);
                        absolutePath2 = org.telegram.messenger.b8.K(document, null, false, true).getAbsolutePath();
                    }
                    b71Var2.b = new s5(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i24, true);
                }
                b71Var2.c = b71Var2.b.d[4];
                float f10 = b71Var2.h;
                if (f10 != 0.0f) {
                    b71Var2.e(jjVar2, f10, b71Var2.r);
                    b71Var2.h = 0.0f;
                }
                org.telegram.messenger.i0.g3(new x61(b71Var2, 2));
                break;
            case 3:
                org.telegram.ui.Components.voip.w wVar = (org.telegram.ui.Components.voip.w) this.b;
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.c;
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) this.d;
                ValueAnimator valueAnimator = wVar.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                rVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.u(wVar, rVar, i14)).setDuration(100L).start();
                if (rVar2 != null) {
                    rVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.p(rVar2, i14)).start();
                    break;
                }
                break;
            case 4:
                File file = (File) this.b;
                int[] iArr = (int[]) this.c;
                mg.c0 c0Var = (mg.c0) this.d;
                AnimatedFileNative.d(file.getAbsolutePath(), iArr, 0L);
                org.telegram.messenger.i0.g3(c0Var);
                break;
            case 5:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                q0.a aVar = (q0.a) this.c;
                String[] strArr = (String[]) this.d;
                z0Var.getClass();
                int length = strArr.length;
                int i25 = 0;
                while (true) {
                    if (i25 >= length) {
                        z10 = true;
                    } else if (z0Var.getContext().checkSelfPermission(strArr[i25]) != 0) {
                        z10 = false;
                    } else {
                        i25++;
                    }
                }
                aVar.accept(Boolean.valueOf(z10));
                break;
            case 6:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                try {
                    org.telegram.ui.web.z0 z0Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (z0Var2 == null) {
                        break;
                    } else {
                        boolean z17 = org.telegram.ui.web.z0.Q0;
                        z0Var2.E(botWebViewContainer$BotWebViewProxy, z0Var2.f(), str3, str4);
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                    return;
                }
            case 7:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                org.telegram.ui.web.z0 z0Var3 = botWebViewContainer$WebViewProxy.a;
                if (z0Var3 != null && !z0Var3.o0 && z0Var3.c != null) {
                    if (z0Var3.G0 != null && !TextUtils.equals(z0Var3.getOriginHost(), z0Var3.G0)) {
                        z0Var3.g("onWebEventReceived ignore " + str5);
                        break;
                    } else {
                        z0Var3.g("onWebEventReceived " + str5 + " " + str6);
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case -1695046810:
                                if (str5.equals("actionBarColor")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -462720700:
                                if (str5.equals("navigationBarColor")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 479731943:
                                if (str5.equals("oauth_request")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 675009138:
                                if (str5.equals("siteName")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 997530486:
                                if (str5.equals("allowScroll")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                try {
                                    JSONArray jSONArray = new JSONArray(str6);
                                    boolean equals = TextUtils.equals(str5, "actionBarColor");
                                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                    org.telegram.ui.web.v0 v0Var = z0Var3.a;
                                    if (v0Var != null) {
                                        if (equals) {
                                            v0Var.s = true;
                                            v0Var.x = argb;
                                        } else {
                                            v0Var.w = true;
                                            v0Var.y = argb;
                                        }
                                        org.telegram.ui.web.v0.a(v0Var);
                                    }
                                    z0Var3.c.o(argb, equals);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            case 2:
                                z0Var3.g("oauth_request " + str6);
                                if (z0Var3.a != null) {
                                    String originHost = z0Var3.getOriginHost();
                                    if (!TextUtils.isEmpty(originHost)) {
                                        try {
                                            String optString = new JSONObject(str6).optString("url");
                                            z0Var3.x("oauth_supported", org.telegram.ui.web.z0.A(1, "version"));
                                            if (!TextUtils.isEmpty(optString)) {
                                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                tL_messages_requestUrlAuth.url = optString;
                                                int i26 = tL_messages_requestUrlAuth.flags;
                                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                tL_messages_requestUrlAuth.flags = i26 | 12;
                                                ConnectionsManager.getInstance(z0Var3.M).sendRequest(tL_messages_requestUrlAuth, new org.telegram.ui.mb(z0Var3, tL_messages_requestUrlAuth, optString, originHost, 10), 2);
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.f8.g(e11, true);
                                            return;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                z0Var3.g("siteName " + str6);
                                org.telegram.ui.web.v0 v0Var2 = z0Var3.a;
                                if (v0Var2 != null) {
                                    v0Var2.r = str6;
                                    org.telegram.ui.web.v0.a(v0Var2);
                                    break;
                                }
                                break;
                            case 4:
                                try {
                                    JSONArray jSONArray2 = new JSONArray(str6);
                                    z11 = jSONArray2.optBoolean(0, true);
                                    try {
                                        z12 = jSONArray2.optBoolean(1, true);
                                    } catch (Exception unused2) {
                                        z12 = true;
                                        if (!(z0Var3.getParent() instanceof xh.h3)) {
                                            return;
                                        }
                                    }
                                } catch (Exception unused3) {
                                    z11 = true;
                                }
                                if (!(z0Var3.getParent() instanceof xh.h3)) {
                                    xh.h3 h3Var = (xh.h3) z0Var3.getParent();
                                    h3Var.O = z11;
                                    h3Var.P = z12;
                                    break;
                                }
                        }
                    }
                }
                break;
            case 8:
                org.telegram.ui.go0 go0Var = (org.telegram.ui.go0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                String str7 = (String) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i27 = 0; i27 < arrayList4.size(); i27++) {
                    org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) arrayList4.get(i27);
                    if (org.telegram.ui.go0.n(a1Var.c, str7) || ((c2Var = a1Var.d) != null && (org.telegram.ui.go0.n(c2Var.c, str7) || org.telegram.ui.go0.n(a1Var.d.d, str7)))) {
                        arrayList5.add(a1Var);
                    }
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.k3(25, go0Var, arrayList5));
                break;
            case 9:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.b;
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                y1Var.getClass();
                if (org.telegram.ui.web.y1.f != null) {
                    boolean z18 = (x1Var.d <= 0 || x1Var.e <= 0) && bitmap != null;
                    if (bitmap != null) {
                        y1Var.d.put(x1Var.b, bitmap);
                        if (z18) {
                            int i28 = x1Var.d;
                            if (i28 == 0 && x1Var.e == 0) {
                                x1Var.d = bitmap.getWidth();
                                x1Var.e = bitmap.getHeight();
                            } else if (i28 == 0) {
                                x1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * x1Var.e);
                            } else if (x1Var.e == 0) {
                                x1Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * x1Var.d);
                            }
                        }
                    }
                    ArrayList arrayList6 = (ArrayList) org.telegram.ui.web.y1.f.remove(x1Var.b);
                    if (arrayList6 != null) {
                        int size2 = arrayList6.size();
                        int i29 = 0;
                        while (i29 < size2) {
                            Object obj4 = arrayList6.get(i29);
                            i29++;
                            Pair pair = (Pair) obj4;
                            ((ImageReceiver) pair.first).v0(bitmap);
                            if (z18 && (obj2 = pair.second) != null) {
                                ((Runnable) obj2).run();
                            }
                        }
                        break;
                    }
                }
                break;
            case 10:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                break;
            case 11:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                break;
            case 12:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                break;
            case 13:
                vq0 vq0Var = (vq0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                vq0Var.H = -1;
                if (tL_error2 != null) {
                    cc.a0(k2Var).f0(tL_error2, false);
                    break;
                }
                break;
            case 14:
                ph.f2 f2Var = (ph.f2) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                z60 z60Var = (z60) this.d;
                vq0 vq0Var2 = f2Var.a;
                vq0Var2.e.k(f2Var.e.d, savedStarGift);
                z60Var.u();
                vq0Var2.o();
                TL_stars.TL_starGiftCollection c11 = vq0Var2.e.c(f2Var.e.d);
                if (c11 != null) {
                    cc.a0(vq0Var2.a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131750046, rh.e4.A1(savedStarGift.gift), c11.title))).j();
                    break;
                }
                break;
            case 15:
                ph.f2 f2Var2 = (ph.f2) this.b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.c;
                ph.c1 c1Var = (ph.c1) this.d;
                if (f2Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z13 = true;
                } else {
                    z13 = true;
                    c1Var.d(false, true);
                    f2Var2.e.o(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z13;
                c1Var.i(savedStarGift2, z13, f2Var2.d);
                f2Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = f2Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(f2Var2.b).sendRequest(savestargift, null);
                break;
            case 16:
                ph.h3 h3Var2 = (ph.h3) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.c;
                HashMap hashMap = h3Var2.m;
                HashMap hashMap2 = h3Var2.o;
                HashMap hashMap3 = h3Var2.n;
                ArrayList arrayList7 = h3Var2.h;
                ArrayList arrayList8 = h3Var2.g;
                ArrayList arrayList9 = h3Var2.f;
                int i30 = h3Var2.a;
                ArrayList arrayList10 = h3Var2.d;
                h3Var2.v = -1;
                if (tLObject2 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject2;
                    org.telegram.messenger.vp.r1(i30).V3(resalestargifts.users, false);
                    org.telegram.messenger.vp.r1(i30).P3(resalestargifts.chats, false);
                    h3Var2.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList10.clear();
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList11 = resalestargifts.gifts;
                    int size3 = arrayList11.size();
                    int i31 = 0;
                    while (i31 < size3) {
                        TL_stars.StarGift starGift = arrayList11.get(i31);
                        i31++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList10.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    h3Var2.u = arrayList10.size() >= h3Var2.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    h3Var2.q = resalestargifts.next_offset;
                    h3Var2.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList12 = resalestargifts.attributes;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        arrayList9.clear();
                        arrayList8.clear();
                        arrayList7.clear();
                        arrayList9.addAll(rh.e6.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList8.addAll(rh.e6.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList7.addAll(rh.e6.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        h3Var2.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList13 = resalestargifts.counters;
                        int size4 = arrayList13.size();
                        int i32 = 0;
                        while (i32 < size4) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList13.get(i32);
                            i32++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    org.telegram.messenger.q20 q20Var = h3Var2.c;
                    if (q20Var != null) {
                        q20Var.a(Boolean.valueOf(z14));
                        break;
                    }
                }
                break;
            case 17:
                qh.i0 i0Var = (qh.i0) this.b;
                qh.e eVar = (qh.e) this.c;
                List list = (List) this.d;
                TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = eVar.b;
                ArrayList<TLRPC.TL_shareThemeBackdropOption> arrayList14 = tL_shareThemeBackdrops != null ? tL_shareThemeBackdrops.backdrops : null;
                if (arrayList14 != null && arrayList14 != list && (x0Var = i0Var.d) != null && !i0Var.isFinished) {
                    qh.v0 v0Var3 = x0Var.n;
                    if (v0Var3 != null && v0Var3.a == 0 && (i13 = v0Var3.f) >= 0) {
                        String[] strArr2 = qh.a.a;
                        if (i13 < strArr2.length) {
                            str = strArr2[i13];
                            i11 = x0Var.M7;
                            if (i11 >= 0) {
                                String[] strArr3 = qh.a.a;
                                if (i11 < strArr3.length) {
                                    str2 = strArr3[i11];
                                    if (qh.a.a(arrayList14)) {
                                        if (str2 != null) {
                                            i12 = 0;
                                            while (true) {
                                                String[] strArr4 = qh.a.a;
                                                if (i12 < strArr4.length) {
                                                    if (!str2.equals(strArr4[i12])) {
                                                        i12++;
                                                    }
                                                }
                                            }
                                        }
                                        i12 = qh.x0.G9;
                                        x0Var.M7 = i12;
                                        if (str != null) {
                                            if (x0Var.r != null) {
                                                x0Var.r = null;
                                                x0Var.s = 1.0f;
                                            }
                                            while (true) {
                                                String[] strArr5 = qh.a.a;
                                                if (i15 >= strArr5.length) {
                                                    i15 = qh.x0.G9;
                                                } else if (!str.equals(strArr5[i15])) {
                                                    i15++;
                                                }
                                            }
                                            x0Var.n = qh.x0.t(i15);
                                            l2.f fVar = x0Var.c;
                                            if (fVar != null) {
                                                ((qh.i0) fVar.b).a0();
                                            }
                                        }
                                        x0Var.invalidate();
                                    }
                                    m0Var = i0Var.e;
                                    if (m0Var != null && !m0Var.E) {
                                        if (m0Var.D) {
                                            m0Var.j();
                                            break;
                                        } else if (!m0Var.y) {
                                            TLRPC.ShareTheme shareTheme = m0Var.H;
                                            if ((shareTheme instanceof TLRPC.TL_shareThemeEmojiBackdrop) && (((TLRPC.TL_shareThemeEmojiBackdrop) shareTheme).flags & 1) != 0) {
                                                m0Var.a(shareTheme);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            str2 = null;
                            if (qh.a.a(arrayList14)) {
                            }
                            m0Var = i0Var.e;
                            if (m0Var != null) {
                            }
                        }
                    }
                    str = null;
                    i11 = x0Var.M7;
                    if (i11 >= 0) {
                    }
                    str2 = null;
                    if (qh.a.a(arrayList14)) {
                    }
                    m0Var = i0Var.e;
                    if (m0Var != null) {
                    }
                }
                break;
            case 18:
                qh.x0 x0Var2 = (qh.x0) this.b;
                qh.u0 u0Var = (qh.u0) this.c;
                Bitmap bitmap2 = (Bitmap) this.d;
                if (!u0Var.G && bitmap2 != null) {
                    u0Var.D = bitmap2;
                    x0Var2.invalidate();
                    break;
                }
                break;
            case 19:
                rh.i iVar = (rh.i) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                Context context = (Context) this.c;
                if (tLObject3 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    gf.f.r(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject3).url);
                }
                org.telegram.messenger.i0.h3(new rh.b(iVar, 6), 1000L);
                break;
            case 20:
                rh.e4 e4Var = (rh.e4) this.b;
                Long l4 = (Long) this.c;
                e4Var.Y1(l4.longValue(), new rh.m1(e4Var, l4, (mg.i2[]) this.d, i15));
                break;
            case 21:
                rh.e4 e4Var2 = (rh.e4) this.b;
                gf.e eVar2 = (gf.e) this.c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                eVar2.c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                e4Var2.X1.setResellPrice(sf.a.i(0L, sf.b.a));
                ph.u1 u1Var = e4Var2.c3;
                if (u1Var != null) {
                    u1Var.run();
                }
                e4Var2.k().Q(R.raw.contact_check, 36, org.telegram.messenger.cd.a0(null, null, 2131750038, e4Var2.z1())).j();
                break;
            case 22:
                rh.e4 e4Var3 = (rh.e4) this.b;
                gf.e eVar3 = (gf.e) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                eVar3.c(false);
                e4Var3.k().f0(tL_error3, false);
                break;
            case 23:
                rh.e4 e4Var4 = (rh.e4) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) this.c;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                org.telegram.messenger.vp.r1(e4Var4.a).V3(messages_messages.users, false);
                org.telegram.messenger.vp.r1(e4Var4.a).P3(messages_messages.chats, false);
                e4Var4.E2 = true;
                e4Var4.D2 = false;
                if (e4Var4.e3 != null && (message = jjVar3.k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction).saved = !r2.booleanValue();
                    } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = !r2.booleanValue();
                    }
                }
                e4Var4.i2(jjVar3, null);
                break;
            case 24:
                Runnable runnable = (Runnable) this.b;
                gf.e eVar4 = (gf.e) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
                runnable.run();
                eVar4.c(false);
                rh.e4.c2(twoStepVerificationActivity);
                break;
            case 25:
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.Document document2 = (TLRPC.Document) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                cc a02 = T != null ? cc.a0(T) : cc.X();
                wb q6 = runnable2 == null ? document2 != null ? a02.q(document2, charSequence) : a02.Q(R.raw.contact_check, 36, charSequence) : document2 != null ? a02.r(document2, charSequence, org.telegram.messenger.cd.L0(2131749897, null), runnable2) : a02.K(R.raw.contact_check, charSequence, org.telegram.messenger.cd.L0(2131749897, null), runnable2);
                q6.t = true;
                q6.j();
                break;
            case 26:
                rh.e4.h1((rh.e4) this.b, (org.telegram.ui.ActionBar.x1) this.c, (org.telegram.messenger.jj) this.d);
                break;
            case 27:
                final rh.e4 e4Var5 = (rh.e4) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                final String str8 = (String) this.d;
                final long j10 = tL_starGiftUnique2.gift_id;
                final String str9 = tL_starGiftUnique2.title;
                final String z19 = e4Var5.z1();
                final TLRPC.Document document3 = tL_starGiftUnique2.getDocument();
                String str10 = tL_starGiftUnique2.slug;
                final org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, org.telegram.messenger.w0.b, null);
                x1Var2.r(500L);
                TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
                getuniquestargiftvalueinfo.slug = str10;
                ConnectionsManager.getInstance(e4Var5.a).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() { // from class: rh.g1
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(final TLObject tLObject5, final TLRPC.TL_error tL_error4) {
                        final e4 e4Var6 = e4.this;
                        final org.telegram.ui.ActionBar.x1 x1Var3 = x1Var2;
                        final TLRPC.Document document4 = document3;
                        final String str11 = str8;
                        final String str12 = str9;
                        final String str13 = z19;
                        final long j11 = j10;
                        org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.s1
                            @Override // java.lang.Runnable
                            public final void run() {
                                FrameLayout frameLayout;
                                org.telegram.tgnet.e eVar5;
                                wy0 wy0Var;
                                wy0 wy0Var2;
                                org.telegram.tgnet.e eVar6;
                                TLRPC.Document document5;
                                CharSequence charSequence2;
                                CharSequence charSequence3;
                                e4 e4Var7;
                                char c12;
                                float f11;
                                float f12;
                                x1Var3.dismiss();
                                TLObject tLObject6 = tLObject5;
                                boolean z20 = tLObject6 instanceof TL_stars.UniqueStarGiftValueInfo;
                                e4 e4Var8 = e4.this;
                                if (!z20) {
                                    TLRPC.TL_error tL_error5 = tL_error4;
                                    if (tL_error5 != null) {
                                        e4Var8.k().f0(tL_error5, false);
                                        return;
                                    }
                                    return;
                                }
                                TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject6;
                                org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, e4Var8.getContext(), e4Var8.I0, false);
                                LinearLayout linearLayout = new LinearLayout(e4Var8.getContext());
                                linearLayout.setOrientation(1);
                                linearLayout.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
                                linearLayout.setClipChildren(false);
                                linearLayout.setClipToPadding(false);
                                g9 g9Var = new g9(e4Var8.getContext());
                                ImageReceiver imageReceiver = g9Var.getImageReceiver();
                                TLRPC.Document document6 = document4;
                                h8.b1(imageReceiver, document6, zs.q2);
                                linearLayout.addView(g9Var, w7.b6.t(zs.q2, zs.q2, 1, 0, 0, 0, 0));
                                TextView textView = new TextView(e4Var8.getContext());
                                textView.setTextSize(1, 20.0f);
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, e4Var8.I0);
                                textView.setTypeface(org.telegram.messenger.i0.o());
                                textView.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
                                int L = org.telegram.messenger.i0.L(21.0f);
                                int i33 = org.telegram.ui.ActionBar.t6.Ci;
                                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i33, e4Var8.I0));
                                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i33);
                                org.telegram.ui.ActionBar.p6 p6Var = e4Var8.I0;
                                textView.setBackground(d02);
                                org.telegram.ui.ActionBar.a7.k(textView, d02, N, null, p6Var);
                                textView.setGravity(17);
                                linearLayout.addView(textView, w7.b6.t(-2, 42, 1, 0, 12, 0, 15));
                                textView.setText(str11);
                                TextView textView2 = new TextView(e4Var8.getContext());
                                textView2.setTextSize(1, 14.0f);
                                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.j5, e4Var8.I0);
                                textView2.setGravity(17);
                                linearLayout.addView(textView2, w7.b6.t(-2, -2, 1, 16, 0, 16, 19));
                                boolean z21 = uniqueStarGiftValueInfo.value_is_average;
                                String str14 = str12;
                                if (z21) {
                                    org.telegram.messenger.m5.q(null, null, 2131749598, new Object[]{str14}, textView2);
                                } else {
                                    boolean z22 = uniqueStarGiftValueInfo.last_sale_on_fragment;
                                    String str15 = str13;
                                    if (z22) {
                                        org.telegram.messenger.m5.q(null, null, 2131749593, new Object[]{str15}, textView2);
                                    } else {
                                        org.telegram.messenger.m5.q(null, null, 2131749590, new Object[]{str15}, textView2);
                                    }
                                }
                                FrameLayout frameLayout2 = new FrameLayout(e4Var8.getContext());
                                frameLayout2.setClipChildren(false);
                                frameLayout2.setClipToPadding(false);
                                org.telegram.tgnet.e eVar7 = new org.telegram.tgnet.e(e4Var8, new vh.p2[1], frameLayout2, 8);
                                wy0 wy0Var3 = new wy0(e4Var8.getContext(), e4Var8.I0);
                                frameLayout2.addView(wy0Var3, w7.b6.e(-1, -1, zs.E1));
                                wy0Var3.c(cd.L0(2131749594, null), cd.f0(uniqueStarGiftValueInfo.initial_sale_date), null, null);
                                String L0 = cd.L0(2131749595, null);
                                StringBuilder sb4 = new StringBuilder("⭐️");
                                sb4.append(uniqueStarGiftValueInfo.initial_sale_stars);
                                sb4.append(" (~");
                                wy0Var3.c(L0, h8.Z0(false, a1.g.r(sb4, org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                                    wy0Var3.c(cd.L0(2131749591, null), cd.f0(uniqueStarGiftValueInfo.last_sale_date), null, null);
                                    frameLayout = frameLayout2;
                                    int round = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
                                    if (round > 0) {
                                        wy0Var3.e(cd.L0(2131749592, null), org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + cd.E(round, ' ') + "%", null, null);
                                        wy0Var = wy0Var3;
                                        eVar5 = eVar7;
                                    } else {
                                        wy0Var = wy0Var3;
                                        eVar5 = eVar7;
                                        wy0Var.c(cd.L0(2131749592, null), org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                                    }
                                } else {
                                    frameLayout = frameLayout2;
                                    eVar5 = eVar7;
                                    wy0Var = wy0Var3;
                                }
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                                    document5 = document6;
                                    eVar6 = eVar5;
                                    t1 t1Var = new t1(eVar6, new ec[]{(ec) ((ty0) r4.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str14, 0);
                                    wy0 wy0Var4 = wy0Var;
                                    TableRow e12 = wy0Var4.e(cd.L0(2131749589, null), org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", t1Var, null);
                                    wy0Var2 = wy0Var4;
                                    e12.setOnClickListener(new s(t1Var, 4));
                                } else {
                                    wy0Var2 = wy0Var;
                                    eVar6 = eVar5;
                                    document5 = document6;
                                }
                                if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                                    t1 t1Var2 = new t1(eVar6, new ec[]{(ec) ((ty0) r4.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str14, 1);
                                    TableRow e13 = wy0Var2.e(cd.L0(2131749597, null), org.telegram.messenger.u1.i().f(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", t1Var2, null);
                                    e13.setOnClickListener(new s(t1Var2, 5));
                                }
                                linearLayout.addView(frameLayout, w7.b6.t(-1, -2, 7, 0, 0, 0, 12));
                                if (uniqueStarGiftValueInfo.listed_count > 0) {
                                    f11 = 1.0f;
                                    vh.d dVar = new vh.d(e4Var8.getContext(), e4Var8.I0, false);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                    spannableStringBuilder.append((CharSequence) cd.E(uniqueStarGiftValueInfo.listed_count, ' '));
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) "e");
                                    f12 = 2.0f;
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o5(document5, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append((CharSequence) cd.L0(2131749586, null));
                                    dVar.i(org.telegram.messenger.i0.H2(spannableStringBuilder, false, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f)), false, true);
                                    charSequence2 = "e";
                                    charSequence3 = " ";
                                    e4Var7 = e4Var8;
                                    c12 = ' ';
                                    dVar.setOnClickListener(new zn(e4Var7, str14, j11, 6));
                                    linearLayout.addView(dVar, w7.b6.t(-1, 42, 7, 0, 0, 0, 2));
                                } else {
                                    charSequence2 = "e";
                                    charSequence3 = " ";
                                    e4Var7 = e4Var8;
                                    c12 = ' ';
                                    f11 = 1.0f;
                                    f12 = 2.0f;
                                }
                                if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                                    vh.d dVar2 = new vh.d(e4Var7.getContext(), e4Var7.I0, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) cd.E(uniqueStarGiftValueInfo.fragment_listed_count, c12));
                                    spannableStringBuilder2.append(charSequence2);
                                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o5(document5, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                                    spannableStringBuilder2.append(charSequence3);
                                    spannableStringBuilder2.append((CharSequence) cd.L0(2131749587, null));
                                    dVar2.i(org.telegram.messenger.i0.H2(spannableStringBuilder2, false, org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(f11)), false, true);
                                    dVar2.setOnClickListener(new u1(0, e4Var7, uniqueStarGiftValueInfo));
                                    linearLayout.addView(dVar2, w7.b6.t(-1, 42, 7, 0, 0, 0, 0));
                                }
                                k10.N = linearLayout;
                                k10.show();
                            }
                        });
                    }
                });
                break;
            case 28:
                TLObject tLObject5 = (TLObject) this.d;
                org.telegram.ui.f0 f0Var = (org.telegram.ui.f0) this.b;
                String str11 = (String) this.c;
                if (tLObject5 instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.StarGift starGift3 = ((TL_stars.TL_payments_uniqueStarGift) tLObject5).gift;
                    if (starGift3 instanceof TL_stars.TL_starGiftUnique) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique3 = (TL_stars.TL_starGiftUnique) starGift3;
                        Long valueOf = Long.valueOf(tL_starGiftUnique3.gift_id);
                        String str12 = tL_starGiftUnique3.title;
                        if (str12 != null) {
                            str11 = str12;
                        }
                        f0Var.a(valueOf, str11);
                        break;
                    }
                }
                f0Var.a(0L, str11);
                break;
            default:
                TLObject tLObject6 = (TLObject) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                org.telegram.messenger.q20 q20Var2 = (org.telegram.messenger.q20) this.b;
                if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStarGift) {
                    q20Var2.a((TLRPC.TL_payments_paymentFormStarGift) tLObject6);
                    break;
                } else {
                    rh.e6.e(tL_error4 == null ? "NO_PAYMENT_FORM" : tL_error4.text);
                    q20Var2.a(null);
                    break;
                }
        }
    }

    public /* synthetic */ u41(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ u41(TLObject tLObject, org.telegram.ui.f0 f0Var, String str) {
        this.a = 28;
        this.d = tLObject;
        this.b = f0Var;
        this.c = str;
    }

    public /* synthetic */ u41(rh.e4 e4Var, Runnable runnable, gf.e eVar, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.a = 24;
        this.b = runnable;
        this.c = eVar;
        this.d = twoStepVerificationActivity;
    }

    public /* synthetic */ u41(rh.e6 e6Var, TLObject tLObject, TLRPC.TL_error tL_error, org.telegram.messenger.q20 q20Var) {
        this.a = 29;
        this.d = tLObject;
        this.c = tL_error;
        this.b = q20Var;
    }
}
