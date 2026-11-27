// default package

import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fz1 extends HashMap {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fz1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                byte b = ((iz1) this.b).w;
                b29 b29Var = (b29) super.get(obj);
                if (b29Var != null) {
                    return b29Var;
                }
                hz1 hz1Var = (hz1) obj;
                b29 b29Var2 = new b29(hz1Var.c, hl.L(b), hl.L(b));
                put(hz1Var, b29Var2);
                return b29Var2;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                ((lk7) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
