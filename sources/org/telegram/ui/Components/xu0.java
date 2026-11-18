package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xu0 {
    public final m5 a;
    public Drawable b;

    public xu0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final m5 a(TLObject tLObject, int i7, boolean z10) {
        return tLObject instanceof TLRPC.User ? b((TLRPC.User) tLObject, null, i7, z10) : tLObject instanceof TLRPC.Chat ? b(null, (TLRPC.Chat) tLObject, i7, z10) : b(null, null, i7, z10);
    }

    public final m5 b(TLRPC.User user, TLRPC.Chat chat, int i7, boolean z10) {
        m5 m5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new mq(org.telegram.ui.ActionBar.n6.f1, org.telegram.ui.ActionBar.n6.i1);
            }
            this.b = drawable;
            m5Var.g(drawable, z10);
            m5Var.k(null);
            return m5Var;
        }
        if (chat != null && org.telegram.messenger.n5.f(chat.emoji_status) != 0) {
            m5Var.j(org.telegram.messenger.n5.f(chat.emoji_status), z10);
            m5Var.k(Integer.valueOf(i7));
            return m5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new mq(org.telegram.ui.ActionBar.n6.f1, org.telegram.ui.ActionBar.n6.i1);
            }
            this.b = drawable2;
            m5Var.g(drawable2, z10);
            m5Var.k(null);
            return m5Var;
        }
        if (user != null && org.telegram.messenger.n5.f(user.emoji_status) != 0) {
            m5Var.j(org.telegram.messenger.n5.f(user.emoji_status), z10);
            m5Var.k(Integer.valueOf(i7));
            return m5Var;
        }
        if (user == null || !user.premium) {
            m5Var.g(null, z10);
            m5Var.k(null);
            return m5Var;
        }
        m5Var.g((Drawable) ia.e.d().f, z10);
        m5Var.k(Integer.valueOf(i7));
        return m5Var;
    }

    public xu0(int i7, View view) {
        this.a = new m5(org.telegram.messenger.g0.L(i7), view);
    }
}
