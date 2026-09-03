package n7;

import java.util.Map;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements u9.d {
    public static final /* synthetic */ x b = new x(0);
    public static final /* synthetic */ x c = new x(1);
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i10) {
        this.a = i10;
    }

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                u9.e eVar = (u9.e) obj2;
                eVar.e(y.g, entry.getKey());
                eVar.e(y.h, entry.getValue());
                return;
            default:
                throw new u9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
