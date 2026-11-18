package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
