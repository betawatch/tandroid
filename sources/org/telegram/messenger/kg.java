package org.telegram.messenger;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kg(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        hs hsVar = (hs) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        hsVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = hsVar.b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e) {
            hsVar.o(e, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        hs hsVar = (hs) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        org.telegram.ui.nh nhVar = (org.telegram.ui.nh) this.d;
        long e = hsVar.getUserConfig().e();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            jj jjVar = (jj) arrayList.get(i10);
            if (!jjVar.p1 && !jj.b4(jjVar.k)) {
                try {
                    sQLiteCursor = hsVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(jj.B0(jjVar.k)), Integer.valueOf(jjVar.f1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e);
                                byteBufferValue.reuse();
                                jjVar.k.attachPath = TLdeserialize.attachPath;
                                jjVar.K(true);
                            }
                        } catch (Exception e7) {
                            e = e7;
                            f8.g(e, true);
                            if (sQLiteCursor == null) {
                                i10 = i11;
                            }
                            sQLiteCursor.dispose();
                            i10 = i11;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                sQLiteCursor.dispose();
            }
            i10 = i11;
        }
        i0.g3(nhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0209 A[Catch: Exception -> 0x01ab, TryCatch #3 {Exception -> 0x01ab, blocks: (B:84:0x0191, B:88:0x019f, B:97:0x01b4, B:99:0x01cf, B:103:0x01eb, B:104:0x01e2, B:107:0x0200, B:109:0x0209, B:113:0x0224, B:114:0x0216, B:117:0x0227, B:119:0x0237, B:121:0x0249, B:122:0x025c, B:124:0x0266, B:126:0x0272, B:128:0x0286, B:130:0x029c, B:132:0x02a2, B:135:0x02ad, B:138:0x024e, B:141:0x0257, B:142:0x0255, B:146:0x02bf, B:147:0x02c7, B:149:0x02cd, B:155:0x02f1, B:156:0x02f6, B:158:0x02fc, B:160:0x0303, B:161:0x030a, B:163:0x0310, B:165:0x031a, B:166:0x031e, B:172:0x0335, B:174:0x0344, B:180:0x034d, B:184:0x0350, B:183:0x0356, B:187:0x02ff, B:188:0x02f4, B:190:0x0359, B:192:0x035f, B:194:0x036c, B:196:0x0371, B:199:0x04b7, B:208:0x0382, B:210:0x03ad, B:211:0x03b1, B:215:0x03bc, B:217:0x03c5, B:219:0x03d3, B:220:0x03e6, B:222:0x03ee, B:223:0x03f3, B:225:0x040d, B:227:0x0413, B:229:0x03d8, B:232:0x03e1, B:233:0x03df, B:236:0x041a, B:238:0x0421, B:239:0x0426, B:241:0x042d, B:243:0x043b, B:245:0x0445, B:246:0x0448, B:248:0x0450, B:251:0x0495, B:252:0x045f, B:255:0x0470, B:257:0x047f, B:258:0x0482, B:260:0x048a, B:264:0x046d, B:266:0x04a3, B:267:0x0424, B:268:0x041d, B:270:0x04ae, B:280:0x04ca), top: B:83:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0237 A[Catch: Exception -> 0x01ab, TryCatch #3 {Exception -> 0x01ab, blocks: (B:84:0x0191, B:88:0x019f, B:97:0x01b4, B:99:0x01cf, B:103:0x01eb, B:104:0x01e2, B:107:0x0200, B:109:0x0209, B:113:0x0224, B:114:0x0216, B:117:0x0227, B:119:0x0237, B:121:0x0249, B:122:0x025c, B:124:0x0266, B:126:0x0272, B:128:0x0286, B:130:0x029c, B:132:0x02a2, B:135:0x02ad, B:138:0x024e, B:141:0x0257, B:142:0x0255, B:146:0x02bf, B:147:0x02c7, B:149:0x02cd, B:155:0x02f1, B:156:0x02f6, B:158:0x02fc, B:160:0x0303, B:161:0x030a, B:163:0x0310, B:165:0x031a, B:166:0x031e, B:172:0x0335, B:174:0x0344, B:180:0x034d, B:184:0x0350, B:183:0x0356, B:187:0x02ff, B:188:0x02f4, B:190:0x0359, B:192:0x035f, B:194:0x036c, B:196:0x0371, B:199:0x04b7, B:208:0x0382, B:210:0x03ad, B:211:0x03b1, B:215:0x03bc, B:217:0x03c5, B:219:0x03d3, B:220:0x03e6, B:222:0x03ee, B:223:0x03f3, B:225:0x040d, B:227:0x0413, B:229:0x03d8, B:232:0x03e1, B:233:0x03df, B:236:0x041a, B:238:0x0421, B:239:0x0426, B:241:0x042d, B:243:0x043b, B:245:0x0445, B:246:0x0448, B:248:0x0450, B:251:0x0495, B:252:0x045f, B:255:0x0470, B:257:0x047f, B:258:0x0482, B:260:0x048a, B:264:0x046d, B:266:0x04a3, B:267:0x0424, B:268:0x041d, B:270:0x04ae, B:280:0x04ca), top: B:83:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bf A[Catch: Exception -> 0x01ab, TryCatch #3 {Exception -> 0x01ab, blocks: (B:84:0x0191, B:88:0x019f, B:97:0x01b4, B:99:0x01cf, B:103:0x01eb, B:104:0x01e2, B:107:0x0200, B:109:0x0209, B:113:0x0224, B:114:0x0216, B:117:0x0227, B:119:0x0237, B:121:0x0249, B:122:0x025c, B:124:0x0266, B:126:0x0272, B:128:0x0286, B:130:0x029c, B:132:0x02a2, B:135:0x02ad, B:138:0x024e, B:141:0x0257, B:142:0x0255, B:146:0x02bf, B:147:0x02c7, B:149:0x02cd, B:155:0x02f1, B:156:0x02f6, B:158:0x02fc, B:160:0x0303, B:161:0x030a, B:163:0x0310, B:165:0x031a, B:166:0x031e, B:172:0x0335, B:174:0x0344, B:180:0x034d, B:184:0x0350, B:183:0x0356, B:187:0x02ff, B:188:0x02f4, B:190:0x0359, B:192:0x035f, B:194:0x036c, B:196:0x0371, B:199:0x04b7, B:208:0x0382, B:210:0x03ad, B:211:0x03b1, B:215:0x03bc, B:217:0x03c5, B:219:0x03d3, B:220:0x03e6, B:222:0x03ee, B:223:0x03f3, B:225:0x040d, B:227:0x0413, B:229:0x03d8, B:232:0x03e1, B:233:0x03df, B:236:0x041a, B:238:0x0421, B:239:0x0426, B:241:0x042d, B:243:0x043b, B:245:0x0445, B:246:0x0448, B:248:0x0450, B:251:0x0495, B:252:0x045f, B:255:0x0470, B:257:0x047f, B:258:0x0482, B:260:0x048a, B:264:0x046d, B:266:0x04a3, B:267:0x0424, B:268:0x041d, B:270:0x04ae, B:280:0x04ca), top: B:83:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035f A[Catch: Exception -> 0x01ab, TryCatch #3 {Exception -> 0x01ab, blocks: (B:84:0x0191, B:88:0x019f, B:97:0x01b4, B:99:0x01cf, B:103:0x01eb, B:104:0x01e2, B:107:0x0200, B:109:0x0209, B:113:0x0224, B:114:0x0216, B:117:0x0227, B:119:0x0237, B:121:0x0249, B:122:0x025c, B:124:0x0266, B:126:0x0272, B:128:0x0286, B:130:0x029c, B:132:0x02a2, B:135:0x02ad, B:138:0x024e, B:141:0x0257, B:142:0x0255, B:146:0x02bf, B:147:0x02c7, B:149:0x02cd, B:155:0x02f1, B:156:0x02f6, B:158:0x02fc, B:160:0x0303, B:161:0x030a, B:163:0x0310, B:165:0x031a, B:166:0x031e, B:172:0x0335, B:174:0x0344, B:180:0x034d, B:184:0x0350, B:183:0x0356, B:187:0x02ff, B:188:0x02f4, B:190:0x0359, B:192:0x035f, B:194:0x036c, B:196:0x0371, B:199:0x04b7, B:208:0x0382, B:210:0x03ad, B:211:0x03b1, B:215:0x03bc, B:217:0x03c5, B:219:0x03d3, B:220:0x03e6, B:222:0x03ee, B:223:0x03f3, B:225:0x040d, B:227:0x0413, B:229:0x03d8, B:232:0x03e1, B:233:0x03df, B:236:0x041a, B:238:0x0421, B:239:0x0426, B:241:0x042d, B:243:0x043b, B:245:0x0445, B:246:0x0448, B:248:0x0450, B:251:0x0495, B:252:0x045f, B:255:0x0470, B:257:0x047f, B:258:0x0482, B:260:0x048a, B:264:0x046d, B:266:0x04a3, B:267:0x0424, B:268:0x041d, B:270:0x04ae, B:280:0x04ca), top: B:83:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036c A[Catch: Exception -> 0x01ab, TryCatch #3 {Exception -> 0x01ab, blocks: (B:84:0x0191, B:88:0x019f, B:97:0x01b4, B:99:0x01cf, B:103:0x01eb, B:104:0x01e2, B:107:0x0200, B:109:0x0209, B:113:0x0224, B:114:0x0216, B:117:0x0227, B:119:0x0237, B:121:0x0249, B:122:0x025c, B:124:0x0266, B:126:0x0272, B:128:0x0286, B:130:0x029c, B:132:0x02a2, B:135:0x02ad, B:138:0x024e, B:141:0x0257, B:142:0x0255, B:146:0x02bf, B:147:0x02c7, B:149:0x02cd, B:155:0x02f1, B:156:0x02f6, B:158:0x02fc, B:160:0x0303, B:161:0x030a, B:163:0x0310, B:165:0x031a, B:166:0x031e, B:172:0x0335, B:174:0x0344, B:180:0x034d, B:184:0x0350, B:183:0x0356, B:187:0x02ff, B:188:0x02f4, B:190:0x0359, B:192:0x035f, B:194:0x036c, B:196:0x0371, B:199:0x04b7, B:208:0x0382, B:210:0x03ad, B:211:0x03b1, B:215:0x03bc, B:217:0x03c5, B:219:0x03d3, B:220:0x03e6, B:222:0x03ee, B:223:0x03f3, B:225:0x040d, B:227:0x0413, B:229:0x03d8, B:232:0x03e1, B:233:0x03df, B:236:0x041a, B:238:0x0421, B:239:0x0426, B:241:0x042d, B:243:0x043b, B:245:0x0445, B:246:0x0448, B:248:0x0450, B:251:0x0495, B:252:0x045f, B:255:0x0470, B:257:0x047f, B:258:0x0482, B:260:0x048a, B:264:0x046d, B:266:0x04a3, B:267:0x0424, B:268:0x041d, B:270:0x04ae, B:280:0x04ca), top: B:83:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0371 A[Catch: Exception -> 0x01ab, TryCatch #3 {Exception -> 0x01ab, blocks: (B:84:0x0191, B:88:0x019f, B:97:0x01b4, B:99:0x01cf, B:103:0x01eb, B:104:0x01e2, B:107:0x0200, B:109:0x0209, B:113:0x0224, B:114:0x0216, B:117:0x0227, B:119:0x0237, B:121:0x0249, B:122:0x025c, B:124:0x0266, B:126:0x0272, B:128:0x0286, B:130:0x029c, B:132:0x02a2, B:135:0x02ad, B:138:0x024e, B:141:0x0257, B:142:0x0255, B:146:0x02bf, B:147:0x02c7, B:149:0x02cd, B:155:0x02f1, B:156:0x02f6, B:158:0x02fc, B:160:0x0303, B:161:0x030a, B:163:0x0310, B:165:0x031a, B:166:0x031e, B:172:0x0335, B:174:0x0344, B:180:0x034d, B:184:0x0350, B:183:0x0356, B:187:0x02ff, B:188:0x02f4, B:190:0x0359, B:192:0x035f, B:194:0x036c, B:196:0x0371, B:199:0x04b7, B:208:0x0382, B:210:0x03ad, B:211:0x03b1, B:215:0x03bc, B:217:0x03c5, B:219:0x03d3, B:220:0x03e6, B:222:0x03ee, B:223:0x03f3, B:225:0x040d, B:227:0x0413, B:229:0x03d8, B:232:0x03e1, B:233:0x03df, B:236:0x041a, B:238:0x0421, B:239:0x0426, B:241:0x042d, B:243:0x043b, B:245:0x0445, B:246:0x0448, B:248:0x0450, B:251:0x0495, B:252:0x045f, B:255:0x0470, B:257:0x047f, B:258:0x0482, B:260:0x048a, B:264:0x046d, B:266:0x04a3, B:267:0x0424, B:268:0x041d, B:270:0x04ae, B:280:0x04ca), top: B:83:0x0191 }] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        boolean z10;
        hs hsVar;
        TLRPC.TL_messages_dialogs H0;
        int i10;
        int i11;
        SparseArray sparseArray;
        int i12;
        ArrayList arrayList;
        hs hsVar2;
        HashMap hashMap;
        int i13;
        HashMap hashMap2;
        int i14;
        ?? r52;
        ArrayList arrayList2;
        Long valueOf;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList3;
        hs hsVar3;
        LinkedHashMap linkedHashMap;
        int size;
        int i15;
        int size2;
        int i16;
        LinkedHashMap linkedHashMap2;
        boolean z15;
        int i17;
        Long valueOf2;
        int i18;
        hs hsVar4 = (hs) this.b;
        ArrayList arrayList4 = (ArrayList) this.c;
        final Runnable runnable = (Runnable) this.d;
        try {
            SparseArray sparseArray2 = new SparseArray();
            int size3 = hsVar4.H.size();
            for (int i19 = 0; i19 < size3; i19++) {
                ap apVar = (ap) hsVar4.H.get(i19);
                sparseArray2.put(apVar.a, apVar);
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            HashMap hashMap3 = new HashMap();
            ArrayList arrayList7 = new ArrayList();
            ?? hashMap4 = new HashMap();
            ArrayList arrayList8 = new ArrayList();
            final HashMap hashMap5 = new HashMap();
            final ArrayList arrayList9 = new ArrayList();
            final HashMap hashMap6 = new HashMap();
            final HashSet hashSet = new HashSet();
            try {
                int size4 = arrayList4.size();
                int i20 = 0;
                hs hsVar5 = hashMap4;
                while (i20 < size4) {
                    try {
                        ArrayList arrayList10 = arrayList4;
                        TLRPC.DialogFilter dialogFilter = (TLRPC.DialogFilter) arrayList4.get(i20);
                        arrayList5.add(Integer.valueOf(dialogFilter.id));
                        if (dialogFilter.contacts) {
                            int i21 = vp.D8;
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (dialogFilter.non_contacts) {
                            int i22 = vp.D8;
                            i10 |= 2;
                        }
                        if (dialogFilter.groups) {
                            int i23 = vp.D8;
                            i10 |= 4;
                        }
                        if (dialogFilter.broadcasts) {
                            int i24 = vp.D8;
                            i10 |= 8;
                        }
                        if (dialogFilter.bots) {
                            int i25 = vp.D8;
                            i10 |= 16;
                        }
                        if (dialogFilter.exclude_muted) {
                            int i26 = vp.D8;
                            i10 |= 32;
                        }
                        if (dialogFilter.exclude_read) {
                            int i27 = vp.D8;
                            i11 = i10 | 64;
                        } else {
                            i11 = i10;
                        }
                        int i28 = i20;
                        if (dialogFilter.exclude_archived) {
                            int i29 = vp.D8;
                            i11 |= 128;
                        }
                        if (dialogFilter instanceof TLRPC.TL_dialogFilterChatlist) {
                            int i30 = vp.D8;
                            i11 = dialogFilter.has_my_invites ? i11 | 1536 : i11 | 512;
                        }
                        ArrayList arrayList11 = arrayList5;
                        ap apVar2 = (ap) hsVar4.I.get(dialogFilter.id);
                        if (apVar2 != null) {
                            sparseArray2.remove(dialogFilter.id);
                            sparseArray = sparseArray2;
                            if (TextUtils.equals(apVar2.b, dialogFilter.title.text) && ui.K(apVar2.c, dialogFilter.title.entities)) {
                                z11 = false;
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = dialogFilter.title;
                                apVar2.b = tL_textWithEntities.text;
                                apVar2.c = tL_textWithEntities.entities;
                                z11 = true;
                            }
                            boolean z16 = apVar2.n;
                            boolean z17 = z11;
                            boolean z18 = dialogFilter.title_noanimate;
                            if (z16 != z18) {
                                apVar2.n = z18;
                                z12 = true;
                            } else {
                                z12 = z17;
                            }
                            int i31 = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                            boolean z19 = z12;
                            if (apVar2.m != i31) {
                                apVar2.m = i31;
                                z13 = true;
                            } else {
                                z13 = z19;
                            }
                            if (apVar2.g != i11) {
                                apVar2.g = i11;
                                z14 = true;
                                z13 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z20 = z14;
                            HashSet hashSet2 = new HashSet(apVar2.h);
                            hashSet2.addAll(apVar2.i);
                            HashSet hashSet3 = new HashSet();
                            boolean z21 = z13;
                            if (apVar2.j.size() != 0) {
                                ArrayList arrayList12 = new ArrayList();
                                i12 = size4;
                                int size5 = apVar2.j.size();
                                hsVar = hsVar4;
                                int i32 = 0;
                                boolean z22 = false;
                                while (i32 < size5) {
                                    int i33 = size5;
                                    try {
                                        long keyAt = apVar2.j.keyAt(i32);
                                        if (o5.C(keyAt)) {
                                            z22 = true;
                                        }
                                        arrayList12.add(Long.valueOf(keyAt));
                                        i32++;
                                        size5 = i33;
                                    } catch (Exception e) {
                                        e = e;
                                        z10 = true;
                                        hsVar4 = hsVar;
                                        hsVar4.o(e, z10);
                                    }
                                }
                                if (z22) {
                                    linkedHashMap = new LinkedHashMap();
                                    arrayList3 = arrayList7;
                                    hsVar3 = hsVar5;
                                    Collections.sort(arrayList12, new fr(apVar2.j, 0));
                                    int size6 = arrayList12.size();
                                    int i34 = 0;
                                    while (i34 < size6) {
                                        Long l4 = (Long) arrayList12.get(i34);
                                        if (o5.C(l4.longValue())) {
                                            i18 = size6;
                                            linkedHashMap.put(Integer.valueOf(i34), l4);
                                        } else {
                                            i18 = size6;
                                        }
                                        i34++;
                                        size6 = i18;
                                    }
                                    size = apVar2.j.size();
                                    for (i15 = 0; i15 < size; i15++) {
                                        long keyAt2 = apVar2.j.keyAt(i15);
                                        if (!o5.C(keyAt2)) {
                                            hashSet3.add(Long.valueOf(keyAt2));
                                            hashSet2.remove(Long.valueOf(keyAt2));
                                        }
                                    }
                                    apVar2.j.clear();
                                    size2 = dialogFilter.pinned_peers.size();
                                    boolean z23 = z21;
                                    i16 = 0;
                                    while (i16 < size2) {
                                        TLRPC.InputPeer inputPeer = dialogFilter.pinned_peers.get(i16);
                                        int i35 = i16;
                                        boolean z24 = z23;
                                        long j10 = inputPeer.user_id;
                                        if (j10 != 0) {
                                            valueOf2 = Long.valueOf(j10);
                                        } else {
                                            long j11 = inputPeer.chat_id;
                                            if (j11 == 0) {
                                                j11 = inputPeer.channel_id;
                                            }
                                            valueOf2 = Long.valueOf(-j11);
                                        }
                                        int size7 = apVar2.j.size();
                                        int i36 = size2;
                                        if (linkedHashMap != null) {
                                            while (true) {
                                                Long l10 = (Long) linkedHashMap.remove(Integer.valueOf(size7));
                                                if (l10 == null) {
                                                    break;
                                                }
                                                apVar2.j.put(l10.longValue(), size7);
                                                size7++;
                                                linkedHashMap = linkedHashMap;
                                                hashMap3 = hashMap3;
                                            }
                                        }
                                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                                        HashMap hashMap7 = hashMap3;
                                        apVar2.j.put(valueOf2.longValue(), size7);
                                        hashSet2.remove(valueOf2);
                                        if (hashSet3.remove(valueOf2)) {
                                            z23 = z24;
                                        } else {
                                            if (!hashMap5.containsKey(valueOf2)) {
                                                arrayList8.add(valueOf2);
                                                hashMap5.put(valueOf2, inputPeer);
                                            }
                                            z23 = true;
                                        }
                                        i16 = i35 + 1;
                                        size2 = i36;
                                        linkedHashMap = linkedHashMap3;
                                        hashMap3 = hashMap7;
                                    }
                                    linkedHashMap2 = linkedHashMap;
                                    HashMap hashMap8 = hashMap3;
                                    boolean z25 = z23;
                                    if (linkedHashMap2 != null) {
                                        Iterator it = linkedHashMap2.entrySet().iterator();
                                        while (it.hasNext()) {
                                            apVar2.j.put(((Long) ((Map.Entry) it.next()).getValue()).longValue(), apVar2.j.size());
                                        }
                                    }
                                    z15 = z25;
                                    i17 = 0;
                                    while (i17 < 2) {
                                        ArrayList L1 = hs.L1(i17 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers);
                                        ArrayList arrayList13 = i17 == 0 ? apVar2.h : apVar2.i;
                                        if (i17 == 0) {
                                            ArrayList L12 = hs.L1(dialogFilter.pinned_peers);
                                            for (int i37 = 0; i37 < L12.size(); i37++) {
                                                L1.remove(L12.get(i37));
                                            }
                                            L1.addAll(0, L12);
                                        }
                                        int size8 = L1.size();
                                        boolean z26 = L1.size() != arrayList13.size();
                                        if (!z26) {
                                            int i38 = 0;
                                            while (true) {
                                                if (i38 >= size8) {
                                                    break;
                                                }
                                                int i39 = size8;
                                                if (!arrayList13.contains(L1.get(i38))) {
                                                    z26 = true;
                                                    break;
                                                } else {
                                                    i38++;
                                                    size8 = i39;
                                                }
                                            }
                                        }
                                        if (z26) {
                                            if (i17 == 0) {
                                                apVar2.h = L1;
                                            } else {
                                                apVar2.i = L1;
                                            }
                                            z15 = true;
                                            z20 = true;
                                        }
                                        i17++;
                                    }
                                    if (!hashSet3.isEmpty()) {
                                        hashMap6.put(Integer.valueOf(apVar2.a), hashSet3);
                                        z15 = true;
                                    }
                                    if (z15) {
                                        arrayList9.add(apVar2);
                                    }
                                    if (z20) {
                                        hashSet.add(Integer.valueOf(apVar2.a));
                                    }
                                    arrayList = arrayList3;
                                    hsVar2 = hsVar3;
                                    hashMap = hashMap8;
                                }
                            } else {
                                hsVar = hsVar4;
                                i12 = size4;
                            }
                            arrayList3 = arrayList7;
                            hsVar3 = hsVar5;
                            linkedHashMap = null;
                            size = apVar2.j.size();
                            while (i15 < size) {
                            }
                            apVar2.j.clear();
                            size2 = dialogFilter.pinned_peers.size();
                            boolean z232 = z21;
                            i16 = 0;
                            while (i16 < size2) {
                            }
                            linkedHashMap2 = linkedHashMap;
                            HashMap hashMap82 = hashMap3;
                            boolean z252 = z232;
                            if (linkedHashMap2 != null) {
                            }
                            z15 = z252;
                            i17 = 0;
                            while (i17 < 2) {
                            }
                            if (!hashSet3.isEmpty()) {
                            }
                            if (z15) {
                            }
                            if (z20) {
                            }
                            arrayList = arrayList3;
                            hsVar2 = hsVar3;
                            hashMap = hashMap82;
                        } else {
                            hsVar = hsVar4;
                            ArrayList arrayList14 = arrayList7;
                            HashMap hashMap9 = hashMap3;
                            hs hsVar6 = hsVar5;
                            sparseArray = sparseArray2;
                            i12 = size4;
                            ap apVar3 = new ap();
                            apVar3.a = dialogFilter.id;
                            apVar3.g = i11;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = dialogFilter.title;
                            apVar3.b = tL_textWithEntities2.text;
                            apVar3.c = tL_textWithEntities2.entities;
                            apVar3.n = dialogFilter.title_noanimate;
                            apVar3.m = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                            apVar3.e = -1;
                            int i40 = 0;
                            while (i40 < 2) {
                                if (i40 == 0) {
                                    int size9 = dialogFilter.pinned_peers.size();
                                    int i41 = 0;
                                    while (i41 < size9) {
                                        TLRPC.InputPeer inputPeer2 = dialogFilter.pinned_peers.get(i41);
                                        long j12 = inputPeer2.user_id;
                                        if (j12 != 0) {
                                            valueOf = Long.valueOf(j12);
                                        } else {
                                            long j13 = inputPeer2.chat_id;
                                            if (j13 == 0) {
                                                j13 = inputPeer2.channel_id;
                                            }
                                            valueOf = Long.valueOf(-j13);
                                        }
                                        if (!apVar3.h.contains(valueOf)) {
                                            apVar3.h.add(valueOf);
                                        }
                                        int i42 = size9;
                                        int i43 = i41;
                                        apVar3.j.put(valueOf.longValue(), apVar3.j.size() + 1);
                                        if (!hashMap5.containsKey(valueOf)) {
                                            arrayList8.add(valueOf);
                                            hashMap5.put(valueOf, inputPeer2);
                                        }
                                        i41 = i43 + 1;
                                        size9 = i42;
                                    }
                                }
                                ArrayList<TLRPC.InputPeer> arrayList15 = i40 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                                ArrayList arrayList16 = i40 == 0 ? apVar3.h : apVar3.i;
                                int size10 = arrayList15.size();
                                int i44 = 0;
                                while (i44 < size10) {
                                    TLRPC.InputPeer inputPeer3 = arrayList15.get(i44);
                                    TLRPC.DialogFilter dialogFilter2 = dialogFilter;
                                    ArrayList<TLRPC.InputPeer> arrayList17 = arrayList15;
                                    long j14 = inputPeer3.user_id;
                                    if (j14 != 0) {
                                        Long valueOf3 = Long.valueOf(j14);
                                        if (!arrayList16.contains(valueOf3)) {
                                            arrayList16.add(valueOf3);
                                        }
                                        hashMap2 = hashMap9;
                                        if (!hashMap2.containsKey(valueOf3)) {
                                            arrayList6.add(valueOf3);
                                            hashMap2.put(valueOf3, inputPeer3);
                                        }
                                        i14 = size10;
                                        i13 = i44;
                                        arrayList2 = arrayList14;
                                        r52 = hsVar6;
                                    } else {
                                        int i45 = size10;
                                        i13 = i44;
                                        hashMap2 = hashMap9;
                                        long j15 = inputPeer3.chat_id;
                                        if (j15 == 0) {
                                            j15 = inputPeer3.channel_id;
                                        }
                                        i14 = i45;
                                        Long valueOf4 = Long.valueOf(j15);
                                        Long valueOf5 = Long.valueOf(-j15);
                                        if (!arrayList16.contains(valueOf5)) {
                                            arrayList16.add(valueOf5);
                                        }
                                        r52 = hsVar6;
                                        if (r52.containsKey(valueOf4)) {
                                            arrayList2 = arrayList14;
                                        } else {
                                            arrayList2 = arrayList14;
                                            arrayList2.add(valueOf4);
                                            r52.put(valueOf4, inputPeer3);
                                        }
                                    }
                                    hashMap9 = hashMap2;
                                    hsVar6 = r52;
                                    arrayList14 = arrayList2;
                                    arrayList15 = arrayList17;
                                    size10 = i14;
                                    i44 = i13 + 1;
                                    dialogFilter = dialogFilter2;
                                }
                                i40++;
                            }
                            arrayList = arrayList14;
                            hsVar2 = hsVar6;
                            hashMap = hashMap9;
                            arrayList9.add(apVar3);
                        }
                        i20 = i28 + 1;
                        hsVar5 = hsVar2;
                        arrayList7 = arrayList;
                        arrayList4 = arrayList10;
                        arrayList5 = arrayList11;
                        sparseArray2 = sparseArray;
                        size4 = i12;
                        hsVar4 = hsVar;
                        hashMap3 = hashMap;
                    } catch (Exception e7) {
                        e = e7;
                        z10 = true;
                        hsVar4.o(e, z10);
                    }
                }
                hsVar = hsVar4;
                final HashMap hashMap10 = hashMap3;
                final SparseArray sparseArray3 = sparseArray2;
                final ArrayList arrayList18 = arrayList5;
                ArrayList arrayList19 = arrayList7;
                hs hsVar7 = hsVar5;
                try {
                    if (arrayList8.isEmpty()) {
                        hsVar5 = hsVar;
                        H0 = new TLRPC.TL_messages_dialogs();
                    } else {
                        try {
                            hsVar5 = hsVar;
                            H0 = hsVar5.H0(arrayList6, arrayList19, new ArrayList(), TextUtils.join(",", arrayList8));
                            int size11 = H0.dialogs.size();
                            for (int i46 = 0; i46 < size11; i46++) {
                                hashMap5.remove(Long.valueOf(H0.dialogs.get(i46).id));
                            }
                        } catch (Exception e10) {
                            e = e10;
                            hsVar5 = hsVar;
                            hsVar4 = hsVar5;
                            z10 = true;
                            hsVar4.o(e, z10);
                        }
                    }
                    final ArrayList arrayList20 = new ArrayList();
                    if (!arrayList6.isEmpty()) {
                        hsVar5.n0(arrayList6, arrayList20, false);
                        int size12 = arrayList20.size();
                        int i47 = 0;
                        while (i47 < size12) {
                            hashMap10.remove(Long.valueOf(((TLRPC.User) arrayList20.get(i47)).id));
                            i47++;
                            hsVar7 = hsVar7;
                        }
                    }
                    hs hsVar8 = hsVar7;
                    final ArrayList arrayList21 = new ArrayList();
                    if (!arrayList19.isEmpty()) {
                        hsVar5.Q(TextUtils.join(",", arrayList19), arrayList21);
                        int size13 = arrayList21.size();
                        int i48 = 0;
                        while (i48 < size13) {
                            ?? r53 = hsVar8;
                            r53.remove(Long.valueOf(((TLRPC.Chat) arrayList21.get(i48)).id));
                            i48++;
                            hsVar8 = r53;
                        }
                    }
                    final ?? r54 = hsVar8;
                    if (hashMap10.isEmpty() && r54.isEmpty()) {
                        if (hashMap5.isEmpty()) {
                            hsVar5.Y0(H0, null, arrayList20, arrayList21, arrayList9, sparseArray3, arrayList18, hashMap6, hashSet, runnable);
                            return;
                        }
                    }
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs = H0;
                    hsVar4 = hsVar5;
                    final vp messagesController = hsVar4.getMessagesController();
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                    messagesController.getClass();
                    z10 = true;
                    try {
                        Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.sn
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                TLRPC.TL_users_getUsers tL_users_getUsers;
                                vp vpVar;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs3;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs4;
                                ArrayList arrayList22;
                                ArrayList arrayList23;
                                ArrayList arrayList24;
                                SparseArray sparseArray4;
                                ArrayList arrayList25;
                                HashMap hashMap11;
                                HashSet hashSet4;
                                Runnable runnable2;
                                TLRPC.TL_channels_getChannels tL_channels_getChannels;
                                vp vpVar2;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs5;
                                TLRPC.TL_messages_dialogs tL_messages_dialogs6;
                                TLRPC.TL_channels_getChannels tL_channels_getChannels2;
                                ArrayList arrayList26;
                                ArrayList arrayList27;
                                ArrayList arrayList28;
                                TLRPC.TL_inputChannel tL_inputChannel;
                                ArrayList arrayList29;
                                ArrayList arrayList30 = new ArrayList();
                                Iterator it2 = hashMap10.entrySet().iterator();
                                loop0: while (true) {
                                    tL_users_getUsers = null;
                                    while (true) {
                                        boolean hasNext = it2.hasNext();
                                        vpVar = vp.this;
                                        tL_messages_dialogs3 = tL_messages_dialogs;
                                        tL_messages_dialogs4 = tL_messages_dialogs2;
                                        arrayList22 = arrayList20;
                                        arrayList23 = arrayList21;
                                        arrayList24 = arrayList9;
                                        sparseArray4 = sparseArray3;
                                        arrayList25 = arrayList18;
                                        hashMap11 = hashMap6;
                                        hashSet4 = hashSet;
                                        runnable2 = runnable;
                                        if (!hasNext) {
                                            break loop0;
                                        }
                                        Map.Entry entry = (Map.Entry) it2.next();
                                        if (tL_users_getUsers == null) {
                                            tL_users_getUsers = new TLRPC.TL_users_getUsers();
                                            arrayList30.add(tL_users_getUsers);
                                        }
                                        arrayList29 = arrayList30;
                                        tL_users_getUsers.id.add(vpVar.o1((TLRPC.InputPeer) entry.getValue()));
                                        if (tL_users_getUsers.id.size() == 100) {
                                            break;
                                        } else {
                                            arrayList30 = arrayList29;
                                        }
                                    }
                                    arrayList30 = arrayList29;
                                    vpVar.y4(tL_users_getUsers, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_users_getUsers != null) {
                                    vpVar.y4(tL_users_getUsers, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                TLRPC.TL_messages_getChats tL_messages_getChats = null;
                                loop2: while (true) {
                                    tL_channels_getChannels = null;
                                    for (Map.Entry entry2 : r54.entrySet()) {
                                        vpVar2 = vpVar;
                                        TLRPC.InputPeer inputPeer4 = (TLRPC.InputPeer) entry2.getValue();
                                        tL_messages_dialogs5 = tL_messages_dialogs3;
                                        tL_messages_dialogs6 = tL_messages_dialogs4;
                                        if (inputPeer4.chat_id != 0) {
                                            if (tL_messages_getChats == null) {
                                                tL_messages_getChats = new TLRPC.TL_messages_getChats();
                                                arrayList30.add(tL_messages_getChats);
                                            }
                                            tL_messages_getChats.id.add((Long) entry2.getKey());
                                            if (tL_messages_getChats.id.size() == 100) {
                                                tL_messages_dialogs3 = tL_messages_dialogs5;
                                                vpVar = vpVar2;
                                                tL_messages_dialogs4 = tL_messages_dialogs6;
                                                vpVar.y4(tL_messages_getChats, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                                tL_messages_getChats = null;
                                            } else {
                                                tL_messages_dialogs3 = tL_messages_dialogs5;
                                                vpVar = vpVar2;
                                                tL_messages_dialogs4 = tL_messages_dialogs6;
                                            }
                                        } else if (inputPeer4.channel_id != 0) {
                                            if (tL_channels_getChannels == null) {
                                                tL_channels_getChannels2 = new TLRPC.TL_channels_getChannels();
                                                arrayList30.add(tL_channels_getChannels2);
                                            } else {
                                                tL_channels_getChannels2 = tL_channels_getChannels;
                                            }
                                            ArrayList<TLRPC.InputChannel> arrayList31 = tL_channels_getChannels2.id;
                                            arrayList26 = arrayList22;
                                            if (inputPeer4.access_hash == 0) {
                                                arrayList27 = arrayList23;
                                                TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(inputPeer4.channel_id));
                                                if (L0 != null && L0.access_hash == 0 && L0.fromMessageId != 0 && L0.fromMessageDialogId != 0) {
                                                    TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                                                    arrayList28 = arrayList24;
                                                    tL_inputChannelFromMessage.channel_id = inputPeer4.channel_id;
                                                    tL_inputChannelFromMessage.peer = vp.r1(d20.s0).i1(L0.fromMessageDialogId);
                                                    tL_inputChannelFromMessage.msg_id = L0.fromMessageId;
                                                    tL_inputChannel = tL_inputChannelFromMessage;
                                                    arrayList31.add(tL_inputChannel);
                                                    if (tL_channels_getChannels2.id.size() != 100) {
                                                        break;
                                                    }
                                                    tL_messages_dialogs3 = tL_messages_dialogs5;
                                                    vpVar = vpVar2;
                                                    tL_messages_dialogs4 = tL_messages_dialogs6;
                                                    arrayList24 = arrayList28;
                                                    arrayList22 = arrayList26;
                                                    arrayList23 = arrayList27;
                                                    tL_channels_getChannels = tL_channels_getChannels2;
                                                }
                                            } else {
                                                arrayList27 = arrayList23;
                                            }
                                            arrayList28 = arrayList24;
                                            TLRPC.TL_inputChannel tL_inputChannel2 = new TLRPC.TL_inputChannel();
                                            tL_inputChannel2.channel_id = inputPeer4.channel_id;
                                            tL_inputChannel2.access_hash = inputPeer4.access_hash;
                                            tL_inputChannel = tL_inputChannel2;
                                            arrayList31.add(tL_inputChannel);
                                            if (tL_channels_getChannels2.id.size() != 100) {
                                            }
                                        } else {
                                            tL_messages_dialogs3 = tL_messages_dialogs5;
                                            vpVar = vpVar2;
                                            tL_messages_dialogs4 = tL_messages_dialogs6;
                                        }
                                    }
                                    tL_messages_dialogs3 = tL_messages_dialogs5;
                                    vpVar = vpVar2;
                                    tL_messages_dialogs4 = tL_messages_dialogs6;
                                    arrayList24 = arrayList28;
                                    arrayList22 = arrayList26;
                                    arrayList23 = arrayList27;
                                    vpVar.y4(tL_channels_getChannels2, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_messages_getChats != null) {
                                    vpVar.y4(tL_messages_getChats, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_channels_getChannels != null) {
                                    vpVar.y4(tL_channels_getChannels, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = null;
                                for (Map.Entry entry3 : hashMap5.entrySet()) {
                                    if (tL_messages_getPeerDialogs == null) {
                                        tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                                        arrayList30.add(tL_messages_getPeerDialogs);
                                    }
                                    TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                                    tL_inputDialogPeer.peer = (TLRPC.InputPeer) entry3.getValue();
                                    tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                                    if (tL_messages_getPeerDialogs.peers.size() == 100) {
                                        vpVar.y4(tL_messages_getPeerDialogs, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                        tL_messages_getPeerDialogs = null;
                                    }
                                }
                                if (tL_messages_getPeerDialogs != null) {
                                    vpVar.y4(tL_messages_getPeerDialogs, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                            }
                        });
                    } catch (Exception e11) {
                        e = e11;
                        hsVar4.o(e, z10);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            z10 = true;
        }
    }

    private final void d() {
        int i10;
        hs hsVar = (hs) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        kk kkVar = (kk) this.d;
        hsVar.getClass();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage W = hsVar.W(ephemeralMessage.id, o5.o(ephemeralMessage.peer_id));
                if (W != null && (i10 = W.top_msg_id) != 0) {
                    ephemeralMessage.top_msg_id = i10;
                    TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                    if (messageReplyHeader != null) {
                        messageReplyHeader.forum_topic = true;
                    }
                    ephemeralMessage.flags |= 2;
                }
            }
        }
        hsVar.g1(arrayList, true);
        kkVar.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r4 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        gw gwVar = (gw) this.b;
        hs hsVar = (hs) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        SQLiteDatabase sQLiteDatabase = hsVar.b;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        try {
            try {
                SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                executeFast.requery();
                executeFast.bindLong(1, 0L);
                executeFast.step();
                executeFast.dispose();
                sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO saved_dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    fw fwVar = (fw) arrayList.get(i10);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, fwVar.a);
                    sQLitePreparedStatement.bindInteger(2, fwVar.c());
                    sQLitePreparedStatement.bindInteger(3, fwVar.c);
                    sQLitePreparedStatement.bindInteger(4, fwVar.b ? i10 : 999);
                    sQLitePreparedStatement.bindInteger(5, fwVar.i ? 1 : 0);
                    sQLitePreparedStatement.bindInteger(6, 0);
                    sQLitePreparedStatement.bindInteger(7, 0);
                    sQLitePreparedStatement.bindInteger(8, fwVar.e);
                    sQLitePreparedStatement.bindLong(9, 0L);
                    sQLitePreparedStatement.bindLong(10, fwVar.f);
                    sQLitePreparedStatement.bindLong(11, fwVar.g);
                    sQLitePreparedStatement.bindLong(12, fwVar.h);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e) {
                f8.g(e, true);
            }
            sQLitePreparedStatement.dispose();
            i0.g3(new ew(gwVar, 1));
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void g() {
        ow owVar = (ow) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
        TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) this.d;
        if (encryptedChat != null) {
            owVar.getMessagesController().R3(encryptedChat2, false);
        }
        owVar.getMessagesStorage().V1(encryptedChat2);
        owVar.getNotificationCenter().k(zs.Y, encryptedChat2);
    }

    private final void h() {
        qz qzVar = (qz) this.b;
        String str = (String) this.c;
        Runnable runnable = (Runnable) this.d;
        qzVar.w.remove(str);
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void i() {
        qz qzVar = (qz) this.b;
        TLObject tLObject = (TLObject) this.c;
        cz czVar = (cz) this.d;
        qzVar.getClass();
        if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
            czVar.c();
            return;
        }
        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
        tL_inputMediaUploadedPhoto.live_photo = true;
        tL_inputMediaUploadedPhoto.file = czVar.j;
        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
        tL_inputMediaUploadedPhoto.video = tL_inputDocument;
        TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
        tL_inputDocument.id = document.id;
        tL_inputDocument.access_hash = document.access_hash;
        tL_inputDocument.file_reference = document.file_reference;
        TLObject tLObject2 = czVar.c;
        if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
            ((TLRPC.TL_messages_sendMedia) tLObject2).media = tL_inputMediaUploadedPhoto;
        } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
            ((TL_ephemeral.TL_sendMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
        } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
            ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media = tL_inputMediaUploadedPhoto;
        } else {
            ((TLRPC.TL_messages_editMessage) tLObject2).media = tL_inputMediaUploadedPhoto;
        }
        qzVar.N(tLObject2, czVar.m, czVar.f, czVar, czVar.K, null, czVar.H);
    }

    private final void j() {
        gz gzVar = (gz) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        hz hzVar = gzVar.b;
        qz qzVar = hzVar.q;
        qzVar.D.l(hzVar.j);
        int i10 = zs.v1;
        if (tL_error == null) {
            qzVar.getNotificationCenter().k(i10, Long.valueOf(hzVar.j));
        } else {
            qzVar.getNotificationCenter().k(i10, Long.valueOf(hzVar.j), tL_messages_startHistoryImport, tL_error);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e4, code lost:
    
        if (r5 != 0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        SQLiteCursor sQLiteCursor;
        Exception e;
        a0.h hVar;
        SQLitePreparedStatement sQLitePreparedStatement;
        int currentTime;
        int i15;
        SQLitePreparedStatement executeFast;
        int i16 = 6;
        int i17 = 1;
        int i18 = 0;
        switch (this.a) {
            case 0:
                ui uiVar = (ui) this.b;
                String str = (String) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                uiVar.Q.put(str, tL_messages_stickerSet);
                uiVar.R.k(str, tL_messages_stickerSet.set.id);
                uiVar.getNotificationCenter().k(61, str);
                return;
            case 1:
                ui uiVar2 = (ui) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.Document document = (TLRPC.Document) this.d;
                of.c cVar = uiVar2.z0;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtoneConverted) {
                        cVar.a(((TL_account.TL_savedRingtoneConverted) tLObject).document);
                        return;
                    } else {
                        cVar.a(document);
                        return;
                    }
                }
                return;
            case 2:
                ui uiVar3 = (ui) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                gs gsVar = (gs) this.d;
                HashMap hashMap = uiVar3.x1;
                a0.h hVar2 = uiVar3.y1;
                a0.h hVar3 = uiVar3.w1;
                if (arrayList == null) {
                    if (gsVar != null) {
                        hashMap.remove(gsVar);
                        hVar3.l(gsVar.a);
                        uiVar3.getNotificationCenter().k(69, null, gsVar);
                        return;
                    }
                    return;
                }
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    int intValue = ((Integer) arrayList.get(i19)).intValue();
                    long j10 = intValue;
                    gs gsVar2 = (gs) hVar2.f(j10);
                    if (gsVar2 != null) {
                        hashMap.remove(gsVar2);
                        ArrayList arrayList2 = (ArrayList) hVar3.f(gsVar2.a);
                        if (arrayList2 != null) {
                            int i20 = 0;
                            while (i20 < arrayList2.size()) {
                                TLRPC.Message message = (TLRPC.Message) arrayList2.get(i20);
                                if (message == null || message.id == intValue) {
                                    arrayList2.remove(i20);
                                    i20--;
                                }
                                i20++;
                            }
                            if (arrayList2.isEmpty()) {
                                hVar3.l(gsVar2.a);
                            }
                        }
                        hVar2.l(j10);
                        uiVar3.getNotificationCenter().k(69, null, gsVar2);
                    }
                }
                return;
            case 3:
                ui uiVar4 = (ui) this.b;
                TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) this.d;
                String str2 = (String) this.c;
                try {
                    if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                        SQLitePreparedStatement executeFast2 = uiVar4.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                        SQLitePreparedStatement executeFast3 = uiVar4.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                        uiVar4.getMessagesStorage().b.beginTransaction();
                        int size = tL_emojiKeywordsDifference.keywords.size();
                        for (int i21 = 0; i21 < size; i21++) {
                            TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i21);
                            if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                                TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                                String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                                int size2 = tL_emojiKeyword.emoticons.size();
                                for (int i22 = 0; i22 < size2; i22++) {
                                    executeFast2.requery();
                                    executeFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast2.bindString(2, lowerCase);
                                    executeFast2.bindString(3, tL_emojiKeyword.emoticons.get(i22));
                                    executeFast2.step();
                                }
                            } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                                TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                                String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                                int size3 = tL_emojiKeywordDeleted.emoticons.size();
                                for (int i23 = 0; i23 < size3; i23++) {
                                    executeFast3.requery();
                                    executeFast3.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast3.bindString(2, lowerCase2);
                                    executeFast3.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i23));
                                    executeFast3.step();
                                }
                            }
                        }
                        uiVar4.getMessagesStorage().b.commitTransaction();
                        executeFast2.dispose();
                        executeFast3.dispose();
                    }
                    SQLitePreparedStatement executeFast4 = uiVar4.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
                    executeFast4.bindString(1, str2);
                    executeFast4.bindString(2, tL_emojiKeywordsDifference.lang_code);
                    executeFast4.bindInteger(3, tL_emojiKeywordsDifference.version);
                    executeFast4.bindLong(4, System.currentTimeMillis());
                    executeFast4.step();
                    executeFast4.dispose();
                    i0.g3(new jh(uiVar4, str2, 3));
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 4:
                ((ui) this.b).o2((TLRPC.Message) this.d, (String) this.c);
                return;
            case 5:
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var == null) {
                    return;
                }
                x1Var.setOnCancelListener(new ae(zArr, 2));
                k2Var.showDialog(x1VarArr[0]);
                return;
            case 6:
                ((vp) this.b).getNotificationCenter().k(zs.N2, (org.telegram.ui.ActionBar.s6) this.c, (org.telegram.ui.ActionBar.r6) this.d);
                return;
            case 7:
                vp vpVar = (vp) this.b;
                long[] jArr = (long[]) this.c;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.d;
                int i24 = (int) jArr[1];
                vpVar.getSendMessagesHelper().d0(i24);
                vpVar.getSendMessagesHelper().i0(i24, false);
                zs notificationCenter = vpVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(i24);
                Integer valueOf2 = Integer.valueOf(tL_updateMessageID.id);
                Long valueOf3 = Long.valueOf(jArr[0]);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, null, valueOf3, 0L, -1, bool);
                vpVar.getNotificationCenter().k(22, Integer.valueOf(i24), Integer.valueOf(tL_updateMessageID.id), null, Long.valueOf(jArr[0]), 0L, -1, bool);
                return;
            case 8:
                vp vpVar2 = (vp) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                ap[] apVarArr = vpVar2.M;
                a0.h hVar4 = vpVar2.Q;
                ArrayList arrayList3 = vpVar2.y;
                if (longSparseIntArray != null) {
                    int i25 = 0;
                    i11 = 0;
                    while (i25 < longSparseIntArray.size()) {
                        long keyAt = longSparseIntArray.keyAt(i25);
                        TLRPC.Dialog dialog = (TLRPC.Dialog) hVar4.f(keyAt);
                        if (dialog == null) {
                            int i26 = i18;
                            while (i26 < arrayList3.size()) {
                                i13 = i17;
                                i14 = i18;
                                if (((TLRPC.Dialog) arrayList3.get(i26)).id == keyAt) {
                                    hVar4.k((TLRPC.Dialog) arrayList3.get(i26), keyAt);
                                    dialog = (TLRPC.Dialog) arrayList3.get(i26);
                                    if (dialog == null) {
                                        boolean z11 = v2.a;
                                        vpVar2.a0.put(keyAt, longSparseIntArray.valueAt(i25));
                                    }
                                    if (dialog == null) {
                                        int i27 = dialog.unread_count;
                                        int valueAt = longSparseIntArray.valueAt(i25);
                                        dialog.unread_count = valueAt;
                                        boolean z12 = v2.a;
                                        if (i27 != 0 && valueAt == 0) {
                                            vpVar2.q2(keyAt, 0L, null);
                                            if (i11 == 0) {
                                                for (int i28 = i14; i28 < apVarArr.length; i28++) {
                                                    ap apVar = apVarArr[i28];
                                                    if (apVar != null && (apVar.g & 64) != 0) {
                                                        i11 = i13;
                                                    }
                                                }
                                            }
                                        } else if (i27 == 0 && !dialog.unread_mark && valueAt != 0) {
                                            vpVar2.q2(keyAt, 0L, null);
                                            if (i11 == 0) {
                                                for (int i29 = i14; i29 < apVarArr.length; i29++) {
                                                    ap apVar2 = apVarArr[i29];
                                                    if (apVar2 != null && (apVar2.g & 64) != 0) {
                                                        i11 = i13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i25++;
                                    i17 = i13;
                                    i18 = i14;
                                } else {
                                    i26++;
                                    i17 = i13;
                                    i18 = i14;
                                }
                            }
                        }
                        i13 = i17;
                        i14 = i18;
                        if (dialog == null) {
                        }
                        if (dialog == null) {
                        }
                        i25++;
                        i17 = i13;
                        i18 = i14;
                    }
                    i10 = i18;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i30 = i17;
                if (longSparseIntArray2 != null) {
                    for (int i31 = i10; i31 < longSparseIntArray2.size(); i31++) {
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar4.f(longSparseIntArray2.keyAt(i31));
                        if (dialog2 != null) {
                            dialog2.unread_mentions_count = longSparseIntArray2.valueAt(i31);
                            if (vpVar2.w0.contains(Long.valueOf(dialog2.id))) {
                                zs notificationCenter2 = vpVar2.getNotificationCenter();
                                Long valueOf4 = Long.valueOf(dialog2.id);
                                Integer valueOf5 = Integer.valueOf(dialog2.unread_mentions_count);
                                Object[] objArr = new Object[3];
                                objArr[i10] = valueOf4;
                                objArr[i30] = 0L;
                                objArr[2] = valueOf5;
                                notificationCenter2.k(93, objArr);
                            }
                            if (i11 == 0) {
                                for (int i32 = i10; i32 < apVarArr.length; i32++) {
                                    ap apVar3 = apVarArr[i32];
                                    if (apVar3 != null) {
                                        int i33 = apVar3.g;
                                        if ((i33 & 32) != 0 || (i33 & 64) != 0) {
                                            i11 = i30;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i11 != 0) {
                    vpVar2.Q4(null);
                    i12 = i10;
                    vpVar2.getNotificationCenter().k(3, new Object[i12]);
                } else {
                    i12 = i10;
                }
                zs notificationCenter3 = vpVar2.getNotificationCenter();
                Object[] objArr2 = new Object[i30];
                objArr2[i12] = 256;
                notificationCenter3.k(2, objArr2);
                if (longSparseIntArray != null) {
                    vpVar2.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                return;
            case 9:
                vp vpVar3 = (vp) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                a0.h hVar5 = vpVar3.e8;
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList5 = ((Vector) tLObject2).objects;
                    z10 = false;
                    for (int i34 = 0; i34 < Math.min(arrayList4.size(), arrayList5.size()); i34++) {
                        long longValue = ((Long) arrayList4.get(i34)).longValue();
                        if (arrayList5.get(i34) instanceof TL_account.RequirementToContact) {
                            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) arrayList5.get(i34);
                            if (!h20.c((TL_account.RequirementToContact) hVar5.f(longValue), requirementToContact)) {
                                if (requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty)) {
                                    hVar5.l(longValue);
                                } else {
                                    hVar5.k(requirementToContact, longValue);
                                }
                                z10 = true;
                            }
                            TLRPC.UserFull a2 = vpVar3.a2(longValue);
                            if (a2 != null && h20.a(a2, requirementToContact)) {
                                vpVar3.getMessagesStorage().j2(a2, true);
                            } else if (a2 == null) {
                                hs messagesStorage = vpVar3.getMessagesStorage();
                                messagesStorage.a.c(new d4(messagesStorage, longValue, requirementToContact, 20));
                            }
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    vpVar3.getNotificationCenter().k(zs.i3, new Object[0]);
                    return;
                }
                return;
            case 10:
                ((vp) this.b).getConnectionsManager().sendRequest((TLRPC.TL_channels_editAdmin) this.c, (um) this.d);
                return;
            case 11:
                ((vp) this.b).getConnectionsManager().sendRequest((TLRPC.TL_messages_editChatAdmin) this.c, (vm) this.d);
                return;
            case 12:
                vp vpVar4 = (vp) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.d;
                if (!arrayList6.isEmpty()) {
                    i0.g3(new gk(vpVar4, arrayList6, i16));
                }
                vpVar4.getMessagesStorage().j1(updates_channeldifference.new_messages, true, false, false, vpVar4.getDownloadController().l(), false, 0, 0L);
                return;
            case 13:
                ((vp) this.b).getNotificationsController().K((ArrayList) this.c, !(((TLRPC.updates_Difference) this.d) instanceof TLRPC.TL_updates_differenceSlice), false, null);
                return;
            case 14:
                vp vpVar5 = (vp) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                chatFull.about = (String) this.c;
                vpVar5.getMessagesStorage().N1(chatFull, false);
                zs notificationCenter4 = vpVar5.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter4.k(30, chatFull, 0, bool2, bool2);
                return;
            case 15:
                pp ppVar = (pp) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = ppVar.c;
                if (tLObject3 instanceof TLRPC.TL_savedMusic) {
                    TLRPC.TL_savedMusic tL_savedMusic = (TLRPC.TL_savedMusic) tLObject3;
                    if (ppVar.d <= 0 && arrayList8.size() == 1) {
                        if (((jj) arrayList8.get(0)).F0() == null || arrayList7.isEmpty() || ((jj) arrayList7.get(0)).F0() == null || ((jj) arrayList8.get(0)).F0().id != ((jj) arrayList7.get(0)).F0().id) {
                            arrayList8.clear();
                        } else {
                            arrayList7.remove(0);
                        }
                    }
                    ppVar.d = tL_savedMusic.count;
                    arrayList8.addAll(arrayList7);
                    ppVar.e = arrayList8.size() >= ppVar.d;
                }
                ppVar.f = false;
                zs.f(ppVar.a).k(zs.T3, ppVar);
                return;
            case 16:
                hs hsVar = (hs) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                lk lkVar = (lk) this.d;
                hsVar.getClass();
                int size4 = arrayList9.size();
                while (i18 < size4) {
                    Object obj = arrayList9.get(i18);
                    i18++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                    long o10 = o5.o(ephemeralMessage.peer_id);
                    long o11 = o5.o(ephemeralMessage.from_id);
                    int i35 = ephemeralMessage.anchor_msg_id;
                    l2.f fVar = hsVar.d0;
                    int i36 = ephemeralMessage.id;
                    a0.h hVar6 = (a0.h) fVar.b;
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar6.f(o10);
                    if (sparseIntArray == null) {
                        sparseIntArray = new SparseIntArray();
                        hVar6.k(sparseIntArray, o10);
                    }
                    sparseIntArray.put(i35, i36);
                    TLRPC.Message c02 = hsVar.c0(o10, i35);
                    if (c02 != null) {
                        ephemeralMessage.peer_id = c02.peer_id;
                        ephemeralMessage.from_id = c02.from_id;
                        ephemeralMessage.out = c02.out;
                        if (o11 > 0) {
                            ephemeralMessage.via_bot_id = o11;
                        }
                    }
                }
                hsVar.g1(arrayList9, true);
                lkVar.run();
                return;
            case 17:
                hs hsVar2 = (hs) this.b;
                a0.h hVar7 = (a0.h) this.c;
                a0.h hVar8 = (a0.h) this.d;
                if (hVar7 != null) {
                    try {
                        int m10 = hVar7.m();
                        for (int i37 = 0; i37 < m10; i37++) {
                            SQLiteDatabase sQLiteDatabase = hsVar2.b;
                            Locale locale = Locale.US;
                            sQLiteDatabase.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) hVar7.n(i37)) + ") AND uid = " + hVar7.j(i37) + " AND media = 0").stepThis().dispose();
                        }
                    } catch (Exception e10) {
                        e = e10;
                        sQLiteCursor = null;
                        try {
                            hsVar2.o(e, true);
                            if (sQLiteCursor == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor = null;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                if (hVar8 != null) {
                    int m11 = hVar8.m();
                    for (int i38 = 0; i38 < m11; i38++) {
                        SQLiteDatabase sQLiteDatabase2 = hsVar2.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) hVar8.n(i38)) + ") AND uid = " + hVar8.j(i38) + " AND media = 1").stepThis().dispose();
                    }
                }
                SQLiteCursor queryFinalized = hsVar2.b.queryFinalized("SELECT mid, date, media, uid FROM enc_tasks_v4 WHERE date = (SELECT min(date) FROM enc_tasks_v4)", new Object[0]);
                int i39 = 0;
                a0.h hVar9 = null;
                a0.h hVar10 = null;
                while (queryFinalized.next()) {
                    try {
                        int intValue2 = queryFinalized.intValue(0);
                        i39 = queryFinalized.intValue(1);
                        int intValue3 = queryFinalized.intValue(2);
                        long longValue2 = queryFinalized.longValue(3);
                        if (intValue3 == -1) {
                            if (intValue2 > 0) {
                                if (hVar10 == null) {
                                    hVar10 = new a0.h();
                                }
                                hVar = hVar10;
                            }
                            if (hVar9 == null) {
                                hVar9 = new a0.h();
                            }
                            hVar = hVar10;
                            hVar10 = hVar9;
                        }
                        ArrayList arrayList10 = (ArrayList) hVar10.f(longValue2);
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                            hVar10.k(arrayList10, longValue2);
                        }
                        arrayList10.add(Integer.valueOf(intValue2));
                        hVar10 = hVar;
                    } catch (Exception e11) {
                        e = e11;
                        sQLiteCursor = queryFinalized;
                        hsVar2.o(e, true);
                        if (sQLiteCursor == null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                vp messagesController = hsVar2.getMessagesController();
                messagesController.getClass();
                Utilities.d.c(new cg(messagesController, hVar9, hVar10, i39, 14));
                return;
            case 18:
                hs hsVar3 = (hs) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                String str3 = (String) this.c;
                hsVar3.getClass();
                try {
                    currentTime = hsVar3.getConnectionsManager().getCurrentTime();
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                }
                try {
                    if (!(tLObject4 instanceof TLRPC.TL_messages_botCallbackAnswer)) {
                        if (tLObject4 instanceof TLRPC.TL_messages_botResults) {
                            i15 = ((TLRPC.TL_messages_botResults) tLObject4).cache_time;
                        }
                        executeFast = hsVar3.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tLObject4.getObjectSize());
                        tLObject4.serializeToStream(nativeByteBuffer);
                        executeFast.bindString(1, str3);
                        executeFast.bindInteger(2, currentTime);
                        executeFast.bindByteBuffer(3, nativeByteBuffer);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                        return;
                    }
                    i15 = ((TLRPC.TL_messages_botCallbackAnswer) tLObject4).cache_time;
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(nativeByteBuffer2);
                    executeFast.bindString(1, str3);
                    executeFast.bindInteger(2, currentTime);
                    executeFast.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer2.reuse();
                    return;
                } catch (Exception e13) {
                    e = e13;
                    sQLitePreparedStatement = executeFast;
                    try {
                        hsVar3.o(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th6) {
                        th = th6;
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement = executeFast;
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                currentTime += i15;
                executeFast = hsVar3.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
            case 19:
                a();
                return;
            case 20:
                ((hs) this.b).getNotificationCenter().k(49, Long.valueOf(jj.B0(((jj) this.c).k)), (ArrayList) this.d);
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                d();
                return;
            case 24:
                f();
                return;
            case 25:
                g();
                return;
            case 26:
                h();
                return;
            case 27:
                i();
                return;
            case 28:
                j();
                return;
            default:
                iz izVar = (iz) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                Runnable runnable = (Runnable) this.d;
                jz jzVar = izVar.b;
                if (tLObject5 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
                    jzVar.f = tL_inputStickerSetItem;
                    tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
                    TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = jzVar.f;
                    TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
                    TLRPC.Document document2 = ((TLRPC.TL_messageMediaDocument) tLObject5).document;
                    inputDocument.id = document2.id;
                    inputDocument.access_hash = document2.access_hash;
                    inputDocument.file_reference = document2.file_reference;
                    String str4 = jzVar.b;
                    if (str4 == null) {
                        str4 = "";
                    }
                    tL_inputStickerSetItem2.emoji = str4;
                    jzVar.d = document2.mime_type;
                } else if (jzVar.e) {
                    jzVar.d = "application/x-bad-tgsticker";
                }
                runnable.run();
                return;
        }
    }

    public /* synthetic */ kg(f1 f1Var, TLObject tLObject, String str, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.d = tLObject;
        this.c = str;
    }
}
