package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class go0 extends FloatProperty {
    public go0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((cr0) obj).a);
    }

    public final void setValue(Object obj, float f10) {
        ((cr0) obj).b(f10);
    }
}
