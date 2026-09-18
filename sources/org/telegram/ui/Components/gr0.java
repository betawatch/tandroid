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
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.qb1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gr0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ((org.telegram.ui.web.b1) this.b).run(new Pair((HashMap) this.c, (ArrayList) this.d));
    }

    private final void b() {
        uf.d dVar = (uf.d) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str = dVar.b;
        int i10 = dVar.a;
        if (tLObject != null) {
            MediaDataController.getInstance(i10).onRingtoneUploaded(str, (TLRPC.Document) tLObject, false);
        } else {
            dVar.a();
            MediaDataController.getInstance(i10).onRingtoneUploaded(str, null, true);
            if (tL_error != null) {
                NotificationCenter.getInstance(i10).doOnIdle(new p2.b(29, dVar, tL_error));
            }
        }
        dVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:351:0x0756, code lost:
    
        if (r13.booleanValue() != r9) goto L262;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r8v34, types: [tg.y0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        yr0 yr0Var;
        long peerId;
        org.telegram.ui.ActionBar.o2 o2Var;
        int i10;
        ?? r12;
        boolean z10;
        String str;
        ArrayList arrayList;
        Uri uri;
        String stickerExt;
        int i11;
        int i12;
        String absolutePath;
        String absolutePath2;
        boolean z11;
        org.telegram.ui.web.m2 m2Var;
        Object obj;
        TLRPC.User user;
        int i13 = this.a;
        int i14 = 2;
        String str2 = null;
        Object obj2 = null;
        Boolean bool = null;
        r13 = null;
        String str3 = null;
        int i15 = 0;
        boolean z12 = true;
        z12 = true;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i13) {
            case 0:
                zu0 zu0Var = (zu0) obj5;
                String str4 = (String) obj4;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj3;
                ct0 ct0Var = new ct0(zu0Var.getContext(), str4, str4, zu0Var.F1, o2Var2);
                if (o2Var2 != null) {
                    o2Var2.showDialog(ct0Var);
                    break;
                } else {
                    ct0Var.show();
                    break;
                }
            case 1:
                dt0 dt0Var = (dt0) obj5;
                zu0 zu0Var2 = dt0Var.d;
                c5.S(zu0Var2.getContext(), zu0Var2.v1, (org.telegram.ui.ActionBar.f6) obj4, new lv(dt0Var, 20));
                ((n70) obj3).u();
                break;
            case 2:
                kt0 kt0Var = (kt0) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                zu0 zu0Var3 = kt0Var.n;
                int h = kt0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    zu0Var3.v1.getMessagesController().putChats(messages_chats.chats, false);
                    kt0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    kt0Var.d.addAll(messages_chats.chats);
                } else {
                    kt0Var.h = true;
                }
                int i16 = 0;
                while (true) {
                    st0[] st0VarArr = zu0Var3.k0;
                    if (i16 >= st0VarArr.length) {
                        kt0Var.e = false;
                        kt0Var.f = true;
                        kt0Var.l();
                        break;
                    } else {
                        st0 st0Var = st0VarArr[i16];
                        if (st0Var.F == 6 && (yr0Var = st0Var.h) != null && (kt0Var.f || h == 0)) {
                            zu0Var3.z(yr0Var, 0, null);
                        }
                        i16++;
                    }
                }
                break;
            case 3:
                qt0 qt0Var = (qt0) obj5;
                ArrayList arrayList2 = (ArrayList) obj3;
                org.telegram.ui.ActionBar.o2 o2Var3 = qt0Var.s.v1;
                String lowerCase = ((String) obj4).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gr0(qt0Var, new ArrayList(), new ArrayList(), 4));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i17 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i17];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size) {
                        TLObject tLObject2 = (TLObject) arrayList2.get(i18);
                        if (tLObject2 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                        } else {
                            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                            }
                            o2Var = o2Var3;
                            i10 = i17;
                            i18++;
                            i17 = i10;
                            o2Var3 = o2Var;
                            str2 = null;
                        }
                        TLRPC.User user2 = o2Var3.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user2.id != o2Var3.getUserConfig().getClientUserId()) {
                            String lowerCase2 = UserObject.getUserName(user2).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = str2;
                            }
                            int i19 = 0;
                            boolean z13 = false;
                            while (i19 < i17) {
                                o2Var = o2Var3;
                                String str5 = strArr[i19];
                                if (lowerCase2.startsWith(str5) || org.telegram.messenger.w1.w(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.w1.w(" ", str5, translitString2)))) {
                                    r12 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user2);
                                    r12 = (publicUsername == null || !publicUsername.startsWith(str5)) ? z13 : 2;
                                }
                                if (r12 != 0) {
                                    i10 = i17;
                                    if (r12 == 1) {
                                        arrayList3.add(AndroidUtilities.generateSearchName(user2.first_name, user2.last_name, str5));
                                    } else {
                                        arrayList3.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user2), null, "@" + str5));
                                    }
                                    arrayList4.add(tLObject2);
                                    i18++;
                                    i17 = i10;
                                    o2Var3 = o2Var;
                                    str2 = null;
                                } else {
                                    i19++;
                                    o2Var3 = o2Var;
                                    z13 = r12;
                                }
                            }
                        }
                        o2Var = o2Var3;
                        i10 = i17;
                        i18++;
                        i17 = i10;
                        o2Var3 = o2Var;
                        str2 = null;
                    }
                    AndroidUtilities.runOnUIThread(new gr0(qt0Var, arrayList3, arrayList4, 4));
                    break;
                }
                break;
            case 4:
                qt0 qt0Var2 = (qt0) obj5;
                ArrayList arrayList5 = (ArrayList) obj4;
                ArrayList arrayList6 = (ArrayList) obj3;
                zu0 zu0Var4 = qt0Var2.s;
                if (zu0Var4.V0) {
                    qt0Var2.d = arrayList5;
                    qt0Var2.r--;
                    if (!ChatObject.isChannel(qt0Var2.n)) {
                        ArrayList arrayList7 = qt0Var2.e.g;
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                    }
                    if (qt0Var2.r == 0) {
                        int i20 = 0;
                        while (true) {
                            st0[] st0VarArr2 = zu0Var4.k0;
                            if (i20 < st0VarArr2.length) {
                                st0 st0Var2 = st0VarArr2[i20];
                                if (st0Var2.F == 7) {
                                    if (qt0Var2.h == 0) {
                                        st0Var2.w.e(false, true);
                                    } else {
                                        zu0Var4.z(st0Var2.h, 0, null);
                                    }
                                }
                                i20++;
                            }
                        }
                    }
                    qt0Var2.l();
                    break;
                }
                break;
            case 5:
                vt0 vt0Var = (vt0) obj5;
                ArrayList arrayList8 = (ArrayList) obj3;
                vt0Var.getClass();
                String lowerCase3 = ((String) obj4).trim().toLowerCase();
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new br0(4, vt0Var, new ArrayList()));
                    break;
                } else {
                    String translitString3 = LocaleController.getInstance().getTranslitString(lowerCase3);
                    if (!lowerCase3.equals(translitString3) && translitString3.length() != 0) {
                        str3 = translitString3;
                    }
                    int i21 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i21];
                    strArr2[0] = lowerCase3;
                    if (str3 != null) {
                        strArr2[1] = str3;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (int i22 = 0; i22 < arrayList8.size(); i22++) {
                        MessageObject messageObject = (MessageObject) arrayList8.get(i22);
                        int i23 = 0;
                        while (true) {
                            if (i23 < i21) {
                                String str6 = strArr2[i23];
                                String documentName = messageObject.getDocumentName();
                                if (documentName != null && documentName.length() != 0) {
                                    if (documentName.toLowerCase().contains(str6)) {
                                        arrayList9.add(messageObject);
                                    } else if (vt0Var.r != 4) {
                                        continue;
                                    } else {
                                        TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                        int i24 = 0;
                                        while (true) {
                                            if (i24 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i24);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str7 = documentAttribute.performer;
                                                    z10 = str7 != null ? str7.toLowerCase().contains(str6) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str6);
                                                    }
                                                } else {
                                                    i24++;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (z10) {
                                            arrayList9.add(messageObject);
                                        }
                                    }
                                }
                                i23++;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new br0(4, vt0Var, arrayList9));
                    break;
                }
                break;
            case 6:
                wx0 wx0Var = (wx0) obj5;
                String str8 = (String) obj4;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj3;
                if (!wx0Var.isDismissed()) {
                    wx0Var.Z.remove(str8);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int indexOf = wx0Var.Y.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            s4.c1 L = wx0Var.c.L(indexOf);
                            if (L != null) {
                                ((org.telegram.ui.Cells.f8) L.a).setSticker(importingSticker);
                            }
                        } else {
                            wx0Var.d.l();
                        }
                    } else {
                        wx0Var.u0(importingSticker);
                    }
                    if (wx0Var.Z.isEmpty()) {
                        wx0Var.B0();
                        break;
                    }
                }
                break;
            case 7:
                wx0.w((wx0) obj5, (ArrayList) obj4, (Boolean) obj3);
                break;
            case 8:
                wx0.E((wx0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3);
                break;
            case 9:
                wx0.G((wx0) obj5, (String) obj4, (TextView) obj3);
                break;
            case 10:
                wx0 wx0Var2 = (wx0) obj5;
                ArrayList arrayList10 = (ArrayList) obj4;
                ArrayList arrayList11 = (ArrayList) obj3;
                ArrayList arrayList12 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList10.size();
                while (i15 < size2) {
                    Object obj6 = arrayList10.get(i15);
                    if ((obj6 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj6))) != null) {
                        boolean equals = "tgs".equals(stickerExt);
                        if (bool != null) {
                            break;
                        } else {
                            bool = Boolean.valueOf(equals);
                        }
                        if (wx0Var2.isDismissed()) {
                            break;
                        } else {
                            SendMessagesHelper.ImportingSticker importingSticker2 = new SendMessagesHelper.ImportingSticker();
                            importingSticker2.animated = equals;
                            arrayList = arrayList10;
                            String copyFileToCache = MediaController.copyFileToCache(uri, stickerExt, (equals ? 64 : 512) * 1024);
                            importingSticker2.path = copyFileToCache;
                            if (copyFileToCache != null) {
                                if (equals) {
                                    importingSticker2.mimeType = "application/x-tgsticker";
                                } else {
                                    BitmapFactory.decodeFile(copyFileToCache, options);
                                    int i25 = options.outWidth;
                                    if ((i25 == 512 && (i11 = options.outHeight) > 0 && i11 <= 512) || (options.outHeight == 512 && i25 > 0 && i25 <= 512)) {
                                        importingSticker2.mimeType = "image/".concat(stickerExt);
                                        importingSticker2.validated = true;
                                    }
                                }
                                if (arrayList11 != null && arrayList11.size() == size2 && (arrayList11.get(i15) instanceof String)) {
                                    importingSticker2.emoji = (String) arrayList11.get(i15);
                                } else {
                                    importingSticker2.emoji = "#️⃣";
                                }
                                arrayList12.add(importingSticker2);
                                if (arrayList12.size() >= 200) {
                                    AndroidUtilities.runOnUIThread(new gr0(wx0Var2, arrayList12, bool, 7));
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i15++;
                            arrayList10 = arrayList;
                        }
                    }
                    arrayList = arrayList10;
                    i15++;
                    arrayList10 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new gr0(wx0Var2, arrayList12, bool, 7));
                break;
            case 11:
                e51 e51Var = (e51) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                SparseArray sparseArray = e51Var.f;
                ArrayList arrayList13 = e51Var.e;
                ArrayList arrayList14 = e51Var.n;
                SparseArray sparseArray2 = e51Var.d;
                e51Var.r = false;
                if (tL_error2 != null || !(tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    e51Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList15 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList15.size() < 40) {
                        e51Var.s = true;
                    }
                    if (!arrayList15.isEmpty()) {
                        if (arrayList14.isEmpty()) {
                            int i26 = e51Var.w;
                            e51Var.w = i26 + 1;
                            sparseArray2.put(i26, -1);
                        }
                        arrayList14.addAll(arrayList15);
                        int size3 = arrayList13.size();
                        for (int i27 = 0; i27 < arrayList15.size(); i27++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList15.get(i27);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList13.add(stickerSetCovered);
                                sparseArray.put(e51Var.w, stickerSetCovered);
                                int i28 = e51Var.w;
                                e51Var.w = i28 + 1;
                                int i29 = size3 + 1;
                                sparseArray2.put(i28, Integer.valueOf(size3));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(e51Var.w, stickerSetCovered.cover);
                                    i12 = 1;
                                } else {
                                    i12 = (int) Math.ceil(stickerSetCovered.covers.size() / e51Var.v);
                                    for (int i30 = 0; i30 < stickerSetCovered.covers.size(); i30++) {
                                        sparseArray2.put(e51Var.w + i30, stickerSetCovered.covers.get(i30));
                                    }
                                }
                                int i31 = 0;
                                while (true) {
                                    int i32 = e51Var.v * i12;
                                    if (i31 < i32) {
                                        sparseArray.put(e51Var.w + i31, stickerSetCovered);
                                        i31++;
                                    } else {
                                        e51Var.w = i32 + e51Var.w;
                                        size3 = i29;
                                    }
                                }
                            }
                        }
                        e51Var.l();
                        break;
                    }
                }
                break;
            case 12:
                o71 o71Var = (o71) obj5;
                Uri uri2 = (Uri) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                o71Var.getClass();
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
                    o71Var.b = new b6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    o71Var.b = new b6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                o71Var.c = o71Var.b.d[4];
                float f7 = o71Var.h;
                if (f7 != 0.0f) {
                    o71Var.e(messageObject2, f7, o71Var.r);
                    o71Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new k71(o71Var, true ? 1 : 0));
                break;
            case 13:
                o71 o71Var2 = (o71) obj5;
                f71 f71Var = (f71) obj4;
                MessageObject messageObject3 = (MessageObject) obj3;
                o71Var2.getClass();
                if (f71Var.b()) {
                    o71Var2.b = new b6(new File(f71Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i33 = UserConfig.selectedAccount;
                    try {
                        i33 = Utilities.parseInt((CharSequence) f71Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i34 = i33;
                    try {
                        obj2 = FileLoader.getInstance(i34).getParentObject(Utilities.parseInt((CharSequence) f71Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Object obj7 = obj2;
                    TLRPC.Document document2 = f71Var.g;
                    if (FileLoader.getInstance(i34).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a4.a.r(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i34).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    o71Var2.b = new b6(new File(absolutePath2), true, document2.size, 1, document2, null, obj7, 0L, i34, true);
                }
                o71Var2.c = o71Var2.b.d[4];
                float f10 = o71Var2.h;
                if (f10 != 0.0f) {
                    o71Var2.e(messageObject3, f10, o71Var2.r);
                    o71Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new k71(o71Var2, i14));
                break;
            case 14:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) obj5;
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj4;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj3;
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
            case 15:
                AnimatedFileNative.d(((File) obj5).getAbsolutePath(), (int[]) obj4, 0L);
                AndroidUtilities.runOnUIThread((org.telegram.ui.af) obj3);
                break;
            case 16:
                ((q0.a) obj4).accept(Boolean.valueOf(((org.telegram.ui.web.d1) obj5).d((String[]) obj3)));
                break;
            case 17:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj5;
                String str9 = (String) obj4;
                String str10 = (String) obj3;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.d1 d1Var = botWebViewContainer$BotWebViewProxy.a;
                    if (d1Var == null) {
                        break;
                    } else {
                        boolean z14 = org.telegram.ui.web.d1.P0;
                        d1Var.F(botWebViewContainer$BotWebViewProxy, d1Var.g(), str9, str10);
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 18:
                String str11 = (String) obj4;
                String str12 = (String) obj3;
                org.telegram.ui.web.d1 d1Var2 = ((BotWebViewContainer$WebViewProxy) obj5).a;
                if (d1Var2 != null && !d1Var2.o0 && d1Var2.c != null) {
                    if (d1Var2.F0 != null && !TextUtils.equals(d1Var2.getOriginHost(), d1Var2.F0)) {
                        d1Var2.h("onWebEventReceived ignore " + str11);
                        break;
                    } else {
                        d1Var2.h("onWebEventReceived " + str11 + " " + str12);
                        str11.getClass();
                        switch (str11) {
                            case "actionBarColor":
                            case "navigationBarColor":
                                try {
                                    JSONArray jSONArray = new JSONArray(str12);
                                    boolean equals2 = TextUtils.equals(str11, "actionBarColor");
                                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                    org.telegram.ui.web.z0 z0Var = d1Var2.a;
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
                                    d1Var2.c.o(argb, equals2);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            case "oauth_request":
                                d1Var2.h("oauth_request " + str12);
                                if (d1Var2.a != null) {
                                    String originHost = d1Var2.getOriginHost();
                                    if (!TextUtils.isEmpty(originHost)) {
                                        try {
                                            String optString = new JSONObject(str12).optString("url");
                                            d1Var2.z("oauth_supported", org.telegram.ui.web.d1.B(1, "version"));
                                            if (!TextUtils.isEmpty(optString)) {
                                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                tL_messages_requestUrlAuth.url = optString;
                                                int i35 = tL_messages_requestUrlAuth.flags;
                                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                tL_messages_requestUrlAuth.flags = i35 | 12;
                                                ConnectionsManager.getInstance(d1Var2.M).sendRequest(tL_messages_requestUrlAuth, new ai.p3(d1Var2, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            FileLog.e(e11);
                                            return;
                                        }
                                    }
                                }
                                break;
                            case "siteName":
                                d1Var2.h("siteName " + str12);
                                org.telegram.ui.web.z0 z0Var2 = d1Var2.a;
                                if (z0Var2 != null) {
                                    z0Var2.r = str12;
                                    org.telegram.ui.web.z0.a(z0Var2);
                                    break;
                                }
                                break;
                            case "allowScroll":
                                try {
                                    JSONArray jSONArray2 = new JSONArray(str12);
                                    z11 = jSONArray2.optBoolean(0, true);
                                    try {
                                        z12 = jSONArray2.optBoolean(1, true);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    z11 = true;
                                }
                                if (d1Var2.getParent() instanceof ei.p4) {
                                    ei.p4 p4Var = (ei.p4) d1Var2.getParent();
                                    p4Var.O = z11;
                                    p4Var.P = z12;
                                    break;
                                }
                                break;
                        }
                    }
                }
                break;
            case 19:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) obj5;
                ArrayList arrayList16 = (ArrayList) obj3;
                String str13 = (String) obj4;
                ArrayList arrayList17 = new ArrayList();
                while (i15 < arrayList16.size()) {
                    org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) arrayList16.get(i15);
                    if (org.telegram.ui.web.g1.t(e1Var.c, str13) || ((m2Var = e1Var.d) != null && (org.telegram.ui.web.g1.t(m2Var.c, str13) || org.telegram.ui.web.g1.t(e1Var.d.d, str13)))) {
                        arrayList17.add(e1Var);
                    }
                    i15++;
                }
                AndroidUtilities.runOnUIThread(new qb1(24, g1Var, arrayList17));
                break;
            case 20:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj5;
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                i2Var.getClass();
                if (org.telegram.ui.web.i2.f != null) {
                    ?? r15 = ((h2Var.d > 0 && h2Var.e > 0) || bitmap == null) ? 0 : 1;
                    if (bitmap != null) {
                        i2Var.d.put(h2Var.b, bitmap);
                        if (r15 != 0) {
                            int i36 = h2Var.d;
                            if (i36 == 0 && h2Var.e == 0) {
                                h2Var.d = bitmap.getWidth();
                                h2Var.e = bitmap.getHeight();
                            } else if (i36 == 0) {
                                h2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * h2Var.e);
                            } else if (h2Var.e == 0) {
                                h2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * h2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList18 = (ArrayList) org.telegram.ui.web.i2.f.remove(h2Var.b);
                    if (arrayList18 != null) {
                        int size4 = arrayList18.size();
                        while (i15 < size4) {
                            Object obj8 = arrayList18.get(i15);
                            i15++;
                            Pair pair = (Pair) obj8;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (r15 != 0 && (obj = pair.second) != null) {
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
                ((tg.y0) obj5).run(new Pair((HashMap) obj4, (ArrayList) obj3));
                break;
            case 25:
                TLObject tLObject4 = (TLObject) obj5;
                MessagesController messagesController = (MessagesController) obj4;
                ?? r82 = (tg.y0) obj3;
                if (tLObject4 instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList19 = new ArrayList();
                    while (i15 < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i15).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList19.add(messagesController.getInputPeer(peer));
                        }
                        i15++;
                    }
                    r82.run(arrayList19);
                    break;
                }
                break;
            case 26:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                if (tL_error3 != null) {
                    callback.run(tL_error3);
                    break;
                } else {
                    callback2.run(null);
                    break;
                }
            case 27:
                a();
                break;
            case 28:
                b();
                break;
            default:
                vh.o oVar = (vh.o) obj5;
                d90 d90Var = (d90) obj4;
                ClickableSpan clickableSpan = (ClickableSpan) obj3;
                b90 b90Var = oVar.y;
                if (b90Var != null && oVar.E == d90Var) {
                    b90Var.a(clickableSpan);
                    oVar.E = null;
                    oVar.s.d(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gr0(org.telegram.ui.web.g1 g1Var, ArrayList arrayList, String str) {
        this.a = 19;
        this.b = g1Var;
        this.d = arrayList;
        this.c = str;
    }
}
