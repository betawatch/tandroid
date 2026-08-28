package f7;

import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements q9.d {
    public static final /* synthetic */ j b = new j(0);
    public static final /* synthetic */ j c = new j(1);
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i9) {
        this.a = i9;
    }

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                q9.e eVar = (q9.e) obj2;
                eVar.g(k.g, entry.getKey());
                eVar.g(k.h, entry.getValue());
                return;
            default:
                throw new q9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
