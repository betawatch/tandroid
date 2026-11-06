package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class co0 extends FloatProperty {
    public co0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((br0) obj).a);
    }

    public final void setValue(Object obj, float f10) {
        ((br0) obj).b(f10);
    }
}
