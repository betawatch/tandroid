package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hs0 extends FloatProperty {
    public hs0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((kv0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f7) {
        ((kv0) obj).b(f7);
    }
}
