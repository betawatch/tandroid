package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xf extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean isOutOwner() {
        return true;
    }

    @Override // org.telegram.messenger.MessageObject
    public final boolean needDrawShareButton() {
        return false;
    }
}
