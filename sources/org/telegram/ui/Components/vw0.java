package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class vw0 {
    public final o5 a;
    public Drawable b;

    public vw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final o5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        o5 o5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new qq(org.telegram.ui.ActionBar.h6.f1, org.telegram.ui.ActionBar.h6.i1);
            }
            this.b = drawable;
            o5Var.g(drawable, z10);
            o5Var.k(null);
            return o5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            o5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            o5Var.k(Integer.valueOf(i10));
            return o5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new qq(org.telegram.ui.ActionBar.h6.f1, org.telegram.ui.ActionBar.h6.i1);
            }
            this.b = drawable2;
            o5Var.g(drawable2, z10);
            o5Var.k(null);
            return o5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            o5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            o5Var.k(Integer.valueOf(i10));
            return o5Var;
        }
        if (user == null || !user.premium) {
            o5Var.g(null, z10);
            o5Var.k(null);
            return o5Var;
        }
        o5Var.g(rg.a1.d().e, z10);
        o5Var.k(Integer.valueOf(i10));
        return o5Var;
    }

    public vw0(int i10, View view) {
        this.a = new o5(AndroidUtilities.dp(i10), view);
    }
}
