package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.webkit.WebResourceRequest;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ai1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ue0(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        boolean z10;
        boolean z11;
        BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        org.telegram.ui.web.y0 y0Var = botWebViewContainer$WebViewProxy.a;
        if (y0Var.k0 || y0Var.c == null) {
            return;
        }
        if (y0Var.z0 != null && !TextUtils.equals(y0Var.getOriginHost(), y0Var.z0)) {
            y0Var.g("onWebEventReceived ignore " + str);
        }
        y0Var.g("onWebEventReceived " + str + " " + str2);
        str.getClass();
        z10 = true;
        switch (str) {
            case "actionBarColor":
            case "navigationBarColor":
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    boolean equals = TextUtils.equals(str, "actionBarColor");
                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                    org.telegram.ui.web.v0 v0Var = y0Var.a;
                    if (v0Var != null) {
                        if (equals) {
                            v0Var.s = true;
                            v0Var.w = argb;
                        } else {
                            v0Var.v = true;
                            v0Var.x = argb;
                        }
                        org.telegram.ui.web.v0.a(v0Var);
                    }
                    y0Var.c.o(argb, equals);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case "oauth_request":
                y0Var.g("oauth_request " + str2);
                if (y0Var.a != null) {
                    String originHost = y0Var.getOriginHost();
                    if (!TextUtils.isEmpty(originHost)) {
                        try {
                            String optString = new JSONObject(str2).optString("url");
                            y0Var.v("oauth_supported", org.telegram.ui.web.y0.x(1, "version"));
                            if (!TextUtils.isEmpty(optString)) {
                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                tL_messages_requestUrlAuth.url = optString;
                                int i9 = tL_messages_requestUrlAuth.flags;
                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                tL_messages_requestUrlAuth.flags = i9 | 12;
                                ConnectionsManager.getInstance(y0Var.I).sendRequest(tL_messages_requestUrlAuth, new fh.h1(y0Var, tL_messages_requestUrlAuth, optString, originHost, 19), 2);
                                break;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                break;
            case "siteName":
                y0Var.g("siteName " + str2);
                org.telegram.ui.web.v0 v0Var2 = y0Var.a;
                if (v0Var2 != null) {
                    v0Var2.r = str2;
                    org.telegram.ui.web.v0.a(v0Var2);
                    break;
                }
                break;
            case "allowScroll":
                try {
                    JSONArray jSONArray2 = new JSONArray(str2);
                    z11 = jSONArray2.optBoolean(0, true);
                    try {
                        z10 = jSONArray2.optBoolean(1, true);
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    z11 = true;
                }
                if (y0Var.getParent() instanceof mh.f4) {
                    mh.f4 f4Var = (mh.f4) y0Var.getParent();
                    f4Var.K = z11;
                    f4Var.L = z10;
                    break;
                }
                break;
        }
    }

    private final void b() {
        Object obj;
        org.telegram.ui.web.d2 d2Var = (org.telegram.ui.web.d2) this.b;
        org.telegram.ui.web.c2 c2Var = (org.telegram.ui.web.c2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        d2Var.getClass();
        if (org.telegram.ui.web.d2.f == null) {
            return;
        }
        int i9 = 0;
        boolean z10 = (c2Var.d <= 0 || c2Var.e <= 0) && bitmap != null;
        if (bitmap != null) {
            d2Var.d.put(c2Var.b, bitmap);
            if (z10) {
                int i10 = c2Var.d;
                if (i10 == 0 && c2Var.e == 0) {
                    c2Var.d = bitmap.getWidth();
                    c2Var.e = bitmap.getHeight();
                } else if (i10 == 0) {
                    c2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * c2Var.e);
                } else if (c2Var.e == 0) {
                    c2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * c2Var.d);
                }
            }
        }
        ArrayList arrayList = (ArrayList) org.telegram.ui.web.d2.f.remove(c2Var.b);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            Pair pair = (Pair) obj2;
            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
            if (z10 && (obj = pair.second) != null) {
                ((Runnable) obj).run();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0519 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x051c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        JSONObject optJSONObject;
        String optString;
        dr0 dr0Var;
        int i9;
        org.telegram.ui.ActionBar.o2 o2Var;
        ArrayList arrayList;
        long peerId;
        ?? r42;
        boolean z10;
        String str;
        Uri uri;
        String stickerExt;
        int i10;
        int i11;
        String absolutePath;
        Object obj;
        String absolutePath2;
        org.telegram.ui.web.h2 h2Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 4;
        int i15 = 0;
        int i16 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                String str2 = (String) obj3;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj2;
                org.telegram.ui.gt0 gt0Var = (org.telegram.ui.gt0) ((ve0) obj4).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + gt0Var.w).put("platform", "DESKTOP"))).put("videoId", gt0Var.w).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) != null && (optString = optJSONObject.optString("spec")) != null) {
                                if (gt0Var.D == 0) {
                                    gt0Var.s = optString;
                                    break;
                                } else {
                                    ze0.a(gt0Var, optString);
                                    break;
                                }
                            }
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 1:
                ag0.n((ag0) obj4, (zf0) obj3, (TLObject) obj2);
                break;
            case 2:
                gm0 gm0Var = (gm0) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList<MessageObject> arrayList3 = (ArrayList) obj2;
                int i17 = gm0Var.d;
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    DownloadController.getInstance(i17).onDownloadComplete((MessageObject) arrayList2.get(i18));
                }
                if (!arrayList3.isEmpty()) {
                    DownloadController.getInstance(i17).deleteRecentFiles(arrayList3);
                }
                gm0Var.K = false;
                gm0Var.d(true);
                break;
            case 3:
                an0 an0Var = (an0) obj4;
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) obj3;
                x60 x60Var = (x60) obj2;
                if (UserConfig.getInstance(an0Var.G0.D0).isPremium()) {
                    dyVar.getMessagesController().disableAds(true);
                    an0Var.T();
                    oc.a0(dyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new zf.x0((org.telegram.ui.ActionBar.o2) dyVar, 3, true).show();
                }
                x60Var.u();
                break;
            case 4:
                eu0 eu0Var = (eu0) obj4;
                y4.S(eu0Var.getContext(), null, eu0Var.B1, new jq0(eu0Var, (TL_stories.StoryItem) obj3));
                ((x60) obj2).u();
                break;
            case 5:
                eu0 eu0Var2 = (eu0) obj4;
                String str3 = (String) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                hs0 hs0Var = new hs0(eu0Var2.getContext(), str3, str3, eu0Var2.B1, o2Var2);
                if (o2Var2 != null) {
                    o2Var2.showDialog(hs0Var);
                    break;
                } else {
                    hs0Var.show();
                    break;
                }
            case 6:
                is0 is0Var = (is0) obj4;
                eu0 eu0Var3 = is0Var.d;
                y4.S(eu0Var3.getContext(), eu0Var3.r1, (org.telegram.ui.ActionBar.b6) obj3, new wu(is0Var, 20));
                ((x60) obj2).u();
                break;
            case 7:
                ps0 ps0Var = (ps0) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                eu0 eu0Var4 = ps0Var.n;
                int h = ps0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    eu0Var4.r1.getMessagesController().putChats(messages_chats.chats, false);
                    ps0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    ps0Var.d.addAll(messages_chats.chats);
                } else {
                    ps0Var.h = true;
                }
                int i19 = 0;
                while (true) {
                    xs0[] xs0VarArr = eu0Var4.g0;
                    if (i19 >= xs0VarArr.length) {
                        ps0Var.e = false;
                        ps0Var.f = true;
                        ps0Var.l();
                        break;
                    } else {
                        xs0 xs0Var = xs0VarArr[i19];
                        if (xs0Var.B == 6 && (dr0Var = xs0Var.h) != null && (ps0Var.f || h == 0)) {
                            eu0Var4.z(dr0Var, 0, null);
                        }
                        i19++;
                    }
                }
                break;
            case 8:
                vs0 vs0Var = (vs0) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var3 = vs0Var.s.r1;
                String lowerCase = ((String) obj3).trim().toLowerCase();
                int i20 = 9;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ue0(vs0Var, new ArrayList(), new ArrayList(), i20));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i21 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i21];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int size = arrayList4.size();
                    int i22 = 0;
                    while (i22 < size) {
                        TLObject tLObject2 = (TLObject) arrayList4.get(i22);
                        if (tLObject2 instanceof TLRPC.ChatParticipant) {
                            i9 = size;
                            peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                        } else {
                            i9 = size;
                            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                            } else {
                                o2Var = o2Var3;
                                arrayList = arrayList4;
                                i22++;
                                arrayList4 = arrayList;
                                size = i9;
                                o2Var3 = o2Var;
                            }
                        }
                        TLRPC.User user = o2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                        arrayList = arrayList4;
                        if (user.id != o2Var3.getUserConfig().getClientUserId()) {
                            String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = null;
                            }
                            int i23 = 0;
                            boolean z11 = false;
                            while (i23 < i21) {
                                String str4 = strArr[i23];
                                if (lowerCase2.startsWith(str4) || org.telegram.messenger.l0.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.l0.w(" ", str4, translitString2)))) {
                                    r42 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user);
                                    r42 = (publicUsername == null || !publicUsername.startsWith(str4)) ? z11 : 2;
                                }
                                if (r42 != 0) {
                                    o2Var = o2Var3;
                                    if (r42 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str4));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str4));
                                    }
                                    arrayList6.add(tLObject2);
                                    i22++;
                                    arrayList4 = arrayList;
                                    size = i9;
                                    o2Var3 = o2Var;
                                } else {
                                    i23++;
                                    z11 = r42;
                                }
                            }
                        }
                        o2Var = o2Var3;
                        i22++;
                        arrayList4 = arrayList;
                        size = i9;
                        o2Var3 = o2Var;
                    }
                    AndroidUtilities.runOnUIThread(new ue0(vs0Var, arrayList5, arrayList6, 9));
                    break;
                }
                break;
            case 9:
                vs0 vs0Var2 = (vs0) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                eu0 eu0Var5 = vs0Var2.s;
                if (eu0Var5.R0) {
                    vs0Var2.d = arrayList7;
                    vs0Var2.r--;
                    if (!ChatObject.isChannel(vs0Var2.n)) {
                        ArrayList arrayList9 = vs0Var2.e.g;
                        arrayList9.clear();
                        arrayList9.addAll(arrayList8);
                    }
                    if (vs0Var2.r == 0) {
                        int i24 = 0;
                        while (true) {
                            xs0[] xs0VarArr2 = eu0Var5.g0;
                            if (i24 < xs0VarArr2.length) {
                                xs0 xs0Var2 = xs0VarArr2[i24];
                                if (xs0Var2.B == 7) {
                                    if (vs0Var2.h == 0) {
                                        xs0Var2.w.e(false, true);
                                    } else {
                                        eu0Var5.z(xs0Var2.h, 0, null);
                                    }
                                }
                                i24++;
                            }
                        }
                    }
                    vs0Var2.l();
                    break;
                }
                break;
            case 10:
                at0 at0Var = (at0) obj4;
                ArrayList arrayList10 = (ArrayList) obj2;
                at0Var.getClass();
                String lowerCase3 = ((String) obj3).trim().toLowerCase();
                int i25 = 16;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new jg0(i25, at0Var, new ArrayList()));
                    break;
                } else {
                    String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                    String str5 = (lowerCase3.equals(translitString3) || translitString3.length() == 0) ? null : translitString3;
                    int i26 = (str5 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i26];
                    strArr2[0] = lowerCase3;
                    if (str5 != null) {
                        strArr2[1] = str5;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    int i27 = 0;
                    while (i27 < arrayList10.size()) {
                        MessageObject messageObject = (MessageObject) arrayList10.get(i27);
                        int i28 = 0;
                        while (true) {
                            if (i28 < i26) {
                                String str6 = strArr2[i28];
                                String documentName = messageObject.getDocumentName();
                                if (documentName != null && documentName.length() != 0) {
                                    if (documentName.toLowerCase().contains(str6)) {
                                        arrayList11.add(messageObject);
                                    } else if (at0Var.r != i14) {
                                        continue;
                                    } else {
                                        TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                        int i29 = 0;
                                        while (true) {
                                            if (i29 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i29);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str7 = documentAttribute.performer;
                                                    z10 = str7 != null ? str7.toLowerCase().contains(str6) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str6);
                                                    }
                                                } else {
                                                    i29++;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (z10) {
                                            arrayList11.add(messageObject);
                                        }
                                    }
                                }
                                i28++;
                                i14 = 4;
                            }
                        }
                        i27++;
                        i14 = 4;
                    }
                    AndroidUtilities.runOnUIThread(new jg0(i25, at0Var, arrayList11));
                    break;
                }
                break;
            case 11:
                cx0 cx0Var = (cx0) obj4;
                String str8 = (String) obj3;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj2;
                if (!cx0Var.isDismissed()) {
                    cx0Var.V.remove(str8);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int indexOf = cx0Var.U.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            f2.q1 K = cx0Var.c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.d8) K.a).setSticker(importingSticker);
                            }
                        } else {
                            cx0Var.d.l();
                        }
                    } else {
                        cx0Var.t0(importingSticker);
                    }
                    if (cx0Var.V.isEmpty()) {
                        cx0Var.A0();
                        break;
                    }
                }
                break;
            case 12:
                cx0.w((cx0) obj4, (ArrayList) obj3, (Boolean) obj2);
                break;
            case 13:
                cx0.D((cx0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2);
                break;
            case 14:
                cx0.F((cx0) obj4, (String) obj3, (TextView) obj2);
                break;
            case 15:
                cx0 cx0Var2 = (cx0) obj4;
                ArrayList arrayList12 = (ArrayList) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                ArrayList arrayList14 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList12.size();
                Boolean bool = null;
                while (i15 < size2) {
                    Object obj5 = arrayList12.get(i15);
                    if ((obj5 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj5))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool == null) {
                            bool = Boolean.valueOf(equals);
                        } else if (bool.booleanValue() != equals) {
                            continue;
                        }
                        if (cx0Var2.isDismissed()) {
                            break;
                        } else {
                            SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                            importingSticker2.animated = equals;
                            ArrayList arrayList15 = arrayList13;
                            String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                            importingSticker2.path = copyFileToCache;
                            if (copyFileToCache != null) {
                                if (equals) {
                                    importingSticker2.mimeType = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(copyFileToCache, options);
                                    int i30 = options.outWidth;
                                    if ((i30 == 512 && (i10 = options.outHeight) > 0 && i10 <= 512) || (options.outHeight == 512 && i30 > 0 && i30 <= 512)) {
                                        importingSticker2.mimeType = "image/".concat(stickerExt);
                                        importingSticker2.validated = true;
                                    }
                                }
                                if (arrayList15 == null || arrayList15.size() != size2) {
                                    arrayList13 = arrayList15;
                                } else {
                                    arrayList13 = arrayList15;
                                    if (arrayList13.get(i15) instanceof String) {
                                        importingSticker2.emoji = (String) arrayList13.get(i15);
                                        arrayList14.add(importingSticker2);
                                        if (arrayList14.size() < 200) {
                                            AndroidUtilities.runOnUIThread(new ue0(cx0Var2, arrayList14, bool, 12));
                                            break;
                                        }
                                    }
                                }
                                importingSticker2.emoji = "#️⃣";
                                arrayList14.add(importingSticker2);
                                if (arrayList14.size() < 200) {
                                }
                            }
                            arrayList13 = arrayList15;
                        }
                    }
                    i15++;
                }
                AndroidUtilities.runOnUIThread(new ue0(cx0Var2, arrayList14, bool, 12));
                break;
            case 16:
                g41 g41Var = (g41) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                SparseArray sparseArray = g41Var.f;
                ArrayList arrayList16 = g41Var.e;
                ArrayList arrayList17 = g41Var.n;
                SparseArray sparseArray2 = g41Var.d;
                g41Var.r = false;
                if (tL_error2 != null || !(tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    g41Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList18 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList18.size() < 40) {
                        g41Var.s = true;
                    }
                    if (!arrayList18.isEmpty()) {
                        if (arrayList17.isEmpty()) {
                            int i31 = g41Var.w;
                            g41Var.w = i31 + 1;
                            sparseArray2.put(i31, -1);
                        }
                        arrayList17.addAll(arrayList18);
                        int size3 = arrayList16.size();
                        for (int i32 = 0; i32 < arrayList18.size(); i32++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList18.get(i32);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList16.add(stickerSetCovered);
                                sparseArray.put(g41Var.w, stickerSetCovered);
                                int i33 = g41Var.w;
                                g41Var.w = i33 + 1;
                                int i34 = size3 + 1;
                                sparseArray2.put(i33, Integer.valueOf(size3));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(g41Var.w, stickerSetCovered.cover);
                                    i11 = 1;
                                } else {
                                    i11 = (int) Math.ceil(stickerSetCovered.covers.size() / g41Var.v);
                                    for (int i35 = 0; i35 < stickerSetCovered.covers.size(); i35++) {
                                        sparseArray2.put(g41Var.w + i35, stickerSetCovered.covers.get(i35));
                                    }
                                }
                                int i36 = 0;
                                while (true) {
                                    int i37 = g41Var.v * i11;
                                    if (i36 < i37) {
                                        sparseArray.put(g41Var.w + i36, stickerSetCovered);
                                        i36++;
                                    } else {
                                        g41Var.w = i37 + g41Var.w;
                                        size3 = i34;
                                    }
                                }
                            }
                        }
                        g41Var.l();
                        break;
                    }
                }
                break;
            case 17:
                r61 r61Var = (r61) obj4;
                Uri uri2 = (Uri) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                r61Var.getClass();
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
                        absolutePath = new File(directory, aa.d.q(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    r61Var.b = new x5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    r61Var.b = new x5(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                r61Var.c = r61Var.b.d[4];
                float f10 = r61Var.h;
                if (f10 != 0.0f) {
                    r61Var.e(messageObject2, f10, r61Var.r);
                    r61Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new n61(r61Var, i16));
                break;
            case 18:
                r61 r61Var2 = (r61) obj4;
                i61 i61Var = (i61) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                r61Var2.getClass();
                if (i61Var.b()) {
                    r61Var2.b = new x5(new File(i61Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i38 = UserConfig.selectedAccount;
                    try {
                        i38 = Utilities.parseInt((CharSequence) i61Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    int i39 = i38;
                    try {
                        obj = FileLoader.getInstance(i39).getParentObject(Utilities.parseInt((CharSequence) i61Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e12) {
                        FileLog.e(e12);
                        obj = null;
                    }
                    TLRPC.Document document2 = i61Var.g;
                    if (FileLoader.getInstance(i39).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, aa.d.q(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i39).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    r61Var2.b = new x5(new File(absolutePath2), true, document2.size, 1, document2, null, obj, 0L, i39, true);
                }
                r61Var2.c = r61Var2.b.d[4];
                float f11 = r61Var2.h;
                if (f11 != 0.0f) {
                    r61Var2.e(messageObject3, f11, r61Var2.r);
                    r61Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new n61(r61Var2, i13));
                break;
            case 19:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) obj4;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj3;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj2;
                ValueAnimator valueAnimator = k0Var.J0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.j0(k0Var, tVar)).setDuration(100L).start();
                if (tVar2 != null) {
                    tVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.w(tVar2)).start();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.web.v0) obj4).d("window.Telegram.WebView.receiveEvent('" + ((String) obj3) + "', " + ((JSONObject) obj2) + ");");
                break;
            case 21:
                ((q0.a) obj3).accept(Boolean.valueOf(((org.telegram.ui.web.y0) obj4).d((String[]) obj2)));
                break;
            case 22:
                AnimatedFileNative.d(((File) obj4).getAbsolutePath(), (int[]) obj3, 0L);
                AndroidUtilities.runOnUIThread((bg.k0) obj2);
                break;
            case 23:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj4;
                String str9 = (String) obj3;
                String str10 = (String) obj2;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.y0 y0Var = botWebViewContainer$BotWebViewProxy.a;
                    if (y0Var == null) {
                        break;
                    } else {
                        boolean z12 = org.telegram.ui.web.y0.I0;
                        y0Var.B(botWebViewContainer$BotWebViewProxy, str9, str10);
                        break;
                    }
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return;
                }
            case 24:
                a();
                break;
            case 25:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                ArrayList arrayList19 = (ArrayList) obj2;
                String str11 = (String) obj3;
                ArrayList arrayList20 = new ArrayList();
                while (i15 < arrayList19.size()) {
                    org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) arrayList19.get(i15);
                    if (org.telegram.ui.web.b1.t(z0Var.c, str11) || ((h2Var = z0Var.d) != null && (org.telegram.ui.web.b1.t(h2Var.c, str11) || org.telegram.ui.web.b1.t(z0Var.d.d, str11)))) {
                        arrayList20.add(z0Var);
                    }
                    i15++;
                }
                AndroidUtilities.runOnUIThread(new ai1(5, b1Var, arrayList20));
                break;
            case 26:
                b();
                break;
            case 27:
                ((EglRenderer) obj4).lambda$init$0((EglBase.Context) obj3, (int[]) obj2);
                break;
            case 28:
                ((EglRenderer) obj4).lambda$removeFrameListener$4((CountDownLatch) obj3, (EglRenderer.FrameListener) obj2);
                break;
            default:
                ((VideoFileRenderer) obj4).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj3, (VideoFrame) obj2);
                break;
        }
    }

    public /* synthetic */ ue0(org.telegram.ui.web.b1 b1Var, ArrayList arrayList, String str) {
        this.a = 25;
        this.b = b1Var;
        this.d = arrayList;
        this.c = str;
    }
}
