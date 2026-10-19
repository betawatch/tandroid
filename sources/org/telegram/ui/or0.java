package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class or0 extends FloatProperty {
    public or0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((qu0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((qu0) obj).b(f7);
    }
}
