package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class eq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ eq(hs hsVar, ArrayList arrayList, ArrayList arrayList2, int i10) {
        this.a = i10;
        this.b = hsVar;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                hs hsVar = this.b;
                hsVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = hsVar.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
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
                        hsVar.o(e, true);
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
                hs hsVar2 = this.b;
                hsVar2.getClass();
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    hsVar2.getMessagesController().V3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (arrayList4.isEmpty()) {
                    return;
                }
                hsVar2.getMessagesController().P3(arrayList4, true);
                return;
        }
    }
}
