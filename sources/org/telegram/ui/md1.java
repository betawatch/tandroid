package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class md1 extends org.telegram.ui.Components.jw0 {
    public boolean w0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        R();
        if (getKeyboardHeight() != 0 || this.w0) {
            this.w0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i12 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            this.f = i12;
            setPadding(0, 0, 0, i12);
        }
        super.onMeasure(i10, i11);
    }
}
