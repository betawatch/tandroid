package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements u10 {
    public final /* synthetic */ y2 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x2(y2 y2Var, Pair pair, Object obj, int i7, Object obj2) {
        this.a = y2Var;
        this.b = pair;
        this.c = obj;
        this.d = i7;
        this.e = obj2;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l10 = (Long) obj3;
        y2 y2Var = this.a;
        y2Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (y2Var.d == null) {
                y2Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            y2Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (y2Var instanceof lo) {
                y2Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        boolean z10 = true;
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            y2Var.a(pair, obj5);
            g0.g3(new aa.c0(y2Var, pair, obj5, z10, 8));
        } else {
            if (obj2 != null) {
                l10.getClass();
                y2Var.g(this.d, this.e, obj2);
                y2Var.a(pair, obj2);
            }
            g0.g3(new aa.c0(y2Var, pair, obj2, z10, 8));
        }
    }
}
