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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gb(int i3, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.c = i3;
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
        int i3;
        ArrayList arrayList;
        final TLRPC.UserFull userFull;
        SQLiteCursor sQLiteCursor;
        int i10;
        final int i11;
        final boolean z10;
        boolean z11;
        TLRPC.UserFull userFull2;
        boolean z12;
        int i12;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList2;
        long j10;
        switch (this.a) {
            case 0:
                jb jbVar = (jb) this.d;
                String str = (String) this.e;
                jbVar.getClass();
                g0.h3(new hb(this.c, str, this.b));
                jbVar.b.u.remove(str);
                return;
            case 1:
                bd bdVar = (bd) this.d;
                Vector vector = (Vector) this.e;
                HashMap hashMap = bdVar.N;
                ArrayList arrayList3 = bdVar.J;
                HashMap hashMap2 = bdVar.M;
                bdVar.I = false;
                ArrayList arrayList4 = bdVar.L;
                int size = arrayList4.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((yc) arrayList4.get(i13)).k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                int size2 = vector.objects.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) vector.objects.get(i14);
                    if (r2.a) {
                        k2.p1.w(tL_langPackLanguage.name, new StringBuilder("loaded lang "));
                    }
                    yc ycVar = new yc();
                    ycVar.b = tL_langPackLanguage.name;
                    ycVar.a = tL_langPackLanguage.native_name;
                    ycVar.c = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        ycVar.e = str2.replace('-', '_').toLowerCase();
                    } else {
                        ycVar.e = "";
                    }
                    ycVar.f = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    ycVar.g = tL_langPackLanguage.rtl;
                    ycVar.d = "remote";
                    ycVar.k = i14;
                    yc G0 = bdVar.G0(ycVar.b());
                    if (G0 == null) {
                        arrayList3.add(ycVar);
                        hashMap.put(ycVar.b(), ycVar);
                    } else {
                        G0.b = ycVar.b;
                        G0.a = ycVar.a;
                        G0.e = ycVar.e;
                        G0.f = ycVar.f;
                        G0.d = ycVar.d;
                        G0.k = ycVar.k;
                        ycVar = G0;
                    }
                    if (!hashMap2.containsKey(ycVar.b())) {
                        arrayList4.add(ycVar);
                        hashMap2.put(ycVar.b(), ycVar);
                    }
                }
                int i15 = 0;
                while (i15 < arrayList4.size()) {
                    yc ycVar2 = (yc) arrayList4.get(i15);
                    if (ycVar2.k == Integer.MAX_VALUE && ycVar2 != bdVar.B) {
                        if (r2.a) {
                            a8.b("remove lang " + ycVar2.b());
                        }
                        arrayList4.remove(i15);
                        hashMap2.remove(ycVar2.b());
                        arrayList3.remove(ycVar2);
                        hashMap.remove(ycVar2.b());
                        i15--;
                    }
                    i15++;
                }
                bdVar.a1();
                hs.e().k(hs.y4, new Object[0]);
                if (this.b) {
                    bdVar.d(bdVar.B, true, false, this.c);
                    return;
                }
                return;
            case 2:
                ((li) this.d).b1(this.c, false, this.b, false, (u10) this.e);
                return;
            default:
                qr qrVar = (qr) this.d;
                final TLRPC.User user = (TLRPC.User) this.e;
                final boolean z13 = this.b;
                final int i16 = this.c;
                final HashMap hashMap3 = new HashMap();
                ArrayList arrayList5 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = qrVar.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid = " + user.id, new Object[0]);
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
                                                SQLiteDatabase sQLiteDatabase = qrVar.getMessagesStorage().b;
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
                                                        z10 = i11;
                                                        try {
                                                            qrVar.o(e, true);
                                                            final hp messagesController = qrVar.getMessagesController();
                                                            messagesController.getClass();
                                                            final ArrayList arrayList6 = arrayList;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    hp hpVar = hp.this;
                                                                    a0.h hVar = hpVar.l1;
                                                                    LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                    LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        hpVar.W2(user2, i16, z13, null);
                                                                    }
                                                                    TLRPC.UserFull userFull3 = userFull;
                                                                    if (userFull3 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull3, user2.id);
                                                                            hpVar.s7.M(user2.id);
                                                                            ci.e9.y(hpVar.currentAccount, false).Q(userFull3);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z14 = userFull3.blocked;
                                                                            int i17 = hs.g0;
                                                                            if (z14) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        }
                                                                        hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull3);
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                                                }
                                                            });
                                                            if (sQLiteCursor == null) {
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            final hp messagesController2 = qrVar.getMessagesController();
                                                            messagesController2.getClass();
                                                            final ArrayList arrayList7 = arrayList;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    hp hpVar = hp.this;
                                                                    a0.h hVar = hpVar.l1;
                                                                    LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                    LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        hpVar.W2(user2, i16, z13, null);
                                                                    }
                                                                    TLRPC.UserFull userFull3 = userFull;
                                                                    if (userFull3 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull3, user2.id);
                                                                            hpVar.s7.M(user2.id);
                                                                            ci.e9.y(hpVar.currentAccount, false).Q(userFull3);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z14 = userFull3.blocked;
                                                                            int i17 = hs.g0;
                                                                            if (z14) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        }
                                                                        hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull3);
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList7, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
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
                                                        z10 = i11;
                                                        final hp messagesController22 = qrVar.getMessagesController();
                                                        messagesController22.getClass();
                                                        final ArrayList arrayList72 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                hp hpVar = hp.this;
                                                                a0.h hVar = hpVar.l1;
                                                                LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    hpVar.W2(user2, i16, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull3 = userFull;
                                                                if (userFull3 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull3, user2.id);
                                                                        hpVar.s7.M(user2.id);
                                                                        ci.e9.y(hpVar.currentAccount, false).Q(userFull3);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull3.blocked;
                                                                        int i17 = hs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull3);
                                                                }
                                                                hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList72, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                                            }
                                                        });
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                queryFinalized.dispose();
                                                queryFinalized = qrVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user.id, new Object[0]);
                                                if (queryFinalized.next()) {
                                                    z12 = false;
                                                    i12 = 0;
                                                } else {
                                                    int intValue2 = queryFinalized.intValue(0);
                                                    try {
                                                        z12 = queryFinalized.intValue(1) != 0;
                                                        i12 = intValue2;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        TLRPC.UserFull userFull3 = userFull2;
                                                        z11 = false;
                                                        userFull = userFull3;
                                                        arrayList = arrayList5;
                                                        i11 = intValue2;
                                                        sQLiteCursor = queryFinalized;
                                                        z10 = z11;
                                                        qrVar.o(e, true);
                                                        final hp messagesController3 = qrVar.getMessagesController();
                                                        messagesController3.getClass();
                                                        final ArrayList arrayList62 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                hp hpVar = hp.this;
                                                                a0.h hVar = hpVar.l1;
                                                                LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    hpVar.W2(user2, i16, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        hpVar.s7.M(user2.id);
                                                                        ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull32.blocked;
                                                                        int i17 = hs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList62, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                                            }
                                                        });
                                                        if (sQLiteCursor == null) {
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        TLRPC.UserFull userFull4 = userFull2;
                                                        z10 = 0;
                                                        userFull = userFull4;
                                                        arrayList = arrayList5;
                                                        i11 = intValue2;
                                                        sQLiteCursor = queryFinalized;
                                                        final hp messagesController222 = qrVar.getMessagesController();
                                                        messagesController222.getClass();
                                                        final ArrayList arrayList722 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                hp hpVar = hp.this;
                                                                a0.h hVar = hpVar.l1;
                                                                LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    hpVar.W2(user2, i16, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        hpVar.s7.M(user2.id);
                                                                        ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull32.blocked;
                                                                        int i17 = hs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList722, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
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
                                                        z10 = z12;
                                                        i11 = i12;
                                                        qrVar.o(e, true);
                                                        final hp messagesController32 = qrVar.getMessagesController();
                                                        messagesController32.getClass();
                                                        final ArrayList arrayList622 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                hp hpVar = hp.this;
                                                                a0.h hVar = hpVar.l1;
                                                                LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    hpVar.W2(user2, i16, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        hpVar.s7.M(user2.id);
                                                                        ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull32.blocked;
                                                                        int i17 = hs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList622, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                                            }
                                                        });
                                                        if (sQLiteCursor == null) {
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        arrayList = arrayList5;
                                                        sQLiteCursor = null;
                                                        userFull = userFull2;
                                                        z10 = z12;
                                                        i11 = i12;
                                                        final hp messagesController2222 = qrVar.getMessagesController();
                                                        messagesController2222.getClass();
                                                        final ArrayList arrayList7222 = arrayList;
                                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                hp hpVar = hp.this;
                                                                a0.h hVar = hpVar.l1;
                                                                LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    hpVar.W2(user2, i16, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        hpVar.s7.M(user2.id);
                                                                        ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull32.blocked;
                                                                        int i17 = hs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            hpVar.getNotificationCenter().k(i17, new Object[0]);
                                                                        }
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList7222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
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
                                                                ArrayList P0 = qrVar.getMediaDataController().P0(user.id, 0L, arrayList, true);
                                                                if (P0 != null) {
                                                                    int size3 = P0.size();
                                                                    for (int i17 = 0; i17 < size3; i17++) {
                                                                        zi ziVar = (zi) P0.get(i17);
                                                                        hashMap3.put(Integer.valueOf(ziVar.f1()), ziVar);
                                                                    }
                                                                }
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                z10 = z12;
                                                                i11 = i12;
                                                                qrVar.o(e, true);
                                                                final hp messagesController322 = qrVar.getMessagesController();
                                                                messagesController322.getClass();
                                                                final ArrayList arrayList6222 = arrayList;
                                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        hp hpVar = hp.this;
                                                                        a0.h hVar = hpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                            hpVar.W2(user2, i16, z13, null);
                                                                        }
                                                                        TLRPC.UserFull userFull32 = userFull;
                                                                        if (userFull32 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull32, user2.id);
                                                                                hpVar.s7.M(user2.id);
                                                                                ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z14 = userFull32.blocked;
                                                                                int i172 = hs.g0;
                                                                                if (z14) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                }
                                                                            }
                                                                            hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                                        }
                                                                        hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList6222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
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
                                                                z10 = z12;
                                                                i11 = i12;
                                                                final hp messagesController22222 = qrVar.getMessagesController();
                                                                messagesController22222.getClass();
                                                                final ArrayList arrayList72222 = arrayList;
                                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        hp hpVar = hp.this;
                                                                        a0.h hVar = hpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                            hpVar.W2(user2, i16, z13, null);
                                                                        }
                                                                        TLRPC.UserFull userFull32 = userFull;
                                                                        if (userFull32 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull32, user2.id);
                                                                                hpVar.s7.M(user2.id);
                                                                                ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z14 = userFull32.blocked;
                                                                                int i172 = hs.g0;
                                                                                if (z14) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                }
                                                                            }
                                                                            hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                                        }
                                                                        hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList72222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
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
                                                            z10 = z12;
                                                            i11 = i12;
                                                            qrVar.o(e, true);
                                                            final hp messagesController3222 = qrVar.getMessagesController();
                                                            messagesController3222.getClass();
                                                            final ArrayList arrayList62222 = arrayList;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    hp hpVar = hp.this;
                                                                    a0.h hVar = hpVar.l1;
                                                                    LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                    LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        hpVar.W2(user2, i16, z13, null);
                                                                    }
                                                                    TLRPC.UserFull userFull32 = userFull;
                                                                    if (userFull32 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull32, user2.id);
                                                                            hpVar.s7.M(user2.id);
                                                                            ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z14 = userFull32.blocked;
                                                                            int i172 = hs.g0;
                                                                            if (z14) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                            }
                                                                        }
                                                                        hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList62222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
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
                                                            z10 = z12;
                                                            i11 = i12;
                                                            final hp messagesController222222 = qrVar.getMessagesController();
                                                            messagesController222222.getClass();
                                                            final ArrayList arrayList722222 = arrayList;
                                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    hp hpVar = hp.this;
                                                                    a0.h hVar = hpVar.l1;
                                                                    LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                                    LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        hpVar.W2(user2, i16, z13, null);
                                                                    }
                                                                    TLRPC.UserFull userFull32 = userFull;
                                                                    if (userFull32 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull32, user2.id);
                                                                            hpVar.s7.M(user2.id);
                                                                            ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z14 = userFull32.blocked;
                                                                            int i172 = hs.g0;
                                                                            if (z14) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                            }
                                                                        }
                                                                        hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                                    }
                                                                    hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList722222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
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
                                                    j10 = userFull.personal_channel_id;
                                                    if (j10 != 0) {
                                                        arrayList2.add(Long.valueOf(j10));
                                                    }
                                                }
                                                if (!arrayList2.isEmpty()) {
                                                    ArrayList arrayList8 = new ArrayList();
                                                    qrVar.Q(TextUtils.join(",", arrayList2), arrayList8);
                                                    g0.h3(new jp(qrVar, arrayList8, 6));
                                                }
                                                final hp messagesController4 = qrVar.getMessagesController();
                                                messagesController4.getClass();
                                                final ArrayList arrayList9 = arrayList;
                                                final boolean z14 = z12;
                                                final int i18 = i12;
                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        hp hpVar = hp.this;
                                                        a0.h hVar = hpVar.l1;
                                                        LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                        LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            hpVar.W2(user2, i16, z13, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                hpVar.s7.M(user2.id);
                                                                ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z142 = userFull32.blocked;
                                                                int i172 = hs.g0;
                                                                if (z142) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                }
                                                            }
                                                            hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList9, hashMap3, Integer.valueOf(i18), Boolean.valueOf(z14));
                                                    }
                                                });
                                                return;
                                            } catch (Exception e16) {
                                                e = e16;
                                                i11 = 0;
                                                z11 = false;
                                                arrayList = arrayList5;
                                                userFull = TLdeserialize;
                                                sQLiteCursor = queryFinalized;
                                                z10 = z11;
                                                qrVar.o(e, true);
                                                final hp messagesController32222 = qrVar.getMessagesController();
                                                messagesController32222.getClass();
                                                final ArrayList arrayList622222 = arrayList;
                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        hp hpVar = hp.this;
                                                        a0.h hVar = hpVar.l1;
                                                        LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                        LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            hpVar.W2(user2, i16, z13, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                hpVar.s7.M(user2.id);
                                                                ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z142 = userFull32.blocked;
                                                                int i172 = hs.g0;
                                                                if (z142) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                }
                                                            }
                                                            hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList622222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                                    }
                                                });
                                                if (sQLiteCursor == null) {
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                i11 = 0;
                                                z10 = 0;
                                                arrayList = arrayList5;
                                                userFull = TLdeserialize;
                                                sQLiteCursor = queryFinalized;
                                                final hp messagesController2222222 = qrVar.getMessagesController();
                                                messagesController2222222.getClass();
                                                final ArrayList arrayList7222222 = arrayList;
                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        hp hpVar = hp.this;
                                                        a0.h hVar = hpVar.l1;
                                                        LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                        LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            hpVar.W2(user2, i16, z13, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                hpVar.s7.M(user2.id);
                                                                ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z142 = userFull32.blocked;
                                                                int i172 = hs.g0;
                                                                if (z142) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                                }
                                                            }
                                                            hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList7222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
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
                                        z10 = 0;
                                        arrayList = arrayList5;
                                        userFull = null;
                                        i11 = 0;
                                        qrVar.o(e, true);
                                        final hp messagesController322222 = qrVar.getMessagesController();
                                        messagesController322222.getClass();
                                        final ArrayList arrayList6222222 = arrayList;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                hp hpVar = hp.this;
                                                a0.h hVar = hpVar.l1;
                                                LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                    hpVar.W2(user2, i16, z13, null);
                                                }
                                                TLRPC.UserFull userFull32 = userFull;
                                                if (userFull32 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull32, user2.id);
                                                        hpVar.s7.M(user2.id);
                                                        ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z142 = userFull32.blocked;
                                                        int i172 = hs.g0;
                                                        if (z142) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                        }
                                                    }
                                                    hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                }
                                                hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList6222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                            }
                                        });
                                        if (sQLiteCursor == null) {
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        sQLiteCursor = queryFinalized;
                                        z10 = 0;
                                        arrayList = arrayList5;
                                        userFull = null;
                                        i11 = 0;
                                        final hp messagesController22222222 = qrVar.getMessagesController();
                                        messagesController22222222.getClass();
                                        final ArrayList arrayList72222222 = arrayList;
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                hp hpVar = hp.this;
                                                a0.h hVar = hpVar.l1;
                                                LongSparseIntArray longSparseIntArray = hpVar.H0;
                                                LongSparseLongArray longSparseLongArray = hpVar.s1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                    hpVar.W2(user2, i16, z13, null);
                                                }
                                                TLRPC.UserFull userFull32 = userFull;
                                                if (userFull32 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull32, user2.id);
                                                        hpVar.s7.M(user2.id);
                                                        ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z142 = userFull32.blocked;
                                                        int i172 = hs.g0;
                                                        if (z142) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                        }
                                                    }
                                                    hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                                }
                                                hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList72222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                            }
                                        });
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                }
                                arrayList2 = new ArrayList();
                                if (userFull != null) {
                                    j10 = userFull.personal_channel_id;
                                    if (j10 != 0) {
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                }
                                final hp messagesController42 = qrVar.getMessagesController();
                                messagesController42.getClass();
                                final ArrayList arrayList92 = arrayList;
                                final boolean z142 = z12;
                                final int i182 = i12;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hp hpVar = hp.this;
                                        a0.h hVar = hpVar.l1;
                                        LongSparseIntArray longSparseIntArray = hpVar.H0;
                                        LongSparseLongArray longSparseLongArray = hpVar.s1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            hpVar.W2(user2, i16, z13, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                hpVar.s7.M(user2.id);
                                                ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1422 = userFull32.blocked;
                                                int i172 = hs.g0;
                                                if (z1422) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                }
                                            }
                                            hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList92, hashMap3, Integer.valueOf(i182), Boolean.valueOf(z142));
                                    }
                                });
                                return;
                            } catch (Exception e18) {
                                e = e18;
                                z10 = z12;
                                i11 = i12;
                                sQLiteCursor = sQLiteCursor2;
                                qrVar.o(e, true);
                                final hp messagesController3222222 = qrVar.getMessagesController();
                                messagesController3222222.getClass();
                                final ArrayList arrayList62222222 = arrayList;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hp hpVar = hp.this;
                                        a0.h hVar = hpVar.l1;
                                        LongSparseIntArray longSparseIntArray = hpVar.H0;
                                        LongSparseLongArray longSparseLongArray = hpVar.s1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            hpVar.W2(user2, i16, z13, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                hpVar.s7.M(user2.id);
                                                ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1422 = userFull32.blocked;
                                                int i172 = hs.g0;
                                                if (z1422) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                }
                                            }
                                            hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList62222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                    }
                                });
                                if (sQLiteCursor == null) {
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                z10 = z12;
                                i11 = i12;
                                sQLiteCursor = sQLiteCursor2;
                                final hp messagesController222222222 = qrVar.getMessagesController();
                                messagesController222222222.getClass();
                                final ArrayList arrayList722222222 = arrayList;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.fl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        hp hpVar = hp.this;
                                        a0.h hVar = hpVar.l1;
                                        LongSparseIntArray longSparseIntArray = hpVar.H0;
                                        LongSparseLongArray longSparseLongArray = hpVar.s1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            hpVar.W2(user2, i16, z13, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                hpVar.s7.M(user2.id);
                                                ci.e9.y(hpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1422 = userFull32.blocked;
                                                int i172 = hs.g0;
                                                if (z1422) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    hpVar.getNotificationCenter().k(i172, new Object[0]);
                                                }
                                            }
                                            hpVar.getNotificationCenter().k(hs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        hpVar.getNotificationCenter().k(hs.F0, Long.valueOf(user2.id), arrayList722222222, hashMap3, Integer.valueOf(i11), Boolean.valueOf(z10));
                                    }
                                });
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                            queryFinalized.dispose();
                            SQLiteDatabase sQLiteDatabase2 = qrVar.getMessagesStorage().b;
                            Locale locale2 = Locale.US;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user.id + " ORDER BY mid DESC", new Object[0]);
                            while (queryFinalized.next()) {
                            }
                            queryFinalized.dispose();
                            queryFinalized = qrVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user.id, new Object[0]);
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
                            i3 = 0;
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
                        i3 = 0;
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
                    i3 = 0;
                    arrayList = arrayList5;
                    userFull = null;
                    sQLiteCursor = null;
                    break;
                }
        }
    }

    public /* synthetic */ gb(jb jbVar, int i3, String str, boolean z10) {
        this.a = 0;
        this.d = jbVar;
        this.c = i3;
        this.e = str;
        this.b = z10;
    }

    public /* synthetic */ gb(li liVar, int i3, boolean z10, u10 u10Var) {
        this.a = 2;
        this.d = liVar;
        this.c = i3;
        this.b = z10;
        this.e = u10Var;
    }
}
