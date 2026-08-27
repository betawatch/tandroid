package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gr0 extends FloatProperty {
    public gr0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((ju0) obj).a);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f10) {
        ((ju0) obj).b(f10);
    }
}
