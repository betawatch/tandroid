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
import org.telegram.ui.Components.n31;
import org.telegram.ui.b90;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class zm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zm(f1 f1Var, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.d = obj;
        this.c = j10;
        this.e = obj2;
        this.f = obj3;
    }

    private final void a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        u10 u10Var = (u10) this.b;
        p10 p10Var = (p10) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        long j10 = this.c;
        synchronized (u10Var) {
            arrayList = p10Var.b;
            arrayList2 = p10Var.c;
        }
        if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
            ArrayList<TL_iv.RichMessage> arrayList3 = ((TLRPC.TL_messages_translatedRichMessage) tLObject).result;
            int min = Math.min(arrayList2.size(), arrayList3.size());
            for (int i10 = 0; i10 < min; i10++) {
                ((m20) arrayList2.get(i10)).a((Integer) arrayList.get(i10), arrayList3.get(i10), p10Var.d);
            }
        } else if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
            if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                at.e().k(at.P4, 1, dd.L0(2131743972, null));
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                ((m20) arrayList2.get(i11)).a((Integer) arrayList.get(i11), null, p10Var.d);
            }
        } else {
            u10Var.K(j10, false);
            at.e().k(at.P4, 1, dd.L0(2131743971, null));
        }
        synchronized (u10Var) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                try {
                    u10Var.x.remove(arrayList.get(i12));
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
    
        org.telegram.messenger.f8.g(r0, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ac A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        Uri uri;
        File file;
        boolean z10;
        ZipInputStream zipInputStream;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i11;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i12;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TLRPC.TL_textWithEntities tL_textWithEntities5;
        switch (this.a) {
            case 0:
                wp wpVar = (wp) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                r20 r20Var = (r20) this.e;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.f;
                long j10 = this.c;
                wpVar.getClass();
                wpVar.V3(updates.users, false);
                wpVar.P3(updates.chats, false);
                if (r20Var != null) {
                    r20Var.a(tL_messages_invitedUsers);
                    return;
                } else {
                    org.telegram.ui.Components.s4.f(wpVar.currentAccount, wpVar.L0(Long.valueOf(j10)), tL_messages_invitedUsers);
                    return;
                }
            case 1:
                wp wpVar2 = (wp) this.b;
                ArrayList arrayList4 = (ArrayList) this.d;
                long j11 = this.c;
                sp spVar = (sp) this.e;
                Integer num = (Integer) this.f;
                if (arrayList4 == null) {
                    wpVar2.A1.l(j11);
                    return;
                }
                wpVar2.getClass();
                spVar.c = SystemClock.elapsedRealtime();
                spVar.d = false;
                spVar.a = arrayList4;
                spVar.b = num;
                wpVar2.getNotificationCenter().k(15, Long.valueOf(j11), arrayList4);
                return;
            case 2:
                wp wpVar3 = (wp) this.b;
                TLObject tLObject = (TLObject) this.d;
                long j12 = this.c;
                TLRPC.messages_SavedReactionTags messages_savedreactiontags = (TLRPC.messages_SavedReactionTags) this.e;
                TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags = (TLRPC.TL_messages_getSavedReactionTags) this.f;
                if (tLObject instanceof TLRPC.TL_messages_savedReactionsTags) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = (TLRPC.TL_messages_savedReactionsTags) tLObject;
                    wpVar3.b8.k(tL_messages_savedReactionsTags, j12);
                    wpVar3.getNotificationCenter().k(203, Long.valueOf(j12));
                    wpVar3.t4(j12, tL_messages_savedReactionsTags);
                    return;
                }
                if ((tLObject instanceof TLRPC.TL_messages_savedReactionsTagsNotModified) && messages_savedreactiontags == null && tL_messages_getSavedReactionTags.hash == 0) {
                    TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags2 = new TLRPC.TL_messages_savedReactionsTags();
                    wpVar3.b8.k(tL_messages_savedReactionsTags2, j12);
                    wpVar3.getNotificationCenter().k(203, Long.valueOf(j12));
                    wpVar3.t4(j12, tL_messages_savedReactionsTags2);
                    return;
                }
                return;
            case 3:
                rz rzVar = (rz) this.b;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j13 = this.c;
                Uri uri2 = (Uri) this.e;
                final b90 b90Var = (b90) this.f;
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                ArrayList arrayList6 = arrayList5;
                iz izVar = new iz(rzVar);
                izVar.b = arrayList6;
                izVar.j = j13;
                izVar.g = rzVar.getMessagesController().i1(j13);
                HashMap hashMap = new HashMap();
                int size = arrayList6.size();
                int i13 = 0;
                while (i13 < size + 1) {
                    Uri uri3 = i13 == 0 ? uri2 : (Uri) arrayList6.get(i13 - 1);
                    if (uri3 == null || i0.I1(uri3, 0)) {
                        i10 = i13;
                        uri = uri2;
                        if (i10 == 0) {
                            final int i14 = 0;
                            i0.g3(new Runnable() { // from class: org.telegram.messenger.az
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            b90Var.run(0L);
                                            break;
                                        case 1:
                                            b90Var.run(0L);
                                            break;
                                        default:
                                            b90 b90Var2 = b90Var;
                                            Toast.makeText(w0.b, dd.L0(2131749259, null), 0).show();
                                            b90Var2.run(0L);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                    } else {
                        String q6 = b8.q(MediaController.A(uri2));
                        String str = (q6 == null || !q6.endsWith(".zip")) ? "txt" : "zip";
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
                                            i10 = i13;
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
                                                    i10 = i13;
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
                                                    i13 = i13;
                                                    file2 = file2;
                                                }
                                            }
                                        }
                                    }
                                    zipInputStream.closeEntry();
                                } catch (Throwable th6) {
                                    th = th6;
                                    i10 = i13;
                                }
                            } catch (IOException e) {
                                e = e;
                                i10 = i13;
                                file = file2;
                            } catch (Exception e7) {
                                e = e7;
                                i10 = i13;
                                file = file2;
                            }
                            try {
                                zipInputStream.close();
                                z10 = true;
                            } catch (IOException e10) {
                                e = e10;
                                z10 = true;
                                try {
                                    f8.g(e, true);
                                } catch (Exception e11) {
                                    e = e11;
                                    f8.g(e, z10);
                                    file.delete();
                                    if (t10 != null) {
                                    }
                                    i13 = i10 + 1;
                                    uri2 = uri;
                                }
                                file.delete();
                                if (t10 != null) {
                                }
                                i13 = i10 + 1;
                                uri2 = uri;
                            } catch (Exception e12) {
                                e = e12;
                                z10 = true;
                                f8.g(e, z10);
                                file.delete();
                                if (t10 != null) {
                                }
                                i13 = i10 + 1;
                                uri2 = uri;
                            }
                            file.delete();
                        } else {
                            i10 = i13;
                        }
                        if (t10 != null) {
                            continue;
                        } else {
                            File file3 = new File(t10);
                            if (file3.exists()) {
                                long length = file3.length();
                                if (length != 0) {
                                    String str2 = t10;
                                    izVar.h += length;
                                    if (i10 != 0) {
                                        izVar.f.add(str2);
                                    } else {
                                        if (length > 33554432) {
                                            file3.delete();
                                            final int i15 = 2;
                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.az
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i15) {
                                                        case 0:
                                                            b90Var.run(0L);
                                                            break;
                                                        case 1:
                                                            b90Var.run(0L);
                                                            break;
                                                        default:
                                                            b90 b90Var2 = b90Var;
                                                            Toast.makeText(w0.b, dd.L0(2131749259, null), 0).show();
                                                            b90Var2.run(0L);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        izVar.a = str2;
                                    }
                                    izVar.c.add(str2);
                                    hashMap.put(str2, izVar);
                                }
                            }
                            if (i10 == 0) {
                                final int i16 = 1;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.az
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                b90Var.run(0L);
                                                break;
                                            case 1:
                                                b90Var.run(0L);
                                                break;
                                            default:
                                                b90 b90Var2 = b90Var;
                                                Toast.makeText(w0.b, dd.L0(2131749259, null), 0).show();
                                                b90Var2.run(0L);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                    i13 = i10 + 1;
                    uri2 = uri;
                }
                i0.g3(new zm(rzVar, hashMap, j13, izVar, b90Var, 4));
                return;
            case 4:
                rz rzVar2 = (rz) this.b;
                HashMap hashMap2 = (HashMap) this.d;
                long j14 = this.c;
                iz izVar2 = (iz) this.e;
                b90 b90Var2 = (b90) this.f;
                rzVar2.y.putAll(hashMap2);
                rzVar2.D.k(izVar2, j14);
                rzVar2.getFileLoader().h0(izVar2.a, false, true, 0L, 67108864, true);
                rzVar2.getNotificationCenter().k(at.v1, Long.valueOf(j14));
                b90Var2.run(j14);
                try {
                    w0.b.startService(new Intent(w0.b, (Class<?>) ImportingService.class));
                    return;
                } catch (Throwable th7) {
                    f8.g(th7, true);
                    return;
                }
            case 5:
                a();
                return;
            default:
                u10 u10Var = (u10) this.b;
                o10 o10Var = (o10) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                long j15 = this.c;
                synchronized (u10Var) {
                    arrayList = o10Var.b;
                    arrayList2 = o10Var.d;
                    arrayList3 = o10Var.c;
                }
                if (tLObject2 instanceof TLRPC.TL_messages_translateResult) {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList7 = ((TLRPC.TL_messages_translateResult) tLObject2).result;
                    ArrayList arrayList8 = new ArrayList();
                    int size2 = arrayList3.size();
                    int i17 = 0;
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj = arrayList3.get(i18);
                        i18++;
                        Pair pair = (Pair) obj;
                        r10 r10Var = (r10) pair.first;
                        r10 r10Var2 = (r10) pair.second;
                        r10 r10Var3 = new r10();
                        if (r10Var2 != null && (tL_textWithEntities5 = r10Var2.a) != null) {
                            r10Var3.a = tL_textWithEntities5;
                        } else if (r10Var.a != null) {
                            if (i17 >= arrayList7.size()) {
                                tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            } else {
                                tL_textWithEntities = arrayList7.get(i17);
                                i17++;
                            }
                            r10Var3.a = n31.P0(r10Var.a, tL_textWithEntities);
                        }
                        if (r10Var.b.size() != (r10Var2 == null ? 0 : r10Var2.b.size())) {
                            ArrayList arrayList9 = r10Var.b;
                            int size3 = arrayList9.size();
                            i11 = size2;
                            int i19 = 0;
                            while (i19 < size3) {
                                Object obj2 = arrayList9.get(i19);
                                int i20 = i19 + 1;
                                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) obj2;
                                ArrayList arrayList10 = arrayList9;
                                if (i17 >= arrayList7.size()) {
                                    tL_textWithEntities4 = new TLRPC.TL_textWithEntities();
                                    i12 = i17;
                                } else {
                                    i12 = i17 + 1;
                                    tL_textWithEntities4 = arrayList7.get(i17);
                                }
                                TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                                tL_pollAnswer.text = tL_textWithEntities4;
                                tL_pollAnswer.option = pollAnswer.option;
                                r10Var3.b.add(tL_pollAnswer);
                                arrayList9 = arrayList10;
                                i19 = i20;
                                i17 = i12;
                            }
                        } else {
                            i11 = size2;
                            if (r10Var2 != null) {
                                r10Var3.b = r10Var2.b;
                            }
                        }
                        if (r10Var2 != null && (tL_textWithEntities3 = r10Var2.c) != null) {
                            r10Var3.c = tL_textWithEntities3;
                        } else if (r10Var.c != null) {
                            if (i17 >= arrayList7.size()) {
                                tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities6 = arrayList7.get(i17);
                                i17++;
                                tL_textWithEntities2 = tL_textWithEntities6;
                            }
                            r10Var3.c = n31.P0(r10Var.c, tL_textWithEntities2);
                        }
                        arrayList8.add(r10Var3);
                        size2 = i11;
                    }
                    int min = Math.min(arrayList2.size(), arrayList8.size());
                    for (int i21 = 0; i21 < min; i21++) {
                        ((m20) arrayList2.get(i21)).a((Integer) arrayList.get(i21), (r10) arrayList8.get(i21), o10Var.e);
                    }
                } else if (tL_error == null || !"TO_LANG_INVALID".equals(tL_error.text)) {
                    if (tL_error != null && "QUOTA_EXCEEDED".equals(tL_error.text)) {
                        at.e().k(at.P4, 1, dd.L0(2131743972, null));
                    }
                    for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                        ((m20) arrayList2.get(i22)).a((Integer) arrayList.get(i22), null, o10Var.e);
                    }
                } else {
                    u10Var.K(j15, false);
                    at.e().k(at.P4, 1, dd.L0(2131743971, null));
                }
                synchronized (u10Var) {
                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                        try {
                            u10Var.x.remove(arrayList.get(i23));
                        } finally {
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ zm(f1 f1Var, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.d = obj;
        this.e = obj2;
        this.f = tLObject;
        this.c = j10;
    }
}
