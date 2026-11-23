package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class o2 extends n2 {
    public final TL_keyboard.KeyboardInlineButton a;

    public o2(TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        this.a = keyboardInlineButton;
    }

    @Override // org.telegram.messenger.n2
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

    @Override // org.telegram.messenger.n2
    public final long b() {
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.a.style;
        if (keyboardButtonStyle != null) {
            return keyboardButtonStyle.icon;
        }
        return 0L;
    }

    @Override // org.telegram.messenger.n2
    public final String d() {
        return this.a.text;
    }
}
