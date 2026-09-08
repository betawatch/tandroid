package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hs0 extends FloatProperty {
    public hs0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((jv0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f7) {
        ((jv0) obj).b(f7);
    }
}
