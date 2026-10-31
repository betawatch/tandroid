package org.telegram.messenger;

import android.util.Pair;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements j20 {
    public final /* synthetic */ b3 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ z2(b3 b3Var, Pair pair, Object obj, int i10) {
        this.a = b3Var;
        this.b = pair;
        this.c = obj;
        this.d = i10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l4 = (Long) obj;
        b3 b3Var = this.a;
        Pair pair = this.b;
        if (!b3Var.i(pair)) {
            b3Var.a(pair, obj2);
            i0.g3(new bi.n4((Object) b3Var, (Object) pair, obj2, true, 6));
            return;
        }
        Object obj4 = this.c;
        if (obj2 == null || !b3Var.b(obj4)) {
            obj3 = obj2;
        } else {
            b3Var.a(pair, obj2);
            obj3 = obj2;
            i0.g3(new bi.n4((Object) b3Var, (Object) pair, obj3, false, 6));
        }
        long longValue = l4.longValue();
        int i10 = this.d;
        b3Var.f(i10, obj4, longValue, new a3(b3Var, pair, obj3, i10, obj4));
    }
}
