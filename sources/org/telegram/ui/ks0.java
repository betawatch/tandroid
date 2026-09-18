package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ks0 extends FloatProperty {
    public ks0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((mv0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f7) {
        ((mv0) obj).b(f7);
    }
}
