package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
