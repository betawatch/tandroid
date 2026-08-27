package i7;

import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements r9.d {
    public static final /* synthetic */ i0 b = new i0(0);
    public static final /* synthetic */ i0 c = new i0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ i0(int i10) {
        this.a = i10;
    }

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                r9.e eVar = (r9.e) obj2;
                eVar.a(j0.g, entry.getKey());
                eVar.a(j0.h, entry.getValue());
                return;
            default:
                throw new r9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
