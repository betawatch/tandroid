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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fy0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        si.u0 u0Var = (si.u0) this.b;
        si.q0 q0Var = (si.q0) this.c;
        File file = (File) this.d;
        si.r0 r0Var = u0Var.e;
        long j10 = q0Var.a;
        d11 d11Var = (d11) r0Var;
        synchronized (d11Var) {
            if (d11Var.d) {
                return;
            }
            d11Var.c.put(Long.valueOf(j10), new b11(file));
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
        org.telegram.ui.web.m2 m2Var;
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
                ty0.I((ty0) this.b, (String) this.c, (TextView) this.d);
                return;
            case 1:
                ty0 ty0Var = (ty0) this.b;
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
                        if (ty0Var.isDismissed()) {
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
                                AndroidUtilities.runOnUIThread(new lg(ty0Var, arrayList3, bool, 28));
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new lg(ty0Var, arrayList3, bool, 28));
                return;
            case 2:
                h61 h61Var = (h61) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = h61Var.f;
                ArrayList arrayList4 = h61Var.e;
                ArrayList arrayList5 = h61Var.n;
                SparseArray sparseArray2 = h61Var.d;
                h61Var.r = false;
                if (tL_error != null || !(tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    h61Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList6 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                if (arrayList6.size() < 40) {
                    h61Var.s = true;
                }
                if (arrayList6.isEmpty()) {
                    return;
                }
                if (arrayList5.isEmpty()) {
                    int i17 = h61Var.w;
                    h61Var.w = i17 + 1;
                    sparseArray2.put(i17, -1);
                }
                arrayList5.addAll(arrayList6);
                int size2 = arrayList4.size();
                for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i18);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList4.add(stickerSetCovered);
                        sparseArray.put(h61Var.w, stickerSetCovered);
                        int i19 = h61Var.w;
                        h61Var.w = i19 + 1;
                        int i20 = size2 + 1;
                        sparseArray2.put(i19, Integer.valueOf(size2));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(h61Var.w, stickerSetCovered.cover);
                            i11 = 1;
                        } else {
                            i11 = (int) Math.ceil(stickerSetCovered.covers.size() / h61Var.v);
                            for (int i21 = 0; i21 < stickerSetCovered.covers.size(); i21++) {
                                sparseArray2.put(h61Var.w + i21, stickerSetCovered.covers.get(i21));
                            }
                        }
                        int i22 = 0;
                        while (true) {
                            int i23 = h61Var.v * i11;
                            if (i22 < i23) {
                                sparseArray.put(h61Var.w + i22, stickerSetCovered);
                                i22++;
                            } else {
                                h61Var.w = i23 + h61Var.w;
                                size2 = i20;
                            }
                        }
                    }
                }
                h61Var.l();
                return;
            case 3:
                q81 q81Var = (q81) this.b;
                Uri uri2 = (Uri) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                q81Var.getClass();
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
                    q81Var.b = new e6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    q81Var.b = new e6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                q81Var.c = q81Var.b.d[4];
                float f7 = q81Var.h;
                if (f7 != 0.0f) {
                    q81Var.e(messageObject, f7, q81Var.r);
                    q81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new m81(q81Var, true ? 1 : 0));
                return;
            case 4:
                q81 q81Var2 = (q81) this.b;
                h81 h81Var = (h81) this.c;
                MessageObject messageObject2 = (MessageObject) this.d;
                q81Var2.getClass();
                if (h81Var.b()) {
                    q81Var2.b = new e6(new File(h81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i24 = UserConfig.selectedAccount;
                    try {
                        i24 = Utilities.parseInt((CharSequence) h81Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i25 = i24;
                    try {
                        obj2 = FileLoader.getInstance(i25).getParentObject(Utilities.parseInt((CharSequence) h81Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Object obj4 = obj2;
                    TLRPC.Document document = h81Var.g;
                    if (FileLoader.getInstance(i25).isLoadingFile(FileLoader.getAttachFileName(document))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a1.g.r(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i25).getPathToAttach(document, false).getAbsolutePath();
                    }
                    q81Var2.b = new e6(new File(absolutePath2), true, document.size, 1, document, null, obj4, 0L, i25, true);
                }
                q81Var2.c = q81Var2.b.d[4];
                float f10 = q81Var2.h;
                if (f10 != 0.0f) {
                    q81Var2.e(messageObject2, f10, q81Var2.r);
                    q81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new m81(q81Var2, i13));
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
                ai.v7 v7Var = (ai.v7) this.d;
                AnimatedFileNative.d(file.getAbsolutePath(), iArr, 0L);
                AndroidUtilities.runOnUIThread(v7Var);
                return;
            case 7:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
                q0.a aVar = (q0.a) this.c;
                String[] strArr = (String[]) this.d;
                b1Var.getClass();
                int length = strArr.length;
                int i26 = 0;
                while (true) {
                    if (i26 >= length) {
                        z11 = true;
                    } else if (b1Var.getContext().checkSelfPermission(strArr[i26]) == 0) {
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
                    org.telegram.ui.web.b1 b1Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (b1Var2 == null) {
                        return;
                    }
                    boolean z13 = org.telegram.ui.web.b1.Q0;
                    b1Var2.E(botWebViewContainer$BotWebViewProxy, b1Var2.f(), str, str2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 9:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                org.telegram.ui.web.b1 b1Var3 = botWebViewContainer$WebViewProxy.a;
                if (b1Var3 == null || b1Var3.o0 || b1Var3.c == null) {
                    return;
                }
                if (b1Var3.G0 != null && !TextUtils.equals(b1Var3.getOriginHost(), b1Var3.G0)) {
                    b1Var3.g("onWebEventReceived ignore " + str3);
                    return;
                }
                b1Var3.g("onWebEventReceived " + str3 + " " + str4);
                str3.getClass();
                switch (str3) {
                    case "actionBarColor":
                    case "navigationBarColor":
                        try {
                            JSONArray jSONArray = new JSONArray(str4);
                            boolean equals2 = TextUtils.equals(str3, "actionBarColor");
                            int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                            org.telegram.ui.web.y0 y0Var = b1Var3.a;
                            if (y0Var != null) {
                                if (equals2) {
                                    y0Var.s = true;
                                    y0Var.w = argb;
                                } else {
                                    y0Var.v = true;
                                    y0Var.x = argb;
                                }
                                org.telegram.ui.web.y0.a(y0Var);
                            }
                            b1Var3.c.o(argb, equals2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    case "oauth_request":
                        b1Var3.g("oauth_request " + str4);
                        if (b1Var3.a == null) {
                            return;
                        }
                        String originHost = b1Var3.getOriginHost();
                        if (TextUtils.isEmpty(originHost)) {
                            return;
                        }
                        try {
                            String optString = new JSONObject(str4).optString("url");
                            b1Var3.y("oauth_supported", org.telegram.ui.web.b1.A(1, "version"));
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                            tL_messages_requestUrlAuth.url = optString;
                            int i27 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = i27 | 12;
                            ConnectionsManager.getInstance(b1Var3.M).sendRequest(tL_messages_requestUrlAuth, new ai.k2(b1Var3, tL_messages_requestUrlAuth, optString, originHost, 19), 2);
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    case "siteName":
                        b1Var3.g("siteName " + str4);
                        org.telegram.ui.web.y0 y0Var2 = b1Var3.a;
                        if (y0Var2 != null) {
                            y0Var2.r = str4;
                            org.telegram.ui.web.y0.a(y0Var2);
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
                        if (b1Var3.getParent() instanceof gi.e4) {
                            gi.e4 e4Var = (gi.e4) b1Var3.getParent();
                            e4Var.O = z10;
                            e4Var.P = z12;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 10:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
                ArrayList arrayList7 = (ArrayList) this.d;
                String str5 = (String) this.c;
                ArrayList arrayList8 = new ArrayList();
                for (int i28 = 0; i28 < arrayList7.size(); i28++) {
                    org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) arrayList7.get(i28);
                    if (org.telegram.ui.web.f1.w(c1Var.c, str5) || ((m2Var = c1Var.d) != null && (org.telegram.ui.web.f1.w(m2Var.c, str5) || org.telegram.ui.web.f1.w(c1Var.d.d, str5)))) {
                        arrayList8.add(c1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.y3(24, f1Var, arrayList8));
                return;
            case 11:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) this.b;
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                i2Var.getClass();
                if (org.telegram.ui.web.i2.f == null) {
                    return;
                }
                char c10 = ((h2Var.d > 0 && h2Var.e > 0) || bitmap == null) ? (char) 0 : (char) 1;
                if (bitmap != null) {
                    i2Var.d.put(h2Var.b, bitmap);
                    if (c10 != 0) {
                        int i29 = h2Var.d;
                        if (i29 == 0 && h2Var.e == 0) {
                            h2Var.d = bitmap.getWidth();
                            h2Var.e = bitmap.getHeight();
                        } else if (i29 == 0) {
                            h2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * h2Var.e);
                        } else if (h2Var.e == 0) {
                            h2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * h2Var.d);
                        }
                    }
                }
                ArrayList arrayList9 = (ArrayList) org.telegram.ui.web.i2.f.remove(h2Var.b);
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
                qi.i iVar = (qi.i) this.b;
                WebView webView = (WebView) this.c;
                b5.h hVar = (b5.h) this.d;
                synchronized (iVar.a) {
                    if (!iVar.u && iVar.o == webView && iVar.p == hVar && !iVar.r) {
                        if (iVar.s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            iVar.o();
                            return;
                        } else {
                            iVar.s = true;
                            FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                            iVar.f();
                            return;
                        }
                    }
                    return;
                }
            case 16:
                ri.o oVar = (ri.o) this.b;
                ri.i iVar2 = (ri.i) this.c;
                byte[] bArr = (byte[]) this.d;
                File file2 = iVar2.b;
                if (oVar.n != ri.m.d) {
                    return;
                }
                oVar.C = bArr;
                try {
                    oVar.o();
                    if (oVar.e) {
                        i2.h0 a2 = new i2.o(oVar.a).a();
                        oVar.B = a2;
                        a2.p0(oVar.G);
                        oVar.B.r0(b2.o0.b(Uri.fromFile(file2)));
                        oVar.B.b();
                    }
                    oVar.r(ri.m.e);
                    ri.f fVar = oVar.f;
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
                ((ri.o) this.b).g.onOutputStarted(((ri.i) this.c).a, (File) this.d);
                return;
            case 18:
                ((ri.o) this.b).g.onOutputError(((ri.i) this.c).a, (Exception) this.d);
                return;
            case 19:
                ((ri.o) this.b).g.onOutputInvalidated(((ri.i) this.c).a, (ri.j) this.d);
                return;
            case 20:
                si.t tVar3 = (si.t) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                tVar3.getClass();
                try {
                    tVar3.i();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 21:
                si.u0 u0Var = (si.u0) this.b;
                si.w wVar = (si.w) this.c;
                File file3 = (File) this.d;
                Handler handler = u0Var.i;
                try {
                    wVar.c(file3);
                    u0Var.g();
                    long e12 = w7.m7.e(file3) / 1000;
                    u0Var.m.b("preview snapshot completed: durationMs=" + e12 + ", size=" + file3.length() + ", elapsedMs=" + si.u0.f(u0Var.J));
                    handler.post(new si.f0(u0Var, e12, true ? 1 : 0));
                    return;
                } catch (Exception e13) {
                    handler.post(new si.e0(u0Var, e13, i12));
                    return;
                }
            case 22:
                a();
                return;
            case 23:
                ((ug.v0) this.b).run(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 24:
                TLObject tLObject2 = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                ug.v0 v0Var = (ug.v0) this.d;
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
                    v0Var.run(arrayList10);
                    return;
                }
                return;
            case 25:
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
            case 26:
                ((ig.k0) this.b).run(new Pair((HashMap) this.c, (ArrayList) this.d));
                return;
            case 27:
                wf.d dVar = (wf.d) this.b;
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
                        NotificationCenter.getInstance(i31).doOnIdle(new u2.k0(14, dVar, tL_error3));
                    }
                }
                dVar.a();
                return;
            case 28:
                wh.n nVar = (wh.n) this.b;
                z90 z90Var = (z90) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                x90 x90Var = nVar.G;
                if (x90Var == null || nVar.H != z90Var) {
                    return;
                }
                x90Var.a(clickableSpan);
                nVar.H = null;
                nVar.x.d(true);
                return;
            default:
                u4.f fVar2 = (u4.f) this.b;
                Executor executor = (Executor) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    ((Task) fVar2.call()).continueWith(executor, new x9.v(2, taskCompletionSource));
                    return;
                } catch (Exception e14) {
                    taskCompletionSource.setException(e14);
                    return;
                }
        }
    }

    public /* synthetic */ fy0(org.telegram.ui.web.f1 f1Var, ArrayList arrayList, String str) {
        this.a = 10;
        this.b = f1Var;
        this.d = arrayList;
        this.c = str;
    }
}
