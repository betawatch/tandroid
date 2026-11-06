package a8;

import java.util.Map;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements na.d {
    public static final /* synthetic */ o0 b = new o0(0);
    public static final /* synthetic */ o0 c = new o0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ o0(int i7) {
        this.a = i7;
    }

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(q0.g, entry.getKey());
                eVar.a(q0.h, entry.getValue());
                return;
            default:
                throw new na.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
