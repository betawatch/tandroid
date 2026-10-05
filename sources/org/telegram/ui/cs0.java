package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cs0 extends FloatProperty {
    public cs0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((fv0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f7) {
        ((fv0) obj).b(f7);
    }
}
