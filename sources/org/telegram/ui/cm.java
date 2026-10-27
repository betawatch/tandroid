package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cm extends org.telegram.ui.Components.u6 {
    @Override // org.telegram.ui.Components.u6
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentScale = f7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
