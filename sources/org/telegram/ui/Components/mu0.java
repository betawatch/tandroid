package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mu0 {
    public final e5 a;
    public Drawable b;

    public mu0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final e5 a(TLObject tLObject, int i3, boolean z10) {
        return tLObject instanceof TLRPC.User ? b((TLRPC.User) tLObject, null, i3, z10) : tLObject instanceof TLRPC.Chat ? b(null, (TLRPC.Chat) tLObject, i3, z10) : b(null, null, i3, z10);
    }

    public final e5 b(TLRPC.User user, TLRPC.Chat chat, int i3, boolean z10) {
        e5 e5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new xp(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1);
            }
            this.b = drawable;
            e5Var.g(drawable, z10);
            e5Var.k(null);
            return e5Var;
        }
        if (chat != null && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z10);
            e5Var.k(Integer.valueOf(i3));
            return e5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new xp(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1);
            }
            this.b = drawable2;
            e5Var.g(drawable2, z10);
            e5Var.k(null);
            return e5Var;
        }
        if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z10);
            e5Var.k(Integer.valueOf(i3));
            return e5Var;
        }
        if (user == null || !user.premium) {
            e5Var.g(null, z10);
            e5Var.k(null);
            return e5Var;
        }
        e5Var.g((Drawable) ha.e.d().f, z10);
        e5Var.k(Integer.valueOf(i3));
        return e5Var;
    }

    public mu0(int i3, View view) {
        this.a = new e5(org.telegram.messenger.g0.L(i3), view);
    }
}
