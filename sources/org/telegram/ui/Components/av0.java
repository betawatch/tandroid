package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class av0 {
    public final n5 a;
    public Drawable b;

    public av0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final n5 a(TLObject tLObject, int i7, boolean z10) {
        return tLObject instanceof TLRPC.User ? b((TLRPC.User) tLObject, null, i7, z10) : tLObject instanceof TLRPC.Chat ? b(null, (TLRPC.Chat) tLObject, i7, z10) : b(null, null, i7, z10);
    }

    public final n5 b(TLRPC.User user, TLRPC.Chat chat, int i7, boolean z10) {
        n5 n5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new oq(org.telegram.ui.ActionBar.m6.f1, org.telegram.ui.ActionBar.m6.i1);
            }
            this.b = drawable;
            n5Var.g(drawable, z10);
            n5Var.k(null);
            return n5Var;
        }
        if (chat != null && org.telegram.messenger.n5.f(chat.emoji_status) != 0) {
            n5Var.j(org.telegram.messenger.n5.f(chat.emoji_status), z10);
            n5Var.k(Integer.valueOf(i7));
            return n5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new oq(org.telegram.ui.ActionBar.m6.f1, org.telegram.ui.ActionBar.m6.i1);
            }
            this.b = drawable2;
            n5Var.g(drawable2, z10);
            n5Var.k(null);
            return n5Var;
        }
        if (user != null && org.telegram.messenger.n5.f(user.emoji_status) != 0) {
            n5Var.j(org.telegram.messenger.n5.f(user.emoji_status), z10);
            n5Var.k(Integer.valueOf(i7));
            return n5Var;
        }
        if (user == null || !user.premium) {
            n5Var.g(null, z10);
            n5Var.k(null);
            return n5Var;
        }
        n5Var.g((Drawable) ia.e.d().f, z10);
        n5Var.k(Integer.valueOf(i7));
        return n5Var;
    }

    public av0(int i7, View view) {
        this.a = new n5(org.telegram.messenger.g0.L(i7), view);
    }
}
