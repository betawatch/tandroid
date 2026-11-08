package org.telegram.ui.Components;

import android.util.Property;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ef extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ChatActivityEnterView.RecordCircle) obj).getControlsScale());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ChatActivityEnterView.RecordCircle) obj).setControlsScale(((Float) obj2).floatValue());
    }
}
