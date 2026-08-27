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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.zh1;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gs0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        pf.u0 u0Var = (pf.u0) this.b;
        String str = (String) this.c;
        TLObject tLObject = (TLObject) this.d;
        u0Var.A0 = 0;
        if (str.equals(u0Var.z0) && (tLObject instanceof TLRPC.TL_messages_stickers)) {
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            ArrayList arrayList2 = u0Var.w0;
            int size = arrayList2 != null ? arrayList2.size() : 0;
            u0Var.F("sticker_search_".concat(str), tL_messages_stickers.stickers);
            ArrayList arrayList3 = u0Var.w0;
            int size2 = arrayList3 != null ? arrayList3.size() : 0;
            if (!u0Var.k0 && (arrayList = u0Var.w0) != null && !arrayList.isEmpty()) {
                u0Var.H();
                u0Var.R.a(u0Var.K() > 0);
                u0Var.k0 = true;
            }
            if (size != size2) {
                u0Var.l();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:312:0x07f5, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gs0(r10, r0, r14, 6));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        er0 er0Var;
        long peerId;
        org.telegram.ui.ActionBar.n2 n2Var;
        int i10;
        ?? r12;
        boolean z10;
        String str;
        Uri uri;
        String stickerExt;
        int i11;
        int i12;
        String absolutePath;
        String absolutePath2;
        boolean z11;
        org.telegram.ui.web.i2 i2Var;
        Object obj;
        int i13 = this.a;
        int i14 = 3;
        int i15 = 2;
        String str2 = null;
        Object obj2 = null;
        Boolean bool = null;
        str2 = null;
        int i16 = 0;
        boolean z12 = true;
        z12 = true;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i13) {
            case 0:
                ks0 ks0Var = (ks0) obj5;
                hu0 hu0Var = ks0Var.d;
                y4.S(hu0Var.getContext(), hu0Var.r1, (org.telegram.ui.ActionBar.c6) obj4, new vu(ks0Var, 20));
                ((b70) obj3).u();
                break;
            case 1:
                rs0 rs0Var = (rs0) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                hu0 hu0Var2 = rs0Var.n;
                int h = rs0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    hu0Var2.r1.getMessagesController().putChats(messages_chats.chats, false);
                    rs0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    rs0Var.d.addAll(messages_chats.chats);
                } else {
                    rs0Var.h = true;
                }
                int i17 = 0;
                while (true) {
                    zs0[] zs0VarArr = hu0Var2.g0;
                    if (i17 >= zs0VarArr.length) {
                        rs0Var.e = false;
                        rs0Var.f = true;
                        rs0Var.l();
                        break;
                    } else {
                        zs0 zs0Var = zs0VarArr[i17];
                        if (zs0Var.B == 6 && (er0Var = zs0Var.h) != null && (rs0Var.f || h == 0)) {
                            hu0Var2.z(er0Var, 0, null);
                        }
                        i17++;
                    }
                }
                break;
            case 2:
                xs0 xs0Var = (xs0) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = xs0Var.s.r1;
                String lowerCase = ((String) obj4).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gs0(xs0Var, new ArrayList(), new ArrayList(), i14));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i18 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i18];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList.size();
                    int i19 = 0;
                    while (i19 < size) {
                        TLObject tLObject2 = (TLObject) arrayList.get(i19);
                        if (tLObject2 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                        } else {
                            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                            }
                            n2Var = n2Var2;
                            i10 = i18;
                            i19++;
                            i18 = i10;
                            n2Var2 = n2Var;
                        }
                        TLRPC.User user = n2Var2.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user.id != n2Var2.getUserConfig().getClientUserId()) {
                            String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = null;
                            }
                            int i20 = 0;
                            boolean z13 = false;
                            while (i20 < i18) {
                                n2Var = n2Var2;
                                String str3 = strArr[i20];
                                if (lowerCase2.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str3) || org.telegram.messenger.y1.x(" ", str3, translitString2)))) {
                                    r12 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user);
                                    r12 = (publicUsername == null || !publicUsername.startsWith(str3)) ? z13 : 2;
                                }
                                if (r12 != 0) {
                                    i10 = i18;
                                    if (r12 == 1) {
                                        arrayList2.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str3));
                                    } else {
                                        arrayList2.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str3));
                                    }
                                    arrayList3.add(tLObject2);
                                    i19++;
                                    i18 = i10;
                                    n2Var2 = n2Var;
                                } else {
                                    i20++;
                                    n2Var2 = n2Var;
                                    z13 = r12;
                                }
                            }
                        }
                        n2Var = n2Var2;
                        i10 = i18;
                        i19++;
                        i18 = i10;
                        n2Var2 = n2Var;
                    }
                    AndroidUtilities.runOnUIThread(new gs0(xs0Var, arrayList2, arrayList3, 3));
                    break;
                }
                break;
            case 3:
                xs0 xs0Var2 = (xs0) obj5;
                ArrayList arrayList4 = (ArrayList) obj4;
                ArrayList arrayList5 = (ArrayList) obj3;
                hu0 hu0Var3 = xs0Var2.s;
                if (hu0Var3.R0) {
                    xs0Var2.d = arrayList4;
                    xs0Var2.r--;
                    if (!ChatObject.isChannel(xs0Var2.n)) {
                        ArrayList arrayList6 = xs0Var2.e.g;
                        arrayList6.clear();
                        arrayList6.addAll(arrayList5);
                    }
                    if (xs0Var2.r == 0) {
                        int i21 = 0;
                        while (true) {
                            zs0[] zs0VarArr2 = hu0Var3.g0;
                            if (i21 < zs0VarArr2.length) {
                                zs0 zs0Var2 = zs0VarArr2[i21];
                                if (zs0Var2.B == 7) {
                                    if (xs0Var2.h == 0) {
                                        zs0Var2.w.e(false, true);
                                    } else {
                                        hu0Var3.z(zs0Var2.h, 0, null);
                                    }
                                }
                                i21++;
                            }
                        }
                    }
                    xs0Var2.l();
                    break;
                }
                break;
            case 4:
                ct0 ct0Var = (ct0) obj5;
                ArrayList arrayList7 = (ArrayList) obj3;
                ct0Var.getClass();
                String lowerCase3 = ((String) obj4).trim().toLowerCase();
                int i22 = 16;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new lg0(i22, ct0Var, new ArrayList()));
                    break;
                } else {
                    String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                    if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                        str2 = translitString3;
                    }
                    int i23 = (str2 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i23];
                    strArr2[0] = lowerCase3;
                    if (str2 != null) {
                        strArr2[1] = str2;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (int i24 = 0; i24 < arrayList7.size(); i24++) {
                        MessageObject messageObject = (MessageObject) arrayList7.get(i24);
                        int i25 = 0;
                        while (true) {
                            if (i25 < i23) {
                                String str4 = strArr2[i25];
                                String documentName = messageObject.getDocumentName();
                                if (documentName != null && documentName.length() != 0) {
                                    if (documentName.toLowerCase().contains(str4)) {
                                        arrayList8.add(messageObject);
                                    } else if (ct0Var.r != 4) {
                                        continue;
                                    } else {
                                        TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                        int i26 = 0;
                                        while (true) {
                                            if (i26 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i26);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str5 = documentAttribute.performer;
                                                    z10 = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str4);
                                                    }
                                                } else {
                                                    i26++;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (z10) {
                                            arrayList8.add(messageObject);
                                        }
                                    }
                                }
                                i25++;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new lg0(i22, ct0Var, arrayList8));
                    break;
                }
                break;
            case 5:
                ex0 ex0Var = (ex0) obj5;
                String str6 = (String) obj4;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj3;
                if (!ex0Var.isDismissed()) {
                    ex0Var.V.remove(str6);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int indexOf = ex0Var.U.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            f2.o1 K = ex0Var.c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.a8) K.a).setSticker(importingSticker);
                            }
                        } else {
                            ex0Var.d.l();
                        }
                    } else {
                        ex0Var.u0(importingSticker);
                    }
                    if (ex0Var.V.isEmpty()) {
                        ex0Var.B0();
                        break;
                    }
                }
                break;
            case 6:
                ex0.x((ex0) obj5, (ArrayList) obj4, (Boolean) obj3);
                break;
            case 7:
                ex0.E((ex0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3);
                break;
            case 8:
                ex0.G((ex0) obj5, (String) obj4, (TextView) obj3);
                break;
            case 9:
                ex0 ex0Var2 = (ex0) obj5;
                ArrayList arrayList9 = (ArrayList) obj4;
                ArrayList arrayList10 = (ArrayList) obj3;
                ArrayList arrayList11 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList9.size();
                while (true) {
                    if (i16 >= size2) {
                        break;
                    } else {
                        Object obj6 = arrayList9.get(i16);
                        if ((obj6 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj6))) != null) {
                            boolean equals = "tgs".equals(stickerExt);
                            if (bool == null) {
                                bool = Boolean.valueOf(equals);
                            } else if (bool.booleanValue() != equals) {
                                continue;
                            }
                            if (ex0Var2.isDismissed()) {
                                break;
                            } else {
                                SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                                importingSticker2.animated = equals;
                                Boolean bool2 = bool;
                                String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                                importingSticker2.path = copyFileToCache;
                                if (copyFileToCache != null) {
                                    if (equals) {
                                        importingSticker2.mimeType = "application/x-tgsticker";
                                    } else {
                                        BitmapFactory.decodeFile(copyFileToCache, options);
                                        int i27 = options.outWidth;
                                        if ((i27 == 512 && (i11 = options.outHeight) > 0 && i11 <= 512) || (options.outHeight == 512 && i27 > 0 && i27 <= 512)) {
                                            importingSticker2.mimeType = "image/".concat(stickerExt);
                                            importingSticker2.validated = true;
                                        }
                                    }
                                    if (arrayList10 != null && arrayList10.size() == size2 && (arrayList10.get(i16) instanceof String)) {
                                        importingSticker2.emoji = (String) arrayList10.get(i16);
                                    } else {
                                        importingSticker2.emoji = "#️⃣";
                                    }
                                    arrayList11.add(importingSticker2);
                                    if (arrayList11.size() >= 200) {
                                        bool = bool2;
                                        break;
                                    }
                                }
                                bool = bool2;
                            }
                        }
                        i16++;
                    }
                }
                break;
            case 10:
                i41 i41Var = (i41) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                SparseArray sparseArray = i41Var.f;
                ArrayList arrayList12 = i41Var.e;
                ArrayList arrayList13 = i41Var.n;
                SparseArray sparseArray2 = i41Var.d;
                i41Var.r = false;
                if (tL_error2 != null || !(tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    i41Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList14 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList14.size() < 40) {
                        i41Var.s = true;
                    }
                    if (!arrayList14.isEmpty()) {
                        if (arrayList13.isEmpty()) {
                            int i28 = i41Var.w;
                            i41Var.w = i28 + 1;
                            sparseArray2.put(i28, -1);
                        }
                        arrayList13.addAll(arrayList14);
                        int size3 = arrayList12.size();
                        for (int i29 = 0; i29 < arrayList14.size(); i29++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList14.get(i29);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList12.add(stickerSetCovered);
                                sparseArray.put(i41Var.w, stickerSetCovered);
                                int i30 = i41Var.w;
                                i41Var.w = i30 + 1;
                                int i31 = size3 + 1;
                                sparseArray2.put(i30, Integer.valueOf(size3));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(i41Var.w, stickerSetCovered.cover);
                                    i12 = 1;
                                } else {
                                    i12 = (int) Math.ceil(stickerSetCovered.covers.size() / i41Var.v);
                                    for (int i32 = 0; i32 < stickerSetCovered.covers.size(); i32++) {
                                        sparseArray2.put(i41Var.w + i32, stickerSetCovered.covers.get(i32));
                                    }
                                }
                                int i33 = 0;
                                while (true) {
                                    int i34 = i41Var.v * i12;
                                    if (i33 < i34) {
                                        sparseArray.put(i41Var.w + i33, stickerSetCovered);
                                        i33++;
                                    } else {
                                        i41Var.w = i34 + i41Var.w;
                                        size3 = i31;
                                    }
                                }
                            }
                        }
                        i41Var.l();
                        break;
                    }
                }
                break;
            case 11:
                t61 t61Var = (t61) obj5;
                Uri uri2 = (Uri) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                t61Var.getClass();
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
                        absolutePath = new File(directory, a9.p.o(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    t61Var.b = new x5(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    t61Var.b = new x5(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                t61Var.c = t61Var.b.d[4];
                float f10 = t61Var.h;
                if (f10 != 0.0f) {
                    t61Var.e(messageObject2, f10, t61Var.r);
                    t61Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new p61(t61Var, true ? 1 : 0));
                break;
            case 12:
                t61 t61Var2 = (t61) obj5;
                k61 k61Var = (k61) obj4;
                MessageObject messageObject3 = (MessageObject) obj3;
                t61Var2.getClass();
                if (k61Var.b()) {
                    t61Var2.b = new x5(new File(k61Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i35 = UserConfig.selectedAccount;
                    try {
                        i35 = Utilities.parseInt((CharSequence) k61Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    int i36 = i35;
                    try {
                        obj2 = FileLoader.getInstance(i36).getParentObject(Utilities.parseInt((CharSequence) k61Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    Object obj7 = obj2;
                    TLRPC.Document document2 = k61Var.g;
                    if (FileLoader.getInstance(i36).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a9.p.o(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i36).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    t61Var2.b = new x5(new File(absolutePath2), true, document2.size, 1, document2, null, obj7, 0L, i36, true);
                }
                t61Var2.c = t61Var2.b.d[4];
                float f11 = t61Var2.h;
                if (f11 != 0.0f) {
                    t61Var2.e(messageObject3, f11, t61Var2.r);
                    t61Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new p61(t61Var2, i15));
                break;
            case 13:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) obj5;
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj4;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj3;
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
            case 14:
                ((org.telegram.ui.web.w0) obj5).d("window.Telegram.WebView.receiveEvent('" + ((String) obj4) + "', " + ((JSONObject) obj3) + ");");
                break;
            case 15:
                ((q0.a) obj4).accept(Boolean.valueOf(((org.telegram.ui.web.z0) obj5).d((String[]) obj3)));
                break;
            case 16:
                AnimatedFileNative.d(((File) obj5).getAbsolutePath(), (int[]) obj4, 0L);
                AndroidUtilities.runOnUIThread((cg.h0) obj3);
                break;
            case 17:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj5;
                String str7 = (String) obj4;
                String str8 = (String) obj3;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.z0 z0Var = botWebViewContainer$BotWebViewProxy.a;
                    if (z0Var == null) {
                        break;
                    } else {
                        boolean z14 = org.telegram.ui.web.z0.I0;
                        z0Var.B(botWebViewContainer$BotWebViewProxy, str7, str8);
                        break;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 18:
                String str9 = (String) obj4;
                String str10 = (String) obj3;
                org.telegram.ui.web.z0 z0Var2 = ((BotWebViewContainer$WebViewProxy) obj5).a;
                if (!z0Var2.k0 && z0Var2.c != null) {
                    if (z0Var2.z0 != null && !TextUtils.equals(z0Var2.getOriginHost(), z0Var2.z0)) {
                        z0Var2.g("onWebEventReceived ignore " + str9);
                        break;
                    } else {
                        z0Var2.g("onWebEventReceived " + str9 + " " + str10);
                        str9.getClass();
                        switch (str9) {
                            case "actionBarColor":
                            case "navigationBarColor":
                                try {
                                    JSONArray jSONArray = new JSONArray(str10);
                                    boolean equals2 = TextUtils.equals(str9, "actionBarColor");
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
                            case "oauth_request":
                                z0Var2.g("oauth_request " + str10);
                                if (z0Var2.a != null) {
                                    String originHost = z0Var2.getOriginHost();
                                    if (!TextUtils.isEmpty(originHost)) {
                                        try {
                                            String optString = new JSONObject(str10).optString("url");
                                            z0Var2.v("oauth_supported", org.telegram.ui.web.z0.x(1, "version"));
                                            if (!TextUtils.isEmpty(optString)) {
                                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                tL_messages_requestUrlAuth.url = optString;
                                                int i37 = tL_messages_requestUrlAuth.flags;
                                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                tL_messages_requestUrlAuth.flags = i37 | 12;
                                                ConnectionsManager.getInstance(z0Var2.I).sendRequest(tL_messages_requestUrlAuth, new gh.f1(z0Var2, tL_messages_requestUrlAuth, optString, originHost, 17), 2);
                                                break;
                                            }
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                            return;
                                        }
                                    }
                                }
                                break;
                            case "siteName":
                                z0Var2.g("siteName " + str10);
                                org.telegram.ui.web.w0 w0Var2 = z0Var2.a;
                                if (w0Var2 != null) {
                                    w0Var2.r = str10;
                                    org.telegram.ui.web.w0.a(w0Var2);
                                    break;
                                }
                                break;
                            case "allowScroll":
                                try {
                                    JSONArray jSONArray2 = new JSONArray(str10);
                                    z11 = jSONArray2.optBoolean(0, true);
                                    try {
                                        z12 = jSONArray2.optBoolean(1, true);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    z11 = true;
                                }
                                if (z0Var2.getParent() instanceof nh.d4) {
                                    nh.d4 d4Var = (nh.d4) z0Var2.getParent();
                                    d4Var.K = z11;
                                    d4Var.L = z12;
                                    break;
                                }
                                break;
                        }
                    }
                }
                break;
            case 19:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj5;
                ArrayList arrayList15 = (ArrayList) obj4;
                String str11 = (String) obj3;
                ArrayList arrayList16 = new ArrayList();
                while (i16 < arrayList15.size()) {
                    org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) arrayList15.get(i16);
                    if (org.telegram.ui.web.c1.t(a1Var.c, str11) || ((i2Var = a1Var.d) != null && (org.telegram.ui.web.c1.t(i2Var.c, str11) || org.telegram.ui.web.c1.t(a1Var.d.d, str11)))) {
                        arrayList16.add(a1Var);
                    }
                    i16++;
                }
                AndroidUtilities.runOnUIThread(new zh1(5, c1Var, arrayList16));
                break;
            case 20:
                org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) obj5;
                org.telegram.ui.web.d2 d2Var = (org.telegram.ui.web.d2) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                e2Var.getClass();
                if (org.telegram.ui.web.e2.f != null) {
                    ?? r82 = ((d2Var.d > 0 && d2Var.e > 0) || bitmap == null) ? 0 : 1;
                    if (bitmap != null) {
                        e2Var.d.put(d2Var.b, bitmap);
                        if (r82 != 0) {
                            int i38 = d2Var.d;
                            if (i38 == 0 && d2Var.e == 0) {
                                d2Var.d = bitmap.getWidth();
                                d2Var.e = bitmap.getHeight();
                            } else if (i38 == 0) {
                                d2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * d2Var.e);
                            } else if (d2Var.e == 0) {
                                d2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * d2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList17 = (ArrayList) org.telegram.ui.web.e2.f.remove(d2Var.b);
                    if (arrayList17 != null) {
                        int size4 = arrayList17.size();
                        while (i16 < size4) {
                            Object obj8 = arrayList17.get(i16);
                            i16++;
                            Pair pair = (Pair) obj8;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (r82 != 0 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        break;
                    }
                }
                break;
            case 21:
                ((EglRenderer) obj5).lambda$init$0((EglBase.Context) obj4, (int[]) obj3);
                break;
            case 22:
                ((EglRenderer) obj5).lambda$removeFrameListener$4((CountDownLatch) obj4, (EglRenderer.FrameListener) obj3);
                break;
            case 23:
                ((VideoFileRenderer) obj5).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj4, (VideoFrame) obj3);
                break;
            case 24:
                org.telegram.messenger.l7 l7Var = (org.telegram.messenger.l7) obj3;
                int i39 = ((pf.z) obj5).o0;
                MessagesController messagesController = MessagesController.getInstance(i39);
                Iterator it = ((HashSet) obj4).iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l10 = (Long) pair2.second;
                    (booleanValue ? messagesController.dialogs_read_outbox_max : messagesController.dialogs_read_inbox_max).put(l10, Integer.valueOf(MessagesStorage.getInstance(i39).getDialogReadMaxSync(booleanValue, l10.longValue())));
                }
                AndroidUtilities.runOnUIThread(l7Var);
                break;
            case 25:
                ((pf.x) obj5).b((a0.h) obj3, (ArrayList) obj4);
                break;
            case 26:
                a();
                break;
            case 27:
                pf.u0 u0Var = (pf.u0) obj5;
                u0Var.l0 = null;
                u0Var.Y((a0.h) obj3, (ArrayList) obj4, true);
                break;
            case 28:
                pf.j1 j1Var = (pf.j1) obj5;
                ArrayList arrayList18 = (ArrayList) obj4;
                j1Var.q = arrayList18;
                j1Var.r = (HashMap) obj3;
                j1Var.s = true;
                j1Var.a.V0(arrayList18);
                break;
            default:
                pf.k1 k1Var = (pf.k1) obj5;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) obj3;
                String str12 = ((TLRPC.TL_messages_searchStickerSets) obj4).q;
                pf.l1 l1Var = k1Var.a;
                String str13 = l1Var.N;
                x31 x31Var = l1Var.e;
                if (str12.equals(str13)) {
                    k1Var.a();
                    x31Var.b.h.getProgressDrawable().e = false;
                    l1Var.J = 0;
                    x31Var.b(true);
                    l1Var.A.addAll(tL_messages_foundStickerSets.sets);
                    l1Var.l();
                    break;
                }
                break;
        }
    }
}
