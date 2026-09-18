package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class tm0 extends org.telegram.ui.Cells.i7 {
    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        return MediaController.getInstance().playMessage(messageObject);
    }
}
