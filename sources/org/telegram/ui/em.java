package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Components.r6 {
    @Override // org.telegram.ui.Components.r6
    public final void c(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentScale = f7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
