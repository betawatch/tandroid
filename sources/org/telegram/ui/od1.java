package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class od1 extends org.telegram.ui.Components.xu0 {
    public boolean s0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        R();
        if (getKeyboardHeight() != 0 || this.s0) {
            this.s0 = true;
            setPadding(0, 0, 0, 0);
        } else {
            int i11 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            this.f = i11;
            setPadding(0, 0, 0, i11);
        }
        super.onMeasure(i9, i10);
    }
}
