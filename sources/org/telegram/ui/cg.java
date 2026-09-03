package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cg implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cg(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                zn znVar = (zn) this.b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                gg.q qVar = (gg.q) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) lf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (znVar.getParentActivity() == null) {
                    return false;
                }
                if ((znVar.L0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !lf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                znVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
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
