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
import org.telegram.ui.Components.uv0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ uj(File file, File file2, boolean[] zArr, y10 y10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.a = 4;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = y10Var;
        this.e = t1Var;
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
        org.telegram.ui.ActionBar.j6 j6Var;
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
        long j3;
        long j10 = 0;
        Uri uri = null;
        r6 = null;
        TLRPC.PhotoSize photoSize = null;
        uri = null;
        uri = null;
        uri = null;
        uri = null;
        boolean z15 = false;
        int i7 = 0;
        switch (this.a) {
            case 0:
                np npVar = (np) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (npVar.T2 == null || npVar.U2.s == null || wallPaper == null) {
                    return;
                }
                wallPaper.settings = tL_wallPaperSettings;
                wallPaper.flags = 4 | wallPaper.flags;
                d6Var.c = wallPaper.slug;
                org.telegram.ui.ActionBar.l6 l6Var = d6Var.p;
                if (l6Var != null && (((j6Var = d6Var.q) != null || l6Var.j0 == d6Var) && (j6Var == null || j6Var.y == d6Var))) {
                    d6Var.c();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(wallPaper);
                npVar.getMessagesStorage().p1(2, arrayList);
                TLRPC.PhotoSize w10 = w7.w(wallPaper.document.thumbs, ls.r5, false, null, false);
                if (w10 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w10.location.volume_id);
                    sb2.append("_");
                    fc.D().S(Utilities.a(file.getAbsolutePath()) + "@100_100", a8.p0.n(w10.location.local_id, "@100_100", sb2), gc.c(w10, wallPaper.document));
                }
                ls.e().k(ls.i4, wallPaper.slug);
                ArrayList arrayList2 = npVar.U2.s;
                if (arrayList2 == null || d6Var.n == 0) {
                    return;
                }
                arrayList2.add(Integer.valueOf(f4.f(npVar.currentAccount).u(d6Var.n, str, d6Var, null, null)));
                return;
            case 1:
                long j11 = 0;
                az azVar = (az) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ArrayList arrayList7 = (ArrayList) this.h;
                boolean z16 = true;
                azVar.getMessagesController().f4(arrayList3, true);
                azVar.getMessagesController().Z3(arrayList4, true);
                azVar.getMessagesController().c4(arrayList5);
                int size = arrayList6.size();
                int i10 = 0;
                while (i10 < size) {
                    gj gjVar = new gj(azVar.currentAccount, (TLRPC.Message) arrayList6.get(i10), false, z16);
                    long c12 = gjVar.c1();
                    if (c12 != j11 && (hashMap = gjVar.k.params) != null && !hashMap.containsKey("final") && (i10 == size - 1 || ((TLRPC.Message) arrayList6.get(i10 + 1)).grouped_id != c12)) {
                        gjVar.k.params.put("final", "1");
                    }
                    azVar.k0(j11, gjVar, true);
                    i10++;
                    z16 = true;
                    j11 = 0;
                }
                if (arrayList7 != null) {
                    for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                        gj gjVar2 = new gj(azVar.currentAccount, (TLRPC.Message) arrayList7.get(i11), false, true);
                        gjVar2.r1 = true;
                        azVar.k0(0L, gjVar2, true);
                    }
                    return;
                }
                return;
            case 2:
                ((r1) this.b).m((Activity) this.c, (c) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f, (com.google.android.gms.internal.clearcut.y0) this.h, true);
                return;
            case 3:
                jg.r0 r0Var = (jg.r0) this.b;
                String str2 = (String) this.h;
                String str3 = (String) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = (TLRPC.TL_messageMediaVenue) this.e;
                Location location = (Location) this.f;
                rd.R.remove(r0Var);
                r0Var.K(str2, str3, tL_messageMediaVenue, tL_messageMediaVenue2, location);
                return;
            case 4:
                File file2 = (File) this.f;
                File file3 = (File) this.b;
                boolean[] zArr = (boolean[]) this.c;
                y10 y10Var = (y10) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
                boolean[] zArr2 = (boolean[]) this.h;
                String[] strArr = MediaController.W1;
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        try {
                            p02 = g0.p0(0, "jpg");
                            contentValues = new ContentValues();
                            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                            z13 = true;
                        } catch (Exception e10) {
                            e = e10;
                            z12 = true;
                        }
                        try {
                            boolean z17 = false;
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
                                            t0.b.getContentResolver().delete(insert, null, null);
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                                z15 = z17;
                                z14 = z13;
                            } catch (Exception e11) {
                                e = e11;
                                z11 = true;
                                z15 = false;
                                a8.g(e, z11);
                                r22 = z11;
                                if (z15) {
                                }
                                if (t1Var == null) {
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            z12 = z13;
                            z11 = z12;
                            a8.g(e, z11);
                            r22 = z11;
                            if (z15) {
                            }
                            if (t1Var == null) {
                            }
                        }
                    } else {
                        z10 = true;
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
                                    z15 = false;
                                    z14 = z10;
                                } else {
                                    g0.d(file5.getAbsoluteFile());
                                    uri = Uri.fromFile(file5);
                                    z15 = true;
                                    z14 = z10;
                                }
                            } finally {
                            }
                        } catch (Exception e13) {
                            e = e13;
                            z11 = z10;
                            z15 = false;
                            a8.g(e, z11);
                            r22 = z11;
                            if (z15) {
                                g0.g3(new ge(y10Var, uri, r22));
                            }
                            if (t1Var == null) {
                            }
                        }
                    }
                    r22 = z14;
                } catch (Exception e14) {
                    e = e14;
                    z10 = true;
                }
                if (z15 && y10Var != null) {
                    g0.g3(new ge(y10Var, uri, r22));
                }
                if (t1Var == null) {
                    g0.g3(new ce(t1Var, zArr2, 3));
                    return;
                }
                return;
            case 5:
                np npVar2 = (np) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                vf.b bVar = (vf.b) this.d;
                TLObject tLObject = (TLObject) this.e;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f;
                Bundle bundle = (Bundle) this.h;
                if (t1Var2 != null) {
                    try {
                        t1Var2.dismiss();
                    } catch (Exception e15) {
                        a8.g(e15, true);
                    }
                }
                if (bVar != null) {
                    bVar.b();
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                npVar2.f4(messages_messages.users, false);
                npVar2.Z3(messages_messages.chats, false);
                npVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                g2Var.presentFragment(new org.telegram.ui.bn(bundle), true);
                return;
            case 6:
                qv qvVar = (qv) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                a0.h hVar = (a0.h) this.h;
                ArrayList arrayList12 = qvVar.c;
                ArrayList arrayList13 = qvVar.i;
                int i12 = qvVar.a;
                np.u1(i12).f4(arrayList8, true);
                np.u1(i12).Z3(arrayList9, true);
                org.telegram.ui.Components.p5.g(i12).d(arrayList10);
                for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                    qvVar.j(((Long) arrayList11.get(i13)).longValue());
                }
                for (int i14 = 0; i14 < hVar.m(); i14++) {
                    long j12 = hVar.j(i14);
                    gj gjVar3 = new gj(qvVar.a, (TLRPC.Message) hVar.n(i14), null, null, null, null, null, false, false, 0L, false, false, true, 0);
                    for (int i15 = 0; i15 < arrayList13.size(); i15++) {
                        pv pvVar = (pv) arrayList13.get(i15);
                        if (pvVar.a == j12) {
                            pvVar.c = gjVar3.e1();
                            pvVar.d = gjVar3;
                        }
                    }
                    for (int i16 = 0; i16 < arrayList12.size(); i16++) {
                        pv pvVar2 = (pv) arrayList12.get(i16);
                        if (pvVar2.a == j12) {
                            pvVar2.c = gjVar3.e1();
                            pvVar2.d = gjVar3;
                        }
                    }
                }
                qvVar.l();
                return;
            case 7:
                qv qvVar2 = (qv) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                ArrayList arrayList17 = (ArrayList) this.f;
                ov ovVar = (ov) this.h;
                qvVar2.k = false;
                qvVar2.l = true;
                int i17 = qvVar2.a;
                np.u1(i17).f4(arrayList14, true);
                np.u1(i17).Z3(arrayList15, true);
                org.telegram.ui.Components.p5.g(i17).d(arrayList16);
                ArrayList arrayList18 = qvVar2.c;
                arrayList18.clear();
                arrayList18.addAll(arrayList17);
                qvVar2.m();
                if (qvVar2.m) {
                    return;
                }
                ovVar.run();
                return;
            case 8:
                yv yvVar = (yv) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                byte[] bArr = (byte[]) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                yvVar.n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        t1Var3.dismiss();
                    } catch (Exception e16) {
                        a8.g(e16, true);
                    }
                }
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject2;
                encryptedChat.user_id = encryptedChat.participant_id;
                encryptedChat.seq_in = -2;
                encryptedChat.seq_out = 1;
                encryptedChat.a_or_b = bArr;
                yvVar.getMessagesController().b4(encryptedChat, false);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = n5.F(encryptedChat.id);
                tL_dialog.unread_count = 0;
                tL_dialog.top_message = 0;
                tL_dialog.last_message_date = yvVar.getConnectionsManager().getCurrentTime();
                yvVar.getMessagesController().R.k(tL_dialog, tL_dialog.id);
                yvVar.getMessagesController().y.add(tL_dialog);
                yvVar.getMessagesController().f5(null);
                ur messagesStorage = yvVar.getMessagesStorage();
                messagesStorage.a.c(new ul(messagesStorage, encryptedChat, user, tL_dialog, 20));
                yvVar.getNotificationCenter().k(3, new Object[0]);
                yvVar.getNotificationCenter().k(37, encryptedChat);
                Utilities.d.c(new yr(yvVar, 9));
                return;
            case 9:
                az azVar2 = (az) this.b;
                String str4 = (String) this.h;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                uv0 uv0Var = (uv0) this.f;
                vy vyVar = new vy(azVar2);
                vyVar.f = str4;
                vyVar.e = str5;
                vyVar.g = str6;
                HashMap hashMap2 = new HashMap();
                int size2 = arrayList19.size();
                while (i7 < size2) {
                    ty tyVar = (ty) arrayList19.get(i7);
                    File file6 = new File(tyVar.a);
                    if (file6.exists()) {
                        long length = file6.length();
                        if (length != j10) {
                            j3 = j10;
                            vyVar.h += length;
                            vyVar.d.add(tyVar);
                            vyVar.a.put(tyVar.a, tyVar);
                            hashMap2.put(tyVar.a, vyVar);
                            i7++;
                            j10 = j3;
                        }
                    }
                    j3 = j10;
                    if (i7 == 0) {
                        g0.g3(new yr(uv0Var, 10));
                        return;
                    } else {
                        i7++;
                        j10 = j3;
                    }
                }
                g0.g3(new gn(azVar2, vyVar, hashMap2, str5, uv0Var, 15));
                return;
            case 10:
                az azVar3 = (az) this.b;
                TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
                gj gjVar4 = (gj) this.d;
                File file7 = (File) this.f;
                my myVar = (my) this.e;
                String str7 = (String) this.h;
                if (tL_photo == null) {
                    if (s2.a) {
                        StringBuilder u10 = a8.p0.u("can't load image ", str7, " to file ");
                        u10.append(file7.toString());
                        a8.d(u10.toString());
                    }
                    myVar.c();
                    return;
                }
                TLRPC.Message message = gjVar4.k;
                message.media.photo = tL_photo;
                message.attachPath = file7.toString();
                ArrayList arrayList20 = new ArrayList();
                arrayList20.add(gjVar4.k);
                azVar3.getMessagesStorage().j1(arrayList20, false, true, false, 0, false, gjVar4.r1 ? 1 : 0, 0L);
                azVar3.getNotificationCenter().k(48, gjVar4.k);
                myVar.g = (TLRPC.PhotoSize) i5.c.h(1, tL_photo.sizes);
                myVar.h = tL_photo;
                myVar.l = null;
                if (myVar.e != 4) {
                    azVar3.M(myVar, -1);
                    return;
                } else {
                    myVar.p = true;
                    azVar3.M(myVar, myVar.x.indexOf(gjVar4));
                    return;
                }
            default:
                az azVar4 = (az) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                my myVar2 = (my) this.e;
                String str8 = (String) this.h;
                gj gjVar5 = (gj) this.f;
                if (!(tLObject3 instanceof TLRPC.TL_messageMediaPhoto)) {
                    myVar2.c();
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
                myVar2.j = null;
                myVar2.i = null;
                HashMap hashMap3 = myVar2.E;
                if (hashMap3 != null) {
                    hashMap3.remove(str8 + "_ct");
                }
                int indexOf = myVar2.x.indexOf(gjVar5);
                ArrayList arrayList21 = myVar2.A;
                if (arrayList21 != null && indexOf >= 0 && indexOf < arrayList21.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) myVar2.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap4 = myVar2.E;
                if (hashMap4 != null) {
                    if (hashMap4.containsKey(str8 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) myVar2.E.get(str8 + "_t");
                    }
                }
                myVar2.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    azVar4.t0(myVar2, false);
                    return;
                } else {
                    myVar2.p = true;
                    azVar4.M(myVar2, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ uj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ uj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.h = str;
        this.c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ uj(az azVar, TLObject tLObject, TLRPC.InputMedia inputMedia, my myVar, String str, gj gjVar) {
        this.a = 11;
        this.b = azVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = myVar;
        this.h = str;
        this.f = gjVar;
    }

    public /* synthetic */ uj(az azVar, TLRPC.TL_photo tL_photo, gj gjVar, File file, my myVar, String str) {
        this.a = 10;
        this.b = azVar;
        this.c = tL_photo;
        this.d = gjVar;
        this.f = file;
        this.e = myVar;
        this.h = str;
    }
}
