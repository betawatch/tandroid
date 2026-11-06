package org.telegram.messenger;

import android.util.Pair;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements v10 {
    public final /* synthetic */ x2 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ v2(x2 x2Var, Pair pair, Object obj, int i7) {
        this.a = x2Var;
        this.b = pair;
        this.c = obj;
        this.d = i7;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l10 = (Long) obj;
        x2 x2Var = this.a;
        Pair pair = this.b;
        if (!x2Var.i(pair)) {
            x2Var.a(pair, obj2);
            g0.h3(new aa.d0((Object) x2Var, (Object) pair, obj2, true, 8));
            return;
        }
        Object obj4 = this.c;
        if (obj2 == null || !x2Var.b(obj4)) {
            obj3 = obj2;
        } else {
            x2Var.a(pair, obj2);
            obj3 = obj2;
            g0.h3(new aa.d0((Object) x2Var, (Object) pair, obj3, false, 8));
        }
        long longValue = l10.longValue();
        int i7 = this.d;
        x2Var.f(i7, obj4, longValue, new w2(x2Var, pair, obj3, i7, obj4));
    }
}
