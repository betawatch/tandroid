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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nb(int i10, int i11, Object obj, TLObject tLObject, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.c = i10;
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
        int i10;
        ArrayList arrayList;
        final TLRPC.UserFull userFull;
        SQLiteCursor sQLiteCursor;
        int i11;
        final int i12;
        final boolean z10;
        boolean z11;
        TLRPC.UserFull userFull2;
        boolean z12;
        int i13;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList2;
        long j10;
        switch (this.a) {
            case 0:
                rb rbVar = (rb) this.d;
                String str = (String) this.e;
                rbVar.getClass();
                i0.g3(new ob(this.c, str, this.b));
                rbVar.b.u.remove(str);
                return;
            case 1:
                cd cdVar = (cd) this.d;
                Vector vector = (Vector) this.e;
                HashMap hashMap = cdVar.N;
                ArrayList arrayList3 = cdVar.J;
                HashMap hashMap2 = cdVar.M;
                cdVar.I = false;
                ArrayList arrayList4 = cdVar.L;
                int size = arrayList4.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((zc) arrayList4.get(i14)).k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                int size2 = vector.objects.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) vector.objects.get(i15);
                    if (v2.a) {
                        a1.g.z(tL_langPackLanguage.name, new StringBuilder("loaded lang "));
                    }
                    zc zcVar = new zc();
                    zcVar.b = tL_langPackLanguage.name;
                    zcVar.a = tL_langPackLanguage.native_name;
                    zcVar.c = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    String str2 = tL_langPackLanguage.base_lang_code;
                    if (str2 != null) {
                        zcVar.e = str2.replace('-', '_').toLowerCase();
                    } else {
                        zcVar.e = "";
                    }
                    zcVar.f = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    zcVar.g = tL_langPackLanguage.rtl;
                    zcVar.d = "remote";
                    zcVar.k = i15;
                    zc F0 = cdVar.F0(zcVar.b());
                    if (F0 == null) {
                        arrayList3.add(zcVar);
                        hashMap.put(zcVar.b(), zcVar);
                    } else {
                        F0.b = zcVar.b;
                        F0.a = zcVar.a;
                        F0.e = zcVar.e;
                        F0.f = zcVar.f;
                        F0.d = zcVar.d;
                        F0.k = zcVar.k;
                        zcVar = F0;
                    }
                    if (!hashMap2.containsKey(zcVar.b())) {
                        arrayList4.add(zcVar);
                        hashMap2.put(zcVar.b(), zcVar);
                    }
                }
                int i16 = 0;
                while (i16 < arrayList4.size()) {
                    zc zcVar2 = (zc) arrayList4.get(i16);
                    if (zcVar2.k == Integer.MAX_VALUE && zcVar2 != cdVar.B) {
                        if (v2.a) {
                            f8.b("remove lang " + zcVar2.b());
                        }
                        arrayList4.remove(i16);
                        hashMap2.remove(zcVar2.b());
                        arrayList3.remove(zcVar2);
                        hashMap.remove(zcVar2.b());
                        i16--;
                    }
                    i16++;
                }
                cdVar.X0();
                zs.e().k(zs.y4, new Object[0]);
                if (this.b) {
                    cdVar.d(cdVar.B, true, false, this.c);
                    return;
                }
                return;
            case 2:
                ((ui) this.d).b1(this.c, false, this.b, false, (q20) this.e);
                return;
            default:
                hs hsVar = (hs) this.d;
                final TLRPC.User user = (TLRPC.User) this.e;
                final boolean z13 = this.b;
                final int i17 = this.c;
                final HashMap hashMap3 = new HashMap();
                ArrayList arrayList5 = new ArrayList();
                try {
                    SQLiteCursor queryFinalized = hsVar.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid = " + user.id, new Object[0]);
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
                                                SQLiteDatabase sQLiteDatabase = hsVar.getMessagesStorage().b;
                                                Locale locale = Locale.US;
                                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user.id + " ORDER BY mid DESC", new Object[0]);
                                                while (queryFinalized.next()) {
                                                    try {
                                                        int intValue = queryFinalized.intValue(0);
                                                        arrayList5.add(Integer.valueOf(intValue));
                                                        hashMap3.put(Integer.valueOf(intValue), null);
                                                    } catch (Exception e) {
                                                        e = e;
                                                        sQLiteCursor = queryFinalized;
                                                        i12 = 0;
                                                        arrayList = arrayList5;
                                                        userFull = userFull2;
                                                        z10 = i12;
                                                        try {
                                                            hsVar.o(e, true);
                                                            final vp messagesController = hsVar.getMessagesController();
                                                            messagesController.getClass();
                                                            final ArrayList arrayList6 = arrayList;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    vp vpVar = vp.this;
                                                                    a0.h hVar = vpVar.k1;
                                                                    LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                    LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        vpVar.U2(user2, i17, z13, null);
                                                                    }
                                                                    TLRPC.UserFull userFull3 = userFull;
                                                                    if (userFull3 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull3, user2.id);
                                                                            vpVar.t7.M(user2.id);
                                                                            rh.e6.y(vpVar.currentAccount, false).Q(userFull3);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z14 = userFull3.blocked;
                                                                            int i18 = zs.g0;
                                                                            if (z14) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                            }
                                                                        }
                                                                        vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull3);
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList6, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
                                                                }
                                                            });
                                                            if (sQLiteCursor == null) {
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            final vp messagesController2 = hsVar.getMessagesController();
                                                            messagesController2.getClass();
                                                            final ArrayList arrayList7 = arrayList;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    vp vpVar = vp.this;
                                                                    a0.h hVar = vpVar.k1;
                                                                    LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                    LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        vpVar.U2(user2, i17, z13, null);
                                                                    }
                                                                    TLRPC.UserFull userFull3 = userFull;
                                                                    if (userFull3 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull3, user2.id);
                                                                            vpVar.t7.M(user2.id);
                                                                            rh.e6.y(vpVar.currentAccount, false).Q(userFull3);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z14 = userFull3.blocked;
                                                                            int i18 = zs.g0;
                                                                            if (z14) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                            }
                                                                        }
                                                                        vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull3);
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList7, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                                        i12 = 0;
                                                        arrayList = arrayList5;
                                                        userFull = userFull2;
                                                        z10 = i12;
                                                        final vp messagesController22 = hsVar.getMessagesController();
                                                        messagesController22.getClass();
                                                        final ArrayList arrayList72 = arrayList;
                                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                vp vpVar = vp.this;
                                                                a0.h hVar = vpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    vpVar.U2(user2, i17, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull3 = userFull;
                                                                if (userFull3 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull3, user2.id);
                                                                        vpVar.t7.M(user2.id);
                                                                        rh.e6.y(vpVar.currentAccount, false).Q(userFull3);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull3.blocked;
                                                                        int i18 = zs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                        }
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull3);
                                                                }
                                                                vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList72, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
                                                            }
                                                        });
                                                        if (sQLiteCursor != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                queryFinalized.dispose();
                                                queryFinalized = hsVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user.id, new Object[0]);
                                                if (queryFinalized.next()) {
                                                    z12 = false;
                                                    i13 = 0;
                                                } else {
                                                    int intValue2 = queryFinalized.intValue(0);
                                                    try {
                                                        z12 = queryFinalized.intValue(1) != 0;
                                                        i13 = intValue2;
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        TLRPC.UserFull userFull3 = userFull2;
                                                        z11 = false;
                                                        userFull = userFull3;
                                                        arrayList = arrayList5;
                                                        i12 = intValue2;
                                                        sQLiteCursor = queryFinalized;
                                                        z10 = z11;
                                                        hsVar.o(e, true);
                                                        final vp messagesController3 = hsVar.getMessagesController();
                                                        messagesController3.getClass();
                                                        final ArrayList arrayList62 = arrayList;
                                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                vp vpVar = vp.this;
                                                                a0.h hVar = vpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    vpVar.U2(user2, i17, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        vpVar.t7.M(user2.id);
                                                                        rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull32.blocked;
                                                                        int i18 = zs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                        }
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList62, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                                        i12 = intValue2;
                                                        sQLiteCursor = queryFinalized;
                                                        final vp messagesController222 = hsVar.getMessagesController();
                                                        messagesController222.getClass();
                                                        final ArrayList arrayList722 = arrayList;
                                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                vp vpVar = vp.this;
                                                                a0.h hVar = vpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    vpVar.U2(user2, i17, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        vpVar.t7.M(user2.id);
                                                                        rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull32.blocked;
                                                                        int i18 = zs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                        }
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList722, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        arrayList = arrayList5;
                                                        sQLiteCursor = null;
                                                        userFull = userFull2;
                                                        z10 = z12;
                                                        i12 = i13;
                                                        hsVar.o(e, true);
                                                        final vp messagesController32 = hsVar.getMessagesController();
                                                        messagesController32.getClass();
                                                        final ArrayList arrayList622 = arrayList;
                                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                vp vpVar = vp.this;
                                                                a0.h hVar = vpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    vpVar.U2(user2, i17, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        vpVar.t7.M(user2.id);
                                                                        rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull32.blocked;
                                                                        int i18 = zs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                        }
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList622, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                                        i12 = i13;
                                                        final vp messagesController2222 = hsVar.getMessagesController();
                                                        messagesController2222.getClass();
                                                        final ArrayList arrayList7222 = arrayList;
                                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                vp vpVar = vp.this;
                                                                a0.h hVar = vpVar.k1;
                                                                LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                TLRPC.User user2 = user;
                                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                    vpVar.U2(user2, i17, z13, null);
                                                                }
                                                                TLRPC.UserFull userFull32 = userFull;
                                                                if (userFull32 != null) {
                                                                    if (hVar.f(user2.id) == null) {
                                                                        hVar.k(userFull32, user2.id);
                                                                        vpVar.t7.M(user2.id);
                                                                        rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                        boolean z14 = userFull32.blocked;
                                                                        int i18 = zs.g0;
                                                                        if (z14) {
                                                                            if (indexOfKey < 0) {
                                                                                longSparseIntArray.put(user2.id, 1);
                                                                                vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                            }
                                                                        } else if (indexOfKey >= 0) {
                                                                            longSparseIntArray.removeAt(indexOfKey);
                                                                            vpVar.getNotificationCenter().k(i18, new Object[0]);
                                                                        }
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                                }
                                                                vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList7222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                                                ArrayList P0 = hsVar.getMediaDataController().P0(user.id, 0L, arrayList, true);
                                                                if (P0 != null) {
                                                                    int size3 = P0.size();
                                                                    for (int i18 = 0; i18 < size3; i18++) {
                                                                        jj jjVar = (jj) P0.get(i18);
                                                                        hashMap3.put(Integer.valueOf(jjVar.f1()), jjVar);
                                                                    }
                                                                }
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                sQLiteCursor = sQLiteCursor2;
                                                                z10 = z12;
                                                                i12 = i13;
                                                                hsVar.o(e, true);
                                                                final vp messagesController322 = hsVar.getMessagesController();
                                                                messagesController322.getClass();
                                                                final ArrayList arrayList6222 = arrayList;
                                                                i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        vp vpVar = vp.this;
                                                                        a0.h hVar = vpVar.k1;
                                                                        LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                        LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                            vpVar.U2(user2, i17, z13, null);
                                                                        }
                                                                        TLRPC.UserFull userFull32 = userFull;
                                                                        if (userFull32 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull32, user2.id);
                                                                                vpVar.t7.M(user2.id);
                                                                                rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z14 = userFull32.blocked;
                                                                                int i182 = zs.g0;
                                                                                if (z14) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                                }
                                                                            }
                                                                            vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                                        }
                                                                        vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList6222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                                                i12 = i13;
                                                                final vp messagesController22222 = hsVar.getMessagesController();
                                                                messagesController22222.getClass();
                                                                final ArrayList arrayList72222 = arrayList;
                                                                i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        vp vpVar = vp.this;
                                                                        a0.h hVar = vpVar.k1;
                                                                        LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                        LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                        TLRPC.User user2 = user;
                                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                            vpVar.U2(user2, i17, z13, null);
                                                                        }
                                                                        TLRPC.UserFull userFull32 = userFull;
                                                                        if (userFull32 != null) {
                                                                            if (hVar.f(user2.id) == null) {
                                                                                hVar.k(userFull32, user2.id);
                                                                                vpVar.t7.M(user2.id);
                                                                                rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                                boolean z14 = userFull32.blocked;
                                                                                int i182 = zs.g0;
                                                                                if (z14) {
                                                                                    if (indexOfKey < 0) {
                                                                                        longSparseIntArray.put(user2.id, 1);
                                                                                        vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                                    }
                                                                                } else if (indexOfKey >= 0) {
                                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                                }
                                                                            }
                                                                            vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                                        }
                                                                        vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList72222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
                                                                    }
                                                                });
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            arrayList = arrayList5;
                                                            userFull = userFull5;
                                                            sQLiteCursor2 = null;
                                                            sQLiteCursor = sQLiteCursor2;
                                                            z10 = z12;
                                                            i12 = i13;
                                                            hsVar.o(e, true);
                                                            final vp messagesController3222 = hsVar.getMessagesController();
                                                            messagesController3222.getClass();
                                                            final ArrayList arrayList62222 = arrayList;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    vp vpVar = vp.this;
                                                                    a0.h hVar = vpVar.k1;
                                                                    LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                    LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        vpVar.U2(user2, i17, z13, null);
                                                                    }
                                                                    TLRPC.UserFull userFull32 = userFull;
                                                                    if (userFull32 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull32, user2.id);
                                                                            vpVar.t7.M(user2.id);
                                                                            rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z14 = userFull32.blocked;
                                                                            int i182 = zs.g0;
                                                                            if (z14) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                            }
                                                                        }
                                                                        vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList62222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                                            i12 = i13;
                                                            final vp messagesController222222 = hsVar.getMessagesController();
                                                            messagesController222222.getClass();
                                                            final ArrayList arrayList722222 = arrayList;
                                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    vp vpVar = vp.this;
                                                                    a0.h hVar = vpVar.k1;
                                                                    LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                                    LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                                    TLRPC.User user2 = user;
                                                                    if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                                        vpVar.U2(user2, i17, z13, null);
                                                                    }
                                                                    TLRPC.UserFull userFull32 = userFull;
                                                                    if (userFull32 != null) {
                                                                        if (hVar.f(user2.id) == null) {
                                                                            hVar.k(userFull32, user2.id);
                                                                            vpVar.t7.M(user2.id);
                                                                            rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                            int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                            boolean z14 = userFull32.blocked;
                                                                            int i182 = zs.g0;
                                                                            if (z14) {
                                                                                if (indexOfKey < 0) {
                                                                                    longSparseIntArray.put(user2.id, 1);
                                                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                                }
                                                                            } else if (indexOfKey >= 0) {
                                                                                longSparseIntArray.removeAt(indexOfKey);
                                                                                vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                            }
                                                                        }
                                                                        vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                                    }
                                                                    vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList722222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
                                                                }
                                                            });
                                                            if (sQLiteCursor != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
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
                                                    hsVar.Q(TextUtils.join(",", arrayList2), arrayList8);
                                                    i0.g3(new xp(hsVar, arrayList8, 6));
                                                }
                                                final vp messagesController4 = hsVar.getMessagesController();
                                                messagesController4.getClass();
                                                final ArrayList arrayList9 = arrayList;
                                                final boolean z14 = z12;
                                                final int i19 = i13;
                                                i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        vp vpVar = vp.this;
                                                        a0.h hVar = vpVar.k1;
                                                        LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                        LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            vpVar.U2(user2, i17, z13, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                vpVar.t7.M(user2.id);
                                                                rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z142 = userFull32.blocked;
                                                                int i182 = zs.g0;
                                                                if (z142) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                }
                                                            }
                                                            vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList9, hashMap3, Integer.valueOf(i19), Boolean.valueOf(z14));
                                                    }
                                                });
                                                return;
                                            } catch (Exception e14) {
                                                e = e14;
                                                i12 = 0;
                                                z11 = false;
                                                arrayList = arrayList5;
                                                userFull = TLdeserialize;
                                                sQLiteCursor = queryFinalized;
                                                z10 = z11;
                                                hsVar.o(e, true);
                                                final vp messagesController32222 = hsVar.getMessagesController();
                                                messagesController32222.getClass();
                                                final ArrayList arrayList622222 = arrayList;
                                                i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        vp vpVar = vp.this;
                                                        a0.h hVar = vpVar.k1;
                                                        LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                        LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            vpVar.U2(user2, i17, z13, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                vpVar.t7.M(user2.id);
                                                                rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z142 = userFull32.blocked;
                                                                int i182 = zs.g0;
                                                                if (z142) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                }
                                                            }
                                                            vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList622222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
                                                    }
                                                });
                                                if (sQLiteCursor == null) {
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                i12 = 0;
                                                z10 = 0;
                                                arrayList = arrayList5;
                                                userFull = TLdeserialize;
                                                sQLiteCursor = queryFinalized;
                                                final vp messagesController2222222 = hsVar.getMessagesController();
                                                messagesController2222222.getClass();
                                                final ArrayList arrayList7222222 = arrayList;
                                                i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        vp vpVar = vp.this;
                                                        a0.h hVar = vpVar.k1;
                                                        LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                        LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                        TLRPC.User user2 = user;
                                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                            vpVar.U2(user2, i17, z13, null);
                                                        }
                                                        TLRPC.UserFull userFull32 = userFull;
                                                        if (userFull32 != null) {
                                                            if (hVar.f(user2.id) == null) {
                                                                hVar.k(userFull32, user2.id);
                                                                vpVar.t7.M(user2.id);
                                                                rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                                boolean z142 = userFull32.blocked;
                                                                int i182 = zs.g0;
                                                                if (z142) {
                                                                    if (indexOfKey < 0) {
                                                                        longSparseIntArray.put(user2.id, 1);
                                                                        vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                    }
                                                                } else if (indexOfKey >= 0) {
                                                                    longSparseIntArray.removeAt(indexOfKey);
                                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                                }
                                                            }
                                                            vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                        }
                                                        vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList7222222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
                                                    }
                                                });
                                                if (sQLiteCursor != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        sQLiteCursor = queryFinalized;
                                        z10 = 0;
                                        arrayList = arrayList5;
                                        userFull = null;
                                        i12 = 0;
                                        hsVar.o(e, true);
                                        final vp messagesController322222 = hsVar.getMessagesController();
                                        messagesController322222.getClass();
                                        final ArrayList arrayList6222222 = arrayList;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                vp vpVar = vp.this;
                                                a0.h hVar = vpVar.k1;
                                                LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                    vpVar.U2(user2, i17, z13, null);
                                                }
                                                TLRPC.UserFull userFull32 = userFull;
                                                if (userFull32 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull32, user2.id);
                                                        vpVar.t7.M(user2.id);
                                                        rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z142 = userFull32.blocked;
                                                        int i182 = zs.g0;
                                                        if (z142) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                        }
                                                    }
                                                    vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                }
                                                vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList6222222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                        i12 = 0;
                                        final vp messagesController22222222 = hsVar.getMessagesController();
                                        messagesController22222222.getClass();
                                        final ArrayList arrayList72222222 = arrayList;
                                        i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                vp vpVar = vp.this;
                                                a0.h hVar = vpVar.k1;
                                                LongSparseIntArray longSparseIntArray = vpVar.G0;
                                                LongSparseLongArray longSparseLongArray = vpVar.r1;
                                                TLRPC.User user2 = user;
                                                if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                                    vpVar.U2(user2, i17, z13, null);
                                                }
                                                TLRPC.UserFull userFull32 = userFull;
                                                if (userFull32 != null) {
                                                    if (hVar.f(user2.id) == null) {
                                                        hVar.k(userFull32, user2.id);
                                                        vpVar.t7.M(user2.id);
                                                        rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                        int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                        boolean z142 = userFull32.blocked;
                                                        int i182 = zs.g0;
                                                        if (z142) {
                                                            if (indexOfKey < 0) {
                                                                longSparseIntArray.put(user2.id, 1);
                                                                vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                            }
                                                        } else if (indexOfKey >= 0) {
                                                            longSparseIntArray.removeAt(indexOfKey);
                                                            vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                        }
                                                    }
                                                    vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                                }
                                                vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList72222222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
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
                                final vp messagesController42 = hsVar.getMessagesController();
                                messagesController42.getClass();
                                final ArrayList arrayList92 = arrayList;
                                final boolean z142 = z12;
                                final int i192 = i13;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        vp vpVar = vp.this;
                                        a0.h hVar = vpVar.k1;
                                        LongSparseIntArray longSparseIntArray = vpVar.G0;
                                        LongSparseLongArray longSparseLongArray = vpVar.r1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            vpVar.U2(user2, i17, z13, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                vpVar.t7.M(user2.id);
                                                rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1422 = userFull32.blocked;
                                                int i182 = zs.g0;
                                                if (z1422) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                }
                                            }
                                            vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList92, hashMap3, Integer.valueOf(i192), Boolean.valueOf(z142));
                                    }
                                });
                                return;
                            } catch (Exception e16) {
                                e = e16;
                                z10 = z12;
                                i12 = i13;
                                sQLiteCursor = sQLiteCursor2;
                                hsVar.o(e, true);
                                final vp messagesController3222222 = hsVar.getMessagesController();
                                messagesController3222222.getClass();
                                final ArrayList arrayList62222222 = arrayList;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        vp vpVar = vp.this;
                                        a0.h hVar = vpVar.k1;
                                        LongSparseIntArray longSparseIntArray = vpVar.G0;
                                        LongSparseLongArray longSparseLongArray = vpVar.r1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            vpVar.U2(user2, i17, z13, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                vpVar.t7.M(user2.id);
                                                rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1422 = userFull32.blocked;
                                                int i182 = zs.g0;
                                                if (z1422) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                }
                                            }
                                            vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList62222222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
                                    }
                                });
                                if (sQLiteCursor == null) {
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                z10 = z12;
                                i12 = i13;
                                sQLiteCursor = sQLiteCursor2;
                                final vp messagesController222222222 = hsVar.getMessagesController();
                                messagesController222222222.getClass();
                                final ArrayList arrayList722222222 = arrayList;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.ql
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        vp vpVar = vp.this;
                                        a0.h hVar = vpVar.k1;
                                        LongSparseIntArray longSparseIntArray = vpVar.G0;
                                        LongSparseLongArray longSparseLongArray = vpVar.r1;
                                        TLRPC.User user2 = user;
                                        if (System.currentTimeMillis() - longSparseLongArray.get(user2.id, 0L) > 60000) {
                                            vpVar.U2(user2, i17, z13, null);
                                        }
                                        TLRPC.UserFull userFull32 = userFull;
                                        if (userFull32 != null) {
                                            if (hVar.f(user2.id) == null) {
                                                hVar.k(userFull32, user2.id);
                                                vpVar.t7.M(user2.id);
                                                rh.e6.y(vpVar.currentAccount, false).Q(userFull32);
                                                int indexOfKey = longSparseIntArray.indexOfKey(user2.id);
                                                boolean z1422 = userFull32.blocked;
                                                int i182 = zs.g0;
                                                if (z1422) {
                                                    if (indexOfKey < 0) {
                                                        longSparseIntArray.put(user2.id, 1);
                                                        vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                    }
                                                } else if (indexOfKey >= 0) {
                                                    longSparseIntArray.removeAt(indexOfKey);
                                                    vpVar.getNotificationCenter().k(i182, new Object[0]);
                                                }
                                            }
                                            vpVar.getNotificationCenter().k(zs.E0, Long.valueOf(user2.id), userFull32);
                                        }
                                        vpVar.getNotificationCenter().k(zs.F0, Long.valueOf(user2.id), arrayList722222222, hashMap3, Integer.valueOf(i12), Boolean.valueOf(z10));
                                    }
                                });
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                            queryFinalized.dispose();
                            SQLiteDatabase sQLiteDatabase2 = hsVar.getMessagesStorage().b;
                            Locale locale2 = Locale.US;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + user.id + " ORDER BY mid DESC", new Object[0]);
                            while (queryFinalized.next()) {
                            }
                            queryFinalized.dispose();
                            queryFinalized = hsVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + user.id, new Object[0]);
                            if (queryFinalized.next()) {
                            }
                            queryFinalized.dispose();
                            if (userFull2 != null) {
                            }
                            if (arrayList5.isEmpty()) {
                            }
                        } catch (Exception e17) {
                            e = e17;
                            i11 = 0;
                            arrayList = arrayList5;
                            userFull = userFull2;
                            sQLiteCursor = queryFinalized;
                            break;
                        } catch (Throwable th12) {
                            th = th12;
                            i10 = 0;
                            arrayList = arrayList5;
                            userFull = userFull2;
                            sQLiteCursor = queryFinalized;
                            break;
                        }
                        userFull2 = null;
                    } catch (Exception e18) {
                        e = e18;
                        i11 = 0;
                        arrayList = arrayList5;
                        sQLiteCursor = queryFinalized;
                        userFull = null;
                        break;
                    } catch (Throwable th13) {
                        th = th13;
                        i10 = 0;
                        arrayList = arrayList5;
                        sQLiteCursor = queryFinalized;
                        userFull = null;
                        break;
                    }
                } catch (Exception e19) {
                    e = e19;
                    i11 = 0;
                    arrayList = arrayList5;
                    userFull = null;
                    sQLiteCursor = null;
                    break;
                } catch (Throwable th14) {
                    th = th14;
                    i10 = 0;
                    arrayList = arrayList5;
                    userFull = null;
                    sQLiteCursor = null;
                    break;
                }
        }
    }

    public /* synthetic */ nb(rb rbVar, int i10, String str, boolean z10) {
        this.a = 0;
        this.d = rbVar;
        this.c = i10;
        this.e = str;
        this.b = z10;
    }

    public /* synthetic */ nb(ui uiVar, int i10, boolean z10, q20 q20Var) {
        this.a = 2;
        this.d = uiVar;
        this.c = i10;
        this.b = z10;
        this.e = q20Var;
    }
}
