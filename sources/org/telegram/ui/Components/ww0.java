package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ww0 {
    public final o5 a;
    public Drawable b;

    public ww0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final o5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        o5 o5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new pq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1);
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
                drawable2 = new pq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1);
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

    public ww0(int i10, View view) {
        this.a = new o5(AndroidUtilities.dp(i10), view);
    }
}
