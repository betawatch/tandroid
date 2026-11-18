package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class y2 {
    public final long a;
    public HashMap b;
    public HashMap c;
    public HashMap d;

    public y2() {
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

    public final void c(int i7, Object obj, x10 x10Var) {
        Pair pair = new Pair(Integer.valueOf(i7), obj);
        HashMap hashMap = this.c;
        if (hashMap != null && hashMap.get(pair) != null) {
            g0.g3(new yf(this, pair, x10Var, 11));
            return;
        }
        HashMap hashMap2 = this.b;
        Object obj2 = hashMap2 == null ? null : hashMap2.get(pair);
        if (obj2 != null && !i(pair)) {
            x10Var.a(obj2);
        } else {
            g0.g3(new yf(this, pair, x10Var, 11));
            e(i7, obj, new w2(this, pair, obj, i7));
        }
    }

    public final void d(int i7, Integer num) {
        if (this.d == null) {
            return;
        }
        Pair pair = new Pair(Integer.valueOf(i7), num);
        this.d.remove(pair);
        if (this instanceof lo) {
            h(pair.hashCode(), 0L);
        }
    }

    public void e(int i7, Object obj, q10 q10Var) {
        ((w2) q10Var).a(0L, null);
    }

    public abstract void f(int i7, Object obj, long j3, x2 x2Var);

    public final boolean i(Pair pair) {
        HashMap hashMap = this.d;
        Long l10 = hashMap != null ? (Long) hashMap.get(pair) : null;
        if ((this instanceof lo) && l10 == null) {
            int hashCode = pair.hashCode();
            l10 = Long.valueOf(((lo) this).e.h7.getLong("effects_last_" + hashCode, 0L));
        }
        return l10 == null || System.currentTimeMillis() - l10.longValue() >= this.a;
    }

    public boolean j(Object obj) {
        return true;
    }

    public y2(int i7) {
        this.a = i7;
    }

    public void h(int i7, long j3) {
    }

    public void g(int i7, Object obj, Object obj2) {
    }
}
