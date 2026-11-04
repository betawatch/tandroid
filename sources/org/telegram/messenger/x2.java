package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class x2 {
    public final long a;
    public HashMap b;
    public HashMap c;
    public HashMap d;

    public x2() {
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

    public final void c(int i3, Object obj, u10 u10Var) {
        Pair pair = new Pair(Integer.valueOf(i3), obj);
        HashMap hashMap = this.c;
        if (hashMap != null && hashMap.get(pair) != null) {
            g0.h3(new fg(this, pair, u10Var, 11));
            return;
        }
        HashMap hashMap2 = this.b;
        Object obj2 = hashMap2 == null ? null : hashMap2.get(pair);
        if (obj2 != null && !i(pair)) {
            u10Var.a(obj2);
        } else {
            g0.h3(new fg(this, pair, u10Var, 11));
            e(i3, obj, new v2(this, pair, obj, i3));
        }
    }

    public final void d(int i3, Integer num) {
        if (this.d == null) {
            return;
        }
        Pair pair = new Pair(Integer.valueOf(i3), num);
        this.d.remove(pair);
        if (this instanceof fo) {
            h(pair.hashCode(), 0L);
        }
    }

    public void e(int i3, Object obj, n10 n10Var) {
        ((v2) n10Var).a(0L, null);
    }

    public abstract void f(int i3, Object obj, long j10, w2 w2Var);

    public final boolean i(Pair pair) {
        HashMap hashMap = this.d;
        Long l10 = hashMap != null ? (Long) hashMap.get(pair) : null;
        if ((this instanceof fo) && l10 == null) {
            int hashCode = pair.hashCode();
            l10 = Long.valueOf(((fo) this).e.e7.getLong("effects_last_" + hashCode, 0L));
        }
        return l10 == null || System.currentTimeMillis() - l10.longValue() >= this.a;
    }

    public boolean j(Object obj) {
        return true;
    }

    public x2(int i3) {
        this.a = i3;
    }

    public void h(int i3, long j10) {
    }

    public void g(int i3, Object obj, Object obj2) {
    }
}
