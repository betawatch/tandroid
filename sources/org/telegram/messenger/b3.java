package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b3 {
    public final long a;
    public HashMap b;
    public HashMap c;
    public HashMap d;

    public b3() {
        this(240000);
    }

    public final void a(Pair pair, Object obj) {
        if (j(pair.second)) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(pair, obj);
        }
    }

    public boolean b(Object obj) {
        return false;
    }

    public final void c(int i10, Object obj, q20 q20Var) {
        Pair pair = new Pair(Integer.valueOf(i10), obj);
        HashMap hashMap = this.c;
        if (hashMap != null && hashMap.get(pair) != null) {
            i0.g3(new mg(this, pair, q20Var, 11));
            return;
        }
        HashMap hashMap2 = this.b;
        Object obj2 = hashMap2 == null ? null : hashMap2.get(pair);
        if (obj2 != null && !i(pair)) {
            q20Var.a(obj2);
        } else {
            i0.g3(new mg(this, pair, q20Var, 11));
            e(i10, obj, new z2(this, pair, obj, i10));
        }
    }

    public final void d(int i10, Integer num) {
        if (this.d == null) {
            return;
        }
        Pair pair = new Pair(Integer.valueOf(i10), num);
        this.d.remove(pair);
        if (this instanceof uo) {
            h(pair.hashCode(), 0L);
        }
    }

    public void e(int i10, Object obj, j20 j20Var) {
        ((z2) j20Var).a(0L, null);
    }

    public abstract void f(int i10, Object obj, long j10, a3 a3Var);

    public final boolean i(Pair pair) {
        HashMap hashMap = this.d;
        Long l4 = hashMap != null ? (Long) hashMap.get(pair) : null;
        if ((this instanceof uo) && l4 == null) {
            int hashCode = pair.hashCode();
            l4 = Long.valueOf(((uo) this).e.f7.getLong("effects_last_" + hashCode, 0L));
        }
        return l4 == null || System.currentTimeMillis() - l4.longValue() >= this.a;
    }

    public boolean j(Object obj) {
        return true;
    }

    public b3(int i10) {
        this.a = i10;
    }

    public void h(int i10, long j10) {
    }

    public void g(int i10, Object obj, Object obj2) {
    }
}
