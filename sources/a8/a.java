package a8;

import android.os.Bundle;
import h3.c2;
import h3.q2;
import h3.r2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.i;
import r0.m1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a implements c2 {
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean H(int i9) {
        return f().a.a.get(i9);
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

    public abstract void O(long j10, int i9, int i10, boolean z10);

    public void P(int i9, long j10) {
        O(j10, x(), i9, false);
    }

    public a(int i9) {
        switch (i9) {
            case 3:
                this.a = new q2();
                break;
            case 7:
                this.a = new LinkedHashMap();
                break;
            case 8:
                this.a = new HashMap();
                break;
            default:
                this.a = new Object();
                break;
        }
    }

    public a(String str, Bundle data) {
        i.e(data, "data");
        this.a = data;
    }
}
