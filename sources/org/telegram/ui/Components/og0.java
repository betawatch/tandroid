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
import java.util.HashMap;
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
import org.telegram.ui.ii1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ og0(Object obj, Object obj2, Object obj3, int i10) {
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
        org.telegram.ui.web.b1 b1Var = botWebViewContainer$WebViewProxy.a;
        if (b1Var == null || b1Var.o0 || b1Var.c == null) {
            return;
        }
        if (b1Var.F0 != null && !TextUtils.equals(b1Var.getOriginHost(), b1Var.F0)) {
            b1Var.g("onWebEventReceived ignore " + str);
        }
        b1Var.g("onWebEventReceived " + str + " " + str2);
        str.getClass();
        z10 = true;
        switch (str) {
            case "actionBarColor":
            case "navigationBarColor":
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    boolean equals = TextUtils.equals(str, "actionBarColor");
                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                    org.telegram.ui.web.y0 y0Var = b1Var.a;
                    if (y0Var != null) {
                        if (equals) {
                            y0Var.s = true;
                            y0Var.w = argb;
                        } else {
                            y0Var.v = true;
                            y0Var.x = argb;
                        }
                        org.telegram.ui.web.y0.a(y0Var);
                    }
                    b1Var.c.o(argb, equals);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case "oauth_request":
                b1Var.g("oauth_request " + str2);
                if (b1Var.a != null) {
                    String originHost = b1Var.getOriginHost();
                    if (!TextUtils.isEmpty(originHost)) {
                        try {
                            String optString = new JSONObject(str2).optString("url");
                            b1Var.y("oauth_supported", org.telegram.ui.web.b1.A(1, "version"));
                            if (!TextUtils.isEmpty(optString)) {
                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                tL_messages_requestUrlAuth.url = optString;
                                int i10 = tL_messages_requestUrlAuth.flags;
                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                tL_messages_requestUrlAuth.flags = i10 | 12;
                                ConnectionsManager.getInstance(b1Var.M).sendRequest(tL_messages_requestUrlAuth, new ai.q3(b1Var, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
                                break;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            case "siteName":
                b1Var.g("siteName " + str2);
                org.telegram.ui.web.y0 y0Var2 = b1Var.a;
                if (y0Var2 != null) {
                    y0Var2.r = str2;
                    org.telegram.ui.web.y0.a(y0Var2);
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
                if (b1Var.getParent() instanceof ei.o4) {
                    ei.o4 o4Var = (ei.o4) b1Var.getParent();
                    o4Var.O = z11;
                    o4Var.P = z10;
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

    /* JADX WARN: Removed duplicated region for block: B:182:0x051a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x051d A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        JSONObject optJSONObject;
        String optString;
        at0 at0Var;
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var;
        ArrayList arrayList;
        long peerId;
        int i11;
        boolean z10;
        String str;
        Uri uri;
        String stickerExt;
        int i12;
        int i13;
        String absolutePath;
        Object obj;
        String absolutePath2;
        org.telegram.ui.web.m2 m2Var;
        int i14 = this.a;
        int i15 = 2;
        int i16 = 4;
        int i17 = 0;
        boolean z11 = false;
        int i18 = 1;
        Object obj2 = this.d;
        int i19 = -1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i14) {
            case 0:
                String str2 = (String) obj3;
                WebResourceRequest webResourceRequest = (WebResourceRequest) obj2;
                org.telegram.ui.ju0 ju0Var = (org.telegram.ui.ju0) ((oi.i) obj4).b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + ju0Var.w).put("platform", "DESKTOP"))).put("videoId", ju0Var.w).toString().getBytes("UTF-8"));
                    outputStream.close();
                    InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    byte[] bArr = new byte[10240];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = inputStream.read(bArr);
                        int i20 = i19;
                        if (read == i20) {
                            byteArrayOutputStream.close();
                            inputStream.close();
                            JSONObject optJSONObject2 = new JSONObject(byteArrayOutputStream.toString("UTF-8")).optJSONObject("storyboards");
                            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("playerStoryboardSpecRenderer")) != null && (optString = optJSONObject.optString("spec")) != null) {
                                if (ju0Var.H == 0) {
                                    ju0Var.s = optString;
                                    break;
                                } else {
                                    sg0.a(ju0Var, optString);
                                    break;
                                }
                            }
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                            i19 = i20;
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 1:
                sh0.p((sh0) obj4, (rh0) obj3, (TLObject) obj2);
                break;
            case 2:
                bo0 bo0Var = (bo0) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList<MessageObject> arrayList3 = (ArrayList) obj2;
                int i21 = bo0Var.d;
                for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                    DownloadController.getInstance(i21).onDownloadComplete((MessageObject) arrayList2.get(i22));
                }
                if (!arrayList3.isEmpty()) {
                    DownloadController.getInstance(i21).deleteRecentFiles(arrayList3);
                }
                bo0Var.O = false;
                bo0Var.d(true);
                break;
            case 3:
                wo0 wo0Var = (wo0) obj4;
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) obj3;
                p80 p80Var = (p80) obj2;
                if (UserConfig.getInstance(wo0Var.K0.H0).isPremium()) {
                    tyVar.getMessagesController().disableAds(true);
                    wo0Var.T();
                    ad.a0(tyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new rg.y0((org.telegram.ui.ActionBar.n2) tyVar, 3, true).show();
                }
                p80Var.u();
                break;
            case 4:
                bw0 bw0Var = (bw0) obj4;
                g5.R(bw0Var.getContext(), null, bw0Var.F1, new fs0(bw0Var, (TL_stories.StoryItem) obj3));
                ((p80) obj2).u();
                break;
            case 5:
                bw0 bw0Var2 = (bw0) obj4;
                String str3 = (String) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                eu0 eu0Var = new eu0(bw0Var2.getContext(), str3, str3, bw0Var2.F1, n2Var2);
                if (n2Var2 != null) {
                    n2Var2.showDialog(eu0Var);
                    break;
                } else {
                    eu0Var.show();
                    break;
                }
            case 6:
                fu0 fu0Var = (fu0) obj4;
                bw0 bw0Var3 = fu0Var.d;
                g5.R(bw0Var3.getContext(), bw0Var3.v1, (org.telegram.ui.ActionBar.e6) obj3, new bw(fu0Var, 21));
                ((p80) obj2).u();
                break;
            case 7:
                mu0 mu0Var = (mu0) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                bw0 bw0Var4 = mu0Var.n;
                int h = mu0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    bw0Var4.v1.getMessagesController().putChats(messages_chats.chats, false);
                    mu0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    mu0Var.d.addAll(messages_chats.chats);
                } else {
                    mu0Var.h = true;
                }
                int i23 = 0;
                while (true) {
                    uu0[] uu0VarArr = bw0Var4.k0;
                    if (i23 >= uu0VarArr.length) {
                        mu0Var.e = false;
                        mu0Var.f = true;
                        mu0Var.l();
                        break;
                    } else {
                        uu0 uu0Var = uu0VarArr[i23];
                        if (uu0Var.F == 6 && (at0Var = uu0Var.h) != null && (mu0Var.f || h == 0)) {
                            bw0Var4.z(at0Var, 0, null);
                        }
                        i23++;
                    }
                }
                break;
            case 8:
                su0 su0Var = (su0) obj4;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = su0Var.s.v1;
                String lowerCase = ((String) obj3).trim().toLowerCase();
                int i24 = 9;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new og0(su0Var, new ArrayList(), new ArrayList(), i24));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i25 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i25];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int size = arrayList4.size();
                    int i26 = 0;
                    while (i26 < size) {
                        TLObject tLObject2 = (TLObject) arrayList4.get(i26);
                        if (tLObject2 instanceof TLRPC.ChatParticipant) {
                            i10 = size;
                            peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                        } else {
                            i10 = size;
                            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                            } else {
                                n2Var = n2Var3;
                                arrayList = arrayList4;
                                i26++;
                                arrayList4 = arrayList;
                                size = i10;
                                n2Var3 = n2Var;
                                i17 = 0;
                            }
                        }
                        TLRPC.User user = n2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                        arrayList = arrayList4;
                        if (user.id != n2Var3.getUserConfig().getClientUserId()) {
                            String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = null;
                            }
                            int i27 = i17;
                            int i28 = i27;
                            while (i27 < i25) {
                                String str4 = strArr[i27];
                                if (lowerCase2.startsWith(str4) || org.telegram.messenger.bi.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.bi.w(" ", str4, translitString2)))) {
                                    i11 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user);
                                    i11 = (publicUsername == null || !publicUsername.startsWith(str4)) ? i28 : 2;
                                }
                                if (i11 != 0) {
                                    n2Var = n2Var3;
                                    if (i11 == 1) {
                                        arrayList5.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str4));
                                    } else {
                                        arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str4));
                                    }
                                    arrayList6.add(tLObject2);
                                    i26++;
                                    arrayList4 = arrayList;
                                    size = i10;
                                    n2Var3 = n2Var;
                                    i17 = 0;
                                } else {
                                    i27++;
                                    i28 = i11;
                                }
                            }
                        }
                        n2Var = n2Var3;
                        i26++;
                        arrayList4 = arrayList;
                        size = i10;
                        n2Var3 = n2Var;
                        i17 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new og0(su0Var, arrayList5, arrayList6, 9));
                    break;
                }
                break;
            case 9:
                su0 su0Var2 = (su0) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                bw0 bw0Var5 = su0Var2.s;
                if (bw0Var5.V0) {
                    su0Var2.d = arrayList7;
                    su0Var2.r--;
                    if (!ChatObject.isChannel(su0Var2.n)) {
                        ArrayList arrayList9 = su0Var2.e.g;
                        arrayList9.clear();
                        arrayList9.addAll(arrayList8);
                    }
                    if (su0Var2.r == 0) {
                        int i29 = 0;
                        while (true) {
                            uu0[] uu0VarArr2 = bw0Var5.k0;
                            if (i29 < uu0VarArr2.length) {
                                uu0 uu0Var2 = uu0VarArr2[i29];
                                if (uu0Var2.F == 7) {
                                    if (su0Var2.h == 0) {
                                        uu0Var2.w.e(false, true);
                                    } else {
                                        bw0Var5.z(uu0Var2.h, 0, null);
                                    }
                                }
                                i29++;
                            }
                        }
                    }
                    su0Var2.l();
                    break;
                }
                break;
            case 10:
                xu0 xu0Var = (xu0) obj4;
                ArrayList arrayList10 = (ArrayList) obj2;
                xu0Var.getClass();
                String lowerCase3 = ((String) obj3).trim().toLowerCase();
                int i30 = 16;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ci0(i30, xu0Var, new ArrayList()));
                    break;
                } else {
                    String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                    String str5 = (lowerCase3.equals(translitString3) || translitString3.length() == 0) ? null : translitString3;
                    int i31 = (str5 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i31];
                    strArr2[0] = lowerCase3;
                    if (str5 != null) {
                        strArr2[1] = str5;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    int i32 = 0;
                    while (i32 < arrayList10.size()) {
                        MessageObject messageObject = (MessageObject) arrayList10.get(i32);
                        int i33 = 0;
                        while (true) {
                            if (i33 < i31) {
                                String str6 = strArr2[i33];
                                String documentName = messageObject.getDocumentName();
                                if (documentName != null && documentName.length() != 0) {
                                    if (documentName.toLowerCase().contains(str6)) {
                                        arrayList11.add(messageObject);
                                    } else if (xu0Var.r != i16) {
                                        continue;
                                    } else {
                                        TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                        int i34 = 0;
                                        while (true) {
                                            if (i34 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i34);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str7 = documentAttribute.performer;
                                                    z10 = str7 != null ? str7.toLowerCase().contains(str6) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str6);
                                                    }
                                                } else {
                                                    i34++;
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
                                i33++;
                                i16 = 4;
                            }
                        }
                        i32++;
                        i16 = 4;
                    }
                    AndroidUtilities.runOnUIThread(new ci0(i30, xu0Var, arrayList11));
                    break;
                }
                break;
            case 11:
                xy0 xy0Var = (xy0) obj4;
                String str8 = (String) obj3;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj2;
                if (!xy0Var.isDismissed()) {
                    xy0Var.Z.remove(str8);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int indexOf = xy0Var.Y.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            s4.d1 K = xy0Var.c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.f8) K.a).setSticker(importingSticker);
                            }
                        } else {
                            xy0Var.d.l();
                        }
                    } else {
                        xy0Var.v0(importingSticker);
                    }
                    if (xy0Var.Z.isEmpty()) {
                        xy0Var.C0();
                        break;
                    }
                }
                break;
            case 12:
                xy0.y((xy0) obj4, (ArrayList) obj3, (Boolean) obj2);
                break;
            case 13:
                xy0.F((xy0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2);
                break;
            case 14:
                xy0.H((xy0) obj4, (String) obj3, (TextView) obj2);
                break;
            case 15:
                xy0 xy0Var2 = (xy0) obj4;
                ArrayList arrayList12 = (ArrayList) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                ArrayList arrayList14 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList12.size();
                Boolean bool = null;
                for (int i35 = 0; i35 < size2; i35++) {
                    Object obj5 = arrayList12.get(i35);
                    if ((obj5 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj5))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool == null) {
                            bool = Boolean.valueOf(equals);
                        } else if (bool.booleanValue() != equals) {
                            continue;
                        }
                        if (xy0Var2.isDismissed()) {
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
                                    int i36 = options.outWidth;
                                    if ((i36 == 512 && (i12 = options.outHeight) > 0 && i12 <= 512) || (options.outHeight == 512 && i36 > 0 && i36 <= 512)) {
                                        importingSticker2.mimeType = "image/".concat(stickerExt);
                                        importingSticker2.validated = true;
                                    }
                                }
                                if (arrayList15 == null || arrayList15.size() != size2) {
                                    arrayList13 = arrayList15;
                                } else {
                                    arrayList13 = arrayList15;
                                    if (arrayList13.get(i35) instanceof String) {
                                        importingSticker2.emoji = (String) arrayList13.get(i35);
                                        arrayList14.add(importingSticker2);
                                        if (arrayList14.size() < 200) {
                                            AndroidUtilities.runOnUIThread(new og0(xy0Var2, arrayList14, bool, 12));
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
                }
                AndroidUtilities.runOnUIThread(new og0(xy0Var2, arrayList14, bool, 12));
                break;
            case 16:
                k61 k61Var = (k61) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                SparseArray sparseArray = k61Var.f;
                ArrayList arrayList16 = k61Var.e;
                ArrayList arrayList17 = k61Var.n;
                SparseArray sparseArray2 = k61Var.d;
                k61Var.r = false;
                if (tL_error2 != null || !(tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    k61Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList18 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList18.size() < 40) {
                        k61Var.s = true;
                    }
                    if (!arrayList18.isEmpty()) {
                        if (arrayList17.isEmpty()) {
                            int i37 = k61Var.w;
                            k61Var.w = i37 + 1;
                            sparseArray2.put(i37, -1);
                        }
                        arrayList17.addAll(arrayList18);
                        int size3 = arrayList16.size();
                        for (int i38 = 0; i38 < arrayList18.size(); i38++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList18.get(i38);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList16.add(stickerSetCovered);
                                sparseArray.put(k61Var.w, stickerSetCovered);
                                int i39 = k61Var.w;
                                k61Var.w = i39 + 1;
                                int i40 = size3 + 1;
                                sparseArray2.put(i39, Integer.valueOf(size3));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(k61Var.w, stickerSetCovered.cover);
                                    i13 = 1;
                                } else {
                                    i13 = (int) Math.ceil(stickerSetCovered.covers.size() / k61Var.v);
                                    for (int i41 = 0; i41 < stickerSetCovered.covers.size(); i41++) {
                                        sparseArray2.put(k61Var.w + i41, stickerSetCovered.covers.get(i41));
                                    }
                                }
                                int i42 = 0;
                                while (true) {
                                    int i43 = k61Var.v * i13;
                                    if (i42 < i43) {
                                        sparseArray.put(k61Var.w + i42, stickerSetCovered);
                                        i42++;
                                    } else {
                                        k61Var.w = i43 + k61Var.w;
                                        size3 = i40;
                                    }
                                }
                            }
                        }
                        k61Var.l();
                        break;
                    }
                }
                break;
            case 17:
                s81 s81Var = (s81) obj4;
                Uri uri2 = (Uri) obj3;
                MessageObject messageObject2 = (MessageObject) obj2;
                s81Var.getClass();
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
                        absolutePath = new File(directory, a1.g.s(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    s81Var.b = new f6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    s81Var.b = new f6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                s81Var.c = s81Var.b.d[4];
                float f7 = s81Var.h;
                if (f7 != 0.0f) {
                    s81Var.e(messageObject2, f7, s81Var.r);
                    s81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new n81(s81Var, i18));
                break;
            case 18:
                s81 s81Var2 = (s81) obj4;
                i81 i81Var = (i81) obj3;
                MessageObject messageObject3 = (MessageObject) obj2;
                s81Var2.getClass();
                if (i81Var.b()) {
                    s81Var2.b = new f6(new File(i81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i44 = UserConfig.selectedAccount;
                    try {
                        i44 = Utilities.parseInt((CharSequence) i81Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    int i45 = i44;
                    try {
                        obj = FileLoader.getInstance(i45).getParentObject(Utilities.parseInt((CharSequence) i81Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        obj = null;
                    }
                    TLRPC.Document document2 = i81Var.g;
                    if (FileLoader.getInstance(i45).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a1.g.s(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i45).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    s81Var2.b = new f6(new File(absolutePath2), true, document2.size, 1, document2, null, obj, 0L, i45, true);
                }
                s81Var2.c = s81Var2.b.d[4];
                float f10 = s81Var2.h;
                if (f10 != 0.0f) {
                    s81Var2.e(messageObject3, f10, s81Var2.r);
                    s81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new n81(s81Var2, i15));
                break;
            case 19:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) obj4;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj3;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj2;
                ValueAnimator valueAnimator = m0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                uVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.l0(m0Var, uVar)).setDuration(100L).start();
                if (uVar2 != null) {
                    uVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.y(uVar2)).start();
                    break;
                }
                break;
            case 20:
                AnimatedFileNative.d(((File) obj4).getAbsolutePath(), (int[]) obj3, 0L);
                AndroidUtilities.runOnUIThread((org.telegram.ui.ze) obj2);
                break;
            case 21:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                q0.a aVar = (q0.a) obj3;
                String[] strArr3 = (String[]) obj2;
                b1Var.getClass();
                int length = strArr3.length;
                int i46 = 0;
                while (true) {
                    if (i46 >= length) {
                        z11 = true;
                    } else if (b1Var.getContext().checkSelfPermission(strArr3[i46]) == 0) {
                        i46++;
                    }
                }
                aVar.accept(Boolean.valueOf(z11));
                break;
            case 22:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj4;
                String str9 = (String) obj3;
                String str10 = (String) obj2;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.b1 b1Var2 = botWebViewContainer$BotWebViewProxy.a;
                    if (b1Var2 == null) {
                        break;
                    } else {
                        boolean z12 = org.telegram.ui.web.b1.P0;
                        b1Var2.E(botWebViewContainer$BotWebViewProxy, b1Var2.f(), str9, str10);
                        break;
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 23:
                a();
                break;
            case 24:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) obj4;
                ArrayList arrayList19 = (ArrayList) obj2;
                String str11 = (String) obj3;
                ArrayList arrayList20 = new ArrayList();
                for (int i47 = 0; i47 < arrayList19.size(); i47++) {
                    org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) arrayList19.get(i47);
                    if (org.telegram.ui.web.f1.t(c1Var.c, str11) || ((m2Var = c1Var.d) != null && (org.telegram.ui.web.f1.t(m2Var.c, str11) || org.telegram.ui.web.f1.t(c1Var.d.d, str11)))) {
                        arrayList20.add(c1Var);
                    }
                }
                AndroidUtilities.runOnUIThread(new ii1(27, f1Var, arrayList20));
                break;
            case 25:
                b();
                break;
            case 26:
                ((EglRenderer) obj4).lambda$init$0((EglBase.Context) obj3, (int[]) obj2);
                break;
            case 27:
                ((EglRenderer) obj4).lambda$removeFrameListener$4((CountDownLatch) obj3, (EglRenderer.FrameListener) obj2);
                break;
            case 28:
                ((VideoFileRenderer) obj4).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj3, (VideoFrame) obj2);
                break;
            default:
                ((tg.x0) obj4).run(new Pair((HashMap) obj3, (ArrayList) obj2));
                break;
        }
    }

    public /* synthetic */ og0(org.telegram.ui.web.f1 f1Var, ArrayList arrayList, String str) {
        this.a = 24;
        this.b = f1Var;
        this.d = arrayList;
        this.c = str;
    }
}
