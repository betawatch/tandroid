package org.telegram.ui.Components;

import android.util.Property;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class uf extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ChatActivityEnterView.RecordCircle) obj).getScale());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ChatActivityEnterView.RecordCircle) obj).setScale(((Float) obj2).floatValue());
    }
}
