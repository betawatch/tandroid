package ka;

import java.util.Map;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
