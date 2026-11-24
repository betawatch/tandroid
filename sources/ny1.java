// default package

import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ny1 extends HashMap {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ny1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                byte b = ((qy1) this.b).w;
                oy8 oy8Var = (oy8) super.get(obj);
                if (oy8Var != null) {
                    return oy8Var;
                }
                py1 py1Var = (py1) obj;
                oy8 oy8Var2 = new oy8(py1Var.c, gl.L(b), gl.L(b));
                put(py1Var, oy8Var2);
                return oy8Var2;
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
                ((ci7) this.b).f.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
