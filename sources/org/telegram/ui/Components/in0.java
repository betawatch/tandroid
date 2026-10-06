package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.messenger.MessagesController;
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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ in0(Object obj, Serializable serializable, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = serializable;
        this.c = arrayList;
    }

    private final void a() {
        Object obj;
        org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) this.b;
        org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        j2Var.getClass();
        if (org.telegram.ui.web.j2.f == null) {
            return;
        }
        int i10 = 0;
        boolean z10 = (i2Var.d <= 0 || i2Var.e <= 0) && bitmap != null;
        if (bitmap != null) {
            j2Var.d.put(i2Var.b, bitmap);
            if (z10) {
                int i11 = i2Var.d;
                if (i11 == 0 && i2Var.e == 0) {
                    i2Var.d = bitmap.getWidth();
                    i2Var.e = bitmap.getHeight();
                } else if (i11 == 0) {
                    i2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * i2Var.e);
                } else if (i2Var.e == 0) {
                    i2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * i2Var.d);
                }
            }
        }
        ArrayList arrayList = (ArrayList) org.telegram.ui.web.j2.f.remove(i2Var.b);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v98, types: [tg.x0] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    @Override // java.lang.Runnable
    public final void run() {
        ps0 ps0Var;
        org.telegram.ui.ActionBar.n2 n2Var;
        long peerId;
        String str;
        ArrayList arrayList;
        int i10;
        ?? r62;
        boolean z10;
        String str2;
        Uri uri;
        String stickerExt;
        int i11;
        int i12;
        String absolutePath;
        String absolutePath2;
        boolean z11;
        org.telegram.ui.web.n2 n2Var2;
        TLRPC.User user;
        int i13 = 7;
        int i14 = 4;
        int i15 = 2;
        String str3 = null;
        Object obj = null;
        Boolean bool = null;
        r8 = null;
        String str4 = null;
        int i16 = 0;
        boolean z12 = true;
        z12 = true;
        switch (this.a) {
            case 0:
                on0 on0Var = (on0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList<MessageObject> arrayList3 = (ArrayList) this.d;
                int i17 = on0Var.d;
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    DownloadController.getInstance(i17).onDownloadComplete((MessageObject) arrayList2.get(i18));
                }
                if (!arrayList3.isEmpty()) {
                    DownloadController.getInstance(i17).deleteRecentFiles(arrayList3);
                }
                on0Var.O = false;
                on0Var.d(true);
                return;
            case 1:
                jo0 jo0Var = (jo0) this.b;
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
                b80 b80Var = (b80) this.d;
                if (UserConfig.getInstance(jo0Var.K0.J0).isPremium()) {
                    uyVar.getMessagesController().disableAds(true);
                    jo0Var.T();
                    yc.a0(uyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new rg.y0((org.telegram.ui.ActionBar.n2) uyVar, 3, true).show();
                }
                b80Var.u();
                return;
            case 2:
                qv0 qv0Var = (qv0) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                b80 b80Var2 = (b80) this.d;
                e5.S(qv0Var.getContext(), null, qv0Var.F1, new sr0(qv0Var, storyItem));
                b80Var2.u();
                return;
            case 3:
                qv0 qv0Var2 = (qv0) this.b;
                String str5 = (String) this.c;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.d;
                tt0 tt0Var = new tt0(qv0Var2.getContext(), str5, str5, qv0Var2.F1, n2Var3);
                if (n2Var3 != null) {
                    n2Var3.showDialog(tt0Var);
                    return;
                } else {
                    tt0Var.show();
                    return;
                }
            case 4:
                ut0 ut0Var = (ut0) this.b;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.c;
                b80 b80Var3 = (b80) this.d;
                qv0 qv0Var3 = ut0Var.d;
                e5.S(qv0Var3.getContext(), qv0Var3.v1, d6Var, new pv(ut0Var, 21));
                b80Var3.u();
                return;
            case 5:
                bu0 bu0Var = (bu0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                qv0 qv0Var4 = bu0Var.n;
                int h = bu0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    qv0Var4.v1.getMessagesController().putChats(messages_chats.chats, false);
                    bu0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    bu0Var.d.addAll(messages_chats.chats);
                } else {
                    bu0Var.h = true;
                }
                int i19 = 0;
                while (true) {
                    ju0[] ju0VarArr = qv0Var4.k0;
                    if (i19 >= ju0VarArr.length) {
                        bu0Var.e = false;
                        bu0Var.f = true;
                        bu0Var.l();
                        return;
                    } else {
                        ju0 ju0Var = ju0VarArr[i19];
                        if (ju0Var.F == 6 && (ps0Var = ju0Var.h) != null && (bu0Var.f || h == 0)) {
                            qv0Var4.z(ps0Var, 0, null);
                        }
                        i19++;
                    }
                }
                break;
            case 6:
                hu0 hu0Var = (hu0) this.b;
                String str6 = (String) this.d;
                ArrayList arrayList4 = (ArrayList) this.c;
                String str7 = " ";
                org.telegram.ui.ActionBar.n2 n2Var4 = hu0Var.s.v1;
                String lowerCase = str6.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new in0((Object) hu0Var, (Object) new ArrayList(), (Object) new ArrayList(), i13));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i20 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i20];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                int size = arrayList4.size();
                int i21 = 0;
                while (i21 < size) {
                    TLObject tLObject2 = (TLObject) arrayList4.get(i21);
                    if (tLObject2 instanceof TLRPC.ChatParticipant) {
                        n2Var = n2Var4;
                        peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                    } else {
                        n2Var = n2Var4;
                        if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                        }
                        arrayList = arrayList4;
                        str = str7;
                        i10 = i21;
                        i21 = i10 + 1;
                        n2Var4 = n2Var;
                        arrayList4 = arrayList;
                        str7 = str;
                        str3 = null;
                    }
                    TLRPC.User user2 = n2Var.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user2.id != n2Var.getUserConfig().getClientUserId()) {
                        String lowerCase2 = UserObject.getUserName(user2).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = str3;
                        }
                        int i22 = 0;
                        boolean z13 = false;
                        while (i22 < i20) {
                            arrayList = arrayList4;
                            String str8 = strArr[i22];
                            if (lowerCase2.startsWith(str8) || org.telegram.messenger.bi.u(str7, str8, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str8) || org.telegram.messenger.bi.u(str7, str8, translitString2)))) {
                                str = str7;
                                r62 = 1;
                            } else {
                                str = str7;
                                String publicUsername = UserObject.getPublicUsername(user2);
                                r62 = (publicUsername == null || !publicUsername.startsWith(str8)) ? z13 : 2;
                            }
                            if (r62 != 0) {
                                i10 = i21;
                                if (r62 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str8));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str8));
                                }
                                arrayList6.add(tLObject2);
                                i21 = i10 + 1;
                                n2Var4 = n2Var;
                                arrayList4 = arrayList;
                                str7 = str;
                                str3 = null;
                            } else {
                                i22++;
                                arrayList4 = arrayList;
                                z13 = r62;
                                str7 = str;
                            }
                        }
                    }
                    arrayList = arrayList4;
                    str = str7;
                    i10 = i21;
                    i21 = i10 + 1;
                    n2Var4 = n2Var;
                    arrayList4 = arrayList;
                    str7 = str;
                    str3 = null;
                }
                AndroidUtilities.runOnUIThread(new in0((Object) hu0Var, (Object) arrayList5, (Object) arrayList6, 7));
                return;
            case 7:
                hu0 hu0Var2 = (hu0) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                qv0 qv0Var5 = hu0Var2.s;
                if (qv0Var5.V0) {
                    hu0Var2.d = arrayList7;
                    hu0Var2.r--;
                    if (!ChatObject.isChannel(hu0Var2.n)) {
                        ArrayList arrayList9 = hu0Var2.e.g;
                        arrayList9.clear();
                        arrayList9.addAll(arrayList8);
                    }
                    if (hu0Var2.r == 0) {
                        int i23 = 0;
                        while (true) {
                            ju0[] ju0VarArr2 = qv0Var5.k0;
                            if (i23 < ju0VarArr2.length) {
                                ju0 ju0Var2 = ju0VarArr2[i23];
                                if (ju0Var2.F == 7) {
                                    if (hu0Var2.h == 0) {
                                        ju0Var2.w.e(false, true);
                                    } else {
                                        qv0Var5.z(ju0Var2.h, 0, null);
                                    }
                                }
                                i23++;
                            }
                        }
                    }
                    hu0Var2.l();
                    return;
                }
                return;
            case 8:
                mu0 mu0Var = (mu0) this.b;
                String str9 = (String) this.d;
                ArrayList arrayList10 = (ArrayList) this.c;
                mu0Var.getClass();
                String lowerCase3 = str9.trim().toLowerCase();
                int i24 = 8;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new vo0(i24, mu0Var, new ArrayList()));
                    return;
                }
                String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                    str4 = translitString3;
                }
                int i25 = (str4 != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i25];
                strArr2[0] = lowerCase3;
                if (str4 != null) {
                    strArr2[1] = str4;
                }
                ArrayList arrayList11 = new ArrayList();
                int i26 = 0;
                while (i26 < arrayList10.size()) {
                    MessageObject messageObject = (MessageObject) arrayList10.get(i26);
                    int i27 = 0;
                    while (true) {
                        if (i27 < i25) {
                            String str10 = strArr2[i27];
                            String documentName = messageObject.getDocumentName();
                            if (documentName != null && documentName.length() != 0) {
                                if (documentName.toLowerCase().contains(str10)) {
                                    arrayList11.add(messageObject);
                                } else if (mu0Var.r != i14) {
                                    continue;
                                } else {
                                    TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                    int i28 = 0;
                                    while (true) {
                                        if (i28 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i28);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str11 = documentAttribute.performer;
                                                z10 = str11 != null ? str11.toLowerCase().contains(str10) : false;
                                                if (!z10 && (str2 = documentAttribute.title) != null) {
                                                    z10 = str2.toLowerCase().contains(str10);
                                                }
                                            } else {
                                                i28++;
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
                            i27++;
                            i14 = 4;
                        }
                    }
                    i26++;
                    i14 = 4;
                }
                AndroidUtilities.runOnUIThread(new vo0(i24, mu0Var, arrayList11));
                return;
            case 9:
                ry0 ry0Var = (ry0) this.b;
                String str12 = (String) this.c;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) this.d;
                if (ry0Var.isDismissed()) {
                    return;
                }
                ry0Var.Z.remove(str12);
                if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                    importingSticker.validated = true;
                    int indexOf = ry0Var.Y.indexOf(importingSticker);
                    if (indexOf >= 0) {
                        s4.c1 K = ry0Var.c.K(indexOf);
                        if (K != null) {
                            ((org.telegram.ui.Cells.f8) K.a).setSticker(importingSticker);
                        }
                    } else {
                        ry0Var.d.l();
                    }
                } else {
                    ry0Var.u0(importingSticker);
                }
                if (ry0Var.Z.isEmpty()) {
                    ry0Var.B0();
                    return;
                }
                return;
            case 10:
                ry0.w((ry0) this.b, (ArrayList) this.c, (Boolean) this.d);
                return;
            case 11:
                ry0.C((ry0) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 12:
                ry0.E((ry0) this.b, (String) this.c, (TextView) this.d);
                return;
            case 13:
                ry0 ry0Var2 = (ry0) this.b;
                ArrayList arrayList12 = (ArrayList) this.c;
                ArrayList arrayList13 = (ArrayList) this.d;
                ArrayList arrayList14 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList12.size();
                while (i16 < size2) {
                    Object obj2 = arrayList12.get(i16);
                    if ((obj2 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj2))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool == null) {
                            bool = Boolean.valueOf(equals);
                        } else if (bool.booleanValue() != equals) {
                            continue;
                        }
                        if (ry0Var2.isDismissed()) {
                            return;
                        }
                        SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                        importingSticker2.animated = equals;
                        String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                        importingSticker2.path = copyFileToCache;
                        if (copyFileToCache != null) {
                            if (equals) {
                                importingSticker2.mimeType = "application/x-tgsticker";
                            } else {
                                BitmapFactory.decodeFile(copyFileToCache, options);
                                int i29 = options.outWidth;
                                if ((i29 == 512 && (i11 = options.outHeight) > 0 && i11 <= 512) || (options.outHeight == 512 && i29 > 0 && i29 <= 512)) {
                                    importingSticker2.mimeType = "image/".concat(stickerExt);
                                    importingSticker2.validated = true;
                                }
                            }
                            if (arrayList13 != null && arrayList13.size() == size2 && (arrayList13.get(i16) instanceof String)) {
                                importingSticker2.emoji = (String) arrayList13.get(i16);
                            } else {
                                importingSticker2.emoji = "#️⃣";
                            }
                            arrayList14.add(importingSticker2);
                            if (arrayList14.size() >= 200) {
                                AndroidUtilities.runOnUIThread(new in0(ry0Var2, arrayList14, bool, 10));
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                    i16++;
                }
                AndroidUtilities.runOnUIThread(new in0(ry0Var2, arrayList14, bool, 10));
                return;
            case 14:
                c61 c61Var = (c61) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                SparseArray sparseArray = c61Var.f;
                ArrayList arrayList15 = c61Var.e;
                ArrayList arrayList16 = c61Var.n;
                SparseArray sparseArray2 = c61Var.d;
                c61Var.r = false;
                if (tL_error2 != null || !(tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    c61Var.s = true;
                    return;
                }
                ArrayList<TLRPC.StickerSetCovered> arrayList17 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                if (arrayList17.size() < 40) {
                    c61Var.s = true;
                }
                if (arrayList17.isEmpty()) {
                    return;
                }
                if (arrayList16.isEmpty()) {
                    int i30 = c61Var.w;
                    c61Var.w = i30 + 1;
                    sparseArray2.put(i30, -1);
                }
                arrayList16.addAll(arrayList17);
                int size3 = arrayList15.size();
                for (int i31 = 0; i31 < arrayList17.size(); i31++) {
                    TLRPC.StickerSetCovered stickerSetCovered = arrayList17.get(i31);
                    if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                        arrayList15.add(stickerSetCovered);
                        sparseArray.put(c61Var.w, stickerSetCovered);
                        int i32 = c61Var.w;
                        c61Var.w = i32 + 1;
                        int i33 = size3 + 1;
                        sparseArray2.put(i32, Integer.valueOf(size3));
                        if (stickerSetCovered.covers.isEmpty()) {
                            sparseArray2.put(c61Var.w, stickerSetCovered.cover);
                            i12 = 1;
                        } else {
                            i12 = (int) Math.ceil(stickerSetCovered.covers.size() / c61Var.v);
                            for (int i34 = 0; i34 < stickerSetCovered.covers.size(); i34++) {
                                sparseArray2.put(c61Var.w + i34, stickerSetCovered.covers.get(i34));
                            }
                        }
                        int i35 = 0;
                        while (true) {
                            int i36 = c61Var.v * i12;
                            if (i35 < i36) {
                                sparseArray.put(c61Var.w + i35, stickerSetCovered);
                                i35++;
                            } else {
                                c61Var.w = i36 + c61Var.w;
                                size3 = i33;
                            }
                        }
                    }
                }
                c61Var.l();
                return;
            case 15:
                l81 l81Var = (l81) this.b;
                Uri uri2 = (Uri) this.c;
                MessageObject messageObject2 = (MessageObject) this.d;
                l81Var.getClass();
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
                        absolutePath = new File(directory, a4.a.s(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    l81Var.b = new d6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    l81Var.b = new d6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                l81Var.c = l81Var.b.d[4];
                float f7 = l81Var.h;
                if (f7 != 0.0f) {
                    l81Var.e(messageObject2, f7, l81Var.r);
                    l81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new h81(l81Var, true ? 1 : 0));
                return;
            case 16:
                l81 l81Var2 = (l81) this.b;
                c81 c81Var = (c81) this.c;
                MessageObject messageObject3 = (MessageObject) this.d;
                l81Var2.getClass();
                if (c81Var.b()) {
                    l81Var2.b = new d6(new File(c81Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i37 = UserConfig.selectedAccount;
                    try {
                        i37 = Utilities.parseInt((CharSequence) c81Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    int i38 = i37;
                    try {
                        obj = FileLoader.getInstance(i38).getParentObject(Utilities.parseInt((CharSequence) c81Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    Object obj3 = obj;
                    TLRPC.Document document2 = c81Var.g;
                    if (FileLoader.getInstance(i38).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a4.a.s(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i38).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    l81Var2.b = new d6(new File(absolutePath2), true, document2.size, 1, document2, null, obj3, 0L, i38, true);
                }
                l81Var2.c = l81Var2.b.d[4];
                float f10 = l81Var2.h;
                if (f10 != 0.0f) {
                    l81Var2.e(messageObject3, f10, l81Var2.r);
                    l81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new h81(l81Var2, i15));
                return;
            case 17:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.c;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.d;
                ValueAnimator valueAnimator = m0Var.N0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                uVar.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new org.telegram.ui.Components.voip.l0(m0Var, uVar)).setDuration(100L).start();
                if (uVar2 != null) {
                    uVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).setListener(new org.telegram.ui.Components.voip.y(uVar2)).start();
                    return;
                }
                return;
            case 18:
                File file = (File) this.b;
                int[] iArr = (int[]) this.c;
                org.telegram.ui.bf bfVar = (org.telegram.ui.bf) this.d;
                AnimatedFileNative.d(file.getAbsolutePath(), iArr, 0L);
                AndroidUtilities.runOnUIThread(bfVar);
                return;
            case 19:
                ((q0.a) this.c).accept(Boolean.valueOf(((org.telegram.ui.web.c1) this.b).d((String[]) this.d)));
                return;
            case 20:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                String str13 = (String) this.c;
                String str14 = (String) this.d;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.c1 c1Var = botWebViewContainer$BotWebViewProxy.a;
                    if (c1Var == null) {
                        return;
                    }
                    boolean z14 = org.telegram.ui.web.c1.P0;
                    c1Var.F(botWebViewContainer$BotWebViewProxy, c1Var.g(), str13, str14);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 21:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) this.b;
                String str15 = (String) this.c;
                String str16 = (String) this.d;
                org.telegram.ui.web.c1 c1Var2 = botWebViewContainer$WebViewProxy.a;
                if (c1Var2 == null || c1Var2.o0 || c1Var2.c == null) {
                    return;
                }
                if (c1Var2.F0 != null && !TextUtils.equals(c1Var2.getOriginHost(), c1Var2.F0)) {
                    c1Var2.h("onWebEventReceived ignore " + str15);
                    return;
                }
                c1Var2.h("onWebEventReceived " + str15 + " " + str16);
                str15.getClass();
                switch (str15) {
                    case "actionBarColor":
                    case "navigationBarColor":
                        try {
                            JSONArray jSONArray = new JSONArray(str16);
                            boolean equals2 = TextUtils.equals(str15, "actionBarColor");
                            int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                            org.telegram.ui.web.z0 z0Var = c1Var2.a;
                            if (z0Var != null) {
                                if (equals2) {
                                    z0Var.s = true;
                                    z0Var.w = argb;
                                } else {
                                    z0Var.v = true;
                                    z0Var.x = argb;
                                }
                                org.telegram.ui.web.z0.a(z0Var);
                            }
                            c1Var2.c.o(argb, equals2);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    case "oauth_request":
                        c1Var2.h("oauth_request " + str16);
                        if (c1Var2.a == null) {
                            return;
                        }
                        String originHost = c1Var2.getOriginHost();
                        if (TextUtils.isEmpty(originHost)) {
                            return;
                        }
                        try {
                            String optString = new JSONObject(str16).optString("url");
                            c1Var2.z("oauth_supported", org.telegram.ui.web.c1.B(1, "version"));
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                            tL_messages_requestUrlAuth.url = optString;
                            int i39 = tL_messages_requestUrlAuth.flags;
                            tL_messages_requestUrlAuth.in_app_origin = originHost;
                            tL_messages_requestUrlAuth.flags = i39 | 12;
                            ConnectionsManager.getInstance(c1Var2.M).sendRequest(tL_messages_requestUrlAuth, new ai.p3(c1Var2, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
                            return;
                        } catch (Exception e12) {
                            FileLog.e(e12);
                            return;
                        }
                    case "siteName":
                        c1Var2.h("siteName " + str16);
                        org.telegram.ui.web.z0 z0Var2 = c1Var2.a;
                        if (z0Var2 != null) {
                            z0Var2.r = str16;
                            org.telegram.ui.web.z0.a(z0Var2);
                            return;
                        }
                        return;
                    case "allowScroll":
                        try {
                            JSONArray jSONArray2 = new JSONArray(str16);
                            z11 = jSONArray2.optBoolean(0, true);
                            try {
                                z12 = jSONArray2.optBoolean(1, true);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            z11 = true;
                        }
                        if (c1Var2.getParent() instanceof ei.q4) {
                            ei.q4 q4Var = (ei.q4) c1Var2.getParent();
                            q4Var.O = z11;
                            q4Var.P = z12;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 22:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) this.b;
                ArrayList arrayList18 = (ArrayList) this.c;
                String str17 = (String) this.d;
                ArrayList arrayList19 = new ArrayList();
                while (i16 < arrayList18.size()) {
                    org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) arrayList18.get(i16);
                    if (org.telegram.ui.web.g1.t(d1Var.c, str17) || ((n2Var2 = d1Var.d) != null && (org.telegram.ui.web.g1.t(n2Var2.c, str17) || org.telegram.ui.web.g1.t(d1Var.d.d, str17)))) {
                        arrayList19.add(d1Var);
                    }
                    i16++;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.e91(27, g1Var, arrayList19));
                return;
            case 23:
                a();
                return;
            case 24:
                ((EglRenderer) this.b).lambda$init$0((EglBase.Context) this.c, (int[]) this.d);
                return;
            case 25:
                ((EglRenderer) this.b).lambda$removeFrameListener$4((CountDownLatch) this.c, (EglRenderer.FrameListener) this.d);
                return;
            case 26:
                ((VideoFileRenderer) this.b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 27:
                qi.j jVar = (qi.j) this.b;
                WebView webView = (WebView) this.c;
                b5.h hVar = (b5.h) this.d;
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
            case 28:
                ((tg.x0) this.b).run(new Pair((HashMap) this.d, (ArrayList) this.c));
                return;
            default:
                TLObject tLObject4 = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.c;
                ?? r32 = (tg.x0) this.d;
                if (tLObject4 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList20 = new ArrayList();
                    while (i16 < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i16).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList20.add(messagesController.getInputPeer(peer));
                        }
                        i16++;
                    }
                    r32.run(arrayList20);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ in0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
