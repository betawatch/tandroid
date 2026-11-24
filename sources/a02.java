// default package

import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a02 extends HashMap {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a02(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                byte b = ((d02) this.b).w;
                p09 p09Var = (p09) super.get(obj);
                if (p09Var != null) {
                    return p09Var;
                }
                c02 c02Var = (c02) obj;
                p09 p09Var2 = new p09(c02Var.c, gm.L(b), gm.L(b));
                put(c02Var, p09Var2);
                return p09Var2;
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
                ((fk7) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
