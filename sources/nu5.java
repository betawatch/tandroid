// default package

import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class nu5 implements zn7 {
    public final /* synthetic */ byte a;

    @Override // q24
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new t24("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ao7 ao7Var = (ao7) obj2;
                ao7Var.a(ht8.f, entry.getKey());
                ao7Var.a(ht8.g, entry.getValue());
                return;
            default:
                throw new t24("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
