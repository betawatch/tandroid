package org.telegram.tgnet.tl;

import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static byte[] a(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
        if (type instanceof TL_keyboard.TL_inlineButtonTypeCallback) {
            return ((TL_keyboard.TL_inlineButtonTypeCallback) type).data;
        }
        return null;
    }

    public static String b(TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        TL_keyboard.ButtonTypeProto type = keyboardButtonProto.getType();
        if (type instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
            return ((TL_keyboard.TL_inlineButtonTypeUrl) type).url;
        }
        if (type instanceof TL_keyboard.TL_inlineButtonTypeUrlAuth) {
            return ((TL_keyboard.TL_inlineButtonTypeUrlAuth) type).url;
        }
        if (type instanceof TL_keyboard.TL_inlineButtonTypeWebView) {
            return ((TL_keyboard.TL_inlineButtonTypeWebView) type).url;
        }
        if (type instanceof TL_keyboard.TL_buttonTypeSimpleWebView) {
            return ((TL_keyboard.TL_buttonTypeSimpleWebView) type).url;
        }
        return null;
    }
}
