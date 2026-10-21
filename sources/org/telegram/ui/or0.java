package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
