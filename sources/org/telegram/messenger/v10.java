package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class v10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b20 b;

    public /* synthetic */ v10(b20 b20Var, int i10) {
        this.a = i10;
        this.b = b20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        org.telegram.messenger.i0.g3(new org.telegram.messenger.v10(r1, 3));
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
                b20 b20Var = this.b;
                ArrayList arrayList = b20Var.b;
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    b20 b20Var2 = ((a20) arrayList.get(i10)).i;
                    if ((ConnectionsManager.getInstance(b20Var2.a).getCurrentTime() + wp.r1(b20Var2.a).o4) - r3.d <= 0) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                b20Var.d();
                return;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                b20 b20Var3 = this.b;
                int i11 = b20Var3.a;
                SQLiteDatabase sQLiteDatabase = is.a0(i11).b;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM unconfirmed_auth", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                try {
                                    a20 a20Var = new a20(b20Var3, byteBufferValue);
                                    arrayList4.add(a20Var);
                                    hashSet.add(Long.valueOf(a20Var.b));
                                    if (a20Var.a && !arrayList3.contains(Long.valueOf(a20Var.c))) {
                                        arrayList3.add(Long.valueOf(a20Var.c));
                                    }
                                } catch (Exception e) {
                                    f8.g(e, true);
                                }
                            }
                        }
                        is.a0(i11).n0(arrayList3, arrayList2, false);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    i0.g3(new f20(b20Var3, arrayList2, hashSet, arrayList4, 1));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 2:
                b20 b20Var4 = this.b;
                SQLiteDatabase sQLiteDatabase2 = is.a0(b20Var4.a).b;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase2.executeFast("DELETE FROM unconfirmed_auth WHERE 1").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO unconfirmed_auth VALUES(?)");
                        ArrayList arrayList5 = b20Var4.b;
                        int size = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList5.get(i12);
                            i12++;
                            a20 a20Var2 = (a20) obj;
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(a20Var2.getObjectSize());
                            a20Var2.serializeToStream(nativeByteBuffer);
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
