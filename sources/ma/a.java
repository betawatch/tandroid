package ma;

import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
