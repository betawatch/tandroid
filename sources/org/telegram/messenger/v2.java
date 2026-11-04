package org.telegram.messenger;

import android.util.Pair;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements n10 {
    public final /* synthetic */ x2 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ v2(x2 x2Var, Pair pair, Object obj, int i3) {
        this.a = x2Var;
        this.b = pair;
        this.c = obj;
        this.d = i3;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l10 = (Long) obj;
        x2 x2Var = this.a;
        Pair pair = this.b;
        if (!x2Var.i(pair)) {
            x2Var.a(pair, obj2);
            g0.h3(new ci.u8((Object) x2Var, (Object) pair, obj2, true, 8));
            return;
        }
        Object obj4 = this.c;
        if (obj2 == null || !x2Var.b(obj4)) {
            obj3 = obj2;
        } else {
            x2Var.a(pair, obj2);
            obj3 = obj2;
            g0.h3(new ci.u8((Object) x2Var, (Object) pair, obj3, false, 8));
        }
        long longValue = l10.longValue();
        int i3 = this.d;
        x2Var.f(i3, obj4, longValue, new w2(x2Var, pair, obj3, i3, obj4));
    }
}
