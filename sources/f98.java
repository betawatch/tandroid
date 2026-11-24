// default package

import android.util.FloatProperty;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f98 extends FloatProperty {
    public f98() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((vb8) obj).a);
    }

    public final void setValue(Object obj, float f) {
        ((vb8) obj).b(f);
    }
}
