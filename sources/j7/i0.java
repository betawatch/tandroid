package j7;

import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements s9.d {
    public static final /* synthetic */ i0 b = new i0(0);
    public static final /* synthetic */ i0 c = new i0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ i0(int i10) {
        this.a = i10;
    }

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                s9.e eVar = (s9.e) obj2;
                eVar.e(j0.g, entry.getKey());
                eVar.e(j0.h, entry.getValue());
                return;
            default:
                throw new s9.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
