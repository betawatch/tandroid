package hg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ y1(b2 b2Var, int i10) {
        this.a = i10;
        this.b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b2 b2Var = this.b;
                b2Var.getClass();
                try {
                    MessagesStorage.getInstance(b2Var.m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                b2 b2Var2 = this.b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(b2Var2.m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        z1 z1Var = new z1();
                        z1Var.a = queryFinalized.stringValue(0);
                        z1Var.b = queryFinalized.intValue(1);
                        arrayList.add(z1Var);
                        hashMap.put(z1Var.a, z1Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.e(16));
                    AndroidUtilities.runOnUIThread(new t(b2Var2, arrayList, hashMap, 3));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
