package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jx0 {
    public final p5 a;
    public Drawable b;

    public jx0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final p5 a(TLObject tLObject, boolean z10, int i10) {
        return tLObject instanceof TLRPC.User ? b((TLRPC.User) tLObject, null, i10, z10) : tLObject instanceof TLRPC.Chat ? b(null, (TLRPC.Chat) tLObject, i10, z10) : b(null, null, i10, z10);
    }

    public final p5 b(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        p5 p5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new yq(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1);
            }
            this.b = drawable;
            p5Var.g(drawable, z10);
            p5Var.k(null);
            return p5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            p5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            p5Var.k(Integer.valueOf(i10));
            return p5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new yq(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1);
            }
            this.b = drawable2;
            p5Var.g(drawable2, z10);
            p5Var.k(null);
            return p5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            p5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            p5Var.k(Integer.valueOf(i10));
            return p5Var;
        }
        if (user == null || !user.premium) {
            p5Var.g(null, z10);
            p5Var.k(null);
            return p5Var;
        }
        p5Var.g(sg.b1.d().e, z10);
        p5Var.k(Integer.valueOf(i10));
        return p5Var;
    }

    public jx0(int i10, View view) {
        this.a = new p5(AndroidUtilities.dp(i10), view);
    }
}
