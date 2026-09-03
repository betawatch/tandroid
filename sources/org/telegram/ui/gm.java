package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gm extends org.telegram.ui.Components.m6 {
    @Override // org.telegram.ui.Components.m6
    public final void b(Object obj, float f10) {
        ((MessageObject.SendAnimationData) obj).currentScale = f10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((MessageObject.SendAnimationData) obj).currentScale);
    }
}
