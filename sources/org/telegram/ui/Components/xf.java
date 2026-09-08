package org.telegram.ui.Components;

import android.util.Property;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xf extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ChatActivityEnterView.RecordCircle) obj).getControlsScale());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ChatActivityEnterView.RecordCircle) obj).setControlsScale(((Float) obj2).floatValue());
    }
}
