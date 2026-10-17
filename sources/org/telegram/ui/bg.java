package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bg implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                ai.ud udVar = (ai.ud) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.d.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (snVar.getParentActivity() == null) {
                    return false;
                }
                if ((snVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !ag.d.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                snVar.ea(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    udVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ti.q((org.telegram.ui.Components.ti) this.b, (Context) this.c, (org.telegram.ui.ActionBar.d6) this.d, (org.telegram.ui.ActionBar.n2) this.e, view);
        }
    }
}
