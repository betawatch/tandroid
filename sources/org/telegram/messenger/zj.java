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
import org.telegram.ui.Components.hv0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ zj(File file, File file2, boolean[] zArr, c20 c20Var, org.telegram.ui.ActionBar.u1 u1Var, boolean[] zArr2) {
        this.a = 4;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = c20Var;
        this.e = u1Var;
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
        org.telegram.ui.ActionBar.h6 h6Var;
        HashMap<String, String> hashMap;
        boolean z9;
        boolean z10;
        ?? r22;
        boolean z11;
        String p02;
        ContentValues contentValues;
        Uri contentUri;
        boolean z12;
        boolean z13;
        long j3;
        long j10 = 0;
        Uri uri = null;
        r6 = null;
        TLRPC.PhotoSize photoSize = null;
        uri = null;
        uri = null;
        uri = null;
        uri = null;
        boolean z14 = false;
        int i7 = 0;
        switch (this.a) {
            case 0:
                qp qpVar = (qp) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (qpVar.Q2 == null || qpVar.R2.s == null || wallPaper == null) {
                    return;
                }
                wallPaper.settings = tL_wallPaperSettings;
                wallPaper.flags = 4 | wallPaper.flags;
                c6Var.c = wallPaper.slug;
                org.telegram.ui.ActionBar.j6 j6Var = c6Var.p;
                if (j6Var != null && (((h6Var = c6Var.q) != null || j6Var.i0 == c6Var) && (h6Var == null || h6Var.y == c6Var))) {
                    c6Var.c();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(wallPaper);
                qpVar.getMessagesStorage().p1(2, arrayList);
                TLRPC.PhotoSize w10 = w7.w(wallPaper.document.thumbs, qs.r5, false, null, false);
                if (w10 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w10.location.volume_id);
                    sb2.append("_");
                    gc.D().S(Utilities.a(file.getAbsolutePath()) + "@100_100", a8.p0.n(w10.location.local_id, "@100_100", sb2), hc.c(w10, wallPaper.document));
                }
                qs.e().k(256, wallPaper.slug);
                ArrayList arrayList2 = qpVar.R2.s;
                if (arrayList2 == null || c6Var.n == 0) {
                    return;
                }
                arrayList2.add(Integer.valueOf(d4.f(qpVar.currentAccount).u(c6Var.n, str, c6Var, null, null)));
                return;
            case 1:
                long j11 = 0;
                gz gzVar = (gz) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ArrayList arrayList7 = (ArrayList) this.h;
                boolean z15 = true;
                gzVar.getMessagesController().Y3(arrayList3, true);
                gzVar.getMessagesController().S3(arrayList4, true);
                gzVar.getMessagesController().V3(arrayList5);
                int size = arrayList6.size();
                int i10 = 0;
                while (i10 < size) {
                    ij ijVar = new ij(gzVar.currentAccount, (TLRPC.Message) arrayList6.get(i10), false, z15);
                    long d12 = ijVar.d1();
                    if (d12 != j11 && (hashMap = ijVar.k.params) != null && !hashMap.containsKey("final") && (i10 == size - 1 || ((TLRPC.Message) arrayList6.get(i10 + 1)).grouped_id != d12)) {
                        ijVar.k.params.put("final", "1");
                    }
                    gzVar.k0(j11, ijVar, true);
                    i10++;
                    z15 = true;
                    j11 = 0;
                }
                if (arrayList7 != null) {
                    for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                        ij ijVar2 = new ij(gzVar.currentAccount, (TLRPC.Message) arrayList7.get(i11), false, true);
                        ijVar2.p1 = true;
                        gzVar.k0(0L, ijVar2, true);
                    }
                    return;
                }
                return;
            case 2:
                ((r1) this.b).m((Activity) this.c, (c) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f, (com.google.android.gms.internal.clearcut.z0) this.h, true);
                return;
            case 3:
                jg.r0 r0Var = (jg.r0) this.b;
                String str2 = (String) this.h;
                String str3 = (String) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = (TLRPC.TL_messageMediaVenue) this.e;
                Location location = (Location) this.f;
                sd.Q.remove(r0Var);
                r0Var.K(str2, str3, tL_messageMediaVenue, tL_messageMediaVenue2, location);
                return;
            case 4:
                File file2 = (File) this.f;
                File file3 = (File) this.b;
                boolean[] zArr = (boolean[]) this.c;
                c20 c20Var = (c20) this.d;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.e;
                boolean[] zArr2 = (boolean[]) this.h;
                String[] strArr = MediaController.V1;
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            p02 = g0.p0(0, "jpg");
                            contentValues = new ContentValues();
                            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                            z12 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z11 = true;
                        }
                        try {
                            boolean z16 = false;
                            try {
                                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                                contentValues.put("_display_name", p02);
                                contentValues.put("mime_type", "image/jpeg");
                                contentValues.put("mime_type", "image/jpeg");
                                Uri insert = t0.b.getContentResolver().insert(contentUri, contentValues);
                                if (insert != null) {
                                    OutputStream openOutputStream = t0.b.getContentResolver().openOutputStream(insert);
                                    if (openOutputStream != null) {
                                        try {
                                            MediaController.H0(file2, file3, openOutputStream, zArr);
                                            z16 = !zArr[0];
                                        } finally {
                                        }
                                    }
                                    if (openOutputStream != null) {
                                        openOutputStream.close();
                                    }
                                    if (z16) {
                                        uri = insert;
                                    } else {
                                        try {
                                            t0.b.getContentResolver().delete(insert, null, null);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                                z14 = z16;
                                z13 = z12;
                            } catch (Exception e11) {
                                e = e11;
                                z10 = true;
                                z14 = false;
                                a8.g(e, z10);
                                r22 = z10;
                                if (z14) {
                                }
                                if (u1Var == null) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            z11 = z12;
                            z10 = z11;
                            a8.g(e, z10);
                            r22 = z10;
                            if (z14) {
                            }
                            if (u1Var == null) {
                            }
                        }
                    } else {
                        z9 = true;
                        try {
                            File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                            file4.mkdirs();
                            File file5 = new File(file4, g0.p0(0, "jpg"));
                            if (!file5.exists()) {
                                file5.createNewFile();
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(file5);
                            try {
                                MediaController.H0(file2, file3, fileOutputStream, zArr);
                                fileOutputStream.close();
                                if (zArr[0]) {
                                    file5.delete();
                                    z14 = false;
                                    z13 = z9;
                                } else {
                                    g0.d(file5.getAbsoluteFile());
                                    uri = Uri.fromFile(file5);
                                    z14 = true;
                                    z13 = z9;
                                }
                            } finally {
                            }
                        } catch (Exception e13) {
                            e = e13;
                            z10 = z9;
                            z14 = false;
                            a8.g(e, z10);
                            r22 = z10;
                            if (z14) {
                                g0.h3(new ge(c20Var, uri, r22));
                            }
                            if (u1Var == null) {
                            }
                        }
                    }
                    r22 = z13;
                } catch (Exception e14) {
                    e = e14;
                    z9 = true;
                }
                if (z14 && c20Var != null) {
                    g0.h3(new ge(c20Var, uri, r22));
                }
                if (u1Var == null) {
                    g0.h3(new de(u1Var, zArr2, 3));
                    return;
                }
                return;
            case 5:
                qp qpVar2 = (qp) this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.c;
                vf.b bVar = (vf.b) this.d;
                TLObject tLObject = (TLObject) this.e;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f;
                Bundle bundle = (Bundle) this.h;
                if (u1Var2 != null) {
                    try {
                        u1Var2.dismiss();
                    } catch (Exception e15) {
                        a8.g(e15, true);
                    }
                }
                if (bVar != null) {
                    bVar.b();
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                qpVar2.Y3(messages_messages.users, false);
                qpVar2.S3(messages_messages.chats, false);
                qpVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                f2Var.presentFragment(new org.telegram.ui.an(bundle), true);
                return;
            case 6:
                vv vvVar = (vv) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                a0.h hVar = (a0.h) this.h;
                ArrayList arrayList12 = vvVar.c;
                ArrayList arrayList13 = vvVar.i;
                int i12 = vvVar.a;
                qp.s1(i12).Y3(arrayList8, true);
                qp.s1(i12).S3(arrayList9, true);
                org.telegram.ui.Components.i5.g(i12).d(arrayList10);
                for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                    vvVar.j(((Long) arrayList11.get(i13)).longValue());
                }
                for (int i14 = 0; i14 < hVar.m(); i14++) {
                    long j12 = hVar.j(i14);
                    ij ijVar3 = new ij(vvVar.a, (TLRPC.Message) hVar.n(i14), null, null, null, null, null, false, false, 0L, false, false, true, 0);
                    for (int i15 = 0; i15 < arrayList13.size(); i15++) {
                        uv uvVar = (uv) arrayList13.get(i15);
                        if (uvVar.a == j12) {
                            uvVar.c = ijVar3.f1();
                            uvVar.d = ijVar3;
                        }
                    }
                    for (int i16 = 0; i16 < arrayList12.size(); i16++) {
                        uv uvVar2 = (uv) arrayList12.get(i16);
                        if (uvVar2.a == j12) {
                            uvVar2.c = ijVar3.f1();
                            uvVar2.d = ijVar3;
                        }
                    }
                }
                vvVar.l();
                return;
            case 7:
                vv vvVar2 = (vv) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                ArrayList arrayList17 = (ArrayList) this.f;
                tv tvVar = (tv) this.h;
                vvVar2.k = false;
                vvVar2.l = true;
                int i17 = vvVar2.a;
                qp.s1(i17).Y3(arrayList14, true);
                qp.s1(i17).S3(arrayList15, true);
                org.telegram.ui.Components.i5.g(i17).d(arrayList16);
                ArrayList arrayList18 = vvVar2.c;
                arrayList18.clear();
                arrayList18.addAll(arrayList17);
                vvVar2.m();
                if (vvVar2.m) {
                    return;
                }
                tvVar.run();
                return;
            case 8:
                dw dwVar = (dw) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                byte[] bArr = (byte[]) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                dwVar.n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        u1Var3.dismiss();
                    } catch (Exception e16) {
                        a8.g(e16, true);
                    }
                }
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject2;
                encryptedChat.user_id = encryptedChat.participant_id;
                encryptedChat.seq_in = -2;
                encryptedChat.seq_out = 1;
                encryptedChat.a_or_b = bArr;
                dwVar.getMessagesController().U3(encryptedChat, false);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = m5.F(encryptedChat.id);
                tL_dialog.unread_count = 0;
                tL_dialog.top_message = 0;
                tL_dialog.last_message_date = dwVar.getConnectionsManager().getCurrentTime();
                dwVar.getMessagesController().Q.k(tL_dialog, tL_dialog.id);
                dwVar.getMessagesController().y.add(tL_dialog);
                dwVar.getMessagesController().T4(null);
                yr messagesStorage = dwVar.getMessagesStorage();
                messagesStorage.a.c(new em(messagesStorage, encryptedChat, user, tL_dialog, 20));
                dwVar.getNotificationCenter().k(3, new Object[0]);
                dwVar.getNotificationCenter().k(37, encryptedChat);
                Utilities.d.c(new ds(dwVar, 9));
                return;
            case 9:
                gz gzVar2 = (gz) this.b;
                String str4 = (String) this.h;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                hv0 hv0Var = (hv0) this.f;
                bz bzVar = new bz(gzVar2);
                bzVar.f = str4;
                bzVar.e = str5;
                bzVar.g = str6;
                HashMap hashMap2 = new HashMap();
                int size2 = arrayList19.size();
                while (i7 < size2) {
                    zy zyVar = (zy) arrayList19.get(i7);
                    File file6 = new File(zyVar.a);
                    if (file6.exists()) {
                        long length = file6.length();
                        if (length != j10) {
                            j3 = j10;
                            bzVar.h += length;
                            bzVar.d.add(zyVar);
                            bzVar.a.put(zyVar.a, zyVar);
                            hashMap2.put(zyVar.a, bzVar);
                            i7++;
                            j10 = j3;
                        }
                    }
                    j3 = j10;
                    if (i7 == 0) {
                        g0.h3(new ds(hv0Var, 10));
                        return;
                    } else {
                        i7++;
                        j10 = j3;
                    }
                }
                g0.h3(new mn(gzVar2, bzVar, hashMap2, str5, hv0Var, 15));
                return;
            case 10:
                gz gzVar3 = (gz) this.b;
                TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
                ij ijVar4 = (ij) this.d;
                File file7 = (File) this.f;
                sy syVar = (sy) this.e;
                String str7 = (String) this.h;
                if (tL_photo == null) {
                    if (r2.a) {
                        StringBuilder u10 = a8.p0.u("can't load image ", str7, " to file ");
                        u10.append(file7.toString());
                        a8.d(u10.toString());
                    }
                    syVar.c();
                    return;
                }
                TLRPC.Message message = ijVar4.k;
                message.media.photo = tL_photo;
                message.attachPath = file7.toString();
                ArrayList arrayList20 = new ArrayList();
                arrayList20.add(ijVar4.k);
                gzVar3.getMessagesStorage().j1(arrayList20, false, true, false, 0, false, ijVar4.p1 ? 1 : 0, 0L);
                gzVar3.getNotificationCenter().k(48, ijVar4.k);
                syVar.g = (TLRPC.PhotoSize) jg.g.i(1, tL_photo.sizes);
                syVar.h = tL_photo;
                syVar.l = null;
                if (syVar.e != 4) {
                    gzVar3.M(syVar, -1);
                    return;
                } else {
                    syVar.p = true;
                    gzVar3.M(syVar, syVar.x.indexOf(ijVar4));
                    return;
                }
            default:
                gz gzVar4 = (gz) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                sy syVar2 = (sy) this.e;
                String str8 = (String) this.h;
                ij ijVar5 = (ij) this.f;
                if (!(tLObject3 instanceof TLRPC.TL_messageMediaPhoto)) {
                    syVar2.c();
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
                syVar2.j = null;
                syVar2.i = null;
                HashMap hashMap3 = syVar2.E;
                if (hashMap3 != null) {
                    hashMap3.remove(str8 + "_ct");
                }
                int indexOf = syVar2.x.indexOf(ijVar5);
                ArrayList arrayList21 = syVar2.A;
                if (arrayList21 != null && indexOf >= 0 && indexOf < arrayList21.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) syVar2.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap4 = syVar2.E;
                if (hashMap4 != null) {
                    if (hashMap4.containsKey(str8 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) syVar2.E.get(str8 + "_t");
                    }
                }
                syVar2.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    gzVar4.t0(syVar2, false);
                    return;
                } else {
                    syVar2.p = true;
                    gzVar4.M(syVar2, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ zj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ zj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.h = str;
        this.c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ zj(gz gzVar, TLObject tLObject, TLRPC.InputMedia inputMedia, sy syVar, String str, ij ijVar) {
        this.a = 11;
        this.b = gzVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = syVar;
        this.h = str;
        this.f = ijVar;
    }

    public /* synthetic */ zj(gz gzVar, TLRPC.TL_photo tL_photo, ij ijVar, File file, sy syVar, String str) {
        this.a = 10;
        this.b = gzVar;
        this.c = tL_photo;
        this.d = ijVar;
        this.f = file;
        this.e = syVar;
        this.h = str;
    }
}
