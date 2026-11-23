package org.telegram.messenger;

import android.util.Pair;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements r10 {
    public final /* synthetic */ y2 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ w2(y2 y2Var, Pair pair, Object obj, int i7) {
        this.a = y2Var;
        this.b = pair;
        this.c = obj;
        this.d = i7;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        Object obj3;
        Long l10 = (Long) obj;
        y2 y2Var = this.a;
        Pair pair = this.b;
        if (!y2Var.i(pair)) {
            y2Var.a(pair, obj2);
            g0.g3(new aa.c0((Object) y2Var, (Object) pair, obj2, true, 8));
            return;
        }
        Object obj4 = this.c;
        if (obj2 == null || !y2Var.b(obj4)) {
            obj3 = obj2;
        } else {
            y2Var.a(pair, obj2);
            obj3 = obj2;
            g0.g3(new aa.c0((Object) y2Var, (Object) pair, obj3, false, 8));
        }
        long longValue = l10.longValue();
        int i7 = this.d;
        y2Var.f(i7, obj4, longValue, new x2(y2Var, pair, obj3, i7, obj4));
    }
}
