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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ tj(File file, File file2, boolean[] zArr, x10 x10Var, org.telegram.ui.ActionBar.t1 t1Var, boolean[] zArr2) {
        this.a = 4;
        this.f = file;
        this.b = file2;
        this.c = zArr;
        this.d = x10Var;
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
                mp mpVar = (mp) this.b;
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.c;
                TLRPC.TL_wallPaperSettings tL_wallPaperSettings = (TLRPC.TL_wallPaperSettings) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                File file = (File) this.f;
                String str = (String) this.h;
                if (mpVar.T2 == null || mpVar.U2.s == null || wallPaper == null) {
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
                mpVar.getMessagesStorage().p1(2, arrayList);
                TLRPC.PhotoSize w10 = w7.w(wallPaper.document.thumbs, ks.r5, false, null, false);
                if (w10 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w10.location.volume_id);
                    sb2.append("_");
                    ec.D().S(Utilities.a(file.getAbsolutePath()) + "@100_100", a8.p0.n(w10.location.local_id, "@100_100", sb2), fc.c(w10, wallPaper.document));
                }
                ks.e().k(ks.i4, wallPaper.slug);
                ArrayList arrayList2 = mpVar.U2.s;
                if (arrayList2 == null || d6Var.n == 0) {
                    return;
                }
                arrayList2.add(Integer.valueOf(f4.f(mpVar.currentAccount).u(d6Var.n, str, d6Var, null, null)));
                return;
            case 1:
                long j11 = 0;
                zy zyVar = (zy) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                ArrayList arrayList7 = (ArrayList) this.h;
                boolean z16 = true;
                zyVar.getMessagesController().f4(arrayList3, true);
                zyVar.getMessagesController().Z3(arrayList4, true);
                zyVar.getMessagesController().c4(arrayList5);
                int size = arrayList6.size();
                int i10 = 0;
                while (i10 < size) {
                    fj fjVar = new fj(zyVar.currentAccount, (TLRPC.Message) arrayList6.get(i10), false, z16);
                    long c12 = fjVar.c1();
                    if (c12 != j11 && (hashMap = fjVar.k.params) != null && !hashMap.containsKey("final") && (i10 == size - 1 || ((TLRPC.Message) arrayList6.get(i10 + 1)).grouped_id != c12)) {
                        fjVar.k.params.put("final", "1");
                    }
                    zyVar.k0(j11, fjVar, true);
                    i10++;
                    z16 = true;
                    j11 = 0;
                }
                if (arrayList7 != null) {
                    for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                        fj fjVar2 = new fj(zyVar.currentAccount, (TLRPC.Message) arrayList7.get(i11), false, true);
                        fjVar2.r1 = true;
                        zyVar.k0(0L, fjVar2, true);
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
                qd.R.remove(r0Var);
                r0Var.K(str2, str3, tL_messageMediaVenue, tL_messageMediaVenue2, location);
                return;
            case 4:
                File file2 = (File) this.f;
                File file3 = (File) this.b;
                boolean[] zArr = (boolean[]) this.c;
                x10 x10Var = (x10) this.d;
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
                                g0.g3(new fe(x10Var, uri, r22));
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
                if (z15 && x10Var != null) {
                    g0.g3(new fe(x10Var, uri, r22));
                }
                if (t1Var == null) {
                    g0.g3(new be(t1Var, zArr2, 3));
                    return;
                }
                return;
            case 5:
                mp mpVar2 = (mp) this.b;
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
                mpVar2.f4(messages_messages.users, false);
                mpVar2.Z3(messages_messages.chats, false);
                mpVar2.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                g2Var.presentFragment(new org.telegram.ui.bn(bundle), true);
                return;
            case 6:
                pv pvVar = (pv) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                ArrayList arrayList10 = (ArrayList) this.e;
                ArrayList arrayList11 = (ArrayList) this.f;
                a0.h hVar = (a0.h) this.h;
                ArrayList arrayList12 = pvVar.c;
                ArrayList arrayList13 = pvVar.i;
                int i12 = pvVar.a;
                mp.u1(i12).f4(arrayList8, true);
                mp.u1(i12).Z3(arrayList9, true);
                org.telegram.ui.Components.p5.g(i12).d(arrayList10);
                for (int i13 = 0; i13 < arrayList11.size(); i13++) {
                    pvVar.j(((Long) arrayList11.get(i13)).longValue());
                }
                for (int i14 = 0; i14 < hVar.m(); i14++) {
                    long j12 = hVar.j(i14);
                    fj fjVar3 = new fj(pvVar.a, (TLRPC.Message) hVar.n(i14), null, null, null, null, null, false, false, 0L, false, false, true, 0);
                    for (int i15 = 0; i15 < arrayList13.size(); i15++) {
                        ov ovVar = (ov) arrayList13.get(i15);
                        if (ovVar.a == j12) {
                            ovVar.c = fjVar3.e1();
                            ovVar.d = fjVar3;
                        }
                    }
                    for (int i16 = 0; i16 < arrayList12.size(); i16++) {
                        ov ovVar2 = (ov) arrayList12.get(i16);
                        if (ovVar2.a == j12) {
                            ovVar2.c = fjVar3.e1();
                            ovVar2.d = fjVar3;
                        }
                    }
                }
                pvVar.l();
                return;
            case 7:
                pv pvVar2 = (pv) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                ArrayList arrayList16 = (ArrayList) this.e;
                ArrayList arrayList17 = (ArrayList) this.f;
                nv nvVar = (nv) this.h;
                pvVar2.k = false;
                pvVar2.l = true;
                int i17 = pvVar2.a;
                mp.u1(i17).f4(arrayList14, true);
                mp.u1(i17).Z3(arrayList15, true);
                org.telegram.ui.Components.p5.g(i17).d(arrayList16);
                ArrayList arrayList18 = pvVar2.c;
                arrayList18.clear();
                arrayList18.addAll(arrayList17);
                pvVar2.m();
                if (pvVar2.m) {
                    return;
                }
                nvVar.run();
                return;
            case 8:
                xv xvVar = (xv) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                byte[] bArr = (byte[]) this.f;
                TLRPC.User user = (TLRPC.User) this.h;
                xvVar.n = false;
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
                xvVar.getMessagesController().b4(encryptedChat, false);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                tL_dialog.id = n5.F(encryptedChat.id);
                tL_dialog.unread_count = 0;
                tL_dialog.top_message = 0;
                tL_dialog.last_message_date = xvVar.getConnectionsManager().getCurrentTime();
                xvVar.getMessagesController().R.k(tL_dialog, tL_dialog.id);
                xvVar.getMessagesController().y.add(tL_dialog);
                xvVar.getMessagesController().f5(null);
                tr messagesStorage = xvVar.getMessagesStorage();
                messagesStorage.a.c(new tl(messagesStorage, encryptedChat, user, tL_dialog, 20));
                xvVar.getNotificationCenter().k(3, new Object[0]);
                xvVar.getNotificationCenter().k(37, encryptedChat);
                Utilities.d.c(new xr(xvVar, 9));
                return;
            case 9:
                zy zyVar2 = (zy) this.b;
                String str4 = (String) this.h;
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                ArrayList arrayList19 = (ArrayList) this.e;
                uv0 uv0Var = (uv0) this.f;
                uy uyVar = new uy(zyVar2);
                uyVar.f = str4;
                uyVar.e = str5;
                uyVar.g = str6;
                HashMap hashMap2 = new HashMap();
                int size2 = arrayList19.size();
                while (i7 < size2) {
                    sy syVar = (sy) arrayList19.get(i7);
                    File file6 = new File(syVar.a);
                    if (file6.exists()) {
                        long length = file6.length();
                        if (length != j10) {
                            j3 = j10;
                            uyVar.h += length;
                            uyVar.d.add(syVar);
                            uyVar.a.put(syVar.a, syVar);
                            hashMap2.put(syVar.a, uyVar);
                            i7++;
                            j10 = j3;
                        }
                    }
                    j3 = j10;
                    if (i7 == 0) {
                        g0.g3(new xr(uv0Var, 10));
                        return;
                    } else {
                        i7++;
                        j10 = j3;
                    }
                }
                g0.g3(new fn(zyVar2, uyVar, hashMap2, str5, uv0Var, 15));
                return;
            case 10:
                zy zyVar3 = (zy) this.b;
                TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) this.c;
                fj fjVar4 = (fj) this.d;
                File file7 = (File) this.f;
                ly lyVar = (ly) this.e;
                String str7 = (String) this.h;
                if (tL_photo == null) {
                    if (s2.a) {
                        StringBuilder u10 = a8.p0.u("can't load image ", str7, " to file ");
                        u10.append(file7.toString());
                        a8.d(u10.toString());
                    }
                    lyVar.c();
                    return;
                }
                TLRPC.Message message = fjVar4.k;
                message.media.photo = tL_photo;
                message.attachPath = file7.toString();
                ArrayList arrayList20 = new ArrayList();
                arrayList20.add(fjVar4.k);
                zyVar3.getMessagesStorage().j1(arrayList20, false, true, false, 0, false, fjVar4.r1 ? 1 : 0, 0L);
                zyVar3.getNotificationCenter().k(48, fjVar4.k);
                lyVar.g = (TLRPC.PhotoSize) i5.c.h(1, tL_photo.sizes);
                lyVar.h = tL_photo;
                lyVar.l = null;
                if (lyVar.e != 4) {
                    zyVar3.M(lyVar, -1);
                    return;
                } else {
                    lyVar.p = true;
                    zyVar3.M(lyVar, lyVar.x.indexOf(fjVar4));
                    return;
                }
            default:
                zy zyVar4 = (zy) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.InputMedia inputMedia = (TLRPC.InputMedia) this.d;
                ly lyVar2 = (ly) this.e;
                String str8 = (String) this.h;
                fj fjVar5 = (fj) this.f;
                if (!(tLObject3 instanceof TLRPC.TL_messageMediaPhoto)) {
                    lyVar2.c();
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
                lyVar2.j = null;
                lyVar2.i = null;
                HashMap hashMap3 = lyVar2.E;
                if (hashMap3 != null) {
                    hashMap3.remove(str8 + "_ct");
                }
                int indexOf = lyVar2.x.indexOf(fjVar5);
                ArrayList arrayList21 = lyVar2.A;
                if (arrayList21 != null && indexOf >= 0 && indexOf < arrayList21.size()) {
                    TLRPC.InputMedia inputMedia2 = (TLRPC.InputMedia) lyVar2.A.get(indexOf);
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                        inputMedia2.flags |= 64;
                        inputMedia2.video_cover = tL_inputPhoto;
                    }
                }
                HashMap hashMap4 = lyVar2.E;
                if (hashMap4 != null) {
                    if (hashMap4.containsKey(str8 + "_t")) {
                        photoSize = (TLRPC.PhotoSize) lyVar2.E.get(str8 + "_t");
                    }
                }
                lyVar2.g = photoSize;
                if (inputMedia.thumb != null || photoSize == null || photoSize.location == null) {
                    zyVar4.t0(lyVar2, false);
                    return;
                } else {
                    lyVar2.p = true;
                    zyVar4.M(lyVar2, indexOf);
                    return;
                }
        }
    }

    public /* synthetic */ tj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ tj(Object obj, String str, String str2, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.h = str;
        this.c = str2;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ tj(zy zyVar, TLObject tLObject, TLRPC.InputMedia inputMedia, ly lyVar, String str, fj fjVar) {
        this.a = 11;
        this.b = zyVar;
        this.c = tLObject;
        this.d = inputMedia;
        this.e = lyVar;
        this.h = str;
        this.f = fjVar;
    }

    public /* synthetic */ tj(zy zyVar, TLRPC.TL_photo tL_photo, fj fjVar, File file, ly lyVar, String str) {
        this.a = 10;
        this.b = zyVar;
        this.c = tL_photo;
        this.d = fjVar;
        this.f = file;
        this.e = lyVar;
        this.h = str;
    }
}
