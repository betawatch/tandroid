package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yf extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean isOutOwner() {
        return true;
    }

    @Override // org.telegram.messenger.MessageObject
    public final boolean needDrawShareButton() {
        return false;
    }
}
