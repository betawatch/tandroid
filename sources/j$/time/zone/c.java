package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class c implements PrivilegedAction {
    final /* synthetic */ ArrayList a;

    c(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                e eVar = (e) e.class.cast(Class.forName(property, true, e.class.getClassLoader()).newInstance());
                e.d(eVar);
                this.a.add(eVar);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        e.d(new d());
        return null;
    }
}
