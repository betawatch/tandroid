package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
