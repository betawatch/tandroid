package ka;

import java.util.Map;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
