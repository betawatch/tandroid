package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class rx0 {
    public final r5 a;
    public Drawable b;

    public rx0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final r5 a(TLObject tLObject, boolean z10, int i10) {
        return tLObject instanceof TLRPC.User ? b((TLRPC.User) tLObject, null, i10, z10) : tLObject instanceof TLRPC.Chat ? b(null, (TLRPC.Chat) tLObject, i10, z10) : b(null, null, i10, z10);
    }

    public final r5 b(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        r5 r5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new ar(org.telegram.ui.ActionBar.y6.f1, org.telegram.ui.ActionBar.y6.i1);
            }
            this.b = drawable;
            r5Var.g(drawable, z10);
            r5Var.k(null);
            return r5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            r5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            r5Var.k(Integer.valueOf(i10));
            return r5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new ar(org.telegram.ui.ActionBar.y6.f1, org.telegram.ui.ActionBar.y6.i1);
            }
            this.b = drawable2;
            r5Var.g(drawable2, z10);
            r5Var.k(null);
            return r5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            r5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            r5Var.k(Integer.valueOf(i10));
            return r5Var;
        }
        if (user == null || !user.premium) {
            r5Var.g(null, z10);
            r5Var.k(null);
            return r5Var;
        }
        r5Var.g(tg.b1.d().e, z10);
        r5Var.k(Integer.valueOf(i10));
        return r5Var;
    }

    public rx0(int i10, View view) {
        this.a = new r5(AndroidUtilities.dp(i10), view);
    }
}
