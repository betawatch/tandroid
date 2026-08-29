package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yw0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:370:0x090c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0907 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Uri uri;
        String stickerExt;
        int i10;
        int i11;
        String absolutePath;
        String absolutePath2;
        char c3;
        boolean z10;
        org.telegram.ui.web.j2 j2Var;
        Object obj;
        ArrayList arrayList;
        int i12 = this.a;
        Boolean bool = null;
        Object obj2 = null;
        int i13 = 2;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = true;
        z11 = true;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i12) {
            case 0:
                nx0 nx0Var = (nx0) obj5;
                String str = (String) obj4;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj3;
                if (!nx0Var.isDismissed()) {
                    nx0Var.V.remove(str);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int indexOf = nx0Var.U.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            f2.n1 K = nx0Var.c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.b8) K.a).setSticker(importingSticker);
                            }
                        } else {
                            nx0Var.d.l();
                        }
                    } else {
                        nx0Var.u0(importingSticker);
                    }
                    if (nx0Var.V.isEmpty()) {
                        nx0Var.B0();
                        break;
                    }
                }
                break;
            case 1:
                nx0.w((nx0) obj5, (ArrayList) obj4, (Boolean) obj3);
                break;
            case 2:
                nx0.D((nx0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3);
                break;
            case 3:
                nx0.F((nx0) obj5, (String) obj4, (TextView) obj3);
                break;
            case 4:
                nx0 nx0Var2 = (nx0) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size = arrayList2.size();
                while (i14 < size) {
                    Object obj6 = arrayList2.get(i14);
                    if ((obj6 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj6))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool == null) {
                            bool = Boolean.valueOf(equals);
                        } else if (bool.booleanValue() != equals) {
                            continue;
                        }
                        if (nx0Var2.isDismissed()) {
                            break;
                        } else {
                            SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                            importingSticker2.animated = equals;
                            int i16 = i14;
                            String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                            importingSticker2.path = copyFileToCache;
                            if (copyFileToCache != null) {
                                if (equals) {
                                    importingSticker2.mimeType = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(copyFileToCache, options);
                                    int i17 = options.outWidth;
                                    if ((i17 == 512 && (i10 = options.outHeight) > 0 && i10 <= 512) || (options.outHeight == 512 && i17 > 0 && i17 <= 512)) {
                                        importingSticker2.mimeType = "image/".concat(stickerExt);
                                        importingSticker2.validated = true;
                                    }
                                }
                                if (arrayList3 == null || arrayList3.size() != size) {
                                    i14 = i16;
                                } else {
                                    i14 = i16;
                                    if (arrayList3.get(i14) instanceof String) {
                                        importingSticker2.emoji = (String) arrayList3.get(i14);
                                        arrayList4.add(importingSticker2);
                                        if (arrayList4.size() < 200) {
                                            AndroidUtilities.runOnUIThread(new yw0(nx0Var2, arrayList4, bool, 1));
                                            break;
                                        }
                                    }
                                }
                                importingSticker2.emoji = "#️⃣";
                                arrayList4.add(importingSticker2);
                                if (arrayList4.size() < 200) {
                                }
                            }
                            i14 = i16;
                        }
                    }
                    i14++;
                }
                AndroidUtilities.runOnUIThread(new yw0(nx0Var2, arrayList4, bool, 1));
                break;
            case 5:
                r41 r41Var = (r41) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                SparseArray sparseArray = r41Var.f;
                ArrayList arrayList5 = r41Var.e;
                ArrayList arrayList6 = r41Var.n;
                SparseArray sparseArray2 = r41Var.d;
                r41Var.r = false;
                if (tL_error != null || !(tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    r41Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList7 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                    if (arrayList7.size() < 40) {
                        r41Var.s = true;
                    }
                    if (!arrayList7.isEmpty()) {
                        if (arrayList6.isEmpty()) {
                            int i18 = r41Var.w;
                            r41Var.w = i18 + 1;
                            sparseArray2.put(i18, -1);
                        }
                        arrayList6.addAll(arrayList7);
                        int size2 = arrayList5.size();
                        for (int i19 = 0; i19 < arrayList7.size(); i19++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList7.get(i19);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList5.add(stickerSetCovered);
                                sparseArray.put(r41Var.w, stickerSetCovered);
                                int i20 = r41Var.w;
                                r41Var.w = i20 + 1;
                                int i21 = size2 + 1;
                                sparseArray2.put(i20, Integer.valueOf(size2));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(r41Var.w, stickerSetCovered.cover);
                                    i11 = 1;
                                } else {
                                    i11 = (int) Math.ceil(stickerSetCovered.covers.size() / r41Var.v);
                                    for (int i22 = 0; i22 < stickerSetCovered.covers.size(); i22++) {
                                        sparseArray2.put(r41Var.w + i22, stickerSetCovered.covers.get(i22));
                                    }
                                }
                                int i23 = 0;
                                while (true) {
                                    int i24 = r41Var.v * i11;
                                    if (i23 < i24) {
                                        sparseArray.put(r41Var.w + i23, stickerSetCovered);
                                        i23++;
                                    } else {
                                        r41Var.w = i24 + r41Var.w;
                                        size2 = i21;
                                    }
                                }
                            }
                        }
                        r41Var.l();
                        break;
                    }
                }
                break;
            case 6:
                d71 d71Var = (d71) obj5;
                Uri uri2 = (Uri) obj4;
                MessageObject messageObject = (MessageObject) obj3;
                d71Var.getClass();
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
                        absolutePath = new File(directory, a4.w.p(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    d71Var.b = new c6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    d71Var.b = new c6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                d71Var.c = d71Var.b.d[4];
                float f9 = d71Var.h;
                if (f9 != 0.0f) {
                    d71Var.e(messageObject, f9, d71Var.r);
                    d71Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new a71(d71Var, true ? 1 : 0));
                break;
            case 7:
                d71 d71Var2 = (d71) obj5;
                v61 v61Var = (v61) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                d71Var2.getClass();
                if (v61Var.b()) {
                    d71Var2.b = new c6(new File(v61Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i25 = UserConfig.selectedAccount;
                    try {
                        i25 = Utilities.parseInt((CharSequence) v61Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    int i26 = i25;
                    try {
                        obj2 = FileLoader.getInstance(i26).getParentObject(Utilities.parseInt((CharSequence) v61Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    Object obj7 = obj2;
                    TLRPC.Document document = v61Var.g;
                    if (FileLoader.getInstance(i26).isLoadingFile(FileLoader.getAttachFileName(document))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a4.w.p(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i26).getPathToAttach(document, false).getAbsolutePath();
                    }
                    d71Var2.b = new c6(new File(absolutePath2), true, document.size, 1, document, null, obj7, 0L, i26, true);
                }
                d71Var2.c = d71Var2.b.d[4];
                float f10 = d71Var2.h;
                if (f10 != 0.0f) {
                    d71Var2.e(messageObject2, f10, d71Var2.r);
                    d71Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new a71(d71Var2, i13));
                break;
            case 8:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj5;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj4;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj3;
                ValueAnimator valueAnimator = l0Var.J0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                uVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.k0(l0Var, uVar)).setDuration(100L).start();
                if (uVar2 != null) {
                    uVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.x(uVar2)).start();
                    break;
                }
                break;
            case 9:
                ((org.telegram.ui.web.w0) obj5).d("window.Telegram.WebView.receiveEvent('" + ((String) obj4) + "', " + ((JSONObject) obj3) + ");");
                break;
            case 10:
                ((q0.a) obj4).accept(Boolean.valueOf(((org.telegram.ui.web.z0) obj5).d((String[]) obj3)));
                break;
            case 11:
                AnimatedFileNative.d(((File) obj5).getAbsolutePath(), (int[]) obj4, 0L);
                AndroidUtilities.runOnUIThread((eg.h0) obj3);
                break;
            case 12:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.z0 z0Var = botWebViewContainer$BotWebViewProxy.a;
                    if (z0Var == null) {
                        break;
                    } else {
                        boolean z12 = org.telegram.ui.web.z0.I0;
                        z0Var.B(botWebViewContainer$BotWebViewProxy, str2, str3);
                        break;
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 13:
                String str4 = (String) obj4;
                String str5 = (String) obj3;
                org.telegram.ui.web.z0 z0Var2 = ((BotWebViewContainer$WebViewProxy) obj5).a;
                if (!z0Var2.k0 && z0Var2.c != null) {
                    if (z0Var2.z0 != null && !TextUtils.equals(z0Var2.getOriginHost(), z0Var2.z0)) {
                        z0Var2.g("onWebEventReceived ignore " + str4);
                        break;
                    } else {
                        z0Var2.g("onWebEventReceived " + str4 + " " + str5);
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1695046810:
                                if (str4.equals("actionBarColor")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -462720700:
                                if (str4.equals("navigationBarColor")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 479731943:
                                if (str4.equals("oauth_request")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 675009138:
                                if (str4.equals("siteName")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 997530486:
                                if (str4.equals("allowScroll")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                            case 1:
                                try {
                                    JSONArray jSONArray = new JSONArray(str5);
                                    boolean equals2 = TextUtils.equals(str4, "actionBarColor");
                                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                    org.telegram.ui.web.w0 w0Var = z0Var2.a;
                                    if (w0Var != null) {
                                        if (equals2) {
                                            w0Var.s = true;
                                            w0Var.w = argb;
                                        } else {
                                            w0Var.v = true;
                                            w0Var.x = argb;
                                        }
                                        org.telegram.ui.web.w0.a(w0Var);
                                    }
                                    z0Var2.c.o(argb, equals2);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            case 2:
                                z0Var2.g("oauth_request " + str5);
                                if (z0Var2.a != null) {
                                    String originHost = z0Var2.getOriginHost();
                                    if (!TextUtils.isEmpty(originHost)) {
                                        try {
                                            String optString = new JSONObject(str5).optString("url");
                                            z0Var2.v("oauth_supported", org.telegram.ui.web.z0.x(1, "version"));
                                            if (!TextUtils.isEmpty(optString)) {
                                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                tL_messages_requestUrlAuth.url = optString;
                                                int i27 = tL_messages_requestUrlAuth.flags;
                                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                tL_messages_requestUrlAuth.flags = i27 | 12;
                                                ConnectionsManager.getInstance(z0Var2.I).sendRequest(tL_messages_requestUrlAuth, new ih.c1(z0Var2, tL_messages_requestUrlAuth, optString, originHost, 17), 2);
                                                break;
                                            }
                                        } catch (Exception e13) {
                                            FileLog.e(e13);
                                            return;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                z0Var2.g("siteName " + str5);
                                org.telegram.ui.web.w0 w0Var2 = z0Var2.a;
                                if (w0Var2 != null) {
                                    w0Var2.r = str5;
                                    org.telegram.ui.web.w0.a(w0Var2);
                                    break;
                                }
                                break;
                            case 4:
                                try {
                                    JSONArray jSONArray2 = new JSONArray(str5);
                                    z10 = jSONArray2.optBoolean(0, true);
                                    try {
                                        z11 = jSONArray2.optBoolean(1, true);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    z10 = true;
                                }
                                if (z0Var2.getParent() instanceof ph.m3) {
                                    ph.m3 m3Var = (ph.m3) z0Var2.getParent();
                                    m3Var.K = z10;
                                    m3Var.L = z11;
                                    break;
                                }
                                break;
                        }
                    }
                }
                break;
            case 14:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                ArrayList arrayList8 = (ArrayList) obj3;
                String str6 = (String) obj4;
                ArrayList arrayList9 = new ArrayList();
                for (int i28 = 0; i28 < arrayList8.size(); i28++) {
                    org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) arrayList8.get(i28);
                    if (org.telegram.ui.web.c1.t(a1Var.c, str6) || ((j2Var = a1Var.d) != null && (org.telegram.ui.web.c1.t(j2Var.c, str6) || org.telegram.ui.web.c1.t(a1Var.d.d, str6)))) {
                        arrayList9.add(a1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(i13, c1Var, arrayList9));
                break;
            case 15:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) obj5;
                org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                f2Var.getClass();
                if (org.telegram.ui.web.f2.f != null) {
                    char c6 = ((e2Var.d > 0 && e2Var.e > 0) || bitmap == null) ? (char) 0 : (char) 1;
                    if (bitmap != null) {
                        f2Var.d.put(e2Var.b, bitmap);
                        if (c6 != 0) {
                            int i29 = e2Var.d;
                            if (i29 == 0 && e2Var.e == 0) {
                                e2Var.d = bitmap.getWidth();
                                e2Var.e = bitmap.getHeight();
                            } else if (i29 == 0) {
                                e2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * e2Var.e);
                            } else if (e2Var.e == 0) {
                                e2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * e2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList10 = (ArrayList) org.telegram.ui.web.f2.f.remove(e2Var.b);
                    if (arrayList10 != null) {
                        int size3 = arrayList10.size();
                        while (i15 < size3) {
                            Object obj8 = arrayList10.get(i15);
                            i15++;
                            Pair pair = (Pair) obj8;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (c6 != 0 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        break;
                    }
                }
                break;
            case 16:
                ((EglRenderer) obj5).lambda$init$0((EglBase.Context) obj4, (int[]) obj3);
                break;
            case 17:
                ((EglRenderer) obj5).lambda$removeFrameListener$4((CountDownLatch) obj4, (EglRenderer.FrameListener) obj3);
                break;
            case 18:
                ((VideoFileRenderer) obj5).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj4, (VideoFrame) obj3);
                break;
            case 19:
                ArrayList arrayList11 = (ArrayList) obj5;
                HashMap hashMap = (HashMap) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                ArrayList arrayList12 = new ArrayList();
                for (int i30 = 0; i30 < arrayList11.size(); i30++) {
                    TLRPC.User user = (TLRPC.User) arrayList11.get(i30);
                    Boolean bool2 = (Boolean) hashMap.get(Long.valueOf(user.id));
                    boolean z13 = bool2 == null || !bool2.booleanValue();
                    ph.o oVar = new ph.o();
                    oVar.a = user;
                    oVar.b = z13;
                    arrayList12.add(oVar);
                }
                callback.run(arrayList12);
                break;
            case 20:
                ph.j1 j1Var = (ph.j1) obj3;
                ((boolean[]) obj5)[0] = false;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    j1Var.run(Boolean.TRUE);
                    break;
                }
                break;
            case 21:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                ph.p2 p2Var = ((ph.k2) obj5).d;
                if (((TLObject) obj4) instanceof TLRPC.TL_boolTrue) {
                    ph.h2 h2Var = p2Var.x;
                    h2Var.getClass();
                    h2Var.v("emoji_status_access_requested", org.telegram.ui.web.z0.x("cancelled", "status"));
                    break;
                } else {
                    new tc(p2Var.l0, p2Var.A).Y(tL_error2).k(true);
                    break;
                }
            case 22:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                tc.a0((ph.d3) obj5).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, ph.j.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj3))), R.raw.copy).j();
                break;
            case 23:
                ph.d3.A0((ph.d3) obj5, (TLObject) obj4, (org.telegram.ui.ActionBar.c2) obj3);
                break;
            case 24:
                org.telegram.messenger.n7 n7Var = (org.telegram.messenger.n7) obj3;
                int i31 = ((rf.a0) obj5).o0;
                MessagesController messagesController = MessagesController.getInstance(i31);
                Iterator it = ((HashSet) obj4).iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l10 = (Long) pair2.second;
                    (booleanValue ? messagesController.dialogs_read_outbox_max : messagesController.dialogs_read_inbox_max).put(l10, Integer.valueOf(MessagesStorage.getInstance(i31).getDialogReadMaxSync(booleanValue, l10.longValue())));
                }
                AndroidUtilities.runOnUIThread(n7Var);
                break;
            case 25:
                ((rf.y) obj5).a((a0.h) obj3, (ArrayList) obj4);
                break;
            case 26:
                rf.v0 v0Var = (rf.v0) obj5;
                String str7 = (String) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                v0Var.A0 = 0;
                if (str7.equals(v0Var.z0) && (tLObject2 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                    ArrayList arrayList13 = v0Var.w0;
                    int size4 = arrayList13 != null ? arrayList13.size() : 0;
                    v0Var.F("sticker_search_".concat(str7), tL_messages_stickers.stickers);
                    ArrayList arrayList14 = v0Var.w0;
                    int size5 = arrayList14 != null ? arrayList14.size() : 0;
                    if (!v0Var.k0 && (arrayList = v0Var.w0) != null && !arrayList.isEmpty()) {
                        v0Var.H();
                        v0Var.R.a(v0Var.K() > 0);
                        v0Var.k0 = true;
                    }
                    if (size4 != size5) {
                        v0Var.l();
                        break;
                    }
                }
                break;
            case 27:
                rf.v0 v0Var2 = (rf.v0) obj5;
                v0Var2.l0 = null;
                v0Var2.Y((a0.h) obj3, (ArrayList) obj4, true);
                break;
            case 28:
                rf.k1 k1Var = (rf.k1) obj5;
                ArrayList arrayList15 = (ArrayList) obj4;
                k1Var.q = arrayList15;
                k1Var.r = (HashMap) obj3;
                k1Var.s = true;
                k1Var.a.E(arrayList15);
                break;
            default:
                rf.l1 l1Var = (rf.l1) obj5;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj3;
                String str8 = ((TLRPC.TL_messages_searchStickerSets) obj4).q;
                rf.m1 m1Var = l1Var.a;
                String str9 = m1Var.N;
                g41 g41Var = m1Var.e;
                if (str8.equals(str9)) {
                    l1Var.a();
                    g41Var.b.h.getProgressDrawable().e = false;
                    m1Var.J = 0;
                    g41Var.b(true);
                    m1Var.A.addAll(tL_messages_foundStickerSets.sets);
                    m1Var.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yw0(org.telegram.ui.web.c1 c1Var, ArrayList arrayList, String str) {
        this.a = 14;
        this.b = c1Var;
        this.d = arrayList;
        this.c = str;
    }
}
