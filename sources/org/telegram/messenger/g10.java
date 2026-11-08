package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m10 b;

    public /* synthetic */ g10(m10 m10Var, int i7) {
        this.a = i7;
        this.b = m10Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        org.telegram.messenger.g0.h3(new org.telegram.messenger.g10(r1, 3));
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
                m10 m10Var = this.b;
                ArrayList arrayList = m10Var.b;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    m10 m10Var2 = ((l10) arrayList.get(i7)).i;
                    if ((ConnectionsManager.getInstance(m10Var2.a).getCurrentTime() + qp.s1(m10Var2.a).n4) - r3.d <= 0) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                m10Var.d();
                return;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                m10 m10Var3 = this.b;
                int i10 = m10Var3.a;
                SQLiteDatabase sQLiteDatabase = yr.a0(i10).b;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        Locale locale = Locale.US;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM unconfirmed_auth", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                try {
                                    l10 l10Var = new l10(m10Var3, byteBufferValue);
                                    arrayList4.add(l10Var);
                                    hashSet.add(Long.valueOf(l10Var.b));
                                    if (l10Var.a && !arrayList3.contains(Long.valueOf(l10Var.c))) {
                                        arrayList3.add(Long.valueOf(l10Var.c));
                                    }
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                }
                            }
                        }
                        yr.a0(i10).n0(arrayList3, arrayList2, false);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        break;
                    }
                    sQLiteCursor.dispose();
                    g0.h3(new q10(m10Var3, arrayList2, hashSet, arrayList4, 1));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 2:
                m10 m10Var4 = this.b;
                SQLiteDatabase sQLiteDatabase2 = yr.a0(m10Var4.a).b;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLiteDatabase2.executeFast("DELETE FROM unconfirmed_auth WHERE 1").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase2.executeFast("REPLACE INTO unconfirmed_auth VALUES(?)");
                        ArrayList arrayList5 = m10Var4.b;
                        int size = arrayList5.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList5.get(i11);
                            i11++;
                            l10 l10Var2 = (l10) obj;
                            sQLitePreparedStatement.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(l10Var2.getObjectSize());
                            l10Var2.serializeToStream(nativeByteBuffer);
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
