package org.telegram.ui.Components;

import android.util.Property;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class vf extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ChatActivityEnterView.RecordCircle) obj).getScale());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ChatActivityEnterView.RecordCircle) obj).setScale(((Float) obj2).floatValue());
    }
}
