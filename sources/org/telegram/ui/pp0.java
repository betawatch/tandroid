package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pp0 extends FloatProperty {
    public pp0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ms0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((ms0) obj).b(f7);
    }
}
