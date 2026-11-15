package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class do0 extends FloatProperty {
    public do0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ar0) obj).a);
    }

    public final void setValue(Object obj, float f10) {
        ((ar0) obj).b(f10);
    }
}
