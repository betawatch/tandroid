package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class go0 extends FloatProperty {
    public go0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((fr0) obj).a);
    }

    public final void setValue(Object obj, float f10) {
        ((fr0) obj).b(f10);
    }
}
