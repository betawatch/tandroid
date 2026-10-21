package la;

import java.util.Map;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
