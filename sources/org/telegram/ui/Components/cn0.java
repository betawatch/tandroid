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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cn0(Object obj, Serializable serializable, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = serializable;
        this.c = arrayList;
    }

    private final void a() {
        TLRPC.User user;
        TLObject tLObject = (TLObject) this.b;
        MessagesController messagesController = (MessagesController) this.c;
        tg.x0 x0Var = (tg.x0) this.d;
        if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            messagesController.putUsers(tL_channels_channelParticipants.users, false);
            messagesController.putChats(tL_channels_channelParticipants.chats, false);
            long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i10).peer;
                if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                    arrayList.add(messagesController.getInputPeer(peer));
                }
            }
            x0Var.run(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    @Override // java.lang.Runnable
    public final void run() {
        is0 is0Var;
        long peerId;
        org.telegram.ui.ActionBar.m2 m2Var;
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
        org.telegram.ui.web.m2 m2Var2;
        Object obj;
        int i13 = this.a;
        int i14 = 2;
        String str2 = null;
        Object obj2 = null;
        Boolean bool = null;
        str2 = null;
        int i15 = 0;
        boolean z12 = true;
        z12 = true;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i13) {
            case 0:
                in0 in0Var = (in0) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList<MessageObject> arrayList2 = (ArrayList) obj3;
                int i16 = in0Var.d;
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    DownloadController.getInstance(i16).onDownloadComplete((MessageObject) arrayList.get(i17));
                }
                if (!arrayList2.isEmpty()) {
                    DownloadController.getInstance(i16).deleteRecentFiles(arrayList2);
                }
                in0Var.O = false;
                in0Var.d(true);
                break;
            case 1:
                eo0 eo0Var = (eo0) obj5;
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) obj4;
                y70 y70Var = (y70) obj3;
                if (UserConfig.getInstance(eo0Var.K0.H0).isPremium()) {
                    qyVar.getMessagesController().disableAds(true);
                    eo0Var.T();
                    xc.a0(qyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                } else {
                    new rg.x0((org.telegram.ui.ActionBar.m2) qyVar, 3, true).show();
                }
                y70Var.u();
                break;
            case 2:
                jv0 jv0Var = (jv0) obj5;
                e5.S(jv0Var.getContext(), null, jv0Var.F1, new mr0(jv0Var, (TL_stories.StoryItem) obj4));
                ((y70) obj3).u();
                break;
            case 3:
                jv0 jv0Var2 = (jv0) obj5;
                String str3 = (String) obj4;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj3;
                mt0 mt0Var = new mt0(jv0Var2.getContext(), str3, str3, jv0Var2.F1, m2Var3);
                if (m2Var3 != null) {
                    m2Var3.showDialog(mt0Var);
                    break;
                } else {
                    mt0Var.show();
                    break;
                }
            case 4:
                nt0 nt0Var = (nt0) obj5;
                jv0 jv0Var3 = nt0Var.d;
                e5.S(jv0Var3.getContext(), jv0Var3.v1, (org.telegram.ui.ActionBar.d6) obj4, new mv(nt0Var, 21));
                ((y70) obj3).u();
                break;
            case 5:
                ut0 ut0Var = (ut0) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject = (TLObject) obj3;
                jv0 jv0Var4 = ut0Var.n;
                int h = ut0Var.h();
                if (tL_error == null) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    jv0Var4.v1.getMessagesController().putChats(messages_chats.chats, false);
                    ut0Var.h = messages_chats.chats.isEmpty() || messages_chats.chats.size() != 100;
                    ut0Var.d.addAll(messages_chats.chats);
                } else {
                    ut0Var.h = true;
                }
                int i18 = 0;
                while (true) {
                    cu0[] cu0VarArr = jv0Var4.k0;
                    if (i18 >= cu0VarArr.length) {
                        ut0Var.e = false;
                        ut0Var.f = true;
                        ut0Var.l();
                        break;
                    } else {
                        cu0 cu0Var = cu0VarArr[i18];
                        if (cu0Var.F == 6 && (is0Var = cu0Var.h) != null && (ut0Var.f || h == 0)) {
                            jv0Var4.z(is0Var, 0, null);
                        }
                        i18++;
                    }
                }
                break;
            case 6:
                au0 au0Var = (au0) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                org.telegram.ui.ActionBar.m2 m2Var4 = au0Var.s.v1;
                String lowerCase = ((String) obj3).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new cn0((Object) au0Var, (Object) new ArrayList(), (Object) new ArrayList(), 7));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i19 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i19];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int size = arrayList3.size();
                    int i20 = 0;
                    while (i20 < size) {
                        TLObject tLObject2 = (TLObject) arrayList3.get(i20);
                        if (tLObject2 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject2).user_id;
                        } else {
                            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer);
                            }
                            m2Var = m2Var4;
                            i10 = i19;
                            i20++;
                            i19 = i10;
                            m2Var4 = m2Var;
                            i15 = 0;
                        }
                        TLRPC.User user = m2Var4.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user.id != m2Var4.getUserConfig().getClientUserId()) {
                            String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = null;
                            }
                            boolean z13 = false;
                            while (i15 < i19) {
                                m2Var = m2Var4;
                                String str4 = strArr[i15];
                                if (lowerCase2.startsWith(str4) || org.telegram.messenger.f0.w(" ", str4, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str4) || org.telegram.messenger.f0.w(" ", str4, translitString2)))) {
                                    r12 = 1;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user);
                                    r12 = (publicUsername == null || !publicUsername.startsWith(str4)) ? z13 : 2;
                                }
                                if (r12 != 0) {
                                    i10 = i19;
                                    if (r12 == 1) {
                                        arrayList4.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str4));
                                    } else {
                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str4));
                                    }
                                    arrayList5.add(tLObject2);
                                    i20++;
                                    i19 = i10;
                                    m2Var4 = m2Var;
                                    i15 = 0;
                                } else {
                                    i15++;
                                    m2Var4 = m2Var;
                                    z13 = r12;
                                }
                            }
                        }
                        m2Var = m2Var4;
                        i10 = i19;
                        i20++;
                        i19 = i10;
                        m2Var4 = m2Var;
                        i15 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new cn0((Object) au0Var, (Object) arrayList4, (Object) arrayList5, 7));
                    break;
                }
                break;
            case 7:
                au0 au0Var2 = (au0) obj5;
                ArrayList arrayList6 = (ArrayList) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                jv0 jv0Var5 = au0Var2.s;
                if (jv0Var5.V0) {
                    au0Var2.d = arrayList6;
                    au0Var2.r--;
                    if (!ChatObject.isChannel(au0Var2.n)) {
                        ArrayList arrayList8 = au0Var2.e.g;
                        arrayList8.clear();
                        arrayList8.addAll(arrayList7);
                    }
                    if (au0Var2.r == 0) {
                        int i21 = 0;
                        while (true) {
                            cu0[] cu0VarArr2 = jv0Var5.k0;
                            if (i21 < cu0VarArr2.length) {
                                cu0 cu0Var2 = cu0VarArr2[i21];
                                if (cu0Var2.F == 7) {
                                    if (au0Var2.h == 0) {
                                        cu0Var2.w.e(false, true);
                                    } else {
                                        jv0Var5.z(cu0Var2.h, 0, null);
                                    }
                                }
                                i21++;
                            }
                        }
                    }
                    au0Var2.l();
                    break;
                }
                break;
            case 8:
                fu0 fu0Var = (fu0) obj5;
                ArrayList arrayList9 = (ArrayList) obj4;
                fu0Var.getClass();
                String lowerCase3 = ((String) obj3).trim().toLowerCase();
                int i22 = 9;
                if (lowerCase3.length() == 0) {
                    AndroidUtilities.runOnUIThread(new wn0(i22, fu0Var, new ArrayList()));
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
                    ArrayList arrayList10 = new ArrayList();
                    for (int i24 = 0; i24 < arrayList9.size(); i24++) {
                        MessageObject messageObject = (MessageObject) arrayList9.get(i24);
                        int i25 = 0;
                        while (true) {
                            if (i25 < i23) {
                                String str5 = strArr2[i25];
                                String documentName = messageObject.getDocumentName();
                                if (documentName != null && documentName.length() != 0) {
                                    if (documentName.toLowerCase().contains(str5)) {
                                        arrayList10.add(messageObject);
                                    } else if (fu0Var.r != 4) {
                                        continue;
                                    } else {
                                        TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                                        int i26 = 0;
                                        while (true) {
                                            if (i26 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i26);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str6 = documentAttribute.performer;
                                                    z10 = str6 != null ? str6.toLowerCase().contains(str5) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str5);
                                                    }
                                                } else {
                                                    i26++;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (z10) {
                                            arrayList10.add(messageObject);
                                        }
                                    }
                                }
                                i25++;
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new wn0(i22, fu0Var, arrayList10));
                    break;
                }
                break;
            case 9:
                fy0 fy0Var = (fy0) obj5;
                String str7 = (String) obj4;
                SendMessagesHelper.ImportingSticker importingSticker = (SendMessagesHelper.ImportingSticker) obj3;
                if (!fy0Var.isDismissed()) {
                    fy0Var.Z.remove(str7);
                    if ("application/x-tgsticker".equals(importingSticker.mimeType)) {
                        importingSticker.validated = true;
                        int indexOf = fy0Var.Y.indexOf(importingSticker);
                        if (indexOf >= 0) {
                            s4.c1 K = fy0Var.c.K(indexOf);
                            if (K != null) {
                                ((org.telegram.ui.Cells.f8) K.a).setSticker(importingSticker);
                            }
                        } else {
                            fy0Var.d.l();
                        }
                    } else {
                        fy0Var.u0(importingSticker);
                    }
                    if (fy0Var.Z.isEmpty()) {
                        fy0Var.B0();
                        break;
                    }
                }
                break;
            case 10:
                fy0.w((fy0) obj5, (ArrayList) obj4, (Boolean) obj3);
                break;
            case 11:
                fy0.E((fy0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3);
                break;
            case 12:
                fy0.G((fy0) obj5, (String) obj4, (TextView) obj3);
                break;
            case 13:
                fy0 fy0Var2 = (fy0) obj5;
                ArrayList arrayList11 = (ArrayList) obj4;
                ArrayList arrayList12 = (ArrayList) obj3;
                ArrayList arrayList13 = new ArrayList();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                int size2 = arrayList11.size();
                while (true) {
                    if (i15 < size2) {
                        Object obj6 = arrayList11.get(i15);
                        if ((obj6 instanceof Uri) && (stickerExt = MediaController.getStickerExt((uri = (Uri) obj6))) != null) {
                            boolean equals = "tgs".equals(stickerExt);
                            if (bool == null) {
                                bool = Boolean.valueOf(equals);
                            } else if (bool.booleanValue() != equals) {
                                continue;
                            }
                            if (fy0Var2.isDismissed()) {
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
                                    if (arrayList12 != null && arrayList12.size() == size2 && (arrayList12.get(i15) instanceof String)) {
                                        importingSticker2.emoji = (String) arrayList12.get(i15);
                                    } else {
                                        importingSticker2.emoji = "#️⃣";
                                    }
                                    arrayList13.add(importingSticker2);
                                    if (arrayList13.size() >= 200) {
                                        bool = bool2;
                                    }
                                }
                                bool = bool2;
                            }
                        }
                        i15++;
                    }
                }
                AndroidUtilities.runOnUIThread(new cn0(fy0Var2, arrayList13, bool, 10));
                break;
            case 14:
                q51 q51Var = (q51) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                SparseArray sparseArray = q51Var.f;
                ArrayList arrayList14 = q51Var.e;
                ArrayList arrayList15 = q51Var.n;
                SparseArray sparseArray2 = q51Var.d;
                q51Var.r = false;
                if (tL_error2 != null || !(tLObject3 instanceof TLRPC.TL_messages_featuredStickers)) {
                    q51Var.s = true;
                    break;
                } else {
                    ArrayList<TLRPC.StickerSetCovered> arrayList16 = ((TLRPC.TL_messages_featuredStickers) tLObject3).sets;
                    if (arrayList16.size() < 40) {
                        q51Var.s = true;
                    }
                    if (!arrayList16.isEmpty()) {
                        if (arrayList15.isEmpty()) {
                            int i28 = q51Var.w;
                            q51Var.w = i28 + 1;
                            sparseArray2.put(i28, -1);
                        }
                        arrayList15.addAll(arrayList16);
                        int size3 = arrayList14.size();
                        for (int i29 = 0; i29 < arrayList16.size(); i29++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList16.get(i29);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList14.add(stickerSetCovered);
                                sparseArray.put(q51Var.w, stickerSetCovered);
                                int i30 = q51Var.w;
                                q51Var.w = i30 + 1;
                                int i31 = size3 + 1;
                                sparseArray2.put(i30, Integer.valueOf(size3));
                                if (stickerSetCovered.covers.isEmpty()) {
                                    sparseArray2.put(q51Var.w, stickerSetCovered.cover);
                                    i12 = 1;
                                } else {
                                    i12 = (int) Math.ceil(stickerSetCovered.covers.size() / q51Var.v);
                                    for (int i32 = 0; i32 < stickerSetCovered.covers.size(); i32++) {
                                        sparseArray2.put(q51Var.w + i32, stickerSetCovered.covers.get(i32));
                                    }
                                }
                                int i33 = 0;
                                while (true) {
                                    int i34 = q51Var.v * i12;
                                    if (i33 < i34) {
                                        sparseArray.put(q51Var.w + i33, stickerSetCovered);
                                        i33++;
                                    } else {
                                        q51Var.w = i34 + q51Var.w;
                                        size3 = i31;
                                    }
                                }
                            }
                        }
                        q51Var.l();
                        break;
                    }
                }
                break;
            case 15:
                a81 a81Var = (a81) obj5;
                Uri uri2 = (Uri) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
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
                        absolutePath = new File(directory, a4.a.s(sb2, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
                    }
                    a81Var.b = new d6(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true);
                } else {
                    a81Var.b = new d6(new File(uri2.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                }
                a81Var.c = a81Var.b.d[4];
                float f7 = a81Var.h;
                if (f7 != 0.0f) {
                    a81Var.e(messageObject2, f7, a81Var.r);
                    a81Var.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new v71(a81Var, true ? 1 : 0));
                break;
            case 16:
                a81 a81Var2 = (a81) obj5;
                q71 q71Var = (q71) obj4;
                MessageObject messageObject3 = (MessageObject) obj3;
                a81Var2.getClass();
                if (q71Var.b()) {
                    a81Var2.b = new d6(new File(q71Var.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                } else {
                    int i35 = UserConfig.selectedAccount;
                    try {
                        i35 = Utilities.parseInt((CharSequence) q71Var.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    int i36 = i35;
                    try {
                        obj2 = FileLoader.getInstance(i36).getParentObject(Utilities.parseInt((CharSequence) q71Var.d.getQueryParameter("rid")).intValue());
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    Object obj7 = obj2;
                    TLRPC.Document document2 = q71Var.g;
                    if (FileLoader.getInstance(i36).isLoadingFile(FileLoader.getAttachFileName(document2))) {
                        File directory2 = FileLoader.getDirectory(4);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(document2.dc_id);
                        sb3.append("_");
                        absolutePath2 = new File(directory2, a4.a.s(sb3, document2.id, ".temp")).getAbsolutePath();
                    } else {
                        absolutePath2 = FileLoader.getInstance(i36).getPathToAttach(document2, false).getAbsolutePath();
                    }
                    a81Var2.b = new d6(new File(absolutePath2), true, document2.size, 1, document2, null, obj7, 0L, i36, true);
                }
                a81Var2.c = a81Var2.b.d[4];
                float f10 = a81Var2.h;
                if (f10 != 0.0f) {
                    a81Var2.e(messageObject3, f10, a81Var2.r);
                    a81Var2.h = 0.0f;
                }
                AndroidUtilities.runOnUIThread(new v71(a81Var2, i14));
                break;
            case 17:
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
            case 18:
                AnimatedFileNative.d(((File) obj5).getAbsolutePath(), (int[]) obj4, 0L);
                AndroidUtilities.runOnUIThread((org.telegram.ui.ye) obj3);
                break;
            case 19:
                ((q0.a) obj4).accept(Boolean.valueOf(((org.telegram.ui.web.b1) obj5).d((String[]) obj3)));
                break;
            case 20:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj5;
                String str8 = (String) obj4;
                String str9 = (String) obj3;
                botWebViewContainer$BotWebViewProxy.getClass();
                try {
                    org.telegram.ui.web.b1 b1Var = botWebViewContainer$BotWebViewProxy.a;
                    if (b1Var == null) {
                        break;
                    } else {
                        boolean z14 = org.telegram.ui.web.b1.P0;
                        b1Var.F(botWebViewContainer$BotWebViewProxy, b1Var.g(), str8, str9);
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 21:
                String str10 = (String) obj4;
                String str11 = (String) obj3;
                org.telegram.ui.web.b1 b1Var2 = ((BotWebViewContainer$WebViewProxy) obj5).a;
                if (b1Var2 != null && !b1Var2.o0 && b1Var2.c != null) {
                    if (b1Var2.F0 != null && !TextUtils.equals(b1Var2.getOriginHost(), b1Var2.F0)) {
                        b1Var2.h("onWebEventReceived ignore " + str10);
                        break;
                    } else {
                        b1Var2.h("onWebEventReceived " + str10 + " " + str11);
                        str10.getClass();
                        switch (str10) {
                            case "actionBarColor":
                            case "navigationBarColor":
                                try {
                                    JSONArray jSONArray = new JSONArray(str11);
                                    boolean equals2 = TextUtils.equals(str10, "actionBarColor");
                                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                    org.telegram.ui.web.y0 y0Var = b1Var2.a;
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
                                    b1Var2.c.o(argb, equals2);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            case "oauth_request":
                                b1Var2.h("oauth_request " + str11);
                                if (b1Var2.a != null) {
                                    String originHost = b1Var2.getOriginHost();
                                    if (!TextUtils.isEmpty(originHost)) {
                                        try {
                                            String optString = new JSONObject(str11).optString("url");
                                            b1Var2.z("oauth_supported", org.telegram.ui.web.b1.B(1, "version"));
                                            if (!TextUtils.isEmpty(optString)) {
                                                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                                tL_messages_requestUrlAuth.url = optString;
                                                int i37 = tL_messages_requestUrlAuth.flags;
                                                tL_messages_requestUrlAuth.in_app_origin = originHost;
                                                tL_messages_requestUrlAuth.flags = i37 | 12;
                                                ConnectionsManager.getInstance(b1Var2.M).sendRequest(tL_messages_requestUrlAuth, new ai.p3(b1Var2, tL_messages_requestUrlAuth, optString, originHost, 14), 2);
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
                                b1Var2.h("siteName " + str11);
                                org.telegram.ui.web.y0 y0Var2 = b1Var2.a;
                                if (y0Var2 != null) {
                                    y0Var2.r = str11;
                                    org.telegram.ui.web.y0.a(y0Var2);
                                    break;
                                }
                                break;
                            case "allowScroll":
                                try {
                                    JSONArray jSONArray2 = new JSONArray(str11);
                                    z11 = jSONArray2.optBoolean(0, true);
                                    try {
                                        z12 = jSONArray2.optBoolean(1, true);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    z11 = true;
                                }
                                if (b1Var2.getParent() instanceof ei.p4) {
                                    ei.p4 p4Var = (ei.p4) b1Var2.getParent();
                                    p4Var.O = z11;
                                    p4Var.P = z12;
                                    break;
                                }
                                break;
                        }
                    }
                }
                break;
            case 22:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) obj5;
                ArrayList arrayList17 = (ArrayList) obj4;
                String str12 = (String) obj3;
                ArrayList arrayList18 = new ArrayList();
                while (i15 < arrayList17.size()) {
                    org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) arrayList17.get(i15);
                    if (org.telegram.ui.web.f1.t(c1Var.c, str12) || ((m2Var2 = c1Var.d) != null && (org.telegram.ui.web.f1.t(m2Var2.c, str12) || org.telegram.ui.web.f1.t(c1Var.d.d, str12)))) {
                        arrayList18.add(c1Var);
                    }
                    i15++;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p81(29, f1Var, arrayList18));
                break;
            case 23:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj5;
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                i2Var.getClass();
                if (org.telegram.ui.web.i2.f != null) {
                    ?? r72 = ((h2Var.d > 0 && h2Var.e > 0) || bitmap == null) ? 0 : 1;
                    if (bitmap != null) {
                        i2Var.d.put(h2Var.b, bitmap);
                        if (r72 != 0) {
                            int i38 = h2Var.d;
                            if (i38 == 0 && h2Var.e == 0) {
                                h2Var.d = bitmap.getWidth();
                                h2Var.e = bitmap.getHeight();
                            } else if (i38 == 0) {
                                h2Var.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * h2Var.e);
                            } else if (h2Var.e == 0) {
                                h2Var.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * h2Var.d);
                            }
                        }
                    }
                    ArrayList arrayList19 = (ArrayList) org.telegram.ui.web.i2.f.remove(h2Var.b);
                    if (arrayList19 != null) {
                        int size4 = arrayList19.size();
                        while (i15 < size4) {
                            Object obj8 = arrayList19.get(i15);
                            i15++;
                            Pair pair = (Pair) obj8;
                            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
                            if (r72 != 0 && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        break;
                    }
                }
                break;
            case 24:
                ((EglRenderer) obj5).lambda$init$0((EglBase.Context) obj4, (int[]) obj3);
                break;
            case 25:
                ((EglRenderer) obj5).lambda$removeFrameListener$4((CountDownLatch) obj4, (EglRenderer.FrameListener) obj3);
                break;
            case 26:
                ((VideoFileRenderer) obj5).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) obj4, (VideoFrame) obj3);
                break;
            case 27:
                ((tg.x0) obj5).run(new Pair((HashMap) obj3, (ArrayList) obj4));
                break;
            case 28:
                a();
                break;
            default:
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
        }
    }

    public /* synthetic */ cn0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
