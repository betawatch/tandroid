package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nb(int i7, int i10, Object obj, TLObject tLObject, boolean z9) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.b = z9;
        this.c = i7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(8:(3:153|154|(27:156|158|159|160|10|11|12|13|(3:16|17|14)|38|39|40|41|(5:43|45|46|(1:48)(1:134)|49)(1:140)|50|51|(3:113|114|(3:116|(2:118|(1:120))|121))|53|54|(10:56|57|58|59|60|61|62|63|64|(2:66|(2:68|69)))(1:107)|70|71|(2:75|(1:77))|78|(1:80)|82|83))|70|71|(3:73|75|(0))|78|(0)|82|83)|10|11|12|13|(1:14)|38|39|40|41|(0)(0)|50|51|(0)|53|54|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0227, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0228, code lost:
    
        r16 = r9;
        r9 = null;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0221, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0222, code lost:
    
        r16 = r9;
        r9 = null;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0237, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0238, code lost:
    
        r16 = r9;
        r8 = r12;
        r12 = r18;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x022d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x022e, code lost:
    
        r16 = r9;
        r8 = r12;
        r12 = r18;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0260, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0261, code lost:
    
        r20 = 0;
        r16 = r9;
        r8 = r12;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0253, code lost:
    
        r11 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0257, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0258, code lost:
    
        r20 = 0;
        r16 = r9;
        r8 = r12;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0248, code lost:
    
        r11 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[Catch: all -> 0x00bd, Exception -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #19 {Exception -> 0x00c6, all -> 0x00bd, blocks: (B:17:0x00aa, B:43:0x00f3), top: B:16:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d6 A[Catch: all -> 0x01a1, Exception -> 0x01a4, TRY_LEAVE, TryCatch #31 {Exception -> 0x01a4, all -> 0x01a1, blocks: (B:64:0x017f, B:66:0x0185, B:68:0x018d, B:73:0x01c8, B:75:0x01ce, B:77:0x01d6, B:80:0x01e3), top: B:63:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3 A[Catch: all -> 0x01a1, Exception -> 0x01a4, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x01a4, all -> 0x01a1, blocks: (B:64:0x017f, B:66:0x0185, B:68:0x018d, B:73:0x01c8, B:75:0x01ce, B:77:0x01d6, B:80:0x01e3), top: B:63:0x017f }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        ArrayList arrayList;
        final TLRPC.UserFull userFull;
        SQLiteCursor sQLiteCursor;
        int i10;
        final int i11;
        final boolean z9;
        boolean z10;
        TLRPC.UserFull userFull2;
        boolean z11;
        int i12;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList2;
        long j3;
        switch (this.a) {
            case 0:
                qb qbVar = (qb) this.d;
                String str = (String) this.e;
                qbVar.getClass();
                g0.h3(new ob(this.c, str, this.b));
                qbVar.b.u.remove(str);
                return;
            case 1:
                id idVar = (id) this.d;
                Vector vector = (Vector) this.e;
                HashMap hashMap = idVar.N;
                ArrayList arrayList3 = idVar.J;
                HashMap hashMap2 = idVar.M;
                idVar.I = false;
                ArrayList arrayList4 = idVar.L;
                int size = arrayList4.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((fd) arrayList4.get(i13)).k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                int size2 = vector.objects.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) vector.objects.get(i14);
                    if (r2.a) {
                        org.telegram.ui.Cells.f1.u(tL_langPackLanguage.name, new StringBuilder("loaded lang "));
                    }
                    fd fdVar = new fd();
                    fdVar.b = tL_langPackLanguage.name;
                    fdVar.a = tL_langPackLanguage.native_name;
                    fdVar.c = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        fdVar.e = str2.replace('-', '_').toLowerCase();
                    } else {
                        fdVar.e = "";
                    }
                    fdVar.f = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    fdVar.g = tL_langPackLanguage.rtl;
                    fdVar.d = "remote";
                    fdVar.k = i14;
                    fd G0 = idVar.G0(fdVar.b());
                    if (G0 == null) {
                        arrayList3.add(fdVar);
                        hashMap.put(fdVar.b(), fdVar);
                    } else {
                        G0.b = fdVar.b;
                        G0.a = fdVar.a;
                        G0.e = fdVar.e;
                        G0.f = fdVar.f;
                        G0.d = fdVar.d;
                        G0.k = fdVar.k;
                        fdVar = G0;
                    }
                    if (!hashMap2.containsKey(fdVar.b())) {
                        arrayList4.add(fdVar);
                        hashMap2.put(fdVar.b(), fdVar);
                    }
                }
                int i15 = 0;
                while (i15 < arrayList4.size()) {
                    fd fdVar2 = (fd) arrayList4.get(i15);
                    if (fdVar2.k == Integer.MAX_VALUE && fdVar2 != idVar.B) {
                        if (r2.a) {
                            a8.b("remove lang " + fdVar2.b());
                        }
                        arrayList4.remove(i15);
                        hashMap2.remove(fdVar2.b());
                        arrayList3.remove(fdVar2);
                        hashMap.remove(fdVar2.b());
                        i15--;
                    }
                    i15++;
                }
                idVar.a1();
                qs.e().k(qs.y4, new Object[0]);
                if (this.b) {
                    idVar.d(idVar.B, true, false, this.c);
                    return;
                }
                return;
            case 2:
                ((ui) this.d).b1(this.c, false, this.b, false, (c20) this.e);
                return;
            default:
                yr yrVar = (yr) this.d;
                final TLRPC.User user = (TLRPC.User) this.e;
                final boolean z12 = this.b;
                final int i16 = this.c;
                final HashMap hashMap3 = new HashMap();
                ArrayList arrayList5 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = yrVar.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid = " + user.id, new Object[0]);
                    try {
                        try {
                            try {
                                if (queryFinalized.next()) {
                                    try {
                                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue != null) {
                                            TLRPC.UserFull TLdeserialize = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                            try {
                                                TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                                                byteBufferValue.reuse();
                                                userFull2 = TLdeserialize;
                                                queryFinalized.dispose();
                                                SQLiteDatabase sQLiteDatabase = yrVar.getMessagesStorage().b;
                                                Locale locale = Locale.US;
                                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user.id + " ORDER BY mid DESC", new Object[0]);
                                                while (queryFinalized.next()) {
                                                    try {
                                                        int intValue = queryFinalized.intValue(0);
                                                        arrayList5.add(Integer.valueOf(intValue));
                                                        hashMap3.put(Integer.valueOf(intValue), null);
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        sQLiteCursor = queryFinalized;
                                                        i11 = 0;
                                                        arrayList = arrayList5;
                                                        userFull = userFull2;
                                                        z9 = i11;
                                                        try {
                                                            yrVar.o(e, true);
                                                            final qp messagesController = yrVar.getMessagesController();
                                                            messagesController.getClass();
                                                            final ArrayList arrayList6 = arrayList;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    qp qpVar = qp.this;
                                                                    a0.h hVar = qpVar.k1;
                                                                    LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                    LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        qpVar.W2(user2, i16, z12, null);
                                                                    }
                                                                    TLRPC.UserFull userFull3 = userFull;
                                                                    if (userFull3 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull3, user2.id);
                                                                            qpVar.s7.M(user2.id);
                                                                            bi.ea.y(qpVar.currentAccount, false).Q(userFull3);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z13 = userFull3.blocked;
                                                                            int i17 = qs.g0;
                                                                            if (z13) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        }
                                                                        qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull3);
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                                }
                                                            });
                                                            if (sQLiteCursor == null) {
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            final qp messagesController2 = yrVar.getMessagesController();
                                                            messagesController2.getClass();
                                                            final ArrayList arrayList7 = arrayList;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    qp qpVar = qp.this;
                                                                    a0.h hVar = qpVar.k1;
                                                                    LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                    LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        qpVar.W2(user2, i16, z12, null);
                                                                    }
                                                                    TLRPC.UserFull userFull3 = userFull;
                                                                    if (userFull3 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull3, user2.id);
                                                                            qpVar.s7.M(user2.id);
                                                                            bi.ea.y(qpVar.currentAccount, false).Q(userFull3);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z13 = userFull3.blocked;
                                                                            int i17 = qs.g0;
                                                                            if (z13) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        }
                                                                        qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull3);
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList7, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                                }
                                                            });
                                                            if (sQLiteCursor != null) {
                                                                sQLiteCursor.dispose();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        sQLiteCursor = queryFinalized;
                                                        i11 = 0;
                                                        arrayList = arrayList5;
                                                        userFull = userFull2;
                                                        z9 = i11;
                                                        final qp messagesController22 = yrVar.getMessagesController();
                                                        messagesController22.getClass();
                                                        final ArrayList arrayList72 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                qp qpVar = qp.this;
                                                                a0.h hVar = qpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    qpVar.W2(user2, i16, z12, null);
                                                                }
                                                                TLRPC.UserFull userFull3 = userFull;
                                                                if (userFull3 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull3, user2.id);
                                                                        qpVar.s7.M(user2.id);
                                                                        bi.ea.y(qpVar.currentAccount, false).Q(userFull3);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z13 = userFull3.blocked;
                                                                        int i17 = qs.g0;
                                                                        if (z13) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull3);
                                                                }
                                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList72, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                            }
                                                        });
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                queryFinalized.dispose();
                                                queryFinalized = yrVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user.id, new Object[0]);
                                                if (queryFinalized.next()) {
                                                    z11 = false;
                                                    i12 = 0;
                                                } else {
                                                    int intValue2 = queryFinalized.intValue(0);
                                                    try {
                                                        z11 = queryFinalized.intValue(1) != 0;
                                                        i12 = intValue2;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        TLRPC.UserFull userFull3 = userFull2;
                                                        z10 = false;
                                                        userFull = userFull3;
                                                        arrayList = arrayList5;
                                                        i11 = intValue2;
                                                        sQLiteCursor = queryFinalized;
                                                        z9 = z10;
                                                        yrVar.o(e, true);
                                                        final qp messagesController3 = yrVar.getMessagesController();
                                                        messagesController3.getClass();
                                                        final ArrayList arrayList62 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                qp qpVar = qp.this;
                                                                a0.h hVar = qpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    qpVar.W2(user2, i16, z12, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        qpVar.s7.M(user2.id);
                                                                        bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z13 = userFull32.blocked;
                                                                        int i17 = qs.g0;
                                                                        if (z13) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList62, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                            }
                                                        });
                                                        if (sQLiteCursor == null) {
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        TLRPC.UserFull userFull4 = userFull2;
                                                        z9 = 0;
                                                        userFull = userFull4;
                                                        arrayList = arrayList5;
                                                        i11 = intValue2;
                                                        sQLiteCursor = queryFinalized;
                                                        final qp messagesController222 = yrVar.getMessagesController();
                                                        messagesController222.getClass();
                                                        final ArrayList arrayList722 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                qp qpVar = qp.this;
                                                                a0.h hVar = qpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    qpVar.W2(user2, i16, z12, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        qpVar.s7.M(user2.id);
                                                                        bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z13 = userFull32.blocked;
                                                                        int i17 = qs.g0;
                                                                        if (z13) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList722, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                            }
                                                        });
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                queryFinalized.dispose();
                                                if (userFull2 != null) {
                                                    try {
                                                        if (userFull2.pinned_msg_id != 0) {
                                                            if (!arrayList5.isEmpty()) {
                                                                if (userFull2.pinned_msg_id > ((Integer) arrayList5.get(0)).intValue()) {
                                                                }
                                                            }
                                                            arrayList5.clear();
                                                            arrayList5.add(Integer.valueOf(userFull2.pinned_msg_id));
                                                            hashMap3.put(Integer.valueOf(userFull2.pinned_msg_id), null);
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        arrayList = arrayList5;
                                                        sQLiteCursor = null;
                                                        userFull = userFull2;
                                                        z9 = z11;
                                                        i11 = i12;
                                                        yrVar.o(e, true);
                                                        final qp messagesController32 = yrVar.getMessagesController();
                                                        messagesController32.getClass();
                                                        final ArrayList arrayList622 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                qp qpVar = qp.this;
                                                                a0.h hVar = qpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    qpVar.W2(user2, i16, z12, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        qpVar.s7.M(user2.id);
                                                                        bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z13 = userFull32.blocked;
                                                                        int i17 = qs.g0;
                                                                        if (z13) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList622, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                            }
                                                        });
                                                        if (sQLiteCursor == null) {
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        arrayList = arrayList5;
                                                        sQLiteCursor = null;
                                                        userFull = userFull2;
                                                        z9 = z11;
                                                        i11 = i12;
                                                        final qp messagesController2222 = yrVar.getMessagesController();
                                                        messagesController2222.getClass();
                                                        final ArrayList arrayList7222 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                qp qpVar = qp.this;
                                                                a0.h hVar = qpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    qpVar.W2(user2, i16, z12, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        qpVar.s7.M(user2.id);
                                                                        bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z13 = userFull32.blocked;
                                                                        int i17 = qs.g0;
                                                                        if (z13) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            qpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList7222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                            }
                                                        });
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                if (arrayList5.isEmpty()) {
                                                    try {
                                                        TLRPC.UserFull userFull5 = userFull2;
                                                        try {
                                                            userFull = userFull5;
                                                            arrayList = arrayList5;
                                                            sQLiteCursor2 = null;
                                                            try {
                                                                ArrayList P0 = yrVar.getMediaDataController().P0(user.id, 0L, arrayList, true);
                                                                if (P0 != null) {
                                                                    int size3 = P0.size();
                                                                    for (int i17 = 0; i17 < size3; i17++) {
                                                                        ij ijVar = (ij) P0.get(i17);
                                                                        hashMap3.put(Integer.valueOf(ijVar.e1()), ijVar);
                                                                    }
                                                                }
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                z9 = z11;
                                                                i11 = i12;
                                                                yrVar.o(e, true);
                                                                final qp messagesController322 = yrVar.getMessagesController();
                                                                messagesController322.getClass();
                                                                final ArrayList arrayList6222 = arrayList;
                                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        qp qpVar = qp.this;
                                                                        a0.h hVar = qpVar.k1;
                                                                        LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                        LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                            qpVar.W2(user2, i16, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull32 = userFull;
                                                                        if (userFull32 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull32, user2.id);
                                                                                qpVar.s7.M(user2.id);
                                                                                bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull32.blocked;
                                                                                int i172 = qs.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                }
                                                                            }
                                                                            qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                                        }
                                                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList6222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                                    }
                                                                });
                                                                if (sQLiteCursor == null) {
                                                                    sQLiteCursor.dispose();
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                z9 = z11;
                                                                i11 = i12;
                                                                final qp messagesController22222 = yrVar.getMessagesController();
                                                                messagesController22222.getClass();
                                                                final ArrayList arrayList72222 = arrayList;
                                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        qp qpVar = qp.this;
                                                                        a0.h hVar = qpVar.k1;
                                                                        LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                        LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                            qpVar.W2(user2, i16, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull32 = userFull;
                                                                        if (userFull32 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull32, user2.id);
                                                                                qpVar.s7.M(user2.id);
                                                                                bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull32.blocked;
                                                                                int i172 = qs.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                }
                                                                            }
                                                                            qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                                        }
                                                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList72222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Exception e14) {
                                                            e = e14;
                                                            arrayList = arrayList5;
                                                            userFull = userFull5;
                                                            sQLiteCursor2 = null;
                                                            sQLiteCursor = sQLiteCursor2;
                                                            z9 = z11;
                                                            i11 = i12;
                                                            yrVar.o(e, true);
                                                            final qp messagesController3222 = yrVar.getMessagesController();
                                                            messagesController3222.getClass();
                                                            final ArrayList arrayList62222 = arrayList;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    qp qpVar = qp.this;
                                                                    a0.h hVar = qpVar.k1;
                                                                    LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                    LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        qpVar.W2(user2, i16, z12, null);
                                                                    }
                                                                    TLRPC.UserFull userFull32 = userFull;
                                                                    if (userFull32 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull32, user2.id);
                                                                            qpVar.s7.M(user2.id);
                                                                            bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z13 = userFull32.blocked;
                                                                            int i172 = qs.g0;
                                                                            if (z13) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                            }
                                                                        }
                                                                        qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList62222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                                }
                                                            });
                                                            if (sQLiteCursor == null) {
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            arrayList = arrayList5;
                                                            userFull = userFull5;
                                                            sQLiteCursor2 = null;
                                                            sQLiteCursor = sQLiteCursor2;
                                                            z9 = z11;
                                                            i11 = i12;
                                                            final qp messagesController222222 = yrVar.getMessagesController();
                                                            messagesController222222.getClass();
                                                            final ArrayList arrayList722222 = arrayList;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    qp qpVar = qp.this;
                                                                    a0.h hVar = qpVar.k1;
                                                                    LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                                    LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        qpVar.W2(user2, i16, z12, null);
                                                                    }
                                                                    TLRPC.UserFull userFull32 = userFull;
                                                                    if (userFull32 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull32, user2.id);
                                                                            qpVar.s7.M(user2.id);
                                                                            bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z13 = userFull32.blocked;
                                                                            int i172 = qs.g0;
                                                                            if (z13) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                            }
                                                                        }
                                                                        qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                                    }
                                                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList722222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                                }
                                                            });
                                                            if (sQLiteCursor != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        arrayList = arrayList5;
                                                        userFull = userFull2;
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        arrayList = arrayList5;
                                                        userFull = userFull2;
                                                    }
                                                } else {
                                                    arrayList = arrayList5;
                                                    sQLiteCursor2 = null;
                                                    userFull = userFull2;
                                                }
                                                arrayList2 = new ArrayList();
                                                if (userFull != null && (userFull.flags2 & 64) != 0) {
                                                    j3 = userFull.personal_channel_id;
                                                    if (j3 != 0) {
                                                        arrayList2.add(Long.valueOf(j3));
                                                    }
                                                }
                                                if (!arrayList2.isEmpty()) {
                                                    ArrayList arrayList8 = new ArrayList();
                                                    yrVar.Q(TextUtils.join(",", arrayList2), arrayList8);
                                                    g0.h3(new sp(yrVar, arrayList8, 6));
                                                }
                                                final qp messagesController4 = yrVar.getMessagesController();
                                                messagesController4.getClass();
                                                final ArrayList arrayList9 = arrayList;
                                                final boolean z13 = z11;
                                                final int i18 = i12;
                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        qp qpVar = qp.this;
                                                        a0.h hVar = qpVar.k1;
                                                        LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                        LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            qpVar.W2(user2, i16, z12, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                qpVar.s7.M(user2.id);
                                                                bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z132 = userFull32.blocked;
                                                                int i172 = qs.g0;
                                                                if (z132) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                }
                                                            }
                                                            qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList9, hashMap3, Integer.valueOf(i18), Boolean.valueOf(z13));
                                                    }
                                                });
                                                return;
                                            } catch (Exception e16) {
                                                e = e16;
                                                i11 = 0;
                                                z10 = false;
                                                arrayList = arrayList5;
                                                userFull = TLdeserialize;
                                                sQLiteCursor = queryFinalized;
                                                z9 = z10;
                                                yrVar.o(e, true);
                                                final qp messagesController32222 = yrVar.getMessagesController();
                                                messagesController32222.getClass();
                                                final ArrayList arrayList622222 = arrayList;
                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        qp qpVar = qp.this;
                                                        a0.h hVar = qpVar.k1;
                                                        LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                        LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            qpVar.W2(user2, i16, z12, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                qpVar.s7.M(user2.id);
                                                                bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z132 = userFull32.blocked;
                                                                int i172 = qs.g0;
                                                                if (z132) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                }
                                                            }
                                                            qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList622222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                    }
                                                });
                                                if (sQLiteCursor == null) {
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                i11 = 0;
                                                z9 = 0;
                                                arrayList = arrayList5;
                                                userFull = TLdeserialize;
                                                sQLiteCursor = queryFinalized;
                                                final qp messagesController2222222 = yrVar.getMessagesController();
                                                messagesController2222222.getClass();
                                                final ArrayList arrayList7222222 = arrayList;
                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        qp qpVar = qp.this;
                                                        a0.h hVar = qpVar.k1;
                                                        LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                        LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            qpVar.W2(user2, i16, z12, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                qpVar.s7.M(user2.id);
                                                                bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z132 = userFull32.blocked;
                                                                int i172 = qs.g0;
                                                                if (z132) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                }
                                                            }
                                                            qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList7222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                                    }
                                                });
                                                if (sQLiteCursor != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        sQLiteCursor = queryFinalized;
                                        z9 = 0;
                                        arrayList = arrayList5;
                                        userFull = null;
                                        i11 = 0;
                                        yrVar.o(e, true);
                                        final qp messagesController322222 = yrVar.getMessagesController();
                                        messagesController322222.getClass();
                                        final ArrayList arrayList6222222 = arrayList;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                qp qpVar = qp.this;
                                                a0.h hVar = qpVar.k1;
                                                LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                    qpVar.W2(user2, i16, z12, null);
                                                }
                                                TLRPC.UserFull userFull32 = userFull;
                                                if (userFull32 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull32, user2.id);
                                                        qpVar.s7.M(user2.id);
                                                        bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z132 = userFull32.blocked;
                                                        int i172 = qs.g0;
                                                        if (z132) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                        }
                                                    }
                                                    qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                }
                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList6222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                            }
                                        });
                                        if (sQLiteCursor == null) {
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        sQLiteCursor = queryFinalized;
                                        z9 = 0;
                                        arrayList = arrayList5;
                                        userFull = null;
                                        i11 = 0;
                                        final qp messagesController22222222 = yrVar.getMessagesController();
                                        messagesController22222222.getClass();
                                        final ArrayList arrayList72222222 = arrayList;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                qp qpVar = qp.this;
                                                a0.h hVar = qpVar.k1;
                                                LongSparseIntArray longSparseIntArray = qpVar.G0;
                                                LongSparseLongArray longSparseLongArray = qpVar.r1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                    qpVar.W2(user2, i16, z12, null);
                                                }
                                                TLRPC.UserFull userFull32 = userFull;
                                                if (userFull32 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull32, user2.id);
                                                        qpVar.s7.M(user2.id);
                                                        bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z132 = userFull32.blocked;
                                                        int i172 = qs.g0;
                                                        if (z132) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                        }
                                                    }
                                                    qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                                }
                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList72222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                            }
                                        });
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                }
                                arrayList2 = new ArrayList();
                                if (userFull != null) {
                                    j3 = userFull.personal_channel_id;
                                    if (j3 != 0) {
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                }
                                final qp messagesController42 = yrVar.getMessagesController();
                                messagesController42.getClass();
                                final ArrayList arrayList92 = arrayList;
                                final boolean z132 = z11;
                                final int i182 = i12;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qp qpVar = qp.this;
                                        a0.h hVar = qpVar.k1;
                                        LongSparseIntArray longSparseIntArray = qpVar.G0;
                                        LongSparseLongArray longSparseLongArray = qpVar.r1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            qpVar.W2(user2, i16, z12, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                qpVar.s7.M(user2.id);
                                                bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1322 = userFull32.blocked;
                                                int i172 = qs.g0;
                                                if (z1322) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                }
                                            }
                                            qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList92, hashMap3, Integer.valueOf(i182), Boolean.valueOf(z132));
                                    }
                                });
                                return;
                            } catch (Exception e18) {
                                e = e18;
                                z9 = z11;
                                i11 = i12;
                                sQLiteCursor = sQLiteCursor2;
                                yrVar.o(e, true);
                                final qp messagesController3222222 = yrVar.getMessagesController();
                                messagesController3222222.getClass();
                                final ArrayList arrayList62222222 = arrayList;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qp qpVar = qp.this;
                                        a0.h hVar = qpVar.k1;
                                        LongSparseIntArray longSparseIntArray = qpVar.G0;
                                        LongSparseLongArray longSparseLongArray = qpVar.r1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            qpVar.W2(user2, i16, z12, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                qpVar.s7.M(user2.id);
                                                bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1322 = userFull32.blocked;
                                                int i172 = qs.g0;
                                                if (z1322) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                }
                                            }
                                            qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList62222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                    }
                                });
                                if (sQLiteCursor == null) {
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                z9 = z11;
                                i11 = i12;
                                sQLiteCursor = sQLiteCursor2;
                                final qp messagesController222222222 = yrVar.getMessagesController();
                                messagesController222222222.getClass();
                                final ArrayList arrayList722222222 = arrayList;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.pl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qp qpVar = qp.this;
                                        a0.h hVar = qpVar.k1;
                                        LongSparseIntArray longSparseIntArray = qpVar.G0;
                                        LongSparseLongArray longSparseLongArray = qpVar.r1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            qpVar.W2(user2, i16, z12, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                qpVar.s7.M(user2.id);
                                                bi.ea.y(qpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1322 = userFull32.blocked;
                                                int i172 = qs.g0;
                                                if (z1322) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    qpVar.getNotificationCenter().k(i172, new Object[0]);
                                                }
                                            }
                                            qpVar.getNotificationCenter().k(qs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(user2.id), arrayList722222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z9));
                                    }
                                });
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                            queryFinalized.dispose();
                            SQLiteDatabase sQLiteDatabase2 = yrVar.getMessagesStorage().b;
                            Locale locale2 = Locale.US;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user.id + " ORDER BY mid DESC", new Object[0]);
                            while (queryFinalized.next()) {
                            }
                            queryFinalized.dispose();
                            queryFinalized = yrVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user.id, new Object[0]);
                            if (queryFinalized.next()) {
                            }
                            queryFinalized.dispose();
                            if (userFull2 != null) {
                            }
                            if (arrayList5.isEmpty()) {
                            }
                        } catch (Exception e19) {
                            e = e19;
                            i10 = 0;
                            arrayList = arrayList5;
                            userFull = userFull2;
                            sQLiteCursor = queryFinalized;
                            break;
                        } catch (Throwable th12) {
                            th = th12;
                            i7 = 0;
                            arrayList = arrayList5;
                            userFull = userFull2;
                            sQLiteCursor = queryFinalized;
                            break;
                        }
                        userFull2 = null;
                    } catch (Exception e20) {
                        e = e20;
                        i10 = 0;
                        arrayList = arrayList5;
                        sQLiteCursor = queryFinalized;
                        userFull = null;
                        break;
                    } catch (Throwable th13) {
                        th = th13;
                        i7 = 0;
                        arrayList = arrayList5;
                        sQLiteCursor = queryFinalized;
                        userFull = null;
                        break;
                    }
                } catch (Exception e21) {
                    e = e21;
                    i10 = 0;
                    arrayList = arrayList5;
                    userFull = null;
                    sQLiteCursor = null;
                    break;
                } catch (Throwable th14) {
                    th = th14;
                    i7 = 0;
                    arrayList = arrayList5;
                    userFull = null;
                    sQLiteCursor = null;
                    break;
                }
        }
    }

    public /* synthetic */ nb(qb qbVar, int i7, String str, boolean z9) {
        this.a = 0;
        this.d = qbVar;
        this.c = i7;
        this.e = str;
        this.b = z9;
    }

    public /* synthetic */ nb(ui uiVar, int i7, boolean z9, c20 c20Var) {
        this.a = 2;
        this.d = uiVar;
        this.c = i7;
        this.b = z9;
        this.e = c20Var;
    }
}
