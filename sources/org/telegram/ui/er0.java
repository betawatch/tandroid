package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class er0 extends FloatProperty {
    public er0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((gu0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f9) {
        ((gu0) obj).b(f9);
    }
}
