package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class g implements PrivilegedAction {
    public final /* synthetic */ List a;

    public g(List list) {
        this.a = list;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property == null) {
            h.b(new h());
            return null;
        }
        try {
            h hVar = (h) h.class.cast(Class.forName(property, true, h.class.getClassLoader()).newInstance());
            h.b(hVar);
            ((ArrayList) this.a).add(hVar);
            return null;
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
