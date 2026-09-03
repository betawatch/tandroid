package cb;

import android.os.Bundle;
import j3.a2;
import j3.n2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import r0.m1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class e implements a2 {
    public Object a;

    public abstract Object E(Object obj);

    public Object F(Object obj) {
        synchronized (((HashMap) this.a)) {
            try {
                if (((HashMap) this.a).containsKey(obj)) {
                    return ((HashMap) this.a).get(obj);
                }
                Object E = E(obj);
                ((HashMap) this.a).put(obj, E);
                return E;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean G() {
        return b() == 3 && j() && y() == 0;
    }

    public abstract void H();

    public abstract m1 I(m1 m1Var, List list);

    public void J() {
        synchronized (this.a) {
        }
    }

    public abstract void K(int i10, int i11, long j10);

    public e(int i10) {
        switch (i10) {
            case 2:
                this.a = new Object();
                break;
            case 3:
                this.a = new n2();
                break;
            case 7:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public e(String str, Bundle data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.a = data;
    }
}
