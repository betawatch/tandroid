package jg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.a8;
import org.telegram.messenger.yr;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ w1(z1 z1Var, int i7) {
        this.a = i7;
        this.b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    yr.a0(this.b.m).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                z1 z1Var = this.b;
                try {
                    SQLiteCursor queryFinalized = yr.a0(z1Var.m).b.queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    while (queryFinalized.next()) {
                        x1 x1Var = new x1();
                        x1Var.a = queryFinalized.stringValue(0);
                        x1Var.b = queryFinalized.intValue(1);
                        arrayList.add(x1Var);
                        hashMap.put(x1Var.a, x1Var);
                    }
                    queryFinalized.dispose();
                    Collections.sort(arrayList, new x(2));
                    org.telegram.messenger.g0.h3(new fi.x1(z1Var, arrayList, hashMap, 20));
                    break;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
        }
    }
}
