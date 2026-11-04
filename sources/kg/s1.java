package kg;

import ei.h9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.qr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ s1(v1 v1Var, int i3) {
        this.a = i3;
        this.b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    qr.a0(this.b.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                v1 v1Var = this.b;
                try {
                    SQLiteCursor queryFinalized = qr.a0(v1Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
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
                    Collections.sort(arrayList, new a3.u(24));
                    org.telegram.messenger.g0.h3(new h9((Object) v1Var, arrayList, (Cloneable) hashMap, 25));
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}
