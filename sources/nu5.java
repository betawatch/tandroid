// default package

import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class nu5 implements zn7 {
    public final /* synthetic */ byte a;

    @Override // q24
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new t24("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ao7 ao7Var = (ao7) obj2;
                ao7Var.a(ht8.f, entry.getKey());
                ao7Var.a(ht8.g, entry.getValue());
                return;
            default:
                throw new t24("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
