package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class np0 extends FloatProperty {
    public np0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ls0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((ls0) obj).b(f7);
    }
}
