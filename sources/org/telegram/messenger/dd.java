package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class dd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dd(Object obj, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = j10;
    }

    private final void a() {
        c cVar = (c) this.d;
        qz C = qz.C(cVar.a);
        ArrayList arrayList = (ArrayList) C.a.get("group_" + this.c);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        cz czVar = (cz) arrayList.get(0);
        jj jjVar = (jj) i0.a.g(1, czVar.x);
        czVar.G = jjVar.f1();
        jjVar.k.params.put("final", "1");
        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
        tL_messages_messages.messages.add(jjVar.k);
        if (!czVar.I && !czVar.J) {
            hs.a0(cVar.a).h1(-2, 0, this.b != 0 ? 1 : 0, czVar.a, 0L, tL_messages_messages, false);
        }
        C.t0(czVar, true);
    }

    private final void b() {
        m4.c cVar = ((org.telegram.ui.Cells.q1) this.d).Vb;
        if (cVar != null) {
            int i10 = this.b;
            if (i10 > 0) {
                i10 = ((SparseIntArray) cVar.c).get(i10, 0);
            }
            if (i10 == 0) {
                return;
            }
            ((l2.f) cVar.b).P(this.c, 0L, i10);
        }
    }

    private final void c() {
        Long l4 = (Long) this.d;
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        org.telegram.ui.un ha = org.telegram.ui.un.ha(l4.longValue());
        T.presentFragment(ha);
        TLRPC.Chat L0 = vp.r1(this.b).L0(Long.valueOf(-l4.longValue()));
        if (L0 != null) {
            i0.h3(new y80(ha, this.c, L0, 1), 250L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029c A[Catch: all -> 0x00e3, Exception -> 0x02a2, TryCatch #2 {all -> 0x00e3, blocks: (B:25:0x00ae, B:29:0x00b6, B:34:0x00bf, B:36:0x00ca, B:40:0x00d5, B:43:0x00f9, B:49:0x0128, B:51:0x012e, B:54:0x014a, B:61:0x0182, B:62:0x0185, B:109:0x0296, B:111:0x029c, B:112:0x02a6, B:115:0x02c5, B:117:0x02cb, B:122:0x02f6, B:138:0x0112), top: B:24:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ab A[Catch: all -> 0x0236, Exception -> 0x023a, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x023a, blocks: (B:64:0x0188, B:65:0x01a1, B:67:0x01a7, B:73:0x01ec, B:108:0x023d, B:114:0x02ab, B:124:0x02f9), top: B:63:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[Catch: all -> 0x00e3, Exception -> 0x0159, TRY_LEAVE, TryCatch #2 {all -> 0x00e3, blocks: (B:25:0x00ae, B:29:0x00b6, B:34:0x00bf, B:36:0x00ca, B:40:0x00d5, B:43:0x00f9, B:49:0x0128, B:51:0x012e, B:54:0x014a, B:61:0x0182, B:62:0x0185, B:109:0x0296, B:111:0x029c, B:112:0x02a6, B:115:0x02c5, B:117:0x02cb, B:122:0x02f6, B:138:0x0112), top: B:24:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a7 A[Catch: all -> 0x0236, Exception -> 0x023a, TRY_LEAVE, TryCatch #9 {Exception -> 0x023a, blocks: (B:64:0x0188, B:65:0x01a1, B:67:0x01a7, B:73:0x01ec, B:108:0x023d, B:114:0x02ab, B:124:0x02f9), top: B:63:0x0188 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0418  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        vp vpVar;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j10;
        String str;
        a0.h hVar;
        boolean z10;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i10;
        int intValue;
        int i11;
        int i12;
        boolean z11;
        long longValue;
        NativeByteBuffer byteBufferValue;
        int i13 = this.a;
        long j11 = this.c;
        int i14 = this.b;
        Object obj = this.d;
        switch (i13) {
            case 0:
                try {
                    SQLitePreparedStatement executeFast = ((nd) obj).getMessagesStorage().b.executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
                    executeFast.requery();
                    executeFast.bindInteger(1, i14);
                    executeFast.bindLong(2, j11);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.U1;
                ui.b0(i14).B1(this.c, mediaController.m1, null);
                mediaController.K1 = null;
                return;
            case 2:
                try {
                    SQLiteDatabase sQLiteDatabase = ((ui) obj).getMessagesStorage().b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j11 + " AND type = " + i14).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 3:
                vp vpVar2 = (vp) obj;
                long j12 = this.c;
                hs messagesStorage = vpVar2.getMessagesStorage();
                messagesStorage.getClass();
                String str2 = " AND mid <= ";
                try {
                    try {
                        arrayList2 = new ArrayList();
                        a0.h hVar2 = new a0.h();
                        arrayList3 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        long e10 = messagesStorage.getUserConfig().e();
                        SQLiteDatabase sQLiteDatabase2 = messagesStorage.b;
                        Locale locale2 = Locale.US;
                        j10 = -j12;
                        int i15 = 1;
                        int i16 = 0;
                        sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT uid, data, read_state, out, mention FROM messages_v2 WHERE uid = " + j10 + " AND mid <= " + i14, new Object[0]);
                        while (sQLiteCursor.next()) {
                            try {
                                try {
                                    str = str2;
                                    try {
                                        longValue = sQLiteCursor.longValue(i16);
                                    } catch (Exception e11) {
                                        e = e11;
                                        vpVar = vpVar2;
                                        hVar = hVar2;
                                        arrayList4 = arrayList7;
                                        arrayList5 = arrayList6;
                                        z11 = 1;
                                        try {
                                            messagesStorage.o(e, z11);
                                            z10 = z11;
                                            sQLiteCursor.dispose();
                                            messagesStorage.D(arrayList4, z10);
                                            i0.g3(new xp(messagesStorage, arrayList5, 8));
                                            messagesStorage.getFileLoader().getClass();
                                            b8.p(0, arrayList3);
                                            i10 = 0;
                                            while (i10 < hVar.m()) {
                                            }
                                            SQLiteDatabase sQLiteDatabase3 = messagesStorage.b;
                                            Locale locale3 = Locale.US;
                                            sQLiteDatabase3.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j12 + " AND pinned <= " + i14).stepThis().dispose();
                                            SQLiteDatabase sQLiteDatabase4 = messagesStorage.b;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                            sb2.append(j12);
                                            String str3 = str;
                                            sb2.append(str3);
                                            sb2.append(i14);
                                            sQLiteDatabase4.executeFast(sb2.toString()).stepThis().dispose();
                                            SQLiteCursor queryFinalized = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                            if (queryFinalized.next()) {
                                            }
                                            queryFinalized.dispose();
                                            if (intValue > 0) {
                                            }
                                            messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str3 + i14).stepThis().dispose();
                                            messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str3 + i14).stepThis().dispose();
                                            messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str3 + i14).stepThis().dispose();
                                            messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str3 + i14).stepThis().dispose();
                                            messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str3 + i14).stepThis().dispose();
                                            SQLiteDatabase sQLiteDatabase5 = messagesStorage.b;
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                            sb3.append(j10);
                                            sQLiteDatabase5.executeFast(sb3.toString()).stepThis().dispose();
                                            messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                            messagesStorage.l2(arrayList2);
                                            arrayList = arrayList2;
                                        } catch (Exception e12) {
                                            e = e12;
                                            sQLitePreparedStatement2 = null;
                                            messagesStorage.o(e, true);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement2 != null) {
                                            }
                                            arrayList = null;
                                            vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                                            return;
                                        }
                                        vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                                        return;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    str = str2;
                                }
                                try {
                                    if (longValue != e10) {
                                        try {
                                            int intValue2 = sQLiteCursor.intValue(2);
                                            if (sQLiteCursor.intValue(3) == 0) {
                                                Integer[] numArr = (Integer[]) hVar2.f(longValue);
                                                if (numArr == null) {
                                                    vpVar = vpVar2;
                                                    try {
                                                        Integer[] numArr2 = new Integer[2];
                                                        numArr2[0] = 0;
                                                        numArr2[i15] = 0;
                                                        hVar2.k(numArr2, longValue);
                                                        numArr = numArr2;
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        hVar = hVar2;
                                                        arrayList4 = arrayList7;
                                                        arrayList5 = arrayList6;
                                                        z11 = i15;
                                                        messagesStorage.o(e, z11);
                                                        z10 = z11;
                                                        sQLiteCursor.dispose();
                                                        messagesStorage.D(arrayList4, z10);
                                                        i0.g3(new xp(messagesStorage, arrayList5, 8));
                                                        messagesStorage.getFileLoader().getClass();
                                                        b8.p(0, arrayList3);
                                                        i10 = 0;
                                                        while (i10 < hVar.m()) {
                                                        }
                                                        SQLiteDatabase sQLiteDatabase32 = messagesStorage.b;
                                                        Locale locale32 = Locale.US;
                                                        sQLiteDatabase32.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j12 + " AND pinned <= " + i14).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase42 = messagesStorage.b;
                                                        StringBuilder sb22 = new StringBuilder();
                                                        sb22.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                                        sb22.append(j12);
                                                        String str32 = str;
                                                        sb22.append(str32);
                                                        sb22.append(i14);
                                                        sQLiteDatabase42.executeFast(sb22.toString()).stepThis().dispose();
                                                        SQLiteCursor queryFinalized2 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                                        if (queryFinalized2.next()) {
                                                        }
                                                        queryFinalized2.dispose();
                                                        if (intValue > 0) {
                                                        }
                                                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str32 + i14).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str32 + i14).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str32 + i14).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str32 + i14).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str32 + i14).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase52 = messagesStorage.b;
                                                        StringBuilder sb32 = new StringBuilder();
                                                        sb32.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                                        sb32.append(j10);
                                                        sQLiteDatabase52.executeFast(sb32.toString()).stepThis().dispose();
                                                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                                        messagesStorage.l2(arrayList2);
                                                        arrayList = arrayList2;
                                                        vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                                                        return;
                                                    }
                                                } else {
                                                    vpVar = vpVar2;
                                                }
                                                if (intValue2 < 2) {
                                                    numArr[i15] = Integer.valueOf(numArr[i15].intValue() + 1);
                                                }
                                                if (intValue2 == 0 || intValue2 == 2) {
                                                    numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                                                }
                                                byteBufferValue = sQLiteCursor.byteBufferValue(i15);
                                                if (byteBufferValue == null) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                    TLdeserialize.readAttachPath(byteBufferValue, messagesStorage.getUserConfig().n);
                                                    byteBufferValue.reuse();
                                                    hVar = hVar2;
                                                    try {
                                                        messagesStorage.b(TLdeserialize, arrayList3, arrayList7, arrayList6, false);
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        arrayList4 = arrayList7;
                                                        arrayList5 = arrayList6;
                                                        z11 = 1;
                                                        messagesStorage.o(e, z11);
                                                        z10 = z11;
                                                        sQLiteCursor.dispose();
                                                        messagesStorage.D(arrayList4, z10);
                                                        i0.g3(new xp(messagesStorage, arrayList5, 8));
                                                        messagesStorage.getFileLoader().getClass();
                                                        b8.p(0, arrayList3);
                                                        i10 = 0;
                                                        while (i10 < hVar.m()) {
                                                        }
                                                        SQLiteDatabase sQLiteDatabase322 = messagesStorage.b;
                                                        Locale locale322 = Locale.US;
                                                        sQLiteDatabase322.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j12 + " AND pinned <= " + i14).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase422 = messagesStorage.b;
                                                        StringBuilder sb222 = new StringBuilder();
                                                        sb222.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                                        sb222.append(j12);
                                                        String str322 = str;
                                                        sb222.append(str322);
                                                        sb222.append(i14);
                                                        sQLiteDatabase422.executeFast(sb222.toString()).stepThis().dispose();
                                                        SQLiteCursor queryFinalized22 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                                        if (queryFinalized22.next()) {
                                                        }
                                                        queryFinalized22.dispose();
                                                        if (intValue > 0) {
                                                        }
                                                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str322 + i14).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str322 + i14).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str322 + i14).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str322 + i14).stepThis().dispose();
                                                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str322 + i14).stepThis().dispose();
                                                        SQLiteDatabase sQLiteDatabase522 = messagesStorage.b;
                                                        StringBuilder sb322 = new StringBuilder();
                                                        sb322.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                                        sb322.append(j10);
                                                        sQLiteDatabase522.executeFast(sb322.toString()).stepThis().dispose();
                                                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                                        messagesStorage.l2(arrayList2);
                                                        arrayList = arrayList2;
                                                        vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                                                        return;
                                                    }
                                                } else {
                                                    hVar = hVar2;
                                                }
                                                hVar2 = hVar;
                                                arrayList6 = arrayList6;
                                                arrayList7 = arrayList7;
                                                str2 = str;
                                                vpVar2 = vpVar;
                                                i16 = 0;
                                                i15 = 1;
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            vpVar = vpVar2;
                                        }
                                    }
                                    byteBufferValue = sQLiteCursor.byteBufferValue(i15);
                                    if (byteBufferValue == null) {
                                    }
                                    hVar2 = hVar;
                                    arrayList6 = arrayList6;
                                    arrayList7 = arrayList7;
                                    str2 = str;
                                    vpVar2 = vpVar;
                                    i16 = 0;
                                    i15 = 1;
                                } catch (Exception e17) {
                                    e = e17;
                                    hVar = hVar2;
                                    arrayList4 = arrayList7;
                                    arrayList5 = arrayList6;
                                    z11 = 1;
                                    messagesStorage.o(e, z11);
                                    z10 = z11;
                                    sQLiteCursor.dispose();
                                    messagesStorage.D(arrayList4, z10);
                                    i0.g3(new xp(messagesStorage, arrayList5, 8));
                                    messagesStorage.getFileLoader().getClass();
                                    b8.p(0, arrayList3);
                                    i10 = 0;
                                    while (i10 < hVar.m()) {
                                    }
                                    SQLiteDatabase sQLiteDatabase3222 = messagesStorage.b;
                                    Locale locale3222 = Locale.US;
                                    sQLiteDatabase3222.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j12 + " AND pinned <= " + i14).stepThis().dispose();
                                    SQLiteDatabase sQLiteDatabase4222 = messagesStorage.b;
                                    StringBuilder sb2222 = new StringBuilder();
                                    sb2222.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                                    sb2222.append(j12);
                                    String str3222 = str;
                                    sb2222.append(str3222);
                                    sb2222.append(i14);
                                    sQLiteDatabase4222.executeFast(sb2222.toString()).stepThis().dispose();
                                    SQLiteCursor queryFinalized222 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                                    if (queryFinalized222.next()) {
                                    }
                                    queryFinalized222.dispose();
                                    if (intValue > 0) {
                                    }
                                    messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str3222 + i14).stepThis().dispose();
                                    messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str3222 + i14).stepThis().dispose();
                                    messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str3222 + i14).stepThis().dispose();
                                    messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str3222 + i14).stepThis().dispose();
                                    messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str3222 + i14).stepThis().dispose();
                                    SQLiteDatabase sQLiteDatabase5222 = messagesStorage.b;
                                    StringBuilder sb3222 = new StringBuilder();
                                    sb3222.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                                    sb3222.append(j10);
                                    sQLiteDatabase5222.executeFast(sb3222.toString()).stepThis().dispose();
                                    messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                                    messagesStorage.l2(arrayList2);
                                    arrayList = arrayList2;
                                    vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                                    return;
                                }
                                vpVar = vpVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement = null;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        }
                        str = str2;
                        vpVar = vpVar2;
                        hVar = hVar2;
                        arrayList4 = arrayList7;
                        arrayList5 = arrayList6;
                        z10 = true;
                        sQLiteCursor.dispose();
                    } catch (Exception e18) {
                        e = e18;
                        vpVar = vpVar2;
                    }
                    try {
                        messagesStorage.D(arrayList4, z10);
                        i0.g3(new xp(messagesStorage, arrayList5, 8));
                        messagesStorage.getFileLoader().getClass();
                        b8.p(0, arrayList3);
                        i10 = 0;
                        while (i10 < hVar.m()) {
                            long j13 = hVar.j(i10);
                            Integer[] numArr3 = (Integer[]) hVar.n(i10);
                            int i17 = i10;
                            SQLiteCursor queryFinalized3 = messagesStorage.b.queryFinalized("SELECT unread_count, unread_count_i FROM dialogs WHERE did = " + j13, new Object[0]);
                            try {
                                if (queryFinalized3.next()) {
                                    i11 = queryFinalized3.intValue(0);
                                    i12 = queryFinalized3.intValue(1);
                                } else {
                                    i11 = 0;
                                    i12 = 0;
                                }
                                queryFinalized3.dispose();
                                arrayList2.add(Long.valueOf(j13));
                                sQLitePreparedStatement2 = messagesStorage.b.executeFast("UPDATE dialogs SET unread_count = ?, unread_count_i = ? WHERE did = ?");
                                try {
                                    sQLitePreparedStatement2.requery();
                                    sQLitePreparedStatement2.bindInteger(1, Math.max(0, i11 - numArr3[0].intValue()));
                                    sQLitePreparedStatement2.bindInteger(2, Math.max(0, i12 - numArr3[1].intValue()));
                                    sQLitePreparedStatement2.bindLong(3, j13);
                                    sQLitePreparedStatement2.step();
                                    sQLitePreparedStatement2.dispose();
                                    i10 = i17 + 1;
                                } catch (Exception e19) {
                                    e = e19;
                                    sQLiteCursor = null;
                                    messagesStorage.o(e, true);
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    arrayList = null;
                                    vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLitePreparedStatement = sQLitePreparedStatement2;
                                    sQLiteCursor = null;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            } catch (Exception e20) {
                                e = e20;
                                sQLiteCursor = queryFinalized3;
                                sQLitePreparedStatement2 = null;
                                messagesStorage.o(e, true);
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                arrayList = null;
                                vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                sQLiteCursor = queryFinalized3;
                                sQLitePreparedStatement = null;
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase32222 = messagesStorage.b;
                        Locale locale32222 = Locale.US;
                        sQLiteDatabase32222.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + j12 + " AND pinned <= " + i14).stepThis().dispose();
                        SQLiteDatabase sQLiteDatabase42222 = messagesStorage.b;
                        StringBuilder sb22222 = new StringBuilder();
                        sb22222.append("DELETE FROM chat_pinned_v2 WHERE uid = ");
                        sb22222.append(j12);
                        String str32222 = str;
                        sb22222.append(str32222);
                        sb22222.append(i14);
                        sQLiteDatabase42222.executeFast(sb22222.toString()).stepThis().dispose();
                        SQLiteCursor queryFinalized2222 = messagesStorage.b.queryFinalized("SELECT changes()", new Object[0]);
                        intValue = queryFinalized2222.next() ? queryFinalized2222.intValue(0) : 0;
                        queryFinalized2222.dispose();
                        if (intValue > 0) {
                            sQLiteCursor = messagesStorage.b.queryFinalized("SELECT count FROM chat_pinned_count WHERE uid = " + j10, new Object[0]);
                            if (sQLiteCursor.next()) {
                                int intValue3 = sQLiteCursor.intValue(0);
                                sQLitePreparedStatement2 = messagesStorage.b.executeFast("UPDATE chat_pinned_count SET count = ? WHERE uid = ?");
                                try {
                                    try {
                                        sQLitePreparedStatement2.requery();
                                        sQLitePreparedStatement2.bindInteger(1, Math.max(0, intValue3 - intValue));
                                        sQLitePreparedStatement2.bindLong(2, j10);
                                        sQLitePreparedStatement2.step();
                                        sQLitePreparedStatement2.dispose();
                                    } catch (Exception e21) {
                                        e = e21;
                                        messagesStorage.o(e, true);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                            sQLitePreparedStatement2.dispose();
                                        }
                                        arrayList = null;
                                        vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                                        return;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLitePreparedStatement = sQLitePreparedStatement2;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    throw th;
                                }
                            }
                            sQLiteCursor.dispose();
                        }
                        messagesStorage.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10 + str32222 + i14).stepThis().dispose();
                        messagesStorage.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10 + str32222 + i14).stepThis().dispose();
                        messagesStorage.b.executeFast("DELETE FROM widget_heights WHERE uid = " + j10 + str32222 + i14).stepThis().dispose();
                        messagesStorage.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + str32222 + i14).stepThis().dispose();
                        messagesStorage.b.executeFast("DELETE FROM media_v4 WHERE uid = " + j10 + str32222 + i14).stepThis().dispose();
                        SQLiteDatabase sQLiteDatabase52222 = messagesStorage.b;
                        StringBuilder sb32222 = new StringBuilder();
                        sb32222.append("UPDATE media_counts_v2 SET old = 1 WHERE uid = ");
                        sb32222.append(j10);
                        sQLiteDatabase52222.executeFast(sb32222.toString()).stepThis().dispose();
                        messagesStorage.b.executeFast("UPDATE media_counts_topics SET old = 1 WHERE uid = " + j10).stepThis().dispose();
                        messagesStorage.l2(arrayList2);
                        arrayList = arrayList2;
                    } catch (Exception e22) {
                        e = e22;
                        sQLiteCursor = null;
                        sQLitePreparedStatement2 = null;
                        messagesStorage.o(e, true);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        arrayList = null;
                        vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                        return;
                    }
                    vpVar.getMessagesStorage().R1(j12, -j12, new ArrayList(), arrayList);
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = null;
                }
                break;
            case 4:
                a();
                return;
            case 5:
                b();
                return;
            case 6:
                zt0.g((zt0) obj, j11, i14);
                return;
            case 7:
                c();
                return;
            default:
                th.e5 e5Var = (th.e5) obj;
                int max = Math.max(e5Var.f.get(j11, 0), i14);
                e5Var.f.put(j11, max);
                e5Var.k.i(max, j11);
                TL_stories.PeerStories y3 = e5Var.y(j11);
                if (y3 != null && i14 > y3.max_read_id) {
                    y3.max_read_id = i14;
                    Collections.sort(e5Var.g, e5Var.J);
                    zs.f(e5Var.a).k(zs.v5, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ dd(Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = j10;
        this.b = i10;
    }
}
