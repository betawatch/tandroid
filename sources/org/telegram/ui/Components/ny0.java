package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ny0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ny0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        vi.s0 s0Var = (vi.s0) this.b;
        vi.o0 o0Var = (vi.o0) this.c;
        File file = (File) this.d;
        vi.p0 p0Var = s0Var.e;
        long j10 = o0Var.a;
        l11 l11Var = (l11) p0Var;
        synchronized (l11Var) {
            if (l11Var.d) {
                return;
            }
            l11Var.c.put(Long.valueOf(j10), new j11(file));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uri uri;
        String stickerExt;
        int i10;
        int i11;
        String absolutePath;
        String absolutePath2;
        boolean z10;
        org.telegram.ui.web.l2 l2Var;
        Object obj;
        TLRPC.User user;
        int i12 = 3;
        int i13 = 2;
        Boolean bool = null;
        Object obj2 = null;
        int i14 = 0;
        boolean z11 = false;
        boolean z12 = true;
        z12 = true;
        switch (this.a) {
            case 0:
                cz0.I((cz0) this.b, (String) this.c, (TextView) this.d);
                return;
            case 1:
                cz0 cz0Var = (cz0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    Object obj3 = arrayList.get(i15);
                    if ((obj3 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj3))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool == null) {
                            bool = Boolean.valueOf(equals);
                        } else if (bool.booleanValue() != equals) {
                            continue;
                        }
                        if (cz0Var.isDismissed()) {
                            return;
                        }
                        SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                        importingSticker.animated = equals;
                        String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                        importingSticker.path = copyFileToCache;
                        if (copyFileToCache != null) {
                            if (equals) {
                                importingSticker.mimeType = "application/x-tgsticker";
                            } else {
                                BitmapFactory.decodeFile(copyFileToCache, options);
                                int i16 = options.outWidth;
                                if ((i16 == 512 && (i10 = options.outHeight) > 0 && i10 <= 512) || (options.outHeight == 512 && i16 > 0 && i16 <= 512)) {
                                    importingSticker.mimeType = "image/".concat(stickerExt);
                                    importingSticker.validated = true;
                                }
                            }
                            if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i15) instanceof String)) {
                                importingSticker.emoji = (String) arrayList2.get(i15);
                            } else {
                                importingSticker.emoji = "#️⃣";
                            }
                            arrayList3.add(importingSticker);
                            if (arrayList3.size() >= 200) {
                                AndroidUtilities.runOnUIThread(new kg(cz0Var, arrayList3, bool, 28));
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new kg(cz0Var, arrayList3, bool, 28));
                return;
            case 2:
                o61 o61Var = (o61) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = o61Var.f;
                ArrayList arrayList4 = o61Var.e;
                ArrayList arrayList5 = o61Var.n;
                SparseArray sparseArray2 = o61Var.d;
                o61Var.r = false;
                if (tL_error != null || !(tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    o61Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList6 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                if (arrayList6.size() < 40) {
                    o61Var.s = true;
                }
                if (arrayList6.isEmpty()) {
                    return;
                }
                if (arrayList5.isEmpty()) {
                    int i17 = o61Var.w;
                    o61Var.w = i17 + 1;
                    sparseArray2.put(i17, -1);
                }
                arrayList5.addAll(arrayList6);
                int size2 = arrayList4.size();
                for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i18);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList4.add(stickerSetCovered);
                        sparseArray.put(o61Var.w, stickerSetCovered);
                        int i19 = o61Var.w;
                        o61Var.w = i19 + 1;
                        int i20 = size2 + 1;
                        sparseArray2.put(i19, Integer.valueOf(size2));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(o61Var.w, stickerSetCovered.cover);
                            i11 = 1;
                        } else {
                            i11 = (int) Math.ceil(stickerSetCovered.covers.size() / o61Var.v);
                            for (int i21 = 0; i21 < stickerSetCovered.covers.size(); i21++) {
                                sparseArray2.put(o61Var.w + i21, stickerSetCovered.covers.get(i21));
                            }
                        }
                        int i22 = 0;
                        while (true) {
                            int i23 = o61Var.v * i11;
                            if (i22 < i23) {
                                sparseArray.put(o61Var.w + i22, stickerSetCovered);
                                i22++;
                            } else {
                                o61Var.w = i23 + o61Var.w;
                                size2 = i20;
                            }
                        }
                    }
                }
                o61Var.l();
                return;
            case 3:
                z81 z81Var = (z81) this.b;
                Uri uri2 = (Uri) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                z81Var.getClass();
                if ("tg".equals(uri2.getScheme())) {
                    int intValue = Utilities.parseInt((CharSequence) uri2.getQueryParameter("account")).intValue();
                    Object parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) uri2.getQueryParameter("rid")).intValue());
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.parseLong(uri2.getQueryParameter("hash")).longValue();
                    tL_document.id = Utilities.parseLong(uri2.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.parseLong(uri2.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.parseInt((CharSequence) uri2.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri2.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.hexToBytes(uri2.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri2.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (FileLoader.getInstance(intValue).isLoadingFile(FileLoader.getAttachFileName(tL_document))) {
                        File directory = FileLoader.getDirectory(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(tL_document.dc_id);
                        sb2.append("_");
                        absolutePath = new File(directory, a1.g.r(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    z81Var.b = new g6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    z81Var.b = new g6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                z81Var.c = z81Var.b.d[4];
                float f7 = z81Var.h;
                if (f7 != 0.0f) {
                    z81Var.e(messageObject, f7, z81Var.r);
                    z81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new v81(z81Var, true ? 1 : 0));
                return;
            case 4:
                z81 z81Var2 = (z81) this.b;
                q81 q81Var = (q81) this.c;
                MessageObject messageObject2 = (MessageObject) this.d;
                z81Var2.getClass();
                if (q81Var.b()) {
                    z81Var2.b = new g6(new File(q81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i24 = UserConfig.selectedAccount;
                    try {
                        i24 = Utilities.parseInt((CharSequence) q81Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i25 = i24;
                    try {
                        obj2 = FileLoader.getInstance(i25).getParentObject(Utilities.parseInt((CharSequence) q81Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    Object obj4 = obj2;
                    TLRPC.Document document = q81Var.g;
                    if (FileLoader.getInstance(i25).isLoadingFile(FileLoader.getAttachFileName(document))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a1.g.r(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i25).getPathToAttach(document, false).getAbsolutePath();
                    }
                    z81Var2.b = new g6(new File(absolutePath2), true, document.size, 1, document, null, obj4, 0L, i25, true);
                }
                z81Var2.c = z81Var2.b.d[4];
                float f10 = z81Var2.h;
                if (f10 != 0.0f) {
                    z81Var2.e(messageObject2, f10, z81Var2.r);
                    z81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new v81(z81Var2, i13));
                return;
            case 5:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.c;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.d;
                ValueAnimator valueAnimator = l0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.k0(l0Var, tVar)).setDuration(100L).start();
                if (tVar2 != null) {
                    tVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.x(tVar2)).start();
                    return;
                }
                return;
            case 6:
                File file = (File) this.b;
                int[] iArr = (int[]) this.c;
                bi.r7 r7Var = (bi.r7) this.d;
                AnimatedFileNative.d(file.getAbsolutePath(), iArr, 0L);
                AndroidUtilities.runOnUIThread(r7Var);
                return;
            case 7:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                q0.a aVar = (q0.a) this.c;
                String[] strArr = (String[]) this.d;
                a1Var.getClass();
                int length = strArr.length;
                int i26 = 0;
                while (true) {
                    if (i26 >= length) {
                        z11 = true;
                    } else if (a1Var.getContext().checkSelfPermission(strArr[i26]) == 0) {
                        i26++;
                    }
                }
                aVar.accept(Boolean.valueOf(z11));
                return;
            case 8:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.a1 a1Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (a1Var2 == null) {
                        return;
                    }
                    boolean z13 = org.telegram.ui.web.a1.Q0;
                    a1Var2.E(botWebViewContainer$BotWebViewProxy, a1Var2.f(), str, str2);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 9:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                org.telegram.ui.web.a1 a1Var3 = botWebViewContainer$WebViewProxy.a;
                if (a1Var3 == null || a1Var3.o0 || a1Var3.c == null) {
                    return;
                }
                if (a1Var3.G0 != null && !TextUtils.equals(a1Var3.getOriginHost(), a1Var3.G0)) {
                    a1Var3.g("onWebEventReceived ignore " + str3);
                    return;
                }
                a1Var3.g("onWebEventReceived " + str3 + " " + str4);
                str3.getClass();
                switch (str3) {
                    case "actionBarColor":
                    case "navigationBarColor":
                        try {
                            JSONArray jSONArray = new JSONArray(str4);
                            boolean equals2 = TextUtils.equals(str3, "actionBarColor");
                            int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                            org.telegram.ui.web.x0 x0Var = a1Var3.a;
                            if (x0Var != null) {
                                if (equals2) {
                                    x0Var.s = true;
                                    x0Var.w = argb;
                                } else {
                                    x0Var.v = true;
                                    x0Var.x = argb;
                                }
                                org.telegram.ui.web.x0.a(x0Var);
                            }
                            a1Var3.c.o(argb, equals2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    case "oauth_request":
                        a1Var3.g("oauth_request " + str4);
                        if (a1Var3.a == null) {
                            return;
                        }
                        String originHost = a1Var3.getOriginHost();
                        if (TextUtils.isEmpty(originHost)) {
                            return;
                        }
                        try {
                            String optString = new JSONObject(str4).optString("url");
                            a1Var3.y("oauth_supported", org.telegram.ui.web.a1.A(1, "version"));
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                            tL_messages_requestUrlAuth.url = optString;
                            int i27 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = i27 | 12;
                            ConnectionsManager.getInstance(a1Var3.M).sendRequest(tL_messages_requestUrlAuth, new bi.i2(a1Var3, tL_messages_requestUrlAuth, optString, originHost, 19), 2);
                            return;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                    case "siteName":
                        a1Var3.g("siteName " + str4);
                        org.telegram.ui.web.x0 x0Var2 = a1Var3.a;
                        if (x0Var2 != null) {
                            x0Var2.r = str4;
                            org.telegram.ui.web.x0.a(x0Var2);
                            return;
                        }
                        return;
                    case "allowScroll":
                        try {
                            JSONArray jSONArray2 = new JSONArray(str4);
                            z10 = jSONArray2.optBoolean(0, true);
                            try {
                                z12 = jSONArray2.optBoolean(1, true);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            z10 = true;
                        }
                        if (a1Var3.getParent() instanceof hi.n4) {
                            hi.n4 n4Var = (hi.n4) a1Var3.getParent();
                            n4Var.O = z10;
                            n4Var.P = z12;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 10:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                String str5 = (String) this.c;
                ArrayList arrayList8 = new ArrayList();
                for (int i28 = 0; i28 < arrayList7.size(); i28++) {
                    org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) arrayList7.get(i28);
                    if (org.telegram.ui.web.e1.n(b1Var.c, str5) || ((l2Var = b1Var.d) != null && (org.telegram.ui.web.e1.n(l2Var.c, str5) || org.telegram.ui.web.e1.n(b1Var.d.d, str5)))) {
                        arrayList8.add(b1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(14, e1Var, arrayList8));
                return;
            case 11:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.b;
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                h2Var.getClass();
                if (org.telegram.ui.web.h2.f == null) {
                    return;
                }
                char c10 = ((g2Var.d > 0 && g2Var.e > 0) || bitmap == null) ? (char) 0 : (char) 1;
                if (bitmap != null) {
                    h2Var.d.put(g2Var.b, bitmap);
                    if (c10 != 0) {
                        int i29 = g2Var.d;
                        if (i29 == 0 && g2Var.e == 0) {
                            g2Var.d = bitmap.getWidth();
                            g2Var.e = bitmap.getHeight();
                        } else if (i29 == 0) {
                            g2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * g2Var.e);
                        } else if (g2Var.e == 0) {
                            g2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * g2Var.d);
                        }
                    }
                }
                ArrayList arrayList9 = (ArrayList) org.telegram.ui.web.h2.f.remove(g2Var.b);
                if (arrayList9 == null) {
                    return;
                }
                int size3 = arrayList9.size();
                while (i14 < size3) {
                    Object obj5 = arrayList9.get(i14);
                    i14++;
                    Pair pair = (Pair) obj5;
                    ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                    if (c10 != 0 && (obj = pair.second) != null) {
                        ((Runnable) obj).run();
                    }
                }
                return;
            case 12:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                return;
            case 13:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 14:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 15:
                ti.j jVar = (ti.j) this.b;
                WebView webView = (WebView) this.c;
                c5.h hVar = (c5.h) this.d;
                synchronized (jVar.a) {
                    if (!jVar.u && jVar.o == webView && jVar.p == hVar && !jVar.r) {
                        if (jVar.s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            jVar.o();
                            return;
                        } else {
                            jVar.s = true;
                            FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                            jVar.f();
                            return;
                        }
                    }
                    return;
                }
            case 16:
                ui.o oVar = (ui.o) this.b;
                ui.i iVar = (ui.i) this.c;
                byte[] bArr = (byte[]) this.d;
                File file2 = iVar.b;
                if (oVar.n != ui.m.d) {
                    return;
                }
                oVar.C = bArr;
                try {
                    oVar.o();
                    if (oVar.e) {
                        i2.j0 a2 = new i2.o(oVar.a).a();
                        oVar.B = a2;
                        a2.p0(oVar.G);
                        oVar.B.r0(b2.p0.b(Uri.fromFile(file2)));
                        oVar.B.a();
                    }
                    oVar.r(ui.m.e);
                    ui.f fVar = oVar.f;
                    long j10 = oVar.j();
                    long j11 = oVar.s;
                    long j12 = oVar.t;
                    byte[] bArr2 = oVar.C;
                    fVar.onPreviewReady(j10, j11, j12, bArr2 != null ? (byte[]) bArr2.clone() : null);
                    return;
                } catch (Throwable th2) {
                    oVar.g(th2 instanceof Exception ? th2 : new RuntimeException(th2));
                    return;
                }
            case 17:
                ((ui.o) this.b).g.onOutputStarted(((ui.i) this.c).a, (File) this.d);
                return;
            case 18:
                ((ui.o) this.b).g.onOutputError(((ui.i) this.c).a, (Exception) this.d);
                return;
            case 19:
                ((ui.o) this.b).g.onOutputInvalidated(((ui.i) this.c).a, (ui.j) this.d);
                return;
            case 20:
                ((vg.x0) this.b).run(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 21:
                TLObject tLObject2 = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                vg.x0 x0Var3 = (vg.x0) this.d;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList10 = new ArrayList();
                    for (int i30 = 0; i30 < tL_channels_channelParticipants.participants.size(); i30++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i30).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList10.add(messagesController.getInputPeer(peer));
                        }
                    }
                    x0Var3.run(arrayList10);
                    return;
                }
                return;
            case 22:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 23:
                ((ig.o) this.b).run(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 24:
                vi.s sVar = (vi.s) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                sVar.getClass();
                try {
                    sVar.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 25:
                vi.s0 s0Var = (vi.s0) this.b;
                vi.v vVar = (vi.v) this.c;
                File file3 = (File) this.d;
                Handler handler = s0Var.i;
                try {
                    vVar.c(file3);
                    s0Var.g();
                    long e13 = w7.x.e(file3) / 1000;
                    s0Var.m.b("preview snapshot completed: durationMs=" + e13 + ", size=" + file3.length() + ", elapsedMs=" + vi.s0.f(s0Var.J));
                    handler.post(new vi.e0(s0Var, e13, true ? 1 : 0));
                    return;
                } catch (Exception e14) {
                    handler.post(new vi.d0(s0Var, e14, i12));
                    return;
                }
            case 26:
                a();
                return;
            case 27:
                xf.d dVar = (xf.d) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                String str6 = dVar.b;
                int i31 = dVar.a;
                if (tLObject3 != null) {
                    MediaDataController.getInstance(i31).onRingtoneUploaded(str6, (TLRPC.Document) tLObject3, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i31).onRingtoneUploaded(str6, null, true);
                    if (tL_error3 != null) {
                        NotificationCenter.getInstance(i31).doOnIdle(new vi.i0(5, dVar, tL_error3));
                    }
                }
                dVar.a();
                return;
            case 28:
                xh.n nVar = (xh.n) this.b;
                aa0 aa0Var = (aa0) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                y90 y90Var = nVar.G;
                if (y90Var == null || nVar.H != aa0Var) {
                    return;
                }
                y90Var.a(clickableSpan);
                nVar.H = null;
                nVar.x.d(true);
                return;
            default:
                u4.f fVar2 = (u4.f) this.b;
                Executor executor = (Executor) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    ((Task) fVar2.call()).continueWith(executor, new y9.w(2, taskCompletionSource));
                    return;
                } catch (Exception e15) {
                    taskCompletionSource.setException(e15);
                    return;
                }
        }
    }

    public /* synthetic */ ny0(org.telegram.ui.web.e1 e1Var, ArrayList arrayList, String str) {
        this.a = 10;
        this.b = e1Var;
        this.d = arrayList;
        this.c = str;
    }
}
