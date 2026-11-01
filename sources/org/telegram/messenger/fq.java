package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class fq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ fq(is isVar, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.a = i10;
        this.b = isVar;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                is isVar = this.b;
                isVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = isVar.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList2.get(i10)).intValue());
                            sQLitePreparedStatement.bindLong(2, ((Long) arrayList.get(i10)).longValue());
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e) {
                        isVar.o(e, true);
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            default:
                is isVar2 = this.b;
                isVar2.getClass();
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    isVar2.getMessagesController().V3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (arrayList4.isEmpty()) {
                    return;
                }
                isVar2.getMessagesController().P3(arrayList4, true);
                return;
        }
    }
}
