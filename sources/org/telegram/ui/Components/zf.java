package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class zf extends MessageObject {
    @Override // org.telegram.messenger.MessageObject
    public final boolean isOutOwner() {
        return true;
    }

    @Override // org.telegram.messenger.MessageObject
    public final boolean needDrawShareButton() {
        return false;
    }
}
