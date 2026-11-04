package oa;

import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ma.d {
    public final /* synthetic */ int a;

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new ma.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ma.e eVar = (ma.e) obj2;
                eVar.a(pa.e.g, entry.getKey());
                eVar.a(pa.e.h, entry.getValue());
                return;
            default:
                throw new ma.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
