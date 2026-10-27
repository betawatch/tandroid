package ig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;

    public /* synthetic */ x1(a2 a2Var, int i10) {
        this.a = i10;
        this.b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a2 a2Var = this.b;
                a2Var.getClass();
                try {
                    MessagesStorage.getInstance(a2Var.m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                a2 a2Var2 = this.b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(a2Var2.m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        y1 y1Var = new y1();
                        y1Var.a = queryFinalized.stringValue(0);
                        y1Var.b = queryFinalized.intValue(1);
                        arrayList.add(y1Var);
                        hashMap.put(y1Var.a, y1Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.d(22));
                    AndroidUtilities.runOnUIThread(new e2.m0(a2Var2, arrayList, hashMap, 22));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
