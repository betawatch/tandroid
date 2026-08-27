package b8;

import android.os.Bundle;
import h3.c2;
import h3.r2;
import h3.s2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.j;
import r0.m1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public boolean H(int i10) {
        return f().a.a.get(i10);
    }

    public boolean I() {
        s2 A = A();
        return !A.p() && A.m(x(), (r2) this.a, 0L).r;
    }

    public boolean J() {
        s2 A = A();
        return !A.p() && A.m(x(), (r2) this.a, 0L).a();
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

    public a(int i10) {
        switch (i10) {
            case 2:
                this.a = new r2();
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
        j.e(data, "data");
        this.a = data;
    }
}
