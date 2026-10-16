package la;

import java.util.Map;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
