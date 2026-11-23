package cg;

import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class c {
    public static TL_keyboard.ButtonTypeProto a(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        if (keyboardButtonProto == null) {
            return null;
        }
        TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
        if (cls.isInstance(type)) {
            return (TL_keyboard.ButtonTypeProto) cls.cast(type);
        }
        return null;
    }

    public static boolean b(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        return c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeWebView.class) || c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
    }

    public static boolean c(TL_keyboard.KeyboardButtonProto keyboardButtonProto, Class cls) {
        return a(keyboardButtonProto, cls) != null;
    }
}
