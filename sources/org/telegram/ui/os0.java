package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class os0 extends FloatProperty {
    public os0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((rv0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((rv0) obj).b(f7);
    }
}
