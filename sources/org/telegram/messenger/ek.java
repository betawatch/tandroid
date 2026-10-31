package org.telegram.messenger;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lw0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ek implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ek(File file, File file2, boolean[] zArr, q20 q20Var, org.telegram.ui.ActionBar.x1 x1Var, boolean[] zArr2) {
        this.a = 4;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = q20Var;
        this.e = x1Var;
        this.h = zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0516 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v84 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.r6 r6Var;
        HashMap<String, String> hashMap;
        boolean z10;
        boolean z11;
        ?? r22;
        boolean z12;
        String p02;
        ContentValues contentValues;
        Uri contentUri;
        boolean z13;
        boolean z14;
        long j10;
        long j11 = 0;
        Uri uri = null;
        r6 = null;
        TLRPC.PhotoSize photoSize = null;
        uri = null;
        uri = null;
        uri = null;
        uri = null;
        boolean z15 = false;
        int i10 = 0;
        switch (this.a) {
            case 0:
                vp vpVar = (vp) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) this.d;
                org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (vpVar.Q2 == null || vpVar.R2.s == null || wallPaper == null) {
                    return;
                }
                wallPaper.settings = tL_wallPaperSettings;
                wallPaper.flags = 4 | wallPaper.flags;
                m6Var.c = wallPaper.slug;
                org.telegram.ui.ActionBar.s6 s6Var = m6Var.p;
                if (s6Var != null && (((r6Var = m6Var.q) != null || s6Var.i0 == m6Var) && (r6Var == null || r6Var.y == m6Var))) {
                    m6Var.c();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(wallPaper);
                vpVar.getMessagesStorage().p1(2, arrayList);
                TLRPC.PhotoSize w9 = b8.w(wallPaper.document.thumbs, zs.r5, false, null, false);
                if (w9 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w9.location.volume_id);
                    sb2.append("_");
                    hc.D().S(Utilities.a(file.getAbsolutePath()) + "@100_100", a1.g.p(sb2, w9.location.local_id, "@100_100"), ic.c(w9, wallPaper.document));
                }
                zs.e().k(256, wallPaper.slug);
                ArrayList arrayList2 = vpVar.R2.s;
                if (arrayList2 == null || m6Var.n == 0) {
                    return;
                }
                arrayList2.add(Integer.valueOf(g4.f(vpVar.currentAccount).u(m6Var.n, str, m6Var, null, null)));
                return;
            case 1:
                long j12 = 0;
                qz qzVar = (qz) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ArrayList arrayList7 = (ArrayList) this.h;
                boolean z16 = true;
                qzVar.getMessagesController().V3(arrayList3, true);
                qzVar.getMessagesController().P3(arrayList4, true);
                qzVar.getMessagesController().S3(arrayList5);
                int size = arrayList6.size();
                int i11 = 0;
                while (i11 < size) {
                    jj jjVar = new jj(qzVar.currentAccount, (TLRPC.Message) arrayList6.get(i11), false, z16);
                    long d12 = jjVar.d1();
                    if (d12 != j12 && (hashMap = jjVar.k.params) != null && !hashMap.containsKey("final") && (i11 == size - 1 || ((TLRPC.Message) arrayList6.get(i11 + 1)).grouped_id != d12)) {
                        jjVar.k.params.put("final", "1");
                    }
                    qzVar.k0(j12, jjVar, true);
                    i11++;
                    z16 = true;
                    j12 = 0;
                }
                if (arrayList7 != null) {
                    for (int i12 = 0; i12 < arrayList7.size(); i12++) {
                        jj jjVar2 = new jj(qzVar.currentAccount, (TLRPC.Message) arrayList7.get(i12), false, true);
                        jjVar2.p1 = true;
                        qzVar.k0(0L, jjVar2, true);
                    }
                    return;
                }
                return;
            case 2:
                ((u1) this.b).m((Activity) this.c, (c) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f, (ba.a) this.h, true);
                return;
            case 3:
                zf.h0 h0Var = (zf.h0) this.b;
                String str2 = (String) this.h;
                String str3 = (String) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = (TLRPC.TL_messageMediaVenue) this.e;
                Location location = (Location) this.f;
                nd.Q.remove(h0Var);
                h0Var.L(str2, str3, tL_messageMediaVenue, tL_messageMediaVenue2, location);
                return;
            case 4:
                File file2 = (File) this.f;
                File file3 = (File) this.b;
                boolean[] zArr = (boolean[]) this.c;
                q20 q20Var = (q20) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.e;
                boolean[] zArr2 = (boolean[]) this.h;
                String[] strArr = MediaController.U1;
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            p02 = i0.p0(0, "jpg");
                            contentValues = new ContentValues();
                            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                            z13 = true;
                        } catch (Exception e) {
                            e = e;
                            z12 = true;
                        }
                        try {
                            boolean z17 = false;
                            try {
                                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                                contentValues.put("_display_name", p02);
                                contentValues.put("mime_type", "image/jpeg");
                                contentValues.put("mime_type", "image/jpeg");
                                Uri insert = w0.b.getContentResolver().insert(contentUri, contentValues);
                                if (insert != null) {
                                    OutputStream openOutputStream = w0.b.getContentResolver().openOutputStream(insert);
                                    if (openOutputStream != null) {
                                        try {
                                            MediaController.H0(file2, file3, openOutputStream, zArr);
                                            z17 = !zArr[0];
                                        } finally {
                                        }
                                    }
                                    if (openOutputStream != null) {
                                        openOutputStream.close();
                                    }
                                    if (z17) {
                                        uri = insert;
                                    } else {
                                        try {
                                            w0.b.getContentResolver().delete(insert, null, null);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                                z15 = z17;
                                z14 = z13;
                            } catch (Exception e7) {
                                e = e7;
                                z11 = true;
                                z15 = false;
                                f8.g(e, z11);
                                r22 = z11;
                                if (z15) {
                                }
                                if (x1Var == null) {
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                            z12 = z13;
                            z11 = z12;
                            f8.g(e, z11);
                            r22 = z11;
                            if (z15) {
                            }
                            if (x1Var == null) {
                            }
                        }
                    } else {
                        z10 = true;
                        try {
                            File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                            file4.mkdirs();
                            File file5 = new File(file4, i0.p0(0, "jpg"));
                            if (!file5.exists()) {
                                file5.createNewFile();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file5);
                            try {
                                MediaController.H0(file2, file3, fileOutputStream, zArr);
                                fileOutputStream.close();
                                if (zArr[0]) {
                                    file5.delete();
                                    z15 = false;
                                    z14 = z10;
                                } else {
                                    i0.d(file5.getAbsoluteFile());
                                    uri = Uri.fromFile(file5);
                                    z15 = true;
                                    z14 = z10;
                                }
                            } finally {
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z11 = z10;
                            z15 = false;
                            f8.g(e, z11);
                            r22 = z11;
                            if (z15) {
                                i0.g3(new ge(q20Var, uri, r22));
                            }
                            if (x1Var == null) {
                            }
                        }
                    }
                    r22 = z14;
                } catch (Exception e12) {
                    e = e12;
                    z10 = true;
                }
                if (z15 && q20Var != null) {
                    i0.g3(new ge(q20Var, uri, r22));
                }
                if (x1Var == null) {
                    i0.g3(new be(x1Var, zArr2, 3));
                    return;
                }
                return;
            case 5:
                vp vpVar2 = (vp) this.b;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.c;
                gf.e eVar = (gf.e) this.d;
                TLObject tLObject = (TLObject) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f;
                Bundle bundle = (Bundle) this.h;
                if (x1Var2 != null) {
                    try {
                        x1Var2.dismiss();
                    } catch (Exception e13) {
                        f8.g(e13, true);
                    }
                }
                if (eVar != null) {
                    eVar.b();
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                vpVar2.V3(messages_messages.users, false);
                vpVar2.P3(messages_messages.chats, false);
                vpVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                k2Var.presentFragment(new org.telegram.ui.un(bundle), true);
                return;
            case 6:
                gw gwVar = (gw) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                a0.h hVar = (a0.h) this.h;
                ArrayList arrayList12 = gwVar.c;
                ArrayList arrayList13 = gwVar.i;
                int i13 = gwVar.a;
                vp.r1(i13).V3(arrayList8, true);
                vp.r1(i13).P3(arrayList9, true);
                org.telegram.ui.Components.f5.g(i13).d(arrayList10);
                for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                    gwVar.j(((Long) arrayList11.get(i14)).longValue());
                }
                for (int i15 = 0; i15 < hVar.m(); i15++) {
                    long j13 = hVar.j(i15);
                    jj jjVar3 = new jj(gwVar.a, (TLRPC.Message) hVar.n(i15), null, null, null, null, null, false, false, 0L, false, false, true, 0);
                    for (int i16 = 0; i16 < arrayList13.size(); i16++) {
                        fw fwVar = (fw) arrayList13.get(i16);
                        if (fwVar.a == j13) {
                            fwVar.c = jjVar3.f1();
                            fwVar.d = jjVar3;
                        }
                    }
                    for (int i17 = 0; i17 < arrayList12.size(); i17++) {
                        fw fwVar2 = (fw) arrayList12.get(i17);
                        if (fwVar2.a == j13) {
                            fwVar2.c = jjVar3.f1();
                            fwVar2.d = jjVar3;
                        }
                    }
                }
                gwVar.l();
                return;
            case 7:
                gw gwVar2 = (gw) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                ArrayList arrayList17 = (ArrayList) this.f;
                ew ewVar = (ew) this.h;
                gwVar2.k = false;
                gwVar2.l = true;
                int i18 = gwVar2.a;
                vp.r1(i18).V3(arrayList14, true);
                vp.r1(i18).P3(arrayList15, true);
                org.telegram.ui.Components.f5.g(i18).d(arrayList16);
                ArrayList arrayList18 = gwVar2.c;
                arrayList18.clear();
                arrayList18.addAll(arrayList17);
                gwVar2.m();
                if (gwVar2.m) {
                    return;
                }
                ewVar.run();
                return;
            case 8:
                ow owVar = (ow) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.x1 x1Var3 = (org.telegram.ui.ActionBar.x1) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                byte[] bArr = (byte[]) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                owVar.n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        x1Var3.dismiss();
                    } catch (Exception e14) {
                        f8.g(e14, true);
                    }
                }
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject2;
                encryptedChat.user_id = encryptedChat.participant_id;
                encryptedChat.seq_in = -2;
                encryptedChat.seq_out = 1;
                encryptedChat.a_or_b = bArr;
                owVar.getMessagesController().R3(encryptedChat, false);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = o5.F(encryptedChat.id);
                tL_dialog.unread_count = 0;
                tL_dialog.top_message = 0;
                tL_dialog.last_message_date = owVar.getConnectionsManager().getCurrentTime();
                owVar.getMessagesController().Q.k(tL_dialog, tL_dialog.id);
                owVar.getMessagesController().y.add(tL_dialog);
                owVar.getMessagesController().Q4(null);
                hs messagesStorage = owVar.getMessagesStorage();
                messagesStorage.a.c(new ul(messagesStorage, encryptedChat, user, tL_dialog, 20));
                owVar.getNotificationCenter().k(3, new Object[0]);
                owVar.getNotificationCenter().k(37, encryptedChat);
                Utilities.d.c(new ms(owVar, 10));
                return;
            case 9:
                qz qzVar2 = (qz) this.b;
                String str4 = (String) this.h;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                lw0 lw0Var = (lw0) this.f;
                lz lzVar = new lz(qzVar2);
                lzVar.f = str4;
                lzVar.e = str5;
                lzVar.g = str6;
                HashMap hashMap2 = new HashMap();
                int size2 = arrayList19.size();
                while (i10 < size2) {
                    jz jzVar = (jz) arrayList19.get(i10);
                    File file6 = new File(jzVar.a);
                    if (file6.exists()) {
                        long length = file6.length();
                        if (length != j11) {
                            j10 = j11;
                            lzVar.h += length;
                            lzVar.d.add(jzVar);
                            lzVar.a.put(jzVar.a, jzVar);
                            hashMap2.put(jzVar.a, lzVar);
                            i10++;
                            j11 = j10;
                        }
                    }
                    j10 = j11;
                    if (i10 == 0) {
                        i0.g3(new ms(lw0Var, 11));
                        return;
                    } else {
                        i10++;
                        j11 = j10;
                    }
                }
                i0.g3(new cn(qzVar2, lzVar, hashMap2, str5, lw0Var, 15));
                return;
            case 10:
                qz qzVar3 = (qz) this.b;
                TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
                jj jjVar4 = (jj) this.d;
                File file7 = (File) this.f;
                cz czVar = (cz) this.e;
                String str7 = (String) this.h;
                if (tL_photo == null) {
                    if (v2.a) {
                        StringBuilder u10 = a1.g.u("can't load image ", str7, " to file ");
                        u10.append(file7.toString());
                        f8.d(u10.toString());
                    }
                    czVar.c();
                    return;
                }
                TLRPC.Message message = jjVar4.k;
                message.media.photo = tL_photo;
                message.attachPath = file7.toString();
                ArrayList arrayList20 = new ArrayList();
                arrayList20.add(jjVar4.k);
                qzVar3.getMessagesStorage().j1(arrayList20, false, true, false, 0, false, jjVar4.p1 ? 1 : 0, 0L);
                qzVar3.getNotificationCenter().k(48, jjVar4.k);
                czVar.g = (TLRPC.PhotoSize) i0.a.g(1, tL_photo.sizes);
                czVar.h = tL_photo;
                czVar.l = null;
                if (czVar.e != 4) {
                    qzVar3.M(czVar, -1);
                    return;
                } else {
                    czVar.p = true;
                    qzVar3.M(czVar, czVar.x.indexOf(jjVar4));
                    return;
                }
            default:
                qz qzVar4 = (qz) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                cz czVar2 = (cz) this.e;
                String str8 = (String) this.h;
                jj jjVar5 = (jj) this.f;
                if (!(tLObject3 instanceof TLRPC.TL_messageMediaPhoto)) {
                    czVar2.c();
                    return;
                }
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject3).photo;
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                if (inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) {
                    inputMedia.flags |= 64;
                    inputMedia.video_cover = tL_inputPhoto;
                } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                    inputMedia.flags |= 8;
                    inputMedia.video_cover = tL_inputPhoto;
                }
                czVar2.j = null;
                czVar2.i = null;
                HashMap hashMap3 = czVar2.E;
                if (hashMap3 != null) {
                    hashMap3.remove(str8 + "_ct");
                }
                int indexOf = czVar2.x.indexOf(jjVar5);
                ArrayList arrayList21 = czVar2.A;
                if (arrayList21 != null && indexOf >= 0 && indexOf < arrayList21.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) czVar2.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap4 = czVar2.E;
                if (hashMap4 != null) {
                    if (hashMap4.containsKey(str8 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) czVar2.E.get(str8 + "_t");
                    }
                }
                czVar2.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    qzVar4.t0(czVar2, false);
                    return;
                } else {
                    czVar2.p = true;
                    qzVar4.M(czVar2, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ ek(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ ek(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.h = str;
        this.c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ ek(qz qzVar, TLObject tLObject, TLRPC.InputMedia inputMedia, cz czVar, String str, jj jjVar) {
        this.a = 11;
        this.b = qzVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = czVar;
        this.h = str;
        this.f = jjVar;
    }

    public /* synthetic */ ek(qz qzVar, TLRPC.TL_photo tL_photo, jj jjVar, File file, cz czVar, String str) {
        this.a = 10;
        this.b = qzVar;
        this.c = tL_photo;
        this.d = jjVar;
        this.f = file;
        this.e = czVar;
        this.h = str;
    }
}
