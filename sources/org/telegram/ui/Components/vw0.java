package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vw0 {
    public final n5 a;
    public Drawable b;

    public vw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final n5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        n5 n5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new vq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1);
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
                drawable2 = new vq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1);
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
        n5Var.g(qg.d1.d().e, z10);
        n5Var.k(Integer.valueOf(i10));
        return n5Var;
    }

    public vw0(int i10, View view) {
        this.a = new n5(AndroidUtilities.dp(i10), view);
    }
}
