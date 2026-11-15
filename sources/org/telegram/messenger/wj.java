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
import org.telegram.ui.Components.jv0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class wj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ wj(File file, File file2, boolean[] zArr, z10 z10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.a = 4;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = z10Var;
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
        org.telegram.ui.ActionBar.g6 g6Var;
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
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (npVar.R2 == null || npVar.S2.s == null || wallPaper == null) {
                    return;
                }
                wallPaper.settings = tL_wallPaperSettings;
                wallPaper.flags = 4 | wallPaper.flags;
                b6Var.c = wallPaper.slug;
                org.telegram.ui.ActionBar.i6 i6Var = b6Var.p;
                if (i6Var != null && (((g6Var = b6Var.q) != null || i6Var.j0 == b6Var) && (g6Var == null || g6Var.y == b6Var))) {
                    b6Var.c();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(wallPaper);
                npVar.getMessagesStorage().p1(2, arrayList);
                TLRPC.PhotoSize w10 = w7.w(wallPaper.document.thumbs, ns.r5, false, null, false);
                if (w10 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w10.location.volume_id);
                    sb2.append("_");
                    fc.D().S(Utilities.a(file.getAbsolutePath()) + "@100_100", a8.p0.n(w10.location.local_id, "@100_100", sb2), gc.c(w10, wallPaper.document));
                }
                ns.e().k(256, wallPaper.slug);
                ArrayList arrayList2 = npVar.S2.s;
                if (arrayList2 == null || b6Var.n == 0) {
                    return;
                }
                arrayList2.add(Integer.valueOf(d4.f(npVar.currentAccount).u(b6Var.n, str, b6Var, null, null)));
                return;
            case 1:
                long j11 = 0;
                ez ezVar = (ez) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ArrayList arrayList7 = (ArrayList) this.h;
                boolean z16 = true;
                ezVar.getMessagesController().Y3(arrayList3, true);
                ezVar.getMessagesController().S3(arrayList4, true);
                ezVar.getMessagesController().V3(arrayList5);
                int size = arrayList6.size();
                int i10 = 0;
                while (i10 < size) {
                    gj gjVar = new gj(ezVar.currentAccount, (TLRPC.Message) arrayList6.get(i10), false, z16);
                    long c12 = gjVar.c1();
                    if (c12 != j11 && (hashMap = gjVar.k.params) != null && !hashMap.containsKey("final") && (i10 == size - 1 || ((TLRPC.Message) arrayList6.get(i10 + 1)).grouped_id != c12)) {
                        gjVar.k.params.put("final", "1");
                    }
                    ezVar.k0(j11, gjVar, true);
                    i10++;
                    z16 = true;
                    j11 = 0;
                }
                if (arrayList7 != null) {
                    for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                        gj gjVar2 = new gj(ezVar.currentAccount, (TLRPC.Message) arrayList7.get(i11), false, true);
                        gjVar2.r1 = true;
                        ezVar.k0(0L, gjVar2, true);
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
                z10 z10Var = (z10) this.d;
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
                                g0.h3(new ge(z10Var, uri, r22));
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
                if (z15 && z10Var != null) {
                    g0.h3(new ge(z10Var, uri, r22));
                }
                if (t1Var == null) {
                    g0.h3(new ce(t1Var, zArr2, 3));
                    return;
                }
                return;
            case 5:
                np npVar2 = (np) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                vf.b bVar = (vf.b) this.d;
                TLObject tLObject = (TLObject) this.e;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
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
                npVar2.Y3(messages_messages.users, false);
                npVar2.S3(messages_messages.chats, false);
                npVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                e2Var.presentFragment(new org.telegram.ui.an(bundle), true);
                return;
            case 6:
                tv tvVar = (tv) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                a0.h hVar = (a0.h) this.h;
                ArrayList arrayList12 = tvVar.c;
                ArrayList arrayList13 = tvVar.i;
                int i12 = tvVar.a;
                np.s1(i12).Y3(arrayList8, true);
                np.s1(i12).S3(arrayList9, true);
                org.telegram.ui.Components.g5.g(i12).d(arrayList10);
                for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                    tvVar.j(((Long) arrayList11.get(i13)).longValue());
                }
                for (int i14 = 0; i14 < hVar.m(); i14++) {
                    long j12 = hVar.j(i14);
                    gj gjVar3 = new gj(tvVar.a, (TLRPC.Message) hVar.n(i14), null, null, null, null, null, false, false, 0L, false, false, true, 0);
                    for (int i15 = 0; i15 < arrayList13.size(); i15++) {
                        sv svVar = (sv) arrayList13.get(i15);
                        if (svVar.a == j12) {
                            svVar.c = gjVar3.e1();
                            svVar.d = gjVar3;
                        }
                    }
                    for (int i16 = 0; i16 < arrayList12.size(); i16++) {
                        sv svVar2 = (sv) arrayList12.get(i16);
                        if (svVar2.a == j12) {
                            svVar2.c = gjVar3.e1();
                            svVar2.d = gjVar3;
                        }
                    }
                }
                tvVar.l();
                return;
            case 7:
                tv tvVar2 = (tv) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                ArrayList arrayList17 = (ArrayList) this.f;
                rv rvVar = (rv) this.h;
                tvVar2.k = false;
                tvVar2.l = true;
                int i17 = tvVar2.a;
                np.s1(i17).Y3(arrayList14, true);
                np.s1(i17).S3(arrayList15, true);
                org.telegram.ui.Components.g5.g(i17).d(arrayList16);
                ArrayList arrayList18 = tvVar2.c;
                arrayList18.clear();
                arrayList18.addAll(arrayList17);
                tvVar2.m();
                if (tvVar2.m) {
                    return;
                }
                rvVar.run();
                return;
            case 8:
                bw bwVar = (bw) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                byte[] bArr = (byte[]) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                bwVar.n = false;
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
                bwVar.getMessagesController().U3(encryptedChat, false);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = m5.F(encryptedChat.id);
                tL_dialog.unread_count = 0;
                tL_dialog.top_message = 0;
                tL_dialog.last_message_date = bwVar.getConnectionsManager().getCurrentTime();
                bwVar.getMessagesController().R.k(tL_dialog, tL_dialog.id);
                bwVar.getMessagesController().y.add(tL_dialog);
                bwVar.getMessagesController().U4(null);
                vr messagesStorage = bwVar.getMessagesStorage();
                messagesStorage.a.c(new bm(messagesStorage, encryptedChat, user, tL_dialog, 20));
                bwVar.getNotificationCenter().k(3, new Object[0]);
                bwVar.getNotificationCenter().k(37, encryptedChat);
                Utilities.d.c(new as(bwVar, 9));
                return;
            case 9:
                ez ezVar2 = (ez) this.b;
                String str4 = (String) this.h;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                jv0 jv0Var = (jv0) this.f;
                zy zyVar = new zy(ezVar2);
                zyVar.f = str4;
                zyVar.e = str5;
                zyVar.g = str6;
                HashMap hashMap2 = new HashMap();
                int size2 = arrayList19.size();
                while (i7 < size2) {
                    xy xyVar = (xy) arrayList19.get(i7);
                    File file6 = new File(xyVar.a);
                    if (file6.exists()) {
                        long length = file6.length();
                        if (length != j10) {
                            j3 = j10;
                            zyVar.h += length;
                            zyVar.d.add(xyVar);
                            zyVar.a.put(xyVar.a, xyVar);
                            hashMap2.put(xyVar.a, zyVar);
                            i7++;
                            j10 = j3;
                        }
                    }
                    j3 = j10;
                    if (i7 == 0) {
                        g0.h3(new as(jv0Var, 10));
                        return;
                    } else {
                        i7++;
                        j10 = j3;
                    }
                }
                g0.h3(new jn(ezVar2, zyVar, hashMap2, str5, jv0Var, 15));
                return;
            case 10:
                ez ezVar3 = (ez) this.b;
                TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
                gj gjVar4 = (gj) this.d;
                File file7 = (File) this.f;
                qy qyVar = (qy) this.e;
                String str7 = (String) this.h;
                if (tL_photo == null) {
                    if (r2.a) {
                        StringBuilder u10 = a8.p0.u("can't load image ", str7, " to file ");
                        u10.append(file7.toString());
                        a8.d(u10.toString());
                    }
                    qyVar.c();
                    return;
                }
                TLRPC.Message message = gjVar4.k;
                message.media.photo = tL_photo;
                message.attachPath = file7.toString();
                ArrayList arrayList20 = new ArrayList();
                arrayList20.add(gjVar4.k);
                ezVar3.getMessagesStorage().j1(arrayList20, false, true, false, 0, false, gjVar4.r1 ? 1 : 0, 0L);
                ezVar3.getNotificationCenter().k(48, gjVar4.k);
                qyVar.g = (TLRPC.PhotoSize) i5.c.h(1, tL_photo.sizes);
                qyVar.h = tL_photo;
                qyVar.l = null;
                if (qyVar.e != 4) {
                    ezVar3.M(qyVar, -1);
                    return;
                } else {
                    qyVar.p = true;
                    ezVar3.M(qyVar, qyVar.x.indexOf(gjVar4));
                    return;
                }
            default:
                ez ezVar4 = (ez) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                qy qyVar2 = (qy) this.e;
                String str8 = (String) this.h;
                gj gjVar5 = (gj) this.f;
                if (!(tLObject3 instanceof TLRPC.TL_messageMediaPhoto)) {
                    qyVar2.c();
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
                qyVar2.j = null;
                qyVar2.i = null;
                HashMap hashMap3 = qyVar2.E;
                if (hashMap3 != null) {
                    hashMap3.remove(str8 + "_ct");
                }
                int indexOf = qyVar2.x.indexOf(gjVar5);
                ArrayList arrayList21 = qyVar2.A;
                if (arrayList21 != null && indexOf >= 0 && indexOf < arrayList21.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) qyVar2.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap4 = qyVar2.E;
                if (hashMap4 != null) {
                    if (hashMap4.containsKey(str8 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) qyVar2.E.get(str8 + "_t");
                    }
                }
                qyVar2.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    ezVar4.t0(qyVar2, false);
                    return;
                } else {
                    qyVar2.p = true;
                    ezVar4.M(qyVar2, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ wj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ wj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.h = str;
        this.c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ wj(ez ezVar, TLObject tLObject, TLRPC.InputMedia inputMedia, qy qyVar, String str, gj gjVar) {
        this.a = 11;
        this.b = ezVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = qyVar;
        this.h = str;
        this.f = gjVar;
    }

    public /* synthetic */ wj(ez ezVar, TLRPC.TL_photo tL_photo, gj gjVar, File file, qy qyVar, String str) {
        this.a = 10;
        this.b = ezVar;
        this.c = tL_photo;
        this.d = gjVar;
        this.f = file;
        this.e = qyVar;
        this.h = str;
    }
}
