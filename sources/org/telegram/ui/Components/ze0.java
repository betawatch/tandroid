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
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ze0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
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
        org.telegram.ui.web.c1 c1Var = botWebViewContainer$WebViewProxy.a;
        if (c1Var == null || c1Var.o0 || c1Var.c == null) {
            return;
        }
        if (c1Var.F0 != null && !TextUtils.equals(c1Var.getOriginHost(), c1Var.F0)) {
            c1Var.g("onWebEventReceived ignore " + str);
        }
        c1Var.g("onWebEventReceived " + str + " " + str2);
        str.getClass();
        z10 = true;
        switch (str) {
            case "actionBarColor":
            case "navigationBarColor":
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    boolean equals = TextUtils.equals(str, "actionBarColor");
                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                    org.telegram.ui.web.z0 z0Var = c1Var.a;
                    if (z0Var != null) {
                        if (equals) {
                            z0Var.s = true;
                            z0Var.w = argb;
                        } else {
                            z0Var.v = true;
                            z0Var.x = argb;
                        }
                        org.telegram.ui.web.z0.a(z0Var);
                    }
                    c1Var.c.o(argb, equals);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case "oauth_request":
                c1Var.g("oauth_request " + str2);
                if (c1Var.a != null) {
                    String originHost = c1Var.getOriginHost();
                    if (!TextUtils.isEmpty(originHost)) {
                        try {
                            String optString = new JSONObject(str2).optString("url");
                            c1Var.y("oauth_supported", org.telegram.ui.web.c1.A(1, "version"));
                            if (!TextUtils.isEmpty(optString)) {
                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                tL_messages_requestUrlAuth.url = optString;
                                int i10 = tL_messages_requestUrlAuth.flags;
                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                tL_messages_requestUrlAuth.flags = i10 | 12;
                                ConnectionsManager.getInstance(c1Var.M).sendRequest(tL_messages_requestUrlAuth, new bi.f3(c1Var, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
                                break;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                }
                break;
            case "siteName":
                c1Var.g("siteName " + str2);
                org.telegram.ui.web.z0 z0Var2 = c1Var.a;
                if (z0Var2 != null) {
                    z0Var2.r = str2;
                    org.telegram.ui.web.z0.a(z0Var2);
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
                if (c1Var.getParent() instanceof fi.p4) {
                    fi.p4 p4Var = (fi.p4) c1Var.getParent();
                    p4Var.O = z11;
                    p4Var.P = z10;
                    break;
                }
                break;
        }
    }

    private final void b() {
        Object obj;
        org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) this.b;
        org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        i2Var.getClass();
        if (org.telegram.ui.web.i2.f == null) {
            return;
        }
        int i10 = 0;
        boolean z10 = (h2Var.d <= 0 || h2Var.e <= 0) && bitmap != null;
        if (bitmap != null) {
            i2Var.d.put(h2Var.b, bitmap);
            if (z10) {
                int i11 = h2Var.d;
                if (i11 == 0 && h2Var.e == 0) {
                    h2Var.d = bitmap.getWidth();
                    h2Var.e = bitmap.getHeight();
                } else if (i11 == 0) {
                    h2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * h2Var.e);
                } else if (h2Var.e == 0) {
                    h2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * h2Var.d);
                }
            }
        }
        ArrayList arrayList = (ArrayList) org.telegram.ui.web.i2.f.remove(h2Var.b);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj2;
            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
            if (z10 && (obj = pair.second) != null) {
                ((Runnable) obj).run();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x048e, code lost:
    
        if (r17.booleanValue() != r9) goto L133;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        JSONObject optJSONObject;
        String optString;
        ws0 ws0Var;
        long peerId;
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10;
        String str;
        ArrayList arrayList;
        Uri uri;
        String stickerExt;
        int i10;
        int i11;
        String absolutePath;
        Object obj;
        String absolutePath2;
        org.telegram.ui.web.m2 m2Var2;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 3;
        int i15 = 0;
        boolean z11 = false;
        int i16 = 1;
        int i17 = -1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i18 = 4;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                af0.q((af0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2);
                break;
            case 1:
                String str2 = (String) obj3;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj2;
                org.telegram.ui.ou0 ou0Var = (org.telegram.ui.ou0) ((ng0) obj4).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + ou0Var.w).put("platform", "DESKTOP"))).put("videoId", ou0Var.w).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr);
                        int i19 = i17;
                        if (read == i19) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) != null && (optString = optJSONObject.optString("spec")) != null) {
                                if (ou0Var.H == 0) {
                                    ou0Var.s = optString;
                                    break;
                                } else {
                                    rg0.a(ou0Var, optString);
                                    break;
                                }
                            }
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                            i17 = i19;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 2:
                qh0.o((qh0) obj4, (ph0) obj3, (TLObject) obj2);
                break;
            case 3:
                xn0 xn0Var = (xn0) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList<MessageObject> arrayList3 = (ArrayList) obj2;
                int i20 = xn0Var.d;
                for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                    DownloadController.getInstance(i20).onDownloadComplete((MessageObject) arrayList2.get(i21));
                }
                if (!arrayList3.isEmpty()) {
                    DownloadController.getInstance(i20).deleteRecentFiles(arrayList3);
                }
                xn0Var.O = false;
                xn0Var.d(true);
                break;
            case 4:
                so0 so0Var = (so0) obj4;
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) obj3;
                l80 l80Var = (l80) obj2;
                if (UserConfig.getInstance(so0Var.K0.H0).isPremium()) {
                    yyVar.getMessagesController().disableAds(true);
                    so0Var.T();
                    zc.a0(yyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new sg.y0((org.telegram.ui.ActionBar.m2) yyVar, 3, true).show();
                }
                l80Var.u();
                break;
            case 5:
                xv0 xv0Var = (xv0) obj4;
                g5.R(xv0Var.getContext(), null, xv0Var.F1, new bs0(xv0Var, (TL_stories.StoryItem) obj3));
                ((l80) obj2).u();
                break;
            case 6:
                xv0 xv0Var2 = (xv0) obj4;
                String str3 = (String) obj3;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj2;
                au0 au0Var = new au0(xv0Var2.getContext(), str3, str3, xv0Var2.F1, m2Var3);
                if (m2Var3 != null) {
                    m2Var3.showDialog(au0Var);
                    break;
                } else {
                    au0Var.show();
                    break;
                }
            case 7:
                bu0 bu0Var = (bu0) obj4;
                xv0 xv0Var3 = bu0Var.d;
                g5.R(xv0Var3.getContext(), xv0Var3.v1, (org.telegram.ui.ActionBar.c6) obj3, new xv(bu0Var, 21));
                ((l80) obj2).u();
                break;
            case 8:
                iu0 iu0Var = (iu0) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                xv0 xv0Var4 = iu0Var.n;
                int h = iu0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    xv0Var4.v1.getMessagesController().putChats(messages_chats.chats, false);
                    iu0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    iu0Var.d.addAll(messages_chats.chats);
                } else {
                    iu0Var.h = true;
                }
                int i22 = 0;
                while (true) {
                    qu0[] qu0VarArr = xv0Var4.k0;
                    if (i22 >= qu0VarArr.length) {
                        iu0Var.e = false;
                        iu0Var.f = true;
                        iu0Var.l();
                        break;
                    } else {
                        qu0 qu0Var = qu0VarArr[i22];
                        if (qu0Var.F == 6 && (ws0Var = qu0Var.h) != null && (iu0Var.f || h == 0)) {
                            xv0Var4.z(ws0Var, 0, null);
                        }
                        i22++;
                    }
                }
                break;
            case 9:
                ou0 ou0Var2 = (ou0) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.m2 m2Var4 = ou0Var2.s.v1;
                String lowerCase = ((String) obj3).trim().toLowerCase();
                int i23 = 10;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ze0(ou0Var2, new ArrayList(), new ArrayList(), i23));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i24 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i24];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int size = arrayList4.size();
                    int i25 = 0;
                    while (i25 < size) {
                        TLObject tLObject2 = (TLObject) arrayList4.get(i25);
                        if (tLObject2 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                        } else {
                            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                            }
                            m2Var = m2Var4;
                            i25++;
                            m2Var4 = m2Var;
                        }
                        TLRPC.User user = m2Var4.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user.id != m2Var4.getUserConfig().getClientUserId()) {
                            String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = null;
                            }
                            int i26 = 0;
                            char c10 = 0;
                            while (i26 < i24) {
                                m2Var = m2Var4;
                                String str4 = strArr[i26];
                                if (lowerCase2.startsWith(str4) || org.telegram.messenger.g0.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.g0.w(" ", str4, translitString2)))) {
                                    c10 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user);
                                    if (publicUsername != null && publicUsername.startsWith(str4)) {
                                        c10 = 2;
                                    }
                                }
                                if (c10 != 0) {
                                    if (c10 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str4));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str4));
                                    }
                                    arrayList6.add(tLObject2);
                                    i25++;
                                    m2Var4 = m2Var;
                                } else {
                                    i26++;
                                    m2Var4 = m2Var;
                                }
                            }
                        }
                        m2Var = m2Var4;
                        i25++;
                        m2Var4 = m2Var;
                    }
                    AndroidUtilities.runOnUIThread(new ze0(ou0Var2, arrayList5, arrayList6, 10));
                    break;
                }
                break;
            case 10:
                ou0 ou0Var3 = (ou0) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                xv0 xv0Var5 = ou0Var3.s;
                if (xv0Var5.V0) {
                    ou0Var3.d = arrayList7;
                    ou0Var3.r--;
                    if (!ChatObject.isChannel(ou0Var3.n)) {
                        ArrayList arrayList9 = ou0Var3.e.g;
                        arrayList9.clear();
                        arrayList9.addAll(arrayList8);
                    }
                    if (ou0Var3.r == 0) {
                        int i27 = 0;
                        while (true) {
                            qu0[] qu0VarArr2 = xv0Var5.k0;
                            if (i27 < qu0VarArr2.length) {
                                qu0 qu0Var2 = qu0VarArr2[i27];
                                if (qu0Var2.F == 7) {
                                    if (ou0Var3.h == 0) {
                                        qu0Var2.w.e(false, true);
                                    } else {
                                        xv0Var5.z(qu0Var2.h, 0, null);
                                    }
                                }
                                i27++;
                            }
                        }
                    }
                    ou0Var3.l();
                    break;
                }
                break;
            case 11:
                tu0 tu0Var = (tu0) obj4;
                ArrayList arrayList10 = (ArrayList) obj2;
                tu0Var.getClass();
                String lowerCase3 = ((String) obj3).trim().toLowerCase();
                int i28 = 22;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new g90(i28, tu0Var, new ArrayList()));
                    break;
                } else {
                    String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                    String str5 = (lowerCase3.equals(translitString3) || translitString3.length() == 0) ? null : translitString3;
                    int i29 = (str5 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i29];
                    strArr2[0] = lowerCase3;
                    if (str5 != null) {
                        strArr2[1] = str5;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    int i30 = 0;
                    while (i30 < arrayList10.size()) {
                        MessageObject messageObject = (MessageObject) arrayList10.get(i30);
                        int i31 = 0;
                        while (true) {
                            if (i31 < i29) {
                                String str6 = strArr2[i31];
                                String documentName = messageObject.getDocumentName();
                                if (documentName != null && documentName.length() != 0) {
                                    if (documentName.toLowerCase().contains(str6)) {
                                        arrayList11.add(messageObject);
                                    } else if (tu0Var.r != i18) {
                                        continue;
                                    } else {
                                        TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                        int i32 = 0;
                                        while (true) {
                                            if (i32 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i32);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str7 = documentAttribute.performer;
                                                    z10 = str7 != null ? str7.toLowerCase().contains(str6) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str6);
                                                    }
                                                } else {
                                                    i32++;
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
                                i31++;
                                i18 = 4;
                            }
                        }
                        i30++;
                        i18 = 4;
                    }
                    AndroidUtilities.runOnUIThread(new g90(i28, tu0Var, arrayList11));
                    break;
                }
                break;
            case 12:
                uy0 uy0Var = (uy0) obj4;
                String str8 = (String) obj3;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj2;
                if (!uy0Var.isDismissed()) {
                    uy0Var.Z.remove(str8);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int indexOf = uy0Var.Y.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            s4.b1 K = uy0Var.c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.f8) K.a).setSticker(importingSticker);
                            }
                        } else {
                            uy0Var.d.l();
                        }
                    } else {
                        uy0Var.v0(importingSticker);
                    }
                    if (uy0Var.Z.isEmpty()) {
                        uy0Var.C0();
                        break;
                    }
                }
                break;
            case 13:
                uy0.y((uy0) obj4, (ArrayList) obj3, (Boolean) obj2);
                break;
            case 14:
                uy0.F((uy0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2);
                break;
            case 15:
                uy0.H((uy0) obj4, (String) obj3, (TextView) obj2);
                break;
            case 16:
                uy0 uy0Var2 = (uy0) obj4;
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
                        if (bool != null) {
                            break;
                        } else {
                            bool = Boolean.valueOf(equals);
                        }
                        if (uy0Var2.isDismissed()) {
                            break;
                        } else {
                            SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                            importingSticker2.animated = equals;
                            arrayList = arrayList12;
                            String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                            importingSticker2.path = copyFileToCache;
                            if (copyFileToCache != null) {
                                if (equals) {
                                    importingSticker2.mimeType = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(copyFileToCache, options);
                                    int i33 = options.outWidth;
                                    if ((i33 == 512 && (i10 = options.outHeight) > 0 && i10 <= 512) || (options.outHeight == 512 && i33 > 0 && i33 <= 512)) {
                                        importingSticker2.mimeType = "image/".concat(stickerExt);
                                        importingSticker2.validated = true;
                                    }
                                }
                                if (arrayList13 != null && arrayList13.size() == size2 && (arrayList13.get(i15) instanceof String)) {
                                    importingSticker2.emoji = (String) arrayList13.get(i15);
                                } else {
                                    importingSticker2.emoji = "#️⃣";
                                }
                                arrayList14.add(importingSticker2);
                                if (arrayList14.size() >= 200) {
                                    AndroidUtilities.runOnUIThread(new ze0(uy0Var2, arrayList14, bool, 13));
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i15++;
                            arrayList12 = arrayList;
                        }
                    }
                    arrayList = arrayList12;
                    i15++;
                    arrayList12 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new ze0(uy0Var2, arrayList14, bool, 13));
                break;
            case 17:
                h61 h61Var = (h61) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                SparseArray sparseArray = h61Var.f;
                ArrayList arrayList15 = h61Var.e;
                ArrayList arrayList16 = h61Var.n;
                SparseArray sparseArray2 = h61Var.d;
                h61Var.r = false;
                if (tL_error2 != null || !(tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    h61Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList17 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList17.size() < 40) {
                        h61Var.s = true;
                    }
                    if (!arrayList17.isEmpty()) {
                        if (arrayList16.isEmpty()) {
                            int i34 = h61Var.w;
                            h61Var.w = i34 + 1;
                            sparseArray2.put(i34, -1);
                        }
                        arrayList16.addAll(arrayList17);
                        int size3 = arrayList15.size();
                        for (int i35 = 0; i35 < arrayList17.size(); i35++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList17.get(i35);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList15.add(stickerSetCovered);
                                sparseArray.put(h61Var.w, stickerSetCovered);
                                int i36 = h61Var.w;
                                h61Var.w = i36 + 1;
                                int i37 = size3 + 1;
                                sparseArray2.put(i36, Integer.valueOf(size3));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(h61Var.w, stickerSetCovered.cover);
                                    i11 = 1;
                                } else {
                                    i11 = (int) Math.ceil(stickerSetCovered.covers.size() / h61Var.v);
                                    for (int i38 = 0; i38 < stickerSetCovered.covers.size(); i38++) {
                                        sparseArray2.put(h61Var.w + i38, stickerSetCovered.covers.get(i38));
                                    }
                                }
                                int i39 = 0;
                                while (true) {
                                    int i40 = h61Var.v * i11;
                                    if (i39 < i40) {
                                        sparseArray.put(h61Var.w + i39, stickerSetCovered);
                                        i39++;
                                    } else {
                                        h61Var.w = i40 + h61Var.w;
                                        size3 = i37;
                                    }
                                }
                            }
                        }
                        h61Var.l();
                        break;
                    }
                }
                break;
            case 18:
                q81 q81Var = (q81) obj4;
                Uri uri2 = (Uri) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
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
                    q81Var.b = new f6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    q81Var.b = new f6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                q81Var.c = q81Var.b.d[4];
                float f7 = q81Var.h;
                if (f7 != 0.0f) {
                    q81Var.e(messageObject2, f7, q81Var.r);
                    q81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new l81(q81Var, i16));
                break;
            case 19:
                q81 q81Var2 = (q81) obj4;
                g81 g81Var = (g81) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                q81Var2.getClass();
                if (g81Var.b()) {
                    q81Var2.b = new f6(new File(g81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i41 = UserConfig.selectedAccount;
                    try {
                        i41 = Utilities.parseInt((CharSequence) g81Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    int i42 = i41;
                    try {
                        obj = FileLoader.getInstance(i42).getParentObject(Utilities.parseInt((CharSequence) g81Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        obj = null;
                    }
                    TLRPC.Document document2 = g81Var.g;
                    if (FileLoader.getInstance(i42).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a1.g.r(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i42).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    q81Var2.b = new f6(new File(absolutePath2), true, document2.size, 1, document2, null, obj, 0L, i42, true);
                }
                q81Var2.c = q81Var2.b.d[4];
                float f10 = q81Var2.h;
                if (f10 != 0.0f) {
                    q81Var2.e(messageObject3, f10, q81Var2.r);
                    q81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new l81(q81Var2, i13));
                break;
            case 20:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) obj4;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj3;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj2;
                ValueAnimator valueAnimator = l0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.k0(l0Var, tVar)).setDuration(100L).start();
                if (tVar2 != null) {
                    tVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.x(tVar2)).start();
                    break;
                }
                break;
            case 21:
                AnimatedFileNative.d(((File) obj4).getAbsolutePath(), (int[]) obj3, 0L);
                AndroidUtilities.runOnUIThread((org.telegram.ui.ff) obj2);
                break;
            case 22:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                q0.a aVar = (q0.a) obj3;
                String[] strArr3 = (String[]) obj2;
                c1Var.getClass();
                int length = strArr3.length;
                int i43 = 0;
                while (true) {
                    if (i43 >= length) {
                        z11 = true;
                    } else if (c1Var.getContext().checkSelfPermission(strArr3[i43]) == 0) {
                        i43++;
                    }
                }
                aVar.accept(Boolean.valueOf(z11));
                break;
            case 23:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj4;
                String str9 = (String) obj3;
                String str10 = (String) obj2;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.c1 c1Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (c1Var2 == null) {
                        break;
                    } else {
                        boolean z12 = org.telegram.ui.web.c1.P0;
                        c1Var2.E(botWebViewContainer$BotWebViewProxy, c1Var2.f(), str9, str10);
                        break;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 24:
                a();
                break;
            case 25:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) obj4;
                ArrayList arrayList18 = (ArrayList) obj3;
                String str11 = (String) obj2;
                ArrayList arrayList19 = new ArrayList();
                for (int i44 = 0; i44 < arrayList18.size(); i44++) {
                    org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) arrayList18.get(i44);
                    if (org.telegram.ui.web.g1.t(d1Var.c, str11) || ((m2Var2 = d1Var.d) != null && (org.telegram.ui.web.g1.t(m2Var2.c, str11) || org.telegram.ui.web.g1.t(d1Var.d.d, str11)))) {
                        arrayList19.add(d1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.v(i14, g1Var, arrayList19));
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

    public /* synthetic */ ze0(af0 af0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 0;
        this.b = af0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
