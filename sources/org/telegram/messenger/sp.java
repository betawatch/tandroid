package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class sp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ sp(tr trVar, ArrayList arrayList, ArrayList arrayList2, int i7) {
        this.a = i7;
        this.b = trVar;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                tr trVar = this.b;
                trVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = trVar.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
                        int size = arrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, ((Integer) arrayList2.get(i7)).intValue());
                            sQLitePreparedStatement.bindLong(2, ((Long) arrayList.get(i7)).longValue());
                            sQLitePreparedStatement.step();
                        }
                        sQLitePreparedStatement.dispose();
                        return;
                    } catch (Exception e10) {
                        trVar.o(e10, true);
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
                tr trVar2 = this.b;
                trVar2.getClass();
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    trVar2.getMessagesController().f4(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (arrayList4.isEmpty()) {
                    return;
                }
                trVar2.getMessagesController().Z3(arrayList4, true);
                return;
        }
    }
}
