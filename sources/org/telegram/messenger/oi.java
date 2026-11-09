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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class oi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ch.o0 f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ ui w;

    public oi(ui uiVar, int i7, long j3, int i10, long j10, int i11, ch.o0 o0Var, int i12, int i13, int i14, boolean z9, int i15) {
        this.w = uiVar;
        this.a = i7;
        this.b = j3;
        this.c = i10;
        this.d = j10;
        this.e = i11;
        this.f = o0Var;
        this.h = i12;
        this.n = i13;
        this.r = i14;
        this.s = i15;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_messages tL_messages_messages;
        ui uiVar;
        int i7;
        int i10;
        int i11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        ArrayList arrayList;
        int i16;
        ArrayList arrayList2;
        SQLiteDatabase R;
        boolean C;
        TLRPC.TL_messages_messages tL_messages_messages2;
        ch.o0 o0Var;
        long j11;
        int i17;
        int i18;
        long j12;
        int i19;
        SQLiteDatabase sQLiteDatabase;
        ch.o0 o0Var2;
        int i20;
        SQLiteCursor queryFinalized;
        boolean z9;
        boolean z10;
        int i21;
        TLRPC.TL_messages_messages tL_messages_messages3;
        long j13;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j14;
        String str;
        String str2;
        int i22;
        boolean z11;
        String str3;
        String str4;
        String str5;
        String str6;
        int i23;
        SQLiteCursor queryFinalized2;
        int i24;
        int i25;
        SQLiteCursor queryFinalized3;
        int i26;
        boolean z12;
        int i27;
        int i28;
        SQLiteCursor queryFinalized4;
        int i29;
        int i30;
        SQLiteCursor queryFinalized5;
        int i31;
        SQLiteCursor queryFinalized6;
        SQLiteCursor sQLiteCursor;
        int intValue;
        int i32;
        oi oiVar = this;
        int i33 = oiVar.a;
        int i34 = oiVar.n;
        long j15 = oiVar.b;
        ui uiVar2 = oiVar.w;
        long e10 = uiVar2.getUserConfig().e();
        TLRPC.TL_messages_messages tL_messages_messages4 = new TLRPC.TL_messages_messages();
        boolean z13 = false;
        try {
            ArrayList arrayList5 = new ArrayList();
            try {
                arrayList = new ArrayList();
                i16 = i33 + 1;
                arrayList2 = arrayList5;
                R = uiVar2.getMessagesStorage().R();
                C = m5.C(j15);
                tL_messages_messages2 = tL_messages_messages4;
                o0Var = oiVar.f;
                j11 = e10;
                i17 = oiVar.h;
                i18 = oiVar.c;
                j12 = oiVar.d;
                i19 = oiVar.e;
            } catch (Exception e11) {
                e = e11;
                tL_messages_messages = tL_messages_messages4;
            } catch (Throwable th2) {
                th = th2;
                tL_messages_messages = tL_messages_messages4;
            }
            try {
                if (C) {
                    sQLiteDatabase = R;
                    o0Var2 = o0Var;
                    if (j12 == 0) {
                        i20 = i18;
                        if (i17 != 0) {
                            Locale locale = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j15 + " AND m.mid > " + i17 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                        } else if (i20 != 0) {
                            Locale locale2 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j15 + " AND m.mid < " + i20 + " AND type = " + i19 + " ORDER BY m.mid DESC LIMIT " + i16, new Object[0]);
                        } else {
                            Locale locale3 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j15 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                        }
                    } else if (i17 != 0) {
                        Locale locale4 = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j15 + " AND m.topic_id = " + j12 + " AND m.mid > " + i17 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                        i20 = i18;
                    } else {
                        if (i18 != 0) {
                            Locale locale5 = Locale.US;
                            StringBuilder sb2 = new StringBuilder("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = ");
                            sb2.append(j15);
                            sb2.append(" AND m.topic_id = ");
                            sb2.append(j12);
                            sb2.append(" AND m.mid < ");
                            i21 = i18;
                            sb2.append(i21);
                            sb2.append(" AND type = ");
                            sb2.append(i19);
                            sb2.append(" ORDER BY m.mid DESC LIMIT ");
                            sb2.append(i16);
                            queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                        } else {
                            i21 = i18;
                            Locale locale6 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j15 + " AND m.topic_id = " + j12 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                        }
                        i20 = i21;
                    }
                    z9 = false;
                    z10 = true;
                } else {
                    if (i18 == 0) {
                        str = " AND m.topic_id = ";
                        if (j12 != 0) {
                            Locale locale7 = Locale.US;
                            StringBuilder sb3 = new StringBuilder("SELECT start FROM media_holes_topics WHERE uid = ");
                            sb3.append(j15);
                            sb3.append(" AND topic_id = ");
                            sb3.append(j12);
                            str2 = " AND type = ";
                            sb3.append(str2);
                            sb3.append(i19);
                            sb3.append(" AND start IN (0, 1)");
                            i22 = i17;
                            queryFinalized5 = R.queryFinalized(sb3.toString(), new Object[0]);
                            i30 = 0;
                        } else {
                            str2 = " AND type = ";
                            i22 = i17;
                            Locale locale8 = Locale.US;
                            i30 = 0;
                            queryFinalized5 = R.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + j15 + str2 + i19 + " AND start IN (0, 1)", new Object[0]);
                        }
                        if (!queryFinalized5.next()) {
                            queryFinalized5.dispose();
                            if (j12 != 0) {
                                Locale locale9 = Locale.US;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + j15 + " AND topic_id = " + j12 + str2 + i19 + " AND mid > 0", new Object[0]);
                                i31 = 0;
                            } else {
                                Locale locale10 = Locale.US;
                                i31 = 0;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + j15 + str2 + i19 + " AND mid > 0", new Object[0]);
                            }
                            SQLiteCursor sQLiteCursor2 = queryFinalized6;
                            if (!sQLiteCursor2.next() || (intValue = sQLiteCursor2.intValue(i31)) == 0) {
                                sQLiteCursor = sQLiteCursor2;
                            } else {
                                SQLitePreparedStatement executeFast = j12 != 0 ? R.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : R.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                executeFast.requery();
                                executeFast.bindLong(1, j15);
                                if (j12 != 0) {
                                    executeFast.bindLong(2, j12);
                                    i32 = 3;
                                } else {
                                    i32 = 2;
                                }
                                executeFast.bindInteger(i32, i19);
                                sQLiteCursor = sQLiteCursor2;
                                executeFast.bindInteger(i32 + 1, 0);
                                executeFast.bindInteger(i32 + 2, intValue);
                                executeFast.step();
                                executeFast.dispose();
                            }
                            queryFinalized5 = sQLiteCursor;
                        } else if (queryFinalized5.intValue(i30) == 1) {
                            z11 = true;
                            queryFinalized5.dispose();
                        }
                        z11 = false;
                        queryFinalized5.dispose();
                    } else {
                        str = " AND m.topic_id = ";
                        str2 = " AND type = ";
                        i22 = i17;
                        z11 = false;
                    }
                    if (o0Var != null) {
                        str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                        str4 = "t.tag = " + (!TextUtils.isEmpty(o0Var.f) ? o0Var.f.hashCode() : o0Var.g) + " AND";
                    } else {
                        str3 = "";
                        str4 = "";
                    }
                    z10 = z11;
                    o0Var2 = o0Var;
                    if (i22 != 0) {
                        String str7 = str4;
                        if (j12 != 0) {
                            Locale locale11 = Locale.US;
                            StringBuilder sb4 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                            sb4.append(j15);
                            sb4.append(" AND topic_id = ");
                            sb4.append(j12);
                            sb4.append(str2);
                            sb4.append(i19);
                            sb4.append(" AND start <= ");
                            i27 = i22;
                            sb4.append(i27);
                            sb4.append(" ORDER BY end DESC LIMIT 1");
                            queryFinalized4 = R.queryFinalized(sb4.toString(), new Object[0]);
                            i28 = 0;
                        } else {
                            i27 = i22;
                            Locale locale12 = Locale.US;
                            i28 = 0;
                            queryFinalized4 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j15 + str2 + i19 + " AND start <= " + i27 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                        }
                        if (queryFinalized4.next()) {
                            queryFinalized4.intValue(i28);
                            i29 = queryFinalized4.intValue(1);
                        } else {
                            i29 = 0;
                        }
                        queryFinalized4.dispose();
                        if (j12 != 0) {
                            if (i29 > 1) {
                                Locale locale13 = Locale.US;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j15 + str + j12 + " AND m.mid > 0 AND m.mid < " + i27 + " AND m.mid >= " + i29 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                z10 = false;
                                sQLiteDatabase = R;
                            } else {
                                Locale locale14 = Locale.US;
                                R = R;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j15 + str + j12 + " AND m.mid > 0 AND m.mid < " + i27 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                sQLiteDatabase = R;
                            }
                        } else if (i29 > 1) {
                            Locale locale15 = Locale.US;
                            R = R;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j15 + " AND m.mid > 0 AND m.mid < " + i27 + " AND m.mid >= " + i29 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                            z10 = false;
                            sQLiteDatabase = R;
                        } else {
                            R = R;
                            Locale locale16 = Locale.US;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j15 + " AND m.mid > 0 AND m.mid < " + i27 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                            sQLiteDatabase = R;
                        }
                    } else {
                        String str8 = str4;
                        if (i18 != 0) {
                            if (j12 != 0) {
                                Locale locale17 = Locale.US;
                                StringBuilder sb5 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                                sb5.append(j15);
                                sb5.append(" AND topic_id = ");
                                sb5.append(j12);
                                sb5.append(str2);
                                sb5.append(i19);
                                sb5.append(" AND end >= ");
                                i24 = i18;
                                sb5.append(i24);
                                sb5.append(" ORDER BY end ASC LIMIT 1");
                                queryFinalized3 = R.queryFinalized(sb5.toString(), new Object[0]);
                                i25 = 0;
                            } else {
                                i24 = i18;
                                Locale locale18 = Locale.US;
                                i25 = 0;
                                queryFinalized3 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j15 + str2 + i19 + " AND end >= " + i24 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                            }
                            if (queryFinalized3.next()) {
                                i26 = queryFinalized3.intValue(i25);
                                queryFinalized3.intValue(1);
                            } else {
                                i26 = 0;
                            }
                            queryFinalized3.dispose();
                            if (j12 == 0) {
                                int i35 = i26;
                                if (i35 > 1) {
                                    Locale locale19 = Locale.US;
                                    sQLiteDatabase = R;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j15 + " AND m.mid > 0 AND m.mid >= " + i24 + " AND m.mid <= " + i35 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    i18 = i24;
                                    z12 = true;
                                    z9 = z12;
                                    i20 = i18;
                                } else {
                                    sQLiteDatabase = R;
                                    Locale locale20 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j15 + " AND m.mid > 0 AND m.mid >= " + i24 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    z10 = true;
                                    i18 = i24;
                                    z12 = true;
                                    z9 = z12;
                                    i20 = i18;
                                }
                            } else if (i26 > 1) {
                                Locale locale21 = Locale.US;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j15 + str + j12 + " AND m.mid > 0 AND m.mid >= " + i24 + " AND m.mid <= " + i26 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                sQLiteDatabase = R;
                                i18 = i24;
                                z12 = true;
                                z9 = z12;
                                i20 = i18;
                            } else {
                                Locale locale22 = Locale.US;
                                sQLiteDatabase = R;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j15 + str + j12 + " AND m.mid > 0 AND m.mid >= " + i24 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                z10 = true;
                                i18 = i24;
                                z12 = true;
                                z9 = z12;
                                i20 = i18;
                            }
                        } else {
                            sQLiteDatabase = R;
                            String str9 = str;
                            if (j12 != 0) {
                                Locale locale23 = Locale.US;
                                str5 = " AND m.type = ";
                                str6 = str9;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_topics WHERE uid = " + j15 + " AND topic_id = " + j12 + str2 + i19, new Object[0]);
                                i23 = 0;
                            } else {
                                str5 = " AND m.type = ";
                                str6 = str9;
                                Locale locale24 = Locale.US;
                                i23 = 0;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + j15 + str2 + i19, new Object[0]);
                            }
                            int intValue2 = queryFinalized2.next() ? queryFinalized2.intValue(i23) : 0;
                            queryFinalized2.dispose();
                            if (j12 == 0) {
                                String str10 = str5;
                                if (intValue2 > 1) {
                                    Locale locale25 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j15 + " AND m.mid >= " + intValue2 + str10 + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                } else {
                                    Locale locale26 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j15 + " AND m.mid > 0 AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                }
                            } else if (intValue2 > 1) {
                                Locale locale27 = Locale.US;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j15 + str6 + j12 + " AND m.mid >= " + intValue2 + str5 + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                            } else {
                                Locale locale28 = Locale.US;
                                sQLiteDatabase = sQLiteDatabase;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j15 + str6 + j12 + " AND m.mid > 0 AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                            }
                        }
                    }
                    z12 = false;
                    z9 = z12;
                    i20 = i18;
                }
                HashSet hashSet = o0Var2 != null ? new HashSet() : null;
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            j14 = j11;
                            TLdeserialize.readAttachPath(byteBufferValue, j14);
                            byteBufferValue.reuse();
                            TLdeserialize.id = queryFinalized.intValue(1);
                            TLdeserialize.dialog_id = j15;
                            if (m5.C(j15)) {
                                TLdeserialize.random_id = queryFinalized.longValue(2);
                            }
                            long j16 = TLdeserialize.grouped_id;
                            if (j16 != 0 && hashSet != null) {
                                hashSet.add(Long.valueOf(j16));
                            }
                            if (z9) {
                                tL_messages_messages3 = tL_messages_messages2;
                                try {
                                    tL_messages_messages3.messages.add(0, TLdeserialize);
                                } catch (Exception e12) {
                                    e = e12;
                                    oiVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    uiVar = uiVar2;
                                    i34 = i34;
                                    try {
                                        tL_messages_messages.messages.clear();
                                        tL_messages_messages.chats.clear();
                                        tL_messages_messages.users.clear();
                                        a8.f(e);
                                        g0.h3(new l7(oiVar, oiVar, i34, 11));
                                        int i36 = oiVar.n;
                                        int i37 = oiVar.s;
                                        j10 = oiVar.b;
                                        i10 = i36;
                                        i7 = i37;
                                        i15 = oiVar.a;
                                        i14 = oiVar.h;
                                        i13 = oiVar.c;
                                        i12 = oiVar.e;
                                        j3 = oiVar.d;
                                        i11 = oiVar.r;
                                        uiVar.u1(tL_messages_messages, j10, i15, i14, i13, i12, j3, i11, i10, z13, i7);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        g0.h3(new l7(oiVar, oiVar, i34, 11));
                                        uiVar.u1(tL_messages_messages, oiVar.b, oiVar.a, oiVar.h, oiVar.c, oiVar.e, oiVar.d, oiVar.r, oiVar.n, false, oiVar.s);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    oiVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    uiVar = uiVar2;
                                    i34 = i34;
                                    g0.h3(new l7(oiVar, oiVar, i34, 11));
                                    uiVar.u1(tL_messages_messages, oiVar.b, oiVar.a, oiVar.h, oiVar.c, oiVar.e, oiVar.d, oiVar.r, oiVar.n, false, oiVar.s);
                                    throw th;
                                }
                            } else {
                                tL_messages_messages3 = tL_messages_messages2;
                                tL_messages_messages3.messages.add(TLdeserialize);
                            }
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            yr.e(TLdeserialize, arrayList4, arrayList3, null);
                        } else {
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            tL_messages_messages3 = tL_messages_messages2;
                            j14 = j11;
                        }
                        tL_messages_messages2 = tL_messages_messages3;
                        j11 = j14;
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                    } catch (Exception e13) {
                        e = e13;
                        tL_messages_messages3 = tL_messages_messages2;
                        oiVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        uiVar = uiVar2;
                        i34 = i34;
                        tL_messages_messages.messages.clear();
                        tL_messages_messages.chats.clear();
                        tL_messages_messages.users.clear();
                        a8.f(e);
                        g0.h3(new l7(oiVar, oiVar, i34, 11));
                        int i362 = oiVar.n;
                        int i372 = oiVar.s;
                        j10 = oiVar.b;
                        i10 = i362;
                        i7 = i372;
                        i15 = oiVar.a;
                        i14 = oiVar.h;
                        i13 = oiVar.c;
                        i12 = oiVar.e;
                        j3 = oiVar.d;
                        i11 = oiVar.r;
                        uiVar.u1(tL_messages_messages, j10, i15, i14, i13, i12, j3, i11, i10, z13, i7);
                    } catch (Throwable th5) {
                        th = th5;
                        tL_messages_messages3 = tL_messages_messages2;
                        oiVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        uiVar = uiVar2;
                        i34 = i34;
                        g0.h3(new l7(oiVar, oiVar, i34, 11));
                        uiVar.u1(tL_messages_messages, oiVar.b, oiVar.a, oiVar.h, oiVar.c, oiVar.e, oiVar.d, oiVar.r, oiVar.n, false, oiVar.s);
                        throw th;
                    }
                }
                ArrayList arrayList6 = arrayList;
                ArrayList arrayList7 = arrayList2;
                tL_messages_messages3 = tL_messages_messages2;
                long j17 = j11;
                queryFinalized.dispose();
                if (o0Var2 != null && !hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        long longValue = l10.longValue();
                        int i38 = 0;
                        while (true) {
                            if (i38 >= tL_messages_messages3.messages.size()) {
                                j13 = j15;
                                i38 = -1;
                                break;
                            } else {
                                j13 = j15;
                                if (tL_messages_messages3.messages.get(i38).grouped_id == longValue) {
                                    break;
                                }
                                i38++;
                                j15 = j13;
                            }
                        }
                        if (i38 < 0) {
                            j15 = j13;
                        } else {
                            SQLiteCursor queryFinalized7 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(j13), l10);
                            ArrayList arrayList8 = new ArrayList();
                            while (queryFinalized7.next()) {
                                int intValue3 = queryFinalized7.intValue(1);
                                NativeByteBuffer byteBufferValue2 = queryFinalized7.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    Iterator it2 = it;
                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize2.readAttachPath(byteBufferValue2, j17);
                                    byteBufferValue2.reuse();
                                    TLdeserialize2.id = intValue3;
                                    long j18 = j13;
                                    TLdeserialize2.dialog_id = j18;
                                    arrayList8.add(TLdeserialize2);
                                    yr.e(TLdeserialize2, arrayList7, arrayList6, null);
                                    j13 = j18;
                                    it = it2;
                                }
                            }
                            Iterator it3 = it;
                            long j19 = j13;
                            if (z9) {
                                Collections.reverse(arrayList8);
                            }
                            tL_messages_messages3.messages.remove(i38);
                            tL_messages_messages3.messages.addAll(i38, arrayList8);
                            queryFinalized7.dispose();
                            j15 = j19;
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
                if (tL_messages_messages3.messages.size() <= i33 || i20 != 0) {
                    z13 = i20 != 0 ? false : z10;
                } else {
                    tL_messages_messages3.messages.remove(r0.size() - 1);
                }
                g0.h3(new l7(this, this, i34, 11));
                int i39 = this.n;
                int i40 = this.s;
                j10 = this.b;
                int i41 = this.a;
                i10 = i39;
                i7 = i40;
                i14 = this.h;
                i13 = this.c;
                tL_messages_messages = tL_messages_messages3;
                i12 = this.e;
                j3 = this.d;
                i11 = this.r;
                uiVar = uiVar2;
                i15 = i41;
            } catch (Exception e14) {
                e = e14;
                oiVar = this;
                uiVar = uiVar2;
                i34 = i34;
                tL_messages_messages = tL_messages_messages2;
                tL_messages_messages.messages.clear();
                tL_messages_messages.chats.clear();
                tL_messages_messages.users.clear();
                a8.f(e);
                g0.h3(new l7(oiVar, oiVar, i34, 11));
                int i3622 = oiVar.n;
                int i3722 = oiVar.s;
                j10 = oiVar.b;
                i10 = i3622;
                i7 = i3722;
                i15 = oiVar.a;
                i14 = oiVar.h;
                i13 = oiVar.c;
                i12 = oiVar.e;
                j3 = oiVar.d;
                i11 = oiVar.r;
                uiVar.u1(tL_messages_messages, j10, i15, i14, i13, i12, j3, i11, i10, z13, i7);
            } catch (Throwable th6) {
                th = th6;
                oiVar = this;
                uiVar = uiVar2;
                i34 = i34;
                tL_messages_messages = tL_messages_messages2;
                g0.h3(new l7(oiVar, oiVar, i34, 11));
                uiVar.u1(tL_messages_messages, oiVar.b, oiVar.a, oiVar.h, oiVar.c, oiVar.e, oiVar.d, oiVar.r, oiVar.n, false, oiVar.s);
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            tL_messages_messages = tL_messages_messages4;
            uiVar = uiVar2;
        } catch (Throwable th7) {
            th = th7;
            tL_messages_messages = tL_messages_messages4;
            uiVar = uiVar2;
        }
        uiVar.u1(tL_messages_messages, j10, i15, i14, i13, i12, j3, i11, i10, z13, i7);
    }
}
