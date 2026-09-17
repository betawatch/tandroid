package org.telegram.ui.Components;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class sm0 extends org.telegram.ui.Cells.i7 {
    @Override // org.telegram.ui.Cells.i7
    public final boolean d(MessageObject messageObject) {
        return MediaController.getInstance().playMessage(messageObject);
    }
}
