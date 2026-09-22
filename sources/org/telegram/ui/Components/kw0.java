package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kw0 {
    public final m5 a;
    public Drawable b;

    public kw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final m5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        m5 m5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new pq(org.telegram.ui.ActionBar.i6.f1, org.telegram.ui.ActionBar.i6.i1);
            }
            this.b = drawable;
            m5Var.g(drawable, z10);
            m5Var.k(null);
            return m5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            m5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            m5Var.k(Integer.valueOf(i10));
            return m5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new pq(org.telegram.ui.ActionBar.i6.f1, org.telegram.ui.ActionBar.i6.i1);
            }
            this.b = drawable2;
            m5Var.g(drawable2, z10);
            m5Var.k(null);
            return m5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            m5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            m5Var.k(Integer.valueOf(i10));
            return m5Var;
        }
        if (user == null || !user.premium) {
            m5Var.g(null, z10);
            m5Var.k(null);
            return m5Var;
        }
        m5Var.g(rg.a1.d().e, z10);
        m5Var.k(Integer.valueOf(i10));
        return m5Var;
    }

    public kw0(int i10, View view) {
        this.a = new m5(AndroidUtilities.dp(i10), view);
    }
}
