package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s31(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        vi.h hVar = (vi.h) this.b;
        vi.g gVar = (vi.g) this.c;
        File file = (File) this.d;
        m4.d0 d0Var = hVar.g;
        long j3 = gVar.a;
        synchronized (((e0.g) d0Var.b).f) {
            ((HashMap) ((e0.g) d0Var.b).g).put(Long.valueOf(j3), file);
        }
        ((Handler) ((e0.g) d0Var.b).d).post(new org.telegram.messenger.u0(d0Var, j3, (org.telegram.messenger.me) d0Var.a, file, 1));
    }

    private final void b() {
        wi.t0 t0Var = (wi.t0) this.b;
        wi.p0 p0Var = (wi.p0) this.c;
        File file = (File) this.d;
        wi.q0 q0Var = t0Var.e;
        long j3 = p0Var.a;
        iy0 iy0Var = (iy0) q0Var;
        synchronized (iy0Var) {
            if (iy0Var.d) {
                return;
            }
            iy0Var.c.put(Long.valueOf(j3), new gy0(file));
        }
    }

    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, q2.k] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, q2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        String absolutePath;
        Object obj;
        String absolutePath2;
        boolean z9;
        org.telegram.ui.web.a2 a2Var;
        Object obj2;
        TLRPC.User a22;
        int i10 = 2;
        int i11 = 3;
        byte[] bArr = null;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = true;
        z11 = true;
        switch (this.a) {
            case 0:
                t31 t31Var = (t31) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = t31Var.f;
                ArrayList arrayList = t31Var.e;
                ArrayList arrayList2 = t31Var.n;
                SparseArray sparseArray2 = t31Var.d;
                t31Var.r = false;
                if (tL_error != null || !(tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    t31Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                if (arrayList3.size() < 40) {
                    t31Var.s = true;
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                if (arrayList2.isEmpty()) {
                    int i13 = t31Var.x;
                    t31Var.x = i13 + 1;
                    sparseArray2.put(i13, -1);
                }
                arrayList2.addAll(arrayList3);
                int size = arrayList.size();
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i14);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList.add(stickerSetCovered);
                        sparseArray.put(t31Var.x, stickerSetCovered);
                        int i15 = t31Var.x;
                        t31Var.x = i15 + 1;
                        int i16 = size + 1;
                        sparseArray2.put(i15, Integer.valueOf(size));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(t31Var.x, stickerSetCovered.cover);
                            i7 = 1;
                        } else {
                            i7 = (int) Math.ceil(stickerSetCovered.covers.size() / t31Var.w);
                            for (int i17 = 0; i17 < stickerSetCovered.covers.size(); i17++) {
                                sparseArray2.put(t31Var.x + i17, stickerSetCovered.covers.get(i17));
                            }
                        }
                        int i18 = 0;
                        while (true) {
                            int i19 = t31Var.w * i7;
                            if (i18 < i19) {
                                sparseArray.put(t31Var.x + i18, stickerSetCovered);
                                i18++;
                            } else {
                                t31Var.x = i19 + t31Var.x;
                                size = i16;
                            }
                        }
                    }
                }
                t31Var.f();
                return;
            case 1:
                a61 a61Var = (a61) this.b;
                Uri uri = (Uri) this.c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                a61Var.getClass();
                if ("tg".equals(uri.getScheme())) {
                    int intValue = Utilities.z(uri.getQueryParameter("account")).intValue();
                    Object obj3 = org.telegram.messenger.w7.G(intValue).G.get(Utilities.z(uri.getQueryParameter("rid")));
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
                    if (org.telegram.messenger.w7.G(intValue).S(org.telegram.messenger.w7.r(null, tL_document))) {
                        File z12 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(z12, a8.p0.r(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(intValue);
                        absolutePath = org.telegram.messenger.w7.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    a61Var.b = new v5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj3, 0L, intValue, true);
                } else {
                    a61Var.b = new v5(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                a61Var.c = a61Var.b.d[4];
                float f10 = a61Var.h;
                if (f10 != 0.0f) {
                    a61Var.e(ijVar, f10, a61Var.r);
                    a61Var.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new x51(a61Var, true ? 1 : 0));
                return;
            case 2:
                a61 a61Var2 = (a61) this.b;
                s51 s51Var = (s51) this.c;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.d;
                a61Var2.getClass();
                if (s51Var.b()) {
                    a61Var2.b = new v5(new File(s51Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i20 = org.telegram.messenger.p10.s0;
                    try {
                        i20 = Utilities.z(s51Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    int i21 = i20;
                    try {
                        obj = org.telegram.messenger.w7.G(i21).G.get(Utilities.z(s51Var.d.getQueryParameter("rid")));
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        obj = null;
                    }
                    TLRPC.Document document = s51Var.g;
                    if (org.telegram.messenger.w7.G(i21).S(org.telegram.messenger.w7.r(null, document))) {
                        File z13 = org.telegram.messenger.w7.z(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(z13, a8.p0.r(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        org.telegram.messenger.w7.G(i21);
                        absolutePath2 = org.telegram.messenger.w7.J(document, null, false, true).getAbsolutePath();
                    }
                    a61Var2.b = new v5(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i21, true);
                }
                a61Var2.c = a61Var2.b.d[4];
                float f11 = a61Var2.h;
                if (f11 != 0.0f) {
                    a61Var2.e(ijVar2, f11, a61Var2.r);
                    a61Var2.h = 0.0f;
                }
                org.telegram.messenger.g0.h3(new x51(a61Var2, i10));
                return;
            case 3:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.c;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.d;
                ValueAnimator valueAnimator = k0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                yVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.i0(k0Var, yVar, i11)).setDuration(100L).start();
                if (yVar2 != null) {
                    yVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.w(yVar2, i11)).start();
                    return;
                }
                return;
            case 4:
                File file = (File) this.b;
                int[] iArr = (int[]) this.c;
                bi.r7 r7Var = (bi.r7) this.d;
                AnimatedFileNative.d(file.getAbsolutePath(), iArr, 0L);
                org.telegram.messenger.g0.h3(r7Var);
                return;
            case 5:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                q0.a aVar = (q0.a) this.c;
                String[] strArr = (String[]) this.d;
                x0Var.getClass();
                int length = strArr.length;
                int i22 = 0;
                while (true) {
                    if (i22 >= length) {
                        z10 = true;
                    } else if (x0Var.getContext().checkSelfPermission(strArr[i22]) == 0) {
                        i22++;
                    }
                }
                aVar.accept(Boolean.valueOf(z10));
                return;
            case 6:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    org.telegram.ui.web.x0 x0Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (x0Var2 == null) {
                        return;
                    }
                    boolean z14 = org.telegram.ui.web.x0.Q0;
                    x0Var2.F(botWebViewContainer$BotWebViewProxy, x0Var2.f(), str, str2);
                    return;
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 7:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                org.telegram.ui.web.x0 x0Var3 = botWebViewContainer$WebViewProxy.a;
                if (x0Var3 == null || x0Var3.o0 || x0Var3.c == null) {
                    return;
                }
                if (x0Var3.G0 != null && !TextUtils.equals(x0Var3.getOriginHost(), x0Var3.G0)) {
                    x0Var3.g("onWebEventReceived ignore " + str3);
                    return;
                }
                x0Var3.g("onWebEventReceived " + str3 + " " + str4);
                str3.getClass();
                switch (str3) {
                    case "actionBarColor":
                    case "navigationBarColor":
                        try {
                            JSONArray jSONArray = new JSONArray(str4);
                            boolean equals = TextUtils.equals(str3, "actionBarColor");
                            int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                            org.telegram.ui.web.u0 u0Var = x0Var3.a;
                            if (u0Var != null) {
                                if (equals) {
                                    u0Var.s = true;
                                    u0Var.x = argb;
                                } else {
                                    u0Var.w = true;
                                    u0Var.y = argb;
                                }
                                org.telegram.ui.web.u0.a(u0Var);
                            }
                            x0Var3.c.o(argb, equals);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    case "oauth_request":
                        x0Var3.g("oauth_request " + str4);
                        if (x0Var3.a == null) {
                            return;
                        }
                        String originHost = x0Var3.getOriginHost();
                        if (TextUtils.isEmpty(originHost)) {
                            return;
                        }
                        try {
                            String optString = new JSONObject(str4).optString("url");
                            x0Var3.y("oauth_supported", org.telegram.ui.web.x0.A(1, "version"));
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                            tL_messages_requestUrlAuth.url = optString;
                            int i23 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = i23 | 12;
                            ConnectionsManager.getInstance(x0Var3.M).sendRequest(tL_messages_requestUrlAuth, new bi.g2(x0Var3, tL_messages_requestUrlAuth, optString, originHost, 19), 2);
                            return;
                        } catch (Exception e13) {
                            org.telegram.messenger.a8.g(e13, true);
                            return;
                        }
                    case "siteName":
                        x0Var3.g("siteName " + str4);
                        org.telegram.ui.web.u0 u0Var2 = x0Var3.a;
                        if (u0Var2 != null) {
                            u0Var2.r = str4;
                            org.telegram.ui.web.u0.a(u0Var2);
                            return;
                        }
                        return;
                    case "allowScroll":
                        try {
                            JSONArray jSONArray2 = new JSONArray(str4);
                            z9 = jSONArray2.optBoolean(0, true);
                            try {
                                z11 = jSONArray2.optBoolean(1, true);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            z9 = true;
                        }
                        if (x0Var3.getParent() instanceof hi.b4) {
                            hi.b4 b4Var = (hi.b4) x0Var3.getParent();
                            b4Var.O = z9;
                            b4Var.P = z11;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 8:
                fi.u2 u2Var = (fi.u2) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                String str5 = (String) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                    org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) arrayList4.get(i24);
                    if (fi.u2.n(y0Var.c, str5) || ((a2Var = y0Var.d) != null && (fi.u2.n(a2Var.c, str5) || fi.u2.n(y0Var.d.d, str5)))) {
                        arrayList5.add(y0Var);
                    }
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.s(i11, u2Var, arrayList5));
                return;
            case 9:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.b;
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                w1Var.getClass();
                if (org.telegram.ui.web.w1.f == null) {
                    return;
                }
                char c10 = ((v1Var.d > 0 && v1Var.e > 0) || bitmap == null) ? (char) 0 : (char) 1;
                if (bitmap != null) {
                    w1Var.d.put(v1Var.b, bitmap);
                    if (c10 != 0) {
                        int i25 = v1Var.d;
                        if (i25 == 0 && v1Var.e == 0) {
                            v1Var.d = bitmap.getWidth();
                            v1Var.e = bitmap.getHeight();
                        } else if (i25 == 0) {
                            v1Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * v1Var.e);
                        } else if (v1Var.e == 0) {
                            v1Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * v1Var.d);
                        }
                    }
                }
                ArrayList arrayList6 = (ArrayList) org.telegram.ui.web.w1.f.remove(v1Var.b);
                if (arrayList6 == null) {
                    return;
                }
                int size2 = arrayList6.size();
                while (i12 < size2) {
                    Object obj4 = arrayList6.get(i12);
                    i12++;
                    Pair pair = (Pair) obj4;
                    ((ImageReceiver) pair.first).v0(bitmap);
                    if (c10 != 0 && (obj2 = pair.second) != null) {
                        ((Runnable) obj2).run();
                    }
                }
                return;
            case 10:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                return;
            case 11:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 12:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 13:
                p4.a0 a0Var = (p4.a0) this.b;
                p4.v vVar = (p4.v) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                p4.d0 d0Var = a0Var.b;
                if (d0Var.i(vVar)) {
                    d0Var.b(keyEvent, false, false);
                } else {
                    p4.m0 m0Var = d0Var.h;
                    q4.r rVar = vVar.a;
                    rVar.getClass();
                    m0Var.getClass();
                    m0Var.i0(1, new p4.g0(m0Var, 9), rVar, true);
                }
                a0Var.a = null;
                return;
            case 14:
                p4.d0 d0Var2 = (p4.d0) this.b;
                p4.r0 r0Var = (p4.r0) this.c;
                p4.w wVar = (p4.w) this.d;
                if (d0Var2.j()) {
                    return;
                }
                p4.g1 g1Var = d0Var2.t;
                r0Var.getClass();
                c8.ab.b(g1Var, wVar);
                return;
            case 15:
                q2.j jVar = (q2.j) this.b;
                this.c.K(jVar.a, jVar.b, (Exception) this.d);
                return;
            case 16:
                q2.j jVar2 = (q2.j) this.b;
                this.c.b(jVar2.a, jVar2.b, (qb.a) this.d);
                return;
            case 17:
                ui.i iVar = (ui.i) this.b;
                WebView webView = (WebView) this.c;
                e5.f fVar = (e5.f) this.d;
                synchronized (iVar.a) {
                    if (!iVar.u && iVar.o == webView && iVar.p == fVar && !iVar.r) {
                        if (iVar.s) {
                            org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            iVar.q();
                            return;
                        } else {
                            iVar.s = true;
                            org.telegram.messenger.a8.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                            iVar.h();
                            return;
                        }
                    }
                    return;
                }
            case 18:
                vi.h hVar = (vi.h) this.b;
                vi.g gVar = (vi.g) this.c;
                byte[] bArr2 = (byte[]) this.d;
                File file2 = gVar.b;
                if (hVar.G != 4) {
                    return;
                }
                hVar.B = bArr2;
                try {
                    hVar.p();
                    if (hVar.e) {
                        l2.i0 a10 = new l2.n(hVar.a).a();
                        hVar.A = a10;
                        a10.I0(hVar.F);
                        hVar.A.m0(e2.l0.b(Uri.fromFile(file2)));
                        hVar.A.a();
                    }
                    hVar.s(5);
                    j2.n nVar = hVar.f;
                    long j3 = hVar.j();
                    byte[] bArr3 = hVar.B;
                    if (bArr3 != null) {
                        bArr = (byte[]) bArr3.clone();
                    }
                    nVar.i0(j3, bArr);
                    return;
                } catch (Throwable th2) {
                    hVar.g(th2 instanceof Exception ? th2 : new RuntimeException(th2));
                    return;
                }
            case 19:
                a();
                return;
            case 20:
                ((wg.u0) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 21:
                TLObject tLObject2 = (TLObject) this.d;
                org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) this.b;
                wg.u0 u0Var3 = (wg.u0) this.c;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    qpVar.Y3(tL_channels_channelParticipants.users, false);
                    qpVar.S3(tL_channels_channelParticipants.chats, false);
                    long e14 = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).e();
                    ArrayList arrayList7 = new ArrayList();
                    for (int i26 = 0; i26 < tL_channels_channelParticipants.participants.size(); i26++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i26).peer;
                        if (peer != null && org.telegram.messenger.ij.B1(peer) != e14 && (a22 = qpVar.a2(Long.valueOf(peer.user_id))) != null && !org.telegram.messenger.t10.x(a22) && !a22.bot) {
                            arrayList7.add(qpVar.m1(peer));
                        }
                    }
                    u0Var3.a(arrayList7);
                    return;
                }
                return;
            case 22:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.b;
                org.telegram.messenger.c20 c20Var2 = (org.telegram.messenger.c20) this.d;
                if (tL_error2 != null) {
                    c20Var.a(tL_error2);
                    return;
                } else {
                    c20Var2.a(null);
                    return;
                }
            case 23:
                ((ii.c) this.b).a(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 24:
                wi.t tVar = (wi.t) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                tVar.getClass();
                try {
                    tVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 25:
                wi.t0 t0Var = (wi.t0) this.b;
                wi.x xVar = (wi.x) this.c;
                File file3 = (File) this.d;
                Handler handler = t0Var.i;
                try {
                    xVar.c(file3);
                    t0Var.g();
                    long h = xVar.h();
                    t0Var.m.b("preview snapshot completed: durationMs=" + h + ", size=" + file3.length() + ", elapsedMs=" + wi.t0.f(t0Var.N));
                    handler.post(new wi.f0(t0Var, h, true ? 1 : 0));
                    return;
                } catch (Exception e15) {
                    handler.post(new wi.e0(t0Var, e15, i11));
                    return;
                }
            case 26:
                b();
                return;
            case 27:
                xh.l lVar = (xh.l) this.b;
                y70 y70Var = (y70) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                w70 w70Var = lVar.G;
                if (w70Var == null || lVar.H != y70Var) {
                    return;
                }
                w70Var.a(clickableSpan);
                lVar.H = null;
                lVar.y.f(true);
                return;
            case 28:
                yf.e eVar = (yf.e) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                String str6 = eVar.b;
                int i27 = eVar.a;
                if (tLObject3 != null) {
                    org.telegram.messenger.ui.b0(i27).i1(str6, (TLRPC.Document) tLObject3, false);
                } else {
                    eVar.a();
                    org.telegram.messenger.ui.b0(i27).i1(str6, null, true);
                    if (tL_error3 != null) {
                        org.telegram.messenger.qs.f(i27).d(new yf.b(i11, eVar, tL_error3));
                    }
                }
                eVar.a();
                return;
            default:
                vp0 vp0Var = (vp0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                vp0Var.H = -1;
                if (tL_error4 != null) {
                    hc.a0(f2Var).f0(tL_error4, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ s31(TLObject tLObject, org.telegram.messenger.qp qpVar, wg.u0 u0Var) {
        this.a = 21;
        this.d = tLObject;
        this.b = qpVar;
        this.c = u0Var;
    }

    public /* synthetic */ s31(TLRPC.TL_error tL_error, org.telegram.messenger.c20 c20Var, org.telegram.messenger.c20 c20Var2) {
        this.a = 22;
        this.c = tL_error;
        this.b = c20Var;
        this.d = c20Var2;
    }

    public /* synthetic */ s31(yf.e eVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 28;
        this.b = eVar;
        this.d = tLObject;
        this.c = tL_error;
    }
}
