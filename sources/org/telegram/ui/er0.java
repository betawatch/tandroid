package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class er0 extends FloatProperty {
    public er0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((iu0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f10) {
        ((iu0) obj).b(f10);
    }
}
