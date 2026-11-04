package org.telegram.messenger;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class tn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = c1Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        zi ziVar;
        TLRPC.Document document;
        TLRPC.Photo photo;
        int i3 = this.a;
        String str = "";
        final int i10 = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        c1 c1Var = this.b;
        switch (i3) {
            case 0:
                final hp hpVar = (hp) c1Var;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) obj4;
                final org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj3;
                TLRPC.TL_inputThemeSettings tL_inputThemeSettings = (TLRPC.TL_inputThemeSettings) obj2;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                String n4 = tL_theme != null ? tL_theme.title : j6Var.n();
                int lastIndexOf = n4.lastIndexOf(".attheme");
                if (lastIndexOf > 0) {
                    n4 = n4.substring(0, lastIndexOf);
                }
                if (tLObject == null) {
                    g0.h3(new dg(hpVar, j6Var, g6Var, 6));
                    break;
                } else {
                    TLRPC.Document document2 = (TLRPC.Document) tLObject;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.access_hash = document2.access_hash;
                    tL_inputDocument.id = document2.id;
                    tL_inputDocument.file_reference = document2.file_reference;
                    if (tL_theme != null && tL_theme.creator) {
                        TL_account.updateTheme updatetheme = new TL_account.updateTheme();
                        TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                        tL_inputTheme.id = tL_theme.id;
                        tL_inputTheme.access_hash = tL_theme.access_hash;
                        updatetheme.theme = tL_inputTheme;
                        updatetheme.slug = tL_theme.slug;
                        int i11 = updatetheme.flags;
                        updatetheme.title = n4;
                        updatetheme.document = tL_inputDocument;
                        updatetheme.flags = i11 | 7;
                        if (tL_inputThemeSettings != null) {
                            updatetheme.settings = tL_inputThemeSettings;
                            updatetheme.flags = i11 | 15;
                        }
                        updatetheme.format = "android";
                        final int i12 = 1;
                        hpVar.getConnectionsManager().sendRequest(updatetheme, new RequestDelegate() { // from class: org.telegram.messenger.xk
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i12) {
                                    case 0:
                                        final int i13 = 1;
                                        final hp hpVar2 = hpVar;
                                        final org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                                        final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.nl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i14 = i13;
                                                org.telegram.ui.ActionBar.g6 g6Var3 = g6Var2;
                                                org.telegram.ui.ActionBar.j6 j6Var3 = j6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                hp hpVar3 = hpVar2;
                                                switch (i14) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            hpVar3.getNotificationCenter().k(hs.N2, j6Var3, g6Var3);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var3, g6Var3, (TLRPC.TL_theme) tLObject3, hpVar3.currentAccount, false);
                                                            hpVar3.getNotificationCenter().k(hs.M2, j6Var3, g6Var3);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            hpVar3.getNotificationCenter().k(hs.N2, j6Var3, g6Var3);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var3, g6Var3, (TLRPC.TL_theme) tLObject3, hpVar3.currentAccount, false);
                                                            hpVar3.k2(j6Var3, g6Var3, j6Var3 == org.telegram.ui.ActionBar.k6.J);
                                                            hpVar3.getNotificationCenter().k(hs.M2, j6Var3, g6Var3);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i14 = 0;
                                        final hp hpVar3 = hpVar;
                                        final org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                                        final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.nl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i142 = i14;
                                                org.telegram.ui.ActionBar.g6 g6Var32 = g6Var3;
                                                org.telegram.ui.ActionBar.j6 j6Var32 = j6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                hp hpVar32 = hpVar3;
                                                switch (i142) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            hpVar32.getNotificationCenter().k(hs.N2, j6Var32, g6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                            hpVar32.getNotificationCenter().k(hs.M2, j6Var32, g6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            hpVar32.getNotificationCenter().k(hs.N2, j6Var32, g6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                            hpVar32.k2(j6Var32, g6Var32, j6Var32 == org.telegram.ui.ActionBar.k6.J);
                                                            hpVar32.getNotificationCenter().k(hs.M2, j6Var32, g6Var32);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TL_account.createTheme createtheme = new TL_account.createTheme();
                        createtheme.document = tL_inputDocument;
                        createtheme.flags = 4 | createtheme.flags;
                        if (tL_theme != null && !TextUtils.isEmpty(tL_theme.slug)) {
                            str = tL_theme.slug;
                        }
                        createtheme.slug = str;
                        createtheme.title = n4;
                        if (tL_inputThemeSettings != null) {
                            createtheme.settings = tL_inputThemeSettings;
                            createtheme.flags |= 8;
                        }
                        hpVar.getConnectionsManager().sendRequest(createtheme, new RequestDelegate() { // from class: org.telegram.messenger.xk
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (i10) {
                                    case 0:
                                        final int i13 = 1;
                                        final hp hpVar2 = hpVar;
                                        final org.telegram.ui.ActionBar.j6 j6Var2 = j6Var;
                                        final org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.nl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i142 = i13;
                                                org.telegram.ui.ActionBar.g6 g6Var32 = g6Var2;
                                                org.telegram.ui.ActionBar.j6 j6Var32 = j6Var2;
                                                TLObject tLObject3 = tLObject2;
                                                hp hpVar32 = hpVar2;
                                                switch (i142) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            hpVar32.getNotificationCenter().k(hs.N2, j6Var32, g6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                            hpVar32.getNotificationCenter().k(hs.M2, j6Var32, g6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            hpVar32.getNotificationCenter().k(hs.N2, j6Var32, g6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                            hpVar32.k2(j6Var32, g6Var32, j6Var32 == org.telegram.ui.ActionBar.k6.J);
                                                            hpVar32.getNotificationCenter().k(hs.M2, j6Var32, g6Var32);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final int i14 = 0;
                                        final hp hpVar3 = hpVar;
                                        final org.telegram.ui.ActionBar.j6 j6Var3 = j6Var;
                                        final org.telegram.ui.ActionBar.g6 g6Var3 = g6Var;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.nl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i142 = i14;
                                                org.telegram.ui.ActionBar.g6 g6Var32 = g6Var3;
                                                org.telegram.ui.ActionBar.j6 j6Var32 = j6Var3;
                                                TLObject tLObject3 = tLObject2;
                                                hp hpVar32 = hpVar3;
                                                switch (i142) {
                                                    case 0:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            hpVar32.getNotificationCenter().k(hs.N2, j6Var32, g6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                            hpVar32.getNotificationCenter().k(hs.M2, j6Var32, g6Var32);
                                                            break;
                                                        }
                                                    default:
                                                        if (!(tLObject3 instanceof TLRPC.TL_theme)) {
                                                            hpVar32.getNotificationCenter().k(hs.N2, j6Var32, g6Var32);
                                                            break;
                                                        } else {
                                                            org.telegram.ui.ActionBar.k6.I1(j6Var32, g6Var32, (TLRPC.TL_theme) tLObject3, hpVar32.currentAccount, false);
                                                            hpVar32.k2(j6Var32, g6Var32, j6Var32 == org.telegram.ui.ActionBar.k6.J);
                                                            hpVar32.getNotificationCenter().k(hs.M2, j6Var32, g6Var32);
                                                            break;
                                                        }
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                break;
            case 1:
                hp hpVar2 = (hp) c1Var;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj4;
                sf.b bVar = (sf.b) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null) {
                    g0.h3(new pj(hpVar2, s1Var, bVar, tLObject, d2Var, bundle, 5));
                    break;
                }
                break;
            case 2:
                vv vvVar = (vv) c1Var;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) obj3;
                byte[] bArr = (byte[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tL_error != null) {
                    vvVar.f.clear();
                    g0.h3(new sv(vvVar, context, s1Var2, 1));
                    break;
                } else {
                    g0.h3(new pj(vvVar, context, s1Var2, tLObject, bArr, user, 8));
                    break;
                }
            case 3:
                vv vvVar2 = (vv) c1Var;
                TLRPC.DecryptedMessage decryptedMessage = (TLRPC.DecryptedMessage) obj4;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) obj3;
                TLRPC.Message message = (TLRPC.Message) obj2;
                zi ziVar2 = (zi) obj;
                if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                    TLRPC.EncryptedChat a12 = vvVar2.getMessagesController().a1(Integer.valueOf(encryptedChat.id));
                    TLRPC.EncryptedChat encryptedChat2 = a12 == null ? encryptedChat : a12;
                    if (encryptedChat2.key_hash == null) {
                        byte[] bArr2 = encryptedChat2.auth_key;
                        Typeface typeface = g0.a;
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                        encryptedChat2.key_hash = bArr3;
                    }
                    if (encryptedChat2.key_hash.length == 16) {
                        try {
                            byte[] o10 = Utilities.o(r0.length, encryptedChat.auth_key);
                            byte[] bArr4 = new byte[36];
                            System.arraycopy(encryptedChat.key_hash, 0, bArr4, 0, 16);
                            System.arraycopy(o10, 0, bArr4, 16, 20);
                            encryptedChat2.key_hash = bArr4;
                            vvVar2.getMessagesStorage().V1(encryptedChat2);
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    vvVar2.a.remove(Integer.valueOf(encryptedChat2.id));
                    int i13 = encryptedChat2.layer;
                    Typeface typeface2 = g0.a;
                    encryptedChat2.layer = (i13 & (-65536)) | hs.h2;
                    qr messagesStorage = vvVar2.getMessagesStorage();
                    messagesStorage.a.c(new vp(messagesStorage, encryptedChat2, 2));
                }
                if (tL_error != null) {
                    vvVar2.getMessagesStorage().N0(0, message);
                    g0.h3(new pq(17, vvVar2, message));
                    break;
                } else {
                    String str2 = message.attachPath;
                    TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                            message.date = messages_sentencryptedmessage.date;
                        }
                    }
                    if (ziVar2 != null) {
                        TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                        if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                            TLRPC.Message message2 = ziVar2.k;
                            TLRPC.MessageMedia messageMedia = message2.media;
                            if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || (photo = messageMedia.photo) == null) {
                                ziVar = ziVar2;
                                if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = messageMedia.document) != null) {
                                    messageMedia.document = new TLRPC.TL_documentEncrypted();
                                    TLRPC.Document document3 = message2.media.document;
                                    document3.id = encryptedFile.id;
                                    document3.access_hash = encryptedFile.access_hash;
                                    document3.date = document.date;
                                    document3.attributes = document.attributes;
                                    document3.mime_type = document.mime_type;
                                    document3.size = encryptedFile.size;
                                    TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                                    document3.key = decryptedMessageMedia.key;
                                    document3.iv = decryptedMessageMedia.iv;
                                    ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                                    document3.thumbs = arrayList;
                                    document3.dc_id = encryptedFile.dc_id;
                                    if (arrayList.isEmpty()) {
                                        TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                                        tL_photoSizeEmpty.type = "s";
                                        message2.media.document.thumbs.add(tL_photoSizeEmpty);
                                    }
                                    String str3 = message2.attachPath;
                                    if (str3 != null && str3.startsWith(w7.z(4).getAbsolutePath())) {
                                        File file = new File(message2.attachPath);
                                        w7 fileLoader = vvVar2.getFileLoader();
                                        TLRPC.Document document4 = message2.media.document;
                                        fileLoader.getClass();
                                        if (file.renameTo(w7.I(document4))) {
                                            ziVar.x0 = ziVar.w0;
                                            ziVar.w0 = false;
                                            message2.attachPath = "";
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(message2);
                                    vvVar2.getMessagesStorage().j1(arrayList2, false, true, false, 0, false, 0, 0L);
                                }
                            } else {
                                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) k2.p1.h(1, photo.sizes);
                                String str4 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                                photoSize.location = tL_fileEncryptedLocation;
                                TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = decryptedMessage.media;
                                tL_fileEncryptedLocation.key = decryptedMessageMedia2.key;
                                tL_fileEncryptedLocation.iv = decryptedMessageMedia2.iv;
                                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                                ziVar = ziVar2;
                                tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                                String str5 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                                File file2 = new File(w7.z(4), t4.c.q(str4, ".jpg"));
                                vvVar2.getFileLoader().getClass();
                                file2.renameTo(w7.I(photoSize));
                                zb.D().R(str4, str5, ac.i(photoSize, message2.media.photo), true);
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add(message2);
                                vvVar2.getMessagesStorage().j1(arrayList3, false, true, false, 0, false, 0, 0L);
                            }
                            i10 = ziVar.p1();
                        }
                    }
                    vvVar2.getMessagesStorage().a.c(new vf(vvVar2, message, messages_sentencryptedmessage, i10, 17));
                    break;
                }
                break;
            default:
                g0.h3(new pj((yy) c1Var, tLObject, (TLRPC.InputMedia) obj4, (ky) obj3, (String) obj2, (zi) obj));
                break;
        }
    }

    public /* synthetic */ tn(vv vvVar, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, zi ziVar, String str) {
        this.a = 3;
        this.b = vvVar;
        this.c = decryptedMessage;
        this.d = encryptedChat;
        this.e = message;
        this.f = ziVar;
    }
}
