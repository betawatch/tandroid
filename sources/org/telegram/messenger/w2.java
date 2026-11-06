package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements z10 {
    public final /* synthetic */ x2 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w2(x2 x2Var, Pair pair, Object obj, int i7, Object obj2) {
        this.a = x2Var;
        this.b = pair;
        this.c = obj;
        this.d = i7;
        this.e = obj2;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l10 = (Long) obj3;
        x2 x2Var = this.a;
        x2Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (x2Var.d == null) {
                x2Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            x2Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (x2Var instanceof po) {
                x2Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        boolean z9 = true;
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            x2Var.a(pair, obj5);
            g0.h3(new aa.d0(x2Var, pair, obj5, z9, 8));
        } else {
            if (obj2 != null) {
                l10.getClass();
                x2Var.g(this.d, this.e, obj2);
                x2Var.a(pair, obj2);
            }
            g0.h3(new aa.d0(x2Var, pair, obj2, z9, 8));
        }
    }
}
