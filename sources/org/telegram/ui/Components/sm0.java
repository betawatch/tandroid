package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sm0 extends org.telegram.ui.Cells.i7 {
    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        return MediaController.getInstance().playMessage(messageObject);
    }
}
