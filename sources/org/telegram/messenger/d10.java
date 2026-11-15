package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class d10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j10 b;

    public /* synthetic */ d10(j10 j10Var, int i7) {
        this.a = i7;
        this.b = j10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.messenger.d10(r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:
    
        if (r4 == null) goto L48;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                j10 j10Var = this.b;
                ArrayList arrayList = j10Var.b;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    j10 j10Var2 = ((i10) arrayList.get(i7)).i;
                    if ((ConnectionsManager.getInstance(j10Var2.a).getCurrentTime() + np.s1(j10Var2.a).o4) - r3.d <= 0) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                j10Var.d();
                return;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                j10 j10Var3 = this.b;
                int i10 = j10Var3.a;
                SQLiteDatabase sQLiteDatabase = vr.a0(i10).b;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM unconfirmed_auth", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                try {
                                    i10 i10Var = new i10(j10Var3, byteBufferValue);
                                    arrayList4.add(i10Var);
                                    hashSet.add(Long.valueOf(i10Var.b));
                                    if (i10Var.a && !arrayList3.contains(Long.valueOf(i10Var.c))) {
                                        arrayList3.add(Long.valueOf(i10Var.c));
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                            }
                        }
                        vr.a0(i10).n0(arrayList3, arrayList2, false);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    g0.h3(new n10(j10Var3, arrayList2, hashSet, arrayList4, 1));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 2:
                j10 j10Var4 = this.b;
                SQLiteDatabase sQLiteDatabase2 = vr.a0(j10Var4.a).b;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase2.executeFast("DELETE FROM unconfirmed_auth WHERE 1").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO unconfirmed_auth VALUES(?)");
                        ArrayList arrayList5 = j10Var4.b;
                        int size = arrayList5.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList5.get(i11);
                            i11++;
                            i10 i10Var2 = (i10) obj;
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i10Var2.getObjectSize());
                            i10Var2.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.step();
                        }
                        break;
                    } finally {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                    break;
                }
            default:
                this.b.g = false;
                return;
        }
    }
}
