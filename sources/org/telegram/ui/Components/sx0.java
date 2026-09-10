package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.r91;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class sx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sx0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x048f, code lost:
    
        if (r14.equals("allowScroll") == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x09c5, code lost:
    
        if (r10.booleanValue() != r6) goto L358;
     */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04dd  */
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
        boolean z10;
        boolean z11;
        org.telegram.ui.web.o2 o2Var;
        Object obj;
        TLRPC.User user;
        boolean z12;
        boolean z13;
        int i12 = this.a;
        char c10 = 4;
        int i13 = 2;
        Boolean bool = null;
        Object obj2 = null;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i12) {
            case 0:
                hy0.D((hy0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3);
                break;
            case 1:
                hy0.F((hy0) obj5, (String) obj4, (TextView) obj3);
                break;
            case 2:
                hy0 hy0Var = (hy0) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Object obj6 = arrayList.get(i14);
                    if ((obj6 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj6))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool != null) {
                            break;
                        } else {
                            bool = Boolean.valueOf(equals);
                        }
                        if (hy0Var.isDismissed()) {
                            break;
                        } else {
                            SendMessagesHelper.ImportingSticker importingSticker = new SendMessagesHelper.ImportingSticker();
                            importingSticker.animated = equals;
                            String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                            importingSticker.path = copyFileToCache;
                            if (copyFileToCache != null) {
                                if (equals) {
                                    importingSticker.mimeType = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(copyFileToCache, options);
                                    int i15 = options.outWidth;
                                    if ((i15 == 512 && (i10 = options.outHeight) > 0 && i10 <= 512) || (options.outHeight == 512 && i15 > 0 && i15 <= 512)) {
                                        importingSticker.mimeType = "image/".concat(stickerExt);
                                        importingSticker.validated = true;
                                    }
                                }
                                if (arrayList2 != null && arrayList2.size() == size && (arrayList2.get(i14) instanceof String)) {
                                    importingSticker.emoji = (String) arrayList2.get(i14);
                                } else {
                                    importingSticker.emoji = "#️⃣";
                                }
                                arrayList3.add(importingSticker);
                                if (arrayList3.size() >= 200) {
                                    AndroidUtilities.runOnUIThread(new gf(hy0Var, arrayList3, bool, 29));
                                    break;
                                }
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new gf(hy0Var, arrayList3, bool, 29));
                break;
            case 3:
                q51 q51Var = (q51) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                SparseArray sparseArray = q51Var.f;
                ArrayList arrayList4 = q51Var.e;
                ArrayList arrayList5 = q51Var.n;
                SparseArray sparseArray2 = q51Var.d;
                q51Var.r = false;
                if (tL_error != null || !(tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    q51Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList6 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                    if (arrayList6.size() < 40) {
                        q51Var.s = true;
                    }
                    if (!arrayList6.isEmpty()) {
                        if (arrayList5.isEmpty()) {
                            int i16 = q51Var.w;
                            q51Var.w = i16 + 1;
                            sparseArray2.put(i16, -1);
                        }
                        arrayList5.addAll(arrayList6);
                        int size2 = arrayList4.size();
                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList6.get(i17);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList4.add(stickerSetCovered);
                                sparseArray.put(q51Var.w, stickerSetCovered);
                                int i18 = q51Var.w;
                                q51Var.w = i18 + 1;
                                int i19 = size2 + 1;
                                sparseArray2.put(i18, Integer.valueOf(size2));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(q51Var.w, stickerSetCovered.cover);
                                    i11 = 1;
                                } else {
                                    i11 = (int) Math.ceil(stickerSetCovered.covers.size() / q51Var.v);
                                    for (int i20 = 0; i20 < stickerSetCovered.covers.size(); i20++) {
                                        sparseArray2.put(q51Var.w + i20, stickerSetCovered.covers.get(i20));
                                    }
                                }
                                int i21 = 0;
                                while (true) {
                                    int i22 = q51Var.v * i11;
                                    if (i21 < i22) {
                                        sparseArray.put(q51Var.w + i21, stickerSetCovered);
                                        i21++;
                                    } else {
                                        q51Var.w = i22 + q51Var.w;
                                        size2 = i19;
                                    }
                                }
                            }
                        }
                        q51Var.l();
                        break;
                    }
                }
                break;
            case 4:
                a81 a81Var = (a81) obj5;
                Uri uri2 = (Uri) obj4;
                MessageObject messageObject = (MessageObject) obj3;
                a81Var.getClass();
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
                        absolutePath = new File(directory, a4.a.r(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    a81Var.b = new c6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    a81Var.b = new c6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                a81Var.c = a81Var.b.d[4];
                float f7 = a81Var.h;
                if (f7 != 0.0f) {
                    a81Var.e(messageObject, f7, a81Var.r);
                    a81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new w71(a81Var, 1));
                break;
            case 5:
                a81 a81Var2 = (a81) obj5;
                r71 r71Var = (r71) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                a81Var2.getClass();
                if (r71Var.b()) {
                    a81Var2.b = new c6(new File(r71Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i23 = UserConfig.selectedAccount;
                    try {
                        i23 = Utilities.parseInt((CharSequence) r71Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i24 = i23;
                    try {
                        obj2 = FileLoader.getInstance(i24).getParentObject(Utilities.parseInt((CharSequence) r71Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Object obj7 = obj2;
                    TLRPC.Document document = r71Var.g;
                    if (FileLoader.getInstance(i24).isLoadingFile(FileLoader.getAttachFileName(document))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a4.a.r(sb3, document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i24).getPathToAttach(document, false).getAbsolutePath();
                    }
                    a81Var2.b = new c6(new File(absolutePath2), true, document.size, 1, document, null, obj7, 0L, i24, true);
                }
                a81Var2.c = a81Var2.b.d[4];
                float f10 = a81Var2.h;
                if (f10 != 0.0f) {
                    a81Var2.e(messageObject2, f10, a81Var2.r);
                    a81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new w71(a81Var2, i13));
                break;
            case 6:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) obj5;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj4;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj3;
                ValueAnimator valueAnimator = m0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.l0(m0Var, tVar)).setDuration(100L).start();
                if (tVar2 != null) {
                    tVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.y(tVar2)).start();
                    break;
                }
                break;
            case 7:
                AnimatedFileNative.d(((File) obj5).getAbsolutePath(), (int[]) obj4, 0L);
                AndroidUtilities.runOnUIThread((org.telegram.ui.bf) obj3);
                break;
            case 8:
                ((q0.a) obj4).accept(Boolean.valueOf(((org.telegram.ui.web.c1) obj5).d((String[]) obj3)));
                break;
            case 9:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.c1 c1Var = botWebViewContainer$BotWebViewProxy.a;
                    if (c1Var == null) {
                        break;
                    } else {
                        boolean z14 = org.telegram.ui.web.c1.P0;
                        c1Var.F(botWebViewContainer$BotWebViewProxy, c1Var.g(), str, str2);
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                org.telegram.ui.web.c1 c1Var2 = ((BotWebViewContainer$WebViewProxy) obj5).a;
                if (c1Var2 != null && !c1Var2.o0 && c1Var2.c != null) {
                    if (c1Var2.F0 != null && !TextUtils.equals(c1Var2.getOriginHost(), c1Var2.F0)) {
                        c1Var2.h("onWebEventReceived ignore " + str3);
                        break;
                    } else {
                        c1Var2.h("onWebEventReceived " + str3 + " " + str4);
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1695046810:
                                if (str3.equals("actionBarColor")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -462720700:
                                if (str3.equals("navigationBarColor")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 479731943:
                                if (str3.equals("oauth_request")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 675009138:
                                if (str3.equals("siteName")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 997530486:
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                try {
                                    JSONArray jSONArray = new JSONArray(str4);
                                    boolean equals2 = TextUtils.equals(str3, "actionBarColor");
                                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                    org.telegram.ui.web.y0 y0Var = c1Var2.a;
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
                                    c1Var2.c.o(argb, equals2);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            case 2:
                                c1Var2.h("oauth_request " + str4);
                                if (c1Var2.a != null) {
                                    String originHost = c1Var2.getOriginHost();
                                    if (!TextUtils.isEmpty(originHost)) {
                                        try {
                                            String optString = new JSONObject(str4).optString("url");
                                            c1Var2.y("oauth_supported", org.telegram.ui.web.c1.B(1, "version"));
                                            if (!TextUtils.isEmpty(optString)) {
                                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                tL_messages_requestUrlAuth.url = optString;
                                                int i25 = tL_messages_requestUrlAuth.flags;
                                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                tL_messages_requestUrlAuth.flags = i25 | 12;
                                                ConnectionsManager.getInstance(c1Var2.M).sendRequest(tL_messages_requestUrlAuth, new bi.l9(c1Var2, tL_messages_requestUrlAuth, optString, originHost, 13), 2);
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            FileLog.e(e11);
                                            return;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                c1Var2.h("siteName " + str4);
                                org.telegram.ui.web.y0 y0Var2 = c1Var2.a;
                                if (y0Var2 != null) {
                                    y0Var2.r = str4;
                                    org.telegram.ui.web.y0.a(y0Var2);
                                    break;
                                }
                                break;
                            case 4:
                                try {
                                    JSONArray jSONArray2 = new JSONArray(str4);
                                    z10 = jSONArray2.optBoolean(0, true);
                                    try {
                                        z11 = jSONArray2.optBoolean(1, true);
                                    } catch (Exception unused2) {
                                        z11 = true;
                                        if (!(c1Var2.getParent() instanceof di.t4)) {
                                            return;
                                        }
                                    }
                                } catch (Exception unused3) {
                                    z10 = true;
                                }
                                if (!(c1Var2.getParent() instanceof di.t4)) {
                                    di.t4 t4Var = (di.t4) c1Var2.getParent();
                                    t4Var.O = z10;
                                    t4Var.P = z11;
                                    break;
                                }
                        }
                    }
                }
                break;
            case 11:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) obj5;
                ArrayList arrayList7 = (ArrayList) obj4;
                String str5 = (String) obj3;
                ArrayList arrayList8 = new ArrayList();
                for (int i26 = 0; i26 < arrayList7.size(); i26++) {
                    org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) arrayList7.get(i26);
                    if (org.telegram.ui.web.g1.t(e1Var.c, str5) || ((o2Var = e1Var.d) != null && (org.telegram.ui.web.g1.t(o2Var.c, str5) || org.telegram.ui.web.g1.t(e1Var.d.d, str5)))) {
                        arrayList8.add(e1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new r91(27, g1Var, arrayList8));
                break;
            case 12:
                org.telegram.ui.web.k2 k2Var = (org.telegram.ui.web.k2) obj5;
                org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                k2Var.getClass();
                if (org.telegram.ui.web.k2.f != null) {
                    boolean z15 = (j2Var.d <= 0 || j2Var.e <= 0) && bitmap != null;
                    if (bitmap != null) {
                        k2Var.d.put(j2Var.b, bitmap);
                        if (z15) {
                            int i27 = j2Var.d;
                            if (i27 == 0 && j2Var.e == 0) {
                                j2Var.d = bitmap.getWidth();
                                j2Var.e = bitmap.getHeight();
                            } else if (i27 == 0) {
                                j2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * j2Var.e);
                            } else if (j2Var.e == 0) {
                                j2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * j2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList9 = (ArrayList) org.telegram.ui.web.k2.f.remove(j2Var.b);
                    if (arrayList9 != null) {
                        int size3 = arrayList9.size();
                        int i28 = 0;
                        while (i28 < size3) {
                            Object obj8 = arrayList9.get(i28);
                            i28++;
                            Pair pair = (Pair) obj8;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (z15 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        break;
                    }
                }
                break;
            case 13:
                ((EglRenderer) obj5).lambda$init$0((EglBase.Context) obj4, (int[]) obj3);
                break;
            case 14:
                ((EglRenderer) obj5).lambda$removeFrameListener$4((CountDownLatch) obj4, (EglRenderer.FrameListener) obj3);
                break;
            case 15:
                ((VideoFileRenderer) obj5).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj4, (VideoFrame) obj3);
                break;
            case 16:
                ((sg.z0) obj5).run(new Pair((HashMap) obj4, (ArrayList) obj3));
                break;
            case 17:
                TLObject tLObject2 = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj5;
                sg.z0 z0Var = (sg.z0) obj4;
                if (tLObject2 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject2;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList10 = new ArrayList();
                    for (int i29 = 0; i29 < tL_channels_channelParticipants.participants.size(); i29++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i29).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList10.add(messagesController.getInputPeer(peer));
                        }
                    }
                    z0Var.run(arrayList10);
                    break;
                }
                break;
            case 18:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj5;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    break;
                } else {
                    callback2.run(null);
                    break;
                }
            case 19:
                ((org.telegram.ui.web.y1) obj5).run(new Pair((HashMap) obj4, (ArrayList) obj3));
                break;
            case 20:
                tf.d dVar = (tf.d) obj5;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                String str6 = dVar.b;
                int i30 = dVar.a;
                if (tLObject3 != null) {
                    MediaDataController.getInstance(i30).onRingtoneUploaded(str6, (TLRPC.Document) tLObject3, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i30).onRingtoneUploaded(str6, null, true);
                    if (tL_error3 != null) {
                        NotificationCenter.getInstance(i30).doOnIdle(new org.telegram.ui.web.x1(28, dVar, tL_error3));
                    }
                }
                dVar.a();
                break;
            case 21:
                uh.o oVar = (uh.o) obj5;
                n90 n90Var = (n90) obj4;
                ClickableSpan clickableSpan = (ClickableSpan) obj3;
                l90 l90Var = oVar.y;
                if (l90Var != null && oVar.E == n90Var) {
                    l90Var.a(clickableSpan);
                    oVar.E = null;
                    oVar.s.d(true);
                    break;
                }
                break;
            case 22:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                try {
                    ((Task) ((u4.g) obj5).call()).continueWith((Executor) obj4, new w9.v(2, taskCompletionSource));
                    break;
                } catch (Exception e12) {
                    taskCompletionSource.setException(e12);
                    return;
                }
            case 23:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj3;
                ((wr0) obj5).H = -1;
                if (tL_error4 != null) {
                    wc.a0(p2Var).d0(tL_error4, false);
                    break;
                }
                break;
            case 24:
                wh.m2 m2Var = (wh.m2) obj5;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                wr0 wr0Var = m2Var.a;
                wr0Var.e.k(m2Var.e.d, savedStarGift);
                ((w70) obj3).u();
                wr0Var.n();
                TL_stars.TL_starGiftCollection c11 = wr0Var.e.c(m2Var.e.d);
                if (c11 != null) {
                    wc.a0(wr0Var.a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, xh.x3.D1(savedStarGift.gift), c11.title))).j();
                    break;
                }
                break;
            case 25:
                wh.m2 m2Var2 = (wh.m2) obj5;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj4;
                wh.h1 h1Var = (wh.h1) obj3;
                if (m2Var2.d || !savedStarGift2.pinned_to_top || savedStarGift2.unsaved) {
                    z12 = true;
                } else {
                    z12 = true;
                    h1Var.c(false, true);
                    m2Var2.e.m(savedStarGift2, false, false);
                }
                savedStarGift2.unsaved ^= z12;
                h1Var.h(savedStarGift2, z12, m2Var2.d);
                m2Var2.a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = m2Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(m2Var2.b).sendRequest(savestargift, null);
                break;
            case 26:
                wh.u3 u3Var = (wh.u3) obj5;
                TLObject tLObject4 = (TLObject) obj3;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj4;
                HashMap hashMap = u3Var.m;
                HashMap hashMap2 = u3Var.o;
                HashMap hashMap3 = u3Var.n;
                ArrayList arrayList11 = u3Var.h;
                ArrayList arrayList12 = u3Var.g;
                ArrayList arrayList13 = u3Var.f;
                int i31 = u3Var.a;
                ArrayList arrayList14 = u3Var.d;
                u3Var.v = -1;
                if (tLObject4 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject4;
                    MessagesController.getInstance(i31).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i31).putChats(resalestargifts.chats, false);
                    u3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList14.clear();
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList15 = resalestargifts.gifts;
                    int size4 = arrayList15.size();
                    int i32 = 0;
                    while (i32 < size4) {
                        TL_stars.StarGift starGift = arrayList15.get(i32);
                        i32++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList14.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    u3Var.u = arrayList14.size() >= u3Var.e || TextUtils.isEmpty(resalestargifts.next_offset);
                    u3Var.q = resalestargifts.next_offset;
                    u3Var.t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList16 = resalestargifts.attributes;
                    if (arrayList16 != null && !arrayList16.isEmpty()) {
                        arrayList13.clear();
                        arrayList12.clear();
                        arrayList11.clear();
                        arrayList13.addAll(xh.v5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList12.addAll(xh.v5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList11.addAll(xh.v5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        u3Var.i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList17 = resalestargifts.counters;
                        int size5 = arrayList17.size();
                        int i33 = 0;
                        while (i33 < size5) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList17.get(i33);
                            i33++;
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
                    Utilities.Callback callback3 = u3Var.c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z13));
                        break;
                    }
                }
                break;
            case 27:
                xh.h hVar = (xh.h) obj5;
                TLObject tLObject5 = (TLObject) obj3;
                Context context = (Context) obj4;
                if (tLObject5 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    nf.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject5).url);
                }
                AndroidUtilities.runOnUIThread(new xh.b(hVar, 5), 1000L);
                break;
            case 28:
                xh.h.a0((xh.h) obj5, (TLObject) obj3, (TLRPC.TL_error) obj4);
                break;
            default:
                xh.x3 x3Var = (xh.x3) obj5;
                Long l4 = (Long) obj4;
                x3Var.Z1(l4.longValue(), new h7(x3Var, l4, (sg.p1[]) obj3, 7));
                break;
        }
    }

    public /* synthetic */ sx0(Object obj, TLObject tLObject, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.c = obj2;
    }

    public /* synthetic */ sx0(TLObject tLObject, MessagesController messagesController, sg.z0 z0Var) {
        this.a = 17;
        this.d = tLObject;
        this.b = messagesController;
        this.c = z0Var;
    }

    public /* synthetic */ sx0(TLRPC.TL_error tL_error, Utilities.Callback callback, Utilities.Callback callback2) {
        this.a = 18;
        this.c = tL_error;
        this.b = callback;
        this.d = callback2;
    }
}
