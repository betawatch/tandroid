package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class r2 extends q2 {
    public final TL_keyboard.KeyboardInlineButton a;

    public r2(TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        this.a = keyboardInlineButton;
    }

    @Override // org.telegram.messenger.q2
    public final int a() {
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.a.style;
        if (keyboardButtonStyle == null) {
            return 1;
        }
        if (keyboardButtonStyle.bg_success) {
            return 3;
        }
        if (keyboardButtonStyle.bg_danger) {
            return 4;
        }
        return keyboardButtonStyle.bg_primary ? 2 : 1;
    }

    @Override // org.telegram.messenger.q2
    public final long b() {
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.a.style;
        if (keyboardButtonStyle != null) {
            return keyboardButtonStyle.icon;
        }
        return 0L;
    }

    @Override // org.telegram.messenger.q2
    public final String d() {
        return this.a.text;
    }
}
