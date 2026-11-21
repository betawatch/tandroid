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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class lb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lb(int i7, int i10, Object obj, TLObject tLObject, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.c = i7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(13:(3:169|170|(32:172|174|175|176|10|11|12|13|(3:16|17|14)|36|37|38|39|(5:41|43|44|(1:46)(1:148)|47)(1:156)|48|49|(3:51|52|(3:54|(2:56|(1:58))|59))|67|68|(10:70|71|72|73|74|75|76|77|78|(2:80|(2:82|83)))(1:137)|84|85|86|(2:90|(1:92))|93|(1:95)|96|(4:100|(1:102)|103|(1:107))|108|(2:110|(1:112))|114|115))|84|85|86|(3:88|90|(0))|93|(0)|96|(5:98|100|(0)|103|(2:105|107))|108|(0)|114|115)|48|49|(0)|67|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x027e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x027f, code lost:
    
        r13 = null;
        r16 = r12;
        r12 = r18;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0275, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0276, code lost:
    
        r13 = null;
        r16 = r12;
        r12 = r18;
        r11 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff A[Catch: all -> 0x018c, Exception -> 0x0192, TryCatch #17 {Exception -> 0x0192, all -> 0x018c, blocks: (B:78:0x016b, B:80:0x0171, B:82:0x0178, B:88:0x01bd, B:90:0x01c3, B:92:0x01c9, B:95:0x01d6, B:98:0x01f5, B:100:0x01f9, B:102:0x01ff, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:110:0x0229, B:112:0x0237), top: B:77:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0229 A[Catch: all -> 0x018c, Exception -> 0x0192, TRY_ENTER, TryCatch #17 {Exception -> 0x0192, all -> 0x018c, blocks: (B:78:0x016b, B:80:0x0171, B:82:0x0178, B:88:0x01bd, B:90:0x01c3, B:92:0x01c9, B:95:0x01d6, B:98:0x01f5, B:100:0x01f9, B:102:0x01ff, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:110:0x0229, B:112:0x0237), top: B:77:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7 A[Catch: all -> 0x00b5, Exception -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x00bc, all -> 0x00b5, blocks: (B:17:0x00a2, B:41:0x00e7), top: B:16:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c9 A[Catch: all -> 0x018c, Exception -> 0x0192, TRY_LEAVE, TryCatch #17 {Exception -> 0x0192, all -> 0x018c, blocks: (B:78:0x016b, B:80:0x0171, B:82:0x0178, B:88:0x01bd, B:90:0x01c3, B:92:0x01c9, B:95:0x01d6, B:98:0x01f5, B:100:0x01f9, B:102:0x01ff, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:110:0x0229, B:112:0x0237), top: B:77:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6 A[Catch: all -> 0x018c, Exception -> 0x0192, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0192, all -> 0x018c, blocks: (B:78:0x016b, B:80:0x0171, B:82:0x0178, B:88:0x01bd, B:90:0x01c3, B:92:0x01c9, B:95:0x01d6, B:98:0x01f5, B:100:0x01f9, B:102:0x01ff, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:110:0x0229, B:112:0x0237), top: B:77:0x016b }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        final int i7;
        final boolean z10;
        final TLRPC.UserFull userFull;
        TLRPC.UserFull userFull2;
        TLRPC.UserFull userFull3;
        TLRPC.UserFull userFull4;
        TLRPC.UserFull userFull5;
        boolean z11;
        int i10;
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor2;
        TLRPC.UserFull userFull6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TLRPC.PeerSettings peerSettings;
        long j3;
        long j10;
        long j11;
        TLRPC.UserFull userFull7;
        switch (this.a) {
            case 0:
                ob obVar = (ob) this.d;
                String str = (String) this.e;
                obVar.getClass();
                g0.g3(new mb(this.c, str, this.b));
                obVar.b.u.remove(str);
                return;
            case 1:
                gd gdVar = (gd) this.d;
                Vector vector = (Vector) this.e;
                HashMap hashMap = gdVar.N;
                ArrayList arrayList4 = gdVar.J;
                HashMap hashMap2 = gdVar.M;
                gdVar.I = false;
                ArrayList arrayList5 = gdVar.L;
                int size = arrayList5.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((cd) arrayList5.get(i11)).k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                int size2 = vector.objects.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) vector.objects.get(i12);
                    if (s2.a) {
                        p5.c.s(tL_langPackLanguage.name, new StringBuilder("loaded lang "));
                    }
                    cd cdVar = new cd();
                    cdVar.b = tL_langPackLanguage.name;
                    cdVar.a = tL_langPackLanguage.native_name;
                    cdVar.c = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        cdVar.e = str2.replace('-', '_').toLowerCase();
                    } else {
                        cdVar.e = "";
                    }
                    cdVar.f = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    cdVar.g = tL_langPackLanguage.rtl;
                    cdVar.d = "remote";
                    cdVar.k = i12;
                    cd G0 = gdVar.G0(cdVar.b());
                    if (G0 == null) {
                        arrayList4.add(cdVar);
                        hashMap.put(cdVar.b(), cdVar);
                    } else {
                        G0.b = cdVar.b;
                        G0.a = cdVar.a;
                        G0.e = cdVar.e;
                        G0.f = cdVar.f;
                        G0.d = cdVar.d;
                        G0.k = cdVar.k;
                        cdVar = G0;
                    }
                    if (!hashMap2.containsKey(cdVar.b())) {
                        arrayList5.add(cdVar);
                        hashMap2.put(cdVar.b(), cdVar);
                    }
                }
                int i13 = 0;
                while (i13 < arrayList5.size()) {
                    cd cdVar2 = (cd) arrayList5.get(i13);
                    if (cdVar2.k == Integer.MAX_VALUE && cdVar2 != gdVar.B) {
                        if (s2.a) {
                            a8.b("remove lang " + cdVar2.b());
                        }
                        arrayList5.remove(i13);
                        hashMap2.remove(cdVar2.b());
                        arrayList4.remove(cdVar2);
                        hashMap.remove(cdVar2.b());
                        i13--;
                    }
                    i13++;
                }
                gdVar.b1();
                ks.e().k(ks.B4, new Object[0]);
                if (this.b) {
                    gdVar.d(gdVar.B, true, false, this.c);
                    return;
                }
                return;
            case 2:
                ((ri) this.d).e1(this.c, false, this.b, false, (x10) this.e);
                return;
            default:
                tr trVar = (tr) this.d;
                final TLRPC.User user = (TLRPC.User) this.e;
                final boolean z12 = this.b;
                final int i14 = this.c;
                final HashMap hashMap3 = new HashMap();
                final ArrayList arrayList6 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = trVar.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid = " + user.id, new Object[0]);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (queryFinalized.next()) {
                                            try {
                                                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                                if (byteBufferValue != null) {
                                                    userFull2 = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                    try {
                                                        userFull2.pinned_msg_id = queryFinalized.intValue(1);
                                                        byteBufferValue.reuse();
                                                        userFull3 = userFull2;
                                                        queryFinalized.dispose();
                                                        SQLiteDatabase sQLiteDatabase = trVar.getMessagesStorage().b;
                                                        Locale locale = Locale.US;
                                                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user.id + " ORDER BY mid DESC", new Object[0]);
                                                        while (queryFinalized.next()) {
                                                            try {
                                                                int intValue = queryFinalized.intValue(0);
                                                                arrayList6.add(Integer.valueOf(intValue));
                                                                hashMap3.put(Integer.valueOf(intValue), null);
                                                            } catch (Exception e10) {
                                                                e = e10;
                                                                sQLiteCursor = queryFinalized;
                                                                i7 = 0;
                                                                userFull = userFull3;
                                                                z10 = false;
                                                                try {
                                                                    trVar.o(e, true);
                                                                    final mp messagesController = trVar.getMessagesController();
                                                                    messagesController.getClass();
                                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            mp mpVar = mp.this;
                                                                            a0.h hVar = mpVar.l1;
                                                                            LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                            LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                            TLRPC.User user2 = user;
                                                                            if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                                mpVar.c3(user2, i14, z12, null);
                                                                            }
                                                                            TLRPC.UserFull userFull8 = userFull;
                                                                            if (userFull8 != null) {
                                                                                if (hVar.f(user2.id) == null) {
                                                                                    hVar.k(userFull8, user2.id);
                                                                                    mpVar.v7.M(user2.id);
                                                                                    di.y8.y(mpVar.currentAccount, false).P(userFull8);
                                                                                    int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                    boolean z13 = userFull8.blocked;
                                                                                    int i15 = ks.g0;
                                                                                    if (z13) {
                                                                                        if (indexOfKey < 0) {
                                                                                            longSparseIntArray.put(user2.id, 1);
                                                                                            mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                        }
                                                                                    } else if (indexOfKey >= 0) {
                                                                                        longSparseIntArray.removeAt(indexOfKey);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                }
                                                                                mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull8);
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                        }
                                                                    });
                                                                    if (sQLiteCursor != null) {
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    final mp messagesController2 = trVar.getMessagesController();
                                                                    messagesController2.getClass();
                                                                    g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            mp mpVar = mp.this;
                                                                            a0.h hVar = mpVar.l1;
                                                                            LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                            LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                            TLRPC.User user2 = user;
                                                                            if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                                mpVar.c3(user2, i14, z12, null);
                                                                            }
                                                                            TLRPC.UserFull userFull8 = userFull;
                                                                            if (userFull8 != null) {
                                                                                if (hVar.f(user2.id) == null) {
                                                                                    hVar.k(userFull8, user2.id);
                                                                                    mpVar.v7.M(user2.id);
                                                                                    di.y8.y(mpVar.currentAccount, false).P(userFull8);
                                                                                    int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                    boolean z13 = userFull8.blocked;
                                                                                    int i15 = ks.g0;
                                                                                    if (z13) {
                                                                                        if (indexOfKey < 0) {
                                                                                            longSparseIntArray.put(user2.id, 1);
                                                                                            mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                        }
                                                                                    } else if (indexOfKey >= 0) {
                                                                                        longSparseIntArray.removeAt(indexOfKey);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                }
                                                                                mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull8);
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
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
                                                                i7 = 0;
                                                                userFull = userFull3;
                                                                z10 = false;
                                                                final mp messagesController22 = trVar.getMessagesController();
                                                                messagesController22.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull8 = userFull;
                                                                        if (userFull8 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull8, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull8);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull8.blocked;
                                                                                int i15 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull8);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        queryFinalized.dispose();
                                                        queryFinalized = trVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user.id, new Object[0]);
                                                        if (queryFinalized.next()) {
                                                            z11 = false;
                                                            i10 = 0;
                                                        } else {
                                                            int intValue2 = queryFinalized.intValue(0);
                                                            try {
                                                                z11 = queryFinalized.intValue(1) != 0;
                                                                i10 = intValue2;
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                TLRPC.UserFull userFull8 = userFull3;
                                                                z10 = false;
                                                                userFull = userFull8;
                                                                i7 = intValue2;
                                                                sQLiteCursor = queryFinalized;
                                                                trVar.o(e, true);
                                                                final mp messagesController3 = trVar.getMessagesController();
                                                                messagesController3.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull82 = userFull;
                                                                        if (userFull82 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull82, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull82.blocked;
                                                                                int i15 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                TLRPC.UserFull userFull9 = userFull3;
                                                                z10 = false;
                                                                userFull = userFull9;
                                                                i7 = intValue2;
                                                                sQLiteCursor = queryFinalized;
                                                                final mp messagesController222 = trVar.getMessagesController();
                                                                messagesController222.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull82 = userFull;
                                                                        if (userFull82 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull82, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull82.blocked;
                                                                                int i15 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        queryFinalized.dispose();
                                                        if (userFull3 != null) {
                                                            try {
                                                                if (userFull3.pinned_msg_id != 0) {
                                                                    if (!arrayList6.isEmpty()) {
                                                                        if (userFull3.pinned_msg_id > ((Integer) arrayList6.get(0)).intValue()) {
                                                                        }
                                                                    }
                                                                    arrayList6.clear();
                                                                    arrayList6.add(Integer.valueOf(userFull3.pinned_msg_id));
                                                                    hashMap3.put(Integer.valueOf(userFull3.pinned_msg_id), null);
                                                                }
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                sQLiteCursor = null;
                                                                userFull = userFull3;
                                                                z10 = z11;
                                                                i7 = i10;
                                                                trVar.o(e, true);
                                                                final mp messagesController32 = trVar.getMessagesController();
                                                                messagesController32.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull82 = userFull;
                                                                        if (userFull82 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull82, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull82.blocked;
                                                                                int i15 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                sQLiteCursor = null;
                                                                userFull = userFull3;
                                                                z10 = z11;
                                                                i7 = i10;
                                                                final mp messagesController2222 = trVar.getMessagesController();
                                                                messagesController2222.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull82 = userFull;
                                                                        if (userFull82 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull82, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull82.blocked;
                                                                                int i15 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        if (arrayList6.isEmpty()) {
                                                            try {
                                                                userFull7 = userFull3;
                                                            } catch (Exception e13) {
                                                                e = e13;
                                                                arrayList = arrayList6;
                                                                sQLiteCursor2 = null;
                                                                userFull6 = userFull3;
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                arrayList = arrayList6;
                                                                sQLiteCursor2 = null;
                                                                userFull6 = userFull3;
                                                            }
                                                            try {
                                                                sQLiteCursor2 = null;
                                                                userFull6 = userFull7;
                                                                arrayList = arrayList6;
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                arrayList = arrayList6;
                                                                sQLiteCursor2 = null;
                                                                userFull6 = userFull7;
                                                                userFull = userFull6;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                arrayList6 = arrayList;
                                                                z10 = z11;
                                                                i7 = i10;
                                                                trVar.o(e, true);
                                                                final mp messagesController322 = trVar.getMessagesController();
                                                                messagesController322.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull82 = userFull;
                                                                        if (userFull82 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull82, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull82.blocked;
                                                                                int i15 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                arrayList = arrayList6;
                                                                sQLiteCursor2 = null;
                                                                userFull6 = userFull7;
                                                                userFull = userFull6;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                arrayList6 = arrayList;
                                                                z10 = z11;
                                                                i7 = i10;
                                                                final mp messagesController22222 = trVar.getMessagesController();
                                                                messagesController22222.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull82 = userFull;
                                                                        if (userFull82 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull82, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull82.blocked;
                                                                                int i15 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i15, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                            try {
                                                                ArrayList S0 = trVar.getMediaDataController().S0(user.id, 0L, arrayList, true);
                                                                if (S0 != null) {
                                                                    int size3 = S0.size();
                                                                    for (int i15 = 0; i15 < size3; i15++) {
                                                                        fj fjVar = (fj) S0.get(i15);
                                                                        hashMap3.put(Integer.valueOf(fjVar.e1()), fjVar);
                                                                    }
                                                                }
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                userFull = userFull6;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                arrayList6 = arrayList;
                                                                z10 = z11;
                                                                i7 = i10;
                                                                trVar.o(e, true);
                                                                final mp messagesController3222 = trVar.getMessagesController();
                                                                messagesController3222.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull82 = userFull;
                                                                        if (userFull82 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull82, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull82.blocked;
                                                                                int i152 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                userFull = userFull6;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                arrayList6 = arrayList;
                                                                z10 = z11;
                                                                i7 = i10;
                                                                final mp messagesController222222 = trVar.getMessagesController();
                                                                messagesController222222.getClass();
                                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        mp mpVar = mp.this;
                                                                        a0.h hVar = mpVar.l1;
                                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                            mpVar.c3(user2, i14, z12, null);
                                                                        }
                                                                        TLRPC.UserFull userFull82 = userFull;
                                                                        if (userFull82 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull82, user2.id);
                                                                                mpVar.v7.M(user2.id);
                                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z13 = userFull82.blocked;
                                                                                int i152 = ks.g0;
                                                                                if (z13) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                                }
                                                                            }
                                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                        }
                                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        } else {
                                                            arrayList = arrayList6;
                                                            sQLiteCursor2 = null;
                                                            userFull6 = userFull3;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        if (userFull6 != null && (userFull6.flags2 & 64) != 0) {
                                                            j11 = userFull6.personal_channel_id;
                                                            if (j11 != 0) {
                                                                arrayList2.add(Long.valueOf(j11));
                                                            }
                                                        }
                                                        if (!arrayList2.isEmpty()) {
                                                            ArrayList arrayList7 = new ArrayList();
                                                            trVar.Q(TextUtils.join(",", arrayList2), arrayList7);
                                                            g0.g3(new qp(trVar, arrayList7, 19));
                                                        }
                                                        arrayList3 = new ArrayList();
                                                        if (userFull6 != null && (peerSettings = userFull6.settings) != null) {
                                                            j3 = peerSettings.bot_inviter_id;
                                                            if (j3 != 0) {
                                                                arrayList3.add(Long.valueOf(j3));
                                                            }
                                                            j10 = userFull6.settings.bot_owner_id;
                                                            if (j10 != 0 && !arrayList3.contains(Long.valueOf(j10))) {
                                                                arrayList3.add(Long.valueOf(userFull6.settings.bot_owner_id));
                                                            }
                                                        }
                                                        if (!arrayList3.isEmpty()) {
                                                            ArrayList arrayList8 = new ArrayList();
                                                            trVar.n0(arrayList3, arrayList8, false);
                                                            if (!arrayList8.isEmpty()) {
                                                                g0.g3(new qp(trVar, arrayList8, 20));
                                                            }
                                                        }
                                                        final mp messagesController4 = trVar.getMessagesController();
                                                        messagesController4.getClass();
                                                        final TLRPC.UserFull userFull10 = userFull6;
                                                        final ArrayList arrayList9 = arrayList;
                                                        final boolean z13 = z11;
                                                        final int i16 = i10;
                                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                mp mpVar = mp.this;
                                                                a0.h hVar = mpVar.l1;
                                                                LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                    mpVar.c3(user2, i14, z12, null);
                                                                }
                                                                TLRPC.UserFull userFull82 = userFull10;
                                                                if (userFull82 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull82, user2.id);
                                                                        mpVar.v7.M(user2.id);
                                                                        di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z132 = userFull82.blocked;
                                                                        int i152 = ks.g0;
                                                                        if (z132) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                        }
                                                                    }
                                                                    mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                }
                                                                mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList9, hashMap3, Integer.valueOf(i16), Boolean.valueOf(z13));
                                                            }
                                                        });
                                                        return;
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        i7 = 0;
                                                        z10 = false;
                                                        userFull = userFull2;
                                                        sQLiteCursor = queryFinalized;
                                                        trVar.o(e, true);
                                                        final mp messagesController32222 = trVar.getMessagesController();
                                                        messagesController32222.getClass();
                                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                mp mpVar = mp.this;
                                                                a0.h hVar = mpVar.l1;
                                                                LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                    mpVar.c3(user2, i14, z12, null);
                                                                }
                                                                TLRPC.UserFull userFull82 = userFull;
                                                                if (userFull82 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull82, user2.id);
                                                                        mpVar.v7.M(user2.id);
                                                                        di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z132 = userFull82.blocked;
                                                                        int i152 = ks.g0;
                                                                        if (z132) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                        }
                                                                    }
                                                                    mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                }
                                                                mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                            }
                                                        });
                                                        if (sQLiteCursor != null) {
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        i7 = 0;
                                                        z10 = false;
                                                        userFull = userFull2;
                                                        sQLiteCursor = queryFinalized;
                                                        final mp messagesController2222222 = trVar.getMessagesController();
                                                        messagesController2222222.getClass();
                                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                mp mpVar = mp.this;
                                                                a0.h hVar = mpVar.l1;
                                                                LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                                LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                                    mpVar.c3(user2, i14, z12, null);
                                                                }
                                                                TLRPC.UserFull userFull82 = userFull;
                                                                if (userFull82 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull82, user2.id);
                                                                        mpVar.v7.M(user2.id);
                                                                        di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z132 = userFull82.blocked;
                                                                        int i152 = ks.g0;
                                                                        if (z132) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                        }
                                                                    }
                                                                    mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                                }
                                                                mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
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
                                                z10 = false;
                                                userFull = null;
                                                i7 = 0;
                                                trVar.o(e, true);
                                                final mp messagesController322222 = trVar.getMessagesController();
                                                messagesController322222.getClass();
                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        mp mpVar = mp.this;
                                                        a0.h hVar = mpVar.l1;
                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                            mpVar.c3(user2, i14, z12, null);
                                                        }
                                                        TLRPC.UserFull userFull82 = userFull;
                                                        if (userFull82 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull82, user2.id);
                                                                mpVar.v7.M(user2.id);
                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z132 = userFull82.blocked;
                                                                int i152 = ks.g0;
                                                                if (z132) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                }
                                                            }
                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                        }
                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                    }
                                                });
                                                if (sQLiteCursor != null) {
                                                    sQLiteCursor.dispose();
                                                    return;
                                                }
                                                return;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                sQLiteCursor = queryFinalized;
                                                z10 = false;
                                                userFull = null;
                                                i7 = 0;
                                                final mp messagesController22222222 = trVar.getMessagesController();
                                                messagesController22222222.getClass();
                                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        mp mpVar = mp.this;
                                                        a0.h hVar = mpVar.l1;
                                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                            mpVar.c3(user2, i14, z12, null);
                                                        }
                                                        TLRPC.UserFull userFull82 = userFull;
                                                        if (userFull82 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull82, user2.id);
                                                                mpVar.v7.M(user2.id);
                                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z132 = userFull82.blocked;
                                                                int i152 = ks.g0;
                                                                if (z132) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                                }
                                                            }
                                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                        }
                                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                                    }
                                                });
                                                if (sQLiteCursor != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        arrayList2 = new ArrayList();
                                        if (userFull6 != null) {
                                            j11 = userFull6.personal_channel_id;
                                            if (j11 != 0) {
                                            }
                                        }
                                        if (!arrayList2.isEmpty()) {
                                        }
                                        arrayList3 = new ArrayList();
                                        if (userFull6 != null) {
                                            j3 = peerSettings.bot_inviter_id;
                                            if (j3 != 0) {
                                            }
                                            j10 = userFull6.settings.bot_owner_id;
                                            if (j10 != 0) {
                                                arrayList3.add(Long.valueOf(userFull6.settings.bot_owner_id));
                                            }
                                        }
                                        if (!arrayList3.isEmpty()) {
                                        }
                                        final mp messagesController42 = trVar.getMessagesController();
                                        messagesController42.getClass();
                                        final TLRPC.UserFull userFull102 = userFull6;
                                        final ArrayList arrayList92 = arrayList;
                                        final boolean z132 = z11;
                                        final int i162 = i10;
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                mp mpVar = mp.this;
                                                a0.h hVar = mpVar.l1;
                                                LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                    mpVar.c3(user2, i14, z12, null);
                                                }
                                                TLRPC.UserFull userFull82 = userFull102;
                                                if (userFull82 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull82, user2.id);
                                                        mpVar.v7.M(user2.id);
                                                        di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z1322 = userFull82.blocked;
                                                        int i152 = ks.g0;
                                                        if (z1322) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                        }
                                                    }
                                                    mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                }
                                                mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList92, hashMap3, Integer.valueOf(i162), Boolean.valueOf(z132));
                                            }
                                        });
                                        return;
                                    } catch (Exception e18) {
                                        e = e18;
                                        sQLiteCursor = sQLiteCursor2;
                                        arrayList6 = arrayList;
                                        z10 = z11;
                                        i7 = i10;
                                        userFull5 = userFull6;
                                        userFull = userFull5;
                                        trVar.o(e, true);
                                        final mp messagesController3222222 = trVar.getMessagesController();
                                        messagesController3222222.getClass();
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                mp mpVar = mp.this;
                                                a0.h hVar = mpVar.l1;
                                                LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                    mpVar.c3(user2, i14, z12, null);
                                                }
                                                TLRPC.UserFull userFull82 = userFull;
                                                if (userFull82 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull82, user2.id);
                                                        mpVar.v7.M(user2.id);
                                                        di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z1322 = userFull82.blocked;
                                                        int i152 = ks.g0;
                                                        if (z1322) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                        }
                                                    }
                                                    mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                }
                                                mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                            }
                                        });
                                        if (sQLiteCursor != null) {
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        sQLiteCursor = sQLiteCursor2;
                                        arrayList6 = arrayList;
                                        z10 = z11;
                                        i7 = i10;
                                        userFull4 = userFull6;
                                        userFull = userFull4;
                                        final mp messagesController222222222 = trVar.getMessagesController();
                                        messagesController222222222.getClass();
                                        g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                mp mpVar = mp.this;
                                                a0.h hVar = mpVar.l1;
                                                LongSparseIntArray longSparseIntArray = mpVar.H0;
                                                LongSparseLongArray longSparseLongArray = mpVar.s1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                                    mpVar.c3(user2, i14, z12, null);
                                                }
                                                TLRPC.UserFull userFull82 = userFull;
                                                if (userFull82 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull82, user2.id);
                                                        mpVar.v7.M(user2.id);
                                                        di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z1322 = userFull82.blocked;
                                                        int i152 = ks.g0;
                                                        if (z1322) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                        }
                                                    }
                                                    mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                                }
                                                mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                            }
                                        });
                                        if (sQLiteCursor != null) {
                                        }
                                        throw th;
                                    }
                                    queryFinalized.dispose();
                                    if (userFull3 != null) {
                                    }
                                    if (arrayList6.isEmpty()) {
                                    }
                                } catch (Exception e19) {
                                    e = e19;
                                    userFull5 = userFull3;
                                    z10 = z11;
                                    i7 = i10;
                                    sQLiteCursor = queryFinalized;
                                } catch (Throwable th12) {
                                    th = th12;
                                    userFull4 = userFull3;
                                    z10 = z11;
                                    i7 = i10;
                                    sQLiteCursor = queryFinalized;
                                }
                                SQLiteDatabase sQLiteDatabase2 = trVar.getMessagesStorage().b;
                                Locale locale2 = Locale.US;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user.id + " ORDER BY mid DESC", new Object[0]);
                                while (queryFinalized.next()) {
                                }
                                queryFinalized.dispose();
                                queryFinalized = trVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user.id, new Object[0]);
                                if (queryFinalized.next()) {
                                }
                            } catch (Exception e20) {
                                e = e20;
                                sQLiteCursor = null;
                                userFull5 = userFull3;
                                i7 = 0;
                                z10 = false;
                                userFull = userFull5;
                                trVar.o(e, true);
                                final mp messagesController32222222 = trVar.getMessagesController();
                                messagesController32222222.getClass();
                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        mp mpVar = mp.this;
                                        a0.h hVar = mpVar.l1;
                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                            mpVar.c3(user2, i14, z12, null);
                                        }
                                        TLRPC.UserFull userFull82 = userFull;
                                        if (userFull82 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull82, user2.id);
                                                mpVar.v7.M(user2.id);
                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1322 = userFull82.blocked;
                                                int i152 = ks.g0;
                                                if (z1322) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                }
                                            }
                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                        }
                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                    }
                                });
                                if (sQLiteCursor != null) {
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                sQLiteCursor = null;
                                userFull4 = userFull3;
                                i7 = 0;
                                z10 = false;
                                userFull = userFull4;
                                final mp messagesController2222222222 = trVar.getMessagesController();
                                messagesController2222222222.getClass();
                                g0.g3(new Runnable() { // from class: org.telegram.messenger.hl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        mp mpVar = mp.this;
                                        a0.h hVar = mpVar.l1;
                                        LongSparseIntArray longSparseIntArray = mpVar.H0;
                                        LongSparseLongArray longSparseLongArray = mpVar.s1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > (user2.bot ? 5000 : 60000)) {
                                            mpVar.c3(user2, i14, z12, null);
                                        }
                                        TLRPC.UserFull userFull82 = userFull;
                                        if (userFull82 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull82, user2.id);
                                                mpVar.v7.M(user2.id);
                                                di.y8.y(mpVar.currentAccount, false).P(userFull82);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1322 = userFull82.blocked;
                                                int i152 = ks.g0;
                                                if (z1322) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    mpVar.getNotificationCenter().k(i152, new Object[0]);
                                                }
                                            }
                                            mpVar.getNotificationCenter().k(ks.E0, Long.valueOf(user2.id), userFull82);
                                        }
                                        mpVar.getNotificationCenter().k(ks.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i7), Boolean.valueOf(z10));
                                    }
                                });
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                            queryFinalized.dispose();
                        } catch (Exception e21) {
                            e = e21;
                            userFull5 = userFull3;
                            sQLiteCursor = queryFinalized;
                        } catch (Throwable th14) {
                            th = th14;
                            userFull4 = userFull3;
                            sQLiteCursor = queryFinalized;
                        }
                        userFull3 = null;
                    } catch (Exception e22) {
                        e = e22;
                        userFull2 = null;
                    } catch (Throwable th15) {
                        th = th15;
                        userFull2 = null;
                    }
                } catch (Exception e23) {
                    e = e23;
                    sQLiteCursor = null;
                    i7 = 0;
                    z10 = false;
                    userFull = null;
                } catch (Throwable th16) {
                    th = th16;
                    sQLiteCursor = null;
                    i7 = 0;
                    z10 = false;
                    userFull = null;
                }
        }
    }

    public /* synthetic */ lb(ob obVar, int i7, String str, boolean z10) {
        this.a = 0;
        this.d = obVar;
        this.c = i7;
        this.e = str;
        this.b = z10;
    }

    public /* synthetic */ lb(ri riVar, int i7, boolean z10, x10 x10Var) {
        this.a = 2;
        this.d = riVar;
        this.c = i7;
        this.b = z10;
        this.e = x10Var;
    }
}
