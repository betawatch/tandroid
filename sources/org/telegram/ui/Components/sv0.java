package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sv0 {
    public final i5 a;
    public Drawable b;

    public sv0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final i5 a(TLRPC.User user, TLRPC.Chat chat, int i9, boolean z10) {
        i5 i5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new fq(org.telegram.ui.ActionBar.f6.f1, org.telegram.ui.ActionBar.f6.i1);
            }
            this.b = drawable;
            i5Var.g(drawable, z10);
            i5Var.k(null);
            return i5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            i5Var.k(Integer.valueOf(i9));
            return i5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new fq(org.telegram.ui.ActionBar.f6.f1, org.telegram.ui.ActionBar.f6.i1);
            }
            this.b = drawable2;
            i5Var.g(drawable2, z10);
            i5Var.k(null);
            return i5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            i5Var.k(Integer.valueOf(i9));
            return i5Var;
        }
        if (user == null || !user.premium) {
            i5Var.g(null, z10);
            i5Var.k(null);
            return i5Var;
        }
        i5Var.g(zf.a1.d().e, z10);
        i5Var.k(Integer.valueOf(i9));
        return i5Var;
    }

    public sv0(int i9, View view) {
        this.a = new i5(AndroidUtilities.dp(i9), view);
    }
}
