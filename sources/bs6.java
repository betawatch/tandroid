// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bs6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ k39 f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ int s;
    public final /* synthetic */ hs6 w;

    /* JADX WARN: Multi-variable type inference failed */
    public bs6(hs6 hs6Var, int i, long j, int i2, long j2, int i3, k39 k39Var, int i4, int i5, int i6, boolean z, int i7) {
        this.w = hs6Var;
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = j2;
        this.e = i3;
        this.f = k39Var;
        this.h = i4;
        this.n = i5;
        this.r = i6;
        this.s = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_messages tL_messages_messages;
        hs6 hs6Var;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        byte b;
        long j2;
        ArrayList arrayList;
        int i7;
        ArrayList arrayList2;
        SQLiteDatabase sQLiteDatabase;
        boolean B;
        TLRPC.TL_messages_messages tL_messages_messages2;
        k39 k39Var;
        long j3;
        int i8;
        int i9;
        long j4;
        int i10;
        SQLiteDatabase sQLiteDatabase2;
        k39 k39Var2;
        int i11;
        SQLiteCursor queryFinalized;
        boolean z;
        boolean z2;
        int i12;
        TLRPC.TL_messages_messages tL_messages_messages3;
        long j5;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long j6;
        String str;
        String str2;
        int i13;
        boolean z3;
        String str3;
        String str4;
        String str5;
        String str6;
        int i14;
        SQLiteCursor queryFinalized2;
        int i15;
        int i16;
        SQLiteCursor queryFinalized3;
        int i17;
        boolean z4;
        int i18;
        int i19;
        SQLiteCursor queryFinalized4;
        int i20;
        int i21;
        SQLiteCursor queryFinalized5;
        int i22;
        SQLiteCursor queryFinalized6;
        SQLiteCursor sQLiteCursor;
        int intValue;
        int i23;
        bs6 bs6Var = this;
        byte b2 = bs6Var.a;
        int i24 = bs6Var.n;
        long j7 = bs6Var.b;
        hs6 hs6Var2 = bs6Var.w;
        long e = hs6Var2.getUserConfig().e();
        TLRPC.TL_messages_messages tL_messages_messages4 = new TLRPC.TL_messages_messages();
        boolean z5 = false;
        try {
            ArrayList arrayList5 = new ArrayList();
            try {
                arrayList = new ArrayList();
                i7 = b2 + 1;
                arrayList2 = arrayList5;
                sQLiteDatabase = hs6Var2.getMessagesStorage().b;
                B = pg3.B(j7);
                tL_messages_messages2 = tL_messages_messages4;
                k39Var = bs6Var.f;
                j3 = e;
                i8 = bs6Var.h;
                i9 = bs6Var.c;
                j4 = bs6Var.d;
                i10 = bs6Var.e;
            } catch (Exception e2) {
                e = e2;
                tL_messages_messages = tL_messages_messages4;
            } catch (Throwable th) {
                th = th;
                tL_messages_messages = tL_messages_messages4;
            }
        } catch (Exception e3) {
            e = e3;
            tL_messages_messages = tL_messages_messages4;
            hs6Var = hs6Var2;
        } catch (Throwable th2) {
            th = th2;
            tL_messages_messages = tL_messages_messages4;
            hs6Var = hs6Var2;
        }
        try {
            if (B) {
                sQLiteDatabase2 = sQLiteDatabase;
                k39Var2 = k39Var;
                if (j4 == 0) {
                    i11 = i9;
                    if (i8 != 0) {
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j7 + " AND m.mid > " + i8 + " AND type = " + i10 + " ORDER BY m.mid ASC LIMIT " + i7, new Object[0]);
                    } else if (i11 != 0) {
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j7 + " AND m.mid < " + i11 + " AND type = " + i10 + " ORDER BY m.mid DESC LIMIT " + i7, new Object[0]);
                    } else {
                        Locale locale3 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j7 + " AND type = " + i10 + " ORDER BY m.mid ASC LIMIT " + i7, new Object[0]);
                    }
                } else if (i8 != 0) {
                    Locale locale4 = Locale.US;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j7 + " AND m.topic_id = " + j4 + " AND m.mid > " + i8 + " AND type = " + i10 + " ORDER BY m.mid ASC LIMIT " + i7, new Object[0]);
                    i11 = i9;
                } else {
                    if (i9 != 0) {
                        Locale locale5 = Locale.US;
                        StringBuilder sb = new StringBuilder("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = ");
                        sb.append(j7);
                        sb.append(" AND m.topic_id = ");
                        sb.append(j4);
                        sb.append(" AND m.mid < ");
                        i12 = i9;
                        sb.append(i12);
                        sb.append(" AND type = ");
                        sb.append(i10);
                        sb.append(" ORDER BY m.mid DESC LIMIT ");
                        sb.append(i7);
                        queryFinalized = sQLiteDatabase2.queryFinalized(sb.toString(), new Object[0]);
                    } else {
                        i12 = i9;
                        Locale locale6 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j7 + " AND m.topic_id = " + j4 + " AND type = " + i10 + " ORDER BY m.mid ASC LIMIT " + i7, new Object[0]);
                    }
                    i11 = i12;
                }
                z = false;
                z2 = true;
            } else {
                if (i9 == 0) {
                    str = " AND m.topic_id = ";
                    if (j4 != 0) {
                        Locale locale7 = Locale.US;
                        StringBuilder sb2 = new StringBuilder("SELECT start FROM media_holes_topics WHERE uid = ");
                        sb2.append(j7);
                        sb2.append(" AND topic_id = ");
                        sb2.append(j4);
                        str2 = " AND type = ";
                        sb2.append(str2);
                        sb2.append(i10);
                        sb2.append(" AND start IN (0, 1)");
                        i13 = i8;
                        queryFinalized5 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                        i21 = 0;
                    } else {
                        str2 = " AND type = ";
                        i13 = i8;
                        Locale locale8 = Locale.US;
                        i21 = 0;
                        queryFinalized5 = sQLiteDatabase.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + j7 + str2 + i10 + " AND start IN (0, 1)", new Object[0]);
                    }
                    if (!queryFinalized5.next()) {
                        queryFinalized5.dispose();
                        if (j4 != 0) {
                            queryFinalized6 = sQLiteDatabase.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + j7 + " AND topic_id = " + j4 + str2 + i10 + " AND mid > 0", new Object[0]);
                            i22 = 0;
                        } else {
                            i22 = 0;
                            queryFinalized6 = sQLiteDatabase.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + j7 + str2 + i10 + " AND mid > 0", new Object[0]);
                        }
                        SQLiteCursor sQLiteCursor2 = queryFinalized6;
                        if (!sQLiteCursor2.next() || (intValue = sQLiteCursor2.intValue(i22)) == 0) {
                            sQLiteCursor = sQLiteCursor2;
                        } else {
                            SQLitePreparedStatement executeFast = j4 != 0 ? sQLiteDatabase.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : sQLiteDatabase.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                            executeFast.requery();
                            executeFast.bindLong(1, j7);
                            if (j4 != 0) {
                                executeFast.bindLong(2, j4);
                                i23 = 3;
                            } else {
                                i23 = 2;
                            }
                            executeFast.bindInteger(i23, i10);
                            sQLiteCursor = sQLiteCursor2;
                            executeFast.bindInteger(i23 + 1, 0);
                            executeFast.bindInteger(i23 + 2, intValue);
                            executeFast.step();
                            executeFast.dispose();
                        }
                        queryFinalized5 = sQLiteCursor;
                    } else if (queryFinalized5.intValue(i21) == 1) {
                        z3 = true;
                        queryFinalized5.dispose();
                    }
                    z3 = false;
                    queryFinalized5.dispose();
                } else {
                    str = " AND m.topic_id = ";
                    str2 = " AND type = ";
                    i13 = i8;
                    z3 = false;
                }
                if (k39Var != null) {
                    str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                    str4 = "t.tag = " + (!TextUtils.isEmpty(k39Var.f) ? k39Var.f.hashCode() : k39Var.g) + " AND";
                } else {
                    str3 = "";
                    str4 = "";
                }
                z2 = z3;
                k39Var2 = k39Var;
                if (i13 != 0) {
                    String str7 = str4;
                    if (j4 != 0) {
                        Locale locale9 = Locale.US;
                        StringBuilder sb3 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                        sb3.append(j7);
                        sb3.append(" AND topic_id = ");
                        sb3.append(j4);
                        sb3.append(str2);
                        sb3.append(i10);
                        sb3.append(" AND start <= ");
                        i18 = i13;
                        sb3.append(i18);
                        sb3.append(" ORDER BY end DESC LIMIT 1");
                        queryFinalized4 = sQLiteDatabase.queryFinalized(sb3.toString(), new Object[0]);
                        i19 = 0;
                    } else {
                        i18 = i13;
                        Locale locale10 = Locale.US;
                        i19 = 0;
                        queryFinalized4 = sQLiteDatabase.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j7 + str2 + i10 + " AND start <= " + i18 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                    }
                    if (queryFinalized4.next()) {
                        queryFinalized4.intValue(i19);
                        i20 = queryFinalized4.intValue(1);
                    } else {
                        i20 = 0;
                    }
                    queryFinalized4.dispose();
                    if (j4 != 0) {
                        if (i20 > 1) {
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j7 + str + j4 + " AND m.mid > 0 AND m.mid < " + i18 + " AND m.mid >= " + i20 + " AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            z2 = false;
                            sQLiteDatabase2 = sQLiteDatabase;
                        } else {
                            sQLiteDatabase = sQLiteDatabase;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j7 + str + j4 + " AND m.mid > 0 AND m.mid < " + i18 + " AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            sQLiteDatabase2 = sQLiteDatabase;
                        }
                    } else if (i20 > 1) {
                        sQLiteDatabase = sQLiteDatabase;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j7 + " AND m.mid > 0 AND m.mid < " + i18 + " AND m.mid >= " + i20 + " AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                        z2 = false;
                        sQLiteDatabase2 = sQLiteDatabase;
                    } else {
                        sQLiteDatabase = sQLiteDatabase;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j7 + " AND m.mid > 0 AND m.mid < " + i18 + " AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                        sQLiteDatabase2 = sQLiteDatabase;
                    }
                } else {
                    String str8 = str4;
                    if (i9 != 0) {
                        if (j4 != 0) {
                            Locale locale11 = Locale.US;
                            StringBuilder sb4 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                            sb4.append(j7);
                            sb4.append(" AND topic_id = ");
                            sb4.append(j4);
                            sb4.append(str2);
                            sb4.append(i10);
                            sb4.append(" AND end >= ");
                            i15 = i9;
                            sb4.append(i15);
                            sb4.append(" ORDER BY end ASC LIMIT 1");
                            queryFinalized3 = sQLiteDatabase.queryFinalized(sb4.toString(), new Object[0]);
                            i16 = 0;
                        } else {
                            i15 = i9;
                            Locale locale12 = Locale.US;
                            i16 = 0;
                            queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j7 + str2 + i10 + " AND end >= " + i15 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                        }
                        if (queryFinalized3.next()) {
                            i17 = queryFinalized3.intValue(i16);
                            queryFinalized3.intValue(1);
                        } else {
                            i17 = 0;
                        }
                        queryFinalized3.dispose();
                        if (j4 == 0) {
                            int i25 = i17;
                            if (i25 > 1) {
                                sQLiteDatabase2 = sQLiteDatabase;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j7 + " AND m.mid > 0 AND m.mid >= " + i15 + " AND m.mid <= " + i25 + " AND m.type = " + i10 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i7, new Object[0]);
                                i9 = i15;
                                z4 = true;
                                z = z4;
                                i11 = i9;
                            } else {
                                sQLiteDatabase2 = sQLiteDatabase;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j7 + " AND m.mid > 0 AND m.mid >= " + i15 + " AND m.type = " + i10 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i7, new Object[0]);
                                z2 = true;
                                i9 = i15;
                                z4 = true;
                                z = z4;
                                i11 = i9;
                            }
                        } else if (i17 > 1) {
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j7 + str + j4 + " AND m.mid > 0 AND m.mid >= " + i15 + " AND m.mid <= " + i17 + " AND m.type = " + i10 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i7, new Object[0]);
                            sQLiteDatabase2 = sQLiteDatabase;
                            i9 = i15;
                            z4 = true;
                            z = z4;
                            i11 = i9;
                        } else {
                            sQLiteDatabase2 = sQLiteDatabase;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j7 + str + j4 + " AND m.mid > 0 AND m.mid >= " + i15 + " AND m.type = " + i10 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i7, new Object[0]);
                            z2 = true;
                            i9 = i15;
                            z4 = true;
                            z = z4;
                            i11 = i9;
                        }
                    } else {
                        sQLiteDatabase2 = sQLiteDatabase;
                        String str9 = str;
                        if (j4 != 0) {
                            Locale locale13 = Locale.US;
                            str5 = " AND m.type = ";
                            str6 = str9;
                            queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT max(end) FROM media_holes_topics WHERE uid = " + j7 + " AND topic_id = " + j4 + str2 + i10, new Object[0]);
                            i14 = 0;
                        } else {
                            str5 = " AND m.type = ";
                            str6 = str9;
                            Locale locale14 = Locale.US;
                            i14 = 0;
                            queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + j7 + str2 + i10, new Object[0]);
                        }
                        int intValue2 = queryFinalized2.next() ? queryFinalized2.intValue(i14) : 0;
                        queryFinalized2.dispose();
                        if (j4 == 0) {
                            String str10 = str5;
                            if (intValue2 > 1) {
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j7 + " AND m.mid >= " + intValue2 + str10 + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            } else {
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j7 + " AND m.mid > 0 AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            }
                        } else if (intValue2 > 1) {
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j7 + str6 + j4 + " AND m.mid >= " + intValue2 + str5 + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                        } else {
                            sQLiteDatabase2 = sQLiteDatabase2;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j7 + str6 + j4 + " AND m.mid > 0 AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                        }
                    }
                }
                z4 = false;
                z = z4;
                i11 = i9;
            }
            HashSet hashSet = k39Var2 != null ? new HashSet() : null;
            while (queryFinalized.next()) {
                try {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        j6 = j3;
                        TLdeserialize.readAttachPath(byteBufferValue, j6);
                        byteBufferValue.reuse();
                        TLdeserialize.id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j7;
                        if (pg3.B(j7)) {
                            TLdeserialize.random_id = queryFinalized.longValue(2);
                        }
                        long j8 = TLdeserialize.grouped_id;
                        if (j8 != 0 && hashSet != null) {
                            hashSet.add(Long.valueOf(j8));
                        }
                        tL_messages_messages3 = tL_messages_messages2;
                        try {
                            ArrayList<TLRPC.Message> arrayList6 = tL_messages_messages3.messages;
                            if (z) {
                                arrayList6.add(0, TLdeserialize);
                            } else {
                                arrayList6.add(TLdeserialize);
                            }
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            cf7.d(TLdeserialize, arrayList4, arrayList3, null);
                        } catch (Exception e4) {
                            e = e4;
                            bs6Var = this;
                            tL_messages_messages = tL_messages_messages3;
                            hs6Var = hs6Var2;
                            i24 = i24;
                            try {
                                tL_messages_messages.messages.clear();
                                tL_messages_messages.chats.clear();
                                tL_messages_messages.users.clear();
                                fc4.f(e);
                                gm.c3(new h65(bs6Var, bs6Var, i24, (byte) 8));
                                int i26 = bs6Var.n;
                                int i27 = bs6Var.s;
                                j2 = bs6Var.b;
                                byte b3 = bs6Var.a;
                                int i28 = bs6Var.h;
                                int i29 = bs6Var.c;
                                int i30 = bs6Var.e;
                                long j9 = bs6Var.d;
                                i2 = i26;
                                i3 = bs6Var.r ? 1 : 0;
                                i = i27;
                                b = b3;
                                i6 = i28;
                                i5 = i29;
                                i4 = i30;
                                j = j9;
                                hs6Var.v1(tL_messages_messages, j2, b, i6, i5, i4, j, i3, i2, z5, i);
                            } catch (Throwable th3) {
                                th = th3;
                                gm.c3(new h65(bs6Var, bs6Var, i24, (byte) 8));
                                hs6Var.v1(tL_messages_messages, bs6Var.b, bs6Var.a, bs6Var.h, bs6Var.c, bs6Var.e, bs6Var.d, bs6Var.r ? 1 : 0, bs6Var.n, false, bs6Var.s);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bs6Var = this;
                            tL_messages_messages = tL_messages_messages3;
                            hs6Var = hs6Var2;
                            i24 = i24;
                            gm.c3(new h65(bs6Var, bs6Var, i24, (byte) 8));
                            hs6Var.v1(tL_messages_messages, bs6Var.b, bs6Var.a, bs6Var.h, bs6Var.c, bs6Var.e, bs6Var.d, bs6Var.r ? 1 : 0, bs6Var.n, false, bs6Var.s);
                            throw th;
                        }
                    } else {
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        tL_messages_messages3 = tL_messages_messages2;
                        j6 = j3;
                    }
                    tL_messages_messages2 = tL_messages_messages3;
                    j3 = j6;
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                } catch (Exception e5) {
                    e = e5;
                    tL_messages_messages3 = tL_messages_messages2;
                    bs6Var = this;
                    tL_messages_messages = tL_messages_messages3;
                    hs6Var = hs6Var2;
                    i24 = i24;
                    tL_messages_messages.messages.clear();
                    tL_messages_messages.chats.clear();
                    tL_messages_messages.users.clear();
                    fc4.f(e);
                    gm.c3(new h65(bs6Var, bs6Var, i24, (byte) 8));
                    int i262 = bs6Var.n;
                    int i272 = bs6Var.s;
                    j2 = bs6Var.b;
                    byte b32 = bs6Var.a;
                    int i282 = bs6Var.h;
                    int i292 = bs6Var.c;
                    int i302 = bs6Var.e;
                    long j92 = bs6Var.d;
                    i2 = i262;
                    i3 = bs6Var.r ? 1 : 0;
                    i = i272;
                    b = b32;
                    i6 = i282;
                    i5 = i292;
                    i4 = i302;
                    j = j92;
                    hs6Var.v1(tL_messages_messages, j2, b, i6, i5, i4, j, i3, i2, z5, i);
                } catch (Throwable th5) {
                    th = th5;
                    tL_messages_messages3 = tL_messages_messages2;
                    bs6Var = this;
                    tL_messages_messages = tL_messages_messages3;
                    hs6Var = hs6Var2;
                    i24 = i24;
                    gm.c3(new h65(bs6Var, bs6Var, i24, (byte) 8));
                    hs6Var.v1(tL_messages_messages, bs6Var.b, bs6Var.a, bs6Var.h, bs6Var.c, bs6Var.e, bs6Var.d, bs6Var.r ? 1 : 0, bs6Var.n, false, bs6Var.s);
                    throw th;
                }
            }
            ArrayList arrayList7 = arrayList;
            ArrayList arrayList8 = arrayList2;
            tL_messages_messages3 = tL_messages_messages2;
            long j10 = j3;
            queryFinalized.dispose();
            if (k39Var2 != null && !hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    long longValue = l.longValue();
                    int i31 = 0;
                    while (true) {
                        if (i31 >= tL_messages_messages3.messages.size()) {
                            j5 = j7;
                            i31 = -1;
                            break;
                        } else {
                            j5 = j7;
                            if (tL_messages_messages3.messages.get(i31).grouped_id == longValue) {
                                break;
                            }
                            i31++;
                            j7 = j5;
                        }
                    }
                    if (i31 < 0) {
                        j7 = j5;
                    } else {
                        SQLiteCursor queryFinalized7 = sQLiteDatabase2.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(j5), l);
                        ArrayList arrayList9 = new ArrayList();
                        while (queryFinalized7.next()) {
                            int intValue3 = queryFinalized7.intValue(1);
                            NativeByteBuffer byteBufferValue2 = queryFinalized7.byteBufferValue(0);
                            if (byteBufferValue2 != null) {
                                Iterator it2 = it;
                                TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                TLdeserialize2.readAttachPath(byteBufferValue2, j10);
                                byteBufferValue2.reuse();
                                TLdeserialize2.id = intValue3;
                                long j11 = j5;
                                TLdeserialize2.dialog_id = j11;
                                arrayList9.add(TLdeserialize2);
                                cf7.d(TLdeserialize2, arrayList8, arrayList7, null);
                                j5 = j11;
                                it = it2;
                            }
                        }
                        Iterator it3 = it;
                        long j12 = j5;
                        if (z) {
                            Collections.reverse(arrayList9);
                        }
                        tL_messages_messages3.messages.remove(i31);
                        tL_messages_messages3.messages.addAll(i31, arrayList9);
                        queryFinalized7.dispose();
                        j7 = j12;
                        it = it3;
                    }
                }
            }
            if (!arrayList8.isEmpty()) {
                hs6Var2.getMessagesStorage().j0(arrayList8, tL_messages_messages3.users);
            }
            if (!arrayList7.isEmpty()) {
                hs6Var2.getMessagesStorage().P(TextUtils.join(",", arrayList7), tL_messages_messages3.chats);
            }
            if (tL_messages_messages3.messages.size() <= b2 || i11 != 0) {
                z5 = i11 != 0 ? false : z2;
            } else {
                tL_messages_messages3.messages.remove(r0.size() - 1);
            }
            gm.c3(new h65(this, this, i24, (byte) 8));
            int i32 = this.n;
            int i33 = this.s;
            j2 = this.b;
            byte b4 = this.a;
            int i34 = this.h;
            int i35 = this.c;
            int i36 = this.e;
            long j13 = this.d;
            i2 = i32;
            i3 = this.r ? 1 : 0;
            i = i33;
            i6 = i34;
            i5 = i35;
            tL_messages_messages = tL_messages_messages3;
            i4 = i36;
            j = j13;
            hs6Var = hs6Var2;
            b = b4;
        } catch (Exception e6) {
            e = e6;
            bs6Var = this;
            hs6Var = hs6Var2;
            i24 = i24;
            tL_messages_messages = tL_messages_messages2;
            tL_messages_messages.messages.clear();
            tL_messages_messages.chats.clear();
            tL_messages_messages.users.clear();
            fc4.f(e);
            gm.c3(new h65(bs6Var, bs6Var, i24, (byte) 8));
            int i2622 = bs6Var.n;
            int i2722 = bs6Var.s;
            j2 = bs6Var.b;
            byte b322 = bs6Var.a;
            int i2822 = bs6Var.h;
            int i2922 = bs6Var.c;
            int i3022 = bs6Var.e;
            long j922 = bs6Var.d;
            i2 = i2622;
            i3 = bs6Var.r ? 1 : 0;
            i = i2722;
            b = b322;
            i6 = i2822;
            i5 = i2922;
            i4 = i3022;
            j = j922;
            hs6Var.v1(tL_messages_messages, j2, b, i6, i5, i4, j, i3, i2, z5, i);
        } catch (Throwable th6) {
            th = th6;
            bs6Var = this;
            hs6Var = hs6Var2;
            i24 = i24;
            tL_messages_messages = tL_messages_messages2;
            gm.c3(new h65(bs6Var, bs6Var, i24, (byte) 8));
            hs6Var.v1(tL_messages_messages, bs6Var.b, bs6Var.a, bs6Var.h, bs6Var.c, bs6Var.e, bs6Var.d, bs6Var.r ? 1 : 0, bs6Var.n, false, bs6Var.s);
            throw th;
        }
        hs6Var.v1(tL_messages_messages, j2, b, i6, i5, i4, j, i3, i2, z5, i);
    }
}
