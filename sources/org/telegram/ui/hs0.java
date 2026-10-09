package org.telegram.ui;

import android.util.FloatProperty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hs0 extends FloatProperty {
    public hs0() {
        super("progress");
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((lv0) obj).a);
    }

    public final void setValue(Object obj, float f7) {
        ((lv0) obj).b(f7);
    }
}
