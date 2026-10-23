package la;

import java.util.Map;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ja.d {
    public final /* synthetic */ int a;

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new ja.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ja.e eVar = (ja.e) obj2;
                eVar.d(ma.f.g, entry.getKey());
                eVar.d(ma.f.h, entry.getValue());
                return;
            default:
                throw new ja.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
