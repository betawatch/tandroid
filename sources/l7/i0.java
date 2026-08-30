package l7;

import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements u9.d {
    public static final /* synthetic */ i0 b = new i0(0);
    public static final /* synthetic */ i0 c = new i0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ i0(int i10) {
        this.a = i10;
    }

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar = (u9.e) obj2;
                eVar.e(j0.g, entry.getKey());
                eVar.e(j0.h, entry.getValue());
                return;
            default:
                throw new u9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
