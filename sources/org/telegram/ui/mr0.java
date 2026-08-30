package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mr0 extends FloatProperty {
    public mr0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((qu0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f10) {
        ((qu0) obj).b(f10);
    }
}
