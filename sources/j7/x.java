package j7;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements q9.d {
    public static final /* synthetic */ x b = new x(0);
    public static final /* synthetic */ x c = new x(1);
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i9) {
        this.a = i9;
    }

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                q9.e eVar = (q9.e) obj2;
                eVar.g(y.g, entry.getKey());
                eVar.g(y.h, entry.getValue());
                return;
            default:
                throw new q9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
