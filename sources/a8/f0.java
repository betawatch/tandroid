package a8;

import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements ka.d {
    public static final /* synthetic */ f0 b = new f0(0);
    public static final /* synthetic */ f0 c = new f0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ f0(int i10) {
        this.a = i10;
    }

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ka.e eVar = (ka.e) obj2;
                eVar.a(g0.g, entry.getKey());
                eVar.a(g0.h, entry.getValue());
                return;
            default:
                throw new ka.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
