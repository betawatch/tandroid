// default package

import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hq0 extends gq0 {
    public final TL_keyboard.KeyboardInlineButton a;

    public hq0(TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        this.a = keyboardInlineButton;
    }

    @Override // gq0
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

    @Override // gq0
    public final long b() {
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.a.style;
        if (keyboardButtonStyle != null) {
            return keyboardButtonStyle.icon;
        }
        return 0L;
    }

    @Override // gq0
    public final String d() {
        return this.a.text;
    }
}
