package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ns0 extends FloatProperty {
    public ns0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((qv0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((qv0) obj).b(f7);
    }
}
