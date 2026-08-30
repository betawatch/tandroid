package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Components.m6 {
    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentScale = f10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
