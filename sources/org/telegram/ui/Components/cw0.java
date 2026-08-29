package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cw0 {
    public final n5 a;
    public Drawable b;

    public cw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final n5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        n5 n5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new jq(org.telegram.ui.ActionBar.g6.f1, org.telegram.ui.ActionBar.g6.i1);
            }
            this.b = drawable;
            n5Var.g(drawable, z10);
            n5Var.k(null);
            return n5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new jq(org.telegram.ui.ActionBar.g6.f1, org.telegram.ui.ActionBar.g6.i1);
            }
            this.b = drawable2;
            n5Var.g(drawable2, z10);
            n5Var.k(null);
            return n5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            n5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            n5Var.k(Integer.valueOf(i10));
            return n5Var;
        }
        if (user == null || !user.premium) {
            n5Var.g(null, z10);
            n5Var.k(null);
            return n5Var;
        }
        n5Var.g(cg.s1.d().e, z10);
        n5Var.k(Integer.valueOf(i10));
        return n5Var;
    }

    public cw0(int i10, View view) {
        this.a = new n5(AndroidUtilities.dp(i10), view);
    }
}
