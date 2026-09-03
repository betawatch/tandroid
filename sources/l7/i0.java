package l7;

import java.util.Map;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
