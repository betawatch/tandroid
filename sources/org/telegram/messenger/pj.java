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
import org.telegram.ui.Components.gv0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ pj(File file, File file2, boolean[] zArr, u10 u10Var, org.telegram.ui.ActionBar.s1 s1Var, boolean[] zArr2) {
        this.a = 4;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = u10Var;
        this.e = s1Var;
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
        int i3 = 0;
        switch (this.a) {
            case 0:
                hp hpVar = (hp) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (hpVar.R2 == null || hpVar.S2.s == null || wallPaper == null) {
                    return;
                }
                wallPaper.settings = tL_wallPaperSettings;
                wallPaper.flags = 4 | wallPaper.flags;
                b6Var.c = wallPaper.slug;
                org.telegram.ui.ActionBar.j6 j6Var = b6Var.p;
                if (j6Var != null && (((g6Var = b6Var.q) != null || j6Var.j0 == b6Var) && (g6Var == null || g6Var.y == b6Var))) {
                    b6Var.c();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(wallPaper);
                hpVar.getMessagesStorage().p1(2, arrayList);
                TLRPC.PhotoSize w10 = w7.w(wallPaper.document.thumbs, hs.r5, false, null, false);
                if (w10 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w10.location.volume_id);
                    sb2.append("_");
                    zb.D().S(Utilities.a(file.getAbsolutePath()) + "@100_100", a1.g.o(w10.location.local_id, "@100_100", sb2), ac.c(w10, wallPaper.document));
                }
                hs.e().k(256, wallPaper.slug);
                ArrayList arrayList2 = hpVar.S2.s;
                if (arrayList2 == null || b6Var.n == 0) {
                    return;
                }
                arrayList2.add(Integer.valueOf(d4.f(hpVar.currentAccount).u(b6Var.n, str, b6Var, null, null)));
                return;
            case 1:
                long j12 = 0;
                yy yyVar = (yy) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ArrayList arrayList7 = (ArrayList) this.h;
                boolean z16 = true;
                yyVar.getMessagesController().Y3(arrayList3, true);
                yyVar.getMessagesController().S3(arrayList4, true);
                yyVar.getMessagesController().V3(arrayList5);
                int size = arrayList6.size();
                int i10 = 0;
                while (i10 < size) {
                    zi ziVar = new zi(yyVar.currentAccount, (TLRPC.Message) arrayList6.get(i10), false, z16);
                    long d12 = ziVar.d1();
                    if (d12 != j12 && (hashMap = ziVar.k.params) != null && !hashMap.containsKey("final") && (i10 == size - 1 || ((TLRPC.Message) arrayList6.get(i10 + 1)).grouped_id != d12)) {
                        ziVar.k.params.put("final", "1");
                    }
                    yyVar.k0(j12, ziVar, true);
                    i10++;
                    z16 = true;
                    j12 = 0;
                }
                if (arrayList7 != null) {
                    for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                        zi ziVar2 = new zi(yyVar.currentAccount, (TLRPC.Message) arrayList7.get(i11), false, true);
                        ziVar2.p1 = true;
                        yyVar.k0(0L, ziVar2, true);
                    }
                    return;
                }
                return;
            case 2:
                ((r1) this.b).m((Activity) this.c, (c) this.d, (TLRPC.InputStorePaymentPurpose) this.e, (List) this.f, (ad.b) this.h, true);
                return;
            case 3:
                kg.o0 o0Var = (kg.o0) this.b;
                String str2 = (String) this.h;
                String str3 = (String) this.c;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.d;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = (TLRPC.TL_messageMediaVenue) this.e;
                Location location = (Location) this.f;
                ld.R.remove(o0Var);
                o0Var.K(str2, str3, tL_messageMediaVenue, tL_messageMediaVenue2, location);
                return;
            case 4:
                File file2 = (File) this.f;
                File file3 = (File) this.b;
                boolean[] zArr = (boolean[]) this.c;
                u10 u10Var = (u10) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.e;
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
                                if (s1Var == null) {
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
                            if (s1Var == null) {
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
                                g0.h3(new ae(u10Var, uri, r22));
                            }
                            if (s1Var == null) {
                            }
                        }
                    }
                    r22 = z14;
                } catch (Exception e14) {
                    e = e14;
                    z10 = true;
                }
                if (z15 && u10Var != null) {
                    g0.h3(new ae(u10Var, uri, r22));
                }
                if (s1Var == null) {
                    g0.h3(new xd(s1Var, zArr2, 3));
                    return;
                }
                return;
            case 5:
                hp hpVar2 = (hp) this.b;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) this.c;
                sf.b bVar = (sf.b) this.d;
                TLObject tLObject = (TLObject) this.e;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
                Bundle bundle = (Bundle) this.h;
                if (s1Var2 != null) {
                    try {
                        s1Var2.dismiss();
                    } catch (Exception e15) {
                        a8.g(e15, true);
                    }
                }
                if (bVar != null) {
                    bVar.b();
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                hpVar2.Y3(messages_messages.users, false);
                hpVar2.S3(messages_messages.chats, false);
                hpVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                d2Var.presentFragment(new org.telegram.ui.wm(bundle), true);
                return;
            case 6:
                nv nvVar = (nv) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                a0.h hVar = (a0.h) this.h;
                ArrayList arrayList12 = nvVar.c;
                ArrayList arrayList13 = nvVar.i;
                int i12 = nvVar.a;
                hp.s1(i12).Y3(arrayList8, true);
                hp.s1(i12).S3(arrayList9, true);
                org.telegram.ui.Components.g5.g(i12).d(arrayList10);
                for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                    nvVar.j(((Long) arrayList11.get(i13)).longValue());
                }
                for (int i14 = 0; i14 < hVar.m(); i14++) {
                    long j13 = hVar.j(i14);
                    zi ziVar3 = new zi(nvVar.a, (TLRPC.Message) hVar.n(i14), null, null, null, null, null, false, false, 0L, false, false, true, 0);
                    for (int i15 = 0; i15 < arrayList13.size(); i15++) {
                        mv mvVar = (mv) arrayList13.get(i15);
                        if (mvVar.a == j13) {
                            mvVar.c = ziVar3.f1();
                            mvVar.d = ziVar3;
                        }
                    }
                    for (int i16 = 0; i16 < arrayList12.size(); i16++) {
                        mv mvVar2 = (mv) arrayList12.get(i16);
                        if (mvVar2.a == j13) {
                            mvVar2.c = ziVar3.f1();
                            mvVar2.d = ziVar3;
                        }
                    }
                }
                nvVar.l();
                return;
            case 7:
                nv nvVar2 = (nv) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                ArrayList arrayList17 = (ArrayList) this.f;
                lv lvVar = (lv) this.h;
                nvVar2.k = false;
                nvVar2.l = true;
                int i17 = nvVar2.a;
                hp.s1(i17).Y3(arrayList14, true);
                hp.s1(i17).S3(arrayList15, true);
                org.telegram.ui.Components.g5.g(i17).d(arrayList16);
                ArrayList arrayList18 = nvVar2.c;
                arrayList18.clear();
                arrayList18.addAll(arrayList17);
                nvVar2.m();
                if (nvVar2.m) {
                    return;
                }
                lvVar.run();
                return;
            case 8:
                vv vvVar = (vv) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.s1 s1Var3 = (org.telegram.ui.ActionBar.s1) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                byte[] bArr = (byte[]) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                vvVar.n = false;
                if (!((Activity) context).isFinishing()) {
                    try {
                        s1Var3.dismiss();
                    } catch (Exception e16) {
                        a8.g(e16, true);
                    }
                }
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject2;
                encryptedChat.user_id = encryptedChat.participant_id;
                encryptedChat.seq_in = -2;
                encryptedChat.seq_out = 1;
                encryptedChat.a_or_b = bArr;
                vvVar.getMessagesController().U3(encryptedChat, false);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = m5.F(encryptedChat.id);
                tL_dialog.unread_count = 0;
                tL_dialog.top_message = 0;
                tL_dialog.last_message_date = vvVar.getConnectionsManager().getCurrentTime();
                vvVar.getMessagesController().R.k(tL_dialog, tL_dialog.id);
                vvVar.getMessagesController().y.add(tL_dialog);
                vvVar.getMessagesController().T4(null);
                qr messagesStorage = vvVar.getMessagesStorage();
                messagesStorage.a.c(new ul(messagesStorage, encryptedChat, user, tL_dialog, 20));
                vvVar.getNotificationCenter().k(3, new Object[0]);
                vvVar.getNotificationCenter().k(37, encryptedChat);
                Utilities.d.c(new vs(vvVar, 9));
                return;
            case 9:
                yy yyVar2 = (yy) this.b;
                String str4 = (String) this.h;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                gv0 gv0Var = (gv0) this.f;
                ty tyVar = new ty(yyVar2);
                tyVar.f = str4;
                tyVar.e = str5;
                tyVar.g = str6;
                HashMap hashMap2 = new HashMap();
                int size2 = arrayList19.size();
                while (i3 < size2) {
                    ry ryVar = (ry) arrayList19.get(i3);
                    File file6 = new File(ryVar.a);
                    if (file6.exists()) {
                        long length = file6.length();
                        if (length != j11) {
                            j10 = j11;
                            tyVar.h += length;
                            tyVar.d.add(ryVar);
                            tyVar.a.put(ryVar.a, ryVar);
                            hashMap2.put(ryVar.a, tyVar);
                            i3++;
                            j11 = j10;
                        }
                    }
                    j10 = j11;
                    if (i3 == 0) {
                        g0.h3(new vs(gv0Var, 10));
                        return;
                    } else {
                        i3++;
                        j11 = j10;
                    }
                }
                g0.h3(new cn(yyVar2, tyVar, hashMap2, str5, gv0Var, 15));
                return;
            case 10:
                yy yyVar3 = (yy) this.b;
                TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
                zi ziVar4 = (zi) this.d;
                File file7 = (File) this.f;
                ky kyVar = (ky) this.e;
                String str7 = (String) this.h;
                if (tL_photo == null) {
                    if (r2.a) {
                        StringBuilder u10 = a1.g.u("can't load image ", str7, " to file ");
                        u10.append(file7.toString());
                        a8.d(u10.toString());
                    }
                    kyVar.c();
                    return;
                }
                TLRPC.Message message = ziVar4.k;
                message.media.photo = tL_photo;
                message.attachPath = file7.toString();
                ArrayList arrayList20 = new ArrayList();
                arrayList20.add(ziVar4.k);
                yyVar3.getMessagesStorage().j1(arrayList20, false, true, false, 0, false, ziVar4.p1 ? 1 : 0, 0L);
                yyVar3.getNotificationCenter().k(48, ziVar4.k);
                kyVar.g = (TLRPC.PhotoSize) k2.p1.h(1, tL_photo.sizes);
                kyVar.h = tL_photo;
                kyVar.l = null;
                if (kyVar.e != 4) {
                    yyVar3.M(kyVar, -1);
                    return;
                } else {
                    kyVar.p = true;
                    yyVar3.M(kyVar, kyVar.x.indexOf(ziVar4));
                    return;
                }
            default:
                yy yyVar4 = (yy) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                ky kyVar2 = (ky) this.e;
                String str8 = (String) this.h;
                zi ziVar5 = (zi) this.f;
                if (!(tLObject3 instanceof TLRPC.TL_messageMediaPhoto)) {
                    kyVar2.c();
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
                kyVar2.j = null;
                kyVar2.i = null;
                HashMap hashMap3 = kyVar2.E;
                if (hashMap3 != null) {
                    hashMap3.remove(str8 + "_ct");
                }
                int indexOf = kyVar2.x.indexOf(ziVar5);
                ArrayList arrayList21 = kyVar2.A;
                if (arrayList21 != null && indexOf >= 0 && indexOf < arrayList21.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) kyVar2.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap4 = kyVar2.E;
                if (hashMap4 != null) {
                    if (hashMap4.containsKey(str8 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) kyVar2.E.get(str8 + "_t");
                    }
                }
                kyVar2.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    yyVar4.t0(kyVar2, false);
                    return;
                } else {
                    kyVar2.p = true;
                    yyVar4.M(kyVar2, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ pj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ pj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.h = str;
        this.c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ pj(yy yyVar, TLObject tLObject, TLRPC.InputMedia inputMedia, ky kyVar, String str, zi ziVar) {
        this.a = 11;
        this.b = yyVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = kyVar;
        this.h = str;
        this.f = ziVar;
    }

    public /* synthetic */ pj(yy yyVar, TLRPC.TL_photo tL_photo, zi ziVar, File file, ky kyVar, String str) {
        this.a = 10;
        this.b = yyVar;
        this.c = tL_photo;
        this.d = ziVar;
        this.f = file;
        this.e = kyVar;
        this.h = str;
    }
}
