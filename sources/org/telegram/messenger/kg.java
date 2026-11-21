package org.telegram.messenger;

import android.service.media.MediaBrowserService;
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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kg(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        tr trVar = (tr) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        trVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = trVar.b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = trVar.b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e10) {
            trVar.o(e10, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        tr trVar = (tr) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        org.telegram.ui.wg wgVar = (org.telegram.ui.wg) this.d;
        long e10 = trVar.getUserConfig().e();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            fj fjVar = (fj) arrayList.get(i7);
            if (!fjVar.r1 && !fj.b4(fjVar.k)) {
                try {
                    sQLiteCursor = trVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(fj.B0(fjVar.k)), Integer.valueOf(fjVar.e1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e10);
                                byteBufferValue.reuse();
                                fjVar.k.attachPath = TLdeserialize.attachPath;
                                fjVar.K(true);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            a8.g(e, true);
                            if (sQLiteCursor == null) {
                                i7 = i10;
                            }
                            sQLiteCursor.dispose();
                            i7 = i10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                }
                sQLiteCursor.dispose();
            }
            i7 = i10;
        }
        g0.g3(wgVar);
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
        tr trVar;
        TLRPC.TL_messages_dialogs H0;
        int i7;
        int i10;
        SparseArray sparseArray;
        int i11;
        ArrayList arrayList;
        tr trVar2;
        HashMap hashMap;
        int i12;
        HashMap hashMap2;
        int i13;
        ?? r52;
        ArrayList arrayList2;
        Long valueOf;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList3;
        tr trVar3;
        LinkedHashMap linkedHashMap;
        int size;
        int i14;
        int size2;
        int i15;
        LinkedHashMap linkedHashMap2;
        boolean z15;
        int i16;
        Long valueOf2;
        int i17;
        tr trVar4 = (tr) this.b;
        ArrayList arrayList4 = (ArrayList) this.c;
        final Runnable runnable = (Runnable) this.d;
        try {
            SparseArray sparseArray2 = new SparseArray();
            int size3 = trVar4.I.size();
            for (int i18 = 0; i18 < size3; i18++) {
                ro roVar = (ro) trVar4.I.get(i18);
                sparseArray2.put(roVar.a, roVar);
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
                int i19 = 0;
                tr trVar5 = hashMap4;
                while (i19 < size4) {
                    try {
                        ArrayList arrayList10 = arrayList4;
                        TLRPC.DialogFilter dialogFilter = (TLRPC.DialogFilter) arrayList4.get(i19);
                        arrayList5.add(Integer.valueOf(dialogFilter.id));
                        if (dialogFilter.contacts) {
                            int i20 = mp.I8;
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        if (dialogFilter.non_contacts) {
                            int i21 = mp.I8;
                            i7 |= 2;
                        }
                        if (dialogFilter.groups) {
                            int i22 = mp.I8;
                            i7 |= 4;
                        }
                        if (dialogFilter.broadcasts) {
                            int i23 = mp.I8;
                            i7 |= 8;
                        }
                        if (dialogFilter.bots) {
                            int i24 = mp.I8;
                            i7 |= 16;
                        }
                        if (dialogFilter.exclude_muted) {
                            int i25 = mp.I8;
                            i7 |= 32;
                        }
                        if (dialogFilter.exclude_read) {
                            int i26 = mp.I8;
                            i10 = i7 | 64;
                        } else {
                            i10 = i7;
                        }
                        int i27 = i19;
                        if (dialogFilter.exclude_archived) {
                            int i28 = mp.I8;
                            i10 |= 128;
                        }
                        if (dialogFilter instanceof TLRPC.TL_dialogFilterChatlist) {
                            int i29 = mp.I8;
                            i10 = dialogFilter.has_my_invites ? i10 | 1536 : i10 | 512;
                        }
                        ArrayList arrayList11 = arrayList5;
                        ro roVar2 = (ro) trVar4.J.get(dialogFilter.id);
                        if (roVar2 != null) {
                            sparseArray2.remove(dialogFilter.id);
                            sparseArray = sparseArray2;
                            if (TextUtils.equals(roVar2.b, dialogFilter.title.text) && ri.M(roVar2.c, dialogFilter.title.entities)) {
                                z11 = false;
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = dialogFilter.title;
                                roVar2.b = tL_textWithEntities.text;
                                roVar2.c = tL_textWithEntities.entities;
                                z11 = true;
                            }
                            boolean z16 = roVar2.n;
                            boolean z17 = z11;
                            boolean z18 = dialogFilter.title_noanimate;
                            if (z16 != z18) {
                                roVar2.n = z18;
                                z12 = true;
                            } else {
                                z12 = z17;
                            }
                            int i30 = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                            boolean z19 = z12;
                            if (roVar2.m != i30) {
                                roVar2.m = i30;
                                z13 = true;
                            } else {
                                z13 = z19;
                            }
                            if (roVar2.g != i10) {
                                roVar2.g = i10;
                                z14 = true;
                                z13 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z20 = z14;
                            HashSet hashSet2 = new HashSet(roVar2.h);
                            hashSet2.addAll(roVar2.i);
                            HashSet hashSet3 = new HashSet();
                            boolean z21 = z13;
                            if (roVar2.j.size() != 0) {
                                ArrayList arrayList12 = new ArrayList();
                                i11 = size4;
                                int size5 = roVar2.j.size();
                                trVar = trVar4;
                                int i31 = 0;
                                boolean z22 = false;
                                while (i31 < size5) {
                                    int i32 = size5;
                                    try {
                                        long keyAt = roVar2.j.keyAt(i31);
                                        if (n5.C(keyAt)) {
                                            z22 = true;
                                        }
                                        arrayList12.add(Long.valueOf(keyAt));
                                        i31++;
                                        size5 = i32;
                                    } catch (Exception e10) {
                                        e = e10;
                                        z10 = true;
                                        trVar4 = trVar;
                                        trVar4.o(e, z10);
                                    }
                                }
                                if (z22) {
                                    linkedHashMap = new LinkedHashMap();
                                    arrayList3 = arrayList7;
                                    trVar3 = trVar5;
                                    Collections.sort(arrayList12, new mq(roVar2.j, 0));
                                    int size6 = arrayList12.size();
                                    int i33 = 0;
                                    while (i33 < size6) {
                                        Long l10 = (Long) arrayList12.get(i33);
                                        if (n5.C(l10.longValue())) {
                                            i17 = size6;
                                            linkedHashMap.put(Integer.valueOf(i33), l10);
                                        } else {
                                            i17 = size6;
                                        }
                                        i33++;
                                        size6 = i17;
                                    }
                                    size = roVar2.j.size();
                                    for (i14 = 0; i14 < size; i14++) {
                                        long keyAt2 = roVar2.j.keyAt(i14);
                                        if (!n5.C(keyAt2)) {
                                            hashSet3.add(Long.valueOf(keyAt2));
                                            hashSet2.remove(Long.valueOf(keyAt2));
                                        }
                                    }
                                    roVar2.j.clear();
                                    size2 = dialogFilter.pinned_peers.size();
                                    boolean z23 = z21;
                                    i15 = 0;
                                    while (i15 < size2) {
                                        TLRPC.InputPeer inputPeer = dialogFilter.pinned_peers.get(i15);
                                        int i34 = i15;
                                        boolean z24 = z23;
                                        long j3 = inputPeer.user_id;
                                        if (j3 != 0) {
                                            valueOf2 = Long.valueOf(j3);
                                        } else {
                                            long j10 = inputPeer.chat_id;
                                            if (j10 == 0) {
                                                j10 = inputPeer.channel_id;
                                            }
                                            valueOf2 = Long.valueOf(-j10);
                                        }
                                        int size7 = roVar2.j.size();
                                        int i35 = size2;
                                        if (linkedHashMap != null) {
                                            while (true) {
                                                Long l11 = (Long) linkedHashMap.remove(Integer.valueOf(size7));
                                                if (l11 == null) {
                                                    break;
                                                }
                                                roVar2.j.put(l11.longValue(), size7);
                                                size7++;
                                                linkedHashMap = linkedHashMap;
                                                hashMap3 = hashMap3;
                                            }
                                        }
                                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                                        HashMap hashMap7 = hashMap3;
                                        roVar2.j.put(valueOf2.longValue(), size7);
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
                                        i15 = i34 + 1;
                                        size2 = i35;
                                        linkedHashMap = linkedHashMap3;
                                        hashMap3 = hashMap7;
                                    }
                                    linkedHashMap2 = linkedHashMap;
                                    HashMap hashMap8 = hashMap3;
                                    boolean z25 = z23;
                                    if (linkedHashMap2 != null) {
                                        Iterator it = linkedHashMap2.entrySet().iterator();
                                        while (it.hasNext()) {
                                            roVar2.j.put(((Long) ((Map.Entry) it.next()).getValue()).longValue(), roVar2.j.size());
                                        }
                                    }
                                    z15 = z25;
                                    i16 = 0;
                                    while (i16 < 2) {
                                        ArrayList L1 = tr.L1(i16 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers);
                                        ArrayList arrayList13 = i16 == 0 ? roVar2.h : roVar2.i;
                                        if (i16 == 0) {
                                            ArrayList L12 = tr.L1(dialogFilter.pinned_peers);
                                            for (int i36 = 0; i36 < L12.size(); i36++) {
                                                L1.remove(L12.get(i36));
                                            }
                                            L1.addAll(0, L12);
                                        }
                                        int size8 = L1.size();
                                        boolean z26 = L1.size() != arrayList13.size();
                                        if (!z26) {
                                            int i37 = 0;
                                            while (true) {
                                                if (i37 >= size8) {
                                                    break;
                                                }
                                                int i38 = size8;
                                                if (!arrayList13.contains(L1.get(i37))) {
                                                    z26 = true;
                                                    break;
                                                } else {
                                                    i37++;
                                                    size8 = i38;
                                                }
                                            }
                                        }
                                        if (z26) {
                                            if (i16 == 0) {
                                                roVar2.h = L1;
                                            } else {
                                                roVar2.i = L1;
                                            }
                                            z15 = true;
                                            z20 = true;
                                        }
                                        i16++;
                                    }
                                    if (!hashSet3.isEmpty()) {
                                        hashMap6.put(Integer.valueOf(roVar2.a), hashSet3);
                                        z15 = true;
                                    }
                                    if (z15) {
                                        arrayList9.add(roVar2);
                                    }
                                    if (z20) {
                                        hashSet.add(Integer.valueOf(roVar2.a));
                                    }
                                    arrayList = arrayList3;
                                    trVar2 = trVar3;
                                    hashMap = hashMap8;
                                }
                            } else {
                                trVar = trVar4;
                                i11 = size4;
                            }
                            arrayList3 = arrayList7;
                            trVar3 = trVar5;
                            linkedHashMap = null;
                            size = roVar2.j.size();
                            while (i14 < size) {
                            }
                            roVar2.j.clear();
                            size2 = dialogFilter.pinned_peers.size();
                            boolean z232 = z21;
                            i15 = 0;
                            while (i15 < size2) {
                            }
                            linkedHashMap2 = linkedHashMap;
                            HashMap hashMap82 = hashMap3;
                            boolean z252 = z232;
                            if (linkedHashMap2 != null) {
                            }
                            z15 = z252;
                            i16 = 0;
                            while (i16 < 2) {
                            }
                            if (!hashSet3.isEmpty()) {
                            }
                            if (z15) {
                            }
                            if (z20) {
                            }
                            arrayList = arrayList3;
                            trVar2 = trVar3;
                            hashMap = hashMap82;
                        } else {
                            trVar = trVar4;
                            ArrayList arrayList14 = arrayList7;
                            HashMap hashMap9 = hashMap3;
                            tr trVar6 = trVar5;
                            sparseArray = sparseArray2;
                            i11 = size4;
                            ro roVar3 = new ro();
                            roVar3.a = dialogFilter.id;
                            roVar3.g = i10;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = dialogFilter.title;
                            roVar3.b = tL_textWithEntities2.text;
                            roVar3.c = tL_textWithEntities2.entities;
                            roVar3.n = dialogFilter.title_noanimate;
                            roVar3.m = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                            roVar3.e = -1;
                            int i39 = 0;
                            while (i39 < 2) {
                                if (i39 == 0) {
                                    int size9 = dialogFilter.pinned_peers.size();
                                    int i40 = 0;
                                    while (i40 < size9) {
                                        TLRPC.InputPeer inputPeer2 = dialogFilter.pinned_peers.get(i40);
                                        long j11 = inputPeer2.user_id;
                                        if (j11 != 0) {
                                            valueOf = Long.valueOf(j11);
                                        } else {
                                            long j12 = inputPeer2.chat_id;
                                            if (j12 == 0) {
                                                j12 = inputPeer2.channel_id;
                                            }
                                            valueOf = Long.valueOf(-j12);
                                        }
                                        if (!roVar3.h.contains(valueOf)) {
                                            roVar3.h.add(valueOf);
                                        }
                                        int i41 = size9;
                                        int i42 = i40;
                                        roVar3.j.put(valueOf.longValue(), roVar3.j.size() + 1);
                                        if (!hashMap5.containsKey(valueOf)) {
                                            arrayList8.add(valueOf);
                                            hashMap5.put(valueOf, inputPeer2);
                                        }
                                        i40 = i42 + 1;
                                        size9 = i41;
                                    }
                                }
                                ArrayList<TLRPC.InputPeer> arrayList15 = i39 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                                ArrayList arrayList16 = i39 == 0 ? roVar3.h : roVar3.i;
                                int size10 = arrayList15.size();
                                int i43 = 0;
                                while (i43 < size10) {
                                    TLRPC.InputPeer inputPeer3 = arrayList15.get(i43);
                                    TLRPC.DialogFilter dialogFilter2 = dialogFilter;
                                    ArrayList<TLRPC.InputPeer> arrayList17 = arrayList15;
                                    long j13 = inputPeer3.user_id;
                                    if (j13 != 0) {
                                        Long valueOf3 = Long.valueOf(j13);
                                        if (!arrayList16.contains(valueOf3)) {
                                            arrayList16.add(valueOf3);
                                        }
                                        hashMap2 = hashMap9;
                                        if (!hashMap2.containsKey(valueOf3)) {
                                            arrayList6.add(valueOf3);
                                            hashMap2.put(valueOf3, inputPeer3);
                                        }
                                        i13 = size10;
                                        i12 = i43;
                                        arrayList2 = arrayList14;
                                        r52 = trVar6;
                                    } else {
                                        int i44 = size10;
                                        i12 = i43;
                                        hashMap2 = hashMap9;
                                        long j14 = inputPeer3.chat_id;
                                        if (j14 == 0) {
                                            j14 = inputPeer3.channel_id;
                                        }
                                        i13 = i44;
                                        Long valueOf4 = Long.valueOf(j14);
                                        Long valueOf5 = Long.valueOf(-j14);
                                        if (!arrayList16.contains(valueOf5)) {
                                            arrayList16.add(valueOf5);
                                        }
                                        r52 = trVar6;
                                        if (r52.containsKey(valueOf4)) {
                                            arrayList2 = arrayList14;
                                        } else {
                                            arrayList2 = arrayList14;
                                            arrayList2.add(valueOf4);
                                            r52.put(valueOf4, inputPeer3);
                                        }
                                    }
                                    hashMap9 = hashMap2;
                                    trVar6 = r52;
                                    arrayList14 = arrayList2;
                                    arrayList15 = arrayList17;
                                    size10 = i13;
                                    i43 = i12 + 1;
                                    dialogFilter = dialogFilter2;
                                }
                                i39++;
                            }
                            arrayList = arrayList14;
                            trVar2 = trVar6;
                            hashMap = hashMap9;
                            arrayList9.add(roVar3);
                        }
                        i19 = i27 + 1;
                        trVar5 = trVar2;
                        arrayList7 = arrayList;
                        arrayList4 = arrayList10;
                        arrayList5 = arrayList11;
                        sparseArray2 = sparseArray;
                        size4 = i11;
                        trVar4 = trVar;
                        hashMap3 = hashMap;
                    } catch (Exception e11) {
                        e = e11;
                        z10 = true;
                        trVar4.o(e, z10);
                    }
                }
                trVar = trVar4;
                final HashMap hashMap10 = hashMap3;
                final SparseArray sparseArray3 = sparseArray2;
                final ArrayList arrayList18 = arrayList5;
                ArrayList arrayList19 = arrayList7;
                tr trVar7 = trVar5;
                try {
                    if (arrayList8.isEmpty()) {
                        trVar5 = trVar;
                        H0 = new TLRPC.TL_messages_dialogs();
                    } else {
                        try {
                            trVar5 = trVar;
                            H0 = trVar5.H0(arrayList6, arrayList19, new ArrayList(), TextUtils.join(",", arrayList8));
                            int size11 = H0.dialogs.size();
                            for (int i45 = 0; i45 < size11; i45++) {
                                hashMap5.remove(Long.valueOf(H0.dialogs.get(i45).id));
                            }
                        } catch (Exception e12) {
                            e = e12;
                            trVar5 = trVar;
                            trVar4 = trVar5;
                            z10 = true;
                            trVar4.o(e, z10);
                        }
                    }
                    final ArrayList arrayList20 = new ArrayList();
                    if (!arrayList6.isEmpty()) {
                        trVar5.n0(arrayList6, arrayList20, false);
                        int size12 = arrayList20.size();
                        int i46 = 0;
                        while (i46 < size12) {
                            hashMap10.remove(Long.valueOf(((TLRPC.User) arrayList20.get(i46)).id));
                            i46++;
                            trVar7 = trVar7;
                        }
                    }
                    tr trVar8 = trVar7;
                    final ArrayList arrayList21 = new ArrayList();
                    if (!arrayList19.isEmpty()) {
                        trVar5.Q(TextUtils.join(",", arrayList19), arrayList21);
                        int size13 = arrayList21.size();
                        int i47 = 0;
                        while (i47 < size13) {
                            ?? r53 = trVar8;
                            r53.remove(Long.valueOf(((TLRPC.Chat) arrayList21.get(i47)).id));
                            i47++;
                            trVar8 = r53;
                        }
                    }
                    final ?? r54 = trVar8;
                    if (hashMap10.isEmpty() && r54.isEmpty()) {
                        if (hashMap5.isEmpty()) {
                            trVar5.Y0(H0, null, arrayList20, arrayList21, arrayList9, sparseArray3, arrayList18, hashMap6, hashSet, runnable);
                            return;
                        }
                    }
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs = H0;
                    trVar4 = trVar5;
                    final mp messagesController = trVar4.getMessagesController();
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                    messagesController.getClass();
                    z10 = true;
                    try {
                        Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.hn
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                TLRPC.TL_users_getUsers tL_users_getUsers;
                                mp mpVar;
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
                                mp mpVar2;
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
                                        mpVar = mp.this;
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
                                        tL_users_getUsers.id.add(mpVar.r1((TLRPC.InputPeer) entry.getValue()));
                                        if (tL_users_getUsers.id.size() == 100) {
                                            break;
                                        } else {
                                            arrayList30 = arrayList29;
                                        }
                                    }
                                    arrayList30 = arrayList29;
                                    mpVar.L4(tL_users_getUsers, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_users_getUsers != null) {
                                    mpVar.L4(tL_users_getUsers, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                TLRPC.TL_messages_getChats tL_messages_getChats = null;
                                loop2: while (true) {
                                    tL_channels_getChannels = null;
                                    for (Map.Entry entry2 : r54.entrySet()) {
                                        mpVar2 = mpVar;
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
                                                mpVar = mpVar2;
                                                tL_messages_dialogs4 = tL_messages_dialogs6;
                                                mpVar.L4(tL_messages_getChats, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                                tL_messages_getChats = null;
                                            } else {
                                                tL_messages_dialogs3 = tL_messages_dialogs5;
                                                mpVar = mpVar2;
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
                                                TLRPC.Chat O0 = mp.u1(j10.t0).O0(Long.valueOf(inputPeer4.channel_id));
                                                if (O0 != null && O0.access_hash == 0 && O0.fromMessageId != 0 && O0.fromMessageDialogId != 0) {
                                                    TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                                                    arrayList28 = arrayList24;
                                                    tL_inputChannelFromMessage.channel_id = inputPeer4.channel_id;
                                                    tL_inputChannelFromMessage.peer = mp.u1(j10.t0).l1(O0.fromMessageDialogId);
                                                    tL_inputChannelFromMessage.msg_id = O0.fromMessageId;
                                                    tL_inputChannel = tL_inputChannelFromMessage;
                                                    arrayList31.add(tL_inputChannel);
                                                    if (tL_channels_getChannels2.id.size() != 100) {
                                                        break;
                                                    }
                                                    tL_messages_dialogs3 = tL_messages_dialogs5;
                                                    mpVar = mpVar2;
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
                                            mpVar = mpVar2;
                                            tL_messages_dialogs4 = tL_messages_dialogs6;
                                        }
                                    }
                                    tL_messages_dialogs3 = tL_messages_dialogs5;
                                    mpVar = mpVar2;
                                    tL_messages_dialogs4 = tL_messages_dialogs6;
                                    arrayList24 = arrayList28;
                                    arrayList22 = arrayList26;
                                    arrayList23 = arrayList27;
                                    mpVar.L4(tL_channels_getChannels2, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_messages_getChats != null) {
                                    mpVar.L4(tL_messages_getChats, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_channels_getChannels != null) {
                                    mpVar.L4(tL_channels_getChannels, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
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
                                        mpVar.L4(tL_messages_getPeerDialogs, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                        tL_messages_getPeerDialogs = null;
                                    }
                                }
                                if (tL_messages_getPeerDialogs != null) {
                                    mpVar.L4(tL_messages_getPeerDialogs, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                            }
                        });
                    } catch (Exception e13) {
                        e = e13;
                        trVar4.o(e, z10);
                    }
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Exception e16) {
            e = e16;
            z10 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r4 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d() {
        pv pvVar = (pv) this.b;
        tr trVar = (tr) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        SQLiteDatabase sQLiteDatabase = trVar.b;
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
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ov ovVar = (ov) arrayList.get(i7);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, ovVar.a);
                    sQLitePreparedStatement.bindInteger(2, ovVar.c());
                    sQLitePreparedStatement.bindInteger(3, ovVar.c);
                    sQLitePreparedStatement.bindInteger(4, ovVar.b ? i7 : 999);
                    sQLitePreparedStatement.bindInteger(5, ovVar.i ? 1 : 0);
                    sQLitePreparedStatement.bindInteger(6, 0);
                    sQLitePreparedStatement.bindInteger(7, 0);
                    sQLitePreparedStatement.bindInteger(8, ovVar.e);
                    sQLitePreparedStatement.bindLong(9, 0L);
                    sQLitePreparedStatement.bindLong(10, ovVar.f);
                    sQLitePreparedStatement.bindLong(11, ovVar.g);
                    sQLitePreparedStatement.bindLong(12, ovVar.h);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            sQLitePreparedStatement.dispose();
            g0.g3(new nv(pvVar, 1));
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void f() {
        zy zyVar = (zy) this.b;
        String str = (String) this.c;
        Runnable runnable = (Runnable) this.d;
        zyVar.w.remove(str);
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void g() {
        py pyVar = (py) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        qy qyVar = pyVar.b;
        zy zyVar = qyVar.q;
        zyVar.E.l(qyVar.j);
        int i7 = ks.v1;
        if (tL_error == null) {
            zyVar.getNotificationCenter().k(i7, Long.valueOf(qyVar.j));
        } else {
            zyVar.getNotificationCenter().k(i7, Long.valueOf(qyVar.j), tL_messages_startHistoryImport, tL_error);
        }
    }

    private final void h() {
        ry ryVar = (ry) this.b;
        TLObject tLObject = (TLObject) this.c;
        Runnable runnable = (Runnable) this.d;
        sy syVar = ryVar.b;
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
            syVar.f = tL_inputStickerSetItem;
            tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = syVar.f;
            TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            inputDocument.id = document.id;
            inputDocument.access_hash = document.access_hash;
            inputDocument.file_reference = document.file_reference;
            String str = syVar.b;
            if (str == null) {
                str = "";
            }
            tL_inputStickerSetItem2.emoji = str;
            syVar.d = document.mime_type;
        } else if (syVar.e) {
            syVar.d = "application/x-bad-tgsticker";
        }
        runnable.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0219, code lost:
    
        if (r5 != 0) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x049f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /* JADX WARN: Type inference failed for: r14v11 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i7;
        boolean z11;
        int i10;
        int i11;
        int i12;
        SQLiteCursor sQLiteCursor;
        Exception e10;
        a0.h hVar;
        SQLitePreparedStatement sQLitePreparedStatement;
        int currentTime;
        int i13;
        SQLitePreparedStatement executeFast;
        TL_ephemeral.EphemeralMessage W;
        int i14;
        int i15 = 6;
        int i16 = 1;
        int i17 = 0;
        switch (this.a) {
            case 0:
                ri riVar = (ri) this.b;
                String str = (String) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                riVar.R.put(str, tL_messages_stickerSet);
                riVar.S.k(str, tL_messages_stickerSet.set.id);
                riVar.getNotificationCenter().k(61, str);
                return;
            case 1:
                ri riVar2 = (ri) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.Document document = (TLRPC.Document) this.d;
                yf.c cVar = riVar2.A0;
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
                ri riVar3 = (ri) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                sr srVar = (sr) this.d;
                HashMap hashMap = riVar3.A1;
                a0.h hVar2 = riVar3.B1;
                a0.h hVar3 = riVar3.z1;
                if (arrayList == null) {
                    if (srVar != null) {
                        hashMap.remove(srVar);
                        hVar3.l(srVar.a);
                        riVar3.getNotificationCenter().k(69, null, srVar);
                        return;
                    }
                    return;
                }
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    int intValue = ((Integer) arrayList.get(i18)).intValue();
                    long j3 = intValue;
                    sr srVar2 = (sr) hVar2.f(j3);
                    if (srVar2 != null) {
                        hashMap.remove(srVar2);
                        ArrayList arrayList2 = (ArrayList) hVar3.f(srVar2.a);
                        if (arrayList2 != null) {
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                TLRPC.Message message = (TLRPC.Message) arrayList2.get(i19);
                                if (message == null || message.id == intValue) {
                                    arrayList2.remove(i19);
                                    i19--;
                                }
                                i19++;
                            }
                            if (arrayList2.isEmpty()) {
                                hVar3.l(srVar2.a);
                            }
                        }
                        hVar2.l(j3);
                        riVar3.getNotificationCenter().k(69, null, srVar2);
                    }
                }
                return;
            case 3:
                ri riVar4 = (ri) this.b;
                TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) this.d;
                String str2 = (String) this.c;
                try {
                    if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                        SQLitePreparedStatement executeFast2 = riVar4.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                        SQLitePreparedStatement executeFast3 = riVar4.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                        riVar4.getMessagesStorage().b.beginTransaction();
                        int size = tL_emojiKeywordsDifference.keywords.size();
                        for (int i20 = 0; i20 < size; i20++) {
                            TLRPC.EmojiKeyword emojiKeyword = tL_emojiKeywordsDifference.keywords.get(i20);
                            if (emojiKeyword instanceof TLRPC.TL_emojiKeyword) {
                                TLRPC.TL_emojiKeyword tL_emojiKeyword = (TLRPC.TL_emojiKeyword) emojiKeyword;
                                String lowerCase = tL_emojiKeyword.keyword.toLowerCase();
                                int size2 = tL_emojiKeyword.emoticons.size();
                                for (int i21 = 0; i21 < size2; i21++) {
                                    executeFast2.requery();
                                    executeFast2.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast2.bindString(2, lowerCase);
                                    executeFast2.bindString(3, tL_emojiKeyword.emoticons.get(i21));
                                    executeFast2.step();
                                }
                            } else if (emojiKeyword instanceof TLRPC.TL_emojiKeywordDeleted) {
                                TLRPC.TL_emojiKeywordDeleted tL_emojiKeywordDeleted = (TLRPC.TL_emojiKeywordDeleted) emojiKeyword;
                                String lowerCase2 = tL_emojiKeywordDeleted.keyword.toLowerCase();
                                int size3 = tL_emojiKeywordDeleted.emoticons.size();
                                for (int i22 = 0; i22 < size3; i22++) {
                                    executeFast3.requery();
                                    executeFast3.bindString(1, tL_emojiKeywordsDifference.lang_code);
                                    executeFast3.bindString(2, lowerCase2);
                                    executeFast3.bindString(3, tL_emojiKeywordDeleted.emoticons.get(i22));
                                    executeFast3.step();
                                }
                            }
                        }
                        riVar4.getMessagesStorage().b.commitTransaction();
                        executeFast2.dispose();
                        executeFast3.dispose();
                    }
                    SQLitePreparedStatement executeFast4 = riVar4.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
                    executeFast4.bindString(1, str2);
                    executeFast4.bindString(2, tL_emojiKeywordsDifference.lang_code);
                    executeFast4.bindInteger(3, tL_emojiKeywordsDifference.version);
                    executeFast4.bindLong(4, System.currentTimeMillis());
                    executeFast4.step();
                    executeFast4.dispose();
                    g0.g3(new hh(riVar4, str2, 3));
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 4:
                ((ri) this.b).t2((TLRPC.Message) this.d, (String) this.c);
                return;
            case 5:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var == null) {
                    return;
                }
                t1Var.setOnCancelListener(new ae(zArr, 2));
                g2Var.showDialog(t1VarArr[0]);
                return;
            case 6:
                ((mp) this.b).getNotificationCenter().k(ks.N2, (org.telegram.ui.ActionBar.l6) this.c, (org.telegram.ui.ActionBar.j6) this.d);
                return;
            case 7:
                mp mpVar = (mp) this.b;
                long[] jArr = (long[]) this.c;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.d;
                int i23 = (int) jArr[1];
                mpVar.getSendMessagesHelper().d0(i23);
                mpVar.getSendMessagesHelper().i0(i23, false);
                ks notificationCenter = mpVar.getNotificationCenter();
                Integer valueOf = Integer.valueOf(i23);
                Integer valueOf2 = Integer.valueOf(tL_updateMessageID.id);
                Long valueOf3 = Long.valueOf(jArr[0]);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, null, valueOf3, 0L, -1, bool);
                mpVar.getNotificationCenter().k(22, Integer.valueOf(i23), Integer.valueOf(tL_updateMessageID.id), null, Long.valueOf(jArr[0]), 0L, -1, bool);
                return;
            case 8:
                mp mpVar2 = (mp) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                a0.h hVar4 = mpVar2.j8;
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList4 = ((Vector) tLObject2).objects;
                    z10 = false;
                    for (int i24 = 0; i24 < Math.min(arrayList3.size(), arrayList4.size()); i24++) {
                        long longValue = ((Long) arrayList3.get(i24)).longValue();
                        if (arrayList4.get(i24) instanceof TL_account.RequirementToContact) {
                            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) arrayList4.get(i24);
                            if (!o10.d((TL_account.RequirementToContact) hVar4.f(longValue), requirementToContact)) {
                                if (requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty)) {
                                    hVar4.l(longValue);
                                } else {
                                    hVar4.k(requirementToContact, longValue);
                                }
                                z10 = true;
                            }
                            TLRPC.UserFull d2 = mpVar2.d2(longValue);
                            if (d2 != null && o10.a(d2, requirementToContact)) {
                                mpVar2.getMessagesStorage().j2(d2, true);
                            } else if (d2 == null) {
                                tr messagesStorage = mpVar2.getMessagesStorage();
                                messagesStorage.a.c(new d4(messagesStorage, longValue, requirementToContact, 20));
                            }
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    mpVar2.getNotificationCenter().k(ks.k3, new Object[0]);
                    return;
                }
                return;
            case 9:
                mp mpVar3 = (mp) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                a0.h hVar5 = mpVar3.R;
                ArrayList arrayList5 = mpVar3.y;
                if (longSparseIntArray != null) {
                    int i25 = 0;
                    boolean z12 = false;
                    while (i25 < longSparseIntArray.size()) {
                        long keyAt = longSparseIntArray.keyAt(i25);
                        TLRPC.Dialog dialog = (TLRPC.Dialog) hVar5.f(keyAt);
                        if (dialog == null) {
                            int i26 = i17;
                            while (i26 < arrayList5.size()) {
                                i11 = i16;
                                i12 = i17;
                                if (((TLRPC.Dialog) arrayList5.get(i26)).id == keyAt) {
                                    hVar5.k((TLRPC.Dialog) arrayList5.get(i26), keyAt);
                                    dialog = (TLRPC.Dialog) arrayList5.get(i26);
                                    if (dialog == null) {
                                        boolean z13 = s2.a;
                                        mpVar3.b0.put(keyAt, longSparseIntArray.valueAt(i25));
                                    }
                                    if (dialog == null) {
                                        int i27 = dialog.unread_count;
                                        int valueAt = longSparseIntArray.valueAt(i25);
                                        dialog.unread_count = valueAt;
                                        boolean z14 = s2.a;
                                        if (i27 != 0 && valueAt == 0) {
                                            mpVar3.u2(keyAt, 0L, null);
                                            if (!z12) {
                                                z12 = mpVar3.n0();
                                            }
                                        } else if (i27 == 0 && !dialog.unread_mark && valueAt != 0) {
                                            mpVar3.u2(keyAt, 0L, null);
                                            if (!z12) {
                                                z12 = mpVar3.n0();
                                            }
                                        }
                                    }
                                    i25++;
                                    i16 = i11;
                                    i17 = i12;
                                    z12 = z12;
                                } else {
                                    i26++;
                                    i16 = i11;
                                    i17 = i12;
                                }
                            }
                        }
                        i11 = i16;
                        i12 = i17;
                        if (dialog == null) {
                        }
                        if (dialog == null) {
                        }
                        i25++;
                        i16 = i11;
                        i17 = i12;
                        z12 = z12;
                    }
                    i7 = i17;
                    z11 = z12;
                } else {
                    i7 = 0;
                    z11 = 0;
                }
                int i28 = i16;
                if (longSparseIntArray2 != null) {
                    int i29 = i7;
                    z11 = z11;
                    while (i29 < longSparseIntArray2.size()) {
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar5.f(longSparseIntArray2.keyAt(i29));
                        if (dialog2 != null) {
                            dialog2.unread_mentions_count = longSparseIntArray2.valueAt(i29);
                            if (mpVar3.x0.contains(Long.valueOf(dialog2.id))) {
                                ks notificationCenter2 = mpVar3.getNotificationCenter();
                                Long valueOf4 = Long.valueOf(dialog2.id);
                                Integer valueOf5 = Integer.valueOf(dialog2.unread_mentions_count);
                                Object[] objArr = new Object[3];
                                objArr[i7] = valueOf4;
                                objArr[i28] = 0L;
                                objArr[2] = valueOf5;
                                notificationCenter2.k(93, objArr);
                            }
                            if (z11 == 0) {
                                int i30 = i7;
                                while (true) {
                                    ro[] roVarArr = mpVar3.N;
                                    if (i30 < roVarArr.length) {
                                        ro roVar = roVarArr[i30];
                                        if (roVar == null || (roVar.g & 32) == 0) {
                                            i30++;
                                        } else {
                                            z11 = i28;
                                        }
                                    }
                                }
                                if (z11 == 0) {
                                    z11 = mpVar3.n0();
                                }
                            }
                        }
                        i29++;
                        z11 = z11;
                    }
                }
                if (z11 != 0) {
                    mpVar3.f5(null);
                    i10 = i7;
                    mpVar3.getNotificationCenter().k(3, new Object[i10]);
                } else {
                    i10 = i7;
                }
                ks notificationCenter3 = mpVar3.getNotificationCenter();
                Object[] objArr2 = new Object[i28];
                objArr2[i10] = 256;
                notificationCenter3.k(2, objArr2);
                if (longSparseIntArray != null) {
                    mpVar3.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                return;
            case 10:
                ((mp) this.b).getConnectionsManager().sendRequest((TLRPC.TL_channels_editAdmin) this.c, (om) this.d);
                return;
            case 11:
                ((mp) this.b).getConnectionsManager().sendRequest((TLRPC.TL_messages_editChatAdmin) this.c, (di.k3) this.d);
                return;
            case 12:
                mp mpVar4 = (mp) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.d;
                if (!arrayList6.isEmpty()) {
                    g0.g3(new xj(mpVar4, arrayList6, i15));
                }
                mpVar4.getMessagesStorage().j1(updates_channeldifference.new_messages, true, false, false, mpVar4.getDownloadController().l(), false, 0, 0L);
                return;
            case 13:
                ((mp) this.b).getNotificationsController().K((ArrayList) this.c, !(((TLRPC.updates_Difference) this.d) instanceof TLRPC.TL_updates_differenceSlice), false, null);
                return;
            case 14:
                mp mpVar5 = (mp) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                chatFull.about = (String) this.c;
                mpVar5.getMessagesStorage().N1(chatFull, false);
                ks notificationCenter4 = mpVar5.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter4.k(30, chatFull, 0, bool2, bool2);
                return;
            case 15:
                gp gpVar = (gp) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = gpVar.c;
                if (tLObject3 instanceof TLRPC.TL_savedMusic) {
                    TLRPC.TL_savedMusic tL_savedMusic = (TLRPC.TL_savedMusic) tLObject3;
                    if (gpVar.d <= 0 && arrayList8.size() == 1) {
                        if (((fj) arrayList8.get(0)).F0() == null || arrayList7.isEmpty() || ((fj) arrayList7.get(0)).F0() == null || ((fj) arrayList8.get(0)).F0().id != ((fj) arrayList7.get(0)).F0().id) {
                            arrayList8.clear();
                        } else {
                            arrayList7.remove(0);
                        }
                    }
                    gpVar.d = tL_savedMusic.count;
                    arrayList8.addAll(arrayList7);
                    gpVar.e = arrayList8.size() >= gpVar.d;
                }
                gpVar.f = false;
                ks.f(gpVar.a).k(ks.W3, gpVar);
                return;
            case 16:
                tr trVar = (tr) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                zj zjVar = (zj) this.d;
                trVar.getClass();
                int size4 = arrayList9.size();
                while (i17 < size4) {
                    Object obj = arrayList9.get(i17);
                    i17++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                    long o4 = n5.o(ephemeralMessage.peer_id);
                    long o10 = n5.o(ephemeralMessage.from_id);
                    int i31 = ephemeralMessage.anchor_msg_id;
                    ob.c cVar2 = trVar.e0;
                    int i32 = ephemeralMessage.id;
                    a0.h hVar6 = (a0.h) cVar2.b;
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar6.f(o4);
                    if (sparseIntArray == null) {
                        sparseIntArray = new SparseIntArray();
                        hVar6.k(sparseIntArray, o4);
                    }
                    sparseIntArray.put(i31, i32);
                    TLRPC.Message c02 = trVar.c0(o4, i31);
                    if (c02 != null) {
                        ephemeralMessage.peer_id = c02.peer_id;
                        ephemeralMessage.from_id = c02.from_id;
                        ephemeralMessage.out = c02.out;
                        if (o10 > 0) {
                            ephemeralMessage.via_bot_id = o10;
                        }
                    }
                }
                trVar.g1(arrayList9, true);
                zjVar.run();
                return;
            case 17:
                tr trVar2 = (tr) this.b;
                a0.h hVar7 = (a0.h) this.c;
                a0.h hVar8 = (a0.h) this.d;
                if (hVar7 != null) {
                    try {
                        int m10 = hVar7.m();
                        for (int i33 = 0; i33 < m10; i33++) {
                            SQLiteDatabase sQLiteDatabase = trVar2.b;
                            Locale locale = Locale.US;
                            sQLiteDatabase.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) hVar7.n(i33)) + ") AND uid = " + hVar7.j(i33) + " AND media = 0").stepThis().dispose();
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                        sQLiteCursor = null;
                        try {
                            trVar2.o(e10, true);
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
                    for (int i34 = 0; i34 < m11; i34++) {
                        SQLiteDatabase sQLiteDatabase2 = trVar2.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) hVar8.n(i34)) + ") AND uid = " + hVar8.j(i34) + " AND media = 1").stepThis().dispose();
                    }
                }
                SQLiteCursor queryFinalized = trVar2.b.queryFinalized("SELECT mid, date, media, uid FROM enc_tasks_v4 WHERE date = (SELECT min(date) FROM enc_tasks_v4)", new Object[0]);
                int i35 = 0;
                a0.h hVar9 = null;
                a0.h hVar10 = null;
                while (queryFinalized.next()) {
                    try {
                        int intValue2 = queryFinalized.intValue(0);
                        i35 = queryFinalized.intValue(1);
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
                    } catch (Exception e13) {
                        e10 = e13;
                        sQLiteCursor = queryFinalized;
                        trVar2.o(e10, true);
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
                mp messagesController = trVar2.getMessagesController();
                messagesController.getClass();
                Utilities.d.c(new dg(messagesController, hVar9, hVar10, i35, 13));
                return;
            case 18:
                tr trVar3 = (tr) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                String str3 = (String) this.c;
                trVar3.getClass();
                try {
                    currentTime = trVar3.getConnectionsManager().getCurrentTime();
                } catch (Exception e14) {
                    e = e14;
                    sQLitePreparedStatement = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                }
                try {
                    if (!(tLObject4 instanceof TLRPC.TL_messages_botCallbackAnswer)) {
                        if (tLObject4 instanceof TLRPC.TL_messages_botResults) {
                            i13 = ((TLRPC.TL_messages_botResults) tLObject4).cache_time;
                        }
                        executeFast = trVar3.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
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
                    i13 = ((TLRPC.TL_messages_botCallbackAnswer) tLObject4).cache_time;
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(nativeByteBuffer2);
                    executeFast.bindString(1, str3);
                    executeFast.bindInteger(2, currentTime);
                    executeFast.bindByteBuffer(3, nativeByteBuffer2);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer2.reuse();
                    return;
                } catch (Exception e15) {
                    e = e15;
                    sQLitePreparedStatement = executeFast;
                    try {
                        trVar3.o(e, true);
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
                currentTime += i13;
                executeFast = trVar3.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
            case 19:
                a();
                return;
            case 20:
                ((tr) this.b).getNotificationCenter().k(49, Long.valueOf(fj.B0(((fj) this.c).k)), (ArrayList) this.d);
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                tr trVar4 = (tr) this.b;
                ArrayList arrayList11 = (ArrayList) this.c;
                yj yjVar = (yj) this.d;
                trVar4.getClass();
                int size5 = arrayList11.size();
                while (i17 < size5) {
                    Object obj2 = arrayList11.get(i17);
                    i17++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage2 = (TL_ephemeral.EphemeralMessage) obj2;
                    if (ephemeralMessage2.top_msg_id == 0 && (W = trVar4.W(ephemeralMessage2.id, n5.o(ephemeralMessage2.peer_id))) != null && (i14 = W.top_msg_id) != 0) {
                        ephemeralMessage2.top_msg_id = i14;
                        TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage2.reply_to;
                        if (messageReplyHeader != null) {
                            messageReplyHeader.forum_topic = true;
                        }
                        ephemeralMessage2.flags |= 2;
                    }
                }
                trVar4.g1(arrayList11, true);
                yjVar.run();
                return;
            case 24:
                d();
                return;
            case 25:
                xv xvVar = (xv) this.b;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) this.d;
                if (encryptedChat != null) {
                    xvVar.getMessagesController().b4(encryptedChat2, false);
                }
                xvVar.getMessagesStorage().V1(encryptedChat2);
                xvVar.getNotificationCenter().k(35, encryptedChat2);
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                ((MediaBrowserService.Result) ((j1) this.d).b).sendResult(((qz) this.b).d((String) this.c));
                return;
        }
    }

    public /* synthetic */ kg(Object obj, Object obj2, String str, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }
}
