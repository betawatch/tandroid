// default package

import android.util.FloatProperty;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e78 extends FloatProperty {
    public e78() {
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
