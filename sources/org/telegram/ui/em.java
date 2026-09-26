package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Components.r6 {
    @Override // org.telegram.ui.Components.r6
    public final void b(Object obj, float f7) {
        ((MessageObject.SendAnimationData) obj).currentScale = f7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
