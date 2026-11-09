package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fo0 extends FloatProperty {
    public fo0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((er0) obj).a);
    }

    public final void setValue(Object obj, float f10) {
        ((er0) obj).b(f10);
    }
}
