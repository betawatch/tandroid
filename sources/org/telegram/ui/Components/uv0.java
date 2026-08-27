package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uv0 {
    public final i5 a;
    public Drawable b;

    public uv0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final i5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        i5 i5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new dq(org.telegram.ui.ActionBar.g6.f1, org.telegram.ui.ActionBar.g6.i1);
            }
            this.b = drawable;
            i5Var.g(drawable, z10);
            i5Var.k(null);
            return i5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            i5Var.k(Integer.valueOf(i10));
            return i5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new dq(org.telegram.ui.ActionBar.g6.f1, org.telegram.ui.ActionBar.g6.i1);
            }
            this.b = drawable2;
            i5Var.g(drawable2, z10);
            i5Var.k(null);
            return i5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            i5Var.k(Integer.valueOf(i10));
            return i5Var;
        }
        if (user == null || !user.premium) {
            i5Var.g(null, z10);
            i5Var.k(null);
            return i5Var;
        }
        i5Var.g(ag.j2.d().e, z10);
        i5Var.k(Integer.valueOf(i10));
        return i5Var;
    }

    public uv0(int i10, View view) {
        this.a = new i5(AndroidUtilities.dp(i10), view);
    }
}
