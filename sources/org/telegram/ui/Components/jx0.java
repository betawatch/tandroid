package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jx0 {
    public final q5 a;
    public Drawable b;

    public jx0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final q5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        q5 q5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new cr(org.telegram.ui.ActionBar.g6.f1, org.telegram.ui.ActionBar.g6.i1);
            }
            this.b = drawable;
            q5Var.g(drawable, z10);
            q5Var.k(null);
            return q5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            q5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            q5Var.k(Integer.valueOf(i10));
            return q5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new cr(org.telegram.ui.ActionBar.g6.f1, org.telegram.ui.ActionBar.g6.i1);
            }
            this.b = drawable2;
            q5Var.g(drawable2, z10);
            q5Var.k(null);
            return q5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            q5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            q5Var.k(Integer.valueOf(i10));
            return q5Var;
        }
        if (user == null || !user.premium) {
            q5Var.g(null, z10);
            q5Var.k(null);
            return q5Var;
        }
        q5Var.g(sg.b1.d().e, z10);
        q5Var.k(Integer.valueOf(i10));
        return q5Var;
    }

    public jx0(int i10, View view) {
        this.a = new q5(AndroidUtilities.dp(i10), view);
    }
}
