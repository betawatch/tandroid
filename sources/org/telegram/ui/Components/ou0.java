package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ou0 {
    public final f5 a;
    public Drawable b;

    public ou0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final f5 a(TLObject tLObject, int i7, boolean z9) {
        return tLObject instanceof TLRPC.User ? b((TLRPC.User) tLObject, null, i7, z9) : tLObject instanceof TLRPC.Chat ? b(null, (TLRPC.Chat) tLObject, i7, z9) : b(null, null, i7, z9);
    }

    public final f5 b(TLRPC.User user, TLRPC.Chat chat, int i7, boolean z9) {
        f5 f5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new xp(org.telegram.ui.ActionBar.m6.f1, org.telegram.ui.ActionBar.m6.i1);
            }
            this.b = drawable;
            f5Var.g(drawable, z9);
            f5Var.k(null);
            return f5Var;
        }
        if (chat != null && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            f5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z9);
            f5Var.k(Integer.valueOf(i7));
            return f5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new xp(org.telegram.ui.ActionBar.m6.f1, org.telegram.ui.ActionBar.m6.i1);
            }
            this.b = drawable2;
            f5Var.g(drawable2, z9);
            f5Var.k(null);
            return f5Var;
        }
        if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            f5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z9);
            f5Var.k(Integer.valueOf(i7));
            return f5Var;
        }
        if (user == null || !user.premium) {
            f5Var.g(null, z9);
            f5Var.k(null);
            return f5Var;
        }
        f5Var.g((Drawable) ia.e.d().f, z9);
        f5Var.k(Integer.valueOf(i7));
        return f5Var;
    }

    public ou0(int i7, View view) {
        this.a = new f5(org.telegram.messenger.g0.L(i7), view);
    }
}
