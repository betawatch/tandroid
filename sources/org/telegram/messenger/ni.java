package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ni implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ sg.o0 f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ ui w;

    public ni(ui uiVar, int i10, long j10, int i11, long j11, int i12, sg.o0 o0Var, int i13, int i14, int i15, boolean z10, int i16) {
        this.w = uiVar;
        this.a = i10;
        this.b = j10;
        this.c = i11;
        this.d = j11;
        this.e = i12;
        this.f = o0Var;
        this.h = i13;
        this.n = i14;
        this.r = i15;
        this.s = i16;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_messages tL_messages_messages;
        ui uiVar;
        int i10;
        int i11;
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        long j11;
        ArrayList arrayList;
        int i17;
        ArrayList arrayList2;
        SQLiteDatabase R;
        boolean C;
        TLRPC.TL_messages_messages tL_messages_messages2;
        sg.o0 o0Var;
        long j12;
        int i18;
        int i19;
        long j13;
        int i20;
        SQLiteDatabase sQLiteDatabase;
        sg.o0 o0Var2;
        int i21;
        SQLiteCursor queryFinalized;
        boolean z10;
        boolean z11;
        int i22;
        TLRPC.TL_messages_messages tL_messages_messages3;
        long j14;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j15;
        String str;
        String str2;
        int i23;
        boolean z12;
        String str3;
        String str4;
        String str5;
        String str6;
        int i24;
        SQLiteCursor queryFinalized2;
        int i25;
        int i26;
        SQLiteCursor queryFinalized3;
        int i27;
        boolean z13;
        int i28;
        int i29;
        SQLiteCursor queryFinalized4;
        int i30;
        int i31;
        SQLiteCursor queryFinalized5;
        int i32;
        SQLiteCursor queryFinalized6;
        SQLiteCursor sQLiteCursor;
        int intValue;
        int i33;
        ni niVar = this;
        int i34 = niVar.a;
        int i35 = niVar.n;
        long j16 = niVar.b;
        ui uiVar2 = niVar.w;
        long e = uiVar2.getUserConfig().e();
        TLRPC.TL_messages_messages tL_messages_messages4 = new TLRPC.TL_messages_messages();
        boolean z14 = false;
        try {
            ArrayList arrayList5 = new ArrayList();
            try {
                arrayList = new ArrayList();
                i17 = i34 + 1;
                arrayList2 = arrayList5;
                R = uiVar2.getMessagesStorage().R();
                C = o5.C(j16);
                tL_messages_messages2 = tL_messages_messages4;
                o0Var = niVar.f;
                j12 = e;
                i18 = niVar.h;
                i19 = niVar.c;
                j13 = niVar.d;
                i20 = niVar.e;
            } catch (Exception e7) {
                e = e7;
                tL_messages_messages = tL_messages_messages4;
            } catch (Throwable th2) {
                th = th2;
                tL_messages_messages = tL_messages_messages4;
            }
            try {
                if (C) {
                    sQLiteDatabase = R;
                    o0Var2 = o0Var;
                    if (j13 == 0) {
                        i21 = i19;
                        if (i18 != 0) {
                            Locale locale = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND m.mid > " + i18 + " AND type = " + i20 + " ORDER BY m.mid ASC LIMIT " + i17, new Object[0]);
                        } else if (i21 != 0) {
                            Locale locale2 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND m.mid < " + i21 + " AND type = " + i20 + " ORDER BY m.mid DESC LIMIT " + i17, new Object[0]);
                        } else {
                            Locale locale3 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND type = " + i20 + " ORDER BY m.mid ASC LIMIT " + i17, new Object[0]);
                        }
                    } else if (i18 != 0) {
                        Locale locale4 = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND m.topic_id = " + j13 + " AND m.mid > " + i18 + " AND type = " + i20 + " ORDER BY m.mid ASC LIMIT " + i17, new Object[0]);
                        i21 = i19;
                    } else {
                        if (i19 != 0) {
                            Locale locale5 = Locale.US;
                            StringBuilder sb2 = new StringBuilder("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = ");
                            sb2.append(j16);
                            sb2.append(" AND m.topic_id = ");
                            sb2.append(j13);
                            sb2.append(" AND m.mid < ");
                            i22 = i19;
                            sb2.append(i22);
                            sb2.append(" AND type = ");
                            sb2.append(i20);
                            sb2.append(" ORDER BY m.mid DESC LIMIT ");
                            sb2.append(i17);
                            queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                        } else {
                            i22 = i19;
                            Locale locale6 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND m.topic_id = " + j13 + " AND type = " + i20 + " ORDER BY m.mid ASC LIMIT " + i17, new Object[0]);
                        }
                        i21 = i22;
                    }
                    z10 = false;
                    z11 = true;
                } else {
                    if (i19 == 0) {
                        str = " AND m.topic_id = ";
                        if (j13 != 0) {
                            Locale locale7 = Locale.US;
                            StringBuilder sb3 = new StringBuilder("SELECT start FROM media_holes_topics WHERE uid = ");
                            sb3.append(j16);
                            sb3.append(" AND topic_id = ");
                            sb3.append(j13);
                            str2 = " AND type = ";
                            sb3.append(str2);
                            sb3.append(i20);
                            sb3.append(" AND start IN (0, 1)");
                            i23 = i18;
                            queryFinalized5 = R.queryFinalized(sb3.toString(), new Object[0]);
                            i31 = 0;
                        } else {
                            str2 = " AND type = ";
                            i23 = i18;
                            Locale locale8 = Locale.US;
                            i31 = 0;
                            queryFinalized5 = R.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + j16 + str2 + i20 + " AND start IN (0, 1)", new Object[0]);
                        }
                        if (!queryFinalized5.next()) {
                            queryFinalized5.dispose();
                            if (j13 != 0) {
                                Locale locale9 = Locale.US;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + j16 + " AND topic_id = " + j13 + str2 + i20 + " AND mid > 0", new Object[0]);
                                i32 = 0;
                            } else {
                                Locale locale10 = Locale.US;
                                i32 = 0;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + j16 + str2 + i20 + " AND mid > 0", new Object[0]);
                            }
                            SQLiteCursor sQLiteCursor2 = queryFinalized6;
                            if (!sQLiteCursor2.next() || (intValue = sQLiteCursor2.intValue(i32)) == 0) {
                                sQLiteCursor = sQLiteCursor2;
                            } else {
                                SQLitePreparedStatement executeFast = j13 != 0 ? R.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : R.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                executeFast.requery();
                                executeFast.bindLong(1, j16);
                                if (j13 != 0) {
                                    executeFast.bindLong(2, j13);
                                    i33 = 3;
                                } else {
                                    i33 = 2;
                                }
                                executeFast.bindInteger(i33, i20);
                                sQLiteCursor = sQLiteCursor2;
                                executeFast.bindInteger(i33 + 1, 0);
                                executeFast.bindInteger(i33 + 2, intValue);
                                executeFast.step();
                                executeFast.dispose();
                            }
                            queryFinalized5 = sQLiteCursor;
                        } else if (queryFinalized5.intValue(i31) == 1) {
                            z12 = true;
                            queryFinalized5.dispose();
                        }
                        z12 = false;
                        queryFinalized5.dispose();
                    } else {
                        str = " AND m.topic_id = ";
                        str2 = " AND type = ";
                        i23 = i18;
                        z12 = false;
                    }
                    if (o0Var != null) {
                        str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                        str4 = "t.tag = " + (!TextUtils.isEmpty(o0Var.f) ? o0Var.f.hashCode() : o0Var.g) + " AND";
                    } else {
                        str3 = "";
                        str4 = "";
                    }
                    z11 = z12;
                    o0Var2 = o0Var;
                    if (i23 != 0) {
                        String str7 = str4;
                        if (j13 != 0) {
                            Locale locale11 = Locale.US;
                            StringBuilder sb4 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                            sb4.append(j16);
                            sb4.append(" AND topic_id = ");
                            sb4.append(j13);
                            sb4.append(str2);
                            sb4.append(i20);
                            sb4.append(" AND start <= ");
                            i28 = i23;
                            sb4.append(i28);
                            sb4.append(" ORDER BY end DESC LIMIT 1");
                            queryFinalized4 = R.queryFinalized(sb4.toString(), new Object[0]);
                            i29 = 0;
                        } else {
                            i28 = i23;
                            Locale locale12 = Locale.US;
                            i29 = 0;
                            queryFinalized4 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j16 + str2 + i20 + " AND start <= " + i28 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                        }
                        if (queryFinalized4.next()) {
                            queryFinalized4.intValue(i29);
                            i30 = queryFinalized4.intValue(1);
                        } else {
                            i30 = 0;
                        }
                        queryFinalized4.dispose();
                        if (j13 != 0) {
                            if (i30 > 1) {
                                Locale locale13 = Locale.US;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j16 + str + j13 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.mid >= " + i30 + " AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                z11 = false;
                                sQLiteDatabase = R;
                            } else {
                                Locale locale14 = Locale.US;
                                R = R;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j16 + str + j13 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                sQLiteDatabase = R;
                            }
                        } else if (i30 > 1) {
                            Locale locale15 = Locale.US;
                            R = R;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j16 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.mid >= " + i30 + " AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                            z11 = false;
                            sQLiteDatabase = R;
                        } else {
                            R = R;
                            Locale locale16 = Locale.US;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j16 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                            sQLiteDatabase = R;
                        }
                    } else {
                        String str8 = str4;
                        if (i19 != 0) {
                            if (j13 != 0) {
                                Locale locale17 = Locale.US;
                                StringBuilder sb5 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                                sb5.append(j16);
                                sb5.append(" AND topic_id = ");
                                sb5.append(j13);
                                sb5.append(str2);
                                sb5.append(i20);
                                sb5.append(" AND end >= ");
                                i25 = i19;
                                sb5.append(i25);
                                sb5.append(" ORDER BY end ASC LIMIT 1");
                                queryFinalized3 = R.queryFinalized(sb5.toString(), new Object[0]);
                                i26 = 0;
                            } else {
                                i25 = i19;
                                Locale locale18 = Locale.US;
                                i26 = 0;
                                queryFinalized3 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j16 + str2 + i20 + " AND end >= " + i25 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                            }
                            if (queryFinalized3.next()) {
                                i27 = queryFinalized3.intValue(i26);
                                queryFinalized3.intValue(1);
                            } else {
                                i27 = 0;
                            }
                            queryFinalized3.dispose();
                            if (j13 == 0) {
                                int i36 = i27;
                                if (i36 > 1) {
                                    Locale locale19 = Locale.US;
                                    sQLiteDatabase = R;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.mid <= " + i36 + " AND m.type = " + i20 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i17, new Object[0]);
                                    i19 = i25;
                                    z13 = true;
                                    z10 = z13;
                                    i21 = i19;
                                } else {
                                    sQLiteDatabase = R;
                                    Locale locale20 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.type = " + i20 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i17, new Object[0]);
                                    z11 = true;
                                    i19 = i25;
                                    z13 = true;
                                    z10 = z13;
                                    i21 = i19;
                                }
                            } else if (i27 > 1) {
                                Locale locale21 = Locale.US;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + str + j13 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.mid <= " + i27 + " AND m.type = " + i20 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i17, new Object[0]);
                                sQLiteDatabase = R;
                                i19 = i25;
                                z13 = true;
                                z10 = z13;
                                i21 = i19;
                            } else {
                                Locale locale22 = Locale.US;
                                sQLiteDatabase = R;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + str + j13 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.type = " + i20 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i17, new Object[0]);
                                z11 = true;
                                i19 = i25;
                                z13 = true;
                                z10 = z13;
                                i21 = i19;
                            }
                        } else {
                            sQLiteDatabase = R;
                            String str9 = str;
                            if (j13 != 0) {
                                Locale locale23 = Locale.US;
                                str5 = " AND m.type = ";
                                str6 = str9;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_topics WHERE uid = " + j16 + " AND topic_id = " + j13 + str2 + i20, new Object[0]);
                                i24 = 0;
                            } else {
                                str5 = " AND m.type = ";
                                str6 = str9;
                                Locale locale24 = Locale.US;
                                i24 = 0;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + j16 + str2 + i20, new Object[0]);
                            }
                            int intValue2 = queryFinalized2.next() ? queryFinalized2.intValue(i24) : 0;
                            queryFinalized2.dispose();
                            if (j13 == 0) {
                                String str10 = str5;
                                if (intValue2 > 1) {
                                    Locale locale25 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + " AND m.mid >= " + intValue2 + str10 + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                } else {
                                    Locale locale26 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + " AND m.mid > 0 AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                }
                            } else if (intValue2 > 1) {
                                Locale locale27 = Locale.US;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + str6 + j13 + " AND m.mid >= " + intValue2 + str5 + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                            } else {
                                Locale locale28 = Locale.US;
                                sQLiteDatabase = sQLiteDatabase;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + str6 + j13 + " AND m.mid > 0 AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                            }
                        }
                    }
                    z13 = false;
                    z10 = z13;
                    i21 = i19;
                }
                HashSet hashSet = o0Var2 != null ? new HashSet() : null;
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            j15 = j12;
                            TLdeserialize.readAttachPath(byteBufferValue, j15);
                            byteBufferValue.reuse();
                            TLdeserialize.id = queryFinalized.intValue(1);
                            TLdeserialize.dialog_id = j16;
                            if (o5.C(j16)) {
                                TLdeserialize.random_id = queryFinalized.longValue(2);
                            }
                            long j17 = TLdeserialize.grouped_id;
                            if (j17 != 0 && hashSet != null) {
                                hashSet.add(Long.valueOf(j17));
                            }
                            if (z10) {
                                tL_messages_messages3 = tL_messages_messages2;
                                try {
                                    tL_messages_messages3.messages.add(0, TLdeserialize);
                                } catch (Exception e10) {
                                    e = e10;
                                    niVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    uiVar = uiVar2;
                                    i35 = i35;
                                    try {
                                        tL_messages_messages.messages.clear();
                                        tL_messages_messages.chats.clear();
                                        tL_messages_messages.users.clear();
                                        f8.f(e);
                                        i0.g3(new o7(niVar, niVar, i35, 11));
                                        int i37 = niVar.n;
                                        int i38 = niVar.s;
                                        j11 = niVar.b;
                                        i11 = i37;
                                        i10 = i38;
                                        i16 = niVar.a;
                                        i15 = niVar.h;
                                        i14 = niVar.c;
                                        i13 = niVar.e;
                                        j10 = niVar.d;
                                        i12 = niVar.r;
                                        uiVar.u1(tL_messages_messages, j11, i16, i15, i14, i13, j10, i12, i11, z14, i10);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i0.g3(new o7(niVar, niVar, i35, 11));
                                        uiVar.u1(tL_messages_messages, niVar.b, niVar.a, niVar.h, niVar.c, niVar.e, niVar.d, niVar.r, niVar.n, false, niVar.s);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    niVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    uiVar = uiVar2;
                                    i35 = i35;
                                    i0.g3(new o7(niVar, niVar, i35, 11));
                                    uiVar.u1(tL_messages_messages, niVar.b, niVar.a, niVar.h, niVar.c, niVar.e, niVar.d, niVar.r, niVar.n, false, niVar.s);
                                    throw th;
                                }
                            } else {
                                tL_messages_messages3 = tL_messages_messages2;
                                tL_messages_messages3.messages.add(TLdeserialize);
                            }
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            hs.e(TLdeserialize, arrayList4, arrayList3, null);
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            tL_messages_messages3 = tL_messages_messages2;
                            j15 = j12;
                        }
                        tL_messages_messages2 = tL_messages_messages3;
                        j12 = j15;
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                    } catch (Exception e11) {
                        e = e11;
                        tL_messages_messages3 = tL_messages_messages2;
                        niVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        uiVar = uiVar2;
                        i35 = i35;
                        tL_messages_messages.messages.clear();
                        tL_messages_messages.chats.clear();
                        tL_messages_messages.users.clear();
                        f8.f(e);
                        i0.g3(new o7(niVar, niVar, i35, 11));
                        int i372 = niVar.n;
                        int i382 = niVar.s;
                        j11 = niVar.b;
                        i11 = i372;
                        i10 = i382;
                        i16 = niVar.a;
                        i15 = niVar.h;
                        i14 = niVar.c;
                        i13 = niVar.e;
                        j10 = niVar.d;
                        i12 = niVar.r;
                        uiVar.u1(tL_messages_messages, j11, i16, i15, i14, i13, j10, i12, i11, z14, i10);
                    } catch (Throwable th5) {
                        th = th5;
                        tL_messages_messages3 = tL_messages_messages2;
                        niVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        uiVar = uiVar2;
                        i35 = i35;
                        i0.g3(new o7(niVar, niVar, i35, 11));
                        uiVar.u1(tL_messages_messages, niVar.b, niVar.a, niVar.h, niVar.c, niVar.e, niVar.d, niVar.r, niVar.n, false, niVar.s);
                        throw th;
                    }
                }
                ArrayList arrayList6 = arrayList;
                ArrayList arrayList7 = arrayList2;
                tL_messages_messages3 = tL_messages_messages2;
                long j18 = j12;
                queryFinalized.dispose();
                if (o0Var2 != null && !hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l4 = (Long) it.next();
                        long longValue = l4.longValue();
                        int i39 = 0;
                        while (true) {
                            if (i39 >= tL_messages_messages3.messages.size()) {
                                j14 = j16;
                                i39 = -1;
                                break;
                            } else {
                                j14 = j16;
                                if (tL_messages_messages3.messages.get(i39).grouped_id == longValue) {
                                    break;
                                }
                                i39++;
                                j16 = j14;
                            }
                        }
                        if (i39 < 0) {
                            j16 = j14;
                        } else {
                            SQLiteCursor queryFinalized7 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(j14), l4);
                            ArrayList arrayList8 = new ArrayList();
                            while (queryFinalized7.next()) {
                                int intValue3 = queryFinalized7.intValue(1);
                                NativeByteBuffer byteBufferValue2 = queryFinalized7.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    Iterator it2 = it;
                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize2.readAttachPath(byteBufferValue2, j18);
                                    byteBufferValue2.reuse();
                                    TLdeserialize2.id = intValue3;
                                    long j19 = j14;
                                    TLdeserialize2.dialog_id = j19;
                                    arrayList8.add(TLdeserialize2);
                                    hs.e(TLdeserialize2, arrayList7, arrayList6, null);
                                    j14 = j19;
                                    it = it2;
                                }
                            }
                            Iterator it3 = it;
                            long j20 = j14;
                            if (z10) {
                                Collections.reverse(arrayList8);
                            }
                            tL_messages_messages3.messages.remove(i39);
                            tL_messages_messages3.messages.addAll(i39, arrayList8);
                            queryFinalized7.dispose();
                            j16 = j20;
                            it = it3;
                        }
                    }
                }
                if (!arrayList7.isEmpty()) {
                    uiVar2.getMessagesStorage().m0(arrayList7, tL_messages_messages3.users);
                }
                if (!arrayList6.isEmpty()) {
                    uiVar2.getMessagesStorage().Q(TextUtils.join(",", arrayList6), tL_messages_messages3.chats);
                }
                if (tL_messages_messages3.messages.size() <= i34 || i21 != 0) {
                    z14 = i21 != 0 ? false : z11;
                } else {
                    tL_messages_messages3.messages.remove(r0.size() - 1);
                }
                i0.g3(new o7(this, this, i35, 11));
                int i40 = this.n;
                int i41 = this.s;
                j11 = this.b;
                int i42 = this.a;
                i11 = i40;
                i10 = i41;
                i15 = this.h;
                i14 = this.c;
                tL_messages_messages = tL_messages_messages3;
                i13 = this.e;
                j10 = this.d;
                i12 = this.r;
                uiVar = uiVar2;
                i16 = i42;
            } catch (Exception e12) {
                e = e12;
                niVar = this;
                uiVar = uiVar2;
                i35 = i35;
                tL_messages_messages = tL_messages_messages2;
                tL_messages_messages.messages.clear();
                tL_messages_messages.chats.clear();
                tL_messages_messages.users.clear();
                f8.f(e);
                i0.g3(new o7(niVar, niVar, i35, 11));
                int i3722 = niVar.n;
                int i3822 = niVar.s;
                j11 = niVar.b;
                i11 = i3722;
                i10 = i3822;
                i16 = niVar.a;
                i15 = niVar.h;
                i14 = niVar.c;
                i13 = niVar.e;
                j10 = niVar.d;
                i12 = niVar.r;
                uiVar.u1(tL_messages_messages, j11, i16, i15, i14, i13, j10, i12, i11, z14, i10);
            } catch (Throwable th6) {
                th = th6;
                niVar = this;
                uiVar = uiVar2;
                i35 = i35;
                tL_messages_messages = tL_messages_messages2;
                i0.g3(new o7(niVar, niVar, i35, 11));
                uiVar.u1(tL_messages_messages, niVar.b, niVar.a, niVar.h, niVar.c, niVar.e, niVar.d, niVar.r, niVar.n, false, niVar.s);
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            tL_messages_messages = tL_messages_messages4;
            uiVar = uiVar2;
        } catch (Throwable th7) {
            th = th7;
            tL_messages_messages = tL_messages_messages4;
            uiVar = uiVar2;
        }
        uiVar.u1(tL_messages_messages, j11, i16, i15, i14, i13, j10, i12, i11, z14, i10);
    }
}
