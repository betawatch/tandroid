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
import org.telegram.ui.Components.p21;
import org.telegram.ui.a80;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class im implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ im(c1 c1Var, Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.d = obj;
        this.c = j3;
        this.e = obj2;
        this.f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        c10 c10Var = (c10) this.b;
        x00 x00Var = (x00) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        long j3 = this.c;
        synchronized (c10Var) {
            arrayList = x00Var.b;
            arrayList2 = x00Var.c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i7 = 0; i7 < min; i7++) {
                ((u10) arrayList2.get(i7)).a((Integer) arrayList.get(i7), arrayList3.get(i7), x00Var.d);
            }
        } else if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                ns.e().k(ns.P4, 1, hd.M0(2131743947, null));
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ((u10) arrayList2.get(i10)).a((Integer) arrayList.get(i10), null, x00Var.d);
            }
        } else {
            c10Var.K(j3, false);
            ns.e().k(ns.P4, 1, hd.M0(2131743946, null));
        }
        synchronized (c10Var) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    c10Var.x.remove(arrayList.get(i11));
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
        int i7;
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
                np npVar = (np) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                z10 z10Var = (z10) this.e;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.f;
                long j3 = this.c;
                npVar.getClass();
                npVar.Y3(updates.users, false);
                npVar.S3(updates.chats, false);
                if (z10Var != null) {
                    z10Var.a(tL_messages_invitedUsers);
                    return;
                } else {
                    org.telegram.ui.Components.t4.f(npVar.currentAccount, npVar.M0(Long.valueOf(j3)), tL_messages_invitedUsers);
                    return;
                }
            case 1:
                np npVar2 = (np) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                long j10 = this.c;
                jp jpVar = (jp) this.e;
                Integer num = (Integer) this.f;
                if (arrayList4 == null) {
                    npVar2.B1.l(j10);
                    return;
                }
                npVar2.getClass();
                jpVar.c = SystemClock.elapsedRealtime();
                jpVar.d = false;
                jpVar.a = arrayList4;
                jpVar.b = num;
                npVar2.getNotificationCenter().k(15, Long.valueOf(j10), arrayList4);
                return;
            case 2:
                np npVar3 = (np) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j11 = this.c;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.e;
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = (TLRPC.TL_messages_getSavedReactionTags) this.f;
                if (tLObject instanceof TLRPC.TL_messages_savedReactionsTags) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) tLObject;
                    npVar3.b8.k(tL_messages_savedReactionsTags, j11);
                    npVar3.getNotificationCenter().k(203, Long.valueOf(j11));
                    npVar3.w4(j11, tL_messages_savedReactionsTags);
                    return;
                }
                if ((tLObject instanceof TLRPC.TL_messages_savedReactionsTagsNotModified) && messages_savedreactiontags == null && tL_messages_getSavedReactionTags.hash == 0) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                    npVar3.b8.k(tL_messages_savedReactionsTags2, j11);
                    npVar3.getNotificationCenter().k(203, Long.valueOf(j11));
                    npVar3.w4(j11, tL_messages_savedReactionsTags2);
                    return;
                }
                return;
            case 3:
                ez ezVar = (ez) this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j12 = this.c;
                Uri uri2 = (Uri) this.e;
                final a80 a80Var = (a80) this.f;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                ArrayList arrayList6 = arrayList5;
                vy vyVar = new vy(ezVar);
                vyVar.b = arrayList6;
                vyVar.j = j12;
                vyVar.g = ezVar.getMessagesController().j1(j12);
                HashMap hashMap = new HashMap();
                int size = arrayList6.size();
                int i12 = 0;
                while (i12 < size + 1) {
                    Uri uri3 = i12 == 0 ? uri2 : (Uri) arrayList6.get(i12 - 1);
                    if (uri3 == null || g0.I1(uri3, 0)) {
                        i7 = i12;
                        uri = uri2;
                        if (i7 == 0) {
                            final int i13 = 0;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.my
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            a80Var.run(0L);
                                            break;
                                        case 1:
                                            a80Var.run(0L);
                                            break;
                                        default:
                                            a80 a80Var2 = a80Var;
                                            Toast.makeText(t0.b, hd.M0(2131749250, null), 0).show();
                                            a80Var2.run(0L);
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
                        String t6 = MediaController.t(-1L, uri3, str);
                        if ("zip".equals(str)) {
                            File file2 = new File(t6);
                            try {
                                zipInputStream = new ZipInputStream(new FileInputStream(file2));
                                try {
                                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                                    while (true) {
                                        if (nextEntry == null) {
                                            i7 = i12;
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
                                                    t6 = u10.getAbsolutePath();
                                                    FileOutputStream fileOutputStream = new FileOutputStream(u10);
                                                    byte[] bArr = new byte[1024];
                                                    i7 = i12;
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
                                    i7 = i12;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                i7 = i12;
                                file = file2;
                            } catch (Exception e11) {
                                e = e11;
                                i7 = i12;
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
                                    if (t6 != null) {
                                    }
                                    i12 = i7 + 1;
                                    uri2 = uri;
                                }
                                file.delete();
                                if (t6 != null) {
                                }
                                i12 = i7 + 1;
                                uri2 = uri;
                            } catch (Exception e14) {
                                e = e14;
                                z10 = true;
                                a8.g(e, z10);
                                file.delete();
                                if (t6 != null) {
                                }
                                i12 = i7 + 1;
                                uri2 = uri;
                            }
                            file.delete();
                        } else {
                            i7 = i12;
                        }
                        if (t6 != null) {
                            continue;
                        } else {
                            File file3 = new File(t6);
                            if (file3.exists()) {
                                long length = file3.length();
                                if (length != 0) {
                                    String str2 = t6;
                                    vyVar.h += length;
                                    if (i7 != 0) {
                                        vyVar.f.add(str2);
                                    } else {
                                        if (length > 33554432) {
                                            file3.delete();
                                            final int i14 = 2;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.my
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i14) {
                                                        case 0:
                                                            a80Var.run(0L);
                                                            break;
                                                        case 1:
                                                            a80Var.run(0L);
                                                            break;
                                                        default:
                                                            a80 a80Var2 = a80Var;
                                                            Toast.makeText(t0.b, hd.M0(2131749250, null), 0).show();
                                                            a80Var2.run(0L);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        vyVar.a = str2;
                                    }
                                    vyVar.c.add(str2);
                                    hashMap.put(str2, vyVar);
                                }
                            }
                            if (i7 == 0) {
                                final int i15 = 1;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.my
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                a80Var.run(0L);
                                                break;
                                            case 1:
                                                a80Var.run(0L);
                                                break;
                                            default:
                                                a80 a80Var2 = a80Var;
                                                Toast.makeText(t0.b, hd.M0(2131749250, null), 0).show();
                                                a80Var2.run(0L);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    i12 = i7 + 1;
                    uri2 = uri;
                }
                g0.h3(new im(ezVar, hashMap, j12, vyVar, a80Var, 4));
                return;
            case 4:
                ez ezVar2 = (ez) this.b;
                HashMap hashMap2 = (HashMap) this.d;
                long j13 = this.c;
                vy vyVar2 = (vy) this.e;
                a80 a80Var2 = (a80) this.f;
                ezVar2.y.putAll(hashMap2);
                ezVar2.E.k(vyVar2, j13);
                ezVar2.getFileLoader().g0(vyVar2.a, false, true, 0L, 67108864, true);
                ezVar2.getNotificationCenter().k(ns.v1, Long.valueOf(j13));
                a80Var2.run(j13);
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
                c10 c10Var = (c10) this.b;
                w00 w00Var = (w00) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                long j14 = this.c;
                synchronized (c10Var) {
                    arrayList = w00Var.b;
                    arrayList2 = w00Var.d;
                    arrayList3 = w00Var.c;
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
                        z00 z00Var = (z00) pair.first;
                        z00 z00Var2 = (z00) pair.second;
                        z00 z00Var3 = new z00();
                        if (z00Var2 != null && (tL_textWithEntities5 = z00Var2.a) != null) {
                            z00Var3.a = tL_textWithEntities5;
                        } else if (z00Var.a != null) {
                            if (i16 >= arrayList7.size()) {
                                tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            } else {
                                tL_textWithEntities = arrayList7.get(i16);
                                i16++;
                            }
                            z00Var3.a = p21.Q0(z00Var.a, tL_textWithEntities);
                        }
                        if (z00Var.b.size() != (z00Var2 == null ? 0 : z00Var2.b.size())) {
                            ArrayList arrayList9 = z00Var.b;
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
                                z00Var3.b.add(tL_pollAnswer);
                                arrayList9 = arrayList10;
                                i18 = i19;
                                i16 = i11;
                            }
                        } else {
                            i10 = size2;
                            if (z00Var2 != null) {
                                z00Var3.b = z00Var2.b;
                            }
                        }
                        if (z00Var2 != null && (tL_textWithEntities3 = z00Var2.c) != null) {
                            z00Var3.c = tL_textWithEntities3;
                        } else if (z00Var.c != null) {
                            if (i16 >= arrayList7.size()) {
                                tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList7.get(i16);
                                i16++;
                                tL_textWithEntities2 = tL_textWithEntities6;
                            }
                            z00Var3.c = p21.Q0(z00Var.c, tL_textWithEntities2);
                        }
                        arrayList8.add(z00Var3);
                        size2 = i10;
                    }
                    int min = Math.min(arrayList2.size(), arrayList8.size());
                    for (int i20 = 0; i20 < min; i20++) {
                        ((u10) arrayList2.get(i20)).a((Integer) arrayList.get(i20), (z00) arrayList8.get(i20), w00Var.e);
                    }
                } else if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
                    if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                        ns.e().k(ns.P4, 1, hd.M0(2131743947, null));
                    }
                    for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                        ((u10) arrayList2.get(i21)).a((Integer) arrayList.get(i21), null, w00Var.e);
                    }
                } else {
                    c10Var.K(j14, false);
                    ns.e().k(ns.P4, 1, hd.M0(2131743946, null));
                }
                synchronized (c10Var) {
                    for (int i22 = 0; i22 < arrayList.size(); i22++) {
                        try {
                            c10Var.x.remove(arrayList.get(i22));
                        } finally {
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ im(c1 c1Var, Object obj, Object obj2, TLObject tLObject, long j3, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.d = obj;
        this.e = obj2;
        this.f = tLObject;
        this.c = j3;
    }
}
