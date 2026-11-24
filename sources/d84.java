// default package

import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d84 extends wo9 {
    public final HashMap e = new HashMap();

    @Override // wo9
    public final to9 h(Object obj) {
        return (to9) this.e.get(obj);
    }

    @Override // wo9
    public final Object i(Object obj) {
        Object i = super.i(obj);
        this.e.remove(obj);
        return i;
    }
}
