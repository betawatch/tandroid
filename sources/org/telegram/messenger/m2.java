package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ f1 e;

    public /* synthetic */ m2(f1 f1Var, long j10, long j11, long j12, int i10) {
        this.a = i10;
        this.e = f1Var;
        this.b = j10;
        this.c = j11;
        this.d = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor;
        ?? r10;
        SQLiteCursor sQLiteCursor2;
        boolean z10;
        SQLiteCursor sQLiteCursor3;
        switch (this.a) {
            case 0:
                o2 o2Var = (o2) this.e;
                long j10 = this.d;
                long j11 = this.b;
                long j12 = this.c;
                o2Var.c(j11, j12, j10, true);
                js.o(o2Var.currentAccount, j12);
                break;
            default:
                ui uiVar = (ui) this.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = 0;
                while (true) {
                    long j13 = this.b;
                    if (i10 < 2) {
                        ArrayList arrayList5 = i10 == 0 ? arrayList3 : arrayList4;
                        if (i10 == 0) {
                            try {
                                boolean C = o5.C(j13);
                                long j14 = this.c;
                                if (C) {
                                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                                    Locale locale = Locale.US;
                                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j13 + " AND mid > " + j14 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                } else {
                                    SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().b;
                                    Locale locale2 = Locale.US;
                                    sQLiteCursor = sQLiteDatabase2.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j13 + " AND mid < " + j14 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                }
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e) {
                                e = e;
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                                f8.g(e, true);
                                i0.g3(new wm(uiVar, j13, arrayList, arrayList2, 4));
                            }
                        } else {
                            boolean C2 = o5.C(j13);
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            long j15 = this.d;
                            if (C2) {
                                SQLiteDatabase sQLiteDatabase3 = uiVar.getMessagesStorage().b;
                                Locale locale3 = Locale.US;
                                r10 = 0;
                                sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j13 + " AND mid < " + j15 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                while (sQLiteCursor2.next()) {
                                    try {
                                        NativeByteBuffer byteBufferValue = sQLiteCursor2.byteBufferValue(r10);
                                        if (byteBufferValue != 0) {
                                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r10), r10);
                                            TLdeserialize.readAttachPath(byteBufferValue, uiVar.getUserConfig().n);
                                            byteBufferValue.reuse();
                                            if (jj.K3(TLdeserialize)) {
                                                TLdeserialize.id = sQLiteCursor2.intValue(1);
                                                TLdeserialize.dialog_id = j13;
                                                z10 = false;
                                                arrayList5.add(0, new jj(uiVar.currentAccount, TLdeserialize, false, true));
                                            } else {
                                                z10 = false;
                                            }
                                        } else {
                                            z10 = r10;
                                        }
                                        r10 = z10;
                                    } catch (Exception e7) {
                                        e = e7;
                                        f8.g(e, true);
                                        i0.g3(new wm(uiVar, j13, arrayList, arrayList2, 4));
                                    }
                                }
                                sQLiteCursor2.dispose();
                                i10++;
                                arrayList3 = arrayList;
                                arrayList4 = arrayList2;
                            } else {
                                SQLiteDatabase sQLiteDatabase4 = uiVar.getMessagesStorage().b;
                                Locale locale4 = Locale.US;
                                sQLiteCursor3 = sQLiteDatabase4.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j13 + " AND mid > " + j15 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                            }
                        }
                        r10 = 0;
                        sQLiteCursor2 = sQLiteCursor3;
                        while (sQLiteCursor2.next()) {
                        }
                        sQLiteCursor2.dispose();
                        i10++;
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                    }
                    i0.g3(new wm(uiVar, j13, arrayList, arrayList2, 4));
                }
        }
    }
}
