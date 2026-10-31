package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a3 implements n20 {
    public final /* synthetic */ b3 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a3(b3 b3Var, Pair pair, Object obj, int i10, Object obj2) {
        this.a = b3Var;
        this.b = pair;
        this.c = obj;
        this.d = i10;
        this.e = obj2;
    }

    @Override // org.telegram.messenger.n20
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l4 = (Long) obj3;
        b3 b3Var = this.a;
        b3Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (b3Var.d == null) {
                b3Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            b3Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (b3Var instanceof uo) {
                b3Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        boolean z10 = true;
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            b3Var.a(pair, obj5);
            i0.g3(new bi.n4(b3Var, pair, obj5, z10, 6));
        } else {
            if (obj2 != null) {
                l4.getClass();
                b3Var.g(this.d, this.e, obj2);
                b3Var.a(pair, obj2);
            }
            i0.g3(new bi.n4(b3Var, pair, obj2, z10, 6));
        }
    }
}
