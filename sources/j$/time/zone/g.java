package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class g implements PrivilegedAction {
    public final /* synthetic */ List a;

    public g(List list) {
        this.a = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                h hVar = (h) h.class.cast(Class.forName(property, true, h.class.getClassLoader()).newInstance());
                h.b(hVar);
                ((ArrayList) this.a).add(hVar);
                return null;
            } catch (Exception e6) {
                throw new Error(e6);
            }
        }
        h.b(new h());
        return null;
    }
}
