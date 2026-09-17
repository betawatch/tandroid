package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.Components.s6 {
    @Override // org.telegram.ui.Components.s6
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentScale = f7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
