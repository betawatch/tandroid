package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
