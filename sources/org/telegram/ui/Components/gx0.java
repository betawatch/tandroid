package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class gx0 {
    public final p5 a;
    public Drawable b;

    public gx0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final p5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        p5 p5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new zq(org.telegram.ui.ActionBar.h6.f1, org.telegram.ui.ActionBar.h6.i1);
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
                drawable2 = new zq(org.telegram.ui.ActionBar.h6.f1, org.telegram.ui.ActionBar.h6.i1);
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

    public gx0(int i10, View view) {
        this.a = new p5(AndroidUtilities.dp(i10), view);
    }
}
