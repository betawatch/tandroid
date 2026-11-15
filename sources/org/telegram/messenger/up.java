package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class up implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vr b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ up(vr vrVar, ArrayList arrayList, ArrayList arrayList2, int i7) {
        this.a = i7;
        this.b = vrVar;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                vr vrVar = this.b;
                vrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = vrVar.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
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
                        vrVar.o(e10, true);
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
                vr vrVar2 = this.b;
                vrVar2.getClass();
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    vrVar2.getMessagesController().Y3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (arrayList4.isEmpty()) {
                    return;
                }
                vrVar2.getMessagesController().S3(arrayList4, true);
                return;
        }
    }
}
