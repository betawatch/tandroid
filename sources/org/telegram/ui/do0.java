package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class do0 extends FloatProperty {
    public do0() {
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
