package of;

import ih.h3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ s1(v1 v1Var, int i9) {
        this.a = i9;
        this.b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v1 v1Var = this.b;
                v1Var.getClass();
                try {
                    MessagesStorage.getInstance(v1Var.m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                v1 v1Var2 = this.b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(v1Var2.m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        t1 t1Var = new t1();
                        t1Var.a = queryFinalized.stringValue(0);
                        t1Var.b = queryFinalized.intValue(1);
                        arrayList.add(t1Var);
                        hashMap.put(t1Var.a, t1Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new j9.a(7));
                    AndroidUtilities.runOnUIThread(new h3(v1Var2, arrayList, hashMap, 28));
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
