package ab;

import android.os.Bundle;
import j3.c2;
import j3.q2;
import j3.r2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import r0.m1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e implements c2 {
    public Object a;

    public abstract Object F(Object obj);

    public Object G(Object obj) {
        synchronized (((HashMap) this.a)) {
            try {
                if (((HashMap) this.a).containsKey(obj)) {
                    return ((HashMap) this.a).get(obj);
                }
                Object F = F(obj);
                ((HashMap) this.a).put(obj, F);
                return F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean H(int i10) {
        return f().a.a.get(i10);
    }

    public boolean I() {
        r2 A = A();
        return !A.p() && A.m(x(), (q2) this.a, 0L).r;
    }

    public boolean J() {
        r2 A = A();
        return !A.p() && A.m(x(), (q2) this.a, 0L).a();
    }

    public boolean K() {
        return b() == 3 && h() && z() == 0;
    }

    public abstract void L();

    public abstract m1 M(m1 m1Var, List list);

    public void N() {
        synchronized (this.a) {
        }
    }

    public abstract void O(long j10, int i10, int i11, boolean z10);

    public void P(int i10, long j10) {
        O(j10, x(), i10, false);
    }

    public e(int i10) {
        switch (i10) {
            case 1:
                this.a = new Object();
                break;
            case 3:
                this.a = new q2();
                break;
            case 8:
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
