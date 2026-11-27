// default package

import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class ehb {
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
