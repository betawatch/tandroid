package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ yp(yr yrVar, ArrayList arrayList, ArrayList arrayList2, int i7) {
        this.a = i7;
        this.b = yrVar;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.c;
                ArrayList arrayList2 = this.d;
                yr yrVar = this.b;
                yrVar.getClass();
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        sQLitePreparedStatement = yrVar.b.executeFast("UPDATE dialogs SET pinned = ? WHERE did = ?");
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
                        yrVar.o(e10, true);
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
                yr yrVar2 = this.b;
                yrVar2.getClass();
                ArrayList arrayList3 = this.c;
                if (!arrayList3.isEmpty()) {
                    yrVar2.getMessagesController().Y3(arrayList3, true);
                }
                ArrayList arrayList4 = this.d;
                if (arrayList4.isEmpty()) {
                    return;
                }
                yrVar2.getMessagesController().S3(arrayList4, true);
                return;
        }
    }
}
