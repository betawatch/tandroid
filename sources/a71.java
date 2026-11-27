// default package

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class a71 implements mcc {
    public final /* synthetic */ b71 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a71(b71 b71Var, Pair pair, Object obj, int i, Object obj2) {
        this.a = b71Var;
        this.b = pair;
        this.c = obj;
        this.d = i;
        this.e = obj2;
    }

    @Override // mcc
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        Long l = (Long) obj3;
        b71 b71Var = this.a;
        b71Var.getClass();
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        Pair pair = this.b;
        if (booleanValue) {
            if (b71Var.d == null) {
                b71Var.d = new HashMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            b71Var.d.put(pair, Long.valueOf(currentTimeMillis));
            if (b71Var instanceof ub7) {
                b71Var.h(pair.hashCode(), currentTimeMillis);
            }
        }
        boolean z = true;
        if (bool.booleanValue()) {
            Object obj5 = this.c;
            b71Var.a(pair, obj5);
            hl.c3(new lg((Object) b71Var, (Object) pair, obj5, z, (byte) 2));
        } else {
            if (obj2 != null) {
                l.getClass();
                b71Var.g(this.d, this.e, obj2);
                b71Var.a(pair, obj2);
            }
            hl.c3(new lg((Object) b71Var, (Object) pair, obj2, z, (byte) 2));
        }
    }
}
