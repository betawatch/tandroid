// default package

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class me7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ me7(kf7 kf7Var, long j, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zh6 zh6Var;
        uc7 messagesController;
        byte b = this.a;
        SQLiteCursor sQLiteCursor = null;
        long j = this.c;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                try {
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM topics WHERE did = " + j).stepThis().dispose();
                    return;
                } catch (SQLiteException e) {
                    e.printStackTrace();
                    return;
                }
            case 1:
                kf7 kf7Var2 = this.b;
                try {
                    try {
                        long e2 = kf7Var2.getUserConfig().e();
                        SQLiteDatabase sQLiteDatabase2 = kf7Var2.b;
                        Long valueOf = Long.valueOf(e2);
                        Long valueOf2 = Long.valueOf(j);
                        Object[] objArr = new Object[2];
                        try {
                            objArr[0] = valueOf;
                            objArr[1] = valueOf2;
                            SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT mid FROM messages_topics WHERE uid = ? AND topic_id = ?", objArr);
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (queryFinalized.next()) {
                                    arrayList.add(Integer.valueOf(queryFinalized.intValue(0)));
                                }
                                queryFinalized.dispose();
                                queryFinalized = kf7Var2.b.queryFinalized("SELECT mid, data FROM messages_v2 WHERE uid = ?", Long.valueOf(e2));
                                while (queryFinalized.next()) {
                                    int intValue = queryFinalized.intValue(0);
                                    if (!arrayList.contains(Integer.valueOf(intValue))) {
                                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(1);
                                        if (r47.Q1(e2, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false)) == j) {
                                            arrayList.add(Integer.valueOf(intValue));
                                        }
                                        byteBufferValue.reuse();
                                    }
                                }
                                queryFinalized.dispose();
                                if (!arrayList.isEmpty()) {
                                    kf7Var2.Q0(0, 0, e2, arrayList, true);
                                    kf7Var2.T1(e2, -e2, arrayList, null);
                                    try {
                                        te7 te7Var = new te7(kf7Var2, e2, arrayList, (byte) 9);
                                        kf7Var2 = kf7Var2;
                                        hl.c3(te7Var);
                                    } catch (Exception e3) {
                                        e = e3;
                                        kf7Var2 = kf7Var2;
                                        kf7Var2.p(e, true);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        return;
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                sQLiteCursor = queryFinalized;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
                return;
            case 2:
                try {
                    kf7Var.b.executeFast("DELETE FROM story_pushes WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    kf7Var.p(e7, true);
                    return;
                }
            case 3:
                try {
                    kf7Var.b.executeFast("DELETE FROM wallpapers2 WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e8) {
                    kf7Var.p(e8, true);
                    return;
                }
            case 4:
                try {
                    kf7Var.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    kf7Var.p(e9, true);
                    return;
                }
            case 5:
                try {
                    kf7Var.b.executeFast("DELETE FROM pending_tasks WHERE id = " + j).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    kf7Var.p(e10, true);
                    return;
                }
            case 6:
                long j2 = this.c;
                boolean z = true;
                try {
                    try {
                        SQLiteCursor queryFinalized2 = kf7Var.b.queryFinalized("SELECT uid, data FROM channel_admins_v3 WHERE did = " + j2, new Object[0]);
                        try {
                            zh6Var = new zh6();
                            while (queryFinalized2.next()) {
                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(1);
                                if (byteBufferValue2 != null) {
                                    TLRPC.ChannelParticipant TLdeserialize = TLRPC.ChannelParticipant.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    byteBufferValue2.reuse();
                                    if (TLdeserialize != null) {
                                        zh6Var.k(queryFinalized2.longValue(0), TLdeserialize);
                                    }
                                }
                            }
                            queryFinalized2.dispose();
                            messagesController = kf7Var.getMessagesController();
                            messagesController.getClass();
                        } catch (Exception e11) {
                            e = e11;
                            sQLiteCursor = queryFinalized2;
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = queryFinalized2;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    hl.c3(new j61((Object) messagesController, j2, (Object) zh6Var, z, (byte) 6));
                    return;
                } catch (Exception e13) {
                    e = e13;
                    kf7Var.p(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            default:
                try {
                    kf7Var.b.executeFast("DELETE FROM dialog_photos WHERE uid = " + j).stepThis().dispose();
                    kf7Var.b.executeFast("DELETE FROM dialog_photos_count WHERE uid = " + j).stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    kf7Var.p(e14, true);
                    return;
                }
        }
    }
}
