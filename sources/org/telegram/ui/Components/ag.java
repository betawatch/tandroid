package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ag extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean isOutOwner() {
        return true;
    }

    @Override // org.telegram.messenger.MessageObject
    public final boolean needDrawShareButton() {
        return false;
    }
}
