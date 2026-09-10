package fg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ a2(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d2 d2Var = this.b;
                d2Var.getClass();
                try {
                    MessagesStorage.getInstance(d2Var.m).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                d2 d2Var2 = this.b;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(d2Var2.m).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        b2 b2Var = new b2();
                        b2Var.a = queryFinalized.stringValue(0);
                        b2Var.b = queryFinalized.intValue(1);
                        arrayList.add(b2Var);
                        hashMap.put(b2Var.a, b2Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new a4.e(7));
                    AndroidUtilities.runOnUIThread(new a3.k0(d2Var2, arrayList, hashMap, 25));
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }
}
