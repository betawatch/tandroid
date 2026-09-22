package gg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ z1(c2 c2Var, int i10) {
        this.a = i10;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c2 c2Var = this.b;
                c2Var.getClass();
                try {
                    MessagesStorage.getInstance(c2Var.m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                c2 c2Var2 = this.b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(c2Var2.m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        a2 a2Var = new a2();
                        a2Var.a = queryFinalized.stringValue(0);
                        a2Var.b = queryFinalized.intValue(1);
                        arrayList.add(a2Var);
                        hashMap.put(a2Var.a, a2Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.e(14));
                    AndroidUtilities.runOnUIThread(new t(c2Var2, arrayList, hashMap, 3));
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}
