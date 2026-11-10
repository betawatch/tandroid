package c8;

import java.util.Map;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements na.d {
    public static final /* synthetic */ x b = new x(0);
    public static final /* synthetic */ x c = new x(1);
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i7) {
        this.a = i7;
    }

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                na.e eVar = (na.e) obj2;
                eVar.a(y.g, entry.getKey());
                eVar.a(y.h, entry.getValue());
                return;
            default:
                throw new na.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
