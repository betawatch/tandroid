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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class dg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dg(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    private final void a() {
        qr qrVar = (qr) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        qrVar.getClass();
        try {
            if (str.length() != 0) {
                SQLiteDatabase sQLiteDatabase = qrVar.b;
                Locale locale = Locale.US;
                sQLiteDatabase.executeFast("UPDATE user_phones_v7 SET deleted = 0 WHERE sphone IN(" + str + ")").stepThis().dispose();
            }
            if (str2.length() != 0) {
                SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("UPDATE user_phones_v7 SET deleted = 1 WHERE sphone IN(" + str2 + ")").stepThis().dispose();
            }
        } catch (Exception e10) {
            qrVar.o(e10, true);
        }
    }

    private final void b() {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        qr qrVar = (qr) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        org.telegram.ui.sg sgVar = (org.telegram.ui.sg) this.d;
        long e10 = qrVar.getUserConfig().e();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            zi ziVar = (zi) arrayList.get(i3);
            if (!ziVar.p1 && !zi.c4(ziVar.k)) {
                try {
                    sQLiteCursor = qrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = ? AND mid = ?", Long.valueOf(zi.B0(ziVar.k)), Integer.valueOf(ziVar.f1()));
                    try {
                        try {
                            if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, e10);
                                byteBufferValue.reuse();
                                ziVar.k.attachPath = TLdeserialize.attachPath;
                                ziVar.K(true);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            a8.g(e, true);
                            if (sQLiteCursor == null) {
                                i3 = i10;
                            }
                            sQLiteCursor.dispose();
                            i3 = i10;
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
            i3 = i10;
        }
        g0.h3(sgVar);
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
        qr qrVar;
        TLRPC.TL_messages_dialogs H0;
        int i3;
        int i10;
        SparseArray sparseArray;
        int i11;
        ArrayList arrayList;
        qr qrVar2;
        HashMap hashMap;
        int i12;
        HashMap hashMap2;
        int i13;
        ?? r5;
        ArrayList arrayList2;
        Long valueOf;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList3;
        qr qrVar3;
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
        qr qrVar4 = (qr) this.b;
        ArrayList arrayList4 = (ArrayList) this.c;
        final Runnable runnable = (Runnable) this.d;
        try {
            SparseArray sparseArray2 = new SparseArray();
            int size3 = qrVar4.I.size();
            for (int i18 = 0; i18 < size3; i18++) {
                mo moVar = (mo) qrVar4.I.get(i18);
                sparseArray2.put(moVar.a, moVar);
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
                qr qrVar5 = hashMap4;
                while (i19 < size4) {
                    try {
                        ArrayList arrayList10 = arrayList4;
                        TLRPC.DialogFilter dialogFilter = (TLRPC.DialogFilter) arrayList4.get(i19);
                        arrayList5.add(Integer.valueOf(dialogFilter.id));
                        if (dialogFilter.contacts) {
                            int i20 = hp.C8;
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        if (dialogFilter.non_contacts) {
                            int i21 = hp.C8;
                            i3 |= 2;
                        }
                        if (dialogFilter.groups) {
                            int i22 = hp.C8;
                            i3 |= 4;
                        }
                        if (dialogFilter.broadcasts) {
                            int i23 = hp.C8;
                            i3 |= 8;
                        }
                        if (dialogFilter.bots) {
                            int i24 = hp.C8;
                            i3 |= 16;
                        }
                        if (dialogFilter.exclude_muted) {
                            int i25 = hp.C8;
                            i3 |= 32;
                        }
                        if (dialogFilter.exclude_read) {
                            int i26 = hp.C8;
                            i10 = i3 | 64;
                        } else {
                            i10 = i3;
                        }
                        int i27 = i19;
                        if (dialogFilter.exclude_archived) {
                            int i28 = hp.C8;
                            i10 |= 128;
                        }
                        if (dialogFilter instanceof TLRPC.TL_dialogFilterChatlist) {
                            int i29 = hp.C8;
                            i10 = dialogFilter.has_my_invites ? i10 | 1536 : i10 | 512;
                        }
                        ArrayList arrayList11 = arrayList5;
                        mo moVar2 = (mo) qrVar4.J.get(dialogFilter.id);
                        if (moVar2 != null) {
                            sparseArray2.remove(dialogFilter.id);
                            sparseArray = sparseArray2;
                            if (TextUtils.equals(moVar2.b, dialogFilter.title.text) && li.K(moVar2.c, dialogFilter.title.entities)) {
                                z11 = false;
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = dialogFilter.title;
                                moVar2.b = tL_textWithEntities.text;
                                moVar2.c = tL_textWithEntities.entities;
                                z11 = true;
                            }
                            boolean z16 = moVar2.n;
                            boolean z17 = z11;
                            boolean z18 = dialogFilter.title_noanimate;
                            if (z16 != z18) {
                                moVar2.n = z18;
                                z12 = true;
                            } else {
                                z12 = z17;
                            }
                            int i30 = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                            boolean z19 = z12;
                            if (moVar2.m != i30) {
                                moVar2.m = i30;
                                z13 = true;
                            } else {
                                z13 = z19;
                            }
                            if (moVar2.g != i10) {
                                moVar2.g = i10;
                                z14 = true;
                                z13 = true;
                            } else {
                                z14 = false;
                            }
                            boolean z20 = z14;
                            HashSet hashSet2 = new HashSet(moVar2.h);
                            hashSet2.addAll(moVar2.i);
                            HashSet hashSet3 = new HashSet();
                            boolean z21 = z13;
                            if (moVar2.j.size() != 0) {
                                ArrayList arrayList12 = new ArrayList();
                                i11 = size4;
                                int size5 = moVar2.j.size();
                                qrVar = qrVar4;
                                int i31 = 0;
                                boolean z22 = false;
                                while (i31 < size5) {
                                    int i32 = size5;
                                    try {
                                        long keyAt = moVar2.j.keyAt(i31);
                                        if (m5.C(keyAt)) {
                                            z22 = true;
                                        }
                                        arrayList12.add(Long.valueOf(keyAt));
                                        i31++;
                                        size5 = i32;
                                    } catch (Exception e10) {
                                        e = e10;
                                        z10 = true;
                                        qrVar4 = qrVar;
                                        qrVar4.o(e, z10);
                                    }
                                }
                                if (z22) {
                                    linkedHashMap = new LinkedHashMap();
                                    arrayList3 = arrayList7;
                                    qrVar3 = qrVar5;
                                    Collections.sort(arrayList12, new rq(moVar2.j, 0));
                                    int size6 = arrayList12.size();
                                    int i33 = 0;
                                    while (i33 < size6) {
                                        Long l10 = (Long) arrayList12.get(i33);
                                        if (m5.C(l10.longValue())) {
                                            i17 = size6;
                                            linkedHashMap.put(Integer.valueOf(i33), l10);
                                        } else {
                                            i17 = size6;
                                        }
                                        i33++;
                                        size6 = i17;
                                    }
                                    size = moVar2.j.size();
                                    for (i14 = 0; i14 < size; i14++) {
                                        long keyAt2 = moVar2.j.keyAt(i14);
                                        if (!m5.C(keyAt2)) {
                                            hashSet3.add(Long.valueOf(keyAt2));
                                            hashSet2.remove(Long.valueOf(keyAt2));
                                        }
                                    }
                                    moVar2.j.clear();
                                    size2 = dialogFilter.pinned_peers.size();
                                    boolean z23 = z21;
                                    i15 = 0;
                                    while (i15 < size2) {
                                        TLRPC.InputPeer inputPeer = dialogFilter.pinned_peers.get(i15);
                                        int i34 = i15;
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
                                        int size7 = moVar2.j.size();
                                        int i35 = size2;
                                        if (linkedHashMap != null) {
                                            while (true) {
                                                Long l11 = (Long) linkedHashMap.remove(Integer.valueOf(size7));
                                                if (l11 == null) {
                                                    break;
                                                }
                                                moVar2.j.put(l11.longValue(), size7);
                                                size7++;
                                                linkedHashMap = linkedHashMap;
                                                hashMap3 = hashMap3;
                                            }
                                        }
                                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                                        HashMap hashMap7 = hashMap3;
                                        moVar2.j.put(valueOf2.longValue(), size7);
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
                                            moVar2.j.put(((Long) ((Map.Entry) it.next()).getValue()).longValue(), moVar2.j.size());
                                        }
                                    }
                                    z15 = z25;
                                    i16 = 0;
                                    while (i16 < 2) {
                                        ArrayList L1 = qr.L1(i16 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers);
                                        ArrayList arrayList13 = i16 == 0 ? moVar2.h : moVar2.i;
                                        if (i16 == 0) {
                                            ArrayList L12 = qr.L1(dialogFilter.pinned_peers);
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
                                                moVar2.h = L1;
                                            } else {
                                                moVar2.i = L1;
                                            }
                                            z15 = true;
                                            z20 = true;
                                        }
                                        i16++;
                                    }
                                    if (!hashSet3.isEmpty()) {
                                        hashMap6.put(Integer.valueOf(moVar2.a), hashSet3);
                                        z15 = true;
                                    }
                                    if (z15) {
                                        arrayList9.add(moVar2);
                                    }
                                    if (z20) {
                                        hashSet.add(Integer.valueOf(moVar2.a));
                                    }
                                    arrayList = arrayList3;
                                    qrVar2 = qrVar3;
                                    hashMap = hashMap8;
                                }
                            } else {
                                qrVar = qrVar4;
                                i11 = size4;
                            }
                            arrayList3 = arrayList7;
                            qrVar3 = qrVar5;
                            linkedHashMap = null;
                            size = moVar2.j.size();
                            while (i14 < size) {
                            }
                            moVar2.j.clear();
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
                            qrVar2 = qrVar3;
                            hashMap = hashMap82;
                        } else {
                            qrVar = qrVar4;
                            ArrayList arrayList14 = arrayList7;
                            HashMap hashMap9 = hashMap3;
                            qr qrVar6 = qrVar5;
                            sparseArray = sparseArray2;
                            i11 = size4;
                            mo moVar3 = new mo();
                            moVar3.a = dialogFilter.id;
                            moVar3.g = i10;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = dialogFilter.title;
                            moVar3.b = tL_textWithEntities2.text;
                            moVar3.c = tL_textWithEntities2.entities;
                            moVar3.n = dialogFilter.title_noanimate;
                            moVar3.m = (dialogFilter.flags & TLObject.FLAG_27) != 0 ? dialogFilter.color : -1;
                            moVar3.e = -1;
                            int i39 = 0;
                            while (i39 < 2) {
                                if (i39 == 0) {
                                    int size9 = dialogFilter.pinned_peers.size();
                                    int i40 = 0;
                                    while (i40 < size9) {
                                        TLRPC.InputPeer inputPeer2 = dialogFilter.pinned_peers.get(i40);
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
                                        if (!moVar3.h.contains(valueOf)) {
                                            moVar3.h.add(valueOf);
                                        }
                                        int i41 = size9;
                                        int i42 = i40;
                                        moVar3.j.put(valueOf.longValue(), moVar3.j.size() + 1);
                                        if (!hashMap5.containsKey(valueOf)) {
                                            arrayList8.add(valueOf);
                                            hashMap5.put(valueOf, inputPeer2);
                                        }
                                        i40 = i42 + 1;
                                        size9 = i41;
                                    }
                                }
                                ArrayList<TLRPC.InputPeer> arrayList15 = i39 == 0 ? dialogFilter.include_peers : dialogFilter.exclude_peers;
                                ArrayList arrayList16 = i39 == 0 ? moVar3.h : moVar3.i;
                                int size10 = arrayList15.size();
                                int i43 = 0;
                                while (i43 < size10) {
                                    TLRPC.InputPeer inputPeer3 = arrayList15.get(i43);
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
                                        i13 = size10;
                                        i12 = i43;
                                        arrayList2 = arrayList14;
                                        r5 = qrVar6;
                                    } else {
                                        int i44 = size10;
                                        i12 = i43;
                                        hashMap2 = hashMap9;
                                        long j15 = inputPeer3.chat_id;
                                        if (j15 == 0) {
                                            j15 = inputPeer3.channel_id;
                                        }
                                        i13 = i44;
                                        Long valueOf4 = Long.valueOf(j15);
                                        Long valueOf5 = Long.valueOf(-j15);
                                        if (!arrayList16.contains(valueOf5)) {
                                            arrayList16.add(valueOf5);
                                        }
                                        r5 = qrVar6;
                                        if (r5.containsKey(valueOf4)) {
                                            arrayList2 = arrayList14;
                                        } else {
                                            arrayList2 = arrayList14;
                                            arrayList2.add(valueOf4);
                                            r5.put(valueOf4, inputPeer3);
                                        }
                                    }
                                    hashMap9 = hashMap2;
                                    qrVar6 = r5;
                                    arrayList14 = arrayList2;
                                    arrayList15 = arrayList17;
                                    size10 = i13;
                                    i43 = i12 + 1;
                                    dialogFilter = dialogFilter2;
                                }
                                i39++;
                            }
                            arrayList = arrayList14;
                            qrVar2 = qrVar6;
                            hashMap = hashMap9;
                            arrayList9.add(moVar3);
                        }
                        i19 = i27 + 1;
                        qrVar5 = qrVar2;
                        arrayList7 = arrayList;
                        arrayList4 = arrayList10;
                        arrayList5 = arrayList11;
                        sparseArray2 = sparseArray;
                        size4 = i11;
                        qrVar4 = qrVar;
                        hashMap3 = hashMap;
                    } catch (Exception e11) {
                        e = e11;
                        z10 = true;
                        qrVar4.o(e, z10);
                    }
                }
                qrVar = qrVar4;
                final HashMap hashMap10 = hashMap3;
                final SparseArray sparseArray3 = sparseArray2;
                final ArrayList arrayList18 = arrayList5;
                ArrayList arrayList19 = arrayList7;
                qr qrVar7 = qrVar5;
                try {
                    if (arrayList8.isEmpty()) {
                        qrVar5 = qrVar;
                        H0 = new TLRPC.TL_messages_dialogs();
                    } else {
                        try {
                            qrVar5 = qrVar;
                            H0 = qrVar5.H0(arrayList6, arrayList19, new ArrayList(), TextUtils.join(",", arrayList8));
                            int size11 = H0.dialogs.size();
                            for (int i45 = 0; i45 < size11; i45++) {
                                hashMap5.remove(Long.valueOf(H0.dialogs.get(i45).id));
                            }
                        } catch (Exception e12) {
                            e = e12;
                            qrVar5 = qrVar;
                            qrVar4 = qrVar5;
                            z10 = true;
                            qrVar4.o(e, z10);
                        }
                    }
                    final ArrayList arrayList20 = new ArrayList();
                    if (!arrayList6.isEmpty()) {
                        qrVar5.n0(arrayList6, arrayList20, false);
                        int size12 = arrayList20.size();
                        int i46 = 0;
                        while (i46 < size12) {
                            hashMap10.remove(Long.valueOf(((TLRPC.User) arrayList20.get(i46)).id));
                            i46++;
                            qrVar7 = qrVar7;
                        }
                    }
                    qr qrVar8 = qrVar7;
                    final ArrayList arrayList21 = new ArrayList();
                    if (!arrayList19.isEmpty()) {
                        qrVar5.Q(TextUtils.join(",", arrayList19), arrayList21);
                        int size13 = arrayList21.size();
                        int i47 = 0;
                        while (i47 < size13) {
                            ?? r52 = qrVar8;
                            r52.remove(Long.valueOf(((TLRPC.Chat) arrayList21.get(i47)).id));
                            i47++;
                            qrVar8 = r52;
                        }
                    }
                    final ?? r53 = qrVar8;
                    if (hashMap10.isEmpty() && r53.isEmpty()) {
                        if (hashMap5.isEmpty()) {
                            qrVar5.Y0(H0, null, arrayList20, arrayList21, arrayList9, sparseArray3, arrayList18, hashMap6, hashSet, runnable);
                            return;
                        }
                    }
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs = H0;
                    qrVar4 = qrVar5;
                    final hp messagesController = qrVar4.getMessagesController();
                    final TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                    messagesController.getClass();
                    z10 = true;
                    try {
                        Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.an
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x0167  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                TLRPC.TL_users_getUsers tL_users_getUsers;
                                hp hpVar;
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
                                hp hpVar2;
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
                                        hpVar = hp.this;
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
                                        tL_users_getUsers.id.add(hpVar.p1((TLRPC.InputPeer) entry.getValue()));
                                        if (tL_users_getUsers.id.size() == 100) {
                                            break;
                                        } else {
                                            arrayList30 = arrayList29;
                                        }
                                    }
                                    arrayList30 = arrayList29;
                                    hpVar.B4(tL_users_getUsers, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_users_getUsers != null) {
                                    hpVar.B4(tL_users_getUsers, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                TLRPC.TL_messages_getChats tL_messages_getChats = null;
                                loop2: while (true) {
                                    tL_channels_getChannels = null;
                                    for (Map.Entry entry2 : r53.entrySet()) {
                                        hpVar2 = hpVar;
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
                                                hpVar = hpVar2;
                                                tL_messages_dialogs4 = tL_messages_dialogs6;
                                                hpVar.B4(tL_messages_getChats, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                                tL_messages_getChats = null;
                                            } else {
                                                tL_messages_dialogs3 = tL_messages_dialogs5;
                                                hpVar = hpVar2;
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
                                                TLRPC.Chat M0 = hp.s1(h10.t0).M0(Long.valueOf(inputPeer4.channel_id));
                                                if (M0 != null && M0.access_hash == 0 && M0.fromMessageId != 0 && M0.fromMessageDialogId != 0) {
                                                    TLRPC.TL_inputChannelFromMessage tL_inputChannelFromMessage = new TLRPC.TL_inputChannelFromMessage();
                                                    arrayList28 = arrayList24;
                                                    tL_inputChannelFromMessage.channel_id = inputPeer4.channel_id;
                                                    tL_inputChannelFromMessage.peer = hp.s1(h10.t0).j1(M0.fromMessageDialogId);
                                                    tL_inputChannelFromMessage.msg_id = M0.fromMessageId;
                                                    tL_inputChannel = tL_inputChannelFromMessage;
                                                    arrayList31.add(tL_inputChannel);
                                                    if (tL_channels_getChannels2.id.size() != 100) {
                                                        break;
                                                    }
                                                    tL_messages_dialogs3 = tL_messages_dialogs5;
                                                    hpVar = hpVar2;
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
                                            hpVar = hpVar2;
                                            tL_messages_dialogs4 = tL_messages_dialogs6;
                                        }
                                    }
                                    tL_messages_dialogs3 = tL_messages_dialogs5;
                                    hpVar = hpVar2;
                                    tL_messages_dialogs4 = tL_messages_dialogs6;
                                    arrayList24 = arrayList28;
                                    arrayList22 = arrayList26;
                                    arrayList23 = arrayList27;
                                    hpVar.B4(tL_channels_getChannels2, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_messages_getChats != null) {
                                    hpVar.B4(tL_messages_getChats, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                                if (tL_channels_getChannels != null) {
                                    hpVar.B4(tL_channels_getChannels, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
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
                                        hpVar.B4(tL_messages_getPeerDialogs, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                        tL_messages_getPeerDialogs = null;
                                    }
                                }
                                if (tL_messages_getPeerDialogs != null) {
                                    hpVar.B4(tL_messages_getPeerDialogs, arrayList30, tL_messages_dialogs3, tL_messages_dialogs4, arrayList22, arrayList23, arrayList24, sparseArray4, arrayList25, hashMap11, hashSet4, runnable2);
                                }
                            }
                        });
                    } catch (Exception e13) {
                        e = e13;
                        qrVar4.o(e, z10);
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

    private final void e() {
        int i3;
        qr qrVar = (qr) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        sj sjVar = (sj) this.d;
        qrVar.getClass();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (ephemeralMessage.top_msg_id == 0) {
                TL_ephemeral.EphemeralMessage W = qrVar.W(ephemeralMessage.id, m5.o(ephemeralMessage.peer_id));
                if (W != null && (i3 = W.top_msg_id) != 0) {
                    ephemeralMessage.top_msg_id = i3;
                    TLRPC.MessageReplyHeader messageReplyHeader = ephemeralMessage.reply_to;
                    if (messageReplyHeader != null) {
                        messageReplyHeader.forum_topic = true;
                    }
                    ephemeralMessage.flags |= 2;
                }
            }
        }
        qrVar.g1(arrayList, true);
        sjVar.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (r4 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        nv nvVar = (nv) this.b;
        qr qrVar = (qr) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        SQLiteDatabase sQLiteDatabase = qrVar.b;
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
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    mv mvVar = (mv) arrayList.get(i3);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, mvVar.a);
                    sQLitePreparedStatement.bindInteger(2, mvVar.c());
                    sQLitePreparedStatement.bindInteger(3, mvVar.c);
                    sQLitePreparedStatement.bindInteger(4, mvVar.b ? i3 : 999);
                    sQLitePreparedStatement.bindInteger(5, mvVar.i ? 1 : 0);
                    sQLitePreparedStatement.bindInteger(6, 0);
                    sQLitePreparedStatement.bindInteger(7, 0);
                    sQLitePreparedStatement.bindInteger(8, mvVar.e);
                    sQLitePreparedStatement.bindLong(9, 0L);
                    sQLitePreparedStatement.bindLong(10, mvVar.f);
                    sQLitePreparedStatement.bindLong(11, mvVar.g);
                    sQLitePreparedStatement.bindLong(12, mvVar.h);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            sQLitePreparedStatement.dispose();
            g0.h3(new lv(nvVar, 1));
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void g() {
        oy oyVar = (oy) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = (TLRPC.TL_messages_startHistoryImport) this.d;
        py pyVar = oyVar.b;
        yy yyVar = pyVar.q;
        yyVar.E.l(pyVar.j);
        int i3 = hs.v1;
        if (tL_error == null) {
            yyVar.getNotificationCenter().k(i3, Long.valueOf(pyVar.j));
        } else {
            yyVar.getNotificationCenter().k(i3, Long.valueOf(pyVar.j), tL_messages_startHistoryImport, tL_error);
        }
    }

    private final void h() {
        qy qyVar = (qy) this.b;
        TLObject tLObject = (TLObject) this.c;
        Runnable runnable = (Runnable) this.d;
        ry ryVar = qyVar.b;
        if (tLObject instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = new TLRPC.TL_inputStickerSetItem();
            ryVar.f = tL_inputStickerSetItem;
            tL_inputStickerSetItem.document = new TLRPC.TL_inputDocument();
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem2 = ryVar.f;
            TLRPC.InputDocument inputDocument = tL_inputStickerSetItem2.document;
            TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject).document;
            inputDocument.id = document.id;
            inputDocument.access_hash = document.access_hash;
            inputDocument.file_reference = document.file_reference;
            String str = ryVar.b;
            if (str == null) {
                str = "";
            }
            tL_inputStickerSetItem2.emoji = str;
            ryVar.d = document.mime_type;
        } else if (ryVar.e) {
            ryVar.d = "application/x-bad-tgsticker";
        }
        runnable.run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e7, code lost:
    
        if (r5 != 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        SQLiteCursor sQLiteCursor;
        Exception e10;
        a0.h hVar;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i14;
        SQLitePreparedStatement executeFast;
        int i15 = 6;
        int i16 = 1;
        int i17 = 0;
        switch (this.a) {
            case 0:
                li liVar = (li) this.b;
                String str = (String) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                liVar.R.put(str, tL_messages_stickerSet);
                liVar.S.k(str, tL_messages_stickerSet.set.id);
                liVar.getNotificationCenter().k(61, str);
                return;
            case 1:
                li liVar2 = (li) this.b;
                TLObject tLObject = (TLObject) this.c;
                TLRPC.Document document = (TLRPC.Document) this.d;
                zf.c cVar = liVar2.A0;
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
                li liVar3 = (li) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                pr prVar = (pr) this.d;
                HashMap hashMap = liVar3.y1;
                a0.h hVar2 = liVar3.z1;
                a0.h hVar3 = liVar3.x1;
                if (arrayList == null) {
                    if (prVar != null) {
                        hashMap.remove(prVar);
                        hVar3.l(prVar.a);
                        liVar3.getNotificationCenter().k(69, null, prVar);
                        return;
                    }
                    return;
                }
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    int intValue = ((Integer) arrayList.get(i18)).intValue();
                    long j10 = intValue;
                    pr prVar2 = (pr) hVar2.f(j10);
                    if (prVar2 != null) {
                        hashMap.remove(prVar2);
                        ArrayList arrayList2 = (ArrayList) hVar3.f(prVar2.a);
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
                                hVar3.l(prVar2.a);
                            }
                        }
                        hVar2.l(j10);
                        liVar3.getNotificationCenter().k(69, null, prVar2);
                    }
                }
                return;
            case 3:
                li liVar4 = (li) this.b;
                TLRPC.TL_emojiKeywordsDifference tL_emojiKeywordsDifference = (TLRPC.TL_emojiKeywordsDifference) this.d;
                String str2 = (String) this.c;
                try {
                    if (!tL_emojiKeywordsDifference.keywords.isEmpty()) {
                        SQLitePreparedStatement executeFast2 = liVar4.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_v2 VALUES(?, ?, ?)");
                        SQLitePreparedStatement executeFast3 = liVar4.getMessagesStorage().b.executeFast("DELETE FROM emoji_keywords_v2 WHERE lang = ? AND keyword = ? AND emoji = ?");
                        liVar4.getMessagesStorage().b.beginTransaction();
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
                        liVar4.getMessagesStorage().b.commitTransaction();
                        executeFast2.dispose();
                        executeFast3.dispose();
                    }
                    SQLitePreparedStatement executeFast4 = liVar4.getMessagesStorage().b.executeFast("REPLACE INTO emoji_keywords_info_v2 VALUES(?, ?, ?, ?)");
                    executeFast4.bindString(1, str2);
                    executeFast4.bindString(2, tL_emojiKeywordsDifference.lang_code);
                    executeFast4.bindInteger(3, tL_emojiKeywordsDifference.version);
                    executeFast4.bindLong(4, System.currentTimeMillis());
                    executeFast4.step();
                    executeFast4.dispose();
                    g0.h3(new ch(liVar4, str2, 3));
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 4:
                ((li) this.b).o2((TLRPC.Message) this.d, (String) this.c);
                return;
            case 5:
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.b;
                boolean[] zArr = (boolean[]) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var == null) {
                    return;
                }
                s1Var.setOnCancelListener(new wd(zArr, 2));
                d2Var.showDialog(s1VarArr[0]);
                return;
            case 6:
                ((hp) this.b).getNotificationCenter().k(hs.N2, (org.telegram.ui.ActionBar.j6) this.c, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 7:
                hp hpVar = (hp) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                a0.h hVar4 = hpVar.d8;
                if (tLObject2 instanceof Vector) {
                    ArrayList<T> arrayList4 = ((Vector) tLObject2).objects;
                    z10 = false;
                    for (int i23 = 0; i23 < Math.min(arrayList3.size(), arrayList4.size()); i23++) {
                        long longValue = ((Long) arrayList3.get(i23)).longValue();
                        if (arrayList4.get(i23) instanceof TL_account.RequirementToContact) {
                            TL_account.RequirementToContact requirementToContact = (TL_account.RequirementToContact) arrayList4.get(i23);
                            if (!l10.c((TL_account.RequirementToContact) hVar4.f(longValue), requirementToContact)) {
                                if (requirementToContact == null || (requirementToContact instanceof TL_account.requirementToContactEmpty)) {
                                    hVar4.l(longValue);
                                } else {
                                    hVar4.k(requirementToContact, longValue);
                                }
                                z10 = true;
                            }
                            TLRPC.UserFull b22 = hpVar.b2(longValue);
                            if (b22 != null && l10.a(b22, requirementToContact)) {
                                hpVar.getMessagesStorage().j2(b22, true);
                            } else if (b22 == null) {
                                qr messagesStorage = hpVar.getMessagesStorage();
                                messagesStorage.a.c(new a4(messagesStorage, longValue, requirementToContact, 20));
                            }
                            z10 = true;
                        }
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    hpVar.getNotificationCenter().k(hs.i3, new Object[0]);
                    return;
                }
                return;
            case 8:
                hp hpVar2 = (hp) this.b;
                long[] jArr = (long[]) this.c;
                TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) this.d;
                int i24 = (int) jArr[1];
                hpVar2.getSendMessagesHelper().d0(i24);
                hpVar2.getSendMessagesHelper().i0(i24, false);
                hs notificationCenter = hpVar2.getNotificationCenter();
                Integer valueOf = Integer.valueOf(i24);
                Integer valueOf2 = Integer.valueOf(tL_updateMessageID.id);
                Long valueOf3 = Long.valueOf(jArr[0]);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, null, valueOf3, 0L, -1, bool);
                hpVar2.getNotificationCenter().k(22, Integer.valueOf(i24), Integer.valueOf(tL_updateMessageID.id), null, Long.valueOf(jArr[0]), 0L, -1, bool);
                return;
            case 9:
                hp hpVar3 = (hp) this.b;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
                mo[] moVarArr = hpVar3.N;
                a0.h hVar5 = hpVar3.R;
                ArrayList arrayList5 = hpVar3.y;
                if (longSparseIntArray != null) {
                    int i25 = 0;
                    i10 = 0;
                    while (i25 < longSparseIntArray.size()) {
                        long keyAt = longSparseIntArray.keyAt(i25);
                        TLRPC.Dialog dialog = (TLRPC.Dialog) hVar5.f(keyAt);
                        if (dialog == null) {
                            int i26 = i17;
                            while (i26 < arrayList5.size()) {
                                i12 = i16;
                                i13 = i17;
                                if (((TLRPC.Dialog) arrayList5.get(i26)).id == keyAt) {
                                    hVar5.k((TLRPC.Dialog) arrayList5.get(i26), keyAt);
                                    dialog = (TLRPC.Dialog) arrayList5.get(i26);
                                    if (dialog == null) {
                                        boolean z11 = r2.a;
                                        hpVar3.b0.put(keyAt, longSparseIntArray.valueAt(i25));
                                    }
                                    if (dialog == null) {
                                        int i27 = dialog.unread_count;
                                        int valueAt = longSparseIntArray.valueAt(i25);
                                        dialog.unread_count = valueAt;
                                        boolean z12 = r2.a;
                                        if (i27 != 0 && valueAt == 0) {
                                            hpVar3.r2(keyAt, 0L, null);
                                            if (i10 == 0) {
                                                for (int i28 = i13; i28 < moVarArr.length; i28++) {
                                                    mo moVar = moVarArr[i28];
                                                    if (moVar != null && (moVar.g & 64) != 0) {
                                                        i10 = i12;
                                                    }
                                                }
                                            }
                                        } else if (i27 == 0 && !dialog.unread_mark && valueAt != 0) {
                                            hpVar3.r2(keyAt, 0L, null);
                                            if (i10 == 0) {
                                                for (int i29 = i13; i29 < moVarArr.length; i29++) {
                                                    mo moVar2 = moVarArr[i29];
                                                    if (moVar2 != null && (moVar2.g & 64) != 0) {
                                                        i10 = i12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i25++;
                                    i16 = i12;
                                    i17 = i13;
                                } else {
                                    i26++;
                                    i16 = i12;
                                    i17 = i13;
                                }
                            }
                        }
                        i12 = i16;
                        i13 = i17;
                        if (dialog == null) {
                        }
                        if (dialog == null) {
                        }
                        i25++;
                        i16 = i12;
                        i17 = i13;
                    }
                    i3 = i17;
                } else {
                    i3 = 0;
                    i10 = 0;
                }
                int i30 = i16;
                if (longSparseIntArray2 != null) {
                    for (int i31 = i3; i31 < longSparseIntArray2.size(); i31++) {
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar5.f(longSparseIntArray2.keyAt(i31));
                        if (dialog2 != null) {
                            dialog2.unread_mentions_count = longSparseIntArray2.valueAt(i31);
                            if (hpVar3.x0.contains(Long.valueOf(dialog2.id))) {
                                hs notificationCenter2 = hpVar3.getNotificationCenter();
                                Long valueOf4 = Long.valueOf(dialog2.id);
                                Integer valueOf5 = Integer.valueOf(dialog2.unread_mentions_count);
                                Object[] objArr = new Object[3];
                                objArr[i3] = valueOf4;
                                objArr[i30] = 0L;
                                objArr[2] = valueOf5;
                                notificationCenter2.k(93, objArr);
                            }
                            if (i10 == 0) {
                                for (int i32 = i3; i32 < moVarArr.length; i32++) {
                                    mo moVar3 = moVarArr[i32];
                                    if (moVar3 != null) {
                                        int i33 = moVar3.g;
                                        if ((i33 & 32) != 0 || (i33 & 64) != 0) {
                                            i10 = i30;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i10 != 0) {
                    hpVar3.T4(null);
                    i11 = i3;
                    hpVar3.getNotificationCenter().k(3, new Object[i11]);
                } else {
                    i11 = i3;
                }
                hs notificationCenter3 = hpVar3.getNotificationCenter();
                Object[] objArr2 = new Object[i30];
                objArr2[i11] = 256;
                notificationCenter3.k(2, objArr2);
                if (longSparseIntArray != null) {
                    hpVar3.getNotificationsController().J(longSparseIntArray);
                    return;
                }
                return;
            case 10:
                ((hp) this.b).getConnectionsManager().sendRequest((TLRPC.TL_channels_editAdmin) this.c, (gm) this.d);
                return;
            case 11:
                ((hp) this.b).getConnectionsManager().sendRequest((TLRPC.TL_messages_editChatAdmin) this.c, (ci.r3) this.d);
                return;
            case 12:
                hp hpVar4 = (hp) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.d;
                if (!arrayList6.isEmpty()) {
                    g0.h3(new hj(hpVar4, arrayList6, i15));
                }
                hpVar4.getMessagesStorage().j1(updates_channeldifference.new_messages, true, false, false, hpVar4.getDownloadController().l(), false, 0, 0L);
                return;
            case 13:
                ((hp) this.b).getNotificationsController().K((ArrayList) this.c, !(((TLRPC.updates_Difference) this.d) instanceof TLRPC.TL_updates_differenceSlice), false, null);
                return;
            case 14:
                hp hpVar5 = (hp) this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                chatFull.about = (String) this.c;
                hpVar5.getMessagesStorage().N1(chatFull, false);
                hs notificationCenter4 = hpVar5.getNotificationCenter();
                Boolean bool2 = Boolean.FALSE;
                notificationCenter4.k(30, chatFull, 0, bool2, bool2);
                return;
            case 15:
                bp bpVar = (bp) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList arrayList8 = bpVar.c;
                if (tLObject3 instanceof TLRPC.TL_savedMusic) {
                    TLRPC.TL_savedMusic tL_savedMusic = (TLRPC.TL_savedMusic) tLObject3;
                    if (bpVar.d <= 0 && arrayList8.size() == 1) {
                        if (((zi) arrayList8.get(0)).F0() == null || arrayList7.isEmpty() || ((zi) arrayList7.get(0)).F0() == null || ((zi) arrayList8.get(0)).F0().id != ((zi) arrayList7.get(0)).F0().id) {
                            arrayList8.clear();
                        } else {
                            arrayList7.remove(0);
                        }
                    }
                    bpVar.d = tL_savedMusic.count;
                    arrayList8.addAll(arrayList7);
                    bpVar.e = arrayList8.size() >= bpVar.d;
                }
                bpVar.f = false;
                hs.f(bpVar.a).k(hs.T3, bpVar);
                return;
            case 16:
                qr qrVar = (qr) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                tj tjVar = (tj) this.d;
                qrVar.getClass();
                int size4 = arrayList9.size();
                while (i17 < size4) {
                    Object obj = arrayList9.get(i17);
                    i17++;
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
                    long o10 = m5.o(ephemeralMessage.peer_id);
                    long o11 = m5.o(ephemeralMessage.from_id);
                    int i34 = ephemeralMessage.anchor_msg_id;
                    android.support.v4.media.c cVar2 = qrVar.e0;
                    int i35 = ephemeralMessage.id;
                    a0.h hVar6 = (a0.h) cVar2.b;
                    SparseIntArray sparseIntArray = (SparseIntArray) hVar6.f(o10);
                    if (sparseIntArray == null) {
                        sparseIntArray = new SparseIntArray();
                        hVar6.k(sparseIntArray, o10);
                    }
                    sparseIntArray.put(i34, i35);
                    TLRPC.Message c02 = qrVar.c0(o10, i34);
                    if (c02 != null) {
                        ephemeralMessage.peer_id = c02.peer_id;
                        ephemeralMessage.from_id = c02.from_id;
                        ephemeralMessage.out = c02.out;
                        if (o11 > 0) {
                            ephemeralMessage.via_bot_id = o11;
                        }
                    }
                }
                qrVar.g1(arrayList9, true);
                tjVar.run();
                return;
            case 17:
                qr qrVar2 = (qr) this.b;
                a0.h hVar7 = (a0.h) this.c;
                a0.h hVar8 = (a0.h) this.d;
                if (hVar7 != null) {
                    try {
                        int m10 = hVar7.m();
                        for (int i36 = 0; i36 < m10; i36++) {
                            SQLiteDatabase sQLiteDatabase = qrVar2.b;
                            Locale locale = Locale.US;
                            sQLiteDatabase.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) hVar7.n(i36)) + ") AND uid = " + hVar7.j(i36) + " AND media = 0").stepThis().dispose();
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                        sQLiteCursor = null;
                        try {
                            qrVar2.o(e10, true);
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
                    for (int i37 = 0; i37 < m11; i37++) {
                        SQLiteDatabase sQLiteDatabase2 = qrVar2.b;
                        Locale locale2 = Locale.US;
                        sQLiteDatabase2.executeFast("DELETE FROM enc_tasks_v4 WHERE mid IN(" + TextUtils.join(",", (Iterable) hVar8.n(i37)) + ") AND uid = " + hVar8.j(i37) + " AND media = 1").stepThis().dispose();
                    }
                }
                SQLiteCursor queryFinalized = qrVar2.b.queryFinalized("SELECT mid, date, media, uid FROM enc_tasks_v4 WHERE date = (SELECT min(date) FROM enc_tasks_v4)", new Object[0]);
                int i38 = 0;
                a0.h hVar9 = null;
                a0.h hVar10 = null;
                while (queryFinalized.next()) {
                    try {
                        int intValue2 = queryFinalized.intValue(0);
                        i38 = queryFinalized.intValue(1);
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
                        qrVar2.o(e10, true);
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
                hp messagesController = qrVar2.getMessagesController();
                messagesController.getClass();
                Utilities.d.c(new vf(messagesController, hVar9, hVar10, i38, 14));
                return;
            case 18:
                qr qrVar3 = (qr) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                String str3 = (String) this.c;
                qrVar3.getClass();
                try {
                    int currentTime = qrVar3.getConnectionsManager().getCurrentTime();
                    try {
                        if (!(tLObject4 instanceof TLRPC.TL_messages_botCallbackAnswer)) {
                            if (tLObject4 instanceof TLRPC.TL_messages_botResults) {
                                i14 = ((TLRPC.TL_messages_botResults) tLObject4).cache_time;
                            }
                            executeFast = qrVar3.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
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
                        i14 = ((TLRPC.TL_messages_botCallbackAnswer) tLObject4).cache_time;
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tLObject4.getObjectSize());
                        tLObject4.serializeToStream(nativeByteBuffer2);
                        executeFast.bindString(1, str3);
                        executeFast.bindInteger(2, currentTime);
                        executeFast.bindByteBuffer(3, nativeByteBuffer2);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer2.reuse();
                        return;
                    } catch (Exception e14) {
                        e = e14;
                        sQLitePreparedStatement = executeFast;
                        try {
                            qrVar3.o(e, true);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        sQLitePreparedStatement = executeFast;
                        if (sQLitePreparedStatement != null) {
                        }
                        throw th;
                    }
                    currentTime += i14;
                    executeFast = qrVar3.b.executeFast("REPLACE INTO botcache VALUES(?, ?, ?)");
                } catch (Exception e15) {
                    e = e15;
                    sQLitePreparedStatement = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement = null;
                }
            case 19:
                a();
                return;
            case 20:
                ((qr) this.b).getNotificationCenter().k(49, Long.valueOf(zi.B0(((zi) this.c).k)), (ArrayList) this.d);
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                e();
                return;
            case 24:
                f();
                return;
            case 25:
                vv vvVar = (vv) this.b;
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
                TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) this.d;
                if (encryptedChat != null) {
                    vvVar.getMessagesController().U3(encryptedChat2, false);
                }
                vvVar.getMessagesStorage().V1(encryptedChat2);
                vvVar.getNotificationCenter().k(35, encryptedChat2);
                return;
            case 26:
                yy yyVar = (yy) this.b;
                String str4 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                yyVar.w.remove(str4);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                ((MediaBrowserService.Result) ((p1) this.d).b).sendResult(((oz) this.b).d((String) this.c));
                return;
        }
    }

    public /* synthetic */ dg(Object obj, Object obj2, String str, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = obj2;
        this.c = str;
    }
}
