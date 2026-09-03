package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pf extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean isOutOwner() {
        return true;
    }

    @Override // org.telegram.messenger.MessageObject
    public final boolean needDrawShareButton() {
        return false;
    }
}
