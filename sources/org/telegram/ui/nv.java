package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nv extends org.telegram.ui.Components.bz0 {
    public final /* synthetic */ n3.b I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(Context context, long j10, n3.b bVar) {
        super(context);
        this.I = bVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.r = r6Var;
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(false, true, false);
        this.s = r6Var2;
        r6Var.setCallback(this);
        r6Var2.setCallback(this);
        this.n = Long.valueOf(j10);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        k9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.h = imageReceiver;
        imageReceiver.setParentView(this);
        if (j10 == Long.MAX_VALUE) {
            this.v = LocaleController.getString(R.string.CacheOtherChats);
            k9Var.g(14);
            imageReceiver.setForUserOrChat(null, k9Var);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, k9Var, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j10));
            this.v = dialogPhotoTitle;
            this.v = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }

    @Override // org.telegram.ui.Components.bz0
    public final void b() {
        n3.b bVar = this.I;
        d7 d7Var = (d7) bVar.c;
        d7Var.T.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((w6) bVar.b).a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        d7Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
