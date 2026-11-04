package org.telegram.messenger;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f21;
import org.telegram.ui.w70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class bm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bm(c1 c1Var, Object obj, long j10, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = c1Var;
        this.d = obj;
        this.c = j10;
        this.e = obj2;
        this.f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        x00 x00Var = (x00) this.b;
        s00 s00Var = (s00) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        long j10 = this.c;
        synchronized (x00Var) {
            arrayList = s00Var.b;
            arrayList2 = s00Var.c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i3 = 0; i3 < min; i3++) {
                ((p10) arrayList2.get(i3)).a((Integer) arrayList.get(i3), arrayList3.get(i3), s00Var.d);
            }
        } else if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                hs.e().k(hs.P4, 1, bd.M0(2131743957, null));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((p10) arrayList2.get(i10)).a((Integer) arrayList.get(i10), null, s00Var.d);
            }
        } else {
            x00Var.K(j10, false);
            hs.e().k(hs.P4, 1, bd.M0(2131743956, null));
        }
        synchronized (x00Var) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    x00Var.x.remove(arrayList.get(i11));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:124|(6:125|126|127|128|(1:(2:213|214)(3:130|(3:210|211|212)(5:132|133|(1:135)|136|(4:141|142|143|(3:144|145|(4:147|148|149|151)(2:200|201)))(2:138|139))|140))|202)|(3:203|204|205)|163|164) */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0349, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x034a, code lost:
    
        org.telegram.messenger.a8.g(r0, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ac A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        Uri uri;
        File file;
        boolean z10;
        ZipInputStream zipInputStream;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i11;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TLRPC.TL_textWithEntities tL_textWithEntities5;
        switch (this.a) {
            case 0:
                hp hpVar = (hp) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                u10 u10Var = (u10) this.e;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.f;
                long j10 = this.c;
                hpVar.getClass();
                hpVar.Y3(updates.users, false);
                hpVar.S3(updates.chats, false);
                if (u10Var != null) {
                    u10Var.a(tL_messages_invitedUsers);
                    return;
                } else {
                    org.telegram.ui.Components.t4.f(hpVar.currentAccount, hpVar.M0(Long.valueOf(j10)), tL_messages_invitedUsers);
                    return;
                }
            case 1:
                hp hpVar2 = (hp) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                long j11 = this.c;
                dp dpVar = (dp) this.e;
                Integer num = (Integer) this.f;
                if (arrayList4 == null) {
                    hpVar2.B1.l(j11);
                    return;
                }
                hpVar2.getClass();
                dpVar.c = SystemClock.elapsedRealtime();
                dpVar.d = false;
                dpVar.a = arrayList4;
                dpVar.b = num;
                hpVar2.getNotificationCenter().k(15, Long.valueOf(j11), arrayList4);
                return;
            case 2:
                hp hpVar3 = (hp) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j12 = this.c;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.e;
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = (TLRPC.TL_messages_getSavedReactionTags) this.f;
                if (tLObject instanceof TLRPC.TL_messages_savedReactionsTags) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) tLObject;
                    hpVar3.a8.k(tL_messages_savedReactionsTags, j12);
                    hpVar3.getNotificationCenter().k(203, Long.valueOf(j12));
                    hpVar3.w4(j12, tL_messages_savedReactionsTags);
                    return;
                }
                if ((tLObject instanceof TLRPC.TL_messages_savedReactionsTagsNotModified) && messages_savedreactiontags == null && tL_messages_getSavedReactionTags.hash == 0) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                    hpVar3.a8.k(tL_messages_savedReactionsTags2, j12);
                    hpVar3.getNotificationCenter().k(203, Long.valueOf(j12));
                    hpVar3.w4(j12, tL_messages_savedReactionsTags2);
                    return;
                }
                return;
            case 3:
                yy yyVar = (yy) this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j13 = this.c;
                Uri uri2 = (Uri) this.e;
                final w70 w70Var = (w70) this.f;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                ArrayList arrayList6 = arrayList5;
                py pyVar = new py(yyVar);
                pyVar.b = arrayList6;
                pyVar.j = j13;
                pyVar.g = yyVar.getMessagesController().j1(j13);
                HashMap hashMap = new HashMap();
                int size = arrayList6.size();
                int i12 = 0;
                while (i12 < size + 1) {
                    Uri uri3 = i12 == 0 ? uri2 : (Uri) arrayList6.get(i12 - 1);
                    if (uri3 == null || g0.I1(uri3, 0)) {
                        i3 = i12;
                        uri = uri2;
                        if (i3 == 0) {
                            final int i13 = 0;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.hy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            w70Var.run(0L);
                                            break;
                                        case 1:
                                            w70Var.run(0L);
                                            break;
                                        default:
                                            w70 w70Var2 = w70Var;
                                            Toast.makeText(t0.b, bd.M0(2131749258, null), 0).show();
                                            w70Var2.run(0L);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    } else {
                        String q10 = w7.q(MediaController.A(uri2));
                        String str = (q10 == null || !q10.endsWith(".zip")) ? "txt" : "zip";
                        uri = uri2;
                        String t10 = MediaController.t(-1L, uri3, str);
                        if ("zip".equals(str)) {
                            File file2 = new File(t10);
                            try {
                                zipInputStream = new ZipInputStream(new FileInputStream(file2));
                                try {
                                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                                    while (true) {
                                        if (nextEntry == null) {
                                            i3 = i12;
                                            file = file2;
                                        } else {
                                            String name = nextEntry.getName();
                                            if (name == null) {
                                                nextEntry = zipInputStream.getNextEntry();
                                            } else {
                                                int lastIndexOf = name.lastIndexOf("/");
                                                if (lastIndexOf >= 0) {
                                                    name = name.substring(lastIndexOf + 1);
                                                }
                                                if (name.endsWith(".txt")) {
                                                    File u10 = MediaController.u(name);
                                                    t10 = u10.getAbsolutePath();
                                                    FileOutputStream fileOutputStream = new FileOutputStream(u10);
                                                    byte[] bArr = new byte[1024];
                                                    i3 = i12;
                                                    while (true) {
                                                        try {
                                                            int read = zipInputStream.read(bArr);
                                                            if (read > 0) {
                                                                file = file2;
                                                                try {
                                                                    fileOutputStream.write(bArr, 0, read);
                                                                    file2 = file;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Throwable th3 = th;
                                                                    try {
                                                                        zipInputStream.close();
                                                                    } catch (Throwable th4) {
                                                                        th3.addSuppressed(th4);
                                                                    }
                                                                    throw th3;
                                                                    break;
                                                                }
                                                            } else {
                                                                file = file2;
                                                                fileOutputStream.close();
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            file = file2;
                                                            Throwable th32 = th;
                                                            zipInputStream.close();
                                                            throw th32;
                                                        }
                                                    }
                                                } else {
                                                    nextEntry = zipInputStream.getNextEntry();
                                                    i12 = i12;
                                                    file2 = file2;
                                                }
                                            }
                                        }
                                    }
                                    zipInputStream.closeEntry();
                                } catch (Throwable th6) {
                                    th = th6;
                                    i3 = i12;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                i3 = i12;
                                file = file2;
                            } catch (Exception e11) {
                                e = e11;
                                i3 = i12;
                                file = file2;
                            }
                            try {
                                zipInputStream.close();
                                z10 = true;
                            } catch (IOException e12) {
                                e = e12;
                                z10 = true;
                                try {
                                    a8.g(e, true);
                                } catch (Exception e13) {
                                    e = e13;
                                    a8.g(e, z10);
                                    file.delete();
                                    if (t10 != null) {
                                    }
                                    i12 = i3 + 1;
                                    uri2 = uri;
                                }
                                file.delete();
                                if (t10 != null) {
                                }
                                i12 = i3 + 1;
                                uri2 = uri;
                            } catch (Exception e14) {
                                e = e14;
                                z10 = true;
                                a8.g(e, z10);
                                file.delete();
                                if (t10 != null) {
                                }
                                i12 = i3 + 1;
                                uri2 = uri;
                            }
                            file.delete();
                        } else {
                            i3 = i12;
                        }
                        if (t10 != null) {
                            continue;
                        } else {
                            File file3 = new File(t10);
                            if (file3.exists()) {
                                long length = file3.length();
                                if (length != 0) {
                                    String str2 = t10;
                                    pyVar.h += length;
                                    if (i3 != 0) {
                                        pyVar.f.add(str2);
                                    } else {
                                        if (length > 33554432) {
                                            file3.delete();
                                            final int i14 = 2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.hy
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i14) {
                                                        case 0:
                                                            w70Var.run(0L);
                                                            break;
                                                        case 1:
                                                            w70Var.run(0L);
                                                            break;
                                                        default:
                                                            w70 w70Var2 = w70Var;
                                                            Toast.makeText(t0.b, bd.M0(2131749258, null), 0).show();
                                                            w70Var2.run(0L);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        pyVar.a = str2;
                                    }
                                    pyVar.c.add(str2);
                                    hashMap.put(str2, pyVar);
                                }
                            }
                            if (i3 == 0) {
                                final int i15 = 1;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.hy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                w70Var.run(0L);
                                                break;
                                            case 1:
                                                w70Var.run(0L);
                                                break;
                                            default:
                                                w70 w70Var2 = w70Var;
                                                Toast.makeText(t0.b, bd.M0(2131749258, null), 0).show();
                                                w70Var2.run(0L);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    i12 = i3 + 1;
                    uri2 = uri;
                }
                g0.h3(new bm(yyVar, hashMap, j13, pyVar, w70Var, 4));
                return;
            case 4:
                yy yyVar2 = (yy) this.b;
                HashMap hashMap2 = (HashMap) this.d;
                long j14 = this.c;
                py pyVar2 = (py) this.e;
                w70 w70Var2 = (w70) this.f;
                yyVar2.y.putAll(hashMap2);
                yyVar2.E.k(pyVar2, j14);
                yyVar2.getFileLoader().h0(pyVar2.a, false, true, 0L, 67108864, true);
                yyVar2.getNotificationCenter().k(hs.v1, Long.valueOf(j14));
                w70Var2.run(j14);
                try {
                    t0.b.startService(new Intent(t0.b, (Class<?>) ImportingService.class));
                    return;
                } catch (Throwable th7) {
                    a8.g(th7, true);
                    return;
                }
            case 5:
                a();
                return;
            default:
                x00 x00Var = (x00) this.b;
                r00 r00Var = (r00) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                long j15 = this.c;
                synchronized (x00Var) {
                    arrayList = r00Var.b;
                    arrayList2 = r00Var.d;
                    arrayList3 = r00Var.c;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList7 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    ArrayList arrayList8 = new ArrayList();
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    int i17 = 0;
                    while (i17 < size2) {
                        Object obj = arrayList3.get(i17);
                        i17++;
                        Pair pair = (Pair) obj;
                        u00 u00Var = (u00) pair.first;
                        u00 u00Var2 = (u00) pair.second;
                        u00 u00Var3 = new u00();
                        if (u00Var2 != null && (tL_textWithEntities5 = u00Var2.a) != null) {
                            u00Var3.a = tL_textWithEntities5;
                        } else if (u00Var.a != null) {
                            if (i16 >= arrayList7.size()) {
                                tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            } else {
                                tL_textWithEntities = arrayList7.get(i16);
                                i16++;
                            }
                            u00Var3.a = f21.P0(u00Var.a, tL_textWithEntities);
                        }
                        if (u00Var.b.size() != (u00Var2 == null ? 0 : u00Var2.b.size())) {
                            ArrayList arrayList9 = u00Var.b;
                            int size3 = arrayList9.size();
                            i10 = size2;
                            int i18 = 0;
                            while (i18 < size3) {
                                Object obj2 = arrayList9.get(i18);
                                int i19 = i18 + 1;
                                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) obj2;
                                ArrayList arrayList10 = arrayList9;
                                if (i16 >= arrayList7.size()) {
                                    tL_textWithEntities4 = new TLRPC.TL_textWithEntities();
                                    i11 = i16;
                                } else {
                                    i11 = i16 + 1;
                                    tL_textWithEntities4 = arrayList7.get(i16);
                                }
                                TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                                tL_pollAnswer.text = tL_textWithEntities4;
                                tL_pollAnswer.option = pollAnswer.option;
                                u00Var3.b.add(tL_pollAnswer);
                                arrayList9 = arrayList10;
                                i18 = i19;
                                i16 = i11;
                            }
                        } else {
                            i10 = size2;
                            if (u00Var2 != null) {
                                u00Var3.b = u00Var2.b;
                            }
                        }
                        if (u00Var2 != null && (tL_textWithEntities3 = u00Var2.c) != null) {
                            u00Var3.c = tL_textWithEntities3;
                        } else if (u00Var.c != null) {
                            if (i16 >= arrayList7.size()) {
                                tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList7.get(i16);
                                i16++;
                                tL_textWithEntities2 = tL_textWithEntities6;
                            }
                            u00Var3.c = f21.P0(u00Var.c, tL_textWithEntities2);
                        }
                        arrayList8.add(u00Var3);
                        size2 = i10;
                    }
                    int min = Math.min(arrayList2.size(), arrayList8.size());
                    for (int i20 = 0; i20 < min; i20++) {
                        ((p10) arrayList2.get(i20)).a((Integer) arrayList.get(i20), (u00) arrayList8.get(i20), r00Var.e);
                    }
                } else if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
                    if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                        hs.e().k(hs.P4, 1, bd.M0(2131743957, null));
                    }
                    for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                        ((p10) arrayList2.get(i21)).a((Integer) arrayList.get(i21), null, r00Var.e);
                    }
                } else {
                    x00Var.K(j15, false);
                    hs.e().k(hs.P4, 1, bd.M0(2131743956, null));
                }
                synchronized (x00Var) {
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        try {
                            x00Var.x.remove(arrayList.get(i22));
                        } finally {
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ bm(c1 c1Var, Object obj, Object obj2, TLObject tLObject, long j10, int i3) {
        this.a = i3;
        this.b = c1Var;
        this.d = obj;
        this.e = obj2;
        this.f = tLObject;
        this.c = j10;
    }
}
