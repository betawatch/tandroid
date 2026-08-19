package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class g implements PrivilegedAction {
    public final /* synthetic */ ArrayList a;

    public g(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                h hVar = (h) h.class.cast(Class.forName(property, true, h.class.getClassLoader()).newInstance());
                h.b(hVar);
                this.a.add(hVar);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        h.b(new h());
        return null;
    }
}
