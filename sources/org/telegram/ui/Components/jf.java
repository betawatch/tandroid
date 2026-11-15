package org.telegram.ui.Components;

import android.util.Property;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jf extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((ChatActivityEnterView.RecordCircle) obj).getControlsScale());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ChatActivityEnterView.RecordCircle) obj).setControlsScale(((Float) obj2).floatValue());
    }
}
