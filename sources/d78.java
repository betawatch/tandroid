// default package

import android.util.FloatProperty;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d78 extends FloatProperty {
    public d78() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((u98) obj).a);
    }

    public final void setValue(Object obj, float f) {
        ((u98) obj).b(f);
    }
}
