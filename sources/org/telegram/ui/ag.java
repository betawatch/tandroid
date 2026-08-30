package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ag(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                xn xnVar = (xn) this.b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                gg.q qVar = (gg.q) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) mf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (xnVar.getParentActivity() == null) {
                    return false;
                }
                if ((xnVar.L0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !mf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                xnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    qVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.li.q((org.telegram.ui.Components.li) this.b, (Context) this.c, (org.telegram.ui.ActionBar.f6) this.d, (org.telegram.ui.ActionBar.p2) this.e, view);
        }
    }
}
