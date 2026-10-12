package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ViewPropertyAnimator;
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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class v70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v70(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        Object obj;
        String absolutePath;
        p81 p81Var = (p81) this.b;
        f81 f81Var = (f81) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        p81Var.getClass();
        if (f81Var.b()) {
            p81Var.b = new f6(new File(f81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
        } else {
            int i10 = UserConfig.selectedAccount;
            try {
                i10 = Utilities.parseInt((CharSequence) f81Var.d.getQueryParameter("account")).intValue();
            } catch (Exception e) {
                FileLog.e(e);
            }
            int i11 = i10;
            try {
                obj = FileLoader.getInstance(i11).getParentObject(Utilities.parseInt((CharSequence) f81Var.d.getQueryParameter("rid")).intValue());
            } catch (Exception e7) {
                FileLog.e(e7);
                obj = null;
            }
            Object obj2 = obj;
            TLRPC.Document document = f81Var.g;
            if (FileLoader.getInstance(i11).isLoadingFile(FileLoader.getAttachFileName(document))) {
                File directory = FileLoader.getDirectory(4);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(document.dc_id);
                sb2.append("_");
                absolutePath = new File(directory, a1.g.r(sb2, document.id, ".temp")).getAbsolutePath();
            } else {
                absolutePath = FileLoader.getInstance(i11).getPathToAttach(document, false).getAbsolutePath();
            }
            p81Var.b = new f6(new File(absolutePath), true, document.size, 1, document, null, obj2, 0L, i11, true);
        }
        p81Var.c = p81Var.b.d[4];
        float f7 = p81Var.h;
        if (f7 != 0.0f) {
            p81Var.e(messageObject, f7, p81Var.r);
            p81Var.h = 0.0f;
        }
        AndroidUtilities.runOnUIThread(new k81(p81Var, 2));
    }

    private final void b() {
        BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        botWebViewContainer$BotWebViewProxy.getClass();
        try {
            org.telegram.ui.web.b1 b1Var = botWebViewContainer$BotWebViewProxy.a;
            if (b1Var == null) {
                return;
            }
            boolean z10 = org.telegram.ui.web.b1.P0;
            b1Var.E(botWebViewContainer$BotWebViewProxy, b1Var.f(), str, str2);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private final void c() {
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
                                ConnectionsManager.getInstance(b1Var.M).sendRequest(tL_messages_requestUrlAuth, new bi.f3(b1Var, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
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
                if (b1Var.getParent() instanceof fi.p4) {
                    fi.p4 p4Var = (fi.p4) b1Var.getParent();
                    p4Var.O = z11;
                    p4Var.P = z10;
                    break;
                }
                break;
        }
    }

    private final void d() {
        org.telegram.ui.web.l2 l2Var;
        org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        String str = (String) this.d;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) arrayList.get(i10);
            if (org.telegram.ui.web.f1.t(c1Var.c, str) || ((l2Var = c1Var.d) != null && (org.telegram.ui.web.f1.t(l2Var.c, str) || org.telegram.ui.web.f1.t(c1Var.d.d, str)))) {
                arrayList2.add(c1Var);
            }
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.t8(8, f1Var, arrayList2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0406, code lost:
    
        if (r6 > 512) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03c6, code lost:
    
        if (r8.booleanValue() != r12) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x044b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x075b A[LOOP:11: B:325:0x06e6->B:342:0x075b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x071f A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        JSONObject optJSONObject;
        String optString;
        ws0 ws0Var;
        long peerId;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.m2 m2Var;
        boolean z10;
        char c10;
        boolean z11;
        String str;
        int i10;
        Uri uri;
        String stickerExt;
        int i11;
        int i12;
        String absolutePath;
        Object obj;
        switch (this.a) {
            case 0:
                w70 w70Var = (w70) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                w70Var.h = null;
                w70Var.c = arrayList2;
                w70Var.d = arrayList3;
                hg.a2 a2Var = w70Var.e;
                a2Var.f(arrayList2, null);
                a80 a80Var = w70Var.n;
                a80Var.K(w70Var.f - 1);
                w70Var.l();
                if (!a2Var.e() && w70Var.h() <= 2) {
                    a80Var.s.e(false, true);
                    break;
                }
                break;
            case 1:
                da0 da0Var = (da0) this.b;
                ea0 ea0Var = (ea0) this.c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                ca0 ca0Var = da0Var.h;
                if (ca0Var != null && da0Var.e == ea0Var) {
                    ca0Var.a(clickableSpan);
                    da0Var.e = null;
                    da0Var.b.d(true);
                    break;
                }
                break;
            case 2:
                ad0 ad0Var = (ad0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = ad0Var.c;
                TextView textView = ad0Var.f;
                TextView textView2 = ad0Var.e;
                if (tL_error != null) {
                    if ("USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                        textView2.setText(LocaleController.getString(R.string.PmReadUnknown));
                        textView.setVisibility(8);
                    } else if ("YOUR_PRIVACY_RESTRICTED".equals(tL_error.text)) {
                        ad0Var.E = true;
                        textView2.setText(LocaleController.getString(R.string.PmRead));
                        textView.setText(LocaleController.getString(R.string.PmReadShowWhen));
                    } else {
                        textView2.setText(LocaleController.getString("UnknownError"));
                        textView.setVisibility(8);
                        new zc(nb.a(ad0Var.getContext()), c6Var).f0(tL_error, false);
                    }
                } else if (tLObject instanceof TLRPC.TL_outboxReadDate) {
                    textView2.setText(LocaleController.formatPmSeenDate(((TLRPC.TL_outboxReadDate) tLObject).date));
                    textView.setVisibility(8);
                }
                ViewPropertyAnimator alpha = ad0Var.d.animate().alpha(1.0f);
                es esVar = es.h;
                org.telegram.messenger.yh.s(alpha, esVar, 320L);
                ad0Var.h.animate().alpha(0.0f).setInterpolator(esVar).setDuration(320L).start();
                if (ad0Var.E) {
                    ad0Var.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var), 6, 0));
                    ad0Var.setOnClickListener(new z80(ad0Var, 2));
                    break;
                } else {
                    ad0Var.setBackground(null);
                    ad0Var.setOnClickListener(null);
                    break;
                }
            case 3:
                ze0.q((ze0) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                break;
            case 4:
                mg0 mg0Var = (mg0) this.b;
                String str2 = (String) this.c;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.d;
                org.telegram.ui.pu0 pu0Var = (org.telegram.ui.pu0) mg0Var.b;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(new JSONObject().put("context", new JSONObject().put("client", new JSONObject().put("userAgent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.0.0 Safari/537.36,gzip(gfe)").put("clientName", "WEB").put("clientVersion", webResourceRequest.getRequestHeaders().get("X-Youtube-Client-Version")).put("osName", "Windows").put("osVersion", "10.0").put("originalUrl", "https://www.youtube.com/watch?v=" + pu0Var.w).put("platform", "DESKTOP"))).put("videoId", pu0Var.w).toString().getBytes("UTF-8"));
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
                                if (pu0Var.H == 0) {
                                    pu0Var.s = optString;
                                    break;
                                } else {
                                    qg0.a(pu0Var, optString);
                                    break;
                                }
                            }
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 5:
                qh0.o((qh0) this.b, (ph0) this.c, (TLObject) this.d);
                break;
            case 6:
                yn0 yn0Var = (yn0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList<MessageObject> arrayList5 = (ArrayList) this.d;
                int i13 = yn0Var.d;
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    DownloadController.getInstance(i13).onDownloadComplete((MessageObject) arrayList4.get(i14));
                }
                if (!arrayList5.isEmpty()) {
                    DownloadController.getInstance(i13).deleteRecentFiles(arrayList5);
                }
                yn0Var.O = false;
                yn0Var.d(true);
                break;
            case 7:
                so0 so0Var = (so0) this.b;
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.c;
                m80 m80Var = (m80) this.d;
                if (UserConfig.getInstance(so0Var.K0.H0).isPremium()) {
                    yyVar.getMessagesController().disableAds(true);
                    so0Var.T();
                    zc.a0(yyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new sg.y0((org.telegram.ui.ActionBar.m2) yyVar, 3, true).show();
                }
                m80Var.u();
                break;
            case 8:
                xv0 xv0Var = (xv0) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                m80 m80Var2 = (m80) this.d;
                g5.R(xv0Var.getContext(), null, xv0Var.F1, new bs0(xv0Var, storyItem));
                m80Var2.u();
                break;
            case 9:
                xv0 xv0Var2 = (xv0) this.b;
                String str3 = (String) this.c;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.d;
                au0 au0Var = new au0(xv0Var2.getContext(), str3, str3, xv0Var2.F1, m2Var2);
                if (m2Var2 != null) {
                    m2Var2.showDialog(au0Var);
                    break;
                } else {
                    au0Var.show();
                    break;
                }
            case 10:
                bu0 bu0Var = (bu0) this.b;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.c;
                m80 m80Var3 = (m80) this.d;
                xv0 xv0Var3 = bu0Var.d;
                g5.R(xv0Var3.getContext(), xv0Var3.v1, c6Var2, new xv(bu0Var, 21));
                m80Var3.u();
                break;
            case 11:
                iu0 iu0Var = (iu0) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                xv0 xv0Var4 = iu0Var.n;
                int h = iu0Var.h();
                if (tL_error2 == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                    xv0Var4.v1.getMessagesController().putChats(messages_chats.chats, false);
                    iu0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    iu0Var.d.addAll(messages_chats.chats);
                } else {
                    iu0Var.h = true;
                }
                int i15 = 0;
                while (true) {
                    qu0[] qu0VarArr = xv0Var4.k0;
                    if (i15 >= qu0VarArr.length) {
                        iu0Var.e = false;
                        iu0Var.f = true;
                        iu0Var.l();
                        break;
                    } else {
                        qu0 qu0Var = qu0VarArr[i15];
                        if (qu0Var.F == 6 && (ws0Var = qu0Var.h) != null && (iu0Var.f || h == 0)) {
                            xv0Var4.z(ws0Var, 0, null);
                        }
                        i15++;
                    }
                }
                break;
            case 12:
                ou0 ou0Var = (ou0) this.b;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.c;
                org.telegram.ui.ActionBar.m2 m2Var3 = ou0Var.s.v1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new v70(ou0Var, new ArrayList(), new ArrayList(), 13));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    boolean z12 = true;
                    int i16 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i16];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    int size = arrayList6.size();
                    int i17 = 0;
                    while (i17 < size) {
                        TLObject tLObject3 = (TLObject) arrayList6.get(i17);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject3).peer);
                            }
                            arrayList = arrayList6;
                            m2Var = m2Var3;
                            z10 = z12;
                            i17++;
                            z12 = z10;
                            m2Var3 = m2Var;
                            arrayList6 = arrayList;
                        }
                        TLRPC.User user = m2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user.id != m2Var3.getUserConfig().getClientUserId()) {
                            String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = null;
                            }
                            int i18 = 0;
                            char c11 = 0;
                            while (i18 < i16) {
                                String str5 = strArr[i18];
                                if (lowerCase2.startsWith(str5)) {
                                    arrayList = arrayList6;
                                } else {
                                    arrayList = arrayList6;
                                    if (!org.telegram.messenger.yh.v(" ", str5, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str5) && !org.telegram.messenger.yh.v(" ", str5, translitString2)))) {
                                        String publicUsername = UserObject.getPublicUsername(user);
                                        if (publicUsername != null && publicUsername.startsWith(str5)) {
                                            c11 = 2;
                                        }
                                        c10 = c11;
                                        if (c10 == 0) {
                                            m2Var = m2Var3;
                                            z10 = true;
                                            if (c10 == 1) {
                                                arrayList7.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str5));
                                            } else {
                                                arrayList7.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str5));
                                            }
                                            arrayList8.add(tLObject3);
                                            i17++;
                                            z12 = z10;
                                            m2Var3 = m2Var;
                                            arrayList6 = arrayList;
                                        } else {
                                            i18++;
                                            z12 = true;
                                            m2Var3 = m2Var3;
                                            c11 = c10;
                                            arrayList6 = arrayList;
                                        }
                                    }
                                }
                                c10 = 1;
                                if (c10 == 0) {
                                }
                            }
                        }
                        arrayList = arrayList6;
                        m2Var = m2Var3;
                        z10 = z12;
                        i17++;
                        z12 = z10;
                        m2Var3 = m2Var;
                        arrayList6 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new v70(ou0Var, arrayList7, arrayList8, 13));
                    break;
                }
                break;
            case 13:
                ou0 ou0Var2 = (ou0) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ArrayList arrayList10 = (ArrayList) this.d;
                xv0 xv0Var5 = ou0Var2.s;
                if (xv0Var5.V0) {
                    ou0Var2.d = arrayList9;
                    ou0Var2.r--;
                    if (!ChatObject.isChannel(ou0Var2.n)) {
                        ArrayList arrayList11 = ou0Var2.e.g;
                        arrayList11.clear();
                        arrayList11.addAll(arrayList10);
                    }
                    if (ou0Var2.r == 0) {
                        int i19 = 0;
                        while (true) {
                            qu0[] qu0VarArr2 = xv0Var5.k0;
                            if (i19 < qu0VarArr2.length) {
                                qu0 qu0Var2 = qu0VarArr2[i19];
                                if (qu0Var2.F == 7) {
                                    if (ou0Var2.h == 0) {
                                        qu0Var2.w.e(false, true);
                                    } else {
                                        xv0Var5.z(qu0Var2.h, 0, null);
                                    }
                                }
                                i19++;
                            }
                        }
                    }
                    ou0Var2.l();
                    break;
                }
                break;
            case 14:
                tu0 tu0Var = (tu0) this.b;
                String str6 = (String) this.d;
                ArrayList arrayList12 = (ArrayList) this.c;
                tu0Var.getClass();
                String lowerCase3 = str6.trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new f60(27, tu0Var, new ArrayList()));
                    break;
                } else {
                    String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                    if (lowerCase3.equals(translitString3) || translitString3.length() == 0) {
                        translitString3 = null;
                    }
                    int i20 = (translitString3 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i20];
                    strArr2[0] = lowerCase3;
                    if (translitString3 != null) {
                        strArr2[1] = translitString3;
                    }
                    ArrayList arrayList13 = new ArrayList();
                    for (int i21 = 0; i21 < arrayList12.size(); i21++) {
                        MessageObject messageObject = (MessageObject) arrayList12.get(i21);
                        int i22 = 0;
                        while (true) {
                            if (i22 < i20) {
                                String str7 = strArr2[i22];
                                String documentName = messageObject.getDocumentName();
                                if (documentName != null && documentName.length() != 0) {
                                    if (documentName.toLowerCase().contains(str7)) {
                                        arrayList13.add(messageObject);
                                    } else if (tu0Var.r != 4) {
                                        continue;
                                    } else {
                                        TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                        int i23 = 0;
                                        while (true) {
                                            if (i23 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i23);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str8 = documentAttribute.performer;
                                                    z11 = str8 != null ? str8.toLowerCase().contains(str7) : false;
                                                    if (!z11 && (str = documentAttribute.title) != null) {
                                                        z11 = str.toLowerCase().contains(str7);
                                                    }
                                                } else {
                                                    i23++;
                                                }
                                            } else {
                                                z11 = false;
                                            }
                                        }
                                        if (z11) {
                                            arrayList13.add(messageObject);
                                        }
                                    }
                                }
                                i22++;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new f60(27, tu0Var, arrayList13));
                    break;
                }
                break;
            case 15:
                ty0 ty0Var = (ty0) this.b;
                String str9 = (String) this.c;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.d;
                if (!ty0Var.isDismissed()) {
                    ty0Var.Z.remove(str9);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int indexOf = ty0Var.Y.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            s4.b1 K = ty0Var.c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.f8) K.a).setSticker(importingSticker);
                            }
                        } else {
                            ty0Var.d.l();
                        }
                    } else {
                        ty0Var.v0(importingSticker);
                    }
                    if (ty0Var.Z.isEmpty()) {
                        ty0Var.C0();
                        break;
                    }
                }
                break;
            case 16:
                ty0.y((ty0) this.b, (ArrayList) this.c, (Boolean) this.d);
                break;
            case 17:
                ty0.F((ty0) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                break;
            case 18:
                ty0.H((ty0) this.b, (String) this.c, (TextView) this.d);
                break;
            case 19:
                ty0 ty0Var2 = (ty0) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList14.size();
                Boolean bool = null;
                int i24 = 0;
                while (i24 < size2) {
                    Object obj2 = arrayList14.get(i24);
                    if ((obj2 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj2))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool != null) {
                            break;
                        } else {
                            bool = Boolean.valueOf(equals);
                        }
                        if (ty0Var2.isDismissed()) {
                            break;
                        } else {
                            SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                            importingSticker2.animated = equals;
                            int i25 = size2;
                            String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                            importingSticker2.path = copyFileToCache;
                            if (copyFileToCache != null) {
                                if (equals) {
                                    importingSticker2.mimeType = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(copyFileToCache, options);
                                    int i26 = options.outWidth;
                                    if (i26 != 512 || (i11 = options.outHeight) <= 0 || i11 > 512) {
                                        if (options.outHeight != 512 || i26 <= 0) {
                                            i10 = i25;
                                            i24++;
                                            size2 = i10;
                                        }
                                    }
                                    importingSticker2.mimeType = "image/".concat(stickerExt);
                                    importingSticker2.validated = true;
                                }
                                if (arrayList15 != null) {
                                    i10 = i25;
                                    if (arrayList15.size() == i10 && (arrayList15.get(i24) instanceof String)) {
                                        importingSticker2.emoji = (String) arrayList15.get(i24);
                                        arrayList16.add(importingSticker2);
                                        if (arrayList16.size() < 200) {
                                            AndroidUtilities.runOnUIThread(new v70(ty0Var2, arrayList16, bool, 16));
                                            break;
                                        } else {
                                            i24++;
                                            size2 = i10;
                                        }
                                    }
                                } else {
                                    i10 = i25;
                                }
                                importingSticker2.emoji = "#️⃣";
                                arrayList16.add(importingSticker2);
                                if (arrayList16.size() < 200) {
                                }
                            }
                            i10 = i25;
                            i24++;
                            size2 = i10;
                        }
                    }
                    i10 = size2;
                    i24++;
                    size2 = i10;
                }
                AndroidUtilities.runOnUIThread(new v70(ty0Var2, arrayList16, bool, 16));
                break;
            case 20:
                g61 g61Var = (g61) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                SparseArray sparseArray = g61Var.f;
                ArrayList arrayList17 = g61Var.e;
                ArrayList arrayList18 = g61Var.n;
                SparseArray sparseArray2 = g61Var.d;
                g61Var.r = false;
                if (tL_error3 != null || !(tLObject4 instanceof TLRPC.TL_messages_featuredStickers)) {
                    g61Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList19 = ((TLRPC.TL_messages_featuredStickers) tLObject4).sets;
                    if (arrayList19.size() < 40) {
                        g61Var.s = true;
                    }
                    if (!arrayList19.isEmpty()) {
                        if (arrayList18.isEmpty()) {
                            int i27 = g61Var.w;
                            g61Var.w = i27 + 1;
                            sparseArray2.put(i27, -1);
                        }
                        arrayList18.addAll(arrayList19);
                        int size3 = arrayList17.size();
                        for (int i28 = 0; i28 < arrayList19.size(); i28++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList19.get(i28);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList17.add(stickerSetCovered);
                                sparseArray.put(g61Var.w, stickerSetCovered);
                                int i29 = g61Var.w;
                                g61Var.w = i29 + 1;
                                int i30 = size3 + 1;
                                sparseArray2.put(i29, Integer.valueOf(size3));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(g61Var.w, stickerSetCovered.cover);
                                    i12 = 1;
                                } else {
                                    i12 = (int) Math.ceil(stickerSetCovered.covers.size() / g61Var.v);
                                    for (int i31 = 0; i31 < stickerSetCovered.covers.size(); i31++) {
                                        sparseArray2.put(g61Var.w + i31, stickerSetCovered.covers.get(i31));
                                    }
                                }
                                int i32 = 0;
                                while (true) {
                                    int i33 = g61Var.v * i12;
                                    if (i32 < i33) {
                                        sparseArray.put(g61Var.w + i32, stickerSetCovered);
                                        i32++;
                                    } else {
                                        g61Var.w = i33 + g61Var.w;
                                        size3 = i30;
                                    }
                                }
                            }
                        }
                        g61Var.l();
                        break;
                    }
                }
                break;
            case 21:
                p81 p81Var = (p81) this.b;
                Uri uri2 = (Uri) this.c;
                MessageObject messageObject2 = (MessageObject) this.d;
                p81Var.getClass();
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
                    p81Var.b = new f6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    p81Var.b = new f6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                p81Var.c = p81Var.b.d[4];
                float f7 = p81Var.h;
                if (f7 != 0.0f) {
                    p81Var.e(messageObject2, f7, p81Var.r);
                    p81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new k81(p81Var, 1));
                break;
            case 22:
                a();
                break;
            case 23:
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
                    break;
                }
                break;
            case 24:
                File file = (File) this.b;
                int[] iArr = (int[]) this.c;
                org.telegram.ui.ff ffVar = (org.telegram.ui.ff) this.d;
                AnimatedFileNative.d(file.getAbsolutePath(), iArr, 0L);
                AndroidUtilities.runOnUIThread(ffVar);
                break;
            case 25:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
                q0.a aVar = (q0.a) this.c;
                String[] strArr3 = (String[]) this.d;
                b1Var.getClass();
                int length = strArr3.length;
                boolean z13 = false;
                int i34 = 0;
                while (true) {
                    if (i34 >= length) {
                        z13 = true;
                    } else if (b1Var.getContext().checkSelfPermission(strArr3[i34]) == 0) {
                        i34++;
                    }
                }
                aVar.accept(Boolean.valueOf(z13));
                break;
            case 26:
                b();
                break;
            case 27:
                c();
                break;
            case 28:
                d();
                break;
            default:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.b;
                org.telegram.ui.web.g2 g2Var = (org.telegram.ui.web.g2) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                h2Var.getClass();
                if (org.telegram.ui.web.h2.f != null) {
                    int i35 = 0;
                    boolean z14 = (g2Var.d <= 0 || g2Var.e <= 0) && bitmap != null;
                    if (bitmap != null) {
                        h2Var.d.put(g2Var.b, bitmap);
                        if (z14) {
                            int i36 = g2Var.d;
                            if (i36 == 0 && g2Var.e == 0) {
                                g2Var.d = bitmap.getWidth();
                                g2Var.e = bitmap.getHeight();
                            } else if (i36 == 0) {
                                g2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * g2Var.e);
                            } else if (g2Var.e == 0) {
                                g2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * g2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList20 = (ArrayList) org.telegram.ui.web.h2.f.remove(g2Var.b);
                    if (arrayList20 != null) {
                        int size4 = arrayList20.size();
                        while (i35 < size4) {
                            Object obj3 = arrayList20.get(i35);
                            i35++;
                            Pair pair = (Pair) obj3;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (z14 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v70(ze0 ze0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.a = 3;
        this.b = ze0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    public /* synthetic */ v70(lm0 lm0Var, String str, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = lm0Var;
        this.d = str;
        this.c = arrayList;
    }
}
