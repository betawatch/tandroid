package ma;

import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ka.d {
    public final /* synthetic */ int a;

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new ka.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(na.e.g, entry.getKey());
                eVar.a(na.e.h, entry.getValue());
                return;
            default:
                throw new ka.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
