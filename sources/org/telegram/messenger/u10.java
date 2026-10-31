package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a20 b;

    public /* synthetic */ u10(a20 a20Var, int i10) {
        this.a = i10;
        this.b = a20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        org.telegram.messenger.i0.g3(new org.telegram.messenger.u10(r1, 3));
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
                a20 a20Var = this.b;
                ArrayList arrayList = a20Var.b;
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    a20 a20Var2 = ((z10) arrayList.get(i10)).i;
                    if ((ConnectionsManager.getInstance(a20Var2.a).getCurrentTime() + vp.r1(a20Var2.a).o4) - r3.d <= 0) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                a20Var.d();
                return;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                a20 a20Var3 = this.b;
                int i11 = a20Var3.a;
                SQLiteDatabase sQLiteDatabase = hs.a0(i11).b;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM unconfirmed_auth", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                try {
                                    z10 z10Var = new z10(a20Var3, byteBufferValue);
                                    arrayList4.add(z10Var);
                                    hashSet.add(Long.valueOf(z10Var.b));
                                    if (z10Var.a && !arrayList3.contains(Long.valueOf(z10Var.c))) {
                                        arrayList3.add(Long.valueOf(z10Var.c));
                                    }
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                            }
                        }
                        hs.a0(i11).n0(arrayList3, arrayList2, false);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    i0.g3(new e20(a20Var3, arrayList2, hashSet, arrayList4, 1));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 2:
                a20 a20Var4 = this.b;
                SQLiteDatabase sQLiteDatabase2 = hs.a0(a20Var4.a).b;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase2.executeFast("DELETE FROM unconfirmed_auth WHERE 1").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO unconfirmed_auth VALUES(?)");
                        ArrayList arrayList5 = a20Var4.b;
                        int size = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList5.get(i12);
                            i12++;
                            z10 z10Var2 = (z10) obj;
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(z10Var2.getObjectSize());
                            z10Var2.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement.step();
                        }
                        break;
                    } finally {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    }
                } catch (Exception e10) {
                    f8.g(e10, true);
                    break;
                }
            default:
                this.b.g = false;
                return;
        }
    }
}
