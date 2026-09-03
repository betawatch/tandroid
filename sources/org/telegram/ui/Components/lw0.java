package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lw0 {
    public final j5 a;
    public Drawable b;

    public lw0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final j5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z4) {
        j5 j5Var = this.a;
        if (chat != null && chat.verified) {
            Drawable drawable = this.b;
            if (drawable == null) {
                drawable = new mq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1);
            }
            this.b = drawable;
            j5Var.g(drawable, z4);
            j5Var.k(null);
            return j5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            j5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z4);
            j5Var.k(Integer.valueOf(i10));
            return j5Var;
        }
        if (user != null && user.verified) {
            Drawable drawable2 = this.b;
            if (drawable2 == null) {
                drawable2 = new mq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1);
            }
            this.b = drawable2;
            j5Var.g(drawable2, z4);
            j5Var.k(null);
            return j5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            j5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z4);
            j5Var.k(Integer.valueOf(i10));
            return j5Var;
        }
        if (user == null || !user.premium) {
            j5Var.g(null, z4);
            j5Var.k(null);
            return j5Var;
        }
        j5Var.g(eg.r1.d().e, z4);
        j5Var.k(Integer.valueOf(i10));
        return j5Var;
    }

    public lw0(int i10, View view) {
        this.a = new j5(AndroidUtilities.dp(i10), view);
    }
}
