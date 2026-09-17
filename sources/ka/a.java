package ka;

import java.util.Map;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ia.d {
    public final /* synthetic */ int a;

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new ia.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ia.e eVar = (ia.e) obj2;
                eVar.a(la.f.g, entry.getKey());
                eVar.a(la.f.h, entry.getValue());
                return;
            default:
                throw new ia.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
